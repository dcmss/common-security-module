/*
 * Created on Jan 18, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gov.nih.nci.security.upt.forms;

/**
 *
 *<!-- LICENSE_TEXT_START -->
 *
 *The NCICB Common Security Module's User Provisioning Tool (UPT) Software License,
 *Version 3.0 Copyright 2004-2005 Ekagra Software Technologies Limited ('Ekagra')
 *
 *Copyright Notice.  The software subject to this notice and license includes both
 *human readable source code form and machine readable, binary, object code form
 *(the 'UPT Software').  The UPT Software was developed in conjunction with the
 *National Cancer Institute ('NCI') by NCI employees and employees of Ekagra.  To
 *the extent government employees are authors, any rights in such works shall be
 *subject to Title 17 of the United States Code, section 105.    
 *
 *This UPT Software License (the 'License') is between NCI and You.  'You (or
 *'Your') shall mean a person or an entity, and all other entities that control,
 *are controlled by, or are under common control with the entity.  'Control' for
 *purposes of this definition means (i) the direct or indirect power to cause the
 *direction or management of such entity, whether by contract or otherwise, or
 *(ii) ownership of fifty percent (50%) or more of the outstanding shares, or
 *(iii) beneficial ownership of such entity.  
 *
 *This License is granted provided that You agree to the conditions described
 *below.  NCI grants You a non-exclusive, worldwide, perpetual, fully-paid-up,
 *no-charge, irrevocable, transferable and royalty-free right and license in its
 *rights in the UPT Software to (i) use, install, access, operate, execute, copy,
 *modify, translate, market, publicly display, publicly perform, and prepare
 *derivative works of the UPT Software; (ii) distribute and have distributed to
 *and by third parties the UPT Software and any modifications and derivative works
 *thereof; and (iii) sublicense the foregoing rights set out in (i) and (ii) to
 *third parties, including the right to license such rights to further third
 *parties.  For sake of clarity, and not by way of limitation, NCI shall have no
 *right of accounting or right of payment from You or Your sublicensees for the
 *rights granted under this License.  This License is granted at no charge to You.
 *
 *1.	Your redistributions of the source code for the Software must retain the
 *above copyright notice, this list of conditions and the disclaimer and
 *limitation of liability of Article 6 below.  Your redistributions in object code
 *form must reproduce the above copyright notice, this list of conditions and the
 *disclaimer of Article 6 in the documentation and/or other materials provided
 *with the distribution, if any.
 *2.	Your end-user documentation included with the redistribution, if any, must
 *include the following acknowledgment: 'This product includes software developed
 *by Ekagra and the National Cancer Institute.'  If You do not include such
 *end-user documentation, You shall include this acknowledgment in the Software
 *itself, wherever such third-party acknowledgments normally appear.
 *
 *3.	You may not use the names 'The National Cancer Institute', 'NCI' 'Ekagra
 *Software Technologies Limited' and 'Ekagra' to endorse or promote products
 *derived from this Software.  This License does not authorize You to use any
 *trademarks, service marks, trade names, logos or product names of either NCI or
 *Ekagra, except as required to comply with the terms of this License.
 *
 *4.	For sake of clarity, and not by way of limitation, You may incorporate this
 *Software into Your proprietary programs and into any third party proprietary
 *programs.  However, if You incorporate the Software into third party proprietary
 *programs, You agree that You are solely responsible for obtaining any permission
 *from such third parties required to incorporate the Software into such third
 *party proprietary programs and for informing Your sublicensees, including
 *without limitation Your end-users, of their obligation to secure any required
 *permissions from such third parties before incorporating the Software into such
 *third party proprietary software programs.  In the event that You fail to obtain
 *such permissions, You agree to indemnify NCI for any claims against NCI by such
 *third parties, except to the extent prohibited by law, resulting from Your
 *failure to obtain such permissions.
 *
 *5.	For sake of clarity, and not by way of limitation, You may add Your own
 *copyright statement to Your modifications and to the derivative works, and You
 *may provide additional or different license terms and conditions in Your
 *sublicenses of modifications of the Software, or any derivative works of the
 *Software as a whole, provided Your use, reproduction, and distribution of the
 *Work otherwise complies with the conditions stated in this License.
 *
 *6.	THIS SOFTWARE IS PROVIDED 'AS IS,' AND ANY EXPRESSED OR IMPLIED WARRANTIES,
 *(INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 *NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE) ARE DISCLAIMED.  IN NO
 *EVENT SHALL THE NATIONAL CANCER INSTITUTE, EKAGRA, OR THEIR AFFILIATES BE LIABLE
 *FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 *DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 *CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 *TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *<!-- LICENSE_TEXT_END -->
 *
 */


