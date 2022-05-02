package id.dana.home;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.home.WalletActivity;
import id.dana.richview.PaymentCardsView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import java.util.ArrayList;
import java.util.List;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.onCancelLoad;
import o.onCanceled;

public class WalletActivity extends BaseActivity {
    @BindView(2131362449)
    ConstraintLayout clListCard;
    @BindView(2131364242)
    PaymentCardsView pcvCards;

    public void configToolbar() {
    }

    public int getLayout() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_wallet;
        }
        onCanceled oncanceled = new onCanceled(0, length, 4);
        onCancelLoad.setMax(1926905902, oncanceled);
        onCancelLoad.getMin(1926905902, oncanceled);
        return R.layout.activity_wallet;
    }

    public void init() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1956478003, oncanceled);
            onCancelLoad.getMin(1956478003, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getApplicationContext());
        length2.getMax = TrackerKey.Event.DANA_WALLET_OPEN;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        this.pcvCards.setEntryPoint(TopupSource.DANA_WALLET);
        this.pcvCards.post(new Runnable(this) {
            private final WalletActivity getMin;

            {
                this.getMin = r1;
            }

            public final void run() {
                WalletActivity.setMin(this.getMin);
            }
        });
    }

    /* access modifiers changed from: protected */
    @OnClick({2131365853})
    public void closeActivity() {
        this.pcvCards.closeClicked();
    }

    public static /* synthetic */ void setMin(WalletActivity walletActivity) {
        int length;
        int min;
        Context baseContext = walletActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-666478108, oncanceled);
            onCancelLoad.getMin(-666478108, oncanceled);
        }
        PaymentCardsView paymentCardsView = walletActivity.pcvCards;
        int[] iArr = new int[2];
        paymentCardsView.getLocationOnScreen(iArr);
        paymentCardsView.setParentPosY(iArr[1]);
    }
}
