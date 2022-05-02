package id.dana.social.di.module;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.getRightButton;
import o.getTitleBarRelative;
import o.rememberWindowAttachCount;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/social/di/module/PrivacySettingModule;", "", "view", "Lid/dana/social/contract/PrivacySettingContract$View;", "(Lid/dana/social/contract/PrivacySettingContract$View;)V", "getView", "()Lid/dana/social/contract/PrivacySettingContract$View;", "provideFriendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "context", "Landroid/content/Context;", "providePrivacySettingModule", "providePrivacySettingPresenter", "Lid/dana/social/contract/PrivacySettingContract$Presenter;", "presenter", "Lid/dana/social/contract/PrivacySettingPresenter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class PrivacySettingModule {
    @NotNull
    private final getTitleBarRelative.getMin setMin;

    public PrivacySettingModule(@NotNull getTitleBarRelative.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMin = getmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getTitleBarRelative.getMin getMin() {
        return this.setMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getTitleBarRelative.setMin getMin(@NotNull getRightButton getrightbutton) {
        Intrinsics.checkNotNullParameter(getrightbutton, "presenter");
        return getrightbutton;
    }

    @NotNull
    @PerActivity
    @Provides
    public final AUHorizontalListView.SelectionNotifier setMax(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return new rememberWindowAttachCount(context);
    }
}
