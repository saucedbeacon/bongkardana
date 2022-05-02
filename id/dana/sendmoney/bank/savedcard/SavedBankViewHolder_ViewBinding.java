package id.dana.sendmoney.bank.savedcard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SavedBankViewHolder_ViewBinding implements Unbinder {
    private SavedBankViewHolder length;

    @UiThread
    public SavedBankViewHolder_ViewBinding(SavedBankViewHolder savedBankViewHolder, View view) {
        this.length = savedBankViewHolder;
        savedBankViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        savedBankViewHolder.tvPrefixDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68232131365450, "field 'tvPrefixDescription'", TextView.class);
        savedBankViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        savedBankViewHolder.tvViewDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvViewDescription'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SavedBankViewHolder savedBankViewHolder = this.length;
        if (savedBankViewHolder != null) {
            this.length = null;
            savedBankViewHolder.ivLogo = null;
            savedBankViewHolder.tvPrefixDescription = null;
            savedBankViewHolder.tvTitle = null;
            savedBankViewHolder.tvViewDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
