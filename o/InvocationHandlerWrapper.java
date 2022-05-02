package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import id.dana.data.constant.UrlTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class InvocationHandlerWrapper implements decide {
    private final RoomDatabase __db;
    private final setHeaderIcon<RemoteNormalExtensionInvoker> __deletionAdapterOfSecureRecentBankEntity;
    private final setHeaderTitle<RemoteNormalExtensionInvoker> __insertionAdapterOfSecureRecentBankEntity;
    private final startActionModeForChild __preparedStmtOfRemoveAllRecentBank;

    public InvocationHandlerWrapper(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSecureRecentBankEntity = new setHeaderTitle<RemoteNormalExtensionInvoker>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `SecureRecentBankEntity` (`alias`,`bankLogo`,`bankName`,`bankNumber`,`instId`,`instLocalName`,`lastUpdated`,`payMethod`,`payOption`,`recipientName`,`senderName`,`prefix`,`transactionCount`,`visibleInQuickSend`,`cardIndexNo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = (RemoteNormalExtensionInvoker) obj;
                if (remoteNormalExtensionInvoker.getAlias() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, remoteNormalExtensionInvoker.getAlias());
                }
                if (remoteNormalExtensionInvoker.getBankLogo() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, remoteNormalExtensionInvoker.getBankLogo());
                }
                if (remoteNormalExtensionInvoker.getBankName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, remoteNormalExtensionInvoker.getBankName());
                }
                if (remoteNormalExtensionInvoker.getBankNumber() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, remoteNormalExtensionInvoker.getBankNumber());
                }
                if (remoteNormalExtensionInvoker.getInstId() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, remoteNormalExtensionInvoker.getInstId());
                }
                if (remoteNormalExtensionInvoker.getInstLocalName() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, remoteNormalExtensionInvoker.getInstLocalName());
                }
                supportSQLiteStatement.bindLong(7, remoteNormalExtensionInvoker.getLastUpdated());
                if (remoteNormalExtensionInvoker.getPayMethod() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, remoteNormalExtensionInvoker.getPayMethod());
                }
                if (remoteNormalExtensionInvoker.getPayOption() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, remoteNormalExtensionInvoker.getPayOption());
                }
                if (remoteNormalExtensionInvoker.getRecipientName() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, remoteNormalExtensionInvoker.getRecipientName());
                }
                if (remoteNormalExtensionInvoker.getSenderName() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, remoteNormalExtensionInvoker.getSenderName());
                }
                if (remoteNormalExtensionInvoker.getPrefix() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, remoteNormalExtensionInvoker.getPrefix());
                }
                supportSQLiteStatement.bindLong(13, (long) remoteNormalExtensionInvoker.getTransactionCount());
                supportSQLiteStatement.bindLong(14, remoteNormalExtensionInvoker.isVisibleInQuickSend() ? 1 : 0);
                if (remoteNormalExtensionInvoker.getCardIndexNo() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, remoteNormalExtensionInvoker.getCardIndexNo());
                }
            }
        };
        this.__deletionAdapterOfSecureRecentBankEntity = new setHeaderIcon<RemoteNormalExtensionInvoker>(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM `SecureRecentBankEntity` WHERE `cardIndexNo` = ?";
            }

            public final /* synthetic */ void setMax(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = (RemoteNormalExtensionInvoker) obj;
                if (remoteNormalExtensionInvoker.getCardIndexNo() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, remoteNormalExtensionInvoker.getCardIndexNo());
                }
            }
        };
        this.__preparedStmtOfRemoveAllRecentBank = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM SecureRecentBankEntity";
            }
        };
    }

    public final Long insertOrUpdateRecentBank(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfSecureRecentBankEntity.insertAndReturnId(remoteNormalExtensionInvoker);
            this.__db.setTransactionSuccessful();
            return Long.valueOf(insertAndReturnId);
        } finally {
            this.__db.endTransaction();
        }
    }

    public final Long[] insertOrUpdateRecentBank(List<RemoteNormalExtensionInvoker> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Long[] insertAndReturnIdsArrayBox = this.__insertionAdapterOfSecureRecentBankEntity.insertAndReturnIdsArrayBox(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsArrayBox;
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void removeSingleRecentBank(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSecureRecentBankEntity.setMin(remoteNormalExtensionInvoker);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void removeAllRecentBank() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfRemoveAllRecentBank.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveAllRecentBank.release(acquire);
        }
    }

    public final List<InvokeException> getOldListRecentBank() {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM RecentBankEntity ORDER BY alias ASC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "alias");
            int max4 = getTitle.setMax(max2, "bankLogo");
            int max5 = getTitle.setMax(max2, "bankName");
            int max6 = getTitle.setMax(max2, "bankNumber");
            int max7 = getTitle.setMax(max2, "count");
            int max8 = getTitle.setMax(max2, UrlTag.INSTID);
            int max9 = getTitle.setMax(max2, "instLocalName");
            int max10 = getTitle.setMax(max2, "lastUpdated");
            int max11 = getTitle.setMax(max2, "payMethod");
            int max12 = getTitle.setMax(max2, "payOption");
            int max13 = getTitle.setMax(max2, "recipientName");
            int max14 = getTitle.setMax(max2, "senderName");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                InvokeException invokeException = new InvokeException();
                String str10 = null;
                if (max2.isNull(max3)) {
                    i = max3;
                    str = null;
                } else {
                    i = max3;
                    str = max2.getString(max3);
                }
                invokeException.setAlias(str);
                if (max2.isNull(max4)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max4);
                }
                invokeException.setBankLogo(str2);
                if (max2.isNull(max5)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max5);
                }
                invokeException.setBankName(str3);
                if (max2.isNull(max6)) {
                    str4 = null;
                } else {
                    str4 = max2.getString(max6);
                }
                invokeException.setBankNumber(str4);
                invokeException.setCount(max2.getInt(max7));
                if (max2.isNull(max8)) {
                    str5 = null;
                } else {
                    str5 = max2.getString(max8);
                }
                invokeException.setInstId(str5);
                if (max2.isNull(max9)) {
                    str6 = null;
                } else {
                    str6 = max2.getString(max9);
                }
                invokeException.setInstLocalName(str6);
                int i2 = max4;
                int i3 = max5;
                invokeException.setLastUpdated(max2.getLong(max10));
                if (max2.isNull(max11)) {
                    str7 = null;
                } else {
                    str7 = max2.getString(max11);
                }
                invokeException.setPayMethod(str7);
                if (max2.isNull(max12)) {
                    str8 = null;
                } else {
                    str8 = max2.getString(max12);
                }
                invokeException.setPayOption(str8);
                if (max2.isNull(max13)) {
                    str9 = null;
                } else {
                    str9 = max2.getString(max13);
                }
                invokeException.setRecipientName(str9);
                if (!max2.isNull(max14)) {
                    str10 = max2.getString(max14);
                }
                invokeException.setSenderName(str10);
                arrayList.add(invokeException);
                max4 = i2;
                max5 = i3;
                max3 = i;
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<RemoteNormalExtensionInvoker> getListRecentBank() {
        setSplitBackground setsplitbackground;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i2;
        boolean z;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM SecureRecentBankEntity ORDER BY alias ASC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "alias");
            int max4 = getTitle.setMax(max2, "bankLogo");
            int max5 = getTitle.setMax(max2, "bankName");
            int max6 = getTitle.setMax(max2, "bankNumber");
            int max7 = getTitle.setMax(max2, UrlTag.INSTID);
            int max8 = getTitle.setMax(max2, "instLocalName");
            int max9 = getTitle.setMax(max2, "lastUpdated");
            int max10 = getTitle.setMax(max2, "payMethod");
            int max11 = getTitle.setMax(max2, "payOption");
            int max12 = getTitle.setMax(max2, "recipientName");
            int max13 = getTitle.setMax(max2, "senderName");
            int max14 = getTitle.setMax(max2, "prefix");
            int max15 = getTitle.setMax(max2, "transactionCount");
            int max16 = getTitle.setMax(max2, "visibleInQuickSend");
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "cardIndexNo");
                int i3 = max16;
                int i4 = max15;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String str12 = null;
                    if (max2.isNull(max17)) {
                        i = max17;
                        str = null;
                    } else {
                        str = max2.getString(max17);
                        i = max17;
                    }
                    RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = new RemoteNormalExtensionInvoker(str);
                    if (max2.isNull(max3)) {
                        str2 = null;
                    } else {
                        str2 = max2.getString(max3);
                    }
                    remoteNormalExtensionInvoker.setAlias(str2);
                    if (max2.isNull(max4)) {
                        str3 = null;
                    } else {
                        str3 = max2.getString(max4);
                    }
                    remoteNormalExtensionInvoker.setBankLogo(str3);
                    if (max2.isNull(max5)) {
                        str4 = null;
                    } else {
                        str4 = max2.getString(max5);
                    }
                    remoteNormalExtensionInvoker.setBankName(str4);
                    if (max2.isNull(max6)) {
                        str5 = null;
                    } else {
                        str5 = max2.getString(max6);
                    }
                    remoteNormalExtensionInvoker.setBankNumber(str5);
                    if (max2.isNull(max7)) {
                        str6 = null;
                    } else {
                        str6 = max2.getString(max7);
                    }
                    remoteNormalExtensionInvoker.setInstId(str6);
                    if (max2.isNull(max8)) {
                        str7 = null;
                    } else {
                        str7 = max2.getString(max8);
                    }
                    remoteNormalExtensionInvoker.setInstLocalName(str7);
                    int i5 = max3;
                    int i6 = max4;
                    remoteNormalExtensionInvoker.setLastUpdated(max2.getLong(max9));
                    if (max2.isNull(max10)) {
                        str8 = null;
                    } else {
                        str8 = max2.getString(max10);
                    }
                    remoteNormalExtensionInvoker.setPayMethod(str8);
                    if (max2.isNull(max11)) {
                        str9 = null;
                    } else {
                        str9 = max2.getString(max11);
                    }
                    remoteNormalExtensionInvoker.setPayOption(str9);
                    if (max2.isNull(max12)) {
                        str10 = null;
                    } else {
                        str10 = max2.getString(max12);
                    }
                    remoteNormalExtensionInvoker.setRecipientName(str10);
                    if (max2.isNull(max13)) {
                        str11 = null;
                    } else {
                        str11 = max2.getString(max13);
                    }
                    remoteNormalExtensionInvoker.setSenderName(str11);
                    if (!max2.isNull(max14)) {
                        str12 = max2.getString(max14);
                    }
                    remoteNormalExtensionInvoker.setPrefix(str12);
                    int i7 = i4;
                    remoteNormalExtensionInvoker.setTransactionCount(max2.getInt(i7));
                    int i8 = i3;
                    if (max2.getInt(i8) != 0) {
                        i2 = i5;
                        z = true;
                    } else {
                        i2 = i5;
                        z = false;
                    }
                    remoteNormalExtensionInvoker.setVisibleInQuickSend(z);
                    arrayList.add(remoteNormalExtensionInvoker);
                    i4 = i7;
                    max3 = i2;
                    max17 = i;
                    i3 = i8;
                    max4 = i6;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<RemoteNormalExtensionInvoker> getListRecentBankByLastUpdate(boolean z) {
        setSplitBackground setsplitbackground;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i2;
        boolean z2;
        boolean z3 = z;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM SecureRecentBankEntity ORDER BY CASE WHEN ? = 1 THEN lastUpdated END ASC,CASE WHEN ? = 0 THEN lastUpdated END DESC", 2);
        max.bindLong(1, z3 ? 1 : 0);
        max.bindLong(2, z3 ? 1 : 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "alias");
            int max4 = getTitle.setMax(max2, "bankLogo");
            int max5 = getTitle.setMax(max2, "bankName");
            int max6 = getTitle.setMax(max2, "bankNumber");
            int max7 = getTitle.setMax(max2, UrlTag.INSTID);
            int max8 = getTitle.setMax(max2, "instLocalName");
            int max9 = getTitle.setMax(max2, "lastUpdated");
            int max10 = getTitle.setMax(max2, "payMethod");
            int max11 = getTitle.setMax(max2, "payOption");
            int max12 = getTitle.setMax(max2, "recipientName");
            int max13 = getTitle.setMax(max2, "senderName");
            int max14 = getTitle.setMax(max2, "prefix");
            int max15 = getTitle.setMax(max2, "transactionCount");
            int max16 = getTitle.setMax(max2, "visibleInQuickSend");
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "cardIndexNo");
                int i3 = max16;
                int i4 = max15;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String str12 = null;
                    if (max2.isNull(max17)) {
                        i = max17;
                        str = null;
                    } else {
                        str = max2.getString(max17);
                        i = max17;
                    }
                    RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = new RemoteNormalExtensionInvoker(str);
                    if (max2.isNull(max3)) {
                        str2 = null;
                    } else {
                        str2 = max2.getString(max3);
                    }
                    remoteNormalExtensionInvoker.setAlias(str2);
                    if (max2.isNull(max4)) {
                        str3 = null;
                    } else {
                        str3 = max2.getString(max4);
                    }
                    remoteNormalExtensionInvoker.setBankLogo(str3);
                    if (max2.isNull(max5)) {
                        str4 = null;
                    } else {
                        str4 = max2.getString(max5);
                    }
                    remoteNormalExtensionInvoker.setBankName(str4);
                    if (max2.isNull(max6)) {
                        str5 = null;
                    } else {
                        str5 = max2.getString(max6);
                    }
                    remoteNormalExtensionInvoker.setBankNumber(str5);
                    if (max2.isNull(max7)) {
                        str6 = null;
                    } else {
                        str6 = max2.getString(max7);
                    }
                    remoteNormalExtensionInvoker.setInstId(str6);
                    if (max2.isNull(max8)) {
                        str7 = null;
                    } else {
                        str7 = max2.getString(max8);
                    }
                    remoteNormalExtensionInvoker.setInstLocalName(str7);
                    int i5 = max4;
                    remoteNormalExtensionInvoker.setLastUpdated(max2.getLong(max9));
                    if (max2.isNull(max10)) {
                        str8 = null;
                    } else {
                        str8 = max2.getString(max10);
                    }
                    remoteNormalExtensionInvoker.setPayMethod(str8);
                    if (max2.isNull(max11)) {
                        str9 = null;
                    } else {
                        str9 = max2.getString(max11);
                    }
                    remoteNormalExtensionInvoker.setPayOption(str9);
                    if (max2.isNull(max12)) {
                        str10 = null;
                    } else {
                        str10 = max2.getString(max12);
                    }
                    remoteNormalExtensionInvoker.setRecipientName(str10);
                    if (max2.isNull(max13)) {
                        str11 = null;
                    } else {
                        str11 = max2.getString(max13);
                    }
                    remoteNormalExtensionInvoker.setSenderName(str11);
                    if (!max2.isNull(max14)) {
                        str12 = max2.getString(max14);
                    }
                    remoteNormalExtensionInvoker.setPrefix(str12);
                    int i6 = i4;
                    remoteNormalExtensionInvoker.setTransactionCount(max2.getInt(i6));
                    int i7 = i3;
                    if (max2.getInt(i7) != 0) {
                        i2 = max3;
                        z2 = true;
                    } else {
                        i2 = max3;
                        z2 = false;
                    }
                    remoteNormalExtensionInvoker.setVisibleInQuickSend(z2);
                    arrayList.add(remoteNormalExtensionInvoker);
                    i4 = i6;
                    max3 = i2;
                    max17 = i;
                    max4 = i5;
                    i3 = i7;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<RemoteNormalExtensionInvoker> getListRecentBankByTransactionCount(boolean z) {
        setSplitBackground setsplitbackground;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i2;
        boolean z2;
        boolean z3 = z;
        setSplitBackground max = setSplitBackground.setMax("SELECT * from SecureRecentBankEntity ORDER BY CASE WHEN ? = 1 THEN transactionCount END ASC, CASE WHEN ? = 0 THEN transactionCount END DESC", 2);
        max.bindLong(1, z3 ? 1 : 0);
        max.bindLong(2, z3 ? 1 : 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "alias");
            int max4 = getTitle.setMax(max2, "bankLogo");
            int max5 = getTitle.setMax(max2, "bankName");
            int max6 = getTitle.setMax(max2, "bankNumber");
            int max7 = getTitle.setMax(max2, UrlTag.INSTID);
            int max8 = getTitle.setMax(max2, "instLocalName");
            int max9 = getTitle.setMax(max2, "lastUpdated");
            int max10 = getTitle.setMax(max2, "payMethod");
            int max11 = getTitle.setMax(max2, "payOption");
            int max12 = getTitle.setMax(max2, "recipientName");
            int max13 = getTitle.setMax(max2, "senderName");
            int max14 = getTitle.setMax(max2, "prefix");
            int max15 = getTitle.setMax(max2, "transactionCount");
            int max16 = getTitle.setMax(max2, "visibleInQuickSend");
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "cardIndexNo");
                int i3 = max16;
                int i4 = max15;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String str12 = null;
                    if (max2.isNull(max17)) {
                        i = max17;
                        str = null;
                    } else {
                        str = max2.getString(max17);
                        i = max17;
                    }
                    RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = new RemoteNormalExtensionInvoker(str);
                    if (max2.isNull(max3)) {
                        str2 = null;
                    } else {
                        str2 = max2.getString(max3);
                    }
                    remoteNormalExtensionInvoker.setAlias(str2);
                    if (max2.isNull(max4)) {
                        str3 = null;
                    } else {
                        str3 = max2.getString(max4);
                    }
                    remoteNormalExtensionInvoker.setBankLogo(str3);
                    if (max2.isNull(max5)) {
                        str4 = null;
                    } else {
                        str4 = max2.getString(max5);
                    }
                    remoteNormalExtensionInvoker.setBankName(str4);
                    if (max2.isNull(max6)) {
                        str5 = null;
                    } else {
                        str5 = max2.getString(max6);
                    }
                    remoteNormalExtensionInvoker.setBankNumber(str5);
                    if (max2.isNull(max7)) {
                        str6 = null;
                    } else {
                        str6 = max2.getString(max7);
                    }
                    remoteNormalExtensionInvoker.setInstId(str6);
                    if (max2.isNull(max8)) {
                        str7 = null;
                    } else {
                        str7 = max2.getString(max8);
                    }
                    remoteNormalExtensionInvoker.setInstLocalName(str7);
                    int i5 = max4;
                    remoteNormalExtensionInvoker.setLastUpdated(max2.getLong(max9));
                    if (max2.isNull(max10)) {
                        str8 = null;
                    } else {
                        str8 = max2.getString(max10);
                    }
                    remoteNormalExtensionInvoker.setPayMethod(str8);
                    if (max2.isNull(max11)) {
                        str9 = null;
                    } else {
                        str9 = max2.getString(max11);
                    }
                    remoteNormalExtensionInvoker.setPayOption(str9);
                    if (max2.isNull(max12)) {
                        str10 = null;
                    } else {
                        str10 = max2.getString(max12);
                    }
                    remoteNormalExtensionInvoker.setRecipientName(str10);
                    if (max2.isNull(max13)) {
                        str11 = null;
                    } else {
                        str11 = max2.getString(max13);
                    }
                    remoteNormalExtensionInvoker.setSenderName(str11);
                    if (!max2.isNull(max14)) {
                        str12 = max2.getString(max14);
                    }
                    remoteNormalExtensionInvoker.setPrefix(str12);
                    int i6 = i4;
                    remoteNormalExtensionInvoker.setTransactionCount(max2.getInt(i6));
                    int i7 = i3;
                    if (max2.getInt(i7) != 0) {
                        i2 = max3;
                        z2 = true;
                    } else {
                        i2 = max3;
                        z2 = false;
                    }
                    remoteNormalExtensionInvoker.setVisibleInQuickSend(z2);
                    arrayList.add(remoteNormalExtensionInvoker);
                    i4 = i6;
                    max3 = i2;
                    max17 = i;
                    max4 = i5;
                    i3 = i7;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<RemoteNormalExtensionInvoker> getListRecentBank(String str, int i) {
        setSplitBackground setsplitbackground;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13 = str;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM SecureRecentBankEntity WHERE alias LIKE '%' || ? || '%' OR bankName LIKE '%' || ? || '%' OR bankNumber LIKE '%' || ? || '%' OR instLocalName LIKE '%' || ? || '%' ORDER BY alias ASC LIMIT ?", 5);
        if (str13 == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str13);
        }
        if (str13 == null) {
            max.bindNull(2);
        } else {
            max.bindString(2, str13);
        }
        if (str13 == null) {
            max.bindNull(3);
        } else {
            max.bindString(3, str13);
        }
        if (str13 == null) {
            max.bindNull(4);
        } else {
            max.bindString(4, str13);
        }
        max.bindLong(5, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "alias");
            int max4 = getTitle.setMax(max2, "bankLogo");
            int max5 = getTitle.setMax(max2, "bankName");
            int max6 = getTitle.setMax(max2, "bankNumber");
            int max7 = getTitle.setMax(max2, UrlTag.INSTID);
            int max8 = getTitle.setMax(max2, "instLocalName");
            int max9 = getTitle.setMax(max2, "lastUpdated");
            int max10 = getTitle.setMax(max2, "payMethod");
            int max11 = getTitle.setMax(max2, "payOption");
            int max12 = getTitle.setMax(max2, "recipientName");
            int max13 = getTitle.setMax(max2, "senderName");
            int max14 = getTitle.setMax(max2, "prefix");
            int max15 = getTitle.setMax(max2, "transactionCount");
            int max16 = getTitle.setMax(max2, "visibleInQuickSend");
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "cardIndexNo");
                int i3 = max16;
                int i4 = max15;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String str14 = null;
                    if (max2.isNull(max17)) {
                        i2 = max17;
                        str2 = null;
                    } else {
                        str2 = max2.getString(max17);
                        i2 = max17;
                    }
                    RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = new RemoteNormalExtensionInvoker(str2);
                    if (max2.isNull(max3)) {
                        str3 = null;
                    } else {
                        str3 = max2.getString(max3);
                    }
                    remoteNormalExtensionInvoker.setAlias(str3);
                    if (max2.isNull(max4)) {
                        str4 = null;
                    } else {
                        str4 = max2.getString(max4);
                    }
                    remoteNormalExtensionInvoker.setBankLogo(str4);
                    if (max2.isNull(max5)) {
                        str5 = null;
                    } else {
                        str5 = max2.getString(max5);
                    }
                    remoteNormalExtensionInvoker.setBankName(str5);
                    if (max2.isNull(max6)) {
                        str6 = null;
                    } else {
                        str6 = max2.getString(max6);
                    }
                    remoteNormalExtensionInvoker.setBankNumber(str6);
                    if (max2.isNull(max7)) {
                        str7 = null;
                    } else {
                        str7 = max2.getString(max7);
                    }
                    remoteNormalExtensionInvoker.setInstId(str7);
                    if (max2.isNull(max8)) {
                        str8 = null;
                    } else {
                        str8 = max2.getString(max8);
                    }
                    remoteNormalExtensionInvoker.setInstLocalName(str8);
                    int i5 = max4;
                    int i6 = max5;
                    remoteNormalExtensionInvoker.setLastUpdated(max2.getLong(max9));
                    if (max2.isNull(max10)) {
                        str9 = null;
                    } else {
                        str9 = max2.getString(max10);
                    }
                    remoteNormalExtensionInvoker.setPayMethod(str9);
                    if (max2.isNull(max11)) {
                        str10 = null;
                    } else {
                        str10 = max2.getString(max11);
                    }
                    remoteNormalExtensionInvoker.setPayOption(str10);
                    if (max2.isNull(max12)) {
                        str11 = null;
                    } else {
                        str11 = max2.getString(max12);
                    }
                    remoteNormalExtensionInvoker.setRecipientName(str11);
                    if (max2.isNull(max13)) {
                        str12 = null;
                    } else {
                        str12 = max2.getString(max13);
                    }
                    remoteNormalExtensionInvoker.setSenderName(str12);
                    if (!max2.isNull(max14)) {
                        str14 = max2.getString(max14);
                    }
                    remoteNormalExtensionInvoker.setPrefix(str14);
                    int i7 = i4;
                    remoteNormalExtensionInvoker.setTransactionCount(max2.getInt(i7));
                    int i8 = i3;
                    int i9 = max3;
                    remoteNormalExtensionInvoker.setVisibleInQuickSend(max2.getInt(i8) != 0);
                    arrayList.add(remoteNormalExtensionInvoker);
                    max3 = i9;
                    i4 = i7;
                    i3 = i8;
                    max17 = i2;
                    max5 = i6;
                    max4 = i5;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
