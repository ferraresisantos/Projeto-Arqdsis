<%@page import="java.util.Collections"%>
<%@page import="model.Airplane"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='pt-br'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<head>
<link rel="stylesheet" href="css/styles.css">

<title>Projeto - ARQDESIS-3ASIN</title>
</head>
<body>

	<div id="nav">

		<h1>
			<p>Compra de Passagens Aéreas
			<p />
		</h1>

		<ul>
    	<li><a href="index.html">Inicio</a></li>
    	<li><a href="">Aeronave</a>
		    <ul>
				<li><a href="registeringAirplane.jsp">Cadastrar</a></li>
				<li><a href="changeAirplane.jsp">Alterar</a></li>
				<li><a href="consultAirplane.jsp">Consultar</a></li>
				<li><a href="excludeAirplane.jsp">Excluir</a></li>
			</ul>
		
		</li>
    	<li><a href="">Passageiro</a>
		
		    <ul>
				<li><a href="registerPassenger.jsp">Cadastrar</a></li>
				<li><a href="changePassenger.jsp">Alterar</a></li>
				<li><a href="consultPassenger.jsp">Consultar</a></li>
				<li><a href="excludePassenger.jsp">Excluir</a></li>
			</ul>
		
		</li>
    	<li><a href="">Vôo</a>
		
		    <ul>
				<li><a href="registerFlight.jsp">Cadastrar</a></li>
				<li><a href="changeFlight.jsp">Alterar</a></li>
				<li><a href="consultFlight.jsp">Consultar</a></li>
				<li><a href="excludeFlight.jsp">Excluir</a></li>
			</ul>
		
		</li>
    	<li><a href="">Passagem</a>
		    <ul>
			    <li><a href="registerTicket.jsp">Comprar</a></li>
				<li><a href="changeTicket.jsp">Alterar</a></li>
				<li><a href="excludeTicket.jsp">Cancelar</a></li>
				<li><a href="consultTicket.jsp">Consultar</a></li>
			</ul>
		
		</li>
		<li><a onclick="window.close()">Sair</a></li>
	</ul>

	</div>

	<h2>
		<p>
			<br>Consultar Aeronave
		</p>
	</h2>

	<div id="meio">
		<form method="get" action="consultAirplane.do"
			id="form_ConsultAirplane">
			<h3>
				<fieldset>
					<legend>Consulta por ID Aeronave</legend>
					<table cellspacing="10">

						<tr>
							<td><label for="codigo">ID Aeronave:</label></td>
							<td align="left"><input type="text" name="codigo"
								size="4"></td>

							<td>
								<div id="botaoConsultar">
									<input type="submit" name="consultar" value="Consultar"
										class="button" />
								</div>
							</td>
						</tr>
					</table>
				</fieldset>

				<br />
			<%
			ArrayList<Airplane> lista = (ArrayList<Airplane>) request.getAttribute("lista");
			if (lista != null){
		        Airplane airplane = lista.get(0);//airplane.getCodigoAeronave();
		         out.println("<fieldset>"
							+"<legend>Dados da Aeronave</legend>"
							+"<table cellspacing=\"10\">"
							+	"<tr>"
							+		"<td><label for=\"qtdassentos\">Quantidade de"
							+				"assentos: </label></td>"
							+		"<td align=\"left\"><input type=\"number\""
							+			"name=\"qtdassentos\" value="+ airplane.getQtdAssentos() + " readonly=\"readonly\"></td>"
							+	"</tr><tr>"
							+		"<td><label for=\"nome\">Companhia:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" value="+ airplane.getNome() +" name=\"nome\""
							+			"size=\"10\" readonly=\"readonly\"></td></tr><tr>"
							+		"<td><label for=\"tipo\">Modelo:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" name=\"tipo\""
							+			"value="+ airplane.getTipo() + " size=\"30\" readonly=\"readonly\"></td></tr></table></fieldset>");
	        
			}else{
				out.println(
						"<fieldset>"
						+"<legend>Dados da Aeronave</legend>"
						+"<table cellspacing=\"10\">"
						+	"<tr>"
						+		"<td><label for=\"qtdassentos\">Quantidade de"
						+				"assentos: </label></td>"
						+		"<td align=\"left\"><input type=\"number\""
						+			"name=\"qtdassentos\" readonly=\"readonly\"></td>"
						+	"</tr><tr>"
						+		"<td><label for=\"nome\">Companhia:</label></td>"
						+		"<td align=\"left\"><input type=\"text\" name=\"nome\""
						+			"size=\"10\" readonly=\"readonly\"></td></tr><tr>"
						+		"<td><label for=\"tipo\">Modelo:</label></td>"
						+		"<td align=\"left\"><input type=\"text\" name=\"tipo\""
						+			"size=\"30\" readonly=\"readonly\"></td></tr></table></fieldset>");
			}
	       %>
	    </form>
		</h3>
	</div>
	<br />

</body>
</html>