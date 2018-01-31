package com.xujie.exception;

import com.xujie.enums.ResultEnum;

/**
 * Created by xj on 2018/1/22.
 */
public class BaseException extends RuntimeException{
    private Integer code;

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
