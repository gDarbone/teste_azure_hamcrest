package br.ce.wcaquino.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {

	String APP_URL_BASE = "http://barrigarest.wcaquino.me";
	int APP_PORT =  80;
	String APP_BASE_PATH = "";
	
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 1000L;
	
}
