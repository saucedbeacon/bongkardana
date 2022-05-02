package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import o.SavedStateHandleController;

public final class inflateFromTemplate extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMin;
    private Gson setMax;
    private SavedStateHandleController.AnonymousClass1 setMin;

    public inflateFromTemplate(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.setMin = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TitleBar titleBar = (TitleBar) obj;
        Gson gson = this.setMax;
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        if (titleBar != titleBar.key) {
            savedStateHandleController.setMax(jsonWriter, 35);
            jsonWriter.value(titleBar.key);
        }
        if (titleBar != titleBar.action) {
            savedStateHandleController.setMax(jsonWriter, 17);
            jsonWriter.value(titleBar.action);
        }
        if (titleBar != titleBar.clientId) {
            savedStateHandleController.setMax(jsonWriter, 92);
            jsonWriter.value(titleBar.clientId);
        }
        if (titleBar != titleBar.appId) {
            savedStateHandleController.setMax(jsonWriter, 131);
            jsonWriter.value(titleBar.appId);
        }
        if (titleBar != titleBar.icon) {
            savedStateHandleController.setMax(jsonWriter, 151);
            jsonWriter.value(titleBar.icon);
        }
        if (titleBar != titleBar.link) {
            savedStateHandleController.setMax(jsonWriter, TsExtractor.TS_STREAM_TYPE_AC3);
            jsonWriter.value(titleBar.link);
        }
        if (titleBar != titleBar.name) {
            savedStateHandleController.setMax(jsonWriter, 63);
            jsonWriter.value(titleBar.name);
        }
        if (titleBar != titleBar.nameInd) {
            savedStateHandleController.setMax(jsonWriter, 72);
            jsonWriter.value(titleBar.nameInd);
        }
        if (titleBar != titleBar.nameTag) {
            savedStateHandleController.setMax(jsonWriter, 120);
            jsonWriter.value(titleBar.nameTag);
        }
        if (titleBar != titleBar.operationType) {
            savedStateHandleController.setMax(jsonWriter, 8);
            jsonWriter.value(titleBar.operationType);
        }
        if (titleBar != titleBar.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(titleBar.redirectUrl);
        }
        if (titleBar != titleBar.scopes) {
            savedStateHandleController.setMax(jsonWriter, 15);
            jsonWriter.value(titleBar.scopes);
        }
        if (titleBar != titleBar.userAction) {
            savedStateHandleController.setMax(jsonWriter, 163);
            jsonWriter.value(titleBar.userAction);
        }
        savedStateHandleController.setMax(jsonWriter, 98);
        jsonWriter.value(titleBar.enable);
        if (titleBar != titleBar.description) {
            savedStateHandleController.setMax(jsonWriter, 48);
            jsonWriter.value(titleBar.description);
        }
        if (titleBar != titleBar.buttonTitle) {
            savedStateHandleController.setMax(jsonWriter, 179);
            jsonWriter.value(titleBar.buttonTitle);
        }
        if (titleBar != titleBar.keyword) {
            savedStateHandleController.setMax(jsonWriter, 156);
            jsonWriter.value(titleBar.keyword);
        }
        if (titleBar != titleBar.ribbonText) {
            savedStateHandleController.setMax(jsonWriter, 170);
            jsonWriter.value(titleBar.ribbonText);
        }
        savedStateHandleController.setMax(jsonWriter, 167);
        jsonWriter.value(titleBar.hasRedDot);
        if (titleBar != titleBar.spmId) {
            savedStateHandleController.setMax(jsonWriter, 97);
            jsonWriter.value(titleBar.spmId);
        }
        if (titleBar != titleBar.skuAttr) {
            savedStateHandleController.setMax(jsonWriter, 123);
            inflateFromResource inflatefromresource = titleBar.skuAttr;
            onActivityPrePaused.setMin(gson, inflateFromResource.class, inflatefromresource).write(jsonWriter, inflatefromresource);
        }
        savedStateHandleController.setMax(jsonWriter, 32);
        jsonWriter.value(titleBar.needConsult);
        if (titleBar != titleBar.spaceCodes) {
            savedStateHandleController.setMax(jsonWriter, 58);
            setDisableOnInit setdisableoninit = new setDisableOnInit();
            List<String> list = titleBar.spaceCodes;
            onActivityPrePaused.length(gson, setdisableoninit, list).write(jsonWriter, list);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02cc, code lost:
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
            o.TitleBar r0 = new o.TitleBar
            r0.<init>()
            com.google.gson.Gson r1 = r7.setMax
            o.SavedStateHandleController$1 r3 = r7.setMin
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x02d1
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
                case 4: goto L_0x02b8;
                case 8: goto L_0x029a;
                case 13: goto L_0x027c;
                case 14: goto L_0x025e;
                case 19: goto L_0x023f;
                case 23: goto L_0x0220;
                case 36: goto L_0x0201;
                case 37: goto L_0x01e2;
                case 39: goto L_0x01c3;
                case 46: goto L_0x01ad;
                case 67: goto L_0x018e;
                case 79: goto L_0x016f;
                case 92: goto L_0x0159;
                case 107: goto L_0x0140;
                case 126: goto L_0x0121;
                case 130: goto L_0x0102;
                case 131: goto L_0x00e3;
                case 133: goto L_0x00c4;
                case 144: goto L_0x00a5;
                case 149: goto L_0x0086;
                case 150: goto L_0x0068;
                case 154: goto L_0x004a;
                case 184: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x02cc
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.enable = r4
            goto L_0x0019
        L_0x004a:
            if (r5 == 0) goto L_0x0064
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0059
            java.lang.String r4 = r8.nextString()
            goto L_0x0061
        L_0x0059:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0061:
            r0.link = r4
            goto L_0x0019
        L_0x0064:
            r0.link = r2
            goto L_0x02cc
        L_0x0068:
            if (r5 == 0) goto L_0x0082
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0077
            java.lang.String r4 = r8.nextString()
            goto L_0x007f
        L_0x0077:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x007f:
            r0.key = r4
            goto L_0x0019
        L_0x0082:
            r0.key = r2
            goto L_0x02cc
        L_0x0086:
            if (r5 == 0) goto L_0x00a1
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0095
            java.lang.String r4 = r8.nextString()
            goto L_0x009d
        L_0x0095:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x009d:
            r0.description = r4
            goto L_0x0019
        L_0x00a1:
            r0.description = r2
            goto L_0x02cc
        L_0x00a5:
            if (r5 == 0) goto L_0x00c0
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00b4
            java.lang.String r4 = r8.nextString()
            goto L_0x00bc
        L_0x00b4:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00bc:
            r0.buttonTitle = r4
            goto L_0x0019
        L_0x00c0:
            r0.buttonTitle = r2
            goto L_0x02cc
        L_0x00c4:
            if (r5 == 0) goto L_0x00df
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00d3
            java.lang.String r4 = r8.nextString()
            goto L_0x00db
        L_0x00d3:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00db:
            r0.appId = r4
            goto L_0x0019
        L_0x00df:
            r0.appId = r2
            goto L_0x02cc
        L_0x00e3:
            if (r5 == 0) goto L_0x00fe
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00f2
            java.lang.String r4 = r8.nextString()
            goto L_0x00fa
        L_0x00f2:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00fa:
            r0.nameTag = r4
            goto L_0x0019
        L_0x00fe:
            r0.nameTag = r2
            goto L_0x02cc
        L_0x0102:
            if (r5 == 0) goto L_0x011d
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0111
            java.lang.String r4 = r8.nextString()
            goto L_0x0119
        L_0x0111:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0119:
            r0.spmId = r4
            goto L_0x0019
        L_0x011d:
            r0.spmId = r2
            goto L_0x02cc
        L_0x0121:
            if (r5 == 0) goto L_0x013c
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0130
            java.lang.String r4 = r8.nextString()
            goto L_0x0138
        L_0x0130:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0138:
            r0.scopes = r4
            goto L_0x0019
        L_0x013c:
            r0.scopes = r2
            goto L_0x02cc
        L_0x0140:
            if (r5 == 0) goto L_0x0155
            o.setDisableOnInit r4 = new o.setDisableOnInit
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.spaceCodes = r4
            goto L_0x0019
        L_0x0155:
            r0.spaceCodes = r2
            goto L_0x02cc
        L_0x0159:
            if (r5 == 0) goto L_0x02cc
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.hasRedDot = r4
            goto L_0x0019
        L_0x016f:
            if (r5 == 0) goto L_0x018a
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x017e
            java.lang.String r4 = r8.nextString()
            goto L_0x0186
        L_0x017e:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0186:
            r0.action = r4
            goto L_0x0019
        L_0x018a:
            r0.action = r2
            goto L_0x02cc
        L_0x018e:
            if (r5 == 0) goto L_0x01a9
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x019d
            java.lang.String r4 = r8.nextString()
            goto L_0x01a5
        L_0x019d:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01a5:
            r0.operationType = r4
            goto L_0x0019
        L_0x01a9:
            r0.operationType = r2
            goto L_0x02cc
        L_0x01ad:
            if (r5 == 0) goto L_0x02cc
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.needConsult = r4
            goto L_0x0019
        L_0x01c3:
            if (r5 == 0) goto L_0x01de
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x01d2
            java.lang.String r4 = r8.nextString()
            goto L_0x01da
        L_0x01d2:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01da:
            r0.keyword = r4
            goto L_0x0019
        L_0x01de:
            r0.keyword = r2
            goto L_0x02cc
        L_0x01e2:
            if (r5 == 0) goto L_0x01fd
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x01f1
            java.lang.String r4 = r8.nextString()
            goto L_0x01f9
        L_0x01f1:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x01f9:
            r0.ribbonText = r4
            goto L_0x0019
        L_0x01fd:
            r0.ribbonText = r2
            goto L_0x02cc
        L_0x0201:
            if (r5 == 0) goto L_0x021c
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0210
            java.lang.String r4 = r8.nextString()
            goto L_0x0218
        L_0x0210:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0218:
            r0.redirectUrl = r4
            goto L_0x0019
        L_0x021c:
            r0.redirectUrl = r2
            goto L_0x02cc
        L_0x0220:
            if (r5 == 0) goto L_0x023b
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x022f
            java.lang.String r4 = r8.nextString()
            goto L_0x0237
        L_0x022f:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0237:
            r0.nameInd = r4
            goto L_0x0019
        L_0x023b:
            r0.nameInd = r2
            goto L_0x02cc
        L_0x023f:
            if (r5 == 0) goto L_0x025a
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x024e
            java.lang.String r4 = r8.nextString()
            goto L_0x0256
        L_0x024e:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0256:
            r0.icon = r4
            goto L_0x0019
        L_0x025a:
            r0.icon = r2
            goto L_0x02cc
        L_0x025e:
            if (r5 == 0) goto L_0x0279
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x026d
            java.lang.String r4 = r8.nextString()
            goto L_0x0275
        L_0x026d:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0275:
            r0.clientId = r4
            goto L_0x0019
        L_0x0279:
            r0.clientId = r2
            goto L_0x02cc
        L_0x027c:
            if (r5 == 0) goto L_0x0297
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x028b
            java.lang.String r4 = r8.nextString()
            goto L_0x0293
        L_0x028b:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0293:
            r0.userAction = r4
            goto L_0x0019
        L_0x0297:
            r0.userAction = r2
            goto L_0x02cc
        L_0x029a:
            if (r5 == 0) goto L_0x02b5
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x02a9
            java.lang.String r4 = r8.nextString()
            goto L_0x02b1
        L_0x02a9:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x02b1:
            r0.name = r4
            goto L_0x0019
        L_0x02b5:
            r0.name = r2
            goto L_0x02cc
        L_0x02b8:
            if (r5 == 0) goto L_0x02ca
            java.lang.Class<o.inflateFromResource> r4 = o.inflateFromResource.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.inflateFromResource r4 = (o.inflateFromResource) r4
            r0.skuAttr = r4
            goto L_0x0019
        L_0x02ca:
            r0.skuAttr = r2
        L_0x02cc:
            r8.nextNull()
            goto L_0x0019
        L_0x02d1:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.inflateFromTemplate.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
