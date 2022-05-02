package id.dana.lib.electronicmoney;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.Grayscale$Algorithm;
import o.ICustomTabsCallback;
import o.Mean$Arithmetic;
import o.TabBarBridgeExtension;
import o.WindowBridgeExtension;
import o.clearTmpDetachFlag;
import o.create;
import o.getCause;
import o.hideOptionMenu;
import o.isBound;
import o.onMessageChannelReady;
import o.setBarBottomLineColor;
import o.setDefaultImpl;
import o.toFloatRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\r\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/lib/electronicmoney/DanaEmoney;", "", "()V", "electronicmoneyManager", "Lid/dana/lib/electronicmoney/manager/ElectronicmoneyManager;", "buildDanaEmoney", "", "builder", "Lid/dana/lib/electronicmoney/DanaEmoney$Builder;", "getBalance", "intent", "Landroid/content/Intent;", "callback", "Lid/dana/lib/electronicmoney/DanaEmoneyCallback;", "getTimeOutinMillis", "", "()Ljava/lang/Long;", "Builder", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class DanaEmoney {
    public static final DanaEmoney getMax = new DanaEmoney();
    public static onMessageChannelReady getMin;

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\"JT\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\u0016\u00105\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u00106\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\t\u00107\u001a\u000208HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, d2 = {"Lid/dana/lib/electronicmoney/DanaEmoney$Builder;", "", "context", "Landroid/content/Context;", "emoney", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyRequest;", "emoneyCallback", "Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "brizzi", "Lid/dana/lib/electronicmoney/bri/model/BrizziRequest;", "brizziCallback", "Lid/dana/lib/electronicmoney/bri/BrizziCallback;", "timeoutMillis", "", "(Landroid/content/Context;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyRequest;Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;Lid/dana/lib/electronicmoney/bri/model/BrizziRequest;Lid/dana/lib/electronicmoney/bri/BrizziCallback;Ljava/lang/Long;)V", "getBrizzi", "()Lid/dana/lib/electronicmoney/bri/model/BrizziRequest;", "setBrizzi", "(Lid/dana/lib/electronicmoney/bri/model/BrizziRequest;)V", "getBrizziCallback", "()Lid/dana/lib/electronicmoney/bri/BrizziCallback;", "setBrizziCallback", "(Lid/dana/lib/electronicmoney/bri/BrizziCallback;)V", "getContext", "()Landroid/content/Context;", "getEmoney", "()Lid/dana/lib/electronicmoney/mandiri/model/EmoneyRequest;", "setEmoney", "(Lid/dana/lib/electronicmoney/mandiri/model/EmoneyRequest;)V", "getEmoneyCallback", "()Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "setEmoneyCallback", "(Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;)V", "getTimeoutMillis", "()Ljava/lang/Long;", "setTimeoutMillis", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "build", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Landroid/content/Context;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyRequest;Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;Lid/dana/lib/electronicmoney/bri/model/BrizziRequest;Lid/dana/lib/electronicmoney/bri/BrizziCallback;Ljava/lang/Long;)Lid/dana/lib/electronicmoney/DanaEmoney$Builder;", "equals", "", "other", "hashCode", "", "setupBrizzi", "setupEmoney", "toString", "", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        @Nullable
        public WindowBridgeExtension brizzi;
        @Nullable
        public TabBarBridgeExtension.AnonymousClass2 brizziCallback;
        @NotNull
        public final Context context;
        @Nullable
        public hideOptionMenu emoney;
        @Nullable
        public setBarBottomLineColor emoneyCallback;
        @Nullable
        public Long timeoutMillis;

        public Builder(@NotNull Context context2, @Nullable hideOptionMenu hideoptionmenu, @Nullable setBarBottomLineColor setbarbottomlinecolor, @Nullable WindowBridgeExtension windowBridgeExtension, @Nullable TabBarBridgeExtension.AnonymousClass2 r6, @Nullable Long l) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            this.context = context2;
            this.emoney = hideoptionmenu;
            this.emoneyCallback = setbarbottomlinecolor;
            this.brizzi = windowBridgeExtension;
            this.brizziCallback = r6;
            this.timeoutMillis = l;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(android.content.Context r7, o.hideOptionMenu r8, o.setBarBottomLineColor r9, o.WindowBridgeExtension r10, o.TabBarBridgeExtension.AnonymousClass2 r11, java.lang.Long r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r6 = this;
                r0 = r13 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r8
            L_0x0008:
                r2 = r13 & 4
                if (r2 == 0) goto L_0x000e
                r2 = r1
                goto L_0x000f
            L_0x000e:
                r2 = r9
            L_0x000f:
                r3 = r13 & 8
                if (r3 == 0) goto L_0x0015
                r3 = r1
                goto L_0x0016
            L_0x0015:
                r3 = r10
            L_0x0016:
                r4 = r13 & 16
                if (r4 == 0) goto L_0x001c
                r4 = r1
                goto L_0x001d
            L_0x001c:
                r4 = r11
            L_0x001d:
                r5 = r13 & 32
                if (r5 == 0) goto L_0x0022
                goto L_0x0023
            L_0x0022:
                r1 = r12
            L_0x0023:
                r8 = r6
                r9 = r7
                r10 = r0
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.electronicmoney.DanaEmoney.Builder.<init>(android.content.Context, o.hideOptionMenu, o.setBarBottomLineColor, o.WindowBridgeExtension, o.TabBarBridgeExtension$2, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Context context2, hideOptionMenu hideoptionmenu, setBarBottomLineColor setbarbottomlinecolor, WindowBridgeExtension windowBridgeExtension, TabBarBridgeExtension.AnonymousClass2 r9, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                context2 = builder.context;
            }
            if ((i & 2) != 0) {
                hideoptionmenu = builder.emoney;
            }
            hideOptionMenu hideoptionmenu2 = hideoptionmenu;
            if ((i & 4) != 0) {
                setbarbottomlinecolor = builder.emoneyCallback;
            }
            setBarBottomLineColor setbarbottomlinecolor2 = setbarbottomlinecolor;
            if ((i & 8) != 0) {
                windowBridgeExtension = builder.brizzi;
            }
            WindowBridgeExtension windowBridgeExtension2 = windowBridgeExtension;
            if ((i & 16) != 0) {
                r9 = builder.brizziCallback;
            }
            TabBarBridgeExtension.AnonymousClass2 r2 = r9;
            if ((i & 32) != 0) {
                l = builder.timeoutMillis;
            }
            return builder.copy(context2, hideoptionmenu2, setbarbottomlinecolor2, windowBridgeExtension2, r2, l);
        }

        public final void build() {
            DanaEmoney.setMax(DanaEmoney.getMax, this);
        }

        @NotNull
        public final Context component1() {
            return this.context;
        }

        @Nullable
        public final hideOptionMenu component2() {
            return this.emoney;
        }

        @Nullable
        public final setBarBottomLineColor component3() {
            return this.emoneyCallback;
        }

        @Nullable
        public final WindowBridgeExtension component4() {
            return this.brizzi;
        }

        @Nullable
        public final TabBarBridgeExtension.AnonymousClass2 component5() {
            return this.brizziCallback;
        }

        @Nullable
        public final Long component6() {
            return this.timeoutMillis;
        }

        @NotNull
        public final Builder copy(@NotNull Context context2, @Nullable hideOptionMenu hideoptionmenu, @Nullable setBarBottomLineColor setbarbottomlinecolor, @Nullable WindowBridgeExtension windowBridgeExtension, @Nullable TabBarBridgeExtension.AnonymousClass2 r13, @Nullable Long l) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            return new Builder(context2, hideoptionmenu, setbarbottomlinecolor, windowBridgeExtension, r13, l);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return Intrinsics.areEqual((Object) this.context, (Object) builder.context) && Intrinsics.areEqual((Object) this.emoney, (Object) builder.emoney) && Intrinsics.areEqual((Object) this.emoneyCallback, (Object) builder.emoneyCallback) && Intrinsics.areEqual((Object) this.brizzi, (Object) builder.brizzi) && Intrinsics.areEqual((Object) this.brizziCallback, (Object) builder.brizziCallback) && Intrinsics.areEqual((Object) this.timeoutMillis, (Object) builder.timeoutMillis);
        }

        @Nullable
        public final WindowBridgeExtension getBrizzi() {
            return this.brizzi;
        }

        @Nullable
        public final TabBarBridgeExtension.AnonymousClass2 getBrizziCallback() {
            return this.brizziCallback;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        public final hideOptionMenu getEmoney() {
            return this.emoney;
        }

        @Nullable
        public final setBarBottomLineColor getEmoneyCallback() {
            return this.emoneyCallback;
        }

        @Nullable
        public final Long getTimeoutMillis() {
            return this.timeoutMillis;
        }

        public final int hashCode() {
            Context context2 = this.context;
            int i = 0;
            int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
            hideOptionMenu hideoptionmenu = this.emoney;
            int hashCode2 = (hashCode + (hideoptionmenu != null ? hideoptionmenu.hashCode() : 0)) * 31;
            setBarBottomLineColor setbarbottomlinecolor = this.emoneyCallback;
            int hashCode3 = (hashCode2 + (setbarbottomlinecolor != null ? setbarbottomlinecolor.hashCode() : 0)) * 31;
            WindowBridgeExtension windowBridgeExtension = this.brizzi;
            int hashCode4 = (hashCode3 + (windowBridgeExtension != null ? windowBridgeExtension.hashCode() : 0)) * 31;
            TabBarBridgeExtension.AnonymousClass2 r2 = this.brizziCallback;
            int hashCode5 = (hashCode4 + (r2 != null ? r2.hashCode() : 0)) * 31;
            Long l = this.timeoutMillis;
            if (l != null) {
                i = l.hashCode();
            }
            return hashCode5 + i;
        }

        public final void setBrizzi(@Nullable WindowBridgeExtension windowBridgeExtension) {
            this.brizzi = windowBridgeExtension;
        }

        public final void setBrizziCallback(@Nullable TabBarBridgeExtension.AnonymousClass2 r1) {
            this.brizziCallback = r1;
        }

        public final void setEmoney(@Nullable hideOptionMenu hideoptionmenu) {
            this.emoney = hideoptionmenu;
        }

        public final void setEmoneyCallback(@Nullable setBarBottomLineColor setbarbottomlinecolor) {
            this.emoneyCallback = setbarbottomlinecolor;
        }

        public final void setTimeoutMillis(@Nullable Long l) {
            this.timeoutMillis = l;
        }

        @NotNull
        public final Builder setupBrizzi(@NotNull WindowBridgeExtension windowBridgeExtension, @NotNull TabBarBridgeExtension.AnonymousClass2 r3) {
            Intrinsics.checkNotNullParameter(windowBridgeExtension, "brizzi");
            Intrinsics.checkNotNullParameter(r3, "brizziCallback");
            this.brizzi = windowBridgeExtension;
            this.brizziCallback = r3;
            return this;
        }

        @NotNull
        public final Builder setupEmoney(@NotNull hideOptionMenu hideoptionmenu, @NotNull setBarBottomLineColor setbarbottomlinecolor) {
            Intrinsics.checkNotNullParameter(hideoptionmenu, "emoney");
            Intrinsics.checkNotNullParameter(setbarbottomlinecolor, "emoneyCallback");
            this.emoney = hideoptionmenu;
            this.emoneyCallback = setbarbottomlinecolor;
            return this;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Builder(context=");
            sb.append(this.context);
            sb.append(", emoney=");
            sb.append(this.emoney);
            sb.append(", emoneyCallback=");
            sb.append(this.emoneyCallback);
            sb.append(", brizzi=");
            sb.append(this.brizzi);
            sb.append(", brizziCallback=");
            sb.append(this.brizziCallback);
            sb.append(", timeoutMillis=");
            sb.append(this.timeoutMillis);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class getMax extends Lambda implements Function1<ICustomTabsCallback, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ toFloatRange f11083a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(toFloatRange tofloatrange) {
            super(1);
            this.f11083a = tofloatrange;
        }

        public final Object invoke(Object obj) {
            ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) obj;
            Intrinsics.checkNotNullParameter(iCustomTabsCallback, "it");
            this.f11083a.getMax(iCustomTabsCallback);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static Long getMax() {
        onMessageChannelReady onmessagechannelready = getMin;
        if (onmessagechannelready != null) {
            return onmessagechannelready.length;
        }
        return null;
    }

    public static void getMax(@NotNull Intent intent, @NotNull toFloatRange tofloatrange) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        Intrinsics.checkNotNullParameter(tofloatrange, "callback");
        onMessageChannelReady onmessagechannelready = getMin;
        if (onmessagechannelready != null) {
            getMax getmax = new getMax(tofloatrange);
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            Intrinsics.checkNotNullParameter(getmax, "onResult");
            create create = new create(intent, onmessagechannelready.setMin, onmessagechannelready.getMax, onmessagechannelready.setMax, onmessagechannelready.getMin);
            Intrinsics.checkNotNullParameter(create, "bankRequestEntity");
            Intrinsics.checkNotNullParameter(create, "bankRequestEntity");
            Mean$Arithmetic length = new setDefaultImpl(create).length();
            if (length != null) {
                getCause getcause = new getCause(getmax);
                Intrinsics.checkNotNullParameter(getcause, "onResult");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
                if (length.getMax()) {
                    length.getMin(new Grayscale$Algorithm(length, objectRef, getcause));
                    return;
                }
                getcause.invoke((ICustomTabsCallback) objectRef.element);
                length.length.getMin((CancellationException) null);
            }
        }
    }

    public static final /* synthetic */ void setMax(DanaEmoney danaEmoney, Builder builder) {
        String str;
        String str2;
        String str3 = null;
        if (danaEmoney != null) {
            onMessageChannelReady onmessagechannelready = new onMessageChannelReady(builder.getContext());
            onmessagechannelready.setMin = builder.getEmoney();
            onmessagechannelready.getMax = builder.getEmoneyCallback();
            WindowBridgeExtension brizzi = builder.getBrizzi();
            if (clearTmpDetachFlag.getMax == null) {
                clearTmpDetachFlag.getMax = new clearTmpDetachFlag();
            }
            clearTmpDetachFlag cleartmpdetachflag = clearTmpDetachFlag.getMax;
            if (brizzi != null) {
                str = brizzi.setMin;
            } else {
                str = null;
            }
            if (brizzi != null) {
                str2 = brizzi.getMax;
            } else {
                str2 = null;
            }
            cleartmpdetachflag.length = new isBound(str, str2);
            if (brizzi != null) {
                str3 = brizzi.getMin;
            }
            cleartmpdetachflag.setMin = str3;
            cleartmpdetachflag.setMin(onmessagechannelready.toIntRange);
            onmessagechannelready.setMax = brizzi;
            onmessagechannelready.getMin = builder.getBrizziCallback();
            onmessagechannelready.length = builder.getTimeoutMillis();
            getMin = onmessagechannelready;
            return;
        }
        throw null;
    }
}
