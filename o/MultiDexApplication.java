package o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import o.GridLayoutManager;

public final class MultiDexApplication implements buildMediaButtonPendingIntent {
    private String getMax;
    private Collection<BarcodeFormat> length;
    private Map<DecodeHintType, ?> setMax;
    private int setMin;

    public MultiDexApplication() {
    }

    public MultiDexApplication(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, int i) {
        this.length = collection;
        this.setMax = map;
        this.getMax = str;
        this.setMin = i;
    }

    public final ContiguousPagedList$FetchState getMin(Map<DecodeHintType, ?> map) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map<DecodeHintType, ?> map2 = this.setMax;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        if (this.length != null) {
            enumMap.put(DecodeHintType.POSSIBLE_FORMATS, this.length);
        }
        if (this.getMax != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, this.getMax);
        }
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.setHints(enumMap);
        int i = this.setMin;
        if (i == 0) {
            return new ContiguousPagedList$FetchState(multiFormatReader);
        }
        if (i == 1) {
            return new LinearLayoutManager(multiFormatReader);
        }
        if (i != 2) {
            return new ContiguousPagedList$FetchState(multiFormatReader);
        }
        return new GridLayoutManager.LayoutParams(multiFormatReader);
    }
}
