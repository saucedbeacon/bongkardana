package com.alibaba.griver.ui.popmenu;

import java.util.HashMap;
import java.util.Map;

public class TinyAppActionState {
    public static final String ACTION_BLUE_TOOTH = "bluetooth";
    public static final String ACTION_LOCATION = "location";
    public static final String ACTION_RECORD = "record";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Integer> f10590a = new HashMap();
    private String b;
    private boolean c;
    private int d;

    public TinyAppActionState(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public String getAction() {
        return this.b;
    }

    public void increaseCount(String str) {
        Integer num = this.f10590a.get(str);
        if (num == null) {
            this.f10590a.put(str, 1);
            this.d++;
        } else if (this.c) {
            this.f10590a.put(str, Integer.valueOf(num.intValue() + 1));
            this.d++;
        }
    }

    public void decreaseCount(String str) {
        Integer num = this.f10590a.get(str);
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() == 0) {
                this.f10590a.remove(str);
            } else {
                this.f10590a.put(str, valueOf);
            }
            this.d--;
        }
    }

    public int getCount() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getIconUnicode(android.content.res.Resources r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.b
            int r1 = r0.hashCode()
            r2 = -934908847(0xffffffffc8466c51, float:-203185.27)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 1901043637(0x714f9fb5, float:1.0281035E30)
            if (r1 == r2) goto L_0x0022
            r2 = 1968882350(0x755ac2ae, float:2.7731184E32)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "bluetooth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "record"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004d
            if (r0 == r4) goto L_0x0046
            if (r0 == r3) goto L_0x003f
            r6 = 0
            goto L_0x0053
        L_0x003f:
            int r0 = com.alibaba.griver.ui.R.string.griver_menu_mini_location
            java.lang.String r6 = r6.getString(r0)
            goto L_0x0053
        L_0x0046:
            int r0 = com.alibaba.griver.ui.R.string.griver_menu_mini_bluetooth
            java.lang.String r6 = r6.getString(r0)
            goto L_0x0053
        L_0x004d:
            int r0 = com.alibaba.griver.ui.R.string.griver_menu_mini_record
            java.lang.String r6 = r6.getString(r0)
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyAppActionState.getIconUnicode(android.content.res.Resources):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTips(android.content.res.Resources r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.b
            int r1 = r0.hashCode()
            r2 = -934908847(0xffffffffc8466c51, float:-203185.27)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 1901043637(0x714f9fb5, float:1.0281035E30)
            if (r1 == r2) goto L_0x0022
            r2 = 1968882350(0x755ac2ae, float:2.7731184E32)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "bluetooth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "record"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004d
            if (r0 == r4) goto L_0x0046
            if (r0 == r3) goto L_0x003f
            r6 = 0
            goto L_0x0053
        L_0x003f:
            int r0 = com.alibaba.griver.ui.R.string.griver_menu_tiny_use_location
            java.lang.String r6 = r6.getString(r0)
            goto L_0x0053
        L_0x0046:
            int r0 = com.alibaba.griver.ui.R.string.griver_menu_tiny_use_bluetooth
            java.lang.String r6 = r6.getString(r0)
            goto L_0x0053
        L_0x004d:
            int r0 = com.alibaba.griver.ui.R.string.griver_menu_tiny_recording
            java.lang.String r6 = r6.getString(r0)
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyAppActionState.getTips(android.content.res.Resources):java.lang.String");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TinyAppActionState{mAction='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mDuplicate=");
        sb.append(this.c);
        sb.append(", mTypeMap=");
        sb.append(this.f10590a);
        sb.append(", mCount=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
