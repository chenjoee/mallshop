package io.github.mizhicn.mallshop.pruduct.api;

import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrPageDTO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrUpdateDTO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrValueBO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrValueAddDTO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrValueUpdateDTO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrPageBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrSimpleBO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrAddDTO;

import java.util.List;

public interface ProductAttrService {

    /**
     * 分页获取产品属性
     */
    ProductAttrPageBO getProductAttrPage(ProductAttrPageDTO productAttrPageDTO);

    /**
     * 获取商品属性
     * @return
     */
    List<ProductAttrSimpleBO> getProductAttrList();

    ProductAttrBO addProductAttr(Integer adminId, ProductAttrAddDTO productAttrAddDTO);

    Boolean updateProductAttr(Integer adminId, ProductAttrUpdateDTO productAttrUpdateDTO);

    Boolean updateProductAttrStatus(Integer adminId, Integer productAttrId, Integer status);

    ProductAttrValueBO addProductAttrValue(Integer adminId, ProductAttrValueAddDTO productAttrValueAddDTO);

    Boolean updateProductAttrValue(Integer adminId, ProductAttrValueUpdateDTO productAttrValueUpdateDTO);

    Boolean updateProductAttrValueStatus(Integer adminId, Integer productAttrValueId, Integer status);



}
