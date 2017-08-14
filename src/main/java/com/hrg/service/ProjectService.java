package com.hrg.service;

import com.hrg.model.*;
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
    boolean insert(Project project, List<ProjectAudit> projectAudit,List<ProjectRelDepartment> projectRelDepartments) throws Exception;

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
    PageUtil<Project> selectByExample(ProjectCriteria example, PageUtil pageUtil) throws Exception;

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

    /**
     * 查询员工拥有的项目
     * @param workerdataid
     * @return
     * @throws Exception
     */
    List<Project> selectByWorker(String workerdataid)throws Exception;

    /**
     *查询登录人的待审核任务
     * @param auditId
     * @return
     * @throws Exception
     */
    List<Map> selectProjectAudit(String auditId)throws Exception;

    /**
     * 审核详情
     * @param projectId
     * @return
     */
    List<Map> selectByExample(String projectId);

    /**
     * 根据状态和项目ID 查询个数
     * @param map
     * @return
     */
    int selectAuditInt(Map map);

    /**
     * 根据状态和项目ID 查询个数
     * @param map
     * @return
     */
    int selectAuditDelInt(Map map);

    /**
     * 修改项目审核状态
     * @return
     */
    int updateByPrimaryKeySelective(ProjectAudit projectAudit);

    //删除时复制到删除审核表使用
    int copy(String prodataid);
    int updateByPrimaryKeySelective(ProjectAuditDel projectAuditDel);

    void insertDataTable(Map map);

    /**
     * 查询项目周报
     * @param example
     * @return
     * @throws Exception
     */
    List<Project> selectProjectReport(ProjectCriteria example) throws Exception;

    /**
     * 新增项目周报
     * @param projectid
     * @param projectWeekReport
     * @return
     * @throws Exception
     */
    boolean insertReport(String projectid,ProjectWeekReport projectWeekReport) throws Exception;

    /**
     * 修改项目周报
     * @param projectWeekReport
     * @return
     * @throws Exception
     */
    boolean updateReport(ProjectWeekReport projectWeekReport) throws Exception;

    /**
     * 查询周报详情
     * @param dataid
     * @return
     * @throws Exception
     */
    ProjectWeekReport selectReportdetail(String dataid) throws Exception;

    /**
     * 查询个人项目进度列表
     * @param workerdataid
     * @return
     * @throws Exception
     */
    List<ProjectWeekReport> selectReportList(String workerdataid) throws Exception;

    /**
     * 查询员工有效项目
     * @param workerdataid
     * @return
     * @throws Exception
     */
    List<Project> selectProjectListByworker(String workerdataid) throws Exception;
}
