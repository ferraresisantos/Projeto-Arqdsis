package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.TOFactory;
import model.Airplane;
import model.Flight;
import model.Passenger;
import model.Ticket;
import to.AirplaneTO;
import to.FlightTO;
import to.TicketTO;

public abstract class TicketDAO {
	public abstract Connection conectar() throws SQLException;

	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}

	public TicketTO adicionarPassagem(int codigo, int cpf,String nome, String sobrenome, String origem, String destino, String datavoo, String hora,
			double valor, double taxa) throws Exception {
		String sqlCadastrar = "INSERT into passagem(codigo, cpf, nome, sobrenome, origem, destino, datavoo,hora, valor, taxa,cod_voo) values (?,?,?,?,?,?,?,?,?,?,1)";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		TicketTO to = TOFactory.getTicketTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlCadastrar);

			pst.setInt(1, codigo);
			pst.setInt(2, cpf);
			pst.setString(3, nome);
			pst.setString(4, sobrenome);
			pst.setString(5, origem);
			pst.setString(6, destino);
			pst.setString(7, datavoo);
			pst.setString(8, hora);
			pst.setDouble(9, valor);
			pst.setDouble(10, taxa);
			
			pst.executeUpdate();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					desconectar(conn);
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
		}

		return to;
	}

	public TicketTO excluirPassagem(int codigo) throws Exception {
		String sqlDeletar = "delete from passagem where codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		TicketTO to = TOFactory.getTicketTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlDeletar);
			pst.setInt(1, codigo);
			pst.executeUpdate();  	
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					desconectar(conn);
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
		}

		return to;
	}

	public TicketTO alterarPassagem(int codigo, int cpf,String nome, String sobrenome, String origem, String destino, String datavoo, String hora,
			double valor, double taxa) throws Exception {
		String sqlAlterar = "Update passagem set  cpf=?, nome=?, sobrenome=?, origem=?, destino=?, datavoo=?,hora=?, valor=?, taxa=? where codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		TicketTO to = TOFactory.getTicketTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlAlterar);
			pst.setInt(1, cpf);
			pst.setString(2, nome);
			pst.setString(3, sobrenome);
			pst.setString(4, origem);
			pst.setString(5, destino);
			pst.setString(6, datavoo);
			pst.setString(7, hora);
			pst.setDouble(8, valor);
			pst.setDouble(9, taxa);
			pst.setInt(10,codigo);
			pst.executeUpdate();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					desconectar(conn);
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
		}

		return to;
	}

	public TicketTO consultarPassagem(int codigo) throws Exception {

		String sqlConsultar = "Select * from passagem where codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		Ticket passagem = new Ticket();
		TicketTO to = TOFactory.getTicketTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, codigo);
			rs = pst.executeQuery();
			while (rs.next()) {
//				passagem.setIdVoo(rs.getInt(2));
				passagem.setIdPassagem(rs.getInt(3));
				passagem.setCpf(rs.getInt(4));
				to.add(passagem);
			}
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					desconectar(conn);
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
		}
		return to;
	}
	public TicketTO consultarPassagem(Ticket passagem) throws Exception {

		String sqlConsultar = "SELECT codigo,cpf, nome, sobrenome, origem, destino, datavoo,hora, valor, taxa from passagem where codigo = ?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Ticket ticket = new Ticket();
		TicketTO to = TOFactory.getTicketTO();
		
		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, ticket.getCodigo());
			rs = pst.executeQuery();
			while(rs.next()){
				ticket.setCodigo(rs.getInt(1));
				ticket.setCpf(rs.getInt(2));
				ticket.setNome(rs.getString(3));
				ticket.setSobrenome(rs.getString(4));
				ticket.setOrigem(rs.getString(5));
				ticket.setDestino(rs.getString(6));
				ticket.setDatavoo(rs.getString(7));
				ticket.setHora(rs.getString(8));
				ticket.setValor(rs.getDouble(9));
				ticket.setTaxa(rs.getDouble(10));
				ticket.setCodigo(rs.getInt(11));
				to.add(ticket);	
			}
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if(rs != null){
				try{
					rs.close();
				} catch(SQLException sqe){
					sqe.printStackTrace();
				}
			}
			if(pst != null){
				try{
					pst.close();
				} catch(SQLException sqe){
					sqe.printStackTrace();
				}
			}
			if(conn != null){
				try{
					desconectar(conn);
				} catch(SQLException sqe){
					sqe.printStackTrace();
				}
			}
		}
		return to;
	}
	
	

}
