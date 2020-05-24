package com.github.mizhi.mallshop.oder.service;

import com.github.mizhicn.mallshop.order.OrderService;
import com.github.mizhicn.mallshop.order.bo.*;
import com.github.mizhicn.mallshop.order.dto.*;
import io.github.mizhicn.common.framework.vo.CommonResult;
import org.apache.dubbo.config.annotation.Service;

@Service(validation = "true", version = "${dubbo.provider.OrderService.version}")
public class OderServiceImpl implements OrderService {

    @Override
    public CommonResult<OrderPageBO> getOrderPage(OrderQueryDTO orderQueryDTO) {
        return null;
    }

    @Override
    public CommonResult<OrderItemBO> getOrderItems(Integer oderId) {
        return null;
    }

    @Override
    public CommonResult<OrderRecipientBO> getOrderRecipientBO(Integer oderId) {
        return null;
    }

    @Override
    public CommonResult<OrderInfoBO> info(Integer userId, Integer orderId) {
        return null;
    }

    @Override
    public CommonResult<OrderCreateBO> createOrder(OrderCreateDTO orderCreateDTO) {
        return null;
    }

    @Override
    public CommonResult updateOrderItem(OrderItemUpdateDTO orderItemUpdateDTO) {
        return null;
    }

    @Override
    public CommonResult updateOrderItemPayAmount(Integer orderId, Integer orderItemId, Integer payAmount) {
        return null;
    }

    @Override
    public CommonResult cancelOrder(Integer orderId, Integer reasons, String otherReasons) {
        return null;
    }

    @Override
    public CommonResult<OrderRecipientBO> orderDelivery(OrderDeliveryDTO orderDelivery) {
        return null;
    }

    @Override
    public CommonResult updateOrderRemake(Integer orderId, String remake) {
        return null;
    }

    @Override
    public CommonResult deleteOrderItem(OrderItemDeletedDTO orderItemDeletedDTO) {
        return null;
    }

    @Override
    public CommonResult confirmReceiving(Integer userId, Integer orderId) {
        return null;
    }

    @Override
    public CommonResult updateLogistics(OrderLogisticsUpdateDTO orderLogisticsDTO) {
        return null;
    }

    @Override
    public CommonResult deleteOrder(Integer id) {
        return null;
    }

    @Override
    public String updatePaySuccess(String orderId, Integer payAmount) {
        return null;
    }

    @Override
    public CommonResult listenerConfirmGoods() {
        return null;
    }

    @Override
    public CommonResult listenerExchangeGoods() {
        return null;
    }
}
