package o;

import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.data.StorageException;
import com.twilio.verify.networking.HttpMethod;
import com.twilio.verify.networking.NetworkException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import o.onItemRangeMoved;
import o.scrapOrRecycleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J2\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J8\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fH\u0016J@\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00182\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/twilio/verify/domain/factor/FactorRepository;", "Lcom/twilio/verify/domain/factor/FactorProvider;", "apiClient", "Lcom/twilio/verify/api/FactorAPIClient;", "storage", "Lcom/twilio/verify/data/StorageProvider;", "factorMapper", "Lcom/twilio/verify/domain/factor/FactorMapper;", "(Lcom/twilio/verify/api/FactorAPIClient;Lcom/twilio/verify/data/StorageProvider;Lcom/twilio/verify/domain/factor/FactorMapper;)V", "clearLocalStorage", "", "create", "createFactorPayload", "Lcom/twilio/verify/domain/factor/models/CreateFactorPayload;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "delete", "factor", "Lkotlin/Function0;", "get", "sid", "", "getAll", "", "save", "update", "updateFactorPayload", "Lcom/twilio/verify/domain/factor/models/UpdateFactorPayload;", "verify", "payload", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getPosition implements removeAllViews {
    private final onItemRangeMoved getMax;
    private final setRecyclerView getMin;
    /* access modifiers changed from: private */
    public final getLayoutDirection setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class IsOverlapping extends FunctionReference implements Function1<JSONObject, Unit> {
        final /* synthetic */ length $updateFactor$1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(length length) {
            super(1);
            this.$updateFactor$1 = length;
        }

        public final String getName() {
            return "updateFactor";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lorg/json/JSONObject;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "p1");
            this.$updateFactor$1.invoke(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateFactor", "", "response", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMax extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ attachView $createFactorPayload;
        final /* synthetic */ Function1 $error;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ getPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getPosition getposition, attachView attachview, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = getposition;
            this.$createFactorPayload = attachview;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            try {
                getPosition getposition = this.this$0;
                getLayoutDirection unused = this.this$0.setMin;
                this.$success.invoke(getposition.setMin(getLayoutDirection.getMin(jSONObject, this.$createFactorPayload)));
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class getMin extends FunctionReference implements Function1<JSONObject, Unit> {
        final /* synthetic */ getMax $updateFactor$1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getMax getmax) {
            super(1);
            this.$updateFactor$1 = getmax;
        }

        public final String getName() {
            return "updateFactor";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lorg/json/JSONObject;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "p1");
            this.$updateFactor$1.invoke(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateFactor", "", "response", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ getHeight $factor;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ getPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getPosition getposition, getHeight getheight, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = getposition;
            this.$factor = getheight;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            try {
                getHeight getheight = this.$factor;
                getLayoutDirection unused = this.this$0.setMin;
                getheight.setMax(getLayoutDirection.length(jSONObject));
                this.$success.invoke(this.this$0.setMin(this.$factor));
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateFactor", "", "response", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMax extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ detachViewInternal $updateFactorPayload;
        final /* synthetic */ getPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getPosition getposition, Function1 function1, detachViewInternal detachviewinternal, Function1 function12) {
            super(1);
            this.this$0 = getposition;
            this.$success = function1;
            this.$updateFactorPayload = detachviewinternal;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            try {
                Function1 function1 = this.$success;
                getLayoutDirection unused = this.this$0.setMin;
                function1.invoke(getLayoutDirection.getMin(jSONObject, this.$updateFactorPayload));
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class setMin extends FunctionReference implements Function1<JSONObject, Unit> {
        final /* synthetic */ setMax $updateFactor$1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(setMax setmax) {
            super(1);
            this.$updateFactor$1 = setmax;
        }

        public final String getName() {
            return "updateFactor";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lorg/json/JSONObject;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "p1");
            this.$updateFactor$1.invoke(jSONObject);
        }
    }

    private getPosition(@NotNull onItemRangeMoved onitemrangemoved, @NotNull setRecyclerView setrecyclerview, @NotNull getLayoutDirection getlayoutdirection) {
        Intrinsics.checkParameterIsNotNull(onitemrangemoved, "apiClient");
        Intrinsics.checkParameterIsNotNull(setrecyclerview, "storage");
        Intrinsics.checkParameterIsNotNull(getlayoutdirection, "factorMapper");
        this.getMax = onitemrangemoved;
        this.getMin = setrecyclerview;
        this.setMin = getlayoutdirection;
    }

    public /* synthetic */ getPosition(onItemRangeMoved onitemrangemoved, setRecyclerView setrecyclerview) {
        this(onitemrangemoved, setrecyclerview, new getLayoutDirection());
    }

    public final void getMax(@NotNull attachView attachview, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        attachView attachview2 = attachview;
        Function1<? super getHeight, Unit> function13 = function1;
        Function1<? super TwilioVerifyException, Unit> function14 = function12;
        Intrinsics.checkParameterIsNotNull(attachview2, "createFactorPayload");
        Intrinsics.checkParameterIsNotNull(function13, "success");
        Intrinsics.checkParameterIsNotNull(function14, "error");
        getMax getmax = new getMax(this, attachview2, function13, function14);
        onItemRangeMoved onitemrangemoved = this.getMax;
        Function1 getmin = new getMin(getmax);
        Intrinsics.checkParameterIsNotNull(attachview2, "createFactorPayload");
        Intrinsics.checkParameterIsNotNull(getmin, "success");
        Intrinsics.checkParameterIsNotNull(function14, "error");
        try {
            isMeasurementCacheEnabled ismeasurementcacheenabled = new isMeasurementCacheEnabled(onitemrangemoved.length, new getPaddingEnd("token", attachview2.isInside));
            StringBuilder sb = new StringBuilder();
            sb.append(onitemrangemoved.setMax);
            sb.append("Services/{ServiceSid}/Entities/{Identity}/Factors");
            scrapOrRecycleView.setMin setmin = new scrapOrRecycleView.setMin(ismeasurementcacheenabled, StringsKt.replace$default(StringsKt.replace(sb.toString(), "{ServiceSid}", attachview2.getMin, true), "{Identity}", attachview2.getMax, false, 4, (Object) null));
            HttpMethod httpMethod = HttpMethod.Post;
            Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
            setmin.setMin = httpMethod;
            scrapOrRecycleView.setMin setmin2 = setmin;
            Map<String, String> length2 = onItemRangeMoved.length(attachview);
            Intrinsics.checkParameterIsNotNull(length2, TtmlNode.TAG_BODY);
            setmin2.getMax = length2;
            onitemrangemoved.getMax.getMin(setmin2.length(), new onItemRangeMoved.setMin(getmin), new onItemRangeMoved.getMin(function14));
        } catch (TwilioVerifyException e) {
            function14.invoke(e);
        } catch (Exception e2) {
            function14.invoke(new TwilioVerifyException(new NetworkException((Throwable) e2), TwilioVerifyException.ErrorCode.NetworkError));
        }
    }

    public final void getMax(@NotNull getHeight getheight, @NotNull String str, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        Intrinsics.checkParameterIsNotNull(str, "payload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        length length2 = new length(this, getheight, function1, function12);
        onItemRangeMoved onitemrangemoved = this.getMax;
        Function1 isOverlapping = new IsOverlapping(length2);
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        Intrinsics.checkParameterIsNotNull(str, "authPayload");
        Intrinsics.checkParameterIsNotNull(isOverlapping, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        onItemRangeMoved.setMax.invoke$default(new onItemRangeMoved.setMax(onitemrangemoved, getheight, str, isOverlapping, function12), 0, 1, (Object) null);
    }

    public final void setMax(@NotNull detachViewInternal detachviewinternal, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        getHeight getheight;
        Intrinsics.checkParameterIsNotNull(detachviewinternal, "updateFactorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        setMax setmax = new setMax(this, function1, detachviewinternal, function12);
        String str = detachviewinternal.length;
        Intrinsics.checkParameterIsNotNull(str, "sid");
        String min = this.getMin.setMin(str);
        if (min != null) {
            getheight = getLayoutDirection.setMax(min);
        } else {
            getheight = null;
        }
        if (getheight != null) {
            onItemRangeMoved onitemrangemoved = this.getMax;
            Function1 setmin = new setMin(setmax);
            Intrinsics.checkParameterIsNotNull(getheight, "factor");
            Intrinsics.checkParameterIsNotNull(detachviewinternal, "updateFactorPayload");
            Intrinsics.checkParameterIsNotNull(setmin, "success");
            Intrinsics.checkParameterIsNotNull(function12, "error");
            onItemRangeMoved.getMax.invoke$default(new onItemRangeMoved.getMax(onitemrangemoved, getheight, detachviewinternal, setmin, function12), 0, 1, (Object) null);
            return;
        }
        throw new TwilioVerifyException(new StorageException("Factor not found"), TwilioVerifyException.ErrorCode.StorageError);
    }

    public final void getMin(@NotNull getHeight getheight) {
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        this.getMin.getMax(getheight.getMin());
    }

    @Nullable
    public final getHeight getMax(@NotNull String str) throws TwilioVerifyException {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        String min = this.getMin.setMin(str);
        if (min != null) {
            return getLayoutDirection.setMax(min);
        }
        return null;
    }

    @NotNull
    public final getHeight setMin(@NotNull getHeight getheight) throws TwilioVerifyException {
        getHeight getheight2;
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        setRecyclerView setrecyclerview = this.getMin;
        String min = getheight.getMin();
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        if (startSmoothScroll.setMax[getheight.getMax().ordinal()] == 1) {
            detachView detachview = (detachView) getheight;
            String jSONObject = new JSONObject().put("sid", getheight.getMin()).put("friendly_name", getheight.setMax()).put("account_sid", getheight.length()).put("service_sid", getheight.setMin()).put("entity_identity", getheight.IsOverlapping()).put("type", getheight.getMax().getFactorTypeName()).put("key_pair", detachview.length).put("status", getheight.toIntRange().getValue()).put("config", new JSONObject().put("credential_sid", detachview.equals.setMax)).put("date_created", onItemRangeRemoved.getMax(getheight.equals())).toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject, "JSONObject()\n          .…t))\n          .toString()");
            setrecyclerview.getMax(min, jSONObject);
            String min2 = getheight.getMin();
            Intrinsics.checkParameterIsNotNull(min2, "sid");
            String min3 = this.getMin.setMin(min2);
            if (min3 != null) {
                getheight2 = getLayoutDirection.setMax(min3);
            } else {
                getheight2 = null;
            }
            if (getheight2 != null) {
                return getheight2;
            }
            throw new TwilioVerifyException(new StorageException("Factor not found"), TwilioVerifyException.ErrorCode.StorageError);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void getMin() {
        this.getMin.setMin();
    }

    @NotNull
    public final List<getHeight> setMin() throws TwilioVerifyException {
        Collection arrayList = new ArrayList();
        for (String max : this.getMin.getMax()) {
            getHeight max2 = getLayoutDirection.setMax(max);
            if (max2 != null) {
                arrayList.add(max2);
            }
        }
        return (List) arrayList;
    }
}
