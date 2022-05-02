package o;

import android.text.TextUtils;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.GriverProgressBar;
import o.b;

@Singleton
public final class RemoteCallbackPool {
    private static final Object setMax = new Object();
    private AtomicInteger equals = new AtomicInteger(0);
    private boolean getMax;
    private final BackKeyDownPoint getMin;
    private boolean length = false;
    private final b.AnonymousClass3 setMin;
    private boolean toIntRange;

    interface getMin {
        void setMax(boolean z);
    }

    @Inject
    public RemoteCallbackPool(b.AnonymousClass3 r3, BackKeyDownPoint backKeyDownPoint) {
        this.setMin = r3;
        this.getMin = backKeyDownPoint;
    }

    public final HttpResponse setMax(onScroll onscroll, HttpRequest httpRequest, HttpResponse httpResponse) {
        StringBuilder sb = new StringBuilder("interceptResponse--> ");
        sb.append(httpRequest);
        sb.append("  \t | ");
        sb.append(httpResponse);
        sb.append("\t statusCode: ");
        sb.append(httpResponse.getStatusCode());
        updateActionSheetContent.d("HttpSessionInterceptor", sb.toString());
        if (httpResponse.getStatusCode() == 401) {
            this.equals.incrementAndGet();
            synchronized (setMax) {
                this.length = false;
                while (!this.getMax && !this.length) {
                    length("requestCount: ");
                    if (!this.toIntRange) {
                        this.toIntRange = true;
                        final SendToRenderCallback sendToRenderCallback = new SendToRenderCallback(this);
                        this.setMin.createData("network").holdLogin(getBadgeList.getUserId(this.getMin, ""), getBadgeList.getClientKey(this.getMin, "")).doOnNext(new RemoteBridgeExtensionInvoker(this)).doOnNext(JsAPICallStore.length).subscribe(new GriverProgressBar<com_alibaba_ariver_app_api_ExtOpt$69$1>() {
                            public final void onComplete() {
                            }

                            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                            }

                            public final /* synthetic */ void onNext(Object obj) {
                                com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1 = (com_alibaba_ariver_app_api_ExtOpt$69$1) obj;
                                getMin getmin = sendToRenderCallback;
                                if (getmin != null) {
                                    getmin.setMax(com_alibaba_ariver_app_api_extopt_69_1.success);
                                }
                            }

                            public final void onError(Throwable th) {
                                getMin getmin = sendToRenderCallback;
                                if (getmin != null) {
                                    getmin.setMax(false);
                                }
                            }
                        });
                    }
                    try {
                        setMax.wait(100);
                    } catch (Exception e) {
                        updateActionSheetContent.e("HttpSessionInterceptor", "HoldLogin", e);
                        throw e;
                    } catch (InterruptedException e2) {
                        updateActionSheetContent.e("HttpSessionInterceptor", "InterruptedException", e2);
                        Thread.currentThread().interrupt();
                    } catch (Throwable th) {
                        if (this.equals.decrementAndGet() == 0) {
                            this.getMax = false;
                            this.toIntRange = false;
                        }
                        throw th;
                    }
                }
                httpResponse = setMin(onscroll, httpRequest, httpResponse);
                if (this.equals.decrementAndGet() == 0) {
                    this.getMax = false;
                    this.toIntRange = false;
                }
            }
        }
        return httpResponse;
    }

    private HttpResponse setMin(onScroll onscroll, HttpRequest httpRequest, HttpResponse httpResponse) {
        synchronized (setMax) {
            if (this.getMax) {
                length("retry!!!! requestCount: ");
                httpResponse = onscroll.performRequest(httpRequest);
            } else {
                StringBuilder sb = new StringBuilder("holdLogin fail after session expired in aphome\t requestCount: ");
                sb.append(this.equals.get());
                sb.append("\tjumpOut: ");
                sb.append(this.length);
                sb.append("\tloginSuc: ");
                sb.append(this.getMax);
                sb.append("\tloginBegin: ");
                sb.append(this.toIntRange);
                updateActionSheetContent.exception(DanaLogConstants.BizType.H5APHOME_REQUEST, DanaLogConstants.ExceptionType.APHOME_HOLDLOGIN_FAIL_EXCEPTION, sb.toString());
            }
        }
        return httpResponse;
    }

    private void length(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.equals.get());
        sb.append("\tjumpOut: ");
        sb.append(this.length);
        sb.append("\tloginSuc: ");
        sb.append(this.getMax);
        sb.append("\tloginBegin: ");
        sb.append(this.toIntRange);
        updateActionSheetContent.d("HttpSessionInterceptor", sb.toString());
    }

    static /* synthetic */ void setMin(RemoteCallbackPool remoteCallbackPool, com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) {
        if (com_alibaba_ariver_app_api_extopt_69_1.success && !b.AnonymousClass12.isNeedChallenge(com_alibaba_ariver_app_api_extopt_69_1.verificationMethods) && !TextUtils.isEmpty(com_alibaba_ariver_app_api_extopt_69_1.clientKey)) {
            getBadgeList.setClientKey(remoteCallbackPool.getMin, com_alibaba_ariver_app_api_extopt_69_1.clientKey);
        }
    }

    static /* synthetic */ void setMin(com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) {
        if (com_alibaba_ariver_app_api_extopt_69_1.success && !b.AnonymousClass12.isNeedChallenge(com_alibaba_ariver_app_api_extopt_69_1.verificationMethods)) {
            IAPLoginUserInfo iAPLoginUserInfo = new IAPLoginUserInfo();
            iAPLoginUserInfo.userID = com_alibaba_ariver_app_api_extopt_69_1.userId;
            iAPLoginUserInfo.sessionID = com_alibaba_ariver_app_api_extopt_69_1.sessionId;
            UserInfoManager.instance().loginNotify(iAPLoginUserInfo);
        }
    }

    static /* synthetic */ void getMax(RemoteCallbackPool remoteCallbackPool, boolean z) {
        synchronized (setMax) {
            updateActionSheetContent.d("HttpSessionInterceptor", "loginResult: ".concat(String.valueOf(z)));
            if (z) {
                remoteCallbackPool.getMax = true;
                remoteCallbackPool.toIntRange = false;
            } else {
                remoteCallbackPool.getMax = false;
                remoteCallbackPool.toIntRange = false;
                remoteCallbackPool.length = true;
            }
        }
    }
}
