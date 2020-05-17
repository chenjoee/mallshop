package io.github.mizhicn.mallshop.pruduct.api;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;

import java.util.List;

public interface ProductCategoryService {

    List<ProductCategoryBO> getListByPid(Integer pid);






}
