package io.lll.jcartadministrationback.controller;

import io.lll.jcartadministrationback.dto.entity.Administrator;
import io.lll.jcartadministrationback.dto.in.*;
import io.lll.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @PostMapping("updatePassword")
    public void updatePassword(@RequestBody AdministratorUpdatePasswordDTO administratorUpdatePasswordDTO){

    }

    @GetMapping("getAdministrator")
    public List<AdministratorGetProfileOutDTO>  getAdministrator(
            @RequestParam(defaultValue = "", required = false) String username,
            @RequestParam(defaultValue = "", required = false) String realName){
        return null;
    }

    @GetMapping("getAdministratorById")
    public Administrator getAdministratorById(@RequestParam Integer administratorId){
        return null;
    }

    @PostMapping("createAdministrator")
    public void createAdministrator(@RequestBody AdministratorCreateDTO administratorCreateDTO){

    }

    @PostMapping("updateAdministrator")
    public void updateAdministrator(@RequestBody AdministratorUpdateDTO administratorUpdateDTO){

    }




}
