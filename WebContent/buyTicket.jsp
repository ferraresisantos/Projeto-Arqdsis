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
					<li><a href="ticketReport.jsp">Relátorios de Passagem</a></li>
				</ul></li>

			<li><a href="">Passagem</a>

				<ul>
					<li><a href="buyTicket.jsp">Comprar Passagem</a></li>
					<li><a href="consultTicket.jsp">Consultar</a></li>
					<li><a href="changeTicket.jsp">Alterar</a></li>
					<li><a href="cancelTicket.jsp">Cancelar</a></li>
				</ul></li>

			<li><a href="">Vôo</a>

				<ul>
					<li><a href="registerFlight.jsp">Cadastrar</a></li>
					<li><a href="changeFlight.jsp">Alterar</a></li>
					<li><a href="consultFlight.jsp">Consultar</a></li>
					<li><a href="excludeFlight.jsp">Excluir</a></li>
				</ul></li>

			<li><a href="">Passageiro</a>

				<ul>
					<li><a href="registerPassenger.jsp">Cadastrar</a></li>
					<li><a href="changePassenger.jsp">Alterar</a></li>
					<li><a href="consultPassenger.jsp">Consultar</a></li>
					<li><a href="excludePassenger.jsp">Excluir</a></li>
				</ul></li>

			<li><a href="">Aeronave</a>

				<ul>
					<li><a href="registeringAirplane.jsp">Cadastrar</a></li>
					<li><a href="changeAirplane.jsp">Alterar</a></li>
					<li><a href="consultAirplane.jsp">Consultar</a></li>
					<li><a href="excludeAirplane.jsp">Excluir</a></li>
				</ul></li>

			<li><a href="index.html">Inicio</a></li>

		</ul>

	</div>

	<h2>
		<p>
			<br>Comprar Passagem
		</p>
		<br>
	</h2>

	<div id="meio">
		<form method="post" action="BuyTicket.do" id="form_BuyTicket">
			<div id="t1">
				<h3>
					<fieldset>
						<legend>Selecione um Vôo</legend>
						<table cellspacing="10">

							<tr>

								<td><label for="origem">Origem:</label></td>
								<td align="left"><select name="origem">
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
								</select></td>

								<td><label for="destino">Destino:</label></td>
								<td align="left"><select name="destino">
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
								</select></td>
							</tr>

							<tr>
								<br />
							</tr>

							<tr>
								<td><div id="botaoProximo">
										<input type="button" href="#" onclick="Mudarestado('t2','t1')"
											name="proximo" value="Proximo" class="button" />
									</div></td>
							</tr>
						</table>
					</fieldset>
			</div>

			<div id="t2">
				<fieldset>
					<legend>Dados Vôo</legend>
					<tr>
						<table id="t01">
							<br>
							<tr>
								<th name="idVoo">Num Vôo</th>
								<th name="origem">Origem</th>
								<th name="destino">Destino</th>
								<th name="data">Data</th>
								<th name="hora">Hora</th>
								<th name="preco">Preço</th>
								<th name="cpf">CPF</th>
								<th name="assentos">Assentos</th>
								<th name="selecionar">Selecionar</th>
							</tr>
							<tr>
								<td align="left"><input type="number" name="idVoo" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="origem" size="20"
									maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="text" name="destino"
									size="20" maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="date" name="data" size="11"
									maxlength="11" readonly="readonly"></td>
								<td align="left"><input type="text" name="hora" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="preco" size="7"
									maxlength="7" readonly="readonly"></td>
								<td align="left"><input type="number" name="cpf" size="11"
									maxlength="11"></td>
								<td align="left"><select name="assentos">
										<option value="1">1</option>
										<option value="2">2</option>
								</select></td>
								<td><div id="botao">
										<input type="submit" name="comprar" value="Comprar"
											class="button" />
									</div></td>
							</tr>
							<tr>
								<td align="left"><input type="number" name="idVoo" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="origem" size="20"
									maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="text" name="destino"
									size="20" maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="date" name="data" size="11"
									maxlength="11" readonly="readonly"></td>
								<td align="left"><input type="text" name="hora" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="preco" size="7"
									maxlength="7" readonly="readonly"></td>
								<td align="left"><input type="number" name="cpf" size="11"
									maxlength="11"></td>
								<td align="left"><select name="assentos">
										<option value="1">1</option>
										<option value="2">2</option>
								</select></td>
								<td><div id="botao">
										<input type="submit" name="comprar" value="Comprar"
											class="button" />
									</div></td>
							</tr>

							<tr>
								<td align="left"><input type="number" name="idVoo" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="origem" size="20"
									maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="text" name="destino"
									size="20" maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="date" name="data" size="11"
									maxlength="11" readonly="readonly"></td>
								<td align="left"><input type="text" name="hora" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="preco" size="7"
									maxlength="7" readonly="readonly"></td>
								<td align="left"><input type="number" name="cpf" size="11"
									maxlength="11"></td>
								<td align="left"><select name="assentos">
										<option value="1">1</option>
										<option value="2">2</option>
								</select></td>
								<td><div id="botao">
										<input type="submit" name="comprar" value="Comprar"
											class="button" />
									</div></td>
							</tr>

							<tr>
								<td align="left"><input type="number" name="idVoo" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="origem" size="20"
									maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="text" name="destino"
									size="20" maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="date" name="data" size="11"
									maxlength="11" readonly="readonly"></td>
								<td align="left"><input type="text" name="hora" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="preco" size="7"
									maxlength="7" readonly="readonly"></td>
								<td align="left"><input type="number" name="cpf" size="11"
									maxlength="11"></td>
								<td align="left"><select name="assentos">
										<option value="1">1</option>
										<option value="2">2</option>
								</select></td>
								<td><div id="botao">
										<input type="submit" name="comprar" value="Comprar"
											class="button" />
									</div></td>
							</tr>

							<tr>
								<td align="left"><input type="number" name="idVoo" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="origem" size="20"
									maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="text" name="destino"
									size="20" maxlength="20" readonly="readonly"></td>
								<td align="left"><input type="date" name="data" size="11"
									maxlength="11" readonly="readonly"></td>
								<td align="left"><input type="text" name="hora" size="5"
									maxlength="5" readonly="readonly"></td>
								<td align="left"><input type="text" name="preco" size="7"
									maxlength="7" readonly="readonly"></td>
								<td align="left"><input type="number" name="cpf" size="11"
									maxlength="11"></td>
								<td align="left"><select name="assentos">
										<option value="1">1</option>
										<option value="2">2</option>
								</select></td>
								<td><div id="botao">
										<input type="submit" name="comprar" value="Comprar"
											class="button" />
									</div></td>
							</tr>

						</table>
						<br>

						<br />
						<fieldset>
							<table cellspacing="5">
								<tr>
									<td><label for="legenda" id="legenda">J = Assento
											Janela, M = Assento Meio, C = Assento Corredor</label></td>
								</tr>

								<tr>
									<td>
										<div id="botaoVoltar">
											<input type="button" href="#"
												onclick="Mudarestado('t1','t2')" name="voltar"
												value="Voltar" class="button" />
										</div>
									</td>
								</tr>
							</table>
						</fieldset>
						<br />
						</h3>
			</div>


			<script>
				function Mudarestado(id, div2) {
					var divstyle = new String();
					divstyle = document.getElementById(id).style.display;

					var divAux = new String();
					divAux = document.getElementById(div2).style.display;

					if (divAux == "block" || divAux == "") {
						document.getElementById(div2).style.display = "none";
					}

					document.getElementById(id).style.display = "block";
					return false;
				}
			</script>

			<footer> <p1>Projeto WEB USJT-ARQDSIS-3ASIN-2015.</p1> </footer>
</body>
</html>