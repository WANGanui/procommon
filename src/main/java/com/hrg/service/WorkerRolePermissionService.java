package com.hrg.service;

import com.hrg.model.WorkerRolePermission;

import java.util.List;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface WorkerRolePermissionService {
    /**
     * 方法说明：根据角色ID集合查询角色权限
     * @Author 王向涛 2016-11-15 09:37:54
     * @param roledataidlist
     * @return
     */
    List<WorkerRolePermission> selectRolesPermission(List<String> roledataidlist) throws Exception;

    /**
     * 方法说明：根据角色ID查询角色权限
     * @Author 王向涛 2016-12-07 11:05:28
     * @param warehouseroledataid 库房角色dataid
     * @return
     * @throws Exception
     */
    List<WorkerRolePermission>  selectRoleByRoledataid(String warehouseroledataid) throws Exception;
}
