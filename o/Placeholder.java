package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public final class Placeholder extends Fragment {
    @Nullable
    private Placeholder IsOverlapping;
    @Nullable
    setHorizontalGap getMax;
    @Nullable
    Fragment getMin;
    private final Set<Placeholder> length;
    final Constraints setMax;
    final getEmptyVisibility setMin;

    public Placeholder() {
        this(new Constraints());
    }

    @VisibleForTesting
    @SuppressLint({"ValidFragment"})
    private Placeholder(@NonNull Constraints constraints) {
        this.setMin = new length();
        this.length = new HashSet();
        this.setMax = constraints;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    @NonNull
    public final Set<Placeholder> setMin() {
        if (equals(this.IsOverlapping)) {
            return Collections.unmodifiableSet(this.length);
        }
        if (this.IsOverlapping == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (Placeholder next : this.IsOverlapping.setMin()) {
            if (getMax(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @TargetApi(17)
    private boolean getMax(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            setMax(activity);
        } catch (IllegalStateException unused) {
        }
    }

    public final void onDetach() {
        super.onDetach();
        Placeholder placeholder = this.IsOverlapping;
        if (placeholder != null) {
            placeholder.length.remove(this);
            this.IsOverlapping = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.setMax.setMin();
    }

    public final void onStop() {
        super.onStop();
        this.setMax.getMax();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.setMax.getMin();
        Placeholder placeholder = this.IsOverlapping;
        if (placeholder != null) {
            placeholder.length.remove(this);
            this.IsOverlapping = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        if (parentFragment == null) {
            parentFragment = this.getMin;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    class length implements getEmptyVisibility {
        length() {
        }

        @NonNull
        public final Set<setHorizontalGap> setMin() {
            Set<Placeholder> min = Placeholder.this.setMin();
            HashSet hashSet = new HashSet(min.size());
            for (Placeholder next : min) {
                if (next.getMax != null) {
                    hashSet.add(next.getMax);
                }
            }
            return hashSet;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(Placeholder.this);
            sb.append("}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax(@NonNull Activity activity) {
        Placeholder placeholder = this.IsOverlapping;
        if (placeholder != null) {
            placeholder.length.remove(this);
            this.IsOverlapping = null;
        }
        Placeholder min = Glide.setMax(activity).length.setMin(activity.getFragmentManager(), (Fragment) null, getContent.getMin(activity));
        this.IsOverlapping = min;
        if (!equals(min)) {
            this.IsOverlapping.length.add(this);
        }
    }
}
