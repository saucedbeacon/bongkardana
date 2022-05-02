package id.dana.investment.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.InvestmentModule;
import id.dana.domain.investment.AccountInvestmentStatus;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.HomeWidgetBase;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.GriverAppLanguageExtensionImpl;
import o.GriverBridgeNotFoundExtension;
import o.GriverGeoLocationExtensionImpl;
import o.IntRange;
import o.PrepareException;
import o.onDelete;
import o.resetInternal;
import o.setLineVisible;
import o.stopIgnoring;
import o.writeToFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00010B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J,\u0010\"\u001a\u00020\u001b2\b\b\u0001\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u001c\u0010)\u001a\u00020\u001b2\b\b\u0001\u0010*\u001a\u00020\u00072\b\b\u0001\u0010+\u001a\u00020\u0007H\u0002J\u0012\u0010,\u001a\u00020\u001b2\b\b\u0001\u0010-\u001a\u00020\u0007H\u0002J\b\u0010.\u001a\u00020\u001bH\u0016J\f\u0010/\u001a\u00020\u001b*\u00020(H\u0002R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00061"}, d2 = {"Lid/dana/investment/view/HomeInvestmentView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "investmentPresenter", "Lid/dana/investment/contract/InvestmentContract$Presenter;", "getInvestmentPresenter", "()Lid/dana/investment/contract/InvestmentContract$Presenter;", "setInvestmentPresenter", "(Lid/dana/investment/contract/InvestmentContract$Presenter;)V", "listener", "Lid/dana/investment/view/HomeInvestmentView$InvestmentViewListener;", "getListener", "()Lid/dana/investment/view/HomeInvestmentView$InvestmentViewListener;", "setListener", "(Lid/dana/investment/view/HomeInvestmentView$InvestmentViewListener;)V", "getInvestmentModule", "Lid/dana/di/modules/InvestmentModule;", "getLayout", "initBaseWidgetButtonClickListener", "", "initInjection", "onAttachedToWindow", "refreshPortfolio", "renderInvestmentView", "userInvestmentModel", "Lid/dana/investment/model/UserInvestmentModel;", "setContent", "widgetDescriptionRes", "title", "", "subtitle", "gainLossAmount", "Lid/dana/investment/model/MultiCurrencyMoneyViewModel;", "setGainLossView", "textColor", "drawable", "setPortfolioTextAppearance", "resId", "setup", "checkIsAmountLoss", "InvestmentViewListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HomeInvestmentView extends BaseRichView {
    @Inject
    public GriverAppLanguageExtensionImpl.length investmentPresenter;
    public setMax listener;
    private HashMap setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/investment/view/HomeInvestmentView$InvestmentViewListener;", "", "onGetInvestmentMoreForYouEnable", "", "isEnable", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMax(boolean z);
    }

    @JvmOverloads
    public HomeInvestmentView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public HomeInvestmentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_home_investment;
    }

    @NotNull
    public final GriverAppLanguageExtensionImpl.length getInvestmentPresenter() {
        GriverAppLanguageExtensionImpl.length length2 = this.investmentPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentPresenter");
        }
        return length2;
    }

    public final void setInvestmentPresenter(@NotNull GriverAppLanguageExtensionImpl.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.investmentPresenter = length2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeInvestmentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeInvestmentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public HomeInvestmentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final setMax getListener() {
        setMax setmax = this.listener;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return setmax;
    }

    public final void setListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.listener = setmax;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((HomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.WorkerThread)).getButtonView().setOnClickListener(getMin.setMin);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        public final void onClick(View view) {
            DanaH5.startContainerFullUrl("https://m.dana.id/i/dana-finance/mmf/topup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/investment/view/HomeInvestmentView$getInvestmentModule$1", "Lid/dana/investment/contract/InvestmentContract$View;", "onGetUserInvestmentSummary", "", "userInvestmentModel", "Lid/dana/investment/model/UserInvestmentModel;", "onSuccessCheckInvestmentFeature", "enable", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements GriverAppLanguageExtensionImpl.getMax {
        final /* synthetic */ HomeInvestmentView setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(HomeInvestmentView homeInvestmentView) {
            this.setMin = homeInvestmentView;
        }

        public final void setMin(boolean z) {
            if (z) {
                this.setMin.getInvestmentPresenter().setMin();
            } else {
                this.setMin.getListener().getMax(false);
            }
        }

        public final void setMax(@NotNull GriverGeoLocationExtensionImpl.AnonymousClass3 r4) {
            Intrinsics.checkNotNullParameter(r4, "userInvestmentModel");
            if (r4.setMax == AccountInvestmentStatus.ACTIVE) {
                HomeWidgetBase homeWidgetBase = (HomeWidgetBase) this.setMin._$_findCachedViewById(resetInternal.setMax.WorkerThread);
                if (homeWidgetBase != null) {
                    View view = homeWidgetBase;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(0);
                }
                HomeInvestmentView.access$renderInvestmentView(this.setMin, r4);
                this.setMin.getListener().getMax(false);
                return;
            }
            HomeWidgetBase homeWidgetBase2 = (HomeWidgetBase) this.setMin._$_findCachedViewById(resetInternal.setMax.WorkerThread);
            if (homeWidgetBase2 != null) {
                View view2 = homeWidgetBase2;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
            this.setMin.getListener().getMax(true);
        }
    }

    public final void refreshPortfolio() {
        GriverAppLanguageExtensionImpl.length length2 = this.investmentPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("investmentPresenter");
        }
        length2.getMax();
    }

    private final void getMax(@StringRes int i, String str, String str2, GriverBridgeNotFoundExtension.AnonymousClass1 r6) {
        HomeWidgetBase homeWidgetBase = (HomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.WorkerThread);
        if (homeWidgetBase != null) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(widgetDescriptionRes)");
            homeWidgetBase.setDescriptionText(string);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setOnCloseListener);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setOnQueryTextListener);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        if (r6 != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.ListPopupWindow);
            if (appCompatTextView != null) {
                appCompatTextView.setText(r6.length != null ? setLineVisible.length(new CurrencyAmountModel(String.valueOf(r6.length), r6.setMax)) : "");
            }
            if (r6.length()) {
                setMin(R.color.f23802131100313, R.drawable.ic_investment_loss);
            } else {
                setMin(R.color.f20302131099938, R.drawable.ic_investment_gain);
            }
        }
    }

    private final void setMin(@ColorRes int i, @DrawableRes int i2) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.supportInvalidateOptionsMenu);
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i2);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.ListPopupWindow);
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(IntRange.setMax(getContext(), i));
        }
    }

    public final void setup() {
        writeToFile.getMin getmin = new writeToFile.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.getMin = applicationComponent;
            getmin.length = new InvestmentModule(new length(this));
            stopIgnoring.setMin(getmin.length, InvestmentModule.class);
            stopIgnoring.setMin(getmin.getMin, PrepareException.AnonymousClass1.class);
            new writeToFile(getmin.length, getmin.getMin, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            GriverAppLanguageExtensionImpl.length length2 = this.investmentPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("investmentPresenter");
            }
            getminArr[0] = length2;
            registerPresenter(getminArr);
            GriverAppLanguageExtensionImpl.length length3 = this.investmentPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("investmentPresenter");
            }
            length3.getMax();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$renderInvestmentView(HomeInvestmentView homeInvestmentView, GriverGeoLocationExtensionImpl.AnonymousClass3 r18) {
        Long l;
        HomeInvestmentView homeInvestmentView2 = homeInvestmentView;
        GriverGeoLocationExtensionImpl.AnonymousClass3 r1 = r18;
        GriverBridgeNotFoundExtension.AnonymousClass1 r2 = r1.getMax;
        Long l2 = null;
        if (r2 != null) {
            l = r2.length;
        } else {
            l = null;
        }
        if (l != null && l.longValue() == 0) {
            String string = homeInvestmentView.getContext().getString(R.string.investment_balance_title_empty);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ment_balance_title_empty)");
            String string2 = homeInvestmentView.getContext().getString(R.string.investment_balance_subtitle_empty);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…t_balance_subtitle_empty)");
            homeInvestmentView2.getMax(R.string.investment_home_balance_description_empty, string, string2, (GriverBridgeNotFoundExtension.AnonymousClass1) null);
            AppCompatImageView appCompatImageView = (AppCompatImageView) homeInvestmentView2._$_findCachedViewById(resetInternal.setMax.supportInvalidateOptionsMenu);
            if (appCompatImageView != null) {
                View view = appCompatImageView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) homeInvestmentView2._$_findCachedViewById(resetInternal.setMax.ListPopupWindow);
            if (appCompatTextView != null) {
                View view2 = appCompatTextView;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
            TextViewCompat.setMax((TextView) homeInvestmentView2._$_findCachedViewById(resetInternal.setMax.setOnCloseListener), (int) R.style.f82382131952339);
            return;
        }
        GriverBridgeNotFoundExtension.AnonymousClass1 r6 = r1.getMax;
        String str = "";
        String length2 = r6 != null ? r6.length != null ? setLineVisible.length(new CurrencyAmountModel(String.valueOf(r6.length), r6.setMax)) : str : null;
        Intrinsics.checkNotNull(length2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Context context = homeInvestmentView.getContext();
        boolean z = true;
        Object[] objArr = new Object[1];
        Long l3 = r1.getMin;
        if (l3 != null) {
            if (l3.longValue() <= 0) {
                z = false;
            }
            if (z) {
                l2 = l3;
            }
            if (l2 != null) {
                str = new SimpleDateFormat("dd/MM/yy", Locale.getDefault()).format(new Date(l2.longValue()));
                Intrinsics.checkNotNullExpressionValue(str, "DateTimeUtil.getDateTime…ocale.getDefault(), this)");
            }
        }
        objArr[0] = str;
        String string3 = context.getString(R.string.dana_plus_home_last_updated, objArr);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…odel.showFormattedDate())");
        String format = String.format(string3, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        homeInvestmentView2.getMax(R.string.dana_plus_home_subtitle, length2, format, r1.setMin);
        TextViewCompat.setMax((TextView) homeInvestmentView2._$_findCachedViewById(resetInternal.setMax.setOnCloseListener), (int) R.style.f82412131952342);
    }
}
