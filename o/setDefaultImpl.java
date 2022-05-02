package o;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0011\u0010\n\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lid/dana/lib/electronicmoney/tech/IsoDepRepository;", "Lid/dana/lib/electronicmoney/tech/base/ElectronicmoneyTagTechnology;", "request", "Lid/dana/lib/electronicmoney/manager/BankRequestEntity;", "(Lid/dana/lib/electronicmoney/manager/BankRequestEntity;)V", "isoDep", "Landroid/nfc/tech/IsoDep;", "kotlin.jvm.PlatformType", "getElectronicMoney", "Lid/dana/lib/electronicmoney/base/AbstractElectronicmoneyRepository;", "isBriByInquiry", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMandiriByApdu", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class setDefaultImpl implements getDefaultImpl {
    public final IsoDep getMax;
    public final create getMin;

    @DebugMetadata(c = "id.dana.lib.electronicmoney.tech.IsoDepRepository$getElectronicMoney$1", f = "IsoDepRepository.kt", i = {0}, l = {46}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    public static final class getMax extends SuspendLambda implements Function2<initToken, Continuation<? super Mean$Arithmetic>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public initToken f10821a;
        public Object b;
        public int c;
        public final /* synthetic */ setDefaultImpl d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(setDefaultImpl setdefaultimpl, Continuation continuation) {
            super(2, continuation);
            this.d = setdefaultimpl;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            getMax getmax = new getMax(this.d, continuation);
            getmax.f10821a = (initToken) obj;
            return getmax;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                initToken inittoken = this.f10821a;
                this.d.getMax.close();
                this.d.getMax.connect();
                hideOptionMenu hideoptionmenu = this.d.getMin.setMin;
                if (hideoptionmenu != null && hideoptionmenu.getMax()) {
                    setDefaultImpl setdefaultimpl = this.d;
                    if (setdefaultimpl != null) {
                        ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
                        byte[] transceive = setdefaultimpl.getMax.transceive(ICustomTabsService.length("00A40400080000000000000001"));
                        Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStr…ray(EMONEY_AVAILABILITY))");
                        if (Intrinsics.areEqual((Object) ICustomTabsService.getMin(transceive), (Object) "9000")) {
                            IsoDep isoDep = this.d.getMax;
                            Intrinsics.checkNotNullExpressionValue(isoDep, "isoDep");
                            return new extraCallbackWithResult(isoDep, this.d.getMin);
                        }
                    } else {
                        throw null;
                    }
                }
                setDefaultImpl setdefaultimpl2 = this.d;
                if (setdefaultimpl2.getMin.length != null) {
                    this.b = inittoken;
                    this.c = 1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    IsoDep isoDep2 = setdefaultimpl2.getMax;
                    Intrinsics.checkNotNullExpressionValue(isoDep2, "isoDep");
                    new valueOf(isoDep2, setdefaultimpl2.getMin).setMax(false, new setMax(safeContinuation));
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new IllegalAccessException("You haven't set required parameter to initialize ElectronicMoney");
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                IsoDep isoDep3 = this.d.getMax;
                Intrinsics.checkNotNullExpressionValue(isoDep3, "isoDep");
                return new valueOf(isoDep3, this.d.getMin);
            }
            throw new IllegalAccessException("You haven't set required parameter to initialize ElectronicMoney");
        }
    }

    public static final class setMax extends Lambda implements Function1<ICustomTabsCallback, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Continuation f10822a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(Continuation continuation) {
            super(1);
            this.f10822a = continuation;
        }

        public final Object invoke(Object obj) {
            ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) obj;
            Intrinsics.checkNotNullParameter(iCustomTabsCallback, "it");
            Continuation continuation = this.f10822a;
            Boolean valueOf = Boolean.valueOf(iCustomTabsCallback.setMax);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m1constructorimpl(valueOf));
            return Unit.INSTANCE;
        }
    }

    public setDefaultImpl(@NotNull create create) {
        Intrinsics.checkNotNullParameter(create, RequestPermissionsEvent.REQUEST);
        this.getMin = create;
        this.getMax = IsoDep.get((Tag) create.getMin.getParcelableExtra("android.nfc.extra.TAG"));
    }

    @NotNull
    public final Mean$Arithmetic length() {
        try {
            return (Mean$Arithmetic) xp2.setMax(EmptyCoroutineContext.INSTANCE, new getMax(this, (Continuation) null));
        } catch (Exception unused) {
            return new b();
        }
    }
}
