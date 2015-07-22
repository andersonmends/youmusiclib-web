package br.com.youmusiclib.dao.factory;

import br.com.youmusiclib.dao.UsuarioDao;
import br.com.youmusiclib.dao.jdbc.JDBCUsuarioDao;

public class UsuarioDaoFactory {
	
	public static UsuarioDao createUsuarioDao(){
		
		UsuarioDao usuario = new JDBCUsuarioDao();
		return usuario;
	}

}
