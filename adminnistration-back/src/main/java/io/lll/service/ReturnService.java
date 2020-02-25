package io.lll.service;

import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductReturnListOutDTO;
import io.lll.dto.out.ReturnListOutDTO;
import io.lll.dto.out.ReturnShowOutDTO;

public interface ReturnService {

    public PageOutDTO<ReturnListOutDTO> search(String customer_name,
                                               Byte status,
                                               Integer order_id,
                                               Long create_time,
                                               Integer pageNum);


    public PageOutDTO<ProductReturnListOutDTO> productSearch(String customer_name,
                                                             String product_name,
                                                             Byte status,
                                                             Integer order_id,
                                                             Long create_time,
                                                             Long update_time,
                                                             Integer pageNum);

    public ReturnShowOutDTO getById(Integer return_id);

    public ReturnShowOutDTO create(ReturnShowOutDTO returnShowOutDTO);

    public ReturnShowOutDTO update(ReturnShowOutDTO returnShowOutDTO);
}
