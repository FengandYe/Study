package io.lll.controller;

import io.lll.dto.in.ProductCreateInDTO;
import io.lll.dto.in.ProductUpdateInDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false) String productCode,
                                                @RequestParam(required = false) String productName,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer quantity,
                                                @RequestParam(required = false) Byte status,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return productService.create(productCreateInDTO);
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
       productService.update(productUpdateInDTO);
    }
}
