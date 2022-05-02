package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.split.android.client.network.HttpClient;
import io.split.android.client.network.HttpStreamRequest;
import io.split.android.client.network.HttpStreamResponse;
import io.split.android.client.service.sseclient.SseJwtToken;
import io.split.android.client.service.sseclient.sseclient.SseClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class ISimulatorDetectComponent implements SseClient {
    private static final String PUSH_NOTIFICATION_CHANNELS_PARAM = "channel";
    private static final String PUSH_NOTIFICATION_TOKEN_PARAM = "accessToken";
    private static final String PUSH_NOTIFICATION_VERSION_PARAM = "v";
    private static final String PUSH_NOTIFICATION_VERSION_VALUE = "1.1";
    private AtomicBoolean isDisconnectCalled;
    private BufferedReader mBufferedReader;
    private IPkgValidityCheckComponent mEventStreamParser;
    private final HttpClient mHttpClient;
    private HttpStreamRequest mHttpStreamRequest = null;
    private isSimulator mSseHandler;
    private AtomicInteger mStatus;
    private final showTipToast mStringHelper;
    private final URI mTargetUrl;

    @VisibleForTesting(otherwise = 2)
    public ISimulatorDetectComponent(@NonNull URI uri, @NonNull HttpClient httpClient, @NonNull IPkgValidityCheckComponent iPkgValidityCheckComponent, @NonNull isSimulator issimulator) {
        this.mTargetUrl = (URI) Preconditions.checkNotNull(uri);
        this.mHttpClient = (HttpClient) Preconditions.checkNotNull(httpClient);
        this.mEventStreamParser = (IPkgValidityCheckComponent) Preconditions.checkNotNull(iPkgValidityCheckComponent);
        this.mSseHandler = (isSimulator) Preconditions.checkNotNull(issimulator);
        this.mStatus = new AtomicInteger(2);
        this.isDisconnectCalled = new AtomicBoolean(false);
        this.mStringHelper = new showTipToast();
        this.mStatus.set(2);
    }

    public final int status() {
        return this.mStatus.get();
    }

    public final void disconnect() {
        this.isDisconnectCalled.set(true);
        close();
    }

    private void close() {
        createLoadingDialog.d("Disconnecting SSE client");
        if (this.mStatus.getAndSet(2) != 2) {
            HttpStreamRequest httpStreamRequest = this.mHttpStreamRequest;
            if (httpStreamRequest != null) {
                httpStreamRequest.close();
            }
            createLoadingDialog.d("SSE client disconnected");
        }
    }

    private void setDisconnectedStatus() {
        this.mStatus.set(2);
    }

    private void setStatus(int i) {
        this.mStatus.set(i);
    }

    public final void connect(SseJwtToken sseJwtToken, SseClient.ConnectionListener connectionListener) {
        this.isDisconnectCalled.set(false);
        this.mStatus.set(0);
        String join = this.mStringHelper.join(",", sseJwtToken.getChannels());
        String rawJwt = sseJwtToken.getRawJwt();
        this.mBufferedReader = null;
        boolean z = true;
        try {
            HttpStreamRequest streamRequest = this.mHttpClient.streamRequest(new getByteArrayDDpEx(this.mTargetUrl).addParameter("v", PUSH_NOTIFICATION_VERSION_VALUE).addParameter("channel", join).addParameter(PUSH_NOTIFICATION_TOKEN_PARAM, rawJwt).build());
            this.mHttpStreamRequest = streamRequest;
            HttpStreamResponse execute = streamRequest.execute();
            if (execute.isSuccess()) {
                BufferedReader bufferedReader = execute.getBufferedReader();
                this.mBufferedReader = bufferedReader;
                if (bufferedReader != null) {
                    createLoadingDialog.d("Streaming connection opened");
                    this.mStatus.set(1);
                    HashMap hashMap = new HashMap();
                    boolean z2 = false;
                    while (true) {
                        String readLine = this.mBufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (this.mEventStreamParser.parseLineAndAppendValue(readLine, hashMap)) {
                            if (!z2) {
                                if (!this.mEventStreamParser.isKeepAlive(hashMap)) {
                                    if (!this.mSseHandler.isConnectionConfirmed(hashMap)) {
                                        createLoadingDialog.d("Streaming error after connection");
                                        break;
                                    }
                                }
                                createLoadingDialog.d("Streaming connection success");
                                connectionListener.onConnectionSuccess();
                                z2 = true;
                            }
                            if (!this.mEventStreamParser.isKeepAlive(hashMap)) {
                                this.mSseHandler.handleIncomingMessage(hashMap);
                            }
                            hashMap = new HashMap();
                        }
                    }
                } else {
                    throw new IOException("Buffer is null");
                }
            } else {
                StringBuilder sb = new StringBuilder("Streaming connection error. Http return code ");
                sb.append(execute.getHttpStatus());
                createLoadingDialog.e(sb.toString());
                z = true ^ execute.isClientRelatedError();
            }
            if (this.isDisconnectCalled.getAndSet(false)) {
                return;
            }
        } catch (URISyntaxException e) {
            logError("An error has ocurred while creating stream Url ", e);
            if (!this.isDisconnectCalled.getAndSet(false)) {
                this.mSseHandler.handleError(false);
            } else {
                return;
            }
        } catch (IOException e2) {
            logError("An error has ocurred while parsing stream from: ", e2);
            if (this.isDisconnectCalled.getAndSet(false)) {
                return;
            }
        } catch (Exception e3) {
            logError("An unexpected error has ocurred while receiving stream events from: ", e3);
            if (this.isDisconnectCalled.getAndSet(false)) {
                return;
            }
        } catch (Throwable th) {
            if (!this.isDisconnectCalled.getAndSet(false)) {
                this.mSseHandler.handleError(true);
                close();
            }
            throw th;
        }
        this.mSseHandler.handleError(z);
        close();
    }

    private void logError(String str, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(exc.getLocalizedMessage());
        createLoadingDialog.e(sb.toString());
    }
}
