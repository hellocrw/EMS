create table annex
(
  id      BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  user_id BIGINT(19)   null
  comment '用户ID',
  link    VARCHAR(255) null
  comment '附件链接'
);

create table apply_info
(
  id         BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  team_id    BIGINT(19)   null
  comment '团队ID号',
  apply_id   BIGINT(19)   null
  comment '申请ID号',
  user_id    BIGINT(19)   null
  comment '申请人ID号',
  user_name  VARCHAR(255) null
  comment '申请人',
  apply_date DATE (10) null comment '申请时间',
  decribe    VARCHAR(255) null
  comment '申请描述',
  phone      VARCHAR(255) null
  comment '联系方式',
  status     TINYINT(3)   null
  comment '申请状态'
);

create table invite_info
(
  id      BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  user_id BIGINT(19)   null
  comment '队长ID',
  team_id BIGINT(19)   null
  comment '团队ID',
  date    DATE (10) null comment '邀请时间',
  status  VARCHAR(255) null
  comment '邀请状态'
);

create table log_info
(
  id        BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  log_id    BIGINT(19) auto_increment
  comment '日志ID',
  user_id   BIGINT(19)   null
  comment '用户ID',
  user_name VARCHAR(255) null
  comment '用户',
  type      DATE (10) null comment '操作类型',
  time      VARCHAR(255) null
  comment '操作时间',
  result    VARCHAR(255) null
  comment '操作结果'
);

create table pro_info
(
  id           BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  pro_id       VARCHAR(255) null
  comment '项目ID',
  pro_name     VARCHAR(255) null
  comment '项目名称',
  pro_describe VARCHAR(255) null
  comment '项目描述',
  pro_date     DATE (10) null comment '项目创建时间',
  pro_status   VARCHAR(255) null
  comment '项目当前状态',
  team_id      VARCHAR(255) null
  comment '所属团队id号',
  team_name    VARCHAR(255) null
  comment '团队名称',
  pro_type     VARCHAR(255) null
  comment '项目类型',
  number       INT(10)      null
  comment '项目人数',
  see_num      INT(10)      null
  comment '查看人数',
  staff        TINYINT(3)   null
  comment '需要人员类型'
);

create table pw_info
(
  id       BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  username VARCHAR(255) null
  comment '用户名',
  password VARCHAR(255) null
  comment '密码'
);

create table role_info
(
  id        BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  role_id   BIGINT(19)   null
  comment '角色ID号',
  role_name VARCHAR(255) null
  comment '角色名称'
);

create table team_info
(
  id            BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  team_id       BIGINT(19)   null
  comment '团队ID',
  team_name     VARCHAR(255) null
  comment '团队名称',
  team_describe VARCHAR(255) null
  comment '团队描述',
  team_number   INT(10)      null
  comment '团队人数',
  team_date     DATE (10) null comment '团队创建日期',
  status        TINYINT(3)   null
  comment '团队状态'
);

create table team_up_info
(
  id         BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  teamup_id  BIGINT(19)   null
  comment '组队ID号',
  start_time BIGINT(19)   null
  comment '开始时间',
  end_time   DATE (10) null comment '结束时间',
  `describe` VARCHAR(255) null
  comment '队伍描述'
);

create table user_team_info
(
  id        BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  ut_id     BIGINT(19) null
  comment '用户项目ID',
  user_id   BIGINT(19) null
  comment '用户ID',
  team_id   BIGINT(19) null
  comment '团队ID',
  is_leader TINYINT(3) null
  comment '是否是队长'
);

create table users_info
(
  id          BIGINT(19) auto_increment
  comment 'ID'
    primary key,
  user_id     VARCHAR(255) null
  comment '用户ID',
  user_name   VARCHAR(255) null
  comment '用户名称',
  user_avatar VARCHAR(255) null
  comment '头像',
  gender      TINYINT(3)   null
  comment '性别',
  university  VARCHAR(255) null
  comment '学校',
  college     VARCHAR(255) null
  comment '学院',
  profession  VARCHAR(255) null
  comment '专业',
  grade       VARCHAR(255) null
  comment '年级',
  user_class  VARCHAR(255) null
  comment '班级',
  user_no     INT(10)      null
  comment '学号',
  user_tel    VARCHAR(255) null
  comment '联系方式',
  email       VARCHAR(255) null
  comment '邮箱',
  ability     VARCHAR(255) null
  comment '掌握技能、能力'
);

INSERT INTO annex(user_id,link) VALUES(12,'xxx');
INSERT INTO `apply_info` (`id`, `team_id`, `apply_id`, `user_id`, `user_name`, `apply_date`, `decribe`, `phone`, `status`) VALUES('1','1','11','111','crw','2019-12-26','apply_info','12345678','0');
INSERT INTO `invite_info` (`id`, `user_id`, `team_id`, `date`, `status`) VALUES('1','1','11','2019-12-26','1');


