create table classInformation(
  id integer primary key,
  classNo integer not null.
  className varchar(64) not null,
  professionNo integer not null,
  professionName varchar(64) not null,
  classNum integer not null,
  nomitor char(20) not null,
  monitorTel integer(11) not null
)
create table studentInformation (
  id integer primary key,
  stuNo	integer not null,
  stuName varchar(64) not null,
  sex	tinyint(1) default 0,
  idCard integer(18) not null,
  department varchar(64) not null,
  profession varchar(84) not null,
  education enum('本科','专科') default '本科',
  politicalStatus enum('团员','群众','党员') default '团员',
  biogenicLand varchar(255) not null,
  graduationTime date not null,
  stuTel integer(11) not null,
  familyContact char(20) not null,
  homeTel	integer(11) not null,
  homeAddress varchar(255) not null
)
create table unitInformation(
  id integer primary key,
  unitType	varchar(64) not null,
  unitName varchar(255) not null,
  unifieSocialCreditCode integer not null,
  industryUnit varchar(255) not null,
  unitArea varchar(255) not null,
  unitAddress varchar(255) not null,
  unitContactor varchar(64) not null,
  unitTel varchar(20) not null,
  unitEmail varchar(20) not null,
  unitPostcode integer not null
)
create table stuEmployInformation (
  id	integer primary key,
  stuNo integer not null,
  stuName varchar(20) not null,
  unitName varchar(255) not null,
  unifieSocialCreditCode integer not null,
  jobName varchar(64) not null,
  occupationalType varchar(64) not null,
  pay	integer not null,
  contractTime date not null,
  probation integer not null,
  probationStartTime	date not null,
  WorkingPlace	varchar(255) not null,
  PAERelevance	tinyint(1) not null,
  isEmployDifficulties tinyint(1) not null,
  isEmploy tinyint(1) not null
)
create table counselorInformation (
  id	integer primary key,
  couNo integer not null,
  couName	varchar(64) not null,
  couPhone	integer(11) not null,
  couProfession varchar(255) not null
)
create table employStylePre (
  id	integer primary key,
  stuNo	integer not null,
  stuName	varchar(20) not null,
  graduationYear date not null,
  jobTitle varchar(64) not null,
  motto varchar(255) not null,
  picurl varchar(255) not null
)
create table jobInformation (
  id	integer primary key,
  employInforNo	char(5) not null,
  corporateName varchar(255) not null,
  companyProfile	varchar(255) not null,
  recruitmentPost	varchar(255) not null,
  jobRequirements	varchar(255) not null,
  WorkingPlace	varchar(255) not null,
  recruitingNumbers integer not null,
  recruitingTime date not null,
  recruitingAddress varchar(64) not null
)
archivesWhereabouts(
  id integer 	primary key ,
  stuNo	integer not null,
  stuName	varchar(20) not null,
  registeredResidence	varchar(255) not null,
  homeAddress	varchar(255) not null,
  archiveRecipient varchar(255) not null,
  receivingAddress	varchar(255) not null,
  contactPerson varchar(20) not null,
  contactPhone	integer not null,
  code integer not null,

)