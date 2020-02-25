package io.lll.service.imple;

import io.lll.dto.in.ProductCreateInDTO;
import io.lll.dto.in.ProductUpdateInDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImple implements ProductService {

    @Override
    public PageOutDTO<ProductListOutDTO> search(String productCode, String productName, Double price, Integer quantity, Byte status, Integer pageNum) {
        return null;
    }

    @Override
    public Integer create(ProductCreateInDTO productCreateInDTO) {
        return null;
    }

    @Override
    public void update(ProductUpdateInDTO productUpdateInDTO) {

    }
}
