package id.dana.sendmoney.confirmation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.common.IntentKeySource;
import id.dana.domain.payasset.model.Institution;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.LogoProgressView;
import id.dana.richview.SelectedAccountView;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.confirmation.ConfirmationType;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.ShareActivityModel;
import id.dana.tracker.TrackerKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import o.APImageDownloadRsp;
import o.BeaconParser;
import o.Blur;
import o.BlurProcess;
import o.BucketInfo;
import o.CornerMarkingDataProvider;
import o.NebulaLoadingView;
import o.PhotoPagerListener;
import o.WheelView;
import o.cancelAll;
import o.convertDipToPx;
import o.convertSpToPx;
import o.cutImageKeepRatio_new;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.handleScrollChange;
import o.hasZero;
import o.isOriginHasAppInfo;
import o.makeTakenPicturePath;
import o.onCancelLoad;
import o.onCanceled;
import o.setH5MenuList;

public class SendMoneyConfirmationActivity extends BaseActivity {
    public static final int REQUEST_CODE_CONFIRMATION = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private String FastBitmap$CoordinateSystem;
    private String Grayscale$Algorithm;
    private String ICustomTabsCallback;
    private String ICustomTabsCallback$Default;
    private String ICustomTabsCallback$Stub;
    private String ICustomTabsCallback$Stub$Proxy;
    private String ICustomTabsService;
    private boolean IsOverlapping;
    private String Mean$Arithmetic;
    private String asBinder;
    private String asInterface;
    private String b;
    @BindView(2131362062)
    Button btnConfirm;
    @Inject
    public cutImageKeepRatio_new.getMax confirmationBankPresenter;
    @Inject
    public makeTakenPicturePath.setMax confirmationPresenter;
    private String create;
    @BindView(2131362616)
    CurrencyTextView ctvVoucher;
    private APImageDownloadRsp equals;
    @BindView(2131363740)
    View expiryTimeView;
    private String extraCallback;
    private String extraCallbackWithResult;
    private String extraCommand;
    private int getCause;
    private APImageDownloadRsp getDefaultImpl;
    private String getInterfaceDescriptor;
    private String getMax;
    private ConfirmationModel getMin;
    private String hashCode;
    /* access modifiers changed from: private */
    public String invoke;
    private String invokeSuspend;
    private String isInside;
    @BindView(2131363581)
    ImageView ivProfile;
    @BindView(2131363823)
    LinearLayout llAdditionalFee;
    @BindView(2131363942)
    LinearLayout llVoucher;
    @BindView(2131363967)
    LogoProgressView lpvLoading;
    private String mayLaunchUrl;
    private String newSession;
    private String newSessionWithExtras;
    @BindView(2131363749)
    View notesView;
    private APImageDownloadRsp onMessageChannelReady;
    private String onNavigationEvent;
    /* access modifiers changed from: private */
    public boolean onPostMessage;
    private String onRelationshipValidationResult;
    private int onTransact;
    @BindView(2131364197)
    SelectedAccountView originView;
    private boolean postMessage;
    private String setDefaultImpl;
    private String setMax;
    @Inject
    public handleScrollChange.getMin shareToFeedPresenter;
    private APImageDownloadRsp toDoubleRange;
    private String toFloatRange;
    private String toIntRange;
    private String toString;
    @BindView(2131365079)
    TextView tvAccountNumber;
    @BindView(2131365090)
    CurrencyTextView tvAdditional;
    @BindView(2131365102)
    CurrencyTextView tvAmount;
    @BindView(2131365248)
    TextView tvExpiry;
    @BindView(2131365372)
    TextView tvName;
    @BindView(2131365397)
    TextView tvNote;
    @BindView(2131365641)
    TextView tvTotal;
    @BindView(2131365648)
    TextView tvTransferNote;
    @BindView(2131365670)
    TextView tvWarning;
    private String valueOf;
    private String values;
    private int warmup;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BundleKey {
        public static final String CONFIRMATION_MODEL = "confirmationModel";
    }

