package o;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.util.Base64;
import android.webkit.URLUtil;
import com.alibaba.ariver.remotedebug.RDConstant;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import o.getCardElevation;
import o.getChildVerticalGravity;

public final class getTitleTextView {
    private static char[] getMax = {28, '2', '9', 'M', 'T'};
    private static int toFloatRange = 0;
    private static int toIntRange = 1;
    private setPaddingRight getMin;
    private getCardElevation length;
    private getMaxCardElevation setMax = getMaxCardElevation.length("application/json; charset=utf-8");
    private String setMin;

    static /* synthetic */ String getMin(getTitleTextView gettitletextview) {
        int i = toFloatRange + 115;
        toIntRange = i % 128;
        int i2 = i % 2;
        try {
            String str = gettitletextview.setMin;
            int i3 = toIntRange + 125;
            toFloatRange = i3 % 128;
            if ((i3 % 2 != 0 ? 'F' : '`') != 'F') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public getTitleTextView(Context context, String str) {
        this.length = getMin(context);
        this.getMin = new setPaddingRight();
        this.setMin = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [javax.net.ssl.TrustManager[], char[], java.io.InputStream] */
    private static TrustManager[] getMax(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        ? r0 = 0;
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            char c = 0;
            byteArrayInputStream = new ByteArrayInputStream(new String(Base64.decode(new BufferedInputStream(context.getAssets().open("signature/oneklik")).toString(), 0), getMin(new int[]{0, 5, 0, 5}, new byte[]{0, 1, 1, 0, 1}, PhoneNumberUtils.isNonSeparator('0')).intern()).getBytes(getMin(new int[]{0, 5, 0, 5}, new byte[]{0, 1, 1, 0, 1}, URLUtil.isJavaScriptUrl(RDConstant.JAVASCRIPT_SCHEME)).intern()));
            Certificate generateCertificate = instance.generateCertificate(byteArrayInputStream);
            byteArrayInputStream.close();
            int i = toIntRange + 53;
            toFloatRange = i % 128;
            if (i % 2 == 0) {
                c = 19;
            }
            if (c != 0) {
                KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
                instance2.load(r0, r0);
                instance2.setCertificateEntry("ca", generateCertificate);
                TrustManagerFactory instance3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance3.init(instance2);
                return instance3.getTrustManagers();
            }
            KeyStore instance4 = KeyStore.getInstance(KeyStore.getDefaultType());
            instance4.load(r0, r0);
            instance4.setCertificateEntry("ca", generateCertificate);
            TrustManagerFactory instance5 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance5.init(instance4);
            TrustManager[] trustManagers = instance5.getTrustManagers();
            int length2 = r0.length;
            return trustManagers;
        } catch (Exception unused) {
            return r0;
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    private getCardElevation getMin(Context context) {
        try {
            SSLContext instance = SSLContext.getInstance("TLSv1.2");
            instance.init((KeyManager[]) null, getMax(context), new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            getCardElevation.setMax setmax = new getCardElevation.setMax();
            setmax.setMin(socketFactory);
            try {
                setmax.values = new HostnameVerifier() {
                    public final boolean verify(String str, SSLSession sSLSession) {
                        return str.equals(getTitleTextView.getMin(getTitleTextView.this).equals("PRODUCTION") ? "oneklik.klikbca.com" : "202.6.215.226");
                    }
                };
                Integer valueOf = Integer.valueOf(context.getResources().getString(getChildVerticalGravity.IsOverlapping.xco_timeout_maxprogress));
                getCardElevation.setMax length2 = length(setmax);
                length2.create = true;
                long intValue = (long) valueOf.intValue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (intValue < 0) {
                    throw new IllegalArgumentException("timeout < 0");
                } else if (timeUnit != null) {
                    long millis = timeUnit.toMillis(intValue);
                    if (millis <= 2147483647L) {
                        if (!(millis != 0)) {
                            int i = toIntRange + 59;
                            toFloatRange = i % 128;
                            if ((i % 2 == 0) ? intValue > 0 : intValue > 1) {
                                throw new IllegalArgumentException("Timeout too small.");
                            }
                        }
                        length2.b = (int) millis;
                        long intValue2 = (long) valueOf.intValue();
                        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                        if (intValue2 < 0) {
                            throw new IllegalArgumentException("timeout < 0");
                        } else if (timeUnit2 != null) {
                            long millis2 = timeUnit2.toMillis(intValue2);
                            if (millis2 <= 2147483647L) {
                                if (millis2 == 0) {
                                    int i2 = toFloatRange + 15;
                                    toIntRange = i2 % 128;
                                    int i3 = i2 % 2;
                                    if (intValue2 > 0) {
                                        throw new IllegalArgumentException("Timeout too small.");
                                    }
                                }
                                length2.ICustomTabsCallback = (int) millis2;
                                return new getCardElevation(length2, (byte) 0);
                            }
                            throw new IllegalArgumentException("Timeout too large.");
                        } else {
                            throw new NullPointerException("unit == null");
                        }
                    } else {
                        throw new IllegalArgumentException("Timeout too large.");
                    }
                } else {
                    throw new NullPointerException("unit == null");
                }
            } catch (Exception e) {
                e = e;
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f0, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f1, code lost:
        if (r9 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f5, code lost:
        if (66 == 66) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        r0 = toFloatRange + 117;
        toIntRange = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0105, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        r10.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010a, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String setMin(java.lang.String r9, o.addChildrenForExpandedActionView r10, o.isChildOrHidden r11) {
        /*
            r8 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "TransactionType"
            java.lang.String r2 = r11.hashCode     // Catch:{ Exception -> 0x0118 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "XCOID"
            java.lang.String r2 = r11.equals     // Catch:{ Exception -> 0x0118 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "MSISDNID"
            java.lang.String r2 = r11.IsOverlapping     // Catch:{ Exception -> 0x0118 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "MerchantID"
            java.lang.String r11 = r11.getMax     // Catch:{ Exception -> 0x0118 }
            r0.put(r1, r11)     // Catch:{ Exception -> 0x0118 }
            o.getMaxCardElevation r11 = r8.setMax     // Catch:{ Exception -> 0x0118 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0118 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0118 }
            o.get r11 = o.get.getMin(r11, r1)     // Catch:{ Exception -> 0x0118 }
            o.setPaddingRight r1 = r8.getMin     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = r1.length()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r2 = r10.getMin     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "POST"
            java.lang.String r4 = "/xco/otp"
            java.lang.String r5 = r10.setMin     // Catch:{ Exception -> 0x0118 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0118 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0118 }
            r7 = r1
            java.lang.String r0 = o.setPaddingRight.getMin(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0118 }
            o.getRadius$length r2 = new o.getRadius$length     // Catch:{ Exception -> 0x0118 }
            r2.<init>()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "Authorization"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118 }
            java.lang.String r5 = "Bearer "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r5 = r10.setMin     // Catch:{ Exception -> 0x0118 }
            r4.append(r5)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0118 }
            o.getRadius$length r2 = r2.setMax(r3, r4)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = r10.getMax     // Catch:{ Exception -> 0x0118 }
            o.getRadius$length r2 = r2.setMax(r3, r4)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "X-BCA-Key"
            java.lang.String r10 = r10.length     // Catch:{ Exception -> 0x0118 }
            o.getRadius$length r10 = r2.setMax(r3, r10)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r2 = "X-BCA-Timestamp"
            o.getRadius$length r10 = r10.setMax(r2, r1)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "X-BCA-Signature"
            o.getRadius$length r10 = r10.setMax(r1, r0)     // Catch:{ Exception -> 0x0118 }
            o.getRadius$length r9 = r10.setMin(r9)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r10 = "POST"
            o.getRadius$length r9 = r9.length(r10, r11)     // Catch:{ Exception -> 0x0118 }
            com.bca.xco.widget.connection.httpclient.p r10 = r9.getMin     // Catch:{ Exception -> 0x0118 }
            if (r10 == 0) goto L_0x010e
            o.getRadius r10 = new o.getRadius
            r11 = 0
            r10.<init>(r9, r11)
            o.getCardElevation r9 = r8.length
            o.Toolbar$SavedState r9 = r9.setMax(r10)
            o.getPreventCornerOverlap r9 = r9.setMax()
            o.setPreventCornerOverlap r10 = r9.IsOverlapping     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00ee }
            byte[] r1 = r10.length()     // Catch:{ all -> 0x00ee }
            o.getMaxCardElevation r10 = r10.setMax()     // Catch:{ all -> 0x00ee }
            if (r10 == 0) goto L_0x00df
            java.nio.charset.Charset r2 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = r10.setMax     // Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x00b6
            r11 = 1
        L_0x00b6:
            if (r11 == 0) goto L_0x00e1
            int r11 = toFloatRange
            int r11 = r11 + 35
            int r2 = r11 % 128
            toIntRange = r2
            int r11 = r11 % 2
            r2 = 67
            if (r11 != 0) goto L_0x00c9
            r11 = 57
            goto L_0x00cb
        L_0x00c9:
            r11 = 67
        L_0x00cb:
            if (r11 == r2) goto L_0x00d8
            java.lang.String r10 = r10.setMax     // Catch:{ all -> 0x00ee }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r10)     // Catch:{ all -> 0x00ee }
            r10 = 0
            super.hashCode()     // Catch:{ all -> 0x00ee }
            goto L_0x00e1
        L_0x00d8:
            java.lang.String r10 = r10.setMax     // Catch:{ all -> 0x00ee }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r10)     // Catch:{ all -> 0x00ee }
            goto L_0x00e1
        L_0x00df:
            java.nio.charset.Charset r2 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00ee }
        L_0x00e1:
            java.lang.String r10 = r2.name()     // Catch:{ all -> 0x00ee }
            r0.<init>(r1, r10)     // Catch:{ all -> 0x00ee }
            if (r9 == 0) goto L_0x00ed
            r9.close()
        L_0x00ed:
            return r0
        L_0x00ee:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r11 = move-exception
            if (r9 == 0) goto L_0x010d
            r0 = 66
            if (r0 != r0) goto L_0x010a
            int r0 = toFloatRange
            int r0 = r0 + 117
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r9.close()     // Catch:{ all -> 0x0105 }
            goto L_0x010d
        L_0x0105:
            r9 = move-exception
            r10.addSuppressed(r9)
            goto L_0x010d
        L_0x010a:
            r9.close()
        L_0x010d:
            throw r11
        L_0x010e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "url == null"
            r9.<init>(r10)
            throw r9
        L_0x0116:
            r9 = move-exception
            throw r9
        L_0x0118:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.setMin(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00df, code lost:
        if (r9 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if (54 == 54) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r0 = toIntRange + 117;
        toFloatRange = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f4, code lost:
        r10.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f8, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String length(java.lang.String r9, o.addChildrenForExpandedActionView r10, o.isChildOrHidden r11) {
        /*
            r8 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = r11.isInside
            java.lang.String r2 = "OTP"
            r0.put(r2, r1)
            java.lang.String r11 = r11.equals
            java.lang.String r1 = "XCOID"
            r0.put(r1, r11)
            o.getMaxCardElevation r11 = r8.setMax
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r1 = r1.toString()
            o.get r11 = o.get.getMin(r11, r1)
            o.setPaddingRight r1 = r8.getMin
            java.lang.String r1 = r1.length()
            java.lang.String r2 = r10.getMin
            java.lang.String r5 = r10.setMin
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r0)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = "PUT"
            java.lang.String r4 = "/xco/widget/credentials"
            r7 = r1
            java.lang.String r0 = o.setPaddingRight.getMin(r2, r3, r4, r5, r6, r7)
            o.getRadius$length r2 = new o.getRadius$length
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bearer "
            r3.<init>(r4)
            java.lang.String r4 = r10.setMin
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Authorization"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = r10.getMax
            java.lang.String r4 = "Content-Type"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = r10.length
            java.lang.String r4 = "X-BCA-Key"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = "X-BCA-Timestamp"
            o.getRadius$length r1 = r2.setMax(r3, r1)
            java.lang.String r2 = "X-BCA-Signature"
            o.getRadius$length r0 = r1.setMax(r2, r0)
            java.lang.String r10 = r10.setMax
            java.lang.String r1 = "X-Client-DeviceInfo"
            o.getRadius$length r10 = r0.setMax(r1, r10)
            o.getRadius$length r9 = r10.setMin(r9)
            java.lang.String r10 = "PUT"
            o.getRadius$length r9 = r9.length(r10, r11)
            com.bca.xco.widget.connection.httpclient.p r10 = r9.getMin
            if (r10 == 0) goto L_0x00fc
            o.getRadius r10 = new o.getRadius
            r11 = 0
            r10.<init>(r9, r11)
            o.getCardElevation r9 = r8.length
            o.Toolbar$SavedState r9 = r9.setMax(r10)
            o.getPreventCornerOverlap r9 = r9.setMax()
            o.setPreventCornerOverlap r10 = r9.IsOverlapping     // Catch:{ all -> 0x00dc }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x00dc }
            byte[] r0 = r10.length()     // Catch:{ all -> 0x00dc }
            o.getMaxCardElevation r10 = r10.setMax()     // Catch:{ all -> 0x00dc }
            if (r10 == 0) goto L_0x00cd
            java.nio.charset.Charset r1 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r10.setMax     // Catch:{ all -> 0x00dc }
            r3 = 45
            if (r2 == 0) goto L_0x00b4
            r2 = 40
            goto L_0x00b6
        L_0x00b4:
            r2 = 45
        L_0x00b6:
            if (r2 == r3) goto L_0x00cf
            java.lang.String r10 = r10.setMax     // Catch:{ all -> 0x00dc }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r10)     // Catch:{ all -> 0x00dc }
            int r10 = toIntRange     // Catch:{ Exception -> 0x00cb }
            int r10 = r10 + 47
            int r2 = r10 % 128
            toFloatRange = r2     // Catch:{ Exception -> 0x00c9 }
            int r10 = r10 % 2
            goto L_0x00cf
        L_0x00c9:
            r9 = move-exception
            throw r9
        L_0x00cb:
            r9 = move-exception
            throw r9
        L_0x00cd:
            java.nio.charset.Charset r1 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00dc }
        L_0x00cf:
            java.lang.String r10 = r1.name()     // Catch:{ all -> 0x00dc }
            r11.<init>(r0, r10)     // Catch:{ all -> 0x00dc }
            if (r9 == 0) goto L_0x00db
            r9.close()
        L_0x00db:
            return r11
        L_0x00dc:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00de }
        L_0x00de:
            r11 = move-exception
            if (r9 == 0) goto L_0x00fb
            r0 = 54
            if (r0 != r0) goto L_0x00f8
            int r0 = toIntRange
            int r0 = r0 + 117
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            r9.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00fb
        L_0x00f3:
            r9 = move-exception
            r10.addSuppressed(r9)
            goto L_0x00fb
        L_0x00f8:
            r9.close()
        L_0x00fb:
            throw r11
        L_0x00fc:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "url == null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.length(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e4, code lost:
        if (r9 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e8, code lost:
        if (60 != 60) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ea, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r9 = toIntRange + 1;
        toFloatRange = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f8, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fc, code lost:
        r9 = toFloatRange + 69;
        toIntRange = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0107, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
        r11.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String setMax(java.lang.String r9, o.addChildrenForExpandedActionView r10, o.isChildOrHidden r11) {
        /*
            r8 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = r11.getMin
            java.lang.String r2 = "MaxLimit"
            r0.put(r2, r1)
            java.lang.String r1 = r11.length
            java.lang.String r2 = "CredentialType"
            r0.put(r2, r1)
            java.lang.String r1 = r11.setMax
            java.lang.String r2 = "CredentialNumber"
            r0.put(r2, r1)
            java.lang.String r1 = r11.getMax
            java.lang.String r2 = "MerchantID"
            r0.put(r2, r1)
            java.lang.String r11 = r11.setMin
            java.lang.String r1 = "CustomerIDMerchant"
            r0.put(r1, r11)
            o.getMaxCardElevation r11 = r8.setMax
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r1 = r1.toString()
            o.get r11 = o.get.getMin(r11, r1)
            o.setPaddingRight r1 = r8.getMin
            java.lang.String r1 = r1.length()
            java.lang.String r2 = r10.getMin
            java.lang.String r5 = r10.setMin
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r0)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = "POST"
            java.lang.String r4 = "/xco/widget/credentials"
            r7 = r1
            java.lang.String r0 = o.setPaddingRight.getMin(r2, r3, r4, r5, r6, r7)
            o.getRadius$length r2 = new o.getRadius$length
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bearer "
            r3.<init>(r4)
            java.lang.String r4 = r10.setMin
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Authorization"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = r10.getMax
            java.lang.String r4 = "Content-Type"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r10 = r10.length
            java.lang.String r3 = "X-BCA-Key"
            o.getRadius$length r10 = r2.setMax(r3, r10)
            java.lang.String r2 = "X-BCA-Timestamp"
            o.getRadius$length r10 = r10.setMax(r2, r1)
            java.lang.String r1 = "X-BCA-Signature"
            o.getRadius$length r10 = r10.setMax(r1, r0)
            o.getRadius$length r9 = r10.setMin(r9)
            java.lang.String r10 = "POST"
            o.getRadius$length r9 = r9.length(r10, r11)
            com.bca.xco.widget.connection.httpclient.p r10 = r9.getMin
            if (r10 == 0) goto L_0x010c
            o.getRadius r10 = new o.getRadius
            r11 = 0
            r10.<init>(r9, r11)
            o.getCardElevation r9 = r8.length
            o.Toolbar$SavedState r9 = r9.setMax(r10)
            o.getPreventCornerOverlap r9 = r9.setMax()
            r10 = 1
            o.setPreventCornerOverlap r0 = r9.IsOverlapping     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00e1 }
            byte[] r2 = r0.length()     // Catch:{ all -> 0x00e1 }
            o.getMaxCardElevation r0 = r0.setMax()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00c8
            java.nio.charset.Charset r3 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = r0.setMax     // Catch:{ all -> 0x00e1 }
            if (r4 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r11 = 1
        L_0x00bf:
            if (r11 == r10) goto L_0x00ca
            java.lang.String r11 = r0.setMax     // Catch:{ all -> 0x00e1 }
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r11)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ca
        L_0x00c8:
            java.nio.charset.Charset r3 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00e1 }
        L_0x00ca:
            java.lang.String r11 = r3.name()     // Catch:{ all -> 0x00e1 }
            r1.<init>(r2, r11)     // Catch:{ all -> 0x00e1 }
            if (r9 == 0) goto L_0x00e0
            r9.close()
            int r9 = toFloatRange
            int r9 = r9 + 101
            int r10 = r9 % 128
            toIntRange = r10
            int r9 = r9 % 2
        L_0x00e0:
            return r1
        L_0x00e1:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            if (r9 == 0) goto L_0x010b
            r1 = 60
            if (r1 == r1) goto L_0x00f9
            r9.close()
            int r9 = toIntRange     // Catch:{ Exception -> 0x00f7 }
            int r9 = r9 + r10
            int r10 = r9 % 128
            toFloatRange = r10     // Catch:{ Exception -> 0x00f7 }
            int r9 = r9 % 2
            goto L_0x010b
        L_0x00f7:
            r9 = move-exception
            throw r9
        L_0x00f9:
            r9.close()     // Catch:{ all -> 0x0107 }
            int r9 = toFloatRange
            int r9 = r9 + 69
            int r10 = r9 % 128
            toIntRange = r10
            int r9 = r9 % 2
            goto L_0x010b
        L_0x0107:
            r9 = move-exception
            r11.addSuppressed(r9)
        L_0x010b:
            throw r0
        L_0x010c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "url == null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.setMax(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        if (r8 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        if (17 != 35) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r9 = toFloatRange + 85;
        toIntRange = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d7, code lost:
        r10.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        r8 = toFloatRange + 1;
        toIntRange = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e8, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMin(java.lang.String r8, o.addChildrenForExpandedActionView r9, o.isChildOrHidden r10) {
        /*
            r7 = this;
            o.setPaddingRight r0 = r7.getMin
            java.lang.String r0 = r0.length()
            java.lang.String r1 = r9.getMin
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "/xco/merchants/"
            r2.<init>(r3)
            java.lang.String r10 = r10.getMax
            r2.append(r10)
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = r9.setMin
            r5 = 0
            java.lang.String r2 = "GET"
            r6 = r0
            java.lang.String r10 = o.setPaddingRight.getMin(r1, r2, r3, r4, r5, r6)
            o.getRadius$length r1 = new o.getRadius$length
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Bearer "
            r2.<init>(r3)
            java.lang.String r3 = r9.setMin
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Authorization"
            o.getRadius$length r1 = r1.setMax(r3, r2)
            java.lang.String r2 = r9.getMax
            java.lang.String r3 = "Content-Type"
            o.getRadius$length r1 = r1.setMax(r3, r2)
            java.lang.String r9 = r9.length
            java.lang.String r2 = "X-BCA-Key"
            o.getRadius$length r9 = r1.setMax(r2, r9)
            java.lang.String r1 = "X-BCA-Timestamp"
            o.getRadius$length r9 = r9.setMax(r1, r0)
            java.lang.String r0 = "X-BCA-Signature"
            o.getRadius$length r9 = r9.setMax(r0, r10)
            o.getRadius$length r8 = r9.setMin(r8)
            r9 = 0
            java.lang.String r10 = "GET"
            o.getRadius$length r8 = r8.length(r10, r9)
            com.bca.xco.widget.connection.httpclient.p r9 = r8.getMin
            if (r9 == 0) goto L_0x00eb
            o.getRadius r9 = new o.getRadius
            r10 = 0
            r9.<init>(r8, r10)
            o.getCardElevation r8 = r7.length
            o.Toolbar$SavedState r8 = r8.setMax(r9)
            o.getPreventCornerOverlap r8 = r8.setMax()
            r9 = 1
            o.setPreventCornerOverlap r0 = r8.IsOverlapping     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00bd }
            byte[] r2 = r0.length()     // Catch:{ all -> 0x00bd }
            o.getMaxCardElevation r0 = r0.setMax()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0094
            java.nio.charset.Charset r3 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r0.setMax     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0096
            java.lang.String r0 = r0.setMax     // Catch:{ all -> 0x00bd }
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x0096
        L_0x0094:
            java.nio.charset.Charset r3 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00bd }
        L_0x0096:
            java.lang.String r0 = r3.name()     // Catch:{ all -> 0x00bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00bd }
            if (r8 == 0) goto L_0x00a5
            r8.close()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a5
        L_0x00a3:
            r8 = move-exception
            throw r8
        L_0x00a5:
            int r8 = toIntRange
            int r8 = r8 + 69
            int r0 = r8 % 128
            toFloatRange = r0
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x00b3
            r8 = 0
            goto L_0x00b4
        L_0x00b3:
            r8 = 1
        L_0x00b4:
            if (r8 == r9) goto L_0x00bc
            r8 = 21
            int r8 = r8 / r10
            return r1
        L_0x00ba:
            r8 = move-exception
            throw r8
        L_0x00bc:
            return r1
        L_0x00bd:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            if (r8 == 0) goto L_0x00ea
            r1 = 17
            r2 = 35
            if (r1 == r2) goto L_0x00db
            int r9 = toFloatRange
            int r9 = r9 + 85
            int r1 = r9 % 128
            toIntRange = r1
            int r9 = r9 % 2
            r8.close()     // Catch:{ all -> 0x00d6 }
            goto L_0x00ea
        L_0x00d6:
            r8 = move-exception
            r10.addSuppressed(r8)
            goto L_0x00ea
        L_0x00db:
            r8.close()     // Catch:{ Exception -> 0x00e8 }
            int r8 = toFloatRange
            int r8 = r8 + r9
            int r9 = r8 % 128
            toIntRange = r9
            int r8 = r8 % 2
            goto L_0x00ea
        L_0x00e8:
            r8 = move-exception
            throw r8
        L_0x00ea:
            throw r0
        L_0x00eb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "url == null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.getMin(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (r8 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        r0 = toFloatRange + 97;
        toIntRange = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMax(java.lang.String r8, o.addChildrenForExpandedActionView r9, o.isChildOrHidden r10) {
        /*
            r7 = this;
            o.setPaddingRight r0 = r7.getMin
            java.lang.String r0 = r0.length()
            java.lang.String r1 = r9.getMin
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "/xco/credentials/details/"
            r2.<init>(r3)
            java.lang.String r10 = r10.equals
            r2.append(r10)
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = r9.setMin
            r5 = 0
            java.lang.String r2 = "GET"
            r6 = r0
            java.lang.String r10 = o.setPaddingRight.getMin(r1, r2, r3, r4, r5, r6)
            o.getRadius$length r1 = new o.getRadius$length
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Bearer "
            r2.<init>(r3)
            java.lang.String r3 = r9.setMin
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Authorization"
            o.getRadius$length r1 = r1.setMax(r3, r2)
            java.lang.String r2 = r9.getMax
            java.lang.String r3 = "Content-Type"
            o.getRadius$length r1 = r1.setMax(r3, r2)
            java.lang.String r9 = r9.length
            java.lang.String r2 = "X-BCA-Key"
            o.getRadius$length r9 = r1.setMax(r2, r9)
            java.lang.String r1 = "X-BCA-Timestamp"
            o.getRadius$length r9 = r9.setMax(r1, r0)
            java.lang.String r0 = "X-BCA-Signature"
            o.getRadius$length r9 = r9.setMax(r0, r10)
            o.getRadius$length r8 = r9.setMin(r8)
            com.bca.xco.widget.connection.httpclient.p r9 = r8.getMin
            if (r9 == 0) goto L_0x00db
            o.getRadius r9 = new o.getRadius
            r10 = 0
            r9.<init>(r8, r10)
            o.getCardElevation r8 = r7.length
            o.Toolbar$SavedState r8 = r8.setMax(r9)
            o.getPreventCornerOverlap r8 = r8.setMax()
            o.setPreventCornerOverlap r9 = r8.IsOverlapping     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00c3 }
            byte[] r1 = r9.length()     // Catch:{ all -> 0x00c3 }
            o.getMaxCardElevation r9 = r9.setMax()     // Catch:{ all -> 0x00c3 }
            if (r9 == 0) goto L_0x00b1
            java.nio.charset.Charset r2 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = r9.setMax     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x0087
            r3 = 0
            goto L_0x0088
        L_0x0087:
            r3 = 1
        L_0x0088:
            if (r3 == 0) goto L_0x008b
            goto L_0x00b3
        L_0x008b:
            int r2 = toIntRange
            int r2 = r2 + 101
            int r3 = r2 % 128
            toFloatRange = r3
            int r2 = r2 % 2
            r3 = 82
            if (r2 == 0) goto L_0x009c
            r2 = 35
            goto L_0x009e
        L_0x009c:
            r2 = 82
        L_0x009e:
            if (r2 == r3) goto L_0x00aa
            java.lang.String r9 = r9.setMax     // Catch:{ all -> 0x00c3 }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r9)     // Catch:{ all -> 0x00c3 }
            r9 = 47
            int r9 = r9 / r10
            goto L_0x00b3
        L_0x00aa:
            java.lang.String r9 = r9.setMax     // Catch:{ all -> 0x00c3 }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r9)     // Catch:{ all -> 0x00c3 }
            goto L_0x00b3
        L_0x00b1:
            java.nio.charset.Charset r2 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00c3 }
        L_0x00b3:
            java.lang.String r9 = r2.name()     // Catch:{ all -> 0x00c3 }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x00c3 }
            if (r8 == 0) goto L_0x00c2
            r8.close()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00c2
        L_0x00c0:
            r8 = move-exception
            throw r8
        L_0x00c2:
            return r0
        L_0x00c3:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r10 = move-exception
            if (r8 == 0) goto L_0x00da
            int r0 = toFloatRange
            int r0 = r0 + 97
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r8.close()     // Catch:{ all -> 0x00d6 }
            goto L_0x00da
        L_0x00d6:
            r8 = move-exception
            r9.addSuppressed(r8)
        L_0x00da:
            throw r10
        L_0x00db:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "url == null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.getMax(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00eb, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ec, code lost:
        if (r9 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f2, code lost:
        if (86 != 26) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        r9 = toIntRange + 81;
        toFloatRange = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0102, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        r10.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0107, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010a, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toIntRange(java.lang.String r9, o.addChildrenForExpandedActionView r10, o.isChildOrHidden r11) {
        /*
            r8 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = r11.equals
            java.lang.String r2 = "XCOID"
            r0.put(r2, r1)
            java.lang.String r1 = r11.getMin
            java.lang.String r2 = "MaxLimit"
            r0.put(r2, r1)
            java.lang.String r11 = r11.getMax
            java.lang.String r1 = "MerchantID"
            r0.put(r1, r11)
            o.getMaxCardElevation r11 = r8.setMax
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r1 = r1.toString()
            o.get r11 = o.get.getMin(r11, r1)
            o.setPaddingRight r1 = r8.getMin
            java.lang.String r1 = r1.length()
            java.lang.String r2 = r10.getMin
            java.lang.String r5 = r10.setMin
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r0)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = "POST"
            java.lang.String r4 = "/xco/credentials/limits"
            r7 = r1
            java.lang.String r0 = o.setPaddingRight.getMin(r2, r3, r4, r5, r6, r7)
            o.getRadius$length r2 = new o.getRadius$length
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bearer "
            r3.<init>(r4)
            java.lang.String r4 = r10.setMin
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Authorization"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = r10.getMax
            java.lang.String r4 = "Content-Type"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r10 = r10.length
            java.lang.String r3 = "X-BCA-Key"
            o.getRadius$length r10 = r2.setMax(r3, r10)
            java.lang.String r2 = "X-BCA-Timestamp"
            o.getRadius$length r10 = r10.setMax(r2, r1)
            java.lang.String r1 = "X-BCA-Signature"
            o.getRadius$length r10 = r10.setMax(r1, r0)
            o.getRadius$length r9 = r10.setMin(r9)
            java.lang.String r10 = "POST"
            o.getRadius$length r9 = r9.length(r10, r11)
            com.bca.xco.widget.connection.httpclient.p r10 = r9.getMin
            if (r10 == 0) goto L_0x010b
            o.getRadius r10 = new o.getRadius
            r11 = 0
            r10.<init>(r9, r11)
            o.getCardElevation r9 = r8.length
            o.Toolbar$SavedState r9 = r9.setMax(r10)
            o.getPreventCornerOverlap r9 = r9.setMax()
            o.setPreventCornerOverlap r10 = r9.IsOverlapping     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00e9 }
            byte[] r1 = r10.length()     // Catch:{ all -> 0x00e9 }
            o.getMaxCardElevation r10 = r10.setMax()     // Catch:{ all -> 0x00e9 }
            if (r10 == 0) goto L_0x00ba
            java.nio.charset.Charset r2 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = r10.setMax     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r11 = 1
        L_0x00b0:
            if (r11 == 0) goto L_0x00b3
            goto L_0x00c6
        L_0x00b3:
            java.lang.String r10 = r10.setMax     // Catch:{ all -> 0x00e9 }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r10)     // Catch:{ all -> 0x00e9 }
            goto L_0x00c6
        L_0x00ba:
            java.nio.charset.Charset r2 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00e9 }
            int r10 = toFloatRange
            int r10 = r10 + 69
            int r11 = r10 % 128
            toIntRange = r11
            int r10 = r10 % 2
        L_0x00c6:
            java.lang.String r10 = r2.name()     // Catch:{ all -> 0x00e9 }
            r0.<init>(r1, r10)     // Catch:{ all -> 0x00e9 }
            if (r9 == 0) goto L_0x00dc
            r9.close()
            int r9 = toFloatRange
            int r9 = r9 + 17
            int r10 = r9 % 128
            toIntRange = r10
            int r9 = r9 % 2
        L_0x00dc:
            int r9 = toFloatRange     // Catch:{ Exception -> 0x00e7 }
            int r9 = r9 + 55
            int r10 = r9 % 128
            toIntRange = r10     // Catch:{ Exception -> 0x00e7 }
            int r9 = r9 % 2
            return r0
        L_0x00e7:
            r9 = move-exception
            throw r9
        L_0x00e9:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r11 = move-exception
            if (r9 == 0) goto L_0x010a
            r0 = 86
            r1 = 26
            if (r0 == r1) goto L_0x0107
            r9.close()     // Catch:{ all -> 0x0102 }
            int r9 = toIntRange
            int r9 = r9 + 81
            int r10 = r9 % 128
            toFloatRange = r10
            int r9 = r9 % 2
            goto L_0x010a
        L_0x0102:
            r9 = move-exception
            r10.addSuppressed(r9)
            goto L_0x010a
        L_0x0107:
            r9.close()
        L_0x010a:
            throw r11
        L_0x010b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "url == null"
            r9.<init>(r10)
            throw r9
        L_0x0113:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.toIntRange(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e8, code lost:
        if (r9 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00eb, code lost:
        if (1 != 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:
        r0 = toFloatRange + 89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        toIntRange = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fb, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        r10.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0107, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String equals(java.lang.String r9, o.addChildrenForExpandedActionView r10, o.isChildOrHidden r11) {
        /*
            r8 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = r11.equals
            java.lang.String r2 = "XCOID"
            r0.put(r2, r1)
            java.lang.String r1 = r11.getMin
            java.lang.String r2 = "MaxLimit"
            r0.put(r2, r1)
            java.lang.String r1 = r11.getMax
            java.lang.String r2 = "MerchantID"
            r0.put(r2, r1)
            java.lang.String r11 = r11.isInside
            java.lang.String r1 = "OTP"
            r0.put(r1, r11)
            o.getMaxCardElevation r11 = r8.setMax
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r1 = r1.toString()
            o.get r11 = o.get.getMin(r11, r1)
            o.setPaddingRight r1 = r8.getMin
            java.lang.String r1 = r1.length()
            java.lang.String r2 = r10.getMin
            java.lang.String r5 = r10.setMin
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r0)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = "PUT"
            java.lang.String r4 = "/xco/credentials/limits"
            r7 = r1
            java.lang.String r0 = o.setPaddingRight.getMin(r2, r3, r4, r5, r6, r7)
            o.getRadius$length r2 = new o.getRadius$length
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bearer "
            r3.<init>(r4)
            java.lang.String r4 = r10.setMin
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Authorization"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = r10.getMax
            java.lang.String r4 = "Content-Type"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = r10.length
            java.lang.String r4 = "X-BCA-Key"
            o.getRadius$length r2 = r2.setMax(r4, r3)
            java.lang.String r3 = "X-BCA-Timestamp"
            o.getRadius$length r1 = r2.setMax(r3, r1)
            java.lang.String r2 = "X-BCA-Signature"
            o.getRadius$length r0 = r1.setMax(r2, r0)
            java.lang.String r10 = r10.setMax
            java.lang.String r1 = "X-Client-DeviceInfo"
            o.getRadius$length r10 = r0.setMax(r1, r10)
            o.getRadius$length r9 = r10.setMin(r9)
            java.lang.String r10 = "PUT"
            o.getRadius$length r9 = r9.length(r10, r11)
            com.bca.xco.widget.connection.httpclient.p r10 = r9.getMin
            if (r10 == 0) goto L_0x0108
            o.getRadius r10 = new o.getRadius
            r11 = 0
            r10.<init>(r9, r11)
            o.getCardElevation r9 = r8.length
            o.Toolbar$SavedState r9 = r9.setMax(r10)
            o.getPreventCornerOverlap r9 = r9.setMax()
            o.setPreventCornerOverlap r10 = r9.IsOverlapping     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x00e5 }
            byte[] r0 = r10.length()     // Catch:{ all -> 0x00e5 }
            o.getMaxCardElevation r10 = r10.setMax()     // Catch:{ all -> 0x00e5 }
            if (r10 == 0) goto L_0x00d6
            java.nio.charset.Charset r1 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r10.setMax     // Catch:{ all -> 0x00e5 }
            r3 = 4
            if (r2 == 0) goto L_0x00c0
            r2 = 4
            goto L_0x00c2
        L_0x00c0:
            r2 = 65
        L_0x00c2:
            if (r2 == r3) goto L_0x00c5
            goto L_0x00d8
        L_0x00c5:
            int r1 = toFloatRange
            int r1 = r1 + 113
            int r2 = r1 % 128
            toIntRange = r2
            int r1 = r1 % 2
            java.lang.String r10 = r10.setMax     // Catch:{ all -> 0x00e5 }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r10)     // Catch:{ all -> 0x00e5 }
            goto L_0x00d8
        L_0x00d6:
            java.nio.charset.Charset r1 = o.CustomTabsIntent$ShareState.length     // Catch:{ all -> 0x00e5 }
        L_0x00d8:
            java.lang.String r10 = r1.name()     // Catch:{ all -> 0x00e5 }
            r11.<init>(r0, r10)     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x00e4
            r9.close()     // Catch:{ Exception -> 0x0100 }
        L_0x00e4:
            return r11
        L_0x00e5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r11 = move-exception
            if (r9 == 0) goto L_0x0107
            r0 = 1
            if (r0 == 0) goto L_0x0102
            int r0 = toFloatRange     // Catch:{ Exception -> 0x0100 }
            int r0 = r0 + 89
            int r1 = r0 % 128
            toIntRange = r1     // Catch:{ Exception -> 0x0100 }
            int r0 = r0 % 2
            r9.close()     // Catch:{ all -> 0x00fb }
            goto L_0x0107
        L_0x00fb:
            r9 = move-exception
            r10.addSuppressed(r9)
            goto L_0x0107
        L_0x0100:
            r9 = move-exception
            goto L_0x0106
        L_0x0102:
            r9.close()     // Catch:{ Exception -> 0x0100 }
            goto L_0x0107
        L_0x0106:
            throw r9
        L_0x0107:
            throw r11
        L_0x0108:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "url == null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.equals(java.lang.String, o.addChildrenForExpandedActionView, o.isChildOrHidden):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.security.SecureRandom, javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|(1:8)(1:9)|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(3:2|3|4)(3:11|(1:13)(1:14)|15)|16|17|18|(5:19|20|21|(1:23)(1:24)|(3:26|27|28)(1:31))) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0079, code lost:
        r7.setMin(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0 = javax.net.ssl.SSLContext.getInstance("TLSv1.2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0069, code lost:
        if (android.os.Build.VERSION.SDK_INT <= 19) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006b, code lost:
        r1 = new o.setCollapsible(r0.getSocketFactory());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0075, code lost:
        r1 = r0.getSocketFactory();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0063 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.getCardElevation.setMax length(o.getCardElevation.setMax r7) {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 107
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            r2 = 19
            java.lang.String r3 = "TLSv1.2"
            r4 = 0
            if (r0 < r1) goto L_0x007d
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch:{ Exception -> 0x0063 }
            r0.init(r4, r4, r4)     // Catch:{ Exception -> 0x0063 }
            o.setCollapsible r1 = new o.setCollapsible     // Catch:{ Exception -> 0x0063 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0063 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0063 }
            r7.setMin(r1)     // Catch:{ Exception -> 0x0063 }
            o.BrowserActionsIntent$BrowserActionsItemId$getMax r0 = new o.BrowserActionsIntent$BrowserActionsItemId$getMax     // Catch:{ Exception -> 0x0063 }
            o.BrowserActionsIntent$BrowserActionsItemId r1 = o.BrowserActionsIntent$BrowserActionsItemId.setMin     // Catch:{ Exception -> 0x0063 }
            r0.<init>((o.BrowserActionsIntent$BrowserActionsItemId) r1)     // Catch:{ Exception -> 0x0063 }
            r1 = 1
            com.bca.xco.widget.connection.httpclient.z[] r1 = new com.bca.xco.widget.connection.httpclient.z[r1]     // Catch:{ Exception -> 0x0063 }
            com.bca.xco.widget.connection.httpclient.z r5 = com.bca.xco.widget.connection.httpclient.z.TLS_1_2     // Catch:{ Exception -> 0x0063 }
            r6 = 0
            r1[r6] = r5     // Catch:{ Exception -> 0x0063 }
            o.BrowserActionsIntent$BrowserActionsItemId$getMax r0 = r0.length(r1)     // Catch:{ Exception -> 0x0063 }
            o.BrowserActionsIntent$BrowserActionsItemId r1 = new o.BrowserActionsIntent$BrowserActionsItemId     // Catch:{ Exception -> 0x0063 }
            r1.<init>(r0, r6)     // Catch:{ Exception -> 0x0063 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0063 }
            r0.<init>()     // Catch:{ Exception -> 0x0063 }
            r0.add(r1)     // Catch:{ Exception -> 0x0063 }
            o.BrowserActionsIntent$BrowserActionsItemId r1 = o.BrowserActionsIntent$BrowserActionsItemId.setMax     // Catch:{ Exception -> 0x0063 }
            r0.add(r1)     // Catch:{ Exception -> 0x0063 }
            o.BrowserActionsIntent$BrowserActionsItemId r1 = o.BrowserActionsIntent$BrowserActionsItemId.getMax     // Catch:{ Exception -> 0x0063 }
            r0.add(r1)     // Catch:{ Exception -> 0x0063 }
            java.util.List r0 = o.CustomTabsIntent$ShareState.setMin(r0)     // Catch:{ Exception -> 0x0063 }
            r7.setMax = r0     // Catch:{ Exception -> 0x0063 }
            int r0 = toIntRange
            int r0 = r0 + 29
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            goto L_0x0096
        L_0x0063:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch:{ Exception -> 0x0096 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0096 }
            if (r1 > r2) goto L_0x0075
            o.setCollapsible r1 = new o.setCollapsible     // Catch:{ Exception -> 0x0096 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0096 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0079
        L_0x0075:
            javax.net.ssl.SSLSocketFactory r1 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0096 }
        L_0x0079:
            r7.setMin(r1)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0096
        L_0x007d:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch:{ Exception -> 0x0096 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0096 }
            if (r1 > r2) goto L_0x008f
            o.setCollapsible r1 = new o.setCollapsible     // Catch:{ Exception -> 0x0096 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0096 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0093
        L_0x008f:
            javax.net.ssl.SSLSocketFactory r1 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0096 }
        L_0x0093:
            r7.setMin(r1)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            int r0 = toFloatRange     // Catch:{ Exception -> 0x00b2 }
            int r0 = r0 + 115
            int r1 = r0 % 128
            toIntRange = r1     // Catch:{ Exception -> 0x00b0 }
            int r0 = r0 % 2
            r1 = 61
            if (r0 != 0) goto L_0x00a7
            r0 = 32
            goto L_0x00a9
        L_0x00a7:
            r0 = 61
        L_0x00a9:
            if (r0 == r1) goto L_0x00af
            int r0 = r4.length     // Catch:{ all -> 0x00ad }
            return r7
        L_0x00ad:
            r7 = move-exception
            throw r7
        L_0x00af:
            return r7
        L_0x00b0:
            r7 = move-exception
            throw r7
        L_0x00b2:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTitleTextView.length(o.getCardElevation$setMax):o.getCardElevation$setMax");
    }

    private static String getMin(int[] iArr, byte[] bArr, boolean z) {
        int i;
        char[] cArr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = new char[i3];
        System.arraycopy(getMax, i2, cArr2, 0, i3);
        if (bArr != null) {
            try {
                int i6 = toFloatRange + 119;
                toIntRange = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr = new char[i3];
                    i = 1;
                } else {
                    cArr = new char[i3];
                    i = 0;
                }
                char c = 0;
                while (i < i3) {
                    if (!(bArr[i] == 1)) {
                        cArr[i] = (char) ((cArr2[i] << 1) - c);
                    } else {
                        int i7 = toIntRange + 19;
                        toFloatRange = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr[i] = (char) (((cArr2[i] << 0) - 0) >> c);
                        } else {
                            cArr[i] = (char) (((cArr2[i] << 1) + 1) - c);
                        }
                    }
                    c = cArr[i];
                    i++;
                    int i8 = toFloatRange + 31;
                    toIntRange = i8 % 128;
                    int i9 = i8 % 2;
                }
                cArr2 = cArr;
            } catch (Exception e) {
                throw e;
            }
        }
        if (i5 > 0) {
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i10 = i3 - i5;
            System.arraycopy(cArr3, 0, cArr2, i10, i5);
            System.arraycopy(cArr3, i5, cArr2, 0, i10);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            int i11 = 0;
            while (true) {
                if ((i11 < i3 ? '^' : 'c') == 'c') {
                    break;
                }
                cArr4[i11] = cArr2[(i3 - i11) - 1];
                i11++;
            }
            cArr2 = cArr4;
        }
        if (i4 > 0) {
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = toIntRange + 91;
                toFloatRange = i13 % 128;
                int i14 = i13 % 2;
                cArr2[i12] = (char) (cArr2[i12] - iArr[2]);
            }
        }
        return new String(cArr2);
    }
}
