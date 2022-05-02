package o;

import com.alipay.iap.android.wallet.acl.base.ResultError;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.iap.ac.android.u.j;
import id.dana.domain.danah5.model.H5ShareData;
import o.AppNode;
import o.SavedStateHandleController;

public final class SingleGeneratedAdapterObserver implements TypeAdapterFactory {
    private static final ReflectiveGenericLifecycleObserver getMin = new ReflectiveGenericLifecycleObserver();
    private static final setUpdateThrottle setMin = new setUpdateThrottle();

    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == H5ShareData.class) {
            return new onJsAlert(gson, setMin, getMin);
        }
        if (typeToken.getRawType() == j.class) {
            return new AudioAttributesImpl(gson, setMin, getMin);
        }
        if (typeToken.getRawType() == ResultError.class) {
            return new getNavigationContentDescription(gson, setMin, getMin);
        }
        if (typeToken.getRawType() == AppNode.AnonymousClass1.class) {
            return new onResult(gson, setMin, getMin);
        }
        if (typeToken.getRawType() == initResult.class) {
            return new registerIn(gson, setMin, getMin) {
                private Gson getMax;
                private SavedStateHandleController length;
                private SavedStateHandleController.AnonymousClass1 setMin;

                public final void write(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: RETURN  
                      (wrap: o.AppNode$3 : 0x0056: CONSTRUCTOR  (r4v45 o.AppNode$3) = 
                      (r3v0 'gson' com.google.gson.Gson)
                      (wrap: o.setUpdateThrottle : 0x0052: SGET  (r0v92 o.setUpdateThrottle) =  o.SingleGeneratedAdapterObserver.setMin o.setUpdateThrottle)
                      (wrap: o.ReflectiveGenericLifecycleObserver : 0x0054: SGET  (r1v90 o.ReflectiveGenericLifecycleObserver) =  o.SingleGeneratedAdapterObserver.getMin o.ReflectiveGenericLifecycleObserver)
                     call: o.AppNode.3.<init>(com.google.gson.Gson, o.SavedStateHandleController$1, o.SavedStateHandleController):void type: CONSTRUCTOR)
                     in method: o.SingleGeneratedAdapterObserver.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter<T>, dex: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0056: CONSTRUCTOR  (r4v45 o.AppNode$3) = 
                      (r3v0 'gson' com.google.gson.Gson)
                      (wrap: o.setUpdateThrottle : 0x0052: SGET  (r0v92 o.setUpdateThrottle) =  o.SingleGeneratedAdapterObserver.setMin o.setUpdateThrottle)
                      (wrap: o.ReflectiveGenericLifecycleObserver : 0x0054: SGET  (r1v90 o.ReflectiveGenericLifecycleObserver) =  o.SingleGeneratedAdapterObserver.getMin o.ReflectiveGenericLifecycleObserver)
                     call: o.AppNode.3.<init>(com.google.gson.Gson, o.SavedStateHandleController$1, o.SavedStateHandleController):void type: CONSTRUCTOR in method: o.SingleGeneratedAdapterObserver.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter<T>, dex: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 52 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
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
                    	... 56 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppNode.3.write(com.google.gson.stream.JsonWriter, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	... 73 more
                    */
                /*
                    this = this;
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.domain.danah5.model.H5ShareData> r1 = id.dana.domain.danah5.model.H5ShareData.class
                    if (r0 != r1) goto L_0x0012
                    o.onJsAlert r4 = new o.onJsAlert
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0012:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.j> r1 = com.iap.ac.android.u.j.class
                    if (r0 != r1) goto L_0x0024
                    o.AudioAttributesImpl r4 = new o.AudioAttributesImpl
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0024:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.alipay.iap.android.wallet.acl.base.ResultError> r1 = com.alipay.iap.android.wallet.acl.base.ResultError.class
                    if (r0 != r1) goto L_0x0036
                    o.getNavigationContentDescription r4 = new o.getNavigationContentDescription
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0036:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.AppNode$1> r1 = o.AppNode.AnonymousClass1.class
                    if (r0 != r1) goto L_0x0048
                    o.onResult r4 = new o.onResult
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0048:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.initResult> r1 = o.initResult.class
                    if (r0 != r1) goto L_0x005a
                    o.AppNode$3 r4 = new o.AppNode$3
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x005a:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.l> r1 = com.iap.ac.android.u.l.class
                    if (r0 != r1) goto L_0x006c
                    o.AudioAttributesCompat$AttributeContentType r4 = new o.AudioAttributesCompat$AttributeContentType
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x006c:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.AppNode$6$1$1> r1 = o.AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1.class
                    if (r0 != r1) goto L_0x007e
                    o.setupResult r4 = new o.setupResult
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x007e:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.alipay.iap.android.wallet.acl.oauth.OAuthResult> r1 = com.alipay.iap.android.wallet.acl.oauth.OAuthResult.class
                    if (r0 != r1) goto L_0x0090
                    o.setTitleTextColor r4 = new o.setTitleTextColor
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0090:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.o> r1 = com.iap.ac.android.u.o.class
                    if (r0 != r1) goto L_0x00a2
                    o.MediaBrowserServiceCompat r4 = new o.MediaBrowserServiceCompat
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x00a2:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.calculateSize> r1 = o.calculateSize.class
                    if (r0 != r1) goto L_0x00b4
                    o.move r4 = new o.move
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x00b4:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.n> r1 = com.iap.ac.android.u.n.class
                    if (r0 != r1) goto L_0x00c6
                    o.AudioAttributesImplApi21Parcelizer r4 = new o.AudioAttributesImplApi21Parcelizer
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x00c6:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.AppNode$7> r1 = o.AppNode.AnonymousClass7.class
                    if (r0 != r1) goto L_0x00d8
                    o.AppNode$2$1 r4 = new o.AppNode$2$1
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x00d8:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.TitleBar> r1 = o.TitleBar.class
                    if (r0 != r1) goto L_0x00ea
                    o.inflateFromTemplate r4 = new o.inflateFromTemplate
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x00ea:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.c> r1 = com.iap.ac.android.u.c.class
                    if (r0 != r1) goto L_0x00fc
                    o.rollbackContentChanged r4 = new o.rollbackContentChanged
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x00fc:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.AppNode$8$1> r1 = o.AppNode.AnonymousClass8.AnonymousClass1.class
                    if (r0 != r1) goto L_0x010e
                    o.AppNode$4 r4 = new o.AppNode$4
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x010e:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.b> r1 = com.iap.ac.android.u.b.class
                    if (r0 != r1) goto L_0x0120
                    o.ModernAsyncTask$Status r4 = new o.ModernAsyncTask$Status
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0120:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.isEnableTabClick> r1 = o.isEnableTabClick.class
                    if (r0 != r1) goto L_0x0132
                    o.setEnableTabClick r4 = new o.setEnableTabClick
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0132:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.h5event.sendmoney.PayQueryResponse> r1 = id.dana.data.h5event.sendmoney.PayQueryResponse.class
                    if (r0 != r1) goto L_0x0144
                    o.isCreated r4 = new o.isCreated
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0144:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.e> r1 = com.iap.ac.android.u.e.class
                    if (r0 != r1) goto L_0x0156
                    o.AudioAttributesCompatParcelizer r4 = new o.AudioAttributesCompatParcelizer
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0156:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.d> r1 = com.iap.ac.android.u.d.class
                    if (r0 != r1) goto L_0x0168
                    o.dataToString r4 = new o.dataToString
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0168:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.url> r1 = o.url.class
                    if (r0 != r1) goto L_0x017a
                    o.isPackageRequest r4 = new o.isPackageRequest
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x017a:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.g> r1 = com.iap.ac.android.u.g.class
                    if (r0 != r1) goto L_0x018c
                    o.AudioAttributesCompat r4 = new o.AudioAttributesCompat
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x018c:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.saving.model.SavingBenefitEntity> r1 = id.dana.data.saving.model.SavingBenefitEntity.class
                    if (r0 != r1) goto L_0x019e
                    o.getExtParams r4 = new o.getExtParams
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x019e:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.iap.ac.android.u.i> r1 = com.iap.ac.android.u.i.class
                    if (r0 != r1) goto L_0x01b0
                    o.AudioAttributesCompat$AttributeUsage r4 = new o.AudioAttributesCompat$AttributeUsage
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x01b0:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity> r1 = id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity.class
                    if (r0 != r1) goto L_0x01c2
                    o.finishAndRemoveTask r4 = new o.finishAndRemoveTask
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x01c2:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.getNewDomainSuffix> r1 = o.getNewDomainSuffix.class
                    if (r0 != r1) goto L_0x01d4
                    o.combinePath r4 = new o.combinePath
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x01d4:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.alibaba.fastjson.JSONObject> r1 = com.alibaba.fastjson.JSONObject.class
                    if (r0 != r1) goto L_0x01e6
                    o.setLogoDescription r4 = new o.setLogoDescription
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x01e6:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.onComplete> r1 = o.onComplete.class
                    if (r0 != r1) goto L_0x01f8
                    o.AppNode$13 r4 = new o.AppNode$13
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x01f8:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.ocr.receipt.rule.Rule> r1 = id.dana.ocr.receipt.rule.Rule.class
                    if (r0 != r1) goto L_0x020a
                    o.SnapshotBridgeExtension$3 r4 = new o.SnapshotBridgeExtension$3
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x020a:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.addExtraDataParser> r1 = o.addExtraDataParser.class
                    if (r0 != r1) goto L_0x021c
                    o.getMServiceUuidStartOffset r4 = new o.getMServiceUuidStartOffset
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x021c:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.globalnetwork.model.GnAuthResult> r1 = id.dana.data.globalnetwork.model.GnAuthResult.class
                    if (r0 != r1) goto L_0x022e
                    o.FontBar r4 = new o.FontBar
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x022e:
                    java.lang.Class<com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType> r0 = com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType.class
                    java.lang.Class r1 = r4.getRawType()
                    boolean r0 = r0.isAssignableFrom(r1)
                    if (r0 == 0) goto L_0x0244
                    o.setSubtitleTextColor r4 = new o.setSubtitleTextColor
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0244:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.containsValue> r1 = o.containsValue.class
                    if (r0 != r1) goto L_0x0256
                    o.ImmutableMap r4 = new o.ImmutableMap
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0256:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.alipay.iap.android.wallet.acl.base.BaseResult> r1 = com.alipay.iap.android.wallet.acl.base.BaseResult.class
                    if (r0 != r1) goto L_0x0268
                    o.collapseActionView r4 = new o.collapseActionView
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0268:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.access$002> r1 = o.access$002.class
                    if (r0 != r1) goto L_0x027a
                    o.AppNode$11 r4 = new o.AppNode$11
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x027a:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.domain.version.Version> r1 = id.dana.domain.version.Version.class
                    if (r0 != r1) goto L_0x028c
                    o.isSupportBLE r4 = new o.isSupportBLE
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x028c:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.setDefault> r1 = o.setDefault.class
                    if (r0 != r1) goto L_0x029e
                    o.getTarget r4 = new o.getTarget
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x029e:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.nearbyme.model.MerchantConfigEntity> r1 = id.dana.data.nearbyme.model.MerchantConfigEntity.class
                    if (r0 != r1) goto L_0x02b0
                    o.createRender r4 = new o.createRender
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x02b0:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.saving.model.MainEmptyStateEntity> r1 = id.dana.data.saving.model.MainEmptyStateEntity.class
                    if (r0 != r1) goto L_0x02c2
                    o.access$602 r4 = new o.access$602
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x02c2:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.startApp> r1 = o.startApp.class
                    if (r0 != r1) goto L_0x02d4
                    o.getAppStack r4 = new o.getAppStack
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x02d4:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<id.dana.data.h5event.sendmoney.CheckoutFinishEntity> r1 = id.dana.data.h5event.sendmoney.CheckoutFinishEntity.class
                    if (r0 != r1) goto L_0x02e6
                    o.removeTabItem r4 = new o.removeTabItem
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x02e6:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.getActivityClz> r1 = o.getActivityClz.class
                    if (r0 != r1) goto L_0x02f8
                    o.finishClient r4 = new o.finishClient
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x02f8:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.inflateFromResource> r1 = o.inflateFromResource.class
                    if (r0 != r1) goto L_0x030a
                    o.setUrl r4 = new o.setUrl
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x030a:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.getExtension> r1 = o.getExtension.class
                    if (r0 != r1) goto L_0x031c
                    o.noPermissionDelete r4 = new o.noPermissionDelete
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x031c:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.onNetworkChanged> r1 = o.onNetworkChanged.class
                    if (r0 != r1) goto L_0x032e
                    o.AppNode$6$1 r4 = new o.AppNode$6$1
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x032e:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<o.JsonReader$Token> r1 = o.JsonReader$Token.class
                    if (r0 != r1) goto L_0x0340
                    o.preCreateApp r4 = new o.preCreateApp
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0340:
                    java.lang.Class r0 = r4.getRawType()
                    java.lang.Class<com.alibaba.fastjson.JSONArray> r1 = com.alibaba.fastjson.JSONArray.class
                    if (r0 != r1) goto L_0x0352
                    o.ensureLogoView r4 = new o.ensureLogoView
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0352:
                    java.lang.Class r4 = r4.getRawType()
                    java.lang.Class<o.CreateDialogParam$AgreementClickListener> r0 = o.CreateDialogParam.AgreementClickListener.class
                    if (r4 != r0) goto L_0x0364
                    o.DialogPoint r4 = new o.DialogPoint
                    o.setUpdateThrottle r0 = setMin
                    o.ReflectiveGenericLifecycleObserver r1 = getMin
                    r4.<init>(r3, r0, r1)
                    return r4
                L_0x0364:
                    r3 = 0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.SingleGeneratedAdapterObserver.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
            }
        }
