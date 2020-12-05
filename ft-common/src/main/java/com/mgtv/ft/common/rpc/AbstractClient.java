package com.mgtv.ft.common.rpc;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public abstract class AbstractClient<E> {
    /**
     * 具体的远程调用（各类客户端的具体实现）
     *
     * @param api
     * @param paramStr
     * @return
     * @throws Exception
     */
    protected abstract E innerExecute(String api, String paramStr) throws Exception;
}
