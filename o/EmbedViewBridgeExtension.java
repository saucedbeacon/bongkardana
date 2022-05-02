package o;

import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import o.AutoTransition;
import o.BaseGriverNetwork;
import o.BaseGriverRpcRequest;
import o.GriverDefaultPromptExtension;
import o.LocationBridgeExtension;
import o.onMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\b\u0010\f\u001a\u00020\u001dH\u0016J\u0016\u0010!\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\b\u0010\u0002\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\u001a\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J&\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\u001fH\u0016J\u0010\u0010\u0010\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020%H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006-"}, d2 = {"Lid/dana/miniprogram/di/MiniProgramPresenter;", "Lid/dana/miniprogram/di/MiniProgramContract$Presenter;", "handleMiniProgramScenario", "Lid/dana/domain/miniprogram/interactor/HandleMiniProgramScenario;", "deeplinkView", "Lid/dana/contract/deeplink/DeepLinkContract$View;", "miniProgramView", "Lid/dana/miniprogram/di/MiniProgramContract$View;", "readDeeplinkProperties", "Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties;", "deepLinkPayloadModelMapper", "Lid/dana/mapper/DeepLinkPayloadModelMapper;", "getMiniPrograms", "Lid/dana/domain/miniprogram/interactor/GetMiniPrograms;", "setFavoriteMiniPrograms", "Lid/dana/domain/miniprogram/interactor/SetFavoriteMiniPrograms;", "setRecentMiniProgram", "Lid/dana/domain/miniprogram/interactor/SetRecentMiniProgram;", "(Lid/dana/domain/miniprogram/interactor/HandleMiniProgramScenario;Lid/dana/contract/deeplink/DeepLinkContract$View;Lid/dana/miniprogram/di/MiniProgramContract$View;Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties;Lid/dana/mapper/DeepLinkPayloadModelMapper;Lid/dana/domain/miniprogram/interactor/GetMiniPrograms;Lid/dana/domain/miniprogram/interactor/SetFavoriteMiniPrograms;Lid/dana/domain/miniprogram/interactor/SetRecentMiniProgram;)V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "getIoScope", "()Lkotlinx/coroutines/CoroutineScope;", "setIoScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "uiScope", "getUiScope", "setUiScope", "getFavoriteMiniPrograms", "", "miniPrograms", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "getRecentMiniPrograms", "onDestroy", "openDeeplink", "url", "", "source", "setFavoriteMiniProgram", "appId", "isFavorite", "", "allMiniProgramAppIds", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EmbedViewBridgeExtension implements GriverDefaultPromptExtension.AnonymousClass2.getMax {
    @NotNull
    public static final setMin toFloatRange = new setMin((byte) 0);
    /* access modifiers changed from: private */
    public final AutoTransition.setMax IsOverlapping;
    private final onMessage equals;
    public initToken getMax;
    public final BaseGriverNetwork getMin;
    private final LocationBridgeExtension.AnonymousClass2 isInside;
    public final GriverDefaultPromptExtension.AnonymousClass2.getMin length;
    public final wrapper setMax;
    public initToken setMin;
    private final BaseGriverRpcRequest.AnonymousClass1 toDoubleRange;
    public final getFacadeClass toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/miniprogram/model/DeeplinkServiceEntity;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class equals extends Lambda implements Function1<BaseGriverNetwork.FacadeProcessor, Unit> {
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public equals(EmbedViewBridgeExtension embedViewBridgeExtension) {
            super(1);
            this.this$0 = embedViewBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BaseGriverNetwork.FacadeProcessor) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull BaseGriverNetwork.FacadeProcessor facadeProcessor) {
            Intrinsics.checkNotNullParameter(facadeProcessor, "it");
            String variant = facadeProcessor.getVariant();
            switch (variant.hashCode()) {
                case -1897368214:
                    if (variant.equals(DeeplinkService.Scene.QR_PAY)) {
                        this.this$0.length.getMin();
                        return;
                    }
                    return;
                case -1814683163:
                    if (!variant.equals(DeeplinkService.Scene.TOP_UP)) {
                        return;
                    }
                    break;
                case 2539133:
                    if (variant.equals(DeeplinkService.Scene.SCAN)) {
                        this.this$0.length.length();
                        return;
                    }
                    return;
                case 93594810:
                    if (!variant.equals(DeeplinkService.Scene.WEB_PAGE)) {
                        return;
                    }
                    break;
                case 1885613522:
                    if (!variant.equals(DeeplinkService.Scene.BIND_CARD)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            EmbedViewBridgeExtension embedViewBridgeExtension = this.this$0;
            String value = facadeProcessor.getValue();
            if (value != null) {
                EmbedViewBridgeExtension.setMax(embedViewBridgeExtension, value, facadeProcessor.getSource());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public toIntRange(EmbedViewBridgeExtension embedViewBridgeExtension) {
            super(1);
            this.this$0 = embedViewBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.IsOverlapping.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.MINI_PROGRAM, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<List<? extends BaseGriverRpcRequest.DeviceInfo>, Unit> {
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(EmbedViewBridgeExtension embedViewBridgeExtension) {
            super(1);
            this.this$0 = embedViewBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<BaseGriverRpcRequest.DeviceInfo>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.length.dismissProgress();
            this.this$0.length.onGetMiniPrograms(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(EmbedViewBridgeExtension embedViewBridgeExtension) {
            super(1);
            this.this$0 = embedViewBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            this.this$0.length.onError(th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ String $appId;
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IsOverlapping(EmbedViewBridgeExtension embedViewBridgeExtension, String str) {
            super(1);
            this.this$0 = embedViewBridgeExtension;
            this.$appId = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.onFavoriteLimitExceeded(this.$appId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
    public static final class toFloatRange extends Lambda implements Function1<Unit, Unit> {
        final /* synthetic */ String $appId;
        final /* synthetic */ boolean $isFavorite;
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public toFloatRange(EmbedViewBridgeExtension embedViewBridgeExtension, String str, boolean z) {
            super(1);
            this.this$0 = embedViewBridgeExtension;
            this.$appId = str;
            this.$isFavorite = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
            this.this$0.length.onSetFavoriteMiniPrograms(this.$appId, this.$isFavorite);
        }
    }

    @Inject
    public EmbedViewBridgeExtension(@NotNull wrapper wrapper, @NotNull AutoTransition.setMax setmax, @NotNull GriverDefaultPromptExtension.AnonymousClass2.getMin getmin, @NotNull onMessage onmessage, @NotNull LocationBridgeExtension.AnonymousClass2 r6, @NotNull BaseGriverNetwork baseGriverNetwork, @NotNull getFacadeClass getfacadeclass, @NotNull BaseGriverRpcRequest.AnonymousClass1 r9) {
        Intrinsics.checkNotNullParameter(wrapper, "handleMiniProgramScenario");
        Intrinsics.checkNotNullParameter(setmax, "deeplinkView");
        Intrinsics.checkNotNullParameter(getmin, "miniProgramView");
        Intrinsics.checkNotNullParameter(onmessage, "readDeeplinkProperties");
        Intrinsics.checkNotNullParameter(r6, "deepLinkPayloadModelMapper");
        Intrinsics.checkNotNullParameter(baseGriverNetwork, "getMiniPrograms");
        Intrinsics.checkNotNullParameter(getfacadeclass, "setFavoriteMiniPrograms");
        Intrinsics.checkNotNullParameter(r9, "setRecentMiniProgram");
        this.setMax = wrapper;
        this.IsOverlapping = setmax;
        this.length = getmin;
        this.equals = onmessage;
        this.isInside = r6;
        this.getMin = baseGriverNetwork;
        this.toIntRange = getfacadeclass;
        this.toDoubleRange = r9;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.miniprogram.di.MiniProgramPresenter$getFavoriteMiniPrograms$1", f = "MiniProgramPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getMin extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $miniPrograms;
        int label;
        final /* synthetic */ EmbedViewBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(EmbedViewBridgeExtension embedViewBridgeExtension, List list, Continuation continuation) {
            super(2, continuation);
            this.this$0 = embedViewBridgeExtension;
            this.$miniPrograms = list;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new getMin(this.this$0, this.$miniPrograms, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Collection arrayList = new ArrayList();
                for (Object next : this.$miniPrograms) {
                    if (Boxing.boxBoolean(((BaseGriverRpcRequest.DeviceInfo) next).isFavorite()).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                final List list = (List) arrayList;
                initToken inittoken = this.this$0.setMin;
                if (inittoken == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("uiScope");
                }
                xp4.getMin(inittoken, (CoroutineContext) null, (CoroutineStart) null, new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                    int label;
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        Intrinsics.checkNotNullParameter(continuation, "completion");
                        return 

                        public final void getMax(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
                            Intrinsics.checkNotNullParameter(list, "miniPrograms");
                            initToken inittoken = this.getMax;
                            if (inittoken == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ioScope");
                            }
                            xp4.getMin(inittoken, (CoroutineContext) null, (CoroutineStart) null, new getMin(this, list, (Continuation) null), 3);
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
                        @DebugMetadata(c = "id.dana.miniprogram.di.MiniProgramPresenter$getRecentMiniPrograms$1", f = "MiniProgramPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class getMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
                            final /* synthetic */ List $miniPrograms;
                            int label;
                            final /* synthetic */ EmbedViewBridgeExtension this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            getMax(EmbedViewBridgeExtension embedViewBridgeExtension, List list, Continuation continuation) {
                                super(2, continuation);
                                this.this$0 = embedViewBridgeExtension;
                                this.$miniPrograms = list;
                            }

                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                Intrinsics.checkNotNullParameter(continuation, "completion");
                                return new getMax(this.this$0, this.$miniPrograms, continuation);
                            }

                            public final Object invoke(Object obj, Object obj2) {
                                return ((getMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    Collection arrayList = new ArrayList();
                                    for (Object next : this.$miniPrograms) {
                                        if (Boxing.boxBoolean(((BaseGriverRpcRequest.DeviceInfo) next).getLastOpen() != 0).booleanValue()) {
                                            arrayList.add(next);
                                        }
                                    }
                                    final List take = CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList, new length()), 4);
                                    initToken inittoken = this.this$0.setMin;
                                    if (inittoken == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("uiScope");
                                    }
                                    xp4.getMin(inittoken, (CoroutineContext) null, (CoroutineStart) null, new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                                        int label;
                                        final /* synthetic */ getMax this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            Intrinsics.checkNotNullParameter(continuation, "completion");
                                            return 

                                            public final void getMin(@NotNull List<BaseGriverRpcRequest.DeviceInfo> list) {
                                                Intrinsics.checkNotNullParameter(list, "miniPrograms");
                                                initToken inittoken = this.getMax;
                                                if (inittoken == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("ioScope");
                                                }
                                                xp4.getMin(inittoken, (CoroutineContext) null, (CoroutineStart) null, new getMax(this, list, (Continuation) null), 3);
                                            }

                                            public final void length(@NotNull String str) {
                                                Intrinsics.checkNotNullParameter(str, "appId");
                                                BaseGriverRpcRequest.AnonymousClass1.getMin getmin = new BaseGriverRpcRequest.AnonymousClass1.getMin(str, 0, 2, (DefaultConstructorMarker) null);
                                                this.toDoubleRange.execute(getmin, new isInside(this, str, getmin), new EmbedViewBridgeExtension$FastBitmap$CoordinateSystem(this));
                                            }

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
                                            static final class isInside extends Lambda implements Function0<Unit> {
                                                final /* synthetic */ String $appId;
                                                final /* synthetic */ BaseGriverRpcRequest.AnonymousClass1.getMin $params;
                                                final /* synthetic */ EmbedViewBridgeExtension this$0;

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                isInside(EmbedViewBridgeExtension embedViewBridgeExtension, String str, BaseGriverRpcRequest.AnonymousClass1.getMin getmin) {
                                                    super(0);
                                                    this.this$0 = embedViewBridgeExtension;
                                                    this.$appId = str;
                                                    this.$params = getmin;
                                                }

                                                public final void invoke() {
                                                    this.this$0.length.onSetRecentMiniProgram(this.$appId, this.$params.getLastOpen());
                                                }
                                            }

                                            public final void setMax() {
                                                this.setMax.dispose();
                                                this.getMin.dispose();
                                                this.toIntRange.dispose();
                                                this.toDoubleRange.dispose();
                                            }

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/miniprogram/di/MiniProgramPresenter$Companion;", "", "()V", "MAXIMUM_RECENT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                                            public static final class setMin {
                                                private setMin() {
                                                }

                                                public /* synthetic */ setMin(byte b) {
                                                    this();
                                                }
                                            }

                                            public static final /* synthetic */ void setMax(EmbedViewBridgeExtension embedViewBridgeExtension, String str, String str2) {
                                                if (isShowMenu.length(str)) {
                                                    embedViewBridgeExtension.IsOverlapping.showProgress();
                                                    onMessage onmessage = embedViewBridgeExtension.equals;
                                                    AutoTransition.setMax setmax = embedViewBridgeExtension.IsOverlapping;
                                                    if (str2 == null) {
                                                        str2 = setmax.length();
                                                    }
                                                    onmessage.execute(new PatternPathMotion(setmax, false, str2, embedViewBridgeExtension.isInside), onMessage.getMax.Companion.forLinkRead(str));
                                                    return;
                                                }
                                                String min = isShowMenu.setMin(str);
                                                Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(url)");
                                                DanaH5.startContainerFullUrl(min);
                                            }
                                        }
