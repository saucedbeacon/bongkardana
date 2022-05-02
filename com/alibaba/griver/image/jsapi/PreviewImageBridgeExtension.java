package com.alibaba.griver.image.jsapi;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5Event;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.image.photo.PhotoContext;
import com.alibaba.griver.image.photo.PhotoServiceImpl;
import com.alibaba.griver.image.photo.listener.PhotoBrowseListener;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.ArrayList;

public class PreviewImageBridgeExtension implements BridgeExtension {
    public static final String TAG = "PreviewImageBridgeExtension";

    @ActionFilter
    public void mediaBrowser(@BindingParam({"medias"}) String[] strArr, @BindingParam({"init"}) int i, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
    }

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public void imageViewer(@BindingNode(Page.class) Page page, @BindingParam({"images"}) JSONArray jSONArray, @BindingParam({"init"}) int i, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        Bundle bundle = new Bundle();
        if (jSONArray == null || jSONArray.size() == 0) {
            RVLogger.debug(TAG, "invalid images parameter.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", (Object) Boolean.FALSE);
            jSONObject2.put("error", (Object) Integer.valueOf(H5Event.Error.INVALID_PARAM.ordinal()));
            bridgeCallback.sendJSONResponse(jSONObject2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            String apUrlToFilePath = H5ResourceHandlerUtil.apUrlToFilePath(jSONObject3.getString("u"));
            String apUrlToFilePath2 = H5ResourceHandlerUtil.apUrlToFilePath(jSONObject3.getString(SecurityConstants.KEY_TEXT));
            if (!TextUtils.isEmpty(apUrlToFilePath) || !TextUtils.isEmpty(apUrlToFilePath2)) {
                if (!TextUtils.isEmpty(apUrlToFilePath) && apUrlToFilePath.startsWith("/storage")) {
                    apUrlToFilePath = PhotoContext.FILE_SCHEME.concat(String.valueOf(apUrlToFilePath));
                }
                if (!TextUtils.isEmpty(apUrlToFilePath2) && apUrlToFilePath2.startsWith("/storage")) {
                    apUrlToFilePath2 = PhotoContext.FILE_SCHEME.concat(String.valueOf(apUrlToFilePath2));
                }
                PhotoInfo photoInfo = new PhotoInfo(apUrlToFilePath);
                photoInfo.setThumbPath(apUrlToFilePath2);
                arrayList.add(photoInfo);
            }
        }
        if (i < 0 || i >= arrayList.size()) {
            i = 0;
        }
        bundle.putInt(PhotoParam.PREVIEW_POSITION, i);
        bundle.putBoolean(PhotoParam.SHOW_TEXT_INDICATOR, true);
        new PhotoServiceImpl().browsePhoto(page.getApp(), arrayList, bundle, (PhotoBrowseListener) null);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("success", (Object) Boolean.TRUE);
        bridgeCallback.sendJSONResponse(jSONObject4, true);
    }
}
