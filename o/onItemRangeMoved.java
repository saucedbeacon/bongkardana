package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.networking.HttpMethod;
import com.twilio.verify.networking.NetworkException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import o.scrapOrRecycleView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJE\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0012J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J0\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0012J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002JM\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0012J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002JM\u0010&\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0012J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\u0006\u0010'\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/twilio/verify/api/FactorAPIClient;", "Lcom/twilio/verify/api/BaseAPIClient;", "networkProvider", "Lcom/twilio/verify/networking/NetworkProvider;", "context", "Landroid/content/Context;", "authentication", "Lcom/twilio/verify/networking/Authentication;", "baseUrl", "", "dateProvider", "Lcom/twilio/verify/data/DateProvider;", "(Lcom/twilio/verify/networking/NetworkProvider;Landroid/content/Context;Lcom/twilio/verify/networking/Authentication;Ljava/lang/String;Lcom/twilio/verify/data/DateProvider;)V", "create", "", "createFactorPayload", "Lcom/twilio/verify/domain/factor/models/CreateFactorPayload;", "success", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "error", "Lcom/twilio/verify/TwilioVerifyException;", "createFactorBody", "", "createFactorURL", "delete", "factor", "Lcom/twilio/verify/models/Factor;", "Lkotlin/Function0;", "deleteFactorURL", "update", "updateFactorPayload", "Lcom/twilio/verify/domain/factor/models/UpdateFactorPayload;", "updateFactorBody", "updateFactorURL", "verify", "authPayload", "verifyFactorBody", "verifyFactorURL", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class onItemRangeMoved extends notifyItemRangeRemoved {
    public final shouldReMeasureChild getMax;
    /* access modifiers changed from: private */
    public final ignoreView getMin;
    public final Context length;
    public final String setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateFactor", "", "retries", "", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ getHeight $factor;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ detachViewInternal $updateFactorPayload;
        final /* synthetic */ onItemRangeMoved this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(onItemRangeMoved onitemrangemoved, getHeight getheight, detachViewInternal detachviewinternal, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = onitemrangemoved;
            this.$factor = getheight;
            this.$updateFactorPayload = detachviewinternal;
            this.$success = function1;
            this.$error = function12;
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
                scrapOrRecycleView.setMin setmin = new scrapOrRecycleView.setMin(new isMeasurementCacheEnabled(this.this$0.length, new getPaddingEnd("token", this.this$0.getMin.setMax(this.$factor))), onItemRangeMoved.setMin(this.this$0, this.$factor));
                HttpMethod httpMethod = HttpMethod.Post;
                Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
                setmin.setMin = httpMethod;
                scrapOrRecycleView.setMin setmin2 = setmin;
                Map<String, ? extends Object> min = onItemRangeMoved.getMin(this.$updateFactorPayload);
                Intrinsics.checkParameterIsNotNull(min, TtmlNode.TAG_BODY);
                setmin2.getMax = min;
                this.this$0.getMax.getMin(setmin2.length(), new Function1<removeAndRecycleScrapInt, Unit>(this) {
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
                        this.this$0.$success.invoke(new JSONObject(removeandrecyclescrapint.getMin));
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
                            final /* synthetic */ AnonymousClass3 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final String getName() {
                                return "updateFactor";
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "exception", "Lcom/twilio/verify/networking/NetworkException;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMin extends Lambda implements Function1<NetworkException, Unit> {
        final /* synthetic */ Function1 $error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(Function1 function1) {
            super(1);
            this.$error = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NetworkException) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull NetworkException networkException) {
            Intrinsics.checkParameterIsNotNull(networkException, "exception");
            this.$error.invoke(new TwilioVerifyException(networkException, TwilioVerifyException.ErrorCode.NetworkError));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"verifyFactor", "", "retries", "", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class setMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ String $authPayload;
        final /* synthetic */ Function1 $error;
        final /* synthetic */ getHeight $factor;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ onItemRangeMoved this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(onItemRangeMoved onitemrangemoved, getHeight getheight, String str, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = onitemrangemoved;
            this.$factor = getheight;
            this.$authPayload = str;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void invoke$default(setMax setmax, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            setmax.invoke(i);
        }

        public final void invoke(final int i) {
            try {
                scrapOrRecycleView.setMin setmin = new scrapOrRecycleView.setMin(new isMeasurementCacheEnabled(this.this$0.length, new getPaddingEnd("token", this.this$0.getMin.setMax(this.$factor))), onItemRangeMoved.length(this.this$0, this.$factor));
                HttpMethod httpMethod = HttpMethod.Post;
                Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
                setmin.setMin = httpMethod;
                scrapOrRecycleView.setMin setmin2 = setmin;
                Map<String, ? extends Object> min = MapsKt.mapOf(TuplesKt.to("AuthPayload", this.$authPayload));
                Intrinsics.checkParameterIsNotNull(min, TtmlNode.TAG_BODY);
                setmin2.getMax = min;
                this.this$0.getMax.getMin(setmin2.length(), new Function1<removeAndRecycleScrapInt, Unit>(this) {
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((removeAndRecycleScrapInt) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull removeAndRecycleScrapInt removeandrecyclescrapint) {
                        Intrinsics.checkParameterIsNotNull(removeandrecyclescrapint, "it");
                        this.this$0.$success.invoke(new JSONObject(removeandrecyclescrapint.getMin));
                    }
                }, new Function1<NetworkException, Unit>(this) {
                    final /* synthetic */ setMax this$0;

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
                            final /* synthetic */ AnonymousClass5 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final String getName() {
                                return "verifyFactor";
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/twilio/verify/networking/Response;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class setMin extends Lambda implements Function1<removeAndRecycleScrapInt, Unit> {
        final /* synthetic */ Function1 $success;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(Function1 function1) {
            super(1);
            this.$success = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((removeAndRecycleScrapInt) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull removeAndRecycleScrapInt removeandrecyclescrapint) {
            Intrinsics.checkParameterIsNotNull(removeandrecyclescrapint, "it");
            this.$success.invoke(new JSONObject(removeandrecyclescrapint.getMin));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ onItemRangeMoved(o.shouldReMeasureChild r10, android.content.Context r11, o.ignoreView r12, java.lang.String r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: o.onItemRangeMoved.<init>(o.shouldReMeasureChild, android.content.Context, o.ignoreView, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private onItemRangeMoved(@NotNull shouldReMeasureChild shouldremeasurechild, @NotNull Context context, @NotNull ignoreView ignoreview, @NotNull String str, @NotNull RecyclerView$ItemAnimator$AdapterChanges recyclerView$ItemAnimator$AdapterChanges) {
        super(recyclerView$ItemAnimator$AdapterChanges);
        Intrinsics.checkParameterIsNotNull(shouldremeasurechild, "networkProvider");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(ignoreview, "authentication");
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(recyclerView$ItemAnimator$AdapterChanges, "dateProvider");
        this.getMax = shouldremeasurechild;
        this.length = context;
        this.getMin = ignoreview;
        this.setMax = str;
    }

    public static Map<String, String> length(attachView attachview) {
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("FriendlyName", attachview.length), TuplesKt.to("FactorType", attachview.setMax.getFactorTypeName()));
        Map<String, String> map = attachview.equals;
        Collection arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            StringBuilder sb = new StringBuilder("Binding.");
            sb.append((String) next.getKey());
            arrayList.add(TuplesKt.to(sb.toString(), next.getValue()));
        }
        MapsKt.putAll(mutableMapOf, (List) arrayList);
        Map<String, String> map2 = attachview.setMin;
        Collection arrayList2 = new ArrayList(map2.size());
        for (Map.Entry next2 : map2.entrySet()) {
            StringBuilder sb2 = new StringBuilder("Config.");
            sb2.append((String) next2.getKey());
            arrayList2.add(TuplesKt.to(sb2.toString(), next2.getValue()));
        }
        MapsKt.putAll(mutableMapOf, (List) arrayList2);
        return mutableMapOf;
    }

    public static final /* synthetic */ String length(onItemRangeMoved onitemrangemoved, getHeight getheight) {
        StringBuilder sb = new StringBuilder();
        sb.append(onitemrangemoved.setMax);
        sb.append("Services/{ServiceSid}/Entities/{Identity}/Factors/{FactorSid}");
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace(sb.toString(), "{ServiceSid}", getheight.setMin(), true), "{Identity}", getheight.IsOverlapping(), false, 4, (Object) null), "{FactorSid}", getheight.getMin(), false, 4, (Object) null);
    }

    public static final /* synthetic */ String setMin(onItemRangeMoved onitemrangemoved, getHeight getheight) {
        StringBuilder sb = new StringBuilder();
        sb.append(onitemrangemoved.setMax);
        sb.append("Services/{ServiceSid}/Entities/{Identity}/Factors/{FactorSid}");
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace(sb.toString(), "{ServiceSid}", getheight.setMin(), true), "{Identity}", getheight.IsOverlapping(), false, 4, (Object) null), "{FactorSid}", getheight.getMin(), false, 4, (Object) null);
    }

    public static final /* synthetic */ Map getMin(detachViewInternal detachviewinternal) {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("FriendlyName", detachviewinternal.setMax));
        Map<String, String> map = detachviewinternal.getMin;
        Collection arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            StringBuilder sb = new StringBuilder("Config.");
            sb.append((String) next.getKey());
            arrayList.add(TuplesKt.to(sb.toString(), next.getValue()));
        }
        MapsKt.putAll(mutableMapOf, (List) arrayList);
        return mutableMapOf;
    }
}
