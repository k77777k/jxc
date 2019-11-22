package com.wf.utils;

import com.wf.exception.JxcException;
import com.wf.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        return resultVO;
    }

    public static  ResultVO success(){
        ResultVO success = ResultVOUtil.success(null);
        return success;
    }

    public static ResultVO fail(JxcException ex){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ex.getCode());
        resultVO.setMsg(ex.getMessage());
        return  resultVO;

    }
}
