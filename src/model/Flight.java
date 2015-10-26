package model;


public class Flight{
	
	private int codigo;
	private int idVoo;
	private String origem,escala,situacao,tipo;
	private String destino;
	private String datavoo;
	private String hora;
	private double preco;
	private String status;

	public Flight() {}

	public Flight(int idAeronave, int idVoo, String origem, String destino,
			String data, String hora, String status, double preco) {
		super();
//		this.idAeronave = idAeronave;
//		this.idVoo = idVoo;
//		this.origem = origem;
//		this.destino = destino;
//		this.data = data;
//		this.hora = hora;
//		this.status = status;
//		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIdVoo() {
		return idVoo;
	}

	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataVoo() {
		return datavoo;
	}

	public void setDataVoo(String datavoo) {
		this.datavoo = datavoo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setTipo(String stipoituacao) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEscala() {
		return escala;
	}
	public void setEscala(String escala) {
		this.escala = escala;
	}

	@Override
	public String toString() {
		return "Flight [idAeronave=" + codigo + ", idVoo=" + idVoo
				+ ", origem=" + origem + ", destino=" + destino + ", data="
				+ datavoo + ", hora=" + hora + ", preco=" + preco + ", status="
				+ status + "]";
	}

	


}
