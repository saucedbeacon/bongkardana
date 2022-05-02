package com.alipay.iap.android.matamata.plugins.render;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.plus.android.render.RenderManager;
import com.alipay.plus.android.render.component.LocalTemplateComponent;
import com.alipay.plus.android.render.model.TemplateInfo;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o.DANAJobIntentService;
import o.dispatchKeyShortcutEvent;
import o.getExtraData;

public class RenderTemplateConfigPlugin extends DANAJobIntentService {
    private static final String DATABASE_NAME = "render_template_data.db";
    private static final String EVENT_SEARCH_TEMPLATE = "searchTemplate";
    private static final String EVENT_UPDATE_TEMPLATE = "updateTemplate";
    private static final String ID = "RenderTemplateConfig";
    private static final String PARAM_REQUEST_TEMPLATE = "template";
    private static final String PARAM_REQUEST_TEMPLATE_CODE = "templateCode";
    private static final String PARAM_RESULT_DATA = "data";
    private TemplateDBManager<TemplateInfo> mTemplateDBManager;

    public String getId() {
        return ID;
    }

    public RenderTemplateConfigPlugin(Context context) {
        TemplateDBManager<TemplateInfo> templateDBManager = new TemplateDBManager<>(TemplateInfo.class, context);
        this.mTemplateDBManager = templateDBManager;
        templateDBManager.setDatabase(DATABASE_NAME);
    }

    public synchronized void onConnect(dispatchKeyShortcutEvent dispatchkeyshortcutevent) {
        super.onConnect(dispatchkeyshortcutevent);
        dispatchkeyshortcutevent.receive(EVENT_SEARCH_TEMPLATE, new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
                RenderTemplateConfigPlugin.this.searchTemplate(flipperObject, getextradata);
            }
        });
        dispatchkeyshortcutevent.receive(EVENT_UPDATE_TEMPLATE, new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
                RenderTemplateConfigPlugin.this.updateTemplate(flipperObject, getextradata);
            }
        });
    }

    private FlipperArray getData(String str) {
        FlipperArray.getMax getmax = new FlipperArray.getMax();
        try {
            for (TemplateInfo next : this.mTemplateDBManager.get(str)) {
                getmax.getMax.put(new FlipperObject(new FlipperObject.setMax().getMax(PARAM_REQUEST_TEMPLATE_CODE, next.templateCode).getMax("templateVersion", next.templateVersion).getMax(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, next.languageCode).getMax("renderEngineName", next.renderEngineName).getMax("renderEngineVersion", next.renderEngineVersion).getMax("templateConfig", next.templateConfig).getMax).setMax);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return new FlipperArray(getmax.getMax);
    }

    /* access modifiers changed from: private */
    public void searchTemplate(FlipperObject flipperObject, getExtraData getextradata) {
        String str;
        if (flipperObject.setMax.isNull(PARAM_REQUEST_TEMPLATE_CODE)) {
            str = null;
        } else {
            str = flipperObject.setMax.optString(PARAM_REQUEST_TEMPLATE_CODE);
        }
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        setmax.getMin("data", getData(str));
        getextradata.setMax(new FlipperObject(setmax.getMax));
    }

    /* access modifiers changed from: private */
    public void updateTemplate(FlipperObject flipperObject, getExtraData getextradata) {
        String str;
        if (flipperObject.setMax.isNull(PARAM_REQUEST_TEMPLATE)) {
            str = null;
        } else {
            str = flipperObject.setMax.optString(PARAM_REQUEST_TEMPLATE);
        }
        TemplateInfo templateInfo = (TemplateInfo) JSON.parseObject(str, TemplateInfo.class);
        StringBuilder sb = new StringBuilder("templateCode:");
        sb.append(templateInfo.templateCode);
        sb.append(", templateVersion:");
        sb.append(templateInfo.templateVersion);
        sb.append(", languageCode:");
        sb.append(templateInfo.languageCode);
        sb.append(", templateConfig:");
        sb.append(templateInfo.templateConfig);
        ((LocalTemplateComponent) RenderManager.getInstance().getComponent(LocalTemplateComponent.class)).save(templateInfo);
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        setmax.getMin("success", Boolean.TRUE);
        getextradata.setMax(new FlipperObject(setmax.getMax));
    }
}
