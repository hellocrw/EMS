create table classInformation(
  id integer primary key,
  class_no integer not null,
  class_name varchar(64) not null,
  profession_no integer not null,
  profession_name varchar(64) not null,
  class_num integer not null,
  nomitor char(20) not null,
  monitor_tel integer not null
)
create table studentInformation (
  id integer primary key,
  stu_no	integer not null,
  stu_name varchar(64) not null,
  sex	tinyint(1) default 0,
  id_card integer(18) not null,
  department varchar(64) not null,
  profession varchar(84) not null,
  education enum('本科','专科') default '本科',
  political_status enum('团员','群众','党员') default '团员',
  biogenic_land varchar(255) not null,
  graduation_time date not null,
  stu_tel integer(11) not null,
  family_contact char(20) not null,
  home_tel	integer not null,
  home_address varchar(255) not null
)
create table unitInformation(
  id integer primary key,
  unit_type	varchar(64) not null,
  unit_name varchar(255) not null,
  unifie_social_credit_code integer not null,
  industry_unit varchar(255) not null,
  unit_area varchar(255) not null,
  unit_address varchar(255) not null,
  unit_contactor varchar(64) not null,
  unit_tel varchar(20) not null,
  unit_email varchar(20) not null,
  unit_postcode integer not null
)
create table stuEmployInformation (
  id	integer primary key,
  stu_no integer not null,
  stu_name varchar(20) not null,
  unit_name varchar(255) not null,
  unifie_social_credit_code integer not null,
  job_name varchar(64) not null,
  occupational_type varchar(64) not null,
  pay	integer not null,
  contract_time date not null,
  probation integer not null,
  probation_start_time	date not null,
  working_place	varchar(255) not null,
  relevance	tinyint(1) not null,
  is_employ_difficulties tinyint(1) not null,
  is_employ tinyint(1) not null
)
create table counselorInformation (
  id	integer primary key,
  cou_no integer not null,
  cou_name	varchar(64) not null,
  cou_phone	integer not null,
  cou_profession varchar(255) not null
)
create table employStylePre (
  id	integer primary key,
  stu_no	integer not null,
  stu_name	varchar(20) not null,
  graduation_year date not null,
  job_title varchar(64) not null,
  motto varchar(255) not null,
  picurl varchar(255) not null
)
create table jobInformation (
  id	integer primary key,
  employ_infor_no	char(5) not null,
  corporate_name varchar(255) not null,
  company_profile	varchar(255) not null,
  recruitment_post	varchar(255) not null,
  job_requirements	varchar(255) not null,
  working_place	varchar(255) not null,
  recruiting_numbers integer not null,
  recruiting_time date not null,
  recruiting_address varchar(64) not null
)
CREATE TABLE archivesWhereabouts(
  id integer 	primary key ,
  stu_no	integer not null,
  stu_name	varchar(20) not null,
  registered_residence	varchar(255) not null,
  home_address	varchar(255) not null,
  archive_recipient varchar(255) not null,
  receiving_address	varchar(255) not null,
  contact_person varchar(20) not null,
  contact_phone	integer not null,
  post_code integer not null
)

insert into classInformation values ()