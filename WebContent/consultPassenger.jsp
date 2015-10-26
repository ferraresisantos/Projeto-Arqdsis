<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Passenger"%>
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
			<br>Consultar Passageiros
		</p>
	</h2>

	<div id="meio">
		<form method="post" action="consultPassenger.do"
			id="form_ConsultPassenger">
			<h3>
			<fieldset>
					<legend>Consulta por CPF</legend>
					<table cellspacing="10">

						<tr>
							<td><label for="cpf">CPF:</label></td>
							<td align="left"><input type="text" name="cpf"
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
				ArrayList<Passenger> lista = (ArrayList<Passenger>) request.getAttribute("lista");
				if (lista != null){
					Passenger passenger = lista.get(0);//airplane.getCodigoAeronave();
					out.println("<fieldset>"
							+"<legend>Dados do Passageiro</legend>"
							+"<table cellspacing=\"10\">"
							+	"<tr>"
							+		"<td><label for=\"nome\">Nome:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" name=\"nome\" value="+ passenger.getNome() +"></td>"
							+	"</tr>"
							+	"<tr>"
							+	"<td><label for=\"sobrenome\">Sobrenome:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" name=\"sobrenome\" value="+ passenger.getSobrenome() +"></td>"
							+	"</tr>"
							+	"<tr>"
							+	"<td><label for=\"cpf\">CPF:</label></td>"
							+	"	<td align=\"left\"><input type=\"text\" name=\"cpf\" size=\"11\" value="+ passenger.getCpf() +""
							+		"	maxlength=\"11\"></td>"
							+	"</tr>"
							+	"<tr>"
							+		"<td><label for=\"dataNasc\">Data de Nascimento:</label></td>"
							+		"<td align=\"left\"><input type=\"date\" name=\"dataNasc\" value="+ passenger.getDataNasc() +"></td>"
							+	"</tr>"
							+	"<tr>"
							+	"	<td><label for=\"fone\">Telefone:</label></td>"
							+	"	<td><align=\"left\"><align=\"left\"> <input"
							+				"type=\"text\" name=\"fone\" size=\"9\" maxlength=\"9\" value="+ passenger.getFone()+"></td>"
							+	"</tr>	"
							+	"<tr>"
							+		"<td><label for=\"email\">Email:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" name=\"email\" value="+ passenger.getEmail() +"></td>"
							+	"</tr>"
							+	"<tr>"
							+		"<td><label for=\"tipo\">Tipo:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" name=\"tipo\""
							+			"size=\"11\" value="+ passenger.getTipo() +"></td>"
							+	"</tr><tr>"
							+		"<td><label for=\"formtr\">Formtr:</label></td>"
							+		"<td align=\"left\"><input type=\"text\" name=\"formtr\""
							+			"size=\"11\" value="+ passenger.getFormtr() +"></td>"
							+	"</tr></table></fieldset>");
		        
				}else{
					out.println("<fieldset>"
								+"<legend>Dados do Passageiro</legend>"
								+"<table cellspacing=\"10\">"
								+	"<tr>"
								+		"<td><label for=\"nome\">Nome:</label></td>"
								+		"<td align=\"left\"><input type=\"text\" name=\"nome\"></td>"
								+	"</tr>"
								+	"<tr>"
								+	"<td><label for=\"sobrenome\">Sobrenome:</label></td>"
								+		"<td align=\"left\"><input type=\"text\" name=\"sobrenome\"></td>"
								+	"</tr>"
								+	"<tr>"
								+	"<td><label for=\"cpf\">CPF:</label></td>"
								+	"	<td align=\"left\"><input type=\"text\" name=\"cpf\" size=\"11\""
								+		"	maxlength=\"11\"></td>"
								+	"</tr>"
								+	"<tr>"
								+		"<td><label for=\"dataNasc\">Data de Nascimento:</label></td>"
								+		"<td align=\"left\"><input type=\"date\" name=\"dataNasc\"></td>"
								+	"</tr>"
								+	"<tr>"
								+	"	<td><label for=\"fone\">Telefone:</label></td>"
								+	"	<td><align=\"left\"><align=\"left\"> <input"
								+				"type=\"text\" name=\"fone\" size=\"9\" maxlength=\"9\"></td>"
								+	"</tr>	"
								+	"<tr>"
								+		"<td><label for=\"banco\">Banco:</label></td>"
								+		"<td align=\"left\"><input type=\"text\" name=\"banco\"></td>"
								+	"</tr>"
								+	"<tr>"
								+		"<td><label for=\"tipo\">Tipo:</label></td>"
								+		"<td align=\"left\"><input type=\"text\" name=\"tipo\""
								+			"size=\"11\"></td>"
								+	"</tr><tr>"
								+		"<td><label for=\"formtr\">Formtr:</label></td>"
								+		"<td align=\"left\"><input type=\"text\" name=\"formtr\""
								+			"size=\"11\"></td>"
								+	"</tr></table></fieldset>");
				}
		       %>
				
		</form>
		</h3>
	</div>


</body>
</html>