package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public abstract class setImageDrawable<T> implements setTextClassifier<T> {
    public final List<String> getMax = new ArrayList();
    public getMax getMin;
    public AppCompatMultiAutoCompleteTextView<T> length;
    public T setMax;

    public interface getMax {
        void getMin(@NonNull List<String> list);

        void length(@NonNull List<String> list);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean getMax(@NonNull getInternalPopup getinternalpopup);

    /* access modifiers changed from: package-private */
    public abstract boolean getMin(@NonNull T t);

    setImageDrawable(AppCompatMultiAutoCompleteTextView<T> appCompatMultiAutoCompleteTextView) {
        this.length = appCompatMultiAutoCompleteTextView;
    }

    public final void getMin(@NonNull Iterable<getInternalPopup> iterable) {
        this.getMax.clear();
        for (getInternalPopup next : iterable) {
            if (getMax(next)) {
                this.getMax.add(next.getMax);
            }
        }
        if (this.getMax.isEmpty()) {
            this.length.length(this);
        } else {
            this.length.getMin(this);
        }
        setMax(this.getMin, this.setMax);
    }

    public final boolean setMax(@NonNull String str) {
        T t = this.setMax;
        return t != null && getMin(t) && this.getMax.contains(str);
    }

    public final void setMax(@Nullable getMax getmax, @Nullable T t) {
        if (!this.getMax.isEmpty() && getmax != null) {
            if (t == null || getMin(t)) {
                getmax.getMin(this.getMax);
            } else {
                getmax.length(this.getMax);
            }
        }
    }

    public final void setMax(@Nullable T t) {
        this.setMax = t;
        setMax(this.getMin, t);
    }
}
