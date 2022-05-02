package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import o.to;
import org.xmlpull.v1.XmlPullParser;

public class ColorRes {
    private SparseArray<setMax> IsOverlapping = new SparseArray<>();
    int getMax = -1;
    public DrawableRes getMin = null;
    private final ConstraintLayout length;
    from setMax;
    int setMin = -1;
    private SparseArray<from> toIntRange = new SparseArray<>();

    public ColorRes(Context context, ConstraintLayout constraintLayout, int i) {
        this.length = constraintLayout;
        setMax(context, i);
    }

    public final void getMin(int i, float f, float f2) {
        from from;
        setMax setmax;
        int min;
        from from2;
        int i2 = this.getMax;
        if (i2 == i) {
            if (i == -1) {
                setmax = this.IsOverlapping.valueAt(0);
            } else {
                setmax = this.IsOverlapping.get(i2);
            }
            if ((this.setMin == -1 || !setmax.getMin.get(this.setMin).setMin(f, f2)) && this.setMin != (min = setmax.getMin(f, f2))) {
                if (min == -1) {
                    from2 = this.setMax;
                } else {
                    from2 = setmax.getMin.get(min).isInside;
                }
                if (min != -1) {
                    setmax.getMin.get(min);
                }
                if (from2 != null) {
                    this.setMin = min;
                    from2.setMin(this.length);
                    return;
                }
                return;
            }
            return;
        }
        this.getMax = i;
        setMax setmax2 = this.IsOverlapping.get(i);
        int min2 = setmax2.getMin(f, f2);
        if (min2 == -1) {
            from = setmax2.length;
        } else {
            from = setmax2.getMin.get(min2).isInside;
        }
        if (min2 != -1) {
            setmax2.getMin.get(min2);
        }
        if (from != null) {
            this.setMin = min2;
            from.setMin(this.length);
        }
    }

    static class setMax {
        int getMax;
        ArrayList<getMin> getMin = new ArrayList<>();
        from length;
        int setMax = -1;

