package io.lll.controller;

import io.lll.dto.out.ReturnListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping ("/returnList")
    public List<ReturnListOutDTO> returnList(){
        return null;
    }

    @GetMapping ("/getById")
    public ReturnListOutDTO getById(@RequestAttribute Integer customerId,
                                    @RequestAttribute Integer orderId,
                                    @RequestAttribute Integer returnId){
        return null;
    }
}
