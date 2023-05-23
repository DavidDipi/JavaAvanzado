package co.edu.sena.javaavanzado.model.repository;

import co.edu.sena.javaavanzado.model.Products;

import java.sql.*;

public class TestProductsRepository {
    public static void main(String[] args) throws SQLException {
        Repository<Products> repository = new ProductsRepositoryImpl();

        System.out.println("========================== saveObj | Insert ==========================");

        Products productInsert = new Products();

        productInsert.setProduct_name("Jabon");
        productInsert.setProduct_value("3500");
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);
        productInsert.setProduct_name("Cepillo");
        productInsert.setProduct_value("2000");;
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);

        System.out.println("========================== listAllObj ==========================");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========================== ByIdObj ==========================");
        System.out.println(repository.byIdObj(1));

        System.out.println("========================== saveObj | Update ==========================");
        Products productUpdate = new Products();

        productUpdate.setProduct_id(2);
        productUpdate.setProduct_name("Gel");
        productUpdate.setProduct_value("3000");
        productUpdate.setCategory_id(1);
        repository.saveObj(productUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========================= deleteObj ==========================");
        repository.deleteObj(3);
        repository.listAllObj().forEach(System.out::println);
    }
}
