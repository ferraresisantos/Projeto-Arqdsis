package model;

public class Ticket {
	private int codigo, idVoo,cpf, idPassagem;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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

	public String getDatavoo() {
		return datavoo;
	}

	public void setDatavoo(String datavoo) {
		this.datavoo = datavoo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getIdPassagem() {
		return idPassagem;
	}

	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}

	private String  nome, sobrenome, origem, destino, datavoo,hora;
	private double valor, taxa;
	
	public Ticket(){
		
	}
	
	public Ticket(int idVoo, int cpf, int idPassagem) {
		
		this.idVoo = idVoo;
		this.cpf = cpf;
		this.idPassagem = idPassagem;
	}

	public int getIdVoo() {
		return idVoo;
	}

	public int getCpf() {
		return cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}


	
}