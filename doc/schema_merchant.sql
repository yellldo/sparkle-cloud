drop table if exists cf_bm_merchant_bank;
create table cf_bm_merchant_bank
(
    bank_id          bigint(32) default 0                 not null comment '主键'
        primary key,
    merchant_id      bigint(32)                           null comment '用户ID',
    bank_acc_no      varchar(20)                          null comment '卡号',
    bank_acc_name    varchar(50)                          null comment '账户名称',
    bank_branch_name varchar(50)                          null comment '银行分行名称',
    bank_name        varchar(50)                          null comment '银行开户行名称',
    bank_branch_id   varchar(50)                          null comment '银行联行号',
    bank_status      char       default '0'               null comment '银行卡状态 0、正常 1、冻结 2、解绑',
    is_delete        char       default '0'               null comment '删除标志位 0、否1、是',
    create_time      datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time      datetime                             null comment '修改时间'
)
    comment '商家银行卡信息' charset = utf8mb4;

drop table if exists cf_bm_merchant_service;
create table cf_bm_merchant_service
(
    service_id     bigint(32) default 0                 not null comment '主键'
        primary key,
    merchant_id    bigint(32) default 0                 not null comment '商家id',
    service_name   varchar(200)                         null comment '服务名称',
    service_desc   varchar(500)                         null comment '服务描述',
    service_amount decimal(20, 2)                       null comment '服务价格',
    audit_status   char       default '0'               null comment '服务状态 0、待审核 1、审核通过 2、审核拒绝',
    audit_remark   varchar(500)                         null comment '审核备注',
    rack_status    char       default '0'               null comment '上架状态0、否1、是',
    rack_time      datetime                             null comment '上架时间',
    is_delete      char       default '0'               null comment '删除标志位0、否1、是',
    create_time    datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time    datetime                             null comment '修改时间'
)
    comment '商家服务' charset = utf8mb4;

drop table if exists cf_bm_merchant_fee;
create table cf_bm_merchant_fee
(
    fee_id         bigint(32) default 0                 not null comment '主键'
        primary key,
    merchant_id    bigint(32)                           null comment '商户id',
    fee_type       char                                 null comment '费率类型 0、梯度 1、定额',
    min_value      decimal(10, 2)                       null comment '最小值',
    max_value      decimal(10, 2)                       null comment '最大值',
    discount_value varchar(20)                          null comment '优惠值',
    discount_unit  char                                 null comment '单位 0、元 1、百分比',
    is_delete      char       default '0'               null comment '删除标志位 0、否1、是',
    create_time    datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time    datetime                             null comment '修改时间'
)
    comment '商家费率' charset = utf8mb4;

drop table if exists cf_bm_merchant;
create table cf_bm_merchant
(
    merchant_id       bigint(32) default 0                 not null comment '主键'
        primary key,
    merchant_name     varchar(50)                          null comment '商户名称',
    merchant_tag      varchar(50)                          null comment '商户标签',
    merchant_icon     varchar(100)                         null comment '商户图片',
    collect_count     int        default 0                 null comment '收藏数量',
    evaluate_count    int        default 0                 null comment '评论数量',
    score             varchar(5) default '0'               null comment '星级',
    merchant_address  varchar(100)                         null comment '商户地址',
    merchant_phone    varchar(20)                          null comment '商家联系电话',
    lng               double                               null comment '精度',
    lat               double                               null comment '纬度',
    merchant_desc     varchar(500)                         null comment '商户描述',
    merchant_discount decimal(10, 2)                       null comment '折扣',
    merchant_status   char       default '0'               null comment '状态0、启用 1、冻结',
    audit_remark      varchar(200)                         null comment '审核原因',
    sorting           int        default 0                 null comment '排序',
    is_delete         char       default '0'               null comment '删除标志位0、未删除 1、已删除',
    create_time       datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time       datetime                             null comment '修改时间'
)
    comment '百业联盟商户' charset = utf8mb4;


drop table if exists cf_bm_merchant_contract_history;
create table cf_bm_merchant_contract_history
(
    history_id     bigint(32) default 0                 not null comment '主键'
        primary key,
    merchant_id    bigint(32)                           null comment '商家id',
    file_url       varchar(500)                         null comment '文件路径',
    history_status char       default '0'               null comment '状态 0、正常 1、过期',
    is_delete      char       default '0'               null comment '删除标志位 0、否1、是',
    create_time    datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time    datetime                             null comment '修改时间'
)
    comment '商家合同记录' charset = utf8mb4;

