create table log_info
(
  log_id         INT(10) auto_increment
  comment '日志id'
    primary key,
  operator       VARCHAR(255) default '' not null
  comment '操作者',
  operate_type   VARCHAR(255) default '' not null
  comment '操作类型',
  operate_date   DATE (10) default '' not null comment '操作时间',
  operate_result VARCHAR(20) default ''  not null
  comment '操作结果'
);

create table team_info
(
  team_id       VARCHAR(20) default '' not null
  comment '队伍id'
    primary key,
  team_name     VARCHAR(64) default '' not null
  comment '队伍名称',
  team_describe VARCHAR(255)           null
  comment '团队描述',
  team_number   INT(10)                not null
  comment '团队人数',
  team_date     DATE (10) default '' not null comment '团队创建日期'
);

create table pro_info
(
  pro_id       VARCHAR(20) default '' not null
  comment '项目id'
    primary key,
  pro_name     VARCHAR(64) default '' not null
  comment '项目名称',
  pro_describe VARCHAR(255)           null
  comment '项目描述',
  pro_date     DATE (10) default '' not null comment '项目创建时间',
  pro_status   VARCHAR(64) default '' not null
  comment '项目当前状态',
  team_id      VARCHAR(20) default '' not null
  comment '所属团队',
  constraint fk_team_id
  foreign key (team_id) references team_info (team_id)
);

create table user_info
(
  user_id     VARCHAR(20) default '' not null
  comment '用户id'
    primary key,
  user_name   VARCHAR(20) default '' not null
  comment '用户名',
  password    VARCHAR(20) default '' not null
  comment '密码',
  user_avatar VARCHAR(64) default '' not null
  comment '用户头像',
  gender      ENUM (2) default '0'   not null
  comment '性别',
  university  VARCHAR(64) default '' not null
  comment '学校',
  college     VARCHAR(64) default '' not null
  comment '学院',
  profession  VARCHAR(64) default '' not null
  comment '专业',
  grade       VARCHAR(64) default '' not null
  comment '年级',
  uclass      VARCHAR(64) default '' not null
  comment '班级',
  user_tel    VARCHAR(20) default '' not null
  comment '联系方式',
  email       VARCHAR(20) default '' not null
  comment '邮箱'
);

create table user_team_info
(
  ut_id     VARCHAR(20) default '' not null
  comment '用户项目表'
    primary key,
  user_id   VARCHAR(20) default '' not null
  comment '用户id',
  team_id   VARCHAR(20) default '' not null
  comment '团队id',
  is_leader ENUM (2) default '0'   not null
  comment '是否是队长',
  constraint team_id
  foreign key (team_id) references team_info (team_id),
  constraint user_id
  foreign key (user_id) references user_info (user_id)
);


