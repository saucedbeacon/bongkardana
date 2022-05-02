package o;

import id.dana.model.CurrencyAmountModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAmcsLiteConfig;
import o.GriverInnerAmcsLiteConfig;
import o.IMultiInstanceInvalidationService;
import o.PhotoContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0014\u0010\t\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/mapper/HomeInfoMapper;", "", "baseResponseMapper", "Lid/dana/base/BaseResponseMapper;", "currencyAmountModelMapper", "Lid/dana/sendmoney/mapper/CurrencyAmountModelMapper;", "servicesMapper", "Lid/dana/mapper/ThirdPartyServicesMapper;", "(Lid/dana/base/BaseResponseMapper;Lid/dana/sendmoney/mapper/CurrencyAmountModelMapper;Lid/dana/mapper/ThirdPartyServicesMapper;)V", "transform", "Lid/dana/model/HomeInfo;", "result", "Lid/dana/domain/homeinfo/HomeInfoResponse;", "Lid/dana/model/KycInfo;", "Lid/dana/domain/homeinfo/KycResponse;", "Lid/dana/model/ProcessingTransaction;", "Lid/dana/domain/homeinfo/ProcessingTransactionResponse;", "Lid/dana/model/SurveyInfo;", "entity", "Lid/dana/domain/homeinfo/SurveyInfoResponse;", "Lid/dana/model/ThirdPartyService;", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "", "entities", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NetworkBridgeExtension {
    private final PhotoContext.AnonymousClass2 getMax;
    private final broadcastInvalidation length;
    private final parseBatteryPercentage setMax;

    @Inject
    public NetworkBridgeExtension(@NotNull broadcastInvalidation broadcastinvalidation, @NotNull PhotoContext.AnonymousClass2 r3, @NotNull parseBatteryPercentage parsebatterypercentage) {
        Intrinsics.checkNotNullParameter(broadcastinvalidation, "baseResponseMapper");
        Intrinsics.checkNotNullParameter(r3, "currencyAmountModelMapper");
        Intrinsics.checkNotNullParameter(parsebatterypercentage, "servicesMapper");
        this.length = broadcastinvalidation;
        this.getMax = r3;
        this.setMax = parsebatterypercentage;
    }

    @Nullable
    public final InputBridgeExtension length(@Nullable GriverAmcsLiteConfig.AnonymousClass2 r5) {
        if (r5 == null) {
            return null;
        }
        InputBridgeExtension inputBridgeExtension = new InputBridgeExtension();
        IMultiInstanceInvalidationService.Stub stub = inputBridgeExtension;
        initWithSecurityGuard initwithsecurityguard = r5;
        if (initwithsecurityguard != null) {
            stub.setSuccess(initwithsecurityguard.isSuccess());
            stub.setErrorCode(initwithsecurityguard.getErrorCode());
            stub.setErrorMessage(initwithsecurityguard.getErrorMessage());
        }
        inputBridgeExtension.getMax = r5.getMobileNo();
        inputBridgeExtension.setMax = (CurrencyAmountModel) this.getMax.apply(r5.getBalance());
        inputBridgeExtension.getMin = r5.getAvatarUrl();
        inputBridgeExtension.setMin = r5.getNickname();
        inputBridgeExtension.length = setMin(r5.getProcessingTrans());
        inputBridgeExtension.toFloatRange = (List) this.setMax.apply(r5.getThirdPartyLinks());
        inputBridgeExtension.toIntRange = getMax(r5.getKyc());
        inputBridgeExtension.isInside = length(r5.getSurveyInfo());
        return inputBridgeExtension;
    }

    private static doCommonLog setMin(setConfigProxy setconfigproxy) {
        if (setconfigproxy == null) {
            return null;
        }
        doCommonLog docommonlog = new doCommonLog();
        docommonlog.setMin = setconfigproxy.getCount();
        docommonlog.length = setconfigproxy.isHasMore();
        return docommonlog;
    }

    private static activityGetScreenOrientation getMax(onConfigChanged onconfigchanged) {
        if (onconfigchanged == null) {
            return null;
        }
        activityGetScreenOrientation activitygetscreenorientation = new activityGetScreenOrientation();
        activitygetscreenorientation.getMax = onconfigchanged.getLevel();
        activitygetscreenorientation.setMin = onconfigchanged.getOrderStatus();
        activitygetscreenorientation.setMax = onconfigchanged.isGovFlag();
        activitygetscreenorientation.setMax(onconfigchanged.getTncUrl());
        activitygetscreenorientation.length = onconfigchanged.isUserQuits();
        return activitygetscreenorientation;
    }

    private static RVPerformanceModel length(GriverInnerAmcsLiteConfig.AnonymousClass1 r2) {
        if (r2 == null) {
            return null;
        }
        RVPerformanceModel rVPerformanceModel = new RVPerformanceModel();
        rVPerformanceModel.setMin = r2.isHasActiveSurvey();
        rVPerformanceModel.getMin(r2.getInnerUrl());
        return rVPerformanceModel;
    }
}
