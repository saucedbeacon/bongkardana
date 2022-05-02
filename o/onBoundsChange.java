package o;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class onBoundsChange extends SpannableStringBuilder {
    private final Class<?> getMin;
    private final List<setMin> length = new ArrayList();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    onBoundsChange(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        if (cls != null) {
            this.getMin = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private onBoundsChange(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        if (cls != null) {
            this.getMin = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    private boolean getMax(@Nullable Object obj) {
        return obj != null && getMax(obj.getClass());
    }

    private boolean getMax(@NonNull Class<?> cls) {
        return this.getMin == cls;
    }

    public final CharSequence subSequence(int i, int i2) {
        return new onBoundsChange(this.getMin, this, i, i2);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (getMax(obj)) {
            setMin setmin = new setMin(obj);
            this.length.add(setmin);
            obj = setmin;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!getMax((Class<?>) cls)) {
            return super.getSpans(i, i2, cls);
        }
        setMin[] setminArr = (setMin[]) super.getSpans(i, i2, setMin.class);
        T[] tArr = (Object[]) Array.newInstance(cls, setminArr.length);
        for (int i3 = 0; i3 < setminArr.length; i3++) {
            tArr[i3] = setminArr[i3].getMin;
        }
        return tArr;
    }

    public final void removeSpan(Object obj) {
        setMin setmin;
        if (getMax(obj)) {
            setmin = getMin(obj);
            if (setmin != null) {
                obj = setmin;
            }
        } else {
            setmin = null;
        }
        super.removeSpan(obj);
        if (setmin != null) {
            this.length.remove(setmin);
        }
    }

    public final int getSpanStart(Object obj) {
        setMin min;
        if (getMax(obj) && (min = getMin(obj)) != null) {
            obj = min;
        }
        return super.getSpanStart(obj);
    }

    public final int getSpanEnd(Object obj) {
        setMin min;
        if (getMax(obj) && (min = getMin(obj)) != null) {
            obj = min;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        setMin min;
        if (getMax(obj) && (min = getMin(obj)) != null) {
            obj = min;
        }
        return super.getSpanFlags(obj);
    }

    public final int nextSpanTransition(int i, int i2, Class<setMin> cls) {
        if (getMax((Class<?>) cls)) {
            cls = setMin.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    private setMin getMin(Object obj) {
        for (int i = 0; i < this.length.size(); i++) {
            setMin setmin = this.length.get(i);
            if (setmin.getMin == obj) {
                return setmin;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void getMin() {
        setMax();
        setMin();
    }

    public final void getMax() {
        for (int i = 0; i < this.length.size(); i++) {
            this.length.get(i).getMax.incrementAndGet();
        }
    }

    private void setMax() {
        for (int i = 0; i < this.length.size(); i++) {
            this.length.get(i).getMax.decrementAndGet();
        }
    }

    private void setMin() {
        for (int i = 0; i < this.length.size(); i++) {
            this.length.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        getMax();
        super.replace(i, i2, charSequence);
        setMax();
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        getMax();
        super.replace(i, i2, charSequence, i3, i4);
        setMax();
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    static class setMin implements TextWatcher, SpanWatcher {
        final AtomicInteger getMax = new AtomicInteger(0);
        final Object getMin;

        setMin(Object obj) {
            this.getMin = obj;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.getMin).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.getMin).onTextChanged(charSequence, i, i2, i3);
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.getMin).afterTextChanged(editable);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.getMax.get() <= 0 || !setMax(obj)) {
                ((SpanWatcher) this.getMin).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.getMax.get() <= 0 || !setMax(obj)) {
                ((SpanWatcher) this.getMin).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.getMax.get() <= 0 || !setMax(obj)) {
                ((SpanWatcher) this.getMin).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        private static boolean setMax(Object obj) {
            return obj instanceof createRatingBar;
        }
    }
}
