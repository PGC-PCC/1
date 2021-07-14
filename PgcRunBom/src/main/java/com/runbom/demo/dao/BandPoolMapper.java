package com.runbom.demo.dao;

import com.runbom.demo.model.BandPool;

public interface BandPoolMapper {
    int insert(BandPool record);

    int insertSelective(BandPool record);
}