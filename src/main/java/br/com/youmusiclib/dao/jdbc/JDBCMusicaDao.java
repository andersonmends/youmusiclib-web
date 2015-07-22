package br.com.youmusiclib.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.youmusiclib.dao.MusicaDao;
import br.com.youmusiclib.modelo.Musica;
import br.com.youmusiclib.modelo.Usuario;
import br.com.youmusiclib.dao.jdbc.ConnectionFactory;

public class JDBCMusicaDao implements MusicaDao {

	private Connection con;
	
	
	public JDBCMusicaDao(){
		this.con =  ConnectionFactory.getConnection();
	}
	
	@Override
	public List<Musica> listarTudo(Usuario usuario) {
		
		List<Musica> list = new ArrayList<Musica>();
		
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM musica WHERE email = ?");
			stmt.setString(1, usuario.getEmail());
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
			
				Musica musica = new Musica();
				musica.setNome(rs.getString("nome"));
				musica.setDuracao(rs.getInt("duracao"));
				musica.setTamanho(rs.getInt("tamanho"));
				musica.setCaminho(rs.getString("caminho"));
				list.add(musica);
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}

	@Override
	public Musica buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionar(Musica musica, String emailUsuario) {
		
		try {
			PreparedStatement stmt = con.prepareStatement("insert into musica values (null,?,?,?,?,?)");
			stmt.setString(1, musica.getNome());
			stmt.setInt(2, musica.getDuracao());
			stmt.setLong(3, musica.getTamanho());
			stmt.setString(4, musica.getCaminho());
			stmt.setString(5, emailUsuario);
			
			stmt.execute();
			stmt.close();
			
			System.out.print("Inserido");
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
	public void remover(Musica musica) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Musica musica) {
		// TODO Auto-generated method stub

	}
}
