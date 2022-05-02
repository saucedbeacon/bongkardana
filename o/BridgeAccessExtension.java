package o;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.ContentViewCallback;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0015\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lid/dana/home/tab/InternetConnectivitySnackbar;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar;", "parent", "Landroid/view/ViewGroup;", "content", "Landroid/view/View;", "contentViewCallback", "Lcom/google/android/material/snackbar/ContentViewCallback;", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;)V", "value", "", "connected", "getConnected", "()Z", "setConnected", "(Z)V", "stringResource", "", "getStringResource", "()I", "getBackgroundColor", "Companion", "InternetConnectionSnackBarCallback", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BridgeAccessExtension extends BaseTransientBottomBar<BridgeAccessExtension> {
    @NotNull
    public static final length getMin = new length((byte) 0);
    private boolean getMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BridgeAccessExtension(@NotNull ViewGroup viewGroup, @NotNull View view, @NotNull ContentViewCallback contentViewCallback) {
        super(viewGroup, view, contentViewCallback);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(view, "content");
        Intrinsics.checkNotNullParameter(contentViewCallback, "contentViewCallback");
    }

    public final boolean getMin() {
        return this.getMax;
    }

    @SuppressLint({"WrongConstant"})
    public final void getMax(boolean z) {
        boolean z2 = this.getMax;
        this.getMax = z;
        setDuration(z ? 2000 : -2);
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.view;
        if (snackbarBaseLayout != null) {
            View view = snackbarBaseLayout;
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.getTrackTintMode);
            if (textView != null) {
                textView.setText(this.getMax ? R.string.connection_connected : R.string.connection_disconnected);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(resetInternal.setMax.setOverflowIcon);
            if (linearLayout != null) {
                boolean length2 = CornerMarkingDataProvider.length();
                int i = R.color.f20292131099937;
                if (length2) {
                    int[] iArr = new int[2];
                    iArr[0] = IntRange.setMax(getContext(), z2 ? R.color.f20292131099937 : R.color.f23802131100313);
                    boolean z3 = this.getMax;
                    Context context = getContext();
                    if (!z3) {
                        i = R.color.f23802131100313;
                    }
                    iArr[1] = IntRange.setMax(context, i);
                    ObjectAnimator.ofArgb(linearLayout, "backgroundColor", iArr).start();
                    return;
                }
                boolean z4 = this.getMax;
                Context context2 = getContext();
                if (!z4) {
                    i = R.color.f23802131100313;
                }
                linearLayout.setBackgroundColor(IntRange.setMax(context2, i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/home/tab/InternetConnectivitySnackbar$InternetConnectionSnackBarCallback;", "Lcom/google/android/material/snackbar/ContentViewCallback;", "content", "Landroid/view/View;", "(Landroid/view/View;)V", "animateContentIn", "", "delay", "", "duration", "animateContentOut", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class setMax implements ContentViewCallback {
        private final View setMin;

        public final void animateContentIn(int i, int i2) {
        }

        public final void animateContentOut(int i, int i2) {
        }

        public setMax(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "content");
            this.setMin = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/home/tab/InternetConnectivitySnackbar$Companion;", "", "()V", "LENGTH_DEFAULT", "", "make", "Lid/dana/home/tab/InternetConnectivitySnackbar;", "parent", "Landroid/view/ViewGroup;", "connected", "", "removeExtraPadding", "", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static BridgeAccessExtension length(@NotNull ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_snackbar_internet_connection, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "content");
            BridgeAccessExtension bridgeAccessExtension = new BridgeAccessExtension(viewGroup, inflate, new setMax(inflate));
            bridgeAccessExtension.setGestureInsetBottomIgnored(true);
            length length = BridgeAccessExtension.getMin;
            View view = bridgeAccessExtension.getView();
            Intrinsics.checkNotNullExpressionValue(view, "getView()");
            setMin(view);
            bridgeAccessExtension.getMax(z);
            return bridgeAccessExtension;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/core/view/WindowInsetsCompat;", "kotlin.jvm.PlatformType", "v", "Landroid/view/View;", "insets", "onApplyWindowInsets"}, k = 3, mv = {1, 4, 2})
        static final class setMax implements AppCompatActivity {
            public static final setMax length = new setMax();

            setMax() {
            }

            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                Intrinsics.checkNotNullExpressionValue(view, SecurityConstants.KEY_VALUE);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                return windowInsetsCompat;
            }
        }

        private static void setMin(View view) {
            view.setPadding(0, 0, 0, 0);
            ViewCompat.setMax(view, (AppCompatActivity) setMax.length);
            getBluetoothAdapterState.getMax(view, (Integer) 0, (Integer) 0, (Integer) 0, (Integer) 0);
        }
    }
}
