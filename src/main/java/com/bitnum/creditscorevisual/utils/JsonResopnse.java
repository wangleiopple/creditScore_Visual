package com.bitnum.creditscorevisual.utils;

public class JsonResopnse {

    private boolean result;
    private String message;
    private Object data;
    private int code;

    public boolean isResult() {
        return result;
    }

    public JsonResopnse() {
    }

    public JsonResopnse(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public JsonResopnse(boolean result, String message, Object data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public JsonResopnse(boolean result, String message, Object data, int code) {
        this.result = result;
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public  static  JsonResopnse message(boolean result, String message, Object data){
        return  new JsonResopnse(result,message,data);
    }
    public  static  JsonResopnse message(boolean result, String message, Object data,int code){
        return  new JsonResopnse(result,message,data);
    }

    public  static  JsonResopnse success(String message){
        return  JsonResopnse.message(true,message,null);
    }
    public  static  JsonResopnse success(String message,Object data){
        return  JsonResopnse.message(true,message,data);
    }

    public  static  JsonResopnse success(String message,Object data,int code){
        return  JsonResopnse.message(true,message,data,code);
    }
    public  static  JsonResopnse error(String message,Object data){
        return  JsonResopnse.message(false,message,data);
    }
    public  static  JsonResopnse error(String message){
        return  JsonResopnse.message(false,message,null);
    }

}
