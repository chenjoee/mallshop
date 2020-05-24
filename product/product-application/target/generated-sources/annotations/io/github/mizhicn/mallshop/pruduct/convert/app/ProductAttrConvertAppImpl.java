package io.github.mizhicn.mallshop.pruduct.convert.app;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailValueBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrPageBO;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductAttrDetailVO;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductAttrPageVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-19T23:06:20+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_242 (Private Build)"
)
public class ProductAttrConvertAppImpl implements ProductAttrConvertApp {

    @Override
    public UserProductAttrPageVO convert(ProductAttrPageBO productAttrPageBO) {
        if ( productAttrPageBO == null ) {
            return null;
        }

        UserProductAttrPageVO userProductAttrPageVO = new UserProductAttrPageVO();

        userProductAttrPageVO.setCount( productAttrPageBO.getCount() );
        userProductAttrPageVO.setAttrs( productAttrDetailBOListToUserProductAttrDetailVOList( productAttrPageBO.getAttrs() ) );

        return userProductAttrPageVO;
    }

    protected UserProductAttrDetailVO productAttrDetailBOToUserProductAttrDetailVO(ProductAttrDetailBO productAttrDetailBO) {
        if ( productAttrDetailBO == null ) {
            return null;
        }

        UserProductAttrDetailVO userProductAttrDetailVO = new UserProductAttrDetailVO();

        userProductAttrDetailVO.setId( productAttrDetailBO.getId() );
        userProductAttrDetailVO.setName( productAttrDetailBO.getName() );
        userProductAttrDetailVO.setStatus( productAttrDetailBO.getStatus() );
        userProductAttrDetailVO.setCreateTime( productAttrDetailBO.getCreateTime() );
        List<ProductAttrDetailValueBO> list = productAttrDetailBO.getValues();
        if ( list != null ) {
            userProductAttrDetailVO.setValues( new ArrayList<ProductAttrDetailValueBO>( list ) );
        }

        return userProductAttrDetailVO;
    }

    protected List<UserProductAttrDetailVO> productAttrDetailBOListToUserProductAttrDetailVOList(List<ProductAttrDetailBO> list) {
        if ( list == null ) {
            return null;
        }

        List<UserProductAttrDetailVO> list1 = new ArrayList<UserProductAttrDetailVO>( list.size() );
        for ( ProductAttrDetailBO productAttrDetailBO : list ) {
            list1.add( productAttrDetailBOToUserProductAttrDetailVO( productAttrDetailBO ) );
        }

        return list1;
    }
}
