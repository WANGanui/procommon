package com.hrg.service;

import com.hrg.model.Mission;
import com.hrg.model.Worker;

import java.util.List;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface MissionService {

    /**
     * 根据员工id查询员工任务列表
     * @param workerdataid 员工id
     * @param state 任务状态
     * @return
     * @throws Exception
     */
    List<Mission> selectListByWorker(String workerdataid,String state) throws Exception;

    /**
     * 根据项目id查询任务列表
     * @param prodataid 项目id
     * @param state 状态
     * @return
     * @throws Exception
     */
    List<Mission> selectListByProject(String prodataid,String state) throws Exception;

    /**
     * 根据主键查询任务详情
     * @param dataid
     * @return
     * @throws Exception
     */
    Mission selectDetailById(String dataid) throws Exception;

    /**
     * 创建任务
     * @param mission 任务实体
     * @param worker 创建人实体
     * @return
     * @throws Exception
     */
    boolean insert(Mission mission, Worker worker) throws Exception;

    /**
     * 修改任务
     * @param mission 任务实体
     * @param worker 修改人实体
     * @return
     * @throws Exception
     */
    boolean update(Mission mission,Worker worker) throws Exception;
    
}
