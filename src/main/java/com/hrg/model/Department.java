package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_department
 */
public class Department implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 部门名称
     */
    public static final String NAME = "name";

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门负责人
     */
    public static final String LEADER = "leader";

    /**
     * 部门负责人
     */
    private String leader;

    /**
     * 部门电话
     */
    public static final String PHONE = "phone";

    /**
     * 部门电话
     */
    private String phone;

    /**
     * 备注
     */
    public static final String REMARK = "remark";

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    public static final String STATE = "state";

    /**
     * 状态
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
     *         部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         部门名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return leader
     *         部门负责人
     */
    public String getLeader() {
        return leader;
    }

    /**
     * @param leader
     *         部门负责人
     */
    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    /**
     * @return phone
     *         部门电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *         部门电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
     * @return state
     *         状态
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *         状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}