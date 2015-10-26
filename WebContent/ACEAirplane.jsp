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
			<br>Adicionar, Consultar e Excluir Aeronaves
		</p>
		<br>
	</h2>

	<br />
	<div id="meio">
		<form method="get" action="ConsultAirplane.do" id="form_ACEAeronave">
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
			</h3>
		</form>
		<form method="get" action="ChangeAirplane.do" id="form_ACEAeronaveC">
			<fieldset>
				<legend>Dados da Aeronave</legend>
				<table cellspacing="10">

					<tr>
						<td><label for="qtdaseentos">Quantidade de
								assentos: </label></td>
						<td align="left"><input type="number"
							name="qtdassentos" size="6"></td>
					</tr>

					<tr>
						<td><label for="nome">Companhia:</label></td>
						<td align="left"><select name="nome">
								<option value="tam">TAM</option>
								<option value="gol">GOL</option>
								<option value="azul">AZUL</option>
						</select></td>
					</tr>

					<tr>
						<td><label for="tipo">Modelo:</label></td>
						<td align="left"><select name="tipo">
								<option value="Airbus">Airbus</option>
								<option value="Boeing">Boeing</option>
								<option value="Jatinho">Jatinho Particular</option>
						</select></td>
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
		</form>
	</div>
	<br />

	<footer> <p1>Projeto WEB USJT-ARQDSIS-3ASIN-2015.</p1> </footer>

</body>
</html>