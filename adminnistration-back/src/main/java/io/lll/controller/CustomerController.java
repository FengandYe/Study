package io.lll.controller;

import io.lll.dto.out.CustomerListOutDTO;
import io.lll.dto.out.CustomerShowOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(@RequestParam(required = false) String username,
                                                 @RequestParam(required = false) String realName,
                                                 @RequestParam(required = false) String mobile,
                                                 @RequestParam(required = false) String email,
                                                 @RequestParam(required = false) Byte status,
                                                 @RequestParam(required = false) Long createTimestamp,
                                                 @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        if(customerId == null){
            return  null;
        }
        return customerService.getById(customerId);
    }

    @PostMapping("/create")
    public CustomerShowOutDTO create(@RequestBody CustomerShowOutDTO customerShowOutDTO){
        return customerService.create(customerShowOutDTO);
    }

    @PostMapping("/update")
    public CustomerShowOutDTO update(@RequestBody CustomerShowOutDTO customerShowOutDTO){
        return customerService.update(customerShowOutDTO);
    }

}
