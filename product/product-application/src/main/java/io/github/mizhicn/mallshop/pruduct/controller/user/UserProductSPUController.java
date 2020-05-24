package io.github.mizhicn.mallshop.pruduct.controller.user;

import io.github.mizhicn.common.framework.vo.CommonResult;
import io.github.mizhicn.mallshop.pruduct.api.ProductAttrService;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductSpuPageDTO;
import io.github.mizhicn.mallshop.pruduct.vo.user.UserProductAttrPageVO;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/spu")
@Api("商品 SPU + SKU")
public class UserProductSPUController {

    @Reference(validation = "true", version = "${dubbo.provider.ProductAttrService.version}")
    private ProductAttrService productAttrService;


    public CommonResult<UserProductAttrPageVO> page(@RequestParam(value = "cid", required = false) Integer cid,
                                                    @RequestParam(value = "pageNo", required=false) Integer pageNo,
                                                    @RequestParam(value = "pageSize", required = false) Integer pageSize) {

        ProductSpuPageDTO productSpuPageDTO = new ProductSpuPageDTO().setPageNo(pageNo).setPageSize(pageSize).setCid(cid);




        return null;
    }




}
