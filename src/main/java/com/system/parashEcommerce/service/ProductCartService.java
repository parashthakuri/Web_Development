package com.system.parashEcommerce.service;

import com.system.parashEcommerce.entity.ProductCart;
import com.system.parashEcommerce.pojo.ProductCartPojo;

import java.util.List;

public interface ProductCartService {
    List<ProductCart> fetchAll();

    ProductCartPojo save(ProductCartPojo productCartPojo);

    ProductCart fetchOne(Integer id);

    void deleteFromCart(Integer id);

    String updateQuantity(ProductCart productCart);

    List<ProductCart> fetchAll(Integer id);
}
