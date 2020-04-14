package io.github.mizhicn.mallshop.pruduct.service;
import com.alibaba.dubbo.config.annotation.Service;
import io.github.mizhicn.mallshop.pruduct.api.ProductAttrService;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrPageBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrSimpleBO;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrValueBO;
import io.github.mizhicn.mallshop.pruduct.api.dto.*;
import io.github.mizhicn.mallshop.pruduct.dao.ProductAttrMapper;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(validation = "true", version = "${dubbo.provider.ProductAttrService.version}")
public class ProductAttrServiceImpl implements ProductAttrService {


    @Autowired
    ProductAttrMapper productAttrMapper;

    @Override
    public ProductAttrPageBO getProductAttrPage(ProductAttrPageDTO productAttrPageDTO) {
        ProductAttrDO productAttrDO = productAttrMapper.selectById(1);
        System.out.println(productAttrDO);

        return null;
    }

    @Override
    public List<ProductAttrSimpleBO> getProductAttrList() {
        return null;
    }

    @Override
    public ProductAttrBO addProductAttr(Integer adminId, ProductAttrAddDTO productAttrAddDTO) {
        return null;
    }

    @Override
    public Boolean updateProductAttr(Integer adminId, ProductAttrUpdateDTO productAttrUpdateDTO) {
        return null;
    }

    @Override
    public Boolean updateProductAttrStatus(Integer adminId, Integer productAttrId, Integer status) {
        return null;
    }

    @Override
    public ProductAttrValueBO addProductAttrValue(Integer adminId, ProductAttrValueAddDTO productAttrValueAddDTO) {
        return null;
    }

    @Override
    public Boolean updateProductAttrValue(Integer adminId, ProductAttrValueUpdateDTO productAttrValueUpdateDTO) {
        return null;
    }

    @Override
    public Boolean updateProductAttrValueStatus(Integer adminId, Integer productAttrValueId, Integer status) {
        return null;
    }
}
