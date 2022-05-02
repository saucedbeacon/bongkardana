package o;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.changeMenuMode;

final class IMultiInstanceInvalidationCallback implements Runnable {
    private final FtsOptions$Order setMax;

    public IMultiInstanceInvalidationCallback(FtsOptions$Order ftsOptions$Order) {
        this.setMax = ftsOptions$Order;
    }

    public final void run() {
        this.setMax.equals = null;
    }

    public abstract class Stub<V extends Ignore<T>, T> extends RecyclerView.Adapter<V> {
        private List<T> setMax = new ArrayList();
        private Ignore.setMin setMin;

        public abstract class Proxy<VH extends Ignore<T>, T> extends setGroupEnabled<T, VH> {
            public Ignore.setMin setMax;

            public Proxy(@NonNull changeMenuMode.setMin<T> setmin) {
                super(setmin);
            }

            /* renamed from: setMin */
            public void onBindViewHolder(@NonNull VH vh, int i) {
                vh.setMax(length(i));
                vh.setMin(this.setMax);
            }
        }

        /* renamed from: getMax */
        public void onBindViewHolder(V v, int i) {
            v.setMax(setMin(i));
            v.setMin(length());
        }

        /* renamed from: getMax */
        public void onViewRecycled(@NonNull V v) {
            v.getMin();
        }

        public Ignore.setMin length() {
            return this.setMin;
        }

        public void getMax(Ignore.setMin setmin) {
            this.setMin = setmin;
        }

        public void getMax(int i) {
            List<T> list = this.setMax;
            if (list != null && i >= 0 && list.size() > i) {
                this.setMax.remove(i);
                notifyItemRemoved(i);
            }
        }

        public final void getMin(T t) {
            List<T> list = this.setMax;
            if (list != null && !list.isEmpty() && t != null) {
                Iterator<T> it = this.setMax.iterator();
                while (it.hasNext()) {
                    if (t.equals(it.next())) {
                        it.remove();
                    }
                }
                notifyDataSetChanged();
            }
        }

        public final void getMin() {
            List<T> list = this.setMax;
            if (list != null && !list.isEmpty()) {
                this.setMax.clear();
                notifyDataSetChanged();
            }
        }

        public void length(List<T> list) {
            if (list != null) {
                List<T> list2 = this.setMax;
                if (list2 == null) {
                    getMin(list);
                } else {
                    list2.addAll(list);
                }
                notifyDataSetChanged();
            }
        }

        public void getMax(T t) {
            List<T> list;
            if (t != null && (list = this.setMax) != null) {
                list.add(t);
                notifyItemChanged(this.setMax.size());
            }
        }

        public void setMin(T t) {
            if (t != null) {
                if (this.setMax == null) {
                    this.setMax = new ArrayList();
                }
                this.setMax.add(0, t);
                notifyItemInserted(0);
            }
        }

        public void setMin(List<T> list) {
            setMax(0, list);
        }

        public final void setMax(int i, List<T> list) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(695679979, oncanceled);
                onCancelLoad.getMin(695679979, oncanceled);
            }
            if (list != null && i >= 0) {
                List<T> list2 = this.setMax;
                if (list2 == null) {
                    getMin(list);
                } else {
                    list2.addAll(i, list);
                }
                notifyItemInserted(i);
            }
        }

        public List<T> getMax() {
            return this.setMax;
        }

        public void getMin(List<T> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.setMax = list;
            notifyDataSetChanged();
        }

        public int getItemCount() {
            List<T> list = this.setMax;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public T setMin(int i) {
            int i2;
            if (i < 0) {
                return null;
            }
            List<T> list = this.setMax;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            if (i < i2) {
                return this.setMax.get(i);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lid/dana/base/BaseBottomSheetFullDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "forceFullscrenDialog", "", "getDimAmount", "", "initBottomSheet", "peekHeight", "", "bottomSheetState", "onShow", "onStart", "setupBottomSheet", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public abstract class Default extends order {
        private HashMap getMax;

        public void equals() {
            HashMap hashMap = this.getMax;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        public View getMin(int i) {
            if (this.getMax == null) {
                this.getMax = new HashMap();
            }
            View view = (View) this.getMax.get(Integer.valueOf(i));
            if (view != null) {
                return view;
            }
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this.getMax.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }

        /* access modifiers changed from: protected */
        public final float length() {
            return 0.5f;
        }

        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            equals();
        }

        /* access modifiers changed from: protected */
        public final void setMin(int i, int i2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            WindowManager windowManager = requireActivity.getWindowManager();
            Intrinsics.checkNotNullExpressionValue(windowManager, "requireActivity().windowManager");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            super.setMin(i, i2);
        }

        public void onStart() {
            ViewGroup.LayoutParams layoutParams;
            super.onStart();
            Dialog dialog = getDialog();
            View findViewById = dialog != null ? dialog.findViewById(R.id.f42162131362710) : null;
            if (!(findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null)) {
                layoutParams.height = -1;
            }
            View view = getView();
            if (view != null) {
                view.post(new length(view, findViewById));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "id/dana/base/BaseBottomSheetFullDialogFragment$forceFullscrenDialog$1$1"}, k = 3, mv = {1, 4, 2})
        static final class length implements Runnable {
            final /* synthetic */ View length;
            final /* synthetic */ View setMin;

            length(View view, View view2) {
                this.setMin = view;
                this.length = view2;
            }

            public final void run() {
                ViewParent parent = this.setMin.getParent();
                if (parent != null) {
                    ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                    if (layoutParams != null) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.length) layoutParams).setMin;
                        if (behavior != null) {
                            ((BottomSheetBehavior) behavior).setPeekHeight(this.setMin.getMeasuredHeight());
                            View view = this.length;
                            ViewParent parent2 = view != null ? view.getParent() : null;
                            if (parent2 != null) {
                                ((View) parent2).setBackgroundColor(0);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View!>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }

        public void setMin() {
            super.setMin();
            setMin(setMin(getDialog()), 3);
        }
    }
}
