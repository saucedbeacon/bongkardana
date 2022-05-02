package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonGhostView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/ContactPermissionDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "onPositiveAction", "Lkotlin/Function0;", "", "onNegativeAction", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "initViews", "dialog", "Landroid/content/DialogInterface;", "onShow", "onStart", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class newIntent extends order {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    /* access modifiers changed from: private */
    public Function0<Unit> getMin;
    private Function0<Unit> isInside;
    /* access modifiers changed from: private */
    public Function0<Unit> toFloatRange;
    private HashMap toIntRange;

    public newIntent() {
        this((Function0) null, (Function0) null, (Function0) null, 7);
    }

    private View getMin(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.bottom_sheet_contact_permission_coordinator;
    }

    public final float length() {
        return 0.48f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ newIntent(Function0 function0, Function0 function02, Function0 function03, int i) {
        this((i & 1) != 0 ? AnonymousClass3.INSTANCE : function0, (i & 2) != 0 ? AnonymousClass4.INSTANCE : function02, (i & 4) != 0 ? AnonymousClass5.INSTANCE : function03);
    }

    private newIntent(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(function0, "onPositiveAction");
        Intrinsics.checkNotNullParameter(function02, "onNegativeAction");
        Intrinsics.checkNotNullParameter(function03, "onDismiss");
        this.getMin = function0;
        this.toFloatRange = function02;
        this.isInside = function03;
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) getMin(resetInternal.setMax.enforcement);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "flContainer");
        return frameLayout;
    }

    public final void setMax() {
        super.setMax();
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) getMin(resetInternal.setMax.asInterface);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMin(this));
        }
        DanaButtonGhostView danaButtonGhostView = (DanaButtonGhostView) getMin(resetInternal.setMax.extraCallbackWithResult);
        if (danaButtonGhostView != null) {
            danaButtonGhostView.setOnClickListener(new setMax(this));
        }
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
        super.onDismiss(dialogInterface);
        this.isInside.invoke();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ newIntent setMin;

        getMin(newIntent newintent) {
            this.setMin = newintent;
        }

        public final void onClick(View view) {
            this.setMin.getMin.invoke();
            this.setMin.dismissAllowingStateLoss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ newIntent getMax;

        setMax(newIntent newintent) {
            this.getMax = newintent;
        }

        public final void onClick(View view) {
            this.getMax.toFloatRange.invoke();
            this.getMax.dismissAllowingStateLoss();
        }
    }

    public final void getMin(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        super.show(fragmentManager, "ContactPermissionDialogFragment");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/ContactPermissionDialogFragment$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
