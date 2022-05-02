package com.alibaba.ariver.app.api;

import com.alibaba.ariver.kernel.RVParams;

public class ParamImpl {

    /* renamed from: a  reason: collision with root package name */
    private String f8949a;
    private String b;
    private RVParams.ParamType c;
    private Object d;
    private boolean e;

    public ParamImpl(String str, String str2, RVParams.ParamType paramType, Object obj) {
        this.f8949a = str;
        this.b = str2;
        this.c = paramType;
        this.d = obj;
    }

    public ParamImpl(String str, String str2, boolean z, RVParams.ParamType paramType, Object obj) {
        this.f8949a = str;
        this.b = str2;
        this.c = paramType;
        this.d = obj;
        this.e = z;
    }

    public void setDefaultValue(Object obj) {
        this.d = obj;
    }

    public String getLongName() {
        return this.f8949a;
    }

    public String getShortName() {
        return this.b;
    }

    public RVParams.ParamType getType() {
        return this.c;
    }

    public void setType(RVParams.ParamType paramType) {
        this.c = paramType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (id.dana.sendmoney.summary.SummaryActivity.CHECKED.equalsIgnoreCase(r0) != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle unify(android.os.Bundle r5, boolean r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0013
            java.lang.String r6 = r4.f8949a
            boolean r6 = r5.containsKey(r6)
            if (r6 != 0) goto L_0x0013
            java.lang.String r6 = r4.b
            boolean r6 = r5.containsKey(r6)
            if (r6 != 0) goto L_0x0013
            return r5
        L_0x0013:
            com.alibaba.ariver.kernel.RVParams$ParamType r6 = com.alibaba.ariver.kernel.RVParams.ParamType.BOOLEAN
            com.alibaba.ariver.kernel.RVParams$ParamType r0 = r4.c
            r1 = 0
            if (r6 != r0) goto L_0x0082
            java.lang.Object r6 = r4.d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r0 = r4.b
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r4.b
            java.lang.Object r1 = r5.get(r0)
            goto L_0x003f
        L_0x0031:
            java.lang.String r0 = r4.f8949a
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r4.f8949a
            java.lang.Object r1 = r5.get(r0)
        L_0x003f:
            boolean r0 = r1 instanceof java.lang.String
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r1.trim()
            java.lang.String r1 = "YES"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0055
        L_0x0053:
            r6 = 1
            goto L_0x007b
        L_0x0055:
            java.lang.String r1 = "NO"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x005f
        L_0x005d:
            r6 = 0
            goto L_0x007b
        L_0x005f:
            java.lang.String r1 = "false"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0068
            goto L_0x005d
        L_0x0068:
            java.lang.String r1 = "true"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x007b
            goto L_0x0053
        L_0x0071:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x007b
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
        L_0x007b:
            java.lang.String r0 = r4.f8949a
            r5.putBoolean(r0, r6)
            goto L_0x0167
        L_0x0082:
            com.alibaba.ariver.kernel.RVParams$ParamType r6 = com.alibaba.ariver.kernel.RVParams.ParamType.STRING
            com.alibaba.ariver.kernel.RVParams$ParamType r0 = r4.c
            if (r6 != r0) goto L_0x00b6
            java.lang.Object r6 = r4.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = r4.b
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r4.b
            java.lang.String r6 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getStringOnly(r5, r0, r6)
            goto L_0x00a9
        L_0x009b:
            java.lang.String r0 = r4.f8949a
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r4.f8949a
            java.lang.String r6 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getStringOnly(r5, r0, r6)
        L_0x00a9:
            if (r6 == 0) goto L_0x00af
            java.lang.String r6 = r6.trim()
        L_0x00af:
            java.lang.String r0 = r4.f8949a
            r5.putString(r0, r6)
            goto L_0x0167
        L_0x00b6:
            com.alibaba.ariver.kernel.RVParams$ParamType r6 = com.alibaba.ariver.kernel.RVParams.ParamType.INT
            com.alibaba.ariver.kernel.RVParams$ParamType r0 = r4.c
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r4.d
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.String r0 = r4.b
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r4.b
            java.lang.Object r1 = r5.get(r0)
            goto L_0x00e1
        L_0x00d3:
            java.lang.String r0 = r4.f8949a
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r4.f8949a
            java.lang.Object r1 = r5.get(r0)
        L_0x00e1:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x010d
            boolean r1 = r4.e
            if (r1 == 0) goto L_0x00fd
            java.lang.Integer r0 = com.alibaba.ariver.kernel.common.utils.TypeUtils.parseColorInt(r0)
            if (r0 == 0) goto L_0x010d
            r6 = r0
            goto L_0x010d
        L_0x00fd:
            int r6 = com.alibaba.ariver.kernel.common.utils.TypeUtils.parseInt(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x010d
        L_0x0106:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x010d
            r6 = r1
            java.lang.Integer r6 = (java.lang.Integer) r6
        L_0x010d:
            if (r6 == 0) goto L_0x0167
            java.lang.String r0 = r4.f8949a
            int r6 = r6.intValue()
            r5.putInt(r0, r6)
            goto L_0x0167
        L_0x0119:
            com.alibaba.ariver.kernel.RVParams$ParamType r6 = com.alibaba.ariver.kernel.RVParams.ParamType.DOUBLE
            com.alibaba.ariver.kernel.RVParams$ParamType r0 = r4.c
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0167
            java.lang.Object r6 = r4.d
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            double r2 = (double) r6
            java.lang.String r6 = r4.b
            boolean r6 = r5.containsKey(r6)
            if (r6 == 0) goto L_0x013b
            java.lang.String r6 = r4.b
            java.lang.Object r1 = r5.get(r6)
            goto L_0x0149
        L_0x013b:
            java.lang.String r6 = r4.f8949a
            boolean r6 = r5.containsKey(r6)
            if (r6 == 0) goto L_0x0149
            java.lang.String r6 = r4.f8949a
            java.lang.Object r1 = r5.get(r6)
        L_0x0149:
            boolean r6 = r1 instanceof java.lang.String
            if (r6 == 0) goto L_0x0158
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = r1.trim()
            double r2 = com.alibaba.ariver.kernel.common.utils.TypeUtils.parseDouble(r6)
            goto L_0x0162
        L_0x0158:
            boolean r6 = r1 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0162
            java.lang.Double r1 = (java.lang.Double) r1
            double r2 = r1.doubleValue()
        L_0x0162:
            java.lang.String r6 = r4.f8949a
            r5.putDouble(r6, r2)
        L_0x0167:
            java.lang.String r6 = r4.f8949a
            java.lang.String r0 = r4.b
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            if (r6 != 0) goto L_0x0176
            java.lang.String r6 = r4.b
            r5.remove(r6)
        L_0x0176:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ParamImpl.unify(android.os.Bundle, boolean):android.os.Bundle");
    }
}
