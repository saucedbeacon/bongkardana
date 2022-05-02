package id.dana.data.base;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.constant.UrlTag;
import id.dana.utils.deeplink.DeepLinkConstant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.ErrId;
import o.InvocationHandlerWrapper;
import o.PerfId;
import o.com_alibaba_ariver_app_api_ExtOpt$76$1;
import o.com_alibaba_ariver_app_api_ExtOpt$77$1;
import o.decide;
import o.exitRemoteDebug;
import o.generateDefaultLayoutParams;
import o.getAnimatedVisibility;
import o.getAuthExecuteResult;
import o.getCanSkipAuth;
import o.hideLoading;
import o.isRemoteDebugMode;
import o.jumpDrawablesToCurrentState;
import o.sendNetworkError;
import o.sendStorage;
import o.setBuildNumber;
import o.setCanSkipAuth;
import o.setOverrideVisibleItems;
import o.setSubtitle;
import o.setSuccessScopes;
import o.showLoading;

public final class BasePersistenceDao_Impl extends BasePersistenceDao {
    private volatile ErrId.ErrCodeWebview _danaUserContactDao;
    private volatile setSuccessScopes _followerDao;
    private volatile setCanSkipAuth _followingDao;
    private volatile showLoading _geofenceDao;
    private volatile com_alibaba_ariver_app_api_ExtOpt$77$1 _loyaltyReceiptDao;
    private volatile decide _recentBankDao;
    private volatile ErrId.ErrValue _recentContactDao;
    private volatile exitRemoteDebug _recentPayerSplitBillDao;
    private volatile isRemoteDebugMode _splitBillHistoryDao;

