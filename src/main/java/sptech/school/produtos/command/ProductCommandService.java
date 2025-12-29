package sptech.school.produtos.command;

import org.springframework.stereotype.Service;
import sptech.school.produtos.model.Product;
import sptech.school.produtos.repository.InMemoryProductRepository;

@Service
public class ProductCommandService {
    private final InMemoryProductRepository repository;

    public ProductCommandService(InMemoryProductRepository repository) {
        this.repository = repository;
    }
    public Product createdProduct(Product product){
        return repository.save(product);
    }
}
