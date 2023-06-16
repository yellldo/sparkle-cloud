drop table if exists cf_bm_alliance_user;
create table cf_bm_alliance_user
(
    user_id     bigint(32) default 0                 not null comment '主键'
        primary key,
    login_name  varchar(50)                          null comment '登录账号',
    nick_name   varchar(50)                          null comment '昵称',
    merchant_id bigint(32)                           null comment '商户id',
    role_id     bigint(2)                            null comment '角色',
    is_delete   char       default '0'               null comment '删除标志位 0、否 1、是',
    user_status char       default '0'               null comment '用户状态 0、正常 1、禁用',
    create_time datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime                             null comment '修改时间'
)
    comment '百业联盟管理用户' charset = utf8mb4;

drop table if exists cf_mm_merchant_user;
create table cf_mm_merchant_user
(
    merchant_user_id bigint(32) default 0                 not null comment '主键'
        primary key,
    account_number   varchar(20)                          null comment '账号',
    nick_name        varchar(20)                          null comment '昵称',
    is_master        char                                 null comment '是否顶级用户',
    user_status      char(2)    default '0'               null comment '用户状态0、启用 1、禁用',
    create_time      datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time      datetime                             null comment '修改时间',
    is_delete        char       default '0'               null comment '删除标志位 0、未删除 1、已删除'
)
    comment '商户用户表' charset = utf8mb4;

drop table if exists cf_wp_invite;
create table cf_wp_invite
(
    invite_id      bigint(32)                         not null comment '主键'
        primary key,
    user_id        bigint(32)                         not null comment '用户id',
    account_number varchar(50)                        null comment '邀请人手机号',
    flag           char     default '0'               null comment '人员身份 0、普通会员 1、合作商铺',
    is_delete      char     default '0'               null comment '删除标志位0、未删除 1、未删除',
    create_time    datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time    datetime                           null comment '修改时间'
)
    comment '邀请表' charset = utf8mb4;

drop table if exists cf_wp_user;
create table cf_wp_user
(
    user_id          bigint(32)                         not null comment '主键'
        primary key,
    account_number   varchar(20)                        not null comment '账号',
    nick_name        varchar(50)                        null comment '昵称',
    user_gender      char                               null comment '性别 0、男 1、女',
    user_signature   varchar(500)                       null comment '个性签名',
    cade_id          bigint(32)                         null comment '车队编号',
    source_code      char(3)                            null comment '来源',
    invite_code      char(10)                           null comment '邀请码',
    invited_code     char(10)                           null comment '邀请码',
    role_id          bigint(32)                         null comment '角色',
    register_channel char(10)                           null comment '注册渠道',
    user_status      char     default '0'               null comment '状态 0、正常 1、禁用',
    is_vip           char     default '0'               null comment '是否付费会员',
    invite_count     int      default 0                 null comment '邀请人数',
    wallet_id        bigint(32)                         not null comment '钱包id',
    user_icon        varchar(500)                       null comment '用户头像',
    common_equipment varchar(30)                        null comment '常用设备',
    payment_password varchar(50)                        null comment '交易密码',
    user_type        char                               null comment '用户类型 0、web用户 1、商户',
    is_delete        char     default '0'               null comment '删除标志位 0、未删除 1、已删除',
    create_time      datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time      datetime                           null comment '修改时间'
)
    comment '用户表' charset = utf8mb4;

drop table if exists cf_wp_user_collect;
create table cf_wp_user_collect
(
    collect_id   bigint(32)                         not null comment '主键'
        primary key,
    user_id      bigint(32)                         null comment '用户id',
    collect_type char(2)                            null comment '类型',
    target_id    bigint(32)                         null comment '收藏的信息id',
    is_delete    char     default '0'               null comment '删除标志位 0、未删除 1、已删除',
    create_time  datetime default CURRENT_TIMESTAMP null,
    update_time  datetime                           null comment '修改时间'
)
    comment '用户收藏表' charset = utf8mb4;


drop table if exists sys_user;
create table sys_user
(
    user_id     bigint(32)                         not null comment '主键'
        primary key,
    login_name  varchar(30)                        not null comment '账号',
    password    varchar(100)                       not null comment '密码',
    nick_name   varchar(20)                        null comment '昵称',
    user_status char     default '0'               null comment '状态 0、正常 1、禁用',
    error_count int      default 0                 null comment '错误次数',
    rule_id     bigint(32)                         null comment '角色id',
    reset_flag  char     default '1'               null comment '重置密码标志位 0、否 1、是',
    create_time datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime                           null comment '修改时间',
    is_delete   char     default '0'               null comment '删除标志位 0、未删除 1、已删除'
)
    comment '后台用户表' charset = utf8mb4;

drop table if exists sys_user;
create table sys_message
(
    message_id      bigint(32)                         not null comment '主键'
        primary key,
    user_id         bigint(32)                         null comment '用户id',
    message_title   varchar(50)                        null comment '标题',
    message_content varchar(500)                       null comment '内容',
    message_type    char(2)                            null comment '消息类型',
    message_status  char     default '0'               null comment '状态 0、未读 1、已读',
    reply_user_id   bigint(32)                         null comment '回复人id',
    target_id       bigint(32)                         null comment '目标id',
    is_delete       char     default '0'               null comment '删除标志位 0、未删除 1、已删除',
    create_time     datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time     datetime                           null comment '修改时间'
)
    comment '消息表' charset = utf8mb4;

drop table if exists dict_info;
create table dict_info
(
    dict_id     bigint(32)                         not null comment '主键'
        primary key,
    parent_id   bigint(32)                         null comment '父级id',
    dict_type   varchar(50)                        null comment '类型',
    dict_key    varchar(50)                        not null comment '字典key',
    dict_value  varchar(200)                       not null comment '字典值',
    dict_status char     default '0'               null comment '状态 0、正常 1、禁用',
    dict_remark varchar(30)                        null comment '备注',
    is_delete   char     default '0'               null comment '删除标志位0、未删除1、已删除',
    create_time datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP null comment '更新时间'
)
    comment '字典表' charset = utf8mb4;

create index dict_info_dict_type_index
    on dict_info (dict_type);

drop table if exists sys_user;
create table sys_user
(
    user_id     bigint(32)                         not null comment '主键'
        primary key,
    login_name  varchar(30)                        not null comment '账号',
    password    varchar(100)                       not null comment '密码',
    nick_name   varchar(20)                        null comment '昵称',
    user_status char     default '0'               null comment '状态 0、正常 1、禁用',
    error_count int      default 0                 null comment '错误次数',
    role_id     bigint(32)                         null comment '角色id',
    reset_flag  char     default '1'               null comment '重置密码标志位 0、否 1、是',
    create_time datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime                           null comment '修改时间',
    is_delete   char     default '0'               null comment '删除标志位 0、未删除 1、已删除'
)
    comment '后台用户表' charset = utf8mb4;