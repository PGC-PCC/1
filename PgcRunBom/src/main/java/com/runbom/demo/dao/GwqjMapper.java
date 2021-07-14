package com.runbom.demo.dao;

import com.runbom.demo.model.Gwqj;

public interface GwqjMapper {
    int deleteByPrimaryKey(String id);

    int insert(Gwqj record);

    int insertSelective(Gwqj record);

    Gwqj selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Gwqj record);

    int updateByPrimaryKey(Gwqj record);
}