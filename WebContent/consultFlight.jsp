<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Flight"%>
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
		<p>
			<br>Consultar Vôo
		</p>
	</h2>

	<div id="meio">
		<form method="post" action="consultFlight.do" id="form_ConsultFlight">
			<h3>
				<fieldset>
					<legend>Consultar Vôo</legend>
					<table cellspacing="10">

						<td><label for="codigo">Id Vôo:</label></td>
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
				ArrayList<Flight> lista = (ArrayList<Flight>) request.getAttribute("lista");
				if (lista != null){
			        Flight flight = lista.get(0);//airplane.getCodigoAeronave(); value=" + flight.getOrigem() + "
			        out.println("<fieldset>"
							+"<legend>Dados do Vôo</legend>"
							+"<table cellspacing=\"10\"><tr>"
							+"<td><label for=\"codigo\">ID:</label></td>"
							+"<td align=\"left\"><input type=\"number\" name=\"codigo\" value=" + flight.getCodigo() + "></td>"
							+"<td><label for=\"escala\">Escala:</label></td>"
							+"<td align=\"left\"><input type=\"date\" name=\"escala\" value=" + flight.getEscala() + "></td></tr><tr>"
							+"<td><label for=\"origem\">Origem:</label></td>"
							+"<td align=\"left\"><input name=\"origem\" value=" + flight.getOrigem() + "></td>"
							+"<td><label for=\"destino\">Destino:</label></td>"
							+"<td align=\"left\"><input name=\"destino\" value=" + flight.getDestino() + "></td></tr><tr>"
							+"<td><label for=\"datavoo\">Data do Vôo:</label></td>"
							+"<td align=\"left\"><input type=\"date\" name=\"datavoo\" value=" + flight.getDataVoo() + "></td>"
							+"<td><label for=\"hora\">Hora:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"hora\" size=\"9\" value=" + flight.getHora() + "></td>"
							+"<td><label for=\"preco\">Preço R$:</label></td>"
							+"<td align=\"left\"><input type=\"number\" name=\"preco\" size=\"9\" value=" + flight.getPreco() + "></td></tr><tr>"
							+"<td><label for=\"situacao\">Situação:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"situacao\" value=" + flight.getSituacao() + "></td>"
							+"<td><label for=\"tipo\">Tipo:</label></td>"
							+"<td align=\"left\"><input type=\"text\" name=\"tipo\"size=\"9\" value=" + flight.getTipo() + ">"
							+"</td></tr></table></fieldset>");
				}else{
					out.println("<fieldset>"
								+"<legend>Dados do Vôo</legend>"
								+"<table cellspacing=\"10\"><tr>"
								+"<td><label for=\"codigo\">ID:</label></td>"
								+"<td align=\"left\"><input type=\"number\" name=\"codigo\"></td>"
								+"<td><label for=\"escala\">Escala:</label></td>"
								+"<td align=\"left\"><input type=\"date\" name=\"escala\"></td></tr><tr>"
								+"<td><label for=\"origem\">Origem:</label></td>"
								+"<td align=\"left\"><input name=\"origem\"></td>"
								+"<td><label for=\"destino\">Destino:</label></td>"
								+"<td align=\"left\"><input name=\"destino\"></td></tr><tr>"
								+"<td><label for=\"datavoo\">Data do Vôo:</label></td>"
								+"<td align=\"left\"><input type=\"date\" name=\"datavoo\"></td>"
								+"<td><label for=\"hora\">Hora:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"hora\" size=\"9\"></td>"
								+"<td><label for=\"preco\">Preço R$:</label></td>"
								+"<td align=\"left\"><input type=\"number\" name=\"preco\" size=\"9\"></td></tr><tr>"
								+"<td><label for=\"situacao\">Situação:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"situacao\"></td>"
								+"<td><label for=\"tipo\">Tipo:</label></td>"
								+"<td align=\"left\"><input type=\"text\" name=\"tipo\"size=\"9\">"
								+"</td></tr></table></fieldset>");
				}
		       %>
				
		</form>
		<br />
		</h3>
	</div>


</body>
</html>