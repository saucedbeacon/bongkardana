package com.alibaba.griver.core.utils;

import android.os.Process;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.model.share.ShareShortUrlRequest;
import com.alibaba.griver.core.model.share.ShareShortUrlResult;
import com.alibaba.griver.core.rpc.b;
import java.net.URLEncoder;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public class j {
    public static void a(final String str, final OnRpcResultListener<ShareShortUrlResult> onRpcResultListener) {
        GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
            private static int getMax = 0;
            private static char[] getMin = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
            private static char setMax = '\u0003';
            private static int setMin = 1;

            {
                try {
                } catch (Exception e) {
                    throw e;
                }
            }

            public final void run() {
                int i = setMin + 99;
                getMax = i % 128;
                int i2 = i % 2;
                String str = str;
                try {
                    str = URLEncoder.encode(str, setMax(new char[]{1, 2, 0, 5, ';'}, (byte) (3 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), 5 - (Process.myTid() >> 22)).intern());
                } catch (Throwable th) {
                    GriverLogger.e("ShareShortenUrlUtils", "Encode url exception...e=".concat(String.valueOf(th)));
                }
                GriverLogger.d("ShareShortenUrlUtils", "share url encoded: ".concat(String.valueOf(str)));
                String workSpaceId = GriverEnv.getWorkSpaceId();
                ShareShortUrlRequest shareShortUrlRequest = new ShareShortUrlRequest();
                shareShortUrlRequest.walletAppId = GriverEnv.getAppId();
                shareShortUrlRequest.currentWorkspaceId = workSpaceId;
                shareShortUrlRequest.paramData = "scheme=".concat(String.valueOf(str));
                new b().a(shareShortUrlRequest, onRpcResultListener);
                int i3 = getMax + 107;
                setMin = i3 % 128;
                int i4 = i3 % 2;
            }

            private static String setMax(char[] cArr, byte b2, int i) {
                int i2 = getMax + 43;
                setMin = i2 % 128;
                int i3 = i2 % 2;
                char[] cArr2 = getMin;
                char c = setMax;
                char[] cArr3 = new char[i];
                if ((i % 2 != 0 ? 'N' : Typography.amp) == 'N') {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b2);
                }
                int i4 = 1;
                if (i > 1) {
                    int i5 = setMin + 63;
                    getMax = i5 % 128;
                    if ((i5 % 2 != 0 ? '#' : 'M') != '#') {
                        i4 = 0;
                    }
                    while (i4 < i) {
                        char c2 = cArr[i4];
                        int i6 = i4 + 1;
                        char c3 = cArr[i6];
                        if (c2 == c3) {
                            cArr3[i4] = (char) (c2 - b2);
                            cArr3[i6] = (char) (c3 - b2);
                        } else {
                            int min = onActivityPreStopped.setMin(c2, c);
                            int length = onActivityPreStopped.length(c2, c);
                            int min2 = onActivityPreStopped.setMin(c3, c);
                            int length2 = onActivityPreStopped.length(c3, c);
                            if (length == length2) {
                                int i7 = setMin + 107;
                                getMax = i7 % 128;
                                int i8 = i7 % 2;
                                int max = onActivityPreStopped.setMax(min, c);
                                int max2 = onActivityPreStopped.setMax(min2, c);
                                int max3 = onActivityPreStopped.getMax(max, length, c);
                                int max4 = onActivityPreStopped.getMax(max2, length2, c);
                                cArr3[i4] = cArr2[max3];
                                cArr3[i6] = cArr2[max4];
                                try {
                                    int i9 = getMax + 71;
                                    setMin = i9 % 128;
                                    int i10 = i9 % 2;
                                } catch (Exception e) {
                                    throw e;
                                }
                            } else if (min == min2) {
                                int i11 = getMax + 61;
                                setMin = i11 % 128;
                                int i12 = i11 % 2;
                                int max5 = onActivityPreStopped.setMax(length, c);
                                int max6 = onActivityPreStopped.setMax(length2, c);
                                int max7 = onActivityPreStopped.getMax(min, max5, c);
                                int max8 = onActivityPreStopped.getMax(min2, max6, c);
                                cArr3[i4] = cArr2[max7];
                                cArr3[i6] = cArr2[max8];
                            } else {
                                int max9 = onActivityPreStopped.getMax(min, length2, c);
                                int max10 = onActivityPreStopped.getMax(min2, length, c);
                                cArr3[i4] = cArr2[max9];
                                cArr3[i6] = cArr2[max10];
                            }
                        }
                        i4 += 2;
                    }
                }
                String str = new String(cArr3);
                int i13 = getMax + 111;
                setMin = i13 % 128;
                int i14 = i13 % 2;
                return str;
            }
        });
    }
}
