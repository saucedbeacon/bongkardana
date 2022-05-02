package o;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.contract.payasset.SceneType;
import id.dana.usereducation.constant.BottomSheetType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.IResultReceiver;
import o.PlaybackStateCompat;

public final class getTextOff {
    private static final JsonReader.setMax getMax = JsonReader.setMax.getMin(BottomSheetType.LIST);
    private static final JsonReader.setMax getMin = JsonReader.setMax.getMin("w", "h", "ip", "op", "fr", SecurityConstants.KEY_VALUE, "layers", SceneType.ASSETS, "fonts", "chars", "markers");
    private static final JsonReader.setMax length = JsonReader.setMax.getMin("cm", RVParams.TOOLBAR_MENU, RVParams.DELAY_RENDER);
    static JsonReader.setMax setMin = JsonReader.setMax.getMin("id", "layers", "w", "h", "p", "u");

    public static setVerticalGravity getMax(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float max = setTitleMarginStart.getMax();
        PlaybackStateCompat.ShuffleMode<Layer> shuffleMode = new PlaybackStateCompat.ShuffleMode<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        IResultReceiver.Stub<setQueryRefinementEnabled> stub = new IResultReceiver.Stub<>();
        setVerticalGravity setverticalgravity = new setVerticalGravity();
        jsonReader.setMin();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.getMin()) {
            switch (jsonReader2.setMin(getMin)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = jsonReader.values();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = jsonReader.values();
                    continue;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f = (float) jsonReader.toDoubleRange();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.toDoubleRange()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.toDoubleRange();
                    break;
                case 5:
                    String[] split = jsonReader.toIntRange().split("\\.");
                    arrayList = arrayList3;
                    if (!setTitleMarginStart.length(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        setTitleMargin.setMax("Lottie only supports bodymovin >= 4.4.0");
                        setverticalgravity.length.add("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    break;
                case 6:
                    length(jsonReader2, setverticalgravity, arrayList2, shuffleMode);
                    break;
                case 7:
                    setMin(jsonReader2, setverticalgravity, hashMap2, hashMap3);
                    break;
                case 8:
                    setMin(jsonReader2, hashMap4);
                    break;
                case 9:
                    getMin(jsonReader2, setverticalgravity, stub);
                    break;
                case 10:
                    length(jsonReader2, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        setverticalgravity.equals = new Rect(0, 0, (int) (((float) i) * max), (int) (((float) i2) * max));
        setverticalgravity.values = f;
        setverticalgravity.toDoubleRange = f2;
        setverticalgravity.toString = f3;
        setverticalgravity.toIntRange = arrayList2;
        setverticalgravity.isInside = shuffleMode;
        setverticalgravity.getMax = hashMap2;
        setverticalgravity.setMax = hashMap3;
        setverticalgravity.toFloatRange = stub;
        setverticalgravity.getMin = hashMap4;
        setverticalgravity.IsOverlapping = arrayList3;
        return setverticalgravity;
    }

    private static void length(JsonReader jsonReader, setVerticalGravity setverticalgravity, List<Layer> list, PlaybackStateCompat.ShuffleMode<Layer> shuffleMode) throws IOException {
        jsonReader.length();
        int i = 0;
        while (jsonReader.getMin()) {
            Layer max = onPopulateAccessibilityEvent.setMax(jsonReader, setverticalgravity);
            if (max.setMax == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(max);
            shuffleMode.setMax(max.length, max);
            if (i > 4) {
                StringBuilder sb = new StringBuilder("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                setTitleMargin.setMax(sb.toString());
            }
        }
        jsonReader.getMax();
    }

    private static void setMin(JsonReader jsonReader, setVerticalGravity setverticalgravity, Map<String, List<Layer>> map, Map<String, setGravity> map2) throws IOException {
        jsonReader.length();
        while (jsonReader.getMin()) {
            ArrayList arrayList = new ArrayList();
            PlaybackStateCompat.ShuffleMode shuffleMode = new PlaybackStateCompat.ShuffleMode();
            jsonReader.setMin();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.getMin()) {
                int min = jsonReader.setMin(setMin);
                if (min == 0) {
                    str = jsonReader.toIntRange();
                } else if (min == 1) {
                    jsonReader.length();
                    while (jsonReader.getMin()) {
                        Layer max = onPopulateAccessibilityEvent.setMax(jsonReader, setverticalgravity);
                        shuffleMode.setMax(max.length, max);
                        arrayList.add(max);
                    }
                    jsonReader.getMax();
                } else if (min == 2) {
                    i = jsonReader.values();
                } else if (min == 3) {
                    i2 = jsonReader.values();
                } else if (min == 4) {
                    str2 = jsonReader.toIntRange();
                } else if (min != 5) {
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                } else {
                    str3 = jsonReader.toIntRange();
                }
            }
            jsonReader.setMax();
            if (str2 != null) {
                setGravity setgravity = new setGravity(i, i2, str, str2, str3);
                map2.put(setgravity.getMin, setgravity);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.getMax();
    }

    private static void setMin(JsonReader jsonReader, Map<String, getSuggestionsAdapter> map) throws IOException {
        jsonReader.setMin();
        while (jsonReader.getMin()) {
            if (jsonReader.setMin(getMax) != 0) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                jsonReader.length();
                while (jsonReader.getMin()) {
                    getSuggestionsAdapter min = getThumbTintMode.setMin(jsonReader);
                    map.put(min.setMin, min);
                }
                jsonReader.getMax();
            }
        }
        jsonReader.setMax();
    }

    private static void getMin(JsonReader jsonReader, setVerticalGravity setverticalgravity, IResultReceiver.Stub<setQueryRefinementEnabled> stub) throws IOException {
        jsonReader.length();
        while (jsonReader.getMin()) {
            setQueryRefinementEnabled max = getThumbTintList.getMax(jsonReader, setverticalgravity);
            stub.setMax(max.hashCode(), max);
        }
        jsonReader.getMax();
    }

    private static void length(JsonReader jsonReader, List<onSuggestionsKey> list) throws IOException {
        jsonReader.length();
        while (jsonReader.getMin()) {
            String str = null;
            jsonReader.setMin();
            float f = 0.0f;
            float f2 = 0.0f;
            while (jsonReader.getMin()) {
                int min = jsonReader.setMin(length);
                if (min == 0) {
                    str = jsonReader.toIntRange();
                } else if (min == 1) {
                    f = (float) jsonReader.toDoubleRange();
                } else if (min != 2) {
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                } else {
                    f2 = (float) jsonReader.toDoubleRange();
                }
            }
            jsonReader.setMax();
            list.add(new onSuggestionsKey(str, f, f2));
        }
        jsonReader.getMax();
    }
}
