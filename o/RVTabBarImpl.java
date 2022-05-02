package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.data.Source;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver;
import o.BaseTabBar;
import o.GriverEnv;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/data/kycamledd/repository/KycAmlEddEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/kycamledd/KycAmlEddRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "kycAmlEddEntityDataFactory", "Lid/dana/data/kycamledd/repository/source/KycAmlEddEntityDataFactory;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/kycamledd/repository/source/KycAmlEddEntityDataFactory;Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "networkKycAmlEddEntityData", "Lid/dana/data/kycamledd/repository/source/KycAmlEntityData;", "createConfigAmcsEntity", "Lid/dana/data/config/source/ConfigEntityData;", "createConfigSplitEntity", "createNetworkKycAmlEddEntityData", "getEddAmlKycConsult", "Lio/reactivex/Observable;", "Lid/dana/domain/kycamledd/model/EddConsult;", "getFeatureKycAmlEddEnabled", "", "getKycAmlEddMandatory", "submitEddAmlKyc", "eddSubmitInfo", "Lid/dana/domain/kycamledd/model/EddSubmitInfo;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVTabBarImpl extends setMinProgress implements getAlwaysShowDiagnosticTool {
    private final onCallBack configEntityDataFactory;
    private final getTitleBarHeight kycAmlEddEntityDataFactory;
    private final clearBadge networkKycAmlEddEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/network/UserKYCFacade;", "", "queryKYCRenewalStatus", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCRenewalStatusResult;", "request", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "queryKYCUserData", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCUserDataResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface ImageListener {
        @OperationType("alipayplus.mobilewallet.user.kyc.queryKYCRenewalStatus")
        @NotNull
        @SignCheck
        getDotRadius queryKYCRenewalStatus(@NotNull BaseRpcRequest baseRpcRequest);

        @OperationType("alipayplus.mobilewallet.user.kyc.queryKYCUserData")
        @NotNull
        @SignCheck
        RVTabDotView queryKYCUserData(@NotNull BaseRpcRequest baseRpcRequest);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/response/EddInfoResponse;", "", "amlOrderId", "", "eddQuestionInfos", "", "Lid/dana/data/kycamledd/repository/source/network/response/EddQuestionInfoDTOResponse;", "(Ljava/lang/String;Ljava/util/List;)V", "getAmlOrderId", "()Ljava/lang/String;", "getEddQuestionInfos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RVTabBarImpl$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        private final String amlOrderId;
        @NotNull
        private final List<onTabItemClicked> eddQuestionInfos;

        public AnonymousClass1() {
            this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, String str, List<onTabItemClicked> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.amlOrderId;
            }
            if ((i & 2) != 0) {
                list = r0.eddQuestionInfos;
            }
            return r0.copy(str, list);
        }

        @NotNull
        public final String component1() {
            return this.amlOrderId;
        }

        @NotNull
        public final List<onTabItemClicked> component2() {
            return this.eddQuestionInfos;
        }

        @NotNull
        public final AnonymousClass1 copy(@NotNull String str, @NotNull List<onTabItemClicked> list) {
            Intrinsics.checkNotNullParameter(str, "amlOrderId");
            Intrinsics.checkNotNullParameter(list, "eddQuestionInfos");
            return new AnonymousClass1(str, list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return Intrinsics.areEqual((Object) this.amlOrderId, (Object) r3.amlOrderId) && Intrinsics.areEqual((Object) this.eddQuestionInfos, (Object) r3.eddQuestionInfos);
        }

        public final int hashCode() {
            String str = this.amlOrderId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<onTabItemClicked> list = this.eddQuestionInfos;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("EddInfoResponse(amlOrderId=");
            sb.append(this.amlOrderId);
            sb.append(", eddQuestionInfos=");
            sb.append(this.eddQuestionInfos);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass1(@NotNull String str, @NotNull List<onTabItemClicked> list) {
            Intrinsics.checkNotNullParameter(str, "amlOrderId");
            Intrinsics.checkNotNullParameter(list, "eddQuestionInfos");
            this.amlOrderId = str;
            this.eddQuestionInfos = list;
        }

        @NotNull
        public final String getAmlOrderId() {
            return this.amlOrderId;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        @NotNull
        public final List<onTabItemClicked> getEddQuestionInfos() {
            return this.eddQuestionInfos;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/request/EddSubmitInfoDTORequest;", "", "questionId", "", "answerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswerId", "()Ljava/lang/String;", "getQuestionId", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RVTabBarImpl$3  reason: invalid class name */
    public final class AnonymousClass3 {
        @NotNull
        private final String answerId;
        @NotNull
        private final String questionId;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/KycRenewalEntityData;", "", "getKYCRenewalStatus", "Lio/reactivex/Observable;", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCRenewalStatusResult;", "getKYCUserData", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCUserDataResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.RVTabBarImpl$3$1  reason: invalid class name */
        public interface AnonymousClass1 {
            @NotNull
            TitleBarRightButtonView.AnonymousClass1<RVTabDotView> getMin();

            @NotNull
            TitleBarRightButtonView.AnonymousClass1<getDotRadius> setMin();
        }

        public AnonymousClass3() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public AnonymousClass3(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "questionId");
            Intrinsics.checkNotNullParameter(str2, "answerId");
            this.questionId = str;
            this.answerId = str2;
        }

        @NotNull
        public final String getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        @NotNull
        public final String getAnswerId() {
            return this.answerId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/response/EddConsultResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "eddStatus", "", "eddInfo", "Lid/dana/data/kycamledd/repository/source/network/response/EddInfoResponse;", "(ZLid/dana/data/kycamledd/repository/source/network/response/EddInfoResponse;)V", "getEddInfo", "()Lid/dana/data/kycamledd/repository/source/network/response/EddInfoResponse;", "getEddStatus", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RVTabBarImpl$2  reason: invalid class name */
    public final class AnonymousClass2 extends BaseRpcResult {
        @Nullable
        private final AnonymousClass1 eddInfo;
        private final boolean eddStatus;

        public static /* synthetic */ AnonymousClass2 copy$default(AnonymousClass2 r0, boolean z, AnonymousClass1 r2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.eddStatus;
            }
            if ((i & 2) != 0) {
                r2 = r0.eddInfo;
            }
            return r0.copy(z, r2);
        }

        public final boolean component1() {
            return this.eddStatus;
        }

        @Nullable
        public final AnonymousClass1 component2() {
            return this.eddInfo;
        }

        @NotNull
        public final AnonymousClass2 copy(boolean z, @Nullable AnonymousClass1 r3) {
            return new AnonymousClass2(z, r3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass2)) {
                return false;
            }
            AnonymousClass2 r3 = (AnonymousClass2) obj;
            return this.eddStatus == r3.eddStatus && Intrinsics.areEqual((Object) this.eddInfo, (Object) r3.eddInfo);
        }

        public final int hashCode() {
            boolean z = this.eddStatus;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            AnonymousClass1 r1 = this.eddInfo;
            return i + (r1 != null ? r1.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("EddConsultResponse(eddStatus=");
            sb.append(this.eddStatus);
            sb.append(", eddInfo=");
            sb.append(this.eddInfo);
            sb.append(")");
            return sb.toString();
        }

        public final boolean getEddStatus() {
            return this.eddStatus;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(boolean z, AnonymousClass1 r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new AnonymousClass1((String) null, (List) null, 3, (DefaultConstructorMarker) null) : r2);
        }

        @Nullable
        public final AnonymousClass1 getEddInfo() {
            return this.eddInfo;
        }

        public AnonymousClass2(boolean z, @Nullable AnonymousClass1 r2) {
            this.eddStatus = z;
            this.eddInfo = r2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
        public static final getMax setMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "it");
            return Boolean.valueOf(baseRpcResult.success);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/kycamledd/model/EddConsult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/kycamledd/repository/source/network/response/EddConsultResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<AnonymousClass2, GriverEnv.AnonymousClass2> {
        final /* synthetic */ RVTabBarImpl length;

        length(RVTabBarImpl rVTabBarImpl) {
            this.length = rVTabBarImpl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AnonymousClass2 r2 = (AnonymousClass2) obj;
            Intrinsics.checkNotNullParameter(r2, "it");
            return BaseTabBar.AnonymousClass1.toEddConsult(r2, this.length.getKycAmlEddMandatory());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RVTabBarImpl(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull getTitleBarHeight gettitlebarheight, @NotNull onCallBack oncallback) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(gettitlebarheight, "kycAmlEddEntityDataFactory");
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        this.kycAmlEddEntityDataFactory = gettitlebarheight;
        this.configEntityDataFactory = oncallback;
        this.networkKycAmlEddEntityData = gettitlebarheight.createData("network");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverEnv.AnonymousClass2> getEddAmlKycConsult() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createNetworkKycAmlEddEntityData().getAmlEddConsult().map(new length(this));
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkKycAmlEddEn…andatory())\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> submitEddAmlKyc(@NotNull runTask runtask) {
        Intrinsics.checkNotNullParameter(runtask, "eddSubmitInfo");
        TitleBarRightButtonView.AnonymousClass1<R> map = createNetworkKycAmlEddEntityData().submitAmlEdd(DefaultViewSpecProvider.toEddInfoRequest(runtask)).map(getMax.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkKycAmlEddEn… it.success\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureKycAmlEddEnabled() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntity().getFeatureAmlEdd().onErrorResumeNext(createConfigAmcsEntity().getFeatureAmlEdd());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntity(…atureAmlEdd\n            )");
        return onErrorResumeNext;
    }

    /* access modifiers changed from: private */
    public final boolean getKycAmlEddMandatory() {
        Boolean blockingFirst = createConfigAmcsEntity().getAmlEddMandatory().blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "createConfigAmcsEntity()…Mandatory.blockingFirst()");
        return blockingFirst.booleanValue();
    }

    private final AppMsgReceiver.AnonymousClass2 createConfigAmcsEntity() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData("amcs");
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.AMCS)");
        return createData;
    }

    private final AppMsgReceiver.AnonymousClass2 createConfigSplitEntity() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.SPLIT)");
        return createData;
    }

    private final clearBadge createNetworkKycAmlEddEntityData() {
        return this.kycAmlEddEntityDataFactory.createData("network");
    }
}
