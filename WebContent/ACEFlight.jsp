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

			<li><a onclick="window.close()">Sair</a></li>

			<li><a href="">Relátorio</a>

				<ul>
					<li><a href="indexRelatorioDiarios.html">Relátorios de
							Vendas</a></li>
				</ul></li>

			<li><a href="">Passagem</a>

				<ul>
					<li><a href="indexComprarPassagem.html">Comprar Passagem</a></li>
					<li><a href="indexCAPassagem.html">Consultar-Alterar</a></li>
					<li><a href="indexCancelarPassagem.html">Cancelar Passagem</a></li>
				</ul></li>

			<li><a href="">Vôo</a>

				<ul>
					<li><a href="indexCadastrarVoos.html">Cadastrar</a></li>
					<li><a href="indexACEVoos.html">Alterar-Consultar-Excluir</a></li>
				</ul></li>

			<li><a href="">Passageiro</a>

				<ul>
					<li><a href="indexCadastrarPassageiro.html">Cadastrar</a></li>
					<li><a href="indexACEPassageiro.html">Alterar-Consultar-Excluir</a></li>
				</ul></li>

			<li><a href="">Aeronave</a>

				<ul>
					<li><a href="indexCadastrarAeronave.html">Cadastrar</a></li>
					<li><a href="indexACEAeronave.html">Alterar-Consultar-Excluir</a></li>
				</ul></li>

			<li><a href="index.html">Inicio</a></li>

		</ul>

	</div>

	<h2>
		<p>
			<br>Alterar, Consultar e Excluir Vôos
		</p>
		<br>
	</h2>

	<br />
	<div id="meio">
		<form method="post" action="ACEVoo.do" id="form_ACEVoo">
			<h3>
				<fieldset>
					<legend>Consultar Vôo</legend>
					<table cellspacing="10">

						<td><label for="flightID">Id Vôo:</label></td>
						<td align="left"><input type="number" name="flightID">
						<td>
							<div id="botao">
								<input type="submit" name="consultar" value="Consultar"
									class="button" />
							</div>
						</td>
						</td>

					</table>
				</fieldset>

				<fieldset>
					<legend>Dados do Vôo</legend>
					<table cellspacing="10">

						<tr>
							<td><label for="origem">Origem:</label></td>
							<td align="left"><input type="text" name="origem"></td>

							<td><label for="destino">Destino:</label></td>
							<td align="left"><input type="text" name="destino"></td>
						</tr>

						<tr>
							<td><label for="data">Data do Vôo:</label></td>
							<td align="left"><input type="date" name="data"></td>

							<td><label for="hora">Hora:</label></td>
							<td align="left"><input type="text" name="hora" size="9"></td>

							<td><label for="preco">Preço R$:</label></td>
							<td align="left"><input type="number" name="preco" size="9"></td>
						</tr>

						<tr>
							<td><label for="escalas">Status:</label></td>
							<td align="left"><select name="escala">
									<option value="normal">Normal</option>
									<option value="cancelado">Cancelado</option>
									<option value="atrasado">Atrasado</option>
									<option value="suspenso">Suspenso</option>
							</select></td>

							<td><label for="IdAeronave">Codigo Aeronave:</label></td>
							<td align="left"><input type="number" name="IdAeronave"
								size="9"></td>

						</tr>

						<tr>
							<td>
								<div id="botaoExcluir">
									<input type="submit" name="excluir" value="Excluir"
										class="button" />
								</div>
							</td>

							<td>
								<div id="botaoAlterar">
									<input type="submit" name="alterar" value="Alterar"
										class="button" />
								</div>
							</td>
						</tr>
					</table>
				</fieldset>
				<br />
			</h3>
	</div>
	<br />

	<footer> <p1>Projeto WEB USJT-ARQDSIS-3ASIN-2015.</p1> </footer>

</body>
</html>