package io.github.mizhicn.mallshop.pruduct.service;
import io.github.mizhicn.mallshop.pruduct.api.ProductAttrService;
import io.github.mizhicn.mallshop.pruduct.api.bo.*;
import io.github.mizhicn.mallshop.pruduct.api.dto.*;
import io.github.mizhicn.mallshop.pruduct.convert.service.ProductAttrConvertService;
import io.github.mizhicn.mallshop.pruduct.dao.ProductAttrMapper;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(validation = "true" ,version = "${dubbo.provider.ProductAttrService.version}" )
public class ProductAttrServiceImpl implements ProductAttrService {


    @Autowired
    ProductAttrMapper productAttrMapper;

    /**
     * 网络传输对象爱嗯DTO 过来后需要转换成DO
     * @param productAttrPageDTO
     * @return
     */
    @Override
    public ProductAttrPageBO getProductAttrPage(ProductAttrPageDTO productAttrPageDTO) {
        ProductAttrPageBO productAttrPageBO = new ProductAttrPageBO();
        int offset = (productAttrPageDTO.getPageNum() - 1) * productAttrPageDTO.getPageSize();
        List<ProductAttrDO> productAttrDOS = productAttrMapper.selectListByNameLike(productAttrPageDTO.getName(), offset, productAttrPageDTO.getPageSize());
        List<ProductAttrDetailBO> productAttrDetailBOS = ProductAttrConvertService.INSTANCE.convert(productAttrDOS);

        Integer count = productAttrMapper.selectCountByNameLike(productAttrPageDTO.getName());
        productAttrPageBO.setAttrs(productAttrDetailBOS);
        productAttrPageBO.setCount(count);
        return productAttrPageBO;
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
