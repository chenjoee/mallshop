package io.github.mizhicn.mallshop.pruduct.convert.service;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailBO;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-19T23:03:16+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_242 (Private Build)"
)
public class ProductAttrConvertServiceImpl implements ProductAttrConvertService {

    @Override
    public ProductAttrDetailBO convert(ProductAttrDO productAttrDO) {
        if ( productAttrDO == null ) {
            return null;
        }

        ProductAttrDetailBO productAttrDetailBO = new ProductAttrDetailBO();

        productAttrDetailBO.setId( productAttrDO.getId() );
        productAttrDetailBO.setName( productAttrDO.getName() );
        productAttrDetailBO.setStatus( productAttrDO.getStatus() );
        productAttrDetailBO.setCreateTime( productAttrDO.getCreateTime() );

        return productAttrDetailBO;
    }

    @Override
    public List<ProductAttrDetailBO> convert(List<ProductAttrDO> productAttrDOS) {
        if ( productAttrDOS == null ) {
            return null;
        }

        List<ProductAttrDetailBO> list = new ArrayList<ProductAttrDetailBO>( productAttrDOS.size() );
        for ( ProductAttrDO productAttrDO : productAttrDOS ) {
            list.add( convert( productAttrDO ) );
        }

        return list;
    }
}
