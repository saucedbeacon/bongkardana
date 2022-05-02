package o;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.io.IOException;

public final class setThumbDrawable implements onCreateDrawableState<DocumentData> {
    public static final setThumbDrawable getMin = new setThumbDrawable();
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin(SecurityConstants.KEY_TEXT, "f", "s", "j", "tr", "lh", RVStartParams.KEY_LANDSCAPE_SHORT, "fc", RVParams.SAFEPAY_CONTEXT, "sw", "of");

    private setThumbDrawable() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.setMin();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (jsonReader.getMin()) {
            switch (jsonReader.setMin(setMin)) {
                case 0:
                    str = jsonReader.toIntRange();
                    break;
                case 1:
                    str2 = jsonReader.toIntRange();
                    break;
                case 2:
                    f2 = (float) jsonReader.toDoubleRange();
                    break;
                case 3:
                    int values = jsonReader.values();
                    if (values <= DocumentData.Justification.CENTER.ordinal() && values >= 0) {
                        justification2 = DocumentData.Justification.values()[values];
                        break;
                    } else {
                        justification2 = DocumentData.Justification.CENTER;
                        break;
                    }
                case 4:
                    i = jsonReader.values();
                    break;
                case 5:
                    f3 = (float) jsonReader.toDoubleRange();
                    break;
                case 6:
                    f4 = (float) jsonReader.toDoubleRange();
                    break;
                case 7:
                    i2 = getTextOn.getMin(jsonReader);
                    break;
                case 8:
                    i3 = getTextOn.getMin(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.toDoubleRange();
                    break;
                case 10:
                    z = jsonReader.equals();
                    break;
                default:
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                    break;
            }
        }
        JsonReader jsonReader2 = jsonReader;
        jsonReader.setMax();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
