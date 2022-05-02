package o;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.bca.xco.widget.BCAXCOModule;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.List;
import o.getChildVerticalGravity;
import org.json.JSONObject;

public final class shouldLayout {
    final Integer FastBitmap$CoordinateSystem = 711;
    final Integer Grayscale$Algorithm = 999;
    String ICustomTabsCallback;
    private final Integer ICustomTabsCallback$Default = 712;
    String IsOverlapping;
    final Integer Mean$Arithmetic = 714;
    private String asBinder;
    String b;
    String create;
    String equals;
    private final Integer extraCallback = 102;
    String extraCallbackWithResult;
    String getCause;
    BCAXCOModule getMax;
    getTitleTextView getMin;
    final Integer hashCode = 14;
    String invoke;
    final Integer invokeSuspend = 201;
    final Integer isInside = 11;
    public getChildTop length;
    private final Integer onMessageChannelReady = 13;
    String onNavigationEvent;
    private final Integer onPostMessage = 15;
    private final Integer onRelationshipValidationResult = 104;
    private String onTransact;
    Context setMax;
    ProgressDialog setMin;
    final Integer toDoubleRange = 101;
    final Integer toFloatRange = 100;
    String toIntRange;
    final Integer toString = 103;
    final Integer valueOf = 998;
    final Integer values = 713;

