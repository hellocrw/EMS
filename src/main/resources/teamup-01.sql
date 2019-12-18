CREATE TABLE `archives_where_abouts` (
  `id` int(11) NOT NULL COMMENT '序号',
  `stu_no` int(11) NOT NULL COMMENT '学号',
  `stu_name` varchar(20) NOT NULL default '' COMMENT '姓名',
  `registered_residence` varchar(255) NOT NULL default '' COMMENT '户口档案去向',
  `home_address` varchar(255) NOT NULL default '' COMMENT '入户地址',
  `archive_recipient` varchar(255) NOT NULL default '' COMMENT '档案接收单位',
  `receiving_address` varchar(255) NOT NULL default '' COMMENT '接收地址',
  `contact_person` varchar(20) NOT NULL default '' COMMENT '联系人',
  `contact_phone` varchar(20) NOT NULL default '' COMMENT '联系电话',
  `post_code` int(11) NOT NULL COMMENT '邮编',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `class_info` (
  `id` int(11) NOT NULL COMMENT '序号',
  `class_no` int(11) NOT NULL COMMENT '班级代号',
  `class_name` varchar(64) NOT NULL default '' COMMENT '班级名称',
  `profession_no` int(11) NOT NULL COMMENT '专业代号',
  `profession_name` varchar(64) NOT NULL default '' COMMENT '专业名称',
  `class_num` int(11) NOT NULL COMMENT '班级人数',
  `nomitor` char(20) NOT NULL default '' COMMENT '班长',
  `monitor_tel` varchar(20) NOT NULL default '' COMMENT '班长联系方式',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `counselor_info` (
  `id` int(11) NOT NULL COMMENT '序号',
  `cou_no` int(11) NOT NULL COMMENT '教工号',
  `cou_name` varchar(64) NOT NULL default '' COMMENT '姓名',
  `cou_phone` varchar(20) NOT NULL default '' COMMENT '联系方式',
  `cou_profession` varchar(255) NOT NULL default '' COMMENT '辅导专业',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `employ_style_pre` (
  `id` int(11) NOT NULL COMMENT '序号',
  `stu_no` int(11) NOT NULL COMMENT '学号',
  `stu_name` varchar(20) NOT NULL default '' COMMENT '姓名',
  `graduation_year` date NOT NULL COMMENT '毕业年份',
  `job_title` varchar(64) NOT NULL default '' COMMENT '职位名称',
  `motto` varchar(255) NOT NULL default '' COMMENT '座右铭',
  `picurl` varchar(255) NOT NULL default '' COMMENT '图片地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `job_info` (
  `id` int(11) NOT NULL COMMENT '序号',
  `employ_infor_no` char(5) NOT NULL default '' COMMENT '就业信息编号',
  `corporate_name` varchar(255) NOT NULL default '' COMMENT '招聘公司/企业',
  `company_profile` varchar(255) NOT NULL default '' COMMENT '公司简介',
  `recruitment_post` varchar(255) NOT NULL default '' COMMENT '招聘岗位',
  `job_requirements` varchar(255) NOT NULL default '' COMMENT '职位要求',
  `working_place` varchar(255) NOT NULL default '' COMMENT '工作地点',
  `recruiting_numbers` int(11) NOT NULL COMMENT '招聘人数',
  `recruiting_time` date NOT NULL COMMENT '招聘时间',
  `recruiting_address` varchar(64) NOT NULL default '' COMMENT '招聘地点',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `stu_employ_info` (
  `id` int(11) NOT NULL COMMENT '序号',
  `stu_no` int(11) NOT NULL COMMENT '学号',
  `stu_name` varchar(20) NOT NULL default '' COMMENT '姓名',
  `unit_name` varchar(255) NOT NULL default '' COMMENT '就业单位名称',
  `unifie_social_credit_code` int(11) NOT NULL COMMENT '统一社会信用代码',
  `job_name` varchar(64) NOT NULL default '' COMMENT '岗位名称',
  `occupational_type` varchar(64) NOT NULL default '' COMMENT '职业类型',
  `pay` int(11) NOT NULL COMMENT '薪酬（月薪）',
  `contract_time` date NOT NULL COMMENT '签约时间',
  `probation` int(11) NOT NULL COMMENT '协议试用期',
  `probation_start_time` date NOT NULL COMMENT '试用期开始时间',
  `working_place` varchar(255) NOT NULL default '' COMMENT '工作地点',
  `relevance` tinyint(1) NOT NULL COMMENT '专业与就业相关度',
  `is_employ_difficulties` tinyint(1) NOT NULL COMMENT '是否就业困难',
  `is_employ` tinyint(1) NOT NULL COMMENT '是否就业',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `student_info` (
  `id` int(11) NOT NULL COMMENT '序号',
  `stu_no` int(11) NOT NULL COMMENT '学号',
  `stu_name` varchar(64) NOT NULL default '' COMMENT '姓名',
  `sex` tinyint(1) default '0' COMMENT '性别',
  `id_card` int(18) NOT NULL COMMENT '身份证',
  `department` varchar(64) NOT NULL default '' COMMENT '院系',
  `profession` varchar(84) NOT NULL default '' COMMENT '专业',
  `education` enum('本科','专科') default '本科' COMMENT '学历',
  `political_status` enum('团员','群众','党员') default '团员' COMMENT '政治面貌',
  `biogenic_land` varchar(255) NOT NULL default '' COMMENT '生源地',
  `graduation_time` date NOT NULL COMMENT '毕业时间',
  `stu_tel` varchar(20) NOT NULL COMMENT '个人联系电话',
  `family_contact` char(20) NOT NULL default '' COMMENT '家庭联系人',
  `home_tel` varchar(20) NOT NULL COMMENT '家庭电话',
  `home_address` varchar(255) NOT NULL default '' COMMENT '家庭住址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

CREATE TABLE `unit_info` (
  `id` int(11) NOT NULL COMMENT '序号',
  `unit_type` varchar(64) NOT NULL default '' COMMENT '单位类型',
  `unit_name` varchar(255) NOT NULL default '' COMMENT '就业单位名称',
  `unifie_social_credit_code` int(11) NOT NULL COMMENT '统一社会信用代码',
  `industry_unit` varchar(255) NOT NULL default '' COMMENT '单位所属行业',
  `unit_area` varchar(255) NOT NULL default '' COMMENT '单位所属地区',
  `unit_address` varchar(255) NOT NULL default '' COMMENT '单位详细地址',
  `unit_contactor` varchar(64) NOT NULL default '' COMMENT '单位联系人',
  `unit_tel` varchar(20) NOT NULL default '' COMMENT '单位联系电话',
  `unit_email` varchar(20) NOT NULL default '' COMMENT '单位联系邮箱',
  `unit_postcode` int(11) NOT NULL COMMENT '单位邮编',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312

INSERT INTO class_info VALUES (1,161543218,"计科2班",161542,"计算机科学与技术",54,"豪宗超1",13229451650);
INSERT INTO class_info VALUES (2,161543218,"计科2班",161542,"计算机科学与技术",54,"豪宗超2",13229451650);
INSERT INTO class_info VALUES (3,61543318,"计科3班",161543,"计算机科学与技术",54,"豪宗超3",13229451650);
INSERT INTO class_info VALUES (4,161543318,"计科3班",161543,"计算机科学与技术",54,"豪宗超4",13229451650);
INSERT INTO class_info VALUES (5,161543418,"计科4班",161544,"计算机科学与技术",54,"豪宗超5",13229451650);