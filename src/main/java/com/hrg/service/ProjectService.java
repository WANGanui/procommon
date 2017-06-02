package com.hrg.service;

import com.hrg.model.Project;
import com.hrg.model.ProjectCriteria;
import com.hrg.util.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface ProjectService {

    /**
     * 添加项目
     * @param project 项目实体
     * @return
     * @throws Exception
     */
    boolean insert(Project project) throws Exception;

    /**
     * 修改项目
     * @param project 项目实体
     * @return
     * @throws Exception
     */
    boolean update(Project project) throws Exception;

    /**
     * 分页条件查询
     * @param example 条件实体
     * @param pageUtil 分页条件
     * @return
     * @throws Exception
     */
    PageUtil<Project> selectByExample(ProjectCriteria example,PageUtil pageUtil) throws Exception;

    /**
     * 条件查询列表
     * @param example
     * @return
     * @throws Exception
     */
    List<Project> selectList(ProjectCriteria example) throws Exception;

    /**
     * 查询项目详情
     * @param datatid
     * @return
     * @throws Exception
     */
    Project selectDetail(String datatid)throws Exception;

    /**
     * 项目详情及以下任务
     * @param dataid
     * @return
     * @throws Exception
     */
    Map<String, Object> selectProjectDetail(String dataid)throws Exception;
}
