package com.runbom.demo.dao;

import com.runbom.demo.model.BandFanlage;

public interface BandFanlageMapper {
    int deleteByPrimaryKey(String id);

    int insert(BandFanlage record);

    int insertSelective(BandFanlage record);

    BandFanlage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BandFanlage record);

    int updateByPrimaryKey(BandFanlage record);
}