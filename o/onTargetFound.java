package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class onTargetFound {
    private final setMin getMax = new setMin();

    public interface setMax {
        void setMax(View view);
    }

    public static class length {
        public final int getMax;
        public final String getMin;
        public final int length;
        public final int setMax;
        public final String setMin;
        public final String toIntRange;

        public length(int i, String str, int i2, int i3, String str2, String str3) {
            this.getMax = i;
            this.getMin = str;
            this.length = i2;
            this.setMax = i3;
            this.setMin = str2;
            this.toIntRange = str3;
        }

        public final String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.getMax == 1) {
                    jSONObject.put("prefix", "shortest");
                }
                if (this.getMin != null) {
                    jSONObject.put("view_class", this.getMin);
                }
                if (this.length >= 0) {
                    jSONObject.put("index", this.length);
                }
                if (this.setMax >= 0) {
                    jSONObject.put("id", this.setMax);
                }
                if (this.setMin != null) {
                    jSONObject.put("contentDescription", this.setMin);
                }
                if (this.toIntRange != null) {
                    jSONObject.put("tag", this.toIntRange);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                throw new RuntimeException("Can't serialize PathElement to String", e);
            }
        }
    }

    public final void length(View view, List<length> list, setMax setmax) {
        if (!list.isEmpty()) {
            if (this.getMax.getMax()) {
                findOnePartiallyOrCompletelyInvisibleChild.isInside();
                return;
            }
            List<length> subList = list.subList(1, list.size());
            setMin setmin = this.getMax;
            int i = setmin.setMax;
            setmin.setMax++;
            setmin.setMin[i] = 0;
            View min = setMin(list.get(0), view, i);
            setMin setmin2 = this.getMax;
            setmin2.setMax--;
            if (setmin2.setMax < 0) {
                throw new ArrayIndexOutOfBoundsException(setmin2.setMax);
            } else if (min != null) {
                getMax(min, subList, setmax);
            }
        }
    }

    private void getMax(View view, List<length> list, setMax setmax) {
        if (list.isEmpty()) {
            setmax.setMax(view);
        } else if (view instanceof ViewGroup) {
            if (this.getMax.getMax()) {
                findOnePartiallyOrCompletelyInvisibleChild.getMax();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            length length2 = list.get(0);
            List<length> subList = list.subList(1, list.size());
            int childCount = viewGroup.getChildCount();
            setMin setmin = this.getMax;
            int i = setmin.setMax;
            setmin.setMax++;
            setmin.setMin[i] = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View min = setMin(length2, viewGroup.getChildAt(i2), i);
                if (min != null) {
                    getMax(min, subList, setmax);
                }
                if (length2.length >= 0 && this.getMax.setMin[i] > length2.length) {
                    break;
                }
            }
            setMin setmin2 = this.getMax;
            setmin2.setMax--;
            if (setmin2.setMax < 0) {
                throw new ArrayIndexOutOfBoundsException(setmin2.setMax);
            }
        }
    }

    private View setMin(length length2, View view, int i) {
        int i2 = this.getMax.setMin[i];
        if (getMin(length2, view)) {
            int[] iArr = this.getMax.setMin;
            iArr[i] = iArr[i] + 1;
            if (length2.length == -1 || length2.length == i2) {
                return view;
            }
        }
        if (length2.getMax != 1 || !(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View min = setMin(length2, viewGroup.getChildAt(i3), i);
            if (min != null) {
                return min;
            }
        }
        return null;
    }

    private static boolean getMin(length length2, View view) {
        if (length2.getMin != null && !getMax(view, length2.getMin)) {
            return false;
        }
        if (-1 != length2.setMax && view.getId() != length2.setMax) {
            return false;
        }
        if (length2.setMin != null && !length2.setMin.equals(view.getContentDescription())) {
            return false;
        }
        String str = length2.toIntRange;
        if (length2.toIntRange == null) {
            return true;
        }
        if (view.getTag() == null || !str.equals(view.getTag().toString())) {
            return false;
        }
        return true;
    }

    private static boolean getMax(Object obj, String str) {
        Class cls = obj.getClass();
        while (true) {
            String canonicalName = cls.getCanonicalName();
            if (canonicalName != null && canonicalName.equals(str)) {
                return true;
            }
            if (cls == Object.class) {
                return false;
            }
            cls = cls.getSuperclass();
        }
    }

    static class setMin {
        int setMax = 0;
        final int[] setMin = new int[256];

        public final boolean getMax() {
            return this.setMin.length == this.setMax;
        }
    }
}
