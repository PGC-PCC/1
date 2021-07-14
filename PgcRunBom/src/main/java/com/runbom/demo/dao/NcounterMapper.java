package com.runbom.demo.dao;

import com.runbom.demo.model.Ncounter;

public interface NcounterMapper {
    int deleteByPrimaryKey(String id);

    int insert(Ncounter record);

    int insertSelective(Ncounter record);

    Ncounter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Ncounter record);

    int updateByPrimaryKey(Ncounter record);
}