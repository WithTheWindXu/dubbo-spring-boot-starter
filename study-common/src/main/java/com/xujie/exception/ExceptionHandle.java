package com.xujie.exception;


import com.xujie.utils.result.Result;
import com.xujie.utils.result.ResultUtitls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 捕获异常返回类
 * Created by xj on 2017/11/12.
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof BaseException){//如果是自己捕获的异常
            BaseException baseException=(BaseException) e;
            return ResultUtitls.error(baseException.getCode(),baseException.getMessage());
        }else{
            logger.error("[系统异常]",e);
            return ResultUtitls.error(-1,"未知错误");
        }
    }
}