        public setMax(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.setState);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.setAlpha) {
                    this.getMax = obtainStyledAttributes.getResourceId(index, this.getMax);
                } else if (index == to.length.jumpToCurrentState) {
                    this.setMax = obtainStyledAttributes.getResourceId(index, this.setMax);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.setMax);
                    context.getResources().getResourceName(this.setMax);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        from from = new from();
                        this.length = from;
                        from.getMin(context, this.setMax);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int getMin(float f, float f2) {
            for (int i = 0; i < this.getMin.size(); i++) {
                if (this.getMin.get(i).setMin(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class getMin {
        float getMax = Float.NaN;
        float getMin = Float.NaN;
        from isInside;
        float length = Float.NaN;
        float setMax = Float.NaN;
        int setMin = -1;

        public getMin(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.setPopupCallback);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.setCheckable) {
                    this.setMin = obtainStyledAttributes.getResourceId(index, this.setMin);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.setMin);
                    context.getResources().getResourceName(this.setMin);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        from from = new from();
                        this.isInside = from;
                        from.getMin(context, this.setMin);
                    }
                } else if (index == to.length.onClick) {
                    this.getMin = obtainStyledAttributes.getDimension(index, this.getMin);
                } else if (index == to.length.showsIcon) {
                    this.getMax = obtainStyledAttributes.getDimension(index, this.getMax);
                } else if (index == to.length.setShortcut) {
                    this.setMax = obtainStyledAttributes.getDimension(index, this.setMax);
                } else if (index == to.length.setChecked) {
                    this.length = obtainStyledAttributes.getDimension(index, this.length);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin(float f, float f2) {
            if (!Float.isNaN(this.length) && f < this.length) {
                return false;
            }
            if (!Float.isNaN(this.getMax) && f2 < this.getMax) {
                return false;
            }
            if (!Float.isNaN(this.setMax) && f > this.setMax) {
                return false;
            }
            if (Float.isNaN(this.getMin) || f2 <= this.getMin) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "id"
            android.content.res.Resources r1 = r11.getResources()
            android.content.res.XmlResourceParser r12 = r1.getXml(r12)
            r1 = 0
            int r2 = r12.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
        L_0x000f:
            r3 = 1
            if (r2 == r3) goto L_0x00df
            if (r2 == 0) goto L_0x00d6
            r4 = 2
            if (r2 == r4) goto L_0x0019
            goto L_0x00d9
        L_0x0019:
            java.lang.String r2 = r12.getName()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            int r5 = r2.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = -1
            switch(r5) {
                case -1349929691: goto L_0x0051;
                case 80204913: goto L_0x0047;
                case 1382829617: goto L_0x003d;
                case 1657696882: goto L_0x0033;
                case 1901439077: goto L_0x0029;
                default: goto L_0x0028;
            }     // Catch:{ IOException | XmlPullParserException -> 0x00df }
        L_0x0028:
            goto L_0x005b
        L_0x0029:
            java.lang.String r5 = "Variant"
            boolean r2 = r2.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r2 == 0) goto L_0x005b
            r2 = 3
            goto L_0x005c
        L_0x0033:
            java.lang.String r5 = "layoutDescription"
            boolean r2 = r2.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r2 == 0) goto L_0x005b
            r2 = 0
            goto L_0x005c
        L_0x003d:
            java.lang.String r5 = "StateSet"
            boolean r2 = r2.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r2 == 0) goto L_0x005b
            r2 = 1
            goto L_0x005c
        L_0x0047:
            java.lang.String r5 = "State"
            boolean r2 = r2.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r2 == 0) goto L_0x005b
            r2 = 2
            goto L_0x005c
        L_0x0051:
            java.lang.String r5 = "ConstraintSet"
            boolean r2 = r2.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r2 == 0) goto L_0x005b
            r2 = 4
            goto L_0x005c
        L_0x005b:
            r2 = -1
        L_0x005c:
            if (r2 == r4) goto L_0x00c9
            if (r2 == r8) goto L_0x00bc
            if (r2 == r7) goto L_0x0064
            goto L_0x00d9
        L_0x0064:
            o.from r2 = new o.from     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r2.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            int r4 = r12.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
        L_0x006d:
            if (r6 >= r4) goto L_0x00d9
            java.lang.String r5 = r12.getAttributeName(r6)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            boolean r5 = r0.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r4 = r12.getAttributeValue(r6)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            java.lang.String r5 = "/"
            boolean r5 = r4.contains(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r5 == 0) goto L_0x009d
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            int r5 = r5 + r3
            java.lang.String r5 = r4.substring(r5)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            android.content.res.Resources r6 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            java.lang.String r7 = r11.getPackageName()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            int r5 = r6.getIdentifier(r5, r0, r7)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            goto L_0x009e
        L_0x009d:
            r5 = -1
        L_0x009e:
            if (r5 != r9) goto L_0x00b0
            if (r4 == 0) goto L_0x00b0
            int r6 = r4.length()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r6 <= r3) goto L_0x00b0
            java.lang.String r3 = r4.substring(r3)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            int r5 = java.lang.Integer.parseInt(r3)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
        L_0x00b0:
            r2.setMax((android.content.Context) r11, (org.xmlpull.v1.XmlPullParser) r12)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            android.util.SparseArray<o.from> r3 = r10.toIntRange     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r3.put(r5, r2)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            goto L_0x00d9
        L_0x00b9:
            int r6 = r6 + 1
            goto L_0x006d
        L_0x00bc:
            o.ColorRes$getMin r2 = new o.ColorRes$getMin     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r2.<init>(r11, r12)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            if (r1 == 0) goto L_0x00d9
            java.util.ArrayList<o.ColorRes$getMin> r3 = r1.getMin     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r3.add(r2)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            goto L_0x00d9
        L_0x00c9:
            o.ColorRes$setMax r1 = new o.ColorRes$setMax     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r1.<init>(r11, r12)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            android.util.SparseArray<o.ColorRes$setMax> r2 = r10.IsOverlapping     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            int r3 = r1.getMax     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            r2.put(r3, r1)     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            goto L_0x00d9
        L_0x00d6:
            r12.getName()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
        L_0x00d9:
            int r2 = r12.next()     // Catch:{ IOException | XmlPullParserException -> 0x00df }
            goto L_0x000f
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ColorRes.setMax(android.content.Context, int):void");
    }
}
