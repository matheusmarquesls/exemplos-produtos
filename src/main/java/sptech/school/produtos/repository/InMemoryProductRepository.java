package sptech.school.produtos.repository;
import org.springframework.stereotype.Repository;
import sptech.school.produtos.model.Product;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
@Repository
public class InMemoryProductRepository {
    private final Map<Long, Product> database = new HashMap<>();
    private final AtomicLong idGeneretor = new AtomicLong();

    public Product save(Product product){
        product.setId(idGeneretor.incrementAndGet());
        product.setId(product.getId());
        database.put(product.getId(),product);
        return product;
    }

    public List<Product> findAll(){
        return new ArrayList<>(database.values());
    }

}
