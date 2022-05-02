package o;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class acquireTempRect extends Fragment {
    private final Set<acquireTempRect> getMax;
    final Constraints getMin;
    @Nullable
    setHorizontalGap length;
    final getEmptyVisibility setMax;
    @Nullable
    Fragment setMin;
    @Nullable
    private acquireTempRect toFloatRange;

    public acquireTempRect() {
        this(new Constraints());
    }

    @VisibleForTesting
    @SuppressLint({"ValidFragment"})
    private acquireTempRect(@NonNull Constraints constraints) {
        this.setMax = new getMax();
        this.getMax = new HashSet();
        this.getMin = constraints;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final Set<acquireTempRect> setMax() {
        acquireTempRect acquiretemprect = this.toFloatRange;
        if (acquiretemprect == null) {
            return Collections.emptySet();
        }
        if (equals(acquiretemprect)) {
            return Collections.unmodifiableSet(this.getMax);
        }
        HashSet hashSet = new HashSet();
        for (acquireTempRect next : this.toFloatRange.setMax()) {
            Fragment parentFragment = next.getParentFragment();
            if (parentFragment == null) {
                parentFragment = next.setMin;
            }
            if (getMax(parentFragment)) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                getMax(getContext(), fragmentManager);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        this.setMin = null;
        acquireTempRect acquiretemprect = this.toFloatRange;
        if (acquiretemprect != null) {
            acquiretemprect.getMax.remove(this);
            this.toFloatRange = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.getMin.setMin();
    }

    public void onStop() {
        super.onStop();
        this.getMin.getMax();
    }

    public void onDestroy() {
        super.onDestroy();
        this.getMin.getMin();
        acquireTempRect acquiretemprect = this.toFloatRange;
        if (acquiretemprect != null) {
            acquiretemprect.getMax.remove(this);
            this.toFloatRange = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.setMin;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    class getMax implements getEmptyVisibility {
        getMax() {
        }

        @NonNull
        public final Set<setHorizontalGap> setMin() {
            Set<acquireTempRect> max = acquireTempRect.this.setMax();
            HashSet hashSet = new HashSet(max.size());
            for (acquireTempRect next : max) {
                if (next.length != null) {
                    hashSet.add(next.length);
                }
            }
            return hashSet;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(acquireTempRect.this);
            sb.append("}");
            return sb.toString();
        }
    }

    private boolean getMax(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.setMin;
        }
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

    /* access modifiers changed from: package-private */
    public final void getMax(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        acquireTempRect acquiretemprect = this.toFloatRange;
        if (acquiretemprect != null) {
            acquiretemprect.getMax.remove(this);
            this.toFloatRange = null;
        }
        acquireTempRect max = Glide.setMax(context).length.getMax(fragmentManager, (Fragment) null, getContent.getMin(context));
        this.toFloatRange = max;
        if (!equals(max)) {
            this.toFloatRange.getMax.add(this);
        }
    }
}
