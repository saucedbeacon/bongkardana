package com.zoloz.rpccommon;

import java.util.ArrayList;
import java.util.List;

public class InterceptorManager implements RpcInterceptor {
    private List<RpcInterceptor> mInterceptors;

    public static InterceptorManager get() {
        return Holder.MANAGER;
    }

    private InterceptorManager() {
    }

    public void addInterceptor(RpcInterceptor rpcInterceptor) {
        if (this.mInterceptors == null) {
            this.mInterceptors = new ArrayList();
        }
        this.mInterceptors.add(rpcInterceptor);
    }

    public void removeInterceptor(RpcInterceptor rpcInterceptor) {
        List<RpcInterceptor> list = this.mInterceptors;
        if (list != null) {
            list.remove(rpcInterceptor);
        }
    }

    public void onPostExecute(NetRequest netRequest, NetResponse netResponse) {
        List<RpcInterceptor> list = this.mInterceptors;
        if (list != null) {
            for (RpcInterceptor onPostExecute : list) {
                onPostExecute.onPostExecute(netRequest, netResponse);
            }
        }
    }

    public void onPreExecute(NetRequest netRequest) {
        List<RpcInterceptor> list = this.mInterceptors;
        if (list != null) {
            for (RpcInterceptor onPreExecute : list) {
                onPreExecute.onPreExecute(netRequest);
            }
        }
    }

    static class Holder {
        static final InterceptorManager MANAGER = new InterceptorManager();

        Holder() {
        }
    }
}
