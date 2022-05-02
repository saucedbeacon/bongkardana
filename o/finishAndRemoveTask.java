package o;

import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import java.io.IOException;
import o.SavedStateHandleController;

public final class finishAndRemoveTask extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController length;
    private SavedStateHandleController.AnonymousClass1 setMax;

    public finishAndRemoveTask(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.setMax = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        DeepLinkPayloadEntity deepLinkPayloadEntity = (DeepLinkPayloadEntity) obj;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.authCode) {
            savedStateHandleController.setMax(jsonWriter, 9);
            jsonWriter.value(deepLinkPayloadEntity.authCode);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.fullUrl) {
            savedStateHandleController.setMax(jsonWriter, 12);
            jsonWriter.value(deepLinkPayloadEntity.fullUrl);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.innerUrl) {
            savedStateHandleController.setMax(jsonWriter, 133);
            jsonWriter.value(deepLinkPayloadEntity.innerUrl);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.path) {
            savedStateHandleController.setMax(jsonWriter, 104);
            jsonWriter.value(deepLinkPayloadEntity.path);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.referralCode) {
            savedStateHandleController.setMax(jsonWriter, 132);
            jsonWriter.value(deepLinkPayloadEntity.referralCode);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.shortCode) {
            savedStateHandleController.setMax(jsonWriter, 91);
            jsonWriter.value(deepLinkPayloadEntity.shortCode);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.promoCode) {
            savedStateHandleController.setMax(jsonWriter, 52);
            jsonWriter.value(deepLinkPayloadEntity.promoCode);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.action) {
            savedStateHandleController.setMax(jsonWriter, 17);
            jsonWriter.value(deepLinkPayloadEntity.action);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.params) {
            savedStateHandleController.setMax(jsonWriter, 80);
            jsonWriter.value(deepLinkPayloadEntity.params);
        }
        savedStateHandleController.setMax(jsonWriter, 100);
        jsonWriter.value(deepLinkPayloadEntity.skipHomePage);
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.responseType) {
            savedStateHandleController.setMax(jsonWriter, 3);
            jsonWriter.value(deepLinkPayloadEntity.responseType);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.clientId) {
            savedStateHandleController.setMax(jsonWriter, 92);
            jsonWriter.value(deepLinkPayloadEntity.clientId);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.phoneNumber) {
            savedStateHandleController.setMax(jsonWriter, 174);
            jsonWriter.value(deepLinkPayloadEntity.phoneNumber);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.scope) {
            savedStateHandleController.setMax(jsonWriter, 15);
            jsonWriter.value(deepLinkPayloadEntity.scope);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.state) {
            savedStateHandleController.setMax(jsonWriter, 125);
            jsonWriter.value(deepLinkPayloadEntity.state);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.codeChallenge) {
            savedStateHandleController.setMax(jsonWriter, 61);
            jsonWriter.value(deepLinkPayloadEntity.codeChallenge);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(deepLinkPayloadEntity.redirectUrl);
        }
        savedStateHandleController.setMax(jsonWriter, 122);
        jsonWriter.value(deepLinkPayloadEntity.needMobileToken);
        savedStateHandleController.setMax(jsonWriter, WSContextConstant.HANDSHAKE_RECEIVE_SIZE);
        jsonWriter.value(deepLinkPayloadEntity.isNeedAuth);
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.serviceKey) {
            savedStateHandleController.setMax(jsonWriter, 116);
            jsonWriter.value(deepLinkPayloadEntity.serviceKey);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.source) {
            savedStateHandleController.setMax(jsonWriter, 49);
            jsonWriter.value(deepLinkPayloadEntity.source);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.bindDanaType) {
            savedStateHandleController.setMax(jsonWriter, 148);
            jsonWriter.value(deepLinkPayloadEntity.bindDanaType);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.acqSiteId) {
            savedStateHandleController.setMax(jsonWriter, 1);
            jsonWriter.value(deepLinkPayloadEntity.acqSiteId);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.merchantId) {
            savedStateHandleController.setMax(jsonWriter, 53);
            jsonWriter.value(deepLinkPayloadEntity.merchantId);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.merchantName) {
            savedStateHandleController.setMax(jsonWriter, BlobStatic.MONITOR_IMAGE_WIDTH);
            jsonWriter.value(deepLinkPayloadEntity.merchantName);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.netAuthId) {
            savedStateHandleController.setMax(jsonWriter, 57);
            jsonWriter.value(deepLinkPayloadEntity.netAuthId);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.paySiteId) {
            savedStateHandleController.setMax(jsonWriter, 81);
            jsonWriter.value(deepLinkPayloadEntity.paySiteId);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.terminalType) {
            savedStateHandleController.setMax(jsonWriter, 139);
            jsonWriter.value(deepLinkPayloadEntity.terminalType);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.signature) {
            savedStateHandleController.setMax(jsonWriter, 173);
            jsonWriter.value(deepLinkPayloadEntity.signature);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.mcc) {
            savedStateHandleController.setMax(jsonWriter, 51);
            jsonWriter.value(deepLinkPayloadEntity.mcc);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.ott) {
            savedStateHandleController.setMax(jsonWriter, 56);
            jsonWriter.value(deepLinkPayloadEntity.ott);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.android_url) {
            savedStateHandleController.setMax(jsonWriter, 14);
            jsonWriter.value(deepLinkPayloadEntity.android_url);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.referringLink) {
            savedStateHandleController.setMax(jsonWriter, 89);
            jsonWriter.value(deepLinkPayloadEntity.referringLink);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.url) {
            savedStateHandleController.setMax(jsonWriter, 84);
            jsonWriter.value(deepLinkPayloadEntity.url);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.extendedInfo) {
            savedStateHandleController.setMax(jsonWriter, 16);
            jsonWriter.value(deepLinkPayloadEntity.extendedInfo);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.codeValue) {
            savedStateHandleController.setMax(jsonWriter, 87);
            jsonWriter.value(deepLinkPayloadEntity.codeValue);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.destinationPath) {
            savedStateHandleController.setMax(jsonWriter, 153);
            jsonWriter.value(deepLinkPayloadEntity.destinationPath);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.orderId) {
            savedStateHandleController.setMax(jsonWriter, 175);
            jsonWriter.value(deepLinkPayloadEntity.orderId);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.encodedParams) {
            savedStateHandleController.setMax(jsonWriter, 36);
            jsonWriter.value(deepLinkPayloadEntity.encodedParams);
        }
        if (deepLinkPayloadEntity != deepLinkPayloadEntity.encoding) {
            savedStateHandleController.setMax(jsonWriter, 111);
            jsonWriter.value(deepLinkPayloadEntity.encoding);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04ea, code lost:
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
            id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity r0 = new id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity
            r0.<init>()
            com.google.gson.Gson r1 = r7.getMax
            o.SavedStateHandleController$1 r3 = r7.setMax
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x04ef
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
            switch(r4) {
                case 5: goto L_0x04cd;
                case 9: goto L_0x04af;
                case 10: goto L_0x0491;
                case 12: goto L_0x0473;
                case 14: goto L_0x0454;
                case 20: goto L_0x0435;
                case 28: goto L_0x0416;
                case 36: goto L_0x03f7;
                case 43: goto L_0x03d8;
                case 52: goto L_0x03b9;
                case 57: goto L_0x0023;
                case 58: goto L_0x039a;
                case 60: goto L_0x037b;
                case 70: goto L_0x035c;
                case 72: goto L_0x033d;
                case 78: goto L_0x031e;
                case 79: goto L_0x02ff;
                case 81: goto L_0x02e0;
                case 95: goto L_0x02c1;
                case 104: goto L_0x02a2;
                case 106: goto L_0x0283;
                case 109: goto L_0x0264;
                case 110: goto L_0x0245;
                case 114: goto L_0x022f;
                case 117: goto L_0x0210;
                case 126: goto L_0x01f1;
                case 141: goto L_0x01db;
                case 146: goto L_0x01bc;
                case 147: goto L_0x019d;
                case 148: goto L_0x017e;
                case 152: goto L_0x015f;
                case 158: goto L_0x0149;
                case 159: goto L_0x012a;
                case 166: goto L_0x010b;
                case 174: goto L_0x00ec;
                case 176: goto L_0x00cd;
                case 177: goto L_0x00ae;
                case 178: goto L_0x008f;
                case 181: goto L_0x0071;
                case 185: goto L_0x0053;
                case 187: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x004f
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0044
            java.lang.String r4 = r8.nextString()
            goto L_0x004c
        L_0x0044:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x004c:
            r0.terminalType = r4
            goto L_0x0019
        L_0x004f:
            r0.terminalType = r2
            goto L_0x04ea
        L_0x0053:
            if (r5 == 0) goto L_0x006d
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0062
            java.lang.String r4 = r8.nextString()
            goto L_0x006a
        L_0x0062:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x006a:
            r0.codeChallenge = r4
            goto L_0x0019
        L_0x006d:
            r0.codeChallenge = r2
            goto L_0x04ea
        L_0x0071:
            if (r5 == 0) goto L_0x008b
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0080
            java.lang.String r4 = r8.nextString()
            goto L_0x0088
        L_0x0080:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0088:
            r0.ott = r4
            goto L_0x0019
        L_0x008b:
            r0.ott = r2
            goto L_0x04ea
        L_0x008f:
            if (r5 == 0) goto L_0x00aa
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x009e
            java.lang.String r4 = r8.nextString()
            goto L_0x00a6
        L_0x009e:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00a6:
            r0.fullUrl = r4
            goto L_0x0019
        L_0x00aa:
            r0.fullUrl = r2
            goto L_0x04ea
        L_0x00ae:
            if (r5 == 0) goto L_0x00c9
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00bd
            java.lang.String r4 = r8.nextString()
            goto L_0x00c5
        L_0x00bd:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00c5:
            r0.acqSiteId = r4
            goto L_0x0019
        L_0x00c9:
            r0.acqSiteId = r2
            goto L_0x04ea
        L_0x00cd:
            if (r5 == 0) goto L_0x00e8
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00dc
            java.lang.String r4 = r8.nextString()
            goto L_0x00e4
        L_0x00dc:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00e4:
            r0.source = r4
            goto L_0x0019
        L_0x00e8:
            r0.source = r2
            goto L_0x04ea
        L_0x00ec:
            if (r5 == 0) goto L_0x0107
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00fb
            java.lang.String r4 = r8.nextString()
            goto L_0x0103
        L_0x00fb:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0103:
            r0.shortCode = r4
            goto L_0x0019
        L_0x0107:
            r0.shortCode = r2
            goto L_0x04ea
        L_0x010b:
            if (r5 == 0) goto L_0x0126
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x011a
            java.lang.String r4 = r8.nextString()
            goto L_0x0122
        L_0x011a:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0122:
            r0.destinationPath = r4
            goto L_0x0019
        L_0x0126:
            r0.destinationPath = r2
            goto L_0x04ea
        L_0x012a:
            if (r5 == 0) goto L_0x0145
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0139
            java.lang.String r4 = r8.nextString()
            goto L_0x0141
        L_0x0139:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0141:
            r0.extendedInfo = r4
            goto L_0x0019
        L_0x0145:
            r0.extendedInfo = r2
            goto L_0x04ea
        L_0x0149:
            if (r5 == 0) goto L_0x04ea
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.needMobileToken = r4
            goto L_0x0019
        L_0x015f:
            if (r5 == 0) goto L_0x017a
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x016e
            java.lang.String r4 = r8.nextString()
            goto L_0x0176
        L_0x016e:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0176:
            r0.referringLink = r4
            goto L_0x0019
        L_0x017a:
            r0.referringLink = r2
            goto L_0x04ea
        L_0x017e:
            if (r5 == 0) goto L_0x0199
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x018d
            java.lang.String r4 = r8.nextString()
            goto L_0x0195
        L_0x018d:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0195:
            r0.url = r4
            goto L_0x0019
        L_0x0199:
            r0.url = r2
            goto L_0x04ea
        L_0x019d:
            if (r5 == 0) goto L_0x01b8
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x01ac
            java.lang.String r4 = r8.nextString()
            goto L_0x01b4
        L_0x01ac:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01b4:
            r0.promoCode = r4
            goto L_0x0019
        L_0x01b8:
            r0.promoCode = r2
            goto L_0x04ea
        L_0x01bc:
            if (r5 == 0) goto L_0x01d7
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x01cb
            java.lang.String r4 = r8.nextString()
            goto L_0x01d3
        L_0x01cb:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01d3:
            r0.android_url = r4
            goto L_0x0019
        L_0x01d7:
            r0.android_url = r2
            goto L_0x04ea
        L_0x01db:
            if (r5 == 0) goto L_0x04ea
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.skipHomePage = r4
            goto L_0x0019
        L_0x01f1:
            if (r5 == 0) goto L_0x020c
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0200
            java.lang.String r4 = r8.nextString()
            goto L_0x0208
        L_0x0200:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0208:
            r0.scope = r4
            goto L_0x0019
        L_0x020c:
            r0.scope = r2
            goto L_0x04ea
        L_0x0210:
            if (r5 == 0) goto L_0x022b
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x021f
            java.lang.String r4 = r8.nextString()
            goto L_0x0227
        L_0x021f:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0227:
            r0.encoding = r4
            goto L_0x0019
        L_0x022b:
            r0.encoding = r2
            goto L_0x04ea
        L_0x022f:
            if (r5 == 0) goto L_0x04ea
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.isNeedAuth = r4
            goto L_0x0019
        L_0x0245:
            if (r5 == 0) goto L_0x0260
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0254
            java.lang.String r4 = r8.nextString()
            goto L_0x025c
        L_0x0254:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x025c:
            r0.encodedParams = r4
            goto L_0x0019
        L_0x0260:
            r0.encodedParams = r2
            goto L_0x04ea
        L_0x0264:
            if (r5 == 0) goto L_0x027f
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0273
            java.lang.String r4 = r8.nextString()
            goto L_0x027b
        L_0x0273:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x027b:
            r0.signature = r4
            goto L_0x0019
        L_0x027f:
            r0.signature = r2
            goto L_0x04ea
        L_0x0283:
            if (r5 == 0) goto L_0x029e
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0292
            java.lang.String r4 = r8.nextString()
            goto L_0x029a
        L_0x0292:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x029a:
            r0.netAuthId = r4
            goto L_0x0019
        L_0x029e:
            r0.netAuthId = r2
            goto L_0x04ea
        L_0x02a2:
            if (r5 == 0) goto L_0x02bd
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x02b1
            java.lang.String r4 = r8.nextString()
            goto L_0x02b9
        L_0x02b1:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x02b9:
            r0.innerUrl = r4
            goto L_0x0019
        L_0x02bd:
            r0.innerUrl = r2
            goto L_0x04ea
        L_0x02c1:
            if (r5 == 0) goto L_0x02dc
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x02d0
            java.lang.String r4 = r8.nextString()
            goto L_0x02d8
        L_0x02d0:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x02d8:
            r0.path = r4
            goto L_0x0019
        L_0x02dc:
            r0.path = r2
            goto L_0x04ea
        L_0x02e0:
            if (r5 == 0) goto L_0x02fb
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x02ef
            java.lang.String r4 = r8.nextString()
            goto L_0x02f7
        L_0x02ef:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x02f7:
            r0.serviceKey = r4
            goto L_0x0019
        L_0x02fb:
            r0.serviceKey = r2
            goto L_0x04ea
        L_0x02ff:
            if (r5 == 0) goto L_0x031a
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x030e
            java.lang.String r4 = r8.nextString()
            goto L_0x0316
        L_0x030e:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0316:
            r0.action = r4
            goto L_0x0019
        L_0x031a:
            r0.action = r2
            goto L_0x04ea
        L_0x031e:
            if (r5 == 0) goto L_0x0339
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x032d
            java.lang.String r4 = r8.nextString()
            goto L_0x0335
        L_0x032d:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0335:
            r0.mcc = r4
            goto L_0x0019
        L_0x0339:
            r0.mcc = r2
            goto L_0x04ea
        L_0x033d:
            if (r5 == 0) goto L_0x0358
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x034c
            java.lang.String r4 = r8.nextString()
            goto L_0x0354
        L_0x034c:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0354:
            r0.authCode = r4
            goto L_0x0019
        L_0x0358:
            r0.authCode = r2
            goto L_0x04ea
        L_0x035c:
            if (r5 == 0) goto L_0x0377
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x036b
            java.lang.String r4 = r8.nextString()
            goto L_0x0373
        L_0x036b:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0373:
            r0.paySiteId = r4
            goto L_0x0019
        L_0x0377:
            r0.paySiteId = r2
            goto L_0x04ea
        L_0x037b:
            if (r5 == 0) goto L_0x0396
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x038a
            java.lang.String r4 = r8.nextString()
            goto L_0x0392
        L_0x038a:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0392:
            r0.merchantName = r4
            goto L_0x0019
        L_0x0396:
            r0.merchantName = r2
            goto L_0x04ea
        L_0x039a:
            if (r5 == 0) goto L_0x03b5
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x03a9
            java.lang.String r4 = r8.nextString()
            goto L_0x03b1
        L_0x03a9:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x03b1:
            r0.codeValue = r4
            goto L_0x0019
        L_0x03b5:
            r0.codeValue = r2
            goto L_0x04ea
        L_0x03b9:
            if (r5 == 0) goto L_0x03d4
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x03c8
            java.lang.String r4 = r8.nextString()
            goto L_0x03d0
        L_0x03c8:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x03d0:
            r0.bindDanaType = r4
            goto L_0x0019
        L_0x03d4:
            r0.bindDanaType = r2
            goto L_0x04ea
        L_0x03d8:
            if (r5 == 0) goto L_0x03f3
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x03e7
            java.lang.String r4 = r8.nextString()
            goto L_0x03ef
        L_0x03e7:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x03ef:
            r0.referralCode = r4
            goto L_0x0019
        L_0x03f3:
            r0.referralCode = r2
            goto L_0x04ea
        L_0x03f7:
            if (r5 == 0) goto L_0x0412
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0406
            java.lang.String r4 = r8.nextString()
            goto L_0x040e
        L_0x0406:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x040e:
            r0.redirectUrl = r4
            goto L_0x0019
        L_0x0412:
            r0.redirectUrl = r2
            goto L_0x04ea
        L_0x0416:
            if (r5 == 0) goto L_0x0431
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0425
            java.lang.String r4 = r8.nextString()
            goto L_0x042d
        L_0x0425:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x042d:
            r0.phoneNumber = r4
            goto L_0x0019
        L_0x0431:
            r0.phoneNumber = r2
            goto L_0x04ea
        L_0x0435:
            if (r5 == 0) goto L_0x0450
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0444
            java.lang.String r4 = r8.nextString()
            goto L_0x044c
        L_0x0444:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x044c:
            r0.params = r4
            goto L_0x0019
        L_0x0450:
            r0.params = r2
            goto L_0x04ea
        L_0x0454:
            if (r5 == 0) goto L_0x046f
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0463
            java.lang.String r4 = r8.nextString()
            goto L_0x046b
        L_0x0463:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x046b:
            r0.clientId = r4
            goto L_0x0019
        L_0x046f:
            r0.clientId = r2
            goto L_0x04ea
        L_0x0473:
            if (r5 == 0) goto L_0x048e
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0482
            java.lang.String r4 = r8.nextString()
            goto L_0x048a
        L_0x0482:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x048a:
            r0.state = r4
            goto L_0x0019
        L_0x048e:
            r0.state = r2
            goto L_0x04ea
        L_0x0491:
            if (r5 == 0) goto L_0x04ac
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x04a0
            java.lang.String r4 = r8.nextString()
            goto L_0x04a8
        L_0x04a0:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x04a8:
            r0.responseType = r4
            goto L_0x0019
        L_0x04ac:
            r0.responseType = r2
            goto L_0x04ea
        L_0x04af:
            if (r5 == 0) goto L_0x04ca
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x04be
            java.lang.String r4 = r8.nextString()
            goto L_0x04c6
        L_0x04be:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x04c6:
            r0.merchantId = r4
            goto L_0x0019
        L_0x04ca:
            r0.merchantId = r2
            goto L_0x04ea
        L_0x04cd:
            if (r5 == 0) goto L_0x04e8
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x04dc
            java.lang.String r4 = r8.nextString()
            goto L_0x04e4
        L_0x04dc:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x04e4:
            r0.orderId = r4
            goto L_0x0019
        L_0x04e8:
            r0.orderId = r2
        L_0x04ea:
            r8.nextNull()
            goto L_0x0019
        L_0x04ef:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.finishAndRemoveTask.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
