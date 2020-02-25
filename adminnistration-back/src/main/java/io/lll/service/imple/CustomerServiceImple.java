package io.lll.service.imple;

import io.lll.dto.out.CustomerListOutDTO;
import io.lll.dto.out.CustomerShowOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImple implements CustomerService {

    @Override
    public PageOutDTO<CustomerListOutDTO> search(String username, String realName, String mobile, String email, Byte status, Long createTimestamp, Integer pageNum) {
        return null;
    }

    @Override
    public CustomerShowOutDTO getById(Integer customerId) {
        return null;
    }

    @Override
    public CustomerShowOutDTO create(CustomerShowOutDTO customerShowOutDTO) {
        return null;
    }

    @Override
    public CustomerShowOutDTO update(CustomerShowOutDTO customerShowOutDTO) {
        return null;
    }
}
