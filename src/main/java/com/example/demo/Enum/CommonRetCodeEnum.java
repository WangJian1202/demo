package com.example.demo.Enum;



/**
 * Created by gaolinlin on 2019/01/28.
 */
public enum CommonRetCodeEnum {
    // 通用返回码
    SUCCESS(10000, "成功"),
    FAILED(99999, "失败"),
    REPEAT(10001, "重复操作"),
    PROCESS(10002, "处理中"),
    ERROR(20000, "系统异常"),
    PARAM_ILLEGAL(20001, "参数非法"),
    BUSY(20004, "系统繁忙,请稍后重试"),

    // 绑卡返回码
    BANKCARD_REPEAT(20300, "绑卡/换卡请求重复"),
    BANKCARD_EXIST(20301, "已有绑定的银行卡"),
    DEBIT_CARD_ONLY(20302, "只支持借记卡"),
    USER_INFO_ERROR(20303, "身份证,姓名或银行预留手机号有误"),
    BANKCARD_ERROR(20304, "银行卡信息有误"),
    BANKCARD_DISABLE(20305, "银行卡受限"),
    BANK_DISABLE(20306, "暂不支持此银行"),
    OLD_BANKCARD_NOT_EXIST(20308, "原银行卡号不存在或无效"),
    CHANGE_BANKCARD_PROCESS(20309, "有处理中的换卡业务"),
    BANKCARDNO_UNVALID(20311, "无法识别的银行卡号"),
    APPLICATIONID_NOT_EXIST(20312, "业务请求号不存在或请求未成功"),
    CHECK_CODE_TOO_MANY(20313, "验证同一个短验次数超限, 请重新获取新的短验"),
    CODE_UNVALID(20314, "短信验证码有误"),
    CODE_EXPIRE(20316, "短信验证码已过期"),
    SEND_CODE_TOO_MANY(20325, "抱歉, 发送短信验证码频繁，请稍后重试"),
    CHANGE_BANKCARD_ERROR(20326, "换卡失败, 授信信息不存在"),
    USER_INFO_CHANGE(20327, "更换卡用户信息与授信时不符"),
    BANKCARD_UNVALID(20335, "银行卡号和手机号与现有信息不一致"),

    // 用信返回码
    LOAN_ID_REPEAT(21001, "贷款ID重复，且其他参数不一致"),
    LIMIT_NOT_FULL(21002, "可贷款额度不足"),
    EXIST_OVERDUE(21003, "请先还清已逾期的贷款"),
    EXIST_PAYING(21004, "存在处理中的借款申请"),
    PERSON_INFO_ERROR(21007, "联系人信息不能与申请人一致"),
    NO_CREDIT(21009, "未授信用户/申请中不允许借款"),
    RISK_REFUSE(22002,"风控策略拒绝"),

       //CREDIT_STATUS_FAIL (22001,"授信状态检查失败"),
       //LOAN_FAIL (22003,"放款订单生成失败"),
       //LIMIT_PREEMPTION_FAIL(22004,"额度预占用失败"),
       //CREAT_PLAN_FAIL (22005,"创建借据/分期计划失败"),
       //FUNDS_TRANSFER_FAIL (22006,"资金转账失败"),
       //BORROW_CONFIRM_FAIL (22007,"借据确认失败"),
       //LIMIT__CONFIRM_FAIL (22008,"额度确认失败"),
       // (22009,"支付失败,透传支付返回的拒绝原因,透传支付返回的拒绝原因"),

    //还款返回码
    NO_LOAN(21501, "该身份信息下的贷款ID不存在"),
    REPAID(21502, "改期还款已成功"),
    NOT_PAYMENT(21503, "该笔贷款未放款"),
    REPAY_TYPE_ERROR(21504, "还款类型不正确"),
    REPAY_PERIOD_UNVALID(21505, "还款期数或还款金额不正确"),
    REPAY_IDNO_ERROR(21506, "身份信息与绑卡信息不匹配"),
    REPAY_ORDER_NOT_EXIST(21507, "交易不存在"),
    NOT_SUFFICIENT_FUNDS(21512, "还款失败余额不足"),
    REPAY_TIME_UNVALID(21516, "抱歉，日终清算中，暂时不能还款，请稍后再试"),

    SIGN_ERROR(30001, "签名错误"),

    FLOW_CONTROL_IS_CLOSE(30000,"金额不足终止操作,请保证金额充足"),
    ;

    private int errorCode;
    private String errorMsg;

    private CommonRetCodeEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private CommonRetCodeEnum(int errorCode){
        this.errorCode = errorCode;
        this.errorMsg = getMsgByCode(errorCode);
    }

    public String getMsgByCode(int errorCode){
        CommonRetCodeEnum[] values = CommonRetCodeEnum.values();
        for (CommonRetCodeEnum e:values) {
            int Code = e.getErrorCode();
            if (Code==errorCode){
                String errorMsg = e.getErrorMsg();
                return errorMsg;
            }
        }
        return "";
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }
}
