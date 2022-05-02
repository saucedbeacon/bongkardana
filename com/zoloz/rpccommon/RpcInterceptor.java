package com.zoloz.rpccommon;

public interface RpcInterceptor {
    void onPostExecute(NetRequest netRequest, NetResponse netResponse);

    void onPreExecute(NetRequest netRequest);
}
