package o;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
public final class removeOnChildAttachStateChangeListener {
    private static removeOnChildAttachStateChangeListener getMax;
    public static final Map<Facing, Integer> getMin = new HashMap();
    public static final Map<WhiteBalance, Integer> setMax = new HashMap();
    public static final Map<Hdr, Integer> setMin = new HashMap();

    public static removeOnChildAttachStateChangeListener getMax() {
        if (getMax == null) {
            getMax = new removeOnChildAttachStateChangeListener();
        }
        return getMax;
    }

    static {
        getMin.put(Facing.BACK, 1);
        getMin.put(Facing.FRONT, 0);
        setMax.put(WhiteBalance.AUTO, 1);
        setMax.put(WhiteBalance.CLOUDY, 6);
        setMax.put(WhiteBalance.DAYLIGHT, 5);
        setMax.put(WhiteBalance.FLUORESCENT, 3);
        setMax.put(WhiteBalance.INCANDESCENT, 2);
        setMin.put(Hdr.OFF, 0);
        setMin.put(Hdr.ON, 18);
    }

    private removeOnChildAttachStateChangeListener() {
    }

    /* renamed from: o.removeOnChildAttachStateChangeListener$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.otaliastudios.cameraview.controls.Flash[] r0 = com.otaliastudios.cameraview.controls.Flash.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.otaliastudios.cameraview.controls.Flash r1 = com.otaliastudios.cameraview.controls.Flash.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.controls.Flash r1 = com.otaliastudios.cameraview.controls.Flash.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.otaliastudios.cameraview.controls.Flash r1 = com.otaliastudios.cameraview.controls.Flash.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.otaliastudios.cameraview.controls.Flash r1 = com.otaliastudios.cameraview.controls.Flash.TORCH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.removeOnChildAttachStateChangeListener.AnonymousClass1.<clinit>():void");
        }
    }

    @NonNull
    public static List<Pair<Integer, Integer>> getMin(@NonNull Flash flash) {
        ArrayList arrayList = new ArrayList();
        int i = AnonymousClass1.setMin[flash.ordinal()];
        if (i == 1) {
            arrayList.add(new Pair(3, 0));
        } else if (i == 2) {
            arrayList.add(new Pair(2, 0));
            arrayList.add(new Pair(4, 0));
        } else if (i == 3) {
            arrayList.add(new Pair(1, 0));
            arrayList.add(new Pair(0, 0));
        } else if (i == 4) {
            arrayList.add(new Pair(1, 2));
            arrayList.add(new Pair(0, 2));
        }
        return arrayList;
    }

    public static int setMax(@NonNull Facing facing) {
        return getMin.get(facing).intValue();
    }

    public static int getMin(@NonNull WhiteBalance whiteBalance) {
        return setMax.get(whiteBalance).intValue();
    }

    public static int setMax(@NonNull Hdr hdr) {
        return setMin.get(hdr).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r2 != 4) goto L_0x002a;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set<com.otaliastudios.cameraview.controls.Flash> length(int r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            if (r2 == 0) goto L_0x0020
            r1 = 1
            if (r2 == r1) goto L_0x0020
            r1 = 2
            if (r2 == r1) goto L_0x001a
            r1 = 3
            if (r2 == r1) goto L_0x0014
            r1 = 4
            if (r2 == r1) goto L_0x001a
            goto L_0x002a
        L_0x0014:
            com.otaliastudios.cameraview.controls.Flash r2 = com.otaliastudios.cameraview.controls.Flash.ON
            r0.add(r2)
            goto L_0x002a
        L_0x001a:
            com.otaliastudios.cameraview.controls.Flash r2 = com.otaliastudios.cameraview.controls.Flash.AUTO
            r0.add(r2)
            goto L_0x002a
        L_0x0020:
            com.otaliastudios.cameraview.controls.Flash r2 = com.otaliastudios.cameraview.controls.Flash.OFF
            r0.add(r2)
            com.otaliastudios.cameraview.controls.Flash r2 = com.otaliastudios.cameraview.controls.Flash.TORCH
            r0.add(r2)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeOnChildAttachStateChangeListener.length(int):java.util.Set");
    }

    @Nullable
    public static <C extends createLayoutManager, T> C getMax(@NonNull Map<C, T> map, @NonNull T t) {
        for (C c : map.keySet()) {
            if (t.equals(map.get(c))) {
                return c;
            }
        }
        return null;
    }
}
