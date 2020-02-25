package io.lll.service;

import io.lll.dto.in.*;
import io.lll.dto.out.AdministratorGetProfileOutDTO;
import io.lll.dto.out.AdministratorListOutDTO;
import io.lll.dto.out.PageOutDTO;

public interface AdministratorService {

    public String login(String username, String password);

    public AdministratorGetProfileOutDTO getProfile(Integer administratorId);

    public void updateProfile(AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO);

    public PageOutDTO<AdministratorListOutDTO> getList(Integer pageNum);

    public Integer create(AdministratorCreateInDTO administratorCreateInDTO);

    public void update(AdministratorUpdateInDTO administratorUpdateInDTO);

    public void sendPasswordResetCodeToEmail(String email);

    public void resetPasswordByEmail(AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO);

    public void sendPasswordResetCodeToMobile(String mobile);

    public void resetPasswordByMobile(AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO);
}
