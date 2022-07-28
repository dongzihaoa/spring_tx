package com.dzh.utils;

import lombok.Data;

@Data
public class JsonResult<T> {

    private Integer code;//返回的状态码
    private String msg; //返回信息
    private  T data;// 返回的数据

    /**
     *  执行成功
     */
    public void success() {
       this.setCode(200);
       this.setMsg("success");
    }
    /**
     * 执行失败
     */

    public void error() {
        this.setMsg("failed!");
        this.setCode(-200);
    }
}
