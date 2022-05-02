package o;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o.onTargetFound;

@TargetApi(16)
public abstract class getVerticalSnapPreference implements onTargetFound.setMax {
    private final List<onTargetFound.length> getMax;
    private final onTargetFound getMin = new onTargetFound();

    public interface IsOverlapping {
        void getMax(setMax setmax);
    }

    public interface isInside {
        void getMin(View view, String str, boolean z);
    }

    public abstract void setMax();

    public static class setMax {
        final String getMax;
        final String getMin;

        public setMax(String str, String str2) {
            this.getMin = str;
            this.getMax = str2;
        }
    }

    public static class toIntRange extends getVerticalSnapPreference {
        private final WeakHashMap<View, Object> getMax = new WeakHashMap<>();
        private final Object[] getMin = new Object[1];
        private final validateChildOrder length;
        private final validateChildOrder setMax;

        public final /* bridge */ /* synthetic */ void setMin(View view) {
            getVerticalSnapPreference.super.setMin(view);
        }

        public toIntRange(List<onTargetFound.length> list, validateChildOrder validatechildorder, validateChildOrder validatechildorder2) {
            super(list);
            this.length = validatechildorder;
            this.setMax = validatechildorder2;
        }

        public final void setMax() {
            for (Map.Entry next : this.getMax.entrySet()) {
                View view = (View) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    Object[] objArr = this.getMin;
                    objArr[0] = value;
                    this.length.getMax(view, objArr);
                }
            }
        }

