package at.wirecube.additiveanimations.helper.evaluators;

import android.graphics.Path;
import android.graphics.PathMeasure;

public final class PathEvaluator {
    private float getMax = 0.0f;
    private float getMin = -1.0f;
    private float[] length = new float[2];

    public enum PathMode {
        X,
        Y,
        ROTATION;

        public static PathMode from(int i) {
            if (i == 1) {
                return Y;
            }
            if (i != 2) {
                return X;
            }
            return ROTATION;
        }
    }

    /* renamed from: at.wirecube.additiveanimations.helper.evaluators.PathEvaluator$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                at.wirecube.additiveanimations.helper.evaluators.PathEvaluator$PathMode[] r0 = at.wirecube.additiveanimations.helper.evaluators.PathEvaluator.PathMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                at.wirecube.additiveanimations.helper.evaluators.PathEvaluator$PathMode r1 = at.wirecube.additiveanimations.helper.evaluators.PathEvaluator.PathMode.X     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                at.wirecube.additiveanimations.helper.evaluators.PathEvaluator$PathMode r1 = at.wirecube.additiveanimations.helper.evaluators.PathEvaluator.PathMode.Y     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                at.wirecube.additiveanimations.helper.evaluators.PathEvaluator$PathMode r1 = at.wirecube.additiveanimations.helper.evaluators.PathEvaluator.PathMode.ROTATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: at.wirecube.additiveanimations.helper.evaluators.PathEvaluator.AnonymousClass2.<clinit>():void");
        }
    }

    private float setMax(PathMode pathMode) {
        int i = AnonymousClass2.length[pathMode.ordinal()];
        if (i == 1) {
            return this.length[0];
        }
        if (i == 2) {
            return this.length[1];
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.getMax;
    }

    public final float setMax(float f, PathMode pathMode, Path path) {
        if (f == this.getMin) {
            return setMax(pathMode);
        }
        float[] fArr = new float[2];
        PathMeasure pathMeasure = new PathMeasure(path, true);
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.length, fArr);
        this.getMax = (float) ((Math.atan2((double) fArr[1], (double) fArr[0]) * 180.0d) / 3.141592653589793d);
        this.getMin = f;
        return setMax(pathMode);
    }
}
