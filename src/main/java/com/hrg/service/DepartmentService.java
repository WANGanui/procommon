package com.hrg.service;

import com.hrg.model.Department;
import com.hrg.model.DepartmentCriteria;
import com.hrg.util.PageUtil;

import java.util.List;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface DepartmentService {

    /**
     * 添加部门
     * @param department
     * @return
     * @throws Exception
     */
    boolean insert(Department department) throws Exception;

    /**
     * 修改部门信息
     * @param department
     * @return
     * @throws Exception
     */
    boolean update(Department department) throws Exception;

    /**
     * 分页查询
     * @param example 条件实体
     * @param pageUtil 分页条件
     * @return
     * @throws Exception
     */
    PageUtil<Department> selectByExample(DepartmentCriteria example, PageUtil pageUtil)throws Exception;

    /**
     * 查询集合
     * @param example 条件实体
     * @return
     * @throws Exception
     */
    List<Department> selectList(DepartmentCriteria example) throws Exception;
}
