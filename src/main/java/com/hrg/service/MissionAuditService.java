package com.hrg.service;

import com.hrg.model.MissionAudit;
import com.hrg.model.MissionAuditCriteria;

import java.util.List;

/**
 * Created by 82705 on 2017/7/21.
 */
public interface MissionAuditService {

    /**
     * 查询集合
     * @param example
     * @return
     * @throws Exception
     */
    List<MissionAudit> selectList(MissionAuditCriteria example) throws Exception;

    /**
     * 修改
     * @param missionAudit
     * @param example
     * @return
     * @throws Exception
     */
    boolean update(MissionAudit missionAudit,MissionAuditCriteria example) throws Exception;

    /**
     * 查条数
     * @param example
     * @return
     * @throws Exception
     */
    int count (MissionAuditCriteria example) throws Exception;
}
