package com.mgtv.ft.rpc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mgtv.ft.common.rpc.AbstractClient;
import com.mgtv.ft.vo.BootVo;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class BootHttpClient<E> extends AbstractClient {



    @Override
    protected E innerExecute(String api, String paramStr) throws Exception {
       Class clazz = getClassByApi(api);
        return null;
    }

    private static Class getClassByApi(String api) {
        Class<BootVo> bootVoClass = BootVo.class;
        return BootVo.class;
    }

    public static void main(String[] args) {
        //执行RPC调用
        String response = doRpc();

        Class clazz = getClassByApi("boot");

        Object o = JSONObject.parseObject(response, clazz);

        System.out.println(o);
    }

    private static String doRpc() {
        BootVo bootVo = new BootVo();
        bootVo.setId("123456");
        bootVo.setUrl("http://www.mgtv.com");
        return JSON.toJSONString(bootVo);
    }
}
