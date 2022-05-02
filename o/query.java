package o;

import com.facebook.litho.ComponentsReporter;

public final class query implements ComponentsReporter.setMin {

    /* renamed from: o.query$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.litho.ComponentsReporter$LogLevel[] r0 = com.facebook.litho.ComponentsReporter.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.facebook.litho.ComponentsReporter$LogLevel r1 = com.facebook.litho.ComponentsReporter.LogLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.litho.ComponentsReporter$LogLevel r1 = com.facebook.litho.ComponentsReporter.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.litho.ComponentsReporter$LogLevel r1 = com.facebook.litho.ComponentsReporter.LogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.query.AnonymousClass2.<clinit>():void");
        }
    }

    public final void setMin(ComponentsReporter.LogLevel logLevel, String str) {
        if (AnonymousClass2.setMin[logLevel.ordinal()] == 3) {
            throw new RuntimeException(str);
        }
    }
}
