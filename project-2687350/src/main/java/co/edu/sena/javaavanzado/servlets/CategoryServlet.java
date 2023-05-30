package co.edu.sena.javaavanzado.servlets;

import co.edu.sena.javaavanzado.model.Category;
import co.edu.sena.javaavanzado.model.repository.CategoryRepositoryImpl;
import co.edu.sena.javaavanzado.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/categoryRegister")
public class CategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String category_name = request.getParameter("nameCategory");

        Category user = new Category(category_name);

        Repository<Category> repository = new CategoryRepositoryImpl();
        int row = 0;

        try {
            row = repository.saveObj(user);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        String infoMessage = null;

        if (row == 0){
            infoMessage = "Error";
            System.out.println(infoMessage);
        }else {
            System.out.println("Registro exitoso");
        }
    }
}
