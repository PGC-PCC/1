package com.runbom.demo.dao;

import com.runbom.demo.model.Ndemand;

public interface NdemandMapper {
    int deleteByPrimaryKey(String id);

    int insert(Ndemand record);

    int insertSelective(Ndemand record);

    Ndemand selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Ndemand record);

    int updateByPrimaryKey(Ndemand record);
}