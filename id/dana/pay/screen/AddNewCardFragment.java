package id.dana.pay.screen;

import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.contract.payqr.AddNewCardModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.pay.BasePayFragment;
import id.dana.richview.DanaProtectionView;
import javax.inject.Inject;
import o.PrepareException;
import o.createStep;
import o.enableLayers;
import o.getPageSize;
import o.requestPluginModel;
import o.saveFile;
import o.stopIgnoring;

public class AddNewCardFragment extends BasePayFragment implements enableLayers.getMin {
    @Inject
    public enableLayers.setMin addNewCardPresenter;
    @BindView(2131365857)
    DanaProtectionView danaProtectionView;
    @BindView(2131363436)
    ImageView expressPayView;
    private createStep getMin;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    private getMin setMin;

    public interface getMin {
        void length();
    }

    public void dismissProgress() {
    }

    public void onError(String str) {
    }

    public final int setMin() {
        return R.layout.fragment_add_card;
    }

    public void showProgress() {
    }

    public static AddNewCardFragment getMin(getMin getmin) {
        AddNewCardFragment addNewCardFragment = new AddNewCardFragment();
        addNewCardFragment.setMin = getmin;
        return addNewCardFragment;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362203})
    public void onParentLayoutClicked() {
        getMin getmin = this.setMin;
        if (getmin != null) {
            getmin.length();
        }
    }

    public final void equals() {
        throw new UnsupportedOperationException();
    }

    public final void setMax(boolean z) {
        this.danaProtectionView.setOnClickListener(new saveFile(this));
    }

    public final void getMax(Boolean bool) {
        this.expressPayView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        if (this.getMin != null) {
            this.getMin = null;
        }
        requestPluginModel.setMin setmin = new requestPluginModel.setMin((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            setmin.getMin = r3;
            setmin.setMax = new AddNewCardModule(this);
            setmin.setMin = new OfflinePayModule(new getPageSize.getMin() {
                public final void dismissProgress() {
                }

                public final void onError(String str) {
                }

                public final void showProgress() {
                }

                public final void length(Boolean bool) {
                    AddNewCardFragment.this.setMax(bool.booleanValue());
                }
            });
            stopIgnoring.setMin(setmin.setMax, AddNewCardModule.class);
            stopIgnoring.setMin(setmin.setMin, OfflinePayModule.class);
            stopIgnoring.setMin(setmin.getMin, PrepareException.AnonymousClass1.class);
            requestPluginModel requestpluginmodel = new requestPluginModel(setmin.setMax, setmin.setMin, setmin.getMin, (byte) 0);
            this.getMin = requestpluginmodel;
            requestpluginmodel.length(this);
            getMin(this.addNewCardPresenter, this.offlinePayPresenter);
            this.addNewCardPresenter.getMax();
            this.offlinePayPresenter.setMin();
            setMax(this.offlinePayPresenter);
            return;
        }
        throw null;
    }
}
