package com.runbom.demo.dao;

import com.runbom.demo.model.Wdeduction;

public interface WdeductionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Wdeduction record);

    int insertSelective(Wdeduction record);

    Wdeduction selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Wdeduction record);

    int updateByPrimaryKey(Wdeduction record);
}