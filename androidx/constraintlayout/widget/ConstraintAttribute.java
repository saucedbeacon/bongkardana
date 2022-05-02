package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.addContentView;
import o.to;
import org.xmlpull.v1.XmlPullParser;

public final class ConstraintAttribute {
    public AttributeType getMax;
    String getMin;
    boolean length;
    private int setMax;
    private float setMin;
    private String toFloatRange;
    private int toIntRange;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.<clinit>():void");
        }
    }

    public final int setMin() {
        int i = AnonymousClass1.length[this.getMax.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    public final float length() {
        switch (AnonymousClass1.length[this.getMax.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return (float) this.setMax;
            case 4:
                return this.setMin;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.length ? 1.0f : 0.0f;
            case 7:
                return this.setMin;
            default:
                return Float.NaN;
        }
    }

    public final void getMax(float[] fArr) {
        switch (AnonymousClass1.length[this.getMax.ordinal()]) {
            case 1:
            case 2:
                int i = this.toIntRange;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case 3:
                fArr[0] = (float) this.setMax;
                return;
            case 4:
                fArr[0] = this.setMin;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.length ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.setMin;
                return;
            default:
                return;
        }
    }

    private ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
        this.getMin = str;
        this.getMax = attributeType;
        length(obj);
    }

    private ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.getMin = constraintAttribute.getMin;
        this.getMax = constraintAttribute.getMax;
        length(obj);
    }

    private void length(Object obj) {
        switch (AnonymousClass1.length[this.getMax.ordinal()]) {
            case 1:
            case 2:
                this.toIntRange = ((Integer) obj).intValue();
                return;
            case 3:
                this.setMax = ((Integer) obj).intValue();
                return;
            case 4:
                this.setMin = ((Float) obj).floatValue();
                return;
            case 5:
                this.toFloatRange = (String) obj;
                return;
            case 6:
                this.length = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.setMin = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public static HashMap<String, ConstraintAttribute> setMin(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    hashMap2.put(next, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(next, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap".concat(String.valueOf(next)), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return hashMap2;
    }

    public static void setMin(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            String concat = "set".concat(String.valueOf(next));
            try {
                switch (AnonymousClass1.length[constraintAttribute.getMax.ordinal()]) {
                    case 1:
                        cls.getMethod(concat, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.toIntRange)});
                        break;
                    case 2:
                        Method method = cls.getMethod(concat, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.toIntRange);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(concat, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.setMax)});
                        break;
                    case 4:
                        cls.getMethod(concat, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.setMin)});
                        break;
                    case 5:
                        cls.getMethod(concat, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.toFloatRange});
                        break;
                    case 6:
                        cls.getMethod(concat, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.length)});
                        break;
                    case 7:
                        cls.getMethod(concat, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.setMin)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                e.getMessage();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public final void setMin(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(this.getMin);
        String obj = sb.toString();
        try {
            boolean z = true;
            switch (AnonymousClass1.length[this.getMax.ordinal()]) {
                case 1:
                    Method method = cls.getMethod(obj, new Class[]{Integer.TYPE});
                    int pow = (int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f);
                    int i = (pow & ((pow >> 31) ^ -1)) - 255;
                    int pow2 = (int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f);
                    int i2 = (pow2 & ((pow2 >> 31) ^ -1)) - 255;
                    int pow3 = (int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f);
                    int i3 = (pow3 & ((pow3 >> 31) ^ -1)) - 255;
                    int i4 = (int) (fArr[3] * 255.0f);
                    int i5 = (i4 & ((i4 >> 31) ^ -1)) - 255;
                    method.invoke(view, new Object[]{Integer.valueOf((((i5 & (i5 >> 31)) + 255) << 24) | (((i & (i >> 31)) + 255) << 16) | (((i2 & (i2 >> 31)) + 255) << 8) | ((i3 & (i3 >> 31)) + 255))});
                    return;
                case 2:
                    Method method2 = cls.getMethod(obj, new Class[]{Drawable.class});
                    int pow4 = (int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f);
                    int i6 = (pow4 & ((pow4 >> 31) ^ -1)) - 255;
                    int pow5 = (int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f);
                    int i7 = (pow5 & ((pow5 >> 31) ^ -1)) - 255;
                    int pow6 = (int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f);
                    int i8 = (pow6 & ((pow6 >> 31) ^ -1)) - 255;
                    int i9 = (int) (fArr[3] * 255.0f);
                    int i10 = (i9 & ((i9 >> 31) ^ -1)) - 255;
                    int i11 = (((i10 & (i10 >> 31)) + 255) << 24) | (((i6 & (i6 >> 31)) + 255) << 16) | (((i7 & (i7 >> 31)) + 255) << 8);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(i11 | ((i8 & (i8 >> 31)) + 255));
                    method2.invoke(view, new Object[]{colorDrawable});
                    return;
                case 3:
                    cls.getMethod(obj, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 4:
                    cls.getMethod(obj, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 5:
                    StringBuilder sb2 = new StringBuilder("unable to interpolate strings ");
                    sb2.append(this.getMin);
                    throw new RuntimeException(sb2.toString());
                case 6:
                    Method method3 = cls.getMethod(obj, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method3.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(obj, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException unused) {
            addContentView.setMax(view);
        } catch (IllegalAccessException unused2) {
            addContentView.setMax(view);
        } catch (InvocationTargetException unused3) {
        }
    }

    public static void length(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.startIntentSenderForResult);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == to.length.startActivityForResult) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Character.toUpperCase(str.charAt(0)));
                    sb.append(str.substring(1));
                    str = sb.toString();
                }
            } else if (index == to.length.getSavedStateRegistry) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == to.length.registerForActivityResult) {
                    attributeType = AttributeType.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == to.length.onActivityResult) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == to.length.getActivityResultRegistry) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == to.length.access$001) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == to.length.reportFullyDrawn) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == to.length.ComponentActivity$3) {
                    attributeType = AttributeType.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == to.length.ActivityResult) {
                    attributeType = AttributeType.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj));
        }
        obtainStyledAttributes.recycle();
    }
}
