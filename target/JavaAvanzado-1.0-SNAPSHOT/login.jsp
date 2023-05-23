<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="author" content="David Diaz">
  <meta name="description" content="Esto es un inicio de sesion">
  <meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <title>TALLER 2 & 3 | DAVID DIAZ</title>
  <link rel="icon" type="image/x-icon" href="./img/logo.png">
</head>
<body class="text-center">
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

  <!--Script Bootstrap-->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

  <%!
    public String displayDate() {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
      Date date = Calendar.getInstance().getTime();
      return dateFormat.format(date);
    }
  %>

</body>
</html>
