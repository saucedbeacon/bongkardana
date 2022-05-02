package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u00068"}, d2 = {"Lid/dana/domain/saving/model/SavingGoalView;", "", "savingId", "", "title", "categoryCode", "currentAmount", "Lid/dana/domain/nearbyme/model/MoneyView;", "targetAmount", "orderStatus", "orderSubStatus", "createdTime", "achievedTime", "completedTime", "savingCategory", "Lid/dana/domain/saving/model/SavingCategory;", "extendInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/saving/model/SavingCategory;Ljava/util/Map;)V", "getAchievedTime", "()Ljava/lang/String;", "getCategoryCode", "getCompletedTime", "getCreatedTime", "getCurrentAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getExtendInfo", "()Ljava/util/Map;", "getOrderStatus", "getOrderSubStatus", "getSavingCategory", "()Lid/dana/domain/saving/model/SavingCategory;", "setSavingCategory", "(Lid/dana/domain/saving/model/SavingCategory;)V", "getSavingId", "getTargetAmount", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BeaconManager {
    @Nullable
    private final String achievedTime;
    @NotNull
    private final String categoryCode;
    @Nullable
    private final String completedTime;
    @Nullable
    private final String createdTime;
    @NotNull
    private final getAppDir currentAmount;
    @NotNull
    private final Map<String, String> extendInfo;
    @NotNull
    private final String orderStatus;
    @Nullable
    private final String orderSubStatus;
    @Nullable
    private setDebug savingCategory;
    @NotNull
    private final String savingId;
    @NotNull
    private final getAppDir targetAmount;
    @NotNull
    private final String title;

    public static /* synthetic */ BeaconManager copy$default(BeaconManager beaconManager, String str, String str2, String str3, getAppDir getappdir, getAppDir getappdir2, String str4, String str5, String str6, String str7, String str8, setDebug setdebug, Map map, int i, Object obj) {
        BeaconManager beaconManager2 = beaconManager;
        int i2 = i;
        return beaconManager.copy((i2 & 1) != 0 ? beaconManager2.savingId : str, (i2 & 2) != 0 ? beaconManager2.title : str2, (i2 & 4) != 0 ? beaconManager2.categoryCode : str3, (i2 & 8) != 0 ? beaconManager2.currentAmount : getappdir, (i2 & 16) != 0 ? beaconManager2.targetAmount : getappdir2, (i2 & 32) != 0 ? beaconManager2.orderStatus : str4, (i2 & 64) != 0 ? beaconManager2.orderSubStatus : str5, (i2 & 128) != 0 ? beaconManager2.createdTime : str6, (i2 & 256) != 0 ? beaconManager2.achievedTime : str7, (i2 & 512) != 0 ? beaconManager2.completedTime : str8, (i2 & 1024) != 0 ? beaconManager2.savingCategory : setdebug, (i2 & 2048) != 0 ? beaconManager2.extendInfo : map);
    }

    @NotNull
    public final String component1() {
        return this.savingId;
    }

    @Nullable
    public final String component10() {
        return this.completedTime;
    }

    @Nullable
    public final setDebug component11() {
        return this.savingCategory;
    }

    @NotNull
    public final Map<String, String> component12() {
        return this.extendInfo;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.categoryCode;
    }

    @NotNull
    public final getAppDir component4() {
        return this.currentAmount;
    }

    @NotNull
    public final getAppDir component5() {
        return this.targetAmount;
    }

    @NotNull
    public final String component6() {
        return this.orderStatus;
    }

    @Nullable
    public final String component7() {
        return this.orderSubStatus;
    }

    @Nullable
    public final String component8() {
        return this.createdTime;
    }

    @Nullable
    public final String component9() {
        return this.achievedTime;
    }

    @NotNull
    public final BeaconManager copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable setDebug setdebug, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "title");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "categoryCode");
        getAppDir getappdir3 = getappdir;
        Intrinsics.checkNotNullParameter(getappdir3, "currentAmount");
        getAppDir getappdir4 = getappdir2;
        Intrinsics.checkNotNullParameter(getappdir4, "targetAmount");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "orderStatus");
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "extendInfo");
        return new BeaconManager(str, str9, str10, getappdir3, getappdir4, str11, str5, str6, str7, str8, setdebug, map2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaconManager)) {
            return false;
        }
        BeaconManager beaconManager = (BeaconManager) obj;
        return Intrinsics.areEqual((Object) this.savingId, (Object) beaconManager.savingId) && Intrinsics.areEqual((Object) this.title, (Object) beaconManager.title) && Intrinsics.areEqual((Object) this.categoryCode, (Object) beaconManager.categoryCode) && Intrinsics.areEqual((Object) this.currentAmount, (Object) beaconManager.currentAmount) && Intrinsics.areEqual((Object) this.targetAmount, (Object) beaconManager.targetAmount) && Intrinsics.areEqual((Object) this.orderStatus, (Object) beaconManager.orderStatus) && Intrinsics.areEqual((Object) this.orderSubStatus, (Object) beaconManager.orderSubStatus) && Intrinsics.areEqual((Object) this.createdTime, (Object) beaconManager.createdTime) && Intrinsics.areEqual((Object) this.achievedTime, (Object) beaconManager.achievedTime) && Intrinsics.areEqual((Object) this.completedTime, (Object) beaconManager.completedTime) && Intrinsics.areEqual((Object) this.savingCategory, (Object) beaconManager.savingCategory) && Intrinsics.areEqual((Object) this.extendInfo, (Object) beaconManager.extendInfo);
    }

    public final int hashCode() {
        String str = this.savingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.categoryCode;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        getAppDir getappdir = this.currentAmount;
        int hashCode4 = (hashCode3 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        getAppDir getappdir2 = this.targetAmount;
        int hashCode5 = (hashCode4 + (getappdir2 != null ? getappdir2.hashCode() : 0)) * 31;
        String str4 = this.orderStatus;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.orderSubStatus;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.createdTime;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.achievedTime;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.completedTime;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        setDebug setdebug = this.savingCategory;
        int hashCode11 = (hashCode10 + (setdebug != null ? setdebug.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode11 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingGoalView(savingId=");
        sb.append(this.savingId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", categoryCode=");
        sb.append(this.categoryCode);
        sb.append(", currentAmount=");
        sb.append(this.currentAmount);
        sb.append(", targetAmount=");
        sb.append(this.targetAmount);
        sb.append(", orderStatus=");
        sb.append(this.orderStatus);
        sb.append(", orderSubStatus=");
        sb.append(this.orderSubStatus);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", achievedTime=");
        sb.append(this.achievedTime);
        sb.append(", completedTime=");
        sb.append(this.completedTime);
        sb.append(", savingCategory=");
        sb.append(this.savingCategory);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(")");
        return sb.toString();
    }

    public final class ServiceNotDeclaredException implements getAdapterPosition<getNonBeaconLeScanCallback> {
        private final b.C0007b<fromInt> sendMoneyRepositoryProvider;

        public ServiceNotDeclaredException(b.C0007b<fromInt> bVar) {
            this.sendMoneyRepositoryProvider = bVar;
        }

        public final getNonBeaconLeScanCallback get() {
            return newInstance(this.sendMoneyRepositoryProvider.get());
        }

        public static ServiceNotDeclaredException create(b.C0007b<fromInt> bVar) {
            return new ServiceNotDeclaredException(bVar);
        }

        public static getNonBeaconLeScanCallback newInstance(fromInt fromint) {
            return new getNonBeaconLeScanCallback(fromint);
        }
    }

    public BeaconManager(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable setDebug setdebug, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "categoryCode");
        Intrinsics.checkNotNullParameter(getappdir, "currentAmount");
        Intrinsics.checkNotNullParameter(getappdir2, "targetAmount");
        Intrinsics.checkNotNullParameter(str4, "orderStatus");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        this.savingId = str;
        this.title = str2;
        this.categoryCode = str3;
        this.currentAmount = getappdir;
        this.targetAmount = getappdir2;
        this.orderStatus = str4;
        this.orderSubStatus = str5;
        this.createdTime = str6;
        this.achievedTime = str7;
        this.completedTime = str8;
        this.savingCategory = setdebug;
        this.extendInfo = map;
    }

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getCategoryCode() {
        return this.categoryCode;
    }

    @NotNull
    public final getAppDir getCurrentAmount() {
        return this.currentAmount;
    }

    @NotNull
    public final getAppDir getTargetAmount() {
        return this.targetAmount;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveStateSendMoneyShareFeed;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/sendmoney/interactor/SaveStateSendMoneyShareFeed$Param;", "sendMoneyRepository", "Lid/dana/domain/sendmoney/repository/SendMoneyRepository;", "(Lid/dana/domain/sendmoney/repository/SendMoneyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "param", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ConsumerInfo extends APWebChromeClient<Boolean, getMax> {
        private final fromInt sendMoneyRepository;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public ConsumerInfo(@NotNull fromInt fromint) {
            super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fromint, "sendMoneyRepository");
            this.sendMoneyRepository = fromint;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveStateSendMoneyShareFeed$Param;", "", "isChecked", "", "(Ljava/lang/String;)V", "isChecked$domain_release", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            @NotNull
            public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
            @NotNull
            private final String isChecked;

            @JvmStatic
            @NotNull
            public static final getMax create(@NotNull String str) {
                return Companion.create(str);
            }

            private getMax(String str) {
                this.isChecked = str;
            }

            public /* synthetic */ getMax(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @NotNull
            public final String isChecked$domain_release() {
                return this.isChecked;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveStateSendMoneyShareFeed$Param$Companion;", "", "()V", "create", "Lid/dana/domain/sendmoney/interactor/SaveStateSendMoneyShareFeed$Param;", "isChecked", "", "domain_release"}, k = 1, mv = {1, 4, 2})
            public static final class getMin {
                private getMin() {
                }

                public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @JvmStatic
                @NotNull
                public final getMax create(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "isChecked");
                    return new getMax(str, (DefaultConstructorMarker) null);
                }
            }
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMax getmax) {
            Intrinsics.checkNotNullParameter(getmax, "param");
            TitleBarRightButtonView.AnonymousClass1<Boolean> saveStateSendMoneyShareFeed = this.sendMoneyRepository.saveStateSendMoneyShareFeed(getmax.isChecked$domain_release());
            Intrinsics.checkNotNullExpressionValue(saveStateSendMoneyShareFeed, "sendMoneyRepository.save…hareFeed(param.isChecked)");
            return saveStateSendMoneyShareFeed;
        }
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getOrderSubStatus() {
        return this.orderSubStatus;
    }

    @Nullable
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    public final String getAchievedTime() {
        return this.achievedTime;
    }

    @Nullable
    public final String getCompletedTime() {
        return this.completedTime;
    }

    @Nullable
    public final setDebug getSavingCategory() {
        return this.savingCategory;
    }

    public final void setSavingCategory(@Nullable setDebug setdebug) {
        this.savingCategory = setdebug;
    }

    @NotNull
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public class BeaconServiceConnection extends parseFailed<parseHex, getMax> {
        private final fromInt sendMoneyRepository;

        @Inject
        public BeaconServiceConnection(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
            super(appxloadfailed, getscheme);
            this.sendMoneyRepository = fromint;
        }

        /* access modifiers changed from: protected */
        public TitleBarRightButtonView.AnonymousClass1<parseHex> buildUseCaseObservable(getMax getmax) {
            return this.sendMoneyRepository.nameCheck(getmax.nameCheckParam);
        }

        public static class getMax {
            /* access modifiers changed from: private */
            public setAllowPduOverflow nameCheckParam;

            private getMax(setAllowPduOverflow setallowpduoverflow) {
                this.nameCheckParam = setallowpduoverflow;
            }

            public static getMax forSendMoneyNameCheck(setAllowPduOverflow setallowpduoverflow) {
                return new getMax(setallowpduoverflow);
            }
        }
    }
}
