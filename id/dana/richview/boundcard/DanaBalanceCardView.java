package id.dana.richview.boundcard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.SavingModule;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.ToggleBalanceView;
import id.dana.richview.boundcard.model.BoundCard;
import id.dana.savings.activity.SavingsActivity;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraView;
import o.DownloadStep;
import o.PrepareException;
import o.SightCameraView;
import o.WheelView;
import o.Workflow;
import o.evaluate;
import o.getBluetoothAdapterState;
import o.getShortName;
import o.initUC7zSo;
import o.isOriginHasAppInfo;
import o.layoutChildWithAnchor;
import o.onDelete;
import o.onNext;
import o.parseBehavior;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.updateCornerMarking;
import o.updateScreenRotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 Q2\u00020\u0001:\u0002QRB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020\u0007H\u0016J\u0019\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0002\u00107J\u0017\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0002\u0010:J\b\u0010;\u001a\u000201H\u0002J\u0010\u0010<\u001a\u0002012\b\u0010,\u001a\u0004\u0018\u00010-J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u000201H\u0014J\b\u0010A\u001a\u000201H\u0002J\u0010\u0010B\u001a\u0002012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u000201H\u0002J\b\u0010G\u001a\u000201H\u0002J\b\u0010H\u001a\u000201H\u0016J\u0010\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\"H\u0002J\u0010\u0010K\u001a\u0002012\u0006\u0010L\u001a\u00020\"H\u0002J\u0010\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020\"H\u0002J\u0010\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020\u000eH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"@BX\u000e¢\u0006\b\n\u0000\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lid/dana/richview/boundcard/DanaBalanceCardView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "boundCard", "Lid/dana/richview/boundcard/model/BoundCard;", "currentCountryCode", "", "data", "getData", "()Lid/dana/richview/boundcard/model/BoundCard;", "setData", "(Lid/dana/richview/boundcard/model/BoundCard;)V", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "entryPoint", "globalNetworkPresenter", "Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;", "getGlobalNetworkPresenter", "()Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;", "setGlobalNetworkPresenter", "(Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;)V", "value", "", "gnState", "setGnState", "(Z)V", "goalsPresenter", "Lid/dana/savings/contract/SavingContract$Presenter;", "getGoalsPresenter", "()Lid/dana/savings/contract/SavingContract$Presenter;", "setGoalsPresenter", "(Lid/dana/savings/contract/SavingContract$Presenter;)V", "onBalanceCardViewListener", "Lid/dana/richview/boundcard/DanaBalanceCardView$OnBalanceCardViewListener;", "toggleBalanceView", "Lid/dana/richview/ToggleBalanceView;", "delayLoadingAnimationBalance", "", "getLayout", "getLongCleanAmount", "", "moneyModel", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "(Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;)Ljava/lang/Long;", "getTotalBalance", "goalBalance", "(Ljava/lang/Long;)Ljava/lang/String;", "gotoTopupPage", "initListener", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onAttachedToWindow", "refresh", "setEntryPoint", "setGoalAndTotalBalance", "savingSummaryModel", "Lid/dana/savings/model/SavingSummaryModel;", "setGoalBalanceClickListener", "setOnClickToggleBalance", "setup", "showGoalAndTotalBalance", "show", "startThreeDotsLoadingBalance", "start", "toggleGoalAndTotalBalance", "on", "updateCountryFlagSquare", "flagUrl", "Companion", "OnBalanceCardViewListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaBalanceCardView extends BaseRichView {
    @NotNull
    public static final length Companion = new length((byte) 0);
    public static final long LOADING_ANIMATION_DELAYED = 1000;
    @Inject
    public getShortName dynamicUrlWrapper;
    /* access modifiers changed from: private */
    public getMax getMax;
    private ToggleBalanceView getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public updateScreenRotation.setMin goalsPresenter;
    /* access modifiers changed from: private */
    public String length;
    private BoundCard setMax;
    private String setMin;
    private HashMap toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/richview/boundcard/DanaBalanceCardView$OnBalanceCardViewListener;", "", "onFinishTopup", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax {
        void getMax();
    }

    @JvmOverloads
    public DanaBalanceCardView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public DanaBalanceCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_base_dana_balance_card;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DanaBalanceCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = new ToggleBalanceView(getContext());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DanaBalanceCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public DanaBalanceCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = new ToggleBalanceView(getContext());
    }

    @NotNull
    public final getShortName getDynamicUrlWrapper() {
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        return getshortname;
    }

    public final void setDynamicUrlWrapper(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "<set-?>");
        this.dynamicUrlWrapper = getshortname;
    }

    @NotNull
    public final onNext.setMin getGlobalNetworkPresenter() {
        onNext.setMin setmin = this.globalNetworkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
        }
        return setmin;
    }

    public final void setGlobalNetworkPresenter(@NotNull onNext.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.globalNetworkPresenter = setmin;
    }

    @NotNull
    public final updateScreenRotation.setMin getGoalsPresenter() {
        updateScreenRotation.setMin setmin = this.goalsPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goalsPresenter");
        }
        return setmin;
    }

    public final void setGoalsPresenter(@NotNull updateScreenRotation.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.goalsPresenter = setmin;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"id/dana/richview/boundcard/DanaBalanceCardView$injectComponent$1", "Lid/dana/globalnetwork/currency/GlobalNetworkListener;", "onGetFlagSquare", "", "url", "", "onGetForexSuccess", "forex", "Lid/dana/domain/globalnetwork/model/Forex;", "onSelectedCountryCode", "gnState", "", "countryCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends Workflow {
        final /* synthetic */ DanaBalanceCardView setMin;

        getMin(DanaBalanceCardView danaBalanceCardView) {
            this.setMin = danaBalanceCardView;
        }

        public final void setMax(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            this.setMin.length = str;
            this.setMin.getGlobalNetworkPresenter().setMax(str);
            this.setMin.getGlobalNetworkPresenter().isInside(str);
            DanaBalanceCardView.access$setGnState$p(this.setMin, z);
            TextView textView = (TextView) this.setMin._$_findCachedViewById(resetInternal.setMax.getThumbOffset);
            if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "ID";
                }
                String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getSymbol();
                if (symbol.equals("IDR")) {
                    symbol = "Rp";
                }
                textView.setText(symbol);
            }
        }

        public final void setMax(@NotNull initUC7zSo inituc7zso) {
            Intrinsics.checkNotNullParameter(inituc7zso, "forex");
            TextView textView = (TextView) this.setMin._$_findCachedViewById(resetInternal.setMax.CustomTabsSessionToken$MockCallback);
            if (textView != null) {
                textView.setText(inituc7zso.getRoundedRate());
            }
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            DanaBalanceCardView.access$updateCountryFlagSquare(this.setMin, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"id/dana/richview/boundcard/DanaBalanceCardView$injectComponent$2", "Lid/dana/savings/contract/SavingViewListener;", "dismissProgress", "", "onGetGoalsBalanceFeature", "enable", "", "onGetSavingSummary", "savingSummaryModel", "Lid/dana/savings/model/SavingSummaryModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends CameraView.AnonymousClass2 {
        final /* synthetic */ DanaBalanceCardView getMin;

        IsOverlapping(DanaBalanceCardView danaBalanceCardView) {
            this.getMin = danaBalanceCardView;
        }

        public final void setMin(boolean z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback);
            int i = 0;
            if (constraintLayout != null) {
                View view = constraintLayout;
                boolean z2 = !z;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(z2 ? 0 : 8);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$SessionFlags);
            if (constraintLayout2 != null) {
                View view2 = constraintLayout2;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                if (!z) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        }

        public final void getMax(@NotNull SightCameraView sightCameraView) {
            Intrinsics.checkNotNullParameter(sightCameraView, "savingSummaryModel");
            DanaBalanceCardView.access$setGoalAndTotalBalance(this.getMin, sightCameraView);
            DanaBalanceCardView.access$setGoalBalanceClickListener(this.getMin);
        }

        public final void showProgress() {
            DanaBalanceCardView.access$startThreeDotsLoadingBalance(this.getMin, true);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.getMin._$_findCachedViewById(resetInternal.setMax.drawableHotspotChanged);
            if (appCompatTextView != null) {
                appCompatTextView.setClickable(false);
            }
        }

        public final void dismissProgress() {
            this.getMin.postOnAnimationDelayed(new setMin(this.getMin), 1000);
        }
    }

    public final void setup() {
        onNext.setMin setmin = this.globalNetworkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
        }
        setmin.setMin();
        length();
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.ensureNavButtonView);
        if (textView != null) {
            textView.setOnClickListener(new toFloatRange(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.pay_topup_button);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new equals(this));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginStart);
        if (textView2 != null) {
            textView2.setOnClickListener(new hashCode(this));
        }
        View findViewById = findViewById(R.id.tbv_pay_content);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tbv_pay_content)");
        ToggleBalanceView toggleBalanceView = (ToggleBalanceView) findViewById;
        this.getMin = toggleBalanceView;
        toggleBalanceView.setToggleBalanceClickListener(new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ DanaBalanceCardView length;

        toFloatRange(DanaBalanceCardView danaBalanceCardView) {
            this.length = danaBalanceCardView;
        }

        public final void onClick(View view) {
            DanaBalanceCardView.access$gotoTopupPage(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ DanaBalanceCardView length;

        equals(DanaBalanceCardView danaBalanceCardView) {
            this.length = danaBalanceCardView;
        }

        public final void onClick(View view) {
            DanaBalanceCardView.access$gotoTopupPage(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ DanaBalanceCardView setMax;

        hashCode(DanaBalanceCardView danaBalanceCardView) {
            this.setMax = danaBalanceCardView;
        }

        public final void onClick(View view) {
            DanaBalanceCardView.access$gotoTopupPage(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "on", "", "onChangeStateToggleBalance"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements ToggleBalanceView.setMin {
        final /* synthetic */ DanaBalanceCardView getMax;

        isInside(DanaBalanceCardView danaBalanceCardView) {
            this.getMax = danaBalanceCardView;
        }

        public final void setMin(boolean z) {
            DanaBalanceCardView.access$toggleGoalAndTotalBalance(this.getMax, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/richview/boundcard/DanaBalanceCardView$gotoTopupPage$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setCancelOnTouchOutside$core {
        final /* synthetic */ DanaBalanceCardView getMax;

        @JvmDefault
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        setMax(DanaBalanceCardView danaBalanceCardView) {
            this.getMax = danaBalanceCardView;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            getMax access$getOnBalanceCardViewListener$p;
            if (this.getMax.getMax != null && (access$getOnBalanceCardViewListener$p = this.getMax.getMax) != null) {
                access$getOnBalanceCardViewListener$p.getMax();
            }
        }
    }

    public final void setEntryPoint(@Nullable String str) {
        this.setMin = str;
    }

    @Nullable
    public final BoundCard getData() {
        return this.setMax;
    }

    public final void setData(@Nullable BoundCard boundCard) {
        this.setMax = boundCard;
        length();
    }

    private final void length() {
        TextView textView;
        if (this.setMax != null && ((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)) != null) {
            BoundCard boundCard = this.setMax;
            Intrinsics.checkNotNull(boundCard);
            if (WheelView.ScrollerTask.AnonymousClass2.getMax(boundCard.invokeSuspend, "****") != null && (textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getCollapseContentDescription)) != null) {
                BoundCard boundCard2 = this.setMax;
                Intrinsics.checkNotNull(boundCard2);
                textView.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(WheelView.ScrollerTask.AnonymousClass2.getMax(boundCard2.invokeSuspend, "****"), true));
            }
        }
    }

    public final void initListener(@Nullable getMax getmax) {
        this.getMax = getmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J2\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J:\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"id/dana/richview/boundcard/DanaBalanceCardView$updateCountryFlagSquare$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString implements parseBehavior<Drawable> {
        final /* synthetic */ DanaBalanceCardView length;

        public final boolean onLoadFailed(@Nullable GlideException glideException, @NotNull Object obj, @NotNull layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
            Intrinsics.checkNotNullParameter(obj, H5GetLogInfoBridge.RESULT_MODEL);
            Intrinsics.checkNotNullParameter(layoutchildwithanchor, "target");
            return false;
        }

        toString(DanaBalanceCardView danaBalanceCardView) {
            this.length = danaBalanceCardView;
        }

        public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
            return length((Drawable) obj, obj2, layoutchildwithanchor, dataSource);
        }

        private boolean length(@Nullable Drawable drawable, @NotNull Object obj, @NotNull layoutChildWithAnchor<Drawable> layoutchildwithanchor, @NotNull DataSource dataSource) {
            Intrinsics.checkNotNullParameter(obj, H5GetLogInfoBridge.RESULT_MODEL);
            Intrinsics.checkNotNullParameter(layoutchildwithanchor, "target");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            ImageView imageView = (ImageView) this.length._$_findCachedViewById(resetInternal.setMax.verifyNotNull);
            if (imageView == null) {
                return true;
            }
            imageView.setImageDrawable(drawable);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ DanaBalanceCardView getMax;

        toIntRange(DanaBalanceCardView danaBalanceCardView) {
            this.getMax = danaBalanceCardView;
        }

        public final void onClick(View view) {
            this.getMax.getBaseActivity().startActivity(this.getMax.getBaseActivity().getIntentClassWithTracking(SavingsActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/richview/boundcard/DanaBalanceCardView$Companion;", "", "()V", "LOADING_ANIMATION_DELAYED", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¨\u0006\u0002"}, d2 = {"<anonymous>", "", "androidx/core/view/ViewKt$postOnAnimationDelayed$runnable$1"}, k = 3, mv = {1, 4, 2}, xi = 48)
    public static final class setMin implements Runnable {
        final /* synthetic */ DanaBalanceCardView setMin;

        public setMin(DanaBalanceCardView danaBalanceCardView) {
            this.setMin = danaBalanceCardView;
        }

        public final void run() {
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.drawableHotspotChanged);
            CharSequence text = appCompatTextView != null ? appCompatTextView.getText() : null;
            if (text == null || StringsKt.isBlank(text)) {
                ThreeDotsLoadingLottieAnimationView threeDotsLoadingLottieAnimationView = (ThreeDotsLoadingLottieAnimationView) this.setMin._$_findCachedViewById(resetInternal.setMax.dispatchSaveInstanceState);
                if (threeDotsLoadingLottieAnimationView != null) {
                    View view = threeDotsLoadingLottieAnimationView;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(0);
                }
                ThreeDotsLoadingLottieAnimationView threeDotsLoadingLottieAnimationView2 = (ThreeDotsLoadingLottieAnimationView) this.setMin._$_findCachedViewById(resetInternal.setMax.restorePresenterStates);
                if (threeDotsLoadingLottieAnimationView2 != null) {
                    View view2 = threeDotsLoadingLottieAnimationView2;
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    view2.setVisibility(0);
                    return;
                }
                return;
            }
            DanaBalanceCardView.access$startThreeDotsLoadingBalance(this.setMin, false);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.drawableHotspotChanged);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setClickable(true);
            }
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r4) {
        Intrinsics.checkNotNullParameter(r4, "applicationComponent");
        DownloadStep.AnonymousClass2.setMax setmax = new DownloadStep.AnonymousClass2.setMax((byte) 0);
        if (r4 != null) {
            setmax.getMin = r4;
            setmax.getMax = new GlobalNetworkModule(new getMin(this));
            setmax.length = new SavingModule(new IsOverlapping(this));
            setmax.length().getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            onNext.setMin setmin = this.globalNetworkPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
            }
            getminArr[0] = setmin;
            updateScreenRotation.setMin setmin2 = this.goalsPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goalsPresenter");
            }
            getminArr[1] = setmin2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setGnState$p(DanaBalanceCardView danaBalanceCardView, boolean z) {
        danaBalanceCardView.toIntRange = z;
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.MediaControllerCompat$Callback$StubCompat);
            if (constraintLayout != null) {
                View view = constraintLayout;
                boolean z2 = danaBalanceCardView.toIntRange;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(z2 ? 0 : 8);
                return;
            }
            return;
        }
        updateScreenRotation.setMin setmin = danaBalanceCardView.goalsPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goalsPresenter");
        }
        setmin.getMin();
        updateScreenRotation.setMin setmin2 = danaBalanceCardView.goalsPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goalsPresenter");
        }
        setmin2.setMin();
    }

    public static final /* synthetic */ void access$updateCountryFlagSquare(DanaBalanceCardView danaBalanceCardView, String str) {
        ImageView imageView = (ImageView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.verifyNotNull);
        if (imageView != null) {
            imageView.setImageResource(0);
        }
        if (!TextUtils.isEmpty(str)) {
            ((updateCornerMarking) Glide.getMax(danaBalanceCardView.getContext())).setMax(str).setMax(evaluate.setMin).getMax(new toString(danaBalanceCardView)).setMax();
        }
    }

    public static final /* synthetic */ void access$setGoalAndTotalBalance(DanaBalanceCardView danaBalanceCardView, SightCameraView sightCameraView) {
        Long l;
        long j;
        Long l2;
        Long l3;
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        MoneyViewModel moneyViewModel = sightCameraView.length;
        String str = "0";
        long j2 = 0;
        Long l4 = null;
        if (moneyViewModel != null) {
            String cleanAll = isOriginHasAppInfo.getCleanAll(moneyViewModel.setMin);
            if (cleanAll == null) {
                cleanAll = str;
            }
            Long longOrNull = StringsKt.toLongOrNull(cleanAll);
            l = Long.valueOf(longOrNull != null ? longOrNull.longValue() : 0);
        } else {
            l = null;
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        String format = NumberFormat.getNumberInstance(locale).format(j);
        MoneyViewModel moneyViewModel2 = sightCameraView.length;
        if (moneyViewModel2 != null) {
            String cleanAll2 = isOriginHasAppInfo.getCleanAll(moneyViewModel2.setMin);
            if (cleanAll2 == null) {
                cleanAll2 = str;
            }
            Long longOrNull2 = StringsKt.toLongOrNull(cleanAll2);
            l2 = Long.valueOf(longOrNull2 != null ? longOrNull2.longValue() : 0);
        } else {
            l2 = null;
        }
        MoneyViewModel activeBalance = danaBalanceCardView.getMin.getActiveBalance();
        if (activeBalance != null) {
            String cleanAll3 = isOriginHasAppInfo.getCleanAll(activeBalance.setMin);
            if (cleanAll3 != null) {
                str = cleanAll3;
            }
            Long longOrNull3 = StringsKt.toLongOrNull(str);
            l3 = Long.valueOf(longOrNull3 != null ? longOrNull3.longValue() : 0);
        } else {
            l3 = null;
        }
        if (l3 != null) {
            long longValue = l3.longValue();
            if (l2 != null) {
                l4 = Long.valueOf(l2.longValue() + longValue);
            }
        }
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale2 = WheelView.OnWheelViewListener.getMax;
        if (l4 != null) {
            j2 = l4.longValue();
        }
        String format2 = NumberFormat.getNumberInstance(locale2).format(j2);
        Intrinsics.checkNotNullExpressionValue(format2, "NumberFormatterUtil.getC…ale(), totalBalance ?: 0)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.drawableHotspotChanged);
        if (appCompatTextView != null) {
            appCompatTextView.setText(format);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.onNotifyNotificationWithChannel);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(format2);
        }
    }

    public static final /* synthetic */ void access$setGoalBalanceClickListener(DanaBalanceCardView danaBalanceCardView) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.drawableHotspotChanged);
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new toIntRange(danaBalanceCardView));
        }
    }

    public static final /* synthetic */ void access$startThreeDotsLoadingBalance(DanaBalanceCardView danaBalanceCardView, boolean z) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.setOnStateDescriptionOnRAndAbove);
        if (appCompatTextView != null) {
            getBluetoothAdapterState.length(appCompatTextView, !z, 4);
        }
        LinearLayout linearLayout = (LinearLayout) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.stopDispatchingItemsChanged);
        if (linearLayout != null) {
            getBluetoothAdapterState.length(linearLayout, !z, 8);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.TrustedWebActivityService);
        if (appCompatTextView2 != null) {
            getBluetoothAdapterState.length(appCompatTextView2, !z, 4);
        }
        LinearLayout linearLayout2 = (LinearLayout) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.getRootMenu);
        if (linearLayout2 != null) {
            getBluetoothAdapterState.length(linearLayout2, !z, 4);
        }
        ThreeDotsLoadingLottieAnimationView threeDotsLoadingLottieAnimationView = (ThreeDotsLoadingLottieAnimationView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.dispatchSaveInstanceState);
        if (threeDotsLoadingLottieAnimationView != null) {
            getBluetoothAdapterState.length(threeDotsLoadingLottieAnimationView, z, 8);
        }
        ThreeDotsLoadingLottieAnimationView threeDotsLoadingLottieAnimationView2 = (ThreeDotsLoadingLottieAnimationView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.restorePresenterStates);
        if (threeDotsLoadingLottieAnimationView2 != null) {
            getBluetoothAdapterState.length(threeDotsLoadingLottieAnimationView2, z, 8);
        }
    }

    public static final /* synthetic */ void access$gotoTopupPage(DanaBalanceCardView danaBalanceCardView) {
        String str;
        onNext.setMin setmin = danaBalanceCardView.globalNetworkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPresenter");
        }
        if (setmin.getMin(danaBalanceCardView.length)) {
            StringBuilder sb = new StringBuilder();
            getShortName getshortname = danaBalanceCardView.dynamicUrlWrapper;
            if (getshortname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
            }
            sb.append(getshortname.getTopupUrl(danaBalanceCardView.setMin));
            sb.append("&countryCode=");
            sb.append(danaBalanceCardView.length);
            str = sb.toString();
        } else {
            getShortName getshortname2 = danaBalanceCardView.dynamicUrlWrapper;
            if (getshortname2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
            }
            str = getshortname2.getTopupUrl(danaBalanceCardView.setMin);
        }
        Intrinsics.checkNotNullExpressionValue(str, "url");
        DanaH5.startContainerFullUrl(str, new setMax(danaBalanceCardView));
    }

    public static final /* synthetic */ void access$toggleGoalAndTotalBalance(DanaBalanceCardView danaBalanceCardView, boolean z) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.drawableHotspotChanged);
        if (appCompatTextView != null) {
            getBluetoothAdapterState.length(appCompatTextView, z, 8);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.onNotifyNotificationWithChannel);
        if (appCompatTextView2 != null) {
            getBluetoothAdapterState.length(appCompatTextView2, z, 8);
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.setTitleMargin);
        if (appCompatTextView3 != null) {
            getBluetoothAdapterState.length(appCompatTextView3, !z, 8);
        }
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) danaBalanceCardView._$_findCachedViewById(resetInternal.setMax.onAreNotificationsEnabled);
        if (appCompatTextView4 != null) {
            getBluetoothAdapterState.length(appCompatTextView4, !z, 8);
        }
    }
}
