
<%@ page import="java.util.List" %>
<%@ page import="co.edu.sena.javaavanzado.model.repository.CategoryRepositoryImpl" %>
<%@ page import="co.edu.sena.javaavanzado.model.Category" %><%--
  Created by IntelliJ IDEA.
  User: APRENDIZ
  Date: 30/05/2023
  Time: 3:32 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section>
    <div class="container">
        <div class="card mt-5" style="width: 50%; margin-left: auto; margin-right: auto; padding: 5%;">
            <form action="productsRegister" method="post">

                <div class="logo text-center">
                    <img class="mb-4" src="img/productos.png" alt="logo de MY APP" width="100">
                </div>

                <div class="mb-3">
                    <label for="nameProduct" class="form-label">Nombre del producto:</label>
                    <input type="text" id="nameProduct" name="nameProduct" class="form-control" placeholder="Ingrese el nombre del producto" required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>

                <div class="mb-3">
                    <label for="valueProduct" class="form-label">Valor del producto:</label>
                    <input type="text" id="valueProduct" name="valueProduct" class="form-control" placeholder="Ingrese el valor del producto    " required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>
                <div class="mb-3">
                    <label for="catProduct" class="form-label">Categoria del producto:</label>
                    <select id="catProduct" name="catProduct" class="form-select">
                        <option value="">Seleccionar categoría</option>
                        <%
                            CategoryRepositoryImpl repository = new CategoryRepositoryImpl();
                            List<Category> categoryList = repository.listAllObj();
                            for (Category category : categoryList) {
                        %>
                        <option value="<%= category.getCategory_id() %>"><%= category.getCategory_name() %></option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Registrar productos</button>
            </form>
        </div>
    </div>
</section>

<%@include file="footer.jsp"%>