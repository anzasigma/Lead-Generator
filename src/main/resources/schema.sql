DROP TABLE IF EXISTS LEADS;
DROP TABLE IF EXISTS SALES_PERSONS;

CREATE TABLE LEADS (
   consultant_name VARCHAR(250) ,
   consultant_id INTEGER NOT NULL ,
  company VARCHAR(250) ,
  lead_description VARCHAR(250) ,
  contact_person VARCHAR(250) ,
);
CREATE TABLE SALES_PERSONS (
   name VARCHAR(250),
   employee_id INTEGER PRIMARY KEY  NOT NULL,
  company VARCHAR(250) NOT NULL,
  email VARCHAR(250),
  phone_no VARCHAR(250),
 
);