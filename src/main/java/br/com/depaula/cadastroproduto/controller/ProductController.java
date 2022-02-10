package br.com.depaula.cadastroproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.depaula.cadastroproduto.model.Product;
import br.com.depaula.cadastroproduto.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/Produtos")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> listar() {
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product adicionar(@RequestBody Product produto) {
        return productRepository.save(produto);
    }

}
