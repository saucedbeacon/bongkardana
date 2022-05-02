package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class CoordinatorLayout {
    public boolean length;
    public final List<getResolvedLayoutParams> setMax = new ArrayList();
    public final Set<getResolvedLayoutParams> setMin = Collections.newSetFromMap(new WeakHashMap());

    public interface Behavior {
        void length(onAttachedToLayoutParams onattachedtolayoutparams);
    }

    public interface SavedState {
    }

    public abstract class DispatchChangeEvent implements Runnable {
        private final dispatchKeyShortcutEvent mConnection;

        /* access modifiers changed from: protected */
        public void doFinally() {
        }

        /* access modifiers changed from: protected */
        public abstract void runOrThrow() throws Exception;

        public DispatchChangeEvent(dispatchKeyShortcutEvent dispatchkeyshortcutevent) {
            this.mConnection = dispatchkeyshortcutevent;
        }

        public final void run() {
            try {
                runOrThrow();
            } catch (Exception e) {
                if (this.mConnection != null) {
                    this.mConnection.reportError(e);
                }
            } finally {
                doFinally();
            }
        }
    }

    public class DefaultBehavior extends Fragment implements FlipperStateUpdateListener {
        @Nullable
        SavedState getMax;
        ScrollView getMin;
        TextView length;
        TextView setMax;
        Button setMin;
        private final View.OnClickListener toFloatRange = new View.OnClickListener() {
            public final void onClick(View view) {
                onDependentViewChanged.setMin(DefaultBehavior.this.getContext()).getState();
                DefaultBehavior.this.getMin();
            }
        };

        public static DefaultBehavior getMax() {
            return new DefaultBehavior();
        }

        @SuppressLint({"SetTextI18n"})
        @Nullable
        public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            if (this.getMax != null) {
                Button button = new Button(getContext());
                this.setMin = button;
                button.setText("Report Bug");
                this.setMin.setOnClickListener(this.toFloatRange);
            }
            this.setMax = new TextView(getContext());
            this.length = new TextView(getContext());
            ScrollView scrollView = new ScrollView(getContext());
            this.getMin = scrollView;
            scrollView.addView(this.length);
            Button button2 = this.setMin;
            if (button2 != null) {
                linearLayout.addView(button2);
            }
            linearLayout.addView(this.setMax);
            linearLayout.addView(this.getMin);
            return linearLayout;
        }

        public void onStart() {
            super.onStart();
            putExtraData min = onDependentViewChanged.setMin(getContext());
            min.subscribeForUpdates(this);
            this.setMax.setText(getMin());
            this.length.setText(min.getState());
        }

        public void onResume() {
            super.onResume();
            this.getMin.fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        }

        /* access modifiers changed from: package-private */
        public final String getMin() {
            StateSummary stateSummary = onDependentViewChanged.setMin(getContext()).getStateSummary();
            StringBuilder sb = new StringBuilder();
            for (StateSummary.setMin next : stateSummary.setMin) {
                int i = AnonymousClass3.length[next.getMax.ordinal()];
                sb.append(i != 1 ? i != 2 ? i != 3 ? "❓" : "❌" : "✅" : "⏳");
                sb.append(next.setMax);
                sb.append("\n");
            }
            return sb.toString();
        }

        /* renamed from: o.CoordinatorLayout$DefaultBehavior$3  reason: invalid class name */
        static /* synthetic */ class AnonymousClass3 {
            static final /* synthetic */ int[] length;

            /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
            static {
                /*
                    com.facebook.flipper.core.StateSummary$State[] r0 = com.facebook.flipper.core.StateSummary.State.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    length = r0
                    com.facebook.flipper.core.StateSummary$State r1 = com.facebook.flipper.core.StateSummary.State.IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
                L_0x0012:
                    int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                    com.facebook.flipper.core.StateSummary$State r1 = com.facebook.flipper.core.StateSummary.State.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
                L_0x001d:
                    int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                    com.facebook.flipper.core.StateSummary$State r1 = com.facebook.flipper.core.StateSummary.State.FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
                L_0x0028:
                    int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                    com.facebook.flipper.core.StateSummary$State r1 = com.facebook.flipper.core.StateSummary.State.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
                L_0x0033:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.CoordinatorLayout.DefaultBehavior.AnonymousClass3.<clinit>():void");
            }
        }

        public void onStop() {
            super.onStop();
            onDependentViewChanged.setMin(getContext()).unsubscribe();
        }

        public void onAttach(Context context) {
            super.onAttach(context);
            if (context instanceof SavedState) {
                this.getMax = (SavedState) context;
            }
        }
    }

    public final boolean getMin(@Nullable getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z = true;
        if (getresolvedlayoutparams == null) {
            return true;
        }
        boolean remove = this.setMin.remove(getresolvedlayoutparams);
        if (!this.setMax.remove(getresolvedlayoutparams) && !remove) {
            z = false;
        }
        if (z) {
            getresolvedlayoutparams.getMin();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.setMin.size());
        sb.append(", isPaused=");
        sb.append(this.length);
        sb.append("}");
        return sb.toString();
    }
}
