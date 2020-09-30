package br.com.estudos25_relacandoExceptions.util;

public class GlobalException extends Exception{
	
	public GlobalException(String msg, Exception e) {
		super(msg, e);
	}
	
	
}
