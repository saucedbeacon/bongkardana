package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0003J\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0003J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0003J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/globalnetworkproxy/mapper/GlobalNetworkProxyMapper;", "", "()V", "AC_USER_ID_KEY", "", "HTTP_STATUS_CODE_SUCCESS", "", "MGW_TRACE_ID_KEY", "RESULT_MESSAGE_KEY", "RESULT_STATUS_KEY", "SERVER_TIME_KEY", "STATUS_KEY", "SUCCESS_STATUS", "convertDataToByte", "", "data", "convertHeaderToMap", "", "", "header", "getMessageFromResult", "result", "getStatusCodeFromResult", "transform", "Lcom/iap/ac/android/common/rpc/model/HttpResponse;", "gnConsultInfo", "Lid/dana/domain/globalnetwork/model/GnConsultInfo;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setEventManifests {
    @NotNull
    public static final setEventManifests setMin = new setEventManifests();

    private setEventManifests() {
    }

    @JvmStatic
    @NotNull
    public static final HttpResponse setMin(@NotNull ReceivedTitlePoint receivedTitlePoint) {
        Intrinsics.checkNotNullParameter(receivedTitlePoint, "gnConsultInfo");
        int i = Intrinsics.areEqual((Object) JSON.parseObject(receivedTitlePoint.getResult()).getString("resultStatus"), (Object) "S") ? 200 : 0;
        String string = JSON.parseObject(receivedTitlePoint.getResult()).getString("resultMessage");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(RESULT_MESSAGE_KEY)");
        byte[] min = setMin(receivedTitlePoint.getSdkResponseData());
        String sdkResponseHeader = receivedTitlePoint.getSdkResponseHeader();
        Map linkedHashMap = new LinkedHashMap();
        JSONObject parseObject = JSON.parseObject(sdkResponseHeader);
        List singletonList = Collections.singletonList(parseObject.getString("Server-Time"));
        Intrinsics.checkNotNullExpressionValue(singletonList, "Collections.singletonLis…tString(SERVER_TIME_KEY))");
        linkedHashMap.put("Server-Time", singletonList);
        List singletonList2 = Collections.singletonList(parseObject.getString("Mgw-TraceId"));
        Intrinsics.checkNotNullExpressionValue(singletonList2, "Collections.singletonLis…String(MGW_TRACE_ID_KEY))");
        linkedHashMap.put("Mgw-TraceId", singletonList2);
        List singletonList3 = Collections.singletonList(parseObject.getString("Ac-UserId"));
        Intrinsics.checkNotNullExpressionValue(singletonList3, "Collections.singletonLis…etString(AC_USER_ID_KEY))");
        linkedHashMap.put("Ac-UserId", singletonList3);
        List singletonList4 = Collections.singletonList(parseObject.getString(HeaderConstant.HEADER_KEY_RESULT_STATUS));
        Intrinsics.checkNotNullExpressionValue(singletonList4, "Collections.singletonLis…ct.getString(STATUS_KEY))");
        linkedHashMap.put(HeaderConstant.HEADER_KEY_RESULT_STATUS, singletonList4);
        return new HttpResponse(i, string, min, linkedHashMap);
    }

    @JvmStatic
    private static final byte[] setMin(String str) {
        String obj = JSON.toJSON(str).toString();
        Charset charset = Charsets.UTF_8;
        if (obj != null) {
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
