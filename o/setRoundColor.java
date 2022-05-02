package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class setRoundColor extends AlgorithmInfoPattern {
    protected Map<String, getRoundWidth> getCause;
    protected getCricleColor onMessageChannelReady;
    protected setRoundColor onNavigationEvent;
    private List<setRoundColor> toFloatRange;

    public setRoundColor() {
        this.getMin = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
    }

    public setRoundColor(int i) {
        this.getMin = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        this.toString = i;
    }

    public setRoundColor(int i, int i2) {
        this(i);
        this.FastBitmap$CoordinateSystem = i2;
    }

    public final setRoundColor asInterface() {
        return this.onNavigationEvent;
    }

    public final void setMax(setRoundColor setroundcolor) {
        this.onNavigationEvent = setroundcolor;
        this.onMessageChannelReady = setroundcolor == null ? (getCricleColor) this : setroundcolor.onMessageChannelReady;
    }

    public final void length(setRoundColor setroundcolor) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new ArrayList();
        }
        this.toFloatRange.add(setroundcolor);
        setroundcolor.onNavigationEvent = this;
        setroundcolor.onMessageChannelReady = this.onMessageChannelReady;
    }

    public final void setMin(setRoundColor setroundcolor) {
        List<setRoundColor> list = this.toFloatRange;
        if (list != null) {
            for (setRoundColor length : list) {
                setroundcolor.length(length);
            }
            this.toFloatRange.clear();
            this.toFloatRange = null;
        }
        Map<String, getRoundWidth> map = this.getCause;
        if (map != null && !map.isEmpty()) {
            setMax(this, setroundcolor);
        }
    }

    public static setRoundColor getMin(setRoundColor setroundcolor) {
        setRoundColor setroundcolor2 = new setRoundColor(setroundcolor.length());
        setroundcolor2.getCause = setroundcolor.getCause;
        setroundcolor.getCause = null;
        setroundcolor2.hashCode = setroundcolor.hashCode;
        setRoundColor setroundcolor3 = setroundcolor.onNavigationEvent;
        setroundcolor2.onNavigationEvent = setroundcolor3;
        getCricleColor getcriclecolor = setroundcolor3 == null ? (getCricleColor) setroundcolor2 : setroundcolor3.onMessageChannelReady;
        setroundcolor2.onMessageChannelReady = getcriclecolor;
        setroundcolor2.onNavigationEvent = setroundcolor2;
        setroundcolor2.onMessageChannelReady = getcriclecolor;
        setroundcolor.hashCode = setroundcolor2;
        setroundcolor2.onMessageChannelReady = setroundcolor.onMessageChannelReady;
        return setroundcolor2;
    }

    public final getRoundWidth getMax(String str) {
        Map<String, getRoundWidth> map = this.getCause;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final Map<String, getRoundWidth> ICustomTabsCallback$Default() {
        return this.getCause;
    }

    public final void onTransact() {
        this.getCause = null;
    }

    public static void setMax(setRoundColor setroundcolor, setRoundColor setroundcolor2) {
        if (setroundcolor.getCause == null) {
            setroundcolor.getCause = new LinkedHashMap(5);
        }
        Map<String, getRoundWidth> map = setroundcolor.getCause;
        if (setroundcolor2.getCause == null) {
            setroundcolor2.getCause = new LinkedHashMap(5);
        }
        Map<String, getRoundWidth> map2 = setroundcolor2.getCause;
        if (Collections.disjoint(map.keySet(), map2.keySet())) {
            for (Map.Entry next : map.entrySet()) {
                getRoundWidth getroundwidth = (getRoundWidth) next.getValue();
                getroundwidth.getMin = setroundcolor2;
                map2.put(next.getKey(), getroundwidth);
            }
            return;
        }
        throw getStyleId.setMin();
    }

    public final setRoundColor setMin(String str) {
        for (setRoundColor setroundcolor = this; setroundcolor != null; setroundcolor = setroundcolor.onNavigationEvent) {
            Map<String, getRoundWidth> map = setroundcolor.getCause;
            if (map != null && map.containsKey(str)) {
                return setroundcolor;
            }
        }
        return null;
    }

    public final void getMax(getRoundWidth getroundwidth) {
        if (getroundwidth.setMax != null) {
            if (this.getCause == null) {
                this.getCause = new LinkedHashMap(5);
            }
            this.getCause.put(getroundwidth.setMax, getroundwidth);
            getroundwidth.getMin = this;
            getCricleColor getcriclecolor = this.onMessageChannelReady;
            if (getcriclecolor.ICustomTabsService == null) {
                if (getroundwidth.setMin == 88) {
                    getcriclecolor.onTransact++;
                }
                getcriclecolor.asBinder.add(getroundwidth);
                return;
            }
            throw getStyleId.setMin();
        }
        throw new IllegalArgumentException("null symbol name");
    }
}
