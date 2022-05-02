package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/data/userconsent/repository/UserConsentEntityRepository;", "Lid/dana/domain/useragreement/UserConsentRepository;", "userConsentDataFactory", "Lid/dana/data/userconsent/repository/source/UserConsentDataFactory;", "(Lid/dana/data/userconsent/repository/source/UserConsentDataFactory;)V", "createUserConsentData", "Lid/dana/data/userconsent/repository/source/UserConsentData;", "consultAgreement", "Lio/reactivex/Observable;", "Lid/dana/domain/useragreement/model/ConsultAgreementResponse;", "spaceCodes", "", "", "recordAgreement", "", "agreementKey", "userAgree", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getWebviewConfigs implements onCharacteristicChanged {
    private final setSpecialConfigs setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
        public static final length setMin = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "it");
            return Boolean.valueOf(baseRpcResult.success);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/useragreement/model/ConsultAgreementResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/userconsent/repository/source/model/ConsultAgreementResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<setNativeApiUserAuth, BLEOperation> {
        public static final setMin getMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setNativeApiUserAuth setnativeapiuserauth = (setNativeApiUserAuth) obj;
            Intrinsics.checkNotNullParameter(setnativeapiuserauth, "it");
            return new BLEOperation(setnativeapiuserauth.getNeedUserAgreement(), setnativeapiuserauth.getAgreementInfos());
        }
    }

    @Inject
    public getWebviewConfigs(@NotNull getSpecialConfigs getspecialconfigs) {
        Intrinsics.checkNotNullParameter(getspecialconfigs, "userConsentDataFactory");
        Intrinsics.checkNotNullParameter("network", "source");
        this.setMin = Intrinsics.areEqual((Object) "network", (Object) "network") ? getspecialconfigs.getMax : getspecialconfigs.getMin;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BLEOperation> consultAgreement(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "spaceCodes");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.setMin.length(list).map(setMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "createUserConsentData.co…ent, it.agreementInfos) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> recordAgreement(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "agreementKey");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.setMin.setMin(str, z).map(length.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "createUserConsentData.re…      .map { it.success }");
        return map;
    }
}
