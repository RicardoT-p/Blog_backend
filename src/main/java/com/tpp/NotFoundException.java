package com.tpp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp
 * @ClassName: NotFoundException
 * @Author: ptang
 * @Date: 2021/7/23 12:56 上午
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}