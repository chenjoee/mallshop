package com.github.mizhicn.order.app.controller.user;

import com.github.mizhicn.mallshop.order.OrderService;
import com.github.mizhicn.mallshop.order.bo.OrderPageBO;
import io.github.mizhicn.common.framework.vo.CommonResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference(validation = "true", version = "${dubbo.provider.OrderService.version}")
    private OrderService orderServiceImpl;

    public CommonResult<OrderPageBO> getOrderPage() {

        return null;
    }




}
