package com.hrg.service;

import com.hrg.model.Module;
import com.hrg.model.ModuleCriteria;

import java.util.List;

/**
 * Created by 82705 on 2017/6/15.
 */
public interface ModuleService {

    List<Module> selectList(ModuleCriteria example) throws Exception;
}
