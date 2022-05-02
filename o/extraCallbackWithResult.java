package o;

import android.nfc.tech.IsoDep;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import o.onPostMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J+\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000e0\u0010H\u0014J+\u0010\u0015\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000e0\u0010H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/MandiriEntityRepository;", "Lid/dana/lib/electronicmoney/base/AbstractElectronicmoneyRepository;", "isoDep", "Landroid/nfc/tech/IsoDep;", "request", "Lid/dana/lib/electronicmoney/manager/BankRequestEntity;", "(Landroid/nfc/tech/IsoDep;Lid/dana/lib/electronicmoney/manager/BankRequestEntity;)V", "apduCommandProvider", "Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "check", "", "getCardType", "", "reversal", "", "onResult", "Lkotlin/Function1;", "Lid/dana/lib/electronicmoney/entity/BalanceResult;", "Lkotlin/ParameterName;", "name", "balanceResult", "update", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class extraCallbackWithResult extends Mean$Arithmetic {
    public final create getMax;
    public final asBinder setMin;

    public extraCallbackWithResult(@NotNull IsoDep isoDep, @NotNull create create) {
        Intrinsics.checkNotNullParameter(isoDep, "isoDep");
        Intrinsics.checkNotNullParameter(create, RequestPermissionsEvent.REQUEST);
        this.getMax = create;
        this.setMin = new asBinder(isoDep);
    }

    public final boolean getMax() {
        return this.getMax.setMin != null;
    }

    @NotNull
    public final String getMin() {
        return "emoney";
    }

    public final void getMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onResult");
        setBarBottomLineColor setbarbottomlinecolor = this.getMax.getMax;
        if (setbarbottomlinecolor != null) {
            xp4.getMin((initToken) this.setMax.getValue(), (CoroutineContext) null, (CoroutineStart) null, new setMin(this, new onPostMessage(setbarbottomlinecolor, this.setMin), function1, (Continuation) null), 3);
        }
    }

    public final void setMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onResult");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
    @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.MandiriEntityRepository$update$1", f = "MandiriEntityRepository.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class setMin extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public initToken f10816a;
        public Object b;
        public int c;
        public final /* synthetic */ extraCallbackWithResult d;
        public final /* synthetic */ onPostMessage e;
        public final /* synthetic */ Function1 f;

        public static final class getMax extends Lambda implements Function2<asInterface, hideTitleLoading, Unit> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ setMin f10817a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMax(setMin setmin) {
                super(2);
                this.f10817a = setmin;
            }

            public final Object invoke(Object obj, Object obj2) {
                asInterface asinterface = (asInterface) obj;
                hideTitleLoading hidetitleloading = (hideTitleLoading) obj2;
                Intrinsics.checkNotNullParameter(asinterface, "repository");
                Intrinsics.checkNotNullParameter(hidetitleloading, "apiResult");
                xp4.getMin((initToken) this.f10817a.d.getMin.getValue(), (CoroutineContext) null, (CoroutineStart) null, new extraCallback(this, asinterface, hidetitleloading, (Continuation) null), 3);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(extraCallbackWithResult extracallbackwithresult, onPostMessage onpostmessage, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.d = extracallbackwithresult;
            this.e = onpostmessage;
            this.f = function1;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            setMin setmin = new setMin(this.d, this.e, this.f, continuation);
            setmin.f10816a = (initToken) obj;
            return setmin;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                initToken inittoken = this.f10816a;
                onPostMessage onpostmessage = this.e;
                getMax getmax = new getMax(this);
                this.b = inittoken;
                this.c = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                hideBackButton hidebackbutton = (hideBackButton) onpostmessage.length.getValue();
                if (hidebackbutton.IsOverlapping.length() != 0) {
                    z = false;
                }
                if (!z) {
                    asBinder asbinder = onpostmessage.getMin;
                    if (asbinder != null) {
                        ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
                        byte[] transceive = asbinder.setMax.transceive(ICustomTabsService.length("00A40400080000000000000001"));
                        Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStr…ray(EMONEY_AVAILABILITY))");
                        if (Intrinsics.areEqual((Object) ICustomTabsService.getMin(transceive), (Object) "9000")) {
                            onpostmessage.getMax.callInquiryBalance(hidebackbutton, new onPostMessage.getMax(hidebackbutton, safeContinuation, onpostmessage, getmax));
                            Object orThrow = safeContinuation.getOrThrow();
                            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(this);
                            }
                            if (orThrow == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                throw new IllegalAccessException();
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (IllegalAccessException unused) {
                    Function1 function1 = this.f;
                    ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
                    iCustomTabsCallback.setMax = false;
                    iCustomTabsCallback.isInside = "004";
                    Unit unit = Unit.INSTANCE;
                    function1.invoke(iCustomTabsCallback);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
