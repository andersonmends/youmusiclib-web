package br.com.youmusiclib.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.youmusiclib.dao.UsuarioDao;
import br.com.youmusiclib.dao.factory.UsuarioDaoFactory;
import br.com.youmusiclib.modelo.Usuario;

@ManagedBean
public class CadastroBean {

	Usuario usuario;
	String verificadorSenha;
	
	public String getVerificadorSenha() {
		return verificadorSenha;
	}

	public void setVerificadorSenha(String verificadorSenha) {
		this.verificadorSenha = verificadorSenha;
	}

	@PostConstruct
	public void init(){
		this.usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void cadastrar(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		boolean verificador = this.verificarSenha();
		
		if(verificador==true){
			File dir = new File ("C:/Users/Anderson Mendes/workspace/youmusiclib-web/WebContent/dados/"+usuario.getEmail());
			dir.mkdir();
			
			UsuarioDao daoUsuario = UsuarioDaoFactory.createUsuarioDao();
			daoUsuario.adicionar(usuario);
			try {
				context.getExternalContext().redirect("login.jsf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			context.addMessage(null, new FacesMessage("Senhas não conferem"));
		}
	}
	
	public boolean verificarSenha(){
		if(this.usuario.getSenha().equals(verificadorSenha)){
			return true;
		}
		
		return false;
	}
}
