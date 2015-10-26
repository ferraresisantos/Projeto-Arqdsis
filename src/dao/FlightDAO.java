package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import to.FlightTO;
import model.Flight;
import factory.TOFactory;

public abstract class FlightDAO {

	public abstract Connection conectar() throws SQLException;

	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}

	public FlightTO adicionarVoo(int codigo, String origem, String destino, String escala, String datavoo,
			String hora, String tipo, String situacao, double preco) {
		String sqlCadastrar = "INSERT INTO voo (codigo,origem,destino,escala,datavoo,hora,tipo,situacao,preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		System.out.println("2132");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		FlightTO voo = TOFactory.getFlightTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlCadastrar);

			pst.setInt(1,codigo);
			pst.setString(2, origem);
			pst.setString(3, destino);
			pst.setString(4, escala);
			pst.setString(5, datavoo);
			pst.setString(6, hora);
			pst.setString(7, tipo);
			pst.setString(8, situacao);
			pst.setDouble(9, preco);
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

		return voo;
	}

	public FlightTO excluirVoo(int codigo) {
		String sqlDeletar = "delete from voo where codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		FlightTO voo = TOFactory.getFlightTO();

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

		return voo;
	}

	public FlightTO alterarVoo(int codigo, String origem, String destino, String escala, String datavoo,
		String hora, String tipo, String situacao, double preco) {
		String sqlAlterar = "UPDATE voo set codigo=?, origem=?, destino=?, escala=?,datavoo=?, hora=?, tipo=?, situacao=?, preco=? WHERE codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		FlightTO voo = TOFactory.getFlightTO();
		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlAlterar);
			pst.setInt(1, codigo);
			pst.setString(2, origem);
			pst.setString(3, destino);
			pst.setString(4, escala);
			pst.setString(5, datavoo);
			pst.setString(6, hora);
			pst.setString(7, tipo);
			pst.setString(8, situacao);
			pst.setDouble(9, preco);
			pst.setInt(10, codigo);
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
		return voo;
	}

	public FlightTO listraVoo(int codigo) {
		String sqlConsultar =  "SELECT * from voo WHERE codigo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		Flight voo = new Flight();
		FlightTO to = TOFactory.getFlightTO();

		try {

			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, codigo);
			rs = pst.executeQuery();
			while (rs.next()) {
				
				voo.setIdVoo(rs.getInt(1));
				voo.setOrigem(rs.getString(2));
				voo.setDestino(rs.getString(3));
				voo.setDataVoo(rs.getString(4));
				voo.setHora(rs.getString(5));
				voo.setPreco(rs.getDouble(6));
				to.add(voo);
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

	public FlightTO consultarVoo(int idVoo) {
		String sqlConsultar = "exec  SP_ConsultFlight ?, ?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		Flight voo = new Flight();
		FlightTO to = TOFactory.getFlightTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, idVoo);
			rs = pst.executeQuery();
			
			voo.setIdVoo(rs.getInt(1));
			voo.setOrigem(rs.getString(2));
			voo.setDestino(rs.getString(3));
			voo.setDataVoo(rs.getString(4));
			voo.setHora(rs.getString(5));
			voo.setPreco(rs.getDouble(6));
			to.add(voo);

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

	public ArrayList<Flight> consultBoardingsRest() {

		String sqlConsult = "select distinct boardingFlight from Flight";
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<Flight> listBoardings = new ArrayList<Flight>();

		try {
			stm = conn.prepareStatement(sqlConsult);
			rs = stm.executeQuery();

			while (rs.next()) {
				Flight flight = new Flight();
				flight.setOrigem(rs.getString(1));

				listBoardings.add(flight);
			}

			if (listBoardings.isEmpty()) {
				listBoardings = null;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e2) {
				System.out.print(e2.getStackTrace());
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
		return listBoardings;
	}

	public ArrayList<Flight> consultLandingsRest(String boardingFlight) {
		String sqlConsult = "select landingFlight from Flight where boardingFlight = ?";
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<Flight> listLandings = new ArrayList<Flight>();

		try {
			stm = conn.prepareStatement(sqlConsult);
			stm.setString(1, boardingFlight);
			rs = stm.executeQuery();

			while (rs.next()) {
				Flight flight = new Flight();
				flight.setDestino(rs.getString(1));

				listLandings.add(flight);
			}

			if (listLandings.isEmpty()) {
				listLandings = null;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e2) {
				System.out.print(e2.getStackTrace());
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
		return listLandings;
	}

	public ArrayList<Flight> consultFlightsRest(String origem, String destino) {
		String sqlConsult = "exec SP_ConsultFlights ?, ?";
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<Flight> listFlights = new ArrayList<Flight>();

		try {
			stm = conn.prepareStatement(sqlConsult);
			stm.setString(1, origem);
			stm.setString(2, destino);
			rs = stm.executeQuery();

			while (rs.next()) {
				Flight flight = new Flight();
				flight.setIdVoo(rs.getInt(1));
				flight.setOrigem(rs.getString(2));
				flight.setDestino(rs.getString(3));
				flight.setDataVoo(rs.getString(4));
				flight.setHora(rs.getString(5));
				flight.setPreco(rs.getDouble(6));

				listFlights.add(flight);
			}

			if (listFlights.isEmpty()) {
				listFlights = null;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e2) {
				System.out.print(e2.getStackTrace());
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
		return listFlights;
	}
	public FlightTO consultarVoo(Flight flight) throws Exception {

		String sqlConsultar =  "SELECT * from voo where codigo = ?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Flight voo = new Flight();
		FlightTO to = TOFactory.getFlightTO();

		try {
			conn = conectar();
			pst = conn.prepareStatement(sqlConsultar);
			pst.setInt(1, flight.getCodigo());
			rs = pst.executeQuery();
			while (rs.next()) {
				
				voo.setCodigo(rs.getInt(1));
				voo.setOrigem(rs.getString(2));
				voo.setDestino(rs.getString(3));
				voo.setEscala(rs.getString(4));
				voo.setDataVoo(rs.getString(5));
				voo.setHora(rs.getString(6));
				voo.setTipo(rs.getString(7));
				voo.setSituacao(rs.getString(8));
				voo.setPreco(rs.getDouble(9));
				
				to.add(voo);

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
