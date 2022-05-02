package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import id.dana.domain.version.Version;
import java.io.IOException;
import o.SavedStateHandleController;

public final class isSupportBLE extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController.AnonymousClass1 setMax;
    private SavedStateHandleController setMin;

    public isSupportBLE(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.setMax = r2;
        this.setMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Version version = (Version) obj;
        SavedStateHandleController savedStateHandleController = this.setMin;
        jsonWriter.beginObject();
        if (version != version.latestMajorVersion) {
            savedStateHandleController.setMax(jsonWriter, 146);
            jsonWriter.value(version.latestMajorVersion);
        }
        if (version != version.latestMinorVersion) {
            savedStateHandleController.setMax(jsonWriter, 161);
            jsonWriter.value(version.latestMinorVersion);
        }
        if (version != version.latestPatchVersion) {
            savedStateHandleController.setMax(jsonWriter, 27);
            jsonWriter.value(version.latestPatchVersion);
        }
        if (version != version.validMajorVersion) {
            savedStateHandleController.setMax(jsonWriter, TsExtractor.TS_STREAM_TYPE_E_AC3);
            jsonWriter.value(version.validMajorVersion);
        }
        if (version != version.validMinorVersion) {
            savedStateHandleController.setMax(jsonWriter, 121);
            jsonWriter.value(version.validMinorVersion);
        }
        if (version != version.validPatchVersion) {
            savedStateHandleController.setMax(jsonWriter, 114);
            jsonWriter.value(version.validPatchVersion);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0115, code lost:
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
            id.dana.domain.version.Version r0 = new id.dana.domain.version.Version
            r0.<init>()
            o.SavedStateHandleController$1 r1 = r7.setMax
            r8.beginObject()
        L_0x0017:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x011a
            int r3 = r1.getMin(r8)
        L_0x0021:
            com.google.gson.stream.JsonToken r4 = r8.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
            r6 = 1
            if (r4 == r5) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x00f8
            if (r3 == r6) goto L_0x00da
            r5 = 40
            if (r3 == r5) goto L_0x0021
            r5 = 42
            if (r3 == r5) goto L_0x0021
            r5 = 55
            if (r3 == r5) goto L_0x00bc
            r5 = 77
            if (r3 == r5) goto L_0x0021
            r5 = 93
            if (r3 == r5) goto L_0x009e
            r5 = 122(0x7a, float:1.71E-43)
            if (r3 == r5) goto L_0x0021
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 == r5) goto L_0x0021
            r5 = 155(0x9b, float:2.17E-43)
            if (r3 == r5) goto L_0x007f
            r5 = 169(0xa9, float:2.37E-43)
            if (r3 == r5) goto L_0x0021
            r5 = 182(0xb6, float:2.55E-43)
            if (r3 == r5) goto L_0x0021
            r5 = 183(0xb7, float:2.56E-43)
            if (r3 == r5) goto L_0x0061
            r8.skipValue()
            goto L_0x0017
        L_0x0061:
            if (r4 == 0) goto L_0x007b
            com.google.gson.stream.JsonToken r3 = r8.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x0070
            java.lang.String r3 = r8.nextString()
            goto L_0x0078
        L_0x0070:
            boolean r3 = r8.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x0078:
            r0.validPatchVersion = r3
            goto L_0x0017
        L_0x007b:
            r0.validPatchVersion = r2
            goto L_0x0115
        L_0x007f:
            if (r4 == 0) goto L_0x009a
            com.google.gson.stream.JsonToken r3 = r8.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x008e
            java.lang.String r3 = r8.nextString()
            goto L_0x0096
        L_0x008e:
            boolean r3 = r8.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x0096:
            r0.latestPatchVersion = r3
            goto L_0x0017
        L_0x009a:
            r0.latestPatchVersion = r2
            goto L_0x0115
        L_0x009e:
            if (r4 == 0) goto L_0x00b9
            com.google.gson.stream.JsonToken r3 = r8.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x00ad
            java.lang.String r3 = r8.nextString()
            goto L_0x00b5
        L_0x00ad:
            boolean r3 = r8.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x00b5:
            r0.validMajorVersion = r3
            goto L_0x0017
        L_0x00b9:
            r0.validMajorVersion = r2
            goto L_0x0115
        L_0x00bc:
            if (r4 == 0) goto L_0x00d7
            com.google.gson.stream.JsonToken r3 = r8.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x00cb
            java.lang.String r3 = r8.nextString()
            goto L_0x00d3
        L_0x00cb:
            boolean r3 = r8.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x00d3:
            r0.latestMajorVersion = r3
            goto L_0x0017
        L_0x00d7:
            r0.latestMajorVersion = r2
            goto L_0x0115
        L_0x00da:
            if (r4 == 0) goto L_0x00f5
            com.google.gson.stream.JsonToken r3 = r8.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x00e9
            java.lang.String r3 = r8.nextString()
            goto L_0x00f1
        L_0x00e9:
            boolean r3 = r8.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x00f1:
            r0.latestMinorVersion = r3
            goto L_0x0017
        L_0x00f5:
            r0.latestMinorVersion = r2
            goto L_0x0115
        L_0x00f8:
            if (r4 == 0) goto L_0x0113
            com.google.gson.stream.JsonToken r3 = r8.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x0107
            java.lang.String r3 = r8.nextString()
            goto L_0x010f
        L_0x0107:
            boolean r3 = r8.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x010f:
            r0.validMinorVersion = r3
            goto L_0x0017
        L_0x0113:
            r0.validMinorVersion = r2
        L_0x0115:
            r8.nextNull()
            goto L_0x0017
        L_0x011a:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSupportBLE.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
