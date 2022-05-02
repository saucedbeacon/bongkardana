package o;

import android.annotation.SuppressLint;
import android.media.CamcorderProfile;
import android.os.Build;
import androidx.annotation.NonNull;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class releaseGlows {
    private static final String getMax;
    @SuppressLint({"UseSparseArrays"})
    private static Map<shouldDeferAccessibilityEvent, Integer> length;
    private static final CameraLogger setMax;

    static {
        String simpleName = releaseGlows.class.getSimpleName();
        getMax = simpleName;
        setMax = CameraLogger.setMin(simpleName);
        HashMap hashMap = new HashMap();
        length = hashMap;
        hashMap.put(new shouldDeferAccessibilityEvent(176, 144), 2);
        length.put(new shouldDeferAccessibilityEvent(320, 240), 7);
        length.put(new shouldDeferAccessibilityEvent(352, 288), 3);
        length.put(new shouldDeferAccessibilityEvent(720, 480), 4);
        length.put(new shouldDeferAccessibilityEvent(APEncodeOptions.DEFAULT_MAX_LEN, 720), 5);
        length.put(new shouldDeferAccessibilityEvent(1920, 1080), 6);
        if (Build.VERSION.SDK_INT >= 21) {
            length.put(new shouldDeferAccessibilityEvent(3840, 2160), 8);
        }
    }

    @NonNull
    public static CamcorderProfile setMin(@NonNull String str, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        try {
            return length(Integer.parseInt(str), shoulddeferaccessibilityevent);
        } catch (NumberFormatException unused) {
            setMax.getMax(2, "NumberFormatException for Camera2 id:", str);
            return CamcorderProfile.get(0);
        }
    }

    @NonNull
    public static CamcorderProfile length(int i, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        final long j = ((long) shoulddeferaccessibilityevent.getMax) * ((long) shoulddeferaccessibilityevent.getMin);
        ArrayList arrayList = new ArrayList(length.keySet());
        Collections.sort(arrayList, new Comparator<shouldDeferAccessibilityEvent>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = (shouldDeferAccessibilityEvent) obj;
                shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = (shouldDeferAccessibilityEvent) obj2;
                long abs = Math.abs(((long) (shoulddeferaccessibilityevent.getMax * shoulddeferaccessibilityevent.getMin)) - j);
                long abs2 = Math.abs(((long) (shoulddeferaccessibilityevent2.getMax * shoulddeferaccessibilityevent2.getMin)) - j);
                if (abs < abs2) {
                    return -1;
                }
                return abs == abs2 ? 0 : 1;
            }
        });
        while (arrayList.size() > 0) {
            int intValue = length.get((shouldDeferAccessibilityEvent) arrayList.remove(0)).intValue();
            if (CamcorderProfile.hasProfile(i, intValue)) {
                return CamcorderProfile.get(i, intValue);
            }
        }
        return CamcorderProfile.get(i, 0);
    }
}
