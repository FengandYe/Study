package io.lll.controller;

import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductReturnListOutDTO;
import io.lll.dto.out.ReturnListOutDTO;
import io.lll.dto.out.ReturnShowOutDTO;
import io.lll.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @Autowired
    ReturnService returnService;

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(@RequestParam(required = false) String customer_name,
                                               @RequestParam(required = false) Byte status,
                                               @RequestParam(required = false) Integer order_id,
                                               @RequestParam(required = false) Long create_time,
                                               @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/productSearch")
    public PageOutDTO<ProductReturnListOutDTO> productSearch(@RequestParam(required = false) String customer_name,
                                                             @RequestParam(required = false) String product_name,
                                                             @RequestParam(required = false) Byte status,
                                                             @RequestParam(required = false) Integer order_id,
                                                             @RequestParam(required = false) Long create_time,
                                                             @RequestParam(required = false) Long update_time,
                                                             @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer return_id){
        if(return_id == null){
            return null;
        }
        return returnService.getById(return_id);
    }

    @PostMapping("/create")
    public ReturnShowOutDTO create(@RequestBody ReturnShowOutDTO returnShowOutDTO){
        return returnService.create(returnShowOutDTO);
    }

    @PostMapping("/update")
    public ReturnShowOutDTO update(@RequestBody ReturnShowOutDTO returnShowOutDTO){
        return returnService.update(returnShowOutDTO);
    }


}
