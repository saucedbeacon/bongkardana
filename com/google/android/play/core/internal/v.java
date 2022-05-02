package com.google.android.play.core.internal;

public abstract class v extends j implements w {
    public v() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            if (r4 == r0) goto L_0x002c
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            com.google.android.play.core.internal.k.a((android.os.Parcel) r5, r4)
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            android.os.IInterface r5 = r4.queryLocalInterface(r2)
            boolean r0 = r5 instanceof com.google.android.play.core.internal.y
            if (r0 == 0) goto L_0x0023
            r1 = r5
            com.google.android.play.core.internal.y r1 = (com.google.android.play.core.internal.y) r1
            goto L_0x0028
        L_0x0023:
            com.google.android.play.core.internal.x r1 = new com.google.android.play.core.internal.x
            r1.<init>(r4)
        L_0x0028:
            r3.a(r1)
            goto L_0x004f
        L_0x002c:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.play.core.internal.k.a((android.os.Parcel) r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.play.core.internal.y
            if (r1 == 0) goto L_0x0047
            r1 = r0
            com.google.android.play.core.internal.y r1 = (com.google.android.play.core.internal.y) r1
            goto L_0x004c
        L_0x0047:
            com.google.android.play.core.internal.x r1 = new com.google.android.play.core.internal.x
            r1.<init>(r5)
        L_0x004c:
            r3.a(r4, r1)
        L_0x004f:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.v.a(int, android.os.Parcel):boolean");
    }
}
