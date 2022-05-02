package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.OpenAPIBridgeExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lid/dana/data/referral/source/network/result/ReferralEngagementDialogConfigEntity;", "", "enable", "", "dialogTitleId", "", "dialogTitleEn", "dialogDescriptionId", "dialogDescriptionEn", "timerDuration", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDialogDescriptionEn", "()Ljava/lang/String;", "getDialogDescriptionId", "getDialogTitleEn", "getDialogTitleId", "getEnable", "()Z", "getTimerDuration", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toReferralEngagementDialog", "Lid/dana/domain/referral/model/ReferralEngagementDialogConfig;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BigDataChannelModel {
    @SerializedName("dialog_description_en")
    @NotNull
    private final String dialogDescriptionEn;
    @SerializedName("dialog_description_id")
    @NotNull
    private final String dialogDescriptionId;
    @SerializedName("dialog_title_en")
    @NotNull
    private final String dialogTitleEn;
    @SerializedName("dialog_title_id")
    @NotNull
    private final String dialogTitleId;
    private final boolean enable;
    @SerializedName("timer_duration")
    private final long timerDuration;

    public BigDataChannelModel() {
        this(false, (String) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BigDataChannelModel copy$default(BigDataChannelModel bigDataChannelModel, boolean z, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bigDataChannelModel.enable;
        }
        if ((i & 2) != 0) {
            str = bigDataChannelModel.dialogTitleId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = bigDataChannelModel.dialogTitleEn;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = bigDataChannelModel.dialogDescriptionId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = bigDataChannelModel.dialogDescriptionEn;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            j = bigDataChannelModel.timerDuration;
        }
        return bigDataChannelModel.copy(z, str5, str6, str7, str8, j);
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final String component2() {
        return this.dialogTitleId;
    }

    @NotNull
    public final String component3() {
        return this.dialogTitleEn;
    }

    @NotNull
    public final String component4() {
        return this.dialogDescriptionId;
    }

    @NotNull
    public final String component5() {
        return this.dialogDescriptionEn;
    }

    public final long component6() {
        return this.timerDuration;
    }

    @NotNull
    public final BigDataChannelModel copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "dialogTitleId");
        Intrinsics.checkNotNullParameter(str2, "dialogTitleEn");
        Intrinsics.checkNotNullParameter(str3, "dialogDescriptionId");
        Intrinsics.checkNotNullParameter(str4, "dialogDescriptionEn");
        return new BigDataChannelModel(z, str, str2, str3, str4, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BigDataChannelModel)) {
            return false;
        }
        BigDataChannelModel bigDataChannelModel = (BigDataChannelModel) obj;
        return this.enable == bigDataChannelModel.enable && Intrinsics.areEqual((Object) this.dialogTitleId, (Object) bigDataChannelModel.dialogTitleId) && Intrinsics.areEqual((Object) this.dialogTitleEn, (Object) bigDataChannelModel.dialogTitleEn) && Intrinsics.areEqual((Object) this.dialogDescriptionId, (Object) bigDataChannelModel.dialogDescriptionId) && Intrinsics.areEqual((Object) this.dialogDescriptionEn, (Object) bigDataChannelModel.dialogDescriptionEn) && this.timerDuration == bigDataChannelModel.timerDuration;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralEngagementDialogConfigEntity(enable=");
        sb.append(this.enable);
        sb.append(", dialogTitleId=");
        sb.append(this.dialogTitleId);
        sb.append(", dialogTitleEn=");
        sb.append(this.dialogTitleEn);
        sb.append(", dialogDescriptionId=");
        sb.append(this.dialogDescriptionId);
        sb.append(", dialogDescriptionEn=");
        sb.append(this.dialogDescriptionEn);
        sb.append(", timerDuration=");
        sb.append(this.timerDuration);
        sb.append(")");
        return sb.toString();
    }

    public BigDataChannelModel(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "dialogTitleId");
        Intrinsics.checkNotNullParameter(str2, "dialogTitleEn");
        Intrinsics.checkNotNullParameter(str3, "dialogDescriptionId");
        Intrinsics.checkNotNullParameter(str4, "dialogDescriptionEn");
        this.enable = z;
        this.dialogTitleId = str;
        this.dialogTitleEn = str2;
        this.dialogDescriptionId = str3;
        this.dialogDescriptionEn = str4;
        this.timerDuration = j;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getDialogTitleId() {
        return this.dialogTitleId;
    }

    @NotNull
    public final String getDialogTitleEn() {
        return this.dialogTitleEn;
    }

    @NotNull
    public final String getDialogDescriptionId() {
        return this.dialogDescriptionId;
    }

    @NotNull
    public final String getDialogDescriptionEn() {
        return this.dialogDescriptionEn;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BigDataChannelModel(boolean r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0005
            r6 = 0
        L_0x0005:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x000d
            r14 = r0
            goto L_0x000e
        L_0x000d:
            r14 = r7
        L_0x000e:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r8
        L_0x0015:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r9
        L_0x001c:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r10
        L_0x0022:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            r11 = 0
        L_0x0028:
            r3 = r11
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r0
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BigDataChannelModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getTimerDuration() {
        return this.timerDuration;
    }

    @NotNull
    public final OpenAPIBridgeExtension.AnonymousClass1 toReferralEngagementDialog() {
        return new Object(this.enable, this.dialogTitleId, this.dialogTitleEn, this.dialogDescriptionId, this.dialogDescriptionEn, this.timerDuration) {
            @NotNull
            private final String dialogDescriptionEn;
            @NotNull
            private final String dialogDescriptionId;
            @NotNull
            private final String dialogTitleEn;
            @NotNull
            private final String dialogTitleId;
            private final boolean enable;
            private final long timerDuration;

            /* renamed from: o.OpenAPIBridgeExtension$1$1  reason: invalid class name and collision with other inner class name */
            public interface C00041 {
                TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> getReferralHomeConfig();

                TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> getReferralSendMoneyConfig();
            }

            public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r5, boolean z, String str, String str2, String str3, String str4, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = r5.enable;
                }
                if ((i & 2) != 0) {
                    str = r5.dialogTitleId;
                }
                String str5 = str;
                if ((i & 4) != 0) {
                    str2 = r5.dialogTitleEn;
                }
                String str6 = str2;
                if ((i & 8) != 0) {
                    str3 = r5.dialogDescriptionId;
                }
                String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = r5.dialogDescriptionEn;
                }
                String str8 = str4;
                if ((i & 32) != 0) {
                    j = r5.timerDuration;
                }
                return r5.copy(z, str5, str6, str7, str8, j);
            }

            public final boolean component1() {
                return this.enable;
            }

            @NotNull
            public final String component2() {
                return this.dialogTitleId;
            }

            @NotNull
            public final String component3() {
                return this.dialogTitleEn;
            }

            @NotNull
            public final String component4() {
                return this.dialogDescriptionId;
            }

            @NotNull
            public final String component5() {
                return this.dialogDescriptionEn;
            }

            public final long component6() {
                return this.timerDuration;
            }

            @NotNull
            public final AnonymousClass1 copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
                Intrinsics.checkNotNullParameter(str, "dialogTitleId");
                Intrinsics.checkNotNullParameter(str2, "dialogTitleEn");
                Intrinsics.checkNotNullParameter(str3, "dialogDescriptionId");
                Intrinsics.checkNotNullParameter(str4, "dialogDescriptionEn");
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: RETURN  
                      (wrap: o.OpenAPIBridgeExtension$1 : 0x000f: CONSTRUCTOR  (r0v0 o.OpenAPIBridgeExtension$1) = 
                      (wrap: boolean : 0x0002: IGET  (r1v0 boolean) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.enable boolean)
                      (wrap: java.lang.String : 0x0004: IGET  (r2v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogTitleId java.lang.String)
                      (wrap: java.lang.String : 0x0006: IGET  (r3v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogTitleEn java.lang.String)
                      (wrap: java.lang.String : 0x0008: IGET  (r4v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogDescriptionId java.lang.String)
                      (wrap: java.lang.String : 0x000a: IGET  (r5v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogDescriptionEn java.lang.String)
                      (wrap: long : 0x000c: IGET  (r6v0 long) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.timerDuration long)
                     call: o.OpenAPIBridgeExtension.1.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: CONSTRUCTOR)
                     in method: o.BigDataChannelModel.toReferralEngagementDialog():o.OpenAPIBridgeExtension$1, dex: classes3.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v0 o.OpenAPIBridgeExtension$1) = 
                      (wrap: boolean : 0x0002: IGET  (r1v0 boolean) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.enable boolean)
                      (wrap: java.lang.String : 0x0004: IGET  (r2v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogTitleId java.lang.String)
                      (wrap: java.lang.String : 0x0006: IGET  (r3v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogTitleEn java.lang.String)
                      (wrap: java.lang.String : 0x0008: IGET  (r4v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogDescriptionId java.lang.String)
                      (wrap: java.lang.String : 0x000a: IGET  (r5v0 java.lang.String) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.dialogDescriptionEn java.lang.String)
                      (wrap: long : 0x000c: IGET  (r6v0 long) = (r9v0 'this' o.BigDataChannelModel A[THIS]) o.BigDataChannelModel.timerDuration long)
                     call: o.OpenAPIBridgeExtension.1.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: CONSTRUCTOR in method: o.BigDataChannelModel.toReferralEngagementDialog():o.OpenAPIBridgeExtension$1, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                    	... 33 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: RETURN  
                      (wrap: o.OpenAPIBridgeExtension$1 : 0x001d: CONSTRUCTOR  (r1v0 o.OpenAPIBridgeExtension$1) = 
                      (r10v0 'z' boolean)
                      (r11v0 'str' java.lang.String)
                      (r12v0 'str2' java.lang.String)
                      (r13v0 'str3' java.lang.String)
                      (r14v0 'str4' java.lang.String)
                      (r15v0 'j' long)
                     call: o.OpenAPIBridgeExtension.1.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: CONSTRUCTOR)
                     in method: o.OpenAPIBridgeExtension.1.copy(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):o.OpenAPIBridgeExtension$1, dex: classes3.dex
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
                    	... 50 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r1v0 o.OpenAPIBridgeExtension$1) = 
                      (r10v0 'z' boolean)
                      (r11v0 'str' java.lang.String)
                      (r12v0 'str2' java.lang.String)
                      (r13v0 'str3' java.lang.String)
                      (r14v0 'str4' java.lang.String)
                      (r15v0 'j' long)
                     call: o.OpenAPIBridgeExtension.1.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: CONSTRUCTOR in method: o.OpenAPIBridgeExtension.1.copy(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):o.OpenAPIBridgeExtension$1, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 59 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.OpenAPIBridgeExtension.1
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	... 63 more
                    */
                /*
                    this = this;
                    o.OpenAPIBridgeExtension$1 r8 = new o.OpenAPIBridgeExtension$1
                    boolean r1 = r9.enable
                    java.lang.String r2 = r9.dialogTitleId
                    java.lang.String r3 = r9.dialogTitleEn
                    java.lang.String r4 = r9.dialogDescriptionId
                    java.lang.String r5 = r9.dialogDescriptionEn
                    long r6 = r9.timerDuration
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.BigDataChannelModel.toReferralEngagementDialog():o.OpenAPIBridgeExtension$1");
            }

            public final int hashCode() {
                boolean z = this.enable;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                String str = this.dialogTitleId;
                int i2 = 0;
                int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.dialogTitleEn;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.dialogDescriptionId;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.dialogDescriptionEn;
                if (str4 != null) {
                    i2 = str4.hashCode();
                }
                return ((hashCode3 + i2) * 31) + Long.valueOf(this.timerDuration).hashCode();
            }
        }
