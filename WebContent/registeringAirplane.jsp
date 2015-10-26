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
		<p><br>Cadastrar Aeronave</p><br>
	</h2>


	<div id="meio">
		<form method="post" action="cadastrarAeronave.do"
			id="form_cadastrarAeronave">
			<h3>
				<fieldset>
					<legend>Dados da Aeronave</legend>
					<table cellspacing="10">
						<tr>
							<td><label for="codigo">ID: </label></td>
							<td align="left"><input type="number"
								name="codigo" size="6"></td>
						</tr>
						<tr>
							<td><label for="nome">Companhia:</label></td>
							<td align="left"><select name="nome">
									<option value="Tam">Tam</option>
							</select></td>
						</tr>

						<tr>
							<td><label for="qtdassentos">Quantidade de
									assentos: </label></td>
							<td align="left"><input type="number"
								name="qtdassentos" size="6"></td>
						</tr>

						<tr>
							<td><label for="tipo">Modelo:</label></td>
							<td align="left"><select name="tipo">
									<option value="Airbus">Airbus</option>
									<option value="Boeing">Boeing</option>
									<option value="Jatinho_Particular">Jatinho Particular</option>
							</select></td>
						</tr>

						<tr>
							<td>
								<div id="botao">
									<input type="submit" name="confirmar" value="Confirmar"
										class="button" />
								</div>
							</td>
						</tr>

					</table>

				</fieldset>
				<br />
			</h3>
	</div>


</body>
</html>