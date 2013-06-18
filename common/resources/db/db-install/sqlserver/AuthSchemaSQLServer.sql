/*L
   Copyright Ekagra Software Technologies Ltd.
   Copyright SAIC, SAIC-Frederick

   Distributed under the OSI-approved BSD 3-Clause License.
   See http://ncip.github.com/common-security-module/LICENSE.txt for details.
L*/

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_CSM_GROUP_CSM_APPLICATION') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_GROUP DROP CONSTRAINT FK_CSM_GROUP_CSM_APPLICATION
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_APPLICATION_FILTER_CLAUSE') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_FILTER_CLAUSE DROP CONSTRAINT FK_APPLICATION_FILTER_CLAUSE
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_PG_PE_PE') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_PG_PE DROP CONSTRAINT FK_PG_PE_PE
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_PG_PE_PG') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_PG_PE DROP CONSTRAINT FK_PG_PE_PG
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_PE_APPLICATION') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_PROTECTION_ELEMENT DROP CONSTRAINT FK_PE_APPLICATION
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_PG_APPLICATION') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_PROTECTION_GROUP DROP CONSTRAINT FK_PG_APPLICATION
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_PG_PG') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_PROTECTION_GROUP DROP CONSTRAINT FK_PG_PG
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_ROLE_APPLICATION') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_ROLE DROP CONSTRAINT FK_ROLE_APPLICATION
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_ROLE_PRIVILEGE_PRIVILEGE') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_ROLE_PRIVILEGE DROP CONSTRAINT FK_ROLE_PRIVILEGE_PRIVILEGE
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_ROLE_PRIVILEGE_ROLE') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_ROLE_PRIVILEGE DROP CONSTRAINT FK_ROLE_PRIVILEGE_ROLE
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_GROUP_GROUP') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_GROUP DROP CONSTRAINT FK_USER_GROUP_GROUP
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_GROUP_USER') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_GROUP DROP CONSTRAINT FK_USER_GROUP_USER
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_GROUP_ROLE_PG_GROUP') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_GROUP_ROLE_PG DROP CONSTRAINT FK_USER_GROUP_ROLE_PG_GROUP
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_GROUP_ROLE_PG_PG') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_GROUP_ROLE_PG DROP CONSTRAINT FK_USER_GROUP_ROLE_PG_PG
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_GROUP_ROLE_PG_ROLE') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_GROUP_ROLE_PG DROP CONSTRAINT FK_USER_GROUP_ROLE_PG_ROLE
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_GROUP_ROLE_PG_USER') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_GROUP_ROLE_PG DROP CONSTRAINT FK_USER_GROUP_ROLE_PG_USER
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_PE_USER') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_PE DROP CONSTRAINT FK_USER_PE_USER
;

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('FK_USER_PE_PE') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE CSM_USER_PE DROP CONSTRAINT FK_USER_PE_PE
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_APPLICATION') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_APPLICATION
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_FILTER_CLAUSE') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_FILTER_CLAUSE
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_GROUP') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_GROUP
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_PG_PE') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_PG_PE
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_PRIVILEGE') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_PRIVILEGE
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_PROTECTION_ELEMENT') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_PROTECTION_ELEMENT
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_PROTECTION_GROUP') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_PROTECTION_GROUP
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_ROLE') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_ROLE
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_ROLE_PRIVILEGE') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_ROLE_PRIVILEGE
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_USER') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_USER
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_USER_GROUP') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_USER_GROUP
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_USER_GROUP_ROLE_PG') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_USER_GROUP_ROLE_PG
;

