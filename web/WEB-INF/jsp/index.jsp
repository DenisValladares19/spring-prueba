<%-- 
    Document   : index
    Created on : 04-24-2020, 01:59:24 AM
    Copyrigth  : I-Strategies
    Author     : Edgard Palacios
--%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <!-- css de Bootstrap -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <!-- css de Bootstrap -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css"/>
        <title>I-Strategies | Persona</title>
    </head>


    <body style="background:linear-gradient(25deg, white,#CADEF2);">

        <!-- Navegación -->
    <nav class="navbar navbar-expand-md navbar-dark bg-primary fixed-top">
        <div class="container">
            <a class="navbar-brand" href="index.htm">GESTION DE PERSONA</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item ">

                    </li>
                </ul>
                <div class="my-2 my-md-0 ml-auto">
                    <ul class="navbar-nav ">
                        <li class="nav-item "> 
                            <a class="nav-link" href="usuarioEnd.htm">Cerrar Sesión</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </nav>
    <!-- Navegación -->

    <!-- Body -->
    <br />
    <div class="row">
        <div class="container mt-5">
            <div class="col-md-12 mt-2">
                <div class="card">
                    <div class="card-body">
                        <div class="card">
                            <div class="card-header">
                                <h1 class="h3 text-center">Persona</h1>
                            </div>
                            <div class="card-body">
                                <div class="clear-fix"></div>

                                <!-- Formulario de busqueda -->
                                <div class="form-group col-md-6">
                                    <form action="/Strategies/buscar.htm" method="POST">
                                        <div class="form-group">
                                            <label> ID Persona </label>
                                            <div class="row">
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" onkeypress='return event.charCode >= 48 && event.charCode <= 57' name="txtIdPersona"/>  
                                                </div> 
                                                <div class="col-md-3">
                                                    <input class="btn btn-primary" type="submit" name="botton" value="Buscar" id="button-addon2"/>
                                                </div>
                                            </div>
                                        </div>   
                                    </form>
                                </div>
                                <!-- Formulario de busqueda -->


                                <hr>
                                <!-- Formulario de Persona -->
                                <form:form modelAttribute="persona" action="/Strategies/index.htm" autocomplete="off">
                                    <form:hidden path="idPersona"/>

                                    <div class="row mt-1">
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Primer nombre</label>
                                                <form:input path="primerNombre" required="true" cssClass="form-control" placeholder="1° Nombre..."/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Segundo nombre</label>
                                                <form:input path="segundoNombre" cssClass="form-control" placeholder="2° Nombre..."/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Primer apellido</label>
                                                <form:input path="primerApellido" required="true" cssClass="form-control" placeholder="1° Apellido"/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Segundo apellido</label>
                                                <form:input path="segundoApellido" cssClass="form-control" placeholder="2° Apellido"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Fecha de Nacimiento</label>
                                                <form:input path="fecha" required="true" cssClass="form-control" placeholder="Fecha..."/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Sexo</label><br/>
                                                <form:select path="sexo"  cssClass="form-control">
                                                    <form:option  label="Masculino" value="1" cssClass="form-select-input"/>
                                                    <form:option  label="Femenino" value="2" cssClass="form-select-input"/>
                                                </form:select>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Información Adicional</label>
                                        <form:textarea path="info" required="true" cssClass="form-control"/>
                                    </div>
                                    <center>
                                    <div class="row align-items-center justify-content-center">
                                        <div class="col-md-2">
                                            <input type="submit" name="botton" value="Insertar" onclick="confirm('Desea guardar un nuevo registro?');"  class="btn btn-primary btn-block"/>
                                        </div>
                                        <div class="col-md-2">
                                            <input type="submit" name="botton" value="Actualizar" onclick="confirm('Desea modificar este registro?');"  class="btn btn-success btn-block"/>
                                        </div>
                                        <div class="col-md-2">
                                            <input type="submit" name="botton" value="Eliminar" onclick="confirm('Desea eliminar este registro??');"  class="btn btn-danger btn-block"/>
                                        </div>
                                    </div>
                                        </center>
                                </form:form>
                                <!-- Formulario de Persona -->

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="row">
        <div class="container mt-5">
            <div class="card">
                <div class="card-body">

                    <!-- Tabla de Personas -->
                    <h3 class="text-center">Información de Personas</h3>
                    <hr>
                    <div class="table-responsive">
                        <table class="table table-bordered text-center" width="100%" cellspacing="0" id="tablaPersona">
                            <thead style="background-color: rgba(11, 23, 41 , 0.6);">
                                <tr>
                                    <th>ID</th>
                                    <th>Nombre Completo</th>
                                    <th>Fecha de nacimiento</th>
                                    <th>Sexo</th>
                                    <th>Información adicional</th>
                                </tr>
                            </thead>
                            <tbody>
                                <core:forEach var="datos" items="${info}">
                                    <tr>
                                        <td>${datos.idPersona}</td>
                                        <td>${datos.primerNombre} ${datos.segundoNombre} ${datos.primerApellido} ${datos.segundoApellido}</td>
                                        <td>${datos.fecha}</td>
                                        <td>${datos.getSexo()==1?"Masculino":"Femenino"}</td>
                                        <td>${datos.info}</td>
                                    </tr>
                                </core:forEach>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th>ID</th>
                                    <th>Full name</th>
                                    <th>Birthdate</th>
                                    <th>Sex</th>
                                    <th>Additional Information</th>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                    <!-- tabla de Personas -->

                </div>
            </div>
        </div>
    </div>
    <!-- Body -->

    <br>
    <br>
    <br>
    <!-- Footer -->
    <div class="footer-copyright text-center fixed-botton" style="background-color: rgba(11, 23, 41 , 0.8); color: white" >
        <br> 
        © Copyright: &nbsp;&nbsp;&nbsp;
        <h2> I-Strategies || Edgardo Palacios</h2>
        <br>
    </div>
    <!-- Footer -->


    <!-- Scripts de Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.5.0.min.js" integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js" integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU=" crossorigin="anonymous"></script>
    <!-- Scripts de Bootstrap -->


    <!-- Codigo para Mostrar Calendario -->
    <script>
                                                $(document).ready(function () {
                                                    $.datepicker.regional['es'] = {
                                                        closeText: 'Cerrar',
                                                        prevText: '< Ant',
                                                        nextText: 'Sig >',
                                                        currentText: 'Hoy',
                                                        monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
                                                        monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
                                                        dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
                                                        dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb'],
                                                        dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
                                                        weekHeader: 'Sm',
                                                        changeYear: true,
                                                        yearRange: '-100:+0',
                                                        dateFormat: 'yy/mm/dd',
                                                        firstDay: 1,
                                                        isRTL: false,
                                                        showMonthAfterYear: false,
                                                        yearSuffix: ''
                                                    };
                                                    $.datepicker.setDefaults($.datepicker.regional['es']);
                                                    $(function () {
                                                        $("#fecha").datepicker();
                                                    });
                                                });
    </script>
</body>
</html>
