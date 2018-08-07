package com.bharath.ws.soap.config;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

public class UTPasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<>(); 
	
	public UTPasswordCallback() {
		passwords.put("Kyle", "password");
		passwords.put("Kyle1", "password1");
	}
	
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		
		

	}

}
