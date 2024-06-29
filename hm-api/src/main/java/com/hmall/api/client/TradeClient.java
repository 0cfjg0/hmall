package com.hmall.api.client;

import com.hmall.api.domain.po.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("trade-service")
public interface TradeClient {

    @PostMapping("/orders/update")
    void updateOrder(@RequestBody Order order);
}
