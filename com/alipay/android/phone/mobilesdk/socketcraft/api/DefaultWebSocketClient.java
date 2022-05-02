package com.alipay.android.phone.mobilesdk.socketcraft.api;

import com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorHelper;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import id.dana.myprofile.SettingMoreProfileActivity;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

public class DefaultWebSocketClient extends WebSocketClient {
    public static final int DEFAULT_CONNECTION_TIMEOUT = 60000;
    public static final int MIN_CONNECTION_TIMEOUT = 4000;
    private static final String TAG = "WebSocketClient";
    private long connectTimeout;
    private Framedata firstFragmentFrame;
    private MonitorHelper monitorHelper;
    private boolean myselfClosed;
    private ScheduledFuture<?> timeoutScheduleFuture;
    private String url;
    private WebSocketCallback webSocketCallback;
    private WebSocketContext webSocketContext;

    public DefaultWebSocketClient(URI uri, Draft draft, Map<String, String> map, int i, WebSocketCallback webSocketCallback2, WebSocketContext webSocketContext2) {
        super(uri, draft, map, i);
        this.myselfClosed = false;
        this.webSocketCallback = webSocketCallback2;
        this.url = uri.toString();
        this.webSocketContext = webSocketContext2;
        if (i > 4000) {
            this.connectTimeout = (long) i;
        } else {
            this.connectTimeout = SettingMoreProfileActivity.TOAST_DURATION;
        }
        this.monitorHelper = new MonitorHelper(this);
    }

    public DefaultWebSocketClient(URI uri, Draft draft, Map<String, String> map, int i, WebSocketCallback webSocketCallback2) {
        this(uri, draft, map, i, webSocketCallback2, new BasicWebSocketContext());
    }

    public DefaultWebSocketClient(URI uri, Map<String, String> map, WebSocketCallback webSocketCallback2) {
        this(uri, new Draft_17(), map, 60000, webSocketCallback2);
    }

    public DefaultWebSocketClient(URI uri, Map<String, String> map, WebSocketCallback webSocketCallback2, WebSocketContext webSocketContext2) {
        this(uri, new Draft_17(), map, 60000, webSocketCallback2, webSocketContext2);
    }

    public void connectBlockingWithSSL() {
        setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        connectBlocking();
    }

    public boolean connectBlocking() {
        beforeConnect();
        return super.connectBlocking();
    }

    public void connectWithSSL() {
        setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        connect();
    }

    public void connect() {
        beforeConnect();
        super.connect();
        startConnectionTimer();
    }

