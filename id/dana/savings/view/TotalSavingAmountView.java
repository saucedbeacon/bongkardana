package id.dana.savings.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.SavingConfigModule;
import id.dana.richview.HideableBalanceView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.PrepareException;
import o.SightCameraView;
import o.notifyPrepared;
import o.onDelete;
import o.preParsePackage;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020#H\u0002R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lid/dana/savings/view/TotalSavingAmountView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "amount", "getAmount", "()I", "setAmount", "(I)V", "savingConfigPresenter", "Lid/dana/savings/presenter/SavingConfigPresenter;", "getSavingConfigPresenter", "()Lid/dana/savings/presenter/SavingConfigPresenter;", "setSavingConfigPresenter", "(Lid/dana/savings/presenter/SavingConfigPresenter;)V", "getLayout", "getSavingConfigModule", "Lid/dana/di/modules/SavingConfigModule;", "injectComponent", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setBalanceVisibility", "visibility", "", "setup", "toggleBalanceVisibility", "visible", "updateAmount", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TotalSavingAmountView extends BaseRichView {
    @Inject
    public SightCameraView.OnRecordListener savingConfigPresenter;
    private HashMap setMax;
    private int setMin;

    @JvmOverloads
    public TotalSavingAmountView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public TotalSavingAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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
        return R.layout.view_total_saving_amount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TotalSavingAmountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TotalSavingAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final SightCameraView.OnRecordListener getSavingConfigPresenter() {
        SightCameraView.OnRecordListener onRecordListener = this.savingConfigPresenter;
        if (onRecordListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingConfigPresenter");
        }
        return onRecordListener;
    }

    public final void setSavingConfigPresenter(@NotNull SightCameraView.OnRecordListener onRecordListener) {
        Intrinsics.checkNotNullParameter(onRecordListener, "<set-?>");
        this.savingConfigPresenter = onRecordListener;
    }

    public final int getAmount() {
        return this.setMin;
    }

    public final void setAmount(int i) {
        this.setMin = i;
        String valueOf = String.valueOf(i);
        HideableBalanceView hideableBalanceView = (HideableBalanceView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginEnd);
        if (hideableBalanceView != null) {
            hideableBalanceView.setAmount(valueOf);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/view/TotalSavingAmountView$getSavingConfigModule$1", "Lid/dana/savings/contract/SavingConfigContract$View;", "onSavingBalanceVisibility", "", "visibility", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements notifyPrepared.length {
        final /* synthetic */ TotalSavingAmountView getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(TotalSavingAmountView totalSavingAmountView) {
            this.getMin = totalSavingAmountView;
        }

        public final void setMin(boolean z) {
            TotalSavingAmountView.access$setBalanceVisibility(this.getMin, z);
        }
    }

    public final void setup() {
        HideableBalanceView hideableBalanceView = (HideableBalanceView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginEnd);
        if (hideableBalanceView != null) {
            hideableBalanceView.setTextSize(2, 24.0f);
        }
        HideableBalanceView hideableBalanceView2 = (HideableBalanceView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginEnd);
        if (hideableBalanceView2 != null) {
            hideableBalanceView2.setTextColor(IntRange.setMax(getContext(), R.color.f24762131100430));
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setChangingConfigurations);
        if (imageView != null) {
            imageView.setOnClickListener(new setMin(this));
            boolean isSelected = imageView.isSelected();
            HideableBalanceView hideableBalanceView3 = (HideableBalanceView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginEnd);
            if (hideableBalanceView3 != null) {
                hideableBalanceView3.setBalanceVisibility(isSelected);
            }
        }
        SightCameraView.OnRecordListener onRecordListener = this.savingConfigPresenter;
        if (onRecordListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingConfigPresenter");
        }
        onRecordListener.getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/savings/view/TotalSavingAmountView$setup$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ TotalSavingAmountView setMin;

        setMin(TotalSavingAmountView totalSavingAmountView) {
            this.setMin = totalSavingAmountView;
        }

        public final void onClick(View view) {
            if (!(view instanceof ImageView)) {
                view = null;
            }
            ImageView imageView = (ImageView) view;
            if (imageView != null) {
                imageView.setSelected(!imageView.isSelected());
                TotalSavingAmountView.access$toggleBalanceVisibility(this.setMin, imageView.isSelected());
                SightCameraView.OnRecordListener savingConfigPresenter = this.setMin.getSavingConfigPresenter();
                boolean isSelected = imageView.isSelected();
                savingConfigPresenter.setMin.showProgress();
                savingConfigPresenter.getMax.execute(Boolean.valueOf(isSelected), new SightCameraView.OnRecordListener.setMin(savingConfigPresenter, isSelected), new SightCameraView.OnRecordListener.getMax(savingConfigPresenter));
            }
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r4) {
        Intrinsics.checkNotNullParameter(r4, "applicationComponent");
        preParsePackage.getMin getmin = new preParsePackage.getMin((byte) 0);
        if (r4 != null) {
            getmin.setMin = r4;
            getmin.setMax = new SavingConfigModule(new setMax(this));
            stopIgnoring.setMin(getmin.setMax, SavingConfigModule.class);
            stopIgnoring.setMin(getmin.setMin, PrepareException.AnonymousClass1.class);
            new preParsePackage(getmin.setMax, getmin.setMin, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            SightCameraView.OnRecordListener onRecordListener = this.savingConfigPresenter;
            if (onRecordListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingConfigPresenter");
            }
            getminArr[0] = onRecordListener;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setBalanceVisibility(TotalSavingAmountView totalSavingAmountView, boolean z) {
        ImageView imageView = (ImageView) totalSavingAmountView._$_findCachedViewById(resetInternal.setMax.setChangingConfigurations);
        if (imageView != null) {
            imageView.setSelected(z);
        }
        HideableBalanceView hideableBalanceView = (HideableBalanceView) totalSavingAmountView._$_findCachedViewById(resetInternal.setMax.getTitleMarginEnd);
        if (hideableBalanceView != null) {
            hideableBalanceView.setBalanceVisibility(z);
        }
    }

    public static final /* synthetic */ void access$toggleBalanceVisibility(TotalSavingAmountView totalSavingAmountView, boolean z) {
        HideableBalanceView hideableBalanceView = (HideableBalanceView) totalSavingAmountView._$_findCachedViewById(resetInternal.setMax.getTitleMarginEnd);
        if (hideableBalanceView != null) {
            hideableBalanceView.setBalanceVisibility(z);
        }
    }
}
