package br.com.youmusiclib.teste;

import java.io.File;
import java.util.List;

import br.com.youmusiclib.dao.MusicaDao;
import br.com.youmusiclib.dao.UsuarioDao;
import br.com.youmusiclib.dao.factory.MusicaDaoFactory;
import br.com.youmusiclib.dao.factory.UsuarioDaoFactory;
import br.com.youmusiclib.modelo.Musica;
import br.com.youmusiclib.modelo.Usuario;

public class Teste {
	
	public static void main (String[] args){
		
		File dir = new File ("testettt");
		if(dir.mkdir()){
			System.out.print("OK");
		}else{
			System.out.print("TESTE");
		}
       // UsuarioDao dao = UsuarioDaoFactory.createUsuarioDao();
		
	//	Usuario usuario = dao.buscarPorEmail("anderson.mends@gmail");
		
		//System.out.print(usuario.getEmail());
		//System.out.print(usuario.getSenha());
		
		
		//MusicaDao user = MusicaDaoFactory.createMusicaDao();
				
		//Musica mu = new Musica();
		
		//mu.setNome("Teste");
		//mu.setDuracao(100);
		//mu.setTamanho(100);
		//mu.setCaminho("Teste");
		
		//user.adicionar(mu,"anderson.mends@gmail");
		
		//System.out.print("Feito");
		//System.out.print(u.get(0).getCaminho());
		//System.out.print(u.get(1).getCaminho());
		
	}

}
