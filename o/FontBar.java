package o;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import id.dana.data.globalnetwork.model.GnAuthResult;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import o.FontSizeSettingProxy;
import o.SavedStateHandleController;

public final class FontBar extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMax;
    private Gson getMin;
    private SavedStateHandleController.AnonymousClass1 length;

    public FontBar(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMin = gson;
        this.length = r2;
        this.getMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        GnAuthResult gnAuthResult = (GnAuthResult) obj;
        Gson gson = this.getMin;
        SavedStateHandleController savedStateHandleController = this.getMax;
        jsonWriter.beginObject();
        if (gnAuthResult != gnAuthResult.clientId) {
            savedStateHandleController.setMax(jsonWriter, 92);
            jsonWriter.value(gnAuthResult.clientId);
        }
        if (gnAuthResult != gnAuthResult.scopes) {
            savedStateHandleController.setMax(jsonWriter, 15);
            DialogService dialogService = new DialogService();
            Set<String> set = gnAuthResult.scopes;
            onActivityPrePaused.length(gson, dialogService, set).write(jsonWriter, set);
        }
        if (gnAuthResult != gnAuthResult.oAuthCodeFlowType) {
            savedStateHandleController.setMax(jsonWriter, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            OAuthCodeFlowType oAuthCodeFlowType = gnAuthResult.oAuthCodeFlowType;
            onActivityPrePaused.setMin(gson, OAuthCodeFlowType.class, oAuthCodeFlowType).write(jsonWriter, oAuthCodeFlowType);
        }
        if (gnAuthResult != gnAuthResult.extendInfo) {
            savedStateHandleController.setMax(jsonWriter, 152);
            onChange onchange = new onChange();
            Map<String, String> map = gnAuthResult.extendInfo;
            onActivityPrePaused.length(gson, onchange, map).write(jsonWriter, map);
        }
        if (gnAuthResult != gnAuthResult.authCode) {
            savedStateHandleController.setMax(jsonWriter, 9);
            jsonWriter.value(gnAuthResult.authCode);
        }
        savedStateHandleController.setMax(jsonWriter, 86);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(gnAuthResult.agreedOn);
        onActivityPrePaused.setMin(gson, cls, valueOf).write(jsonWriter, valueOf);
        if (gnAuthResult != gnAuthResult.callback) {
            savedStateHandleController.setMax(jsonWriter, 159);
            FontSizeSettingProxy.OnFontSizeSettingChangeListener onFontSizeSettingChangeListener = new FontSizeSettingProxy.OnFontSizeSettingChangeListener();
            Callback<OAuthResult> callback = gnAuthResult.callback;
            onActivityPrePaused.length(gson, onFontSizeSettingChangeListener, callback).write(jsonWriter, callback);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0104, code lost:
        r8.nextNull();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
        /*
            r7 = this;
            com.google.gson.stream.JsonToken r0 = r8.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r8.skipValue()
            return r2
        L_0x000d:
            id.dana.data.globalnetwork.model.GnAuthResult r0 = new id.dana.data.globalnetwork.model.GnAuthResult
            r0.<init>()
            com.google.gson.Gson r1 = r7.getMin
            o.SavedStateHandleController$1 r3 = r7.length
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0109
            int r4 = r3.getMin(r8)
        L_0x0023:
            com.google.gson.stream.JsonToken r5 = r8.peek()
            com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
            if (r5 == r6) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            r6 = 6
            if (r4 == r6) goto L_0x00ee
            r6 = 14
            if (r4 == r6) goto L_0x00d0
            r6 = 29
            if (r4 == r6) goto L_0x00bb
            r6 = 42
            if (r4 == r6) goto L_0x0023
            r6 = 59
            if (r4 == r6) goto L_0x00a3
            r6 = 62
            if (r4 == r6) goto L_0x008b
            r6 = 72
            if (r4 == r6) goto L_0x006d
            r6 = 126(0x7e, float:1.77E-43)
            if (r4 == r6) goto L_0x0055
            r5 = 165(0xa5, float:2.31E-43)
            if (r4 == r5) goto L_0x0023
            r8.skipValue()
            goto L_0x0019
        L_0x0055:
            if (r5 == 0) goto L_0x0069
            o.DialogService r4 = new o.DialogService
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.Set r4 = (java.util.Set) r4
            r0.scopes = r4
            goto L_0x0019
        L_0x0069:
            r0.scopes = r2
            goto L_0x0104
        L_0x006d:
            if (r5 == 0) goto L_0x0087
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x007c
            java.lang.String r4 = r8.nextString()
            goto L_0x0084
        L_0x007c:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0084:
            r0.authCode = r4
            goto L_0x0019
        L_0x0087:
            r0.authCode = r2
            goto L_0x0104
        L_0x008b:
            if (r5 == 0) goto L_0x00a0
            o.FontSizeSettingProxy$OnFontSizeSettingChangeListener r4 = new o.FontSizeSettingProxy$OnFontSizeSettingChangeListener
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.alipay.iap.android.wallet.acl.base.Callback r4 = (com.alipay.iap.android.wallet.acl.base.Callback) r4
            r0.callback = r4
            goto L_0x0019
        L_0x00a0:
            r0.callback = r2
            goto L_0x0104
        L_0x00a3:
            if (r5 == 0) goto L_0x00b8
            o.onChange r4 = new o.onChange
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.Map r4 = (java.util.Map) r4
            r0.extendInfo = r4
            goto L_0x0019
        L_0x00b8:
            r0.extendInfo = r2
            goto L_0x0104
        L_0x00bb:
            if (r5 == 0) goto L_0x00cd
            java.lang.Class<com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType> r4 = com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType r4 = (com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType) r4
            r0.oAuthCodeFlowType = r4
            goto L_0x0019
        L_0x00cd:
            r0.oAuthCodeFlowType = r2
            goto L_0x0104
        L_0x00d0:
            if (r5 == 0) goto L_0x00eb
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00df
            java.lang.String r4 = r8.nextString()
            goto L_0x00e7
        L_0x00df:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00e7:
            r0.clientId = r4
            goto L_0x0019
        L_0x00eb:
            r0.clientId = r2
            goto L_0x0104
        L_0x00ee:
            if (r5 == 0) goto L_0x0104
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.agreedOn = r4
            goto L_0x0019
        L_0x0104:
            r8.nextNull()
            goto L_0x0019
        L_0x0109:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FontBar.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
