<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
        <!-------------TITULO DE LA VENTANA-------->
         <head>
              <title>Inicio de sesion</title>

             <!--    <link href="estiloLogin.css" rel="stylesheet" type="text/css">  -->
             <style>
                 body {
                     margin: 0;
                     padding: 0;
                     background: url(https://get.wallhere.com/photo/1920x1200-px-General-1197902.jpg) no-repeat center top;
                     background-size: cover;
                     font-family: sans-serif;
                     height: 100vh;
                 }

                 .login-box {
                     width: 320px;
                     height: 420px;
                     background: #000000;
                     color: #fff;
                     top: 50%;
                     left: 50%;
                     position: absolute;
                     transform: translate(-50%, -50%);
                     box-sizing: border-box;
                     padding: 70px 30px;
                 }

                 .login-box .avatar {
                     width: 100px;
                     height: 100px;
                     border-radius: 50%;
                     position: absolute;
                     top: -50px;
                     left: calc(50% - 50px);
                 }

                 .login-box h1 {
                     margin: 0;
                     padding: 0 0 20px;
                     text-align: center;
                     font-size: 22px;
                 }

                 .login-box label {
                     margin: 0;
                     padding: 0;
                     font-weight: bold;
                     display: block;
                 }

                 .login-box input {
                     width: 100%;
                     margin-bottom: 20px;
                 }

                 .login-box input[type="text"], .login-box input[type="password"] {
                     border: none;
                     border-bottom: 1px solid #fff;
                     background: transparent;
                     outline: none;
                     height: 40px;
                     color: #fff;
                     font-size: 16px;
                 }

                 .login-box input[type="submit"] {
                     border: none;
                     outline: none;
                     height: 40px;
                     background: #b80f22;
                     color: #fff;
                     font-size: 18px;
                     border-radius: 20px;
                 }

                 .login-box input[type="submit"]:hover {
                     cursor: pointer;
                     background: #ffc107;
                     color: #000;
                 }

                 .login-box a {
                     text-decoration: none;
                     font-size: 12px;
                     line-height: 20px;
                     color: darkgrey;
                 }

                 .login-box a:hover {
                     color: #fff;
                 }
             </style>
            </head>

            <body>
               <!-------------CREAR CAJA PARA LOGIN-------->
            <div class="login-box">
                <!--  <img src="src/main/webapp/WEB-INF/imagenes/logoUsuario.png" class="avatar" alt="Avatar Image"> -->
                <img src="https://cdn.pixabay.com/photo/2017/03/21/02/00/user-2160923_960_720.png" class="avatar" alt="Avatar Image">
                <h1>Iniciar sesión</h1>

                <form action="login.do" method="post">
                    <p style="color: red"> ${errorMessage}</p>

                    <!-------------Label y textField para USER-------->
                    <%--@declare id="username"--%>
                    <label for="username">Usuario</label>
                    <input type="text" placeholder="Tu super usuario" name="user">

                    <!-------------Label y textField para PASSWORD-------->
                    <%--@declare id="password"--%>
                    <label for="password">Contraseña</label>
                    <input type="password" placeholder="Tu clave supersegura" name="password">

                      <!-- <p>Ingresa tu usuario: <input type="text" name="user"></p>
                      <p>Ingresa tu contraseña: <input type="password" name="password"></p> -->

                    <!-------------Button para acceder-------->
                    <p><input type="submit" value="Acceder"></p>
                </form>
            </div>
         </body>
    </html>
