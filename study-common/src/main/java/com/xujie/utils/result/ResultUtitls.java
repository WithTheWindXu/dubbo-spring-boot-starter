package com.xujie.utils.result;

/**
 * Created by xj on 2018/1/22.
 */
public class ResultUtitls {
    private static String DEFAULT_MESSAGE_SUCCESS = "成功";

    private static String DEFAULT_MESSAGE_ERROR = "失败";

    private static Integer CODE_SUCCESS = 1;

    private static Integer CODE_ERROR = 0;


    public static Result success(){
        Result result=new Result();
        result.setCode(CODE_SUCCESS);
        result.setMsg(DEFAULT_MESSAGE_SUCCESS);
        return result;
    }

    public static Result success(Object obj){
        Result result=new Result();
        result.setCode(CODE_SUCCESS);
        result.setMsg(DEFAULT_MESSAGE_SUCCESS);
        result.setData(obj);
        return result;
    }

    public static Result error(){
        Result result=new Result();
        result.setCode(CODE_ERROR);
        result.setMsg(DEFAULT_MESSAGE_ERROR);
        return result;
    }

    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
