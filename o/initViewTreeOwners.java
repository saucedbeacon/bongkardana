package o;

import java.util.HashMap;

public final class initViewTreeOwners {
    HashMap<Object, HashMap<String, float[]>> length = new HashMap<>();

    /* access modifiers changed from: package-private */
    public final float getMin(Object obj, String str) {
        if (!this.length.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = this.length.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
