package io.github.mizhicn.mallshop.pruduct.convert.app;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductCategoryVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


public interface ProductCategoryConvert {

    @Mapper
    interface Users {

        public Users instance = Mappers.getMapper(Users.class);

        UserProductCategoryVO conert(ProductCategoryBO productCategoryBO);

        List<UserProductCategoryVO> convert(List<ProductCategoryBO> productCategoryBOS);

    }

}
