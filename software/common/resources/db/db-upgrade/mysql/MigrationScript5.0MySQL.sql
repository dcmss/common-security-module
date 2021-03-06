/*L
   Copyright Ekagra Software Technologies Ltd.
   Copyright SAIC, SAIC-Frederick

   Distributed under the OSI-approved BSD 3-Clause License.
   See http://ncip.github.com/common-security-module/LICENSE.txt for details.
L*/


ALTER TABLE CSM_USER MODIFY COLUMN PHONE_NUMBER VARCHAR(100);

ALTER TABLE CSM_USER ADD COLUMN PASSWORD_EXPIRED TINYINT(1) DEFAULT 0;
ALTER TABLE CSM_USER ADD COLUMN FIRST_TIME_LOGIN TINYINT(1) DEFAULT 0;
ALTER TABLE CSM_USER ADD COLUMN ACTIVE_FLAG TINYINT(1) DEFAULT 1;
ALTER TABLE CSM_USER ADD COLUMN PASSWORD_EXPIRY_DATE DATE DEFAULT '2012-10-10';

CREATE TABLE CSM_PASSWORD_HISTORY (
	CSM_PASSWORD_HISTORY_ID BIGINT AUTO_INCREMENT  NOT NULL,
	LOGIN_NAME VARCHAR(500),
	PASSWORD VARCHAR(255),
	PRIMARY KEY(CSM_PASSWORD_HISTORY_ID)
) ENGINE=InnoDB
;

CREATE TABLE CSM_CONFIGURATION_PROPS (
  PROPERTY_KEY VARCHAR(300) NOT NULL,
  PROPERTY_VALUE VARCHAR(3000),
  PRIMARY KEY (PROPERTY_KEY)
) ENGINE=InnoDB 
;

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('AES_ENCRYPTION_KEY','super secret');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('ALLOWED_ATTEMPTS','3');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('ALLOWED_LOGIN_TIME','600000');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('MD5_HASH_KEY','true');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('PASSWORD_EXPIRY_DAYS','60');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('PASSWORD_LOCKOUT_TIME','1800000');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('PASSWORD_MATCH_NUM','24');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('PASSWORD_PATTERN_MATCH','^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$');

INSERT INTO CSM_CONFIGURATION_PROPS (PROPERTY_KEY, PROPERTY_VALUE) VALUES('PASSWORD_PATTERN_DESCRIPTION','At least one Upper case alphabet, at least one lower case alphabet, at least one number and minimum 8 characters length');

COMMIT;
