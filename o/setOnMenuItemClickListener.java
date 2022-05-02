package o;

import android.view.View;

public abstract class setOnMenuItemClickListener extends haltActionBarHideOffsetAnimations {
    private static final String[] setMax = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public final void getMin(hasIcon hasicon) {
        View view = hasicon.setMin;
        Integer num = (Integer) hasicon.setMax.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        hasicon.setMax.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        hasicon.setMax.put("android:visibilityPropagation:center", iArr);
    }

    public final String[] setMin() {
        return setMax;
    }
}
