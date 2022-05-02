package com.alipay.mobile.common.reach;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.impl.IAPSyncMessageParsedCallback;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.alipay.plus.push.core.ICallback;
import com.alipay.plus.push.core.PushMessageReceiver;
import com.alipay.plus.push.core.PushServiceInstance;
import com.alipay.plus.push.core.model.PushSource;
import com.alipay.plus.push.core.pushservice.IPushService;
import java.util.HashMap;
import java.util.List;
import o.initExtParam;
import o.setMonitorLogAppendWorker;

public class ReachManager {
    /* access modifiers changed from: private */
    public setMonitorLogAppendWorker<String> globalMessageReceiver;
    public IPushService iPushService;
    HashMap<String, setMonitorLogAppendWorker> receiverHashMap;
    private SyncProvider syncProvider;
    private String userId;

    static class SingletonReachManagerInstance {
        /* access modifiers changed from: private */
        public static final ReachManager IAP_REACH_MANAGER = new ReachManager();

        private SingletonReachManagerInstance() {
        }
    }

    public static ReachManager getInstance() {
        return SingletonReachManagerInstance.IAP_REACH_MANAGER;
    }

    private ReachManager() {
    }

    public void init(Application application) {
        this.iPushService = PushServiceInstance.create(application, PushSource.FCM);
        this.syncProvider = new SyncProvider();
        this.receiverHashMap = new HashMap<>();
        this.userId = UserInfoManager.instance().getUserId();
    }

    public void registerMsgReceiver(final String str, setMonitorLogAppendWorker setmonitorlogappendworker) {
        if (!TextUtils.isEmpty(str) && setmonitorlogappendworker != null) {
            this.receiverHashMap.put(str, setmonitorlogappendworker);
            IPushService iPushService2 = this.iPushService;
            if (iPushService2 != null) {
                iPushService2.registerMsgReceiver(str, new PushMessageReceiver() {
                    public void onMessageReceived(Object obj) {
                        setMonitorLogAppendWorker setmonitorlogappendworker = ReachManager.this.receiverHashMap.get(str);
                        if (setmonitorlogappendworker != null) {
                            initExtParam initextparam = new initExtParam();
                            initextparam.length = obj;
                            initextparam.getMin = obj.toString();
                            setmonitorlogappendworker.getMin(initextparam);
                        }
                    }
                });
            }
            SyncProvider syncProvider2 = this.syncProvider;
            if (syncProvider2 != null) {
                syncProvider2.registerReceiveCallback(str, new IAPSyncMessageParsedCallback() {
                    public void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list) {
                        ReachManager.this.onReceiveSyncData(iAPSyncMessage, str);
                    }
                });
            }
        }
    }

    public void onReceiveSyncData(@NonNull IAPSyncMessage iAPSyncMessage, String str) {
        setMonitorLogAppendWorker setmonitorlogappendworker = this.receiverHashMap.get(str);
        if (setmonitorlogappendworker != null) {
            initExtParam initextparam = new initExtParam();
            initextparam.length = iAPSyncMessage.msgData;
            initextparam.getMin = iAPSyncMessage.msgData;
            setmonitorlogappendworker.getMin(initextparam);
        }
    }

    public void registerGlobalMsgReceiver(setMonitorLogAppendWorker<String> setmonitorlogappendworker) {
        this.globalMessageReceiver = setmonitorlogappendworker;
        IPushService iPushService2 = this.iPushService;
        if (iPushService2 != null) {
            iPushService2.registerGlobalMsgReceiver(new PushMessageReceiver<String>() {
                public void onMessageReceived(String str) {
                    initExtParam initextparam = new initExtParam();
                    initextparam.length = str;
                    initextparam.getMin = str;
                    ReachManager.this.globalMessageReceiver.getMin(initextparam);
                }
            });
        }
    }

    public void dispatchMessage(Object obj) {
        IPushService iPushService2;
        if (obj != null && (iPushService2 = this.iPushService) != null) {
            iPushService2.dispatchMessage(obj);
        }
    }

    public void unregisterMsgReceiver(setMonitorLogAppendWorker setmonitorlogappendworker) {
        for (String next : this.receiverHashMap.keySet()) {
            if (this.receiverHashMap.get(next) == setmonitorlogappendworker) {
                this.receiverHashMap.remove(next);
            }
        }
    }

    public void report(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.iPushService.report(str, (ICallback) null);
        }
    }

    public void setSyncProvider(SyncProvider syncProvider2) {
        this.syncProvider = syncProvider2;
    }
}
