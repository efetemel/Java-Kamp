package business.concretes;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;
import jLogger.jLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao dao;
    private LoggerService loggerService;

    public ProductManager(ProductDao dao,LoggerService loggerService) {
        this.dao = dao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        //İş kodları
        if (product.getCategoryID() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor!");
            return;
        }
        this.dao.add(product);
        this.loggerService.logToSystem("Ürün sisteme eklendi "+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
