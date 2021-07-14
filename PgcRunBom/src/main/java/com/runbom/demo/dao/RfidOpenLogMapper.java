package com.runbom.demo.dao;

import com.runbom.demo.model.RfidOpenLog;

public interface RfidOpenLogMapper {
    int deleteByPrimaryKey(String execid);

    int insert(RfidOpenLog record);

    int insertSelective(RfidOpenLog record);

    RfidOpenLog selectByPrimaryKey(String execid);

    int updateByPrimaryKeySelective(RfidOpenLog record);

    int updateByPrimaryKey(RfidOpenLog record);
}