package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.networking.HttpMethod;
import com.twilio.verify.networking.NetworkException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import o.scrapOrRecycleView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJd\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u001128\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001aJa\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\t2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001aJ\u0018\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J8\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0(2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001aJ\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0*2\u0006\u0010'\u001a\u00020\tH\u0002J\u0010\u0010+\u001a\u00020\t2\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/twilio/verify/api/ChallengeAPIClient;", "Lcom/twilio/verify/api/BaseAPIClient;", "networkProvider", "Lcom/twilio/verify/networking/NetworkProvider;", "context", "Landroid/content/Context;", "authentication", "Lcom/twilio/verify/networking/Authentication;", "baseUrl", "", "dateProvider", "Lcom/twilio/verify/data/DateProvider;", "(Lcom/twilio/verify/networking/NetworkProvider;Landroid/content/Context;Lcom/twilio/verify/networking/Authentication;Ljava/lang/String;Lcom/twilio/verify/data/DateProvider;)V", "get", "", "sid", "factor", "Lcom/twilio/verify/models/Factor;", "success", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "signatureFieldsHeader", "error", "Lkotlin/Function1;", "Lcom/twilio/verify/TwilioVerifyException;", "getAll", "status", "pageSize", "", "pageToken", "getChallengeURL", "challengeSid", "getChallengesURL", "update", "challenge", "Lcom/twilio/verify/domain/challenge/models/FactorChallenge;", "authPayload", "Lkotlin/Function0;", "updateChallengeBody", "", "updateChallengeURL", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class onChanged extends notifyItemRangeRemoved {
    /* access modifiers changed from: private */
    public final Context getMax;
    /* access modifiers changed from: private */
    public final ignoreView getMin;
    /* access modifiers changed from: private */
    public final shouldReMeasureChild length;
    private final String setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateChallenge", "", "retries", "", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ String $authPayload;
        final /* synthetic */ isSmoothScrolling $challenge;
        final /* synthetic */ Function1 $error;
        final /* synthetic */ Function0 $success;
        final /* synthetic */ onChanged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(onChanged onchanged, isSmoothScrolling issmoothscrolling, String str, Function0 function0, Function1 function1) {
            super(1);
            this.this$0 = onchanged;
            this.$challenge = issmoothscrolling;
            this.$authPayload = str;
            this.$success = function0;
            this.$error = function1;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void invoke$default(getMax getmax, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            getmax.invoke(i);
        }

        public final void invoke(final int i) {
            try {
                getHeight getheight = this.$challenge.getMax;
                if (getheight != null) {
                    scrapOrRecycleView.setMin setmin = new scrapOrRecycleView.setMin(new isMeasurementCacheEnabled(this.this$0.getMax, new getPaddingEnd("token", this.this$0.getMin.setMax(getheight))), onChanged.getMax(this.this$0, this.$challenge));
                    HttpMethod httpMethod = HttpMethod.Post;
                    Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
                    setmin.setMin = httpMethod;
                    scrapOrRecycleView.setMin setmin2 = setmin;
                    Map<String, ? extends Object> min = MapsKt.mapOf(TuplesKt.to("AuthPayload", this.$authPayload));
                    Intrinsics.checkParameterIsNotNull(min, TtmlNode.TAG_BODY);
                    setmin2.getMax = min;
                    this.this$0.length.getMin(setmin2.length(), new Function1<removeAndRecycleScrapInt, Unit>(this) {
                        final /* synthetic */ getMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((removeAndRecycleScrapInt) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull removeAndRecycleScrapInt removeandrecyclescrapint) {
                            Intrinsics.checkParameterIsNotNull(removeandrecyclescrapint, "it");
                            this.this$0.$success.invoke();
                        }
                    }, new Function1<NetworkException, Unit>(this) {
                        final /* synthetic */ getMax this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((NetworkException) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull NetworkException networkException) {
                            Intrinsics.checkParameterIsNotNull(networkException, "exception");
                            this.this$0.this$0.setMax(networkException, new Function1<Integer, Unit>(this) {
                                final /* synthetic */ AnonymousClass1 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                public final String getName() {
                                    return "updateChallenge";
                                }

                                public final KDeclarationContainer getOwner() {
                                    return null;
                                }

                                public final String getSignature() {
                                    return "invoke(I)V";
                                }

                                public final /* synthetic */ Object invoke(Object obj) {
                                    invoke(((Number) obj).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i) {
                                    this.this$0.this$0.invoke(i);
                                }
                            }, i, this.this$0.$error);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("Factor is null");
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            } catch (Exception e2) {
                this.$error.invoke(new TwilioVerifyException(new NetworkException((Throwable) e2), TwilioVerifyException.ErrorCode.NetworkError));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"getChallenge", "", "retries", "", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMin extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ getHeight $factor;
        final /* synthetic */ String $sid;
        final /* synthetic */ Function2 $success;
        final /* synthetic */ onChanged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(onChanged onchanged, getHeight getheight, String str, Function2 function2, Function1 function1) {
            super(1);
            this.this$0 = onchanged;
            this.$factor = getheight;
            this.$sid = str;
            this.$success = function2;
            this.$error = function1;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void invoke$default(getMin getmin, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            getmin.invoke(i);
        }

        public final void invoke(final int i) {
            try {
                scrapOrRecycleView.setMin setmin = new scrapOrRecycleView.setMin(new isMeasurementCacheEnabled(this.this$0.getMax, new getPaddingEnd("token", this.this$0.getMin.setMax(this.$factor))), onChanged.setMax(this.this$0, this.$sid, this.$factor));
                HttpMethod httpMethod = HttpMethod.Get;
                Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
                setmin.setMin = httpMethod;
                this.this$0.length.getMin(setmin.length(), new Function1<removeAndRecycleScrapInt, Unit>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((removeAndRecycleScrapInt) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull removeAndRecycleScrapInt removeandrecyclescrapint) {
                        Intrinsics.checkParameterIsNotNull(removeandrecyclescrapint, "it");
                        Function2 function2 = this.this$0.$success;
                        JSONObject jSONObject = new JSONObject(removeandrecyclescrapint.getMin);
                        List list = removeandrecyclescrapint.setMax.get("Twilio-Verify-Signature-Fields");
                        function2.invoke(jSONObject, list != null ? (String) CollectionsKt.first(list) : null);
                    }
                }, new Function1<NetworkException, Unit>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((NetworkException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull NetworkException networkException) {
                        Intrinsics.checkParameterIsNotNull(networkException, "exception");
                        this.this$0.this$0.setMax(networkException, new Function1<Integer, Unit>(this) {
                            final /* synthetic */ AnonymousClass4 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final String getName() {
                                return "getChallenge";
                            }

                            public final KDeclarationContainer getOwner() {
                                return null;
                            }

                            public final String getSignature() {
                                return "invoke(I)V";
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                invoke(((Number) obj).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                this.this$0.this$0.invoke(i);
                            }
                        }, i, this.this$0.$error);
                    }
                });
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            } catch (Exception e2) {
                this.$error.invoke(new TwilioVerifyException(new NetworkException((Throwable) e2), TwilioVerifyException.ErrorCode.NetworkError));
            }
        }
    }

    public static final /* synthetic */ String setMax(onChanged onchanged, String str, getHeight getheight) {
        int i;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(184740806, oncanceled);
            onCancelLoad.getMin(184740806, oncanceled);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(onchanged.setMax);
        sb.append("Services/{ServiceSid}/Entities/{Identity}/Challenges/{ChallengeSid}");
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace(sb.toString(), "{ServiceSid}", getheight.setMin(), true), "{Identity}", getheight.IsOverlapping(), false, 4, (Object) null), "{ChallengeSid}", str, false, 4, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ onChanged(o.shouldReMeasureChild r10, android.content.Context r11, o.ignoreView r12, java.lang.String r13) {
        /*
            r9 = this;
            o.onItemRangeInserted r0 = new o.onItemRangeInserted
            android.content.SharedPreferences r1 = o.canRestoreState.getMax(r11)
            java.lang.String r2 = "storagePreferences(context)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.<init>(r1)
            r8 = r0
            o.RecyclerView$ItemAnimator$AdapterChanges r8 = (o.RecyclerView$ItemAnimator$AdapterChanges) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onChanged.<init>(o.shouldReMeasureChild, android.content.Context, o.ignoreView, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private onChanged(@NotNull shouldReMeasureChild shouldremeasurechild, @NotNull Context context, @NotNull ignoreView ignoreview, @NotNull String str, @NotNull RecyclerView$ItemAnimator$AdapterChanges recyclerView$ItemAnimator$AdapterChanges) {
        super(recyclerView$ItemAnimator$AdapterChanges);
        Intrinsics.checkParameterIsNotNull(shouldremeasurechild, "networkProvider");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(ignoreview, "authentication");
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(recyclerView$ItemAnimator$AdapterChanges, "dateProvider");
        this.length = shouldremeasurechild;
        this.getMax = context;
        this.getMin = ignoreview;
        this.setMax = str;
    }

    public static final /* synthetic */ String getMax(onChanged onchanged, isSmoothScrolling issmoothscrolling) {
        getHeight getheight = issmoothscrolling.getMax;
        if (getheight != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(onchanged.setMax);
            sb.append("Services/{ServiceSid}/Entities/{Identity}/Challenges/{ChallengeSid}");
            String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace(sb.toString(), "{ServiceSid}", getheight.setMin(), true), "{Identity}", getheight.IsOverlapping(), false, 4, (Object) null), "{ChallengeSid}", issmoothscrolling.getMin, false, 4, (Object) null);
            if (replace$default != null) {
                return replace$default;
            }
        }
        throw new IllegalArgumentException("ServiceSid or Identity is null or empty");
    }
}
