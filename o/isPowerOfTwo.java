package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0014J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0014\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "onClickListener", "Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet$OnClickListener;", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onShow", "setOnClickListener", "setupBottomSheet", "Companion", "OnClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isPowerOfTwo extends order {
    @NotNull
    public static final length getMax = new length((byte) 0);
    private HashMap IsOverlapping;
    public getMin getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet$OnClickListener;", "", "onTryNowButtonClicked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void setMin();
    }

    private View length(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(2023299615, oncanceled);
            onCancelLoad.getMin(2023299615, oncanceled);
        }
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.bottom_sheet_manage_quick_action;
    }

    public final float length() {
        return 0.5f;
    }

    public static final /* synthetic */ getMin setMin(isPowerOfTwo ispoweroftwo) {
        getMin getmin = ispoweroftwo.getMin;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickListener");
        }
        return getmin;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void setMax() {
        super.setMax();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        setCancelable(false);
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
        BottomSheetBehavior bottomSheetBehavior = this.length;
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
        bottomSheetBehavior.setHideable(false);
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) length(resetInternal.setMax.validateRelationship);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ isPowerOfTwo setMin;

        setMin(isPowerOfTwo ispoweroftwo) {
            this.setMin = ispoweroftwo;
        }

        public final void onClick(View view) {
            if (this.setMin.getMin != null) {
                isPowerOfTwo.setMin(this.setMin).setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet$onCreateDialog$1", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "onBackPressed", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends BottomSheetDialog {
        final /* synthetic */ isPowerOfTwo setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(isPowerOfTwo ispoweroftwo, Context context, int i) {
            super(context, i);
            this.setMin = ispoweroftwo;
        }

        public final void onBackPressed() {
            cancel();
        }
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        return new getMax(this, context, getTheme());
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) length(resetInternal.setMax.RequiresApi);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "flBottomSheet");
        return frameLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet$Companion;", "", "()V", "DIM_AMOUNT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
