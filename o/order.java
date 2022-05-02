package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import id.dana.R;
import id.dana.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import o.onDelete;
import o.setOnWheelViewListener;

public abstract class order extends BottomSheetDialogFragment {
    private final List<onDelete.getMin> getMax = new ArrayList();
    /* access modifiers changed from: private */
    public Unbinder getMin;
    public BottomSheetBehavior length;
    public BaseActivity setMax;
    public FrameLayout setMin;

    /* access modifiers changed from: protected */
    public abstract FrameLayout getMax();

    /* access modifiers changed from: protected */
    public abstract int getMin();

    /* access modifiers changed from: protected */
    public abstract float length();

    /* access modifiers changed from: protected */
    public setOnWheelViewListener.length s_() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int u_() {
        return 56;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof BaseActivity) {
            this.setMax = (BaseActivity) getActivity();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78472131951916);
    }

    public void onDestroyView() {
        Unbinder unbinder = this.getMin;
        if (unbinder != null) {
            RawQuery.getMax(unbinder, new contentEntity(this));
        }
        for (onDelete.getMin next : this.getMax) {
            if (next != null) {
                next.setMax();
            }
        }
        this.getMax.clear();
        super.onDestroyView();
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        dismiss();
    }

    public void setMin(int i, int i2) {
        View view = getView();
        if (s_() != null) {
            setOnWheelViewListener.getMax(view, s_());
        }
        this.length.setState(i2);
        this.length.setPeekHeight(i);
        this.length.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            public final void onSlide(@NonNull View view, float f) {
            }

            public final void onStateChanged(@NonNull View view, int i) {
                if (i == 5) {
                    order.this.dismiss();
                }
            }
        });
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (getMin() == 0) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        View inflate = layoutInflater.inflate(getMin(), viewGroup, false);
        this.getMin = ButterKnife.setMax((Object) this, inflate);
        return inflate;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        setMax();
    }

    public void setMax() {
        getDialog().setOnShowListener(new languageId(this));
        getDialog().setOnDismissListener(new notIndexed(this));
    }

    public void IsOverlapping() {
        this.length = null;
    }

    public final void length(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = length();
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    public final void getMax(Dialog dialog) {
        if (dialog != null && t_()) {
            dialog.findViewById(R.id.f42162131362710).getLayoutParams().height = setMin(dialog);
        }
        View view = getView();
        if (view != null) {
            view.post(new FtsOptions$MatchInfo(this, view));
        }
    }

    /* access modifiers changed from: protected */
    public boolean t_() {
        return u_() == 0;
    }

    /* access modifiers changed from: protected */
    public final int setMin(Dialog dialog) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (dialog.getWindow() != null) {
            dialog.getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels - isLineVisible.length(requireActivity(), (float) u_());
    }

    public void setMin() {
        if (getMax() != null) {
            FrameLayout max = getMax();
            this.setMin = max;
            this.length = BottomSheetBehavior.from(max);
        }
    }

    static /* synthetic */ void setMin(order order, View view) {
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.length) ((View) view.getParent()).getLayoutParams()).setMin;
        Display defaultDisplay = order.requireActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(point.y);
        }
    }
}
