package id.dana.sendmoney.contact.all;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import butterknife.BindView;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.ReferralTrackerModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.referral.model.MyReferralConsult;
import id.dana.referral.view.ReferralPopupDialog;
import id.dana.sendmoney.BaseRecipientActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.view.RecipientView;
import java.util.List;
import javax.inject.Inject;
import o.APWebSettings;
import o.ConstraintProxy$StorageNotLowProxy;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.PhotoItem;
import o.PrepareException;
import o.RVResourcePresetProxy;
import o.dispatchOnCancelled;
import o.enqueueWorkRequests;
import o.getCurrentDateFormat;
import o.getLastUpdateTime;
import o.handlePerformanceLog;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.postWebMessage;
import o.queryWorkInfo;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;

public class ContactActivity extends BaseRecipientActivity {
    public static final int ALL_BANK_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public String IsOverlapping;
    getLastUpdateTime contactActivityComponent;
    /* access modifiers changed from: private */
    public String getMax;
    /* access modifiers changed from: private */
    public boolean getMin;
    @BindView(2131365938)
    RecipientView recipientList;
    @Inject
    public enqueueWorkRequests.length recipientPresenter;
    @Inject
    public ConstraintProxy$StorageNotLowProxy.setMin referralTrackerPresenter;
    private ReferralPopupDialog setMax;

