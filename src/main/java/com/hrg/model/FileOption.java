package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_file_option
 */
public class FileOption implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 文件id
     */
    public static final String FILEID = "fileid";

    /**
     * 文件id
     */
    private String fileid;

    /**
     * 是否已读(0未读 1已读)
     */
    public static final String ISREAD = "isread";

    /**
     * 是否已读(0未读 1已读)
     */
    private String isread;

    /**
     * 员工id
     */
    public static final String WORKERID = "workerid";

    /**
     * 员工id
     */
    private String workerid;

    /**
     * 员工名称
     */
    public static final String WORKERNAME = "workername";

    /**
     * 员工名称
     */
    private String workername;

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
     * @return fileid
     *         文件id
     */
    public String getFileid() {
        return fileid;
    }

    /**
     * @param fileid
     *         文件id
     */
    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    /**
     * @return isread
     *         是否已读(0未读 1已读)
     */
    public String getIsread() {
        return isread;
    }

    /**
     * @param isread
     *         是否已读(0未读 1已读)
     */
    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
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
     * @return workername
     *         员工名称
     */
    public String getWorkername() {
        return workername;
    }

    /**
     * @param workername
     *         员工名称
     */
    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }
}