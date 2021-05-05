import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.jLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {
    public static void main(String[] args){
        //ToDo Spring IoC ile çözülecek
        ProductService productService = new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
        Product product = new Product(1,2,"elma",12,50);
        productService.add(product);
    }
}