drop table if exists cf_bm_merchant_evaluate;
create table cf_bm_merchant_evaluate
(
    evaluate_id   bigint(32)                         not null comment '主键'
        primary key,
    root          bigint(32)                         null comment '根id',
    parent_id     bigint(32)                         null comment '父级id',
    user_id       bigint(32)                         null comment '用户id',
    reply_user_id bigint(32)                         null comment '回复的用户id',
    content       varchar(500)                       null comment '评论内容',
    level         int                                null comment '评价',
    merchant_id   bigint(32)                         null comment '商家id',
    is_master     char     default '0'               null comment '是否主评论 0、是 1、否',
    id_delete     char     default '0'               null comment '删除标志位0、未删除 1、已删除',
    create_time   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time   datetime                           null comment '修改时间'
)
    comment '商家评论表' charset = utf8mb4;

drop table if exists cf_mm_merchant_pic;
create table cf_mm_merchant_pic
(
    pic_id      bigint(32) default 0                 not null comment '主键'
        primary key,
    merchant_id bigint(32)                           not null comment '商户id',
    pic_url     varchar(200)                         null comment '图片路径',
    pic_name    varchar(200)                         null comment '图片名称',
    status      char       default '0'               not null comment '状态 0、启用 1、禁用',
    create_time datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime                             null comment '修改时间',
    is_delete   char       default '0'               null comment '删除标志位0、未删除 1、已删除'
)
    comment '商户轮播图' charset = utf8mb4;

drop table if exists cf_mm_merchant;
create table cf_mm_merchant
(
    merchant_id           bigint(32)                         not null comment '主键'
        primary key,
    merchant_name         varchar(50)                        null comment '商户名称',
    merchant_phone        varchar(20)                        null comment '商户手机号 作为登录账号',
    credit_code           varchar(20)                        null comment '社会统一信用代码',
    merchant_address      varchar(500)                       null comment '公司地址',
    merchant_status       char(2)  default '0'               null comment '商户状态0、待审核、1、审核通过',
    license_address       varchar(500)                       null comment '营业执照地址',
    merchant_type         char(5)                            null comment '商户类型',
    license_start         datetime                           null comment '营业执照期限',
    license_deadline_type char(2)                            null comment '营业执照期限',
    license_url           varchar(200)                       null comment '营业执照url',
    audit_remark          varchar(500)                       null comment '审核备注',
    create_time           datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time           datetime                           null comment '更新时间'
)
    comment '百业联盟商户' charset = utf8mb4;

drop table if exists cf_mm_merchant_product;
create table cf_mm_merchant_product
(
    product_id     bigint(32)                         not null comment '主键'
        primary key,
    merchant_id    bigint(32)                         null comment '商户id',
    product_name   varchar(50)                        null comment '商品名称',
    product_img    varchar(500)                       null comment '商品图片',
    product_type   char(5)                            null comment '商品类型',
    product_stock  int      default 0                 null comment '商品库存',
    product_desc   varchar(500)                       null comment '商品描述',
    product_status char     default '0'               null comment '商品状态0、启用 1、禁用',
    amount         decimal(20, 2)                     null comment '商品价格',
    discount       varchar(5)                         null comment '折扣',
    product_brand  char(5)                            null comment '商品品牌',
    sale_count     int      default 0                 null comment '售出数量',
    product_model  varchar(20)                        null comment '商品型号',
    is_hot         char     default '0'               null comment '是否爆款商品 0、否 1、是',
    rack_time      datetime                           null comment '上架时间',
    rack_status    char     default '0'               null comment '上架状态 0、下架 1、上架',
    send_type      varchar(20)                        null comment '配送方式',
    audit_status   char     default '0'               null comment '审核状态 0、未审核 1、审核通过 2、审核拒绝',
    audit_remark   varchar(500)                       null comment '审核备注',
    create_time    datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time    datetime                           null comment '修改时间',
    is_delete      char     default '0'               null comment '删除标志位 0、未删除 1、已删除'
)
    comment '商家商品表' charset = utf8mb4;