        public final void setMax(View view) {
            if (this.setMax != null) {
                Object[] objArr = this.length.setMin;
                if (1 == objArr.length) {
                    Object obj = objArr[0];
                    validateChildOrder validatechildorder = this.setMax;
                    Object max = validatechildorder.getMax(view, validatechildorder.setMin);
                    if (obj != max) {
                        if (obj != null) {
                            if (!(obj instanceof Bitmap) || !(max instanceof Bitmap)) {
                                if ((obj instanceof BitmapDrawable) && (max instanceof BitmapDrawable)) {
                                    Bitmap bitmap = ((BitmapDrawable) obj).getBitmap();
                                    Bitmap bitmap2 = ((BitmapDrawable) max).getBitmap();
                                    if (bitmap != null && bitmap.sameAs(bitmap2)) {
                                        return;
                                    }
                                } else if (obj.equals(max)) {
                                    return;
                                }
                            } else if (((Bitmap) obj).sameAs((Bitmap) max)) {
                                return;
                            }
                        }
                        if (!(max instanceof Bitmap) && !(max instanceof BitmapDrawable) && !this.getMax.containsKey(view)) {
                            Object[] objArr2 = this.getMin;
                            objArr2[0] = max;
                            if (this.length.setMin(objArr2)) {
                                this.getMax.put(view, max);
                            } else {
                                this.getMax.put(view, (Object) null);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            validateChildOrder validatechildorder2 = this.length;
            validatechildorder2.getMax(view, validatechildorder2.setMin);
        }
    }

    static class getMax {
        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }

        public final boolean setMax(TreeMap<View, List<View>> treeMap) {
            ArrayList arrayList = new ArrayList();
            while (!treeMap.isEmpty()) {
                if (!getMax(treeMap, treeMap.firstKey(), arrayList)) {
                    return false;
                }
            }
            return true;
        }

        private boolean getMax(TreeMap<View, List<View>> treeMap, View view, List<View> list) {
            if (list.contains(view)) {
                return false;
            }
            if (!treeMap.containsKey(view)) {
                return true;
            }
            List remove = treeMap.remove(view);
            list.add(view);
            int size = remove.size();
            for (int i = 0; i < size; i++) {
                if (!getMax(treeMap, (View) remove.get(i), list)) {
                    return false;
                }
            }
            list.remove(view);
            return true;
        }
    }

    public static class equals extends getVerticalSnapPreference {
        private static final Set<Integer> getMax = new HashSet(Arrays.asList(new Integer[]{0, 1, 5, 7}));
        private static final Set<Integer> length = new HashSet(Arrays.asList(new Integer[]{2, 3, 4, 6, 8}));
        private final IsOverlapping IsOverlapping;
        private final WeakHashMap<View, int[]> getMin = new WeakHashMap<>();
        private boolean isInside;
        private final List<toFloatRange> setMax;
        private final String setMin;
        private final getMax toIntRange;

        public equals(List<onTargetFound.length> list, List<toFloatRange> list2, String str, IsOverlapping isOverlapping) {
            super(list);
            this.setMax = list2;
            this.setMin = str;
            this.isInside = true;
            this.IsOverlapping = isOverlapping;
            this.toIntRange = new getMax((byte) 0);
        }

        public final void setMax() {
            Iterator<Map.Entry<View, int[]>> it = this.getMin.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    View view = (View) next.getKey();
                    int[] iArr = (int[]) next.getValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    for (int i = 0; i < iArr.length; i++) {
                        layoutParams.addRule(i, iArr[i]);
                    }
                    view.setLayoutParams(layoutParams);
                } else {
                    this.isInside = false;
                    return;
                }
            }
        }

        public final void setMin(View view) {
            if (this.isInside) {
                setMin().length(view, length(), this);
            }
        }

        public final void setMax(View view) {
            Set<Integer> set;
            ViewGroup viewGroup = (ViewGroup) view;
            SparseArray sparseArray = new SparseArray();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                int id2 = childAt.getId();
                if (id2 > 0) {
                    sparseArray.put(id2, childAt);
                }
            }
            int size = this.setMax.size();
            for (int i2 = 0; i2 < size; i2++) {
                toFloatRange tofloatrange = this.setMax.get(i2);
                View view2 = (View) sparseArray.get(tofloatrange.setMin);
                if (view2 != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                    int[] iArr = (int[]) layoutParams.getRules().clone();
                    if (iArr[tofloatrange.length] == tofloatrange.getMax) {
                        continue;
                    } else {
                        if (!this.getMin.containsKey(view2)) {
                            this.getMin.put(view2, iArr);
                        }
                        layoutParams.addRule(tofloatrange.length, tofloatrange.getMax);
                        if (getMax.contains(Integer.valueOf(tofloatrange.length))) {
                            set = getMax;
                        } else {
                            set = length.contains(Integer.valueOf(tofloatrange.length)) ? length : null;
                        }
                        if (set == null || length(set, sparseArray)) {
                            view2.setLayoutParams(layoutParams);
                        } else {
                            setMax();
                            this.IsOverlapping.getMax(new setMax("circular_dependency", this.setMin));
                            return;
                        }
                    }
                }
            }
        }

        private boolean length(Set<Integer> set, SparseArray<View> sparseArray) {
            TreeMap treeMap = new TreeMap(new Comparator<View>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    View view = (View) obj;
                    View view2 = (View) obj2;
                    if (view == view2) {
                        return 0;
                    }
                    if (view == null) {
                        return -1;
                    }
                    if (view2 == null) {
                        return 1;
                    }
                    return view2.hashCode() - view.hashCode();
                }
            });
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                View valueAt = sparseArray.valueAt(i);
                int[] rules = ((RelativeLayout.LayoutParams) valueAt.getLayoutParams()).getRules();
                ArrayList arrayList = new ArrayList();
                for (Integer intValue : set) {
                    int i2 = rules[intValue.intValue()];
                    if (i2 > 0 && i2 != valueAt.getId()) {
                        arrayList.add(sparseArray.get(i2));
                    }
                }
                treeMap.put(valueAt, arrayList);
            }
            return this.toIntRange.setMax(treeMap);
        }
    }

    public static class toFloatRange {
        public final int getMax;
        public final int length;
        public final int setMin;

        public toFloatRange(int i, int i2, int i3) {
            this.setMin = i;
            this.length = i2;
            this.getMax = i3;
        }
    }

    public static class length extends getMin {
        final int length;
        private final WeakHashMap<View, C0043length> setMax = new WeakHashMap<>();

        public final /* bridge */ /* synthetic */ void setMin(View view) {
            super.setMin(view);
        }

        public length(List<onTargetFound.length> list, int i, String str, isInside isinside) {
            super(list, str, isinside, false);
            this.length = i;
        }

        public final void setMax() {
            for (Map.Entry next : this.setMax.entrySet()) {
                View view = (View) next.getKey();
                C0043length length2 = (C0043length) next.getValue();
                View.AccessibilityDelegate length3 = length(view);
                if (length3 == length2) {
                    view.setAccessibilityDelegate(length2.getMin);
                } else if (length3 instanceof C0043length) {
                    while (true) {
                        C0043length length4 = (C0043length) length3;
                        if (length4.getMin != length2) {
                            if (!(length4.getMin instanceof C0043length)) {
                                break;
                            }
                            length3 = length4.getMin;
                        } else {
                            length4.getMin = length2.getMin;
                            break;
                        }
                    }
                }
            }
            this.setMax.clear();
        }

        public final void setMax(View view) {
            View.AccessibilityDelegate length2 = length(view);
            if (!(length2 instanceof C0043length) || !((C0043length) length2).getMin(this.getMax)) {
                C0043length length3 = new C0043length(length2);
                view.setAccessibilityDelegate(length3);
                this.setMax.put(view, length3);
            }
        }

        private static View.AccessibilityDelegate length(View view) {
            try {
                return (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                findOnePartiallyOrCompletelyInvisibleChild.toIntRange();
            }
            return null;
        }

        /* renamed from: o.getVerticalSnapPreference$length$length  reason: collision with other inner class name */
        class C0043length extends View.AccessibilityDelegate {
            View.AccessibilityDelegate getMin;

            public C0043length(View.AccessibilityDelegate accessibilityDelegate) {
                this.getMin = accessibilityDelegate;
            }

            public final boolean getMin(String str) {
                C0043length length = this;
                while (length.this.getMax != str) {
                    View.AccessibilityDelegate accessibilityDelegate = length.getMin;
                    if (!(accessibilityDelegate instanceof C0043length)) {
                        return false;
                    }
                    length = (C0043length) accessibilityDelegate;
                }
                return true;
            }

            public final void sendAccessibilityEvent(View view, int i) {
                if (i == length.this.length) {
                    length length = length.this;
                    length.setMin.getMin(view, length.getMax, length.getMin);
                }
                View.AccessibilityDelegate accessibilityDelegate = this.getMin;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.sendAccessibilityEvent(view, i);
                }
            }
        }
    }

    public static class setMin extends getMin {
        private final Map<TextView, TextWatcher> setMax = new HashMap();

        public final /* bridge */ /* synthetic */ void setMin(View view) {
            super.setMin(view);
        }

        public setMin(List<onTargetFound.length> list, String str, isInside isinside) {
            super(list, str, isinside, true);
        }

        public final void setMax() {
            for (Map.Entry next : this.setMax.entrySet()) {
                ((TextView) next.getKey()).removeTextChangedListener((TextWatcher) next.getValue());
            }
            this.setMax.clear();
        }

        public final void setMax(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                getMax getmax = new getMax(textView);
                TextWatcher textWatcher = this.setMax.get(textView);
                if (textWatcher != null) {
                    textView.removeTextChangedListener(textWatcher);
                }
                textView.addTextChangedListener(getmax);
                this.setMax.put(textView, getmax);
            }
        }

        class getMax implements TextWatcher {
            private final View getMax;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public getMax(View view) {
                this.getMax = view;
            }

            public final void afterTextChanged(Editable editable) {
                setMin setmin = setMin.this;
                setmin.setMin.getMin(this.getMax, setmin.getMax, setmin.getMin);
            }
        }
    }

    static abstract class getMin extends getVerticalSnapPreference {
        final String getMax;
        final boolean getMin;
        final isInside setMin;

        public getMin(List<onTargetFound.length> list, String str, isInside isinside, boolean z) {
            super(list);
            this.setMin = isinside;
            this.getMax = str;
            this.getMin = z;
        }
    }

    public void setMin(View view) {
        this.getMin.length(view, this.getMax, this);
    }

    protected getVerticalSnapPreference(List<onTargetFound.length> list) {
        this.getMax = list;
    }

    /* access modifiers changed from: protected */
    public final List<onTargetFound.length> length() {
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final onTargetFound setMin() {
        return this.getMin;
    }
}
