package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u000eH\u0014J\b\u0010$\u001a\u00020\u0004H\u0014J\b\u0010%\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\b\u0010'\u001a\u00020\u0004H\u0014J\b\u0010(\u001a\u00020\u0004H\u0014J\b\u0010)\u001a\u00020\u0004H\u0016J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,J\u0014\u0010-\u001a\u00020\u0004*\u00020.2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\r¨\u00060"}, d2 = {"Lid/dana/sendmoney/external/TwoActionWithIconBottomSheetFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "onNegativeAction", "Lkotlin/Function0;", "", "onPositiveAction", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "value", "", "desc", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "", "icon", "getIcon", "()I", "setIcon", "(I)V", "isShowed", "", "negativeText", "getNegativeText", "setNegativeText", "positiveText", "getPositiveText", "setPositiveText", "title", "getTitle", "setTitle", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "init", "initListeners", "initViews", "onDismiss", "onShow", "onStart", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "loadImage", "Landroid/widget/ImageView;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSelectCanceled extends order {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public Function0<Unit> FastBitmap$CoordinateSystem;
    @NotNull
    private String IsOverlapping;
    @NotNull
    private String equals;
    public int getMax;
    @NotNull
    private String isInside;
    private HashMap toDoubleRange;
    @NotNull
    private String toFloatRange;
    private boolean toIntRange;
    /* access modifiers changed from: private */
    public Function0<Unit> toString;

    public onSelectCanceled() {
        this((Function0) null, (Function0) null, 3);
    }

    public final int getMin() {
        return R.layout.bottom_sheet_two_action_with_icon_coordinator;
    }

    public final float length() {
        return 0.48f;
    }

    public final View setMax(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onSelectCanceled(Function0 function0, Function0 function02, int i) {
        this((i & 1) != 0 ? AnonymousClass5.INSTANCE : function0, (i & 2) != 0 ? AnonymousClass2.INSTANCE : function02);
    }

    public onSelectCanceled(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "onNegativeAction");
        Intrinsics.checkNotNullParameter(function02, "onPositiveAction");
        this.FastBitmap$CoordinateSystem = function0;
        this.toString = function02;
        this.toFloatRange = "";
        this.IsOverlapping = "";
        this.equals = "";
        this.isInside = "";
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.toFloatRange = str;
        AppCompatTextView appCompatTextView = (AppCompatTextView) setMax(resetInternal.setMax.launchQuerySearch);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.IsOverlapping = str;
        AppCompatTextView appCompatTextView = (AppCompatTextView) setMax(resetInternal.setMax.forceUniformWidth);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.equals = str;
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMax(resetInternal.setMax.asInterface);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setActiveButton(str, (Drawable) null);
        }
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.isInside = str;
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMax(resetInternal.setMax.extraCallbackWithResult);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setActiveButton(str, (Drawable) null);
        }
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) setMax(resetInternal.setMax.enforcement);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "flContainer");
        return frameLayout;
    }

    public final void setMax() {
        super.setMax();
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMax(resetInternal.setMax.asInterface);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMax(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMax(resetInternal.setMax.extraCallbackWithResult);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new length(this));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) setMax(resetInternal.setMax.launchQuerySearch);
        if (appCompatTextView != null) {
            appCompatTextView.setText(this.toFloatRange);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) setMax(resetInternal.setMax.forceUniformWidth);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(this.IsOverlapping);
        }
        DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) setMax(resetInternal.setMax.asInterface);
        if (danaButtonPrimaryView2 != null) {
            danaButtonPrimaryView2.setActiveButton(this.equals, (Drawable) null);
        }
        DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) setMax(resetInternal.setMax.extraCallbackWithResult);
        if (danaButtonSecondaryView2 != null) {
            danaButtonSecondaryView2.setActiveButton(this.isInside, (Drawable) null);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) setMax(resetInternal.setMax.setSupportProgressBarVisibility);
        if (appCompatImageView != null) {
            setMin(appCompatImageView, this.getMax);
        }
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements DialogInterface.OnDismissListener {
        final /* synthetic */ onSelectCanceled getMax;

        setMin(onSelectCanceled onselectcanceled) {
            this.getMax = onselectcanceled;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.getMax.dismiss();
        }
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        this.toIntRange = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ onSelectCanceled setMax;

        getMax(onSelectCanceled onselectcanceled) {
            this.setMax = onselectcanceled;
        }

        public final void onClick(View view) {
            this.setMax.toString.invoke();
            this.setMax.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ onSelectCanceled setMax;

        length(onSelectCanceled onselectcanceled) {
            this.setMax = onselectcanceled;
        }

        public final void onClick(View view) {
            this.setMax.FastBitmap$CoordinateSystem.invoke();
            this.setMax.dismiss();
        }
    }

    public final void getMin(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("TwoActionWithIconBottomSheet");
        if (findFragmentByTag != null) {
            new setColorFilter(fragmentManager).length(findFragmentByTag);
        }
        if (!this.toIntRange && !fragmentManager.IsOverlapping()) {
            super.show(fragmentManager, "TwoActionWithIconBottomSheet");
            this.toIntRange = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney/external/TwoActionWithIconBottomSheetFragment$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static void setMin(ImageView imageView, int i) {
        Context context = imageView.getContext();
        if (context != null) {
            ((updateCornerMarking) Glide.getMax(context)).length(Integer.valueOf(i)).setMax(evaluate.setMin).setMax((int) R.drawable.ic_illustration_unregistered_number).setMin((int) R.drawable.ic_illustration_unregistered_number).length(imageView);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
