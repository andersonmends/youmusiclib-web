package br.com.youmusiclib.dao;

import java.util.List;

import br.com.youmusiclib.modelo.Usuario;

public interface UsuarioDao {
	
	public List<Usuario> listarTudo();
	public Usuario buscarPorEmail(String email);
	public void adicionar (Usuario usuario);
	public void remover (Usuario usuario);
	public void atualizar (Usuario usuario);

}
