package io.lll.service.imple;

import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductReturnListOutDTO;
import io.lll.dto.out.ReturnListOutDTO;
import io.lll.dto.out.ReturnShowOutDTO;
import io.lll.service.ReturnService;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImple implements ReturnService {
    @Override
    public PageOutDTO<ReturnListOutDTO> search(String customer_name, Byte status, Integer order_id, Long create_time, Integer pageNum) {
        return null;
    }

    @Override
    public PageOutDTO<ProductReturnListOutDTO> productSearch(String customer_name, String product_name, Byte status, Integer order_id, Long create_time, Long update_time, Integer pageNum) {
        return null;
    }

    @Override
    public ReturnShowOutDTO getById(Integer return_id) {
        return null;
    }

    @Override
    public ReturnShowOutDTO create(ReturnShowOutDTO returnShowOutDTO) {
        return null;
    }

    @Override
    public ReturnShowOutDTO update(ReturnShowOutDTO returnShowOutDTO) {
        return null;
    }
}
