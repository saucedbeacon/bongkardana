package o;

import javax.inject.Inject;
import o.H5SecurityUtil;
import o.H5SplitCompatUtils;
import o.TelephonyInfoBridgeExtension;
import o.getCarrierName;

public final class getPhoneNumber implements getCarrierName.length {
    /* access modifiers changed from: private */
    public final TelephonyInfoBridgeExtension.AnonymousClass1 getMin;
    private final H5SplitCompatUtils length;
    private final H5SecurityUtil setMax;
    /* access modifiers changed from: private */
    public final getCarrierName.setMax setMin;

    @Inject
    public getPhoneNumber(getCarrierName.setMax setmax, TelephonyInfoBridgeExtension.AnonymousClass1 r2, H5SecurityUtil h5SecurityUtil, H5SplitCompatUtils h5SplitCompatUtils) {
        this.setMin = setmax;
        this.getMin = r2;
        this.setMax = h5SecurityUtil;
        this.length = h5SplitCompatUtils;
    }

    public final void getMin(int i, String str, String str2) {
        if (str == null) {
            this.setMin.showProgress();
        }
        this.setMax.execute(new GriverAppVirtualHostProxy<HexStringUtil>() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.setPhoneNumber} */
            /* JADX WARNING: type inference failed for: r1v1 */
            /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<o.ContactActivityResultPoint>] */
            /* JADX WARNING: type inference failed for: r1v4 */
            /* JADX WARNING: type inference failed for: r1v5 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onNext(java.lang.Object r9) {
                /*
                    r8 = this;
                    o.HexStringUtil r9 = (o.HexStringUtil) r9
                    o.getPhoneNumber r0 = o.getPhoneNumber.this
                    o.getCarrierName$setMax r0 = r0.setMin
                    r0.dismissProgress()
                    boolean r0 = r9.isSuccess()
                    if (r0 == 0) goto L_0x0090
                    o.getPhoneNumber r0 = o.getPhoneNumber.this
                    o.getCarrierName$setMax r0 = r0.setMin
                    o.getPhoneNumber r1 = o.getPhoneNumber.this
                    o.TelephonyInfoBridgeExtension.AnonymousClass1 unused = r1.getMin
                    r1 = 0
                    if (r9 == 0) goto L_0x008c
                    o.setPhoneNumber r2 = new o.setPhoneNumber
                    r2.<init>()
                    boolean r3 = r9.isHasMore()
                    r2.setMin = r3
                    java.lang.String r3 = r9.getMaxId()
                    r2.getMin = r3
                    java.util.List r9 = r9.getNotifications()
                    if (r9 == 0) goto L_0x0089
                    int r3 = r9.size()
                    if (r3 <= 0) goto L_0x0089
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L_0x0045:
                    boolean r4 = r9.hasNext()
                    if (r4 == 0) goto L_0x0088
                    java.lang.Object r4 = r9.next()
                    o.decodeHex r4 = (o.decodeHex) r4
                    if (r4 == 0) goto L_0x0083
                    o.ContactActivityResultPoint r5 = new o.ContactActivityResultPoint
                    r5.<init>()
                    java.lang.String r6 = r4.getContent()
                    r5.length = r6
                    long r6 = r4.getCreatedTime()
                    r5.getMin = r6
                    java.lang.String r6 = r4.getIconUrl()
                    r5.setMax = r6
                    java.lang.String r6 = r4.getId()
                    r5.getMax = r6
                    boolean r6 = r4.isRead()
                    r5.setMin = r6
                    java.lang.String r6 = r4.getRedirectType()
                    r5.toIntRange = r6
                    java.lang.String r4 = r4.getRedirectValue()
                    r5.IsOverlapping = r4
                    goto L_0x0084
                L_0x0083:
                    r5 = r1
                L_0x0084:
                    r3.add(r5)
                    goto L_0x0045
                L_0x0088:
                    r1 = r3
                L_0x0089:
                    r2.length = r1
                    r1 = r2
                L_0x008c:
                    r0.setMin(r1)
                    return
                L_0x0090:
                    o.getPhoneNumber r0 = o.getPhoneNumber.this
                    o.getCarrierName$setMax r0 = r0.setMin
                    r9.getErrorMessage()
                    r0.getMax()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getPhoneNumber.AnonymousClass1.onNext(java.lang.Object):void");
            }

            public final void onError(Throwable th) {
                getPhoneNumber.this.setMin.dismissProgress();
                getPhoneNumber.this.setMin.onError(th.getMessage());
            }
        }, H5SecurityUtil.getMax.forFetchUserInbox(i, str, str2));
    }

    public final void getMin(String str, final String str2) {
        this.length.execute(new GriverAppVirtualHostProxy<bytesToHexString>() {
            public final /* synthetic */ void onNext(Object obj) {
                bytesToHexString bytestohexstring = (bytesToHexString) obj;
                if (bytestohexstring.isSuccess()) {
                    getCarrierName.setMax unused = getPhoneNumber.this.setMin;
                    return;
                }
                getCarrierName.setMax unused2 = getPhoneNumber.this.setMin;
                bytestohexstring.getErrorMessage();
            }
        }, H5SplitCompatUtils.getMin.forMarkNotificationAsRead(str));
    }

    public final void setMax() {
        this.setMax.dispose();
        this.length.dispose();
    }
}