    public final SupportSQLiteOpenHelper createOpenHelper(setOverrideVisibleItems setoverridevisibleitems) {
        jumpDrawablesToCurrentState jumpdrawablestocurrentstate = new jumpDrawablesToCurrentState(setoverridevisibleitems, new jumpDrawablesToCurrentState.getMin() {
            public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentContactEntity` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `userPhoneNumber` TEXT, `userNickName` TEXT, `avatar` TEXT, `lastUpdated` INTEGER NOT NULL, `transactionCount` INTEGER NOT NULL, `visibleInQuickSend` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentBankEntity` (`alias` TEXT, `bankLogo` TEXT, `bankName` TEXT, `bankNumber` TEXT NOT NULL, `count` INTEGER NOT NULL, `instId` TEXT, `instLocalName` TEXT, `lastUpdated` INTEGER NOT NULL, `payMethod` TEXT, `payOption` TEXT, `recipientName` TEXT, `senderName` TEXT, PRIMARY KEY(`bankNumber`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SecureRecentBankEntity` (`alias` TEXT, `bankLogo` TEXT, `bankName` TEXT, `bankNumber` TEXT, `instId` TEXT, `instLocalName` TEXT, `lastUpdated` INTEGER NOT NULL, `payMethod` TEXT, `payOption` TEXT, `recipientName` TEXT, `senderName` TEXT, `prefix` TEXT, `transactionCount` INTEGER NOT NULL, `visibleInQuickSend` INTEGER NOT NULL, `cardIndexNo` TEXT NOT NULL, PRIMARY KEY(`cardIndexNo`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `DanaUserContactEntity` (`lastUpdated` INTEGER NOT NULL, `phoneNumber` TEXT, `uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SplitBillHistoryEntity` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `comment` TEXT, `deepLinkUrl` TEXT, `payers` TEXT, `lastUpdated` INTEGER NOT NULL, `splitBillId` TEXT, `createdDate` INTEGER NOT NULL, `status` TEXT, `totalAmount` TEXT, `payeeIndex` INTEGER NOT NULL, `payerIndex` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentPayerSplitBillEntity` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `userPhoneNumber` TEXT, `userNickname` TEXT, `avatar` TEXT, `lastUpdated` INTEGER NOT NULL, `shownName` TEXT, `shownNumber` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `FollowerItemEntity` (`userId` TEXT NOT NULL, `loginId` TEXT NOT NULL, `nickName` TEXT NOT NULL, `status` TEXT NOT NULL, `gmtCreate` INTEGER NOT NULL, `gmtModified` INTEGER NOT NULL, `avatar` TEXT, `username` TEXT NOT NULL, PRIMARY KEY(`userId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `FollowingItemEntity` (`userId` TEXT NOT NULL, `loginId` TEXT NOT NULL, `nickName` TEXT NOT NULL, `status` TEXT NOT NULL, `gmtCreate` INTEGER NOT NULL, `gmtModified` INTEGER NOT NULL, `avatar` TEXT, `username` TEXT NOT NULL, PRIMARY KEY(`userId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentPoiEntity` (`poiId` TEXT NOT NULL, `radius` INTEGER NOT NULL, `longitude` REAL NOT NULL, `latitude` REAL NOT NULL, `lastPoiNotified` INTEGER, PRIMARY KEY(`poiId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `LoyaltyReceiptEntity` (`userLoyaltyId` TEXT NOT NULL, `merchantId` TEXT NOT NULL, `orderId` TEXT NOT NULL, `merchantName` TEXT NOT NULL, `orderAmount` TEXT NOT NULL, `timestamp` TEXT NOT NULL, `filePath` TEXT NOT NULL, `rawText` TEXT NOT NULL, PRIMARY KEY(`userLoyaltyId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '771c57edf5e589fcef825378a3b87cfc')");
            }

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `RecentContactEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `RecentBankEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SecureRecentBankEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `DanaUserContactEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SplitBillHistoryEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `RecentPayerSplitBillEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `FollowerItemEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `FollowingItemEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `RecentPoiEntity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `LoyaltyReceiptEntity`");
                if (BasePersistenceDao_Impl.this.mCallbacks != null) {
                    int size = BasePersistenceDao_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        BasePersistenceDao_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (BasePersistenceDao_Impl.this.mCallbacks != null) {
                    int size = BasePersistenceDao_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        BasePersistenceDao_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = BasePersistenceDao_Impl.this.mDatabase = supportSQLiteDatabase;
                BasePersistenceDao_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (BasePersistenceDao_Impl.this.mCallbacks != null) {
                    int size = BasePersistenceDao_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.length) BasePersistenceDao_Impl.this.mCallbacks.get(i)).length(supportSQLiteDatabase);
                    }
                }
            }

            public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                setSubtitle.setMin(supportSQLiteDatabase);
            }

            public final jumpDrawablesToCurrentState.setMax onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                HashMap hashMap = new HashMap(8);
                hashMap.put("uid", new generateDefaultLayoutParams.getMax("uid", "INTEGER", true, 1, (String) null, 1));
                hashMap.put("userId", new generateDefaultLayoutParams.getMax("userId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap.put("userPhoneNumber", new generateDefaultLayoutParams.getMax("userPhoneNumber", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap.put("userNickName", new generateDefaultLayoutParams.getMax("userNickName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap.put("avatar", new generateDefaultLayoutParams.getMax("avatar", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap.put("lastUpdated", new generateDefaultLayoutParams.getMax("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("transactionCount", new generateDefaultLayoutParams.getMax("transactionCount", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("visibleInQuickSend", new generateDefaultLayoutParams.getMax("visibleInQuickSend", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams = new generateDefaultLayoutParams("RecentContactEntity", hashMap, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams2 = new generateDefaultLayoutParams("RecentContactEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "RecentContactEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "RecentContactEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "RecentContactEntity"));
                if (!generatedefaultlayoutparams.equals(generatedefaultlayoutparams2)) {
                    StringBuilder sb = new StringBuilder("RecentContactEntity(id.dana.data.recentcontact.repository.source.persistence.entity.RecentContactEntity).\n Expected:\n");
                    sb.append(generatedefaultlayoutparams);
                    sb.append("\n Found:\n");
                    sb.append(generatedefaultlayoutparams2);
                    return new jumpDrawablesToCurrentState.setMax(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(12);
                hashMap2.put("alias", new generateDefaultLayoutParams.getMax("alias", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap2.put("bankLogo", new generateDefaultLayoutParams.getMax("bankLogo", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap2.put("bankName", new generateDefaultLayoutParams.getMax("bankName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap2.put("bankNumber", new generateDefaultLayoutParams.getMax("bankNumber", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap2.put("count", new generateDefaultLayoutParams.getMax("count", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put(UrlTag.INSTID, new generateDefaultLayoutParams.getMax(UrlTag.INSTID, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj = "avatar";
                hashMap2.put("instLocalName", new generateDefaultLayoutParams.getMax("instLocalName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap2.put("lastUpdated", new generateDefaultLayoutParams.getMax("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                Object obj2 = "userPhoneNumber";
                hashMap2.put("payMethod", new generateDefaultLayoutParams.getMax("payMethod", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj3 = "userId";
                hashMap2.put("payOption", new generateDefaultLayoutParams.getMax("payOption", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj4 = "uid";
                hashMap2.put("recipientName", new generateDefaultLayoutParams.getMax("recipientName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj5 = "visibleInQuickSend";
                hashMap2.put("senderName", new generateDefaultLayoutParams.getMax("senderName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj6 = "transactionCount";
                Object obj7 = "senderName";
                Object obj8 = "recipientName";
                generateDefaultLayoutParams generatedefaultlayoutparams3 = new generateDefaultLayoutParams("RecentBankEntity", hashMap2, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams4 = new generateDefaultLayoutParams("RecentBankEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "RecentBankEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "RecentBankEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "RecentBankEntity"));
                if (!generatedefaultlayoutparams3.equals(generatedefaultlayoutparams4)) {
                    StringBuilder sb2 = new StringBuilder("RecentBankEntity(id.dana.data.recentbank.repository.source.persistance.entity.RecentBankEntity).\n Expected:\n");
                    sb2.append(generatedefaultlayoutparams3);
                    sb2.append("\n Found:\n");
                    sb2.append(generatedefaultlayoutparams4);
                    return new jumpDrawablesToCurrentState.setMax(false, sb2.toString());
                }
                HashMap hashMap3 = new HashMap(15);
                hashMap3.put("alias", new generateDefaultLayoutParams.getMax("alias", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("bankLogo", new generateDefaultLayoutParams.getMax("bankLogo", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("bankName", new generateDefaultLayoutParams.getMax("bankName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("bankNumber", new generateDefaultLayoutParams.getMax("bankNumber", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put(UrlTag.INSTID, new generateDefaultLayoutParams.getMax(UrlTag.INSTID, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("instLocalName", new generateDefaultLayoutParams.getMax("instLocalName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("lastUpdated", new generateDefaultLayoutParams.getMax("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                hashMap3.put("payMethod", new generateDefaultLayoutParams.getMax("payMethod", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("payOption", new generateDefaultLayoutParams.getMax("payOption", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put(obj8, new generateDefaultLayoutParams.getMax("recipientName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put(obj7, new generateDefaultLayoutParams.getMax("senderName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put("prefix", new generateDefaultLayoutParams.getMax("prefix", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap3.put(obj6, new generateDefaultLayoutParams.getMax("transactionCount", "INTEGER", true, 0, (String) null, 1));
                hashMap3.put(obj5, new generateDefaultLayoutParams.getMax("visibleInQuickSend", "INTEGER", true, 0, (String) null, 1));
                hashMap3.put("cardIndexNo", new generateDefaultLayoutParams.getMax("cardIndexNo", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams5 = new generateDefaultLayoutParams("SecureRecentBankEntity", hashMap3, new HashSet(0), new HashSet(0));
                SupportSQLiteDatabase supportSQLiteDatabase3 = supportSQLiteDatabase;
                generateDefaultLayoutParams generatedefaultlayoutparams6 = new generateDefaultLayoutParams("SecureRecentBankEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "SecureRecentBankEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "SecureRecentBankEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "SecureRecentBankEntity"));
                if (!generatedefaultlayoutparams5.equals(generatedefaultlayoutparams6)) {
                    StringBuilder sb3 = new StringBuilder("SecureRecentBankEntity(id.dana.data.recentbank.repository.source.persistance.entity.SecureRecentBankEntity).\n Expected:\n");
                    sb3.append(generatedefaultlayoutparams5);
                    sb3.append("\n Found:\n");
                    sb3.append(generatedefaultlayoutparams6);
                    return new jumpDrawablesToCurrentState.setMax(false, sb3.toString());
                }
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("lastUpdated", new generateDefaultLayoutParams.getMax("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("phoneNumber", new generateDefaultLayoutParams.getMax("phoneNumber", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj9 = obj4;
                hashMap4.put(obj9, new generateDefaultLayoutParams.getMax("uid", "INTEGER", true, 1, (String) null, 1));
                Object obj10 = obj3;
                hashMap4.put(obj10, new generateDefaultLayoutParams.getMax("userId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams7 = new generateDefaultLayoutParams("DanaUserContactEntity", hashMap4, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams8 = new generateDefaultLayoutParams("DanaUserContactEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "DanaUserContactEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "DanaUserContactEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "DanaUserContactEntity"));
                if (!generatedefaultlayoutparams7.equals(generatedefaultlayoutparams8)) {
                    StringBuilder sb4 = new StringBuilder("DanaUserContactEntity(id.dana.data.recentcontact.repository.source.persistence.entity.DanaUserContactEntity).\n Expected:\n");
                    sb4.append(generatedefaultlayoutparams7);
                    sb4.append("\n Found:\n");
                    sb4.append(generatedefaultlayoutparams8);
                    return new jumpDrawablesToCurrentState.setMax(false, sb4.toString());
                }
                HashMap hashMap5 = new HashMap(11);
                hashMap5.put(obj9, new generateDefaultLayoutParams.getMax("uid", "INTEGER", true, 1, (String) null, 1));
                hashMap5.put("comment", new generateDefaultLayoutParams.getMax("comment", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("deepLinkUrl", new generateDefaultLayoutParams.getMax("deepLinkUrl", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("payers", new generateDefaultLayoutParams.getMax("payers", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("lastUpdated", new generateDefaultLayoutParams.getMax("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                hashMap5.put("splitBillId", new generateDefaultLayoutParams.getMax("splitBillId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("createdDate", new generateDefaultLayoutParams.getMax("createdDate", "INTEGER", true, 0, (String) null, 1));
                hashMap5.put("status", new generateDefaultLayoutParams.getMax("status", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("totalAmount", new generateDefaultLayoutParams.getMax("totalAmount", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("payeeIndex", new generateDefaultLayoutParams.getMax("payeeIndex", "INTEGER", true, 0, (String) null, 1));
                hashMap5.put("payerIndex", new generateDefaultLayoutParams.getMax("payerIndex", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams9 = new generateDefaultLayoutParams("SplitBillHistoryEntity", hashMap5, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams10 = new generateDefaultLayoutParams("SplitBillHistoryEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "SplitBillHistoryEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "SplitBillHistoryEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "SplitBillHistoryEntity"));
                if (!generatedefaultlayoutparams9.equals(generatedefaultlayoutparams10)) {
                    StringBuilder sb5 = new StringBuilder("SplitBillHistoryEntity(id.dana.data.splitbill.repository.source.persistence.entity.SplitBillHistoryEntity).\n Expected:\n");
                    sb5.append(generatedefaultlayoutparams9);
                    sb5.append("\n Found:\n");
                    sb5.append(generatedefaultlayoutparams10);
                    return new jumpDrawablesToCurrentState.setMax(false, sb5.toString());
                }
                HashMap hashMap6 = new HashMap(8);
                hashMap6.put(obj9, new generateDefaultLayoutParams.getMax("uid", "INTEGER", true, 1, (String) null, 1));
                hashMap6.put(obj10, new generateDefaultLayoutParams.getMax("userId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap6.put(obj2, new generateDefaultLayoutParams.getMax("userPhoneNumber", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap6.put("userNickname", new generateDefaultLayoutParams.getMax("userNickname", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                Object obj11 = obj;
                hashMap6.put(obj11, new generateDefaultLayoutParams.getMax("avatar", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap6.put("lastUpdated", new generateDefaultLayoutParams.getMax("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                hashMap6.put("shownName", new generateDefaultLayoutParams.getMax("shownName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap6.put("shownNumber", new generateDefaultLayoutParams.getMax("shownNumber", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams11 = new generateDefaultLayoutParams("RecentPayerSplitBillEntity", hashMap6, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams12 = new generateDefaultLayoutParams("RecentPayerSplitBillEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "RecentPayerSplitBillEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "RecentPayerSplitBillEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "RecentPayerSplitBillEntity"));
                if (!generatedefaultlayoutparams11.equals(generatedefaultlayoutparams12)) {
                    StringBuilder sb6 = new StringBuilder("RecentPayerSplitBillEntity(id.dana.data.splitbill.repository.source.persistence.entity.RecentPayerSplitBillEntity).\n Expected:\n");
                    sb6.append(generatedefaultlayoutparams11);
                    sb6.append("\n Found:\n");
                    sb6.append(generatedefaultlayoutparams12);
                    return new jumpDrawablesToCurrentState.setMax(false, sb6.toString());
                }
                HashMap hashMap7 = new HashMap(8);
                hashMap7.put(obj10, new generateDefaultLayoutParams.getMax("userId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap7.put(BranchLinkConstant.Params.LOGIN_ID, new generateDefaultLayoutParams.getMax(BranchLinkConstant.Params.LOGIN_ID, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap7.put("nickName", new generateDefaultLayoutParams.getMax("nickName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap7.put("status", new generateDefaultLayoutParams.getMax("status", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap7.put("gmtCreate", new generateDefaultLayoutParams.getMax("gmtCreate", "INTEGER", true, 0, (String) null, 1));
                hashMap7.put("gmtModified", new generateDefaultLayoutParams.getMax("gmtModified", "INTEGER", true, 0, (String) null, 1));
                hashMap7.put(obj11, new generateDefaultLayoutParams.getMax("avatar", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap7.put(setBuildNumber.USERNAME_KEY, new generateDefaultLayoutParams.getMax(setBuildNumber.USERNAME_KEY, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams13 = new generateDefaultLayoutParams("FollowerItemEntity", hashMap7, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams14 = new generateDefaultLayoutParams("FollowerItemEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "FollowerItemEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "FollowerItemEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "FollowerItemEntity"));
                if (!generatedefaultlayoutparams13.equals(generatedefaultlayoutparams14)) {
                    StringBuilder sb7 = new StringBuilder("FollowerItemEntity(id.dana.data.social.repository.source.persistence.entity.FollowerItemEntity).\n Expected:\n");
                    sb7.append(generatedefaultlayoutparams13);
                    sb7.append("\n Found:\n");
                    sb7.append(generatedefaultlayoutparams14);
                    return new jumpDrawablesToCurrentState.setMax(false, sb7.toString());
                }
                HashMap hashMap8 = new HashMap(8);
                hashMap8.put(obj10, new generateDefaultLayoutParams.getMax("userId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap8.put(BranchLinkConstant.Params.LOGIN_ID, new generateDefaultLayoutParams.getMax(BranchLinkConstant.Params.LOGIN_ID, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap8.put("nickName", new generateDefaultLayoutParams.getMax("nickName", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap8.put("status", new generateDefaultLayoutParams.getMax("status", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap8.put("gmtCreate", new generateDefaultLayoutParams.getMax("gmtCreate", "INTEGER", true, 0, (String) null, 1));
                hashMap8.put("gmtModified", new generateDefaultLayoutParams.getMax("gmtModified", "INTEGER", true, 0, (String) null, 1));
                hashMap8.put(obj11, new generateDefaultLayoutParams.getMax("avatar", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap8.put(setBuildNumber.USERNAME_KEY, new generateDefaultLayoutParams.getMax(setBuildNumber.USERNAME_KEY, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams15 = new generateDefaultLayoutParams("FollowingItemEntity", hashMap8, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams16 = new generateDefaultLayoutParams("FollowingItemEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "FollowingItemEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "FollowingItemEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "FollowingItemEntity"));
                if (!generatedefaultlayoutparams15.equals(generatedefaultlayoutparams16)) {
                    StringBuilder sb8 = new StringBuilder("FollowingItemEntity(id.dana.data.social.repository.source.persistence.entity.FollowingItemEntity).\n Expected:\n");
                    sb8.append(generatedefaultlayoutparams15);
                    sb8.append("\n Found:\n");
                    sb8.append(generatedefaultlayoutparams16);
                    return new jumpDrawablesToCurrentState.setMax(false, sb8.toString());
                }
                HashMap hashMap9 = new HashMap(5);
                hashMap9.put("poiId", new generateDefaultLayoutParams.getMax("poiId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap9.put("radius", new generateDefaultLayoutParams.getMax("radius", "INTEGER", true, 0, (String) null, 1));
                hashMap9.put("longitude", new generateDefaultLayoutParams.getMax("longitude", "REAL", true, 0, (String) null, 1));
                hashMap9.put("latitude", new generateDefaultLayoutParams.getMax("latitude", "REAL", true, 0, (String) null, 1));
                hashMap9.put("lastPoiNotified", new generateDefaultLayoutParams.getMax("lastPoiNotified", "INTEGER", false, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams17 = new generateDefaultLayoutParams("RecentPoiEntity", hashMap9, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams18 = new generateDefaultLayoutParams("RecentPoiEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "RecentPoiEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "RecentPoiEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "RecentPoiEntity"));
                if (!generatedefaultlayoutparams17.equals(generatedefaultlayoutparams18)) {
                    StringBuilder sb9 = new StringBuilder("RecentPoiEntity(id.dana.data.geofence.repository.source.persistence.entity.RecentPoiEntity).\n Expected:\n");
                    sb9.append(generatedefaultlayoutparams17);
                    sb9.append("\n Found:\n");
                    sb9.append(generatedefaultlayoutparams18);
                    return new jumpDrawablesToCurrentState.setMax(false, sb9.toString());
                }
                HashMap hashMap10 = new HashMap(8);
                hashMap10.put("userLoyaltyId", new generateDefaultLayoutParams.getMax("userLoyaltyId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap10.put("merchantId", new generateDefaultLayoutParams.getMax("merchantId", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap10.put(DeepLinkConstant.DeepLinkParams.ORDER_ID, new generateDefaultLayoutParams.getMax(DeepLinkConstant.DeepLinkParams.ORDER_ID, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap10.put(BranchLinkConstant.OauthParams.MERCHANT_NAME, new generateDefaultLayoutParams.getMax(BranchLinkConstant.OauthParams.MERCHANT_NAME, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap10.put("orderAmount", new generateDefaultLayoutParams.getMax("orderAmount", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap10.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, new generateDefaultLayoutParams.getMax(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap10.put("filePath", new generateDefaultLayoutParams.getMax("filePath", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap10.put("rawText", new generateDefaultLayoutParams.getMax("rawText", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams19 = new generateDefaultLayoutParams("LoyaltyReceiptEntity", hashMap10, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams20 = new generateDefaultLayoutParams("LoyaltyReceiptEntity", generateDefaultLayoutParams.length(supportSQLiteDatabase3, "LoyaltyReceiptEntity"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase3, "LoyaltyReceiptEntity"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase3, "LoyaltyReceiptEntity"));
                if (generatedefaultlayoutparams19.equals(generatedefaultlayoutparams20)) {
                    return new jumpDrawablesToCurrentState.setMax(true, (String) null);
                }
                StringBuilder sb10 = new StringBuilder("LoyaltyReceiptEntity(id.dana.data.loyalty.repository.source.local.entity.LoyaltyReceiptEntity).\n Expected:\n");
                sb10.append(generatedefaultlayoutparams19);
                sb10.append("\n Found:\n");
                sb10.append(generatedefaultlayoutparams20);
                return new jumpDrawablesToCurrentState.setMax(false, sb10.toString());
            }
        }, "771c57edf5e589fcef825378a3b87cfc", "de4187df5d1fbfd79f5b4323d732d313");
        SupportSQLiteOpenHelper.Configuration.getMax min = SupportSQLiteOpenHelper.Configuration.setMin(setoverridevisibleitems.getMin);
        min.length = setoverridevisibleitems.length;
        min.getMax = jumpdrawablestocurrentstate;
        return setoverridevisibleitems.setMin.create(min.setMax());
    }

    public final getAnimatedVisibility createInvalidationTracker() {
        return new getAnimatedVisibility(this, new HashMap(0), new HashMap(0), "RecentContactEntity", "RecentBankEntity", "SecureRecentBankEntity", "DanaUserContactEntity", "SplitBillHistoryEntity", "RecentPayerSplitBillEntity", "FollowerItemEntity", "FollowingItemEntity", "RecentPoiEntity", "LoyaltyReceiptEntity");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `RecentContactEntity`");
            writableDatabase.execSQL("DELETE FROM `RecentBankEntity`");
            writableDatabase.execSQL("DELETE FROM `SecureRecentBankEntity`");
            writableDatabase.execSQL("DELETE FROM `DanaUserContactEntity`");
            writableDatabase.execSQL("DELETE FROM `SplitBillHistoryEntity`");
            writableDatabase.execSQL("DELETE FROM `RecentPayerSplitBillEntity`");
            writableDatabase.execSQL("DELETE FROM `FollowerItemEntity`");
            writableDatabase.execSQL("DELETE FROM `FollowingItemEntity`");
            writableDatabase.execSQL("DELETE FROM `RecentPoiEntity`");
            writableDatabase.execSQL("DELETE FROM `LoyaltyReceiptEntity`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ErrId.ErrValue.class, PerfId.getRequiredConverters());
        hashMap.put(decide.class, InvocationHandlerWrapper.getRequiredConverters());
        hashMap.put(ErrId.ErrCodeWebview.class, ErrId.ErrCodeResource.getRequiredConverters());
        hashMap.put(isRemoteDebugMode.class, sendStorage.getRequiredConverters());
        hashMap.put(exitRemoteDebug.class, sendNetworkError.getRequiredConverters());
        hashMap.put(setSuccessScopes.class, getCanSkipAuth.getRequiredConverters());
        hashMap.put(setCanSkipAuth.class, getAuthExecuteResult.getRequiredConverters());
        hashMap.put(showLoading.class, hideLoading.getRequiredConverters());
        hashMap.put(com_alibaba_ariver_app_api_ExtOpt$77$1.class, com_alibaba_ariver_app_api_ExtOpt$76$1.getRequiredConverters());
        return hashMap;
    }

    public final ErrId.ErrValue recentContactDao() {
        ErrId.ErrValue errValue;
        if (this._recentContactDao != null) {
            return this._recentContactDao;
        }
        synchronized (this) {
            if (this._recentContactDao == null) {
                this._recentContactDao = new PerfId(this);
            }
            errValue = this._recentContactDao;
        }
        return errValue;
    }

    public final decide recentBankDao() {
        decide decide;
        if (this._recentBankDao != null) {
            return this._recentBankDao;
        }
        synchronized (this) {
            if (this._recentBankDao == null) {
                this._recentBankDao = new InvocationHandlerWrapper(this);
            }
            decide = this._recentBankDao;
        }
        return decide;
    }

    public final ErrId.ErrCodeWebview danaUserContactDao() {
        ErrId.ErrCodeWebview errCodeWebview;
        if (this._danaUserContactDao != null) {
            return this._danaUserContactDao;
        }
        synchronized (this) {
            if (this._danaUserContactDao == null) {
                this._danaUserContactDao = new ErrId.ErrCodeResource(this);
            }
            errCodeWebview = this._danaUserContactDao;
        }
        return errCodeWebview;
    }

    public final isRemoteDebugMode splitBillHistoryDao() {
        isRemoteDebugMode isremotedebugmode;
        if (this._splitBillHistoryDao != null) {
            return this._splitBillHistoryDao;
        }
        synchronized (this) {
            if (this._splitBillHistoryDao == null) {
                this._splitBillHistoryDao = new sendStorage(this);
            }
            isremotedebugmode = this._splitBillHistoryDao;
        }
        return isremotedebugmode;
    }

    public final exitRemoteDebug recentPayerSplitBillDao() {
        exitRemoteDebug exitremotedebug;
        if (this._recentPayerSplitBillDao != null) {
            return this._recentPayerSplitBillDao;
        }
        synchronized (this) {
            if (this._recentPayerSplitBillDao == null) {
                this._recentPayerSplitBillDao = new sendNetworkError(this);
            }
            exitremotedebug = this._recentPayerSplitBillDao;
        }
        return exitremotedebug;
    }

    public final setSuccessScopes followerDao() {
        setSuccessScopes setsuccessscopes;
        if (this._followerDao != null) {
            return this._followerDao;
        }
        synchronized (this) {
            if (this._followerDao == null) {
                this._followerDao = new getCanSkipAuth(this);
            }
            setsuccessscopes = this._followerDao;
        }
        return setsuccessscopes;
    }

    public final setCanSkipAuth followingDao() {
        setCanSkipAuth setcanskipauth;
        if (this._followingDao != null) {
            return this._followingDao;
        }
        synchronized (this) {
            if (this._followingDao == null) {
                this._followingDao = new getAuthExecuteResult(this);
            }
            setcanskipauth = this._followingDao;
        }
        return setcanskipauth;
    }

    public final showLoading geofenceDao() {
        showLoading showloading;
        if (this._geofenceDao != null) {
            return this._geofenceDao;
        }
        synchronized (this) {
            if (this._geofenceDao == null) {
                this._geofenceDao = new hideLoading(this);
            }
            showloading = this._geofenceDao;
        }
        return showloading;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$77$1 loyaltyReceiptDao() {
        com_alibaba_ariver_app_api_ExtOpt$77$1 com_alibaba_ariver_app_api_extopt_77_1;
        if (this._loyaltyReceiptDao != null) {
            return this._loyaltyReceiptDao;
        }
        synchronized (this) {
            if (this._loyaltyReceiptDao == null) {
                this._loyaltyReceiptDao = new com_alibaba_ariver_app_api_ExtOpt$76$1(this);
            }
            com_alibaba_ariver_app_api_extopt_77_1 = this._loyaltyReceiptDao;
        }
        return com_alibaba_ariver_app_api_extopt_77_1;
    }
}
