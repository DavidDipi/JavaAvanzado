<%@include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <main class="container">
    <div class="form-signin w-50 m-auto card p-5 mt-5">
      <form action="" method="post">
        <img class="mb-4" src="img/logo.png" alt="logo de MY APP" width="100">
        <h4 class="text-secondary">MY-APP</h4>
        <h1 class="h5 mb-3 fw-normal">Ingreso</h1>

        <div class="form-floating mb-3">
          <input type="text" class="form-control" id="floatingInput"
                 placeholder="Ingrese su nombre de usuario" required autofocus pattern="[A-Za-z0-9]{8, 12}">
          <label for="floatingInput">Usuario:</label>
        </div>

        <div class="form-floating mb-3">
          <input type="password" class="form-control" id="floatingPassword"
                 placeholder="Ingrese su contraseña" required pattern="[A-Za-z0-9]{8, 12}">
          <label for="floatingPassword">Contraseña:</label>
        </div>

        <button class="w-50 btn btn-lg btn-primary" type="submit">Ingresar</button>

        <div id="register">
          <a href="#">Registrarse</a>
        </div>

        <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MI-APP&copy; <%=displayDate()%></p>

      </form>
    </div>

  </main>

<%@include file="footer.jsp"%>