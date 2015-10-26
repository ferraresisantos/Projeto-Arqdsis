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
			<br>Relatórios de Vendas Diários
		</p>
		<br>
	</h2>

	<div id="meio">
		<form method="get" action="TicketReport.do" id="form_TicketReport">
			<h3>
				<fieldset>
					<legend>Relatorio de consulta de Passagens Vendidas</legend>
					<table cellspacing="10">

						<tr>
							<td><label for="dataPassagem">Data:</label></td>
							<td align="left"><input type="date" name="dataPassagem"
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

				<fieldset>

					<legend>Dados da Consulta</legend>

					<table id="t01">
						<br>
						<tr>
							<th name="origem">Origem</th>
							<th name="destino">Destino</th>
							<th name="data">Data</th>
							<th name="hora">Hora</th>
							<th name="preco">Preço</th>
							<th name="nome">Nome</th>
							<th name="cpf">CPF</th>
							<th name="telefone">Telefone</th>

						</tr>
						<tr>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
						</tr>
						<tr>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
							<td>teste</td>
						</tr>

					</table>
					<br>

				</fieldset>
			</h3>
		</form>
	</div>
	<br />



</body>
</html>