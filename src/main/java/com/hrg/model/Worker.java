package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_worker
 */
public class Worker implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 姓名
     */
    public static final String NAME = "name";

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    public static final String PHONE = "phone";

    /**
     * 电话
     */
    private String phone;

    /**
     * 部门
     */
    public static final String DEPARTMENT = "department";

    /**
     * 部门
     */
    private String department;

    /**
     * 备注
     */
    public static final String REMARK = "remark";

    /**
     * 备注
     */
    private String remark;

    /**
     * 账号
     */
    public static final String ACCOUNT = "account";

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    public static final String PASSWORD = "password";

    /**
     * 密码
     */
    private String password;

    /**
     * 部门id
     */
    public static final String DEPARTMENTDATAID = "departmentdataid";

    /**
     * 部门id
     */
    private String departmentdataid;

    /**
     * 状态
     *             
     */
    public static final String STATE = "state";

    /**
     * 状态
     *             
     */
    private String state;

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
     * @return name
     *         姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return phone
     *         电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *         电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return department
     *         部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     *         部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * @return remark
     *         备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     *         备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return account
     *         账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     *         账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * @return password
     *         密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *         密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return departmentdataid
     *         部门id
     */
    public String getDepartmentdataid() {
        return departmentdataid;
    }

    /**
     * @param departmentdataid
     *         部门id
     */
    public void setDepartmentdataid(String departmentdataid) {
        this.departmentdataid = departmentdataid == null ? null : departmentdataid.trim();
    }

    /**
     * @return state
     *         状态
     *                     
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *         状态
     *                     
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}