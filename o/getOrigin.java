package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.google.gson.Gson;
import id.dana.data.Source;
import id.dana.data.base.NetworkException;
import id.dana.data.userconfig.BiztypeEmptyException;
import id.dana.data.userconfig.BiztypeNotFoundException;
import id.dana.data.userconfig.BiztypeTooLongException;
import id.dana.data.userconfig.ConfigContentNullException;
import java.util.Calendar;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
public class getOrigin implements AppModel {
    private final onCallBack configEntityDataFactory;
    private final extractScene etagEntityData;
    private final setContainerInfo localUserConfigDataSource;
    private final setContainerInfo networkUserConfigDataSource;
    private final Gson serializer;

    /* access modifiers changed from: private */
    public static /* synthetic */ getPluginModels lambda$getUserConfigFromNetwork$15(getPluginModels getpluginmodels, Boolean bool) throws Exception {
        return getpluginmodels;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ readToArray lambda$saveUserConfigToLocalAfterBackend$2(readToArray readtoarray) throws Exception {
        return readtoarray;
    }

    @Inject
    public getOrigin(Gson gson, getContainerInfo getcontainerinfo, setExtendInfos setextendinfos, onCallBack oncallback) {
        this.serializer = gson;
        this.localUserConfigDataSource = getcontainerinfo.createData("local");
        this.networkUserConfigDataSource = getcontainerinfo.createData("network");
        this.etagEntityData = setextendinfos;
        this.configEntityDataFactory = oncallback;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [o.onFirstScanTime<T>, o.onFirstScanTime] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> o.TitleBarRightButtonView.AnonymousClass1<T> getUserSpecificConfig(o.onFirstScanTime<T> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getBizType()
            java.lang.Class r4 = r4.getContentType()
            o.TitleBarRightButtonView$1 r1 = r3.validateInput(r0, r4)
            o.RedDotDrawable r2 = r3.getEtag(r0)
            o.TitleBarRightButtonView$1 r1 = r1.flatMap(r2)
            o.RedDotDrawable r0 = r3.getQueryRequest(r0)
            o.TitleBarRightButtonView$1 r0 = r1.map(r0)
            o.RedDotDrawable r1 = r3.getUserConfig()
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r1)
            o.RedDotDrawable r1 = r3.isContentFound()
            o.TitleBarRightButtonView$1 r0 = r0.map(r1)
            o.RedDotDrawable r4 = r3.convertContentToType(r4)
            o.TitleBarRightButtonView$1 r4 = r0.map(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getOrigin.getUserSpecificConfig(o.onFirstScanTime):o.TitleBarRightButtonView$1");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserSpecificConfigBackendFirst(onConnectedSuccessful onconnectedsuccessful) {
        return saveUserConfig(onconnectedsuccessful, saveUserConfigBackendFirst(onconnectedsuccessful));
    }

    @NonNull
    private RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass1<readToArray>> saveUserConfigBackendFirst(onConnectedSuccessful onconnectedsuccessful) {
        return new RedDotDrawable(this, onconnectedsuccessful, createUserConfigToSave(onconnectedsuccessful)) {
            private final setValidDomains getMax;
            private final getOrigin length;
            private final onConnectedSuccessful setMax;

            public final java.lang.Object apply(
/*
Method generation error in method: o.AppInfoModel.1.apply(java.lang.Object):java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppInfoModel.1.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$saveUserConfigBackendFirst$1(onConnectedSuccessful onconnectedsuccessful, setValidDomains setvaliddomains, Boolean bool) throws Exception {
        return getSplitConfigEntityData().isUserConfigSyncEnable(onconnectedsuccessful.getSyncKey()).onErrorResumeNext(getAmcsConfigEntityData().isUserConfigSyncEnable(onconnectedsuccessful.getSyncKey())).flatMap(new disableCache(this, setvaliddomains));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveUserConfigBackendFirst$0(setValidDomains setvaliddomains, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE).flatMap(saveUserConfigToRemote(setvaliddomains)).flatMap(saveUserConfigToLocalAfterBackend(setvaliddomains));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(new readToArray());
    }

    @NonNull
    private RedDotDrawable<readToArray, TitleBarRightButtonView.AnonymousClass4<readToArray>> saveUserConfigToLocalAfterBackend(setValidDomains setvaliddomains) {
        return new setSlogan(this, setvaliddomains);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveUserConfigToLocalAfterBackend$3(setValidDomains setvaliddomains, readToArray readtoarray) throws Exception {
        if (readtoarray.success) {
            return this.localUserConfigDataSource.saveUserConfig(setvaliddomains).map(AppInfoQuery.getMin);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(readtoarray);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserSpecificConfig(onConnectedSuccessful onconnectedsuccessful) {
        return saveUserConfig(onconnectedsuccessful, saveUserConfigLocalFirst(onconnectedsuccessful));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserConfig(onConnectedSuccessful onconnectedsuccessful, RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass1<readToArray>> redDotDrawable) {
        return validateInput(onconnectedsuccessful.bizType, onconnectedsuccessful.content).flatMap(redDotDrawable).map(handleSaveResult());
    }

    @NotNull
    private RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass1<readToArray>> saveUserConfigLocalFirst(onConnectedSuccessful onconnectedsuccessful) {
        return new scene(this, onconnectedsuccessful);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$saveUserConfigLocalFirst$4(onConnectedSuccessful onconnectedsuccessful, Boolean bool) throws Exception {
        setValidDomains createUserConfigToSave = createUserConfigToSave(onconnectedsuccessful);
        return this.localUserConfigDataSource.saveUserConfig(createUserConfigToSave).flatMap(isUserConfigSyncEnable(onconnectedsuccessful.getSyncKey())).flatMap(saveUserConfigToRemote(createUserConfigToSave));
    }

    @NotNull
    private RedDotDrawable<readToArray, Boolean> handleSaveResult() {
        return AppInfoScene.setMin;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$handleSaveResult$5(readToArray readtoarray) throws Exception {
        if (readtoarray.success) {
            return Boolean.TRUE;
        }
        throw new NetworkException((BaseRpcResult) readtoarray);
    }

    @NotNull
    private setValidDomains createUserConfigToSave(onConnectedSuccessful onconnectedsuccessful) {
        return new setValidDomains(onconnectedsuccessful.bizType, this.serializer.toJson((Object) onconnectedsuccessful.content), Calendar.getInstance().getTimeInMillis());
    }

    @NotNull
    private RedDotDrawable<readToArray, TitleBarRightButtonView.AnonymousClass4<Boolean>> isUserConfigSyncEnable(String str) {
        return new isDevSource(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$isUserConfigSyncEnable$6(String str, readToArray readtoarray) throws Exception {
        return getSplitConfigEntityData().isUserConfigSyncEnable(str).onErrorResumeNext(getAmcsConfigEntityData().isUserConfigSyncEnable(str));
    }

    @NotNull
    private RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<readToArray>> saveUserConfigToRemote(setValidDomains setvaliddomains) {
        return new isOnlineScene(this, setvaliddomains);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveUserConfigToRemote$7(setValidDomains setvaliddomains, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return this.networkUserConfigDataSource.saveUserConfig(setvaliddomains);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(readToArray.success());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> syncInAllUserConfig() {
        return this.networkUserConfigDataSource.getAllUserConfig().flatMap(new forSpecificVersion(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$syncInAllUserConfig$8(getPluginModels getpluginmodels) throws Exception {
        if (getpluginmodels.success) {
            return saveUserConfigToLocal(getpluginmodels);
        }
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NetworkException((BaseRpcResult) getpluginmodels));
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> validateInput(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new BiztypeEmptyException());
        }
        if (str.length() > 35) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new BiztypeTooLongException());
        }
        if (obj == null) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new ConfigContentNullException());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    @NotNull
    private RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<String>> getEtag(String str) {
        return new isDisableCache(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getEtag$9(String str, Boolean bool) throws Exception {
        return this.etagEntityData.getEtag(str);
    }

    @NotNull
    private RedDotDrawable<String, generateFromJSON> getQueryRequest(String str) {
        return new getAppInfoModel(str);
    }

    @NotNull
    private RedDotDrawable<generateFromJSON, TitleBarRightButtonView.AnonymousClass4<getPluginModels>> getUserConfig() {
        return new extractSceneVersion(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserConfig$12(generateFromJSON generatefromjson) throws Exception {
        return this.localUserConfigDataSource.getUserConfig(generatefromjson).flatMap(new getScene(this, generatefromjson));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserConfig$11(generateFromJSON generatefromjson, getPluginModels getpluginmodels) throws Exception {
        if (!getpluginmodels.success || getpluginmodels.isEmpty()) {
            return getUserConfigFromNetwork(generatefromjson);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(getpluginmodels);
    }

    @NotNull
    private RedDotDrawable<getPluginModels, setValidDomains> isContentFound() {
        return getSlogan.setMax;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ setValidDomains lambda$isContentFound$13(getPluginModels getpluginmodels) throws Exception {
        if (getpluginmodels.success && !getpluginmodels.isEmpty()) {
            return getpluginmodels.getConfigs().get(0);
        }
        throw new BiztypeNotFoundException();
    }

    @NotNull
    private <T> RedDotDrawable<setValidDomains, T> convertContentToType(Class<T> cls) {
        return new getReqmode(this, cls);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$convertContentToType$14(Class cls, setValidDomains setvaliddomains) throws Exception {
        return this.serializer.fromJson(setvaliddomains.getContent(), cls);
    }

    private TitleBarRightButtonView.AnonymousClass4<getPluginModels> getUserConfigFromNetwork(generateFromJSON generatefromjson) {
        return this.networkUserConfigDataSource.getUserConfig(generatefromjson).flatMap(new setReqmode(this, generatefromjson));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getUserConfigFromNetwork$16(generateFromJSON generatefromjson, getPluginModels getpluginmodels) throws Exception {
        if (!getpluginmodels.success) {
            throw new NetworkException((BaseRpcResult) getpluginmodels);
        } else if (isContentModified(generatefromjson, getpluginmodels)) {
            return saveUserConfigToLocal(getpluginmodels).map(new forHighestVersion(getpluginmodels));
        } else {
            return TitleBarRightButtonView.AnonymousClass1.just(getpluginmodels);
        }
    }

    private boolean isContentModified(generateFromJSON generatefromjson, getPluginModels getpluginmodels) {
        return !generatefromjson.getEtag().equals(getpluginmodels.getEtag());
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserConfigToLocal(getPluginModels getpluginmodels) {
        for (setValidDomains next : getpluginmodels.getConfigs()) {
            this.localUserConfigDataSource.saveUserConfig(next);
            this.etagEntityData.saveEtag(next.getBizType(), getpluginmodels.getEtag());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    private AppMsgReceiver.AnonymousClass2 getAmcsConfigEntityData() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private AppMsgReceiver.AnonymousClass2 getSplitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }
}
