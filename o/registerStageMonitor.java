package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/recentrecipient/interactor/GetRecentTransaction;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "Lid/dana/domain/recentrecipient/interactor/GetRecentTransaction$Params;", "recentRecipientRepository", "Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;", "(Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class registerStageMonitor extends APWebChromeClient<List<? extends getMonitorToken>, getMax> {
    private final GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<getMonitorToken>, List<? extends getMonitorToken>> {
        final /* synthetic */ getMax setMin;

        setMax(getMax getmax) {
            this.setMin = getmax;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, r13, false, 2, (java.lang.Object) null) != false) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, r13, false, 2, (java.lang.Object) null) != false) goto L_0x00c2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0046 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r15) {
            /*
                r14 = this;
                java.util.List r15 = (java.util.List) r15
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                o.registerStageMonitor$getMax r0 = r14.setMin
                java.lang.String r0 = r0.getFilter$domain_release()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto L_0x0019
                r0 = 1
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                if (r0 == 0) goto L_0x0122
                o.registerStageMonitor$getMax r0 = r14.setMin
                java.lang.String r0 = r0.getFilter$domain_release()
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
                if (r0 == 0) goto L_0x011c
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
                o.registerStageMonitor$getMax r5 = r14.setMin
                java.lang.Integer r5 = r5.getRecipientType$domain_release()
                java.lang.String r6 = "item"
                if (r5 != 0) goto L_0x00d3
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r15 = r15.iterator()
            L_0x0046:
                boolean r7 = r15.hasNext()
                if (r7 == 0) goto L_0x00d0
                java.lang.Object r7 = r15.next()
                r8 = r7
                o.getMonitorToken r8 = (o.getMonitorToken) r8
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                java.lang.String r9 = r8.getAlias()
                java.lang.String r10 = "item.number"
                r11 = 0
                r12 = 2
                if (r9 == 0) goto L_0x0093
                java.lang.String r9 = r8.getAlias()
                java.lang.String r13 = "item.alias"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r13)
                if (r9 == 0) goto L_0x008d
                java.lang.String r9 = r9.toLowerCase()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r13 = r0
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r9 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r13, (boolean) r2, (int) r12, (java.lang.Object) r11)
                if (r9 != 0) goto L_0x00c2
                java.lang.String r8 = r8.getNumber()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r13, (boolean) r2, (int) r12, (java.lang.Object) r11)
                if (r8 == 0) goto L_0x00c0
                goto L_0x00c2
            L_0x008d:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                r15.<init>(r3)
                throw r15
            L_0x0093:
                java.lang.String r9 = r8.getName()
                java.lang.String r13 = "item.name"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r13)
                if (r9 == 0) goto L_0x00ca
                java.lang.String r9 = r9.toLowerCase()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r13 = r0
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r9 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r13, (boolean) r2, (int) r12, (java.lang.Object) r11)
                if (r9 != 0) goto L_0x00c2
                java.lang.String r8 = r8.getNumber()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r13, (boolean) r2, (int) r12, (java.lang.Object) r11)
                if (r8 == 0) goto L_0x00c0
                goto L_0x00c2
            L_0x00c0:
                r8 = 0
                goto L_0x00c3
            L_0x00c2:
                r8 = 1
            L_0x00c3:
                if (r8 == 0) goto L_0x0046
                r5.add(r7)
                goto L_0x0046
            L_0x00ca:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                r15.<init>(r3)
                throw r15
            L_0x00d0:
                java.util.List r5 = (java.util.List) r5
                return r5
            L_0x00d3:
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r15 = r15.iterator()
            L_0x00e0:
                boolean r3 = r15.hasNext()
                if (r3 == 0) goto L_0x0119
                java.lang.Object r3 = r15.next()
                r4 = r3
                o.getMonitorToken r4 = (o.getMonitorToken) r4
                o.registerStageMonitor$getMax r5 = r14.setMin
                java.lang.Integer r5 = r5.getRecipientType$domain_release()
                if (r5 != 0) goto L_0x00f6
                goto L_0x0108
            L_0x00f6:
                int r5 = r5.intValue()
                if (r5 != r1) goto L_0x0108
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                java.lang.String r4 = r4.getCardIndexNo()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
                goto L_0x0113
            L_0x0108:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                java.lang.String r4 = r4.getNumber()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            L_0x0113:
                if (r4 == 0) goto L_0x00e0
                r2.add(r3)
                goto L_0x00e0
            L_0x0119:
                java.util.List r2 = (java.util.List) r2
                return r2
            L_0x011c:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                r15.<init>(r3)
                throw r15
            L_0x0122:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.registerStageMonitor.setMax.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public registerStageMonitor(@NotNull GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverWhiteScreenStageMonitor, "recentRecipientRepository");
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.recentRecipientRepository.getRecentTransaction().map(new setMax(getmax));
        Intrinsics.checkNotNullExpressionValue(map, "recentRecipientRepositor…         it\n            }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lid/dana/domain/recentrecipient/interactor/GetRecentTransaction$Params;", "", "filter", "", "recipientType", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getFilter$domain_release", "()Ljava/lang/String;", "getRecipientType$domain_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        @NotNull
        private final String filter;
        @Nullable
        private final Integer recipientType;

        @JvmStatic
        @NotNull
        public static final getMax forGetLastTransferDate(@NotNull String str, @Nullable Integer num) {
            return Companion.forGetLastTransferDate(str, num);
        }

        @JvmStatic
        @NotNull
        public static final getMax forSearchRecentTransaction(@NotNull String str) {
            return Companion.forSearchRecentTransaction(str);
        }

        private getMax(String str, Integer num) {
            this.filter = str;
            this.recipientType = num;
        }

        public /* synthetic */ getMax(String str, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num);
        }

        @NotNull
        public final String getFilter$domain_release() {
            return this.filter;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ getMax(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num);
        }

        @Nullable
        public final Integer getRecipientType$domain_release() {
            return this.recipientType;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/domain/recentrecipient/interactor/GetRecentTransaction$Params$Companion;", "", "()V", "forGetLastTransferDate", "Lid/dana/domain/recentrecipient/interactor/GetRecentTransaction$Params;", "filter", "", "recipientType", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lid/dana/domain/recentrecipient/interactor/GetRecentTransaction$Params;", "forSearchRecentTransaction", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ getMax forSearchRecentTransaction$default(setMin setmin, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return setmin.forSearchRecentTransaction(str);
            }

            @JvmStatic
            @NotNull
            public final getMax forSearchRecentTransaction(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "filter");
                return new getMax(str, (Integer) null, 2, (DefaultConstructorMarker) null);
            }

            @JvmStatic
            @NotNull
            public final getMax forGetLastTransferDate(@NotNull String str, @Nullable Integer num) {
                Intrinsics.checkNotNullParameter(str, "filter");
                return new getMax(str, num, (DefaultConstructorMarker) null);
            }
        }
    }
}
