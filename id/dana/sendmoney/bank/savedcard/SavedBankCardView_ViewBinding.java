package id.dana.sendmoney.bank.savedcard;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SavedBankCardView_ViewBinding implements Unbinder {
    private SavedBankCardView length;

    @UiThread
    public SavedBankCardView_ViewBinding(SavedBankCardView savedBankCardView, View view) {
        this.length = savedBankCardView;
        savedBankCardView.rvSavedBank = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59782131364563, "field 'rvSavedBank'", RecyclerView.class);
        savedBankCardView.rlAdd = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58172131364399, "field 'rlAdd'", RelativeLayout.class);
        savedBankCardView.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SavedBankCardView savedBankCardView = this.length;
        if (savedBankCardView != null) {
            this.length = null;
            savedBankCardView.rvSavedBank = null;
            savedBankCardView.rlAdd = null;
            savedBankCardView.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
