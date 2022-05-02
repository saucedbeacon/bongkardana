package o;

import android.content.Context;
import io.split.android.client.SplitClient;
import io.split.android.client.SplitFactory;
import io.split.android.client.SplitManager;
import io.split.android.client.factory.FactoryMonitor;
import io.split.android.client.impressions.ImpressionListener;
import io.split.android.client.lifecycle.SplitLifecycleManager;
import io.split.android.client.metrics.DTOMetrics;
import io.split.android.client.network.HttpClient;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutor;
import io.split.android.client.service.executor.SplitTaskFactory;
import io.split.android.client.service.synchronizer.SyncManager;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.splits.SplitsStorage;
import io.split.android.client.validators.SplitValidator;
import io.split.android.client.validators.ValidationMessageLogger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o.putByteArrayDDp;

public class getGlobalUserData implements SplitFactory {
    /* access modifiers changed from: private */
    public final String _apiKey;
    private final SplitClient _client;
    /* access modifiers changed from: private */
    public FactoryMonitor _factoryMonitor;
    /* access modifiers changed from: private */
    public SplitLifecycleManager _lifecyleManager;
    /* access modifiers changed from: private */
    public final SplitManager _manager;
    private SplitRoomDatabase _splitDatabase;
    /* access modifiers changed from: private */
    public SyncManager _syncManager;
    private final Runnable destroyer;
    /* access modifiers changed from: private */
    public boolean isTerminated;

    public getGlobalUserData(String str, IDataCollectionComponent iDataCollectionComponent, getPackageValidityCheckComp getpackagevaliditycheckcomp, Context context) throws URISyntaxException {
        this(str, iDataCollectionComponent, getpackagevaliditycheckcomp, context, (HttpClient) null, (SplitRoomDatabase) null);
    }

