<%--
  Created by IntelliJ IDEA.
  User: polar
  Date: 27/05/21
  Time: 11:25 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="webjars/bootstrap/5.0.0/css/bootstrap.min.css" rel="stylesheet">
    <title>Prestamos bancarios</title>

    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
        }

        .panelNavbar {
            overflow: hidden;
            background-color: #333;
        }

        .panelNavbar a {
            float: left;
            font-size: 16px;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }


        .tipoProducto , .usuarios  , .bancos  {
            font-size: 16px;
            border: none;
            outline: none;
            color: white;
            padding: 14px 16px;
            background-color: inherit;
            font-family: inherit;
            margin: 0;
        }

        .panelNavbar a:hover, .tipoProducto:hover  {
            background-color: red;
        }

        .panelNavbar a:hover, .usuarios:hover  {
            background-color: red;
        }

        .panelNavbar a:hover, .bancos:hover  {
            background-color: red;
        }



        .dropdown-content a {
            float: none;
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            text-align: left;
        }

        .dropdown-content a:hover {
            background-color: #ddd;
        }


        .recuadro {
            border:1px solid black;
            width:49.5%;
            display:inline-block;
            height:80%;
            overflow:hidden;
        }
        #uno{
            background-color:#e88f51;
        }
        #dos{
            background-color:#4783bf;
        }
        #tres{
            background-color:#80bd72;
        }
        #cuatro{
            background-color:#d65496;
        }
        #cinco{
            background-color:#ffc107;
        }

        .panelesCRUDusuarios input[type="submit"] {
            border: none;
            outline: none;
            height: 40px;
            background: #33CCCC;
            color: #fff;
            font-size: 18px;
            border-radius: 20px;
        }

        .panelesCRUDusuarios input[type="submit"]:hover {
            cursor: pointer;
            background: #35c0cd;
            color: #000;
        }

        .panelesCRUDusuarios input[type="text"] {
            border: none;
            border-bottom: 1px solid #fff;
            background: #f9f9f9;
            outline: none;
            height: 40px;
            color: #000000;
            font-size: 16px;
        }

        .panelesCRUDusuarios label {
            margin: 0;
            padding: 0;
            font-weight: bold;
            display: block;
        }

        .panelPrincipal label {
            margin: 0;
            padding: 0;
            font-weight: bold;
            display: block;
        }
        table {
            border-collapse: collapse;
            border-spacing: 0;
            width: 100%;
            border: 1px solid #ddd;
        }

        th, td {
            text-align: left;
            padding: 16px;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>

</head>


<body>


<nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand" href="#">
        <img src="https://image.freepik.com/vector-gratis/prestamo-bancario-concepto-vector-plano-pequena-empresa_81522-3733.jpg" width="30" height="30" class="d-inline-block align-top" alt="">
        Prestamos Bancarios
    </a>



    <div class="panelNavbar">
        <ul class="nav nav-tabs">
            <li class="nav-item">
                <a class="nav-link" href="principalTipoProducto.do">Tipo Productos</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" href="principalUsuario.do">Usuarios</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="principalBancos.do">Bancos</a>
            </li>

        </ul>
        <!--
        <a href="principalTipoProducto.do">Tipo Productos</a>
        <a href="principalUsuario.do">Usuarios</a>
        <a href="principalBancos.do">Bancos</a>
        -->

    </div>

</nav>





<div class="panelPrincipal">
    <h1><label> Bienvenido ${user} </label></h1>
    <p></p>
    <p>Navegue por las distintas opciones de tu proyecto:</p>
</div>

<div class="panelesCRUDusuarios">

    <!--PANELUNO-->
    <div class='recuadro' id="uno">

        <form action="añadir-Usuario.do" method="post">

            <p><label> Agregar usuario </label></p>

            <p><input type="text" placeholder="Cedula" name="txtAgregarCedulaUsuario" ></p>

            <p><input type="text" placeholder="Nombre" name="txtAgregarNombreUsuario"></p>

            <p><input type="text" placeholder="Apellido" name="txtAgregarApellidoUsuario"></p>

            <p><input type="text" placeholder="Telefono" name="txtAgregarTelefonoUsuario"></p>

            <p><input type="text" placeholder="Fecha de nacimiento" name="txtAgregarFechaUsuario"></p>

            <p><input type="text" placeholder="Direccion" name="txtAgregarDireccionUsuario"></p>

            <p><input type="text" placeholder="Score" name="txtAgregarScoreUsuario"></p>

            <p><input type="submit" value="Agregar"></p>

        </form>

        <p style="color: black"> ${confirmacionAgregar}</p>
    </div>


    <!--PANELDOS-->
    <div class='recuadro' id="dos">

        <form action="eliminar-usuario.do" method="post">

            <p><label> Eliminar usuario </label></p>

            <p><input type="text" placeholder="Cedula" name="txtEliminarUsuario" ></p>

            <p><input type="submit" value="Eliminar"></p>

        </form>

        <p style="color: black"> ${confirmacionEliminar}</p>

    </div>

    <br>

    <!--PANELTRES-->
    <div class='recuadro' id="tres">

        <form action="modificar-usuario.do" method="post">

            <p><label> Modificar usuario </label></p>

            <p><input type="text" placeholder="Cedula actual" name="txtModificarCedulaUsuario" ></p>

            <p><input type="text" placeholder="Nombre nuevo" name="txtModificarNombreUsuario"></p>

            <p><input type="text" placeholder="Apellido nuevo" name="txtModificarApellidoUsuario"></p>

            <p><input type="text" placeholder="Telefono nuevo" name="txtModificarTelefonoUsuario"></p>

            <p><input type="text" placeholder="Fecha de nacimiento nuevo" name="txtModificarFechaUsuario"></p>

            <p><input type="text" placeholder="Direccion nuevo" name="txtModificarDireccionUsuario"></p>

            <p><input type="text" placeholder="Score nuevo" name="txtModificarScoreUsuario"></p>

            <p><input type="submit" value="Modificar"></p>


        </form>

        <p style="color: black"> ${confirmacionModificar}</p>
    </div>

    <!--PANELCUATRO-->
    <div class='recuadro' id="cuatro">

        <form action="buscarPorID-usuario.do" method="post">

            <p><label> Buscar por ID usuario </label></p>

            <p><input type="text" placeholder="Cedula" name="txtBuscarPorIDCedula" ></p>

            <p><input type="submit" value="Buscar por ID"></p>

            <p style="color: black"> ${confirmacionBuscarPorID}</p>

        </form>

    </div>

    <div class='recuadro' id="cinco">

        <form action="mostrarTodos-usuarios.do" method="post">

            <p><label> Mostrar todos los usuarios</label></p>


            <p><input type="submit" value="Mostrar todos"></p>

        </form>
        <ol>
            <c:forEach items="${confirmacionMostrarTodos}" var="nodo">
                <li> <p style="color: black">${nodo.dato} <span></span> </p> </li>
            </c:forEach>
        </ol>

    </div>

    <!--
    <div class="grillaMostrar">

        <p><label> Mostrar todos los tipo productos</label></p>
        <form action="mostrarTodosID-tipoProducto.do" method="post">

             <p><input type="submit" value="Mostrar todos"></p>
        </form>

        <table>

            <thead>
              <tr>
                  <th>Numero</th>
                  <th>Tipo Producto</th>
              </tr>
            </thead>

            <tbody>


                <tr>
                    <td>Adam</td>
                    <td>Johnson</td>
                </tr>

            </tbody>
        </table>
    </div>
    -->

</div>



<script src="webjars/jquery/3.6.0/src/jquery.js"></script>

</body>
</html>