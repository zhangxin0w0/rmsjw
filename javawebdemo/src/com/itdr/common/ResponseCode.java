package com.itdr.common;

/**
 * ClassName: ResponseCode
 * 日期: 2020/1/13 18:54
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ResponseCode<T> {
    private Integer status;
    private T data;
    private String msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //多个构造函数
    private ResponseCode(T data){
        this.status=200;
        this.data = data;
    }

    private ResponseCode(Integer status,String msg){
        this.status=status;
        this.msg = msg;
    }

    //成功获取数据的方法
    public static <T> ResponseCode toSuccess(T data){
        return new ResponseCode(data);
    }

    //失败返回信息的方法
    public static <T> ResponseCode toDefeated(Integer status,String msg){
        return new ResponseCode(status,msg);
    }

    public static <T> ResponseCode toDefeated(String msg){
        return new ResponseCode(100,msg);
    }

    @Override
    public String toString() {
        return "{\"status\":" + status + ",\"data\":" + data + ",\"msg\":" + msg + "}";
    }
}
