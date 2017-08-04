package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_mission_file
 */
public class MissionFile implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 原名称
     */
    public static final String NAMEOLD = "nameold";

    /**
     * 原名称
     */
    private String nameold;

    /**
     * 新名称
     */
    public static final String NAMENEW = "namenew";

    /**
     * 新名称
     */
    private String namenew;

    /**
     * 路径
     */
    public static final String PATH = "path";

    /**
     * 路径
     */
    private String path;

    /**
     * 任务ID
     */
    public static final String MISSIONID = "missionid";

    /**
     * 任务ID
     */
    private String missionid;

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
     * @return nameold
     *         原名称
     */
    public String getNameold() {
        return nameold;
    }

    /**
     * @param nameold
     *         原名称
     */
    public void setNameold(String nameold) {
        this.nameold = nameold == null ? null : nameold.trim();
    }

    /**
     * @return namenew
     *         新名称
     */
    public String getNamenew() {
        return namenew;
    }

    /**
     * @param namenew
     *         新名称
     */
    public void setNamenew(String namenew) {
        this.namenew = namenew == null ? null : namenew.trim();
    }

    /**
     * @return path
     *         路径
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     *         路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * @return missionid
     *         任务ID
     */
    public String getMissionid() {
        return missionid;
    }

    /**
     * @param missionid
     *         任务ID
     */
    public void setMissionid(String missionid) {
        this.missionid = missionid == null ? null : missionid.trim();
    }
}