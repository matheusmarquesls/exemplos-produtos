package sptech.school.produtos.query;

import org.springframework.stereotype.Service;
import sptech.school.produtos.model.Product;
import sptech.school.produtos.repository.InMemoryProductRepository;

import java.util.List;
@Service
public class ProductQueryService {
    private final InMemoryProductRepository repository;

    public ProductQueryService(InMemoryProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listarTodosProdutos(){
        return repository.findAll();
    }

}
