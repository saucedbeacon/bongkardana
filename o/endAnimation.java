package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.models.FactorType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002JV\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0016J0\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0016J\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cJ\b\u0010\u001f\u001a\u00020\u000bH\u0002J>\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0016J6\u0010!\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/twilio/verify/domain/factor/PushFactory;", "", "factorProvider", "Lcom/twilio/verify/domain/factor/FactorProvider;", "keyStorage", "Lcom/twilio/verify/data/KeyStorage;", "context", "Landroid/content/Context;", "(Lcom/twilio/verify/domain/factor/FactorProvider;Lcom/twilio/verify/data/KeyStorage;Landroid/content/Context;)V", "binding", "", "", "publicKey", "config", "pushToken", "create", "", "accessToken", "friendlyName", "serviceSid", "identity", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "delete", "sid", "Lkotlin/Function0;", "deleteAllFactors", "then", "generateKeyPairAlias", "update", "verify", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class endAnimation {
    /* access modifiers changed from: package-private */
    public final onDrawOver getMax;
    private final Context length;
    /* access modifiers changed from: package-private */
    public final removeAllViews setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateFactor", "", "pushFactor", "Lcom/twilio/verify/domain/factor/models/PushFactor;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMax extends Lambda implements Function1<detachView, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ String $pushToken;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ endAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(endAnimation endanimation, String str, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = endanimation;
            this.$pushToken = str;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((detachView) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull detachView detachview) {
            Intrinsics.checkParameterIsNotNull(detachview, "pushFactor");
            this.this$0.setMax.setMax(new detachViewInternal(detachview.setMin, FactorType.PUSH, detachview.toIntRange, detachview.isInside, this.this$0.length(this.$pushToken), detachview.getMin), this.$success, this.$error);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "exception", "Lcom/twilio/verify/TwilioVerifyException;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<TwilioVerifyException, Unit> {
        final /* synthetic */ String $alias;
        final /* synthetic */ Function1 $error;
        final /* synthetic */ endAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(endAnimation endanimation, String str, Function1 function1) {
            super(1);
            this.this$0 = endanimation;
            this.$alias = str;
            this.$error = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TwilioVerifyException) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
            Intrinsics.checkParameterIsNotNull(twilioVerifyException, "exception");
            this.this$0.getMax.setMax(this.$alias);
            this.$error.invoke(twilioVerifyException);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"verifyFactor", "", "pushFactor", "Lcom/twilio/verify/domain/factor/models/PushFactor;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function1<detachView, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ String $sid;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ endAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(endAnimation endanimation, String str, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = endanimation;
            this.$sid = str;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((detachView) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull detachView detachview) {
            Intrinsics.checkParameterIsNotNull(detachview, "pushFactor");
            String str = detachview.length;
            if (str != null) {
                this.this$0.setMax.getMax(detachview, this.this$0.getMax.getMax(str, this.$sid), this.$success, this.$error);
                return;
            }
            this.$error.invoke(new TwilioVerifyException(new IllegalStateException("Alias not found"), TwilioVerifyException.ErrorCode.KeyStorageError));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/twilio/verify/models/Factor;", "Lkotlin/ParameterName;", "name", "factor", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class setMax extends FunctionReference implements Function1<getHeight, Unit> {
        final /* synthetic */ setMin $onFactorCreated$1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(setMin setmin) {
            super(1);
            this.$onFactorCreated$1 = setmin;
        }

        public final String getName() {
            return "onFactorCreated";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/twilio/verify/models/Factor;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getHeight) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getHeight getheight) {
            Intrinsics.checkParameterIsNotNull(getheight, "p1");
            this.$onFactorCreated$1.invoke(getheight);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"onFactorCreated", "", "factor", "Lcom/twilio/verify/models/Factor;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function1<getHeight, Unit> {
        final /* synthetic */ String $alias;
        final /* synthetic */ Function1 $error;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ endAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(endAnimation endanimation, String str, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = endanimation;
            this.$alias = str;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getHeight) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getHeight getheight) {
            Intrinsics.checkParameterIsNotNull(getheight, "factor");
            detachView detachview = null;
            if (!(getheight instanceof detachView)) {
                getheight = null;
            }
            detachView detachview2 = (detachView) getheight;
            if (detachview2 != null) {
                detachview2.length = this.$alias;
                if (detachview2 != null) {
                    CharSequence charSequence = detachview2.length;
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        detachview = detachview2;
                    }
                    if (detachview != null) {
                        this.this$0.setMax.setMin(detachview2);
                        this.$success.invoke(detachview2);
                        return;
                    }
                    this.this$0.getMax.setMax(this.$alias);
                    this.$error.invoke(new TwilioVerifyException(new IllegalStateException("Key pair not set"), TwilioVerifyException.ErrorCode.KeyStorageError));
                }
            }
        }
    }

    public endAnimation(@NotNull removeAllViews removeallviews, @NotNull onDrawOver ondrawover, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(removeallviews, "factorProvider");
        Intrinsics.checkParameterIsNotNull(ondrawover, "keyStorage");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.setMax = removeallviews;
        this.getMax = ondrawover;
        this.length = context;
    }

    static String length() {
        List plus = CollectionsKt.plus(CollectionsKt.plus(new CharRange('a', 'z'), new CharRange('A', 'Z')), new CharRange('0', '9'));
        Iterable intRange = new IntRange(1, 15);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Integer.valueOf(Random.Default.nextInt(0, plus.size())));
        }
        Iterable<Number> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Number intValue : iterable) {
            arrayList2.add(Character.valueOf(((Character) plus.get(intValue.intValue())).charValue()));
        }
        return CollectionsKt.joinToString$default((List) arrayList2, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    static Map<String, String> getMin(String str) {
        return MapsKt.mapOf(TuplesKt.to("PublicKey", str), TuplesKt.to("Alg", "ES256"));
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> length(String str) {
        return MapsKt.mapOf(TuplesKt.to("SdkVersion", "0.2.0"), TuplesKt.to("AppId", this.length.getApplicationInfo().packageName), TuplesKt.to("NotificationPlatform", "fcm"), TuplesKt.to("NotificationToken", str));
    }
}
