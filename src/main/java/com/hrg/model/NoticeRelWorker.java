package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_notice_rel_worker
 */
public class NoticeRelWorker implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 公告id
     */
    public static final String NOTICEID = "noticeid";

    /**
     * 公告id
     */
    private String noticeid;

    /**
     * 员工id
     */
    public static final String WORKERID = "workerid";

    /**
     * 员工id
     */
    private String workerid;

    /**
     * 是否已读(0未读，1已读)
     */
    public static final String ISREAD = "isread";

    /**
     * 是否已读(0未读，1已读)
     */
    private String isread;

    private static final long serialVersionUID = 1L;

    /**
     * @return dataid
     *         dataid
     */
    public String getDataid() {
        return dataid;
    }

    /**
     * @param dataid
     *         dataid
     */
    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    /**
     * @return noticeid
     *         公告id
     */
    public String getNoticeid() {
        return noticeid;
    }

    /**
     * @param noticeid
     *         公告id
     */
    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
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
     * @return isread
     *         是否已读(0未读，1已读)
     */
    public String getIsread() {
        return isread;
    }

    /**
     * @param isread
     *         是否已读(0未读，1已读)
     */
    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }
}