package com.xujie.utils.result;

/**
 * Created by xj on 2018/1/22.
 */
public class Result<T> {
    /**
     * 编码
     */
    private Integer code;
    /**
     * 消息内容
     */
    private String msg;
    /**
     * 消息对象
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
