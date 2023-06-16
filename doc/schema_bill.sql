drop table if exists cf_wp_user_withdraw;
create table cf_wp_user_withdraw
(
    withdraw_id        bigint(32)                         not null comment '主键'
        primary key,
    user_id            bigint(32)                         not null comment '用户名',
    amount             decimal(30, 2)                     not null comment '提现金额',
    withdraw_way       varchar(30)                        not null comment '提现方式(0微信 1支付宝 2银联 3银行卡)',
    withdraw_account   varchar(64)                        not null comment '提现账户',
    trade_no           varchar(64)                        not null comment '消费流水号',
    withdraw_status    char                               null comment '交易状态 0、初始 1、成功 2、失败',
    trans_success_time datetime                           null comment '交易成功时间',
    create_time        datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time        datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    is_delete          char     default '0'               null comment '逻辑删除标识 0有效 1无效'
)
    comment '后台用户账户提现流水表' charset = utf8mb4;

drop table if exists cf_wp_user_payment_consume;
create table cf_wp_user_payment_consume
(
    payment_id         bigint(32)                         not null comment '主键'
        primary key,
    user_id            bigint(32)                         not null comment '用户名',
    amount             decimal(30, 2)                     not null comment '消费金额',
    refund_amount      decimal(20, 2)                     null comment '退款金额',
    consume_way        varchar(30)                        not null comment '消费方式(0微信 1支付宝 2银联 3银行卡)',
    trade_no           varchar(64)                        not null comment '消费流水号',
    merchant_id        bigint(32)                         not null comment '消费商家',
    product_id         bigint(32)                         null comment '商品id',
    refund_flag        char     default '0'               not null comment '是否退款 0否 1是',
    expend_type        char(2)                            null comment '支出类型 线下消费、美食',
    payment_status     char                               null comment '交易状态0、待支付 1、交易中 2、成功 3、交易关闭',
    trans_success_time datetime                           null comment '交易成功时间',
    trans_close_time   datetime                           null comment '交易关闭时间',
    create_time        datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time        datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    is_delete          char     default '0'               null comment '逻辑删除标识 0有效 1无效'
)
    comment '后台用户账户付款消费流水表' charset = utf8mb4;

drop table if exists cf_wp_user_recharge;
create table cf_wp_user_recharge
(
    recharge_id        bigint(32)                         not null comment '主键'
        primary key,
    user_id            bigint(32)                         not null comment '用户名',
    amount             decimal(30, 2)                     not null comment '充值金额',
    recharge_way       varchar(30)                        not null comment '充值方式(0微信 1支付宝 2银联 3银行卡)',
    order_no           varchar(64)                        not null comment '订单流水号',
    trade_no           varchar(64)                        not null comment '消费流水号',
    refund_flag        char     default '0'               not null comment '是否退款 0否 1是',
    recharge_status    char                               null comment '交易状态0、待支付 1、支付中2、成功 3、交易关闭',
    channel_code       varchar(10)                        null comment '付款渠道编号',
    trans_success_time datetime                           null comment '交易成功时间',
    trans_close_time   datetime                           null comment '交易关闭时间',
    create_time        datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time        datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    is_delete          char     default '0'               null comment '逻辑删除标识 0有效 1无效'
)
    comment '后台用户账户充值流水表' charset = utf8mb4;

drop table if exists cf_wp_user_account_bill;
create table cf_wp_user_account_bill
(
    bill_id            bigint(32)                         not null comment '主键'
        primary key,
    user_id            bigint(32)                         not null comment '用户名',
    amount             decimal(30, 2)                     not null comment '金额',
    change_type        char(2)                            not null comment '变动类型(0消费 1充值 2提现 3分红 4返现)',
    change_way         char(2)                            not null comment '变动方式(0微信 1支付宝 2银联 3银行卡 4钱包通用余额 5钱包定向余额)',
    order_no           bigint(32)                         not null comment '订单流水号',
    merchant_id        bigint(32)                         not null comment '消费商家',
    trade_no           varchar(64)                        not null comment '消费流水号',
    trans_status       char     default '0'               null comment '交易状态0、初始 1、交易中、2、成功 3、失败 ',
    trans_success_time datetime                           null comment '交易成功时间',
    refund_flag        char     default '0'               not null comment '是否退款 0否 1是',
    expend_type        char(2)                            null comment '支出类型',
    create_time        datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time        datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    is_delete          char     default '0'               null comment '逻辑删除标识 0有效 1无效'
)
    comment '后台用户账户交易流水表' charset = utf8mb4;

