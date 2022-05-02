package id.dana.social;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.cellcomponent.DanaCellRightView;
import id.dana.social.di.module.PrivacySettingModule;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.PrepareException;
import o.cancelAll;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.getProgressViewStartOffset;
import o.getSegment;
import o.getTitleBarRelative;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lid/dana/social/PrivacySettingActivity;", "Lid/dana/base/BaseActivity;", "()V", "deactivateDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDeactivateDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "deactivateDialog$delegate", "Lkotlin/Lazy;", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "loadingDialog", "Lid/dana/dialog/LoadingDialog;", "getLoadingDialog", "()Lid/dana/dialog/LoadingDialog;", "loadingDialog$delegate", "presenter", "Lid/dana/social/contract/PrivacySettingContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/PrivacySettingContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/PrivacySettingContract$Presenter;)V", "changeSwitchColorBasedOnState", "", "checked", "", "getLayout", "", "init", "injectComponent", "setShareFeedSwitchWithNoSideEffect", "isChecked", "setToolbar", "setupDeactivateFeedButton", "setupShareFeedSwitchListener", "setupSwitchColorStateOnly", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PrivacySettingActivity extends BaseActivity {
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private final Lazy getMax = LazyKt.lazy(new getMax(this));
    private HashMap getMin;
    @Inject
    public getTitleBarRelative.setMin presenter;
    private final Lazy setMax = LazyKt.lazy(new getMin(this));

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_privacy_setting;
    }

    public static final /* synthetic */ void access$changeSwitchColorBasedOnState(PrivacySettingActivity privacySettingActivity, boolean z) {
        int length2;
        int min;
        Context baseContext = privacySettingActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1937445128, oncanceled);
            onCancelLoad.getMin(1937445128, oncanceled);
        }
        SwitchCompat switchCompat = (SwitchCompat) privacySettingActivity._$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth);
        Intrinsics.checkNotNullExpressionValue(switchCompat, "share_feed_switch");
        Context context = privacySettingActivity;
        switchCompat.setThumbTintList(cancelAll.setMin(context, R.color.f24762131100430));
        if (z) {
            SwitchCompat switchCompat2 = (SwitchCompat) privacySettingActivity._$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth);
            Intrinsics.checkNotNullExpressionValue(switchCompat2, "share_feed_switch");
            switchCompat2.setTrackTintList(cancelAll.setMin(context, R.color.f18632131099744));
            return;
        }
        SwitchCompat switchCompat3 = (SwitchCompat) privacySettingActivity._$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth);
        Intrinsics.checkNotNullExpressionValue(switchCompat3, "share_feed_switch");
        switchCompat3.setTrackTintList(cancelAll.setMin(context, R.color.f20362131099948));
    }

    @NotNull
    public final getTitleBarRelative.setMin getPresenter() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1084077841, oncanceled);
            onCancelLoad.getMin(1084077841, oncanceled);
        }
        getTitleBarRelative.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmin;
    }

    public final void setPresenter(@NotNull getTitleBarRelative.setMin setmin) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(941971123, oncanceled);
            onCancelLoad.getMin(941971123, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.presenter = setmin;
    }

    @NotNull
    public final AUHorizontalListView.SelectionNotifier getFriendshipAnalyticTracker() {
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        return selectionNotifier;
    }

    public final void setFriendshipAnalyticTracker(@NotNull AUHorizontalListView.SelectionNotifier selectionNotifier) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1214868869, oncanceled);
            onCancelLoad.getMin(1214868869, oncanceled);
        }
        Intrinsics.checkNotNullParameter(selectionNotifier, "<set-?>");
        this.friendshipAnalyticTracker = selectionNotifier;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/LoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<deleteAppInfoById> {
        final /* synthetic */ PrivacySettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(PrivacySettingActivity privacySettingActivity) {
            super(0);
            this.this$0 = privacySettingActivity;
        }

        @NotNull
        public final deleteAppInfoById invoke() {
            return new deleteAppInfoById(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<isBaselineAligned> {
        final /* synthetic */ PrivacySettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(PrivacySettingActivity privacySettingActivity) {
            super(0);
            this.this$0 = privacySettingActivity;
        }

        @NotNull
        public final isBaselineAligned invoke() {
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this.this$0);
            getmax.toFloatRange = this.this$0.getString(R.string.deactivate_feed_dialog_title);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = this.this$0.getString(R.string.deactivate_feed_dialog_desc);
            getProgressViewStartOffset.getMax min = getmax2.getMax(this.this$0.getString(R.string.option_no), new Function1<View, Unit>(this) {
                final /* synthetic */ getMin this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "it");
                    PrivacySettingActivity.access$getDeactivateDialog$p(this.this$0.this$0).dismiss();
                }
            }).setMin(this.this$0.getString(R.string.option_yes), new Function1<View, Unit>(this) {
                final /* synthetic */ getMin this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "it");
                    this.this$0.this$0.getPresenter().getMax();
                    PrivacySettingActivity.access$getDeactivateDialog$p(this.this$0.this$0).dismiss();
                }
            });
            min.toIntRange = 0;
            getProgressViewStartOffset.getMax max = min.setMax(false);
            return new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin();
        }
    }

    public final void init() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(527200604, oncanceled);
            onCancelLoad.getMin(527200604, oncanceled);
        }
        getSegment.length length3 = new getSegment.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length3.getMin = applicationComponent;
            length3.setMin = new PrivacySettingModule(new setMin(this));
            stopIgnoring.setMin(length3.setMin, PrivacySettingModule.class);
            stopIgnoring.setMin(length3.getMin, PrepareException.AnonymousClass1.class);
            new getSegment(length3.setMin, length3.getMin, (byte) 0).length(this);
            setTitle(getResources().getString(R.string.privacy_setting_title));
            setMenuLeftButton((int) R.drawable.arrow_left_white);
            ((SwitchCompat) _$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth)).setOnCheckedChangeListener(new setMax(this));
            ((DanaCellRightView) _$_findCachedViewById(resetInternal.setMax.FractionRes)).setOnClickListener(new length(this));
            getTitleBarRelative.setMin setmin = this.presenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setmin.getMin();
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ PrivacySettingActivity getMin;

        length(PrivacySettingActivity privacySettingActivity) {
            this.getMin = privacySettingActivity;
        }

        public final void onClick(View view) {
            PrivacySettingActivity.access$getDeactivateDialog$p(this.getMin).show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"id/dana/social/PrivacySettingActivity$injectComponent$1", "Lid/dana/social/contract/PrivacySettingContract$View;", "dismissProgress", "", "onErrorSetFeedFeatureSwitch", "active", "", "onErrorSetShareFeed", "consent", "onGetShareFeedConsent", "it", "onSetFeedFeatureSwitch", "showProgress", "toggleShareFeedConsentSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getTitleBarRelative.getMin {
        final /* synthetic */ PrivacySettingActivity getMin;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        setMin(PrivacySettingActivity privacySettingActivity) {
            this.getMin = privacySettingActivity;
        }

        public final void getMax(boolean z) {
            PrivacySettingActivity.access$setShareFeedSwitchWithNoSideEffect(this.getMin, z);
        }

        public final void showProgress() {
            deleteAppInfoById access$getLoadingDialog$p = PrivacySettingActivity.access$getLoadingDialog$p(this.getMin);
            if (!access$getLoadingDialog$p.length.isShowing()) {
                try {
                    access$getLoadingDialog$p.length.show();
                } catch (Exception unused) {
                }
            }
        }

        public final void dismissProgress() {
            PrivacySettingActivity.access$getLoadingDialog$p(this.getMin).getMin();
        }

        public final void length(boolean z) {
            this.getMin.getFriendshipAnalyticTracker().setMin(z);
        }

        public final void getMin(boolean z) {
            PrivacySettingActivity privacySettingActivity = this.getMin;
            privacySettingActivity.showToast(privacySettingActivity.getString(R.string.system_is_busy));
            PrivacySettingActivity.access$setShareFeedSwitchWithNoSideEffect(this.getMin, !z);
        }

        public final void setMax() {
            this.getMin.finish();
        }

        public final void length() {
            PrivacySettingActivity privacySettingActivity = this.getMin;
            privacySettingActivity.showToast(privacySettingActivity.getString(R.string.system_is_busy));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ PrivacySettingActivity length;

        isInside(PrivacySettingActivity privacySettingActivity) {
            this.length = privacySettingActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            PrivacySettingActivity.access$changeSwitchColorBasedOnState(this.length, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "consent", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ PrivacySettingActivity setMin;

        setMax(PrivacySettingActivity privacySettingActivity) {
            this.setMin = privacySettingActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            PrivacySettingActivity.access$changeSwitchColorBasedOnState(this.setMin, z);
            this.setMin.getPresenter().getMax(z);
        }
    }

    public static final /* synthetic */ isBaselineAligned access$getDeactivateDialog$p(PrivacySettingActivity privacySettingActivity) {
        return (isBaselineAligned) privacySettingActivity.setMax.getValue();
    }

    public static final /* synthetic */ void access$setShareFeedSwitchWithNoSideEffect(PrivacySettingActivity privacySettingActivity, boolean z) {
        int length2;
        int min;
        Context baseContext = privacySettingActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-451213907, oncanceled);
            onCancelLoad.getMin(-451213907, oncanceled);
        }
        ((SwitchCompat) privacySettingActivity._$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth)).setOnCheckedChangeListener(new isInside(privacySettingActivity));
        SwitchCompat switchCompat = (SwitchCompat) privacySettingActivity._$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth);
        Intrinsics.checkNotNullExpressionValue(switchCompat, "share_feed_switch");
        switchCompat.setChecked(z);
        ((SwitchCompat) privacySettingActivity._$_findCachedViewById(resetInternal.setMax.compatMeasureContentWidth)).setOnCheckedChangeListener(new setMax(privacySettingActivity));
    }

    public static final /* synthetic */ deleteAppInfoById access$getLoadingDialog$p(PrivacySettingActivity privacySettingActivity) {
        return (deleteAppInfoById) privacySettingActivity.getMax.getValue();
    }
}