    public int getLayout() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            return R.layout.activity_send_money_confirmation;
        }
        onCanceled oncanceled = new onCanceled(length, min, 32);
        onCancelLoad.setMax(-19359259, oncanceled);
        onCancelLoad.getMin(-19359259, oncanceled);
        return R.layout.activity_send_money_confirmation;
    }

    static /* synthetic */ void access$300(SendMoneyConfirmationActivity sendMoneyConfirmationActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(918096435, oncanceled);
            onCancelLoad.getMin(918096435, oncanceled);
        }
        Button button = sendMoneyConfirmationActivity.btnConfirm;
        if (button != null) {
            button.setVisibility(4);
        }
        LogoProgressView logoProgressView = sendMoneyConfirmationActivity.lpvLoading;
        if (logoProgressView != null) {
            logoProgressView.setVisibility(0);
            sendMoneyConfirmationActivity.lpvLoading.startRefresh();
        }
    }

    static /* synthetic */ void access$400(SendMoneyConfirmationActivity sendMoneyConfirmationActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1213587372, oncanceled);
            onCancelLoad.getMin(-1213587372, oncanceled);
        }
        LogoProgressView logoProgressView = sendMoneyConfirmationActivity.lpvLoading;
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
            sendMoneyConfirmationActivity.lpvLoading.setVisibility(8);
        }
        Button button = sendMoneyConfirmationActivity.btnConfirm;
        if (button != null) {
            button.setVisibility(0);
        }
    }

    public static Intent createConfirmationIntent(BaseActivity baseActivity, ConfirmationModel confirmationModel) {
        Intent intent = new Intent(baseActivity, SendMoneyConfirmationActivity.class);
        intent.putExtra(BundleKey.CONFIRMATION_MODEL, confirmationModel);
        return intent;
    }

    private boolean setMax() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-584405717, oncanceled);
            onCancelLoad.getMin(-584405717, oncanceled);
        }
        return this.mayLaunchUrl.equals(CalculatorActivity.StateAmount.BELOW);
    }

    private boolean getMax() {
        return this.getCause > 0;
    }

    private boolean length() {
        return ConfirmationType.Destination.LINK.equals(this.valueOf);
    }

    public void backToHomepage(@Nullable Bundle bundle) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1616073360, oncanceled);
            onCancelLoad.getMin(1616073360, oncanceled);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(IntentKeySource.TransactionKey.ON_TRANSACTION_SUCCESS, this.onPostMessage);
        super.backToHomepage(bundle2);
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_confirmation_title));
    }

    public void onClickLeftMenuButton(View view) {
        onBackPressed();
    }

    private void length(String str, String str2) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1856278505 == (max = dispatchOnCancelled.getMax(applicationContext, -1856278505)))) {
            onCanceled oncanceled = new onCanceled(-1856278505, max, 512);
            onCancelLoad.setMax(-1856278505, oncanceled);
            onCancelLoad.getMin(-1856278505, oncanceled);
        }
        this.tvWarning.setText(setH5MenuList.getMin(String.format(str, new Object[]{this.invoke}), str2));
    }

    /* access modifiers changed from: private */
    public void setMin() {
        length(getString(R.string.sendmoney_unregistered_user_warning), getString(R.string.sendmoney_unregistered_user));
        this.tvWarning.setCompoundDrawablesRelativeWithIntrinsicBounds(cancelAll.getMin(getBaseContext(), R.drawable.ic_warning_24), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private boolean getMin() {
        return ConfirmationType.Destination.BANK.equals(this.valueOf);
    }

    private boolean toFloatRange() {
        return ConfirmationType.Destination.OTC.equals(this.valueOf);
    }

    @DrawableRes
    public int getDescriptionIcon() {
        if (Institution.BCA_ONEKLIK.equals(this.onRelationshipValidationResult)) {
            return R.drawable.ic_oneklik;
        }
        return toIntRange() ? R.drawable.ic_logo_expresspay : R.drawable.ic_visamaster;
    }

    private boolean toIntRange() {
        return "DIRECT_DEBIT_DEBIT_CARD".equals(this.asBinder) || "DIRECT_DEBIT_CREDIT_CARD".equals(this.asBinder);
    }

    @OnClick({2131362062})
    public void confirmSendMoney() {
        String str;
        String str2;
        int length;
        int min;
        int length2;
        int max;
        int length3;
        Context baseContext = getBaseContext();
        String str3 = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        boolean z = false;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(38325361, oncanceled);
            onCancelLoad.getMin(38325361, oncanceled);
        }
        convertDipToPx sendMoneyConfirmEvent = new hasZero(this.getMin).getSendMoneyConfirmEvent(this);
        if (sendMoneyConfirmEvent != null) {
            List length4 = sendMoneyConfirmEvent.length != null ? sendMoneyConfirmEvent.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1021096653 == (max = dispatchOnCancelled.getMax(applicationContext2, -1021096653)))) {
            onCanceled oncanceled2 = new onCanceled(-1021096653, max, 512);
            onCancelLoad.setMax(-1021096653, oncanceled2);
            onCancelLoad.getMin(-1021096653, oncanceled2);
        }
        Blur.getMax min2 = new Blur.getMax(this).getMin(TrackerKey.PeopleProperty.LAST_TRANSACTION_TYPE, "Send Money");
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        BlurProcess.length(new Blur(min2.getMin(TrackerKey.PeopleProperty.LAST_TRANSACTION_DATE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", WheelView.OnWheelViewListener.getMax).format(new Date(new Date().getTime()))), (byte) 0).isInside());
        Blur.getMax min3 = new Blur.getMax(this).getMin(TrackerKey.PeopleProperty.FIRST_TRANSACTION_TYPE, "Send Money");
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        BlurProcess.setMin(new Blur(min3.getMin(TrackerKey.PeopleProperty.FIRST_TRANSACTION_DATE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", WheelView.OnWheelViewListener.getMax).format(new Date(new Date().getTime()))), (byte) 0).isInside());
        ConfirmationModel confirmationModel = this.getMin;
        if (!(confirmationModel == null || confirmationModel.receiveFile == null)) {
            ShareActivityModel shareActivityModel = this.getMin.receiveFile;
            if (shareActivityModel.setMax()) {
                this.shareToFeedPresenter.length();
            }
            this.shareToFeedPresenter.setMin(shareActivityModel.length());
        }
        String str4 = this.valueOf;
        char c = 65535;
        switch (str4.hashCode()) {
            case -1824055057:
                if (str4.equals(ConfirmationType.Destination.CONTACT)) {
                    c = 3;
                    break;
                }
                break;
            case -1762235539:
                if (str4.equals(ConfirmationType.Destination.OTC)) {
                    c = 2;
                    break;
                }
                break;
            case 1204868045:
                if (str4.equals(ConfirmationType.Destination.BANK)) {
                    c = 1;
                    break;
                }
                break;
            case 1205173643:
                if (str4.equals(ConfirmationType.Destination.LINK)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c != 0) {
            String str5 = "";
            if (c == 1) {
                BucketInfo.length length5 = new BucketInfo.length();
                length5.getMin = String.valueOf(this.toDoubleRange);
                length5.setMax = this.invokeSuspend;
                length5.getMax = this.onNavigationEvent;
                length5.toFloatRange = this.asBinder;
                length5.isInside = this.hashCode;
                length5.equals = this.onRelationshipValidationResult;
                length5.length = this.getMax;
                length5.setMin = this.setMax;
                length5.IsOverlapping = this.ICustomTabsCallback$Stub$Proxy;
                length5.toIntRange = this.ICustomTabsCallback;
                BeaconParser.BeaconLayoutException beaconLayoutException = new BeaconParser.BeaconLayoutException();
                beaconLayoutException.setBankAccountIndexNo(this.invokeSuspend);
                beaconLayoutException.setUserId(this.getMin.setDefaultImpl);
                length5.FastBitmap$CoordinateSystem = beaconLayoutException;
                length5.values = this.extraCommand;
                this.confirmationBankPresenter.setMin(length5.setMax(), this.extraCallback, this.isInside);
                RecentBankModel recentBankModel = new RecentBankModel();
                recentBankModel.Mean$Arithmetic = this.FastBitmap$CoordinateSystem;
                String str6 = this.toFloatRange;
                if (str6 != null) {
                    str5 = str6;
                }
                recentBankModel.equals = str5;
                recentBankModel.setMax = this.toFloatRange;
                recentBankModel.getMax = this.toIntRange;
                recentBankModel.Grayscale$Algorithm = this.toString;
                recentBankModel.getMin = this.create;
                recentBankModel.setMax(this.b);
                recentBankModel.toFloatRange = this.Grayscale$Algorithm;
                recentBankModel.IsOverlapping = this.setDefaultImpl;
                recentBankModel.isInside = this.getInterfaceDescriptor;
                recentBankModel.length = this.invokeSuspend;
                recentBankModel.hashCode = this.Mean$Arithmetic;
                recentBankModel.toString = this.extraCommand;
                this.confirmationBankPresenter.setMax(recentBankModel);
                this.confirmationBankPresenter.setMax("BANK_TRANSFER");
            } else if (c != 2) {
                this.toFloatRange = this.toFloatRange.replace("•", "*");
                PhotoPagerListener.V4.getMax getmax = new PhotoPagerListener.V4.getMax();
                getmax.getMax = isOriginHasAppInfo.getCleanAll(this.toDoubleRange.toString());
                getmax.length = this.values;
                getmax.toIntRange = this.FastBitmap$CoordinateSystem;
                int max2 = dispatchOnCancelled.getMax(0);
                if (max2 != 0) {
                    onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                    onCancelLoad.setMax(1558355001, oncanceled3);
                    onCancelLoad.getMin(1558355001, oncanceled3);
                }
                getmax.equals = (TextUtils.isEmpty(this.toFloatRange) || "-".equalsIgnoreCase(this.toFloatRange) || this.toFloatRange.contains("*")) ? null : this.toFloatRange;
                Context baseContext3 = getBaseContext();
                Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
                if (!(applicationContext3 == null || (length2 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
                    onCanceled oncanceled4 = new onCanceled(0, length2, 4);
                    onCancelLoad.setMax(1229084726, oncanceled4);
                    onCancelLoad.getMin(1229084726, oncanceled4);
                }
                Context baseContext4 = getBaseContext();
                Context applicationContext4 = baseContext4 != null ? baseContext4.getApplicationContext() : null;
                if (!(applicationContext4 == null || (length = applicationContext4.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext4, length)))) {
                    onCanceled oncanceled5 = new onCanceled(length, min, 32);
                    onCancelLoad.setMax(1229084726, oncanceled5);
                    onCancelLoad.getMin(1229084726, oncanceled5);
                }
                if (TextUtils.isEmpty(this.toFloatRange) || "-".equalsIgnoreCase(this.toFloatRange)) {
                    str = this.toIntRange;
                } else {
                    str = this.toFloatRange;
                }
                getmax.IsOverlapping = str;
                if (!TextUtils.isEmpty(this.toIntRange) && ((str2 = this.toIntRange) == null || !str2.contains("*"))) {
                    str3 = isOriginHasAppInfo.getClearPhoneNumber(this.toIntRange);
                }
                getmax.toFloatRange = str3;
                getmax.isInside = "userid".equals(this.ICustomTabsService) ? this.create : str5;
                getmax.getMin = this.onRelationshipValidationResult;
                getmax.setMax = this.hashCode;
                getmax.hashCode = false;
                getmax.setMin = this.asBinder;
                PhotoPagerListener.V4.getMax min4 = getmax.setMin(this.extraCallback);
                min4.FastBitmap$CoordinateSystem = this.onNavigationEvent;
                min4.values = this.ICustomTabsCallback;
                min4.toDoubleRange = this.ICustomTabsCallback$Stub$Proxy;
                min4.toString = this.newSession;
                ConfirmationModel confirmationModel2 = this.getMin;
                if (confirmationModel2 != null && confirmationModel2.setMax()) {
                    z = true;
                }
                min4.valueOf = z;
                this.confirmationPresenter.getMax(min4.length(), this.extraCallback, this.isInside);
                makeTakenPicturePath.setMax setmax = this.confirmationPresenter;
                String str7 = this.FastBitmap$CoordinateSystem;
                String str8 = this.toFloatRange;
                String str9 = this.toIntRange;
                if ("userid".equals(this.ICustomTabsService)) {
                    str5 = this.create;
                }
                setmax.setMax(str7, str8, str9, str5, this.invokeSuspend, this.warmup, this.postMessage);
            } else {
                this.confirmationPresenter.getMin(this.getMin, this.isInside);
            }
        } else {
            BucketInfo.length length6 = new BucketInfo.length();
            length6.getMin = String.valueOf(this.toDoubleRange);
            length6.getMax = this.onNavigationEvent;
            length6.toFloatRange = this.asBinder;
            length6.isInside = this.hashCode;
            length6.equals = this.onRelationshipValidationResult;
            length6.length = (getString(R.string.expiry_hour).equalsIgnoreCase(this.getMax) || getString(R.string.expiry_hours).equalsIgnoreCase(this.getMax)) ? "H" : (getString(R.string.expiry_day).equalsIgnoreCase(this.getMax) || getString(R.string.expiry_days).equalsIgnoreCase(this.getMax)) ? "D" : String.valueOf(this.getMax.charAt(0));
            length6.setMin = this.setMax;
            length6.IsOverlapping = this.ICustomTabsCallback$Stub$Proxy;
            length6.toIntRange = this.ICustomTabsCallback;
            this.confirmationBankPresenter.setMin(length6.setMax(), this.extraCallback, this.isInside);
            this.confirmationBankPresenter.setMax("LINK");
        }
    }

    private static String setMax(String str) {
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        return NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, new APImageDownloadRsp(str).setMin, "Rp");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init() {
        /*
            r17 = this;
            r0 = r17
            o.ParseContext$length r1 = new o.ParseContext$length
            r2 = 0
            r1.<init>(r2)
            o.PrepareException$1 r3 = r17.getApplicationComponent()
            r4 = 0
            if (r3 == 0) goto L_0x06be
            o.PrepareException$1 r3 = (o.PrepareException.AnonymousClass1) r3
            r1.getMin = r3
            id.dana.di.modules.SendMoneyConfirmationModule r3 = new id.dana.di.modules.SendMoneyConfirmationModule
            android.content.Context r5 = r17.getBaseContext()
            if (r5 == 0) goto L_0x0020
            android.content.Context r5 = r5.getApplicationContext()
            goto L_0x0021
        L_0x0020:
            r5 = r4
        L_0x0021:
            r6 = 32
            if (r5 == 0) goto L_0x003e
            java.lang.String[] r7 = r5.fileList()
            int r7 = r7.length
            int r5 = o.dispatchOnCancelled.getMin(r5, r7)
            if (r7 == r5) goto L_0x003e
            o.onCanceled r8 = new o.onCanceled
            r8.<init>(r7, r5, r6)
            r5 = -609234105(0xffffffffdbafd347, float:-9.8980846E16)
            o.onCancelLoad.setMax(r5, r8)
            o.onCancelLoad.getMin(r5, r8)
        L_0x003e:
            id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity$4 r5 = new id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity$4
            r5.<init>()
            id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity$5 r7 = new id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity$5
            r7.<init>()
            r3.<init>(r5, r7)
            id.dana.di.modules.SendMoneyConfirmationModule r3 = (id.dana.di.modules.SendMoneyConfirmationModule) r3
            r1.setMin = r3
            id.dana.social.contract.share.ShareToFeedsModule r3 = new id.dana.social.contract.share.ShareToFeedsModule
            id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity$1 r5 = new id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity$1
            r5.<init>()
            r3.<init>(r5)
            id.dana.social.contract.share.ShareToFeedsModule r3 = (id.dana.social.contract.share.ShareToFeedsModule) r3
            r1.setMax = r3
            id.dana.di.modules.SendMoneyConfirmationModule r3 = r1.setMin
            java.lang.Class<id.dana.di.modules.SendMoneyConfirmationModule> r5 = id.dana.di.modules.SendMoneyConfirmationModule.class
            o.stopIgnoring.setMin(r3, r5)
            id.dana.social.contract.share.ShareToFeedsModule r3 = r1.setMax
            java.lang.Class<id.dana.social.contract.share.ShareToFeedsModule> r5 = id.dana.social.contract.share.ShareToFeedsModule.class
            o.stopIgnoring.setMin(r3, r5)
            o.PrepareException$1 r3 = r1.getMin
            java.lang.Class<o.PrepareException$1> r5 = o.PrepareException.AnonymousClass1.class
            o.stopIgnoring.setMin(r3, r5)
            o.ParseContext r3 = new o.ParseContext
            id.dana.di.modules.SendMoneyConfirmationModule r5 = r1.setMin
            id.dana.social.contract.share.ShareToFeedsModule r7 = r1.setMax
            o.PrepareException$1 r1 = r1.getMin
            r3.<init>(r5, r7, r1, r2)
            r3.setMax(r0)
            r1 = 3
            o.onDelete$getMin[] r3 = new o.onDelete.getMin[r1]
            o.cutImageKeepRatio_new$getMax r5 = r0.confirmationBankPresenter
            r3[r2] = r5
            o.makeTakenPicturePath$setMax r5 = r0.confirmationPresenter
            r7 = 1
            r3[r7] = r5
            o.handleScrollChange$getMin r5 = r0.shareToFeedPresenter
            r8 = 2
            r3[r8] = r5
            r0.registerPresenter(r3)
            r3 = 2131231316(0x7f080254, float:1.807871E38)
            r0.setMenuLeftButton((int) r3)
            android.content.Context r3 = r17.getBaseContext()
            if (r3 == 0) goto L_0x00a5
            android.content.Context r3 = r3.getApplicationContext()
            goto L_0x00a6
        L_0x00a5:
            r3 = r4
        L_0x00a6:
            if (r3 == 0) goto L_0x00c1
            java.lang.String[] r5 = r3.fileList()
            int r5 = r5.length
            int r3 = o.dispatchOnCancelled.getMin(r3, r5)
            if (r5 == r3) goto L_0x00c1
            o.onCanceled r9 = new o.onCanceled
            r9.<init>(r5, r3, r6)
            r3 = 747198574(0x2c89586e, float:3.903592E-12)
            o.onCancelLoad.setMax(r3, r9)
            o.onCancelLoad.getMin(r3, r9)
        L_0x00c1:
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r5 = "confirmationModel"
            android.os.Parcelable r3 = r3.getParcelableExtra(r5)
            id.dana.sendmoney.model.ConfirmationModel r3 = (id.dana.sendmoney.model.ConfirmationModel) r3
            r0.getMin = r3
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x01f9
            java.lang.String r3 = r3.FastBitmap$CoordinateSystem
            r0.FastBitmap$CoordinateSystem = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.IsOverlapping
            r0.toFloatRange = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.equals
            r0.toIntRange = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            boolean r3 = r3.getMax()
            r0.IsOverlapping = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.invoke
            r0.valueOf = r3
            o.APImageDownloadRsp r3 = new o.APImageDownloadRsp
            id.dana.sendmoney.model.ConfirmationModel r9 = r0.getMin
            java.lang.String r9 = r9.hashCode
            r3.<init>((java.lang.String) r9)
            r0.toDoubleRange = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.valueOf
            r0.values = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.Grayscale$Algorithm
            r0.hashCode = r3
            o.APImageDownloadRsp r3 = new o.APImageDownloadRsp
            id.dana.sendmoney.model.ConfirmationModel r9 = r0.getMin
            java.lang.String r9 = r9.values
            r3.<init>((java.lang.String) r9)
            r0.equals = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.asInterface
            r0.asInterface = r3
            o.APImageDownloadRsp r3 = new o.APImageDownloadRsp
            id.dana.sendmoney.model.ConfirmationModel r9 = r0.getMin
            java.lang.String r9 = r9.onRelationshipValidationResult
            r3.<init>((java.lang.String) r9)
            r0.onMessageChannelReady = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.onTransact
            r0.ICustomTabsCallback$Stub = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.ICustomTabsCallback$Stub$Proxy
            r0.invokeSuspend = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.ICustomTabsCallback
            r0.create = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.create
            r0.b = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.ICustomTabsService
            r0.setDefaultImpl = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.ICustomTabsCallback$Stub
            r0.asBinder = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.invokeSuspend
            r0.Grayscale$Algorithm = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.Mean$Arithmetic
            r0.Mean$Arithmetic = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.extraCallbackWithResult
            r0.extraCallbackWithResult = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.getInterfaceDescriptor
            r0.getInterfaceDescriptor = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.getCause
            r0.onNavigationEvent = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.toIntRange
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 == 0) goto L_0x0171
            r3 = r5
        L_0x0171:
            r0.setMax = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.toFloatRange
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 == 0) goto L_0x017e
            r3 = r5
        L_0x017e:
            r0.getMax = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.getMin()
            java.lang.String r3 = r3.trim()
            r0.invoke = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.asBinder
            r0.ICustomTabsCallback$Default = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.onPostMessage
            r0.extraCallback = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.getDefaultImpl
            r0.ICustomTabsService = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.toString
            r0.toString = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.onMessageChannelReady
            r0.onRelationshipValidationResult = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            int r3 = r3.ICustomTabsCallback$Default
            r0.onTransact = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.warmup
            r0.isInside = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            int r3 = r3.extraCommand
            r0.getCause = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.mayLaunchUrl
            r0.ICustomTabsCallback = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.newSessionWithExtras
            r0.ICustomTabsCallback$Stub$Proxy = r3
            o.APImageDownloadRsp r3 = new o.APImageDownloadRsp
            id.dana.sendmoney.model.ConfirmationModel r9 = r0.getMin
            java.lang.String r9 = r9.newSession
            r3.<init>((java.lang.String) r9)
            r0.getDefaultImpl = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.validateRelationship
            r0.newSession = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.updateVisuals
            r0.mayLaunchUrl = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.IPostMessageService
            r0.newSessionWithExtras = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            java.lang.String r3 = r3.ICustomTabsService$Default
            r0.extraCommand = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            int r3 = r3.ICustomTabsService$Stub$Proxy
            r0.warmup = r3
            id.dana.sendmoney.model.ConfirmationModel r3 = r0.getMin
            boolean r3 = r3.length()
            r0.postMessage = r3
        L_0x01f9:
            android.content.Context r3 = r17.getBaseContext()
            if (r3 == 0) goto L_0x0204
            android.content.Context r3 = r3.getApplicationContext()
            goto L_0x0205
        L_0x0204:
            r3 = r4
        L_0x0205:
            r9 = 512(0x200, float:7.175E-43)
            r10 = 1780175205(0x6a1b5165, float:4.694197E25)
            if (r3 == 0) goto L_0x021d
            int r3 = o.dispatchOnCancelled.getMax(r3, r10)
            if (r10 == r3) goto L_0x021d
            o.onCanceled r11 = new o.onCanceled
            r11.<init>(r10, r3, r9)
            o.onCancelLoad.setMax(r10, r11)
            o.onCancelLoad.getMin(r10, r11)
        L_0x021d:
            int r3 = o.dispatchOnCancelled.getMax(r2)
            r11 = 16
            if (r3 == 0) goto L_0x0230
            o.onCanceled r12 = new o.onCanceled
            r12.<init>(r2, r3, r11)
            o.onCancelLoad.setMax(r10, r12)
            o.onCancelLoad.getMin(r10, r12)
        L_0x0230:
            int r3 = o.dispatchOnCancelled.getMax(r2)
            if (r3 == 0) goto L_0x0244
            o.onCanceled r10 = new o.onCanceled
            r10.<init>(r2, r3, r11)
            r3 = -1927577360(0xffffffff8d1b80f0, float:-4.7918265E-31)
            o.onCancelLoad.setMax(r3, r10)
            o.onCancelLoad.getMin(r3, r10)
        L_0x0244:
            java.lang.String r3 = r0.asInterface
            r12 = 4
            if (r3 == 0) goto L_0x030c
            int r13 = r3.hashCode()
            r14 = 1729402805(0x671497b5, float:7.0170874E23)
            if (r13 == r14) goto L_0x0262
            r14 = 1729462377(0x67158069, float:7.0600136E23)
            if (r13 == r14) goto L_0x0258
            goto L_0x026c
        L_0x0258:
            java.lang.String r13 = "origin_dana"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x026c
            r3 = 1
            goto L_0x026d
        L_0x0262:
            java.lang.String r13 = "origin_bank"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x026c
            r3 = 0
            goto L_0x026d
        L_0x026c:
            r3 = -1
        L_0x026d:
            if (r3 == 0) goto L_0x02a8
            o.APImageDownloadRsp r3 = r0.onMessageChannelReady
            if (r3 == 0) goto L_0x028d
            java.util.Locale r13 = o.WheelView.OnWheelViewListener.getMax
            if (r13 != 0) goto L_0x0282
            java.util.Locale r13 = new java.util.Locale
            java.lang.String r14 = "in"
            java.lang.String r15 = "ID"
            r13.<init>(r14, r15)
            o.WheelView.OnWheelViewListener.getMax = r13
        L_0x0282:
            java.util.Locale r13 = o.WheelView.OnWheelViewListener.getMax
            long r14 = r3.setMin
            java.lang.String r3 = "Rp"
            java.lang.String r3 = o.NebulaLoadingView.AnonymousClass1.getMin((java.util.Locale) r13, (long) r14, (java.lang.String) r3)
            goto L_0x028e
        L_0x028d:
            r3 = r5
        L_0x028e:
            id.dana.richview.SelectedAccountView r13 = r0.originView
            r14 = 2131886741(0x7f120295, float:1.940807E38)
            java.lang.String r14 = r0.getString(r14)
            r13.setHeader(r14)
            id.dana.richview.SelectedAccountView r13 = r0.originView
            r13.setBody(r3)
            id.dana.richview.SelectedAccountView r3 = r0.originView
            r13 = 2131231845(0x7f080465, float:1.8079783E38)
            r3.setImage((int) r13)
            goto L_0x030c
        L_0x02a8:
            id.dana.richview.SelectedAccountView r3 = r0.originView
            java.lang.String r13 = r0.extraCallbackWithResult
            r3.setHeader(r13)
            id.dana.richview.SelectedAccountView r3 = r0.originView
            java.lang.String r13 = r0.ICustomTabsCallback$Stub
            r3.setImage((java.lang.String) r13)
            int r3 = r0.onTransact
            android.content.Context r13 = r17.getBaseContext()
            if (r13 == 0) goto L_0x02c3
            android.content.Context r13 = r13.getApplicationContext()
            goto L_0x02c4
        L_0x02c3:
            r13 = r4
        L_0x02c4:
            if (r13 == 0) goto L_0x02df
            java.lang.String[] r14 = r13.fileList()
            int r14 = r14.length
            int r13 = o.dispatchOnCancelled.getMin(r13, r14)
            if (r14 == r13) goto L_0x02df
            o.onCanceled r15 = new o.onCanceled
            r15.<init>(r14, r13, r6)
            r13 = -646215665(0xffffffffd97b880f, float:-4.42498857E15)
            o.onCancelLoad.setMax(r13, r15)
            o.onCancelLoad.getMin(r13, r15)
        L_0x02df:
            if (r3 == 0) goto L_0x0301
            if (r3 == r8) goto L_0x02f2
            if (r3 == r1) goto L_0x0301
            if (r3 == r12) goto L_0x0301
            r13 = 5
            if (r3 == r13) goto L_0x02f2
            id.dana.richview.SelectedAccountView r3 = r0.originView
            java.lang.String r13 = r0.ICustomTabsCallback$Default
            r3.setBody(r13)
            goto L_0x030c
        L_0x02f2:
            id.dana.richview.SelectedAccountView r3 = r0.originView
            java.lang.String r13 = r0.ICustomTabsCallback$Default
            r14 = 2131886776(0x7f1202b8, float:1.940814E38)
            java.lang.String r14 = r0.getString(r14)
            r3.setBody((java.lang.String) r13, (java.lang.String) r14)
            goto L_0x030c
        L_0x0301:
            id.dana.richview.SelectedAccountView r3 = r0.originView
            java.lang.String r13 = r0.ICustomTabsCallback$Default
            int r14 = r17.getDescriptionIcon()
            r3.setBody((java.lang.String) r13, (int) r14)
        L_0x030c:
            android.content.Context r3 = r17.getBaseContext()
            if (r3 == 0) goto L_0x0317
            android.content.Context r3 = r3.getApplicationContext()
            goto L_0x0318
        L_0x0317:
            r3 = r4
        L_0x0318:
            if (r3 == 0) goto L_0x032e
            int r3 = o.dispatchOnCancelled.length(r3, r2)
            if (r3 == 0) goto L_0x032e
            o.onCanceled r13 = new o.onCanceled
            r13.<init>(r2, r3, r12)
            r3 = -1090296373(0xffffffffbf0365cb, float:-0.513272)
            o.onCancelLoad.setMax(r3, r13)
            o.onCancelLoad.getMin(r3, r13)
        L_0x032e:
            java.lang.String r3 = r0.valueOf
            int r13 = r3.hashCode()
            java.lang.String r14 = "destination_link"
            java.lang.String r15 = "destination_bank"
            java.lang.String r1 = "destination_otc"
            java.lang.String r10 = "destination_contact"
            switch(r13) {
                case -1824055057: goto L_0x0358;
                case -1762235539: goto L_0x0350;
                case 1204868045: goto L_0x0348;
                case 1205173643: goto L_0x0340;
                default: goto L_0x033f;
            }
        L_0x033f:
            goto L_0x0360
        L_0x0340:
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x0360
            r3 = 0
            goto L_0x0361
        L_0x0348:
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0360
            r3 = 2
            goto L_0x0361
        L_0x0350:
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0360
            r3 = 1
            goto L_0x0361
        L_0x0358:
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0360
            r3 = 3
            goto L_0x0361
        L_0x0360:
            r3 = -1
        L_0x0361:
            if (r3 == 0) goto L_0x0379
            if (r3 == r7) goto L_0x0376
            if (r3 == r8) goto L_0x0376
            boolean r3 = r0.IsOverlapping
            if (r3 == 0) goto L_0x036e
            java.lang.String r3 = r0.toFloatRange
            goto L_0x0380
        L_0x036e:
            r3 = 2131889295(0x7f120c8f, float:1.941325E38)
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0380
        L_0x0376:
            java.lang.String r3 = r0.toFloatRange
            goto L_0x0380
        L_0x0379:
            r3 = 2131886647(0x7f120237, float:1.9407879E38)
            java.lang.String r3 = r0.getString(r3)
        L_0x0380:
            android.widget.TextView r13 = r0.tvName
            r13.setText(r3)
            android.content.Context r3 = r17.getBaseContext()
            if (r3 == 0) goto L_0x0390
            android.content.Context r3 = r3.getApplicationContext()
            goto L_0x0391
        L_0x0390:
            r3 = r4
        L_0x0391:
            if (r3 == 0) goto L_0x03a7
            int r3 = o.dispatchOnCancelled.length(r3, r2)
            if (r3 == 0) goto L_0x03a7
            o.onCanceled r13 = new o.onCanceled
            r13.<init>(r2, r3, r12)
            r3 = 572223826(0x221b7152, float:2.1066408E-18)
            o.onCancelLoad.setMax(r3, r13)
            o.onCancelLoad.getMin(r3, r13)
        L_0x03a7:
            java.lang.String r3 = r0.Mean$Arithmetic
            if (r3 != 0) goto L_0x03ad
            java.lang.String r3 = r0.toIntRange
        L_0x03ad:
            boolean r13 = r17.getMin()
            if (r13 == 0) goto L_0x03f0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r13 = r0.b
            r3.append(r13)
            java.lang.String r13 = " | "
            r3.append(r13)
            java.lang.String r13 = r0.toIntRange
            boolean r16 = android.text.TextUtils.isEmpty(r13)
            if (r16 != 0) goto L_0x03d0
            java.lang.String r8 = " "
            java.lang.String r13 = r13.replace(r8, r5)
        L_0x03d0:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            int r8 = r13.length()
            if (r8 < r12) goto L_0x03e1
            int r8 = r13.length()
            int r8 = r8 - r12
            java.lang.String r13 = r13.substring(r8)
        L_0x03e1:
            r5[r2] = r13
            java.lang.String r8 = "•••• %s"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
        L_0x03f0:
            android.widget.TextView r5 = r0.tvAccountNumber
            r5.setText(r3)
            int r3 = o.dispatchOnCancelled.getMax(r2)
            if (r3 == 0) goto L_0x0409
            o.onCanceled r5 = new o.onCanceled
            r5.<init>(r2, r3, r11)
            r3 = 951405694(0x38b54c7e, float:8.645E-5)
            o.onCancelLoad.setMax(r3, r5)
            o.onCancelLoad.getMin(r3, r5)
        L_0x0409:
            id.dana.richview.CurrencyTextView r3 = r0.tvAmount
            o.APImageDownloadRsp r5 = r0.toDoubleRange
            java.lang.String r5 = r5.toString()
            r3.setText(r5)
            java.lang.String r3 = r0.valueOf
            int r5 = r3.hashCode()
            r8 = -1824055057(0xffffffff934720ef, float:-2.5133569E-27)
            if (r5 == r8) goto L_0x043a
            r8 = 1204868045(0x47d0d3cd, float:106919.6)
            if (r5 == r8) goto L_0x0432
            r8 = 1205173643(0x47d57d8b, float:109307.086)
            if (r5 == r8) goto L_0x042a
            goto L_0x0442
        L_0x042a:
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x0442
            r8 = 0
            goto L_0x0443
        L_0x0432:
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0442
            r8 = 2
            goto L_0x0443
        L_0x043a:
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0442
            r8 = 1
            goto L_0x0443
        L_0x0442:
            r8 = -1
        L_0x0443:
            if (r8 == 0) goto L_0x0457
            if (r8 == r7) goto L_0x044b
            r3 = 2131231764(0x7f080414, float:1.8079618E38)
            goto L_0x045a
        L_0x044b:
            boolean r3 = r0.IsOverlapping
            if (r3 == 0) goto L_0x0453
            r3 = 2131231829(0x7f080455, float:1.807975E38)
            goto L_0x045a
        L_0x0453:
            r3 = 2131232151(0x7f080597, float:1.8080403E38)
            goto L_0x045a
        L_0x0457:
            r3 = 2131232285(0x7f08061d, float:1.8080675E38)
        L_0x045a:
            o.setHorizontalGap r5 = com.bumptech.glide.Glide.setMin((androidx.fragment.app.FragmentActivity) r17)
            o.updateCornerMarking r5 = (o.updateCornerMarking) r5
            java.lang.String r8 = r0.valueOf
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0470
            r1 = 2131232174(0x7f0805ae, float:1.808045E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0486
        L_0x0470:
            java.lang.String r1 = r0.valueOf
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0484
            boolean r1 = r0.IsOverlapping
            if (r1 != 0) goto L_0x0484
            r1 = 2131232151(0x7f080597, float:1.8080403E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0486
        L_0x0484:
            java.lang.String r1 = r0.FastBitmap$CoordinateSystem
        L_0x0486:
            o.updateMessageMenuItem r1 = r5.getMin((java.lang.Object) r1)
            o.dispatchApplyWindowInsetsToBehaviors r5 = o.isLineVisible.getMax()
            o.updateMessageMenuItem r1 = r1.setMax((o.getTopSortedChildren<?>) r5)
            o.updateMessageMenuItem r1 = r1.setMax((int) r3)
            o.updateMessageMenuItem r1 = r1.setMin((int) r3)
            android.widget.ImageView r3 = r0.ivProfile
            r1.length((android.widget.ImageView) r3)
            boolean r1 = r17.getMin()
            r3 = 8
            if (r1 == 0) goto L_0x04ad
            android.view.View r1 = r0.notesView
            r1.setVisibility(r3)
            goto L_0x04c6
        L_0x04ad:
            java.lang.String r1 = r0.hashCode
            if (r1 == 0) goto L_0x04bf
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04bf
            android.widget.TextView r1 = r0.tvNote
            java.lang.String r5 = r0.hashCode
            r1.setText(r5)
            goto L_0x04c6
        L_0x04bf:
            android.widget.TextView r1 = r0.tvNote
            java.lang.String r5 = "-"
            r1.setText(r5)
        L_0x04c6:
            boolean r1 = r17.toFloatRange()
            if (r1 == 0) goto L_0x04e9
            int r1 = r0.getCause
            if (r1 != 0) goto L_0x04dc
            id.dana.richview.CurrencyTextView r1 = r0.tvAdditional
            o.APImageDownloadRsp r5 = r0.equals
            java.lang.String r5 = r5.toString()
            r1.setText(r5)
            goto L_0x0518
        L_0x04dc:
            id.dana.richview.CurrencyTextView r1 = r0.tvAdditional
            r5 = 2131888772(0x7f120a84, float:1.9412189E38)
            java.lang.String r5 = r0.getString(r5)
            r1.setText(r5)
            goto L_0x0518
        L_0x04e9:
            boolean r1 = r17.getMin()
            if (r1 == 0) goto L_0x0513
            int r1 = r0.getCause
            if (r1 == 0) goto L_0x0507
            boolean r1 = r17.setMax()
            if (r1 == 0) goto L_0x04fa
            goto L_0x0507
        L_0x04fa:
            id.dana.richview.CurrencyTextView r1 = r0.tvAdditional
            r5 = 2131888772(0x7f120a84, float:1.9412189E38)
            java.lang.String r5 = r0.getString(r5)
            r1.setText(r5)
            goto L_0x0518
        L_0x0507:
            id.dana.richview.CurrencyTextView r1 = r0.tvAdditional
            o.APImageDownloadRsp r5 = r0.equals
            java.lang.String r5 = r5.toString()
            r1.setText(r5)
            goto L_0x0518
        L_0x0513:
            android.widget.LinearLayout r1 = r0.llAdditionalFee
            r1.setVisibility(r3)
        L_0x0518:
            boolean r1 = r17.length()
            if (r1 != 0) goto L_0x0524
            boolean r1 = r17.toFloatRange()
            if (r1 == 0) goto L_0x0530
        L_0x0524:
            android.widget.TextView r1 = r0.tvExpiry
            java.lang.String r5 = r0.invoke
            r1.setText(r5)
            android.view.View r1 = r0.expiryTimeView
            r1.setVisibility(r2)
        L_0x0530:
            boolean r1 = r17.length()
            if (r1 != 0) goto L_0x0545
            boolean r1 = r17.toFloatRange()
            if (r1 == 0) goto L_0x053d
            goto L_0x0545
        L_0x053d:
            boolean r1 = r0.IsOverlapping
            if (r1 != 0) goto L_0x0551
            r17.setMin()
            goto L_0x0551
        L_0x0545:
            r1 = 2131888818(0x7f120ab2, float:1.9412282E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r5 = r0.invoke
            r0.length(r1, r5)
        L_0x0551:
            boolean r1 = r0.IsOverlapping
            if (r1 == 0) goto L_0x0564
            boolean r1 = r17.length()
            if (r1 != 0) goto L_0x0564
            boolean r1 = r17.toFloatRange()
            if (r1 == 0) goto L_0x0562
            goto L_0x0564
        L_0x0562:
            r1 = 0
            goto L_0x0565
        L_0x0564:
            r1 = 1
        L_0x0565:
            android.content.Context r5 = r17.getBaseContext()
            if (r5 == 0) goto L_0x0570
            android.content.Context r5 = r5.getApplicationContext()
            goto L_0x0571
        L_0x0570:
            r5 = r4
        L_0x0571:
            if (r5 == 0) goto L_0x0587
            r8 = 1737765997(0x6794346d, float:1.3997546E24)
            int r5 = o.dispatchOnCancelled.getMax(r5, r8)
            if (r8 == r5) goto L_0x0587
            o.onCanceled r10 = new o.onCanceled
            r10.<init>(r8, r5, r9)
            o.onCancelLoad.setMax(r8, r10)
            o.onCancelLoad.getMin(r8, r10)
        L_0x0587:
            android.widget.TextView r5 = r0.tvWarning
            if (r1 == 0) goto L_0x058d
            r1 = 0
            goto L_0x058f
        L_0x058d:
            r1 = 8
        L_0x058f:
            r5.setVisibility(r1)
            android.widget.Button r1 = r0.btnConfirm
            r1.setEnabled(r7)
            java.lang.String r1 = r0.newSessionWithExtras
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0618
            boolean r1 = r17.getMin()
            if (r1 == 0) goto L_0x05b3
            boolean r1 = r17.getMax()
            if (r1 == 0) goto L_0x05b3
            boolean r1 = r17.setMax()
            if (r1 == 0) goto L_0x05b3
            r1 = 1
            goto L_0x05b4
        L_0x05b3:
            r1 = 0
        L_0x05b4:
            android.widget.TextView r5 = r0.tvTransferNote
            if (r1 == 0) goto L_0x05b9
            r3 = 0
        L_0x05b9:
            r5.setVisibility(r3)
            r1 = 2131889404(0x7f120cfc, float:1.941347E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r5 = r0.newSessionWithExtras
            java.lang.String r5 = setMax(r5)
            r3[r2] = r5
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r3 = 2131889404(0x7f120cfc, float:1.941347E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r8 = r0.newSessionWithExtras
            java.lang.String r8 = setMax(r8)
            r5[r2] = r8
            java.lang.String r3 = java.lang.String.format(r3, r5)
            o.setH5ShowOptionMenuFlag r5 = new o.setH5ShowOptionMenuFlag
            r5.<init>()
            r5.getMin = r1
            r5.setMax = r3
            o.setH5ShowOptionMenuFlag r3 = r5.getMax()
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r1)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r2)
            int r8 = r3.getMax
            int r9 = r3.getMax
            java.lang.String r3 = r3.setMax
            int r3 = r3.length()
            int r9 = r9 + r3
            r5.setSpan(r1, r8, r9, r2)
            android.widget.TextView r1 = r0.tvTransferNote
            r1.setText(r5)
            android.widget.TextView r1 = r0.tvTransferNote
            r3 = 2131231914(0x7f0804aa, float:1.8079922E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r3, r2, r2, r2)
        L_0x0618:
            java.lang.String r1 = r0.ICustomTabsCallback$Stub$Proxy
            if (r1 == 0) goto L_0x0621
            o.APImageDownloadRsp r1 = r0.getDefaultImpl
            if (r1 == 0) goto L_0x0621
            goto L_0x0622
        L_0x0621:
            r1 = r4
        L_0x0622:
            android.content.Context r3 = r17.getBaseContext()
            if (r3 == 0) goto L_0x062c
            android.content.Context r4 = r3.getApplicationContext()
        L_0x062c:
            if (r4 == 0) goto L_0x0647
            java.lang.String[] r3 = r4.fileList()
            int r3 = r3.length
            int r4 = o.dispatchOnCancelled.getMin(r4, r3)
            if (r3 == r4) goto L_0x0647
            o.onCanceled r5 = new o.onCanceled
            r5.<init>(r3, r4, r6)
            r3 = -908097435(0xffffffffc9df8865, float:-1831180.6)
            o.onCancelLoad.setMax(r3, r5)
            o.onCancelLoad.getMin(r3, r5)
        L_0x0647:
            o.APImageDownloadRsp r3 = r0.toDoubleRange
            long r3 = r3.setMin
            r5 = 0
            if (r1 == 0) goto L_0x0658
            long r8 = r1.setMin
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0658
            long r8 = r1.setMin
            long r3 = r3 - r8
        L_0x0658:
            int r8 = r0.getCause
            if (r8 == 0) goto L_0x0662
            boolean r8 = r17.setMax()
            if (r8 == 0) goto L_0x0667
        L_0x0662:
            o.APImageDownloadRsp r8 = r0.equals
            long r8 = r8.setMin
            long r3 = r3 + r8
        L_0x0667:
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x066c
            r3 = r5
        L_0x066c:
            o.APImageDownloadRsp r8 = new o.APImageDownloadRsp
            r8.<init>((long) r3)
            long r3 = r8.setMin
            id.dana.sendmoney.model.ConfirmationModel r8 = r0.getMin
            if (r8 == 0) goto L_0x067a
            int r9 = (int) r3
            r8.length = r9
        L_0x067a:
            android.widget.TextView r8 = r0.tvTotal
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.setText(r3)
            if (r1 == 0) goto L_0x069e
            long r3 = r1.setMin
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x069e
            id.dana.richview.CurrencyTextView r3 = r0.ctvVoucher
            r3.setMinus(r7)
            id.dana.richview.CurrencyTextView r3 = r0.ctvVoucher
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
            android.widget.LinearLayout r1 = r0.llVoucher
            r1.setVisibility(r2)
        L_0x069e:
            boolean r1 = r17.length()
            if (r1 != 0) goto L_0x06af
            boolean r1 = r17.toFloatRange()
            if (r1 != 0) goto L_0x06af
            o.makeTakenPicturePath$setMax r1 = r0.confirmationPresenter
            r1.getMax()
        L_0x06af:
            o.hasZero r1 = new o.hasZero
            id.dana.sendmoney.model.ConfirmationModel r2 = r0.getMin
            r1.<init>(r2)
            o.convertDipToPx r1 = r1.getSendMoneyCreateEvent(r0)
            o.genTextSelector.getMax(r1)
            return
        L_0x06be:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity.init():void");
    }
}
