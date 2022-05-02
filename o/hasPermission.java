package o;

import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.MonitorWrapper;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.List;
import o.Draft;
import o.translateSingleFrame;
import okhttp3.Protocol;

public class hasPermission extends translateSingleFrame {
    public static final translateSingleFrame.length FACTORY = CreateActionSheetParam.length;
    private static final String TAG = hasPermission.class.getName();
    private final long callStartTime = System.currentTimeMillis();
    private long connectStartTime;
    private long dnsCostTime;
    private long dnsStartTime;
    private long realCallCostTime;
    private long realCallStartTime;
    private long requestCostTime;
    private long requestEndTime;
    private long requestStartTime;
    private long responseCostTime;
    private long responseEndTime;
    private long responseStartTime;
    private long secureConnectCostTime;
    private long secureConnectStartTime;
    private long sslCostTime;
    private long tcpCostTime;
    private long totalCostTime;
    private long ttfbCostTime;

    public void connectFailed(checkAlloc checkalloc, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
    }

    public void connectionAcquired(checkAlloc checkalloc, Draft.HandshakeState handshakeState) {
    }

    public void connectionReleased(checkAlloc checkalloc, Draft.HandshakeState handshakeState) {
    }

    public void requestBodyStart(checkAlloc checkalloc) {
    }

    public void responseBodyStart(checkAlloc checkalloc) {
    }

    public void responseHeadersStart(checkAlloc checkalloc) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ translateSingleFrame lambda$static$0(checkAlloc checkalloc) {
        return new hasPermission();
    }

    private hasPermission() {
    }

    public void callStart(checkAlloc checkalloc) {
        this.realCallStartTime = System.currentTimeMillis();
    }

    public void dnsStart(checkAlloc checkalloc, String str) {
        this.dnsStartTime = System.currentTimeMillis();
    }

    public void dnsEnd(checkAlloc checkalloc, String str, List<InetAddress> list) {
        this.dnsCostTime = System.currentTimeMillis() - this.dnsStartTime;
    }

    public void connectStart(checkAlloc checkalloc, InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.connectStartTime = System.currentTimeMillis();
    }

    public void secureConnectStart(checkAlloc checkalloc) {
        this.secureConnectStartTime = System.currentTimeMillis();
    }

    public void secureConnectEnd(checkAlloc checkalloc, @Nullable createBuffer createbuffer) {
        if (this.secureConnectStartTime > 0) {
            this.secureConnectCostTime = System.currentTimeMillis() - this.secureConnectStartTime;
        }
    }

    public void connectEnd(checkAlloc checkalloc, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
        long currentTimeMillis = System.currentTimeMillis();
        this.tcpCostTime = currentTimeMillis - this.connectStartTime;
        long j = this.secureConnectStartTime;
        if (j > 0) {
            this.sslCostTime = currentTimeMillis - j;
        }
    }

    public void requestHeadersStart(checkAlloc checkalloc) {
        this.requestStartTime = System.currentTimeMillis();
    }

    public void requestHeadersEnd(checkAlloc checkalloc, InvalidDataException invalidDataException) {
        long currentTimeMillis = System.currentTimeMillis();
        this.requestEndTime = currentTimeMillis;
        this.requestCostTime = currentTimeMillis - this.requestStartTime;
    }

    public void requestBodyEnd(checkAlloc checkalloc, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        this.requestEndTime = currentTimeMillis;
        this.requestCostTime = currentTimeMillis - this.requestStartTime;
    }

    public void responseHeadersEnd(checkAlloc checkalloc, InvalidHandshakeException invalidHandshakeException) {
        long currentTimeMillis = System.currentTimeMillis();
        if (invalidHandshakeException.hashCode > this.requestEndTime) {
            this.responseStartTime = invalidHandshakeException.hashCode;
        } else {
            this.responseStartTime = currentTimeMillis;
        }
        this.ttfbCostTime = invalidHandshakeException.hashCode - this.requestStartTime;
        this.responseEndTime = currentTimeMillis;
        this.responseCostTime = currentTimeMillis - this.responseStartTime;
    }

    public void responseBodyEnd(checkAlloc checkalloc, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        this.responseEndTime = currentTimeMillis;
        this.responseCostTime = currentTimeMillis - this.responseStartTime;
    }

    public void callEnd(checkAlloc checkalloc) {
        callFinished(checkalloc);
    }

    public void callFailed(checkAlloc checkalloc, IOException iOException) {
        callFinished(checkalloc);
    }

    private void callFinished(checkAlloc checkalloc) {
        long currentTimeMillis = System.currentTimeMillis();
        this.totalCostTime = currentTimeMillis - this.callStartTime;
        this.realCallCostTime = currentTimeMillis - this.realCallStartTime;
        trackEvent(checkalloc.getMin().setMin.getMax().toString());
    }

    private void trackEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put(PerformanceConstant.PERFORMANCE_TIME_COST, String.valueOf(this.totalCostTime));
        hashMap.put("realCall", String.valueOf(this.realCallCostTime));
        hashMap.put("dns", String.valueOf(this.dnsCostTime));
        hashMap.put("tls", String.valueOf(this.secureConnectCostTime));
        hashMap.put("tcp", String.valueOf(this.tcpCostTime));
        hashMap.put(RequestPermissionsEvent.REQUEST, String.valueOf(this.requestCostTime));
        hashMap.put(H5ActionJSApi.DOWNLOAD, String.valueOf(this.responseCostTime));
        hashMap.put("ttfb", String.valueOf(this.ttfbCostTime));
        hashMap.put("ssl", String.valueOf(this.sslCostTime));
        hashMap.put("requestStartTime", String.valueOf(this.requestStartTime));
        hashMap.put("requestEndTime", String.valueOf(this.requestEndTime));
        hashMap.put("responseStartTime", String.valueOf(this.responseStartTime));
        hashMap.put("responseEndTime", String.valueOf(this.responseEndTime));
        hashMap.put("skywalkerRequestType", PerformanceConstant.PERFORMANCE_REQUEST_TYPE_APHOME);
        MonitorWrapper.performance("performance", "network", hashMap);
        updateActionSheetContent.d(TAG, hashMap.toString());
    }
}
