package com.runbom.demo.dao;

import com.runbom.demo.model.Fanlage;

public interface FanlageMapper {
    int deleteByPrimaryKey(String id);

    int insert(Fanlage record);

    int insertSelective(Fanlage record);

    Fanlage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Fanlage record);

    int updateByPrimaryKey(Fanlage record);
}