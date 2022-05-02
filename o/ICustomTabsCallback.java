package o;

import a.a.a.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ICustomTabsCallback {
    public boolean equals;
    @NotNull
    public String getMax;
    @NotNull
    public String getMin;
    @Nullable
    public String isInside;
    @NotNull
    public String length;
    public boolean setMax;
    @NotNull
    public String setMin;
    @Nullable
    public String toFloatRange;

    public ICustomTabsCallback() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
    }

    private ICustomTabsCallback(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "balance");
        Intrinsics.checkNotNullParameter(str3, "cardNumber");
        Intrinsics.checkNotNullParameter(str4, "lastTopup");
        this.setMax = z;
        this.getMax = str;
        this.setMin = str2;
        this.length = str3;
        this.getMin = str4;
        this.isInside = str5;
        this.equals = false;
        this.toFloatRange = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ICustomTabsCallback(boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r0 = r16
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r9
        L_0x0009:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r10
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r11
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r12
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r3
            goto L_0x0027
        L_0x0026:
            r6 = r13
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r3
            goto L_0x002e
        L_0x002d:
            r7 = r14
        L_0x002e:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r15
        L_0x0034:
            r9 = r8
            r10 = r1
            r11 = r2
            r12 = r4
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ICustomTabsCallback.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ICustomTabsCallback)) {
            return false;
        }
        ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) obj;
        return this.setMax == iCustomTabsCallback.setMax && Intrinsics.areEqual((Object) this.getMax, (Object) iCustomTabsCallback.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) iCustomTabsCallback.setMin) && Intrinsics.areEqual((Object) this.length, (Object) iCustomTabsCallback.length) && Intrinsics.areEqual((Object) this.getMin, (Object) iCustomTabsCallback.getMin) && Intrinsics.areEqual((Object) this.isInside, (Object) iCustomTabsCallback.isInside) && this.equals == iCustomTabsCallback.equals && Intrinsics.areEqual((Object) this.toFloatRange, (Object) iCustomTabsCallback.toFloatRange);
    }

    public final int hashCode() {
        boolean z = this.setMax;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.getMax;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.isInside;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z3 = this.equals;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode5 + (z2 ? 1 : 0)) * 31;
        String str6 = this.toFloatRange;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceResult(success=");
        sb.append(this.setMax);
        sb.append(", cardType=");
        sb.append(this.getMax);
        sb.append(", balance=");
        sb.append(this.setMin);
        sb.append(", cardNumber=");
        sb.append(this.length);
        sb.append(", lastTopup=");
        sb.append(this.getMin);
        sb.append(", errorCode=");
        sb.append(this.isInside);
        sb.append(", isNeedReversal=");
        sb.append(this.equals);
        sb.append(", brizziErrCode=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/base/NewAppletRepository;", "Lid/dana/lib/electronicmoney/mandiri/base/AbstractEmoneyRepository;", "emoneyCallback", "Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "apduCommandProvider", "Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "(Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;)V", "getApduCommandProvider", "()Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "getEmoneyCallback", "()Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "getEmoneyCardAttribute", "()Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "doAfterReversal", "", "reversal", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "cardType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeMessageToCard", "result", "(Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
    public final class Stub extends asInterface {
        public static final hideTitleLoading getMax = new hideTitleLoading(false, "010", (String) null, (String) null, (String) null, (String) null, (String) null, new LinkedHashMap(), 124);
        @NotNull
        public final asBinder isInside;
        @NotNull
        public final setBarBottomLineColor setMin;
        @NotNull
        public final hideBackButton toFloatRange;

        public static final class length implements Function1<hideTitleLoading, Unit> {
            public final /* synthetic */ Continuation setMax;

            public length(Continuation continuation) {
                this.setMax = continuation;
            }

            public final Object invoke(Object obj) {
                hideTitleLoading hidetitleloading = (hideTitleLoading) obj;
                Intrinsics.checkNotNullParameter(hidetitleloading, "result");
                Continuation continuation = this.setMax;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m1constructorimpl(hidetitleloading));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Stub(@NotNull setBarBottomLineColor setbarbottomlinecolor, @NotNull asBinder asbinder, @NotNull hideBackButton hidebackbutton) {
            super(setbarbottomlinecolor, asbinder, hidebackbutton);
            Intrinsics.checkNotNullParameter(setbarbottomlinecolor, "emoneyCallback");
            Intrinsics.checkNotNullParameter(asbinder, "apduCommandProvider");
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            this.setMin = setbarbottomlinecolor;
            this.isInside = asbinder;
            this.toFloatRange = hidebackbutton;
        }

        @NotNull
        public final setBarBottomLineColor getMin() {
            return this.setMin;
        }

        @NotNull
        public final asBinder length() {
            return this.isInside;
        }

        @Nullable
        public final Object setMin(@NotNull String str, @NotNull Continuation<? super hideTitleLoading> continuation) {
            String str2;
            String str3;
            String str4 = str;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
            hideBackButton hidebackbutton = this.toFloatRange;
            asBinder asbinder = this.isInside;
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            Intrinsics.checkNotNullParameter(asbinder, "apduCommandProvider");
            Intrinsics.checkNotNullParameter(str4, "cardType");
            String str5 = hidebackbutton.setMin;
            String str6 = hidebackbutton.isInside;
            if (str6 != null) {
                str2 = str6.substring(0, 16);
                Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                str2 = null;
            }
            String str7 = str2 == null ? "" : str2;
            String str8 = hidebackbutton.IsOverlapping;
            ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
            byte[] transceive = asbinder.setMax.transceive(ICustomTabsService.length("00B300003F"));
            Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStringToByteArray(CARD_INFO))");
            String min = ICustomTabsService.getMin(transceive);
            String str9 = hidebackbutton.toIntRange;
            if (Intrinsics.areEqual((Object) str4, (Object) "NEW")) {
                str3 = asbinder.getMax();
            } else {
                str3 = "";
            }
            this.setMin.callReversal(new hideBackButton("REVERSAL", (String) null, str, (String) null, str5, str7, str8, min, str9, str3, (Map) null, 1034), new length(safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return orThrow;
        }

        @NotNull
        public final hideBackButton setMin() {
            return this.toFloatRange;
        }

        public final class Proxy {
            private boolean getMax;
            private char getMin;
            private int setMax;
            private Reader setMin;

            private Proxy(Reader reader) {
                this.setMin = !reader.markSupported() ? new BufferedReader(reader) : reader;
                this.getMax = false;
                this.setMax = 0;
            }

            public Proxy(String str) {
                this((Reader) new StringReader(str));
            }

            public final void getMin() {
                int i;
                if (this.getMax || (i = this.setMax) <= 0) {
                    throw new b("Stepping back two steps is not supported");
                }
                this.setMax = i - 1;
                this.getMax = true;
            }

            public final char setMin() {
                if (this.getMax) {
                    this.getMax = false;
                    if (this.getMin != 0) {
                        this.setMax++;
                    }
                    return this.getMin;
                }
                try {
                    int read = this.setMin.read();
                    if (read <= 0) {
                        this.getMin = 0;
                        return 0;
                    }
                    this.setMax++;
                    char c = (char) read;
                    this.getMin = c;
                    return c;
                } catch (IOException e) {
                    throw new b((Throwable) e);
                }
            }

            private String getMax(int i) {
                if (i == 0) {
                    return "";
                }
                char[] cArr = new char[i];
                int i2 = 0;
                if (this.getMax) {
                    this.getMax = false;
                    cArr[0] = this.getMin;
                    i2 = 1;
                }
                while (i2 < i) {
                    try {
                        int read = this.setMin.read(cArr, i2, i - i2);
                        if (read == -1) {
                            break;
                        }
                        i2 += read;
                    } catch (IOException e) {
                        throw new b((Throwable) e);
                    }
                }
                this.setMax += i2;
                if (i2 >= i) {
                    this.getMin = cArr[i - 1];
                    return new String(cArr);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Substring bounds error");
                sb.append(toString());
                throw new b(sb.toString());
            }

            public final char setMax() {
                char min;
                char min2;
                char min3;
                while (true) {
                    min = setMin();
                    if (min == '/') {
                        char min4 = setMin();
                        if (min4 != '*') {
                            if (min4 == '/') {
                                do {
                                    min3 = setMin();
                                    if (min3 == 10 || min3 == 13) {
                                        break;
                                    }
                                } while (min3 != 0);
                            } else {
                                getMin();
                                return '/';
                            }
                        } else {
                            while (true) {
                                char min5 = setMin();
                                if (min5 != 0) {
                                    if (min5 == '*') {
                                        if (setMin() == '/') {
                                            break;
                                        }
                                        getMin();
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unclosed comment");
                                    sb.append(toString());
                                    throw new b(sb.toString());
                                }
                            }
                        }
                    } else if (min == '#') {
                        do {
                            min2 = setMin();
                            if (min2 == 10 || min2 == 13) {
                                break;
                            }
                        } while (min2 != 0);
                    } else if (min == 0 || min > ' ') {
                        return min;
                    }
                }
                return min;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(3:56|57|58) */
            /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:42|(2:51|52)(3:48|49|50))|53|54|55) */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
                return new java.lang.Long(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c3, code lost:
                return new java.lang.Double(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c4, code lost:
                return r1;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00b8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00be */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object length() {
                /*
                    r10 = this;
                    char r0 = r10.setMax()
                    r1 = 34
                    r2 = 8
                    r3 = 120(0x78, float:1.68E-43)
                    r4 = 2
                    r5 = 16
                    if (r0 == r1) goto L_0x00f2
                    r1 = 91
                    if (r0 == r1) goto L_0x00e9
                    r1 = 123(0x7b, float:1.72E-43)
                    if (r0 == r1) goto L_0x00e0
                    r1 = 39
                    if (r0 == r1) goto L_0x00f2
                    r1 = 40
                    if (r0 == r1) goto L_0x00e9
                    java.lang.StringBuffer r1 = new java.lang.StringBuffer
                    r1.<init>()
                    r6 = r0
                L_0x0025:
                    r7 = 32
                    if (r6 < r7) goto L_0x0039
                    java.lang.String r7 = ",:]}/\\\"[{;=#"
                    int r7 = r7.indexOf(r6)
                    if (r7 >= 0) goto L_0x0039
                    r1.append(r6)
                    char r6 = r10.setMin()
                    goto L_0x0025
                L_0x0039:
                    r10.getMin()
                    java.lang.String r1 = r1.toString()
                    java.lang.String r1 = r1.trim()
                    java.lang.String r6 = ""
                    boolean r6 = r1.equals(r6)
                    if (r6 != 0) goto L_0x00c5
                    java.lang.String r6 = "true"
                    boolean r6 = r1.equalsIgnoreCase(r6)
                    if (r6 == 0) goto L_0x0057
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    return r0
                L_0x0057:
                    java.lang.String r6 = "false"
                    boolean r6 = r1.equalsIgnoreCase(r6)
                    if (r6 == 0) goto L_0x0062
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    return r0
                L_0x0062:
                    java.lang.String r6 = "null"
                    boolean r6 = r1.equalsIgnoreCase(r6)
                    if (r6 == 0) goto L_0x006d
                    java.lang.Object r0 = o.getInterfaceDescriptor.getMin
                    return r0
                L_0x006d:
                    r6 = 48
                    if (r0 < r6) goto L_0x0075
                    r7 = 57
                    if (r0 <= r7) goto L_0x0083
                L_0x0075:
                    r7 = 46
                    if (r0 == r7) goto L_0x0083
                    r7 = 45
                    if (r0 == r7) goto L_0x0083
                    r7 = 43
                    if (r0 != r7) goto L_0x0082
                    goto L_0x0083
                L_0x0082:
                    return r1
                L_0x0083:
                    if (r0 != r6) goto L_0x00b2
                    int r0 = r1.length()
                    if (r0 <= r4) goto L_0x00a8
                    r0 = 1
                    char r6 = r1.charAt(r0)
                    if (r6 == r3) goto L_0x009a
                    char r0 = r1.charAt(r0)
                    r3 = 88
                    if (r0 != r3) goto L_0x00a8
                L_0x009a:
                    java.lang.Integer r0 = new java.lang.Integer     // Catch:{ Exception -> 0x00b2 }
                    java.lang.String r2 = r1.substring(r4)     // Catch:{ Exception -> 0x00b2 }
                    int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ Exception -> 0x00b2 }
                    r0.<init>(r2)     // Catch:{ Exception -> 0x00b2 }
                    return r0
                L_0x00a8:
                    java.lang.Integer r0 = new java.lang.Integer     // Catch:{ Exception -> 0x00b2 }
                    int r2 = java.lang.Integer.parseInt(r1, r2)     // Catch:{ Exception -> 0x00b2 }
                    r0.<init>(r2)     // Catch:{ Exception -> 0x00b2 }
                    return r0
                L_0x00b2:
                    java.lang.Integer r0 = new java.lang.Integer     // Catch:{ Exception -> 0x00b8 }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x00b8 }
                    return r0
                L_0x00b8:
                    java.lang.Long r0 = new java.lang.Long     // Catch:{ Exception -> 0x00be }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x00be }
                    return r0
                L_0x00be:
                    java.lang.Double r0 = new java.lang.Double     // Catch:{ Exception -> 0x00c4 }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x00c4 }
                    return r0
                L_0x00c4:
                    return r1
                L_0x00c5:
                    a.a.a.b r0 = new a.a.a.b
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Missing value"
                    r1.append(r2)
                    java.lang.String r2 = r10.toString()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>((java.lang.String) r1)
                    throw r0
                L_0x00e0:
                    r10.getMin()
                    o.getInterfaceDescriptor r0 = new o.getInterfaceDescriptor
                    r0.<init>((o.ICustomTabsCallback.Stub.Proxy) r10)
                    return r0
                L_0x00e9:
                    r10.getMin()
                    o.isInside r0 = new o.isInside
                    r0.<init>((o.ICustomTabsCallback.Stub.Proxy) r10)
                    return r0
                L_0x00f2:
                    java.lang.StringBuffer r1 = new java.lang.StringBuffer
                    r1.<init>()
                L_0x00f7:
                    char r6 = r10.setMin()
                    if (r6 == 0) goto L_0x0169
                    r7 = 10
                    if (r6 == r7) goto L_0x0169
                    r8 = 13
                    if (r6 == r8) goto L_0x0169
                    r9 = 92
                    if (r6 == r9) goto L_0x0114
                    if (r6 != r0) goto L_0x0110
                    java.lang.String r0 = r1.toString()
                    return r0
                L_0x0110:
                    r1.append(r6)
                    goto L_0x00f7
                L_0x0114:
                    char r6 = r10.setMin()
                    r9 = 98
                    if (r6 == r9) goto L_0x0165
                    r9 = 102(0x66, float:1.43E-43)
                    if (r6 == r9) goto L_0x015f
                    r9 = 110(0x6e, float:1.54E-43)
                    if (r6 == r9) goto L_0x015b
                    r7 = 114(0x72, float:1.6E-43)
                    if (r6 == r7) goto L_0x0157
                    if (r6 == r3) goto L_0x014a
                    r7 = 116(0x74, float:1.63E-43)
                    if (r6 == r7) goto L_0x0144
                    r7 = 117(0x75, float:1.64E-43)
                    if (r6 == r7) goto L_0x0136
                    r1.append(r6)
                    goto L_0x00f7
                L_0x0136:
                    r6 = 4
                    java.lang.String r6 = r10.getMax(r6)
                    int r6 = java.lang.Integer.parseInt(r6, r5)
                    char r6 = (char) r6
                    r1.append(r6)
                    goto L_0x00f7
                L_0x0144:
                    r6 = 9
                    r1.append(r6)
                    goto L_0x00f7
                L_0x014a:
                    java.lang.String r6 = r10.getMax(r4)
                    int r6 = java.lang.Integer.parseInt(r6, r5)
                    char r6 = (char) r6
                    r1.append(r6)
                    goto L_0x00f7
                L_0x0157:
                    r1.append(r8)
                    goto L_0x00f7
                L_0x015b:
                    r1.append(r7)
                    goto L_0x00f7
                L_0x015f:
                    r6 = 12
                    r1.append(r6)
                    goto L_0x00f7
                L_0x0165:
                    r1.append(r2)
                    goto L_0x00f7
                L_0x0169:
                    a.a.a.b r0 = new a.a.a.b
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unterminated string"
                    r1.append(r2)
                    java.lang.String r2 = r10.toString()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>((java.lang.String) r1)
                    goto L_0x0185
                L_0x0184:
                    throw r0
                L_0x0185:
                    goto L_0x0184
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ICustomTabsCallback.Stub.Proxy.length():java.lang.Object");
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder(" at character ");
                sb.append(this.setMax);
                return sb.toString();
            }
        }

        @Nullable
        public final Object getMax(@NotNull hideTitleLoading hidetitleloading, @NotNull Continuation<? super hideTitleLoading> continuation) {
            String str;
            try {
                hidetitleloading.toIntRange.get("responseFromSam");
                asBinder asbinder = this.isInside;
                String str2 = hidetitleloading.toIntRange.get("responseFromSam");
                if (str2 == null) {
                    str2 = "";
                }
                Intrinsics.checkNotNullParameter(str2, "message");
                ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
                byte[] transceive = asbinder.setMax.transceive(ICustomTabsService.length(str2));
                Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStringToByteArray(message))");
                String min = ICustomTabsService.getMin(transceive);
                hideTitleLoading hidetitleloading2 = getMax;
                hidetitleloading2.getMax = StringsKt.contains$default((CharSequence) min, (CharSequence) "9000", false, 2, (Object) null);
                if (StringsKt.contains$default((CharSequence) min, (CharSequence) "9000", false, 2, (Object) null)) {
                    str = "";
                } else {
                    str = "REVERSAL_NEEDED";
                }
                hidetitleloading2.length = str;
                return hidetitleloading2;
            } catch (Exception e) {
                e.getMessage();
                hideTitleLoading hidetitleloading3 = getMax;
                hidetitleloading3.length = "";
                return hidetitleloading3;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0019\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/base/OldAppletRepository;", "Lid/dana/lib/electronicmoney/mandiri/base/AbstractEmoneyRepository;", "emoneyCallback", "Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "apduCommandProvider", "Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "(Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;)V", "getApduCommandProvider", "()Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "counter", "", "getEmoneyCallback", "()Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "getEmoneyCardAttribute", "()Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "defaultResultSelector", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "state", "", "doAfterReversal", "", "loopReversalGetTopupCommand", "result", "(Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reversal", "cardType", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeMessageToCard", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
    public final class Default extends asInterface {
        @NotNull
        public final setBarBottomLineColor getMax;
        @NotNull
        public final hideBackButton isInside;
        public int setMin;
        @NotNull
        public final asBinder toFloatRange;

        @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.OldAppletRepository", f = "OldAppletRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {45, 54, 67}, m = "writeMessageToCard", n = {"this", "result", "messageFromCard", "this", "result", "messageFromCard", "command", "this", "result", "messageFromCard", "command"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
        public static final class getMax extends ContinuationImpl {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f10804a;
            public int b;
            public final /* synthetic */ Default c;
            public Object d;
            public Object e;
            public Object f;
            public Object g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMax(Default defaultR, Continuation continuation) {
                super(continuation);
                this.c = defaultR;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f10804a = obj;
                this.b |= Integer.MIN_VALUE;
                return this.c.getMax((hideTitleLoading) null, this);
            }
        }

        @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.OldAppletRepository", f = "OldAppletRepository.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {80, 91}, m = "reversal", n = {"this", "cardType", "reversal", "this", "cardType", "reversal", "callReversal"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
        public static final class getMin extends ContinuationImpl {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f10805a;
            public int b;
            public final /* synthetic */ Default c;
            public Object d;
            public Object e;
            public Object f;
            public Object g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMin(Default defaultR, Continuation continuation) {
                super(continuation);
                this.c = defaultR;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f10805a = obj;
                this.b |= Integer.MIN_VALUE;
                return this.c.setMin((String) null, (Continuation<? super hideTitleLoading>) this);
            }
        }

        public static final class length implements Function1<hideTitleLoading, Unit> {
            public final /* synthetic */ Continuation setMin;

            public length(Continuation continuation) {
                this.setMin = continuation;
            }

            public final Object invoke(Object obj) {
                hideTitleLoading hidetitleloading = (hideTitleLoading) obj;
                Intrinsics.checkNotNullParameter(hidetitleloading, "result");
                Continuation continuation = this.setMin;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m1constructorimpl(hidetitleloading));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.OldAppletRepository", f = "OldAppletRepository.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {107, 116}, m = "loopReversalGetTopupCommand", n = {"this", "result", "state", "this", "result", "state", "getTopupCommand"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
        public static final class setMin extends ContinuationImpl {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f10806a;
            public int b;
            public final /* synthetic */ Default c;
            public Object d;
            public Object e;
            public Object f;
            public Object g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public setMin(Default defaultR, Continuation continuation) {
                super(continuation);
                this.c = defaultR;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f10806a = obj;
                this.b |= Integer.MIN_VALUE;
                return this.c.length((hideTitleLoading) null, this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Default(@NotNull setBarBottomLineColor setbarbottomlinecolor, @NotNull asBinder asbinder, @NotNull hideBackButton hidebackbutton) {
            super(setbarbottomlinecolor, asbinder, hidebackbutton);
            Intrinsics.checkNotNullParameter(setbarbottomlinecolor, "emoneyCallback");
            Intrinsics.checkNotNullParameter(asbinder, "apduCommandProvider");
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            this.getMax = setbarbottomlinecolor;
            this.toFloatRange = asbinder;
            this.isInside = hidebackbutton;
        }

        private static hideTitleLoading setMax(String str) {
            if (str.hashCode() == 47664 && str.equals("000")) {
                return new hideTitleLoading(true, "", (String) null, (String) null, (String) null, (String) null, (String) null, new LinkedHashMap(), 124);
            }
            return new hideTitleLoading(false, str, (String) null, (String) null, (String) null, (String) null, (String) null, new LinkedHashMap(), 124);
        }

        @NotNull
        public final setBarBottomLineColor getMin() {
            return this.getMax;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0 A[Catch:{ Exception -> 0x00dd }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[Catch:{ Exception -> 0x00dd }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object length(@org.jetbrains.annotations.NotNull o.hideTitleLoading r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.hideTitleLoading> r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof o.ICustomTabsCallback.Default.setMin
                if (r0 == 0) goto L_0x0013
                r0 = r14
                o.ICustomTabsCallback$Default$setMin r0 = (o.ICustomTabsCallback.Default.setMin) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.b = r1
                goto L_0x0018
            L_0x0013:
                o.ICustomTabsCallback$Default$setMin r0 = new o.ICustomTabsCallback$Default$setMin
                r0.<init>(r12, r14)
            L_0x0018:
                java.lang.Object r14 = r0.f10806a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.b
                java.lang.String r3 = "009"
                r4 = 2
                java.lang.String r5 = "message"
                r6 = 1
                if (r2 == 0) goto L_0x0049
                if (r2 == r6) goto L_0x0039
                if (r2 != r4) goto L_0x0031
                kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x00dd }
                goto L_0x00d0
            L_0x0031:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L_0x0039:
                java.lang.Object r13 = r0.f
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r2 = r0.e
                o.hideTitleLoading r2 = (o.hideTitleLoading) r2
                java.lang.Object r7 = r0.d
                o.ICustomTabsCallback$Default r7 = (o.ICustomTabsCallback.Default) r7
                kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x00dd }
                goto L_0x0098
            L_0x0049:
                kotlin.ResultKt.throwOnFailure(r14)
                int r14 = r12.setMin     // Catch:{ Exception -> 0x00dd }
                if (r14 != r6) goto L_0x0053
                java.lang.String r14 = "reversal_cardInfo"
                goto L_0x0055
            L_0x0053:
                java.lang.String r14 = "reversal"
            L_0x0055:
                int r2 = r12.setMin     // Catch:{ Exception -> 0x00dd }
                if (r2 == r6) goto L_0x0084
                o.asBinder r2 = r12.toFloatRange     // Catch:{ Exception -> 0x00dd }
                java.util.Map<java.lang.String, java.lang.String> r7 = r13.toIntRange     // Catch:{ Exception -> 0x00dd }
                java.lang.Object r7 = r7.get(r5)     // Catch:{ Exception -> 0x00dd }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00dd }
                if (r7 != 0) goto L_0x0067
                java.lang.String r7 = ""
            L_0x0067:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)     // Catch:{ Exception -> 0x00dd }
                o.ICustomTabsService r8 = o.ICustomTabsService.setMax     // Catch:{ Exception -> 0x00dd }
                android.nfc.tech.IsoDep r2 = r2.setMax     // Catch:{ Exception -> 0x00dd }
                byte[] r7 = o.ICustomTabsService.length(r7)     // Catch:{ Exception -> 0x00dd }
                byte[] r2 = r2.transceive(r7)     // Catch:{ Exception -> 0x00dd }
                java.lang.String r7 = "isoDep.transceive(hexStringToByteArray(message))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)     // Catch:{ Exception -> 0x00dd }
                java.lang.String r2 = o.ICustomTabsService.getMin(r2)     // Catch:{ Exception -> 0x00dd }
                java.util.Map<java.lang.String, java.lang.String> r7 = r13.toIntRange     // Catch:{ Exception -> 0x00dd }
                r7.put(r5, r2)     // Catch:{ Exception -> 0x00dd }
            L_0x0084:
                r0.d = r12     // Catch:{ Exception -> 0x00dd }
                r0.e = r13     // Catch:{ Exception -> 0x00dd }
                r0.f = r14     // Catch:{ Exception -> 0x00dd }
                r0.b = r6     // Catch:{ Exception -> 0x00dd }
                java.lang.Object r2 = r12.getMin((java.lang.String) r14, (o.hideTitleLoading) r13, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r0)     // Catch:{ Exception -> 0x00dd }
                if (r2 != r1) goto L_0x0093
                return r1
            L_0x0093:
                r7 = r12
                r11 = r2
                r2 = r13
                r13 = r14
                r14 = r11
            L_0x0098:
                o.hideTitleLoading r14 = (o.hideTitleLoading) r14     // Catch:{ Exception -> 0x00dd }
                int r8 = r7.setMin     // Catch:{ Exception -> 0x00dd }
                r9 = 4
                r10 = 0
                if (r8 < r9) goto L_0x00a7
                r7.setMin = r10     // Catch:{ Exception -> 0x00dd }
                o.hideTitleLoading r13 = setMax(r3)     // Catch:{ Exception -> 0x00dd }
                goto L_0x00e1
            L_0x00a7:
                java.util.Map<java.lang.String, java.lang.String> r8 = r14.toIntRange     // Catch:{ Exception -> 0x00dd }
                java.lang.Object r5 = r8.get(r5)     // Catch:{ Exception -> 0x00dd }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00dd }
                if (r5 == 0) goto L_0x00d4
                java.lang.String r8 = "done"
                r9 = 0
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r8, (boolean) r10, (int) r4, (java.lang.Object) r9)     // Catch:{ Exception -> 0x00dd }
                if (r5 != 0) goto L_0x00d4
                int r5 = r7.setMin     // Catch:{ Exception -> 0x00dd }
                int r5 = r5 + r6
                r7.setMin = r5     // Catch:{ Exception -> 0x00dd }
                r0.d = r7     // Catch:{ Exception -> 0x00dd }
                r0.e = r2     // Catch:{ Exception -> 0x00dd }
                r0.f = r13     // Catch:{ Exception -> 0x00dd }
                r0.g = r14     // Catch:{ Exception -> 0x00dd }
                r0.b = r4     // Catch:{ Exception -> 0x00dd }
                java.lang.Object r14 = r7.length(r14, r0)     // Catch:{ Exception -> 0x00dd }
                if (r14 != r1) goto L_0x00d0
                return r1
            L_0x00d0:
                r13 = r14
                o.hideTitleLoading r13 = (o.hideTitleLoading) r13     // Catch:{ Exception -> 0x00dd }
                goto L_0x00e1
            L_0x00d4:
                r7.setMin = r10     // Catch:{ Exception -> 0x00dd }
                java.lang.String r13 = "000"
                o.hideTitleLoading r13 = setMax(r13)     // Catch:{ Exception -> 0x00dd }
                goto L_0x00e1
            L_0x00dd:
                o.hideTitleLoading r13 = setMax(r3)
            L_0x00e1:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ICustomTabsCallback.Default.length(o.hideTitleLoading, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final asBinder length() {
            return this.toFloatRange;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0118 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object setMin(@org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.hideTitleLoading> r26) {
            /*
                r24 = this;
                r0 = r24
                r14 = r25
                r1 = r26
                boolean r2 = r1 instanceof o.ICustomTabsCallback.Default.getMin
                if (r2 == 0) goto L_0x0019
                r2 = r1
                o.ICustomTabsCallback$Default$getMin r2 = (o.ICustomTabsCallback.Default.getMin) r2
                int r3 = r2.b
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0019
                int r3 = r3 - r4
                r2.b = r3
                goto L_0x001e
            L_0x0019:
                o.ICustomTabsCallback$Default$getMin r2 = new o.ICustomTabsCallback$Default$getMin
                r2.<init>(r0, r1)
            L_0x001e:
                r15 = r2
                java.lang.Object r1 = r15.f10805a
                java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r15.b
                r12 = 2
                r11 = 1
                if (r2 == 0) goto L_0x004f
                if (r2 == r11) goto L_0x003c
                if (r2 != r12) goto L_0x0034
                kotlin.ResultKt.throwOnFailure(r1)
                goto L_0x0119
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003c:
                java.lang.Object r2 = r15.f
                o.hideBackButton r2 = (o.hideBackButton) r2
                java.lang.Object r3 = r15.e
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r15.d
                o.ICustomTabsCallback$Default r4 = (o.ICustomTabsCallback.Default) r4
                kotlin.ResultKt.throwOnFailure(r1)
                r14 = r3
                r3 = r13
                goto L_0x0105
            L_0x004f:
                kotlin.ResultKt.throwOnFailure(r1)
                o.hideBackButton r1 = r0.isInside
                o.asBinder r2 = r0.toFloatRange
                java.lang.String r3 = "emoneyCardAttribute"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                java.lang.String r3 = "apduCommandProvider"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
                java.lang.String r3 = "cardType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
                o.hideBackButton r10 = new o.hideBackButton
                java.lang.String r6 = r1.setMin
                java.lang.String r3 = r1.isInside
                if (r3 == 0) goto L_0x007a
                r4 = 0
                r5 = 16
                java.lang.String r3 = r3.substring(r4, r5)
                java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                goto L_0x007b
            L_0x007a:
                r3 = 0
            L_0x007b:
                java.lang.String r4 = ""
                if (r3 != 0) goto L_0x0081
                r7 = r4
                goto L_0x0082
            L_0x0081:
                r7 = r3
            L_0x0082:
                java.lang.String r8 = r1.IsOverlapping
                o.ICustomTabsService r3 = o.ICustomTabsService.setMax
                android.nfc.tech.IsoDep r3 = r2.setMax
                java.lang.String r5 = "00B300003F"
                byte[] r5 = o.ICustomTabsService.length(r5)
                byte[] r3 = r3.transceive(r5)
                java.lang.String r5 = "isoDep.transceive(hexStringToByteArray(CARD_INFO))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                java.lang.String r9 = o.ICustomTabsService.getMin(r3)
                java.lang.String r5 = r1.toIntRange
                java.lang.String r1 = "NEW"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x00ac
                java.lang.String r1 = r2.getMax()
                r16 = r1
                goto L_0x00ae
            L_0x00ac:
                r16 = r4
            L_0x00ae:
                r3 = 0
                r17 = 0
                r18 = 0
                r19 = 1034(0x40a, float:1.449E-42)
                java.lang.String r2 = "REVERSAL"
                r1 = r10
                r4 = r25
                r20 = r5
                r5 = r17
                r21 = r10
                r10 = r20
                r11 = r16
                r12 = r18
                r22 = r13
                r13 = r19
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r15.d = r0
                r15.e = r14
                r1 = r21
                r15.f = r1
                r15.g = r15
                r2 = 1
                r15.b = r2
                kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
                kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r15)
                r2.<init>(r3)
                o.ICustomTabsCallback$Default$length r3 = new o.ICustomTabsCallback$Default$length
                r3.<init>(r2)
                o.setBarBottomLineColor r4 = r0.getMax
                r4.callReversal(r1, r3)
                java.lang.Object r2 = r2.getOrThrow()
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r2 != r3) goto L_0x00fa
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r15)
            L_0x00fa:
                r3 = r22
                if (r2 != r3) goto L_0x00ff
                return r3
            L_0x00ff:
                r4 = r0
                r23 = r2
                r2 = r1
                r1 = r23
            L_0x0105:
                o.hideTitleLoading r1 = (o.hideTitleLoading) r1
                r15.d = r4
                r15.e = r14
                r15.f = r2
                r15.g = r1
                r2 = 2
                r15.b = r2
                java.lang.Object r1 = r4.length(r1, r15)
                if (r1 != r3) goto L_0x0119
                return r3
            L_0x0119:
                o.hideTitleLoading r1 = (o.hideTitleLoading) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ICustomTabsCallback.Default.setMin(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final hideBackButton setMin() {
            return this.isInside;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf A[Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5 A[Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0113 A[Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object getMax(@org.jetbrains.annotations.NotNull o.hideTitleLoading r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.hideTitleLoading> r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                boolean r3 = r2 instanceof o.ICustomTabsCallback.Default.getMax
                if (r3 == 0) goto L_0x0019
                r3 = r2
                o.ICustomTabsCallback$Default$getMax r3 = (o.ICustomTabsCallback.Default.getMax) r3
                int r4 = r3.b
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L_0x0019
                int r4 = r4 - r5
                r3.b = r4
                goto L_0x001e
            L_0x0019:
                o.ICustomTabsCallback$Default$getMax r3 = new o.ICustomTabsCallback$Default$getMax
                r3.<init>(r0, r2)
            L_0x001e:
                java.lang.Object r2 = r3.f10804a
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r5 = r3.b
                java.lang.String r6 = ""
                java.lang.String r7 = "009"
                java.lang.String r8 = "update"
                r9 = 3
                r10 = 2
                r11 = 1
                java.lang.String r12 = "message"
                if (r5 == 0) goto L_0x0070
                if (r5 == r11) goto L_0x005b
                if (r5 == r10) goto L_0x0046
                if (r5 != r9) goto L_0x003e
                kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                goto L_0x0114
            L_0x003e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0046:
                java.lang.Object r1 = r3.g
                o.hideTitleLoading r1 = (o.hideTitleLoading) r1
                java.lang.Object r5 = r3.f
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r10 = r3.e
                o.hideTitleLoading r10 = (o.hideTitleLoading) r10
                java.lang.Object r11 = r3.d
                o.ICustomTabsCallback$Default r11 = (o.ICustomTabsCallback.Default) r11
                kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                goto L_0x0102
            L_0x005b:
                java.lang.Object r1 = r3.f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r5 = r3.e
                o.hideTitleLoading r5 = (o.hideTitleLoading) r5
                java.lang.Object r13 = r3.d
                o.ICustomTabsCallback$Default r13 = (o.ICustomTabsCallback.Default) r13
                kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r16 = r5
                r5 = r1
                r1 = r16
                goto L_0x00c7
            L_0x0070:
                kotlin.ResultKt.throwOnFailure(r2)
                boolean r2 = r18.setMin()     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r2 != 0) goto L_0x0088
                java.lang.String r2 = r1.length     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.String r5 = "AE11012068051003"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r2 == 0) goto L_0x0088
                java.lang.String r2 = "010"
                setMax(r2)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
            L_0x0088:
                o.asBinder r2 = r0.toFloatRange     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.util.Map<java.lang.String, java.lang.String> r5 = r1.toIntRange     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.Object r5 = r5.get(r12)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r5 != 0) goto L_0x0095
                r5 = r6
            L_0x0095:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r12)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                o.ICustomTabsService r13 = o.ICustomTabsService.setMax     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                android.nfc.tech.IsoDep r2 = r2.setMax     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                byte[] r5 = o.ICustomTabsService.length(r5)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                byte[] r2 = r2.transceive(r5)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.String r5 = "isoDep.transceive(hexStringToByteArray(message))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.String r2 = o.ICustomTabsService.getMin(r2)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.util.Map<java.lang.String, java.lang.String> r5 = r1.toIntRange     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r5.put(r12, r2)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.d = r0     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.e = r1     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.f = r2     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.b = r11     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.Object r5 = r0.getMin((java.lang.String) r8, (o.hideTitleLoading) r1, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r3)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r5 != r4) goto L_0x00c1
                return r4
            L_0x00c1:
                r13 = r0
                r16 = r5
                r5 = r2
                r2 = r16
            L_0x00c7:
                o.hideTitleLoading r2 = (o.hideTitleLoading) r2     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                int r14 = r13.setMin     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r15 = 4
                r9 = 0
                if (r14 < r15) goto L_0x00d5
                r13.setMin = r9     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                setMax(r7)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                goto L_0x00ff
            L_0x00d5:
                java.util.Map<java.lang.String, java.lang.String> r14 = r2.toIntRange     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.Object r14 = r14.get(r12)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.String r14 = (java.lang.String) r14     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r15 = 0
                if (r14 == 0) goto L_0x0117
                java.lang.String r11 = "Balance"
                boolean r11 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r14, (java.lang.CharSequence) r11, (boolean) r9, (int) r10, (java.lang.Object) r15)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r11 != 0) goto L_0x0117
                int r9 = r13.setMin     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r11 = 1
                int r9 = r9 + r11
                r13.setMin = r9     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.d = r13     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.e = r1     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.f = r5     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.g = r2     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.b = r10     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.Object r9 = r13.getMax(r2, r3)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r9 != r4) goto L_0x00ff
                return r4
            L_0x00ff:
                r10 = r1
                r1 = r2
                r11 = r13
            L_0x0102:
                r3.d = r11     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.e = r10     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.f = r5     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r3.g = r1     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r1 = 3
                r3.b = r1     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.Object r2 = r11.getMin((java.lang.String) r8, (o.hideTitleLoading) r10, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r3)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                if (r2 != r4) goto L_0x0114
                return r4
            L_0x0114:
                o.hideTitleLoading r2 = (o.hideTitleLoading) r2     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                goto L_0x012f
            L_0x0117:
                r13.setMin = r9     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r1 = 1
                r2.getMax = r1     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                r2.length = r15     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r2.toIntRange     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                java.lang.String r3 = "9000"
                r1.put(r12, r3)     // Catch:{ TagLostException -> 0x012b, Exception -> 0x0126 }
                return r2
            L_0x0126:
                o.hideTitleLoading r2 = setMax(r6)
                goto L_0x012f
            L_0x012b:
                o.hideTitleLoading r2 = setMax(r7)
            L_0x012f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ICustomTabsCallback.Default.getMax(o.hideTitleLoading, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
}
