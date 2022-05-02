package o;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import java.util.HashMap;
import java.util.Map;

public final class setOnFlingListener {
    private static setOnFlingListener getMax;
    private static final Map<WhiteBalance, String> getMin = new HashMap();
    private static final Map<Facing, Integer> length = new HashMap();
    private static final Map<Hdr, String> setMax = new HashMap();
    private static final Map<Flash, String> setMin = new HashMap();

    @NonNull
    public static setOnFlingListener getMin() {
        if (getMax == null) {
            getMax = new setOnFlingListener();
        }
        return getMax;
    }

    static {
        setMin.put(Flash.OFF, CameraParams.FLASH_MODE_OFF);
        setMin.put(Flash.ON, CameraParams.FLASH_MODE_ON);
        setMin.put(Flash.AUTO, "auto");
        setMin.put(Flash.TORCH, "torch");
        length.put(Facing.BACK, 0);
        length.put(Facing.FRONT, 1);
        getMin.put(WhiteBalance.AUTO, "auto");
        getMin.put(WhiteBalance.INCANDESCENT, "incandescent");
        getMin.put(WhiteBalance.FLUORESCENT, "fluorescent");
        getMin.put(WhiteBalance.DAYLIGHT, "daylight");
        getMin.put(WhiteBalance.CLOUDY, "cloudy-daylight");
        setMax.put(Hdr.OFF, "auto");
        if (Build.VERSION.SDK_INT >= 17) {
            setMax.put(Hdr.ON, "hdr");
        } else {
            setMax.put(Hdr.ON, "hdr");
        }
    }

    private setOnFlingListener() {
    }

    @NonNull
    public static String getMax(@NonNull Flash flash) {
        return setMin.get(flash);
    }

    public static int getMax(@NonNull Facing facing) {
        return length.get(facing).intValue();
    }

    @NonNull
    public static String getMax(@NonNull WhiteBalance whiteBalance) {
        return getMin.get(whiteBalance);
    }

    @NonNull
    public static String setMax(@NonNull Hdr hdr) {
        return setMax.get(hdr);
    }

    @Nullable
    public static Flash setMin(@NonNull String str) {
        return (Flash) getMin(setMin, str);
    }

    @Nullable
    public static Facing setMin(int i) {
        return (Facing) getMin(length, Integer.valueOf(i));
    }

    @Nullable
    public static WhiteBalance setMax(@NonNull String str) {
        return (WhiteBalance) getMin(getMin, str);
    }

    @Nullable
    public static Hdr getMin(@NonNull String str) {
        return (Hdr) getMin(setMax, str);
    }

    @Nullable
    private static <C extends createLayoutManager, T> C getMin(@NonNull Map<C, T> map, @NonNull T t) {
        for (C c : map.keySet()) {
            if (t.equals(map.get(c))) {
                return c;
            }
        }
        return null;
    }
}
