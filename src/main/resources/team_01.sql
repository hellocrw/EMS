CREATE TABLE `user_info` (
  `user_id` varchar(20) NOT NULL default '' COMMENT '用户id',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `user_avatar` varchar(64) NOT NULL COMMENT '用户头像',
  `gender` enum('0','1') NOT NULL default '0' COMMENT '性别',
  `university` varchar(64) NOT NULL COMMENT '学校',
  `college` varchar(64) NOT NULL COMMENT '学院',
  `profession` varchar(64) NOT NULL COMMENT '专业',
  `grade` varchar(64) NOT NULL COMMENT '年级',
  `uclass` varchar(64) NOT NULL default '' COMMENT '班级',
  `user_tel` varchar(20) NOT NULL COMMENT '联系方式',
  `email` varchar(20) NOT NULL COMMENT '邮箱',
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312
CREATE TABLE `pro_info` (
  `pro_id` varchar(20) NOT NULL COMMENT '项目id',
  `pro_name` varchar(64) NOT NULL COMMENT '项目名称',
  `pro_describe` varchar(255) default NULL COMMENT '项目描述',
  `pro_date` date NOT NULL COMMENT '项目创建时间',
  `pro_status` varchar(64) NOT NULL COMMENT '项目当前状态',
  `team_id` varchar(20) NOT NULL COMMENT '所属团队',
  PRIMARY KEY  (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312
CREATE TABLE `team_info` (
  `team_id` varchar(20) NOT NULL COMMENT '队伍id',
  `team_name` varchar(64) NOT NULL COMMENT '队伍名称',
  `team_describe` varchar(255) default NULL COMMENT '团队描述',
  `team_number` int(11) NOT NULL COMMENT '团队人数',
  `team_date` date NOT NULL COMMENT '团队创建日期',
  PRIMARY KEY  (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312
CREATE TABLE `user_team_info` (
  `ut_id` varchar(20) NOT NULL COMMENT '用户项目表',
  `user_id` varchar(20) NOT NULL COMMENT '用户id',
  `team_id` varchar(20) NOT NULL COMMENT '团队id',
  `is_leader` enum('0','1') NOT NULL default '0' COMMENT '是否是队长',
  PRIMARY KEY  (`ut_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312
