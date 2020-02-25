package io.lll.controller;

import io.lll.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/list")
	public List<ProductListOutDTO> productList(){
        return null;
    }

    @GetMapping("/getProductById")
    public ProductListOutDTO getProductById(){
        return null;
    }

}
