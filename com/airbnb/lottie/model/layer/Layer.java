package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import o.adjustDropDownSizeAndPosition;
import o.forceSuggestionQuery;
import o.isLandscapeMode;
import o.launchQuerySearch;
import o.onTextFocusChanged;
import o.setTitleMarginTop;
import o.setVerticalGravity;

public final class Layer {
    public final int FastBitmap$CoordinateSystem;
    @Nullable
    public final onTextFocusChanged Grayscale$Algorithm;
    public final MatteType ICustomTabsCallback;
    public final forceSuggestionQuery IsOverlapping;
    @Nullable
    public final adjustDropDownSizeAndPosition Mean$Arithmetic;
    private final boolean create;
    public final long equals;
    public final setVerticalGravity getMax;
    public final String getMin;
    public final float hashCode;
    @Nullable
    public final launchQuerySearch invoke;
    public final List<setTitleMarginTop<Float>> invokeSuspend;
    public final int isInside;
    public final long length;
    public final LayerType setMax;
    public final List<isLandscapeMode> setMin;
    public final int toDoubleRange;
    public final List<Mask> toFloatRange;
    @Nullable
    public final String toIntRange;
    public final int toString;
    public final int valueOf;
    public final float values;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<isLandscapeMode> list, setVerticalGravity setverticalgravity, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, forceSuggestionQuery forcesuggestionquery, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable launchQuerySearch launchquerysearch, @Nullable adjustDropDownSizeAndPosition adjustdropdownsizeandposition, List<setTitleMarginTop<Float>> list3, MatteType matteType, @Nullable onTextFocusChanged ontextfocuschanged, boolean z) {
        this.setMin = list;
        this.getMax = setverticalgravity;
        this.getMin = str;
        this.length = j;
        this.setMax = layerType;
        this.equals = j2;
        this.toIntRange = str2;
        this.toFloatRange = list2;
        this.IsOverlapping = forcesuggestionquery;
        this.isInside = i;
        this.toDoubleRange = i2;
        this.FastBitmap$CoordinateSystem = i3;
        this.hashCode = f;
        this.values = f2;
        this.toString = i4;
        this.valueOf = i5;
        this.invoke = launchquerysearch;
        this.Mean$Arithmetic = adjustdropdownsizeandposition;
        this.invokeSuspend = list3;
        this.ICustomTabsCallback = matteType;
        this.Grayscale$Algorithm = ontextfocuschanged;
        this.create = z;
    }

    public final String toString() {
        return setMax("");
    }

    public final boolean setMax() {
        return this.create;
    }

    public final String setMax(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.getMin);
        sb.append("\n");
        setVerticalGravity setverticalgravity = this.getMax;
        Layer max = setverticalgravity.isInside.getMax(this.equals, null);
        if (max != null) {
            sb.append("\t\tParents: ");
            sb.append(max.getMin);
            setVerticalGravity setverticalgravity2 = this.getMax;
            Layer max2 = setverticalgravity2.isInside.getMax(max.equals, null);
            while (max2 != null) {
                sb.append("->");
                sb.append(max2.getMin);
                setVerticalGravity setverticalgravity3 = this.getMax;
                max2 = setverticalgravity3.isInside.getMax(max2.equals, null);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.toFloatRange.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.toFloatRange.size());
            sb.append("\n");
        }
        if (!(this.isInside == 0 || this.toDoubleRange == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.isInside), Integer.valueOf(this.toDoubleRange), Integer.valueOf(this.FastBitmap$CoordinateSystem)}));
        }
        if (!this.setMin.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (isLandscapeMode next : this.setMin) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
