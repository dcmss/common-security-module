/*
 * Created on Dec 29, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gov.nih.nci.security.upt.forms;

import gov.nih.nci.security.UserProvisioningManager;
import gov.nih.nci.security.authorization.domainobjects.Group;
import gov.nih.nci.security.authorization.domainobjects.ProtectionGroup;
import gov.nih.nci.security.authorization.domainobjects.ProtectionGroupRoleContext;
import gov.nih.nci.security.authorization.domainobjects.Role;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.dao.GroupSearchCriteria;
import gov.nih.nci.security.dao.ProtectionGroupSearchCriteria;
import gov.nih.nci.security.dao.RoleSearchCriteria;
import gov.nih.nci.security.dao.SearchCriteria;
import gov.nih.nci.security.dao.UserSearchCriteria;
import gov.nih.nci.security.upt.constants.DisplayConstants;
import gov.nih.nci.security.upt.viewobjects.FormElement;
import gov.nih.nci.security.upt.viewobjects.SearchResult;
import gov.nih.nci.security.util.ObjectSetUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
public class UserForm extends ValidatorForm implements BaseDoubleAssociationForm
{
	
	private String userId;
	private String userLoginName;
	private String userFirstName;
	private String userLastName;
	private String userOrganization;
	private String userDepartment;
	private String userTitle;
	private String userPhoneNumber;
	private String userPassword;
	private String userEmailId;
	private String userStartDate;
	private String userEndDate;
	private String userUpdateDate;
	
	private String[] associatedIds;
	private String[] roleAssociatedIds;
	private String[] protectionGroupAssociatedIds;
	private String protectionGroupAssociatedId;
	

	/**
	 * @return Returns the userDepartment.
	 */
	public String getUserDepartment() {
		return userDepartment;
	}
	/**
	 * @param userDepartment The userDepartment to set.
	 */
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}
	/**
	 * @return Returns the userEmailId.
	 */
	public String getUserEmailId() {
		return userEmailId;
	}
	/**
	 * @param userEmailId The userEmailId to set.
	 */
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	/**
	 * @return Returns the userEndDate.
	 */
	public String getUserEndDate() {
		return userEndDate;
	}
	/**
	 * @param userEndDate The userEndDate to set.
	 */
	public void setUserEndDate(String userEndDate) {
		this.userEndDate = userEndDate;
	}
	/**
	 * @return Returns the userFirstName.
	 */
	public String getUserFirstName() {
		return userFirstName;
	}
	/**
	 * @param userFirstName The userFirstName to set.
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	/**
	 * @return Returns the userId.
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId The userId to set.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return Returns the userLastName.
	 */
	public String getUserLastName() {
		return userLastName;
	}
	/**
	 * @param userLastName The userLastName to set.
	 */
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	/**
	 * @return Returns the userLoginName.
	 */
	public String getUserLoginName() {
		return userLoginName;
	}
	/**
	 * @param userLoginName The userLoginName to set.
	 */
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	/**
	 * @return Returns the userOrganization.
	 */
	public String getUserOrganization() {
		return userOrganization;
	}
	/**
	 * @param userOrganization The userOrganization to set.
	 */
	public void setUserOrganization(String userOrganization) {
		this.userOrganization = userOrganization;
	}
	/**
	 * @return Returns the userPassword.
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword The userPassword to set.
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @return Returns the userPhoneNumber.
	 */
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	/**
	 * @param userPhoneNumber The userPhoneNumber to set.
	 */
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	/**
	 * @return Returns the userStartDate.
	 */
	public String getUserStartDate() {
		return userStartDate;
	}
	/**
	 * @param userStartDate The userStartDate to set.
	 */
	public void setUserStartDate(String userStartDate) {
		this.userStartDate = userStartDate;
	}
	/**
	 * @return Returns the userTitle.
	 */
	public String getUserTitle() {
		return userTitle;
	}
	/**
	 * @param userTitle The userTitle to set.
	 */
	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}
	/**
	 * @return Returns the userUpdateDate.
	 */
	public String getUserUpdateDate() {
		return userUpdateDate;
	}
	/**
	 * @param userUpdateDate The userUpdateDate to set.
	 */
	public void setUserUpdateDate(String userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}
	/**
	 * @return Returns the associatedIds.
	 */
	public String[] getAssociatedIds() {
		return associatedIds;
	}
	/**
	 * @param associatedIds The associatedIds to set.
	 */
	public void setAssociatedIds(String[] associatedIds) {
		this.associatedIds = associatedIds;
	}
	/**
	 * @return Returns the groupAssociatedId.
	 */
	public String[] getProtectionGroupAssociatedIds() {
		return protectionGroupAssociatedIds;
	}
	/**
	 * @param groupAssociatedId The groupAssociatedId to set.
	 */
	public void setProtectionGroupAssociatedIds(String[] protectionGroupAssociatedIds) {
		this.protectionGroupAssociatedIds = protectionGroupAssociatedIds;
	}
	/**
	 * @return Returns the roleAssociatedIds.
	 */
	public String[] getRoleAssociatedIds() {
		return roleAssociatedIds;
	}
	/**
	 * @param roleAssociatedIds The roleAssociatedIds to set.
	 */
	public void setRoleAssociatedIds(String[] roleAssociatedIds) {
		this.roleAssociatedIds = roleAssociatedIds;
	}
	
	
	/**
	 * @return Returns the protectionGroupAssociatedId.
	 */
	public String getProtectionGroupAssociatedId() {
		return protectionGroupAssociatedId;
	}
	/**
	 * @param protectionGroupAssociatedId The protectionGroupAssociatedId to set.
	 */
	public void setProtectionGroupAssociatedId(
			String protectionGroupAssociatedId) {
		this.protectionGroupAssociatedId = protectionGroupAssociatedId;
	}
	
	
	public void resetForm()
	{
		this.userId = "";
		this.userLoginName = "";
		this.userFirstName = "";
		this.userLastName = "";
		this.userOrganization = "";
		this.userDepartment = "";
		this.userTitle = "";
		this.userPhoneNumber = "";
		this.userPassword = "";
		this.userEmailId = "";
		this.userStartDate = "";
		this.userEndDate = "";
		this.userUpdateDate = "";
		this.associatedIds = null;
		this.protectionGroupAssociatedId = "";		
		this.protectionGroupAssociatedIds = null;
		this.roleAssociatedIds = null;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request)
	{
		this.userLoginName = "";
		this.userFirstName = "";
		this.userLastName = "";
		this.userOrganization = "";
		this.userDepartment = "";
		this.userTitle = "";
		this.userPhoneNumber = "";
		this.userPassword = "";
		this.userEmailId = "";
		this.userStartDate = "";
		this.userEndDate = "";
		this.associatedIds = null;
		this.roleAssociatedIds = null;	
	}

	public ArrayList getAddFormElements()
	{
		ArrayList formElementList = new ArrayList();
	
		formElementList.add(new FormElement("User Login Name", "userLoginName", getUserLoginName(), DisplayConstants.INPUT_BOX, DisplayConstants.REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User First Name", "userFirstName", getUserFirstName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Last Name", "userLastName", getUserLoginName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Organization", "userOrganization", getUserOrganization(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Department", "userDepartment", getUserDepartment(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));		
		formElementList.add(new FormElement("User Title", "userTitle", getUserTitle(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));		
		formElementList.add(new FormElement("User Phone Number", "userPhoneNumber", getUserPhoneNumber(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));	
		formElementList.add(new FormElement("User Password", "userPassword", getUserPassword(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Email Id", "userEmailId", getUserEmailId(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Start Date", "userStartDate", getUserStartDate(), DisplayConstants.INPUT_DATE, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User End Date", "userEndDate", getUserEndDate(), DisplayConstants.INPUT_DATE, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		
		return formElementList;	
	}

	public ArrayList getDisplayFormElements()
	{
		ArrayList formElementList = new ArrayList();
	
		formElementList.add(new FormElement("User Login Name", "userLoginName", getUserLoginName(), DisplayConstants.INPUT_BOX, DisplayConstants.REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User First Name", "userFirstName", getUserFirstName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Last Name", "userLastName", getUserLoginName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Organization", "userOrganization", getUserOrganization(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Department", "userDepartment", getUserDepartment(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));		
		formElementList.add(new FormElement("User Title", "userTitle", getUserTitle(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));		
		formElementList.add(new FormElement("User Phone Number", "userPhoneNumber", getUserPhoneNumber(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));	
		formElementList.add(new FormElement("User Password", "userPassword", getUserPassword(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Email Id", "userEmailId", getUserEmailId(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Start Date", "userStartDate", getUserStartDate(), DisplayConstants.INPUT_DATE, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User End Date", "userEndDate", getUserEndDate(), DisplayConstants.INPUT_DATE, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Update Date", "userUpdateDate", getUserUpdateDate(), DisplayConstants.INPUT_DATE, DisplayConstants.NOT_REQUIRED, DisplayConstants.DISABLED));
		
		return formElementList;	
	}
	
	public ArrayList getSearchFormElements()
	{
		ArrayList formElementList = new ArrayList();
	
		formElementList.add(new FormElement("User Login Name", "userLoginName", getUserLoginName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User First Name", "userFirstName", getUserFirstName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Last Name", "userLastName", getUserLastName(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Organization", "userOrganization", getUserOrganization(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
		formElementList.add(new FormElement("User Department", "userDepartment", getUserDepartment(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));		
		formElementList.add(new FormElement("User Email Id", "userEmailId", getUserEmailId(), DisplayConstants.INPUT_BOX, DisplayConstants.NOT_REQUIRED, DisplayConstants.NOT_DISABLED));
	
		return formElementList;	
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#buildDisplayForm(javax.servlet.http.HttpServletRequest)
	 */
	public void buildDisplayForm(HttpServletRequest request) throws Exception 
	{
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		User user = userProvisioningManager.getUserById(this.userId);
		
		this.userLoginName = user.getLoginName();
		this.userFirstName = user.getFirstName();
		this.userLastName = user.getLastName();
		this.userOrganization = user.getOrganization();
		this.userDepartment = user.getDepartment();
		this.userTitle = user.getTitle();
		this.userPhoneNumber = user.getPhoneNumber();
		this.userPassword = user.getPassword();
		this.userEmailId = user.getEmailId();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		if (user.getStartDate() != null)
			this.userStartDate = simpleDateFormat.format(user.getStartDate());
		if (user.getEndDate() != null)
			this.userEndDate = simpleDateFormat.format(user.getEndDate());
		if (user.getUpdateDate() != null)
			this.userUpdateDate = simpleDateFormat.format(user.getUpdateDate());
	}
	
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#buildDBObject(javax.servlet.http.HttpServletRequest)
	 */
	public void buildDBObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		User user;
		if ((this.userId == null) || ((this.userId).equalsIgnoreCase("")))
		{
			user = new User();
		}
		else
		{
			user = userProvisioningManager.getUserById(this.userId);
		}
		user.setLoginName(this.getUserLoginName());
		user.setFirstName(this.getUserFirstName());
		user.setLastName(this.getUserLastName());
		user.setOrganization(this.getUserOrganization());
		user.setDepartment(this.getUserDepartment());
		user.setTitle(this.getUserTitle());
		user.setPhoneNumber(this.getUserPhoneNumber());
		user.setPassword(this.getUserPassword());
		user.setEmailId(this.getUserEmailId());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		if (this.userStartDate != null && !this.userStartDate.equalsIgnoreCase(""))
			user.setStartDate(simpleDateFormat.parse(this.getUserStartDate()));
		if (this.userEndDate != null && !this.userEndDate.equalsIgnoreCase(""))
			user.setEndDate(simpleDateFormat.parse(this.getUserEndDate()));

		
		if ((this.userId == null) || ((this.userId).equalsIgnoreCase("")))
		{
			userProvisioningManager.createUser(user);
			this.userId = user.getUserId().toString();
			this.userUpdateDate = simpleDateFormat.format(user.getUpdateDate());
		}
		else
		{
			userProvisioningManager.modifyUser(user);
			this.userUpdateDate = simpleDateFormat.format(user.getUpdateDate());			
		}
		
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#removeDBObject(javax.servlet.http.HttpServletRequest)
	 */
	public void removeDBObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		userProvisioningManager.removeUser(this.userId);
		this.resetForm();
		
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#searchObjects(javax.servlet.http.HttpServletRequest, org.apache.struts.action.ActionErrors, org.apache.struts.action.ActionMessages)
	 */
	public SearchResult searchObjects(HttpServletRequest request, ActionErrors errors, ActionMessages messages) throws Exception {

		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		User user = new User();
		
		if (this.userLoginName != null && !(this.userLoginName.trim().equalsIgnoreCase("")))
			user.setLoginName(this.userLoginName);
		if (this.userFirstName != null && !(this.userFirstName.trim().equalsIgnoreCase("")))
			user.setFirstName(this.userFirstName);
		if (this.userLastName != null && !(this.userLastName.trim().equalsIgnoreCase("")))
			user.setLastName(this.userLastName);
		if (this.userOrganization != null && !(this.userOrganization.trim().equalsIgnoreCase("")))
			user.setOrganization(this.userOrganization);
		if (this.userDepartment != null && !(this.userDepartment.trim().equalsIgnoreCase("")))
			user.setDepartment(this.userDepartment);
		if (this.userDepartment != null && !(this.userDepartment.trim().equalsIgnoreCase("")))
			user.setEmailId(this.userEmailId);
		
		SearchCriteria searchCriteria = new UserSearchCriteria(user);
		List list = userProvisioningManager.getObjects(searchCriteria);
		SearchResult searchResult = new SearchResult();
		searchResult.setSearchResultMessage(searchCriteria.getMessage());
		searchResult.setSearchResultObjects(list);
		return searchResult;

		
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getPrimaryId()
	 */
	public String getPrimaryId()
	{
		if (this.userId == null)
		{
			return new String("");
		}
		else
		{
			return userId;
		}
	}

	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseAssociationForm#buildAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void buildAssociationObject(HttpServletRequest request) throws Exception 
	{
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);

		Collection associatedGroups = (Collection)userProvisioningManager.getGroups(this.userId);
		Group group = new Group();
		SearchCriteria searchCriteria = new GroupSearchCriteria(group);
		Collection totalGroups = (Collection)userProvisioningManager.getObjects(searchCriteria);

		Collection availableGroups = ObjectSetUtil.minus(totalGroups,associatedGroups);
		
		request.setAttribute(DisplayConstants.ASSIGNED_SET, associatedGroups);
		request.setAttribute(DisplayConstants.AVAILABLE_SET, availableGroups);
		
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseAssociationForm#setAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void setAssociationObject(HttpServletRequest request) throws Exception {

		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		if (this.associatedIds == null)
			this.associatedIds = new String[0];
		userProvisioningManager.assignGroupsToUser(this.userId, this.associatedIds);
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDoubleAssociationForm#buildDoubleAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void buildDoubleAssociationObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);

		Collection protectionGroupRoleContextList = (Collection)userProvisioningManager.getProtectionGroupRoleContextForUser(this.userId);
		Collection associatedProtectionGroups = (Collection)new HashSet();
		
		if (protectionGroupRoleContextList != null && !(protectionGroupRoleContextList.size() == 0))
		{
			Iterator iterator = protectionGroupRoleContextList.iterator();
			while (iterator.hasNext())
			{
				ProtectionGroupRoleContext protectionGroupRoleContext = (ProtectionGroupRoleContext)iterator.next();
				associatedProtectionGroups.add(protectionGroupRoleContext.getProtectionGroup());
			}
		}
		ProtectionGroup protectionGroup = new ProtectionGroup();
		SearchCriteria protectionGroupSearchCriteria = new ProtectionGroupSearchCriteria(protectionGroup);
		Collection totalProtectionGroups = (Collection)userProvisioningManager.getObjects(protectionGroupSearchCriteria);

		Collection availableProtectionGroups = ObjectSetUtil.minus(totalProtectionGroups,associatedProtectionGroups);

		Role role = new Role();
		SearchCriteria roleSearchCriteria = new RoleSearchCriteria(role);
		Collection totalRoles = (Collection)userProvisioningManager.getObjects(roleSearchCriteria);		
		
		
		request.setAttribute(DisplayConstants.AVAILABLE_PROTECTIONGROUP_SET, availableProtectionGroups);		
		request.setAttribute(DisplayConstants.AVAILABLE_ROLE_SET, totalRoles);

		Collection associatedRoles = (Collection)new HashSet();
		request.setAttribute(DisplayConstants.ASSIGNED_ROLE_SET, associatedRoles);
		
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDoubleAssociationForm#setDoubleAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void setDoubleAssociationObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);		
		userProvisioningManager.assignUserRoleToProtectionGroup(this.userId,this.roleAssociatedIds,this.protectionGroupAssociatedIds[0]);
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDoubleAssociationForm#removeGroupAssociation(javax.servlet.http.HttpServletRequest)
	 */
	public void removeProtectionGroupAssociation(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);		
		userProvisioningManager.removeUserFromProtectionGroup(this.protectionGroupAssociatedId, this.userId);		
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDoubleAssociationForm#updateRoleAssociation(javax.servlet.http.HttpServletRequest)
	 */
	public void updateRoleAssociation(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);		
		userProvisioningManager.assignUserRoleToProtectionGroup(this.userId,this.roleAssociatedIds,this.protectionGroupAssociatedId);
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDoubleAssociationForm#buildGroupAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public Collection buildProtectionGroupAssociationObject(HttpServletRequest request) throws Exception {
		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);

		Collection protectionGroupRoleContextList = (Collection)userProvisioningManager.getProtectionGroupRoleContextForUser(this.userId);
		Collection associatedProtectionGroupRoleContexts = (Collection)new HashSet();
		
		if (protectionGroupRoleContextList != null && !(protectionGroupRoleContextList.size() == 0))
		{
			associatedProtectionGroupRoleContexts = protectionGroupRoleContextList;
		}
		
		return associatedProtectionGroupRoleContexts;
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDoubleAssociationForm#buildRoleAssociationObject(javax.servlet.http.HttpServletRequest)
	 */
	public void buildRoleAssociationObject(HttpServletRequest request) throws Exception {

		UserProvisioningManager userProvisioningManager = (UserProvisioningManager)(request.getSession()).getAttribute(DisplayConstants.USER_PROVISIONING_MANAGER);
		
		Collection protectionGroupRoleContextList = (Collection)(request.getSession()).getAttribute(DisplayConstants.AVAILABLE_PROTECTIONGROUPROLECONTEXT_SET);
		Collection associatedRoles = (Collection)new HashSet();
		if (protectionGroupRoleContextList != null && !(protectionGroupRoleContextList.size() == 0))
		{
			Iterator iterator = protectionGroupRoleContextList.iterator();
			ProtectionGroup protectionGroup = null;
			String protectionGroupId = null;
			while (iterator.hasNext())
			{
				ProtectionGroupRoleContext protectionGroupRoleContext = (ProtectionGroupRoleContext)iterator.next();
				protectionGroup = protectionGroupRoleContext.getProtectionGroup();
				protectionGroupId = protectionGroup.getProtectionGroupId().toString();
				if (this.protectionGroupAssociatedId.equalsIgnoreCase(protectionGroupId))
				{
					associatedRoles = (Collection)protectionGroupRoleContext.getRoles();
				}
			}
		}
		
		Role role = new Role();
		SearchCriteria roleSearchCriteria = new RoleSearchCriteria(role);
		Collection totalRoles = (Collection)userProvisioningManager.getObjects(roleSearchCriteria);		

		Collection availableRoles = ObjectSetUtil.minus(totalRoles,associatedRoles);
		
		request.setAttribute(DisplayConstants.ASSIGNED_ROLE_SET, associatedRoles);	
		request.setAttribute(DisplayConstants.AVAILABLE_ROLE_SET, availableRoles);
		
		request.setAttribute(DisplayConstants.ONLY_ROLES, DisplayConstants.ONLY_ROLES);	
	}
	/* (non-Javadoc)
	 * @see gov.nih.nci.security.upt.forms.BaseDBForm#getFormName()
	 */
	public String getFormName() {
		return DisplayConstants.USER_ID;
	}

}