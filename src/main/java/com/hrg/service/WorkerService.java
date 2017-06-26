package com.hrg.service;

import com.hrg.model.Worker;
import com.hrg.model.WorkerCriteria;
import com.hrg.model.WorkerRole;
import com.hrg.util.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface WorkerService {

    /**
     * 方法说明：根据员工账号查询员工对象
     * @param account 账号
     * @return
     * @throws Exception
     */
    Worker getWorkerInfo(String account) throws Exception;

    /**
     * 方法说明：根据账号获取密码
     * @param account 账号
     * @return
     * @throws Exception
     */
    String getWorkerPassWord(String account) throws Exception;

    /**
     * 分页查询员工列表
     * @param example 条件实体
     * @param pageUtil 分页条件
     * @return
     * @throws Exception
     */
    PageUtil<Worker> selectByExample(WorkerCriteria example, PageUtil pageUtil) throws Exception;

    /**
     * 查询员工详情及未完成任务
     * @param workerdataid
     * @return
     * @throws Exception
     */
    Map<String, Object> selectMissionDetail(String workerdataid)throws Exception;

    /**
     * 查询员工工作日志详情
     * @param workdataid
     * @return
     * @throws Exception
     */
    Map<String, Object> selectWorkdataDetail(String workdataid) throws Exception;

    /**
     * 添加员工
     * @param worker
     * @return
     * @throws Exception
     */
    boolean insert(Worker worker, String roledattaid) throws Exception;

    /**
     * 根据id查询对象
     * @param dataid
     * @return
     * @throws Exception
     */
    Worker selectDetail(String dataid) throws Exception;

    /**
     * 修改员工信息
     * @param worker
     * @return
     * @throws Exception
     */
    boolean update(Worker worker) throws Exception;

    /**
     * 查询员工模块和权限
     * @param workerdataid
     * @return
     * @throws Exception
     */
    Map<String,Object> selectModuleAndPermission(String workerdataid) throws Exception;

    /**
     * 查询列表
     * @param example
     * @return
     * @throws Exception
     */
    List<Worker> selectList(WorkerCriteria example) throws Exception;

    /**
     * 查询所有角色和部门
     * @return
     * @throws Exception
     */
    Map<String,Object> selectRoleAndPartment() throws Exception;
}
