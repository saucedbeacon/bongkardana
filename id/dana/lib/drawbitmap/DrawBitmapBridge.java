package id.dana.lib.drawbitmap;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import id.dana.lib.drawbitmap.invoice.CreateInvoiceResultHandler;
import id.dana.lib.drawbitmap.invoice.InvoiceConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActionSheetRecyclerAdapter;
import o.GetAppInfoBridgeExtension;
import o.MiniProgramBridgeExtension;
import o.WindowBridgeExtension;
import o.fetchAppInfoListByKeyword;
import o.navigateToMiniProgram;
import o.registerUpdateManager;
import o.setLeftSelectedIndex;
import o.updateClientApp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\r"}, d2 = {"Lid/dana/lib/drawbitmap/DrawBitmapBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "drawBitmap", "", "event", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "handleInvoice", "Companion", "drawbitmap_release"}, k = 1, mv = {1, 1, 16})
public final class DrawBitmapBridge extends SimpleBridgeExtension {
    public static final length Companion = new length((DefaultConstructorMarker) null);
    @NotNull
    public static final String JSAPI_ACTION = "drawBitmap";
    private static final int MINIMUM_STORAGE_AVAILABLE = 100;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release", "id/dana/lib/gcontainer/extension/JSONExtKt$toObjectList$$inlined$toObject$1"}, k = 1, mv = {1, 1, 16})
    public static final class IsOverlapping extends TypeReference<navigateToMiniProgram> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 1, 16})
    public static final class getMax extends TypeReference<fetchAppInfoListByKeyword> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 1, 16})
    public static final class getMin extends TypeReference<updateClientApp> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 1, 16})
    public static final class setMax extends TypeReference<MiniProgramBridgeExtension> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 1, 16})
    public static final class setMin extends TypeReference<GetAppInfoBridgeExtension.AnonymousClass2> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release", "id/dana/lib/gcontainer/extension/JSONExtKt$toObjectList$$inlined$toObject$1"}, k = 1, mv = {1, 1, 16})
    public static final class toFloatRange extends TypeReference<registerUpdateManager> {
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void drawBitmap(@Nullable @BindingParam(name = {"event"}) String str, @Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkParameterIsNotNull(bridgeCallback, "bridgeCallback");
        if (!Intrinsics.areEqual((Object) str, (Object) DrawBitmapEvent.INVOICE)) {
            return;
        }
        if (setLeftSelectedIndex.length() <= 100) {
            bridgeCallback.sendJSONResponse(GetAppInfoBridgeExtension.AnonymousClass1.getErrorResult(DrawBitmapResultType.RUN_OUT_OF_STORAGE));
        } else {
            handleInvoice(jSONObject, bridgeCallback);
        }
    }

    private final void handleInvoice(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        String str;
        fetchAppInfoListByKeyword fetchappinfolistbykeyword;
        GetAppInfoBridgeExtension.AnonymousClass2 r3;
        updateClientApp updateclientapp;
        MiniProgramBridgeExtension miniProgramBridgeExtension;
        List list;
        JSONArray jSONArray;
        Object obj;
        JSONArray jSONArray2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax setmax = new ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax(WindowBridgeExtension.AnonymousClass1.getMax());
        List list2 = null;
        if (jSONObject != null) {
            str = jSONObject.getString("pageTitle");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax pageTitle = setmax.setPageTitle(str);
        if (jSONObject != null) {
            try {
                obj6 = JSONObject.parseObject(jSONObject.getJSONObject(InvoiceConstant.HEADER).toJSONString(), new getMax(), new Feature[0]);
            } catch (JSONException | NullPointerException unused) {
                obj6 = null;
            }
            fetchappinfolistbykeyword = (fetchAppInfoListByKeyword) obj6;
        } else {
            fetchappinfolistbykeyword = null;
        }
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax headerEntity = pageTitle.setHeaderEntity(fetchappinfolistbykeyword);
        if (jSONObject != null) {
            try {
                obj5 = JSONObject.parseObject(jSONObject.getJSONObject(InvoiceConstant.ORDER_DETAIL).toJSONString(), new setMin(), new Feature[0]);
            } catch (JSONException | NullPointerException unused2) {
                obj5 = null;
            }
            r3 = (GetAppInfoBridgeExtension.AnonymousClass2) obj5;
        } else {
            r3 = null;
        }
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax orderDetailEntity = headerEntity.setOrderDetailEntity(r3);
        if (jSONObject != null) {
            try {
                obj4 = JSONObject.parseObject(jSONObject.getJSONObject(InvoiceConstant.PAYMENT_METHOD).toJSONString(), new getMin(), new Feature[0]);
            } catch (JSONException | NullPointerException unused3) {
                obj4 = null;
            }
            updateclientapp = (updateClientApp) obj4;
        } else {
            updateclientapp = null;
        }
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax paymentMethodEntity = orderDetailEntity.setPaymentMethodEntity(updateclientapp);
        if (jSONObject != null) {
            try {
                obj3 = JSONObject.parseObject(jSONObject.getJSONObject(InvoiceConstant.SUMMARY).toJSONString(), new setMax(), new Feature[0]);
            } catch (JSONException | NullPointerException unused4) {
                obj3 = null;
            }
            miniProgramBridgeExtension = (MiniProgramBridgeExtension) obj3;
        } else {
            miniProgramBridgeExtension = null;
        }
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax summaryEntity = paymentMethodEntity.setSummaryEntity(miniProgramBridgeExtension);
        if (jSONObject == null || (jSONArray2 = jSONObject.getJSONArray(InvoiceConstant.TRANSACTION_DETAIL)) == null) {
            list = null;
        } else {
            try {
                list = new ArrayList();
                int size = jSONArray2.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    if (jSONObject2 != null) {
                        try {
                            obj2 = JSONObject.parseObject(jSONObject2.toJSONString(), new IsOverlapping(), new Feature[0]);
                        } catch (JSONException | NullPointerException unused5) {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            list.add(obj2);
                        }
                    }
                }
            } catch (JSONException unused6) {
                list = CollectionsKt.emptyList();
            }
        }
        ActionSheetRecyclerAdapter.ActionSheetViewHolder.setMax transactionDetailEntity = summaryEntity.setTransactionDetailEntity(list);
        if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray(InvoiceConstant.PRICE_DETAIL)) == null)) {
            try {
                List arrayList = new ArrayList();
                int size2 = jSONArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    if (jSONObject3 != null) {
                        try {
                            obj = JSONObject.parseObject(jSONObject3.toJSONString(), new toFloatRange(), new Feature[0]);
                        } catch (JSONException | NullPointerException unused7) {
                            obj = null;
                        }
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    }
                }
                list2 = arrayList;
            } catch (JSONException unused8) {
                list2 = CollectionsKt.emptyList();
            }
        }
        transactionDetailEntity.setPriceDetailEntity(list2).setResultHandler(new isInside(bridgeCallback)).build().draw();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/lib/drawbitmap/DrawBitmapBridge$handleInvoice$1", "Lid/dana/lib/drawbitmap/invoice/CreateInvoiceResultHandler;", "onError", "", "e", "", "onResult", "filePath", "", "drawbitmap_release"}, k = 1, mv = {1, 1, 16})
    public static final class isInside implements CreateInvoiceResultHandler {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        isInside(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onResult(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "filePath");
            this.$bridgeCallback.sendJSONResponse(GetAppInfoBridgeExtension.AnonymousClass1.getSuccessResult(str));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            this.$bridgeCallback.sendJSONResponse(GetAppInfoBridgeExtension.AnonymousClass1.getGeneralErrorResult());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/lib/drawbitmap/DrawBitmapBridge$Companion;", "", "()V", "JSAPI_ACTION", "", "MINIMUM_STORAGE_AVAILABLE", "", "drawbitmap_release"}, k = 1, mv = {1, 1, 16})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
