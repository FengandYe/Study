package io.lll.controller;

import io.lll.dto.in.*;
import io.lll.dto.out.AdministratorGetProfileOutDTO;
import io.lll.dto.out.AdministratorListOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        if(username ==null && password == null){
            return null;
        }
        return administratorService.login(username,password);
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){
        if(administratorId == null){
            return null;
        }
        return administratorService.getProfile(administratorId);
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){
        administratorService.updateProfile(administratorUpdateProfileInDTO);
    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam(required = false,defaultValue = "1") Integer pageNum){
        int pageSize=5;

        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return administratorService.create(administratorCreateInDTO);
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){
        administratorService.update(administratorUpdateInDTO);
    }

    @GetMapping("/sendPasswordResetCodeToEmail")
    public void sendPasswordResetCodeToEmail(@RequestParam String email){
        administratorService.sendPasswordResetCodeToEmail(email);
    }

    @PostMapping("/resetPassword")
    public void resetPasswordByEmail(@RequestBody AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO){
        administratorService.resetPasswordByEmail(administratorResetPwdEmailInDTO);
    }

    @GetMapping("/sendPasswordResetCodeToMobile")
    public void sendPasswordResetCodeToMobile(@RequestParam String mobile){
        administratorService.sendPasswordResetCodeToEmail(mobile);
    }

    @PostMapping("/resetPassword")
    public void resetPasswordByMobile(@RequestBody AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO){
        administratorService.resetPasswordByMobile(administratorResetPwdMobileInDTO);
    }
}
