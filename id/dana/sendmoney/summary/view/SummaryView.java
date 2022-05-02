package id.dana.sendmoney.summary.view;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.component.edittextcomponent.DanaTextBoxView;
import id.dana.data.base.NetworkException;
import id.dana.di.modules.SendMoneyModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import id.dana.richview.CurrencyEditText;
import id.dana.richview.CurrencyTextView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.sendmoney_v2.landing.view.RecipientRibbonView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import o.APImageDownloadRsp;
import o.DatePickerBridgeExtension;
import o.DiagnosticsReceiver;
import o.H5TinyPopMenu;
import o.IntRange;
import o.NebulaLoadingView;
import o.PrepareException;
import o.RedDotManager;
import o.SwipeRefreshLayout;
import o.WheelView;
import o.dispatchOnCancelled;
import o.doDismissWithAnimation;
import o.getDataFieldCount;
import o.getLegacySignPublicKey;
import o.getLoadOrigin;
import o.isLineVisible;
import o.isOriginHasAppInfo;
import o.isShowRecentUseTinyAppArea;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setLoadOrigin;
import o.setOnMenuWindowDismissListener;
import o.setOnWheelViewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001?B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u000e\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\fJ\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\"H\u0016J.\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\u001c2\b\b\u0002\u0010-\u001a\u00020\u001c2\b\b\u0003\u0010)\u001a\u00020\u00072\b\b\u0003\u0010.\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u00100\u001a\u00020\"*\u0002012\u0006\u00102\u001a\u00020\u001cH\u0002J(\u00103\u001a\n 4*\u0004\u0018\u00010\u001c0\u001c*\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u001c2\b\u00106\u001a\u0004\u0018\u00010\u001cH\u0002J(\u00107\u001a\n 4*\u0004\u0018\u00010\u001c0\u001c*\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u001c2\b\u00108\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u00109\u001a\u00020\"*\u00020\u0014J\u0016\u0010:\u001a\u00020;*\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u001cH\u0002J\f\u0010<\u001a\u00020\"*\u00020\u0014H\u0002J\f\u0010=\u001a\u00020\"*\u00020\u0014H\u0002J\f\u0010>\u001a\u00020\"*\u00020\u0014H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006@"}, d2 = {"Lid/dana/sendmoney/summary/view/SummaryView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "listener", "Lid/dana/sendmoney/summary/view/SummaryView$SummaryListener;", "presenter", "Lid/dana/contract/sendmoney/CalculatorContract$Presenter;", "getPresenter", "()Lid/dana/contract/sendmoney/CalculatorContract$Presenter;", "setPresenter", "(Lid/dana/contract/sendmoney/CalculatorContract$Presenter;)V", "value", "Lid/dana/sendmoney/summary/view/SummaryViewState;", "summaryViewState", "getSummaryViewState", "()Lid/dana/sendmoney/summary/view/SummaryViewState;", "setSummaryViewState", "(Lid/dana/sendmoney/summary/view/SummaryViewState;)V", "getLayout", "getMaxErrorAmountToSend", "", "limitMaxAmount", "getWarningMessage", "view", "Landroid/view/View;", "initEditText", "", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setSummaryListener", "summaryListener", "setSymbol", "drawableRes", "setup", "showAmountWarningMessage", "amount", "message", "textColor", "showWarningMessage", "disableEditText", "Landroidx/appcompat/widget/AppCompatEditText;", "text", "getSubtitle", "kotlin.jvm.PlatformType", "title", "subtitle", "getTitle", "recipientNumber", "initTransfer", "isTitleEmptyOrNumber", "", "renderFreeTransfer", "renderRecipientIcon", "renderSummary", "SummaryListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SummaryView extends BaseRichView {
    @Nullable
    private getLoadOrigin getMin;
    @Inject
    public DiagnosticsReceiver.getMin presenter;
    private HashMap setMax;
    /* access modifiers changed from: private */
    public setMax setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/sendmoney/summary/view/SummaryView$SummaryListener;", "", "onBelowFreeMinAmount", "", "onChangeInputtedAmount", "amount", "", "cleanAmount", "onRecipientIsDanaUser", "onSummaryViewMinOrMaxAmountReached", "showSummaryPage", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMax(@Nullable RecipientModel recipientModel);

        void getMin();

        void length();

        void length(@NotNull String str, @NotNull String str2);

        void setMax();
    }

    @JvmOverloads
    public SummaryView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SummaryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_sendmoney_summary;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "amountToSent", "", "kotlin.jvm.PlatformType", "accept", "id/dana/sendmoney/summary/view/SummaryView$initEditText$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements RedDotManager<String> {
        final /* synthetic */ CurrencyEditText getMin;
        final /* synthetic */ SummaryView setMax;

        getMin(CurrencyEditText currencyEditText, SummaryView summaryView) {
            this.getMin = currencyEditText;
            this.setMax = summaryView;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullExpressionValue(str, "amountToSent");
            String prefix = this.getMin.getPrefix();
            Intrinsics.checkNotNullExpressionValue(prefix, "prefix");
            String replace$default = StringsKt.replace$default(StringsKt.replace$default(str, prefix, "", false, 4, (Object) null), ".", "", false, 4, (Object) null);
            setMax access$getListener$p = this.setMax.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.length(str, replace$default);
            }
            this.setMax.getPresenter().setMax(replace$default);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SummaryView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(SummaryView summaryView) {
            super(1);
            this.this$0 = summaryView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            SummaryView.access$showWarningMessage(this.this$0, view);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SummaryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SummaryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SummaryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final DiagnosticsReceiver.getMin getPresenter() {
        DiagnosticsReceiver.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull DiagnosticsReceiver.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
    }

    @Nullable
    public final getLoadOrigin getSummaryViewState() {
        return this.getMin;
    }

    public final void setSummaryViewState(@Nullable getLoadOrigin getloadorigin) {
        this.getMin = getloadorigin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J:\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0012\u0010!\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\""}, d2 = {"id/dana/sendmoney/summary/view/SummaryView$injectComponent$1", "Lid/dana/contract/sendmoney/CalculatorContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onInitCallback", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "onInitError", "throwable", "", "onInitTransferOTCSuccess", "withdrawOTCModel", "Lid/dana/sendmoney/model/WithdrawOTCModel;", "onInitTransferSuccess", "onLimitBelowFreeMinAmount", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "freeMinAmount", "onMaximumAmountReached", "limitMaxAmount", "onMinimumAmountReached", "limitMinAmount", "onRecipientIsDanaUser", "userId", "phoneNumber", "nickname", "number", "imageUrl", "onTransferMethodEmpty", "showProgress", "showSummaryPage", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements DiagnosticsReceiver.length {
        final /* synthetic */ SummaryView setMin;

        public final void onInitTransferOTCSuccess(@Nullable WithdrawOTCModel withdrawOTCModel) {
        }

        getMax(SummaryView summaryView) {
            this.setMin = summaryView;
        }

        public final void showSummaryPage(@Nullable RecipientModel recipientModel) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.NavigationRes);
            if (appCompatTextView != null) {
                View view = appCompatTextView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(4);
            }
            setMax access$getListener$p = this.setMin.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.getMax(recipientModel);
            }
        }

        public final void onRecipientIsDanaUser(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.setMin.getPresenter().setMin(str, str2);
            setMax access$getListener$p = this.setMin.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.setMax();
            }
            getLoadOrigin summaryViewState = this.setMin.getSummaryViewState();
            if (summaryViewState != null) {
                String max = summaryViewState.getMax(this.setMin.getContext());
                CharSequence charSequence = max;
                boolean z = true;
                if ((charSequence.length() == 0) || Intrinsics.areEqual((Object) max, (Object) "-") || StringsKt.contains$default(charSequence, (CharSequence) "*", false, 2, (Object) null)) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.isIconified);
                    if (appCompatTextView != null) {
                        appCompatTextView.setText(SummaryView.access$getTitle(this.setMin, summaryViewState, str3, summaryViewState.length.isInside));
                    }
                    summaryViewState.length.setMin = str3;
                    summaryViewState.length.IsOverlapping = str3;
                    summaryViewState.length.onTransact = str3;
                }
                String floatRange = summaryViewState.toFloatRange();
                int i = 8;
                if (StringsKt.startsWith$default(floatRange, "*", false, 2, (Object) null)) {
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.setIconified);
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(str4, true));
                        View view = appCompatTextView2;
                        CharSequence text = appCompatTextView2.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "text");
                        if (!StringsKt.isBlank(text)) {
                            i = 0;
                        }
                        view.setVisibility(i);
                    }
                    summaryViewState.length.isInside = str4;
                    summaryViewState.length.getMin = str5;
                } else {
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.setIconified);
                    if (appCompatTextView3 != null) {
                        appCompatTextView3.setText(SummaryView.access$getSubtitle(this.setMin, summaryViewState, str3, floatRange));
                        View view2 = appCompatTextView3;
                        CharSequence text2 = appCompatTextView3.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "text");
                        if (!StringsKt.isBlank(text2)) {
                            i = 0;
                        }
                        view2.setVisibility(i);
                    }
                }
                summaryViewState.length.toDoubleRange = true;
                CharSequence max2 = summaryViewState.length.getMax();
                if (!(max2 == null || max2.length() == 0)) {
                    z = false;
                }
                if (z) {
                    summaryViewState.length.getMin = str5;
                }
                this.setMin.getMax(summaryViewState);
            }
        }

        public final void onInitTransferSuccess() {
            CurrencyEditText currencyEditText = (CurrencyEditText) this.setMin._$_findCachedViewById(resetInternal.setMax.sendMediaButton);
            if (currencyEditText != null) {
                CurrencyAmountModel amountModel = currencyEditText.getAmountModel();
                Intrinsics.checkNotNullExpressionValue(amountModel, "it.amountModel");
                CharSequence charSequence = amountModel.getMax;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    CurrencyAmountModel amountModel2 = currencyEditText.getAmountModel();
                    Intrinsics.checkNotNullExpressionValue(amountModel2, "it.amountModel");
                    if (!amountModel2.getMax()) {
                        this.setMin.getPresenter().setMax(currencyEditText.getAmount());
                    }
                }
            }
            getLoadOrigin summaryViewState = this.setMin.getSummaryViewState();
            if (summaryViewState != null) {
                SummaryView.access$renderSummary(this.setMin, summaryViewState);
            }
            getLoadOrigin summaryViewState2 = this.setMin.getSummaryViewState();
            if (summaryViewState2 != null) {
                SummaryView.access$renderFreeTransfer(this.setMin, summaryViewState2);
            }
        }

        public final void onMaximumAmountReached(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "limitMaxAmount");
            SummaryView summaryView = this.setMin;
            String access$getMaxErrorAmountToSend = SummaryView.access$getMaxErrorAmountToSend(summaryView, str);
            String string = this.setMin.getResources().getString(R.string.sm_maximum_amount);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.sm_maximum_amount)");
            summaryView.showAmountWarningMessage(access$getMaxErrorAmountToSend, string, R.drawable.ic_warning_16, R.color.f23802131100313);
            setMax access$getListener$p = this.setMin.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.length();
            }
        }

        public final void onMinimumAmountReached(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(1747111562, oncanceled);
                onCancelLoad.getMin(1747111562, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "limitMinAmount");
            SummaryView summaryView = this.setMin;
            String string = summaryView.getResources().getString(R.string.sm_minimum_amount);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.sm_minimum_amount)");
            summaryView.showAmountWarningMessage(str, string, R.drawable.ic_warning_16, R.color.f23802131100313);
            setMax access$getListener$p = this.setMin.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.length();
            }
        }

        public final void onLimitBelowFreeMinAmount(@NotNull RecipientModel recipientModel, @NotNull String str) {
            Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
            Intrinsics.checkNotNullParameter(str, "freeMinAmount");
            getLoadOrigin summaryViewState = this.setMin.getSummaryViewState();
            if (summaryViewState != null) {
                if (summaryViewState.length.Mean$Arithmetic > 0) {
                    SummaryView summaryView = this.setMin;
                    String string = summaryView.getResources().getString(R.string.sendmoney_summary_free_min_amount);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…_summary_free_min_amount)");
                    summaryView.showAmountWarningMessage(str, string, R.drawable.ic_info_filled_blue_16dp, R.color.f20382131099951);
                } else {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.NavigationRes);
                    if (appCompatTextView != null) {
                        View view = appCompatTextView;
                        Intrinsics.checkNotNullParameter(view, "<this>");
                        view.setVisibility(4);
                    }
                }
            }
            setMax access$getListener$p = this.setMin.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.getMin();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
        static final class setMin implements DialogInterface.OnDismissListener {
            final /* synthetic */ getMax length;

            setMin(getMax getmax) {
                this.length = getmax;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                this.length.setMin.getBaseActivity().onBackPressed();
            }
        }

        public final void onTransferMethodEmpty() {
            SummaryView summaryView = this.setMin;
            summaryView.showWarningDialog(summaryView.getContext().getString(R.string.transfer_method_not_available), new setMin(this), false, 0);
        }

        public final void onInitCallback(@Nullable getDataFieldCount getdatafieldcount) {
            if (getdatafieldcount != null) {
                BaseActivity baseActivity = this.setMin.getBaseActivity();
                if (!(baseActivity instanceof SummaryActivity)) {
                    baseActivity = null;
                }
                SummaryActivity summaryActivity = (SummaryActivity) baseActivity;
                if (summaryActivity != null) {
                    summaryActivity.getTransferInitCallback(getdatafieldcount);
                }
            }
        }

        public final void onInitError(@Nullable Throwable th) {
            String str;
            Context context = this.setMin.getContext();
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = context.getString(R.string.general_error_msg);
            }
            onError(str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
        static final class setMax implements DialogInterface.OnDismissListener {
            final /* synthetic */ getMax setMax;

            setMax(getMax getmax) {
                this.setMax = getmax;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                this.setMax.setMin.getBaseActivity().finish();
            }
        }

        public final void onError(@Nullable String str) {
            this.setMin.showWarningDialog(str, new setMax(this), true, 3000);
        }

        public final void showProgress() {
            setLoadOrigin setloadorigin = setLoadOrigin.setMin;
            setLoadOrigin.getMax(this.setMin);
        }

        public final void dismissProgress() {
            setLoadOrigin setloadorigin = setLoadOrigin.setMin;
            setLoadOrigin.setMin(this.setMin);
        }
    }

    private static boolean setMax(String str) {
        return Intrinsics.areEqual((Object) str, (Object) "-") || isOriginHasAppInfo.isValidIndoPhoneNumberPrefix(str);
    }

    public final void initTransfer(@NotNull getLoadOrigin getloadorigin) {
        Intrinsics.checkNotNullParameter(getloadorigin, "$this$initTransfer");
        String isInside = getloadorigin.isInside();
        if (isInside.length() > 0) {
            DiagnosticsReceiver.getMin getmin = this.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.length(isInside, getloadorigin.length);
        }
        if (getloadorigin.setMax()) {
            CurrencyEditText currencyEditText = (CurrencyEditText) _$_findCachedViewById(resetInternal.setMax.sendMediaButton);
            if (currencyEditText != null) {
                String max = new CurrencyAmountModel(getloadorigin.length.valueOf, "Rp").setMax();
                Intrinsics.checkNotNullExpressionValue(max, "CurrencyAmountModel(reci…P).currencyAndAmountValue");
                getMin(currencyEditText, max);
            }
            DanaTextBoxView danaTextBoxView = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.InspectableProperty$EnumEntry);
            if (danaTextBoxView != null) {
                getMin(danaTextBoxView, getloadorigin.getMin);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(getLoadOrigin getloadorigin) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getSupportParentActivityIntent);
        if (appCompatImageView != null) {
            doDismissWithAnimation dodismisswithanimation = new doDismissWithAnimation();
            Context context = getContext();
            ImageView imageView = appCompatImageView;
            String max = getloadorigin.length.getMax();
            if (max == null) {
                max = "";
            }
            int max2 = getloadorigin.getMax();
            setOnMenuWindowDismissListener.length length2 = new setOnMenuWindowDismissListener.length();
            length2.length = isLineVisible.getMax();
            length2.getMin = getloadorigin.getMax();
            dodismisswithanimation.getMax(context, imageView, max, max2, length2);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSupportActionBar);
        if (appCompatImageView2 != null) {
            View view = appCompatImageView2;
            boolean min = getloadorigin.getMin();
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(min ? 0 : 8);
        }
    }

    private final void getMin(AppCompatEditText appCompatEditText, String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-785312721, oncanceled);
            onCancelLoad.getMin(-785312721, oncanceled);
        }
        appCompatEditText.setFocusable(false);
        appCompatEditText.setClickable(false);
        appCompatEditText.setInputType(0);
        appCompatEditText.setText(str);
        H5TinyPopMenu.getMin(appCompatEditText, new length(this));
    }

    public static /* synthetic */ void showAmountWarningMessage$default(SummaryView summaryView, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        if ((i3 & 2) != 0) {
            str2 = "";
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        summaryView.showAmountWarningMessage(str, str2, i, i2);
    }

    public final void showAmountWarningMessage(@NotNull String str, @NotNull String str2, @DrawableRes int i, @ColorRes int i2) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, "message");
        if (!TextUtils.isEmpty(str)) {
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            String min = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, new APImageDownloadRsp(str).setMin, "Rp");
            isShowRecentUseTinyAppArea.getMax(IntRange.setMax(getContext(), i2), (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.NavigationRes));
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.NavigationRes);
            if (appCompatTextView != null) {
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.NavigationRes);
            if (appCompatTextView2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(str2, Arrays.copyOf(new Object[]{min}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                appCompatTextView2.setText(format);
            }
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.NavigationRes);
            if (appCompatTextView3 != null) {
                View view = appCompatTextView3;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.NavigationRes);
        if (appCompatTextView4 != null) {
            View view2 = appCompatTextView4;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(4);
        }
    }

    public final void setSummaryListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "summaryListener");
        this.setMin = setmax;
    }

    public final void setup() {
        CurrencyEditText currencyEditText = (CurrencyEditText) _$_findCachedViewById(resetInternal.setMax.sendMediaButton);
        if (currencyEditText != null) {
            currencyEditText.requestFocus();
            currencyEditText.setFocusableInTouchMode(true);
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            setOnWheelViewListener.setMin(baseActivity);
            currencyEditText.setTextHint(currencyEditText.getContext().getString(R.string.amount_default));
            currencyEditText.setTextHintColor(R.color.f20362131099948);
            currencyEditText.removeUnderline();
            addDisposable(currencyEditText.listenOriginalValue().subscribe(new getMin(currencyEditText, this)));
        }
        DanaTextBoxView danaTextBoxView = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.InspectableProperty$EnumEntry);
        if (danaTextBoxView != null) {
            String[] stringArray = danaTextBoxView.getResources().getStringArray(R.array.f1222130903047);
            Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…tes_hint_feed_send_money)");
            danaTextBoxView.setHint((CharSequence) ArraysKt.random((T[]) stringArray, (Random) Random.Default));
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        getLegacySignPublicKey.getMin getmin = new getLegacySignPublicKey.getMin((byte) 0);
        if (r4 != null) {
            getmin.setMin = r4;
            getmin.setMax = new SendMoneyModule(new getMax(this));
            getmin.setMin().length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            DiagnosticsReceiver.getMin getmin2 = this.presenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = getmin2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ String access$getTitle(SummaryView summaryView, getLoadOrigin getloadorigin, String str, String str2) {
        if (setMax(str)) {
            return isOriginHasAppInfo.replaceIndoPhoneNumberPrefixWithZero(str2);
        }
        return str.replace("*", "•");
    }

    public static final /* synthetic */ String access$getSubtitle(SummaryView summaryView, getLoadOrigin getloadorigin, String str, String str2) {
        if (setMax(str)) {
            return "";
        }
        return WheelView.ScrollerTask.AnonymousClass2.getMin(str2, true);
    }

    public static final /* synthetic */ void access$renderSummary(SummaryView summaryView, getLoadOrigin getloadorigin) {
        String str;
        String str2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) summaryView._$_findCachedViewById(resetInternal.setMax.isIconified);
        if (appCompatTextView != null) {
            String max = getloadorigin.getMax(summaryView.getContext());
            String str3 = getloadorigin.length.isInside;
            if (setMax(max)) {
                str2 = isOriginHasAppInfo.replaceIndoPhoneNumberPrefixWithZero(str3);
            } else {
                str2 = max.replace("*", "•");
            }
            appCompatTextView.setText(str2);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) summaryView._$_findCachedViewById(resetInternal.setMax.setIconified);
        if (appCompatTextView2 != null) {
            String max2 = getloadorigin.getMax(appCompatTextView2.getContext());
            String floatRange = getloadorigin.toFloatRange();
            if (setMax(max2)) {
                str = "";
            } else {
                str = WheelView.ScrollerTask.AnonymousClass2.getMin(floatRange, true);
            }
            appCompatTextView2.setText(str);
            View view = appCompatTextView2;
            CharSequence text = appCompatTextView2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            view.setVisibility(StringsKt.isBlank(text) ^ true ? 0 : 8);
        }
        summaryView.getMax(getloadorigin);
    }

    public static final /* synthetic */ void access$renderFreeTransfer(SummaryView summaryView, getLoadOrigin getloadorigin) {
        RecipientRibbonView recipientRibbonView = (RecipientRibbonView) summaryView._$_findCachedViewById(resetInternal.setMax.setOnMenuItemClickListener);
        if (recipientRibbonView != null) {
            int i = 0;
            boolean z = true;
            if (getloadorigin.length()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = recipientRibbonView.getContext().getString(R.string.sendmoney_bank_promo_desc_v2);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…money_bank_promo_desc_v2)");
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(getloadorigin.length.Mean$Arithmetic)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                recipientRibbonView.setContent(format);
            }
            View view = recipientRibbonView;
            if (!getloadorigin.length() || getloadorigin.length.Mean$Arithmetic <= 0) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static final /* synthetic */ String access$getMaxErrorAmountToSend(SummaryView summaryView, String str) {
        PayMethodModel payMethodModel;
        CurrencyAmountModel currencyAmountModel;
        String cleanAll;
        BaseActivity baseActivity = summaryView.getBaseActivity();
        String str2 = null;
        if (!(baseActivity instanceof SummaryActivity)) {
            baseActivity = null;
        }
        SummaryActivity summaryActivity = (SummaryActivity) baseActivity;
        if (summaryActivity == null || (payMethodModel = summaryActivity.getPayMethodModel()) == null || (currencyAmountModel = payMethodModel.FastBitmap$CoordinateSystem) == null || (cleanAll = isOriginHasAppInfo.getCleanAll(currencyAmountModel.getMax)) == null) {
            return str;
        }
        boolean z = false;
        int max = DatePickerBridgeExtension.AnonymousClass7.setMax(cleanAll, 0);
        if (max > 0 && max < DatePickerBridgeExtension.AnonymousClass7.setMax(isOriginHasAppInfo.getCleanAll(str), 0)) {
            z = true;
        }
        if (z) {
            str2 = cleanAll;
        }
        return str2 == null ? str : str2;
    }

    public static final /* synthetic */ void access$showWarningMessage(SummaryView summaryView, View view) {
        String str;
        BaseActivity baseActivity = summaryView.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        Activity activity = baseActivity;
        int id2 = view.getId();
        if (id2 == R.id.f37892131362266) {
            str = summaryView.getResources().getString(R.string.amount_not_editable);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.amount_not_editable)");
        } else if (id2 != R.id.f42912131362809) {
            str = "";
        } else {
            str = summaryView.getResources().getString(R.string.remarks_not_editable);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.remarks_not_editable)");
        }
        SwipeRefreshLayout.getMax(activity, 0, R.drawable.bg_rounded_8dp_yellow50, str);
    }
}
