package com.wise.sample.common;

import java.util.Map;

public class ResponObj {
	String scsMsg;
	String errMsg;
	String scsCode;
	String errCode;
	Map<String, Object> resMap;
	
	public ResponObj(String scsMsg, String scsCode, String errMsg, String errCode, Map<String, Object> resMap){
		this.scsMsg 	= scsMsg;
		this.scsCode 	= scsCode;
		this.scsMsg 	= errMsg;
		this.scsCode 	= errCode;
		this.resMap 	= resMap;
	}
	
	public String getScsMsg() {
		return scsMsg;
	}
	
	public String getScsCode() {
		return scsCode;
	}
	
	public String getSrrMsg() {
		return errMsg;
	}
	
	public String getSrrCode() {
		return errCode;
	}
	
	public Map<String, Object> getResMap() {
		return resMap;
	}
}
