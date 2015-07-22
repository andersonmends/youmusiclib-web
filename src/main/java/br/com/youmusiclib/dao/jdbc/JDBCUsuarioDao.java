package br.com.youmusiclib.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.youmusiclib.dao.UsuarioDao;
import br.com.youmusiclib.modelo.Usuario;

public class JDBCUsuarioDao implements UsuarioDao {
	
	private Connection con;
	
	public JDBCUsuarioDao(){
		
		this.con = ConnectionFactory.getConnection();
	}

	@Override
	public List<Usuario> listarTudo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		Usuario usuario = new Usuario();
		
		try{
	    
		PreparedStatement stmt = con.prepareStatement("select * from usuario where email=?");
		stmt.setString(1, email);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
		}
		
		stmt.close();
		rs.close();
		
		}catch(SQLException e){
			System.out.print(e);
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return usuario;
	}

	@Override
	public void adicionar(Usuario usuario) {
		
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO USUARIO VALUES(?,?,?)");
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getEmail());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void remover(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	

}
