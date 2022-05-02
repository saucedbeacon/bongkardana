package o;

import android.content.Context;

public abstract class APEncodeOptions implements ImageDecoder {
    private final String length;
    private final Context setMax;
    private final fillPageCommonInfo setMin;

    APEncodeOptions(Context context, fillPageCommonInfo fillpagecommoninfo, String str) {
        this.setMax = context;
        this.setMin = fillpagecommoninfo;
        this.length = str;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(android.content.Intent r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.setMax
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = r6.length
            int r2 = r1.hashCode()
            r3 = -873340145(0xffffffffcbf1e30f, float:-3.1704606E7)
            r4 = 1
            r5 = -1
            if (r2 == r3) goto L_0x0021
            r3 = -867642800(0xffffffffcc48d250, float:-5.264416E7)
            if (r2 == r3) goto L_0x0017
            goto L_0x002b
        L_0x0017:
            java.lang.String r2 = "FRAGMENT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x0021:
            java.lang.String r2 = "ACTIVITY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002b
            r1 = 0
            goto L_0x002c
        L_0x002b:
            r1 = -1
        L_0x002c:
            if (r1 == 0) goto L_0x0035
            if (r1 == r4) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r0.startActivity(r7)
        L_0x0034:
            return
        L_0x0035:
            r0.setResult(r5, r7)
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.APEncodeOptions.getMax(android.content.Intent):void");
    }

    public final Context setMax() {
        return this.setMax;
    }

    /* access modifiers changed from: package-private */
    public final fillPageCommonInfo length() {
        return this.setMin;
    }
}
