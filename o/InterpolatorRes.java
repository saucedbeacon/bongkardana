package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class InterpolatorRes {
    private final ColorStateList length;
    private final Shader setMax;
    private int setMin;

    private InterpolatorRes(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.setMax = shader;
        this.length = colorStateList;
        this.setMin = i;
    }

    static InterpolatorRes length(@NonNull Shader shader) {
        return new InterpolatorRes(shader, (ColorStateList) null, 0);
    }

    static InterpolatorRes getMin(@NonNull ColorStateList colorStateList) {
        return new InterpolatorRes((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    static InterpolatorRes setMin(@ColorInt int i) {
        return new InterpolatorRes((Shader) null, (ColorStateList) null, i);
    }

    @Nullable
    public final Shader setMax() {
        return this.setMax;
    }

    @ColorInt
    public final int length() {
        return this.setMin;
    }

    public final void getMin(@ColorInt int i) {
        this.setMin = i;
    }

    public final boolean getMin() {
        return this.setMax != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getMax() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.setMax
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.length
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.InterpolatorRes.getMax():boolean");
    }

    public final boolean getMin(int[] iArr) {
        if (getMax()) {
            ColorStateList colorStateList = this.length;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.setMin) {
                this.setMin = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean setMin() {
        return getMin() || this.setMin != 0;
    }

    @Nullable
    public static InterpolatorRes getMin(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        try {
            return setMax(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    private static InterpolatorRes setMax(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return getMin(LayoutRes.setMax(resources, xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return length(MainThread.getMax(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
