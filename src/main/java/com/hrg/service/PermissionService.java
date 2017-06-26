package com.hrg.service;

import com.hrg.model.Module;
import com.hrg.model.ModuleRelPermission;

import java.util.List;

/**
 * Created by 82705 on 2017/6/26.
 */
public interface PermissionService {

    /**
     * 查询操作权限
     * @param moduleid
     * @param permissionid
     * @return
     * @throws Exception
     */
    List<String> selectList(String moduleid,String permissionid) throws Exception;
}
