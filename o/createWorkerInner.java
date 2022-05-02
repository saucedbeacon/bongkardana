package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/myprofile/settingconfig/NicknameChangeConfigRunner;", "Lid/dana/domain/profilemenu/settingconfig/SettingConfigurationRunner;", "context", "Landroid/content/Context;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Landroid/content/Context;Lid/dana/domain/user/repository/UserRepository;Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "getContext", "()Landroid/content/Context;", "getSettingName", "", "performConfiguration", "Lio/reactivex/Observable;", "Lid/dana/domain/profilemenu/model/SettingModel;", "settingModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createWorkerInner implements sendUcReceiver {
    @NotNull
    final Context getMin;
    private final onDescriptorWrite length;
    /* access modifiers changed from: private */
    public final setDefaultFontSize setMax;

    @NotNull
    public final String getSettingName() {
        return "setting_change_name";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
        public static final getMax getMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            return TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/user/UserInfoResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<disconnect, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
        final /* synthetic */ SettingModel setMax;
        final /* synthetic */ createWorkerInner setMin;

        setMax(createWorkerInner createworkerinner, SettingModel settingModel) {
            this.setMin = createworkerinner;
            this.setMax = settingModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "it");
            return this.setMin.setMax.isChangeUsernameEnabled().map(new RedDotDrawable<Boolean, SettingModel>(this) {
                final /* synthetic */ setMax getMax;

                {
                    this.getMax = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    Intrinsics.checkNotNullParameter(bool, "usernameEnabled");
                    SettingModel settingModel = this.getMax.setMax;
                    settingModel.setNeedToShow(true);
                    settingModel.setEnable(true);
                    settingModel.setSubtitle(disconnect.getNickname());
                    if (disconnect.isPremiumUser()) {
                        settingModel.setTitle(this.getMax.setMin.getMin.getString(R.string.change_name));
                        settingModel.setViewType(4);
                    } else {
                        settingModel.setTitle(this.getMax.setMin.getMin.getString(R.string.change_name_non_kyc));
                        settingModel.setViewType(2);
                    }
                    if (bool.booleanValue() && !disconnect.isPremiumUser()) {
                        settingModel.setNeedToShow(false);
                        settingModel.setEnable(false);
                    }
                    return settingModel;
                }
            });
        }
    }

    @Inject
    public createWorkerInner(@NotNull Context context, @NotNull onDescriptorWrite ondescriptorwrite, @NotNull setDefaultFontSize setdefaultfontsize) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        this.getMin = context;
        this.length = ondescriptorwrite;
        this.setMax = setdefaultfontsize;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(@Nullable SettingModel settingModel) {
        if (settingModel == null) {
            TitleBarRightButtonView.AnonymousClass1<SettingModel> just = TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(SettingModel.empty())");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = this.length.getUserInfo().flatMap(new setMax(this, settingModel)).onErrorResumeNext(getMax.getMin);
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "userRepository.userInfo.…gModel.empty())\n        }");
        return onErrorResumeNext;
    }
}
