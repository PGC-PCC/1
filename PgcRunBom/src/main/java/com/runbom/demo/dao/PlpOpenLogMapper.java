package com.runbom.demo.dao;

import com.runbom.demo.model.PlpOpenLog;

public interface PlpOpenLogMapper {
    int deleteByPrimaryKey(String execid);

    int insert(PlpOpenLog record);

    int insertSelective(PlpOpenLog record);

    PlpOpenLog selectByPrimaryKey(String execid);

    int updateByPrimaryKeySelective(PlpOpenLog record);

    int updateByPrimaryKey(PlpOpenLog record);
}