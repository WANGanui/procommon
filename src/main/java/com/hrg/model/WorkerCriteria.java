package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class WorkerCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String name;

    protected String nameMin;

    protected String nameMax;

    protected List<String> nameList;

    protected String phone;

    protected String phoneMin;

    protected String phoneMax;

    protected List<String> phoneList;

    protected String department;

    protected String departmentMin;

    protected String departmentMax;

    protected List<String> departmentList;

    protected String remark;

    protected String remarkMin;

    protected String remarkMax;

    protected List<String> remarkList;

    protected String account;

    protected String accountMin;

    protected String accountMax;

    protected List<String> accountList;

    protected String password;

    protected String passwordMin;

    protected String passwordMax;

    protected List<String> passwordList;

    protected String departmentdataid;

    protected String departmentdataidMin;

    protected String departmentdataidMax;

    protected List<String> departmentdataidList;

    protected String state;

    protected String stateMin;

    protected String stateMax;

    protected List<String> stateList;

    private static final long serialVersionUID = 1L;

    public WorkerCriteria() {
         
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataidMin(String dataidMin) {
        this.dataidMin = dataidMin == null ? null : dataidMin.trim();
    }

    public String getDataidMin() {
        return dataidMin;
    }

    public void setDataidMax(String dataidMax) {
        this.dataidMax = dataidMax == null ? null : dataidMax.trim();
    }

    public String getDataidMax() {
        return dataidMax;
    }

    public void setDataidList(List<String> dataidList) {
        this.dataidList = dataidList;
    }

    public List<String> getDataidList() {
        return dataidList;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getName() {
        return name;
    }

    public void setNameMin(String nameMin) {
        this.nameMin = nameMin == null ? null : nameMin.trim();
    }

    public String getNameMin() {
        return nameMin;
    }

    public void setNameMax(String nameMax) {
        this.nameMax = nameMax == null ? null : nameMax.trim();
    }

    public String getNameMax() {
        return nameMax;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhoneMin(String phoneMin) {
        this.phoneMin = phoneMin == null ? null : phoneMin.trim();
    }

    public String getPhoneMin() {
        return phoneMin;
    }

    public void setPhoneMax(String phoneMax) {
        this.phoneMax = phoneMax == null ? null : phoneMax.trim();
    }

    public String getPhoneMax() {
        return phoneMax;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartmentMin(String departmentMin) {
        this.departmentMin = departmentMin == null ? null : departmentMin.trim();
    }

    public String getDepartmentMin() {
        return departmentMin;
    }

    public void setDepartmentMax(String departmentMax) {
        this.departmentMax = departmentMax == null ? null : departmentMax.trim();
    }

    public String getDepartmentMax() {
        return departmentMax;
    }

    public void setDepartmentList(List<String> departmentList) {
        this.departmentList = departmentList;
    }

    public List<String> getDepartmentList() {
        return departmentList;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemarkMin(String remarkMin) {
        this.remarkMin = remarkMin == null ? null : remarkMin.trim();
    }

    public String getRemarkMin() {
        return remarkMin;
    }

    public void setRemarkMax(String remarkMax) {
        this.remarkMax = remarkMax == null ? null : remarkMax.trim();
    }

    public String getRemarkMax() {
        return remarkMax;
    }

    public void setRemarkList(List<String> remarkList) {
        this.remarkList = remarkList;
    }

    public List<String> getRemarkList() {
        return remarkList;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccountMin(String accountMin) {
        this.accountMin = accountMin == null ? null : accountMin.trim();
    }

    public String getAccountMin() {
        return accountMin;
    }

    public void setAccountMax(String accountMax) {
        this.accountMax = accountMax == null ? null : accountMax.trim();
    }

    public String getAccountMax() {
        return accountMax;
    }

    public void setAccountList(List<String> accountList) {
        this.accountList = accountList;
    }

    public List<String> getAccountList() {
        return accountList;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPasswordMin(String passwordMin) {
        this.passwordMin = passwordMin == null ? null : passwordMin.trim();
    }

    public String getPasswordMin() {
        return passwordMin;
    }

    public void setPasswordMax(String passwordMax) {
        this.passwordMax = passwordMax == null ? null : passwordMax.trim();
    }

    public String getPasswordMax() {
        return passwordMax;
    }

    public void setPasswordList(List<String> passwordList) {
        this.passwordList = passwordList;
    }

    public List<String> getPasswordList() {
        return passwordList;
    }

    public void setDepartmentdataid(String departmentdataid) {
        this.departmentdataid = departmentdataid == null ? null : departmentdataid.trim();
    }

    public String getDepartmentdataid() {
        return departmentdataid;
    }

    public void setDepartmentdataidMin(String departmentdataidMin) {
        this.departmentdataidMin = departmentdataidMin == null ? null : departmentdataidMin.trim();
    }

    public String getDepartmentdataidMin() {
        return departmentdataidMin;
    }

    public void setDepartmentdataidMax(String departmentdataidMax) {
        this.departmentdataidMax = departmentdataidMax == null ? null : departmentdataidMax.trim();
    }

    public String getDepartmentdataidMax() {
        return departmentdataidMax;
    }

    public void setDepartmentdataidList(List<String> departmentdataidList) {
        this.departmentdataidList = departmentdataidList;
    }

    public List<String> getDepartmentdataidList() {
        return departmentdataidList;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getState() {
        return state;
    }

    public void setStateMin(String stateMin) {
        this.stateMin = stateMin == null ? null : stateMin.trim();
    }

    public String getStateMin() {
        return stateMin;
    }

    public void setStateMax(String stateMax) {
        this.stateMax = stateMax == null ? null : stateMax.trim();
    }

    public String getStateMax() {
        return stateMax;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

    public List<String> getStateList() {
        return stateList;
    }
}