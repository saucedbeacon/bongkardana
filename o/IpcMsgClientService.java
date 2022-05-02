package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.data.profilemenu.MyProfileMenuCategories;
import id.dana.domain.profilemenu.model.SettingModel;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.WorkerBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/myprofile/settingconfig/UsernameChangeConfigRunner;", "Lid/dana/domain/profilemenu/settingconfig/SettingConfigurationRunner;", "context", "Landroid/content/Context;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Landroid/content/Context;Lid/dana/domain/user/repository/UserRepository;Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "getContext", "()Landroid/content/Context;", "getSettingName", "", "performConfiguration", "Lio/reactivex/Observable;", "Lid/dana/domain/profilemenu/model/SettingModel;", "settingModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IpcMsgClientService implements sendUcReceiver {
    @NotNull
    final Context getMin;
    /* access modifiers changed from: private */
    public final setDefaultFontSize length;
    private final onDescriptorWrite setMin;

    final class Lite1 implements RedDotDrawable {
        private final appxrpc getMax;

        public Lite1(appxrpc appxrpc) {
            this.getMax = appxrpc;
        }

        public final Object apply(Object obj) {
            return WorkerBridgeExtension.AnonymousClass1.getMax(this.getMax);
        }
    }

    @NotNull
    public final String getSettingName() {
        return MyProfileMenuAction.SETTING_USERNAME_CHANGE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
        public static final getMin getMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            return TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/user/UserInfoResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<disconnect, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
        final /* synthetic */ IpcMsgClientService getMax;
        final /* synthetic */ SettingModel getMin;

        setMax(IpcMsgClientService ipcMsgClientService, SettingModel settingModel) {
            this.getMax = ipcMsgClientService;
            this.getMin = settingModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "it");
            return this.getMax.length.isChangeUsernameEnabled().map(new RedDotDrawable<Boolean, SettingModel>(this) {
                final /* synthetic */ setMax getMax;

                {
                    this.getMax = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    Intrinsics.checkNotNullParameter(bool, "usernameEnabled");
                    SettingModel settingModel = this.getMax.getMin;
                    if (bool.booleanValue()) {
                        settingModel.setNeedToShow(true);
                        settingModel.setEnable(true);
                        settingModel.setTitle(this.getMax.getMax.getMin.getString(R.string.username_toolbar_title));
                        settingModel.setViewType(16);
                        settingModel.setUsername(disconnect.getUsername());
                    } else {
                        settingModel.setNeedToShow(false);
                        settingModel.setEnable(false);
                    }
                    return settingModel;
                }
            });
        }
    }

    @Inject
    public IpcMsgClientService(@NotNull Context context, @NotNull onDescriptorWrite ondescriptorwrite, @NotNull setDefaultFontSize setdefaultfontsize) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        this.getMin = context;
        this.setMin = ondescriptorwrite;
        this.length = setdefaultfontsize;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/myprofile/settingconfig/ShareFeedSettingConfigRunner;", "Lid/dana/domain/profilemenu/settingconfig/SettingConfigurationRunner;", "socialPrivacyRepository", "Lid/dana/domain/social/SocialPrivacyRepository;", "(Lid/dana/domain/social/SocialPrivacyRepository;)V", "getSettingName", "", "performConfiguration", "Lio/reactivex/Observable;", "Lid/dana/domain/profilemenu/model/SettingModel;", "settingModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Lite3 implements sendUcReceiver {
        /* access modifiers changed from: private */
        public final getResponseString setMax;

        @NotNull
        public final String getSettingName() {
            return MyProfileMenuAction.SHARE_FEED;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
        static final class getMin<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
            public static final getMin length = new getMin();

            getMin() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
                return TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lid/dana/domain/profilemenu/model/SettingModel;"}, k = 3, mv = {1, 4, 2})
        static final class setMax<T, R> implements RedDotDrawable<Boolean, SettingModel> {
            final /* synthetic */ SettingModel setMax;

            setMax(SettingModel settingModel) {
                this.setMax = settingModel;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNullParameter(bool, "it");
                return this.setMax.setShareFeed(bool.booleanValue());
            }
        }

        @Inject
        public Lite3(@NotNull getResponseString getresponsestring) {
            Intrinsics.checkNotNullParameter(getresponsestring, "socialPrivacyRepository");
            this.setMax = getresponsestring;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(@Nullable SettingModel settingModel) {
            if (settingModel == null) {
                TitleBarRightButtonView.AnonymousClass1<SettingModel> just = TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
                Intrinsics.checkNotNullExpressionValue(just, "Observable.just(SettingModel.empty())");
                return just;
            }
            TitleBarRightButtonView.AnonymousClass1<SettingModel> onErrorResumeNext = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMin(this)).map(new setMax(settingModel)).onErrorResumeNext(getMin.length);
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "Observable.fromCallable<…gModel.empty())\n        }");
            return onErrorResumeNext;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
        static final class setMin<V> implements Callable<Boolean> {
            final /* synthetic */ Lite3 getMax;

            setMin(Lite3 lite3) {
                this.getMax = lite3;
            }

            public final /* synthetic */ Object call() {
                return Boolean.valueOf(this.getMax.setMax.getShareFeedConsent());
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(@Nullable SettingModel settingModel) {
        if (settingModel == null) {
            TitleBarRightButtonView.AnonymousClass1<SettingModel> just = TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(SettingModel.empty())");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = this.setMin.getUserInfo().flatMap(new setMax(this, settingModel)).onErrorResumeNext(getMin.getMax);
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "userRepository.userInfo.…gModel.empty())\n        }");
        return onErrorResumeNext;
    }

    public final class Lite2 implements notNeedInitUc {
        private final getMax getMin;
        private final Context setMin;

        public interface getMax {
            void setMin();
        }

        public Lite2(Context context, getMax getmax) {
            this.setMin = context;
            this.getMin = getmax;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<id.dana.domain.profilemenu.model.SettingModel> apply(java.util.Map.Entry<java.lang.String, java.util.LinkedHashMap<java.lang.String, id.dana.domain.profilemenu.model.SettingModel>> r17) {
            /*
                r16 = this;
                r0 = r16
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.lang.Object r2 = r17.getKey()
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = getMax(r2)
                r3 = 0
                if (r2 != 0) goto L_0x0045
                java.lang.Object r2 = r17.getKey()
                java.lang.String r2 = (java.lang.String) r2
                id.dana.domain.profilemenu.model.SettingModel r4 = new id.dana.domain.profilemenu.model.SettingModel
                r4.<init>()
                android.content.Context r5 = r0.setMin
                java.lang.String r6 = "setting_category_"
                java.lang.String r7 = ""
                java.lang.String r6 = r2.replace(r6, r7)
                java.lang.String r7 = "_"
                java.lang.String r8 = " "
                java.lang.String r6 = r6.replace(r7, r8)
                java.lang.String r5 = o.CornerMarkingDataProvider.AnonymousClass3.setMin(r5, r2, r6)
                java.lang.String r5 = r5.toUpperCase()
                r4.setTitle(r5)
                r4.setViewType(r3)
                r4.setName(r2)
                r1.add(r4)
            L_0x0045:
                java.lang.Object r2 = r17.getValue()
                java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0053:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0164
                java.lang.Object r4 = r2.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r4 = r4.getValue()
                id.dana.domain.profilemenu.model.SettingModel r4 = (id.dana.domain.profilemenu.model.SettingModel) r4
                boolean r5 = r4.isEnable()
                if (r5 == 0) goto L_0x0053
                if (r4 == 0) goto L_0x0156
                java.lang.String r5 = r4.getName()
                int r7 = r5.hashCode()
                r8 = 1
                r9 = 2
                r10 = 11
                r11 = 9
                r12 = 8
                r13 = 6
                r14 = 5
                r15 = 3
                r6 = 4
                switch(r7) {
                    case -1179727712: goto L_0x00fa;
                    case -1051859947: goto L_0x00ef;
                    case -121883067: goto L_0x00e5;
                    case -35919189: goto L_0x00da;
                    case 192438859: goto L_0x00d0;
                    case 315215690: goto L_0x00c5;
                    case 487954253: goto L_0x00bb;
                    case 945226059: goto L_0x00b1;
                    case 1613590219: goto L_0x00a6;
                    case 1741450382: goto L_0x009c;
                    case 1991122122: goto L_0x0091;
                    case 2113115304: goto L_0x0086;
                    default: goto L_0x0084;
                }
            L_0x0084:
                goto L_0x0104
            L_0x0086:
                java.lang.String r7 = "setting_change_profile_picture"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 2
                goto L_0x0105
            L_0x0091:
                java.lang.String r7 = "setting_feed_sharing"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 6
                goto L_0x0105
            L_0x009c:
                java.lang.String r7 = "setting_face_verification"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 7
                goto L_0x0105
            L_0x00a6:
                java.lang.String r7 = "setting_autoroute"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 9
                goto L_0x0105
            L_0x00b1:
                java.lang.String r7 = "setting_app_version"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 1
                goto L_0x0105
            L_0x00bb:
                java.lang.String r7 = "setting_share_feed"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 5
                goto L_0x0105
            L_0x00c5:
                java.lang.String r7 = "setting_username_change"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 10
                goto L_0x0105
            L_0x00d0:
                java.lang.String r7 = "setting_change_name"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 3
                goto L_0x0105
            L_0x00da:
                java.lang.String r7 = "setting_merchant_management"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 8
                goto L_0x0105
            L_0x00e5:
                java.lang.String r7 = "setting_kyb"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 0
                goto L_0x0105
            L_0x00ef:
                java.lang.String r7 = "setting_account_deactivate"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 11
                goto L_0x0105
            L_0x00fa:
                java.lang.String r7 = "setting_payment_authentication"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x0104
                r5 = 4
                goto L_0x0105
            L_0x0104:
                r5 = -1
            L_0x0105:
                switch(r5) {
                    case 0: goto L_0x0153;
                    case 1: goto L_0x0144;
                    case 2: goto L_0x013b;
                    case 3: goto L_0x0137;
                    case 4: goto L_0x0133;
                    case 5: goto L_0x012f;
                    case 6: goto L_0x0129;
                    case 7: goto L_0x0125;
                    case 8: goto L_0x0121;
                    case 9: goto L_0x0118;
                    case 10: goto L_0x0112;
                    case 11: goto L_0x010c;
                    default: goto L_0x0108;
                }
            L_0x0108:
                r4.setViewType(r9)
                goto L_0x0156
            L_0x010c:
                r5 = 17
                r4.setViewType(r5)
                goto L_0x0156
            L_0x0112:
                r5 = 16
                r4.setViewType(r5)
                goto L_0x0156
            L_0x0118:
                r5 = 15
                r4.setViewType(r5)
                r4.setNeedToShow(r3)
                goto L_0x0156
            L_0x0121:
                r4.setViewType(r10)
                goto L_0x0156
            L_0x0125:
                r4.setViewType(r11)
                goto L_0x0156
            L_0x0129:
                r5 = 14
                r4.setViewType(r5)
                goto L_0x0156
            L_0x012f:
                r4.setViewType(r12)
                goto L_0x0156
            L_0x0133:
                r4.setViewType(r13)
                goto L_0x0156
            L_0x0137:
                r4.setViewType(r6)
                goto L_0x0156
            L_0x013b:
                r4.setViewType(r14)
                o.IpcMsgClientService$Lite2$getMax r5 = r0.getMin
                r5.setMin()
                goto L_0x0156
            L_0x0144:
                android.content.Context r5 = r0.setMin
                if (r5 == 0) goto L_0x014f
                java.lang.String r5 = o.H5TinyPopMenu.TitleBarTheme.length(r5, r8)
                r4.setSubtitle(r5)
            L_0x014f:
                r4.setViewType(r6)
                goto L_0x0156
            L_0x0153:
                r4.setViewType(r15)
            L_0x0156:
                android.content.Context r5 = r0.setMin
                java.lang.String r5 = o.CornerMarkingDataProvider.AnonymousClass3.setMax((android.content.Context) r5, (id.dana.domain.profilemenu.model.SettingModel) r4)
                r4.setTitle(r5)
                r1.add(r4)
                goto L_0x0053
            L_0x0164:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IpcMsgClientService.Lite2.apply(java.util.Map$Entry):java.util.List");
        }

        private static boolean getMax(String str) {
            return str.equals(MyProfileMenuCategories.PROFILE_USER_SERVICE);
        }
    }
}
