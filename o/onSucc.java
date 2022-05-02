package o;

import android.view.View;
import android.widget.FrameLayout;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/savings/view/RemoveSavingGoalDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "onPrimaryButtonClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "onShow", "setButtonListener", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSucc extends order {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public final Function0<Unit> getMax;
    private HashMap isInside;

    private View length(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.view_coordinator_remove_saving_goal;
    }

    public final float length() {
        return 0.5f;
    }

    public onSucc(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onPrimaryButtonClicked");
        this.getMax = function0;
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) length(resetInternal.setMax.isInside);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bs_remove_saving");
        return frameLayout;
    }

    public final void setMax() {
        super.setMax();
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) length(resetInternal.setMax.IconCompatParcelizer);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new length(this));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) length(resetInternal.setMax.INotificationSideChannel$Default);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new setMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ onSucc length;

        length(onSucc onsucc) {
            this.length = onsucc;
        }

        public final void onClick(View view) {
            this.length.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ onSucc length;

        setMax(onSucc onsucc) {
            this.length = onsucc;
        }

        public final void onClick(View view) {
            this.length.getMax.invoke();
            this.length.dismiss();
        }
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/savings/view/RemoveSavingGoalDialogFragment$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
