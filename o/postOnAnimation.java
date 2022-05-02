package o;

import android.content.Context;
import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.data.StorageException;
import com.twilio.verify.models.FactorType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.endAnimation;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ6\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eJ0\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eJ4\u0010\u0015\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eJ6\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eJ6\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eJ6\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eJ6\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/twilio/verify/domain/factor/FactorFacade;", "", "pushFactory", "Lcom/twilio/verify/domain/factor/PushFactory;", "factorProvider", "Lcom/twilio/verify/domain/factor/FactorProvider;", "(Lcom/twilio/verify/domain/factor/PushFactory;Lcom/twilio/verify/domain/factor/FactorProvider;)V", "clearLocalStorage", "", "success", "Lkotlin/Function0;", "createFactor", "factorPayload", "Lcom/twilio/verify/models/FactorPayload;", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "deleteFactor", "factorSid", "", "getAllFactors", "", "getFactor", "getFactorByServiceSid", "serviceSid", "updateFactor", "updateFactorPayload", "Lcom/twilio/verify/models/UpdateFactorPayload;", "verifyFactor", "verifyFactorPayload", "Lcom/twilio/verify/models/VerifyFactorPayload;", "Builder", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class postOnAnimation {
    /* access modifiers changed from: private */
    public final endAnimation getMax;
    public final removeAllViews setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/twilio/verify/domain/factor/FactorFacade$Builder;", "", "()V", "appContext", "Landroid/content/Context;", "authentication", "Lcom/twilio/verify/networking/Authentication;", "keyStore", "Lcom/twilio/verify/data/KeyStorage;", "networking", "Lcom/twilio/verify/networking/NetworkProvider;", "url", "", "baseUrl", "build", "Lcom/twilio/verify/domain/factor/FactorFacade;", "context", "keyStorage", "networkProvider", "setAuthentication", "verify_release"}, k = 1, mv = {1, 1, 16})
    public static final class setMin {
        public onDrawOver getMax;
        public String getMin;
        public shouldReMeasureChild length;
        public Context setMax;
        public ignoreView setMin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function0;", "Lcom/twilio/verify/threading/SafeSuccess;", "<anonymous parameter 1>", "Lkotlin/Function1;", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMax extends Lambda implements Function2<Function0<? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ postOnAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(postOnAnimation postonanimation) {
            super(2);
            this.this$0 = postonanimation;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function0<Unit>) (Function0) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Function0<Unit> function0, @NotNull Function1<? super TwilioVerifyException, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function1, "<anonymous parameter 1>");
            try {
                endAnimation max = this.this$0.getMax;
                Intrinsics.checkParameterIsNotNull(function0, "then");
                Collection arrayList = new ArrayList();
                for (getHeight getheight : max.setMax.setMin()) {
                    if (!(getheight instanceof detachView)) {
                        getheight = null;
                    }
                    detachView detachview = (detachView) getheight;
                    if (detachview != null) {
                        arrayList.add(detachview);
                    }
                }
                for (detachView detachview2 : (List) arrayList) {
                    max.setMax.getMin(detachview2);
                    String str = detachview2.length;
                    if (str != null) {
                        max.getMax.setMax(str);
                    }
                }
                Unit unit = Unit.INSTANCE;
                function0.invoke();
            } catch (Exception unused) {
                this.this$0.setMin.getMin();
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0007`\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "Lcom/twilio/verify/threading/SafeSuccessResult;", "onError", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMin extends Lambda implements Function2<Function1<? super getHeight, ? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ getChildAt $factorPayload;
        final /* synthetic */ postOnAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(postOnAnimation postonanimation, getChildAt getchildat) {
            super(2);
            this.this$0 = postonanimation;
            this.$factorPayload = getchildat;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function1<? super getHeight, Unit>) (Function1) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function12, "onError");
            if (this.$factorPayload instanceof getWidthMode) {
                endAnimation max = this.this$0.getMax;
                String str = ((getWidthMode) this.$factorPayload).getMin;
                String min = this.$factorPayload.getMin();
                String str2 = ((getWidthMode) this.$factorPayload).length;
                String min2 = this.$factorPayload.setMin();
                String max2 = this.$factorPayload.setMax();
                Intrinsics.checkParameterIsNotNull(str, "accessToken");
                Intrinsics.checkParameterIsNotNull(min, "friendlyName");
                Intrinsics.checkParameterIsNotNull(str2, "pushToken");
                Intrinsics.checkParameterIsNotNull(min2, "serviceSid");
                Intrinsics.checkParameterIsNotNull(max2, "identity");
                Intrinsics.checkParameterIsNotNull(function1, "success");
                Intrinsics.checkParameterIsNotNull(function12, "error");
                try {
                    String length = endAnimation.length();
                    Map<String, String> min3 = endAnimation.getMin(max.getMax.setMin(length));
                    max.setMax.getMax(new attachView(min, FactorType.PUSH, min2, max2, max.length(str2), min3, str), new endAnimation.setMax(new endAnimation.setMin(max, length, function1, function12)), new endAnimation.getMin(max, length, function12));
                } catch (TwilioVerifyException e) {
                    function12.invoke(e);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0007`\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "Lcom/twilio/verify/threading/SafeSuccessResult;", "onError", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class length extends Lambda implements Function2<Function1<? super getHeight, ? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ getPaddingLeft $updateFactorPayload;
        final /* synthetic */ postOnAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(postOnAnimation postonanimation, getPaddingLeft getpaddingleft) {
            super(2);
            this.this$0 = postonanimation;
            this.$updateFactorPayload = getpaddingleft;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function1<? super getHeight, Unit>) (Function1) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function12, "onError");
            if (this.$updateFactorPayload instanceof getPaddingRight) {
                endAnimation max = this.this$0.getMax;
                String min = this.$updateFactorPayload.setMin();
                String str = ((getPaddingRight) this.$updateFactorPayload).getMin;
                Intrinsics.checkParameterIsNotNull(min, "sid");
                Intrinsics.checkParameterIsNotNull(str, "pushToken");
                Intrinsics.checkParameterIsNotNull(function1, "success");
                Intrinsics.checkParameterIsNotNull(function12, "error");
                endAnimation.getMax getmax = new endAnimation.getMax(max, str, function1, function12);
                try {
                    getHeight max2 = max.setMax.getMax(min);
                    if (!(max2 instanceof detachView)) {
                        max2 = null;
                    }
                    detachView detachview = (detachView) max2;
                    if (detachview != null) {
                        getmax.invoke(detachview);
                        return;
                    }
                    throw new TwilioVerifyException(new StorageException("Factor not found"), TwilioVerifyException.ErrorCode.StorageError);
                } catch (TwilioVerifyException e) {
                    function12.invoke(e);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/twilio/verify/TwilioVerifyException;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class setMax extends Lambda implements Function1<TwilioVerifyException, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
            Intrinsics.checkParameterIsNotNull(twilioVerifyException, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TwilioVerifyException) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0007`\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "Lcom/twilio/verify/threading/SafeSuccessResult;", "onError", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class toIntRange extends Lambda implements Function2<Function1<? super getHeight, ? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ getPaddingTop $verifyFactorPayload;
        final /* synthetic */ postOnAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public toIntRange(postOnAnimation postonanimation, getPaddingTop getpaddingtop) {
            super(2);
            this.this$0 = postonanimation;
            this.$verifyFactorPayload = getpaddingtop;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function1<? super getHeight, Unit>) (Function1) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function12, "onError");
            if (this.$verifyFactorPayload instanceof getPaddingStart) {
                endAnimation max = this.this$0.getMax;
                String max2 = this.$verifyFactorPayload.setMax();
                Intrinsics.checkParameterIsNotNull(max2, "sid");
                Intrinsics.checkParameterIsNotNull(function1, "success");
                Intrinsics.checkParameterIsNotNull(function12, "error");
                endAnimation.length length = new endAnimation.length(max, max2, function1, function12);
                try {
                    getHeight max3 = max.setMax.getMax(max2);
                    if (!(max3 instanceof detachView)) {
                        max3 = null;
                    }
                    detachView detachview = (detachView) max3;
                    if (detachview != null) {
                        length.invoke(detachview);
                        return;
                    }
                    throw new TwilioVerifyException(new StorageException("Factor not found"), TwilioVerifyException.ErrorCode.StorageError);
                } catch (TwilioVerifyException e) {
                    function12.invoke(e);
                }
            }
        }
    }

    public postOnAnimation(@NotNull endAnimation endanimation, @NotNull removeAllViews removeallviews) {
        Intrinsics.checkParameterIsNotNull(endanimation, "pushFactory");
        Intrinsics.checkParameterIsNotNull(removeallviews, "factorProvider");
        this.getMax = endanimation;
        this.setMin = removeallviews;
    }

    public final void getMin(@NotNull String str, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "factorSid");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        try {
            getHeight max = this.setMin.getMax(str);
            if (max != null) {
                function1.invoke(max);
                return;
            }
            throw new TwilioVerifyException(new StorageException("Factor not found"), TwilioVerifyException.ErrorCode.StorageError);
        } catch (TwilioVerifyException e) {
            function12.invoke(e);
        }
    }
}
