package com.hrg.service;

import com.hrg.model.Workdata;
import com.hrg.model.WorkdataCriteria;
import com.hrg.util.PageUtil;

/**
 * Created by 82705 on 2017/6/2.
 */
public interface WorkDataService {

    /**
     * 添加工作日志
     * @param workdata
     * @return
     * @throws Exception
     */
    boolean insert(Workdata workdata) throws Exception;

    /**
     * 分页查询
     * @param example 条件实体
     * @param pageUtil 分页实体
     * @return
     * @throws Exception
     */
    PageUtil<Workdata> selectByExample(WorkdataCriteria example, PageUtil pageUtil) throws Exception;
}
