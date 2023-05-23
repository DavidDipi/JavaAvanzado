<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es" >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <title>TALLER 1 | DAVID DIAZ</title>
    <meta name="author" content="David Diaz">
    <meta name="description" content="Esto es un formulario de registro">
    <meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta">
    <link rel="icon" type="image/x-icon" href="./img/logo.png">
</head>
<body>

<div class="container">

    <header>

    </header>

    <nav></nav>

    <section>

        <div class="card mt-5" style="width: 50%; margin-left: auto; margin-right: auto; padding: 5%;">
            <form action="" method="post">

                <div class="logo text-center">
                    <img class="mb-4" src="img/logo.png" alt="logo de MY APP" width="100">
                </div>

                <div class="mb-3">
                    <label for="firstName" class="form-label">Nombre:</label>
                    <input type="text" id="firstName" class="form-control" placeholder="Ingrese su nombre" required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>

                <div class="mb-3">
                    <label for="lastName" class="form-label">Apellido:</label>
                    <input type="text" id="lastName" class="form-control" placeholder="Ingrese su apellido" required autofocus pattern="[A-Za-z ]{2, 40}">
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Correo:</label>
                    <input type="email" id="email" class="form-control" placeholder="Ingrese su correo" required pattern="{,60}">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña:</label>
                    <input type="password" id="password" class="form-control" placeholder="Ingrese su contraseña" required pattern="">
                </div>
                <button type="submit" class="btn btn-primary">Registrarme</button>
            </form>
        </div>

    </section>


</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>
