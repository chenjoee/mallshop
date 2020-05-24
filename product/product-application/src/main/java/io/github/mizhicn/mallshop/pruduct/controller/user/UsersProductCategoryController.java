package io.github.mizhicn.mallshop.pruduct.controller.user;

import io.github.mizhicn.common.framework.vo.CommonResult;
import io.github.mizhicn.mallshop.pruduct.api.ProductCategoryService;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductCategoryBO;
import io.github.mizhicn.mallshop.pruduct.convert.app.ProductCategoryConvert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("商品分类")
@RequestMapping("/users/category")
public class UsersProductCategoryController {

    @Reference(validation = "true", version = "${dubbo.provider.ProductAttrService.version}")
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    @ApiOperation("获得指定编号下的子分类的数组")
    @ApiImplicitParam(name = "pid", value = "指定分类编号", required = true, example = "0")
    public CommonResult list(@RequestParam("pid") Integer pid) {
        List<ProductCategoryBO> productCategoryBOS = productCategoryService.getListByPid(pid);
        return CommonResult.success(ProductCategoryConvert.Users.instance.convert(productCategoryBOS));
    }



}
