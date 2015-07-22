package br.com.youmusiclib.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.youmusiclib.dao.UsuarioDao;
import br.com.youmusiclib.dao.factory.UsuarioDaoFactory;
import br.com.youmusiclib.modelo.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean {

	private Usuario usuario;
	private String login;
	private String senha;
	
	public LoginBean(){
		
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@PostConstruct
	public void init(){
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void submit() throws IOException{
		FacesContext context = FacesContext.getCurrentInstance();
		
		UsuarioDao dao = UsuarioDaoFactory.createUsuarioDao();
		
		usuario = dao.buscarPorEmail(login);
		
		try{
			if (usuario.getEmail().equals(login)&&usuario.getSenha().equals(senha)) {
				context.addMessage(null,new FacesMessage("Login efetuado com sucesso"));
				try {
						
					HttpSession session = (HttpSession)context.getExternalContext().getSession(false);
					session.setAttribute("usuario", usuario);
					context.getExternalContext().redirect("index.jsf");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else{
				context.addMessage(null,new FacesMessage("Login falhou"));
			}
			
		}catch(NullPointerException e){
			context.addMessage(null,new FacesMessage("Login falhou"));
		}	
	}
	
}
