package id.dana.richview;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.homeinfo.HomeInfoModule;
import id.dana.danah5.DanaH5;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import java.util.List;
import javax.inject.Inject;
import o.InputBridgeExtension;
import o.JSONStreamContext;
import o.PrepareException;
import o.Timer;
import o.VersionedParcelize;
import o.getMonitorToken;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.toggleSoftInput;

public class SurveyView extends BaseRichView implements VersionedParcelize.setMin {
    @BindView(2131362954)
    FrameLayout flhomeSurvey;
    private JSONStreamContext getMin;
    @Inject
    public VersionedParcelize.getMax presenter;
    private String setMax;

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_survey;
    }

    public void onError(String str) {
    }

    public void onGetHomeData(toggleSoftInput togglesoftinput) {
    }

    public void onGetRecentTransactionNotEmpty(List<getMonitorToken> list) {
    }

    public void onShouldShowMerchant(MerchantConsultReviewModel merchantConsultReviewModel) {
    }

    public void onShowMerchantReviewCheckingError() {
    }

    public void onShowTooltip(boolean z) {
    }

    public void setup() {
    }

    public void showProgress() {
    }

    public SurveyView(@NonNull Context context) {
        super(context);
    }

    public SurveyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SurveyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SurveyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.getMin == null) {
            Timer.AnonymousClass1.setMin setmin = new Timer.AnonymousClass1.setMin((byte) 0);
            if (r4 != null) {
                setmin.getMin = r4;
                setmin.setMax = new HomeInfoModule(this);
                stopIgnoring.setMin(setmin.setMax, HomeInfoModule.class);
                stopIgnoring.setMin(setmin.getMin, PrepareException.AnonymousClass1.class);
                this.getMin = new Timer.AnonymousClass1(setmin.setMax, setmin.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMin.getMax(this);
        registerPresenter(this.presenter);
    }

    public void injected(boolean z) {
        super.injected(z);
    }

    public void getSurvey() {
        this.presenter.length();
    }

    @OnClick({2131362954})
    public void onClickSurvey() {
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        sb.append(this.setMax);
        DanaH5.startContainerFullUrl(sb.toString(), new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                SurveyView.this.getSurvey();
            }
        });
    }

    public void onGetHomeInfo(InputBridgeExtension inputBridgeExtension) {
        if (inputBridgeExtension.isInside == null || !inputBridgeExtension.isInside.setMax()) {
            FrameLayout frameLayout = this.flhomeSurvey;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.setMax = inputBridgeExtension.isInside.setMax;
        FrameLayout frameLayout2 = this.flhomeSurvey;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
    }
}
