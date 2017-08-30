package com.hrg.service;

import com.hrg.model.*;
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
    List<Mission> selectList(MissionCriteria example,Worker worker) throws Exception;
    List<Mission> selectList1(MissionCriteria example,Worker worker) throws Exception;
    List<Mission> selectList(MissionCriteria example) throws Exception;
    /**
     * 根据主键查询任务详情
     * @param dataid
     * @return
     * @throws Exception
     */
    Map<String,Object> selectDetailById(String dataid) throws Exception;

    /**
     * 任务实体
     * @param dataid
     * @return
     * @throws Exception
     */
    Mission selectDetail(String dataid) throws Exception;

    /**
     * 创建任务
     * @param mission 任务实体
     * @param workerList 任务人员集合
     * @return
     * @throws Exception
     */
    boolean insert(Mission mission, List<Worker> workerList, List<MissionAudit> auditList) throws Exception;

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

    /**
     * 任务进度详情
     * @param dataid
     * @return
     * @throws Exception
     */
    Map<String,Object> selectMissionJindu(String dataid) throws Exception;

    /**
     * 查询任务文件集合
     * @param example
     * @return
     * @throws Exception
     */
    List<MissionFile> selectMissionFileList(MissionFileCriteria example) throws Exception;

    /**
     * 添加文件
     * @param missionFile
     * @return
     * @throws Exception
     */
    boolean insert (MissionFile missionFile) throws Exception;

    /**
     * 查询任务文件
     * @param missionid
     * @return
     * @throws Exception
     */
    List<MissionFile> selectMissionFile(String missionid) throws Exception;

    /**
     * 查询项目文件
     * @param missionid
     * @return
     * @throws Exception
     */
    List<MissionFile> selectProjectFile(String missionid) throws Exception;

    /**
     * 查询文件实体
     * @param example
     * @return
     * @throws Exception
     */
    MissionFile selectFIle(MissionFileCriteria example) throws Exception;

    /**
     * 删除文件
     * @param dataid
     * @return
     * @throws Exception
     */
    boolean deleteFile(String dataid) throws Exception;

    /**
     * 查询列表文件
     * @param example
     * @return
     * @throws Exception
     */
    List<MissionFile> selectFileList(MissionFileCriteria example) throws Exception;

    /**
     * 是否已浏览
     * @param worker
     * @param fileid
     * @return
     * @throws Exception
     */
    boolean isread(Worker worker,String fileid) throws Exception;

    /**
     * 查询已读人员
     * @param example
     * @return
     * @throws Exception
     */
    List<FileOption> selectFileoption(FileOptionCriteria example) throws Exception;
}
