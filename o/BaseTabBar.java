package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.data.constant.BranchLinkConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverEnv;
import o.RVTabBarImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/ipg/repository/source/IpgRegistrationUrlEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/ipg/repository/source/IpgRegistrationUrlEntityData;", "networkIpgRegistrationUrlEntityData", "Lid/dana/data/ipg/repository/source/network/NetworkIpgRegistrationUrlEntityData;", "(Lid/dana/data/ipg/repository/source/network/NetworkIpgRegistrationUrlEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BaseTabBar extends uncheckItems<isAlphaBackground> {
    private final handleSwitchTab networkIpgRegistrationUrlEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r¨\u0006\u000e"}, d2 = {"toEddAnswerInfoDTO", "Lid/dana/domain/kycamledd/model/EddAnswerInfoDTO;", "Lid/dana/data/kycamledd/repository/source/network/response/EddAnswerInfoDTOResponse;", "toEddConsult", "Lid/dana/domain/kycamledd/model/EddConsult;", "Lid/dana/data/kycamledd/repository/source/network/response/EddConsultResponse;", "eddAmlMandatory", "", "toEddInfo", "Lid/dana/domain/kycamledd/model/EddInfo;", "Lid/dana/data/kycamledd/repository/source/network/response/EddInfoResponse;", "toEddQuestionInfoDTO", "Lid/dana/domain/kycamledd/model/EddQuestionInfoDTO;", "Lid/dana/data/kycamledd/repository/source/network/response/EddQuestionInfoDTOResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.BaseTabBar$1  reason: invalid class name */
    public final class AnonymousClass1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lid/dana/data/ipg/repository/source/network/request/IpgRegistrationUrlRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "deviceId", "", "bizType", "(Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.BaseTabBar$1$1  reason: invalid class name */
        public final class AnonymousClass1 extends BaseRpcRequest {
            @Nullable
            private String bizType;
            @Nullable
            private String deviceId;

            public AnonymousClass1() {
                this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = r0.deviceId;
                }
                if ((i & 2) != 0) {
                    str2 = r0.bizType;
                }
                return r0.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.deviceId;
            }

            @Nullable
            public final String component2() {
                return this.bizType;
            }

            @NotNull
            public final AnonymousClass1 copy(@Nullable String str, @Nullable String str2) {
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(1506317476, oncanceled);
                    onCancelLoad.getMin(1506317476, oncanceled);
                }
                return new AnonymousClass1(str, str2);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass1)) {
                    return false;
                }
                AnonymousClass1 r3 = (AnonymousClass1) obj;
                return Intrinsics.areEqual((Object) this.deviceId, (Object) r3.deviceId) && Intrinsics.areEqual((Object) this.bizType, (Object) r3.bizType);
            }

            public final int hashCode() {
                String str = this.deviceId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.bizType;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("IpgRegistrationUrlRequest(deviceId=");
                sb.append(this.deviceId);
                sb.append(", bizType=");
                sb.append(this.bizType);
                sb.append(")");
                return sb.toString();
            }

            @Nullable
            public final String getDeviceId() {
                return this.deviceId;
            }

            public final void setDeviceId(@Nullable String str) {
                this.deviceId = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass1(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            @Nullable
            public final String getBizType() {
                return this.bizType;
            }

            public final void setBizType(@Nullable String str) {
                this.bizType = str;
            }

            public AnonymousClass1(@Nullable String str, @Nullable String str2) {
                this.deviceId = str;
                this.bizType = str2;
            }
        }

        @NotNull
        public static final GriverEnv.AnonymousClass2 toEddConsult(@NotNull RVTabBarImpl.AnonymousClass2 r2, boolean z) {
            Intrinsics.checkNotNullParameter(r2, "$this$toEddConsult");
            boolean eddStatus = r2.getEddStatus();
            RVTabBarImpl.AnonymousClass1 eddInfo = r2.getEddInfo();
            return new GriverEnv.AnonymousClass2(eddStatus, eddInfo != null ? toEddInfo(eddInfo) : null, z);
        }

        @NotNull
        public static final GriverRVResourceEnvProxyImpl toEddInfo(@NotNull RVTabBarImpl.AnonymousClass1 r3) {
            Intrinsics.checkNotNullParameter(r3, "$this$toEddInfo");
            String amlOrderId = r3.getAmlOrderId();
            Iterable<onTabItemClicked> eddQuestionInfos = r3.getEddQuestionInfos();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eddQuestionInfos, 10));
            for (onTabItemClicked eddQuestionInfoDTO : eddQuestionInfos) {
                arrayList.add(toEddQuestionInfoDTO(eddQuestionInfoDTO));
            }
            return new GriverRVResourceEnvProxyImpl(amlOrderId, (List) arrayList);
        }

        @NotNull
        public static final getSingleMonitorThreadExecutor toEddQuestionInfoDTO(@NotNull onTabItemClicked ontabitemclicked) {
            Intrinsics.checkNotNullParameter(ontabitemclicked, "$this$toEddQuestionInfoDTO");
            String questionId = ontabitemclicked.getQuestionId();
            String question = ontabitemclicked.getQuestion();
            Iterable<onLoad> eddAnswerInfos = ontabitemclicked.getEddAnswerInfos();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eddAnswerInfos, 10));
            for (onLoad eddAnswerInfoDTO : eddAnswerInfos) {
                arrayList.add(toEddAnswerInfoDTO(eddAnswerInfoDTO));
            }
            return new getSingleMonitorThreadExecutor(questionId, question, (List) arrayList);
        }

        @NotNull
        public static final setAlwaysShowDiagnosticTool toEddAnswerInfoDTO(@NotNull onLoad onload) {
            Intrinsics.checkNotNullParameter(onload, "$this$toEddAnswerInfoDTO");
            return new setAlwaysShowDiagnosticTool(onload.getAnswerId(), onload.getAnswer());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lid/dana/data/ipg/repository/source/network/response/IpgRegistrationUrlResult;", "Lid/dana/data/base/BaseRpcResultAphome;", "redirectUrl", "", "needUserConsent", "", "userConsentConfigKey", "userConsentSyncKey", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getNeedUserConsent", "()Z", "setNeedUserConsent", "(Z)V", "getRedirectUrl", "()Ljava/lang/String;", "setRedirectUrl", "(Ljava/lang/String;)V", "getUserConsentConfigKey", "setUserConsentConfigKey", "getUserConsentSyncKey", "setUserConsentSyncKey", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class TabBarManageExtension extends removeAnimatorListener {
        private boolean needUserConsent;
        @NotNull
        private String redirectUrl;
        @Nullable
        private String userConsentConfigKey;
        @Nullable
        private String userConsentSyncKey;

        public TabBarManageExtension() {
            this((String) null, false, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ TabBarManageExtension copy$default(TabBarManageExtension tabBarManageExtension, String str, boolean z, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tabBarManageExtension.redirectUrl;
            }
            if ((i & 2) != 0) {
                z = tabBarManageExtension.needUserConsent;
            }
            if ((i & 4) != 0) {
                str2 = tabBarManageExtension.userConsentConfigKey;
            }
            if ((i & 8) != 0) {
                str3 = tabBarManageExtension.userConsentSyncKey;
            }
            return tabBarManageExtension.copy(str, z, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.redirectUrl;
        }

        public final boolean component2() {
            return this.needUserConsent;
        }

        @Nullable
        public final String component3() {
            return this.userConsentConfigKey;
        }

        @Nullable
        public final String component4() {
            return this.userConsentSyncKey;
        }

        @NotNull
        public final TabBarManageExtension copy(@NotNull String str, boolean z, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
            return new TabBarManageExtension(str, z, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabBarManageExtension)) {
                return false;
            }
            TabBarManageExtension tabBarManageExtension = (TabBarManageExtension) obj;
            return Intrinsics.areEqual((Object) this.redirectUrl, (Object) tabBarManageExtension.redirectUrl) && this.needUserConsent == tabBarManageExtension.needUserConsent && Intrinsics.areEqual((Object) this.userConsentConfigKey, (Object) tabBarManageExtension.userConsentConfigKey) && Intrinsics.areEqual((Object) this.userConsentSyncKey, (Object) tabBarManageExtension.userConsentSyncKey);
        }

        public final int hashCode() {
            String str = this.redirectUrl;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.needUserConsent;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            String str2 = this.userConsentConfigKey;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.userConsentSyncKey;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("IpgRegistrationUrlResult(redirectUrl=");
            sb.append(this.redirectUrl);
            sb.append(", needUserConsent=");
            sb.append(this.needUserConsent);
            sb.append(", userConsentConfigKey=");
            sb.append(this.userConsentConfigKey);
            sb.append(", userConsentSyncKey=");
            sb.append(this.userConsentSyncKey);
            sb.append(")");
            return sb.toString();
        }

        @NotNull
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final void setRedirectUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.redirectUrl = str;
        }

        public final boolean getNeedUserConsent() {
            return this.needUserConsent;
        }

        public final void setNeedUserConsent(boolean z) {
            this.needUserConsent = z;
        }

        @Nullable
        public final String getUserConsentConfigKey() {
            return this.userConsentConfigKey;
        }

        public final void setUserConsentConfigKey(@Nullable String str) {
            this.userConsentConfigKey = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TabBarManageExtension(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Nullable
        public final String getUserConsentSyncKey() {
            return this.userConsentSyncKey;
        }

        public final void setUserConsentSyncKey(@Nullable String str) {
            this.userConsentSyncKey = str;
        }

        public TabBarManageExtension(@NotNull String str, boolean z, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
            this.redirectUrl = str;
            this.needUserConsent = z;
            this.userConsentConfigKey = str2;
            this.userConsentSyncKey = str3;
        }
    }

    @Inject
    public BaseTabBar(@NotNull handleSwitchTab handleswitchtab) {
        Intrinsics.checkNotNullParameter(handleswitchtab, "networkIpgRegistrationUrlEntityData");
        this.networkIpgRegistrationUrlEntityData = handleswitchtab;
    }

    @NotNull
    public final handleSwitchTab createData(@Nullable String str) {
        return this.networkIpgRegistrationUrlEntityData;
    }
}
