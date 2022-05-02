package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class setEnableTabClick extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 setMin;

    public setEnableTabClick(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.setMin = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        isEnableTabClick isenabletabclick = (isEnableTabClick) obj;
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        if (isenabletabclick != isenabletabclick.payAccountNo) {
            savedStateHandleController.setMax(jsonWriter, 164);
            jsonWriter.value(isenabletabclick.payAccountNo);
        }
        if (isenabletabclick != isenabletabclick.accountName) {
            savedStateHandleController.setMax(jsonWriter, 107);
            jsonWriter.value(isenabletabclick.accountName);
        }
        if (isenabletabclick != isenabletabclick.loginStatus) {
            savedStateHandleController.setMax(jsonWriter, 10);
            jsonWriter.value(isenabletabclick.loginStatus);
        }
        if (isenabletabclick != isenabletabclick.networkScenario) {
            savedStateHandleController.setMax(jsonWriter, 178);
            jsonWriter.value(isenabletabclick.networkScenario);
        }
        if (isenabletabclick != isenabletabclick.networkInfoName) {
            savedStateHandleController.setMax(jsonWriter, 158);
            jsonWriter.value(isenabletabclick.networkInfoName);
        }
        if (isenabletabclick != isenabletabclick.networkInfoScene) {
            savedStateHandleController.setMax(jsonWriter, 105);
            jsonWriter.value(isenabletabclick.networkInfoScene);
        }
        if (isenabletabclick != isenabletabclick.networkInfoSubscene) {
            savedStateHandleController.setMax(jsonWriter, 22);
            jsonWriter.value(isenabletabclick.networkInfoSubscene);
        }
        if (isenabletabclick != isenabletabclick.merchantReturnUrl) {
            savedStateHandleController.setMax(jsonWriter, 47);
            jsonWriter.value(isenabletabclick.merchantReturnUrl);
        }
        if (isenabletabclick != isenabletabclick.processingStatus) {
            savedStateHandleController.setMax(jsonWriter, 106);
            jsonWriter.value(isenabletabclick.processingStatus);
        }
        if (isenabletabclick != isenabletabclick.merchantTransId) {
            savedStateHandleController.setMax(jsonWriter, 128);
            jsonWriter.value(isenabletabclick.merchantTransId);
        }
        if (isenabletabclick != isenabletabclick.merchantLogoUrl) {
            savedStateHandleController.setMax(jsonWriter, 166);
            jsonWriter.value(isenabletabclick.merchantLogoUrl);
        }
        if (isenabletabclick != isenabletabclick.displayMerchantOrder) {
            savedStateHandleController.setMax(jsonWriter, 66);
            jsonWriter.value(isenabletabclick.displayMerchantOrder);
        }
        if (isenabletabclick != isenabletabclick.orderTitle) {
            savedStateHandleController.setMax(jsonWriter, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
            jsonWriter.value(isenabletabclick.orderTitle);
        }
        if (isenabletabclick != isenabletabclick.vaExpiredTime) {
            savedStateHandleController.setMax(jsonWriter, 77);
            jsonWriter.value(isenabletabclick.vaExpiredTime);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cd, code lost:
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
            o.isEnableTabClick r0 = new o.isEnableTabClick
            r0.<init>()
            com.google.gson.Gson r1 = r7.getMax
            o.SavedStateHandleController$1 r3 = r7.setMin
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x01d2
            int r4 = r3.getMin(r8)
            com.google.gson.stream.JsonToken r5 = r8.peek()
            com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
            if (r5 == r6) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            switch(r4) {
                case 31: goto L_0x01b0;
                case 44: goto L_0x0192;
                case 69: goto L_0x0174;
                case 84: goto L_0x0156;
                case 88: goto L_0x0137;
                case 105: goto L_0x0118;
                case 119: goto L_0x00f9;
                case 132: goto L_0x00da;
                case 134: goto L_0x00bb;
                case 157: goto L_0x00a5;
                case 162: goto L_0x008f;
                case 167: goto L_0x0071;
                case 173: goto L_0x0053;
                case 175: goto L_0x0035;
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
            r0.networkInfoName = r4
            goto L_0x0019
        L_0x004f:
            r0.networkInfoName = r2
            goto L_0x01cd
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
            r0.accountName = r4
            goto L_0x0019
        L_0x006d:
            r0.accountName = r2
            goto L_0x01cd
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
            r0.vaExpiredTime = r4
            goto L_0x0019
        L_0x008b:
            r0.vaExpiredTime = r2
            goto L_0x01cd
        L_0x008f:
            if (r5 == 0) goto L_0x00a1
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0.loginStatus = r4
            goto L_0x0019
        L_0x00a1:
            r0.loginStatus = r2
            goto L_0x01cd
        L_0x00a5:
            if (r5 == 0) goto L_0x00b7
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0.displayMerchantOrder = r4
            goto L_0x0019
        L_0x00b7:
            r0.displayMerchantOrder = r2
            goto L_0x01cd
        L_0x00bb:
            if (r5 == 0) goto L_0x00d6
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00ca
            java.lang.String r4 = r8.nextString()
            goto L_0x00d2
        L_0x00ca:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00d2:
            r0.payAccountNo = r4
            goto L_0x0019
        L_0x00d6:
            r0.payAccountNo = r2
            goto L_0x01cd
        L_0x00da:
            if (r5 == 0) goto L_0x00f5
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00e9
            java.lang.String r4 = r8.nextString()
            goto L_0x00f1
        L_0x00e9:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00f1:
            r0.networkInfoScene = r4
            goto L_0x0019
        L_0x00f5:
            r0.networkInfoScene = r2
            goto L_0x01cd
        L_0x00f9:
            if (r5 == 0) goto L_0x0114
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0108
            java.lang.String r4 = r8.nextString()
            goto L_0x0110
        L_0x0108:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0110:
            r0.networkInfoSubscene = r4
            goto L_0x0019
        L_0x0114:
            r0.networkInfoSubscene = r2
            goto L_0x01cd
        L_0x0118:
            if (r5 == 0) goto L_0x0133
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0127
            java.lang.String r4 = r8.nextString()
            goto L_0x012f
        L_0x0127:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x012f:
            r0.networkScenario = r4
            goto L_0x0019
        L_0x0133:
            r0.networkScenario = r2
            goto L_0x01cd
        L_0x0137:
            if (r5 == 0) goto L_0x0152
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0146
            java.lang.String r4 = r8.nextString()
            goto L_0x014e
        L_0x0146:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x014e:
            r0.orderTitle = r4
            goto L_0x0019
        L_0x0152:
            r0.orderTitle = r2
            goto L_0x01cd
        L_0x0156:
            if (r5 == 0) goto L_0x0171
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0165
            java.lang.String r4 = r8.nextString()
            goto L_0x016d
        L_0x0165:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x016d:
            r0.merchantTransId = r4
            goto L_0x0019
        L_0x0171:
            r0.merchantTransId = r2
            goto L_0x01cd
        L_0x0174:
            if (r5 == 0) goto L_0x018f
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0183
            java.lang.String r4 = r8.nextString()
            goto L_0x018b
        L_0x0183:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x018b:
            r0.processingStatus = r4
            goto L_0x0019
        L_0x018f:
            r0.processingStatus = r2
            goto L_0x01cd
        L_0x0192:
            if (r5 == 0) goto L_0x01ad
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x01a1
            java.lang.String r4 = r8.nextString()
            goto L_0x01a9
        L_0x01a1:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01a9:
            r0.merchantReturnUrl = r4
            goto L_0x0019
        L_0x01ad:
            r0.merchantReturnUrl = r2
            goto L_0x01cd
        L_0x01b0:
            if (r5 == 0) goto L_0x01cb
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x01bf
            java.lang.String r4 = r8.nextString()
            goto L_0x01c7
        L_0x01bf:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01c7:
            r0.merchantLogoUrl = r4
            goto L_0x0019
        L_0x01cb:
            r0.merchantLogoUrl = r2
        L_0x01cd:
            r8.nextNull()
            goto L_0x0019
        L_0x01d2:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEnableTabClick.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
