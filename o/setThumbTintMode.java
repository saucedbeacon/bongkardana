package o;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class setThumbTintMode implements onCreateDrawableState<onFocusChanged> {
    private int setMin;

    public setThumbTintMode(int i) {
        this.setMin = i;
    }

    private void setMin(onFocusChanged onfocuschanged, List<Float> list) {
        double d;
        onFocusChanged onfocuschanged2 = onfocuschanged;
        List<Float> list2 = list;
        int i = this.setMin * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list2.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list2.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < onfocuschanged2.length.length; i3++) {
                int i4 = onfocuschanged2.length[i3];
                double d2 = (double) onfocuschanged2.setMin[i3];
                int i5 = 1;
                while (true) {
                    if (i5 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i6 = i5 - 1;
                    double d3 = dArr[i6];
                    double d4 = dArr[i5];
                    if (dArr[i5] >= d2) {
                        Double.isNaN(d2);
                        d = getTitleMarginTop.getMax(dArr2[i6], dArr2[i5], getTitleMarginTop.setMin((d2 - d3) / (d4 - d3)));
                        break;
                    }
                    i5++;
                }
                onfocuschanged2.length[i3] = Color.argb((int) (d * 255.0d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.length();
        }
        while (jsonReader.getMin()) {
            arrayList.add(Float.valueOf((float) jsonReader.toDoubleRange()));
        }
        if (z) {
            jsonReader.getMax();
        }
        if (this.setMin == -1) {
            this.setMin = arrayList.size() / 4;
        }
        int i = this.setMin;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.setMin * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        onFocusChanged onfocuschanged = new onFocusChanged(fArr, iArr);
        setMin(onfocuschanged, arrayList);
        return onfocuschanged;
    }
}
