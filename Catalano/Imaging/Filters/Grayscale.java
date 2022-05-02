package Catalano.Imaging.Filters;

public final class Grayscale {
    public double getMax = 0.7154d;
    public boolean getMin = false;
    public Algorithm length;
    public double setMax = 0.0721d;
    public double setMin = 0.2125d;

    public enum Algorithm {
        Lightness,
        Average,
        GeometricMean,
        Luminosity,
        MinimumDecomposition,
        MaximumDecomposition
    }

    public Grayscale() {
    }

    public Grayscale(Algorithm algorithm) {
        this.length = algorithm;
        this.getMin = true;
    }

    /* renamed from: Catalano.Imaging.Filters.Grayscale$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Catalano.Imaging.Filters.Grayscale$Algorithm[] r0 = Catalano.Imaging.Filters.Grayscale.Algorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.Lightness     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.Average     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.GeometricMean     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.Luminosity     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x003e }
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.MinimumDecomposition     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0049 }
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.MaximumDecomposition     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Catalano.Imaging.Filters.Grayscale.AnonymousClass5.<clinit>():void");
        }
    }
}
