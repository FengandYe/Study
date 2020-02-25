package io.lll.controller;

import io.lll.dto.out.OrderListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/list")
    public List<OrderListOutDTO> findList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/show")
    public OrderListOutDTO orderShow(@RequestAttribute Integer customerId,
                                           @RequestAttribute Integer orderId){
        return null;
    }
}
