<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

            .tipoProducto , .usuarios , .bancos {
                float: left;
                overflow: hidden;
            }

            .tipoProducto .tipoProductobtn, .usuarios .usuariosbtn , .bancos .bancosbtn {
                font-size: 16px;
                border: none;
                outline: none;
                color: white;
                padding: 14px 16px;
                background-color: inherit;
                font-family: inherit;
                margin: 0;
            }

            .panelNavbar a:hover, .tipoProducto:hover .tipoProductobtn {
                background-color: red;
            }

            .panelNavbar a:hover, .usuarios:hover .usuariosbtn {
                background-color: red;
            }

            .panelNavbar a:hover, .bancos:hover .bancosbtn {
                background-color: red;
            }


            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
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

            .tipoProducto:hover .dropdown-content {
                display: block;
            }

            .usuarios:hover .dropdown-content {
                display: block;
            }

            .bancos:hover .dropdown-content {
                display: block;
            }




            .recuadro {
                border:1px solid black;
                width:49.5%;
                display:inline-block;
                height:49.5%;
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

            .panelesCRUDtiposProductos input[type="submit"] {
                border: none;
                outline: none;
                height: 40px;
                background: #33CCCC;
                color: #fff;
                font-size: 18px;
                border-radius: 20px;
            }

            .panelesCRUDtiposProductos input[type="submit"]:hover {
                cursor: pointer;
                background: #35c0cd;
                color: #000;
            }

            .panelesCRUDtiposProductos input[type="text"] {
                border: none;
                border-bottom: 1px solid #fff;
                background: #f9f9f9;
                outline: none;
                height: 40px;
                color: #000000;
                font-size: 16px;
            }

            .panelesCRUDtiposProductos label {
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
            <a href="#home">Tipo Productos</a>
            <a href="#home">Usuarios</a>
            <a href="#home">Bancos</a>
            <!--
            <div class="tipoProducto">
                <button class="tipoProductobtn">Tipo producto
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="#">Agregar</a>
                    <a href="#">Eliminar</a>
                    <a href="#">Modificar</a>
                    <a href="#">Mostrar</a>
                    <a href="#">MostrarPorID</a>
                </div>
            </div>

            <div class="usuarios">
                <button class="usuariosbtn">Usuarios
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="#">Agregar</a>
                    <a href="#">Eliminar</a>
                    <a href="#">Modificar</a>
                    <a href="#">Mostrar</a>
                    <a href="#">MostrarPorID</a>
                </div>
            </div>

            <div class="bancos">
                <button class="bancosbtn">Bancos
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="#">Agregar</a>
                    <a href="#">Eliminar</a>
                    <a href="#">Modificar</a>
                    <a href="#">Mostrar</a>
                    <a href="#">MostrarPorID</a>
                </div>
            </div>
            -->
        </div>

    </nav>





    <div class="panelPrincipal">
        <h1><label> Bienvenido ${user} </label></h1>
          <p></p>
             <p>Navegue por las distintas opciones de tu proyecto:</p>

        <!--
         <ol>
               <c:forEach items="${todos}" var="todo">
                  <li>${todo.name}<span></span> <a href="delete-todo.do?uuid=${todo.uuid}">Delete</a></li>
               </c:forEach>
         </ol>
           <form action="add-todo.do" method="post">
                <input type="text" name="newTodo">
                <input type="submit" value="Add">
          </form> -->
    </div>

    <div class="panelesCRUDtiposProductos">

        <!--PANELUNO-->
        <div class='recuadro' id="uno">

            <form action="añadir-tipoProducto.do" method="post">

                 <p><label> Agregar tipo producto </label></p>

                  <p><input type="text" placeholder="Identificador" name="txtAgregarIdTipoProducto" ></p>

                   <p><input type="text" placeholder="Nombre" name="txtAgregarNombreTipoProducto"></p>


                   <p><input type="submit" value="Agregar"></p>

            </form>

            <p style="color: black"> ${confirmacionAgregar}</p>
         </div>


        <!--PANELDOS-->
        <div class='recuadro' id="dos">

            <form action="eliminar-tipoProducto.do" method="post">

                 <p><label> Eliminar tipo producto </label></p>

                 <p><input type="text" placeholder="Identificador" name="txtEliminarTipoProducto" ></p>

                 <p><input type="submit" value="Eliminar"></p>

            </form>

            <p style="color: black"> ${confirmacionEliminar}</p>

        </div>

        <br>

        <!--PANELTRES-->
        <div class='recuadro' id="tres">

            <form action="modificar-tipoProducto.do" method="post">
                 <p><label> Modificar tipo producto </label></p>

                 <p><input type="text" placeholder="Identificador" name="txtModificarIdTipoProducto" ></p>

                 <p><input type="text" placeholder="Nuevo nombre" name="txtModificarNombreTipoProducto"></p>

                 <p><input type="submit" value="Modificar"></p>


            </form>

            <p style="color: black"> ${confirmacionModificar}</p>
        </div>

        <!--PANELCUATRO-->
        <div class='recuadro' id="cuatro">

            <form action="buscarPorID-tipoProducto.do" method="post">

                <p><label> Buscar por ID tipo producto </label></p>

                <p><input type="text" placeholder="Identificador" name="txtBuscarPorIdTipoProducto" ></p>

                <p><input type="submit" value="Buscar por ID"></p>

                <p style="color: black"> ${confirmacionBuscarPorID}</p>

            </form>

        </div>

        <div class="grillaMostrar">

            <p><label> Mostrar todos los tipo productos</label></p>
            <form action="mostrarTodosID-tipoProducto.do" method="post">

                 <p><input type="submit" value="Mostrar todos"></p>
            </form>


            <table>
                <tr>
                    <th>Numero</th>
                    <th>Tipo Producto</th>
                </tr>
                <tr>
                    <td>Jill</td>
                    <td>Smith</td>
                </tr>
                <tr>
                    <td>Eve</td>
                    <td>Jackson</td>
                </tr>
                <tr>
                    <td>Adam</td>
                    <td>Johnson</td>
                </tr>
            </table>
        </div>

    </div>



          <script src="webjars/jquery/3.6.0/src/jquery.js"></script>

    </body>
</html>
