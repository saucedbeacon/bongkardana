package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.domain.profilemenu.model.ProfileCompletion;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.referral.model.MyReferralConsult;
import id.dana.tracker.constant.TrackerType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PermissionModel;
import o.ShareRecyclerAdapter;
import o.WorkerBridgeExtension;
import o.getApplicationDir;
import o.getAsyncHandler;
import o.getTypefaceByCat;
import o.onCharacteristicWriteCompleted;
import o.onConnect;
import o.setInitScene;
import o.showOptionMenuPanel;

public final class restorePullToRefresh implements setInitScene.setMin {
    /* access modifiers changed from: private */
    public final ShareRecyclerAdapter.ShareViewHolder FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public getPagePerfKey Grayscale$Algorithm;
    private H5EventDispatchHandler ICustomTabsCallback;
    WorkerBridgeExtension.AnonymousClass1 IsOverlapping;
    private onCharacteristicWriteCompleted Mean$Arithmetic;
    onConnect equals;
    private H5ResourceCORSUtil getCause;
    notifyCharacteristicValue getMax;
    /* access modifiers changed from: package-private */
    public final setInitScene.setMax getMin;
    private final showOptionMenuPanel hashCode;
    private getAsyncHandler invoke;
    private GriverAppVirtualHostProxy<disconnect> invokeSuspend;
    setBackButton isInside;
    getAppByUrl length;
    setPageCacheCapacity setMax;
    getApplicationDir setMin;
    private final getPerformanceTracker toDoubleRange;
    WorkerBridgeExtension toFloatRange;
    hideShareMenu toIntRange;
    /* access modifiers changed from: private */
    public final Context toString;
    /* access modifiers changed from: private */
    public String valueOf;
    private final GriverMonitor values;

    @Inject
    public restorePullToRefresh(Context context, setInitScene.setMax setmax, ShareRecyclerAdapter.ShareViewHolder shareViewHolder, showOptionMenuPanel showoptionmenupanel, GriverMonitor griverMonitor, getPerformanceTracker getperformancetracker, onCharacteristicWriteCompleted oncharacteristicwritecompleted, onConnect onconnect, getAsyncHandler getasynchandler, H5ResourceCORSUtil h5ResourceCORSUtil, H5EventDispatchHandler h5EventDispatchHandler) {
        this.toString = context;
        this.getMin = setmax;
        this.values = griverMonitor;
        this.FastBitmap$CoordinateSystem = shareViewHolder;
        this.hashCode = showoptionmenupanel;
        this.toDoubleRange = getperformancetracker;
        this.Mean$Arithmetic = oncharacteristicwritecompleted;
        this.equals = onconnect;
        this.invoke = getasynchandler;
        this.getCause = h5ResourceCORSUtil;
        this.ICustomTabsCallback = h5EventDispatchHandler;
    }

    public final MyReferralConsult getMax() {
        return this.isInside.setMin(this.IsOverlapping.setMax);
    }

    public final String setMin() {
        return this.IsOverlapping.setMin;
    }

    public final void length() {
        this.length.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                String str = (String) obj;
                String unused = restorePullToRefresh.this.valueOf = str;
                restorePullToRefresh.this.getMin.getMin(str);
            }

