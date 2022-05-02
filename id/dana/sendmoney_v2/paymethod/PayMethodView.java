package id.dana.sendmoney_v2.paymethod;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.di.modules.PayMethodModule;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.premium.PremiumNoticeActivity;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ForceStopRunnable$BroadcastReceiver;
import o.Ignore;
import o.IntRange;
import o.PhotoInfo;
import o.PrepareException;
import o.forceFinished;
import o.getClientCount;
import o.getCurrY;
import o.getDataFieldCount;
import o.getInsetDodgeRect;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.removeAll;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002:\u0001FB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0002J\u0016\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\bH\u0016J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020&H\u0002J\u0012\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u00010$H\u0016J\b\u00104\u001a\u00020&H\u0016J\u0012\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u00010$H\u0016J\b\u00107\u001a\u00020&H\u0016J\"\u00108\u001a\u00020&2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010:2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010;\u001a\u00020&H\u0002J\u0010\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u001fH\u0002J\u000e\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020\u000fJ\u0010\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020\bH\u0002J\b\u0010B\u001a\u00020&H\u0016J\b\u0010C\u001a\u00020&H\u0016J\b\u0010D\u001a\u00020&H\u0002J\u0010\u0010E\u001a\u00020&2\u0006\u0010=\u001a\u00020\u001fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/PayMethodView;", "Lid/dana/base/BaseRichView;", "Lid/dana/contract/sendmoney/PayMethodContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "kycActive", "", "listener", "Lid/dana/sendmoney_v2/paymethod/PayMethodView$PayMethodListener;", "payMethodAdapter", "Lid/dana/sendmoney/paymethod/PayMethodAdapter;", "getPayMethodAdapter", "()Lid/dana/sendmoney/paymethod/PayMethodAdapter;", "setPayMethodAdapter", "(Lid/dana/sendmoney/paymethod/PayMethodAdapter;)V", "payMethodComponent", "Lid/dana/di/component/PayMethodComponent;", "presenter", "Lid/dana/contract/sendmoney/PayMethodContract$Presenter;", "getPresenter", "()Lid/dana/contract/sendmoney/PayMethodContract$Presenter;", "setPresenter", "(Lid/dana/contract/sendmoney/PayMethodContract$Presenter;)V", "selectedPayMethodModel", "Lid/dana/model/PayMethodModel;", "skeletonPayMethod", "Lcom/ethanhua/skeleton/SkeletonScreen;", "checkIsKycActive", "kycLevel", "", "dismissProgress", "", "doWhenDefaultCardEmpty", "fetchData", "recipientType", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "getLayout", "getValidPayMethodModel", "hideShimmer", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onError", "errorMessage", "onGetDefaultCardError", "onGetDefaultCardSuccess", "cardIndexNo", "onGetPayMethodError", "onGetPayMethodListSuccess", "payMethodModels", "", "openKycMessageDialog", "selectPayMethod", "payMethodModel", "setChangePayMethodListener", "changePayMethodListener", "setItemPayMethod", "position", "setup", "showProgress", "showShimmer", "updateCurrentSelection", "PayMethodListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PayMethodView extends BaseRichView implements ForceStopRunnable$BroadcastReceiver.length {
    private onDetachedFromLayoutParams getMax;
    private boolean getMin;
    private PayMethodModel length;
    @Inject
    public PhotoInfo payMethodAdapter;
    @Inject
    public ForceStopRunnable$BroadcastReceiver.setMin presenter;
    private getMin setMax;
    private getClientCount setMin;
    private HashMap toFloatRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/PayMethodView$PayMethodListener;", "", "onChangePayMethodDone", "", "payMethodModel", "Lid/dana/model/PayMethodModel;", "onFinishSelection", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMax();

        void getMin(@NotNull PayMethodModel payMethodModel);
    }

    @JvmOverloads
    public PayMethodView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public PayMethodView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_change_pay_method_list;
    }

    @NotNull
    public final ForceStopRunnable$BroadcastReceiver.setMin getPresenter() {
        ForceStopRunnable$BroadcastReceiver.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmin;
    }

    public final void setPresenter(@NotNull ForceStopRunnable$BroadcastReceiver.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.presenter = setmin;
    }

    @NotNull
    public final PhotoInfo getPayMethodAdapter() {
        PhotoInfo photoInfo = this.payMethodAdapter;
        if (photoInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        return photoInfo;
    }

    public final void setPayMethodAdapter(@NotNull PhotoInfo photoInfo) {
        Intrinsics.checkNotNullParameter(photoInfo, "<set-?>");
        this.payMethodAdapter = photoInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayMethodView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PayMethodView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public PayMethodView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        if (this.setMin == null) {
            removeAll.length max = removeAll.getMax();
            if (r4 != null) {
                max.getMin = r4;
                max.length = new PayMethodModule(this);
                this.setMin = max.getMax();
            } else {
                throw null;
            }
        }
        getClientCount getclientcount = this.setMin;
        if (getclientcount != null) {
            getclientcount.setMin(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        ForceStopRunnable$BroadcastReceiver.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = setmin;
        registerPresenter(getminArr);
    }

    public final void setup() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getText);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_payment_method");
        recyclerView.setLayoutManager(linearLayoutManager);
        PhotoInfo photoInfo = this.payMethodAdapter;
        if (photoInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        photoInfo.getMax = new setMax(this);
        PhotoInfo photoInfo2 = this.payMethodAdapter;
        if (photoInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        photoInfo2.setMin = true;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getText);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_payment_method");
        PhotoInfo photoInfo3 = this.payMethodAdapter;
        if (photoInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        recyclerView2.setAdapter(photoInfo3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Ignore.setMin {
        final /* synthetic */ PayMethodView length;

        setMax(PayMethodView payMethodView) {
            this.length = payMethodView;
        }

        public final void length(int i) {
            PayMethodView.access$setItemPayMethod(this.length, i);
        }
    }

    public final void fetchData(@NotNull String str, @NotNull getDataFieldCount getdatafieldcount) {
        Intrinsics.checkNotNullParameter(str, "recipientType");
        Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
        ForceStopRunnable$BroadcastReceiver.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        forceFinished forcefinished = forceFinished.setMin;
        setmin.getMin(forceFinished.setMin(str), getdatafieldcount);
    }

    public final void onGetPayMethodListSuccess(@Nullable List<PayMethodModel> list, @Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.getMin = getMin(str);
        PhotoInfo photoInfo = this.payMethodAdapter;
        if (photoInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        photoInfo.setMax = this.getMin;
        PhotoInfo photoInfo2 = this.payMethodAdapter;
        if (photoInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        photoInfo2.getMin(list);
        ForceStopRunnable$BroadcastReceiver.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmin.getMin();
    }

    public final void onGetDefaultCardSuccess(@Nullable String str) {
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            setMax(getMax());
            return;
        }
        getCurrY getcurry = getCurrY.setMin;
        PhotoInfo photoInfo = this.payMethodAdapter;
        if (photoInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        PayMethodModel max = getCurrY.setMax(photoInfo, str);
        if (max != null) {
            setMax(max);
        } else {
            setMax(getMax());
        }
    }

    public final void onError(@Nullable String str) {
        showWarningDialog(str);
    }

    public final void onGetPayMethodError() {
        showWarningDialog(getContext().getString(R.string.general_error_msg));
    }

    public final void onGetDefaultCardError() {
        onError(getContext().getString(R.string.general_error_msg));
    }

    private final void setMax(PayMethodModel payMethodModel) {
        getMin getmin = this.setMax;
        if (getmin != null) {
            getmin.getMin(payMethodModel);
        }
        if (!this.getMin && Intrinsics.areEqual((Object) "BALANCE", (Object) payMethodModel.values)) {
            length();
        }
        getMax(payMethodModel);
    }

    private final void getMax(PayMethodModel payMethodModel) {
        PayMethodModel payMethodModel2 = this.length;
        if (payMethodModel2 != null) {
            payMethodModel2.invoke = false;
        }
        payMethodModel.invoke = true;
        this.length = payMethodModel;
        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.getText)).post(new setMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ PayMethodView getMin;

        setMin(PayMethodView payMethodView) {
            this.getMin = payMethodView;
        }

        public final void run() {
            this.getMin.getPayMethodAdapter().notifyDataSetChanged();
        }
    }

    public final void setChangePayMethodListener(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "changePayMethodListener");
        this.setMax = getmin;
    }

    private final PayMethodModel getMax() {
        if (!this.getMin) {
            PhotoInfo photoInfo = this.payMethodAdapter;
            if (photoInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
            }
            if (photoInfo.setMax() != null) {
                PhotoInfo photoInfo2 = this.payMethodAdapter;
                if (photoInfo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
                }
                PayMethodModel max = photoInfo2.setMax();
                Intrinsics.checkNotNullExpressionValue(max, "payMethodAdapter.nextCard");
                return max;
            }
        }
        PhotoInfo photoInfo3 = this.payMethodAdapter;
        if (photoInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        PayMethodModel min = photoInfo3.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "it");
        if (!Intrinsics.areEqual((Object) min.getMax == null ? "" : min.getMax.getMax, (Object) "0")) {
            return min;
        }
        PhotoInfo photoInfo4 = this.payMethodAdapter;
        if (photoInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        if (photoInfo4.setMax() == null) {
            return min;
        }
        PhotoInfo photoInfo5 = this.payMethodAdapter;
        if (photoInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        PayMethodModel max2 = photoInfo5.setMax();
        Intrinsics.checkNotNullExpressionValue(max2, "payMethodAdapter.nextCard");
        return max2;
    }

    private final void length() {
        PhotoInfo photoInfo = this.payMethodAdapter;
        if (photoInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        if (photoInfo.setMax() != null) {
            PhotoInfo photoInfo2 = this.payMethodAdapter;
            if (photoInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
            }
            PayMethodModel max = photoInfo2.setMax();
            Intrinsics.checkNotNullExpressionValue(max, "payMethodAdapter.nextCard");
            setMax(max);
        }
        getBaseActivity().startActivityForResult(new Intent(getBaseActivity(), PremiumNoticeActivity.class), PremiumNoticeActivity.PREMIUM_NOTICE_REQUEST_CODE);
    }

    private static boolean getMin(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 1538) {
            if (hashCode == 2321981 && str.equals("KYC2")) {
                return true;
            }
            return false;
        } else if (str.equals(TransferUserInfoResult.KycLevel.KYC_2)) {
            return true;
        } else {
            return false;
        }
    }

    public final void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        this.getMax = null;
    }

    public final void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.flagActionItems));
            setmax.getMax = R.layout.view_skeleton_change_pay_method;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMax = getinsetdodgerect;
        } else if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public static final /* synthetic */ void access$setItemPayMethod(PayMethodView payMethodView, int i) {
        PhotoInfo photoInfo = payMethodView.payMethodAdapter;
        if (photoInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payMethodAdapter");
        }
        Object min = photoInfo.setMin(i);
        Intrinsics.checkNotNullExpressionValue(min, "payMethodAdapter.getItem(position)");
        payMethodView.setMax((PayMethodModel) min);
        getMin getmin = payMethodView.setMax;
        if (getmin != null) {
            getmin.getMax();
        }
    }
}
