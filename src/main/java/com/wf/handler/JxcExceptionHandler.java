package com.wf.handler;

import com.wf.exception.JxcException;
import com.wf.utils.ResultVOUtil;
import com.wf.vo.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JxcExceptionHandler {

    @ExceptionHandler(JxcException.class)
    public ResultVO fail(JxcException ex){
        ResultVO resultVO = ResultVOUtil.fail(ex);
        return resultVO;
    }

}
