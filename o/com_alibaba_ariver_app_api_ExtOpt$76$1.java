package o;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

public final class com_alibaba_ariver_app_api_ExtOpt$76$1 implements com_alibaba_ariver_app_api_ExtOpt$77$1 {
    private final RoomDatabase __db;
    private final setHeaderTitle<com_alibaba_ariver_app_api_ExtOpt$80$1> __insertionAdapterOfLoyaltyReceiptEntity;
    private final startActionModeForChild __preparedStmtOfDeleteReceipt;

    public com_alibaba_ariver_app_api_ExtOpt$76$1(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfLoyaltyReceiptEntity = new setHeaderTitle<com_alibaba_ariver_app_api_ExtOpt$80$1>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `LoyaltyReceiptEntity` (`userLoyaltyId`,`merchantId`,`orderId`,`merchantName`,`orderAmount`,`timestamp`,`filePath`,`rawText`) VALUES (?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1 = (com_alibaba_ariver_app_api_ExtOpt$80$1) obj;
                if (com_alibaba_ariver_app_api_extopt_80_1.getUserLoyaltyId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, com_alibaba_ariver_app_api_extopt_80_1.getUserLoyaltyId());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getMerchantId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, com_alibaba_ariver_app_api_extopt_80_1.getMerchantId());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getOrderId() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, com_alibaba_ariver_app_api_extopt_80_1.getOrderId());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getMerchantName() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, com_alibaba_ariver_app_api_extopt_80_1.getMerchantName());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getOrderAmount() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, com_alibaba_ariver_app_api_extopt_80_1.getOrderAmount());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getTimestamp() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, com_alibaba_ariver_app_api_extopt_80_1.getTimestamp());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getFilePath() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, com_alibaba_ariver_app_api_extopt_80_1.getFilePath());
                }
                if (com_alibaba_ariver_app_api_extopt_80_1.getRawText() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, com_alibaba_ariver_app_api_extopt_80_1.getRawText());
                }
            }
        };
        this.__preparedStmtOfDeleteReceipt = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM LoyaltyReceiptEntity WHERE userLoyaltyId = ?";
            }
        };
    }

    public final long insertReceipt(com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfLoyaltyReceiptEntity.insertAndReturnId(com_alibaba_ariver_app_api_extopt_80_1);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    public final int deleteReceipt(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteReceipt.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteReceipt.release(acquire);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: o.com_alibaba_ariver_app_api_ExtOpt$80$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: o.com_alibaba_ariver_app_api_ExtOpt$80$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: o.com_alibaba_ariver_app_api_ExtOpt$80$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: o.com_alibaba_ariver_app_api_ExtOpt$80$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: o.com_alibaba_ariver_app_api_ExtOpt$80$1} */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.com_alibaba_ariver_app_api_ExtOpt$80$1 getReceiptByUserLoyaltyId(java.lang.String r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = 1
            java.lang.String r3 = "SELECT * FROM LoyaltyReceiptEntity WHERE userLoyaltyId = ?"
            o.setSplitBackground r3 = o.setSplitBackground.setMax(r3, r2)
            if (r0 != 0) goto L_0x0011
            r3.bindNull(r2)
            goto L_0x0014
        L_0x0011:
            r3.bindString(r2, r0)
        L_0x0014:
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r2 = 0
            android.database.Cursor r2 = o.setSubtitle.getMax(r0, r3, r2)
            java.lang.String r0 = "userLoyaltyId"
            int r0 = o.getTitle.setMax(r2, r0)     // Catch:{ all -> 0x00d7 }
            java.lang.String r4 = "merchantId"
            int r4 = o.getTitle.setMax(r2, r4)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "orderId"
            int r5 = o.getTitle.setMax(r2, r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r6 = "merchantName"
            int r6 = o.getTitle.setMax(r2, r6)     // Catch:{ all -> 0x00d7 }
            java.lang.String r7 = "orderAmount"
            int r7 = o.getTitle.setMax(r2, r7)     // Catch:{ all -> 0x00d7 }
            java.lang.String r8 = "timestamp"
            int r8 = o.getTitle.setMax(r2, r8)     // Catch:{ all -> 0x00d7 }
            java.lang.String r9 = "filePath"
            int r9 = o.getTitle.setMax(r2, r9)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = "rawText"
            int r10 = o.getTitle.setMax(r2, r10)     // Catch:{ all -> 0x00d7 }
            boolean r11 = r2.moveToFirst()     // Catch:{ all -> 0x00d7 }
            r12 = 0
            if (r11 == 0) goto L_0x00d0
            boolean r11 = r2.isNull(r0)     // Catch:{ all -> 0x00d7 }
            if (r11 == 0) goto L_0x005f
            r14 = r12
            goto L_0x0064
        L_0x005f:
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00d7 }
            r14 = r0
        L_0x0064:
            boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x006c
            r15 = r12
            goto L_0x0071
        L_0x006c:
            java.lang.String r0 = r2.getString(r4)     // Catch:{ all -> 0x00d7 }
            r15 = r0
        L_0x0071:
            boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x007a
            r16 = r12
            goto L_0x0080
        L_0x007a:
            java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00d7 }
            r16 = r0
        L_0x0080:
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0089
            r17 = r12
            goto L_0x008f
        L_0x0089:
            java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00d7 }
            r17 = r0
        L_0x008f:
            boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0098
            r18 = r12
            goto L_0x009e
        L_0x0098:
            java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00d7 }
            r18 = r0
        L_0x009e:
            boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00a7
            r19 = r12
            goto L_0x00ad
        L_0x00a7:
            java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x00d7 }
            r19 = r0
        L_0x00ad:
            boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00b6
            r20 = r12
            goto L_0x00bc
        L_0x00b6:
            java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x00d7 }
            r20 = r0
        L_0x00bc:
            boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00c5
        L_0x00c2:
            r21 = r12
            goto L_0x00ca
        L_0x00c5:
            java.lang.String r12 = r2.getString(r10)     // Catch:{ all -> 0x00d7 }
            goto L_0x00c2
        L_0x00ca:
            o.com_alibaba_ariver_app_api_ExtOpt$80$1 r12 = new o.com_alibaba_ariver_app_api_ExtOpt$80$1     // Catch:{ all -> 0x00d7 }
            r13 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00d7 }
        L_0x00d0:
            r2.close()
            r3.getMin()
            return r12
        L_0x00d7:
            r0 = move-exception
            r2.close()
            r3.getMin()
            goto L_0x00e0
        L_0x00df:
            throw r0
        L_0x00e0:
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: o.com_alibaba_ariver_app_api_ExtOpt$76$1.getReceiptByUserLoyaltyId(java.lang.String):o.com_alibaba_ariver_app_api_ExtOpt$80$1");
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
