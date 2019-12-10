package com.lsl.bean;

/**
 * @program: logproduce
 * @description: 错误日志
 * @author: lsl
 * @create: 2019-12-10 11:00
 **/
public class AppErrorLog {

    private String errorBrief;    //错误摘要
    private String errorDetail;   //错误详情

    public String getErrorBrief() {
        return errorBrief;
    }

    public void setErrorBrief(String errorBrief) {
        this.errorBrief = errorBrief;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