    public void send(String str) {
        if (str == null) {
            SCLogCatUtil.warn(TAG, "[send] text is null");
            return;
        }
        if (str.length() <= 0) {
            SCLogCatUtil.warn(TAG, "[send] text is empty, but continue send.");
        }
        super.send(str);
        this.monitorHelper.recordMonitorOfSndMsg(str.length());
        this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), DataflowMonitorModel.METHOD_NAME_SEND, str.length(), 0));
    }

    public void send(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            SCLogCatUtil.warn(TAG, "[send] byte[] is null or length <= 0.");
            return;
        }
        super.send(bArr);
        this.monitorHelper.recordMonitorOfSndMsg(bArr.length);
        this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), DataflowMonitorModel.METHOD_NAME_SEND, bArr.length, 0));
    }

    public void send(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.array().length <= 0) {
            SCLogCatUtil.warn(TAG, "[send] ByteBuffer is null or length <= 0.");
            return;
        }
        super.send(byteBuffer);
        this.monitorHelper.recordMonitorOfSndMsg(byteBuffer.array().length);
        this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), DataflowMonitorModel.METHOD_NAME_SEND, byteBuffer.array().length, 0));
    }

    public void onDns(String str, long j) {
        this.monitorHelper.recordDnsTime(j);
        this.monitorHelper.recordTargetHost(str);
    }

    public void onTcpConnect(String str, long j) {
        this.monitorHelper.recordTcpTime(j);
        this.monitorHelper.recordTargetHost(str);
    }

    public void onSSLHandshake(long j) {
        this.monitorHelper.recordSSLTime(j);
    }

    public void onWsHandshake(long j) {
        SCLogCatUtil.info(TAG, "onWsHandshake cost: ".concat(String.valueOf(j)));
        this.monitorHelper.recordWsHsTime(j);
    }

    public void onOpen(ServerHandshake serverHandshake) {
        afterConnect();
        cancelTimeoutScheduleFuture();
        SCLogCatUtil.info(TAG, String.format("onOpen. url is %s , state: opened", new Object[]{this.url}));
        this.webSocketCallback.onSocketOpen();
        this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), DataflowMonitorModel.METHOD_NAME_CONNECTION, this.url.length() + 189, WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
    }

    public void onMessage(String str) {
        Object[] objArr = new Object[2];
        objArr[0] = this.url;
        objArr[1] = Integer.valueOf(str != null ? str.length() : -1);
        SCLogCatUtil.info(TAG, String.format("onMessage. url is %s ,socket onmessage length :%d", objArr));
        if (str != null && str.length() > 0) {
            this.webSocketCallback.onSocketMessage(str);
            this.monitorHelper.recordMonitorOfRecvMsg(str.length());
            this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), DataflowMonitorModel.METHOD_NAME_RECEIVE, 0, str.length()));
        }
    }

    public void onMessage(ByteBuffer byteBuffer) {
        Object[] objArr = new Object[2];
        objArr[0] = this.url;
        objArr[1] = Integer.valueOf(byteBuffer != null ? byteBuffer.position() : -1);
        SCLogCatUtil.info(TAG, String.format("onMessage. url is %s , socket onMessage buffer length : %d", objArr));
        if (byteBuffer != null) {
            this.webSocketCallback.onSocketMessage(byteBuffer);
            this.monitorHelper.recordMonitorOfRecvMsg(byteBuffer.position());
            this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), DataflowMonitorModel.METHOD_NAME_RECEIVE, 0, byteBuffer.array().length));
        }
    }

    public void onClose(int i, String str, boolean z) {
        cancelTimeoutScheduleFuture();
        SCLogCatUtil.info(TAG, String.format("onClose. url is %s ,state: closed ,reason: %s, errCode = %d, remote = %s", new Object[]{this.url, str, Integer.valueOf(i), Boolean.toString(z)}));
        if (this.myselfClosed || !(i == -1 || i == -2 || i == -3)) {
            this.webSocketCallback.onSocketClose();
        } else {
            onError(str);
        }
        this.monitorHelper.printDisconnMonitorLog();
        this.monitorHelper.noteTraficConsume(new DataflowMonitorModel(this.url, getBizUniqId(), "close", 0, 0));
    }

    public void onError(Exception exc) {
        SCLogCatUtil.error(TAG, String.format("onError. url is %s ,error is %s", new Object[]{this.url, exc.toString()}), exc);
        StringBuilder sb = new StringBuilder("exception: ");
        sb.append(exc.getMessage());
        onSocketError(sb.toString());
    }

    public void onError(String str) {
        SCLogCatUtil.error(TAG, String.format("onError. url is %s ,error is %s", new Object[]{this.url, str}));
        onSocketError(str);
    }

    public void onSocketError(String str) {
        this.webSocketCallback.onSocketError(str);
        this.monitorHelper.printErrorMonitorLog("1", str);
    }

    public void onFragment(Framedata framedata) {
        Framedata framedata2;
        if (framedata.getOpcode() != Framedata.Opcode.CONTINUOUS && !framedata.isFin()) {
            this.firstFragmentFrame = framedata;
        } else if (framedata.getOpcode() == Framedata.Opcode.CONTINUOUS && (framedata2 = this.firstFragmentFrame) != null) {
            if (framedata2.getPayloadData().position() > 10485760) {
                SCLogCatUtil.warn(TAG, "onFragment. Pending frame exploded");
                onError(new RuntimeException(WsMessageConstants.MSG_PENDING_FRAME_EXPLODED));
                close();
                this.firstFragmentFrame = null;
                return;
            }
            try {
                this.firstFragmentFrame.append(framedata);
            } catch (Throwable th) {
                SCLogCatUtil.warn(TAG, "onFragment. append frame err. ", th);
            }
            if (framedata.isFin()) {
                if (this.firstFragmentFrame.getOpcode() == Framedata.Opcode.BINARY) {
                    onMessage(this.firstFragmentFrame.getPayloadData());
                } else if (this.firstFragmentFrame.getOpcode() == Framedata.Opcode.TEXT) {
                    try {
                        String stringUtf8 = Charsetfunctions.stringUtf8(this.firstFragmentFrame.getPayloadData());
                        if (stringUtf8 == null) {
                            stringUtf8 = "";
                        }
                        onMessage(stringUtf8);
                    } catch (Throwable th2) {
                        SCLogCatUtil.warn(TAG, "onFragment. ByteBuffer to String err ", th2);
                    }
                }
                this.firstFragmentFrame = null;
            }
        }
    }

    public void close() {
        try {
            SCLogCatUtil.info(TAG, "close. try to close socket");
            this.myselfClosed = true;
            super.close();
        } catch (Throwable th) {
            SCLogCatUtil.error(TAG, "send err. ", th);
        }
    }

    public void close(int i, String str) {
        try {
            SCLogCatUtil.info(TAG, "close. try to close socket");
            this.myselfClosed = true;
            super.close(i, str);
        } catch (Throwable th) {
            SCLogCatUtil.error(TAG, "send err. ", th);
        }
    }

    private void startConnectionTimer() {
        cancelTimeoutScheduleFuture();
        this.timeoutScheduleFuture = SCNetworkAsyncTaskUtil.schedule((Runnable) new SCConnectionTimerRunnable(this, this.webSocketCallback), this.connectTimeout, TimeUnit.MILLISECONDS);
    }

    private void cancelTimeoutScheduleFuture() {
        try {
            SCLogCatUtil.info(TAG, "cancelTimeoutScheduleFuture. try to stop connectTimer");
            if (this.timeoutScheduleFuture != null) {
                this.timeoutScheduleFuture.cancel(true);
                this.timeoutScheduleFuture = null;
            }
        } catch (Throwable th) {
            SCLogCatUtil.error(TAG, "cancelTimeoutScheduleFuture. Cancel old timeoutScheduleFuture error", th);
        }
    }

    public WebSocketContext getWebSocketContext() {
        WebSocketContext webSocketContext2 = this.webSocketContext;
        if (webSocketContext2 != null) {
            return webSocketContext2;
        }
        synchronized (this) {
            if (this.webSocketContext != null) {
                WebSocketContext webSocketContext3 = this.webSocketContext;
                return webSocketContext3;
            }
            BasicWebSocketContext basicWebSocketContext = new BasicWebSocketContext();
            this.webSocketContext = basicWebSocketContext;
            return basicWebSocketContext;
        }
    }

    public void setWebSocketContext(WebSocketContext webSocketContext2) {
        this.webSocketContext = webSocketContext2;
    }

    public WebSocketCallback getWebSocketCallback() {
        return this.webSocketCallback;
    }

    public String getUrl() {
        return this.url;
    }

    public String getBizUniqId() {
        Object attribute = getWebSocketContext().getAttribute(WSContextConstant.BIZ_UNIQUE_ID);
        return (attribute == null || !(attribute instanceof String)) ? "unkown" : String.valueOf(attribute);
    }

    private void beforeConnect() {
        SCLogCatUtil.info(TAG, "enter beforeConnect");
        this.monitorHelper.recordStartConnAllTime();
    }

    private void afterConnect() {
        SCLogCatUtil.info(TAG, "enter afterConnect");
        this.monitorHelper.recordConnectedTime();
        this.monitorHelper.printConnMonitorLog();
    }

    class SCConnectionTimerRunnable implements Runnable {
        private static final String TAG = "SCConnectionTimerRunnable";
        private DefaultWebSocketClient defaultWebSocketClient;
        public WebSocketCallback webSocketCallback;

        SCConnectionTimerRunnable(DefaultWebSocketClient defaultWebSocketClient2, WebSocketCallback webSocketCallback2) {
            this.defaultWebSocketClient = defaultWebSocketClient2;
            this.webSocketCallback = webSocketCallback2;
        }

        public void run() {
            SCLogCatUtil.error(TAG, "connect response time out");
            try {
                DefaultWebSocketClient.this.onError(WsMessageConstants.MSG_CONNECTION_TIME_OUT);
            } catch (Throwable th) {
                SCLogCatUtil.error(TAG, "onSocketError error", th);
            }
            try {
                this.defaultWebSocketClient.close();
            } catch (Throwable th2) {
                SCLogCatUtil.error(TAG, "close socket error", th2);
            }
        }
    }
}
