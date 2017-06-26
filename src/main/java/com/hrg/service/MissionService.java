package com.hrg.service;

import com.hrg.model.Mission;
import com.hrg.model.MissionCriteria;
import com.hrg.model.Worker;
import com.hrg.util.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface MissionService {

    /**
     * 条件查询任务列表
     * @param example 条件实体
     * @return
     * @throws Exception
     */
    List<Mission> selectList(MissionCriteria example) throws Exception;

    /**
     * 根据主键查询任务详情
     * @param dataid
     * @return
     * @throws Exception
     */
    Map<String,Object> selectDetailById(String dataid) throws Exception;

    /**
     * 创建任务
     * @param mission 任务实体
     * @param workerList 任务人员集合
     * @return
     * @throws Exception
     */
    boolean insert(Mission mission, List<Worker> workerList) throws Exception;

    /**
     * 修改任务
     * @param mission 任务实体
     * @param workerList 任务人员集合
     * @return
     * @throws Exception
     */
    boolean update(Mission mission,List<Worker> workerList) throws Exception;

    /**
     * 分页查询任务列表（）
     * @param example 条件实体
     * @param pageUtil 分页实体
     * @return
     * @throws Exception
     */
    PageUtil<Mission> selectByExample(MissionCriteria example, PageUtil pageUtil) throws Exception;

    /**
     *
     * @param example
     * @return
     * @throws Exception
     */
    Map<String,Object> slectWorkerMission(MissionCriteria example,String wokerdataid) throws Exception;

    /**
     *
     * @param example
     * @return
     * @throws Exception
     */
    Map<String,Object> slectMissionBylevel(MissionCriteria example) throws Exception;

    /**
     * 根据主键删除任务
     * @param dataid
     * @return
     * @throws Exception
     */
    boolean deleteMission(String dataid) throws Exception;

    /**
     * 修改状态
     * @return
     * @throws Exception
     */
    boolean updateState(Mission mission) throws Exception;
}
