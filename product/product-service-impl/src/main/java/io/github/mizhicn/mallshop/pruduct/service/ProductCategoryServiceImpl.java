package io.github.mizhicn.mallshop.pruduct.service;

import io.github.mizhicn.mallshop.pruduct.api.ProductCategoryService;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;
import io.github.mizhicn.mallshop.pruduct.api.constant.ProductCategoryContants;
import io.github.mizhicn.mallshop.pruduct.convert.service.ProductCategoryConvert;
import io.github.mizhicn.mallshop.pruduct.dao.ProductCategoryMapper;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductCategoryDO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(validation = "true", version = "${dubbo.provider.ProductAttrService.version}")
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategoryBO> getListByPid(Integer pid) {
        List<ProductCategoryDO> productCategoryDOS = productCategoryMapper.selectListByPidAndStatusOrderBySort(pid, ProductCategoryContants.STATUS_ENABLE);
        List<ProductCategoryBO> productCategoryBOS = ProductCategoryConvert.INSTANCE.convert(productCategoryDOS);
        return productCategoryBOS;
    }
}
