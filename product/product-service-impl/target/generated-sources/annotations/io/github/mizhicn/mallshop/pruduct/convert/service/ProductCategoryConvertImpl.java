package io.github.mizhicn.mallshop.pruduct.convert.service;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductCategoryDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-19T23:03:16+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_242 (Private Build)"
)
public class ProductCategoryConvertImpl implements ProductCategoryConvert {

    @Override
    public ProductCategoryBO convert(ProductCategoryDO productCategoryDO) {
        if ( productCategoryDO == null ) {
            return null;
        }

        ProductCategoryBO productCategoryBO = new ProductCategoryBO();

        productCategoryBO.setId( productCategoryDO.getId() );
        productCategoryBO.setPid( productCategoryDO.getPid() );
        productCategoryBO.setName( productCategoryDO.getName() );
        productCategoryBO.setDescription( productCategoryDO.getDescription() );
        productCategoryBO.setPicUrl( productCategoryDO.getPicUrl() );
        productCategoryBO.setSort( productCategoryDO.getSort() );
        productCategoryBO.setStatus( productCategoryDO.getStatus() );

        return productCategoryBO;
    }

    @Override
    public List<ProductCategoryBO> convert(List<ProductCategoryDO> productCategoryDOS) {
        if ( productCategoryDOS == null ) {
            return null;
        }

        List<ProductCategoryBO> list = new ArrayList<ProductCategoryBO>( productCategoryDOS.size() );
        for ( ProductCategoryDO productCategoryDO : productCategoryDOS ) {
            list.add( convert( productCategoryDO ) );
        }

        return list;
    }
}
