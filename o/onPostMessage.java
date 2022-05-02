package o;

import android.nfc.Tag;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.ICustomTabsCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JI\u0010\r\u001a\u00020\u000e26\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/EmoneyEntityRepository;", "", "emoneyCallback", "Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "apduCommandProvider", "Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "(Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;)V", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "getEmoneyCardAttribute", "()Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "emoneyCardAttribute$delegate", "Lkotlin/Lazy;", "getEmoney", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "applet", "Lkotlin/Function2;", "Lid/dana/lib/electronicmoney/mandiri/base/AbstractEmoneyRepository;", "Lkotlin/ParameterName;", "name", "result", "emoneyApiResult", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class onPostMessage {
    public final setBarBottomLineColor getMax;
    public final asBinder getMin;
    public final Lazy length = LazyKt.lazy(new setMax(this));

    public static final class getMax implements Function1<hideTitleLoading, Unit> {
        public final /* synthetic */ onPostMessage getMax;
        public final /* synthetic */ hideBackButton getMin;
        public final /* synthetic */ Continuation length;
        public final /* synthetic */ Function2 setMin;

        public getMax(hideBackButton hidebackbutton, Continuation continuation, onPostMessage onpostmessage, Function2 function2) {
            this.getMin = hidebackbutton;
            this.length = continuation;
            this.getMax = onpostmessage;
            this.setMin = function2;
        }

        public final Object invoke(Object obj) {
            Object obj2;
            hideTitleLoading hidetitleloading = (hideTitleLoading) obj;
            Intrinsics.checkNotNullParameter(hidetitleloading, "result");
            Continuation continuation = this.length;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m1constructorimpl(hidetitleloading));
            if (Intrinsics.areEqual((Object) hidetitleloading.IsOverlapping, (Object) "OLD")) {
                onPostMessage onpostmessage = this.getMax;
                obj2 = new ICustomTabsCallback.Default(onpostmessage.getMax, onpostmessage.getMin, this.getMin);
            } else {
                onPostMessage onpostmessage2 = this.getMax;
                obj2 = new ICustomTabsCallback.Stub(onpostmessage2.getMax, onpostmessage2.getMin, this.getMin);
            }
            this.setMin.invoke(obj2, hidetitleloading);
            return Unit.INSTANCE;
        }
    }

    public static final class setMax extends Lambda implements Function0<hideBackButton> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ onPostMessage f10820a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(onPostMessage onpostmessage) {
            super(0);
            this.f10820a = onpostmessage;
        }

        public final Object invoke() {
            String str;
            asBinder asbinder = this.f10820a.getMin;
            Intrinsics.checkNotNullParameter(asbinder, "apduCommandProvider");
            if (asbinder != null) {
                ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
                byte[] transceive = asbinder.setMax.transceive(ICustomTabsService.length("00F210000B"));
                Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStr…yteArray(CARD_ATTRIBUTE))");
                String min = ICustomTabsService.getMin(transceive);
                ICustomTabsService iCustomTabsService2 = ICustomTabsService.setMax;
                byte[] transceive2 = asbinder.setMax.transceive(ICustomTabsService.length("00B300003F"));
                Intrinsics.checkNotNullExpressionValue(transceive2, "isoDep.transceive(hexStringToByteArray(CARD_INFO))");
                String substring = ICustomTabsService.getMin(transceive2).substring(0, 16);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String min2 = asbinder.getMin();
                ICustomTabsService iCustomTabsService3 = ICustomTabsService.setMax;
                byte[] transceive3 = asbinder.setMax.transceive(ICustomTabsService.length("00B300003F"));
                Intrinsics.checkNotNullExpressionValue(transceive3, "isoDep.transceive(hexStringToByteArray(CARD_INFO))");
                String min3 = ICustomTabsService.getMin(transceive3);
                ICustomTabsService iCustomTabsService4 = ICustomTabsService.setMax;
                byte[] transceive4 = asbinder.setMax.transceive(ICustomTabsService.length("FFCA000000"));
                Intrinsics.checkNotNullExpressionValue(transceive4, "isoDep.transceive(hexStringToByteArray(CARD_UID))");
                String min4 = ICustomTabsService.getMin(transceive4);
                if (!Intrinsics.areEqual((Object) "9000", (Object) StringsKt.takeLast(min4, 4))) {
                    ICustomTabsService iCustomTabsService5 = ICustomTabsService.setMax;
                    Tag tag = asbinder.setMax.getTag();
                    Intrinsics.checkNotNullExpressionValue(tag, "isoDep.tag");
                    byte[] id2 = tag.getId();
                    Intrinsics.checkNotNullExpressionValue(id2, "isoDep.tag.id");
                    str = ICustomTabsService.getMin(id2);
                } else {
                    str = min4;
                }
                return new hideBackButton("INQUIRY_BALANCE", (String) null, (String) null, (String) null, min, substring, min2, min3, str, (String) null, (Map) null, 1550);
            }
            throw null;
        }
    }

    public onPostMessage(@NotNull setBarBottomLineColor setbarbottomlinecolor, @NotNull asBinder asbinder) {
        Intrinsics.checkNotNullParameter(setbarbottomlinecolor, "emoneyCallback");
        Intrinsics.checkNotNullParameter(asbinder, "apduCommandProvider");
        this.getMax = setbarbottomlinecolor;
        this.getMin = asbinder;
    }
}
