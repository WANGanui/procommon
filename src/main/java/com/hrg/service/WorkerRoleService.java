package com.hrg.service;

import com.hrg.model.WorkerRole;

import java.util.List;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface WorkerRoleService {

    /**
     * 方法说明：查询员工角色
     * @param workerdataid 员工主键
     * @return
     * @throws Exception
     */
    List<WorkerRole> selectDetail(String workerdataid) throws Exception;
}
