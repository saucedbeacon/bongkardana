package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setSupportAllCaps extends setAutoSizeTextTypeUniformWithPresetSizes {
    private static final String equals = setSupportBackgroundTintList.length("WorkContinuationImpl");
    public final List<setSupportAllCaps> IsOverlapping;
    public final List<? extends onTextChanged> getMax;
    public final ExistingWorkPolicy getMin;
    private final List<String> isInside;
    public final setSupportCompoundDrawablesTintList length;
    public final List<String> setMax;
    public final String setMin;
    public boolean toFloatRange;
    private onCreateInputConnection toIntRange;

    public final boolean length() {
        return this.toFloatRange;
    }

    public setSupportAllCaps(@NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @NonNull List<? extends onTextChanged> list) {
        this(setsupportcompounddrawablestintlist, (String) null, ExistingWorkPolicy.KEEP, list, (List<setSupportAllCaps>) null);
    }

    public setSupportAllCaps(@NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends onTextChanged> list) {
        this(setsupportcompounddrawablestintlist, str, existingWorkPolicy, list, (List<setSupportAllCaps>) null);
    }

    private setSupportAllCaps(@NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends onTextChanged> list, @Nullable List<setSupportAllCaps> list2) {
        this.length = setsupportcompounddrawablestintlist;
        this.setMin = str;
        this.getMin = existingWorkPolicy;
        this.getMax = list;
        this.IsOverlapping = list2;
        this.setMax = new ArrayList(this.getMax.size());
        this.isInside = new ArrayList();
        if (list2 != null) {
            for (setSupportAllCaps setsupportallcaps : list2) {
                this.isInside.addAll(setsupportallcaps.isInside);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String obj = ((onTextChanged) list.get(i)).setMin.toString();
            this.setMax.add(obj);
            this.isInside.add(obj);
        }
    }

    @NonNull
    public final setAutoSizeTextTypeUniformWithPresetSizes length(@NonNull List<setBackgroundDrawable> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new setSupportAllCaps(this.length, this.setMin, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    @NonNull
    public final onCreateInputConnection setMin() {
        if (!this.toFloatRange) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this);
            this.length.length.length(appCompatTextView);
            this.toIntRange = appCompatTextView.getMax;
        } else {
            setSupportBackgroundTintList.getMax();
            TextUtils.join(", ", this.setMax);
        }
        return this.toIntRange;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean setMax() {
        return getMax(this, new HashSet());
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> setMin(setSupportAllCaps setsupportallcaps) {
        HashSet hashSet = new HashSet();
        List<setSupportAllCaps> list = setsupportallcaps.IsOverlapping;
        if (list != null && !list.isEmpty()) {
            for (setSupportAllCaps setsupportallcaps2 : list) {
                hashSet.addAll(setsupportallcaps2.setMax);
            }
        }
        return hashSet;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static boolean getMax(@NonNull setSupportAllCaps setsupportallcaps, @NonNull Set<String> set) {
        set.addAll(setsupportallcaps.setMax);
        Set<String> min = setMin(setsupportallcaps);
        for (String contains : set) {
            if (min.contains(contains)) {
                return true;
            }
        }
        List<setSupportAllCaps> list = setsupportallcaps.IsOverlapping;
        if (list != null && !list.isEmpty()) {
            for (setSupportAllCaps max : list) {
                if (getMax(max, set)) {
                    return true;
                }
            }
        }
        set.removeAll(setsupportallcaps.setMax);
        return false;
    }
}
