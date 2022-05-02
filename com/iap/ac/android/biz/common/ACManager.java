package com.iap.ac.android.biz.common;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.callback.IConfigCallback;
import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.config.preset.PresetConfigModel;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.CPMConfig;
import com.iap.ac.android.biz.common.model.remoteconfig.mpm.HookUrlConfig;
import com.iap.ac.android.biz.common.risk.RiskControlManager;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.data.ACSecurityData;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.e.a;
import com.iap.ac.android.n.b;
import java.util.List;

public class ACManager {
    public static volatile ACManager h;

    /* renamed from: a  reason: collision with root package name */
    public CommonConfig f9678a = new CommonConfig();
    public a b;
    public Context c;
    public boolean d = false;
    public ACSecurityData e;
    public InitConfig f;
    public String g;

    public static ACManager getInstance() {
        if (h == null) {
            synchronized (ACManager.class) {
                if (h == null) {
                    h = new ACManager();
                }
            }
        }
        return h;
    }

    public void clear() {
        if (this.d) {
            this.e.clear();
        }
    }

    public boolean delete(String str) {
        if (!this.d) {
            return false;
        }
        return this.e.delete(str);
    }

    public String fetch(String str) {
        ACSecurityData aCSecurityData = this.e;
        if (aCSecurityData == null) {
            return null;
        }
        return aCSecurityData.get(str);
    }

    public void fetchConfigAsync(IConfigCallback iConfigCallback) {
        if (this.d) {
            this.b.a(iConfigCallback);
        } else if (iConfigCallback != null) {
            iConfigCallback.onConfigFailed();
        }
    }

    public void fetchConfigInWorker() {
        if (this.d) {
            this.b.b((IConfigCallback) null);
        }
    }

    public boolean getAMCSToggle() {
        if (!this.d) {
            return true;
        }
        return this.b.f9706a.f9709a;
    }

    @Nullable
    public String getAppId() {
        if (!this.d) {
            return null;
        }
        return this.f.appId;
    }

    public String getClientKeyStorageKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "clientKey";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_clientKey");
        return sb.toString();
    }

    public String getCodeType(String str) {
        if (!this.d) {
            return null;
        }
        return this.b.g.a(str);
    }

    public CommonConfig getCommonConfig() {
        return this.f9678a;
    }

    public Context getContext() {
        return this.c;
    }

    public CPMConfig getCpmConfig(String str) {
        if (!this.d) {
            return null;
        }
        return this.b.b.a(str);
    }

    public List<HookUrlConfig> getHookUrlConfig() {
        if (!this.d) {
            return null;
        }
        return this.b.c.a();
    }

    public OAuthConfig getOAuthConfig() {
        if (!this.d) {
            return null;
        }
        return this.b.e.b();
    }

    public String getOpenIdStorageKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "openId";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_openId");
        return sb.toString();
    }

    public List<String> getSslCertList() {
        a aVar;
        PresetConfigModel presetConfigModel;
        if (!this.d || (aVar = this.b) == null || (presetConfigModel = aVar.f) == null || presetConfigModel.getCommonConfig() == null) {
            return null;
        }
        return aVar.f.getCommonConfig().certList;
    }

    public String getTid() {
        if (TextUtils.isEmpty(this.g)) {
            String tid = InstanceInfo.getTid(this.c);
            this.g = tid;
            if (TextUtils.isEmpty(tid)) {
                this.g = InstanceInfo.getInstanceId(this.c);
            }
        }
        return this.g;
    }

    public void init(Context context, InitConfig initConfig) {
        synchronized (this) {
            this.d = false;
            this.f = initConfig;
            ACLog.setDebuggableByContext(context);
            if (context instanceof Application) {
                this.c = context;
            } else {
                this.c = context.getApplicationContext();
            }
            SPIManager.getInstance().init(initConfig);
            this.e = com.iap.ac.android.v.a.a(context).a();
            a aVar = new a(context, initConfig.appId);
            this.b = aVar;
            CommonConfig commonConfig = aVar.f.getCommonConfig();
            this.f9678a = commonConfig;
            if (commonConfig == null || !commonConfig.isValid()) {
                ACLog.e(Constants.TAG, "read preset config error");
                return;
            }
            this.f9678a.setEnvType(initConfig.envType);
            this.g = initConfig.tid;
            RiskControlManager.getInstance().init();
            this.d = true;
        }
    }

    public void inquireQuote(@NonNull QuoteCurrency quoteCurrency, @NonNull InquireQuoteCallback inquireQuoteCallback) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LogResult logResult = new LogResult();
        if (quoteCurrency == null || inquireQuoteCallback == null) {
            StringBuilder sb = new StringBuilder("inquireQuote with invalid paramters, quoteCurrency: ");
            sb.append(quoteCurrency);
            sb.append(", callback: ");
            sb.append(inquireQuoteCallback);
            String obj = sb.toString();
            ACLog.e(Constants.TAG, obj);
            if (inquireQuoteCallback != null) {
                inquireQuoteCallback.onResult(ResultCode.PARAM_ILLEGAL, (ForeignExchangeQuote) null);
            }
            logResult.resultCode = ResultCode.PARAM_ILLEGAL;
            logResult.resultMessage = obj;
            ACLogEvent.commonEvent("ac_inquire_quote", elapsedRealtime, logResult);
            return;
        }
        IAPAsyncTask.asyncTask((Runnable) new b(quoteCurrency, inquireQuoteCallback, logResult, elapsedRealtime));
    }

    public boolean isInitialized() {
        return this.d;
    }

    public boolean save(String str, String str2) {
        ACSecurityData aCSecurityData = this.e;
        if (aCSecurityData == null) {
            return false;
        }
        return aCSecurityData.save(str, str2);
    }
}