IF EXISTS (SELECT * FROM dbo.SYSOBJECTS WHERE id = object_id('CSM_USER_PE') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE CSM_USER_PE
;


CREATE TABLE CSM_APPLICATION ( 
	APPLICATION_ID int identity(1,1)  NOT NULL,
	APPLICATION_NAME varchar(255) NOT NULL,
	APPLICATION_DESCRIPTION varchar(200) NOT NULL,
	DECLARATIVE_FLAG int,
	ACTIVE_FLAG int NOT NULL,
	UPDATE_DATE datetime NOT NULL DEFAULT Getdate(),
	DATABASE_URL VARCHAR(100),
	DATABASE_USER_NAME VARCHAR(100),
	DATABASE_PASSWORD VARCHAR(100),
	DATABASE_DIALECT VARCHAR(100),
	DATABASE_DRIVER VARCHAR(100)
) 
;

CREATE TABLE CSM_FILTER_CLAUSE( 
	FILTER_CLAUSE_ID int identity(1,1) NOT NULL,
	CLASS_NAME varchar(100) NOT NULL,
	FILTER_CHAIN varchar(2000) NOT NULL,
	TARGET_CLASS_NAME varchar(100) NOT NULL,
	TARGET_CLASS_ATTRIBUTE_NAME varchar(100) NOT NULL,
	TARGET_CLASS_ATTRIBUTE_TYPE varchar(100) NOT NULL,
	TARGET_CLASS_ALIAS varchar(100),
	TARGET_CLASS_ATTRIBUTE_ALIAS varchar(100),
	GENERATED_SQL varchar(4000) NOT NULL,
	APPLICATION_ID int NOT NULL,
	UPDATE_DATE datetime NOT NULL DEFAULT Getdate()
) 
;

CREATE TABLE CSM_GROUP ( 
	GROUP_ID int identity(1,1)  NOT NULL,
	GROUP_NAME varchar(255) NOT NULL,
	GROUP_DESC varchar(200),
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate(),
	APPLICATION_ID int NOT NULL
) 
;

CREATE TABLE CSM_PG_PE ( 
	PG_PE_ID int identity(1,1)  NOT NULL,
	PROTECTION_GROUP_ID int NOT NULL,
	PROTECTION_ELEMENT_ID int NOT NULL,
	UPDATE_DATE datetime DEFAULT GetDate()
) 
;

CREATE TABLE CSM_PRIVILEGE ( 
	PRIVILEGE_ID int identity(1,1)  NOT NULL,
	PRIVILEGE_NAME varchar(100) NOT NULL,
	PRIVILEGE_DESCRIPTION varchar(200),
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate()
) 
;

CREATE TABLE CSM_PROTECTION_ELEMENT ( 
	PROTECTION_ELEMENT_ID int identity(1,1)  NOT NULL,
	PROTECTION_ELEMENT_NAME varchar(100) NOT NULL,
	PROTECTION_ELEMENT_DESCRIPTION varchar(200),
	OBJECT_ID varchar(100) NOT NULL,
	ATTRIBUTE varchar(100),
	PROTECTION_ELEMENT_TYPE varchar(100),
	APPLICATION_ID int NOT NULL,
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate()
) 
;

CREATE TABLE CSM_PROTECTION_GROUP ( 
	PROTECTION_GROUP_ID int identity(1,1)  NOT NULL,
	PROTECTION_GROUP_NAME varchar(100) NOT NULL,
	PROTECTION_GROUP_DESCRIPTION varchar(200),
	APPLICATION_ID int NOT NULL,
	LARGE_ELEMENT_COUNT_FLAG int NOT NULL,
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate(),
	PARENT_PROTECTION_GROUP_ID int
) 
;

CREATE TABLE CSM_ROLE ( 
	ROLE_ID int identity(1,1)  NOT NULL,
	ROLE_NAME varchar(100) NOT NULL,
	ROLE_DESCRIPTION varchar(200),
	APPLICATION_ID int NOT NULL,
	ACTIVE_FLAG int NOT NULL,
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate()
) 
;

CREATE TABLE CSM_ROLE_PRIVILEGE ( 
	ROLE_PRIVILEGE_ID int identity(1,1)  NOT NULL,
	ROLE_ID int NOT NULL,
	PRIVILEGE_ID int NOT NULL
) 
;

CREATE TABLE CSM_USER ( 
	USER_ID int identity(1,1)  NOT NULL,
	LOGIN_NAME varchar(500) NOT NULL,
	PREMGRT_LOGIN_NAME varchar(100) NOT NULL,
	MIGRATED_FLAG int NOT NULL DEFAULT 0,
	FIRST_NAME varchar(100) NOT NULL,
	LAST_NAME varchar(100) NOT NULL,
	ORGANIZATION varchar(100),
	DEPARTMENT varchar(100),
	TITLE varchar(100),
	PHONE_NUMBER varchar(15),
	PASSWORD varchar(100),
	EMAIL_ID varchar(100),
	START_DATE datetime,
	END_DATE datetime,
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate()
) 
;

CREATE TABLE CSM_USER_GROUP ( 
	USER_GROUP_ID int identity(1,1)  NOT NULL,
	USER_ID int NOT NULL,
	GROUP_ID int NOT NULL
) 
;

CREATE TABLE CSM_USER_GROUP_ROLE_PG ( 
	USER_GROUP_ROLE_PG_ID int identity(1,1)  NOT NULL,
	USER_ID int,
	GROUP_ID int,
	ROLE_ID int NOT NULL,
	PROTECTION_GROUP_ID int NOT NULL,
	UPDATE_DATE datetime NOT NULL DEFAULT GetDate()
) 
;

CREATE TABLE CSM_USER_PE ( 
	USER_PROTECTION_ELEMENT_ID int identity(1,1)  NOT NULL,
	PROTECTION_ELEMENT_ID int NOT NULL,
	USER_ID int NOT NULL
) 
;


ALTER TABLE CSM_APPLICATION ADD CONSTRAINT PK_APPLICATION 
PRIMARY KEY (APPLICATION_ID) 
;

ALTER TABLE CSM_FILTER_CLAUSE ADD CONSTRAINT PK_FILTER_CLAUSE
PRIMARY KEY (FILTER_CLAUSE_ID) 
;


ALTER TABLE CSM_GROUP ADD CONSTRAINT PK_GROUP 
PRIMARY KEY (GROUP_ID) 
;

ALTER TABLE CSM_PG_PE ADD CONSTRAINT PK_PG_PE 
PRIMARY KEY (PG_PE_ID) 
;

ALTER TABLE CSM_PRIVILEGE ADD CONSTRAINT PK_PRIVILEGE 
PRIMARY KEY (PRIVILEGE_ID) 
;

ALTER TABLE CSM_PROTECTION_ELEMENT ADD CONSTRAINT PK_PROTECTION_ELEMENT 
PRIMARY KEY (PROTECTION_ELEMENT_ID) 
;

ALTER TABLE CSM_PROTECTION_GROUP ADD CONSTRAINT PK_PROTECTION_GROUP 
PRIMARY KEY (PROTECTION_GROUP_ID) 
;

ALTER TABLE CSM_ROLE ADD CONSTRAINT PK_ROLE 
PRIMARY KEY (ROLE_ID) 
;

ALTER TABLE CSM_ROLE_PRIVILEGE ADD CONSTRAINT PK_ROLE_PRIVILEGE 
PRIMARY KEY (ROLE_PRIVILEGE_ID) 
;

ALTER TABLE CSM_USER ADD CONSTRAINT PK_USER 
PRIMARY KEY (USER_ID) 
;

ALTER TABLE CSM_USER_GROUP ADD CONSTRAINT PK_USER_GROUP 
PRIMARY KEY (USER_GROUP_ID) 
;

ALTER TABLE CSM_USER_GROUP_ROLE_PG ADD CONSTRAINT PK_USER_GROUP_ROLE_PG 
PRIMARY KEY (USER_GROUP_ROLE_PG_ID) 
;

ALTER TABLE CSM_USER_PE ADD CONSTRAINT PK_USER_PROTECTION_ELEMENT 
PRIMARY KEY (USER_PROTECTION_ELEMENT_ID) 
;


ALTER TABLE CSM_APPLICATION
ADD CONSTRAINT UQ_APPLICATION_NAME UNIQUE (APPLICATION_NAME)
;

ALTER TABLE CSM_GROUP
ADD CONSTRAINT UQ_GROUP_GROUP_NAME UNIQUE (APPLICATION_ID, GROUP_NAME)
;

ALTER TABLE CSM_PG_PE
ADD CONSTRAINT UQ_PG_PE_PG_PE_ID UNIQUE (PROTECTION_ELEMENT_ID, PROTECTION_GROUP_ID)
;

ALTER TABLE CSM_PRIVILEGE
ADD CONSTRAINT UQ_PRIVILEGE_NAME UNIQUE (PRIVILEGE_NAME)
;

ALTER TABLE CSM_PROTECTION_ELEMENT
ADD CONSTRAINT UQ_PE_OBJ_ATT_APP_ID UNIQUE (OBJECT_ID, ATTRIBUTE, APPLICATION_ID)
;

ALTER TABLE CSM_PROTECTION_GROUP
ADD CONSTRAINT UQ_PG_PG_NAME UNIQUE (APPLICATION_ID, PROTECTION_GROUP_NAME)
;

ALTER TABLE CSM_ROLE
ADD CONSTRAINT UQ_ROLE_ROLE_NAME UNIQUE (APPLICATION_ID, ROLE_NAME)
;

ALTER TABLE CSM_ROLE_PRIVILEGE
ADD CONSTRAINT UQ_ROLE_ID_PRIVILEGE_ID UNIQUE (PRIVILEGE_ID, ROLE_ID)
;

ALTER TABLE CSM_USER
ADD CONSTRAINT UQ_LOGIN_NAME UNIQUE (LOGIN_NAME)
;

ALTER TABLE CSM_USER_PE
ADD CONSTRAINT UQ_USER_PE_PE_ID UNIQUE (USER_ID, PROTECTION_ELEMENT_ID)
;

ALTER TABLE CSM_GROUP ADD CONSTRAINT FK_CSM_GROUP_CSM_APPLICATION 
FOREIGN KEY (APPLICATION_ID) REFERENCES CSM_APPLICATION (APPLICATION_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_FILTER_CLAUSE ADD CONSTRAINT  FK_APPLICATION_FILTER_CLAUSE 
FOREIGN KEY (APPLICATION_ID) REFERENCES CSM_APPLICATION (APPLICATION_ID)
ON DELETE CASCADE
;


ALTER TABLE CSM_PG_PE ADD CONSTRAINT FK_PG_PE_PE 
FOREIGN KEY (PROTECTION_ELEMENT_ID) REFERENCES CSM_PROTECTION_ELEMENT (PROTECTION_ELEMENT_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_PG_PE ADD CONSTRAINT FK_PG_PE_PG 
FOREIGN KEY (PROTECTION_GROUP_ID) REFERENCES CSM_PROTECTION_GROUP (PROTECTION_GROUP_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_PROTECTION_ELEMENT ADD CONSTRAINT FK_PE_APPLICATION 
FOREIGN KEY (APPLICATION_ID) REFERENCES CSM_APPLICATION (APPLICATION_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_PROTECTION_GROUP ADD CONSTRAINT FK_PG_APPLICATION 
FOREIGN KEY (APPLICATION_ID) REFERENCES CSM_APPLICATION (APPLICATION_ID)
ON DELETE NO ACTION
;

ALTER TABLE CSM_PROTECTION_GROUP ADD CONSTRAINT FK_PG_PG 
FOREIGN KEY (PARENT_PROTECTION_GROUP_ID) REFERENCES CSM_PROTECTION_GROUP (PROTECTION_GROUP_ID)
;

ALTER TABLE CSM_ROLE ADD CONSTRAINT FK_ROLE_APPLICATION 
FOREIGN KEY (APPLICATION_ID) REFERENCES CSM_APPLICATION (APPLICATION_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_ROLE_PRIVILEGE ADD CONSTRAINT FK_ROLE_PRIVILEGE_PRIVILEGE 
FOREIGN KEY (PRIVILEGE_ID) REFERENCES CSM_PRIVILEGE (PRIVILEGE_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_ROLE_PRIVILEGE ADD CONSTRAINT FK_ROLE_PRIVILEGE_ROLE 
FOREIGN KEY (ROLE_ID) REFERENCES CSM_ROLE (ROLE_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_GROUP ADD CONSTRAINT FK_USER_GROUP_GROUP 
FOREIGN KEY (GROUP_ID) REFERENCES CSM_GROUP (GROUP_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_GROUP ADD CONSTRAINT FK_USER_GROUP_USER 
FOREIGN KEY (USER_ID) REFERENCES CSM_USER (USER_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_GROUP_ROLE_PG ADD CONSTRAINT FK_USER_GROUP_ROLE_PG_GROUP 
FOREIGN KEY (GROUP_ID) REFERENCES CSM_GROUP (GROUP_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_GROUP_ROLE_PG ADD CONSTRAINT FK_USER_GROUP_ROLE_PG_PG 
FOREIGN KEY (PROTECTION_GROUP_ID) REFERENCES CSM_PROTECTION_GROUP (PROTECTION_GROUP_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_GROUP_ROLE_PG ADD CONSTRAINT FK_USER_GROUP_ROLE_PG_ROLE 
FOREIGN KEY (ROLE_ID) REFERENCES CSM_ROLE (ROLE_ID)
ON DELETE NO ACTION
;

ALTER TABLE CSM_USER_GROUP_ROLE_PG ADD CONSTRAINT FK_USER_GROUP_ROLE_PG_USER 
FOREIGN KEY (USER_ID) REFERENCES CSM_USER (USER_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_PE ADD CONSTRAINT FK_USER_PE_USER 
FOREIGN KEY (USER_ID) REFERENCES CSM_USER (USER_ID)
ON DELETE CASCADE
;

ALTER TABLE CSM_USER_PE ADD CONSTRAINT FK_USER_PE_PE 
FOREIGN KEY (PROTECTION_ELEMENT_ID) REFERENCES CSM_PROTECTION_ELEMENT (PROTECTION_ELEMENT_ID)
ON DELETE CASCADE
;

EXEC sp_addextendedproperty 'MS_Description', 'The application entity describes the name of the application. The authorization context is derived from application name or application context.', 'User', dbo, 'table', CSM_APPLICATION
;

EXEC sp_addextendedproperty 'MS_Description', 'Group is a logical grouping of the users.', 'User', dbo, 'table', CSM_GROUP
;

EXEC sp_addextendedproperty 'MS_Description', 'Establishes the relationship between protection groups and protection elements. Using this one can find out the protection elements belonging to a protection group or vice versa.', 'User', dbo, 'table', CSM_PG_PE
;

EXEC sp_addextendedproperty 'MS_Description', 'This table stores the privileges. e.g. CRUD', 'User', dbo, 'table', CSM_PRIVILEGE
;

EXEC sp_addextendedproperty 'MS_Description', 'Protection element is a any resource that is to be secured within an application based on roles of the user in a particular protection group context. e.g. Any object, Resource etc.', 'User', dbo, 'table', CSM_PROTECTION_ELEMENT
;

EXEC sp_addextendedproperty 'MS_Description', 'Protection group is a collection of protection elements.', 'User', dbo, 'table', CSM_PROTECTION_GROUP
;

EXEC sp_addextendedproperty 'MS_Description', 'This entity defines the roles associated with an application.', 'User', dbo, 'table', CSM_ROLE
;

EXEC sp_addextendedproperty 'MS_Description', 'This table stores the relationship between roles and privileges. Using this table one can find out the associated privileges with any role.', 'User', dbo, 'table', CSM_ROLE_PRIVILEGE
;

EXEC sp_addextendedproperty 'MS_Description', 'Stores the users of the application.', 'User', dbo, 'table', CSM_USER
;

EXEC sp_addextendedproperty 'MS_Description', 'Establishes the relationship between users and group. Using this table one can find out the users for a group or groups for a user.', 'User', dbo, 'table', CSM_USER_GROUP
;

EXEC sp_addextendedproperty 'MS_Description', 'This table establishes the relation between protection group, user, role and group. A user is assigned a role for a particular protection group. Or A a group is assigned a role for a particular protection group. This way a context of the protection group is set here for a role assumed by a user or  a group.', 'User', dbo, 'table', CSM_USER_GROUP_ROLE_PG
;

EXEC sp_addextendedproperty 'MS_Description', 'This table established the relationship between users and protection elements stating them as owner of that protection element.', 'User', dbo, 'table', CSM_USER_PE
;
