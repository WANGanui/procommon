package com.hrg.enums;

/**
 * Created by 82705 on 2017/5/26.
 */
public enum  ErrorCode {
    SUCCESS("0", "成功"),

    /** 未知异常 */
    UN_KNOWN_EXCEPTION("00001", "未知异常"),

    /** 系统异常 */
    SYSTEM_EXCEPTION("00002", "系统异常"),

    /** 请求参数不完整 */
    INCOMPLETE_REQ_PARAM("00003", "请求参数不完整"),

    /** 参数不合法或不正确 */
    ILLEGALARGUMENT_EXCEPTION("00004", "参数不合法或不正确"),

    /** 数据库异常 */
    DATABASE_EXCEPTION("00005", "数据库异常"),

    /** 不存在该数据 */
    NOEXIST_DATA("00006", "不存在该数据"),

    /** 用户类型异常 */
    ACCOUNT_TYPE_EXCEPTION("00007", "用户类型异常"),

    /** 信息异常 */
    MESSAGE_EXCEPTION("00008", "信息异常"),

    /** 上传异常 */
    UPLOAD_EXCEPTION("00009", "上传异常"),

    /** 未登录异常 */
    NOT_LOGIN_EXCEPTION("00010", "未登录异常"),

    /**
     * 账号不存在"
     */
    ACCOUNT_NON_EXISTEND("00011","账号不存在"),

    /**
     * 密码错误
     */
    ACCOUNT_PASSWORD_ERROR("00012","密码错误"),

    /**
     * 没有权限
     */
    NO_PERMISSION("00013","没有此权限");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
private final String message;

    private ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