    public shouldLayout(Context context, BCAXCOModule bCAXCOModule, String str) {
        this.setMax = context;
        this.getMax = bCAXCOModule;
        this.getMin = new getTitleTextView(context, str);
        this.asBinder = str;
        if (str.equals("DEV") || !this.asBinder.equals("PRODUCTION")) {
            this.onTransact = "https://202.6.215.226:41401";
        } else {
            this.onTransact = "https://oneklik.klikbca.com:41404";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.onTransact);
        sb.append("/xco/widget/credentials");
        this.invoke = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.onTransact);
        sb2.append("/xco/widget/credentials");
        this.getCause = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.onTransact);
        sb3.append("/xco/otp");
        this.onNavigationEvent = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.onTransact);
        sb4.append("/xco/merchants");
        this.create = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.onTransact);
        sb5.append("/xco/credentials/limits");
        this.b = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.onTransact);
        sb6.append("/xco/credentials/limits");
        this.ICustomTabsCallback = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(this.onTransact);
        sb7.append("/xco/credentials/details");
        this.extraCallbackWithResult = sb7.toString();
    }

    public class getMin extends AsyncTask<Void, Void, Integer> {
        private String equals;
        private addChildrenForExpandedActionView getMax;
        private String getMin;
        private String length;
        private isChildOrHidden setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return getMin();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            if (shouldLayout.this.setMin.isShowing()) {
                shouldLayout.this.setMin.dismiss();
            }
            if (num == shouldLayout.this.toDoubleRange) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator('.');
                decimalFormatSymbols.setDecimalSeparator(',');
                DecimalFormat decimalFormat = new DecimalFormat("#,###.00", decimalFormatSymbols);
                try {
                    BCAXCOModule bCAXCOModule = shouldLayout.this.getMax;
                    StringBuilder sb = new StringBuilder("Limit harian tidak dapat melebihi limit harian ");
                    sb.append(this.length);
                    sb.append(" sebesar Rp <b>");
                    sb.append(decimalFormat.format(Double.parseDouble(this.equals)));
                    sb.append("</b>");
                    bCAXCOModule.b(sb.toString());
                } catch (Exception unused) {
                    BCAXCOModule bCAXCOModule2 = shouldLayout.this.getMax;
                    StringBuilder sb2 = new StringBuilder("Limit harian tidak dapat melebihi limit harian ");
                    sb2.append(this.length);
                    sb2.append(" sebesar Rp <b>");
                    sb2.append(this.equals);
                    sb2.append("</b>");
                    bCAXCOModule2.b(sb2.toString());
                }
            } else {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        public getMin(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.getMax = addchildrenforexpandedactionview;
            this.setMin = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|74) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = o.shouldLayout.getMax(r4.setMax, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            java.lang.Thread.sleep((long) r4.setMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
            if (isCancelled() != false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
            if (isCancelled() != false) goto L_0x008a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
            r0 = r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0 = r4.setMax.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            java.lang.Thread.sleep((long) r4.setMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
            if (isCancelled() != false) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r0 = r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            java.lang.Thread.sleep((long) r4.setMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
            if (isCancelled() != false) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0 = r4.setMax.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            java.lang.Thread.sleep((long) r4.setMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
            if (isCancelled() != false) goto L_0x00f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r0 = r4.setMax.valueOf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            java.lang.Thread.sleep((long) r4.setMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
            if (isCancelled() != false) goto L_0x0116;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            java.lang.Thread.sleep((long) r4.setMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x012d, code lost:
            if (isCancelled() != false) goto L_0x012f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
            return r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0134, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            return r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r4.setMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x0084, B:37:0x00c4, B:45:0x00e1, B:53:0x00fe] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00fe */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[SYNTHETIC, Splitter:B:37:0x00c4] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1 A[SYNTHETIC, Splitter:B:45:0x00e1] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe A[SYNTHETIC, Splitter:B:53:0x00fe] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x00e1=Splitter:B:45:0x00e1, B:19:0x0084=Splitter:B:19:0x0084, B:37:0x00c4=Splitter:B:37:0x00c4, B:53:0x00fe=Splitter:B:53:0x00fe} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer getMin() {
            /*
                r4 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                r1.<init>()     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                o.shouldLayout r2 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.String r2 = r2.create     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                r1.append(r2)     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.String r2 = "/"
                r1.append(r2)     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                o.isChildOrHidden r2 = r4.setMin     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.String r2 = r2.getMax     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                r1.append(r2)     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.String r1 = r1.toString()     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                o.addChildrenForExpandedActionView r2 = r4.getMax     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                o.isChildOrHidden r3 = r4.setMin     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.String r0 = r0.getMin((java.lang.String) r1, (o.addChildrenForExpandedActionView) r2, (o.isChildOrHidden) r3)     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                java.lang.String r2 = "MerchantName"
                java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                r4.getMin = r2     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                java.lang.String r2 = "ProductName"
                java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                r4.length = r2     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                java.lang.String r2 = "MaxDailyLimit"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                r4.equals = r1     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                java.lang.Integer r0 = r1.toDoubleRange     // Catch:{ Exception -> 0x0062, ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0056 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0056 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0056 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0056 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0056 }
                goto L_0x0061
            L_0x0056:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0061
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0061:
                return r0
            L_0x0062:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x00fe, UnknownHostException -> 0x00e1, SocketTimeoutException -> 0x00c4, Exception -> 0x0084 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0075 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0075 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0075 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0075 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0075 }
                goto L_0x0080
            L_0x0075:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0080
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0080:
                return r0
            L_0x0081:
                r0 = move-exception
                goto L_0x011b
            L_0x0084:
                boolean r0 = r4.isCancelled()     // Catch:{ all -> 0x0081 }
                if (r0 == 0) goto L_0x00a7
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0081 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0081 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x009b }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x009b }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x009b }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x009b }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x009b }
                goto L_0x00a6
            L_0x009b:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00a6
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00a6:
                return r0
            L_0x00a7:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0081 }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x0081 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00b8 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00b8 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00b8 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00b8 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00b8 }
                goto L_0x00c3
            L_0x00b8:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00c3
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00c3:
                return r0
            L_0x00c4:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0081 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0081 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00d5 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00d5 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00d5 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00d5 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00d5 }
                goto L_0x00e0
            L_0x00d5:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00e0
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00e0:
                return r0
            L_0x00e1:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0081 }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x0081 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00f2 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00f2 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00f2 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00f2 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00f2 }
                goto L_0x00fd
            L_0x00f2:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00fd
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00fd:
                return r0
            L_0x00fe:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0081 }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x0081 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x010f }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x010f }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x010f }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x010f }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x010f }
                goto L_0x011a
            L_0x010f:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x011a
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x011a:
                return r0
            L_0x011b:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0128 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0128 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0128 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0128 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0128 }
                goto L_0x0134
            L_0x0128:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0134
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
                return r0
            L_0x0134:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.getMin.getMin():java.lang.Integer");
        }
    }

    public class length extends AsyncTask<Void, Void, Integer> {
        private addChildrenForExpandedActionView getMin;
        private isChildOrHidden length;
        private isChildOrHidden setMax;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return length();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            if (num == shouldLayout.this.toDoubleRange) {
                shouldLayout shouldlayout = shouldLayout.this;
                if (shouldlayout.setMin.isShowing()) {
                    shouldlayout.setMin.dismiss();
                }
                shouldLayout.this.getMax.setResponseCredentialOTPRegistration(this.setMax);
                shouldLayout.this.getMax.setOTPFieldEnabled(true);
                shouldLayout.this.getMax.l();
                shouldLayout.this.getMax.a();
                return;
            }
            if (num == shouldLayout.this.invokeSuspend) {
                shouldLayout shouldlayout2 = shouldLayout.this;
                if (shouldlayout2.setMin.isShowing()) {
                    shouldlayout2.setMin.dismiss();
                }
                shouldLayout.this.getMax.setOTPFieldEnabled(true);
                shouldLayout.this.getMax.l();
                shouldLayout.this.getMax.a();
            } else if (num == shouldLayout.this.FastBitmap$CoordinateSystem) {
                shouldLayout shouldlayout3 = shouldLayout.this;
                if (shouldlayout3.setMin.isShowing()) {
                    shouldlayout3.setMin.dismiss();
                }
                shouldLayout.this.getMax.setOTPFieldEnabled(true);
                shouldLayout.this.getMax.l();
            }
            shouldLayout.getMax(shouldLayout.this, num);
        }

        public length(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.getMin = addchildrenforexpandedactionview;
            this.length = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.setMax = new isChildOrHidden();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|(3:12|13|74)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = o.shouldLayout.getMax(r4.setMin, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
            if (isCancelled() != false) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
            if (isCancelled() != false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
            r0 = r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0 = r4.setMin.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
            if (isCancelled() != false) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r0 = r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
            if (isCancelled() != false) goto L_0x00d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0 = r4.setMin.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
            if (isCancelled() != false) goto L_0x00f1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r0 = r4.setMin.valueOf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
            if (isCancelled() != false) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0125, code lost:
            if (isCancelled() != false) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x012b, code lost:
            return r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            return r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r4.setMin.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x007c, B:37:0x00bc, B:45:0x00d9, B:53:0x00f6] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc A[SYNTHETIC, Splitter:B:37:0x00bc] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9 A[SYNTHETIC, Splitter:B:45:0x00d9] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6 A[SYNTHETIC, Splitter:B:53:0x00f6] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00f6=Splitter:B:53:0x00f6, B:45:0x00d9=Splitter:B:45:0x00d9, B:19:0x007c=Splitter:B:19:0x007c, B:37:0x00bc=Splitter:B:37:0x00bc} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer length() {
            /*
                r4 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                java.lang.String r1 = r1.onNavigationEvent     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                o.addChildrenForExpandedActionView r2 = r4.getMin     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                o.isChildOrHidden r3 = r4.length     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                java.lang.String r0 = r0.setMin(r1, r2, r3)     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                r1.<init>(r0)     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                java.lang.String r3 = "TransactionType"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                r2.hashCode = r3     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                java.lang.String r3 = "XCOID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                r2.equals = r3     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                java.lang.String r3 = "MSISDNID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                r2.IsOverlapping = r3     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                java.lang.String r3 = "MerchantID"
                java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                r2.getMax = r1     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                java.lang.Integer r0 = r1.toDoubleRange     // Catch:{ Exception -> 0x005a, ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x004e }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x004e }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x004e }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x004e }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x004e }
                goto L_0x0059
            L_0x004e:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0059
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0059:
                return r0
            L_0x005a:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x00f6, UnknownHostException -> 0x00d9, SocketTimeoutException -> 0x00bc, Exception -> 0x007c }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x006d }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x006d }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x006d }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x006d }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x006d }
                goto L_0x0078
            L_0x006d:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0078
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0078:
                return r0
            L_0x0079:
                r0 = move-exception
                goto L_0x0113
            L_0x007c:
                boolean r0 = r4.isCancelled()     // Catch:{ all -> 0x0079 }
                if (r0 == 0) goto L_0x009f
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0079 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0079 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0093 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0093 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0093 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0093 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0093 }
                goto L_0x009e
            L_0x0093:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x009e
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x009e:
                return r0
            L_0x009f:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0079 }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x0079 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00b0 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00b0 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00b0 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00b0 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00b0 }
                goto L_0x00bb
            L_0x00b0:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00bb
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00bb:
                return r0
            L_0x00bc:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0079 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0079 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00cd }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00cd }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00cd }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00cd }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00cd }
                goto L_0x00d8
            L_0x00cd:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00d8
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00d8:
                return r0
            L_0x00d9:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0079 }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x0079 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00ea }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00ea }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00ea }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00ea }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00ea }
                goto L_0x00f5
            L_0x00ea:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00f5
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00f5:
                return r0
            L_0x00f6:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0079 }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x0079 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0107 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0107 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0107 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0107 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0107 }
                goto L_0x0112
            L_0x0107:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0112
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0112:
                return r0
            L_0x0113:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0120 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0120 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0120 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0120 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0120 }
                goto L_0x012c
            L_0x0120:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x012c
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
                return r0
            L_0x012c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.length.length():java.lang.Integer");
        }
    }

    public class getMax extends AsyncTask<Void, Void, Integer> {
        private isChildOrHidden getMax;
        private addChildrenForExpandedActionView setMax;
        private isChildOrHidden setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return setMin();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            if (num == shouldLayout.this.toDoubleRange) {
                shouldLayout.this.getMax.setResponseCredentialRequestRegistration(this.setMin);
                shouldLayout.this.getMax.b(3);
                shouldLayout.this.getMax.k();
                shouldLayout.this.getMax.a(1);
                new setMax(this.setMin.toFloatRange).execute(new Void[0]);
            } else if (num == shouldLayout.this.hashCode) {
                shouldLayout shouldlayout = shouldLayout.this;
                if (shouldlayout.setMin.isShowing()) {
                    shouldlayout.setMin.dismiss();
                }
                shouldLayout.this.getMax.a(shouldLayout.this.toIntRange, shouldLayout.this.IsOverlapping, shouldLayout.this.equals, this.setMin.equals);
            } else {
                shouldLayout shouldlayout2 = shouldLayout.this;
                if (shouldlayout2.setMin.isShowing()) {
                    shouldlayout2.setMin.dismiss();
                }
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        public getMax(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.setMax = addchildrenforexpandedactionview;
            this.getMax = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.setMin = new isChildOrHidden();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|(3:20|21|83)) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = o.shouldLayout.getMax(r8.length, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            java.lang.Thread.sleep((long) r8.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c7, code lost:
            if (isCancelled() != false) goto L_0x00c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ce, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
            if (isCancelled() != false) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
            r0 = r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r0 = r8.length.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            java.lang.Thread.sleep((long) r8.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x010a, code lost:
            if (isCancelled() != false) goto L_0x010c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0 = r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            java.lang.Thread.sleep((long) r8.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
            if (isCancelled() != false) goto L_0x0129;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r0 = r8.length.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            java.lang.Thread.sleep((long) r8.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
            if (isCancelled() != false) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            java.lang.Thread.sleep((long) r8.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x017a, code lost:
            if (isCancelled() != false) goto L_0x017c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0180, code lost:
            return r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0182, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            return r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            return r8.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:27:0x00d1, B:45:0x0111, B:53:0x012e, B:61:0x014b] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x012e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x014b */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0111 A[EDGE_INSN: B:45:0x0111->B:46:? ?: BREAK  , SYNTHETIC, Splitter:B:45:0x0111] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x012e A[EDGE_INSN: B:53:0x012e->B:54:? ?: BREAK  , SYNTHETIC, Splitter:B:53:0x012e] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x014b A[EDGE_INSN: B:61:0x014b->B:62:? ?: BREAK  , SYNTHETIC, Splitter:B:61:0x014b] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00d1=Splitter:B:27:0x00d1, B:45:0x0111=Splitter:B:45:0x0111, B:61:0x014b=Splitter:B:61:0x014b, B:53:0x012e=Splitter:B:53:0x012e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer setMin() {
            /*
                r8 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                java.lang.String r1 = r1.getCause     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                o.addChildrenForExpandedActionView r2 = r8.setMax     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                o.isChildOrHidden r3 = r8.getMax     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                java.lang.String r0 = r0.setMax(r1, r2, r3)     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r3 = "XCOID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.equals = r3     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r3 = "MaxLimit"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.getMax(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r3 = "CredentialType"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.length = r3     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r3 = "CredentialNumber"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.setMax = r3     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r3 = "MerchantID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.getMax = r3     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r3 = "CustomerIDMerchant"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.setMin = r3     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.<init>()     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r4 = "MSISDNList"
                java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r1 = 0
            L_0x0067:
                int r4 = r3.length()     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                if (r1 >= r4) goto L_0x008e
                org.json.JSONObject r4 = r3.getJSONObject(r1)     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r5 = "MSISDNData"
                org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.getWrapper r5 = new o.getWrapper     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r6 = "MSISDNID"
                java.lang.String r6 = r4.getString(r6)     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.String r7 = "MSISDN"
                java.lang.String r4 = r4.getString(r7)     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r5.<init>(r6, r4)     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r2.add(r5)     // Catch:{ Exception -> 0x008b, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
            L_0x008b:
                int r1 = r1 + 1
                goto L_0x0067
            L_0x008e:
                o.isChildOrHidden r1 = r8.setMin     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                r1.toFloatRange = r2     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                java.lang.Integer r0 = r1.toDoubleRange     // Catch:{ Exception -> 0x00af, ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00a3 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00a3 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00a3 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00a3 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00a3 }
                goto L_0x00ae
            L_0x00a3:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x00ae
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00ae:
                return r0
            L_0x00af:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x014b, UnknownHostException -> 0x012e, SocketTimeoutException -> 0x0111, Exception -> 0x00d1 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00c2 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00c2 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00c2 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00c2 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00c2 }
                goto L_0x00cd
            L_0x00c2:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x00cd
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00cd:
                return r0
            L_0x00ce:
                r0 = move-exception
                goto L_0x0168
            L_0x00d1:
                boolean r0 = r8.isCancelled()     // Catch:{ all -> 0x00ce }
                if (r0 == 0) goto L_0x00f4
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00ce }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00ce }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00e8 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00e8 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00e8 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00e8 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00e8 }
                goto L_0x00f3
            L_0x00e8:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x00f3
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00f3:
                return r0
            L_0x00f4:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00ce }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x00ce }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0105 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0105 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0105 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0105 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0105 }
                goto L_0x0110
            L_0x0105:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x0110
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0110:
                return r0
            L_0x0111:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00ce }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00ce }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0122 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0122 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0122 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0122 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0122 }
                goto L_0x012d
            L_0x0122:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x012d
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x012d:
                return r0
            L_0x012e:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00ce }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x00ce }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x013f }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x013f }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x013f }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x013f }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x013f }
                goto L_0x014a
            L_0x013f:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x014a
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x014a:
                return r0
            L_0x014b:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00ce }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x00ce }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x015c }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x015c }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x015c }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x015c }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x015c }
                goto L_0x0167
            L_0x015c:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x0167
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0167:
                return r0
            L_0x0168:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0175 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0175 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0175 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0175 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0175 }
                goto L_0x0181
            L_0x0175:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x0181
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
                return r0
            L_0x0181:
                goto L_0x0183
            L_0x0182:
                throw r0
            L_0x0183:
                goto L_0x0182
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.getMax.setMin():java.lang.Integer");
        }
    }

    public class setMin extends AsyncTask<Void, Void, Integer> {
        private addChildrenForExpandedActionView getMax;
        private isChildOrHidden setMax;
        private isChildOrHidden setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return getMin();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            if (num == shouldLayout.this.toDoubleRange) {
                shouldLayout shouldlayout = shouldLayout.this;
                if (shouldlayout.setMin.isShowing()) {
                    shouldlayout.setMin.dismiss();
                }
                shouldLayout.this.getMax.setResponseCredentialDetails(this.setMin);
                shouldLayout.this.getMax.a(this.setMin.setMax, this.setMin.getMin);
                return;
            }
            shouldLayout.getMax(shouldLayout.this, num);
        }

        public setMin(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.getMax = addchildrenforexpandedactionview;
            this.setMax = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.setMin = new isChildOrHidden();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|74) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = o.shouldLayout.getMax(r4.length, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            java.lang.Thread.sleep((long) r4.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x008b, code lost:
            if (isCancelled() != false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
            if (isCancelled() != false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
            r0 = r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0 = r4.length.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            java.lang.Thread.sleep((long) r4.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
            if (isCancelled() != false) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r0 = r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            java.lang.Thread.sleep((long) r4.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00eb, code lost:
            if (isCancelled() != false) goto L_0x00ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0 = r4.length.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            java.lang.Thread.sleep((long) r4.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0108, code lost:
            if (isCancelled() != false) goto L_0x010a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r0 = r4.length.valueOf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            java.lang.Thread.sleep((long) r4.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0125, code lost:
            if (isCancelled() != false) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            java.lang.Thread.sleep((long) r4.length.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x013e, code lost:
            if (isCancelled() != false) goto L_0x0140;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0144, code lost:
            return r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0145, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            return r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r4.length.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x0095, B:37:0x00d5, B:45:0x00f2, B:53:0x010f] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x010f */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5 A[SYNTHETIC, Splitter:B:37:0x00d5] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2 A[SYNTHETIC, Splitter:B:45:0x00f2] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010f A[SYNTHETIC, Splitter:B:53:0x010f] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x00f2=Splitter:B:45:0x00f2, B:19:0x0095=Splitter:B:19:0x0095, B:37:0x00d5=Splitter:B:37:0x00d5, B:53:0x010f=Splitter:B:53:0x010f} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer getMin() {
            /*
                r4 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                r1.<init>()     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                o.shouldLayout r2 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.String r2 = r2.extraCallbackWithResult     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                r1.append(r2)     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.String r2 = "/"
                r1.append(r2)     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.String r2 = r2.equals     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                r1.append(r2)     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.String r1 = r1.toString()     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                o.addChildrenForExpandedActionView r2 = r4.getMax     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                o.isChildOrHidden r3 = r4.setMax     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.String r0 = r0.getMax(r1, r2, r3)     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                o.isChildOrHidden r2 = r4.setMin     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                java.lang.String r3 = "XCOID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                r2.equals = r3     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                o.isChildOrHidden r2 = r4.setMin     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                java.lang.String r3 = "MaxLimit"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                r2.getMax(r3)     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                o.isChildOrHidden r2 = r4.setMin     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                java.lang.String r3 = "CredentialType"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                r2.length = r3     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                o.isChildOrHidden r2 = r4.setMin     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                java.lang.String r3 = "CredentialNumber"
                java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                r2.setMax = r1     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                java.lang.Integer r0 = r1.toDoubleRange     // Catch:{ Exception -> 0x0073, ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0067 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0067 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0067 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0067 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0067 }
                goto L_0x0072
            L_0x0067:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0072
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0072:
                return r0
            L_0x0073:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x010f, UnknownHostException -> 0x00f2, SocketTimeoutException -> 0x00d5, Exception -> 0x0095 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0086 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0086 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0086 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0086 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0086 }
                goto L_0x0091
            L_0x0086:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0091
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0091:
                return r0
            L_0x0092:
                r0 = move-exception
                goto L_0x012c
            L_0x0095:
                boolean r0 = r4.isCancelled()     // Catch:{ all -> 0x0092 }
                if (r0 == 0) goto L_0x00b8
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0092 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0092 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00ac }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00ac }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00ac }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00ac }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00ac }
                goto L_0x00b7
            L_0x00ac:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00b7
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00b7:
                return r0
            L_0x00b8:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0092 }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x0092 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00c9 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00c9 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00c9 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00c9 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00c9 }
                goto L_0x00d4
            L_0x00c9:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00d4
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00d4:
                return r0
            L_0x00d5:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0092 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0092 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00e6 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00e6 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00e6 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00e6 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00e6 }
                goto L_0x00f1
            L_0x00e6:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00f1
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00f1:
                return r0
            L_0x00f2:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0092 }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x0092 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0103 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0103 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0103 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0103 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0103 }
                goto L_0x010e
            L_0x0103:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x010e
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x010e:
                return r0
            L_0x010f:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0092 }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x0092 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0120 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0120 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0120 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0120 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0120 }
                goto L_0x012b
            L_0x0120:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x012b
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x012b:
                return r0
            L_0x012c:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0139 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0139 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0139 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0139 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0139 }
                goto L_0x0145
            L_0x0139:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0145
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
                return r0
            L_0x0145:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.setMin.getMin():java.lang.Integer");
        }
    }

    public class IsOverlapping extends AsyncTask<Void, Void, Integer> {
        private addChildrenForExpandedActionView getMin;
        private isChildOrHidden length;
        private isChildOrHidden setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return length();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            if (num == shouldLayout.this.toDoubleRange) {
                shouldLayout.this.getMax.setResponseCredentialRequestRegistration(this.setMin);
                shouldLayout.this.getMax.b(3);
                shouldLayout.this.getMax.k();
                shouldLayout.this.getMax.a(2);
                new setMax(this.setMin.toFloatRange).execute(new Void[0]);
                return;
            }
            shouldLayout shouldlayout = shouldLayout.this;
            if (shouldlayout.setMin.isShowing()) {
                shouldlayout.setMin.dismiss();
            }
            shouldLayout.getMax(shouldLayout.this, num);
        }

        public IsOverlapping(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.getMin = addchildrenforexpandedactionview;
            this.length = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.setMin = new isChildOrHidden();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|83) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = o.shouldLayout.getMax(r8.getMax, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            java.lang.Thread.sleep((long) r8.getMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a9, code lost:
            if (isCancelled() != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
            if (isCancelled() != false) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
            r0 = r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r0 = r8.getMax.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            java.lang.Thread.sleep((long) r8.getMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
            if (isCancelled() != false) goto L_0x00ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0 = r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            java.lang.Thread.sleep((long) r8.getMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0109, code lost:
            if (isCancelled() != false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r0 = r8.getMax.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            java.lang.Thread.sleep((long) r8.getMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0126, code lost:
            if (isCancelled() != false) goto L_0x0128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            java.lang.Thread.sleep((long) r8.getMax.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x015c, code lost:
            if (isCancelled() != false) goto L_0x015e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0162, code lost:
            return r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0164, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            return r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            return r8.getMax.FastBitmap$CoordinateSystem;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:27:0x00b3, B:45:0x00f3, B:53:0x0110, B:61:0x012d] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0110 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012d */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3 A[EDGE_INSN: B:45:0x00f3->B:46:? ?: BREAK  , SYNTHETIC, Splitter:B:45:0x00f3] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0110 A[EDGE_INSN: B:53:0x0110->B:54:? ?: BREAK  , SYNTHETIC, Splitter:B:53:0x0110] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x012d A[EDGE_INSN: B:61:0x012d->B:62:? ?: BREAK  , SYNTHETIC, Splitter:B:61:0x012d] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x0110=Splitter:B:53:0x0110, B:27:0x00b3=Splitter:B:27:0x00b3, B:45:0x00f3=Splitter:B:45:0x00f3, B:61:0x012d=Splitter:B:61:0x012d} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer length() {
            /*
                r8 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                java.lang.String r1 = r1.b     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                o.addChildrenForExpandedActionView r2 = r8.getMin     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                o.isChildOrHidden r3 = r8.length     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                java.lang.String r0 = r0.toIntRange(r1, r2, r3)     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r3 = "XCOID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r2.equals = r3     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r3 = "MaxLimit"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r2.getMax(r3)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                o.isChildOrHidden r2 = r8.setMin     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r3 = "MerchantID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r2.getMax = r3     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r2.<init>()     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r4 = "MSISDNList"
                java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r1 = 0
            L_0x0049:
                int r4 = r3.length()     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                if (r1 >= r4) goto L_0x0070
                org.json.JSONObject r4 = r3.getJSONObject(r1)     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r5 = "MSISDNData"
                org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                o.getWrapper r5 = new o.getWrapper     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r6 = "MSISDNID"
                java.lang.String r6 = r4.getString(r6)     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.String r7 = "MSISDN"
                java.lang.String r4 = r4.getString(r7)     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r5.<init>(r6, r4)     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r2.add(r5)     // Catch:{ Exception -> 0x006d, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
            L_0x006d:
                int r1 = r1 + 1
                goto L_0x0049
            L_0x0070:
                o.isChildOrHidden r1 = r8.setMin     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                r1.toFloatRange = r2     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                java.lang.Integer r0 = r1.toDoubleRange     // Catch:{ Exception -> 0x0091, ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0085 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0085 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0085 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0085 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0085 }
                goto L_0x0090
            L_0x0085:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x0090
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0090:
                return r0
            L_0x0091:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x012d, UnknownHostException -> 0x0110, SocketTimeoutException -> 0x00f3, Exception -> 0x00b3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00a4 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00a4 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00a4 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00a4 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00a4 }
                goto L_0x00af
            L_0x00a4:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x00af
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00af:
                return r0
            L_0x00b0:
                r0 = move-exception
                goto L_0x014a
            L_0x00b3:
                boolean r0 = r8.isCancelled()     // Catch:{ all -> 0x00b0 }
                if (r0 == 0) goto L_0x00d6
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00b0 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00b0 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00ca }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00ca }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00ca }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00ca }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00ca }
                goto L_0x00d5
            L_0x00ca:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x00d5
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00d5:
                return r0
            L_0x00d6:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00b0 }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x00b0 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00e7 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00e7 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00e7 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00e7 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00e7 }
                goto L_0x00f2
            L_0x00e7:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x00f2
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x00f2:
                return r0
            L_0x00f3:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00b0 }
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00b0 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0104 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0104 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0104 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0104 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0104 }
                goto L_0x010f
            L_0x0104:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x010f
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x010f:
                return r0
            L_0x0110:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00b0 }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x00b0 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0121 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0121 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0121 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0121 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0121 }
                goto L_0x012c
            L_0x0121:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x012c
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x012c:
                return r0
            L_0x012d:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00b0 }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x00b0 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x013e }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x013e }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x013e }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x013e }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x013e }
                goto L_0x0149
            L_0x013e:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x0149
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
            L_0x0149:
                return r0
            L_0x014a:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0157 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0157 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0157 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0157 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0157 }
                goto L_0x0163
            L_0x0157:
                boolean r1 = r8.isCancelled()
                if (r1 == 0) goto L_0x0163
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.FastBitmap$CoordinateSystem
                return r0
            L_0x0163:
                goto L_0x0165
            L_0x0164:
                throw r0
            L_0x0165:
                goto L_0x0164
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.IsOverlapping.length():java.lang.Integer");
        }
    }

    public class equals extends AsyncTask<Void, Void, Integer> {
        private addChildrenForExpandedActionView getMax;
        private isChildOrHidden getMin;
        private isChildOrHidden length;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return getMax();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            shouldLayout shouldlayout = shouldLayout.this;
            if (shouldlayout.setMin.isShowing()) {
                shouldlayout.setMin.dismiss();
            }
            if (num == shouldLayout.this.isInside) {
                shouldLayout.this.getMax.d(shouldLayout.this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_success_registration));
                shouldLayout.this.length.length(this.length.equals, this.length.length, this.length.setMax, this.length.getMin);
                return;
            }
            shouldLayout.getMax(shouldLayout.this, num);
        }

        public equals(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.getMax = addchildrenforexpandedactionview;
            this.getMin = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.length = new isChildOrHidden();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|(4:13|14|15|84)(5:20|21|22|23|87)) */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
            if (r4.setMin.FastBitmap$CoordinateSystem == o.shouldLayout.getMax(r4.setMin, r0)) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
            r0 = r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
            if (isCancelled() != false) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r0 = o.shouldLayout.getMax(r4.setMin, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
            if (isCancelled() != false) goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
            if (isCancelled() != false) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
            r0 = r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            r0 = r4.setMin.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
            if (isCancelled() != false) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r0 = r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fc, code lost:
            if (isCancelled() != false) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            r0 = r4.setMin.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
            if (isCancelled() != false) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            r0 = r4.setMin.valueOf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0136, code lost:
            if (isCancelled() != false) goto L_0x0138;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x014f, code lost:
            if (isCancelled() != false) goto L_0x0151;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0155, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0156, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            return r4.setMin.values;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:29:0x00a6, B:47:0x00e6, B:55:0x0103, B:63:0x0120] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x005b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0103 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0120 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6 A[SYNTHETIC, Splitter:B:47:0x00e6] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0103 A[SYNTHETIC, Splitter:B:55:0x0103] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0120 A[SYNTHETIC, Splitter:B:63:0x0120] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x0120=Splitter:B:63:0x0120, B:55:0x0103=Splitter:B:55:0x0103, B:29:0x00a6=Splitter:B:29:0x00a6, B:47:0x00e6=Splitter:B:47:0x00e6} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer getMax() {
            /*
                r4 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                java.lang.String r1 = r1.invoke     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.addChildrenForExpandedActionView r2 = r4.getMax     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.isChildOrHidden r3 = r4.getMin     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                java.lang.String r0 = r0.length(r1, r2, r3)     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                o.isChildOrHidden r2 = r4.length     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                java.lang.String r3 = "XCOID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                r2.equals = r3     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                o.isChildOrHidden r2 = r4.length     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                java.lang.String r3 = "CredentialType"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                r2.length = r3     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                o.isChildOrHidden r2 = r4.length     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                java.lang.String r3 = "CredentialNumber"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                r2.setMax = r3     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                o.isChildOrHidden r2 = r4.length     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                java.lang.String r3 = "MaxLimit"
                java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                r2.getMax(r1)     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                java.lang.Integer r0 = r1.isInside     // Catch:{ Exception -> 0x005b, ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x004f }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x004f }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x004f }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x004f }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x004f }
                goto L_0x005a
            L_0x004f:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x005a
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x005a:
                return r0
            L_0x005b:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                java.lang.Integer r1 = r1.FastBitmap$CoordinateSystem     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.shouldLayout r2 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                java.lang.Integer r2 = o.shouldLayout.getMax((o.shouldLayout) r2, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                if (r1 != r2) goto L_0x0084
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                java.lang.Integer r0 = r0.values     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0078 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0078 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0078 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0078 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0078 }
                goto L_0x0083
            L_0x0078:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0083
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x0083:
                return r0
            L_0x0084:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x0120, UnknownHostException -> 0x0103, SocketTimeoutException -> 0x00e6, Exception -> 0x00a6 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0097 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0097 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0097 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0097 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0097 }
                goto L_0x00a2
            L_0x0097:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00a2
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x00a2:
                return r0
            L_0x00a3:
                r0 = move-exception
                goto L_0x013d
            L_0x00a6:
                boolean r0 = r4.isCancelled()     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00c9
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00a3 }
                java.lang.Integer r0 = r0.values     // Catch:{ all -> 0x00a3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00bd }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00bd }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00bd }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00bd }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00bd }
                goto L_0x00c8
            L_0x00bd:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00c8
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x00c8:
                return r0
            L_0x00c9:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00a3 }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x00a3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00da }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00da }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00da }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00da }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00da }
                goto L_0x00e5
            L_0x00da:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00e5
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x00e5:
                return r0
            L_0x00e6:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00a3 }
                java.lang.Integer r0 = r0.values     // Catch:{ all -> 0x00a3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00f7 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00f7 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00f7 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00f7 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00f7 }
                goto L_0x0102
            L_0x00f7:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0102
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x0102:
                return r0
            L_0x0103:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00a3 }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x00a3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0114 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0114 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0114 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0114 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0114 }
                goto L_0x011f
            L_0x0114:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x011f
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x011f:
                return r0
            L_0x0120:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x00a3 }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x00a3 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0131 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0131 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0131 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0131 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0131 }
                goto L_0x013c
            L_0x0131:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x013c
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
            L_0x013c:
                return r0
            L_0x013d:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x014a }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x014a }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x014a }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x014a }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x014a }
                goto L_0x0156
            L_0x014a:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0156
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.values
                return r0
            L_0x0156:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.equals.getMax():java.lang.Integer");
        }
    }

    public class toFloatRange extends AsyncTask<Void, Void, Integer> {
        private isChildOrHidden getMax;
        private addChildrenForExpandedActionView getMin;
        private isChildOrHidden setMax;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return getMax();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            Integer num = (Integer) obj;
            super.onCancelled(num);
            if (isCancelled()) {
                shouldLayout.getMax(shouldLayout.this, num);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            super.onPostExecute(num);
            shouldLayout shouldlayout = shouldLayout.this;
            if (shouldlayout.setMin.isShowing()) {
                shouldlayout.setMin.dismiss();
            }
            if (num == shouldLayout.this.isInside) {
                shouldLayout.this.getMax.d(shouldLayout.this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_success_updatelimit));
                shouldLayout.this.length.length(this.setMax.equals, this.setMax.length, this.setMax.setMax, this.setMax.getMin);
                return;
            }
            shouldLayout.getMax(shouldLayout.this, num);
        }

        public toFloatRange(addChildrenForExpandedActionView addchildrenforexpandedactionview, isChildOrHidden ischildorhidden) {
            this.getMin = addchildrenforexpandedactionview;
            this.getMax = ischildorhidden;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.setMax = new isChildOrHidden();
            shouldLayout.getMin(shouldLayout.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.String} */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|(4:13|14|15|84)(5:20|21|22|23|87)) */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
            if (r4.setMin.FastBitmap$CoordinateSystem == o.shouldLayout.getMax(r4.setMin, r0)) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
            r0 = r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
            if (isCancelled() != false) goto L_0x0075;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r0 = o.shouldLayout.getMax(r4.setMin, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
            if (isCancelled() != false) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
            if (isCancelled() != false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
            r0 = r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            r0 = r4.setMin.Grayscale$Algorithm;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
            if (isCancelled() != false) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r0 = r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
            if (isCancelled() != false) goto L_0x00f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            r0 = r4.setMin.toString;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
            if (isCancelled() != false) goto L_0x0111;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            r0 = r4.setMin.valueOf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
            if (isCancelled() != false) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            java.lang.Thread.sleep((long) r4.setMin.toFloatRange.intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0145, code lost:
            if (isCancelled() != false) goto L_0x0147;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x014b, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x014c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            return r4.setMin.Mean$Arithmetic;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            return r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:29:0x009c, B:47:0x00dc, B:55:0x00f9, B:63:0x0116] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00f9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0116 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc A[SYNTHETIC, Splitter:B:47:0x00dc] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00f9 A[SYNTHETIC, Splitter:B:55:0x00f9] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0116 A[SYNTHETIC, Splitter:B:63:0x0116] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x0116=Splitter:B:63:0x0116, B:55:0x00f9=Splitter:B:55:0x00f9, B:29:0x009c=Splitter:B:29:0x009c, B:47:0x00dc=Splitter:B:47:0x00dc} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer getMax() {
            /*
                r4 = this;
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.getTitleTextView r0 = r0.getMin     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                java.lang.String r1 = r1.ICustomTabsCallback     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.addChildrenForExpandedActionView r2 = r4.getMin     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.isChildOrHidden r3 = r4.getMax     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                java.lang.String r0 = r0.equals(r1, r2, r3)     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                java.lang.String r3 = "XCOID"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                r2.equals = r3     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                java.lang.String r3 = "MaxLimit"
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                r2.getMax(r3)     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                o.isChildOrHidden r2 = r4.setMax     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                java.lang.String r3 = "MerchantID"
                java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                r2.getMax = r1     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                java.lang.Integer r0 = r1.isInside     // Catch:{ Exception -> 0x0051, ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0045 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0045 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0045 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0045 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0045 }
                goto L_0x0050
            L_0x0045:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0050
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x0050:
                return r0
            L_0x0051:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                java.lang.Integer r1 = r1.FastBitmap$CoordinateSystem     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.shouldLayout r2 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                java.lang.Integer r2 = o.shouldLayout.getMax((o.shouldLayout) r2, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                if (r1 != r2) goto L_0x007a
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                java.lang.Integer r0 = r0.Mean$Arithmetic     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x006e }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x006e }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x006e }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x006e }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x006e }
                goto L_0x0079
            L_0x006e:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0079
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x0079:
                return r0
            L_0x007a:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                java.lang.Integer r0 = o.shouldLayout.getMax((o.shouldLayout) r1, (java.lang.String) r0)     // Catch:{ ConnectException -> 0x0116, UnknownHostException -> 0x00f9, SocketTimeoutException -> 0x00dc, Exception -> 0x009c }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x008d }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x008d }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x008d }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x008d }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x008d }
                goto L_0x0098
            L_0x008d:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0098
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x0098:
                return r0
            L_0x0099:
                r0 = move-exception
                goto L_0x0133
            L_0x009c:
                boolean r0 = r4.isCancelled()     // Catch:{ all -> 0x0099 }
                if (r0 == 0) goto L_0x00bf
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0099 }
                java.lang.Integer r0 = r0.Mean$Arithmetic     // Catch:{ all -> 0x0099 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00b3 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00b3 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00b3 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00b3 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00b3 }
                goto L_0x00be
            L_0x00b3:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00be
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x00be:
                return r0
            L_0x00bf:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0099 }
                java.lang.Integer r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x0099 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00d0 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00d0 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00d0 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00d0 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00d0 }
                goto L_0x00db
            L_0x00d0:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00db
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x00db:
                return r0
            L_0x00dc:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0099 }
                java.lang.Integer r0 = r0.Mean$Arithmetic     // Catch:{ all -> 0x0099 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x00ed }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x00ed }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x00ed }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00ed }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00ed }
                goto L_0x00f8
            L_0x00ed:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x00f8
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x00f8:
                return r0
            L_0x00f9:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0099 }
                java.lang.Integer r0 = r0.toString     // Catch:{ all -> 0x0099 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x010a }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x010a }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x010a }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x010a }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x010a }
                goto L_0x0115
            L_0x010a:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0115
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x0115:
                return r0
            L_0x0116:
                o.shouldLayout r0 = o.shouldLayout.this     // Catch:{ all -> 0x0099 }
                java.lang.Integer r0 = r0.valueOf     // Catch:{ all -> 0x0099 }
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0127 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0127 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0127 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0127 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0127 }
                goto L_0x0132
            L_0x0127:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x0132
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
            L_0x0132:
                return r0
            L_0x0133:
                o.shouldLayout r1 = o.shouldLayout.this     // Catch:{ InterruptedException -> 0x0140 }
                java.lang.Integer r1 = r1.toFloatRange     // Catch:{ InterruptedException -> 0x0140 }
                int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x0140 }
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0140 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0140 }
                goto L_0x014c
            L_0x0140:
                boolean r1 = r4.isCancelled()
                if (r1 == 0) goto L_0x014c
                o.shouldLayout r0 = o.shouldLayout.this
                java.lang.Integer r0 = r0.Mean$Arithmetic
                return r0
            L_0x014c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.shouldLayout.toFloatRange.getMax():java.lang.Integer");
        }
    }

    class setMax extends AsyncTask<Void, Void, Boolean> {
        private List<getWrapper> setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return setMin();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Boolean) obj);
            shouldLayout.this.getMax.setListPhone(this.setMin);
            shouldLayout shouldlayout = shouldLayout.this;
            if (shouldlayout.setMin.isShowing()) {
                shouldlayout.setMin.dismiss();
            }
        }

        public setMax(List<getWrapper> list) {
            this.setMin = list;
        }

        private static Boolean setMin() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            return Boolean.TRUE;
        }
    }

    static /* synthetic */ void getMin(shouldLayout shouldlayout) {
        ProgressDialog progressDialog = new ProgressDialog(shouldlayout.setMax);
        shouldlayout.setMin = progressDialog;
        progressDialog.setMessage(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_please_wait));
        shouldlayout.setMin.setCancelable(false);
        shouldlayout.setMin.show();
    }

    static /* synthetic */ Integer getMax(shouldLayout shouldlayout, String str) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = new JSONObject(jSONObject.get("ErrorMessage").toString());
        StringBuilder sb = new StringBuilder();
        sb.append(jSONObject.get("ErrorCode"));
        hashMap.put("errorCode", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject2.get(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_message_ind)));
        hashMap.put("errorMessageID", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(jSONObject2.get(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_message_eng)));
        hashMap.put("errorMessageEng", sb3.toString());
        shouldlayout.toIntRange = (String) hashMap.get("errorCode");
        shouldlayout.IsOverlapping = (String) hashMap.get("errorMessageID");
        shouldlayout.equals = (String) hashMap.get("errorMessageEng");
        setPaddingTop.length();
        setPaddingTop.length();
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_009))) {
            return shouldlayout.onMessageChannelReady;
        }
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_001))) {
            return shouldlayout.onRelationshipValidationResult;
        }
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_054))) {
            return shouldlayout.hashCode;
        }
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_007))) {
            return shouldlayout.FastBitmap$CoordinateSystem;
        }
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_011))) {
            return shouldlayout.FastBitmap$CoordinateSystem;
        }
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_072))) {
            return shouldlayout.onPostMessage;
        }
        if (shouldlayout.toIntRange.equals(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_code_mapping_057))) {
            return shouldlayout.invokeSuspend;
        }
        return shouldlayout.extraCallback;
    }

    static /* synthetic */ void getMax(shouldLayout shouldlayout, Integer num) {
        if (shouldlayout.setMin.isShowing()) {
            shouldlayout.setMin.dismiss();
        }
        if (num == shouldlayout.extraCallback) {
            BCAXCOModule bCAXCOModule = shouldlayout.getMax;
            String str = shouldlayout.toIntRange;
            String str2 = shouldlayout.IsOverlapping;
            bCAXCOModule.a(str, str2, str2);
        } else if (num == shouldlayout.toString || num == shouldlayout.valueOf) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_network_failed));
        } else if (num == shouldlayout.FastBitmap$CoordinateSystem) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_timeout));
        } else if (num == shouldlayout.ICustomTabsCallback$Default) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_timeout_token));
        } else if (num == shouldlayout.values) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_timeout_add));
        } else if (num == shouldlayout.Mean$Arithmetic) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_timeout_edit));
        } else if (num == shouldlayout.Grayscale$Algorithm) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_unknown));
        } else if (num == shouldlayout.invokeSuspend) {
            BCAXCOModule bCAXCOModule2 = shouldlayout.getMax;
            String str3 = shouldlayout.toIntRange;
            String str4 = shouldlayout.IsOverlapping;
            bCAXCOModule2.a(str3, str4, str4);
        } else if (num == shouldlayout.onMessageChannelReady) {
            shouldlayout.getMax.e(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_token_expired));
        } else if (num == shouldlayout.onPostMessage) {
            BCAXCOModule bCAXCOModule3 = shouldlayout.getMax;
            String str5 = shouldlayout.toIntRange;
            String str6 = shouldlayout.IsOverlapping;
            bCAXCOModule3.b(str5, str6, str6);
        } else if (num == shouldlayout.onRelationshipValidationResult) {
            shouldlayout.getMax.c(shouldlayout.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_hmac_mismatch));
        }
    }
}
