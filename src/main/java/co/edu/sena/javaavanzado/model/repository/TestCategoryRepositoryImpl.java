package co.edu.sena.javaavanzado.model.repository;


import co.edu.sena.javaavanzado.model.Category;

import java.sql.SQLException;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Category> repository = new CategoryRepositoryImpl();

        System.out.println("========================== saveObj | Insert ==========================");

        Category categoryInsert = new Category();

        categoryInsert.setCategory_name("ASEO");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("Comida");
        repository.saveObj(categoryInsert);

        System.out.println("========================== listAllObj ==========================");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========================== ByIdObj ==========================");
        System.out.println(repository.byIdObj(1));

        System.out.println("========================== saveObj | Update ==========================");
        Category categoryUpdate = new Category();

        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("Bebida");
        repository.saveObj(categoryUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========================= deleteObj ==========================");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
