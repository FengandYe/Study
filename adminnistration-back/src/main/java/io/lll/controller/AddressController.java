package io.lll.controller;

import io.lll.dto.out.AddressShowOutDTO;
import io.lll.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        if(addressId == null){
            return null;
        }
        return  addressService.getById(addressId);
    }

    @PostMapping("/create")
    public AddressShowOutDTO create(@RequestBody AddressShowOutDTO addressShowOutDTO){
        if(addressShowOutDTO == null){
            return null;
        }
        return addressService.create(addressShowOutDTO);
    }

    @PostMapping("/update")
    public AddressShowOutDTO update(@RequestBody AddressShowOutDTO addressShowOutDTO){
        if(addressShowOutDTO == null){
            return null;
        }
        return addressService.update(addressShowOutDTO);
    }


}
