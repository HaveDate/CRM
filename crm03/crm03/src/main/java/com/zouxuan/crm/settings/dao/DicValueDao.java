package com.zouxuan.crm.settings.dao;

import com.zouxuan.crm.settings.domain.DicValue;

import java.util.List;

public interface DicValueDao {
    List<DicValue> getListByCode(String code);
}
