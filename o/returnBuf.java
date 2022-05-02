package o;

import o.ByteArrayParcelable;
import o.ByteArrayPool;
import o.b;

public final class returnBuf implements getAdapterPosition<ByteArrayPool.AnonymousClass1> {
    private final b.C0007b<ByteArrayParcelable.AnonymousClass1> amcsReferralPageEntityDataProvider;
    private final b.C0007b<poll> defaultReferralPageEntityDataProvider;
    private final b.C0007b<ProcessLock> splitReferralWidgetEntityDataProvider;

    public returnBuf(b.C0007b<ProcessLock> bVar, b.C0007b<ByteArrayParcelable.AnonymousClass1> bVar2, b.C0007b<poll> bVar3) {
        this.splitReferralWidgetEntityDataProvider = bVar;
        this.amcsReferralPageEntityDataProvider = bVar2;
        this.defaultReferralPageEntityDataProvider = bVar3;
    }

    public final ByteArrayPool.AnonymousClass1 get() {
        return newInstance(this.splitReferralWidgetEntityDataProvider.get(), this.amcsReferralPageEntityDataProvider.get(), this.defaultReferralPageEntityDataProvider.get());
    }

    public static returnBuf create(b.C0007b<ProcessLock> bVar, b.C0007b<ByteArrayParcelable.AnonymousClass1> bVar2, b.C0007b<poll> bVar3) {
        return new returnBuf(bVar, bVar2, bVar3);
    }

    public static ByteArrayPool.AnonymousClass1 newInstance(ProcessLock processLock, ByteArrayParcelable.AnonymousClass1 r2, poll poll) {
        return new uncheckItems<getBuf>(processLock, r2, poll) {
            private final ByteArrayParcelable.AnonymousClass1 amcsReferralPageEntityData;
            private final poll defaultReferralPageEntityData;
            private final ProcessLock splitReferralWidgetEntityData;

            {
                this.amcsReferralPageEntityData = r2;
                this.defaultReferralPageEntityData = r3;
                this.splitReferralWidgetEntityData = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public o.getBuf createData(java.lang.String r4) {
                /*
                    r3 = this;
                    int r0 = r4.hashCode()
                    r1 = 2997660(0x2dbd9c, float:4.200616E-39)
                    r2 = 1
                    if (r0 == r1) goto L_0x001a
                    r1 = 103145323(0x625df6b, float:3.1197192E-35)
                    if (r0 == r1) goto L_0x0010
                    goto L_0x0024
                L_0x0010:
                    java.lang.String r0 = "local"
                    boolean r4 = r4.equals(r0)
                    if (r4 == 0) goto L_0x0024
                    r4 = 0
                    goto L_0x0025
                L_0x001a:
                    java.lang.String r0 = "amcs"
                    boolean r4 = r4.equals(r0)
                    if (r4 == 0) goto L_0x0024
                    r4 = 1
                    goto L_0x0025
                L_0x0024:
                    r4 = -1
                L_0x0025:
                    if (r4 == 0) goto L_0x002f
                    if (r4 == r2) goto L_0x002c
                    o.ProcessLock r4 = r3.splitReferralWidgetEntityData
                    return r4
                L_0x002c:
                    o.ByteArrayParcelable$1 r4 = r3.amcsReferralPageEntityData
                    return r4
                L_0x002f:
                    o.poll r4 = r3.defaultReferralPageEntityData
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ByteArrayPool.AnonymousClass1.createData(java.lang.String):o.getBuf");
            }
        };
    }
}
