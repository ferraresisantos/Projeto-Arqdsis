package model;

import java.io.Serializable;

public class Passenger implements Comparable<Passenger>, Serializable {

	private String nome, dataNasc, necessidadeEsp, banco, titular,
			dataValidade, tipoDoCartao, email, formtr,tipo,sobrenome;
	private int cpf, rg, fone, cpfDependente, ag, nConta,
			nCartao;

	public Passenger() {
	}

	public Passenger(String nome, String dataNasc, String necessidadeEsp,
			String banco, String titular, String dataValidade,
			String tipoDoCartao, int idPassageiro, int cpf, int rg,
			int fone, int cpfDependente, int ag, int nConta, int nCartao) {

		this.nome = nome;
		this.dataNasc = dataNasc;
		this.necessidadeEsp = necessidadeEsp;
		this.banco = banco;
		this.titular = titular;
		this.dataValidade = dataValidade;
		this.tipoDoCartao = tipoDoCartao;
		this.cpf = cpf;
		this.rg = rg;
		this.fone = fone;
		this.cpfDependente = cpfDependente;
		this.ag = ag;
		this.nConta = nConta;
		this.nCartao = nCartao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNecessidadeEsp() {
		return necessidadeEsp;
	}

	public void setNecessidadeEsp(String necessidadeEsp) {
		this.necessidadeEsp = necessidadeEsp;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getTipoDoCartao() {
		return tipoDoCartao;
	}

	public void setTipoDoCartao(String tipoDoCartao) {
		this.tipoDoCartao = tipoDoCartao;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public int getCpfDependente() {
		return cpfDependente;
	}

	public void setCpfDependente(int cpfDependente) {
		this.cpfDependente = cpfDependente;
	}

	public String getFormtr() {
		return formtr;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEmail() {
		return email;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setCPF(int cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setFormtr(String formtr) {
		this.formtr = formtr;
	}
	@Override
	public String toString() {
		return "Passenger [nome=" + nome + ", dataNasc=" + dataNasc
				+ ", necessidadeEsp=" + necessidadeEsp + ", banco=" + banco
				+ ", titular=" + titular + ", dataValidade=" + dataValidade
				+ ", tipoDoCartao=" + tipoDoCartao + ", cpf=" + cpf + ", rg=" + rg + ", telefone="
				+ fone + ", cpfDependente=" + cpfDependente + ", ag=" + ag
				+ ", nConta=" + nConta + ", nCartao=" + nCartao + "]";
	}

	@Override
	public int compareTo(Passenger o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
