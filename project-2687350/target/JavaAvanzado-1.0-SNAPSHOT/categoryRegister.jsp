<%--
  Created by IntelliJ IDEA.
  User: APRENDIZ
  Date: 30/05/2023
  Time: 4:48 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section>
    <div class="container">
        <div class="card mt-5" style="width: 50%; margin-left: auto; margin-right: auto; padding: 5%;">
            <form action="categoryRegister" method="post">

                <div class="logo text-center">
                    <img class="mb-4" src="img/productos.png" alt="logo de MY APP" width="100">
                </div>

                <div class="mb-3">
                    <label for="nameCategory" class="form-label">Nombre de la categoria:</label>
                    <input type="text" id="nameCategory" name="nameCategory" class="form-control" placeholder="Ingrese el nombre de la categoria" required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>

                <button type="submit" class="btn btn-primary">Registrar categoria</button>
            </form>
        </div>
    </div>
</section>