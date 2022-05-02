package o;

import android.content.Context;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.h5event.sendmoney.CheckoutFinishEntity;
import id.dana.data.tracker.TrackerDataKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverOptionMenuEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J*\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lid/dana/data/h5event/sendmoney/CheckoutFinishEventManager;", "", "()V", "checkoutFinishCallback", "Lid/dana/data/h5event/sendmoney/CheckoutFinishCallback;", "getCheckoutFinishCallback$annotations", "getCheckoutFinishCallback", "()Lid/dana/data/h5event/sendmoney/CheckoutFinishCallback;", "setCheckoutFinishCallback", "(Lid/dana/data/h5event/sendmoney/CheckoutFinishCallback;)V", "addSplitTransactionAttribute", "", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "checkoutFinishEntity", "Lid/dana/data/h5event/sendmoney/CheckoutFinishEntity;", "saveLastTransaction", "Lid/dana/domain/account/interactor/SaveLastTransaction;", "getCompleteTransactionData", "Lorg/json/JSONObject;", "processEvent", "context", "Landroid/content/Context;", "info", "Lcom/alibaba/fastjson/JSONObject;", "track", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getIndexByPage {
    @NotNull
    public static final getIndexByPage INSTANCE = new getIndexByPage();
    @Nullable
    private static isTabPage checkoutFinishCallback;

    @JvmStatic
    public static /* synthetic */ void getCheckoutFinishCallback$annotations() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSucceed", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            updateActionSheetContent.i(DanaLogConstants.TAG.CHECKOUT, z ? "Success save last transaction" : "Failed save last transaction");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, SecurityConstants.KEY_TEXT);
            StringBuilder sb = new StringBuilder();
            sb.append(getIndexByPage.INSTANCE.getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.CHECKOUT, sb.toString(), th);
        }
    }

    private getIndexByPage() {
    }

    @Nullable
    public static final isTabPage getCheckoutFinishCallback() {
        return checkoutFinishCallback;
    }

    public static final void setCheckoutFinishCallback(@Nullable isTabPage istabpage) {
        checkoutFinishCallback = istabpage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void processEvent(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.Nullable com.alibaba.fastjson.JSONObject r5, @org.jetbrains.annotations.NotNull o.UpdateAppCallback r6, @org.jetbrains.annotations.NotNull o.GriverOptionMenuEvent r7) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "splitFacade"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "saveLastTransaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = r5.toJSONString()
            goto L_0x0018
        L_0x0017:
            r5 = r0
        L_0x0018:
            if (r5 != 0) goto L_0x001c
        L_0x001a:
            r5 = r0
            goto L_0x0030
        L_0x001c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x001a }
            r1.<init>(r5)     // Catch:{ Exception -> 0x001a }
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch:{ Exception -> 0x001a }
            r5.<init>()     // Catch:{ Exception -> 0x001a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x001a }
            java.lang.Class<id.dana.data.h5event.sendmoney.CheckoutFinishEntity> r2 = id.dana.data.h5event.sendmoney.CheckoutFinishEntity.class
            java.lang.Object r5 = r5.fromJson((java.lang.String) r1, r2)     // Catch:{ Exception -> 0x001a }
        L_0x0030:
            id.dana.data.h5event.sendmoney.CheckoutFinishEntity r5 = (id.dana.data.h5event.sendmoney.CheckoutFinishEntity) r5
            o.isTabPage r1 = checkoutFinishCallback
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            java.lang.Boolean.valueOf(r1)
            if (r5 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            java.lang.Boolean.valueOf(r2)
            o.isTabPage r1 = checkoutFinishCallback
            if (r1 == 0) goto L_0x004c
            r1.onCheckoutFinished(r5)
        L_0x004c:
            checkoutFinishCallback = r0
            o.getIndexByPage r0 = INSTANCE
            r0.track(r4, r5)
            o.getIndexByPage r4 = INSTANCE
            r4.addSplitTransactionAttribute(r6, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIndexByPage.processEvent(android.content.Context, com.alibaba.fastjson.JSONObject, o.UpdateAppCallback, o.GriverOptionMenuEvent):void");
    }

    private final void track(Context context, CheckoutFinishEntity checkoutFinishEntity) {
        if (checkoutFinishEntity != null) {
            setExtras.track(context, TrackerDataKey.Event.TRANSACTION_COMPLETE, getCompleteTransactionData(checkoutFinishEntity));
        }
    }

    private final JSONObject getCompleteTransactionData(CheckoutFinishEntity checkoutFinishEntity) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TrackerDataKey.Property.TRANS_TYPE, checkoutFinishEntity.getTransScenario());
        jSONObject.put(TrackerDataKey.Property.PROCESSING_STATUS, checkoutFinishEntity.getProcessingStatus());
        return jSONObject;
    }

    private final void addSplitTransactionAttribute(UpdateAppCallback updateAppCallback, CheckoutFinishEntity checkoutFinishEntity, GriverOptionMenuEvent griverOptionMenuEvent) {
        String transType;
        if (checkoutFinishEntity != null && (transType = checkoutFinishEntity.getTransType()) != null) {
            String currentSplitDateFormat = PrepareCallback.INSTANCE.getCurrentSplitDateFormat();
            griverOptionMenuEvent.execute(GriverOptionMenuEvent.getMin.Companion.lastTransaction(transType, currentSplitDateFormat), length.INSTANCE, setMax.INSTANCE);
            UpdateAppCallback.getMin("last_transaction_type", transType);
            UpdateAppCallback.getMin("last_transaction_date", currentSplitDateFormat);
        }
    }
}
