package com.system.parashEcommerce.service;

import com.system.parashEcommerce.entity.Queries;
import com.system.parashEcommerce.pojo.QueriesPojo;

import java.util.List;

public interface QueryService {
    List<Queries> fetchAll();

    String save(QueriesPojo queriesPojo);
}
