package br.com.youmusiclib.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.primefaces.event.FileUploadEvent;

import br.com.youmusiclib.dao.MusicaDao;
import br.com.youmusiclib.dao.factory.MusicaDaoFactory;
import br.com.youmusiclib.modelo.Musica;
import br.com.youmusiclib.modelo.Usuario;

@ManagedBean
@SessionScoped
public class UploadBean{

	
	public UploadBean() {

	}

	public void upload(FileUploadEvent evento){
		
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuario");
		
		Musica musica =  new Musica();
		musica.setCaminho("http://localhost:8080/youmusiclib-web/dados/"+usuario.getEmail()+"/"+evento.getFile().getFileName());
		musica.setNome(evento.getFile().getFileName());
		musica.setDuracao(100);
		musica.setTamanho((evento.getFile().getSize()/1024));
		
		MusicaDao daoMusica = MusicaDaoFactory.createMusicaDao();
		daoMusica.adicionar(musica,usuario.getEmail());
		
		File diretorio = new File("C:/Users/Anderson Mendes/workspace/youmusiclib-web/WebContent/dados/"+usuario.getEmail());
		
		try {
			InputStream entrada = evento.getFile().getInputstream();
			OutputStream saida = new FileOutputStream(new File(diretorio,evento.getFile().getFileName()));
			int read = 0;
			byte[] bytes = new byte[1024];
			
			while ((read = entrada.read(bytes))!=-1) {
				saida.write(bytes, 0, read);
			}
			
			entrada.close();
			saida.flush();
			saida.close();
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
