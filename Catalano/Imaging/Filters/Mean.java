package Catalano.Imaging.Filters;

public final class Mean {
    public int getMax = 1;
    public int getMin = 1;
    public Arithmetic length = Arithmetic.Mean;

    public enum Arithmetic {
        Mean,
        Harmonic,
        ContraHarmonic,
        Geometry
    }

    /* renamed from: Catalano.Imaging.Filters.Mean$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Catalano.Imaging.Filters.Mean$Arithmetic[] r0 = Catalano.Imaging.Filters.Mean.Arithmetic.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                Catalano.Imaging.Filters.Mean$Arithmetic r1 = Catalano.Imaging.Filters.Mean.Arithmetic.Mean     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                Catalano.Imaging.Filters.Mean$Arithmetic r1 = Catalano.Imaging.Filters.Mean.Arithmetic.Harmonic     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                Catalano.Imaging.Filters.Mean$Arithmetic r1 = Catalano.Imaging.Filters.Mean.Arithmetic.ContraHarmonic     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                Catalano.Imaging.Filters.Mean$Arithmetic r1 = Catalano.Imaging.Filters.Mean.Arithmetic.Geometry     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Catalano.Imaging.Filters.Mean.AnonymousClass2.<clinit>():void");
        }
    }
}
