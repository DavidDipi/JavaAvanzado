package co.edu.sena.javaavanzado.servlets;

import co.edu.sena.javaavanzado.model.Products;
import co.edu.sena.javaavanzado.model.repository.ProductsRepositoryImpl;
import co.edu.sena.javaavanzado.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/productsRegister")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_name = request.getParameter("nameProduct");
        String product_value = request.getParameter("valueProduct");
        Integer category_id = Integer.parseInt(request.getParameter("catProduct"));

        Products user = new Products(product_name, product_value, category_id);

        Repository<Products> repository = new ProductsRepositoryImpl();
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
