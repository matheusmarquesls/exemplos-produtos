package sptech.school.produtos.controller;

import org.springframework.web.bind.annotation.*;
import sptech.school.produtos.command.ProductCommandService;
import sptech.school.produtos.model.Product;
import sptech.school.produtos.query.ProductQueryService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    private final ProductCommandService commandService;
    private final ProductQueryService queryService;

    public ProductController(ProductCommandService commandService, ProductQueryService queryService) {
        this.commandService = commandService;
        this.queryService = queryService;
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return commandService.createdProduct(product);
    }

    @GetMapping
    public List<Product> list(){
        return queryService.listarTodosProdutos();
    }

}