            public final void onError(Throwable th) {
                String str;
                setInitScene.setMax max = restorePullToRefresh.this.getMin;
                Context max2 = restorePullToRefresh.this.toString;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = max2.getString(R.string.general_error_msg);
                }
                max.onError(str);
                updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, "[GetAvatarUrl]MyProfilePresenter:onError", th);
            }
        });
    }

    public final void IsOverlapping() {
        GriverAppVirtualHostProxy<disconnect> griverAppVirtualHostProxy = this.invokeSuspend;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.invokeSuspend = null;
        }
    }

    public final void length(String str) {
        this.getMin.showProgress();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.toFloatRange);
        arrayList.add(this.IsOverlapping);
        arrayList.add(this.toIntRange);
        this.setMin.execute(new GriverAppVirtualHostProxy<List<SettingModel>>() {
            public final /* synthetic */ void onNext(Object obj) {
                restorePullToRefresh.this.getMin.dismissProgress();
                restorePullToRefresh.this.getMin.getMin((List<SettingModel>) (List) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                restorePullToRefresh.this.getMin.dismissProgress();
                restorePullToRefresh.this.getMin.onError(restorePullToRefresh.this.toString.getString(R.string.general_error_msg));
            }
        }, getApplicationDir.getMin.forGetSettingCollection(str, arrayList, new notNeedInitUc(this.toString) {
            private Context setMax;

            public final java.util.List<id.dana.domain.profilemenu.model.SettingModel> apply(
/*
Method generation error in method: o.ToastBridgeExtension.1.apply(java.util.Map$Entry):java.util.List<id.dana.domain.profilemenu.model.SettingModel>, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ToastBridgeExtension.1.apply(java.util.Map$Entry):java.util.List<id.dana.domain.profilemenu.model.SettingModel>, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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

            private static boolean getMin(
/*
Method generation error in method: o.ToastBridgeExtension.1.getMin(java.lang.String):boolean, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ToastBridgeExtension.1.getMin(java.lang.String):boolean, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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

            private static boolean getMax(
/*
Method generation error in method: o.ToastBridgeExtension.1.getMax(java.lang.String):boolean, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ToastBridgeExtension.1.getMax(java.lang.String):boolean, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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

            private static boolean setMax(
/*
Method generation error in method: o.ToastBridgeExtension.1.setMax(java.lang.String):boolean, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ToastBridgeExtension.1.setMax(java.lang.String):boolean, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
        }));
    }

    public final void values() {
        this.Mean$Arithmetic.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                restorePullToRefresh.this.getMin.getMin(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, "[IsNeedToShowTooltip]MyProfilePresenter:onError", th);
            }
        }, onCharacteristicWriteCompleted.getMax.forShowTooltip("profile_completion_widget"));
    }

    public final void valueOf() {
        this.getCause.execute(onReceivedIcon.INSTANCE, new PullRefreshBridgeExtension(this), queryTrackerEnable.getMin);
    }

    public final void invoke() {
        this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, "[DismissProfileCompletionWidget]MyProfilePresenter:onError", th);
            }
        }, onConnect.getMax.forSaveShowToolTip(true, PermissionModel.AnonymousClass1.PROFILE_COMPLETION_WIDGET_CLOSED));
    }

    public final void setMax(File file) {
        this.hashCode.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                restorePullToRefresh.this.getMin.getMin((String) obj);
            }

            public final void onError(Throwable th) {
                String str;
                setInitScene.setMax max = restorePullToRefresh.this.getMin;
                Context max2 = restorePullToRefresh.this.toString;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = max2.getString(R.string.general_error_msg);
                }
                max.onError(str);
                restorePullToRefresh.setMin(DanaLogConstants.Prefix.PROFILE_UPLOADAVATARURL_PREFIX, th);
            }
        }, showOptionMenuPanel.getMin.forUploadAvatar(file));
    }

    public final void isInside() {
        this.getMin.equals();
        this.values.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                super.onError(th);
                restorePullToRefresh.this.getMin.toIntRange();
                restorePullToRefresh.this.getMin.onError("");
            }

            public final /* synthetic */ void onNext(Object obj) {
                restorePullToRefresh.this.getMin.toIntRange();
                restorePullToRefresh.this.getMin.getMin();
                judgeRes.setMin(new getTypefaceByCat(new getTypefaceByCat.setMin(), (byte) 0), TrackerType.MIXPANEL, restorePullToRefresh.this.toDoubleRange).setMin();
                getDeviceName.length().onNext(Boolean.FALSE);
            }
        });
    }

    public final void equals() {
        this.getMin.showProgress();
        this.setMax.execute(Unit.INSTANCE, new Function1(this) {
            private final restorePullToRefresh getMin;

            public final java.lang.Object invoke(
/*
Method generation error in method: o.GriverShareExtensionImpl.1.invoke(java.lang.Object):java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverShareExtensionImpl.1.invoke(java.lang.Object):java.lang.Object, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
        }, new Function1(this) {
            private final restorePullToRefresh getMax;

            public final java.lang.Object invoke(
/*
Method generation error in method: o.GriverShareExtensionImpl.2.invoke(java.lang.Object):java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverShareExtensionImpl.2.invoke(java.lang.Object):java.lang.Object, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
        });
    }

    public final String toIntRange() {
        getPagePerfKey getpageperfkey = this.Grayscale$Algorithm;
        return getpageperfkey == null ? "" : getpageperfkey.setMin;
    }

    public final String toFloatRange() {
        getPagePerfKey getpageperfkey = this.Grayscale$Algorithm;
        return (getpageperfkey == null || getpageperfkey.setMax == null) ? "" : this.Grayscale$Algorithm.setMax.getMax;
    }

    public final String toDoubleRange() {
        return this.valueOf;
    }

    public final void setMax(SettingModel settingModel, getPagePerfKey getpageperfkey) {
        this.toFloatRange.length(settingModel, getpageperfkey);
    }

    public final void FastBitmap$CoordinateSystem() {
        this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SAVE_SHOW_TOOLTIP_PREFIX);
                sb.append(getClass().getName());
                sb.append(":onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), th);
            }
        }, onConnect.getMax.forSaveShowToolTip(true, "profile_completion_widget"));
    }

    public final void setMax() {
        this.getMax.dispose();
        this.length.dispose();
        this.values.dispose();
        this.hashCode.dispose();
        this.setMin.dispose();
        this.setMax.dispose();
        this.ICustomTabsCallback.dispose();
    }

    public final void getMin() {
        GriverAppVirtualHostProxy<disconnect> griverAppVirtualHostProxy = this.invokeSuspend;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.invokeSuspend = null;
        }
        notifyCharacteristicValue notifycharacteristicvalue = this.getMax;
        if (this.invokeSuspend == null) {
            this.invokeSuspend = new GriverAppVirtualHostProxy<disconnect>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getPagePerfKey min = restorePullToRefresh.this.FastBitmap$CoordinateSystem.setMin((disconnect) obj);
                    if (min != null) {
                        getPagePerfKey unused = restorePullToRefresh.this.Grayscale$Algorithm = min;
                        restorePullToRefresh.this.getMin.length();
                        restorePullToRefresh.length(restorePullToRefresh.this, min);
                        restorePullToRefresh.getMin(restorePullToRefresh.this, min);
                        restorePullToRefresh restorepulltorefresh = restorePullToRefresh.this;
                        String str = min.getMin != null ? min.getMin : "";
                        String str2 = min.setMin;
                        if (!str.matches("\\d+")) {
                            restorepulltorefresh.getMin.setMax(str2);
                        }
                    }
                }

                public final void onError(Throwable th) {
                    setInitScene.setMax unused = restorePullToRefresh.this.getMin;
                    updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, "[ProfileGetUserInfo]MyProfilePresenter:onError", th);
                }

                public final void onComplete() {
                    restorePullToRefresh restorepulltorefresh = restorePullToRefresh.this;
                    restorepulltorefresh.length.execute(new GriverAppVirtualHostProxy<String>() {
                        public final /* synthetic */ void onNext(Object obj) {
                            String str = (String) obj;
                            String unused = restorePullToRefresh.this.valueOf = str;
                            restorePullToRefresh.this.getMin.getMin(str);
                        }

                        public final void onError(Throwable th) {
                            String str;
                            setInitScene.setMax max = restorePullToRefresh.this.getMin;
                            Context max2 = restorePullToRefresh.this.toString;
                            if (th instanceof NetworkException) {
                                str = ((NetworkException) th).getMessage();
                            } else {
                                str = max2.getString(R.string.general_error_msg);
                            }
                            max.onError(str);
                            updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, "[GetAvatarUrl]MyProfilePresenter:onError", th);
                        }
                    });
                }
            };
        }
        notifycharacteristicvalue.execute(this.invokeSuspend);
    }

    static /* synthetic */ void setMin(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("MyProfilePresenter:onError");
        updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, sb.toString(), th);
    }

    static /* synthetic */ void length(restorePullToRefresh restorepulltorefresh, H5PatternHelper h5PatternHelper, Boolean bool) {
        String string = restorepulltorefresh.toString.getString(R.string.profile_completion_task_nickname);
        String nickName = h5PatternHelper.getNickName();
        if (bool.booleanValue()) {
            string = restorepulltorefresh.toString.getString(R.string.profile_completion_task_username);
            nickName = h5PatternHelper.getUsername();
        }
        String[] strArr = {restorepulltorefresh.toString.getString(R.string.profile_completion_task_phone_number), string, restorepulltorefresh.toString.getString(R.string.profile_completion_task_email), restorepulltorefresh.toString.getString(R.string.profile_completion_task_security_question), restorepulltorefresh.toString.getString(R.string.profile_completion_task_profile_picture)};
        String[] strArr2 = new String[5];
        strArr2[0] = h5PatternHelper.getPhoneNumber();
        strArr2[1] = nickName;
        strArr2[2] = h5PatternHelper.getEmail();
        String str = "";
        strArr2[3] = h5PatternHelper.getSecurityQuestionAvailable() ? Boolean.TRUE.toString() : str;
        strArr2[4] = h5PatternHelper.getUserAvatarUrl();
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            if (!TextUtils.isEmpty(strArr2[i2])) {
                i++;
            } else if (str.isEmpty()) {
                str = strArr[i2];
            }
        }
        final ProfileCompletion profileCompletion = new ProfileCompletion();
        profileCompletion.setName(str);
        profileCompletion.setViewType(13);
        profileCompletion.setAction(i != 5 ? "profile_completion_widget" : MyProfileMenuAction.CLOSE_PROFILE_COMPLETION_WIDGET);
        profileCompletion.setCompletedTaskCount(i);
        profileCompletion.setTaskCount(5);
        profileCompletion.setCurrentTaskTitle(str);
        restorepulltorefresh.Mean$Arithmetic.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z = profileCompletion.getCompletedTaskCount() != 5;
                if (booleanValue || z) {
                    restorePullToRefresh.this.getMin.getMax((SettingModel) profileCompletion);
                }
                if (z) {
                    restorePullToRefresh restorepulltorefresh = restorePullToRefresh.this;
                    restorepulltorefresh.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
                        public final void onError(Throwable th) {
                            updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, "[DismissProfileCompletionWidget]MyProfilePresenter:onError", th);
                        }
                    }, onConnect.getMax.forSaveShowToolTip(false, PermissionModel.AnonymousClass1.PROFILE_COMPLETION_WIDGET_CLOSED));
                }
            }
        }, onCharacteristicWriteCompleted.getMax.forShowTooltip(PermissionModel.AnonymousClass1.PROFILE_COMPLETION_WIDGET_CLOSED));
    }

    static /* synthetic */ void length(restorePullToRefresh restorepulltorefresh, getPagePerfKey getpageperfkey) {
        if (!TextUtils.isEmpty(getpageperfkey.getMin)) {
            restorepulltorefresh.getMin.length(getpageperfkey.getMin);
        }
    }

    static /* synthetic */ void getMin(restorePullToRefresh restorepulltorefresh, getPagePerfKey getpageperfkey) {
        if (getpageperfkey.setMax != null) {
            activityGetScreenOrientation activitygetscreenorientation = getpageperfkey.setMax;
            restorepulltorefresh.getMin.getMax(activitygetscreenorientation.getMax, activitygetscreenorientation.setMin);
            if (getpageperfkey.toIntRange != null) {
                restorepulltorefresh.getMin.getMax(getpageperfkey);
            }
        }
    }

    static /* synthetic */ Unit length(restorePullToRefresh restorepulltorefresh, H5MemData h5MemData) {
        if (h5MemData.isVisible()) {
            restorepulltorefresh.invoke.execute(new getAsyncHandler.setMin("1.0.0"), new GriverShareExtensionImpl(restorepulltorefresh), setCanPullDown.length);
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit getMin(restorePullToRefresh restorepulltorefresh, Boolean bool) {
        restorepulltorefresh.getMin.dismissProgress();
        restorepulltorefresh.getMin.getMax(bool.booleanValue());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit length(restorePullToRefresh restorepulltorefresh) {
        restorepulltorefresh.getMin.dismissProgress();
        restorepulltorefresh.getMin.onError(restorepulltorefresh.toString.getString(R.string.general_error_msg));
        return Unit.INSTANCE;
    }
}
