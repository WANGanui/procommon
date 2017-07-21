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
}
