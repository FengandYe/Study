package io.lll.controller;

import io.lll.dto.out.OrderListOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(@RequestParam(required = false) String customer_name,
                                              @RequestParam(required = false) Byte status,
                                              @RequestParam(required = false) Double total_price,
                                              @RequestParam(required = false) Integer reword_points ,
                                              @RequestParam(required = false) Long create_time,
                                              @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderListOutDTO getById(@RequestParam Integer order_id){
        if(order_id == null){
            return null;
        }
        return orderService.getById(order_id);
    }

    @GetMapping("/getByCustomersId")
    public OrderListOutDTO getByCustomersId(@RequestParam Integer customers_id){
        if(customers_id == null){
            return null;
        }
        return orderService.getByCustomersId(customers_id);
    }

    @PostMapping("/create")
    public OrderListOutDTO create(@RequestBody OrderListOutDTO orderListOutDTO){
        return orderService.create(orderListOutDTO);
    }

    @PostMapping("/update")
    public OrderListOutDTO update(@RequestBody OrderListOutDTO orderListOutDTO){
        return orderService.update(orderListOutDTO);
    }


}
