package id.dana.sendmoney.voucher;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.ChangeVoucherModule;
import id.dana.dialog.DialogWithImage;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.VoucherModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BindBitmap;
import o.IntRange;
import o.PrepareException;
import o.installApp;
import o.onDelete;
import o.refreshUpdateTime;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001WB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u0007H\u0016J\u0014\u00107\u001a\u0004\u0018\u00010\r2\b\u00108\u001a\u0004\u0018\u000109H\u0002J\b\u0010:\u001a\u000205H\u0002J\u0016\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\rJ\u0012\u0010>\u001a\u0002052\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u000205H\u0002J \u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010FJ\b\u0010G\u001a\u000205H\u0002J\b\u0010H\u001a\u000205H\u0002J\"\u0010I\u001a\u0002052\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010J2\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010K\u001a\u000205H\u0002J\u0012\u0010L\u001a\u0002052\b\u0010M\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010N\u001a\u0002052\b\b\u0001\u0010O\u001a\u00020\u0007H\u0002J\u0012\u0010P\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000109H\u0002J\b\u0010Q\u001a\u000205H\u0002J\b\u0010R\u001a\u000205H\u0002J\b\u0010S\u001a\u000205H\u0016J\b\u0010T\u001a\u000205H\u0002J\b\u0010U\u001a\u000205H\u0002J\b\u0010V\u001a\u000205H\u0002R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\r@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006X"}, d2 = {"Lid/dana/sendmoney/voucher/SummaryVoucherView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "availablePayMethods", "", "", "getAvailablePayMethods", "()Ljava/util/List;", "setAvailablePayMethods", "(Ljava/util/List;)V", "changeVoucherModule", "Lid/dana/di/modules/ChangeVoucherModule;", "getChangeVoucherModule", "()Lid/dana/di/modules/ChangeVoucherModule;", "firstSet", "", "value", "payMethod", "getPayMethod", "()Ljava/lang/String;", "setPayMethod", "(Ljava/lang/String;)V", "Lid/dana/sendmoney/model/VoucherModel;", "selectedVoucher", "getSelectedVoucher", "()Lid/dana/sendmoney/model/VoucherModel;", "setSelectedVoucher", "(Lid/dana/sendmoney/model/VoucherModel;)V", "summaryVoucherComponent", "Lid/dana/di/component/ChangeVoucherComponent;", "summaryVoucherListener", "Lid/dana/sendmoney/voucher/SummaryVoucherView$SummaryVoucherListener;", "getSummaryVoucherListener", "()Lid/dana/sendmoney/voucher/SummaryVoucherView$SummaryVoucherListener;", "setSummaryVoucherListener", "(Lid/dana/sendmoney/voucher/SummaryVoucherView$SummaryVoucherListener;)V", "voucherModels", "voucherPopUpDialog", "voucherPresenter", "Lid/dana/contract/sendmoney/voucher/ChangeVoucherContract$Presenter;", "getVoucherPresenter", "()Lid/dana/contract/sendmoney/voucher/ChangeVoucherContract$Presenter;", "setVoucherPresenter", "(Lid/dana/contract/sendmoney/voucher/ChangeVoucherContract$Presenter;)V", "findActiveVoucher", "", "getLayout", "getVoucherTotalAmount", "totalAmount", "Lid/dana/model/CurrencyAmountModel;", "handleNoVoucher", "initPrePay", "amount", "transferMethod", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "noneVoucherSelectedView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "refreshVoucherView", "renderVoucherView", "searchActiveVoucher", "", "setAutoSelectPayMethod", "setChooserContent", "couponName", "setSelectionVoucherTextColor", "color", "setVoucherAmount", "setVoucherCloseListener", "setVoucherSelectListener", "setup", "showVoucherContent", "showVoucherPopUpDialog", "voucherNotSelectedView", "SummaryVoucherListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SummaryVoucherView extends BaseRichView {
    private boolean IsOverlapping;
    @Nullable
    private String getMax;
    @Nullable
    private VoucherModel getMin;
    private boolean isInside;
    @Nullable
    private List<String> length;
    @Nullable
    private length setMax;
    private refreshUpdateTime setMin;
    /* access modifiers changed from: private */
    public List<VoucherModel> toFloatRange;
    private HashMap toIntRange;
    @Inject
    public BindBitmap.getMin voucherPresenter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/sendmoney/voucher/SummaryVoucherView$SummaryVoucherListener;", "", "onGetMatchVoucherPayMethod", "", "payMethod", "", "onVoucherSelected", "voucherSelected", "Lid/dana/sendmoney/model/VoucherModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void getMin(@Nullable VoucherModel voucherModel);

        void setMin(@NotNull String str);
    }

    @JvmOverloads
    public SummaryVoucherView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SummaryVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_voucher_summary;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SummaryVoucherView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SummaryVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SummaryVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final BindBitmap.getMin getVoucherPresenter() {
        BindBitmap.getMin getmin = this.voucherPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voucherPresenter");
        }
        return getmin;
    }

    public final void setVoucherPresenter(@NotNull BindBitmap.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.voucherPresenter = getmin;
    }

    @Nullable
    public final length getSummaryVoucherListener() {
        return this.setMax;
    }

    public final void setSummaryVoucherListener(@Nullable length length2) {
        this.setMax = length2;
    }

    @Nullable
    public final String getPayMethod() {
        return this.getMax;
    }

    public final void setPayMethod(@Nullable String str) {
        this.isInside = str != null ? !Intrinsics.areEqual((Object) str, (Object) this.getMax) : false;
        this.getMax = str;
        setMin(this.toFloatRange, str);
    }

    @Nullable
    public final VoucherModel getSelectedVoucher() {
        return this.getMin;
    }

    public final void setSelectedVoucher(@Nullable VoucherModel voucherModel) {
        String str;
        String max;
        this.getMin = voucherModel;
        if (voucherModel != null) {
            ((AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex)).setTextColor(IntRange.setMax(getContext(), R.color.f18632131099744));
            CharSequence charSequence = voucherModel.setMin;
            if (charSequence == null || charSequence.length() == 0) {
                getMin();
            } else {
                String str2 = voucherModel.getMax;
                AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
                if (appCompatTextView != null) {
                    appCompatTextView.setText(str2);
                }
                CurrencyAmountModel currencyAmountModel = voucherModel.setMax;
                if (currencyAmountModel != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onConfigurationChanged);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(0);
                    }
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex);
                    if (appCompatTextView2 != null) {
                        if (currencyAmountModel == null || (max = currencyAmountModel.setMax()) == null) {
                            str = null;
                        } else {
                            ((AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex)).setTextColor(IntRange.setMax(getContext(), R.color.f24942131100467));
                            str = "-".concat(String.valueOf(max));
                        }
                        appCompatTextView2.setText(str);
                    }
                } else {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onConfigurationChanged);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex);
                    if (appCompatTextView3 != null) {
                        appCompatTextView3.setText(getContext().getString(R.string.voucher_select));
                    }
                }
                setVisibility(0);
            }
        }
        length length2 = this.setMax;
        if (length2 != null) {
            length2.getMin(this.getMin);
        }
    }

    @Nullable
    public final List<String> getAvailablePayMethods() {
        return this.length;
    }

    public final void setAvailablePayMethods(@Nullable List<String> list) {
        this.length = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ SummaryVoucherView setMin;

        getMax(SummaryVoucherView summaryVoucherView) {
            this.setMin = summaryVoucherView;
        }

        public final void onClick(View view) {
            SummaryVoucherView.access$showVoucherContent(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ SummaryVoucherView length;

        setMin(SummaryVoucherView summaryVoucherView) {
            this.length = summaryVoucherView;
        }

        public final void onClick(View view) {
            SummaryVoucherView.access$voucherNotSelectedView(this.length);
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        if (this.setMin == null) {
            installApp.getMin min = installApp.setMin();
            if (r4 != null) {
                min.setMin = r4;
                min.setMax = new ChangeVoucherModule(new setMax(this));
                this.setMin = min.setMin();
            } else {
                throw null;
            }
        }
        refreshUpdateTime refreshupdatetime = this.setMin;
        if (refreshupdatetime != null) {
            refreshupdatetime.setMin(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        BindBitmap.getMin getmin = this.voucherPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voucherPresenter");
        }
        getminArr[0] = getmin;
        registerPresenter(getminArr);
    }

    private final void getMin() {
        String string = getContext().getString(R.string.no_voucher);
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
        if (appCompatTextView != null) {
            appCompatTextView.setText(string);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(getContext().getString(R.string.voucher_select));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onConfigurationChanged);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/sendmoney/voucher/SummaryVoucherView$changeVoucherModule$1", "Lid/dana/contract/sendmoney/voucher/ChangeVoucherContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "setVoucherModels", "voucherModels", "Ljava/util/ArrayList;", "Lid/dana/sendmoney/model/VoucherModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements BindBitmap.setMax {
        final /* synthetic */ SummaryVoucherView setMin;

        public final void dismissProgress() {
        }

        public final void showProgress() {
        }

        setMax(SummaryVoucherView summaryVoucherView) {
            this.setMin = summaryVoucherView;
        }

        public final void setVoucherModels(@NotNull ArrayList<VoucherModel> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "voucherModels");
            if (!arrayList.isEmpty()) {
                this.setMin.setVisibility(0);
                List list = arrayList;
                this.setMin.toFloatRange = list;
                SummaryVoucherView summaryVoucherView = this.setMin;
                summaryVoucherView.setMin(list, summaryVoucherView.getPayMethod());
                return;
            }
            this.setMin.setVisibility(8);
        }

        public final void onError(@Nullable String str) {
            this.setMin.showWarningDialog(str);
            this.setMin.setVisibility(8);
        }
    }

    public final void initPrePay(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, "transferMethod");
        BindBitmap.getMin getmin = this.voucherPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voucherPresenter");
        }
        getmin.getMin(str, str2);
    }

    /* access modifiers changed from: private */
    public final void setMin(List<? extends VoucherModel> list, String str) {
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0) && list != null) {
            Collection collection = list;
            if (!collection.isEmpty()) {
                int size = collection.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    VoucherModel voucherModel = (VoucherModel) list.get(i);
                    voucherModel.hashCode = i;
                    voucherModel.toDoubleRange = voucherModel.getMax(str);
                    if (voucherModel.length() && !z) {
                        setMax();
                        setSelectedVoucher(voucherModel);
                        z = true;
                    }
                }
                if (!z) {
                    setSelectedVoucher(new VoucherModel());
                    if (this.IsOverlapping) {
                        getMin();
                    } else {
                        getMax();
                    }
                }
                this.IsOverlapping = true;
            }
        }
    }

    private final void getMax() {
        List<String> list;
        Object obj;
        length length2;
        boolean z;
        Collection collection = this.length;
        if (!(collection == null || collection.isEmpty())) {
            Collection collection2 = this.toFloatRange;
            if (!(collection2 == null || collection2.isEmpty()) && (list = this.length) != null) {
                for (String str : list) {
                    List<VoucherModel> list2 = this.toFloatRange;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (!((VoucherModel) obj).getMax(str) || this.setMax == null) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        if (!(((VoucherModel) obj) == null || (length2 = this.setMax) == null)) {
                            length2.setMin(str);
                        }
                    }
                }
            }
        }
    }

    private final void setMax() {
        if (getBaseActivity() != null && this.isInside) {
            DialogWithImage.getMin max = new DialogWithImage.getMin().getMax(false).setMax(false);
            max.toFloatRange = R.drawable.ic_voucher_dialog;
            max.getMax = getContext().getString(R.string.sendmoney_voucher_dialog_title_V2);
            max.setMin = getContext().getString(R.string.sendmoney_voucher_dialog_desc_V2);
            max.getMin = getContext().getString(R.string.sendmoney_voucher_dialog_action_V2);
            max.length = getMin.getMin;
            new DialogWithImage(getContext(), max.setMax, max, (byte) 0).setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements DialogInterface.OnClickListener {
        public static final getMin getMin = new getMin();

        getMin() {
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (-1 == i) {
                dialogInterface.dismiss();
            }
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        VoucherModel voucherModel;
        if (i == ChangeVoucherView.CHANGE_VOUCHER_REQUEST_CODE && i2 == -1 && intent != null && (voucherModel = (VoucherModel) intent.getParcelableExtra("voucher")) != null) {
            setSelectedVoucher(voucherModel);
        }
    }

    public final void setup() {
        setOnClickListener(new getMax(this));
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onConfigurationChanged);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new setMin(this));
        }
    }

    public static final /* synthetic */ void access$showVoucherContent(SummaryVoucherView summaryVoucherView) {
        if (summaryVoucherView.toFloatRange != null && summaryVoucherView.getMax != null) {
            int i = -99;
            VoucherModel voucherModel = summaryVoucherView.getMin;
            if (voucherModel != null) {
                i = voucherModel.hashCode;
            }
            summaryVoucherView.getBaseActivity().startActivityForResult(VoucherDetailActivity.createTransferIntent(summaryVoucherView.getBaseActivity(), summaryVoucherView.toFloatRange, i), ChangeVoucherView.CHANGE_VOUCHER_REQUEST_CODE);
        }
    }

    public static final /* synthetic */ void access$voucherNotSelectedView(SummaryVoucherView summaryVoucherView) {
        String string = summaryVoucherView.getContext().getString(R.string.sendmoney_summary_use_voucher_title);
        AppCompatTextView appCompatTextView = (AppCompatTextView) summaryVoucherView._$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
        if (appCompatTextView != null) {
            appCompatTextView.setText(string);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) summaryVoucherView._$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(summaryVoucherView.getContext().getString(R.string.voucher_select));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) summaryVoucherView._$_findCachedViewById(resetInternal.setMax.onConfigurationChanged);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        ((AppCompatTextView) summaryVoucherView._$_findCachedViewById(resetInternal.setMax.getBaselineAlignedChildIndex)).setTextColor(IntRange.setMax(summaryVoucherView.getContext(), R.color.f18632131099744));
        summaryVoucherView.setSelectedVoucher((VoucherModel) null);
    }
}
