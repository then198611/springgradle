package com.h.user.lib;

/**
 * Created by huangshuaihui on 16/9/14.
 */
public interface BaseConfig {
    interface ResponseCode {
        static final int CODE_SUCCESS = 0;
        static final int CODE_EXCEPTION = 1;
        static final int CODE_BUSINESS_ERROR = 2;

        static final int CODE_LOGIN = 3;
    }

    interface ResponseMessage {
        static final String MESSAGE_SUCCESS = "success";
        static final String MESSAGE_BUSINESS_ERROR = "逻辑错误";
    }
}
