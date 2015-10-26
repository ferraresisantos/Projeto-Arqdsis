package model;

import java.io.Serializable;

public class Airplane implements Comparable<Airplane>, Serializable {

	private static final long serialVersionUID = 1L;
	private String tipo, nome;
	private int codigo, qtdassentos;

	public Airplane() {
	}

	public Airplane(int codigo, String nome, int qtdassentos, String tipo){
		setCodigoAeronave(codigo);
		setQtdAssentos(qtdassentos);
		setTipo(tipo);
		setNome(nome);
	}

	public int getCodigoAeronave() {
		return codigo;
	}

	public void setCodigoAeronave(int codigo) {
		this.codigo = codigo;
	}

	public int getQtdAssentos() {
		return qtdassentos;
	}

	public void setQtdAssentos(int qtdassentos) {
		this.qtdassentos = qtdassentos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	


	@Override
	public String toString() {
		return "Airplane [modelo=" + tipo + ", nomeCompanhia="
				+ nome + ", idAeronave=" + codigo
				+ ", quantidadeAssentos=" + qtdassentos + "]";
	}

	@Override
	public int compareTo(Airplane o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
