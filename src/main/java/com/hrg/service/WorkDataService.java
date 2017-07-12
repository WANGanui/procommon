package com.hrg.service;

import com.hrg.model.Workdata;
import com.hrg.model.WorkdataChat;
import com.hrg.model.WorkdataChatCriteria;
import com.hrg.model.WorkdataCriteria;
import com.hrg.util.PageUtil;

import java.util.List;
import java.util.Map;

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

    /**
     * 员工工作详情(单周)
     * @return
     * @throws Exception
     */
    List<Workdata> selectList(WorkdataCriteria example, String dapartmentdataid) throws Exception;

    /**
     * 工作日志列表
     * @param example
     * @return
     * @throws Exception
     */
    List<Workdata> queryList(WorkdataCriteria example) throws Exception;

    /**
     *详情
     * @param dataid
     * @return
     * @throws Exception
     */
    Workdata selectDetail(String dataid) throws Exception;

    /**
     * 修改
     * @param workdata
     * @return
     * @throws Exception
     */
    boolean update(Workdata workdata) throws Exception;

    /**
     * 日志详情及其评论
     * @param workdataChatCriteria
     * @return
     */
    List<WorkdataChat> selectByExample(WorkdataChatCriteria workdataChatCriteria);

    /**
     * 添加评论
     * @param workdataChat
     * @return
     */
    int insert(WorkdataChat workdataChat);

    /**
     * 修改评论
     * @param record
     * @return
     */
    int updateByExampleSelective(Map record);
}
