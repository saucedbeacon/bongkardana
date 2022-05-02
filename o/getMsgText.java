package o;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0014J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\u001e\u0010!\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0011R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "onMuteUnmuteButtonClicked", "Lkotlin/Function0;", "", "onBlockButtonClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "bottomSheetCallback", "id/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog$bottomSheetCallback$2$1", "getBottomSheetCallback", "()Lid/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog$bottomSheetCallback$2$1;", "bottomSheetCallback$delegate", "Lkotlin/Lazy;", "getOnBlockButtonClicked", "()Lkotlin/jvm/functions/Function0;", "getOnMuteUnmuteButtonClicked", "relationshipStatus", "", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShow", "onStart", "setMuteUnmuteText", "status", "setupBottomSheet", "setupButton", "showBottomSheet", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getMsgText extends order {
    private final Lazy IsOverlapping = LazyKt.lazy(new length(this));
    public String getMax = "";
    @NotNull
    final Function0<Unit> getMin;
    @NotNull
    final Function0<Unit> isInside;
    private HashMap toFloatRange;

    private View getMin(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.bottom_sheet_modify_relationship_coordinator;
    }

    public final float length() {
        return 0.5f;
    }

    public getMsgText(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "onMuteUnmuteButtonClicked");
        Intrinsics.checkNotNullParameter(function02, "onBlockButtonClicked");
        this.getMin = function0;
        this.isInside = function02;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog$bottomSheetCallback$2$1", "invoke", "()Lid/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog$bottomSheetCallback$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<AnonymousClass2> {
        final /* synthetic */ getMsgText this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getMsgText getmsgtext) {
            super(0);
            this.this$0 = getmsgtext;
        }

        @NotNull
        public final AnonymousClass2 invoke() {
            return new BottomSheetBehavior.BottomSheetCallback(this) {
                final /* synthetic */ length setMin;

                public final void onSlide(@NotNull View view, float f) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                }

                {
                    this.setMin = r1;
                }

                public final void onStateChanged(@NotNull View view, int i) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                    if (5 == i) {
                        this.setMin.this$0.dismissAllowingStateLoss();
                    }
                }
            };
        }
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) getMin(resetInternal.setMax.RequiresPermission);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_bottom_sheet");
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

    public final void setMin() {
        CharSequence charSequence;
        super.setMin();
        setMin(setMin(getDialog()), 3);
        BottomSheetBehavior bottomSheetBehavior = this.length;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback((length.AnonymousClass2) this.IsOverlapping.getValue());
        }
        String str = this.getMax;
        AppCompatTextView appCompatTextView = (AppCompatTextView) getMin(resetInternal.setMax.setStackedBackground);
        if (appCompatTextView != null) {
            if (str.hashCode() == 1925346054 && str.equals("ACTIVE")) {
                charSequence = getString(R.string.mute_friendship_profile);
            } else {
                charSequence = getString(R.string.unmute_friendship_profile);
            }
            appCompatTextView.setText(charSequence);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) getMin(resetInternal.setMax.setStackedBackground);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setOnClickListener(new getMin(this));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) getMin(resetInternal.setMax.verifyDrawable);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setOnClickListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ getMsgText getMax;

        getMin(getMsgText getmsgtext) {
            this.getMax = getmsgtext;
        }

        public final void onClick(View view) {
            this.getMax.getMin.invoke();
            this.getMax.dismissAllowingStateLoss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ getMsgText setMax;

        setMin(getMsgText getmsgtext) {
            this.setMax = getmsgtext;
        }

        public final void onClick(View view) {
            this.setMax.isInside.invoke();
            this.setMax.dismissAllowingStateLoss();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
