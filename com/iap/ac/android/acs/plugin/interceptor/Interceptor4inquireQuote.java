package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4inquireQuote extends BaseInterceptor {
    private static final String PARAM_BUY_CURRENCY = "buyCurrency";
    private static final String PARAM_SELL_CURRENCY = "sellCurrency";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4inquireQuote#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_INQUIRE_QUOTE, "parameter is null"));
            return;
        }
        String optString = jSONObject.optString(PARAM_SELL_CURRENCY);
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4inquireQuote#handle, sellCurrency is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_INQUIRE_QUOTE, "sellCurrency is empty"));
            return;
        }
        String optString2 = jSONObject.optString(PARAM_BUY_CURRENCY);
        if (TextUtils.isEmpty(optString2)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4inquireQuote#handle, buyCurrency is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_INQUIRE_QUOTE, "buyCurrency is empty"));
            return;
        }
        inquireQuote(optString, optString2, iAPConnectPluginCallback);
    }

    private void inquireQuote(String str, String str2, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        QuoteCurrency quoteCurrency = new QuoteCurrency();
        quoteCurrency.sellCurrency = str;
        quoteCurrency.buyCurrency = str2;
        StringBuilder sb = new StringBuilder("Interceptor4inquireQuote#inquireQuote, start to inquire quote, sellCurrency: ");
        sb.append(str);
        sb.append(", buyCurrency: ");
        sb.append(str2);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACManager.getInstance().inquireQuote(quoteCurrency, new InquireQuoteCallback() {
            public void onResult(@NonNull String str, @Nullable ForeignExchangeQuote foreignExchangeQuote) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", str);
                    if (foreignExchangeQuote != null) {
                        jSONObject.put("quoteId", foreignExchangeQuote.quoteId);
                        jSONObject.put("quoteCurrencyPair", foreignExchangeQuote.quoteCurrencyPair);
                        jSONObject.put("quotePrice", foreignExchangeQuote.quotePrice);
                        jSONObject.put("baseCurrency", foreignExchangeQuote.baseCurrency);
                        jSONObject.put("quoteUnit", foreignExchangeQuote.quoteUnit);
                        jSONObject.put("quoteStartTime", foreignExchangeQuote.quoteStartTime);
                        jSONObject.put("quoteExpiryTime", foreignExchangeQuote.quoteExpiryTime);
                    }
                    iAPConnectPluginCallback.onResult(jSONObject);
                } catch (JSONException e) {
                    ACLog.e("IAPConnectPlugin", "Interceptor4inquireQuote#inquireQuote, convert result to JSON error");
                    MonitorUtil.monitorJSONError(Constants.JS_API_INQUIRE_QUOTE, e);
                }
            }
        });
    }
}
