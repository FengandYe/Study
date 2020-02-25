package io.lll.controller;

import io.lll.dto.out.OrderHistoryListOutDTO;
import io.lll.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {



    @GetMapping("/search")
    public PageOutDTO<OrderHistoryListOutDTO> search(@RequestParam(required = false) Byte order_status,
                                                     @RequestParam(required = false) Boolean customer_notified,
                                                     @RequestParam(required = false) Long time,
                                                     @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderHistoryListOutDTO getById(@RequestParam Integer order_history_id){
        return null;
    }

    @PostMapping("/create")
    public OrderHistoryListOutDTO create(@RequestBody OrderHistoryListOutDTO orderHistoryListOutDTO){
        return null;
    }

    @PostMapping("/update")
    public OrderHistoryListOutDTO update(@RequestBody OrderHistoryListOutDTO orderHistoryListOutDTO){
        return null;
    }


}
