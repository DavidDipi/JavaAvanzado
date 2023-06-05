<%--
  Created by IntelliJ IDEA.
  User: APRENDIZ
  Date: 30/05/2023
  Time: 5:15 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section>

    <div class="container">

        <div class="card mt-5" style="width: 50%; margin-left: auto; margin-right: auto; padding: 5%;">
            <form action="userRegister" method="post">

                <div class="logo text-center">
                    <img class="mb-4" src="img/logo.png" alt="logo de MY APP" width="100">
                </div>

                <div class="mb-3">
                    <label for="firstName" class="form-label">Nombre:</label>
                    <input type="text" id="firstName" name="firstName" class="form-control" placeholder="Ingrese su nombre" required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>

                <div class="mb-3">
                    <label for="lastName" class="form-label">Apellido:</label>
                    <input type="text" id="lastName" name="lastName" class="form-control" placeholder="Ingrese su apellido" required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Correo:</label>
                    <input type="email" id="email" name="email" class="form-control" placeholder="Ingrese su correo" required pattern="{,60}">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña:</label>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Ingrese su contraseña" required >
                </div>
                <button type="submit" class="btn btn-primary">Registrarme</button>
            </form>
        </div>

    </div>

</section>

<%@include file="footer.jsp"%>