package gov.nih.nci.security.ri.struts.actions;

import gov.nih.nci.security.authorization.domainobjects.ProtectionElement;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.exceptions.CSException;
import gov.nih.nci.security.ri.dao.EmployeeDAO;
import gov.nih.nci.security.ri.struts.Constants;
import gov.nih.nci.security.ri.util.SecurityUtils;
import gov.nih.nci.security.ri.valueObject.Employee;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author Brian Husted
 *  
 */
public class CreateEmployeeAction extends SecureAction {

	static final Logger log = Logger.getLogger(CreateEmployeeAction.class
			.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping,
	 *      org.apache.struts.action.ActionForm,
	 *      javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	public ActionForward executeSecureWorkflow(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Employee employeeForm = (Employee) form;

		EmployeeDAO.saveEmployee(employeeForm);

		doAuthorization(request, employeeForm);

		List l = new LinkedList();
		l.add(employeeForm);
		request.getSession().setAttribute(EMPLOYEE_ID,
				employeeForm.getEmployeeId().toString());
		request.getSession().setAttribute(EMPLOYEE_LIST, l);

		return mapping.findForward(Constants.ACTION_SUCCESS);
	}

	private void doAuthorization(HttpServletRequest request, Employee empl)
			throws CSException {

		
		
		//Create a protection element that represents the employee record
		ProtectionElement pe = new ProtectionElement();
		pe.setObjectId(SecurityUtils.getEmployeeObjectId(empl));
		pe.setProtectionElementName("EMPLOYEE_RECORD_" + empl.getEmployeeId());
		pe
				.setProtectionElementDescription("The gov.nih.nci.security.ri.valueObject.Employee Object");

		//create the employee protection element to protected the
		//employee's data
		getAuthorizationManager().createProtectionElement(pe);
		
		User user = createUser( empl );
        //Create the User for Authorization
		getUserProvisioningManager().createUser(user );
		//Assign the User to the appropriate UserGroup
		getUserProvisioningManager().assignUserToGroup( user.getLoginName(),
				SecurityUtils.getEmployeeGroup(empl));
		

		//assign the employee to his business unit
		getAuthorizationManager().assignProtectionElement(
		   empl.getBusinessUnit(), pe.getObjectId());
		
		//assign the employee as owner of record
		getAuthorizationManager().setOwnerForProtectionElement(
				empl.getUserName(), pe.getObjectId(), null);

		//If they are not part of HR division then add
		//employee record so that HR managers can view
		//all employee data
		if (!HR_DIVISION.equals(empl.getBusinessUnit())) {
			//assign access to the employee for HR Division
			getAuthorizationManager().assignProtectionElement(HR_DIVISION,
					pe.getObjectId());
		}

	}
	
	private User createUser( Employee empl ){
		User user = new User();
		user.setLoginName(empl.getUserName());
		user.setLastName(empl.getLastName());
		user.setFirstName(empl.getFirstName());
		user.setEmailId(empl.getEmailAddr());
		user.setOrganization(empl.getBusinessUnit());
		user.setPassword(empl.getPassword());
		user.setPhoneNumber(empl.getPhoneNumber());
		user.setDepartment(empl.getBusinessUnit());
		return user;
	}
}