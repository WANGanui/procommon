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

    /**
     * 是否已读（0未读1已读）
     */
    public static final String ISREAD = "isread";

    /**
     * 是否已读（0未读1已读）
     */
    private String isread;

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

    /**
     * @return isread
     *         是否已读（0未读1已读）
     */
    public String getIsread() {
        return isread;
    }

    /**
     * @param isread
     *         是否已读（0未读1已读）
     */
    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }
}