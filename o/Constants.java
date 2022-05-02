package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.OpenAPIBridgeExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache$Param;", "referralRepository", "Lid/dana/domain/referral/ReferralRepository;", "(Lid/dana/domain/referral/ReferralRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "param", "replaceSameScenarioCache", "", "dialogCaches", "", "Lid/dana/domain/referral/model/ReferralEngagementDialogCache;", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class Constants extends APWebChromeClient<Boolean, getMax> {
    /* access modifiers changed from: private */
    public final GriverSwtich referralRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "dialogCaches", "", "Lid/dana/domain/referral/model/ReferralEngagementDialogCache;", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<List<OpenAPIBridgeExtension.AnonymousClass3>, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ Constants getMin;
        final /* synthetic */ getMax setMin;

        getMin(Constants constants, getMax getmax) {
            this.getMin = constants;
            this.setMin = getmax;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "dialogCaches");
            this.getMin.replaceSameScenarioCache(list, this.setMin);
            return this.getMin.referralRepository.saveDialogCache(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public Constants(@NotNull GriverSwtich griverSwtich) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverSwtich, "referralRepository");
        this.referralRepository = griverSwtich;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "param");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.referralRepository.getDialogCaches().flatMap(new getMin(this, getmax));
        Intrinsics.checkNotNullExpressionValue(flatMap, "referralRepository.dialo…alogCaches)\n            }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final void replaceSameScenarioCache(List<OpenAPIBridgeExtension.AnonymousClass3> list, getMax getmax) {
        boolean z = false;
        int i = 0;
        while (!z && i <= CollectionsKt.getLastIndex(list)) {
            if (Intrinsics.areEqual((Object) getmax.getScenario(), (Object) list.get(i).getScenario())) {
                list.remove(i);
                z = true;
            }
            i++;
        }
        list.add(new Object(getmax.getScenario(), getmax.getShowDialog(), getmax.getCurrentUnixEpochTime()) {
            @NotNull
            private final String scenario;
            private final boolean showHomeReferralPopup;
            private final long showPopUpTimerSeed;

            public static /* synthetic */ AnonymousClass3 copy$default(AnonymousClass3 r0, String str, boolean z, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = r0.scenario;
                }
                if ((i & 2) != 0) {
                    z = r0.showHomeReferralPopup;
                }
                if ((i & 4) != 0) {
                    j = r0.showPopUpTimerSeed;
                }
                return r0.copy(str, z, j);
            }

            @NotNull
            public final String component1() {
                return this.scenario;
            }

            public final boolean component2() {
                return this.showHomeReferralPopup;
            }

            public final long component3() {
                return this.showPopUpTimerSeed;
            }

            @NotNull
            public final AnonymousClass3 copy(@NotNull String str, boolean z, long j) {
                Intrinsics.checkNotNullParameter(str, "scenario");
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: INVOKE  
                      (r6v0 'list' java.util.List<o.OpenAPIBridgeExtension$3>)
                      (wrap: o.OpenAPIBridgeExtension$3 : 0x0033: CONSTRUCTOR  (r0v2 o.OpenAPIBridgeExtension$3) = 
                      (wrap: java.lang.String : 0x0027: INVOKE  (r1v2 java.lang.String) = (r7v0 'getmax' o.Constants$getMax) o.Constants.getMax.getScenario():java.lang.String type: VIRTUAL)
                      (wrap: boolean : 0x002b: INVOKE  (r2v0 boolean) = (r7v0 'getmax' o.Constants$getMax) o.Constants.getMax.getShowDialog():boolean type: VIRTUAL)
                      (wrap: long : 0x002f: INVOKE  (r3v0 long) = (r7v0 'getmax' o.Constants$getMax) o.Constants.getMax.getCurrentUnixEpochTime():long type: VIRTUAL)
                     call: o.OpenAPIBridgeExtension.3.<init>(java.lang.String, boolean, long):void type: CONSTRUCTOR)
                     java.util.List.add(java.lang.Object):boolean type: INTERFACE in method: o.Constants.replaceSameScenarioCache(java.util.List, o.Constants$getMax):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR  (r0v2 o.OpenAPIBridgeExtension$3) = 
                      (wrap: java.lang.String : 0x0027: INVOKE  (r1v2 java.lang.String) = (r7v0 'getmax' o.Constants$getMax) o.Constants.getMax.getScenario():java.lang.String type: VIRTUAL)
                      (wrap: boolean : 0x002b: INVOKE  (r2v0 boolean) = (r7v0 'getmax' o.Constants$getMax) o.Constants.getMax.getShowDialog():boolean type: VIRTUAL)
                      (wrap: long : 0x002f: INVOKE  (r3v0 long) = (r7v0 'getmax' o.Constants$getMax) o.Constants.getMax.getCurrentUnixEpochTime():long type: VIRTUAL)
                     call: o.OpenAPIBridgeExtension.3.<init>(java.lang.String, boolean, long):void type: CONSTRUCTOR in method: o.Constants.replaceSameScenarioCache(java.util.List, o.Constants$getMax):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 29 more
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
                    	... 35 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: RETURN  
                      (wrap: o.OpenAPIBridgeExtension$3 : 0x0007: CONSTRUCTOR  (r0v1 o.OpenAPIBridgeExtension$3) = 
                      (r2v0 'str' java.lang.String)
                      (r3v0 'z' boolean)
                      (r4v0 'j' long)
                     call: o.OpenAPIBridgeExtension.3.<init>(java.lang.String, boolean, long):void type: CONSTRUCTOR)
                     in method: o.OpenAPIBridgeExtension.3.copy(java.lang.String, boolean, long):o.OpenAPIBridgeExtension$3, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	... 52 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: CONSTRUCTOR  (r0v1 o.OpenAPIBridgeExtension$3) = 
                      (r2v0 'str' java.lang.String)
                      (r3v0 'z' boolean)
                      (r4v0 'j' long)
                     call: o.OpenAPIBridgeExtension.3.<init>(java.lang.String, boolean, long):void type: CONSTRUCTOR in method: o.OpenAPIBridgeExtension.3.copy(java.lang.String, boolean, long):o.OpenAPIBridgeExtension$3, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 61 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.OpenAPIBridgeExtension.3
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	... 65 more
                    */
                /*
                    this = this;
                    r0 = 0
                    r1 = 0
                L_0x0002:
                    if (r0 != 0) goto L_0x0025
                    int r2 = kotlin.collections.CollectionsKt.getLastIndex(r6)
                    if (r1 > r2) goto L_0x0025
                    java.lang.Object r2 = r6.get(r1)
                    o.OpenAPIBridgeExtension$3 r2 = (o.OpenAPIBridgeExtension.AnonymousClass3) r2
                    java.lang.String r3 = r7.getScenario()
                    java.lang.String r2 = r2.getScenario()
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
                    if (r2 == 0) goto L_0x0022
                    r6.remove(r1)
                    r0 = 1
                L_0x0022:
                    int r1 = r1 + 1
                    goto L_0x0002
                L_0x0025:
                    o.OpenAPIBridgeExtension$3 r0 = new o.OpenAPIBridgeExtension$3
                    java.lang.String r1 = r7.getScenario()
                    boolean r2 = r7.getShowDialog()
                    long r3 = r7.getCurrentUnixEpochTime()
                    r0.<init>(r1, r2, r3)
                    r6.add(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Constants.replaceSameScenarioCache(java.util.List, o.Constants$getMax):void");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache$Param;", "", "scenario", "", "showDialog", "", "currentUnixEpochTime", "", "(Ljava/lang/String;ZJ)V", "getCurrentUnixEpochTime", "()J", "getScenario", "()Ljava/lang/String;", "getShowDialog", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
            public static final class getMax {
                private final long currentUnixEpochTime;
                @NotNull
                private final String scenario;
                private final boolean showDialog;

                public static /* synthetic */ getMax copy$default(getMax getmax, String str, boolean z, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = getmax.scenario;
                    }
                    if ((i & 2) != 0) {
                        z = getmax.showDialog;
                    }
                    if ((i & 4) != 0) {
                        j = getmax.currentUnixEpochTime;
                    }
                    return getmax.copy(str, z, j);
                }

                @NotNull
                public final String component1() {
                    return this.scenario;
                }

                public final boolean component2() {
                    return this.showDialog;
                }

                public final long component3() {
                    return this.currentUnixEpochTime;
                }

                @NotNull
                public final getMax copy(@NotNull String str, boolean z, long j) {
                    Intrinsics.checkNotNullParameter(str, "scenario");
                    return new getMax(str, z, j);
                }

                public final boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof getMax)) {
                        return false;
                    }
                    getMax getmax = (getMax) obj;
                    return Intrinsics.areEqual((Object) this.scenario, (Object) getmax.scenario) && this.showDialog == getmax.showDialog && this.currentUnixEpochTime == getmax.currentUnixEpochTime;
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb = new StringBuilder("Param(scenario=");
                    sb.append(this.scenario);
                    sb.append(", showDialog=");
                    sb.append(this.showDialog);
                    sb.append(", currentUnixEpochTime=");
                    sb.append(this.currentUnixEpochTime);
                    sb.append(")");
                    return sb.toString();
                }

                public getMax(@NotNull String str, boolean z, long j) {
                    Intrinsics.checkNotNullParameter(str, "scenario");
                    this.scenario = str;
                    this.showDialog = z;
                    this.currentUnixEpochTime = j;
                }

                public final long getCurrentUnixEpochTime() {
                    return this.currentUnixEpochTime;
                }

                @NotNull
                public final String getScenario() {
                    return this.scenario;
                }

                public final boolean getShowDialog() {
                    return this.showDialog;
                }

                public final int hashCode() {
                    String str = this.scenario;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    boolean z = this.showDialog;
                    if (z) {
                        z = true;
                    }
                    return ((hashCode + (z ? 1 : 0)) * 31) + Long.valueOf(this.currentUnixEpochTime).hashCode();
                }
            }
        }
