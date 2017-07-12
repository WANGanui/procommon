package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_workdata
 */
public class Workdata implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 项目编号
     */
    public static final String PROJECTDATAID = "projectdataid";

    /**
     * 项目编号
     */
    private String projectdataid;

    /**
     * 项目名称
     */
    public static final String PROJECTNAME = "projectname";

    /**
     * 项目名称
     */
    private String projectname;

    /**
     * 任务编号
     */
    public static final String MISSIONDATAID = "missiondataid";

    /**
     * 任务编号
     */
    private String missiondataid;

    /**
     * 任务名称
     */
    public static final String MISSIONNAME = "missionname";

    /**
     * 任务名称
     */
    private String missionname;

    /**
     * 工作内容
     */
    public static final String WORKCONTEXT = "workcontext";

    /**
     * 工作内容
     */
    private String workcontext;

    /**
     * 员工编号
     */
    public static final String WORKERDATAID = "workerdataid";

    /**
     * 员工编号
     */
    private String workerdataid;

    /**
     * 员工姓名
     */
    public static final String WORKERNAME = "workername";

    /**
     * 员工姓名
     */
    private String workername;

    /**
     * 日期
     */
    public static final String TIME = "time";

    /**
     * 日期
     */
    private Date time;

    /**
     * 项目负责人
     */
    public static final String PROJECTLEADER = "projectleader";

    /**
     * 项目负责人
     */
    private String projectleader;

    /**
     * 是否已阅读（0否1是）
     */
    public static final String ISREAD = "isread";

    /**
     * 是否已阅读（0否1是）
     */
    private String isread;

    public static final String CHAT = "chat";

    private String chat;

    public static final String COUNT = "count";

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

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
     * @return projectdataid
     *         项目编号
     */
    public String getProjectdataid() {
        return projectdataid;
    }

    /**
     * @param projectdataid
     *         项目编号
     */
    public void setProjectdataid(String projectdataid) {
        this.projectdataid = projectdataid == null ? null : projectdataid.trim();
    }

    /**
     * @return projectname
     *         项目名称
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * @param projectname
     *         项目名称
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    /**
     * @return missiondataid
     *         任务编号
     */
    public String getMissiondataid() {
        return missiondataid;
    }

    /**
     * @param missiondataid
     *         任务编号
     */
    public void setMissiondataid(String missiondataid) {
        this.missiondataid = missiondataid == null ? null : missiondataid.trim();
    }

    /**
     * @return missionname
     *         任务名称
     */
    public String getMissionname() {
        return missionname;
    }

    /**
     * @param missionname
     *         任务名称
     */
    public void setMissionname(String missionname) {
        this.missionname = missionname == null ? null : missionname.trim();
    }

    /**
     * @return workcontext
     *         工作内容
     */
    public String getWorkcontext() {
        return workcontext;
    }

    /**
     * @param workcontext
     *         工作内容
     */
    public void setWorkcontext(String workcontext) {
        this.workcontext = workcontext == null ? null : workcontext.trim();
    }

    /**
     * @return workerdataid
     *         员工编号
     */
    public String getWorkerdataid() {
        return workerdataid;
    }

    /**
     * @param workerdataid
     *         员工编号
     */
    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    /**
     * @return workername
     *         员工姓名
     */
    public String getWorkername() {
        return workername;
    }

    /**
     * @param workername
     *         员工姓名
     */
    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    /**
     * @return time
     *         日期
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     *         日期
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return projectleader
     *         项目负责人
     */
    public String getProjectleader() {
        return projectleader;
    }

    /**
     * @param projectleader
     *         项目负责人
     */
    public void setProjectleader(String projectleader) {
        this.projectleader = projectleader == null ? null : projectleader.trim();
    }

    /**
     * @return isread
     *         是否已阅读（0否1是）
     */
    public String getIsread() {
        return isread;
    }

    /**
     * @param isread
     *         是否已阅读（0否1是）
     */
    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }
}