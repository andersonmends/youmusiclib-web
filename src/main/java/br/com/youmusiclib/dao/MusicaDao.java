package br.com.youmusiclib.dao;

import java.util.List;

import br.com.youmusiclib.modelo.Musica;
import br.com.youmusiclib.modelo.Usuario;

public interface MusicaDao {
	
	public List<Musica> listarTudo(Usuario usuario);
	public Musica buscarPorId(int id);
	public void adicionar (Musica musica, String emailUsuario);
	public void remover (Musica musica);
	public void atualizar (Musica musica);
	
}
