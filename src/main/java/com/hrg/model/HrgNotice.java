package com.hrg.model;

import java.util.Date;

/**
 * Created by 82705 on 2017/5/31.
 */
public class HrgNotice {

    private String dataid;

    private String context;

    private Date craetetime;

    private String worker;

    private String workerdatatid;

    private String department;

    private String departmentdataid;

    private Date time;

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCraetetime() {
        return craetetime;
    }

    public void setCraetetime(Date craetetime) {
        this.craetetime = craetetime;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getWorkerdatatid() {
        return workerdatatid;
    }

    public void setWorkerdatatid(String workerdatatid) {
        this.workerdatatid = workerdatatid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentdataid() {
        return departmentdataid;
    }

    public void setDepartmentdataid(String departmentdataid) {
        this.departmentdataid = departmentdataid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
