package id.dana.ipg.tncagreement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseWebViewActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"Lid/dana/ipg/tncagreement/IpgTermsAndConditionActivity;", "Lid/dana/base/BaseWebViewActivity;", "()V", "configToolbar", "", "getLayout", "", "init", "initViews", "onAgreeClicked", "returnAgreeToTncResult", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IpgTermsAndConditionActivity extends BaseWebViewActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String IPG_TNC_ACTION_RESULT = "IPG_TNC_ACTION_RESULT";
    @NotNull
    public static final String IPG_TNC_URL_EXTRA_KEY = "ipg_tnc_url_extra_key";
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1076741839, oncanceled);
            onCancelLoad.getMin(-1076741839, oncanceled);
        }
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1871211767, oncanceled);
            onCancelLoad.getMin(1871211767, oncanceled);
        }
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_tnc_ipg_agreement;
    }

    public final void configToolbar() {
        setTitle(getString(R.string.ipg_terms_and_conditions));
    }

    public final void init() {
        Bundle extras;
        int length2;
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        Context baseContext = getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-213615772, oncanceled);
            onCancelLoad.getMin(-213615772, oncanceled);
        }
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            str = extras.getString(IPG_TNC_URL_EXTRA_KEY);
        }
        load(isShowMenu.setMin(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/ipg/tncagreement/IpgTermsAndConditionActivity$Companion;", "", "()V", "IPG_TNC_ACTION_RESULT", "", "IPG_TNC_URL_EXTRA_KEY", "returnAgreeToTncResult", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "tncUrl", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @NotNull
        public static Intent getMin(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "tncUrl");
            Intent putExtra = new Intent(context, IpgTermsAndConditionActivity.class).putExtra(IpgTermsAndConditionActivity.IPG_TNC_URL_EXTRA_KEY, str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, IpgTerms…NC_URL_EXTRA_KEY, tncUrl)");
            return putExtra;
        }
    }

    @OnClick({2131362088})
    public final void onAgreeClicked() {
        Intent intent = new Intent();
        intent.putExtra(IPG_TNC_ACTION_RESULT, true);
        setResult(-1, intent);
        finish();
    }
}
