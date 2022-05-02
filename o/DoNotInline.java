package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import o.to;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DoNotInline {
    public SparseArray<setMax> getMax = new SparseArray<>();
    int getMin = -1;
    private DrawableRes isInside = null;
    int length = -1;
    private SparseArray<from> setMax = new SparseArray<>();
    int setMin = -1;

    public DoNotInline(Context context, XmlPullParser xmlPullParser) {
        length(context, xmlPullParser);
    }

    private void length(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.getState);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == to.length.setVisible) {
                this.getMin = obtainStyledAttributes.getResourceId(index, this.getMin);
            }
        }
        obtainStyledAttributes.recycle();
        setMax setmax = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            setmax = new setMax(context, xmlPullParser);
                            this.getMax.put(setmax.setMax, setmax);
                        } else if (c == 3) {
                            length length2 = new length(context, xmlPullParser);
                            if (setmax != null) {
                                setmax.getMin.add(length2);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final int setMin(int i) {
        setMax setmax;
        int max;
        if (-1 == i) {
            if (i == -1) {
                setmax = this.getMax.valueAt(0);
            } else {
                setmax = this.getMax.get(this.setMin);
            }
            if (setmax == null) {
                return -1;
            }
            if ((this.length == -1 || !setmax.getMin.get(-1).setMax(-1.0f, -1.0f)) && -1 != (max = setmax.setMax())) {
                return max == -1 ? setmax.getMax : setmax.getMin.get(max).setMax;
            }
            return -1;
        }
        setMax setmax2 = this.getMax.get(i);
        if (setmax2 == null) {
            return -1;
        }
        int max2 = setmax2.setMax();
        return max2 == -1 ? setmax2.getMax : setmax2.getMin.get(max2).setMax;
    }

    public static class setMax {
        public int getMax = -1;
        public ArrayList<length> getMin = new ArrayList<>();
        int setMax;
        boolean setMin;

        public setMax(Context context, XmlPullParser xmlPullParser) {
            this.setMin = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.setState);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.setAlpha) {
                    this.setMax = obtainStyledAttributes.getResourceId(index, this.setMax);
                } else if (index == to.length.jumpToCurrentState) {
                    this.getMax = obtainStyledAttributes.getResourceId(index, this.getMax);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.getMax);
                    context.getResources().getResourceName(this.getMax);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.setMin = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int setMax() {
            for (int i = 0; i < this.getMin.size(); i++) {
                if (this.getMin.get(i).setMax(-1.0f, -1.0f)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class length {
        boolean equals;
        float getMax = Float.NaN;
        float getMin = Float.NaN;
        float length = Float.NaN;
        public int setMax = -1;
        float setMin = Float.NaN;

        public length(Context context, XmlPullParser xmlPullParser) {
            this.equals = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.setPopupCallback);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.setCheckable) {
                    this.setMax = obtainStyledAttributes.getResourceId(index, this.setMax);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.setMax);
                    context.getResources().getResourceName(this.setMax);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.equals = true;
                    }
                } else if (index == to.length.onClick) {
                    this.getMax = obtainStyledAttributes.getDimension(index, this.getMax);
                } else if (index == to.length.showsIcon) {
                    this.getMin = obtainStyledAttributes.getDimension(index, this.getMin);
                } else if (index == to.length.setShortcut) {
                    this.length = obtainStyledAttributes.getDimension(index, this.length);
                } else if (index == to.length.setChecked) {
                    this.setMin = obtainStyledAttributes.getDimension(index, this.setMin);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean setMax(float f, float f2) {
            if (!Float.isNaN(this.setMin) && f < this.setMin) {
                return false;
            }
            if (!Float.isNaN(this.getMin) && f2 < this.getMin) {
                return false;
            }
            if (!Float.isNaN(this.length) && f > this.length) {
                return false;
            }
            if (Float.isNaN(this.getMax) || f2 <= this.getMax) {
                return true;
            }
            return false;
        }
    }
}