import gov.nih.nci.security.UserProvisioningManager;
import gov.nih.nci.security.authorization.domainobjects.Application;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.authorization.domainobjects.ProtectionElement;
import gov.nih.nci.security.dao.ApplicationSearchCriteria;
import gov.nih.nci.security.dao.UserSearchCriteria;
import gov.nih.nci.security.dao.ProtectionElementSearchCriteria;
import gov.nih.nci.security.dao.SearchCriteria;
import gov.nih.nci.security.upt.constants.DisplayConstants;
import gov.nih.nci.security.upt.viewobjects.FormElement;
import gov.nih.nci.security.upt.viewobjects.SearchResult;
import gov.nih.nci.security.util.ObjectSetUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.ValidatorForm;

/**
 * @author Kunal Modi (Ekagra Software Technologies Ltd.)
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ApplicationForm extends ValidatorForm implements BaseAssociationForm{

	private String applicationId;
	private String applicationName;
	private String applicationDescription;
	private String applicationDeclarativeFlag;
	private String applicationActiveFlag;
	private String applicationUpdateDate;
	
	private String[] associatedIds;
	private Long associatedProtectionElementId;
	
	/**
	 * @return Returns the applicationActiveFlag.
	 */
	public String getApplicationActiveFlag() {
		return applicationActiveFlag;
	}
	/**
	 * @param applicationActiveFlag The applicationActiveFlag to set.
	 */
	public void setApplicationActiveFlag(String applicationActiveFlag) {
		this.applicationActiveFlag = applicationActiveFlag;
	}
	/**
	 * @return Returns the applicationDeclarativeFlag.
	 */
	public String getApplicationDeclarativeFlag() {
		return applicationDeclarativeFlag;
	}
	/**
	 * @param applicationDeclarativeFlag The applicationDeclarativeFlag to set.
	 */
	public void setApplicationDeclarativeFlag(String applicationDeclarativeFlag) {
		this.applicationDeclarativeFlag = applicationDeclarativeFlag;
	}
	/**
	 * @return Returns the applicationDescription.
	 */
	public String getApplicationDescription() {
		return applicationDescription;
	}
	/**
	 * @param applicationDescription The applicationDescription to set.
	 */
	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}
	/**
	 * @return Returns the applicationId.
	 */
	public String getApplicationId() {
		return applicationId;
	}
	/**
	 * @param applicationId The applicationId to set.
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	/**
	 * @return Returns the applicationName.
	 */
	public String getApplicationName() {
		return applicationName;
	}
	/**
	 * @param applicationName The applicationName to set.
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	/**
	 * @return Returns the applicationUpdateDate.
	 */
	public String getApplicationUpdateDate() {
		return applicationUpdateDate;
	}
	/**
	 * @param applicationUpdateDate The applicationUpdateDate to set.
	 */
	public void setApplicationUpdateDate(String applicationUpdateDate) {
		this.applicationUpdateDate = applicationUpdateDate;
	}
	
	/**
	 * @param associatedIds The associatedIds to set.
	 */
	public void setAssociatedIds(String[] associatedIds) {
		this.associatedIds = associatedIds;
	}	
	
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseAssociationForm#getAssociatedIds()
	 */
	public String[] getAssociatedIds() {
		// TODO Auto-generated method stub
		return this.associatedIds;
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getPrimaryId()
	 */
	public String getPrimaryId() {
		return this.applicationId;
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#resetForm()
	 */
	public void resetForm() {
		this.applicationId = "";
		this.applicationName = "";
		this.applicationDescription = "";
		this.applicationDeclarativeFlag = DisplayConstants.YES;
		this.applicationActiveFlag = DisplayConstants.YES;
		this.applicationUpdateDate = "";
		this.associatedIds = null;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request)
	{
		this.applicationName = "";
		this.applicationDescription = "";
		this.applicationDeclarativeFlag = DisplayConstants.YES;
		this.applicationActiveFlag = DisplayConstants.YES;
		this.associatedIds = null;		
	}
	

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getFormName()
	 */
	public String getFormName() {
		return DisplayConstants.APPLICATION_ID;
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getAddFormElements()
	 */
	public ArrayList getAddFormElements() {
		ArrayList formElementList = new ArrayList();

		formElementList.add(new FormElement("Application Name", "applicationName", getApplicationName(), DisplayConstants.INPUT_BOX, DisplayConstants.REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Description", "applicationDescription", getApplicationDescription(), DisplayConstants.INPUT_TEXTAREA, DisplayConstants.REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Declarative Flag", "applicationDeclarativeFlag", getApplicationDeclarativeFlag(), DisplayConstants.INPUT_RADIO, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Active Flag", "applicationActiveFlag", getApplicationActiveFlag(), DisplayConstants.INPUT_RADIO, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));

		return formElementList;
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getDisplayFormElements()
	 */
	public ArrayList getDisplayFormElements() {
		ArrayList formElementList = new ArrayList();

		formElementList.add(new FormElement("Application Name", "applicationName", getApplicationName(), DisplayConstants.INPUT_BOX, DisplayConstants.REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Description", "applicationDescription", getApplicationDescription(), DisplayConstants.INPUT_TEXTAREA, DisplayConstants.REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Declarative Flag", "applicationDeclarativeFlag", getApplicationDeclarativeFlag(), DisplayConstants.INPUT_RADIO, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Active Flag", "applicationActiveFlag", getApplicationActiveFlag(), DisplayConstants.INPUT_RADIO, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("Application Update Date", "applicationUpdateDate", getApplicationUpdateDate(), DisplayConstants.INPUT_DATE, DisplayConstants.NOT_REQUIRED, DisplayConstants.DISABLED));
		
		return formElementList;
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getSearchFormElements()
	 */
	public ArrayList getSearchFormElements() {
		ArrayList formElementList = new ArrayList();

		formElementList.add(new FormElement("Application Name", "applicationName", getApplicationName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));

		return formElementList;
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#buildDisplayForm(javax.servlet.http.HttpServletRequest)
	 */
	public void buildDisplayForm(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		ProtectionElement protectionElement = new ProtectionElement();
		
		Application application = userProvisioningManager.getApplicationById(this.applicationId);
		
		protectionElement.setProtectionElementName(application.getApplicationName());
		SearchCriteria searchCriteria = new ProtectionElementSearchCriteria(protectionElement);
		List list = userProvisioningManager.getObjects(searchCriteria);
		protectionElement = (ProtectionElement)list.get(0);
		this.associatedProtectionElementId = protectionElement.getProtectionElementId();

		this.applicationName = application.getApplicationName();
		this.applicationDescription = application.getApplicationDescription();
		if (application.getActiveFlag() == DisplayConstants.ONE) this.applicationActiveFlag = DisplayConstants.YES;
			else this.applicationActiveFlag = DisplayConstants.NO;
		if (application.getDeclarativeFlag() == DisplayConstants.ONE) this.applicationDeclarativeFlag = DisplayConstants.YES;
			else this.applicationDeclarativeFlag = DisplayConstants.NO;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		this.applicationUpdateDate = simpleDateFormat.format(application.getUpdateDate());
		
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#buildDBObject(javax.servlet.http.HttpServletRequest)
	 */
	public void buildDBObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		
		Application application = null;
		ProtectionElement protectionElement = null;
		
		if ((this.applicationId == null) || ((this.applicationId).equalsIgnoreCase("")))
		{
			application = new Application();
			protectionElement = new ProtectionElement();
		}
		else
		{
			application = userProvisioningManager.getApplicationById(this.applicationId);
			protectionElement = new ProtectionElement();
			protectionElement.setProtectionElementName(application.getApplicationName());
			SearchCriteria searchCriteria = new ProtectionElementSearchCriteria(protectionElement);
			List list = userProvisioningManager.getObjects(searchCriteria);
			protectionElement = (ProtectionElement)list.get(0);
			this.associatedProtectionElementId = protectionElement.getProtectionElementId();
		}
		
		application.setApplicationName(this.applicationName);
		application.setApplicationDescription(this.applicationDescription);

		protectionElement.setProtectionElementName(this.applicationName);
		protectionElement.setObjectId(this.applicationName);
		
		if (this.applicationActiveFlag.equals(DisplayConstants.YES)) application.setActiveFlag(DisplayConstants.ONE);
			else application.setActiveFlag(DisplayConstants.ZERO);

		if (this.applicationDeclarativeFlag.equals(DisplayConstants.YES)) application.setDeclarativeFlag(DisplayConstants.ONE);
			else application.setDeclarativeFlag(DisplayConstants.ZERO);
		
		if ((this.applicationId == null) || ((this.applicationId).equalsIgnoreCase("")))
		{
			userProvisioningManager.createApplication(application);
			userProvisioningManager.createProtectionElement(protectionElement);
			this.applicationId = application.getApplicationId().toString();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			this.applicationUpdateDate = simpleDateFormat.format(application.getUpdateDate());
			this.associatedProtectionElementId = protectionElement.getProtectionElementId();
		}
		else
		{
			userProvisioningManager.modifyApplication(application);
			userProvisioningManager.modifyProtectionElement(protectionElement);			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			this.applicationUpdateDate = simpleDateFormat.format(application.getUpdateDate());
		}

	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#removeDBObject(javax.servlet.http.HttpServletRequest)
	 */
	public void removeDBObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		userProvisioningManager.removeApplication(this.applicationId);
		userProvisioningManager.removeProtectionElement(this.associatedProtectionElementId.toString());
		this.resetForm();		
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#searchObjects(javax.servlet.http.HttpServletRequest, org.apache.struts.action.ActionErrors, org.apache.struts.action.ActionMessages)
	 */
	public SearchResult searchObjects(HttpServletRequest request, ActionErrors errors, ActionMessages messages) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		Application application = new Application();
		if (this.applicationName != null && !(this.applicationName.trim().equalsIgnoreCase("")))
			application.setApplicationName(this.applicationName);
		
		SearchCriteria searchCriteria = new ApplicationSearchCriteria(application);
		List list = userProvisioningManager.getObjects(searchCriteria);
		SearchResult searchResult = new SearchResult();
		searchResult.setSearchResultMessage(searchCriteria.getMessage());
		searchResult.setSearchResultObjects(list);
		return searchResult;
		
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseAssociationForm#buildAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void buildAssociationObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);

		Collection associatedUsers = (Collection)userProvisioningManager.getOwners(this.associatedProtectionElementId.toString());
		
		User user = new User();
		SearchCriteria searchCriteria = new UserSearchCriteria(user);
		Collection totalUsers = (Collection)userProvisioningManager.getObjects(searchCriteria);

		Collection availableUsers = ObjectSetUtil.minus(totalUsers,associatedUsers);
		
		request.setAttribute(DisplayConstants.ASSIGNED_SET, associatedUsers);
		request.setAttribute(DisplayConstants.AVAILABLE_SET, availableUsers);
		
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseAssociationForm#setAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void setAssociationObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		if (this.associatedIds == null)
			this.associatedIds = new String[0];
		userProvisioningManager.assignOwners(this.associatedProtectionElementId.toString(), this.associatedIds);
	}
	
	
}