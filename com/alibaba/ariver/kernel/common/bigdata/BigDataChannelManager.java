package com.alibaba.ariver.kernel.common.bigdata;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class BigDataChannelManager {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, BigDataChannelModel> f10090a;
    private Map<String, IBigDataChannelCallback> b;

    private BigDataChannelManager() {
        this.b = new ConcurrentHashMap();
        this.f10090a = new ConcurrentHashMap(8);
    }

    static class InstanceHolder {
        static BigDataChannelManager sInstance = new BigDataChannelManager();

        private InstanceHolder() {
        }
    }

    public static BigDataChannelManager getInstance() {
        return InstanceHolder.sInstance;
    }

    public void registerReceiveDataCallback(String str, IBigDataChannelCallback iBigDataChannelCallback) {
        this.b.put(str, iBigDataChannelCallback);
    }

    public String createDirectPassChannel(String str, String str2, int i, IBigDataConsumerReadyCallback iBigDataConsumerReadyCallback) {
        return createChannel(str, str2, i, 1, iBigDataConsumerReadyCallback);
    }

    public String createChannel(String str, String str2, int i, int i2) {
        return createChannel(str, str2, i, i2, (IBigDataConsumerReadyCallback) null);
    }

    public String createChannel(String str, String str2, int i, int i2, IBigDataConsumerReadyCallback iBigDataConsumerReadyCallback) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(2133343033, oncanceled);
            onCancelLoad.getMin(2133343033, oncanceled);
        }
        return createChannelWithBuffer(str, str2, i, i2, 0, iBigDataConsumerReadyCallback);
    }

    public String createChannelWithBuffer(String str, String str2, int i, int i2, int i3) {
        return createChannelWithBuffer(str, str2, i, i2, 0, (IBigDataConsumerReadyCallback) null);
    }

    public String createChannelWithBuffer(String str, String str2, int i, int i2, int i3, IBigDataConsumerReadyCallback iBigDataConsumerReadyCallback) {
        String obj = UUID.randomUUID().toString();
        BigDataChannelModel bigDataChannelModel = new BigDataChannelModel();
        bigDataChannelModel.setChannelId(obj);
        bigDataChannelModel.setWorkerId(str);
        bigDataChannelModel.setViewId(str2);
        bigDataChannelModel.setBizType(i);
        bigDataChannelModel.setBufferSize(i3);
        bigDataChannelModel.setPolicy(i2);
        bigDataChannelModel.setConsumerReady(true);
        bigDataChannelModel.setCallback(iBigDataConsumerReadyCallback);
        this.f10090a.put(obj, bigDataChannelModel);
        if (this.b.get(str) != null) {
            this.b.get(str).onChannelCreated(obj, str, str2);
        }
        return obj;
    }

    public void readyForNextData(String str, String str2) {
        BigDataChannelModel bigDataChannelModel;
        if (TextUtils.isEmpty(str)) {
            RVLogger.e("AriverKernel:BigDataChannelManager", "channel id is null");
            return;
        }
        Map<String, BigDataChannelModel> map = this.f10090a;
        if (map != null && (bigDataChannelModel = map.get(str)) != null) {
            bigDataChannelModel.setConsumerReady(true);
            IBigDataConsumerReadyCallback callback = bigDataChannelModel.getCallback();
            if (callback != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RVStartParams.KEY_CHANNEL_ID, (Object) str);
                jSONObject.put("viewId", (Object) str2);
                callback.onConsumerReady(jSONObject);
            }
        }
    }

    public boolean isConsumerReady(String str) {
        BigDataChannelModel bigDataChannelModel;
        if (TextUtils.isEmpty(str)) {
            RVLogger.e("AriverKernel:BigDataChannelManager", "channel id is null");
            return false;
        }
        Map<String, BigDataChannelModel> map = this.f10090a;
        if (map == null || (bigDataChannelModel = map.get(str)) == null) {
            return false;
        }
        return bigDataChannelModel.isConsumerReady();
    }

    public void releaseChannelByChannelId(String str) {
        IBigDataChannelCallback iBigDataChannelCallback;
        if (!TextUtils.isEmpty(str)) {
            String str2 = "";
            Map<String, BigDataChannelModel> map = this.f10090a;
            if (map != null) {
                BigDataChannelModel bigDataChannelModel = map.get(str);
                if (bigDataChannelModel != null) {
                    str2 = bigDataChannelModel.getWorkerId();
                }
                this.f10090a.remove(str);
            }
            if (!TextUtils.isEmpty(str2) && (iBigDataChannelCallback = this.b.get(str2)) != null) {
                iBigDataChannelCallback.onChannelReleased(str);
            }
        }
    }

    public void releaseChannelByWorkerId(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && this.b.get(str) != null) {
            this.b.remove(str);
        }
    }

    public JSONObject pickNext(String str) {
        Map<String, BigDataChannelModel> map = this.f10090a;
        if (map == null || map.isEmpty()) {
            RVLogger.e("AriverKernel:BigDataChannelManager", "pickNext, no data");
            return null;
        }
        BigDataChannelModel bigDataChannelModel = this.f10090a.get(str);
        if (bigDataChannelModel != null) {
            return bigDataChannelModel.getBufferedData();
        }
        RVLogger.e("AriverKernel:BigDataChannelManager", "pickNext, no channel");
        return null;
    }

    public void pushData(String str, JSONObject jSONObject) {
        if (this.f10090a == null) {
            this.f10090a = new ConcurrentHashMap(8);
        }
        BigDataChannelModel bigDataChannelModel = this.f10090a.get(str);
        if (bigDataChannelModel == null) {
            RVLogger.e("AriverKernel:BigDataChannelManager", "please invoke createChannel first !!!");
            return;
        }
        if (!jSONObject.containsKey(RVStartParams.KEY_CHANNEL_ID)) {
            jSONObject.put(RVStartParams.KEY_CHANNEL_ID, (Object) str);
        }
        if (!jSONObject.containsKey("workerId")) {
            jSONObject.put("workerId", (Object) bigDataChannelModel.getWorkerId());
        }
        if (!jSONObject.containsKey("viewId")) {
            jSONObject.put("viewId", (Object) bigDataChannelModel.getViewId());
        }
        IBigDataChannelCallback iBigDataChannelCallback = this.b.get(bigDataChannelModel.getWorkerId());
        if (1 == bigDataChannelModel.getPolicy()) {
            if (iBigDataChannelCallback != null) {
                iBigDataChannelCallback.onReceiveData(jSONObject);
            }
        } else if (2 == bigDataChannelModel.getPolicy()) {
            bigDataChannelModel.enqueueBuffer(jSONObject);
        }
    }

    public void releaseAllChannel() {
        Map<String, BigDataChannelModel> map = this.f10090a;
        if (map != null) {
            for (String next : map.keySet()) {
                BigDataChannelModel bigDataChannelModel = this.f10090a.get(next);
                if (bigDataChannelModel != null) {
                    bigDataChannelModel.releaseBuffer();
                }
                IBigDataChannelCallback iBigDataChannelCallback = this.b.get(bigDataChannelModel.getWorkerId());
                if (iBigDataChannelCallback != null) {
                    iBigDataChannelCallback.onChannelReleased(next);
                }
            }
            this.b.clear();
            this.f10090a.clear();
        }
    }
}
