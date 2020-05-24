package io.github.mizhicn.mallshop.pruduct.convert.service;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductCategoryDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductCategoryConvert {

    ProductCategoryConvert INSTANCE = Mappers.getMapper(ProductCategoryConvert.class);


    @Mappings({})
    ProductCategoryBO convert(ProductCategoryDO productCategoryDO);


    @Mappings({})
    List<ProductCategoryBO> convert(List<ProductCategoryDO> productCategoryDOS);

}
