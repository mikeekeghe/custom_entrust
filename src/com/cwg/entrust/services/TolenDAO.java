package com.cwg.entrust.services;

import com.cwg.entrust.entities.InputString;
import com.cwg.entrust.entities.TokenObject;

public interface TolenDAO {

	public String getRandomAlphaNumericString() throws Exception;

	public int insertToken(TokenObject to);

	public int getIsValidToken(String input, String tokenObject) throws Exception;

}
