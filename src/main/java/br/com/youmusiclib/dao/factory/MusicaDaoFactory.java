package br.com.youmusiclib.dao.factory;

import br.com.youmusiclib.dao.MusicaDao;
import br.com.youmusiclib.dao.jdbc.JDBCMusicaDao;

public class MusicaDaoFactory {

	public static MusicaDao createMusicaDao(){
		
		MusicaDao musicaDao = new JDBCMusicaDao();
		return musicaDao;
	}
}
