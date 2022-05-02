package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o.RequiresPermission;
import o.markerClass;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class setExpandActivityOverflowButtonContentDescription extends setMenuCallbacks {
    static final PorterDuff.Mode setMax = PorterDuff.Mode.SRC_IN;
    private final float[] IsOverlapping;
    private Drawable.ConstantState equals;
    private ColorFilter getMax;
    private equals getMin;
    private final Rect hashCode;
    private final Matrix isInside;
    private PorterDuffColorFilter setMin;
    private boolean toFloatRange;
    private boolean toIntRange;

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    setExpandActivityOverflowButtonContentDescription() {
        this.toFloatRange = true;
        this.IsOverlapping = new float[9];
        this.isInside = new Matrix();
        this.hashCode = new Rect();
        this.getMin = new equals();
    }

    setExpandActivityOverflowButtonContentDescription(@NonNull equals equals2) {
        this.toFloatRange = true;
        this.IsOverlapping = new float[9];
        this.isInside = new Matrix();
        this.hashCode = new Rect();
        this.getMin = equals2;
        this.setMin = getMax(this.setMin, equals2.setMin, equals2.setMax);
    }

    public Drawable mutate() {
        if (this.length != null) {
            this.length.mutate();
            return this;
        }
        if (!this.toIntRange && super.mutate() == this) {
            this.getMin = new equals(this.getMin);
            this.toIntRange = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public Object getMin(String str) {
        return this.getMin.getMin.FastBitmap$CoordinateSystem.get(str);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.length != null && Build.VERSION.SDK_INT >= 24) {
            return new toIntRange(this.length.getConstantState());
        }
        this.getMin.getMax = getChangingConfigurations();
        return this.getMin;
    }

    public void draw(Canvas canvas) {
        if (this.length != null) {
            this.length.draw(canvas);
            return;
        }
        copyBounds(this.hashCode);
        if (this.hashCode.width() > 0 && this.hashCode.height() > 0) {
            ColorFilter colorFilter = this.getMax;
            if (colorFilter == null) {
                colorFilter = this.setMin;
            }
            canvas.getMatrix(this.isInside);
            this.isInside.getValues(this.IsOverlapping);
            float abs = Math.abs(this.IsOverlapping[0]);
            float abs2 = Math.abs(this.IsOverlapping[4]);
            float abs3 = Math.abs(this.IsOverlapping[1]);
            float abs4 = Math.abs(this.IsOverlapping[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.hashCode.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.hashCode.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.hashCode.left, (float) this.hashCode.top);
                if (setMax()) {
                    canvas.translate((float) this.hashCode.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.hashCode.offsetTo(0, 0);
                this.getMin.getMin(min, min2);
                if (!this.toFloatRange) {
                    this.getMin.setMin(min, min2);
                } else if (!this.getMin.setMax()) {
                    this.getMin.setMin(min, min2);
                    this.getMin.length();
                }
                this.getMin.getMin(canvas, colorFilter, this.hashCode);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.length != null) {
            return RequiresPermission.Read.length(this.length);
        }
        return this.getMin.getMin.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.length != null) {
            this.length.setAlpha(i);
        } else if (this.getMin.getMin.getRootAlpha() != i) {
            this.getMin.getMin.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.length != null) {
            this.length.setColorFilter(colorFilter);
            return;
        }
        this.getMax = colorFilter;
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        if (this.length != null) {
            return RequiresPermission.Read.setMax(this.length);
        }
        return this.getMax;
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter getMax(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.length != null) {
            RequiresPermission.Read.getMin(this.length, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.length != null) {
            RequiresPermission.Read.setMin(this.length, colorStateList);
            return;
        }
        equals equals2 = this.getMin;
        if (equals2.setMin != colorStateList) {
            equals2.setMin = colorStateList;
            this.setMin = getMax(this.setMin, colorStateList, equals2.setMax);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.length != null) {
            RequiresPermission.Read.setMin(this.length, mode);
            return;
        }
        equals equals2 = this.getMin;
        if (equals2.setMax != mode) {
            equals2.setMax = mode;
            this.setMin = getMax(this.setMin, equals2.setMin, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.length != null) {
            return this.length.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        equals equals2 = this.getMin;
        if (equals2 == null) {
            return false;
        }
        if (!equals2.setMin()) {
            return this.getMin.setMin != null && this.getMin.setMin.isStateful();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.length != null) {
            return this.length.setState(iArr);
        }
        boolean z = false;
        equals equals2 = this.getMin;
        if (!(equals2.setMin == null || equals2.setMax == null)) {
            this.setMin = getMax(this.setMin, equals2.setMin, equals2.setMax);
            invalidateSelf();
            z = true;
        }
        if (!equals2.setMin() || !equals2.getMax(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        if (this.length != null) {
            return this.length.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.length != null) {
            return this.length.getIntrinsicWidth();
        }
        return (int) this.getMin.getMin.setMin;
    }

    public int getIntrinsicHeight() {
        if (this.length != null) {
            return this.length.getIntrinsicHeight();
        }
        return (int) this.getMin.getMin.getMax;
    }

    public boolean canApplyTheme() {
        if (this.length == null) {
            return false;
        }
        RequiresPermission.Read.getMax(this.length);
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.length != null) {
            return RequiresPermission.Read.setMin(this.length);
        }
        return this.getMin.length;
    }

    public void setAutoMirrored(boolean z) {
        if (this.length != null) {
            RequiresPermission.Read.getMin(this.length, z);
        } else {
            this.getMin.length = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[Catch:{ IOException | XmlPullParserException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0040 }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.setExpandActivityOverflowButtonContentDescription getMax(@androidx.annotation.NonNull android.content.res.Resources r4, @androidx.annotation.DrawableRes int r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            o.setExpandActivityOverflowButtonContentDescription r0 = new o.setExpandActivityOverflowButtonContentDescription
            r0.<init>()
            android.graphics.drawable.Drawable r4 = o.OptIn.getMax((android.content.res.Resources) r4, (int) r5, (android.content.res.Resources.Theme) r6)
            r0.length = r4
            o.setExpandActivityOverflowButtonContentDescription$toIntRange r4 = new o.setExpandActivityOverflowButtonContentDescription$toIntRange
            android.graphics.drawable.Drawable r5 = r0.length
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.equals = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            r2 = 2
            if (r1 == r2) goto L_0x0031
            r3 = 1
            if (r1 != r3) goto L_0x0027
        L_0x0031:
            if (r1 != r2) goto L_0x0038
            o.setExpandActivityOverflowButtonContentDescription r4 = length(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            return r4
        L_0x0038:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
        L_0x0040:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandActivityOverflowButtonContentDescription.getMax(android.content.res.Resources, int, android.content.res.Resources$Theme):o.setExpandActivityOverflowButtonContentDescription");
    }

    public static setExpandActivityOverflowButtonContentDescription length(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = new setExpandActivityOverflowButtonContentDescription();
        setexpandactivityoverflowbuttoncontentdescription.inflate(resources, xmlPullParser, attributeSet, theme);
        return setexpandactivityoverflowbuttoncontentdescription;
    }

    static int getMax(int i, float f) {
        return (i & FlexItem.MAX_SIZE) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.length != null) {
            this.length.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        if (this.length != null) {
            RequiresPermission.Read.getMin(this.length, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        equals equals2 = this.getMin;
        equals2.getMin = new toFloatRange();
        int[] iArr = getMenu.setMin;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        length(typedArray, xmlPullParser, theme);
        typedArray.recycle();
        equals2.getMax = getChangingConfigurations();
        equals2.toDoubleRange = true;
        setMin(resources, xmlPullParser, attributeSet, theme);
        this.setMin = getMax(this.setMin, equals2.setMin, equals2.setMax);
    }

    private static PorterDuff.Mode getMax(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void length(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        ColorStateList colorStateList;
        equals equals2 = this.getMin;
        toFloatRange tofloatrange = equals2.getMin;
        int i = -1;
        if (NonNull.setMin(xmlPullParser, "tintMode")) {
            i = typedArray.getInt(6, -1);
        }
        equals2.setMax = getMax(i, PorterDuff.Mode.SRC_IN);
        if (NonNull.setMin(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            if (typedValue.type != 2) {
                colorStateList = (typedValue.type < 28 || typedValue.type > 31) ? LayoutRes.length(typedArray.getResources(), typedArray.getResourceId(1, 0), theme) : ColorStateList.valueOf(typedValue.data);
            } else {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(String.valueOf(typedValue)));
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            equals2.setMin = colorStateList;
        }
        equals2.length = NonNull.length(typedArray, xmlPullParser, "autoMirrored", 5, equals2.length);
        float f = tofloatrange.toFloatRange;
        if (NonNull.setMin(xmlPullParser, "viewportWidth")) {
            f = typedArray.getFloat(7, f);
        }
        tofloatrange.toFloatRange = f;
        float f2 = tofloatrange.isInside;
        if (NonNull.setMin(xmlPullParser, "viewportHeight")) {
            f2 = typedArray.getFloat(8, f2);
        }
        tofloatrange.isInside = f2;
        if (tofloatrange.toFloatRange <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (tofloatrange.isInside > 0.0f) {
            tofloatrange.setMin = typedArray.getDimension(3, tofloatrange.setMin);
            tofloatrange.getMax = typedArray.getDimension(2, tofloatrange.getMax);
            if (tofloatrange.setMin <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (tofloatrange.getMax > 0.0f) {
                float alpha = tofloatrange.getAlpha();
                if (NonNull.setMin(xmlPullParser, "alpha")) {
                    alpha = typedArray.getFloat(4, alpha);
                }
                tofloatrange.setAlpha(alpha);
                String string = typedArray.getString(0);
                if (string != null) {
                    tofloatrange.equals = string;
                    tofloatrange.FastBitmap$CoordinateSystem.put(string, tofloatrange);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    private void setMin(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        equals equals2 = this.getMin;
        toFloatRange tofloatrange = equals2.getMin;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(tofloatrange.length);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                setMin setmin = (setMin) arrayDeque.peek();
                if ("path".equals(name)) {
                    getMin getmin = new getMin();
                    getmin.setMin(resources, attributeSet, theme, xmlPullParser);
                    setmin.setMin.add(getmin);
                    if (getmin.getPathName() != null) {
                        tofloatrange.FastBitmap$CoordinateSystem.put(getmin.getPathName(), getmin);
                    }
                    z = false;
                    equals2.getMax = getmin.values | equals2.getMax;
                } else if ("clip-path".equals(name)) {
                    setMax setmax = new setMax();
                    setmax.setMax(resources, attributeSet, theme, xmlPullParser);
                    setmin.setMin.add(setmax);
                    if (setmax.getPathName() != null) {
                        tofloatrange.FastBitmap$CoordinateSystem.put(setmax.getPathName(), setmax);
                    }
                    equals2.getMax = setmax.values | equals2.getMax;
                } else if ("group".equals(name)) {
                    setMin setmin2 = new setMin();
                    setmin2.setMax(resources, attributeSet, theme, xmlPullParser);
                    setmin.setMin.add(setmin2);
                    arrayDeque.push(setmin2);
                    if (setmin2.getGroupName() != null) {
                        tofloatrange.FastBitmap$CoordinateSystem.put(setmin2.getGroupName(), setmin2);
                    }
                    equals2.getMax = setmin2.getMax | equals2.getMax;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    public void getMin(boolean z) {
        this.toFloatRange = z;
    }

    private boolean setMax() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || RequiresPermission.Read.isInside(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.length != null) {
            this.length.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.length != null) {
            return this.length.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.getMin.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.length != null) {
            this.length.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.length != null) {
            this.length.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.length != null) {
            return this.length.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.length != null) {
            this.length.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    static class toIntRange extends Drawable.ConstantState {
        private final Drawable.ConstantState setMin;

        public toIntRange(Drawable.ConstantState constantState) {
            this.setMin = constantState;
        }

        public Drawable newDrawable() {
            setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = new setExpandActivityOverflowButtonContentDescription();
            setexpandactivityoverflowbuttoncontentdescription.length = (VectorDrawable) this.setMin.newDrawable();
            return setexpandactivityoverflowbuttoncontentdescription;
        }

        public Drawable newDrawable(Resources resources) {
            setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = new setExpandActivityOverflowButtonContentDescription();
            setexpandactivityoverflowbuttoncontentdescription.length = (VectorDrawable) this.setMin.newDrawable(resources);
            return setexpandactivityoverflowbuttoncontentdescription;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = new setExpandActivityOverflowButtonContentDescription();
            setexpandactivityoverflowbuttoncontentdescription.length = (VectorDrawable) this.setMin.newDrawable(resources, theme);
            return setexpandactivityoverflowbuttoncontentdescription;
        }

        public boolean canApplyTheme() {
            return this.setMin.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.setMin.getChangingConfigurations();
        }
    }

    static class equals extends Drawable.ConstantState {
        boolean IsOverlapping;
        ColorStateList equals;
        int getMax;
        toFloatRange getMin;
        Bitmap isInside;
        boolean length;
        PorterDuff.Mode setMax;
        ColorStateList setMin;
        boolean toDoubleRange;
        int toFloatRange;
        PorterDuff.Mode toIntRange;
        Paint toString;

        public equals(equals equals2) {
            this.setMin = null;
            this.setMax = setExpandActivityOverflowButtonContentDescription.setMax;
            if (equals2 != null) {
                this.getMax = equals2.getMax;
                this.getMin = new toFloatRange(equals2.getMin);
                if (equals2.getMin.getMin != null) {
                    this.getMin.getMin = new Paint(equals2.getMin.getMin);
                }
                if (equals2.getMin.setMax != null) {
                    this.getMin.setMax = new Paint(equals2.getMin.setMax);
                }
                this.setMin = equals2.setMin;
                this.setMax = equals2.setMax;
                this.length = equals2.length;
            }
        }

        public void getMin(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.isInside, (Rect) null, rect, getMin(colorFilter));
        }

        public boolean getMin() {
            return this.getMin.getRootAlpha() < 255;
        }

        public Paint getMin(ColorFilter colorFilter) {
            if (!getMin() && colorFilter == null) {
                return null;
            }
            if (this.toString == null) {
                Paint paint = new Paint();
                this.toString = paint;
                paint.setFilterBitmap(true);
            }
            this.toString.setAlpha(this.getMin.getRootAlpha());
            this.toString.setColorFilter(colorFilter);
            return this.toString;
        }

        public void setMin(int i, int i2) {
            this.isInside.eraseColor(0);
            this.getMin.length(new Canvas(this.isInside), i, i2, (ColorFilter) null);
        }

        public void getMin(int i, int i2) {
            if (this.isInside == null || !getMax(i, i2)) {
                this.isInside = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.toDoubleRange = true;
            }
        }

        public boolean getMax(int i, int i2) {
            return i == this.isInside.getWidth() && i2 == this.isInside.getHeight();
        }

        public boolean setMax() {
            return !this.toDoubleRange && this.equals == this.setMin && this.toIntRange == this.setMax && this.IsOverlapping == this.length && this.toFloatRange == this.getMin.getRootAlpha();
        }

        public void length() {
            this.equals = this.setMin;
            this.toIntRange = this.setMax;
            this.toFloatRange = this.getMin.getRootAlpha();
            this.IsOverlapping = this.length;
            this.toDoubleRange = false;
        }

        public equals() {
            this.setMin = null;
            this.setMax = setExpandActivityOverflowButtonContentDescription.setMax;
            this.getMin = new toFloatRange();
        }

        @NonNull
        public Drawable newDrawable() {
            return new setExpandActivityOverflowButtonContentDescription(this);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new setExpandActivityOverflowButtonContentDescription(this);
        }

        public int getChangingConfigurations() {
            return this.getMax;
        }

        public boolean setMin() {
            return this.getMin.length();
        }

        public boolean getMax(int[] iArr) {
            boolean length2 = this.getMin.length(iArr);
            this.toDoubleRange |= length2;
            return length2;
        }
    }

    static class toFloatRange {
        private static final Matrix toString = new Matrix();
        final PlaybackStateCompat<String, Object> FastBitmap$CoordinateSystem;
        private PathMeasure Grayscale$Algorithm;
        int IsOverlapping;
        private int Mean$Arithmetic;
        String equals;
        float getMax;
        Paint getMin;
        private final Path hashCode;
        float isInside;
        final setMin length;
        Paint setMax;
        float setMin;
        private final Matrix toDoubleRange;
        float toFloatRange;
        Boolean toIntRange;
        private final Path values;

        private static float getMax(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public toFloatRange() {
            this.toDoubleRange = new Matrix();
            this.setMin = 0.0f;
            this.getMax = 0.0f;
            this.toFloatRange = 0.0f;
            this.isInside = 0.0f;
            this.IsOverlapping = 255;
            this.equals = null;
            this.toIntRange = null;
            this.FastBitmap$CoordinateSystem = new PlaybackStateCompat<>();
            this.length = new setMin();
            this.hashCode = new Path();
            this.values = new Path();
        }

        public void setRootAlpha(int i) {
            this.IsOverlapping = i;
        }

        public int getRootAlpha() {
            return this.IsOverlapping;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public toFloatRange(toFloatRange tofloatrange) {
            this.toDoubleRange = new Matrix();
            this.setMin = 0.0f;
            this.getMax = 0.0f;
            this.toFloatRange = 0.0f;
            this.isInside = 0.0f;
            this.IsOverlapping = 255;
            this.equals = null;
            this.toIntRange = null;
            PlaybackStateCompat<String, Object> playbackStateCompat = new PlaybackStateCompat<>();
            this.FastBitmap$CoordinateSystem = playbackStateCompat;
            this.length = new setMin(tofloatrange.length, playbackStateCompat);
            this.hashCode = new Path(tofloatrange.hashCode);
            this.values = new Path(tofloatrange.values);
            this.setMin = tofloatrange.setMin;
            this.getMax = tofloatrange.getMax;
            this.toFloatRange = tofloatrange.toFloatRange;
            this.isInside = tofloatrange.isInside;
            this.Mean$Arithmetic = tofloatrange.Mean$Arithmetic;
            this.IsOverlapping = tofloatrange.IsOverlapping;
            this.equals = tofloatrange.equals;
            String str = tofloatrange.equals;
            if (str != null) {
                this.FastBitmap$CoordinateSystem.put(str, this);
            }
            this.toIntRange = tofloatrange.toIntRange;
        }

        private void length(setMin setmin, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            setmin.getMin.set(matrix);
            setmin.getMin.preConcat(setmin.setMax);
            canvas.save();
            for (int i3 = 0; i3 < setmin.setMin.size(); i3++) {
                length length2 = setmin.setMin.get(i3);
                if (length2 instanceof setMin) {
                    length((setMin) length2, setmin.getMin, canvas, i, i2, colorFilter);
                } else if (length2 instanceof getMax) {
                    getMin(setmin, (getMax) length2, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void length(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            length(this.length, toString, canvas, i, i2, colorFilter);
        }

        private void getMin(setMin setmin, getMax getmax, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.toFloatRange;
            float f2 = ((float) i2) / this.isInside;
            float min = Math.min(f, f2);
            Matrix matrix = setmin.getMin;
            this.toDoubleRange.set(matrix);
            this.toDoubleRange.postScale(f, f2);
            float min2 = setMin(matrix);
            if (min2 != 0.0f) {
                getmax.setMax(this.hashCode);
                Path path = this.hashCode;
                this.values.reset();
                if (getmax.getMin()) {
                    this.values.setFillType(getmax.hashCode == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.values.addPath(path, this.toDoubleRange);
                    canvas.clipPath(this.values);
                    return;
                }
                getMin getmin = (getMin) getmax;
                if (!(getmin.IsOverlapping == 0.0f && getmin.isInside == 1.0f)) {
                    float f3 = (getmin.IsOverlapping + getmin.toFloatRange) % 1.0f;
                    float f4 = (getmin.isInside + getmin.toFloatRange) % 1.0f;
                    if (this.Grayscale$Algorithm == null) {
                        this.Grayscale$Algorithm = new PathMeasure();
                    }
                    this.Grayscale$Algorithm.setPath(this.hashCode, false);
                    float length2 = this.Grayscale$Algorithm.getLength();
                    float f5 = f3 * length2;
                    float f6 = f4 * length2;
                    path.reset();
                    if (f5 > f6) {
                        this.Grayscale$Algorithm.getSegment(f5, length2, path, true);
                        this.Grayscale$Algorithm.getSegment(0.0f, f6, path, true);
                    } else {
                        this.Grayscale$Algorithm.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.values.addPath(path, this.toDoubleRange);
                if (getmin.getMax.setMin()) {
                    InterpolatorRes interpolatorRes = getmin.getMax;
                    if (this.getMin == null) {
                        Paint paint = new Paint(1);
                        this.getMin = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.getMin;
                    if (interpolatorRes.getMin()) {
                        Shader max = interpolatorRes.setMax();
                        max.setLocalMatrix(this.toDoubleRange);
                        paint2.setShader(max);
                        paint2.setAlpha(Math.round(getmin.setMax * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(setExpandActivityOverflowButtonContentDescription.getMax(interpolatorRes.length(), getmin.setMax));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.values.setFillType(getmin.hashCode == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.values, paint2);
                }
                if (getmin.setMin.setMin()) {
                    InterpolatorRes interpolatorRes2 = getmin.setMin;
                    if (this.setMax == null) {
                        Paint paint3 = new Paint(1);
                        this.setMax = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.setMax;
                    if (getmin.toIntRange != null) {
                        paint4.setStrokeJoin(getmin.toIntRange);
                    }
                    if (getmin.equals != null) {
                        paint4.setStrokeCap(getmin.equals);
                    }
                    paint4.setStrokeMiter(getmin.FastBitmap$CoordinateSystem);
                    if (interpolatorRes2.getMin()) {
                        Shader max2 = interpolatorRes2.setMax();
                        max2.setLocalMatrix(this.toDoubleRange);
                        paint4.setShader(max2);
                        paint4.setAlpha(Math.round(getmin.length * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(setExpandActivityOverflowButtonContentDescription.getMax(interpolatorRes2.length(), getmin.length));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(getmin.getMin * min * min2);
                    canvas.drawPath(this.values, paint4);
                }
            }
        }

        private float setMin(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float max = getMax(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max2 = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max2 > 0.0f) {
                return Math.abs(max) / max2;
            }
            return 0.0f;
        }

        public boolean length() {
            if (this.toIntRange == null) {
                this.toIntRange = Boolean.valueOf(this.length.getMax());
            }
            return this.toIntRange.booleanValue();
        }

        public boolean length(int[] iArr) {
            return this.length.setMin(iArr);
        }
    }

    static abstract class length {
        public boolean getMax() {
            return false;
        }

        public boolean setMin(int[] iArr) {
            return false;
        }

        private length() {
        }
    }

    static class setMin extends length {
        private String FastBitmap$CoordinateSystem = null;
        private float IsOverlapping = 1.0f;
        private float equals = 1.0f;
        int getMax;
        final Matrix getMin = new Matrix();
        private float hashCode = 0.0f;
        private float isInside = 0.0f;
        float length = 0.0f;
        final Matrix setMax = new Matrix();
        final ArrayList<length> setMin = new ArrayList<>();
        private int[] toDoubleRange;
        private float toFloatRange = 0.0f;
        private float toIntRange = 0.0f;

        public setMin(setMin setmin, PlaybackStateCompat<String, Object> playbackStateCompat) {
            super();
            getMax getmax;
            this.length = setmin.length;
            this.isInside = setmin.isInside;
            this.toFloatRange = setmin.toFloatRange;
            this.equals = setmin.equals;
            this.IsOverlapping = setmin.IsOverlapping;
            this.toIntRange = setmin.toIntRange;
            this.hashCode = setmin.hashCode;
            this.toDoubleRange = setmin.toDoubleRange;
            String str = setmin.FastBitmap$CoordinateSystem;
            this.FastBitmap$CoordinateSystem = str;
            this.getMax = setmin.getMax;
            if (str != null) {
                playbackStateCompat.put(str, this);
            }
            this.setMax.set(setmin.setMax);
            ArrayList<length> arrayList = setmin.setMin;
            for (int i = 0; i < arrayList.size(); i++) {
                length length2 = arrayList.get(i);
                if (length2 instanceof setMin) {
                    this.setMin.add(new setMin((setMin) length2, playbackStateCompat));
                } else {
                    if (length2 instanceof getMin) {
                        getmax = new getMin((getMin) length2);
                    } else if (length2 instanceof setMax) {
                        getmax = new setMax((setMax) length2);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.setMin.add(getmax);
                    if (getmax.toDoubleRange != null) {
                        playbackStateCompat.put(getmax.toDoubleRange, getmax);
                    }
                }
            }
        }

        public setMin() {
            super();
        }

        public String getGroupName() {
            return this.FastBitmap$CoordinateSystem;
        }

        public Matrix getLocalMatrix() {
            return this.setMax;
        }

        public void setMax(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            int[] iArr = getMenu.length;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            length(typedArray, xmlPullParser);
            typedArray.recycle();
        }

        private void length(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.toDoubleRange = null;
            float f = this.length;
            if (NonNull.setMin(xmlPullParser, "rotation")) {
                f = typedArray.getFloat(5, f);
            }
            this.length = f;
            this.isInside = typedArray.getFloat(1, this.isInside);
            this.toFloatRange = typedArray.getFloat(2, this.toFloatRange);
            float f2 = this.equals;
            if (NonNull.setMin(xmlPullParser, "scaleX")) {
                f2 = typedArray.getFloat(3, f2);
            }
            this.equals = f2;
            float f3 = this.IsOverlapping;
            if (NonNull.setMin(xmlPullParser, "scaleY")) {
                f3 = typedArray.getFloat(4, f3);
            }
            this.IsOverlapping = f3;
            float f4 = this.toIntRange;
            if (NonNull.setMin(xmlPullParser, "translateX")) {
                f4 = typedArray.getFloat(6, f4);
            }
            this.toIntRange = f4;
            float f5 = this.hashCode;
            if (NonNull.setMin(xmlPullParser, "translateY")) {
                f5 = typedArray.getFloat(7, f5);
            }
            this.hashCode = f5;
            String string = typedArray.getString(0);
            if (string != null) {
                this.FastBitmap$CoordinateSystem = string;
            }
            length();
        }

        private void length() {
            this.setMax.reset();
            this.setMax.postTranslate(-this.isInside, -this.toFloatRange);
            this.setMax.postScale(this.equals, this.IsOverlapping);
            this.setMax.postRotate(this.length, 0.0f, 0.0f);
            this.setMax.postTranslate(this.toIntRange + this.isInside, this.hashCode + this.toFloatRange);
        }

        public float getRotation() {
            return this.length;
        }

        public void setRotation(float f) {
            if (f != this.length) {
                this.length = f;
                length();
            }
        }

        public float getPivotX() {
            return this.isInside;
        }

        public void setPivotX(float f) {
            if (f != this.isInside) {
                this.isInside = f;
                length();
            }
        }

        public float getPivotY() {
            return this.toFloatRange;
        }

        public void setPivotY(float f) {
            if (f != this.toFloatRange) {
                this.toFloatRange = f;
                length();
            }
        }

        public float getScaleX() {
            return this.equals;
        }

        public void setScaleX(float f) {
            if (f != this.equals) {
                this.equals = f;
                length();
            }
        }

        public float getScaleY() {
            return this.IsOverlapping;
        }

        public void setScaleY(float f) {
            if (f != this.IsOverlapping) {
                this.IsOverlapping = f;
                length();
            }
        }

        public float getTranslateX() {
            return this.toIntRange;
        }

        public void setTranslateX(float f) {
            if (f != this.toIntRange) {
                this.toIntRange = f;
                length();
            }
        }

        public float getTranslateY() {
            return this.hashCode;
        }

        public void setTranslateY(float f) {
            if (f != this.hashCode) {
                this.hashCode = f;
                length();
            }
        }

        public boolean getMax() {
            for (int i = 0; i < this.setMin.size(); i++) {
                if (this.setMin.get(i).getMax()) {
                    return true;
                }
            }
            return false;
        }

        public boolean setMin(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.setMin.size(); i++) {
                z |= this.setMin.get(i).setMin(iArr);
            }
            return z;
        }
    }

    static abstract class getMax extends length {
        int hashCode = 0;
        String toDoubleRange;
        protected markerClass.setMin[] toString = null;
        int values;

        public boolean getMin() {
            return false;
        }

        public getMax() {
            super();
        }

        public getMax(getMax getmax) {
            super();
            this.toDoubleRange = getmax.toDoubleRange;
            this.values = getmax.values;
            this.toString = markerClass.setMin(getmax.toString);
        }

        public void setMax(Path path) {
            path.reset();
            markerClass.setMin[] setminArr = this.toString;
            if (setminArr != null) {
                markerClass.setMin.setMin(setminArr, path);
            }
        }

        public String getPathName() {
            return this.toDoubleRange;
        }

        public markerClass.setMin[] getPathData() {
            return this.toString;
        }

        public void setPathData(markerClass.setMin[] setminArr) {
            if (!markerClass.setMax(this.toString, setminArr)) {
                this.toString = markerClass.setMin(setminArr);
                return;
            }
            markerClass.setMin[] setminArr2 = this.toString;
            for (int i = 0; i < setminArr.length; i++) {
                setminArr2[i].length = setminArr[i].length;
                for (int i2 = 0; i2 < setminArr[i].getMax.length; i2++) {
                    setminArr2[i].getMax[i2] = setminArr[i].getMax[i2];
                }
            }
        }
    }

    static class setMax extends getMax {
        public boolean getMin() {
            return true;
        }

        setMax() {
        }

        setMax(setMax setmax) {
            super(setmax);
        }

        public void setMax(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            if (NonNull.setMin(xmlPullParser, "pathData")) {
                int[] iArr = getMenu.getMax;
                if (theme == null) {
                    typedArray = resources.obtainAttributes(attributeSet, iArr);
                } else {
                    typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                }
                getMax(typedArray, xmlPullParser);
                typedArray.recycle();
            }
        }

        private void getMax(TypedArray typedArray, XmlPullParser xmlPullParser) {
            int i = 0;
            String string = typedArray.getString(0);
            if (string != null) {
                this.toDoubleRange = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.toString = markerClass.length(string2);
            }
            if (NonNull.setMin(xmlPullParser, "fillType")) {
                i = typedArray.getInt(2, 0);
            }
            this.hashCode = i;
        }
    }

    static class getMin extends getMax {
        float FastBitmap$CoordinateSystem = 4.0f;
        float IsOverlapping = 0.0f;
        Paint.Cap equals = Paint.Cap.BUTT;
        InterpolatorRes getMax;
        float getMin = 0.0f;
        private int[] invoke;
        float isInside = 1.0f;
        float length = 1.0f;
        float setMax = 1.0f;
        InterpolatorRes setMin;
        float toFloatRange = 0.0f;
        Paint.Join toIntRange = Paint.Join.MITER;

        getMin() {
        }

        getMin(getMin getmin) {
            super(getmin);
            this.invoke = getmin.invoke;
            this.setMin = getmin.setMin;
            this.getMin = getmin.getMin;
            this.length = getmin.length;
            this.getMax = getmin.getMax;
            this.hashCode = getmin.hashCode;
            this.setMax = getmin.setMax;
            this.IsOverlapping = getmin.IsOverlapping;
            this.isInside = getmin.isInside;
            this.toFloatRange = getmin.toFloatRange;
            this.equals = getmin.equals;
            this.toIntRange = getmin.toIntRange;
            this.FastBitmap$CoordinateSystem = getmin.FastBitmap$CoordinateSystem;
        }

        private Paint.Cap setMax(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join getMin(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void setMin(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            int[] iArr = getMenu.getMin;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            getMin(typedArray, xmlPullParser, theme);
            typedArray.recycle();
        }

        private void getMin(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            int i;
            this.invoke = null;
            if (NonNull.setMin(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.toDoubleRange = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.toString = markerClass.length(string2);
                }
                this.getMax = NonNull.setMin(typedArray, xmlPullParser, theme, "fillColor", 1);
                float f = this.setMax;
                if (NonNull.setMin(xmlPullParser, "fillAlpha")) {
                    f = typedArray.getFloat(12, f);
                }
                this.setMax = f;
                int i2 = -1;
                if (!NonNull.setMin(xmlPullParser, "strokeLineCap")) {
                    i = -1;
                } else {
                    i = typedArray.getInt(8, -1);
                }
                this.equals = setMax(i, this.equals);
                if (NonNull.setMin(xmlPullParser, "strokeLineJoin")) {
                    i2 = typedArray.getInt(9, -1);
                }
                this.toIntRange = getMin(i2, this.toIntRange);
                float f2 = this.FastBitmap$CoordinateSystem;
                if (NonNull.setMin(xmlPullParser, "strokeMiterLimit")) {
                    f2 = typedArray.getFloat(10, f2);
                }
                this.FastBitmap$CoordinateSystem = f2;
                this.setMin = NonNull.setMin(typedArray, xmlPullParser, theme, "strokeColor", 3);
                float f3 = this.length;
                if (NonNull.setMin(xmlPullParser, "strokeAlpha")) {
                    f3 = typedArray.getFloat(11, f3);
                }
                this.length = f3;
                float f4 = this.getMin;
                if (NonNull.setMin(xmlPullParser, "strokeWidth")) {
                    f4 = typedArray.getFloat(4, f4);
                }
                this.getMin = f4;
                float f5 = this.isInside;
                if (NonNull.setMin(xmlPullParser, "trimPathEnd")) {
                    f5 = typedArray.getFloat(6, f5);
                }
                this.isInside = f5;
                float f6 = this.toFloatRange;
                if (NonNull.setMin(xmlPullParser, "trimPathOffset")) {
                    f6 = typedArray.getFloat(7, f6);
                }
                this.toFloatRange = f6;
                float f7 = this.IsOverlapping;
                if (NonNull.setMin(xmlPullParser, "trimPathStart")) {
                    f7 = typedArray.getFloat(5, f7);
                }
                this.IsOverlapping = f7;
                int i3 = this.hashCode;
                if (NonNull.setMin(xmlPullParser, "fillType")) {
                    i3 = typedArray.getInt(13, i3);
                }
                this.hashCode = i3;
            }
        }

        public boolean getMax() {
            return this.getMax.getMax() || this.setMin.getMax();
        }

        public boolean setMin(int[] iArr) {
            return this.setMin.getMin(iArr) | this.getMax.getMin(iArr);
        }

        /* access modifiers changed from: package-private */
        @ColorInt
        public int getStrokeColor() {
            return this.setMin.length();
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.setMin.getMin(i);
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.getMin;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.getMin = f;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.length;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.length = f;
        }

        /* access modifiers changed from: package-private */
        @ColorInt
        public int getFillColor() {
            return this.getMax.length();
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.getMax.getMin(i);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.setMax;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.setMax = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.IsOverlapping;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.IsOverlapping = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.isInside;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.isInside = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.toFloatRange;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.toFloatRange = f;
        }
    }
}
