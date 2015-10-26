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
			<br>Alterar, Consultar e Excluir Passageiros
		</p>
		<br>
	</h2>
	
	<br/>
	<div id="meio">
		<form method="get" action="changePassenger.do" id="form_ACEPassenger">
			<h3>

<!-- 				<fieldset>
					<legend>Dados do Passageiro</legend>
					<table cellspacing="10">
						<tr>
							<td><label for="cpf">CPF:</label></td>
							<td align="left"><input type="text" name="cpf" size="11"
								maxlength="11"></td>

							<td>
								<div id="botaoConsultar">
									<input type="submit" name="consultar" value="Consultar"
										class="button"/>
								</div>
							</td>
						</tr>

					</table>

				</fieldset> -->
				<br />

				<fieldset>
					<legend>Dados do Passageiro</legend>
					<table cellspacing="10">

						<tr>
							<td><label for="nome">Nome:</label></td>
							<td align="left"><input type="text" name="nome"></td>
						</tr>
						
						<tr>
							<td><label for="sobrenome">Sobrenome:</label></td>
							<td align="left"><input type="text" name="sobrenome"></td>
						</tr>
						
						<tr>
							<td><label for="cpf">CPF:</label></td>
							<td align="left"><input type="text" name="cpf" size="11"
								maxlength="11"></td>
						</tr>

						<tr>
							<td><label for="dataNasc">Data de Nascimento:</label></td>
							<td align="left"><input type="date" name="dataNasc"></td>
						</tr>

						<tr>
							<td><label for="fone">Telefone:</label></td>
							<td><align="left"> <input type="text" name="fone"
									size="2" maxlength="2"> <align="left"> <input
									type="text" name="fone" size="9" maxlength="9"></td>
						</tr>
						
						<tr>
							<td><label for="banco">Banco:</label></td>
							<td align="left"><input type="text" name="banco"></td>
						</tr>

						<tr>
							<td><label for="tipo">Tipo:</label></td>
							<td align="left"><input type="text" name="tipo"
								size="11"></td>
						</tr>
						
						<tr>
							<td><label for="formtr">Formtr:</label></td>
							<td align="left"><input type="text" name="formtr"
								size="11"></td>
						</tr>

					</table>
					<tr>
						<td>
							<div id="botao">
								<input type="submit" name="confirmar" value="Confirmar"
									class="button" />
							</div>
						</td>
					</tr>
				</fieldset>
				<br />
			</h3>
	</div>
	
	<br/>
	<footer> <p1>Projeto WEB USJT-ARQDSIS-3ASIN-2015.</p1> </footer>

</body>
</html>