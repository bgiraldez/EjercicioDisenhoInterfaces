package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class BDManager {
	public static Connection abrirBD() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/numeros_aleatorios?useSSL=false";
		String user = "listador";
		String pass = "Ad1234";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver).newInstance();
			Connection con = DriverManager.getConnection(url, user, pass);
			return con;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
	}

	public static void cerrarBD(Connection con) throws SQLException {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
	}

	public static ArrayList<Integer> listarBD(Connection con) throws SQLException {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(" SELECT * FROM numero ");
			while (rs.next()) {
				int numero = rs.getInt("numero");
				listaNumeros.add(numero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
		return listaNumeros;
	}

	public static void addNumero(Connection con, int numero) throws SQLException {
		if (con == null) {
			throw new SQLException("La conexión no está abierta");
		}
		try {
			String query = "INSERT INTO numero(valor) VALUES(?) ";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
			ps.setInt(1, numero);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getSQLState());
		}
	}

	public static void borrarNumero(Connection con, int numero) throws SQLException {
		try {
			String query = "DELETE FROM numero WHERE valor=?";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
			ps.setInt(1, numero);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getSQLState());
		}

	}

}