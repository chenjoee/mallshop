package io.github.mizhicn.mallshop.pruduct.application.controller.user;


import com.alibaba.dubbo.config.annotation.Reference;
import io.github.mizhicn.mallshop.pruduct.api.ProductAttrService;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrPageDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(validation = "true", version = "${dubbo.provider.ProductAttrService.version}")
    ProductAttrService productAttrServiceImpl;

    @GetMapping("/test")
    public String get(@RequestParam(value = "name", required = false) String name,
                      @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                      @RequestParam(value="pageSize", defaultValue = "10") Integer pageSize){
        ProductAttrPageDTO productAttrPageDTO = new ProductAttrPageDTO().
                setName(name).setPageNum(pageNo).setPageSize(pageSize);

        productAttrServiceImpl.getProductAttrPage(productAttrPageDTO);


        return null;
    }

}
