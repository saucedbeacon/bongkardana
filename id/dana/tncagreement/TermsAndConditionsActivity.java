package id.dana.tncagreement;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.CheckBox;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseWebViewActivity;
import id.dana.dialog.CommonDialog;
import id.dana.richview.WebProgressView;
import o.DownloadStep;
import o.PrepareException;
import o.checkSamsungConcave;
import o.checkVivoConcave;
import o.dispatchOnCancelled;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.stopIgnoring;

public class TermsAndConditionsActivity extends BaseWebViewActivity {
    public static final String TNC_ACTION_RESULT = "TNC_ACTION_RESULT";
    @BindView(2131362049)
    Button btnAgree;
    @BindView(2131362234)
    CheckBox cbTncAgreement;
    /* access modifiers changed from: private */
    public boolean getMax = true;
    @BindView(2131365990)
    WebProgressView viewWebProgress;

    public int getLayout() {
        return R.layout.dialog_tnc_agreement;
    }

    public void configToolbar() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1473774777 == (max = dispatchOnCancelled.getMax(applicationContext, -1473774777)))) {
            onCanceled oncanceled = new onCanceled(-1473774777, max, 512);
            onCancelLoad.setMax(-1473774777, oncanceled);
            onCancelLoad.getMin(-1473774777, oncanceled);
        }
        setTitle(getString(R.string.terms_and_condtion));
    }

    public void init() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1246915232 == (max = dispatchOnCancelled.getMax(applicationContext, 1246915232)))) {
            onCanceled oncanceled = new onCanceled(1246915232, max, 512);
            onCancelLoad.setMax(1246915232, oncanceled);
            onCancelLoad.getMin(1246915232, oncanceled);
        }
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        DownloadStep.getMax getmax = new DownloadStep.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.getMin = applicationComponent;
            stopIgnoring.setMin(getmax.getMin, PrepareException.AnonymousClass1.class);
            new DownloadStep(getmax.getMin, (byte) 0).setMax(this);
            this.cbTncAgreement.setEnabled(false);
            this.viewWebProgress.setWebProgressViewListener(new WebProgressView.setMax() {
                public final void getMax() {
                    if (TermsAndConditionsActivity.this.getMax) {
                        TermsAndConditionsActivity.access$100(TermsAndConditionsActivity.this);
                    }
                }

                public final void setMin() {
                    boolean unused = TermsAndConditionsActivity.this.getMax = false;
                }
            });
            load(isShowMenu.setMin("/m/standalone/tnc"));
            this.cbTncAgreement.setOnCheckedChangeListener(new checkVivoConcave(this));
            return;
        }
        throw null;
    }

    @OnClick({2131362049})
    public void onAgreeClicked() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1262176826 == (max = dispatchOnCancelled.getMax(applicationContext, 1262176826)))) {
            onCanceled oncanceled = new onCanceled(1262176826, max, 512);
            onCancelLoad.setMax(1262176826, oncanceled);
            onCancelLoad.getMin(1262176826, oncanceled);
        }
        Intent intent = new Intent();
        intent.putExtra(TNC_ACTION_RESULT, true);
        setResult(-1, intent);
        finish();
    }

    public void onBackPressed() {
        CommonDialog.getMax getmax = new CommonDialog.getMax(this);
        getmax.equals = getString(R.string.leave_this_page_dialog_message);
        getmax.toFloatRange = getString(R.string.tnc_warning_dialog_message);
        String upperCase = getString(R.string.dialog_positive).toUpperCase();
        checkSamsungConcave checksamsungconcave = new checkSamsungConcave(this);
        getmax.isInside = upperCase;
        getmax.toDoubleRange = checksamsungconcave;
        getmax.IsOverlapping = getString(R.string.dialog_negative).toUpperCase();
        getmax.toIntRange = null;
        getmax.length = false;
        new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0).setMin();
    }

    static /* synthetic */ void access$100(TermsAndConditionsActivity termsAndConditionsActivity) {
        termsAndConditionsActivity.cbTncAgreement.setEnabled(true);
        termsAndConditionsActivity.cbTncAgreement.setTextColor(-13553359);
    }

    public static /* synthetic */ void getMax(TermsAndConditionsActivity termsAndConditionsActivity, boolean z) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1171876814, oncanceled);
            onCancelLoad.getMin(1171876814, oncanceled);
        }
        termsAndConditionsActivity.btnAgree.setEnabled(z);
    }

    public static /* synthetic */ void setMax(TermsAndConditionsActivity termsAndConditionsActivity) {
        Intent intent = new Intent();
        intent.putExtra(TNC_ACTION_RESULT, false);
        termsAndConditionsActivity.setResult(-1, intent);
        termsAndConditionsActivity.finish();
    }
}
