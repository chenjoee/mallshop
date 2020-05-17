package io.github.mizhicn.mallshop.pruduct.controller.user;


import io.github.mizhicn.mallshop.pruduct.api.ProductAttrService;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrPageBO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductAttrPageDTO;
import io.github.mizhicn.mallshop.pruduct.convert.ProductAttrConvertApp;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductAttrPageVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @Reference(version = "${dubbo.provider.ProductAttrService.version}")
    @Reference(validation = "true",  version = "${dubbo.provider.ProductAttrService.version}")
    ProductAttrService productAttrService;

    @GetMapping("/test")
    public String get(@RequestParam(value = "name", required = false) String name,
                      @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                      @RequestParam(value="pageSize", defaultValue = "10") Integer pageSize){
        ProductAttrPageDTO productAttrPageDTO = new ProductAttrPageDTO().
                setName(name).setPageNum(pageNo).setPageSize(pageSize);

        ProductAttrPageBO productAttrPage = productAttrService.getProductAttrPage(productAttrPageDTO);
        //BO -> VO
        UserProductAttrPageVO convert = ProductAttrConvertApp.INSTANCE.convert(productAttrPage);

        return convert.toString();
    }

}
