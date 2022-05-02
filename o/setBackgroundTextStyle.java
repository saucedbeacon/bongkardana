package o;

import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.domain.profilemenu.model.SettingModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ScanDataProcessor;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/myprofile/settingconfig/FeedSharingConfigRunner;", "Lid/dana/domain/profilemenu/settingconfig/SettingConfigurationRunner;", "syncRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lid/dana/domain/social/SocialSyncRepository;)V", "getSettingName", "", "performConfiguration", "Lio/reactivex/Observable;", "Lid/dana/domain/profilemenu/model/SettingModel;", "settingModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setBackgroundTextStyle implements sendUcReceiver {
    private final getRequestedModel getMax;

    @NotNull
    public final String getSettingName() {
        return MyProfileMenuAction.FEED_SHARING;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/social/model/FeedInit;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<ScanDataProcessor.ScanData, SettingModel> {
        final /* synthetic */ SettingModel setMin;

        getMin(SettingModel settingModel) {
            this.setMin = settingModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ScanDataProcessor.ScanData scanData = (ScanDataProcessor.ScanData) obj;
            Intrinsics.checkNotNullParameter(scanData, "it");
            SettingModel settingModel = this.setMin;
            settingModel.setInitFeedStatus(scanData.toInitFeed());
            return settingModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            return TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
        }
    }

    @Inject
    public setBackgroundTextStyle(@NotNull getRequestedModel getrequestedmodel) {
        Intrinsics.checkNotNullParameter(getrequestedmodel, "syncRepository");
        this.getMax = getrequestedmodel;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(@Nullable SettingModel settingModel) {
        if (settingModel == null) {
            TitleBarRightButtonView.AnonymousClass1<SettingModel> just = TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(SettingModel.empty())");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = this.getMax.getSocialFeedInitStatus().map(new getMin(settingModel)).onErrorResumeNext(length.setMax);
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "syncRepository.getSocial…el.empty())\n            }");
        return onErrorResumeNext;
    }
}
