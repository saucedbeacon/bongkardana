package o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

public class onWindowStartingSupportActionMode {
    private final Object setMax;

    @Nullable
    public onSupportActionModeFinished getMax(int i) {
        return null;
    }

    public void getMax(int i, @NonNull onSupportActionModeFinished onsupportactionmodefinished, @NonNull String str, @Nullable Bundle bundle) {
    }

    @Nullable
    public List<onSupportActionModeFinished> length(String str, int i) {
        return null;
    }

    @Nullable
    public onSupportActionModeFinished setMax(int i) {
        return null;
    }

    public boolean setMin(int i, int i2, Bundle bundle) {
        return false;
    }

    @RequiresApi(16)
    static class setMax extends AccessibilityNodeProvider {
        final onWindowStartingSupportActionMode length;

        setMax(onWindowStartingSupportActionMode onwindowstartingsupportactionmode) {
            this.length = onwindowstartingsupportactionmode;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            onSupportActionModeFinished max = this.length.setMax(i);
            if (max == null) {
                return null;
            }
            return max.getMin();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<onSupportActionModeFinished> length2 = this.length.length(str, i);
            if (length2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = length2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(length2.get(i2).getMin());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.length.setMin(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    static class setMin extends setMax {
        setMin(onWindowStartingSupportActionMode onwindowstartingsupportactionmode) {
            super(onwindowstartingsupportactionmode);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            onSupportActionModeFinished max = this.length.getMax(i);
            if (max == null) {
                return null;
            }
            return max.getMin();
        }
    }

    @RequiresApi(26)
    static class getMax extends setMin {
        getMax(onWindowStartingSupportActionMode onwindowstartingsupportactionmode) {
            super(onwindowstartingsupportactionmode);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.length.getMax(i, onSupportActionModeFinished.getMin(accessibilityNodeInfo), str, bundle);
        }
    }

    public onWindowStartingSupportActionMode() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.setMax = new getMax(this);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.setMax = new setMin(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.setMax = new setMax(this);
        } else {
            this.setMax = null;
        }
    }

    public onWindowStartingSupportActionMode(Object obj) {
        this.setMax = obj;
    }

    public Object length() {
        return this.setMax;
    }
}
