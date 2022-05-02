package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J(\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/domain/profilecompletion/interactor/GetProfileCompletionData;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/profilecompletion/model/ProfileCompletionData;", "Lid/dana/domain/profilecompletion/interactor/GetProfileCompletionData$Params;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "userEmailAddressRepository", "Lid/dana/domain/useremailaddress/repository/UserEmailAddressRepository;", "userSecurityQuestionStateRepository", "Lid/dana/domain/usersecurityquestions/repository/UserSecurityQuestionStateRepository;", "(Lid/dana/domain/user/repository/UserRepository;Lid/dana/domain/account/AccountRepository;Lid/dana/domain/useremailaddress/repository/UserEmailAddressRepository;Lid/dana/domain/usersecurityquestions/repository/UserSecurityQuestionStateRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "combineData", "Lio/reactivex/functions/Function4;", "Lid/dana/domain/user/UserInfoResponse;", "", "Lid/dana/domain/useremailaddress/model/UserEmailAddress;", "Lid/dana/domain/usersecurityquestions/model/UserSecurityQuestionInfo;", "getSecurityQuestionStatus", "emittedUserSecurityInfo", "Companion", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getAsyncHandler extends APWebChromeClient<H5PatternHelper, setMin> {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String SECURITY_QUESTIONS_TITLE = "Security Question";
    private static final String SECURITY_SETTING_STATUS_ON = "Set";
    private final getCommonResources accountRepository;
    private final onDisconnectAllDevices userEmailAddressRepository;
    private final onDescriptorWrite userRepository;
    private final onBluetoothDescriptorWrite userSecurityQuestionStateRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lid/dana/domain/profilecompletion/model/ProfileCompletionData;", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "userAvatarUrl", "", "userEmailAddress", "Lid/dana/domain/useremailaddress/model/UserEmailAddress;", "emittedUserSecurityInfo", "Lid/dana/domain/usersecurityquestions/model/UserSecurityQuestionInfo;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T1, T2, T3, T4, R> implements RedDotModel<disconnect, String, onGetBluetoothDevices, onBluetoothCharacteristicWrite, H5PatternHelper> {
        final /* synthetic */ getAsyncHandler getMin;

        getMin(getAsyncHandler getasynchandler) {
            this.getMin = getasynchandler;
        }

        public final /* synthetic */ Object setMin(Object obj, Object obj2, Object obj3, Object obj4) {
            String str;
            disconnect disconnect = (disconnect) obj;
            String str2 = (String) obj2;
            onGetBluetoothDevices ongetbluetoothdevices = (onGetBluetoothDevices) obj3;
            onBluetoothCharacteristicWrite onbluetoothcharacteristicwrite = (onBluetoothCharacteristicWrite) obj4;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            Intrinsics.checkNotNullParameter(str2, "userAvatarUrl");
            Intrinsics.checkNotNullParameter(ongetbluetoothdevices, "userEmailAddress");
            Intrinsics.checkNotNullParameter(onbluetoothcharacteristicwrite, "emittedUserSecurityInfo");
            H5PatternHelper h5PatternHelper = new H5PatternHelper((String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
            boolean matches = new Regex("\\d+").matches(disconnect.getNickname());
            if (matches) {
                str = disconnect.getNickname();
            } else {
                str = disconnect.getLoginId();
            }
            h5PatternHelper.setPhoneNumber(str);
            String str3 = "";
            h5PatternHelper.setNickName(!matches ? disconnect.getNickname() : str3);
            h5PatternHelper.setUsername(disconnect.getUsername());
            if (!Intrinsics.areEqual((Object) ongetbluetoothdevices.getVerifyStatus(), (Object) onGetBluetoothDevices.Companion.getUNVERIFIED_EMAIL())) {
                str3 = ongetbluetoothdevices.getUserEmail();
            }
            h5PatternHelper.setEmail(str3);
            h5PatternHelper.setSecurityQuestionAvailable(Intrinsics.areEqual((Object) this.getMin.getSecurityQuestionStatus(onbluetoothcharacteristicwrite), (Object) getAsyncHandler.SECURITY_SETTING_STATUS_ON));
            h5PatternHelper.setUserAvatarUrl(str2);
            h5PatternHelper.setKycAccepted(Intrinsics.areEqual((Object) "KYC2", (Object) disconnect.getKycInfo()));
            return h5PatternHelper;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getAsyncHandler(@NotNull onDescriptorWrite ondescriptorwrite, @NotNull getCommonResources getcommonresources, @NotNull onDisconnectAllDevices ondisconnectalldevices, @NotNull onBluetoothDescriptorWrite onbluetoothdescriptorwrite) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        Intrinsics.checkNotNullParameter(ondisconnectalldevices, "userEmailAddressRepository");
        Intrinsics.checkNotNullParameter(onbluetoothdescriptorwrite, "userSecurityQuestionStateRepository");
        this.userRepository = ondescriptorwrite;
        this.accountRepository = getcommonresources;
        this.userEmailAddressRepository = ondisconnectalldevices;
        this.userSecurityQuestionStateRepository = onbluetoothdescriptorwrite;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<H5PatternHelper> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        TitleBarRightButtonView.AnonymousClass1<H5PatternHelper> zip = TitleBarRightButtonView.AnonymousClass1.zip(this.userRepository.getUserInfoWithKyc(), this.accountRepository.getAvatarUrl(), this.userEmailAddressRepository.getEmailAddressAndVerifyResult(), this.userSecurityQuestionStateRepository.getSecurityQuestionState(setmin.getKbaVersionForSecurityQuestion()), combineData());
        Intrinsics.checkNotNullExpressionValue(zip, "Observable.zip(\n        …, combineData()\n        )");
        return zip;
    }

    private final RedDotModel<disconnect, String, onGetBluetoothDevices, onBluetoothCharacteristicWrite, H5PatternHelper> combineData() {
        return new getMin<>(this);
    }

    /* access modifiers changed from: private */
    public final String getSecurityQuestionStatus(onBluetoothCharacteristicWrite onbluetoothcharacteristicwrite) {
        onBluetoothAdapterStateChange data;
        onCloseBluetoothAdapter menuData;
        onBluetoothConnectionStateChange[] menuGroups;
        BetterBleService betterBleService;
        if (!(onbluetoothcharacteristicwrite == null || (data = onbluetoothcharacteristicwrite.getData()) == null || (menuData = data.getMenuData()) == null || (menuGroups = menuData.getMenuGroups()) == null)) {
            for (onBluetoothConnectionStateChange onbluetoothconnectionstatechange : menuGroups) {
                Intrinsics.checkNotNullExpressionValue(onbluetoothconnectionstatechange, "it");
                BetterBleService[] menuItems = onbluetoothconnectionstatechange.getMenuItems();
                Intrinsics.checkNotNullExpressionValue(menuItems, "it.menuItems");
                int length2 = menuItems.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        betterBleService = null;
                        break;
                    }
                    betterBleService = menuItems[i];
                    Intrinsics.checkNotNullExpressionValue(betterBleService, "item");
                    if (Intrinsics.areEqual((Object) betterBleService.getTitle(), (Object) SECURITY_QUESTIONS_TITLE)) {
                        break;
                    }
                    i++;
                }
                if (betterBleService != null) {
                    return betterBleService.getDesc();
                }
            }
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/domain/profilecompletion/interactor/GetProfileCompletionData$Companion;", "", "()V", "SECURITY_QUESTIONS_TITLE", "", "SECURITY_SETTING_STATUS_ON", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/profilecompletion/interactor/GetProfileCompletionData$Params;", "", "kbaVersionForSecurityQuestion", "", "(Ljava/lang/String;)V", "getKbaVersionForSecurityQuestion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String kbaVersionForSecurityQuestion;

        public static /* synthetic */ setMin copy$default(setMin setmin, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmin.kbaVersionForSecurityQuestion;
            }
            return setmin.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.kbaVersionForSecurityQuestion;
        }

        @NotNull
        public final setMin copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "kbaVersionForSecurityQuestion");
            return new setMin(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMin) && Intrinsics.areEqual((Object) this.kbaVersionForSecurityQuestion, (Object) ((setMin) obj).kbaVersionForSecurityQuestion);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.kbaVersionForSecurityQuestion;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(kbaVersionForSecurityQuestion=");
            sb.append(this.kbaVersionForSecurityQuestion);
            sb.append(")");
            return sb.toString();
        }

        public setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "kbaVersionForSecurityQuestion");
            this.kbaVersionForSecurityQuestion = str;
        }

        @NotNull
        public final String getKbaVersionForSecurityQuestion() {
            return this.kbaVersionForSecurityQuestion;
        }
    }
}
