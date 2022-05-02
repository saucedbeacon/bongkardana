package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.StringRes;
import o.setAlpha;
import o.setHotspotBounds;
import o.unscheduleDrawable;

public abstract class SpecialEffectsController {
    boolean getMax = false;
    boolean getMin = false;
    final ArrayList<Operation> length = new ArrayList<>();
    private final ViewGroup setMax;
    final ArrayList<Operation> setMin = new ArrayList<>();

    /* access modifiers changed from: protected */
    public abstract void setMin(@NonNull List<Operation> list, boolean z);

    @NonNull
    static SpecialEffectsController getMin(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return length(viewGroup, fragmentManager.extraCallback());
    }

    @NonNull
    public static SpecialEffectsController length(@NonNull ViewGroup viewGroup, @NonNull setHotspotBounds sethotspotbounds) {
        Object tag = viewGroup.getTag(setAlpha.getMax.setMin);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController max = sethotspotbounds.setMax(viewGroup);
        viewGroup.setTag(setAlpha.getMax.setMin, max);
        return max;
    }

    public SpecialEffectsController(@NonNull ViewGroup viewGroup) {
        this.setMax = viewGroup;
    }

    @NonNull
    public final ViewGroup setMin() {
        return this.setMax;
    }

    @Nullable
    private Operation getMax(@NonNull Fragment fragment) {
        Iterator<Operation> it = this.length.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.setMin.equals(fragment) && !next.getMax()) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    private Operation length(@NonNull Fragment fragment) {
        Iterator<Operation> it = this.setMin.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.setMin.equals(fragment) && !next.getMax()) {
                return next;
            }
        }
        return null;
    }

    public final void setMin(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull unscheduleDrawable unscheduledrawable) {
        synchronized (this.length) {
            StringRes stringRes = new StringRes();
            Operation max = getMax(unscheduledrawable.getMax);
            if (max != null) {
                max.setMax(state, lifecycleImpact);
                return;
            }
            final setMax setmax = new setMax(state, lifecycleImpact, unscheduledrawable, stringRes);
            this.length.add(setmax);
            setmax.getMin.add(new Runnable() {
                public final void run() {
                    if (SpecialEffectsController.this.length.contains(setmax)) {
                        setmax.getMax.applyState(setmax.setMin.mView);
                    }
                }
            });
            setmax.getMin.add(new Runnable() {
                public final void run() {
                    SpecialEffectsController.this.length.remove(setmax);
                    SpecialEffectsController.this.setMin.remove(setmax);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        synchronized (this.length) {
            setMax();
            this.getMax = false;
            int size = this.length.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.length.get(size);
                Operation.State from = Operation.State.from(operation.setMin.mView);
                if (operation.getMax == Operation.State.VISIBLE && from != Operation.State.VISIBLE) {
                    this.getMax = operation.setMin.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax() {
        if (!this.getMax) {
            if (!ViewCompat.ICustomTabsService(this.setMax)) {
                length();
                this.getMin = false;
                return;
            }
            synchronized (this.length) {
                if (!this.length.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.setMin);
                    this.setMin.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        FragmentManager.getMin(2);
                        operation.getMin();
                        if (!operation.length()) {
                            this.setMin.add(operation);
                        }
                    }
                    setMax();
                    ArrayList arrayList2 = new ArrayList(this.length);
                    this.length.clear();
                    this.setMin.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).setMax();
                    }
                    setMin(arrayList2, this.getMin);
                    this.getMin = false;
                }
            }
        }
    }

    public final void length() {
        ViewCompat.ICustomTabsService(this.setMax);
        synchronized (this.length) {
            setMax();
            Iterator<Operation> it = this.length.iterator();
            while (it.hasNext()) {
                it.next().setMax();
            }
            Iterator it2 = new ArrayList(this.setMin).iterator();
            while (it2.hasNext()) {
                FragmentManager.getMin(2);
                ((Operation) it2.next()).getMin();
            }
            Iterator it3 = new ArrayList(this.length).iterator();
            while (it3.hasNext()) {
                FragmentManager.getMin(2);
                ((Operation) it3.next()).getMin();
            }
        }
    }

    private void setMax() {
        Iterator<Operation> it = this.length.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.setMax == Operation.LifecycleImpact.ADDING) {
                next.setMax(Operation.State.from(next.setMin.requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public static class Operation {
        private boolean IsOverlapping = false;
        @NonNull
        public State getMax;
        @NonNull
        public final List<Runnable> getMin = new ArrayList();
        private boolean isInside = false;
        @NonNull
        public final HashSet<StringRes> length = new HashSet<>();
        @NonNull
        LifecycleImpact setMax;
        @NonNull
        public final Fragment setMin;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public void setMax() {
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @NonNull
            public static State from(@NonNull View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            @NonNull
            public static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility ".concat(String.valueOf(i)));
            }

            public final void applyState(@NonNull View view) {
                int i = AnonymousClass3.getMin[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        FragmentManager.getMin(2);
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    FragmentManager.getMin(2);
                    view.setVisibility(0);
                } else if (i == 3) {
                    FragmentManager.getMin(2);
                    view.setVisibility(8);
                } else if (i == 4) {
                    FragmentManager.getMin(2);
                    view.setVisibility(4);
                }
            }
        }

        Operation(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact, @NonNull Fragment fragment, @NonNull StringRes stringRes) {
            this.getMax = state;
            this.setMax = lifecycleImpact;
            this.setMin = fragment;
            stringRes.getMax(new StringRes.getMin() {
                public final void getMin() {
                    Operation.this.getMin();
                }
            });
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax() {
            return this.IsOverlapping;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Operation ");
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("} ");
            sb.append("{");
            sb.append("mFinalState = ");
            sb.append(this.getMax);
            sb.append("} ");
            sb.append("{");
            sb.append("mLifecycleImpact = ");
            sb.append(this.setMax);
            sb.append("} ");
            sb.append("{");
            sb.append("mFragment = ");
            sb.append(this.setMin);
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            if (!getMax()) {
                this.IsOverlapping = true;
                if (this.length.isEmpty()) {
                    setMin();
                    return;
                }
                Iterator it = new ArrayList(this.length).iterator();
                while (it.hasNext()) {
                    ((StringRes) it.next()).setMax();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void setMax(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact) {
            int i = AnonymousClass3.getMax[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    FragmentManager.getMin(2);
                    this.getMax = State.REMOVED;
                    this.setMax = LifecycleImpact.REMOVING;
                } else if (i == 3 && this.getMax != State.REMOVED) {
                    FragmentManager.getMin(2);
                    this.getMax = state;
                }
            } else if (this.getMax == State.REMOVED) {
                FragmentManager.getMin(2);
                this.getMax = State.VISIBLE;
                this.setMax = LifecycleImpact.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean length() {
            return this.isInside;
        }

        @CallSuper
        public void setMin() {
            if (!this.isInside) {
                FragmentManager.getMin(2);
                this.isInside = true;
                for (Runnable run : this.getMin) {
                    run.run();
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                getMin = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = getMin     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.AnonymousClass3.<clinit>():void");
        }
    }

    static class setMax extends Operation {
        @NonNull
        private final unscheduleDrawable equals;

        public final void setMin() {
            super.setMin();
            this.equals.setMax();
        }

        setMax(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull unscheduleDrawable unscheduledrawable, @NonNull StringRes stringRes) {
            super(state, lifecycleImpact, unscheduledrawable.getMax, stringRes);
            this.equals = unscheduledrawable;
        }

        /* access modifiers changed from: package-private */
        public final void setMax() {
            if (this.setMax == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.equals.getMax;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    FragmentManager.getMin(2);
                }
                View requireView = this.setMin.requireView();
                if (requireView.getParent() == null) {
                    unscheduleDrawable unscheduledrawable = this.equals;
                    unscheduledrawable.getMax.mContainer.addView(unscheduledrawable.getMax.mView, unscheduledrawable.getMin.getMin(unscheduledrawable.getMax));
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    @Nullable
    public final Operation.LifecycleImpact getMin(@NonNull unscheduleDrawable unscheduledrawable) {
        Operation max = getMax(unscheduledrawable.getMax);
        if (max != null) {
            return max.setMax;
        }
        Operation length2 = length(unscheduledrawable.getMax);
        if (length2 != null) {
            return length2.setMax;
        }
        return null;
    }
}
