package io.github.mizhicn.mallshop.pruduct.convert;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailBO;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper()
public interface ProductAttrConvertService {

    ProductAttrConvertService INSTANCE = Mappers.getMapper(ProductAttrConvertService.class);

    @Mappings({})
    ProductAttrDetailBO convert(ProductAttrDO productAttrDO);


    //DOS - > BOS
    @Mappings({})
    List<ProductAttrDetailBO> convert(List<ProductAttrDO> productAttrDOS);

}
