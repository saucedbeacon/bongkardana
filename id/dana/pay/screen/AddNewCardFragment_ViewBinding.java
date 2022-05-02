package id.dana.pay.screen;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.pay.BasePayFragment_ViewBinding;
import id.dana.richview.DanaProtectionView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class AddNewCardFragment_ViewBinding extends BasePayFragment_ViewBinding {
    private AddNewCardFragment getMax;
    private View setMin;

    @UiThread
    public AddNewCardFragment_ViewBinding(final AddNewCardFragment addNewCardFragment, View view) {
        super(addNewCardFragment, view);
        this.getMax = addNewCardFragment;
        addNewCardFragment.expressPayView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48812131363436, "field 'expressPayView'", ImageView.class);
        addNewCardFragment.danaProtectionView = (DanaProtectionView) drawDividersHorizontal.setMin(view, R.id.f72222131365857, "field 'danaProtectionView'", DanaProtectionView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f37482131362203, "method 'onParentLayoutClicked'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                addNewCardFragment.onParentLayoutClicked();
            }
        });
    }

    public final void setMax() {
        AddNewCardFragment addNewCardFragment = this.getMax;
        if (addNewCardFragment != null) {
            this.getMax = null;
            addNewCardFragment.expressPayView = null;
            addNewCardFragment.danaProtectionView = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
