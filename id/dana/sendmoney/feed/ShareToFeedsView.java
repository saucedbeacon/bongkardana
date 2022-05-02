package id.dana.sendmoney.feed;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.social.contract.share.ShareToFeedsModule;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUTitleBar;
import o.PrepareException;
import o.getProgressViewStartOffset;
import o.handleScrollChange;
import o.isBaselineAligned;
import o.onDelete;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010'\u001a\u00020\u0007H\u0016J\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\"H\u0014J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"J\b\u00102\u001a\u00020+H\u0002J\b\u00103\u001a\u00020+H\u0016J\b\u00104\u001a\u00020+H\u0004J\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020706*\u00020\u0003H\u0002J\f\u00108\u001a\u000209*\u00020\u0003H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lid/dana/sendmoney/feed/ShareToFeedsView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "feedSharingDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getFeedSharingDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "feedSharingDialog$delegate", "Lkotlin/Lazy;", "onActivateButtonClickListener", "Landroid/view/View$OnClickListener;", "getOnActivateButtonClickListener", "()Landroid/view/View$OnClickListener;", "setOnActivateButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "onCheckListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getOnCheckListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "presenter", "Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;)V", "shareFeedConsent", "", "getShareFeedConsent", "()Z", "setShareFeedConsent", "(Z)V", "getLayout", "getShareToFeedsModule", "Lid/dana/social/contract/share/ShareToFeedsModule;", "injectComponent", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "injected", "isInjected", "isChecked", "isNeedToActivateFeedsSharing", "openBottomSheetInformationViewList", "setup", "showActivateFeedSharingDialog", "getOnBoardingContents", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "getOnBoardingModel", "Lid/dana/usereducation/model/OnBoardingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class ShareToFeedsView extends BaseRichView {
    @NotNull
    private View.OnClickListener getMax;
    private final Lazy getMin;
    @Inject
    public handleScrollChange.getMin presenter;
    private HashMap setMax;
    private boolean setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        public static final setMin setMax = new setMin();

        setMin() {
        }

        public final void onClick(View view) {
        }
    }

    @JvmOverloads
    public ShareToFeedsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ShareToFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
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

    public int getLayout() {
        return R.layout.view_share_to_feed;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<isBaselineAligned> {
        final /* synthetic */ ShareToFeedsView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ShareToFeedsView shareToFeedsView) {
            super(0);
            this.this$0 = shareToFeedsView;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/sendmoney/feed/ShareToFeedsView$feedSharingDialog$2$1$2"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(getMax getmax) {
                super(1);
                this.this$0 = getmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.this$0.this$0._$_findCachedViewById(resetInternal.setMax.getPackageName);
                if (appCompatCheckBox != null) {
                    appCompatCheckBox.setChecked(true);
                }
                ShareToFeedsView.access$getFeedSharingDialog$p(this.this$0.this$0).dismiss();
                this.this$0.this$0.getOnActivateButtonClickListener().onClick(view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke", "id/dana/sendmoney/feed/ShareToFeedsView$feedSharingDialog$2$1$1"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(getMax getmax) {
                super(1);
                this.this$0 = getmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.this$0.this$0._$_findCachedViewById(resetInternal.setMax.getPackageName);
                if (appCompatCheckBox != null) {
                    appCompatCheckBox.setChecked(false);
                }
                ShareToFeedsView.access$getFeedSharingDialog$p(this.this$0.this$0).dismiss();
            }
        }

        @NotNull
        public final isBaselineAligned invoke() {
            Context context = this.this$0.getContext();
            Context context2 = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context2);
            getmax.toFloatRange = context.getString(R.string.feed_sharing_activation_dialog_title);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = context.getString(R.string.feed_sharing_activation_dialog_desc);
            getProgressViewStartOffset.getMax min = getmax2.getMax(context.getString(R.string.option_cancel), new setMin(this)).setMin(context.getString(R.string.activate), new getMin(this));
            min.toIntRange = 0;
            getProgressViewStartOffset.getMax max = min.setMax(false);
            return new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareToFeedsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareToFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = LazyKt.lazy(new getMax(this));
        this.getMax = setMin.setMax;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ShareToFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = LazyKt.lazy(new getMax(this));
        this.getMax = setMin.setMax;
    }

    public final boolean getShareFeedConsent() {
        return this.setMin;
    }

    public final void setShareFeedConsent(boolean z) {
        this.setMin = z;
    }

    @NotNull
    public final View.OnClickListener getOnActivateButtonClickListener() {
        return this.getMax;
    }

    public final void setOnActivateButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.getMax = onClickListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class length implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ ShareToFeedsView getMin;

        length(ShareToFeedsView shareToFeedsView) {
            this.getMin = shareToFeedsView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z && !this.getMin.getShareFeedConsent()) {
                this.getMin.showActivateFeedSharingDialog();
            }
        }
    }

    @NotNull
    public final handleScrollChange.getMin getPresenter() {
        handleScrollChange.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull handleScrollChange.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ ShareToFeedsView setMax;

        setMax(ShareToFeedsView shareToFeedsView) {
            this.setMax = shareToFeedsView;
        }

        public final void onClick(View view) {
            ShareToFeedsView.access$openBottomSheetInformationViewList(this.setMax);
        }
    }

    public void setup() {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.ActionBar$DisplayOptions);
        if (imageView != null) {
            imageView.setOnClickListener(new setMax(this));
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(resetInternal.setMax.getPackageName);
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(new length(this));
        }
    }

    public void injected(boolean z) {
        if (z && this.presenter != null) {
            handleScrollChange.getMin getmin = this.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/sendmoney/feed/ShareToFeedsView$getShareToFeedsModule$1", "Lid/dana/social/contract/share/ShareToFeedsContract$View;", "onGetInitialShareFeedsConsent", "", "active", "", "onGetLastCheckedState", "checked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements handleScrollChange.setMax {
        final /* synthetic */ ShareToFeedsView getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(ShareToFeedsView shareToFeedsView) {
            this.getMax = shareToFeedsView;
        }

        public final void getMax(boolean z) {
            this.getMax.setShareFeedConsent(z);
        }
    }

    public final boolean isChecked() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(resetInternal.setMax.getPackageName);
        if (appCompatCheckBox != null) {
            return appCompatCheckBox.isChecked();
        }
        return false;
    }

    public final boolean isNeedToActivateFeedsSharing() {
        return isChecked() && !this.setMin;
    }

    public void injectComponent(@NotNull PrepareException.AnonymousClass1 r4) {
        Intrinsics.checkNotNullParameter(r4, "applicationComponent");
        AUTitleBar.AnonymousClass1.setMin setmin = new AUTitleBar.AnonymousClass1.setMin((byte) 0);
        if (r4 != null) {
            setmin.setMin = r4;
            setmin.getMax = new ShareToFeedsModule(new getMin(this));
            stopIgnoring.setMin(setmin.getMax, ShareToFeedsModule.class);
            stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
            new AUTitleBar.AnonymousClass1(setmin.getMax, setmin.setMin, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            handleScrollChange.getMin getmin = this.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = getmin;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void showActivateFeedSharingDialog() {
        ((isBaselineAligned) this.getMin.getValue()).show();
    }

    public static final /* synthetic */ void access$openBottomSheetInformationViewList(ShareToFeedsView shareToFeedsView) {
        Context context = shareToFeedsView.getContext();
        if (context != null) {
            BottomSheetHelpActivity.getMin getmin = BottomSheetHelpActivity.Companion;
            String string = context.getString(R.string.bottom_on_boarding_share_to_feed_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…ding_share_to_feed_title)");
            String string2 = context.getString(R.string.bottom_on_boarding_share_to_feed_first_subtitle);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…e_to_feed_first_subtitle)");
            String string3 = context.getString(R.string.bottom_on_boarding_share_to_feed_first_desc);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.botto…share_to_feed_first_desc)");
            String string4 = context.getString(R.string.bottom_on_boarding_share_to_feed_second_subtitle);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.botto…_to_feed_second_subtitle)");
            String string5 = context.getString(R.string.bottom_on_boarding_share_to_feed_second_desc);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.botto…hare_to_feed_second_desc)");
            String string6 = context.getString(R.string.bottom_on_boarding_share_to_feed_third_subtitle);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.botto…e_to_feed_third_subtitle)");
            String string7 = context.getString(R.string.bottom_on_boarding_share_to_feed_third_desc);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.botto…share_to_feed_third_desc)");
            context.startActivity(BottomSheetHelpActivity.getMin.length(context, new OnBoardingModel(string, BottomSheetType.LIST, CollectionsKt.listOf(new ContentOnBoardingModel((int) R.drawable.ic_onboarding_s2f_first, string2, string3), new ContentOnBoardingModel((int) R.drawable.ic_onboarding_s2f_second, string4, string5), new ContentOnBoardingModel((int) R.drawable.ic_onboarding_s2f_third, string6, string7))), false));
        }
    }

    public static final /* synthetic */ isBaselineAligned access$getFeedSharingDialog$p(ShareToFeedsView shareToFeedsView) {
        return (isBaselineAligned) shareToFeedsView.getMin.getValue();
    }
}
