package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.TOFactory;
import to.AirplaneTO;
import model.Airplane;

public abstract class AirplaneDAO {
	
	public abstract Connection conectar() throws SQLException;

	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}

	public AirplaneTO inserirAeronave(int codigo, int qtdassentos, String tipo, String nome) throws Exception  {	
		
		// sqlCadastrar = exec(passar os parametros)
		String sqlCadastrar = "INSERT INTO aeronave (codigo,nome,qtdassentos,tipo) VALUES (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		AirplaneTO to = TOFactory.getAirplaneTO();
		
		try{
			conn = conectar();
			pst = conn.prepareStatement(sqlCadastrar); 
			
			pst.setInt(1, codigo);
			pst.setString(2, nome);	
			pst.setInt(3, qtdassentos);
			pst.setString(4, tipo);	
//			rs = pst.executeQuery();
			pst.executeUpdate();  			
			
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

	public AirplaneTO excluirAeronave(int codigo) throws Exception{	
		
		String sqlDeletar = "delete from aeronave where codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		AirplaneTO to = TOFactory.getAirplaneTO();
			
		try{
			conn = conectar();
			pst = conn.prepareStatement(sqlDeletar);
			pst.setInt(1, codigo);
			pst.executeUpdate();  			
			
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


	public AirplaneTO alterarAeronave(int codigo, int qtdassentos, String nome, String tipo) throws Exception{	
		
		String sqlAlterar = "UPDATE aeronave set codigo=?, qtdassentos=?, tipo=?, nome=? WHERE codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		AirplaneTO to = TOFactory.getAirplaneTO();
			
		try{
			conn = conectar();
			pst = conn.prepareStatement(sqlAlterar); 			 
			pst.setInt(1, codigo);
			pst.setString(4, nome);
			pst.setInt(2, qtdassentos);
			pst.setString(3, tipo);
			pst.setInt(5, codigo);
			pst.executeUpdate();  			
		
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

	
	public AirplaneTO listarAeronaves(int codigo) {
		
		String sqlConsultar = "SELECT * from aeronave WHERE codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Airplane aeronave = new Airplane();
		AirplaneTO to = TOFactory.getAirplaneTO();

		System.out.println("1231");
		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, codigo);
			rs = pst.executeQuery();
			while(rs.next()){
				aeronave.setQtdAssentos(rs.getInt(3));
				aeronave.setTipo(rs.getString(4));
				aeronave.setNome(rs.getString(2));
				to.add(aeronave);	
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
	
	public AirplaneTO consultarAeronave(Airplane airplane) {
		String sqlConsultar = "SELECT * from aeronave where codigo = ?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Airplane aeronave = new Airplane();
		AirplaneTO to = TOFactory.getAirplaneTO();
		
		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, airplane.getCodigoAeronave());
			rs = pst.executeQuery();
			while(rs.next()){
				aeronave.setCodigoAeronave(rs.getInt(1));
				aeronave.setQtdAssentos(rs.getInt(3));
				aeronave.setTipo(rs.getString(4));
				aeronave.setNome(rs.getString(2));
				to.add(aeronave);	
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
