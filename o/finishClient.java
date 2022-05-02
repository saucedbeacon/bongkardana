package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class finishClient extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController.AnonymousClass1 getMin;
    private SavedStateHandleController setMax;

    public finishClient(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.getMin = r2;
        this.setMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getActivityClz getactivityclz = (getActivityClz) obj;
        SavedStateHandleController savedStateHandleController = this.setMax;
        jsonWriter.beginObject();
        if (getactivityclz != getactivityclz.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(getactivityclz.title);
        }
        if (getactivityclz != getactivityclz.subtitle) {
            savedStateHandleController.setMax(jsonWriter, 73);
            jsonWriter.value(getactivityclz.subtitle);
        }
        if (getactivityclz != getactivityclz.subtitleType) {
            savedStateHandleController.setMax(jsonWriter, 64);
            jsonWriter.value(getactivityclz.subtitleType);
        }
        if (getactivityclz != getactivityclz.subtitleColor) {
            savedStateHandleController.setMax(jsonWriter, 37);
            jsonWriter.value(getactivityclz.subtitleColor);
        }
        savedStateHandleController.setMax(jsonWriter, 71);
        jsonWriter.value(getactivityclz.subtitleIsBelow);
        if (getactivityclz != getactivityclz.iconUrl) {
            savedStateHandleController.setMax(jsonWriter, 54);
            jsonWriter.value(getactivityclz.iconUrl);
        }
        if (getactivityclz != getactivityclz.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(getactivityclz.redirectUrl);
        }
        if (getactivityclz != getactivityclz.action) {
            savedStateHandleController.setMax(jsonWriter, 17);
            jsonWriter.value(getactivityclz.action);
        }
        savedStateHandleController.setMax(jsonWriter, 98);
        jsonWriter.value(getactivityclz.enable);
        if (getactivityclz != getactivityclz.collection) {
            savedStateHandleController.setMax(jsonWriter, 69);
            jsonWriter.value(getactivityclz.collection);
        }
        savedStateHandleController.setMax(jsonWriter, 18);
        jsonWriter.value(getactivityclz.nullObject);
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0167, code lost:
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
            o.getActivityClz r0 = new o.getActivityClz
            r0.<init>()
            com.google.gson.Gson r1 = r7.getMax
            o.SavedStateHandleController$1 r3 = r7.getMin
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x016c
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
                case 11: goto L_0x014a;
                case 16: goto L_0x0134;
                case 36: goto L_0x0116;
                case 45: goto L_0x00f8;
                case 51: goto L_0x00d9;
                case 73: goto L_0x00ba;
                case 79: goto L_0x009b;
                case 125: goto L_0x007d;
                case 163: goto L_0x005f;
                case 179: goto L_0x004a;
                case 184: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0167
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.enable = r4
            goto L_0x0019
        L_0x004a:
            if (r5 == 0) goto L_0x0167
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.subtitleIsBelow = r4
            goto L_0x0019
        L_0x005f:
            if (r5 == 0) goto L_0x0079
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x006e
            java.lang.String r4 = r8.nextString()
            goto L_0x0076
        L_0x006e:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0076:
            r0.subtitle = r4
            goto L_0x0019
        L_0x0079:
            r0.subtitle = r2
            goto L_0x0167
        L_0x007d:
            if (r5 == 0) goto L_0x0097
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x008c
            java.lang.String r4 = r8.nextString()
            goto L_0x0094
        L_0x008c:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0094:
            r0.collection = r4
            goto L_0x0019
        L_0x0097:
            r0.collection = r2
            goto L_0x0167
        L_0x009b:
            if (r5 == 0) goto L_0x00b6
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00aa
            java.lang.String r4 = r8.nextString()
            goto L_0x00b2
        L_0x00aa:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00b2:
            r0.action = r4
            goto L_0x0019
        L_0x00b6:
            r0.action = r2
            goto L_0x0167
        L_0x00ba:
            if (r5 == 0) goto L_0x00d5
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00c9
            java.lang.String r4 = r8.nextString()
            goto L_0x00d1
        L_0x00c9:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00d1:
            r0.iconUrl = r4
            goto L_0x0019
        L_0x00d5:
            r0.iconUrl = r2
            goto L_0x0167
        L_0x00d9:
            if (r5 == 0) goto L_0x00f4
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x00e8
            java.lang.String r4 = r8.nextString()
            goto L_0x00f0
        L_0x00e8:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00f0:
            r0.subtitleColor = r4
            goto L_0x0019
        L_0x00f4:
            r0.subtitleColor = r2
            goto L_0x0167
        L_0x00f8:
            if (r5 == 0) goto L_0x0113
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0107
            java.lang.String r4 = r8.nextString()
            goto L_0x010f
        L_0x0107:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x010f:
            r0.title = r4
            goto L_0x0019
        L_0x0113:
            r0.title = r2
            goto L_0x0167
        L_0x0116:
            if (r5 == 0) goto L_0x0131
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0125
            java.lang.String r4 = r8.nextString()
            goto L_0x012d
        L_0x0125:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x012d:
            r0.redirectUrl = r4
            goto L_0x0019
        L_0x0131:
            r0.redirectUrl = r2
            goto L_0x0167
        L_0x0134:
            if (r5 == 0) goto L_0x0167
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.nullObject = r4
            goto L_0x0019
        L_0x014a:
            if (r5 == 0) goto L_0x0165
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r4 == r5) goto L_0x0159
            java.lang.String r4 = r8.nextString()
            goto L_0x0161
        L_0x0159:
            boolean r4 = r8.nextBoolean()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0161:
            r0.subtitleType = r4
            goto L_0x0019
        L_0x0165:
            r0.subtitleType = r2
        L_0x0167:
            r8.nextNull()
            goto L_0x0019
        L_0x016c:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.finishClient.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