    private getGlobalUserData(String str, IDataCollectionComponent iDataCollectionComponent, getPackageValidityCheckComp getpackagevaliditycheckcomp, Context context, HttpClient httpClient, SplitRoomDatabase splitRoomDatabase) throws URISyntaxException {
        String str2 = str;
        getPackageValidityCheckComp getpackagevaliditycheckcomp2 = getpackagevaliditycheckcomp;
        Context context2 = context;
        SplitRoomDatabase splitRoomDatabase2 = splitRoomDatabase;
        this.isTerminated = false;
        this._factoryMonitor = dynamicEncryptByteArray.getSharedInstance();
        getInitializer getinitializer = new getInitializer();
        setupValidations(getpackagevaliditycheckcomp2);
        bodyContentTextType bodycontenttexttype = new bodyContentTextType();
        bodyTitleTextType bodytitletexttype = new bodyTitleTextType();
        setTranslucent settranslucent = new setTranslucent();
        HttpClient build = httpClient == null ? new putByteArrayDDp.getMax().setConnectionTimeout((long) getpackagevaliditycheckcomp.connectionTimeout()).setReadTimeout((long) getpackagevaliditycheckcomp.readTimeout()).setProxy(getpackagevaliditycheckcomp.proxy()).enableSslDevelopmentMode(getpackagevaliditycheckcomp.isSslDevelopmentModeEnabled()).setContext(context2).setProxyAuthenticator(getpackagevaliditycheckcomp.authenticator()).build() : httpClient;
        setTranslucentForCoordinatorLayout validate = bodytitletexttype.validate(iDataCollectionComponent.matchingKey(), iDataCollectionComponent.bucketingKey());
        if (validate != null) {
            settranslucent.log(validate, "factory instantiation");
        }
        setTranslucentForCoordinatorLayout validate2 = bodycontenttexttype.validate(str2);
        if (validate2 != null) {
            settranslucent.log(validate2, "factory instantiation");
        }
        int count = this._factoryMonitor.count(str2);
        if (count > 0) {
            StringBuilder sb = new StringBuilder("You already have ");
            sb.append(count);
            sb.append(count == 1 ? " factory" : " factories");
            sb.append("with this API Key. We recommend keeping only one instance of the factory at all times (Singleton pattern) and reusing it throughout your application.");
            settranslucent.w(sb.toString(), "factory instantiation");
        } else if (this._factoryMonitor.count() > 0) {
            settranslucent.w("You already have an instance of the Split factory. Make sure you definitely want this additional instance. We recommend keeping only one instance of the factory at all times (Singleton pattern) and reusing it throughout your application.", "factory instantiation");
        }
        this._factoryMonitor.add(str2);
        this._apiKey = str2;
        String buildDatabaseName = getinitializer.buildDatabaseName(getpackagevaliditycheckcomp2, str2);
        if (splitRoomDatabase2 == null) {
            this._splitDatabase = SplitRoomDatabase.getDatabase(context2, buildDatabaseName);
        } else {
            this._splitDatabase = splitRoomDatabase2;
            createLoadingDialog.d("Using test database");
        }
        build.addHeaders(getinitializer.buildHeaders(getpackagevaliditycheckcomp2, str2));
        build.addStreamingHeaders(getinitializer.buildStreamingHeaders(str2));
        removeFloat create = removeFloat.create(build, URI.create(getpackagevaliditycheckcomp.eventsEndpoint()));
        removeBoolean instance = removeBoolean.instance(create, 2, 1000);
        setNick setnick = new setNick(getpackagevaliditycheckcomp2);
        getKeyType buildStorageContainer = getinitializer.buildStorageContainer(this._splitDatabase, context2, iDataCollectionComponent);
        setTransparentForImageViewInFragment settransparentforimageviewinfragment = new setTransparentForImageViewInFragment(buildStorageContainer.getMySegmentsStorage());
        removeBoolean instance2 = removeBoolean.instance(new putByteArray((DTOMetrics) create, TimeUnit.SECONDS.toMillis((long) getpackagevaliditycheckcomp.metricsRefreshRate())), 2, 1000);
        String buildSplitsFilterQueryString = getinitializer.buildSplitsFilterQueryString(getpackagevaliditycheckcomp2);
        getPackageValidityCheckComp getpackagevaliditycheckcomp3 = getpackagevaliditycheckcomp;
        setNick setnick2 = setnick;
        unregisterInitFinishListener buildApiFacade = getinitializer.buildApiFacade(getpackagevaliditycheckcomp3, iDataCollectionComponent, build, instance2, buildSplitsFilterQueryString);
        onPluginLoaded onpluginloaded = new onPluginLoaded();
        String str3 = buildSplitsFilterQueryString;
        getSGPluginInfo getsgplugininfo = r4;
        getSGPluginInfo getsgplugininfo2 = new getSGPluginInfo(getpackagevaliditycheckcomp3, buildApiFacade, buildStorageContainer, str3, setnick2);
        cleanUpDabase(onpluginloaded, getsgplugininfo);
        onPluginLoaded onpluginloaded2 = onpluginloaded;
        getSGPluginInfo getsgplugininfo3 = getsgplugininfo;
        setTransparentForImageViewInFragment settransparentforimageviewinfragment2 = settransparentforimageviewinfragment;
        SyncManager buildSyncManager = getinitializer.buildSyncManager(iDataCollectionComponent.matchingKey(), getpackagevaliditycheckcomp, onpluginloaded2, getsgplugininfo3, buildApiFacade, build, new IStaticDataStoreComponent(getpackagevaliditycheckcomp, onpluginloaded2, buildStorageContainer, getsgplugininfo3, setnick2, getinitializer.buildWorkManagerWrapper(context, getpackagevaliditycheckcomp, str, iDataCollectionComponent.matchingKey(), buildDatabaseName), new getMalDetectionComp()));
        this._syncManager = buildSyncManager;
        buildSyncManager.start();
        ImpressionListener iDynamicDataStoreComponent = new IDynamicDataStoreComponent(this._syncManager);
        if (getpackagevaliditycheckcomp.impressionListener() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDynamicDataStoreComponent);
            arrayList.add(getpackagevaliditycheckcomp.impressionListener());
            iDynamicDataStoreComponent = new ImpressionListener.setMax(arrayList);
        }
        ImpressionListener impressionListener = iDynamicDataStoreComponent;
        SplitLifecycleManager splitLifecycleManager = new SplitLifecycleManager();
        this._lifecyleManager = splitLifecycleManager;
        splitLifecycleManager.register(this._syncManager);
        final removeBoolean removeboolean = instance;
        final removeBoolean removeboolean2 = instance2;
        final ImpressionListener impressionListener2 = impressionListener;
        final HttpClient httpClient2 = build;
        final onPluginLoaded onpluginloaded3 = onpluginloaded2;
        this.destroyer = new Runnable() {
            public final void run() {
                createLoadingDialog.w("Shutdown called for split");
                try {
                    getGlobalUserData.this._syncManager.stop();
                    createLoadingDialog.i("Flushing impressions and events");
                    getGlobalUserData.this._lifecyleManager.destroy();
                    createLoadingDialog.i("Successful shutdown of lifecycle manager");
                    getGlobalUserData.this._factoryMonitor.remove(getGlobalUserData.this._apiKey);
                    createLoadingDialog.i("Successful shutdown of segment fetchers");
                    removeboolean.close();
                    createLoadingDialog.i("Successful shutdown of metrics 1");
                    removeboolean2.close();
                    createLoadingDialog.i("Successful shutdown of metrics 2");
                    impressionListener2.close();
                    createLoadingDialog.i("Successful shutdown of ImpressionListener");
                    httpClient2.close();
                    createLoadingDialog.i("Successful shutdown of httpclient");
                    getGlobalUserData.this._manager.destroy();
                    createLoadingDialog.i("Successful shutdown of manager");
                    onpluginloaded3.stop();
                    createLoadingDialog.i("Successful shutdown of task executor");
                } catch (Exception e) {
                    createLoadingDialog.e(e, "We could not shutdown split", new Object[0]);
                } catch (Throwable th) {
                    boolean unused = getGlobalUserData.this.isTerminated = true;
                    throw th;
                }
                boolean unused2 = getGlobalUserData.this.isTerminated = true;
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public final void run() {
                getGlobalUserData.this.destroy();
            }
        });
        setTransparentForImageViewInFragment settransparentforimageviewinfragment3 = settransparentforimageviewinfragment2;
        this._client = new getAtlasEncryptComp(this, iDataCollectionComponent, settransparentforimageviewinfragment3, impressionListener2, instance2, getpackagevaliditycheckcomp, setnick2, buildStorageContainer.getSplitsStorage(), new getStaticDataStoreComp(), this._syncManager);
        this._manager = new SplitManager(buildStorageContainer.getSplitsStorage(), new StatusBarUtil(), settransparentforimageviewinfragment3) {
            private boolean _isManagerDestroyed;
            private final setTransparentForImageViewInFragment _splitParser;
            private SplitValidator _splitValidator;
            private final SplitsStorage _splitsStorage;
            private ValidationMessageLogger _validationMessageLogger;

            public final java.util.List<o.IAtlasEncryptComponent> splits(
/*
Method generation error in method: o.SecurityGuardManager.1.splits():java.util.List<o.IAtlasEncryptComponent>, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecurityGuardManager.1.splits():java.util.List<o.IAtlasEncryptComponent>, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final o.IAtlasEncryptComponent split(
/*
Method generation error in method: o.SecurityGuardManager.1.split(java.lang.String):o.IAtlasEncryptComponent, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecurityGuardManager.1.split(java.lang.String):o.IAtlasEncryptComponent, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final java.util.List<java.lang.String> splitNames(
/*
Method generation error in method: o.SecurityGuardManager.1.splitNames():java.util.List<java.lang.String>, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecurityGuardManager.1.splitNames():java.util.List<java.lang.String>, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void destroy(
/*
Method generation error in method: o.SecurityGuardManager.1.destroy():void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecurityGuardManager.1.destroy():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            private o.IAtlasEncryptComponent toSplitView(
/*
Method generation error in method: o.SecurityGuardManager.1.toSplitView(o.setLightMode):o.IAtlasEncryptComponent, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecurityGuardManager.1.toSplitView(o.setLightMode):o.IAtlasEncryptComponent, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        };
        setnick2.getExecutorResources().setSplitClient(this._client);
        createLoadingDialog.i("Android SDK initialized!");
    }

    public SplitClient client() {
        return this._client;
    }

    public SplitManager manager() {
        return this._manager;
    }

    public void destroy() {
        synchronized (getGlobalUserData.class) {
            if (!this.isTerminated) {
                new Thread(this.destroyer).start();
            }
        }
    }

    public void flush() {
        this._syncManager.flush();
    }

    public boolean isReady() {
        return this._client.isReady();
    }

    private void setupValidations(getPackageValidityCheckComp getpackagevaliditycheckcomp) {
        setTransparentForImageView.getInstance().setMaximumKeyLength(getpackagevaliditycheckcomp.maximumKeyLength());
        setTransparentForImageView.getInstance().setTrackEventNamePattern(getpackagevaliditycheckcomp.trackEventNamePattern());
    }

    private void cleanUpDabase(SplitTaskExecutor splitTaskExecutor, SplitTaskFactory splitTaskFactory) {
        splitTaskExecutor.submit(splitTaskFactory.createCleanUpDatabaseTask(System.currentTimeMillis() / 1000), (SplitTaskExecutionListener) null);
    }
}
