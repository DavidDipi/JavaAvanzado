package co.edu.sena.javaavanzado.servlets;

import co.edu.sena.javaavanzado.model.User;
import co.edu.sena.javaavanzado.model.repository.Repository;
import co.edu.sena.javaavanzado.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/userRegister")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_firstname = request.getParameter("firstName");
        String user_lastname = request.getParameter("lastName");
        String user_email = request.getParameter("email");
        String user_password = request.getParameter("password");

        User user = new User(user_firstname, user_lastname, user_email, user_password);

        Repository<User> repository = new UserRepositoryImpl();
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
            response.sendRedirect("");

        }
    }
}
