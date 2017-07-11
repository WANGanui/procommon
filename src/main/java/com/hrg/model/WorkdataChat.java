package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_workdata_chat
 */
public class WorkdataChat implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private Integer dataid;

    /**
     * 员工id
     */
    public static final String WORKERID = "workerid";

    /**
     * 员工id
     */
    private String workerid;

    /**
     * 评论人id
     */
    public static final String CHATID = "chatid";

    /**
     * 评论人id
     */
    private String chatid;

    /**
     * 评论人姓名
     */
    public static final String CHATNAME = "chatname";

    /**
     * 评论人姓名
     */
    private String chatname;

    /**
     * 评论内容
     */
    public static final String CONTEXT = "context";

    /**
     * 评论内容
     */
    private String context;

    /**
     * 日志id
     */
    public static final String WORKDATAID = "workdataid";

    /**
     * 日志id
     */
    private String workdataid;

    private static final long serialVersionUID = 1L;

    /**
     * @return dataid
     *         dataid
     */
    public Integer getDataid() {
        return dataid;
    }

    /**
     * @param dataid
     *         dataid
     */
    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    /**
     * @return workerid
     *         员工id
     */
    public String getWorkerid() {
        return workerid;
    }

    /**
     * @param workerid
     *         员工id
     */
    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    /**
     * @return chatid
     *         评论人id
     */
    public String getChatid() {
        return chatid;
    }

    /**
     * @param chatid
     *         评论人id
     */
    public void setChatid(String chatid) {
        this.chatid = chatid == null ? null : chatid.trim();
    }

    /**
     * @return chatname
     *         评论人姓名
     */
    public String getChatname() {
        return chatname;
    }

    /**
     * @param chatname
     *         评论人姓名
     */
    public void setChatname(String chatname) {
        this.chatname = chatname == null ? null : chatname.trim();
    }

    /**
     * @return context
     *         评论内容
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context
     *         评论内容
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * @return workdataid
     *         日志id
     */
    public String getWorkdataid() {
        return workdataid;
    }

    /**
     * @param workdataid
     *         日志id
     */
    public void setWorkdataid(String workdataid) {
        this.workdataid = workdataid == null ? null : workdataid.trim();
    }
}