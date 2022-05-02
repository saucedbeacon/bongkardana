package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;

public class removeItemDecoration {
    private static final CameraLogger getMin;
    private static final String length;
    @VisibleForTesting
    int getMax = 0;
    private Facing isInside;
    @VisibleForTesting
    public int setMax = 0;
    @VisibleForTesting
    public int setMin = 0;

    static {
        String simpleName = removeItemDecoration.class.getSimpleName();
        length = simpleName;
        getMin = CameraLogger.setMin(simpleName);
    }

    public final void setMin(@NonNull Facing facing, int i) {
        setMin(i);
        this.isInside = facing;
        this.getMax = i;
        if (facing == Facing.FRONT) {
            this.getMax = ((360 - this.getMax) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }
        length();
    }

    public final void length() {
        getMin.getMax(1, "Angles changed:", "sensorOffset:", Integer.valueOf(this.getMax), "displayOffset:", Integer.valueOf(this.setMax), "deviceOrientation:", Integer.valueOf(this.setMin));
    }

    public final int getMin(@NonNull Reference reference, @NonNull Reference reference2, @NonNull Axis axis) {
        int max = getMax(reference, reference2);
        return (axis == Axis.RELATIVE_TO_SENSOR && this.isInside == Facing.FRONT) ? ((360 - max) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE : max;
    }

    private int getMax(@NonNull Reference reference, @NonNull Reference reference2) {
        if (reference == reference2) {
            return 0;
        }
        if (reference2 == Reference.BASE) {
            return ((360 - getMax(reference2, reference)) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }
        if (reference != Reference.BASE) {
            return ((getMax(Reference.BASE, reference2) - getMax(Reference.BASE, reference)) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }
        int i = AnonymousClass1.getMax[reference2.ordinal()];
        if (i == 1) {
            return ((360 - this.setMax) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }
        if (i == 2) {
            return (this.setMin + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }
        if (i == 3) {
            return ((360 - this.getMax) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }
        throw new RuntimeException("Unknown reference: ".concat(String.valueOf(reference2)));
    }

    /* renamed from: o.removeItemDecoration$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.otaliastudios.cameraview.engine.offset.Reference[] r0 = com.otaliastudios.cameraview.engine.offset.Reference.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                com.otaliastudios.cameraview.engine.offset.Reference r1 = com.otaliastudios.cameraview.engine.offset.Reference.VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.engine.offset.Reference r1 = com.otaliastudios.cameraview.engine.offset.Reference.OUTPUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.otaliastudios.cameraview.engine.offset.Reference r1 = com.otaliastudios.cameraview.engine.offset.Reference.SENSOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.removeItemDecoration.AnonymousClass1.<clinit>():void");
        }
    }

    public final boolean getMin(@NonNull Reference reference, @NonNull Reference reference2) {
        return getMin(reference, reference2, Axis.ABSOLUTE) % 180 != 0;
    }

    public static void setMin(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            throw new IllegalStateException("This value is not sanitized: ".concat(String.valueOf(i)));
        }
    }
}
