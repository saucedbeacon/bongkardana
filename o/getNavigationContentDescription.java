package o;

import com.alipay.iap.android.wallet.acl.base.ResultError;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class getNavigationContentDescription extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController.AnonymousClass1 length;
    private SavedStateHandleController setMax;

    public getNavigationContentDescription(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.length = r2;
        this.setMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        ResultError resultError = (ResultError) obj;
        SavedStateHandleController savedStateHandleController = this.setMax;
        jsonWriter.beginObject();
        savedStateHandleController.setMax(jsonWriter, 40);
        jsonWriter.value((Number) Integer.valueOf(resultError.errorCode));
        if (resultError != resultError.errorDesc) {
            savedStateHandleController.setMax(jsonWriter, 110);
            jsonWriter.value(resultError.errorDesc);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        r7.nextNull();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.gson.stream.JsonToken r0 = r7.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r7.skipValue()
            return r2
        L_0x000d:
            com.alipay.iap.android.wallet.acl.base.ResultError r0 = new com.alipay.iap.android.wallet.acl.base.ResultError
            r0.<init>()
            o.SavedStateHandleController$1 r1 = r6.length
            r7.beginObject()
        L_0x0017:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x007c
            int r3 = r1.getMin(r7)
        L_0x0021:
            com.google.gson.stream.JsonToken r4 = r7.peek()
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
            if (r4 == r5) goto L_0x002b
            r4 = 1
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            r5 = 32
            if (r3 == r5) goto L_0x0021
            r5 = 34
            if (r3 == r5) goto L_0x0021
            r5 = 63
            if (r3 == r5) goto L_0x005c
            r5 = 76
            if (r3 == r5) goto L_0x0021
            r5 = 96
            if (r3 == r5) goto L_0x0021
            r5 = 103(0x67, float:1.44E-43)
            if (r3 == r5) goto L_0x0021
            r5 = 124(0x7c, float:1.74E-43)
            if (r3 == r5) goto L_0x004c
            r7.skipValue()
            goto L_0x0017
        L_0x004c:
            if (r4 == 0) goto L_0x0078
            int r3 = r7.nextInt()     // Catch:{ NumberFormatException -> 0x0055 }
            r0.errorCode = r3     // Catch:{ NumberFormatException -> 0x0055 }
            goto L_0x0017
        L_0x0055:
            r7 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r7)
            throw r0
        L_0x005c:
            if (r4 == 0) goto L_0x0076
            com.google.gson.stream.JsonToken r3 = r7.peek()
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.BOOLEAN
            if (r3 == r4) goto L_0x006b
            java.lang.String r3 = r7.nextString()
            goto L_0x0073
        L_0x006b:
            boolean r3 = r7.nextBoolean()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
        L_0x0073:
            r0.errorDesc = r3
            goto L_0x0017
        L_0x0076:
            r0.errorDesc = r2
        L_0x0078:
            r7.nextNull()
            goto L_0x0017
        L_0x007c:
            r7.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNavigationContentDescription.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
