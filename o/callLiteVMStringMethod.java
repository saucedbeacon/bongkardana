package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class callLiteVMStringMethod {
    private static final String FIELD_PER_FEATURE_COUNTS = "pf";
    @SerializedName("pf")
    public final List<reloadLiteVMInstance> perFeature;

    public callLiteVMStringMethod(List<reloadLiteVMInstance> list) {
        this.perFeature = list;
    }

    public int hashCode() {
        return this.perFeature.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            if (r9 != r10) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r10 == 0) goto L_0x0072
            java.lang.Class r2 = r9.getClass()
            java.lang.Class r3 = r10.getClass()
            if (r2 == r3) goto L_0x0012
            goto L_0x0072
        L_0x0012:
            o.callLiteVMStringMethod r10 = (o.callLiteVMStringMethod) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<o.reloadLiteVMInstance> r10 = r10.perFeature
            r2.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List<o.reloadLiteVMInstance> r3 = r9.perFeature
            r10.<init>(r3)
            int r3 = r2.size()
            int r4 = r10.size()
            if (r3 == r4) goto L_0x002d
            return r1
        L_0x002d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r2.next()
            o.reloadLiteVMInstance r4 = (o.reloadLiteVMInstance) r4
            java.lang.String r5 = r4.feature
            r3.put(r5, r4)
            goto L_0x0036
        L_0x0048:
            java.util.Iterator r10 = r10.iterator()
        L_0x004c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r10.next()
            o.reloadLiteVMInstance r2 = (o.reloadLiteVMInstance) r2
            java.lang.String r4 = r2.feature
            java.lang.Object r4 = r3.get(r4)
            o.reloadLiteVMInstance r4 = (o.reloadLiteVMInstance) r4
            if (r4 == 0) goto L_0x0070
            int r5 = r2.count
            int r6 = r4.count
            if (r5 != r6) goto L_0x0070
            long r5 = r2.timeframe
            long r7 = r4.timeframe
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x004c
        L_0x0070:
            return r1
        L_0x0071:
            return r0
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.callLiteVMStringMethod.equals(java.lang.Object):boolean");
    }
}
