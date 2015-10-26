<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Ticket"%>
<%@page import="java.util.ArrayList"%>
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
		<p><br>Consultar Passagem</p><br>
	</h2>

	<div id="meio">
		<form method="get" action="consultTicket.do"
			id="form_registerPassenger">
			<h3>
			<fieldset>
					<legend>Consultar Passagem</legend>
					<table cellspacing="10">

						<td><label for="codigo">ID Passagem:</label></td>
						<td align="left"><input type="number" name="codigo">
						<td>
							<div id="botao">
								<input type="submit" name="consultar" value="Consultar"
									class="button" />
							</div>
						</td>
						</td>
					</table>
				</fieldset>
				<%
				ArrayList<Ticket> lista = (ArrayList<Ticket>) request.getAttribute("lista");
				if (lista != null){
					Ticket ticket = lista.get(0);//airplane.getCodigoAeronave(); value=" + ticket.getHora() + "
			        out.println("<fieldset>"
							+"<legend>Consultar Passagem</legend>"
							+"<table cellspacing=\"10\"><tr>"
							+"<td><label for=\"codigo\">Codigo:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"codigo\" value=" + ticket.getCodigo() + "></td></tr><tr>"
							+"<td><label for=\"cpf\">CPF:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"cpf\" size=\"11\"maxlength=\"11\" value=" + ticket.getCpf() + "></td></tr><tr>"
							+"<td><label for=\"nome\">Nome:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"nome\" value=" + ticket.getNome() + "></td></tr><tr>"
							+"<td><label for=\"sobrenome\">Sobrenome:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"sobrenome\" value=" + ticket.getSobrenome() + "></td></tr><tr>"
							+"<td><label for=\"origem\">Origem:</label></td>"
							+"<td align=\"left\"><input name=\"origem\" value=" + ticket.getOrigem() + "></td></tr><tr>"
							+"<td><label for=\"destino\">Destino:</label></td>"
							+"<td align=\"left\"><input name=\"destino\" value=" + ticket.getDestino() + "></td></tr><tr>"
							+"<td><label for=\"datavoo\">Data:</label></td>"
							+"<td><align=\"left\"> <input type=\"text\" name=\"databoo\" value=" + ticket.getDatavoo() + "></tr><tr>"
							+"<td><label for=\"hora\">Hora:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"hora\" value=" + ticket.getHora() + "></td></tr><tr>"
							+"<td><label for=\"valor\">Valor:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"valor\"size=\"11\" value=" + ticket.getValor() + "></td></tr><tr>"
							+"<td><label for=\"taxa\">Taxa:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"taxa\"size=\"11\" value=" + ticket.getTaxa() + "></td></tr>"
							+"</table></fieldset>");
				}else{
					out.println("<fieldset>"
								+"<legend>Consultar Passagem</legend>"
								+"<table cellspacing=\"10\"><tr>"
								+"<td><label for=\"codigo\">Codigo:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"codigo\"></td></tr><tr>"
								+"<td><label for=\"cpf\">CPF:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"cpf\" size=\"11\"maxlength=\"11\"></td></tr><tr>"
								+"<td><label for=\"nome\">Nome:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"nome\"></td></tr><tr>"
								+"<td><label for=\"sobrenome\">Sobrenome:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"sobrenome\"></td></tr><tr>"
								+"<td><label for=\"origem\">Origem:</label></td>"
								+"<td align=\"left\"><input name=\"origem\"></td></tr><tr>"
								+"<td><label for=\"destino\">Destino:</label></td>"
								+"<td align=\"left\"><input name=\"destino\"></td></tr><tr>"
								+"<td><label for=\"datavoo\">Data:</label></td>"
								+"<td><align=\"left\"> <input type=\"text\" name=\"databoo\"></tr><tr>"
								+"<td><label for=\"hora\">Hora:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"hora\"></td></tr><tr>"
								+"<td><label for=\"valor\">Valor:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"valor\"size=\"11\"></td></tr><tr>"
								+"<td><label for=\"taxa\">Taxa:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"taxa\"size=\"11\"></td></tr>"
								+"</table></fieldset>");
					}
			       %>
				
				<br />
				
			</h3>
	</div>

</body>
</html>