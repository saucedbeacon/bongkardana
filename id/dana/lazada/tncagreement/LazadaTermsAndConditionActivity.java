package id.dana.lazada.tncagreement;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseWebViewActivity;
import id.dana.richview.WebProgressView;
import o.dispatchOnCancelled;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;

public class LazadaTermsAndConditionActivity extends BaseWebViewActivity {
    public static final String LAZADA_TNC_ACTION_RESULT = "LAZADA_TNC_ACTION_RESULT";
    @BindView(2131362090)
    Button btnAgree;
    @BindView(2131365990)
    WebProgressView viewWebProgress;

    public int getLayout() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || -407327331 == (max = dispatchOnCancelled.getMax(applicationContext, -407327331))) {
            return R.layout.activity_tnc_lazada_agreement;
        }
        onCanceled oncanceled = new onCanceled(-407327331, max, 512);
        onCancelLoad.setMax(-407327331, oncanceled);
        onCancelLoad.getMin(-407327331, oncanceled);
        return R.layout.activity_tnc_lazada_agreement;
    }

    public void configToolbar() {
        setTitle(getString(R.string.lazada_terms_and_conditions));
    }

    public void init() {
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        load(isShowMenu.setMin("/m/standalone/tnc/lazada-11"));
    }

    public static Intent returnAgreeToTncResult(Context context) {
        return new Intent(context, LazadaTermsAndConditionActivity.class);
    }

    @OnClick({2131362090})
    public void onAgreeCliecked() {
        Intent intent = new Intent();
        intent.putExtra(LAZADA_TNC_ACTION_RESULT, true);
        setResult(-1, intent);
        finish();
    }
}
