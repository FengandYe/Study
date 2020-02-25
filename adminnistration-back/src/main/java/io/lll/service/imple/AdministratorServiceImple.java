package io.lll.service.imple;

import io.cjf.jcartadministrationback.dto.in.*;
import io.lll.jcartadministrationback.dto.in.*;
import io.lll.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.lll.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.lll.jcartadministrationback.dto.out.PageOutDTO;
import io.lll.jcartadministrationback.service.AdministratorService;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImple implements AdministratorService {


    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId) {
        return null;
    }

    @Override
    public void updateProfile(AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO) {

    }

    @Override
    public PageOutDTO<AdministratorListOutDTO> getList(Integer pageNum) {
        return null;
    }

    @Override
    public Integer create(AdministratorCreateInDTO administratorCreateInDTO) {
        return null;
    }

    @Override
    public void update(AdministratorUpdateInDTO administratorUpdateInDTO) {

    }

    @Override
    public void sendPasswordResetCodeToEmail(String email) {

    }

    @Override
    public void resetPasswordByEmail(AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO) {

    }

    @Override
    public void sendPasswordResetCodeToMobile(String mobile) {

    }

    @Override
    public void resetPasswordByMobile(AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO) {

    }
}
