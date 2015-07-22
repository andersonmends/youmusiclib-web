package java.br.com.youmusiclib.dao.jdbc;


import org.junit.Test;
import junit.framework.Assert;
import br.com.youmusiclib.dao.UsuarioDao;
import br.com.youmusiclib.dao.factory.UsuarioDaoFactory;
import br.com.youmusiclib.modelo.Usuario;

public class JDBCUsuarioDAOTest {

	@Test
	public void testaRecuperarUmObjeto() {
		
		UsuarioDao usuario = UsuarioDaoFactory.createUsuarioDao();
		
		Usuario user = usuario.buscarPorEmail("anderson.mends@gmail");
		
		Assert.assertEquals("anderson",user.getNome());
		Assert.assertEquals("anderson.mends@gmail",user.getEmail());
		Assert.assertEquals("admin",user.getSenha());
		
	}

}
