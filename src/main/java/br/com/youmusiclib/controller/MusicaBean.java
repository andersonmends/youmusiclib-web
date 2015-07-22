package br.com.youmusiclib.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.youmusiclib.dao.MusicaDao;
import br.com.youmusiclib.dao.factory.MusicaDaoFactory;
import br.com.youmusiclib.modelo.Musica;
import br.com.youmusiclib.modelo.Usuario;

@ManagedBean
public class MusicaBean {
	
	private List<Musica> listaMusica = new ArrayList<Musica>();
	private String caminho;
	
	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public MusicaBean(){
		
	}
	
	public List<Musica> getListaMusica() {
		return listaMusica  ;
	}

	public void setListaMusica(List<Musica> listaMusica) {
		this.listaMusica = listaMusica;
	}

	@PostConstruct
	public void criarListaDeMusica(){
		
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuario");
		
		MusicaDao daoMusica = MusicaDaoFactory.createMusicaDao();
		
		listaMusica = daoMusica.listarTudo(usuario);
	}
	
	public void executarMusica(Musica musica){
		this.caminho = musica.getCaminho();
	}

}
