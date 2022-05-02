package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.dana.base.BaseActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.GriverProgressBar;
import o.MultiInstanceInvalidationService;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

public abstract class FtsOptions$Order extends Fragment {
    /* access modifiers changed from: private */
    public Unbinder equals;
    public BaseActivity getMax;
    private autoGenerate getMin;
    public IRedDotManager length;
    private MultiInstanceInvalidationService.AnonymousClass2 setMax;
    private List<onDelete.getMin> setMin;

    public void IsOverlapping() {
    }

    public boolean n_() {
        return false;
    }

    public void o_() {
    }

    /* access modifiers changed from: protected */
    public abstract void setMax();

    /* access modifiers changed from: protected */
    public abstract int setMin();

    public final void getMin(onDelete.getMin... getminArr) {
        if (this.setMin == null) {
            this.setMin = new ArrayList();
        }
        if (getminArr.length > 0) {
            this.setMin.addAll(Arrays.asList(getminArr));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) getActivity();
            this.getMax = baseActivity;
            this.setMax = (MultiInstanceInvalidationService.AnonymousClass2) context;
            this.getMin = baseActivity;
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (setMin() == 0) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        View inflate = layoutInflater.inflate(setMin(), viewGroup, false);
        this.equals = ButterKnife.setMax((Object) this, inflate);
        return inflate;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        setMax();
    }

    public void onResume() {
        super.onResume();
        if (k_()) {
            o_();
        }
    }

    public void onPause() {
        IsOverlapping();
        super.onPause();
    }

    public void onDestroyView() {
        Unbinder unbinder = this.equals;
        if (unbinder != null) {
            RawQuery.getMax(unbinder, new IMultiInstanceInvalidationCallback(this));
        }
        IRedDotManager iRedDotManager = this.length;
        if (iRedDotManager != null && !iRedDotManager.isDisposed()) {
            this.length.dispose();
        }
        List<onDelete.getMin> list = this.setMin;
        if (list != null) {
            for (onDelete.getMin next : list) {
                if (next != null) {
                    next.setMax();
                }
            }
            this.setMin = null;
        }
        super.onDestroyView();
    }

    public final boolean k_() {
        return this.equals != null;
    }

    public final void r_() {
        autoGenerate autogenerate = this.getMin;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
    }

    public final void p_() {
        autoGenerate autogenerate = this.getMin;
        if (autogenerate != null) {
            autogenerate.disableClick();
        }
    }

    public final void length(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.length == null) {
            this.length = new IRedDotManager();
        }
        if (updateRunnable != null) {
            IRedDotManager iRedDotManager = this.length;
            if (iRedDotManager != null) {
                iRedDotManager.getMin(updateRunnable);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final Intent setMax(@NotNull Class<?> cls, String str) {
        return this.getMax.getIntentClassWithTracking(cls, str);
    }
}
