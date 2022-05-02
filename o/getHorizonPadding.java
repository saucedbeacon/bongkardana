package o;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "bottomSheetCallback", "id/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$bottomSheetCallback$2$1", "getBottomSheetCallback", "()Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$bottomSheetCallback$2$1;", "bottomSheetCallback$delegate", "Lkotlin/Lazy;", "bottomSheetListener", "Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$BottomSheetListener;", "getBottomSheetListener", "()Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$BottomSheetListener;", "setBottomSheetListener", "(Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$BottomSheetListener;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShow", "onStart", "setOnButtonClicked", "setupBottomSheet", "BottomSheetListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getHorizonPadding extends order {
    private HashMap IsOverlapping;
    private final Lazy getMax = LazyKt.lazy(new length(this));
    @Nullable
    public getMax getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$BottomSheetListener;", "", "onBottomSheetDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax {
        void getMax();

        void getMin();

        void length();
    }

    public final int getMin() {
        return R.layout.view_contact_permission_container;
    }

    public final float length() {
        return 0.5f;
    }

    public final View setMin(int i) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$bottomSheetCallback$2$1", "invoke", "()Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$bottomSheetCallback$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<AnonymousClass2> {
        final /* synthetic */ getHorizonPadding this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getHorizonPadding gethorizonpadding) {
            super(0);
            this.this$0 = gethorizonpadding;
        }

        @NotNull
        public final AnonymousClass2 invoke() {
            return new BottomSheetBehavior.BottomSheetCallback(this) {
                final /* synthetic */ length getMax;

                public final void onSlide(@NotNull View view, float f) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                }

                {
                    this.getMax = r1;
                }

                public final void onStateChanged(@NotNull View view, int i) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                    if (5 == i) {
                        getMax getmax = this.getMax.this$0.getMin;
                        if (getmax != null) {
                            getmax.getMax();
                        }
                        this.getMax.this$0.dismissAllowingStateLoss();
                    }
                }
            };
        }
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) setMin(resetInternal.setMax.anyOf);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_container");
        return frameLayout;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    public final void setMax() {
        super.setMax();
        ((Button) setMin(resetInternal.setMax.onExtraCallback)).setOnClickListener(new setMax(this));
        ((Button) setMin(resetInternal.setMax.getActiveNotifications)).setOnClickListener(new getMin(this));
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
        BottomSheetBehavior bottomSheetBehavior = this.length;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setBottomSheetCallback((length.AnonymousClass2) this.getMax.getValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ getHorizonPadding getMax;

        setMax(getHorizonPadding gethorizonpadding) {
            this.getMax = gethorizonpadding;
        }

        public final void onClick(View view) {
            getMax getmax = this.getMax.getMin;
            if (getmax != null) {
                getmax.getMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ getHorizonPadding setMax;

        getMin(getHorizonPadding gethorizonpadding) {
            this.setMax = gethorizonpadding;
        }

        public final void onClick(View view) {
            this.setMax.dismiss();
            getMax getmax = this.setMax.getMin;
            if (getmax != null) {
                getmax.length();
            }
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
