package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

public final class ExtensionOpt implements getAdapterPosition<getNodeExtensionMap> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<exitApp> featureConfigEntityRepositoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<setExtensionCreator> mapperProvider;
    private final b.C0007b<clearAllMethodInvokeOptimizer> qrBarcodeEntityDataFactoryProvider;
    private final b.C0007b<reportException> qrScanWhitelistFactoryProvider;
    private final b.C0007b<setPositiveListener> splitBillPayerEntityMapperProvider;

    public interface ExceptionHandler {
        TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedQrH5Container();
    }

    public final class MethodInvokeOptimizer implements getAdapterPosition<clearAllMethodInvokeOptimizer> {
        private final b.C0007b<onAppResume> apSecurityFacadeProvider;
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<appxLoadFailed> executorProvider;
        private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

        public MethodInvokeOptimizer(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
            this.rpcConnectorProvider = bVar;
            this.executorProvider = bVar2;
            this.apSecurityFacadeProvider = bVar3;
            this.contextProvider = bVar4;
        }

        public final clearAllMethodInvokeOptimizer get() {
            return newInstance(this.rpcConnectorProvider.get(), this.executorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
        }

        public static MethodInvokeOptimizer create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
            return new MethodInvokeOptimizer(bVar, bVar2, bVar3, bVar4);
        }

        public static clearAllMethodInvokeOptimizer newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
            return new clearAllMethodInvokeOptimizer(setisurgentresource, appxloadfailed, onappresume, context);
        }
    }

    @Singleton
    public class MismatchMethodException implements ExceptionHandler {
        public TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedQrH5Container() {
            return TitleBarRightButtonView.AnonymousClass1.fromCallable(new useCache(this));
        }

        /* access modifiers changed from: private */
        public List<String> getMockedWhitelistedQrH5Container() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("\"^(http|https):\\/\\/(qr.dana.id)");
            arrayList.add("\"^(http|https):\\/\\/(link.dana.id)\"");
            arrayList.add("(m.dana.id)(\\/)");
            return arrayList;
        }
    }

    public ExtensionOpt(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<clearAllMethodInvokeOptimizer> bVar4, b.C0007b<setExtensionCreator> bVar5, b.C0007b<reportException> bVar6, b.C0007b<getAppLaunchParams> bVar7, b.C0007b<setPositiveListener> bVar8, b.C0007b<exitApp> bVar9) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.qrBarcodeEntityDataFactoryProvider = bVar4;
        this.mapperProvider = bVar5;
        this.qrScanWhitelistFactoryProvider = bVar6;
        this.errorConfigFactoryProvider = bVar7;
        this.splitBillPayerEntityMapperProvider = bVar8;
        this.featureConfigEntityRepositoryProvider = bVar9;
    }

    public final getNodeExtensionMap get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.qrBarcodeEntityDataFactoryProvider.get(), this.mapperProvider.get(), this.qrScanWhitelistFactoryProvider.get(), this.errorConfigFactoryProvider.get(), this.splitBillPayerEntityMapperProvider.get(), this.featureConfigEntityRepositoryProvider.get());
    }

    public static ExtensionOpt create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<clearAllMethodInvokeOptimizer> bVar4, b.C0007b<setExtensionCreator> bVar5, b.C0007b<reportException> bVar6, b.C0007b<getAppLaunchParams> bVar7, b.C0007b<setPositiveListener> bVar8, b.C0007b<exitApp> bVar9) {
        return new ExtensionOpt(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public static getNodeExtensionMap newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r12, BackKeyDownPoint backKeyDownPoint, clearAllMethodInvokeOptimizer clearallmethodinvokeoptimizer, setExtensionCreator setextensioncreator, reportException reportexception, getAppLaunchParams getapplaunchparams, setPositiveListener setpositivelistener, exitApp exitapp) {
        return new getNodeExtensionMap(dialogLayout, r12, backKeyDownPoint, clearallmethodinvokeoptimizer, setextensioncreator, reportexception, getapplaunchparams, setpositivelistener, exitapp);
    }
}
