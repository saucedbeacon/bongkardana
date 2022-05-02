package o;

import android.content.Context;
import io.split.android.client.network.HttpClient;
import io.split.android.client.service.executor.SplitTaskExecutor;
import io.split.android.client.service.executor.SplitTaskFactory;
import io.split.android.client.service.sseclient.notifications.NotificationParser;
import io.split.android.client.service.sseclient.notifications.NotificationProcessor;
import io.split.android.client.service.synchronizer.SyncManager;
import io.split.android.client.service.synchronizer.Synchronizer;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.StorageFactory;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import o.b;

final class getInitializer {
    getInitializer() {
    }

    /* access modifiers changed from: package-private */
    public final String buildDatabaseName(getPackageValidityCheckComp getpackagevaliditycheckcomp, String str) {
        String convertApiKeyToFolder = titleTextType.convertApiKeyToFolder(str);
        return convertApiKeyToFolder == null ? getpackagevaliditycheckcomp.defaultDataFolder() : convertApiKeyToFolder;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> buildHeaders(getPackageValidityCheckComp getpackagevaliditycheckcomp, String str) {
        putByteArrayDDpEx putbytearrayddpex = new putByteArrayDDpEx();
        putbytearrayddpex.addJsonTypeHeaders();
        putbytearrayddpex.setHostIp(getpackagevaliditycheckcomp.ip());
        putbytearrayddpex.setHostname(getpackagevaliditycheckcomp.hostname());
        putbytearrayddpex.setClientVersion(getPackageValidityCheckComp.splitSdkVersion);
        putbytearrayddpex.setApiToken(str);
        return putbytearrayddpex.build();
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> buildStreamingHeaders(String str) {
        putByteArrayDDpEx putbytearrayddpex = new putByteArrayDDpEx();
        putbytearrayddpex.addStreamingTypeHeaders();
        putbytearrayddpex.setAblyApiToken(str);
        putbytearrayddpex.setClientVersion(getPackageValidityCheckComp.splitSdkVersion);
        return putbytearrayddpex.build();
    }

    /* access modifiers changed from: package-private */
    public final getKeyType buildStorageContainer(SplitRoomDatabase splitRoomDatabase, Context context, IDataCollectionComponent iDataCollectionComponent) {
        return new getKeyType(StorageFactory.getSplitsStorage(splitRoomDatabase), StorageFactory.getMySegmentsStorage(splitRoomDatabase, iDataCollectionComponent.matchingKey()), StorageFactory.getPersistentSplitsStorage(splitRoomDatabase), StorageFactory.getPersistenEventsStorage(splitRoomDatabase), StorageFactory.getPersistenImpressionsStorage(splitRoomDatabase), StorageFactory.getPersistenImpressionsCountStorage(splitRoomDatabase));
    }

    /* access modifiers changed from: package-private */
    public final String buildSplitsFilterQueryString(getPackageValidityCheckComp getpackagevaliditycheckcomp) {
        IDynamicDataEncryptComponent syncConfig = getpackagevaliditycheckcomp.syncConfig();
        if (syncConfig != null) {
            return new getSecurityBodyComp().addFilters(syncConfig.getFilters()).build();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final unregisterInitFinishListener buildApiFacade(getPackageValidityCheckComp getpackagevaliditycheckcomp, IDataCollectionComponent iDataCollectionComponent, HttpClient httpClient, b.a aVar, String str) throws URISyntaxException {
        showCenterToast showcentertoast = new showCenterToast();
        return new unregisterInitFinishListener(registerInitFinishListener.getSplitsFetcher(showcentertoast, httpClient, getpackagevaliditycheckcomp.endpoint(), aVar, str), registerInitFinishListener.getMySegmentsFetcher(showcentertoast, httpClient, getpackagevaliditycheckcomp.endpoint(), iDataCollectionComponent.matchingKey(), aVar), registerInitFinishListener.getSseAuthenticationFetcher(showcentertoast, httpClient, getpackagevaliditycheckcomp.authServiceUrl()), registerInitFinishListener.getEventsRecorder(showcentertoast, httpClient, getpackagevaliditycheckcomp.eventsEndpoint()), registerInitFinishListener.getImpressionsRecorder(showcentertoast, httpClient, getpackagevaliditycheckcomp.eventsEndpoint()), registerInitFinishListener.getImpressionsCountRecorder(showcentertoast, httpClient, getpackagevaliditycheckcomp.eventsEndpoint()));
    }

    /* access modifiers changed from: package-private */
    public final getAppKeyByIndex buildWorkManagerWrapper(Context context, getPackageValidityCheckComp getpackagevaliditycheckcomp, String str, String str2, String str3) {
        return new getAppKeyByIndex(setTextSize.getMax(context), getpackagevaliditycheckcomp, str, str2, str3);
    }

    /* access modifiers changed from: package-private */
    public final SyncManager buildSyncManager(String str, getPackageValidityCheckComp getpackagevaliditycheckcomp, SplitTaskExecutor splitTaskExecutor, SplitTaskFactory splitTaskFactory, unregisterInitFinishListener unregisterinitfinishlistener, HttpClient httpClient, Synchronizer synchronizer) {
        SplitTaskExecutor splitTaskExecutor2 = splitTaskExecutor;
        Synchronizer synchronizer2 = synchronizer;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        LinkedBlockingDeque linkedBlockingDeque2 = new LinkedBlockingDeque();
        encryptWithToken encryptwithtoken = new encryptWithToken(synchronizer2, linkedBlockingDeque);
        decryptWithToken decryptwithtoken = new decryptWithToken(synchronizer2, linkedBlockingDeque2);
        NotificationParser notificationParser = new NotificationParser();
        NotificationProcessor notificationProcessor = new NotificationProcessor(splitTaskExecutor, splitTaskFactory, notificationParser, linkedBlockingDeque2, linkedBlockingDeque);
        ISecureSignatureComponent iSecureSignatureComponent = new ISecureSignatureComponent();
        ISimulatorDetectComponent iSimulatorDetectComponent = new ISimulatorDetectComponent(URI.create(getpackagevaliditycheckcomp.streamingServiceUrl()), httpClient, new IPkgValidityCheckComponent(), new isSimulator(notificationParser, notificationProcessor, new ISecurityBodyComponent(iSecureSignatureComponent), iSecureSignatureComponent));
        SecureSignatureDefine secureSignatureDefine = new SecureSignatureDefine(iSecureSignatureComponent, new IStaticDataEncryptComponent(unregisterinitfinishlistener.getSseAuthenticationFetcher(), str, new signWithToken()), iSimulatorDetectComponent, new staticSafeDecrypt(splitTaskExecutor2, iSecureSignatureComponent), new leaveRiskScene(new onPluginLoaded()), (ScheduledExecutorService) null);
        enterRiskScene enterriskscene = new enterRiskScene(splitTaskExecutor2, new ISafeTokenComponent(1));
        return new staticBinarySafeDecryptNoB64(getpackagevaliditycheckcomp, synchronizer, secureSignatureDefine, encryptwithtoken, decryptwithtoken, iSecureSignatureComponent, enterriskscene);
    }
}
