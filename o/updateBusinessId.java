package o;

import id.dana.data.sendmoney.model.TransferUserInfoResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"hasDebitPayCardOptions", "", "Lid/dana/domain/sendmoney/model/TransferInit;", "hasKyc", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class updateBusinessId {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o.getIdentifierByteCount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: o.getIdentifierByteCount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.getIdentifierByteCount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: o.getIdentifierByteCount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: o.getIdentifierByteCount} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean setMin(o.getDataFieldCount r9) {
        /*
            java.util.List r9 = r9.getTransferMethod()
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 == 0) goto L_0x00ac
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x000f:
            boolean r3 = r9.hasNext()
            java.lang.String r4 = "it"
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r9.next()
            r5 = r3
            o.BluetoothUuid r5 = (o.BluetoothUuid) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.lang.String r5 = r5.getTransferMethod()
            java.lang.String r6 = "BANK_TRANSFER"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x000f
            goto L_0x002f
        L_0x002e:
            r3 = r1
        L_0x002f:
            o.BluetoothUuid r3 = (o.BluetoothUuid) r3
            if (r3 == 0) goto L_0x00ac
            java.util.List r9 = r3.getPayOptionDTOResponses()
            if (r9 == 0) goto L_0x00ac
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r9 = r9.iterator()
        L_0x0046:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0078
            java.lang.Object r5 = r9.next()
            r6 = r5
            o.getIdentifierByteCount r6 = (o.getIdentifierByteCount) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            java.lang.String r7 = r6.getPayMethod()
            java.lang.String r8 = "DEBIT_CARD"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 != 0) goto L_0x0071
            java.lang.String r6 = r6.getPayMethod()
            java.lang.String r7 = "DIRECT_DEBIT_DEBIT_CARD"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r6 = 0
            goto L_0x0072
        L_0x0071:
            r6 = 1
        L_0x0072:
            if (r6 == 0) goto L_0x0046
            r3.add(r5)
            goto L_0x0046
        L_0x0078:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r9 = r3.iterator()
        L_0x0080:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r9.next()
            r5 = r3
            o.getIdentifierByteCount r5 = (o.getIdentifierByteCount) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            o.UCUtils r5 = r5.getPayMethodView()
            if (r5 == 0) goto L_0x00a1
            java.util.List r5 = r5.getPayCardOptionViews()
            if (r5 == 0) goto L_0x00a1
            int r5 = r5.size()
            goto L_0x00a2
        L_0x00a1:
            r5 = 0
        L_0x00a2:
            if (r5 <= 0) goto L_0x00a6
            r5 = 1
            goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            if (r5 == 0) goto L_0x0080
            r1 = r3
        L_0x00aa:
            o.getIdentifierByteCount r1 = (o.getIdentifierByteCount) r1
        L_0x00ac:
            if (r1 == 0) goto L_0x00af
            return r0
        L_0x00af:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.updateBusinessId.setMin(o.getDataFieldCount):boolean");
    }

    /* access modifiers changed from: private */
    public static final boolean getMin(getDataFieldCount getdatafieldcount) {
        return Intrinsics.areEqual((Object) getdatafieldcount.getKyc(), (Object) "KYC2") || Intrinsics.areEqual((Object) getdatafieldcount.getKyc(), (Object) TransferUserInfoResult.KycLevel.KYC_2);
    }
}
