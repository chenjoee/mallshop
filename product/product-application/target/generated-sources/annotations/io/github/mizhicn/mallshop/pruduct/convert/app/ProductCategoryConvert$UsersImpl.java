package io.github.mizhicn.mallshop.pruduct.convert.app;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;
import io.github.mizhicn.mallshop.pruduct.convert.app.ProductCategoryConvert.Users;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductCategoryVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-19T23:06:20+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_242 (Private Build)"
)
public class ProductCategoryConvert$UsersImpl implements Users {

    @Override
    public UserProductCategoryVO conert(ProductCategoryBO productCategoryBO) {
        if ( productCategoryBO == null ) {
            return null;
        }

        UserProductCategoryVO userProductCategoryVO = new UserProductCategoryVO();

        userProductCategoryVO.setId( productCategoryBO.getId() );
        userProductCategoryVO.setName( productCategoryBO.getName() );
        userProductCategoryVO.setPicUrl( productCategoryBO.getPicUrl() );

        return userProductCategoryVO;
    }

    @Override
    public List<UserProductCategoryVO> convert(List<ProductCategoryBO> productCategoryBOS) {
        if ( productCategoryBOS == null ) {
            return null;
        }

        List<UserProductCategoryVO> list = new ArrayList<UserProductCategoryVO>( productCategoryBOS.size() );
        for ( ProductCategoryBO productCategoryBO : productCategoryBOS ) {
            list.add( conert( productCategoryBO ) );
        }

        return list;
    }
}
