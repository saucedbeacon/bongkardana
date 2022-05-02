package o;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class onPopulateAccessibilityEvent {
    private static final JsonReader.setMax getMax = JsonReader.setMax.getMin("nm");
    private static final JsonReader.setMax length = JsonReader.setMax.getMin("d", "a");
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("nm", "ind", "refId", "ty", "parent", "sw", "sh", RVParams.SAFEPAY_CONTEXT, "ks", "tt", "masksProperties", "shapes", SecurityConstants.KEY_TEXT, "ef", RVParams.SHOW_REPORT_BTN, RVParams.SHOW_TITLEBAR, "w", "h", "ip", "op", RVParams.TOOLBAR_MENU, "cl", "hd");

    public static Layer setMax(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        JsonReader jsonReader2 = jsonReader;
        setVerticalGravity setverticalgravity2 = setverticalgravity;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.setMin();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String str = null;
        forceSuggestionQuery forcesuggestionquery = null;
        launchQuerySearch launchquerysearch = null;
        adjustDropDownSizeAndPosition adjustdropdownsizeandposition = null;
        onTextFocusChanged ontextfocuschanged = null;
        long j = -1;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 1.0f;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f4 = 0.0f;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (jsonReader.getMin()) {
            switch (jsonReader2.setMin(setMin)) {
                case 0:
                    str3 = jsonReader.toIntRange();
                    break;
                case 1:
                    j2 = (long) jsonReader.values();
                    break;
                case 2:
                    str = jsonReader.toIntRange();
                    break;
                case 3:
                    int values = jsonReader.values();
                    if (values >= Layer.LayerType.UNKNOWN.ordinal()) {
                        layerType = Layer.LayerType.UNKNOWN;
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[values];
                        break;
                    }
                case 4:
                    j = (long) jsonReader.values();
                    break;
                case 5:
                    i = (int) (((float) jsonReader.values()) * setTitleMarginStart.getMax());
                    break;
                case 6:
                    i2 = (int) (((float) jsonReader.values()) * setTitleMarginStart.getMax());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.toIntRange());
                    break;
                case 8:
                    forcesuggestionquery = setTrackTintMode.setMin(jsonReader, setverticalgravity);
                    break;
                case 9:
                    int values2 = jsonReader.values();
                    if (values2 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[values2];
                        int i6 = AnonymousClass1.length[matteType2.ordinal()];
                        if (i6 == 1) {
                            setTitleMargin.setMax("Unsupported matte type: Luma");
                            setverticalgravity2.length.add("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            setTitleMargin.setMax("Unsupported matte type: Luma Inverted");
                            setverticalgravity2.length.add("Unsupported matte type: Luma Inverted");
                        }
                        setverticalgravity2.hashCode++;
                        break;
                    } else {
                        String concat = "Unsupported matte type: ".concat(String.valueOf(values2));
                        setTitleMargin.setMax(concat);
                        setverticalgravity2.length.add(concat);
                        break;
                    }
                case 10:
                    jsonReader.length();
                    while (jsonReader.getMin()) {
                        arrayList3.add(setTextOff.length(jsonReader, setverticalgravity));
                    }
                    setverticalgravity2.hashCode += arrayList3.size();
                    jsonReader.getMax();
                    break;
                case 11:
                    jsonReader.length();
                    while (jsonReader.getMin()) {
                        isLandscapeMode min = applyTrackTint.setMin(jsonReader, setverticalgravity);
                        if (min != null) {
                            arrayList4.add(min);
                        }
                    }
                    jsonReader.getMax();
                    break;
                case 12:
                    jsonReader.setMin();
                    while (jsonReader.getMin()) {
                        int min2 = jsonReader2.setMin(length);
                        if (min2 == 0) {
                            launchquerysearch = new launchQuerySearch(getSplitTrack.setMin(jsonReader2, setverticalgravity2, 1.0f, setThumbDrawable.getMin, false));
                        } else if (min2 != 1) {
                            jsonReader.isInside();
                            jsonReader.FastBitmap$CoordinateSystem();
                        } else {
                            jsonReader.length();
                            if (jsonReader.getMin()) {
                                adjustdropdownsizeandposition = getTrackDrawable.setMin(jsonReader, setverticalgravity);
                            }
                            while (jsonReader.getMin()) {
                                jsonReader.FastBitmap$CoordinateSystem();
                            }
                            jsonReader.getMax();
                        }
                    }
                    jsonReader.setMax();
                    break;
                case 13:
                    jsonReader.length();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.getMin()) {
                        jsonReader.setMin();
                        while (jsonReader.getMin()) {
                            if (jsonReader2.setMin(getMax) != 0) {
                                jsonReader.isInside();
                                jsonReader.FastBitmap$CoordinateSystem();
                            } else {
                                arrayList5.add(jsonReader.toIntRange());
                            }
                        }
                        jsonReader.setMax();
                    }
                    jsonReader.getMax();
                    String concat2 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList5));
                    setTitleMargin.setMax(concat2);
                    setverticalgravity2.length.add(concat2);
                    break;
                case 14:
                    f2 = (float) jsonReader.toDoubleRange();
                    break;
                case 15:
                    f3 = (float) jsonReader.toDoubleRange();
                    break;
                case 16:
                    i4 = (int) (((float) jsonReader.values()) * setTitleMarginStart.getMax());
                    break;
                case 17:
                    i5 = (int) (((float) jsonReader.values()) * setTitleMarginStart.getMax());
                    break;
                case 18:
                    f = (float) jsonReader.toDoubleRange();
                    break;
                case 19:
                    f4 = (float) jsonReader.toDoubleRange();
                    break;
                case 20:
                    ontextfocuschanged = new onTextFocusChanged(getSplitTrack.setMin(jsonReader2, setverticalgravity2, 1.0f, getThumbDrawable.getMax, false));
                    break;
                case 21:
                    str2 = jsonReader.toIntRange();
                    break;
                case 22:
                    z = jsonReader.equals();
                    break;
                default:
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                    break;
            }
        }
        jsonReader.setMax();
        ArrayList arrayList6 = new ArrayList();
        if (f > 0.0f) {
            setTitleMarginTop settitlemargintop = r0;
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            setTitleMarginTop settitlemargintop2 = new setTitleMarginTop(setverticalgravity, valueOf2, valueOf2, (Interpolator) null, 0.0f, Float.valueOf(f));
            arrayList2.add(settitlemargintop);
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f4 <= 0.0f) {
            f4 = setverticalgravity2.toDoubleRange;
        }
        setVerticalGravity setverticalgravity3 = setverticalgravity;
        arrayList2.add(new setTitleMarginTop(setverticalgravity3, valueOf, valueOf, (Interpolator) null, f, Float.valueOf(f4)));
        arrayList2.add(new setTitleMarginTop(setverticalgravity3, valueOf2, valueOf2, (Interpolator) null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            setTitleMargin.setMax("Convert your Illustrator layers to shape layers.");
            setverticalgravity2.length.add("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, setverticalgravity, str3, j2, layerType, j, str, arrayList, forcesuggestionquery, i, i2, i3, f2, f3, i4, i5, launchquerysearch, adjustdropdownsizeandposition, arrayList2, matteType2, ontextfocuschanged, z);
    }

    /* renamed from: o.onPopulateAccessibilityEvent$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onPopulateAccessibilityEvent.AnonymousClass1.<clinit>():void");
        }
    }

    public static Layer length(setVerticalGravity setverticalgravity) {
        Rect rect = setverticalgravity.equals;
        List emptyList = Collections.emptyList();
        Layer.LayerType layerType = Layer.LayerType.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        forceSuggestionQuery forcesuggestionquery = r4;
        forceSuggestionQuery forcesuggestionquery2 = new forceSuggestionQuery();
        return new Layer(emptyList, setverticalgravity, "__container", -1, layerType, -1, (String) null, emptyList2, forcesuggestionquery, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), (launchQuerySearch) null, (adjustDropDownSizeAndPosition) null, Collections.emptyList(), Layer.MatteType.NONE, (onTextFocusChanged) null, false);
    }
}
