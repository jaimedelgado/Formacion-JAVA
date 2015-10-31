package com.jdlsoft.gestionCoches.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdlsoft.gestionCoches.domain.Coche;
import com.jdlsoft.gestionCoches.interfaces.ICocheDAO;
import com.jdlsoft.gestionCoches.utils.GCDataConnection;

public class CocheDAO implements ICocheDAO{
	@Override
	public void create(Coche coche) {
		if(coche!=null){
			Connection con = GCDataConnection.getConnection();
			try {
				this.delete(coche.getMatricula());
				String strSQL = "INSERT INTO `gestioncoches`.`coches` (`fechaMatriculacion`, `numeroBastidor`, `matricula`, `marca`, `modelo`, `numeroPuertas`, `tipoMotor`, `siniestrado`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement preparedstatement = con.prepareStatement(strSQL);
				preparedstatement.setString(1, coche.getFechaMatriculacion().toString());
				preparedstatement.setString(2, coche.getNumeroBastidor());
				preparedstatement.setString(3, coche.getMatricula());
				preparedstatement.setString(4, coche.getMarca());
				preparedstatement.setString(5, coche.getModelo());
				preparedstatement.setInt(6, coche.getNumeroPuertas());
				preparedstatement.setString(7, coche.getTipoMotor());
				preparedstatement.setBoolean(8, coche.isSiniestrado());
				System.out.println(strSQL);
				preparedstatement.executeUpdate();
				con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
	@Override
	public Coche read(String matricula) {
		Connection con = GCDataConnection.getConnection();
		final String selectSQL="SELECT * FROM gestioncoches.coches where matricula = ?";
		Coche coche=null;
		try {
			PreparedStatement preparedStatement= con.prepareStatement(selectSQL);
			preparedStatement.setString(1, matricula);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()){
				coche = new Coche();
				coche.setFechaMatriculacion(resultSet.getDate(1));
				coche.setNumeroBastidor(resultSet.getString(2));
				coche.setMatricula(resultSet.getString(3));
				coche.setMarca(resultSet.getString(4));
				coche.setModelo(resultSet.getString(5));
				coche.setNumeroPuertas(resultSet.getInt(6));
				coche.setTipoMotor(resultSet.getString(7));
				coche.setSiniestrado(resultSet.getBoolean(8));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return coche;
	}
	@Override
	public void update(Coche coche) {
		//DELETE FROM `facturacion`.`productos` WHERE `id`='4';
		//UPDATE `facturacion`.`productos` SET `id`='4', `nombre`='f', `precio`='27' WHERE `id`='3';
		if(coche!=null){
			String matricula = coche.getMatricula();
			this.delete(matricula);
			Connection con = GCDataConnection.getConnection();
			try {
				String strSQL = "INSERT INTO `gestioncoches`.`coches` (`fechaMatriculacion`, `numeroBastidor`, `matricula`, `marca`, `modelo`, `numeroPuertas`, `tipoMotor`, `siniestrado`) VALUES (?,?,?,?,?,?,?,?)";
				PreparedStatement preparedstatement = con.prepareStatement(strSQL);
				preparedstatement.setString(1, coche.getFechaMatriculacion().toString());
				preparedstatement.setString(2, coche.getNumeroBastidor());
				preparedstatement.setString(3, coche.getMatricula());
				preparedstatement.setString(4, coche.getMarca());
				preparedstatement.setString(5, coche.getModelo());
				preparedstatement.setInt(6, coche.getNumeroPuertas());
				preparedstatement.setString(7, coche.getTipoMotor());
				preparedstatement.setBoolean(8, coche.isSiniestrado());
				System.out.println(strSQL);
				preparedstatement.executeUpdate();
				con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void delete(String matricula) {
		if(this.read(matricula) != null){
			Connection con = GCDataConnection.getConnection();
			try {
				String strSQL = "DELETE FROM `gestioncoches`.`coches` WHERE `matricula`=?;";
				PreparedStatement statement = con.prepareStatement(strSQL);
				statement.setString(1, matricula);
				System.out.println(strSQL);
				statement.executeUpdate();
				con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public List<Coche> getAll() {
		Connection con = GCDataConnection.getConnection();
		Coche coche = null;
		List<Coche> coches = new ArrayList<Coche>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from gestioncoches.coches");
			
			
			while(resultSet.next()){
				coche = new Coche();
				coche.setFechaMatriculacion(resultSet.getDate(1));
				coche.setNumeroBastidor(resultSet.getString(2));
				coche.setMatricula(resultSet.getString(3));
				coche.setMarca(resultSet.getString(4));
				coche.setModelo(resultSet.getString(5));
				coche.setNumeroPuertas(resultSet.getInt(6));
				coche.setTipoMotor(resultSet.getString(7));
				coche.setSiniestrado(resultSet.getBoolean(8));
				coches.add(coche);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(coches);
		return coches;
	}
}
