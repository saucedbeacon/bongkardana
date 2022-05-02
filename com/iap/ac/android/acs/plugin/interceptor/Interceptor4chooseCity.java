package com.iap.ac.android.acs.plugin.interceptor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.ui.activity.ChooseCityActivity;
import com.iap.ac.android.acs.plugin.ui.model.CityModel;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4chooseCity extends BaseInterceptor {
    private static final String PARAM_CITIES = "cities";
    private static final String PARAM_CITY_CODE = "adCode";
    private static final String PARAM_CITY_NAME = "city";
    private static final String PARAM_COUNTRY_CODE_LIST = "countryCodeList";
    private static final String PARAM_HOT_CITIES = "hotCities";
    private static final String PARAM_LOCALE = "locale";
    private static final String PARAM_SHOW_HOT_CITIES = "showHotCities";
    private static final String PARAM_SHOW_LOCATED_CITY = "showLocatedCity";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (iAPConnectPluginContext.jsParameters == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4chooseCity#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_CHOOSE_CITY, "parameter is null"));
        } else if (getCityList(iAPConnectPluginContext, PARAM_CITIES) == null && getCountryCodeList(iAPConnectPluginContext) == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4chooseCity#handle, country code list and city list are empty at the same time");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_CHOOSE_CITY, "country code list and city list are empty at the same time"));
        } else {
            chooseCity(iAPConnectPluginContext, iAPConnectPluginCallback);
        }
    }

    private void chooseCity(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        BroadcastReceiver initBroadcastReceiver = initBroadcastReceiver(iAPConnectPluginCallback);
        ACLog.d("IAPConnectPlugin", "Interceptor4chooseCity#chooseCity, register broadcast");
        iAPConnectPluginContext.getContext().registerReceiver(initBroadcastReceiver, new IntentFilter(Constants.ACTION_CHOOSE_CITY));
        if (iAPConnectPluginContext.getActivity() != null) {
            ACLog.d("IAPConnectPlugin", "Interceptor4chooseCity#chooseCity, start activity");
            Intent intent = new Intent(iAPConnectPluginContext.getActivity(), ChooseCityActivity.class);
            intent.putExtra(UIConstants.KEY_IS_SHOW_LOCATION, iAPConnectPluginContext.jsParameters.optBoolean(PARAM_SHOW_LOCATED_CITY, false));
            intent.putParcelableArrayListExtra(UIConstants.KEY_ALL_CITY_LIST, getCityList(iAPConnectPluginContext, PARAM_CITIES));
            intent.putExtra("locale", getLocale(iAPConnectPluginContext));
            intent.putStringArrayListExtra("countryCodeList", getCountryCodeList(iAPConnectPluginContext));
            if (iAPConnectPluginContext.jsParameters.optBoolean(PARAM_SHOW_HOT_CITIES, true)) {
                intent.putParcelableArrayListExtra(UIConstants.KEY_POPULAR_CITY_LIST, getCityList(iAPConnectPluginContext, PARAM_HOT_CITIES));
            }
            iAPConnectPluginContext.getActivity().startActivity(intent);
            return;
        }
        iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_CHOOSE_CITY, "activity is null"));
    }

    private BroadcastReceiver initBroadcastReceiver(@NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        return new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra(Constants.KEY_CITY_NAME);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_CITY_CODE);
                StringBuilder sb = new StringBuilder("Interceptor4chooseCity#onReceive broadcast, city: ");
                sb.append(stringExtra);
                sb.append(", code: ");
                sb.append(stringExtra2);
                ACLog.d("IAPConnectPlugin", sb.toString());
                Interceptor4chooseCity.this.convertResult(stringExtra, stringExtra2, iAPConnectPluginCallback);
                ACLog.d("IAPConnectPlugin", "Interceptor4chooseCity#onReceive broadcast, unregister broadcast");
                context.unregisterReceiver(this);
            }
        };
    }

    private ArrayList<CityModel> getCityList(IAPConnectPluginContext iAPConnectPluginContext, String str) {
        JSONArray optJSONArray = iAPConnectPluginContext.jsParameters.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            ACLog.e("IAPConnectPlugin", "Interceptor4chooseCity#getCityList, json array is empty, key: ".concat(String.valueOf(str)));
            return null;
        }
        ArrayList<CityModel> arrayList = new ArrayList<>(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                CityModel cityModel = new CityModel();
                cityModel.name = optJSONObject.optString("city");
                cityModel.code = optJSONObject.optString(PARAM_CITY_CODE);
                if (!TextUtils.isEmpty(cityModel.name) && !TextUtils.isEmpty(cityModel.code)) {
                    arrayList.add(cityModel);
                }
            }
        }
        return arrayList;
    }

    private ArrayList<String> getCountryCodeList(IAPConnectPluginContext iAPConnectPluginContext) {
        JSONArray optJSONArray = iAPConnectPluginContext.jsParameters.optJSONArray("countryCodeList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            ACLog.e("IAPConnectPlugin", "Interceptor4chooseCity#getCountryCodeList, json array is empty");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }

    private String getLocale(IAPConnectPluginContext iAPConnectPluginContext) {
        return iAPConnectPluginContext.jsParameters.optString("locale");
    }

    /* access modifiers changed from: private */
    public void convertResult(String str, String str2, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_CHOOSE_CITY, "-1", "User cancel"));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("city", str);
            jSONObject.put(PARAM_CITY_CODE, str2);
            iAPConnectPluginCallback.onResult(jSONObject);
            MonitorUtil.monitorChooseCity(str, str2);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4chooseCity#convertResult, convert result to JSON error");
            MonitorUtil.monitorJSONError(Constants.JS_API_CHOOSE_CITY, e);
        }
    }
}
