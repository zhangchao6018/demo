package com.mgtv.ft.rpc;

import com.mgtv.ft.dto.BootDto;
import com.mgtv.ft.result.ResultMap;
import com.mgtv.ft.vo.BootVo;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public interface BootRpc {

    /**
     * 调用Rpc
     * @param dto
     * @return
     */
    ResultMap<BootVo> getResult(BootDto dto);
}
