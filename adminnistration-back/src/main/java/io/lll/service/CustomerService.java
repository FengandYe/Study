package io.lll.service;

import io.lll.dto.out.CustomerListOutDTO;
import io.lll.dto.out.CustomerShowOutDTO;
import io.lll.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerService {

    public PageOutDTO<CustomerListOutDTO> search(String username,
                                                 String realName,
                                                 String mobile,
                                                 String email,
                                                 Byte status,
                                                 Long createTimestamp,
                                                 Integer pageNum);

    public CustomerShowOutDTO getById(Integer customerId);

    public CustomerShowOutDTO create(CustomerShowOutDTO customerShowOutDTO);

    public CustomerShowOutDTO update(@RequestBody CustomerShowOutDTO customerShowOutDTO);

}
