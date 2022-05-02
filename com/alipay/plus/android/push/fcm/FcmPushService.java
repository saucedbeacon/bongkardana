package com.alipay.plus.android.push.fcm;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.plus.push.core.ICallback;
import com.alipay.plus.push.core.PushService;
import com.alipay.plus.push.core.impl.RpcPushApi;
import com.alipay.plus.push.core.model.PushMessage;
import com.alipay.plus.push.core.rpc.ResultPbPB;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.RemoteMessage;
import id.dana.domain.homeinfo.ServiceName;

public class FcmPushService extends PushService implements IAPUserChangeObserver {
    private String TAG = FcmPushService.class.getSimpleName();
    private Context context;
    private String token;
    private String userId;

    public void init(Context context2) {
        this.context = context2;
        FirebaseApp.initializeApp(context2);
        UserInfoManager.instance().addUserChangeObserver(this);
    }

    public String getPushToken() {
        try {
            if (FirebaseInstanceId.getInstance() != null) {
                return FirebaseInstanceId.getInstance().getToken();
            }
            return FirebaseInstanceId.getInstance().getToken();
        } catch (Exception unused) {
            return null;
        }
    }

    public void report(String str, final ICallback iCallback) {
        RpcPushApi.report(UtdidDeviceIdProvider.getDeviceId((Application) this.context), ServiceName.GOOGLE_PLAY, getPushToken(), 6, new ICallback<ResultPbPB>() {
            public void onSuccess(ResultPbPB resultPbPB) {
                ICallback iCallback = iCallback;
                if (iCallback != null) {
                    iCallback.onSuccess(resultPbPB);
                }
            }

            public void onFailed(String str, String str2) {
                ICallback iCallback = iCallback;
                if (iCallback != null) {
                    iCallback.onFailed(str, str2);
                }
            }
        });
    }

    public void bind(String str, final ICallback iCallback) {
        String deviceId = UtdidDeviceIdProvider.getDeviceId((Application) this.context);
        this.token = deviceId;
        if (!TextUtils.isEmpty(deviceId) && !TextUtils.isEmpty(str)) {
            RpcPushApi.bind(str, this.token, new ICallback<ResultPbPB>() {
                public void onSuccess(ResultPbPB resultPbPB) {
                    ICallback iCallback = iCallback;
                    if (iCallback != null) {
                        iCallback.onSuccess(resultPbPB);
                    }
                }

                public void onFailed(String str, String str2) {
                    ICallback iCallback = iCallback;
                    if (iCallback != null) {
                        iCallback.onFailed(str, str2);
                    }
                }
            });
        }
    }

    public void unBind(String str, final ICallback iCallback) {
        if (!TextUtils.isEmpty(str)) {
            RpcPushApi.unbind(str, this.token, new ICallback() {
                public void onSuccess(Object obj) {
                    ICallback iCallback = iCallback;
                    if (iCallback != null) {
                        iCallback.onSuccess(obj);
                    }
                }

                public void onFailed(String str, String str2) {
                    ICallback iCallback = iCallback;
                    if (iCallback != null) {
                        iCallback.onFailed(str, str2);
                    }
                }
            });
        }
    }

    public void onUserChanged(IAPLoginUserInfo iAPLoginUserInfo) {
        if (this.autoReport) {
            String userId2 = UserInfoManager.instance().getUserId();
            if (!TextUtils.isEmpty(this.userId)) {
                unBind(this.userId, (ICallback) null);
            }
            if (!TextUtils.isEmpty(userId2)) {
                bind(userId2, (ICallback) null);
            }
        }
    }

    public void onUserLogin(IAPLoginUserInfo iAPLoginUserInfo) {
        if (this.autoReport) {
            String userId2 = UserInfoManager.instance().getUserId();
            this.userId = userId2;
            bind(userId2, (ICallback) null);
        }
    }

    public void onUserLogout() {
        if (this.autoReport) {
            unBind(this.userId, (ICallback) null);
        }
    }

    public void dispatchMessage(Object obj) {
        if (obj != null) {
            if (obj instanceof RemoteMessage) {
                super.dispatchMessage(((RemoteMessage) obj).getData());
            } else if (obj instanceof PushMessage) {
                super.dispatchMessage(obj);
            }
        }
    }
}
