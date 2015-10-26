package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Airplane;
import model.Passenger;
import to.AirplaneTO;
import to.PassengerTO;
import factory.TOFactory;

public abstract class PassengerDAO {

	public abstract Connection conectar() throws SQLException;

	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}

	public PassengerTO inserirPassageiro(int cpf, String nome,
			String dataNasc, String sobrenome, String banco,
			String formtr, String tipo, int fone)
			throws Exception {

		// sqlCadastrar = exec(passar os parametros)
		String sqlCadastrar = "INSERT INTO cliente (cpf,nome,sobrenome,datanasc,fone,email,tipo,formtr) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		PassengerTO to = TOFactory.getPassengerTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlCadastrar);

			pst.setInt(1, cpf);
			pst.setString(2, nome);
			pst.setString(3, sobrenome);
			pst.setString(4, dataNasc);
			pst.setInt(5, fone);
			pst.setString(6, banco);
			pst.setString(7, tipo);
			pst.setString(8, formtr);

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

	public PassengerTO alterarPassageiro(int cpf, String nome,
			String dataNasc, String sobrenome, String banco,
			String formtr, String tipo, int fone)
			throws Exception {
								
		String sqlAlterar = "UPDATE cliente set  nome=?, sobrenome=?, datanasc=?, fone=?,email=?,tipo=?,formtr=? WHERE cpf=?";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		PassengerTO to = TOFactory.getPassengerTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlAlterar);

//			pst.setInt(1, cpf);
			pst.setString(1, nome);
			pst.setString(2, sobrenome);
			pst.setString(3, dataNasc);
			pst.setInt(4, fone);
			pst.setString(5, banco);
			pst.setString(6, tipo);
			pst.setString(7, formtr);
			pst.setInt(8, cpf);
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

	public PassengerTO excluirPassageiro(int cpf) throws Exception {

		String sqlDeletar = "delete from cliente where cpf=?";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		PassengerTO to = TOFactory.getPassengerTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlDeletar);
			pst.setInt(1, cpf);
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

	public PassengerTO listarPassageiro(int cpf) {

		String sqlConsultar = "";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		Passenger passageiro = new Passenger();
		PassengerTO to = TOFactory.getPassengerTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, cpf);
			rs = pst.executeQuery();
			while (rs.next()) {

				passageiro.setNome(rs.getString(2));
				passageiro.setDataNasc(rs.getString(3));
				passageiro.setNecessidadeEsp(rs.getString(4));
				passageiro.setBanco(rs.getString(5));
				passageiro.setTitular(rs.getString(6));
				passageiro.setDataValidade(rs.getString(7));
				passageiro.setTipoDoCartao(rs.getString(8));
				passageiro.setCpf(rs.getInt(9));
				passageiro.setRg(rs.getInt(10));
				passageiro.setFone(rs.getInt(11));
				passageiro.setCpfDependente(rs.getInt(12));
				passageiro.setAg(rs.getInt(13));
				to.add(passageiro);
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
	public PassengerTO consultarPassageiro(Passenger passenger) throws Exception {

		String sqlConsultarPassageiro =  "SELECT * from cliente where cpf = ?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Passenger passageiro = new Passenger();
		PassengerTO to = TOFactory.getPassengerTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultarPassageiro);
			pst.setInt(1, passenger.getCpf());
			rs = pst.executeQuery();
			while (rs.next()) {
				
				passageiro.setCpf(rs.getInt(1));
				passageiro.setNome(rs.getString(2));
				passageiro.setSobrenome(rs.getString(3));
				passageiro.setDataNasc(rs.getString(4));
				passageiro.setFone(rs.getInt(5));
				passageiro.setEmail(rs.getString(6));
				passageiro.setTipo(rs.getString(7));
				passageiro.setFormtr(rs.getString(8));
				
				to.add(passageiro);

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
}
