package io.lll.service;

import io.lll.dto.in.ProductCreateInDTO;
import io.lll.dto.in.ProductUpdateInDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductListOutDTO;

public interface ProductService {

    public PageOutDTO<ProductListOutDTO> search(String productCode,
                                                String productName,
                                                Double price,
                                                Integer quantity,
                                                Byte status,
                                                Integer pageNum);

    public Integer create(ProductCreateInDTO productCreateInDTO);

    public void update(ProductUpdateInDTO productUpdateInDTO);
}