    static /* synthetic */ void access$300(ContactActivity contactActivity, CurrencyAmountModel currencyAmountModel) {
        int max;
        Context baseContext = contactActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 683769964 == (max = dispatchOnCancelled.getMax(applicationContext, 683769964)))) {
            onCanceled oncanceled = new onCanceled(683769964, max, 512);
            onCancelLoad.setMax(683769964, oncanceled);
            onCancelLoad.getMin(683769964, oncanceled);
        }
        ReferralPopupDialog.length length = new ReferralPopupDialog.length(contactActivity);
        length.getMax = contactActivity.getString(R.string.referral_popup_title);
        length.getMin = String.format(contactActivity.getString(R.string.referral_popup_description), new Object[]{currencyAmountModel.setMax()});
        length.length = contactActivity.getString(R.string.referral_checkbox_description);
        length.toFloatRange = new ReferralPopupDialog.getMax() {
            public final void getMax(boolean z) {
                boolean unused = ContactActivity.this.getMin = z;
            }

            public final void getMax() {
                ContactActivity.this.disableClick();
                ContactActivity.access$500(ContactActivity.this);
                ContactActivity.access$600(ContactActivity.this);
            }

            public final void setMin() {
                ContactActivity.access$500(ContactActivity.this);
            }
        };
        ReferralPopupDialog referralPopupDialog = new ReferralPopupDialog(length.setMax, length.setMin, length, (byte) 0);
        contactActivity.setMax = referralPopupDialog;
        referralPopupDialog.setMin();
    }

    static /* synthetic */ void access$500(ContactActivity contactActivity) {
        int length;
        int min;
        Context baseContext = contactActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(449384007, oncanceled);
            onCancelLoad.getMin(449384007, oncanceled);
        }
        if (contactActivity.getMin) {
            contactActivity.referralTrackerPresenter.getMin(contactActivity.getMax);
        }
        contactActivity.setMax.setMax();
    }

    static /* synthetic */ void access$600(ContactActivity contactActivity) {
        int length;
        int min;
        Context baseContext = contactActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(174796728, oncanceled);
            onCancelLoad.getMin(174796728, oncanceled);
        }
        DanaH5.startContainerFullUrl(isShowMenu.setMin(contactActivity.IsOverlapping));
    }

    public static Intent createTransferIntent(Context context, QrTransferModel qrTransferModel, String str) {
        Intent intent = new Intent(context, ContactActivity.class);
        intent.putExtra("scanner_data", qrTransferModel);
        intent.putExtra("transactionType", str);
        return intent;
    }

    public void init() {
        super.init();
        if (this.contactActivityComponent == null) {
            RVResourcePresetProxy.setMax min = RVResourcePresetProxy.setMin();
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                min.getMin = applicationComponent;
                min.setMin = new RecipientActivityModule(new queryWorkInfo(this) {
                    public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
                        boolean unused = ContactActivity.this.belowKitkatDialog = z;
                    }

                    public final void onFinishCheckReferralSendMoney(boolean z, @NotNull String str) {
                        if (z) {
                            String unused = ContactActivity.this.IsOverlapping = str;
                            ContactActivity.this.referralTrackerPresenter.getMax();
                            ContactActivity.this.recipientList.enableInvite();
                        }
                    }
                });
                min.getMax = new ReferralTrackerModule(new ConstraintProxy$StorageNotLowProxy.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void onCheckRegisteredUser(boolean z, String str) {
                    }

                    public final void onError(String str) {
                    }

                    public final void onGetContactSyncFeature(boolean z) {
                    }

                    public final void onGetDeeplinkReferralSuccess(APWebSettings aPWebSettings) {
                    }

                    public final void onGetMessageTemplateError() {
                    }

                    public final void onGetMessageTemplateSuccess(postWebMessage postwebmessage) {
                    }

                    public final void onGetReferralConsultSuccess(MyReferralConsult myReferralConsult) {
                    }

                    public final void setReferralWidgetFeatureValue(List<handlePerformanceLog> list) {
                    }

                    public final void showProgress() {
                    }

                    public final void onFinishCheckLatestReferralCampaign(MyReferralConsult myReferralConsult) {
                        String unused = ContactActivity.this.getMax = myReferralConsult.setMin.length;
                        ContactActivity.access$300(ContactActivity.this, myReferralConsult.setMin.getMin);
                    }
                });
                stopIgnoring.setMin(min.setMin, RecipientActivityModule.class);
                stopIgnoring.setMin(min.getMax, ReferralTrackerModule.class);
                stopIgnoring.setMin(min.getMin, PrepareException.AnonymousClass1.class);
                this.contactActivityComponent = new RVResourcePresetProxy(min.setMin, min.getMax, min.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.contactActivityComponent.setMin(this);
        registerPresenter(this.recipientPresenter, this.referralTrackerPresenter);
        this.recipientList.setRecipientContactType(2);
        this.recipientList.setRecipientViewTitle(getString(R.string.send_to_phone_number_title));
        this.recipientList.setListener((PhotoItem) new PhotoItem() {
            public final void getMax() {
            }

            public final void onRecipientSelected(RecipientModel recipientModel) {
                if (ContactActivity.this.isClickable()) {
                    ContactActivity.this.processRecipientListData(recipientModel);
                    ContactActivity.this.openCalculatorPage(recipientModel);
                }
            }
        });
        this.recipientList.setListener((RecipientView.getMax) new getCurrentDateFormat(this));
        setData(getIntent().getExtras());
        this.recipientPresenter.getMax();
        this.recipientPresenter.getMin();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int length;
        int min;
        int max;
        int max2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -478717944 == (max2 = dispatchOnCancelled.getMax(applicationContext, -478717944)))) {
            onCanceled oncanceled = new onCanceled(-478717944, max2, 512);
            onCancelLoad.setMax(-478717944, oncanceled);
            onCancelLoad.getMin(-478717944, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (max = dispatchOnCancelled.getMax(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-478717944, oncanceled2);
            onCancelLoad.getMin(-478717944, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-478717944, oncanceled3);
            onCancelLoad.getMin(-478717944, oncanceled3);
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == ALL_BANK_REQUEST_CODE) {
                openCalculatorPage((RecipientModel) intent.getParcelableExtra("data"));
            } else if (i == DecodeWrapper.AnonymousClass2.length) {
                setData(intent.getExtras());
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        int length;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-389017011, oncanceled);
            onCancelLoad.getMin(-389017011, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-389017011, oncanceled2);
            onCancelLoad.getMin(-389017011, oncanceled2);
        }
        this.recipientList.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-679776626, oncanceled);
            onCancelLoad.getMin(-679776626, oncanceled);
        }
        super.onResume();
        this.recipientList.initRecipientView();
    }

    public static /* synthetic */ void length(ContactActivity contactActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(212975142, oncanceled);
            onCancelLoad.getMin(212975142, oncanceled);
        }
        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
        sb.append(contactActivity.getClass().getName());
        sb.append(":init");
        updateActionSheetContent.d(DanaLogConstants.TAG.SYNC_CONTACT_TAG, sb.toString());
        contactActivity.recipientList.checkContactSyncState();
    }
}
