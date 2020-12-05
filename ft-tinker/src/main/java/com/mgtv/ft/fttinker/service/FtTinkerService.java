package com.mgtv.ft.fttinker.service;

import com.mgtv.ft.rpc.BootRpc;
import com.mgtv.ft.vo.BootVo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class FtTinkerService {

    @Autowired
    private BootRpc bootRpc;

    /**
     *
     * @return
     */
    BootVo getBootResult(){
        return bootRpc.getResult(null).getData();
    }
}
