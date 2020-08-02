package com.example.demo.entities;

public class CommonResult {
private int code;
private String message;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public CommonResult(int code, String message) {
	super();
	this.code = code;
	this.message = message;
}
@Override
public String toString() {
	return "CommonResult [code=" + code + ", message=" + message + "]";
}

}
