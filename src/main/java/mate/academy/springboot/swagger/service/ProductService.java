package mate.academy.springboot.swagger.service;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.swagger.model.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Product create(Product product);

    Product getById(Long id);

    void delete(Long id);

    List<Product> getAllByPrice(BigDecimal from, BigDecimal to, Pageable pageable);

    List<Product> getAll(PageRequest pageRequest);
}
