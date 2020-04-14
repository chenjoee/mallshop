package com.mizhi.demo.product.bo.product.DemoProdcut.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mizhi.demo.api.product.api.ProductService;
import com.mizhi.demo.api.product.bo.product.DemoProdcut;
import org.springframework.stereotype.Component;

@Service(validation = "true", version = "${dubbo.provider.ProductAttrService.version}")
@Component
public class ProductServiceImpl implements ProductService {
    @Override
    public DemoProdcut findOne(int id) {

        DemoProdcut prodcut = new DemoProdcut();
        prodcut.setId(1);
        prodcut.setName("hei hong lei");
        return prodcut;
    }
}
