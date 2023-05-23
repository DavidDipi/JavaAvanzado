package co.edu.sena.javaavanzado.model.repository;

import co.edu.sena.javaavanzado.model.User;

import java.sql.*;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========================== saveObj | Insert ==========================");

        User userInsert = new User();

        userInsert.setUser_firstname("Pepo");
        userInsert.setUser_lastname("Pipas");
        userInsert.setUser_email("pepopipas32@mail.com");
        userInsert.setUser_password("PePi789123");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("Ferxxo");
        userInsert.setUser_lastname("Miko");
        userInsert.setUser_email("ferxxko55@mail.com");
        userInsert.setUser_password("fer58963");
        repository.saveObj(userInsert);

        System.out.println("========================== listAllObj ==========================");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========================== ByIdObj ==========================");
        System.out.println(repository.byIdObj(1));

        System.out.println("========================== saveObj | Update ==========================");
        User userUpdate = new User();

        userUpdate.setUser_id(3);
        userUpdate.setUser_firstname("Pepe");
        userUpdate.setUser_lastname("Palacios");
        userUpdate.setUser_email("pepa55@email.com");
        userUpdate.setUser_password("156785pepa");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========================= deleteObj ==========================");
        repository.deleteObj(3);
        repository.listAllObj().forEach(System.out::println);
    }
}
