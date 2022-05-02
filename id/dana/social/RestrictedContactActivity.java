package id.dana.social;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.social.di.module.SocialCommonModule;
import id.dana.social.fragment.BlockedFragment;
import id.dana.social.fragment.MutedFragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.LogLiteManager;
import o.PrepareException;
import o.SwipeRefreshLayout;
import o.dispatchOnCancelled;
import o.getSelectedIndex;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setUserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lid/dana/social/RestrictedContactActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/social/RestrictedContactActivtyInteractor;", "()V", "viewPagerAdapter", "Lid/dana/social/adapter/BaseTabFragmentAdapter;", "getViewPagerAdapter", "()Lid/dana/social/adapter/BaseTabFragmentAdapter;", "viewPagerAdapter$delegate", "Lkotlin/Lazy;", "getExtras", "", "getLayout", "", "iniInjection", "init", "initViewPager", "onClickLeftMenuButton", "view", "Landroid/view/View;", "setToolbar", "showDialogToast", "message", "", "showErrorToast", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RestrictedContactActivity extends BaseActivity implements setUserInfo {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    @NotNull
    public static final String EXTRA_RELATIONSHIP_TYPE = "RELATIONSHIP_TYPE";
    @NotNull
    public static final String RELATIONSHIP_TYPE_FOLLOWER = "FOLLOWER";
    @NotNull
    public static final String RELATIONSHIP_TYPE_FOLLOWING = "FOLLOWING";
    private final Lazy getMax = LazyKt.lazy(new setMax(this));
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1481036194, oncanceled);
            onCancelLoad.getMin(1481036194, oncanceled);
        }
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-2113999690, oncanceled);
            onCancelLoad.getMin(-2113999690, oncanceled);
        }
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
        return R.layout.activity_restricted_contact;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/adapter/BaseTabFragmentAdapter;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<LogLiteManager> {
        final /* synthetic */ RestrictedContactActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(RestrictedContactActivity restrictedContactActivity) {
            super(0);
            this.this$0 = restrictedContactActivity;
        }

        @NotNull
        public final LogLiteManager invoke() {
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return new LogLiteManager(supportFragmentManager);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/social/RestrictedContactActivity$iniInjection$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getSelectedIndex.setMax {
        public final void dismissProgress() {
        }

        public final void onError(@Nullable String str) {
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        public final void showProgress() {
        }

        setMin() {
        }
    }

    public final void onClickLeftMenuButton(@Nullable View view) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2025377590, oncanceled);
            onCancelLoad.getMin(2025377590, oncanceled);
        }
        onBackPressed();
    }

    public final void showDialogToast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        SwipeRefreshLayout.length(this, R.drawable.ic_check_24_green50_filled_circle, R.drawable.bg_rounded_border_green_50, str);
    }

    public final void showErrorToast() {
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        String string = getString(R.string.modify_relationship_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.modify_relationship_error)");
        SwipeRefreshLayout.length(this, R.drawable.ic_close_red, R.drawable.bg_rounded_border_red_50, string);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/RestrictedContactActivity$Companion;", "", "()V", "BLOCKED_CONTACTS_FRAGMENT_INDEX", "", "EXTRA_RELATIONSHIP_TYPE", "", "MUTED_CONTACTS_FRAGMENT_INDEX", "RELATIONSHIP_TYPE_FOLLOWER", "RELATIONSHIP_TYPE_FOLLOWING", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void init() {
        Bundle extras;
        int max;
        int length;
        int length2;
        int min;
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        new SocialCommonModule(new setMin());
        applicationComponent.onSessionDestroyed();
        Context baseContext = getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-941381354, oncanceled);
            onCancelLoad.getMin(-941381354, oncanceled);
        }
        setTitle(getResources().getString(R.string.restricted_contact_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(resetInternal.setMax.setTransitionState);
        if (viewPager != null) {
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length, 4);
                onCancelLoad.setMax(-2144208195, oncanceled2);
                onCancelLoad.getMin(-2144208195, oncanceled2);
            }
            LogLiteManager logLiteManager = (LogLiteManager) this.getMax.getValue();
            String string = getResources().getString(R.string.muted_contacts_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.muted_contacts_title)");
            logLiteManager.setMin(new MutedFragment(), string);
            String string2 = getResources().getString(R.string.blocked_contacts_title);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…g.blocked_contacts_title)");
            logLiteManager.setMin(new BlockedFragment(), string2);
            Unit unit = Unit.INSTANCE;
            viewPager.setAdapter(logLiteManager);
        }
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(resetInternal.setMax.getFixedWidthMinor);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager((ViewPager) _$_findCachedViewById(resetInternal.setMax.setTransitionState));
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || 2104594482 == (max = dispatchOnCancelled.getMax(applicationContext3, 2104594482)))) {
            onCanceled oncanceled3 = new onCanceled(2104594482, max, 512);
            onCancelLoad.setMax(2104594482, oncanceled3);
            onCancelLoad.getMin(2104594482, oncanceled3);
        }
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            str = extras.getString(EXTRA_RELATIONSHIP_TYPE);
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -742456719) {
                if (hashCode == 1084428318 && str.equals(RELATIONSHIP_TYPE_FOLLOWER)) {
                    ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(resetInternal.setMax.setTransitionState);
                    Intrinsics.checkNotNullExpressionValue(viewPager2, "vp_feeds");
                    viewPager2.setCurrentItem(1);
                    return;
                }
            } else if (str.equals(RELATIONSHIP_TYPE_FOLLOWING)) {
                ViewPager viewPager3 = (ViewPager) _$_findCachedViewById(resetInternal.setMax.setTransitionState);
                Intrinsics.checkNotNullExpressionValue(viewPager3, "vp_feeds");
                viewPager3.setCurrentItem(0);
                return;
            }
            ViewPager viewPager4 = (ViewPager) _$_findCachedViewById(resetInternal.setMax.setTransitionState);
            Intrinsics.checkNotNullExpressionValue(viewPager4, "vp_feeds");
            viewPager4.setCurrentItem(0);
        }
    }
}
