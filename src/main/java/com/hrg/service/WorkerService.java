package com.hrg.service;

import com.hrg.model.Worker;

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

}
