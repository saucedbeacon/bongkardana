package com.alibaba.ariver.app.api.ui.darkmode;

public class ColorSchemeModelTemplate<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f8955a;
    private T b;
    private T c;
    private ColorSchemeDecider d;

    public T getTarget() {
        T t;
        ColorSchemeDecider colorSchemeDecider = this.d;
        if (colorSchemeDecider != null) {
            int i = AnonymousClass1.$SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType[colorSchemeDecider.getCurrentColorScheme().ordinal()];
            if (i == 1) {
                T t2 = this.b;
                if (t2 != null) {
                    return t2;
                }
            } else if (i == 2 && (t = this.c) != null) {
                return t;
            }
        }
        return this.f8955a;
    }

    /* renamed from: com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeModelTemplate$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeType[] r0 = com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType = r0
                com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeType r1 = com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeType.LIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeType r1 = com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeType.DARK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeModelTemplate.AnonymousClass1.<clinit>():void");
        }
    }

    public void setColorSchemeDecider(ColorSchemeDecider colorSchemeDecider) {
        this.d = colorSchemeDecider;
    }

    public void setDefault(T t) {
        this.f8955a = t;
    }

    public void setLight(T t) {
        this.b = t;
    }

    public void setDark(T t) {
        this.c = t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorSchemeModelTemplate{def=");
        sb.append(this.f8955a);
        sb.append(", light=");
        sb.append(this.b);
        sb.append(", dark=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
