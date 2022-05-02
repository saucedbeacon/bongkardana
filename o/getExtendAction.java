package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RVOpenAuthHelper;
import o.ScanHelper;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0005\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\b"}, d2 = {"toSocialContact", "Lid/dana/domain/social/model/SocialContact;", "Lid/dana/data/social/model/SocialContactEntity;", "toSocialContactEntity", "toSocialContacts", "", "toSocialUser", "Lid/dana/data/social/model/SocialUserContact;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getExtendAction {
    @NotNull
    public static final List<RVOpenAuthHelper.AnonymousClass4> toSocialUser(@NotNull List<ScanHelper.ScanData> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toSocialUser");
        Iterable<ScanHelper.ScanData> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ScanHelper.ScanData scanData : iterable) {
            arrayList.add(new Object(scanData.getPhoneNumber(), scanData.getDisplayName()) {
                private final String contactName;
                private final String contactPhone;

                public static /* synthetic */ o.RVOpenAuthHelper.AnonymousClass4 copy$default(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0031: INVOKE  
                      (r0v2 'arrayList' java.util.Collection)
                      (wrap: o.RVOpenAuthHelper$4 : 0x002e: CONSTRUCTOR  (r2v0 o.RVOpenAuthHelper$4) = 
                      (wrap: java.lang.String : 0x0026: INVOKE  (r3v0 java.lang.String) = (r1v4 'scanData' o.ScanHelper$ScanData) o.ScanHelper.ScanData.getPhoneNumber():java.lang.String type: VIRTUAL)
                      (wrap: java.lang.String : 0x002a: INVOKE  (r1v5 java.lang.String) = (r1v4 'scanData' o.ScanHelper$ScanData) o.ScanHelper.ScanData.getDisplayName():java.lang.String type: VIRTUAL)
                     call: o.RVOpenAuthHelper.4.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                     java.util.Collection.add(java.lang.Object):boolean type: INTERFACE in method: o.getExtendAction.toSocialUser(java.util.List):java.util.List<o.RVOpenAuthHelper$4>, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: CONSTRUCTOR  (r2v0 o.RVOpenAuthHelper$4) = 
                      (wrap: java.lang.String : 0x0026: INVOKE  (r3v0 java.lang.String) = (r1v4 'scanData' o.ScanHelper$ScanData) o.ScanHelper.ScanData.getPhoneNumber():java.lang.String type: VIRTUAL)
                      (wrap: java.lang.String : 0x002a: INVOKE  (r1v5 java.lang.String) = (r1v4 'scanData' o.ScanHelper$ScanData) o.ScanHelper.ScanData.getDisplayName():java.lang.String type: VIRTUAL)
                     call: o.RVOpenAuthHelper.4.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: o.getExtendAction.toSocialUser(java.util.List):java.util.List<o.RVOpenAuthHelper$4>, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 34 more
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
                    	... 40 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.RVOpenAuthHelper.4.copy$default(o.RVOpenAuthHelper$4, java.lang.String, java.lang.String, int, java.lang.Object):o.RVOpenAuthHelper$4, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	... 57 more
                    */
                /*
                    java.lang.String r0 = "$this$toSocialUser"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = 10
                    int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r1)
                    r0.<init>(r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.util.Iterator r4 = r4.iterator()
                L_0x0018:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0035
                    java.lang.Object r1 = r4.next()
                    o.ScanHelper$ScanData r1 = (o.ScanHelper.ScanData) r1
                    o.RVOpenAuthHelper$4 r2 = new o.RVOpenAuthHelper$4
                    java.lang.String r3 = r1.getPhoneNumber()
                    java.lang.String r1 = r1.getDisplayName()
                    r2.<init>(r3, r1)
                    r0.add(r2)
                    goto L_0x0018
                L_0x0035:
                    java.util.List r0 = (java.util.List) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getExtendAction.toSocialUser(java.util.List):java.util.List");
            }

            @NotNull
            public static final List<ScanHelper.ScanData> toSocialContacts(@NotNull List<RVOpenAuthHelper.AnonymousClass1> list) {
                Intrinsics.checkNotNullParameter(list, "$this$toSocialContacts");
                Iterable<RVOpenAuthHelper.AnonymousClass1> iterable = list;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (RVOpenAuthHelper.AnonymousClass1 socialContact : iterable) {
                    arrayList.add(toSocialContact(socialContact));
                }
                return (List) arrayList;
            }

            @NotNull
            public static final ScanHelper.ScanData toSocialContact(@NotNull RVOpenAuthHelper.AnonymousClass1 r8) {
                Intrinsics.checkNotNullParameter(r8, "$this$toSocialContact");
                return new ScanHelper.ScanData(r8.getContactId(), r8.getDisplayName(), r8.getPhoneNumber(), r8.getContactRawId(), r8.getLastUpdatedTime(), r8.isEmpty());
            }

            @NotNull
            public static final RVOpenAuthHelper.AnonymousClass1 toSocialContactEntity(@NotNull ScanHelper.ScanData scanData) {
                Intrinsics.checkNotNullParameter(scanData, "$this$toSocialContactEntity");
                return new RVOpenAuthHelper.AnonymousClass1(scanData.getContactId(), scanData.getDisplayName(), scanData.getPhoneNumber(), scanData.getContactRawId(), scanData.getLastUpdatedTime(), scanData.isEmpty());
            }
        }
