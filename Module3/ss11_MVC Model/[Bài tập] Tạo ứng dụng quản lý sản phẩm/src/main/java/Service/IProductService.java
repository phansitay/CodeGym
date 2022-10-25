package Service;

import Model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    boolean save(Product product);

    Product findByid(int id);

    void update(int id,Product product);

    void remove(int id);
}
