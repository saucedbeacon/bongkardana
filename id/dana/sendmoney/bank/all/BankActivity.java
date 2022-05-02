package id.dana.sendmoney.bank.all;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import butterknife.BindView;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.sendmoney.BaseRecipientActivity;
import id.dana.sendmoney.model.QrRequestBankTransferModel;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney.view.RecipientView;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ConstraintTrackingWorker;
import o.IWorkManagerImplCallback;
import o.PhotoItem;
import o.PhotoSelectListener;
import o.PrepareException;
import o.StepType;
import o.dispatchOnCancelled;
import o.enqueueWorkRequests;
import o.getChildrenSkipCount;
import o.getConfigVariable;
import o.getCurrX;
import o.getDeployVersion;
import o.getExtraDataParsers;
import o.getPriority;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.queryWorkInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BankActivity extends BaseRecipientActivity {
    StepType bankActivityComponent;
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    @Inject
    public enqueueWorkRequests.length recipientPresenter;
    @BindView(2131365938)
    RecipientView recipientView;
    /* access modifiers changed from: private */
    public QrTransferModel setMax;

    public int getLayout() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_recipient;
        }
        onCanceled oncanceled = new onCanceled(0, length, 4);
        onCancelLoad.setMax(2131787243, oncanceled);
        onCancelLoad.getMin(2131787243, oncanceled);
        return R.layout.activity_recipient;
    }

    public static Intent createTransferIntent(Context context, QrTransferModel qrTransferModel, String str) {
        Intent intent = new Intent(context, BankActivity.class);
        intent.putExtra("scanner_data", qrTransferModel);
        intent.putExtra("transactionType", str);
        return intent;
    }

    public void configToolbar() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(51247551, oncanceled);
            onCancelLoad.getMin(51247551, oncanceled);
        }
        setCenterTitle(getString(R.string.sendmoney_title));
    }

    public void init() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1737612072, oncanceled);
            onCancelLoad.getMin(-1737612072, oncanceled);
        }
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        if (this.bankActivityComponent == null) {
            getConfigVariable.length length2 = getConfigVariable.length();
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                length2.getMax = applicationComponent;
                length2.getMin = new RecipientActivityModule(new queryWorkInfo(this) {
                    public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
                        boolean unused = BankActivity.this.belowKitkatDialog = z;
                    }
                });
                length2.setMin = new BillerX2BModule(new IWorkManagerImplCallback.Stub.Proxy.getMax() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    public final void setMax(@NotNull List<getExtraDataParsers> list) {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "message");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }

                    public final void getMin(getCurrX getcurrx) {
                        if (BankActivity.this.isClickable()) {
                            new getDeployVersion(BankActivity.this, new DialogInterface.OnClickListener(getcurrx) {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    BankActivity.this.billerX2BPresenter.length(r3);
                                }
                            }).setMax();
                        }
                    }

                    public final void setMax(PhotoSelectListener photoSelectListener) {
                        if (BankActivity.this.isClickable() && (photoSelectListener instanceof RecipientModel)) {
                            RecipientModel recipientModel = (RecipientModel) photoSelectListener;
                            if (BankActivity.this.setMax != null && BankActivity.this.setMax.equals()) {
                                recipientModel.valueOf = BankActivity.this.setMax.getMin();
                            }
                            BankActivity.this.processRecipientListData(recipientModel);
                            BankActivity.this.openCalculatorPage(recipientModel);
                        }
                    }

                    public final void getMin(String str) {
                        DanaH5.startContainerFullUrl(str);
                    }

                    public final void getMin(PhotoSelectListener photoSelectListener) {
                        BankActivity bankActivity = BankActivity.this;
                        bankActivity.addDisposable(ConstraintTrackingWorker.getMax(bankActivity).subscribe(new getPriority(this, photoSelectListener)));
                    }
                });
                this.bankActivityComponent = length2.getMin();
            } else {
                throw null;
            }
        }
        this.bankActivityComponent.length(this);
        registerPresenter(this.recipientPresenter, this.billerX2BPresenter);
        this.recipientList.setRecipientViewTitle(getString(R.string.send_to_bank_account_title));
        this.recipientList.setRecipientContactType(1);
        this.recipientList.setListener((PhotoItem) new PhotoItem() {
            public final void getMax() {
            }

            public final void onRecipientSelected(RecipientModel recipientModel) {
                BankActivity.this.billerX2BPresenter.length((PhotoSelectListener) recipientModel);
            }
        });
        setData(getIntent().getExtras());
        this.recipientPresenter.getMax();
        this.recipientList.initRecipientView();
    }

    public void showBelowKitkatDialogWarning() {
        new isBaselineAligned(this, isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelable(false).message(Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton((Integer) null, (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
    }

    public void handleTransferData(QrTransferModel qrTransferModel) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1968767791, oncanceled);
            onCancelLoad.getMin(1968767791, oncanceled);
        }
        this.setMax = qrTransferModel;
        if (qrTransferModel.FastBitmap$CoordinateSystem()) {
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-89560372, oncanceled2);
                onCancelLoad.getMin(-89560372, oncanceled2);
            }
            if (qrTransferModel instanceof QrRequestBankTransferModel) {
                QrRequestBankTransferModel qrRequestBankTransferModel = (QrRequestBankTransferModel) qrTransferModel;
                RecipientModel.length length2 = new RecipientModel.length("bank");
                length2.FastBitmap$CoordinateSystem = RecipientIdType.INSTITUTION;
                length2.isInside = qrRequestBankTransferModel.getMax;
                length2.toIntRange = qrRequestBankTransferModel.length;
                length2.toFloatRange = qrRequestBankTransferModel.isInside;
                length2.invoke = qrRequestBankTransferModel.toIntRange;
                length2.Grayscale$Algorithm = qrRequestBankTransferModel.IsOverlapping;
                length2.values = qrRequestBankTransferModel.equals;
                length2.toDoubleRange = qrRequestBankTransferModel.toFloatRange;
                length2.equals = qrRequestBankTransferModel.FastBitmap$CoordinateSystem;
                length2.IsOverlapping = qrRequestBankTransferModel.setMin;
                length2.length = qrTransferModel.getMin();
                length2.toIntRange = qrTransferModel.setMin();
                length2.getMax = qrRequestBankTransferModel.equals();
                length2.hashCode = getTransferScenario(qrTransferModel);
                length2.toString = this.transactionType;
                openCalculatorPage(length2.length(), qrTransferModel.length());
                return;
            }
            return;
        }
        this.recipientView.setQrTransferModel(qrTransferModel, getIntent().getStringExtra("recipientType"));
    }
}
