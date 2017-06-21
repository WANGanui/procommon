package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_notice
 */
public class Notice implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 创建时间
     */
    public static final String CREATETIME = "createtime";

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 公告内容
     */
    public static final String CONTEXT = "context";

    /**
     * 公告内容
     */
    private String context;

    /**
     * 发布人
     */
    public static final String WORKER = "worker";

    /**
     * 发布人
     */
    private String worker;

    /**
     * 发布部门
     */
    public static final String DEPARTMENT = "department";

    /**
     * 发布部门
     */
    private String department;

    /**
     * 发布人id
     */
    public static final String WORKERDATAID = "workerdataid";

    /**
     * 发布人id
     */
    private String workerdataid;

    /**
     * 发布部门id
     */
    public static final String DEPARTMENTDATAID = "departmentdataid";

    /**
     * 发布部门id
     */
    private String departmentdataid;

    /**
     * 发布日期
     */
    public static final String TIME = "time";

    /**
     * 发布日期
     */
    private Date time;

    /**
     * 公告标题
     */
    public static final String TITLE = "title";

    /**
     * 公告标题
     */
    private String title;

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
     * @return createtime
     *         创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     *         创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return context
     *         公告内容
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context
     *         公告内容
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * @return worker
     *         发布人
     */
    public String getWorker() {
        return worker;
    }

    /**
     * @param worker
     *         发布人
     */
    public void setWorker(String worker) {
        this.worker = worker == null ? null : worker.trim();
    }

    /**
     * @return department
     *         发布部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     *         发布部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * @return workerdataid
     *         发布人id
     */
    public String getWorkerdataid() {
        return workerdataid;
    }

    /**
     * @param workerdataid
     *         发布人id
     */
    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    /**
     * @return departmentdataid
     *         发布部门id
     */
    public String getDepartmentdataid() {
        return departmentdataid;
    }

    /**
     * @param departmentdataid
     *         发布部门id
     */
    public void setDepartmentdataid(String departmentdataid) {
        this.departmentdataid = departmentdataid == null ? null : departmentdataid.trim();
    }

    /**
     * @return time
     *         发布日期
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     *         发布日期
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return title
     *         公告标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *         公告标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}