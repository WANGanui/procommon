package com.hrg.service;

import com.hrg.model.Notice;
import com.hrg.model.NoticeCriteria;
import com.hrg.util.PageUtil;

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
}
