package com.hrg.service;

import com.hrg.model.Notice;
import com.hrg.model.NoticeCriteria;
import com.hrg.model.NoticeRelWorker;
import com.hrg.util.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by 82705 on 2017/6/1.
 */
public interface NoticeService {

    /**
     * 添加公告
     * @param notice 公告实体
     * @return
     * @throws Exception
     */
    boolean insert(Notice notice) throws Exception;

    /**
     * 修改公告
     * @param notice 公告实体
     * @return
     * @throws Exception
     */
    boolean update(Notice notice) throws Exception;

    /**
     * 删除公告
     * @param dataid 主键
     * @return
     * @throws Exception
     */
    boolean delete(String dataid) throws Exception;

    /**
     * 分页条件查询
     * @param example 条件实体
     * @param pageUtil 分页条件
     * @return
     * @throws Exception
     */
    PageUtil selectByExample(NoticeCriteria example, PageUtil pageUtil) throws Exception;

    /**
     * 公告列表
     * @param example
     * @return
     */
    List<Notice> selectList(NoticeCriteria example) throws Exception;

    /**
     * 详情
     * @param dataid
     * @return
     * @throws Exception
     */
    Notice selectDetail(String dataid) throws Exception;

    /**
     * 查询公告列表
     * @param map
     * @return
     * @throws Exception
     */
    List<Map> selectNoticeWork(Map map)  throws Exception;
    /**
     * 修改公告阅读表
     * @param map
     * @return
     * @throws Exception
     */
    int updateStatusNoticeRelWorker(NoticeRelWorker map)  throws Exception;


}
