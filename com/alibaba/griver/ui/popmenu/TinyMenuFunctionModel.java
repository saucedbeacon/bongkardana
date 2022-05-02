package com.alibaba.griver.ui.popmenu;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;

public final class TinyMenuFunctionModel {
    public static final int HOME_APP = 1;
    public static final int RECENT_APP = 0;
    String appId;
    boolean display;
    String extra;
    public boolean fillingMark;
    int functionType;
    String iconUrl;
    boolean inMarketStage;
    String itemId;
    String name;
    String nbsn;
    String nbsv;
    String scheme;
    String slogan;

    public static List<TinyMenuFunctionModel> transfer(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new ArrayList();
        }
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size || i2 >= 8) {
                break;
            }
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            String string = jSONObject.getString(AppInfoScene.PARAM_SCENE);
            if (!TextUtils.isEmpty(string)) {
                RVLogger.d("TinyMenuFunctionModel", "filter dev version");
                if (i == size - 1 && i2 < 4 && i2 > 0) {
                    while (i2 < 4) {
                        TinyMenuFunctionModel tinyMenuFunctionModel = new TinyMenuFunctionModel();
                        tinyMenuFunctionModel.functionType = 0;
                        tinyMenuFunctionModel.fillingMark = true;
                        arrayList.add(tinyMenuFunctionModel);
                        i2++;
                    }
                }
            } else {
                TinyMenuFunctionModel tinyMenuFunctionModel2 = new TinyMenuFunctionModel();
                tinyMenuFunctionModel2.functionType = 0;
                tinyMenuFunctionModel2.appId = JSONUtils.getString(jSONObject, "appId");
                tinyMenuFunctionModel2.iconUrl = JSONUtils.getString(jSONObject, "iconUrl");
                tinyMenuFunctionModel2.name = JSONUtils.getString(jSONObject, "name");
                tinyMenuFunctionModel2.display = JSONUtils.getBoolean(jSONObject, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, false);
                tinyMenuFunctionModel2.itemId = JSONUtils.getString(jSONObject, "itemId");
                tinyMenuFunctionModel2.nbsn = string;
                tinyMenuFunctionModel2.nbsv = JSONUtils.getString(jSONObject, AppInfoScene.PARAM_SCENE_VERSION);
                tinyMenuFunctionModel2.slogan = JSONUtils.getString(jSONObject, "slogan");
                tinyMenuFunctionModel2.scheme = JSONUtils.getString(jSONObject, "scheme");
                tinyMenuFunctionModel2.extra = JSONUtils.getString(jSONObject, "extra");
                tinyMenuFunctionModel2.inMarketStage = JSONUtils.getBoolean(jSONObject, "inMarketStage", false);
                tinyMenuFunctionModel2.fillingMark = false;
                i2++;
                arrayList.add(tinyMenuFunctionModel2);
                if (i == size - 1 && i2 < 4 && i2 > 0) {
                    while (i2 < 4) {
                        TinyMenuFunctionModel tinyMenuFunctionModel3 = new TinyMenuFunctionModel();
                        tinyMenuFunctionModel3.functionType = 0;
                        tinyMenuFunctionModel3.fillingMark = true;
                        arrayList.add(tinyMenuFunctionModel3);
                        i2++;
                    }
                }
            }
            i++;
        }
        if (size >= 8) {
            TinyMenuFunctionModel tinyMenuFunctionModel4 = new TinyMenuFunctionModel();
            tinyMenuFunctionModel4.functionType = 1;
            tinyMenuFunctionModel4.name = "More";
            tinyMenuFunctionModel4.appId = "2018072560844004";
            arrayList.add(tinyMenuFunctionModel4);
        }
        return arrayList;
    }
}
