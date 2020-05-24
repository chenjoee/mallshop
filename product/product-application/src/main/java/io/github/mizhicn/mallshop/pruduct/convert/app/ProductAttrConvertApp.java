package io.github.mizhicn.mallshop.pruduct.convert.app;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrPageBO;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductAttrPageVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ProductAttrConvertApp {

    ProductAttrConvertApp INSTANCE = Mappers.getMapper(ProductAttrConvertApp.class);

    //分页查询 结果BO -> VO
    @Mappings({})
    UserProductAttrPageVO convert(ProductAttrPageBO productAttrPageBO);



}
