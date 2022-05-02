package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class getTargetCheckedState implements onCreateDrawableState<enoughToFilter> {
    public static final getTargetCheckedState getMin = new getTargetCheckedState();
    private static final JsonReader.setMax setMax = JsonReader.setMax.getMin("c", SecurityConstants.KEY_VALUE, "i", "o");

    private getTargetCheckedState() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.length();
        }
        jsonReader.setMin();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(setMax);
            if (min == 0) {
                z = jsonReader.equals();
            } else if (min == 1) {
                list = getTextOn.setMin(jsonReader, f);
            } else if (min == 2) {
                list2 = getTextOn.setMin(jsonReader, f);
            } else if (min != 3) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                list3 = getTextOn.setMin(jsonReader, f);
            }
        }
        jsonReader.setMax();
        if (jsonReader.IsOverlapping() == JsonReader.Token.END_ARRAY) {
            jsonReader.getMax();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new enoughToFilter(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new isQueryRefinementEnabled(getTitleMarginTop.getMin(list.get(i2), list3.get(i2)), getTitleMarginTop.getMin(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new isQueryRefinementEnabled(getTitleMarginTop.getMin(list.get(i3), list3.get(i3)), getTitleMarginTop.getMin(pointF3, list2.get(0)), pointF3));
            }
            return new enoughToFilter(pointF, z, arrayList);
        }
    }
}
