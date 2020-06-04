package com.example.model;

public class ReturnValue<T> {
    private boolean state;
    private String code;
    private String msg;
    private T data;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    @Override
    public String toString() {
        return "status=" + state + "code=" + code + " message=" + msg + " data=" + data;
    }

    public static <T> ReturnValue<T> fail() {
        ReturnValue<T> rv = new ReturnValue<T>();
        rv.setState(false);
        rv.setCode(ReturnCode.FAIL.getCode());
        rv.setMsg(ReturnCode.FAIL.getDesc());
        return rv;
    }

    public static <T> ReturnValue<T> fail(T data) {
        ReturnValue<T> rv = ReturnValue.fail();
        rv.setData(data);
        return rv;
    }

    public static <T> ReturnValue<T> failMessage(String msg) {
        ReturnValue<T> rv = ReturnValue.fail();
        rv.setMsg(msg);
        return rv;
    }
    public static <T> ReturnValue<T> successMessage(String msg) {
        ReturnValue<T> rv = ReturnValue.success();
        rv.setMsg(msg);
        return rv;
    }



    public static <T> ReturnValue<T> success() {
        ReturnValue<T> rv = new ReturnValue<T>();
        rv.setState(true);
        rv.setCode(ReturnCode.SUCCESS.getCode());
        rv.setMsg(ReturnCode.SUCCESS.getDesc());
        return rv;
    }



    public static <T> ReturnValue<T> success(T data) {
        ReturnValue<T> rv = ReturnValue.success();
        rv.setData(data);
        return rv;
    }

    public static <T> ReturnValue<T> http404(T data) {
        ReturnValue<T> rv = new ReturnValue<T>();
        rv.setCode(ReturnCode.NOT_FOUND.getCode());
        rv.setMsg(ReturnCode.NOT_FOUND.getDesc());
        rv.setData(data);
        return rv;
    }

    public static <T> ReturnValue<T> http403(T data) {
        ReturnValue<T> rv = new ReturnValue<T>();
        rv.setCode(ReturnCode.ACCESS_ERROR.getCode());
        rv.setMsg(ReturnCode.ACCESS_ERROR.getDesc());
        rv.setData(data);
        return rv;
    }

}
