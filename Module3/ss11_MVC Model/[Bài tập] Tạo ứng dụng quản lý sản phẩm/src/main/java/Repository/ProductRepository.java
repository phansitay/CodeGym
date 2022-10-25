package Repository;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(1,"May lanh",20000,"san pham xin"));
        products.add(new Product(2,"May giat",14009,"san pham giat tot"));
        products.add(new Product(3,"Ti vi",200000,"san pham te"));
        products.add(new Product(4,"Tu lanh",13455656,"Bi loi khong dong"));
        products.add(new Product(5,"Ban ui",900000,"san pham nhu shit"));
        products.add(new Product(6,"Noi com dien",98000,"gia hoi dat"));
        products.add(new Product(7,"Quat hoi nuoc",43000,"quat mat"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }
    @Override
    public boolean save(Product product) {
        return products.add(product);
    }

    @Override
    public Product findByid(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
