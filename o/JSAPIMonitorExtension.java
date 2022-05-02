package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverEnv;
import o.GriverManifest;
import o.GriverShouldLoadUrlExtension;
import o.LocationBridgeExtension;
import o.NebulaAuthDialogProxy;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/kycamledd/KycAmlEddPresenter;", "Lid/dana/kycamledd/KycAmlEddContract$Presenter;", "view", "Lid/dana/kycamledd/KycAmlEddContract$View;", "getKycAmlEddConsult", "Lid/dana/domain/kycamledd/interactor/GetKycAmlEddConsult;", "submitEddAmlKyc", "Lid/dana/domain/kycamledd/interactor/SubmitEddAmlKyc;", "(Lid/dana/kycamledd/KycAmlEddContract$View;Lid/dana/domain/kycamledd/interactor/GetKycAmlEddConsult;Lid/dana/domain/kycamledd/interactor/SubmitEddAmlKyc;)V", "questionAnswerHashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "checkAmlRequired", "", "convertHashMapToSubmitModel", "Lid/dana/kycamledd/model/EddSubmitInfoModel;", "amlOrderId", "getHashMapSize", "onDestroy", "submitKycAmlEdd", "updateHashMap", "questionId", "answerId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class JSAPIMonitorExtension implements GriverShouldLoadUrlExtension.AnonymousClass1.setMin {
    public final GriverEnv.AnonymousClass1 getMax;
    public final GriverRVEnvironmentServiceImpl getMin;
    public final HashMap<String, String> length = new HashMap<>();
    public final GriverShouldLoadUrlExtension.AnonymousClass1.getMax setMin;

    @Inject
    public JSAPIMonitorExtension(@NotNull GriverShouldLoadUrlExtension.AnonymousClass1.getMax getmax, @NotNull GriverEnv.AnonymousClass1 r3, @NotNull GriverRVEnvironmentServiceImpl griverRVEnvironmentServiceImpl) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(r3, "getKycAmlEddConsult");
        Intrinsics.checkNotNullParameter(griverRVEnvironmentServiceImpl, "submitEddAmlKyc");
        this.setMin = getmax;
        this.getMax = r3;
        this.getMin = griverRVEnvironmentServiceImpl;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/kycamledd/KycAmlEddPresenter$checkAmlRequired$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/kycamledd/model/EddConsult;", "onError", "", "e", "", "onNext", "kycAmlEddConsult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<GriverEnv.AnonymousClass2> {
        final /* synthetic */ JSAPIMonitorExtension setMin;

        public getMin(JSAPIMonitorExtension jSAPIMonitorExtension) {
            this.setMin = jSAPIMonitorExtension;
        }

        public final /* synthetic */ void onNext(Object obj) {
            GriverEnv.AnonymousClass2 r5 = (GriverEnv.AnonymousClass2) obj;
            Intrinsics.checkNotNullParameter(r5, "kycAmlEddConsult");
            GriverShouldLoadUrlExtension.AnonymousClass1.getMax min = this.setMin.setMin;
            Intrinsics.checkNotNullParameter(r5, "$this$toEddConsultModel");
            boolean eddStatus = r5.getEddStatus();
            GriverRVResourceEnvProxyImpl eddInfo = r5.getEddInfo();
            min.setMax(true, new GriverManifest.AnonymousClass6(eddStatus, eddInfo != null ? LocationBridgeExtension.AnonymousClass1.setMax(eddInfo) : null, r5.getEddMandatory()));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMin.setMin.setMax(false, new GriverManifest.AnonymousClass6((byte) 0));
        }
    }

    public final NebulaAuthDialogProxy.AnonymousClass1 getMin(String str) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.length.entrySet()) {
            arrayList.add(new NebulaAuthDialogProxy.AnonymousClass2((String) entry.getKey(), (String) entry.getValue()));
        }
        return new NebulaAuthDialogProxy.AnonymousClass1(str, arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/kycamledd/KycAmlEddPresenter$submitKycAmlEdd$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "success", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ JSAPIMonitorExtension setMax;

        public length(JSAPIMonitorExtension jSAPIMonitorExtension) {
            this.setMax = jSAPIMonitorExtension;
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.setMax.setMin.dismissProgress();
            if (booleanValue) {
                this.setMax.setMin.setMax();
            } else {
                this.setMax.setMin.onError("");
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.BizType.SUBMIT_KYC_AML_EDD, th.getMessage());
            this.setMax.setMin.onError("");
        }
    }

    public final void setMax() {
        this.getMax.dispose();
        this.getMin.dispose();
    }
}
