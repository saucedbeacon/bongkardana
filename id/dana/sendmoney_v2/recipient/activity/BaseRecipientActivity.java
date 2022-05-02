package id.dana.sendmoney_v2.recipient.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.domain.sendmoney.TransferScenario;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.sendmoney_v2.recipient.view.RecipientView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.dispatchOnCancelled;
import o.enqueueWorkRequests;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setPhotoIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001aJ\b\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H$J\b\u0010(\u001a\u00020!H$J\"\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J-\u0010.\u001a\u00020!2\u0006\u0010*\u001a\u00020#2\u000e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005002\u0006\u00101\u001a\u000202H\u0016¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u001a\u00104\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u0005H\u0004J\u0010\u00106\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0010\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109J\f\u0010:\u001a\u00020!*\u00020\u001fH\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006<"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/BaseRecipientActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/sendmoney/view/BaseRecipientListener;", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "belowKitkatDialog", "", "getBelowKitkatDialog", "()Z", "setBelowKitkatDialog", "(Z)V", "recipientPresenter", "Lid/dana/contract/sendmoney/RecipientContract$Presenter;", "getRecipientPresenter", "()Lid/dana/contract/sendmoney/RecipientContract$Presenter;", "setRecipientPresenter", "(Lid/dana/contract/sendmoney/RecipientContract$Presenter;)V", "transactionType", "getTransactionType", "setTransactionType", "buildRecipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "kotlin.jvm.PlatformType", "recipientId", "recipientIdType", "qrTransferModel", "Lid/dana/sendmoney/model/QrTransferModel;", "configToolbar", "", "getLayout", "", "getTransferScenario", "recipientModel", "init", "initInjector", "initRecipientView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openSummary", "remarks", "processRecipientListData", "setData", "bundle", "Landroid/os/Bundle;", "handleTransferData", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseRecipientActivity extends BaseActivity implements setPhotoIndex {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public static final int equals = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private boolean getMax;
    @NotNull
    private String getMin = "";
    private HashMap isInside;
    @Inject
    public enqueueWorkRequests.length recipientPresenter;
    @NotNull
    private String setMax = "";

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayout() {
        return R.layout.activity_recipient_v2;
    }

    /* access modifiers changed from: protected */
    public abstract void initInjector();

    /* access modifiers changed from: protected */
    public abstract void initRecipientView();

    @NotNull
    public final enqueueWorkRequests.length getRecipientPresenter() {
        enqueueWorkRequests.length length = this.recipientPresenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientPresenter");
        }
        return length;
    }

    public final void setRecipientPresenter(@NotNull enqueueWorkRequests.length length) {
        Intrinsics.checkNotNullParameter(length, "<set-?>");
        this.recipientPresenter = length;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getAmount() {
        return this.getMin;
    }

    /* access modifiers changed from: protected */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.getMin = str;
    }

    /* access modifiers changed from: protected */
    public final boolean getBelowKitkatDialog() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(660630107, oncanceled);
            onCancelLoad.getMin(660630107, oncanceled);
        }
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final void setBelowKitkatDialog(boolean z) {
        this.getMax = z;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getTransactionType() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public final void setTransactionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.setMax = str;
    }

    public void configToolbar() {
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public void init() {
        initInjector();
        initRecipientView();
    }

    public void processRecipientListData(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        if (!StringsKt.isBlank(this.getMin)) {
            recipientModel.valueOf = this.getMin;
        }
    }

    public static /* synthetic */ void openSummary$default(BaseRecipientActivity baseRecipientActivity, RecipientModel recipientModel, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "";
            }
            baseRecipientActivity.openSummary(recipientModel, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSummary");
    }

    /* access modifiers changed from: protected */
    public final void openSummary(@NotNull RecipientModel recipientModel, @NotNull String str) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-99194037, oncanceled);
            onCancelLoad.getMin(-99194037, oncanceled);
        }
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        Intrinsics.checkNotNullParameter(str, "remarks");
        Intent intentClassWithTracking = getIntentClassWithTracking(SummaryActivity.class);
        if (intentClassWithTracking != null) {
            intentClassWithTracking.putExtra("data", recipientModel);
            intentClassWithTracking.putExtra("remarks", str);
            intentClassWithTracking.putExtra("transferScenario", getTransferScenario(recipientModel));
            if (Intrinsics.areEqual((Object) "split_bill", (Object) this.setMax)) {
                intentClassWithTracking.putExtra("splitBillId", getIntent().getStringExtra("splitBillId"));
            }
            startActivity(intentClassWithTracking);
            if (Intrinsics.areEqual((Object) "split_bill", (Object) recipientModel.ICustomTabsCallback)) {
                finish();
            }
        }
    }

    public final void setData(@Nullable Bundle bundle) {
        QrTransferModel qrTransferModel;
        if (bundle != null && (qrTransferModel = (QrTransferModel) bundle.getParcelable("scanner_data")) != null) {
            String string = bundle.getString("transactionType", "");
            Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(Variables.TRANSACTION_TYPE, \"\")");
            this.setMax = string;
            handleTransferData(qrTransferModel);
        }
    }

    /* access modifiers changed from: protected */
    public void handleTransferData(@NotNull QrTransferModel qrTransferModel) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(qrTransferModel, "$this$handleTransferData");
        String str3 = "";
        if (qrTransferModel.isInside()) {
            String min = qrTransferModel.getMin();
            if (min == null) {
                min = str3;
            }
            this.getMin = min;
            str2 = str3;
            str = str2;
        } else {
            CharSequence IsOverlapping = qrTransferModel.IsOverlapping();
            if (IsOverlapping == null || StringsKt.isBlank(IsOverlapping)) {
                str2 = qrTransferModel.setMin();
                if (str2 == null) {
                    str2 = str3;
                }
                str = "phonenumber";
            } else {
                String IsOverlapping2 = qrTransferModel.IsOverlapping();
                if (IsOverlapping2 == null) {
                    IsOverlapping2 = str3;
                }
                str = "userid";
            }
        }
        if ((!StringsKt.isBlank(str2)) && (!StringsKt.isBlank(str))) {
            RecipientModel.length length = new RecipientModel.length("contact");
            length.toFloatRange = str2;
            length.FastBitmap$CoordinateSystem = str;
            length.isInside = qrTransferModel.toFloatRange();
            length.toIntRange = qrTransferModel.setMin();
            String max = qrTransferModel.getMax();
            if (max == null) {
                max = str3;
            }
            length.IsOverlapping = max;
            length.length = qrTransferModel.getMin();
            length.getMax = true;
            length.hashCode = getTransferScenario(qrTransferModel);
            length.toString = this.setMax;
            RecipientModel length2 = length.length();
            length2.hashCode = true;
            String length3 = qrTransferModel.length();
            if (length3 != null) {
                str3 = length3;
            }
            openSummary(length2, str3);
        }
    }

    @NotNull
    public final String getTransferScenario(@NotNull QrTransferModel qrTransferModel) {
        Intrinsics.checkNotNullParameter(qrTransferModel, "qrTransferModel");
        if (qrTransferModel.values()) {
            return TransferScenario.PROFILE_QR;
        }
        if (qrTransferModel.toIntRange()) {
            return TransferScenario.REQUEST_MONEY;
        }
        return qrTransferModel.FastBitmap$CoordinateSystem() ? TransferScenario.REQUEST_MONEY_BANK_QR : "";
    }

    @NotNull
    public final String getTransferScenario(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        if (Intrinsics.areEqual((Object) "split_bill", (Object) this.setMax)) {
            return TransferScenario.SPLIT_BILL;
        }
        String str = recipientModel.getCause;
        Intrinsics.checkNotNullExpressionValue(str, "recipientModel.transferScenario");
        return str;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.setMax(applicationContext, i, 0)))) {
            onCanceled oncanceled = new onCanceled(i, max, 2);
            onCancelLoad.setMax(-591319856, oncanceled);
            onCancelLoad.getMin(-591319856, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-591319856, oncanceled2);
            onCancelLoad.getMin(-591319856, oncanceled2);
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == equals) {
                RecipientModel recipientModel = (RecipientModel) intent.getParcelableExtra("data");
                if (recipientModel != null) {
                    Intrinsics.checkNotNullExpressionValue(recipientModel, "it");
                    openSummary(recipientModel);
                }
            } else if (i == DecodeWrapper.AnonymousClass2.length) {
                setData(intent.getExtras());
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1056861035 == (max = dispatchOnCancelled.getMax(applicationContext, -1056861035)))) {
            onCanceled oncanceled = new onCanceled(-1056861035, max, 512);
            onCancelLoad.setMax(-1056861035, oncanceled);
            onCancelLoad.getMin(-1056861035, oncanceled);
        }
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/BaseRecipientActivity$Companion;", "", "()V", "ALL_BANK_REQUEST_CODE", "", "getALL_BANK_REQUEST_CODE$app_productionRelease", "()I", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public void openSummary(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        recipientModel.ICustomTabsCallback = "send_money";
        Intent intentClassWithTracking = getIntentClassWithTracking(SummaryActivity.class);
        intentClassWithTracking.putExtra("data", recipientModel);
        intentClassWithTracking.putExtra("transferScenario", getIntent().getStringExtra("transferScenario"));
        startActivity(intentClassWithTracking);
    }
}