drop table if exists cf_wp_user_balance_consume;
create table cf_wp_user_balance_consume
(
    consumer_id        bigint(32)                         not null comment '主键'
        primary key,
    user_id            bigint(32)                         not null comment '用户名',
    merchant_id        bigint(32)                         null comment '消费商家',
    amount             decimal(30, 2)                     not null comment '消费金额',
    refund_amount      decimal(20, 2)                     null comment '退款金额',
    user_balance       varchar(64)                        not null comment '账户剩余金额',
    product_id         bigint(32)                         null comment '商品id',
    trade_no           varchar(64)                        not null comment '消费流水号',
    refund_flag        char     default '0'               not null comment '是否退款 0否 1是',
    expend_type        char(2)                            null comment '支出类型 线下消费、美食等',
    consumer_type      char                               null comment '消费类型0、通用余额1、定向余额',
    consumer_status    char     default '0'               null comment '消费状态 0、待支付 1、交易中 2、成功 3、交易关闭',
    trans_success_time datetime                           null comment '交易成功时间',
    trans_close_time   datetime                           null comment '交易关闭时间',
    create_time        datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time        datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    is_delete          char     default '0'               null comment '逻辑删除标识 0有效 1无效'
)
    comment '后台用户账户余额消费流水表' charset = utf8mb4;

drop table if exists cf_wp_user_bank;
create table cf_wp_user_bank
(
    bank_id          bigint(32) default 0                 not null comment '主键'
        primary key,
    user_id          bigint(32)                           null comment '用户ID',
    bank_acc_no      varchar(20)                          null comment '卡号',
    bank_acc_name    varchar(50)                          null comment '账户名称',
    bank_branch_name varchar(50)                          null comment '银行分行名称',
    bank_name        varchar(50)                          null comment '银行开户行名称',
    bank_branch_id   varchar(50)                          null comment '银行联行号',
    bank_status      char       default '0'               null comment '银行卡状态 0、正常 1、冻结 2、解绑',
    create_time      datetime   default CURRENT_TIMESTAMP null comment '创建时间',
    update_time      datetime                             null comment '修改时间'
)
    comment '银行卡信息' charset = utf8mb4;

drop table if exists cf_wp_user_wallet;
create table cf_wp_user_wallet
(
    wallet_id                  bigint(32)                               not null comment '主键'
        primary key,
    direction_amount           decimal(20, 2) default 0.00              null comment '定向金额 来源于[商城门票保险]等返现',
    user_id                    bigint(32)                               null comment 'userid',
    common_amount              decimal(20, 2) default 0.00              null comment '通用金额 来源于[微信支付宝银行卡]充值',
    direction_available_amount decimal(20, 2) default 0.00              null comment '定向可用金额',
    common_available_amount    decimal(20, 2) default 0.00              null comment '通用可用金额',
    total_save_amount          decimal(20, 2)                           null comment '累计省钱',
    freeze_amount              decimal(20, 2)                           null comment '冻结金额',
    created_user               varchar(30)    default 'SYS'             null comment '创建人',
    is_delete                  char           default '0'               null comment '逻辑删除标识 0有效 1无效',
    create_time                datetime       default CURRENT_TIMESTAMP null comment '创建时间',
    update_time                datetime                                 null on update CURRENT_TIMESTAMP comment '修改时间'
)
    comment '钱包表' charset = utf8mb4;