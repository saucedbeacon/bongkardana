package com.alibaba.ariver.app.api.point.dialog;

import android.content.Context;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;

public class CreateActionSheetParam {

    /* renamed from: a  reason: collision with root package name */
    private Context f8951a;
    private ArrayList<String> b;
    private ArrayList<JSONObject> c;
    private String d;
    private BridgeCallback e;

    public CreateActionSheetParam(Context context, ArrayList<String> arrayList, ArrayList<JSONObject> arrayList2, String str, BridgeCallback bridgeCallback) {
        this.f8951a = context;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = str;
        this.e = bridgeCallback;
    }

    public Context getContext() {
        return this.f8951a;
    }

    public ArrayList<String> getList() {
        return this.b;
    }

    public ArrayList<JSONObject> getBadgeList() {
        return this.c;
    }

    public String getTitle() {
        return this.d;
    }

    public BridgeCallback getBridgeContext() {
        return this.e;
    }
}
