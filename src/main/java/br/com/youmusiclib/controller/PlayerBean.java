package br.com.youmusiclib.controller;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
@SessionScoped
public class PlayerBean {

	private StreamedContent myVideo; // + setter & Getter

	public PlayerBean(){
		
	}
	
	public StreamedContent getMyVideo() {
		return myVideo;
	}

	public void setMyVideo(StreamedContent myVideo) {
		this.myVideo = myVideo;
	}


	@PostConstruct
	public void videoInputStream(){
	  
		try{
	    FileInputStream inputStream = new FileInputStream("c://youmusiclib/anderson/songbird.mp3");
	    myVideo = new DefaultStreamedContent(inputStream,"audio/quicktime");

	  }catch(Exception e){
	        e.printStackTrace();
	  }
	
	}
	
}
