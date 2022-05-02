package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00070\u00070\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/base/DefaultBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "layoutResId", "", "styleResId", "(II)V", "getBottomSheetView", "Landroid/view/View;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupBottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "kotlin.jvm.PlatformType", "view", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class unique extends BottomSheetDialogFragment {
    private final int getMin;
    private HashMap length;
    private final int setMin;

    public void getMax() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View getMin(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        getMax();
    }

    @NotNull
    public abstract View setMax();

    public /* synthetic */ unique() {
        this((byte) 0);
    }

    private unique(byte b) {
        this.setMin = R.layout.view_home_shopping;
        this.getMin = R.style.f78502131951920;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, this.getMin);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(this.setMin, viewGroup, false);
    }

    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnShowListener(new length(onCreateDialog, this));
        return onCreateDialog;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow", "id/dana/base/DefaultBottomSheetDialogFragment$onCreateDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements DialogInterface.OnShowListener {
        final /* synthetic */ Dialog getMin;
        final /* synthetic */ unique setMax;

        length(Dialog dialog, unique unique) {
            this.getMin = dialog;
            this.setMax = unique;
        }

        public final void onShow(DialogInterface dialogInterface) {
            View findViewById = this.getMin.findViewById(R.id.f42162131362710);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<View>(com.g…R.id.design_bottom_sheet)");
            unique.getMax(findViewById);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        View max = setMax();
        Intrinsics.checkNotNullParameter(max, "view");
        BottomSheetBehavior from = BottomSheetBehavior.from(max);
        from.setState(3);
        Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from…vior.STATE_EXPANDED\n    }");
    }

    @NotNull
    public static BottomSheetBehavior<View> getMax(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BottomSheetBehavior<View> from = BottomSheetBehavior.from(view);
        from.setState(3);
        Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from…vior.STATE_EXPANDED\n    }");
        return from;
    }
}
