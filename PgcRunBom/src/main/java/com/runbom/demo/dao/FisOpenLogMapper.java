package com.runbom.demo.dao;

import com.runbom.demo.model.FisOpenLog;

public interface FisOpenLogMapper {
    int deleteByPrimaryKey(String execid);

    int insert(FisOpenLog record);

    int insertSelective(FisOpenLog record);

    FisOpenLog selectByPrimaryKey(String execid);

    int updateByPrimaryKeySelective(FisOpenLog record);

    int updateByPrimaryKey(FisOpenLog record);
}