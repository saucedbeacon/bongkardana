package o;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;
import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;

public abstract class reverseAnimationSpeed {
    static final String DB_NAME = "DB-id.dana.data-production";
    static final onLayout MIGRATION_10_11 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE SecureRecentBankEntity ADD COLUMN prefix TEXT");
        }
    };
    static final onLayout MIGRATION_11_12 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE SecureRecentBankEntity ADD COLUMN transactionCount INTEGER DEFAULT 0 NOT NULL");
            supportSQLiteDatabase.execSQL("ALTER TABLE RecentContactEntity ADD COLUMN transactionCount INTEGER DEFAULT 0 NOT NULL");
        }
    };
    static final onLayout MIGRATION_12_13 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE `SecureRecentBankEntity_backup` (`alias` TEXT,`bankLogo` TEXT ,`bankName` TEXT ,`bankNumber` TEXT ,`instId` TEXT ,`instLocalName` TEXT ,`lastUpdated` INTEGER NOT NULL,`payMethod` TEXT ,`payOption` TEXT ,`recipientName` TEXT ,`senderName` TEXT ,`cardIndexNo` TEXT NOT NULL,`prefix` TEXT ,`transactionCount` INTEGER NOT NULL,PRIMARY KEY(cardIndexNo) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `SecureRecentBankEntity_backup` SELECT alias,bankLogo, bankName, bankNumber, instId, instLocalName, lastUpdated, payMethod, payOption, recipientName, senderName, cardIndexNo, prefix, transactionCount  FROM SecureRecentBankEntity ");
            supportSQLiteDatabase.execSQL("DROP TABLE SecureRecentBankEntity ");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SecureRecentBankEntity` (`alias` TEXT,`bankLogo` TEXT ,`bankName` TEXT ,`bankNumber` TEXT ,`instId` TEXT ,`instLocalName` TEXT ,`lastUpdated` INTEGER NOT NULL,`payMethod` TEXT ,`payOption` TEXT ,`recipientName` TEXT ,`senderName` TEXT ,`cardIndexNo` TEXT NOT NULL,`prefix` TEXT ,`transactionCount` INTEGER NOT NULL,PRIMARY KEY(cardIndexNo) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `SecureRecentBankEntity` SELECT alias,bankLogo, bankName, bankNumber, instId, instLocalName, lastUpdated, payMethod, payOption, recipientName, senderName, cardIndexNo, prefix, transactionCount  FROM SecureRecentBankEntity_backup ");
            supportSQLiteDatabase.execSQL("DROP TABLE SecureRecentBankEntity_backup ");
            supportSQLiteDatabase.execSQL("CREATE TABLE `RecentContactEntity_backup` (`uid` INTEGER NOT NULL,`userId` TEXT ,`userPhoneNumber` TEXT ,`userNickName` TEXT ,`avatar` TEXT ,`lastUpdated` INTEGER NOT NULL,`transactionCount` INTEGER NOT NULL,PRIMARY KEY(uid) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `RecentContactEntity_backup` SELECT uid,userId, userPhoneNumber, userNickName, avatar, lastUpdated, transactionCount  FROM RecentContactEntity ");
            supportSQLiteDatabase.execSQL("DROP TABLE RecentContactEntity ");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentContactEntity` (`uid` INTEGER NOT NULL,`userId` TEXT ,`userPhoneNumber` TEXT ,`userNickName` TEXT ,`avatar` TEXT ,`lastUpdated` INTEGER NOT NULL,`transactionCount` INTEGER NOT NULL,PRIMARY KEY(uid) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `RecentContactEntity` SELECT uid,userId, userPhoneNumber, userNickName, avatar, lastUpdated, transactionCount  FROM RecentContactEntity_backup ");
            supportSQLiteDatabase.execSQL("DROP TABLE RecentContactEntity_backup ");
        }
    };
    static final onLayout MIGRATION_13_14 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE `FollowingItemEntity` ADD COLUMN `username` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE `FollowerItemEntity` ADD COLUMN `username` TEXT NOT NULL DEFAULT ''");
        }
    };
    static final onLayout MIGRATION_14_15 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE `SecureRecentBankEntity` ADD COLUMN `visibleInQuickSend` INTEGER NOT NULL DEFAULT(1)");
            supportSQLiteDatabase.execSQL("ALTER TABLE `RecentContactEntity` ADD COLUMN `visibleInQuickSend` INTEGER NOT NULL DEFAULT(1)");
        }
    };
    static final onLayout MIGRATION_15_16 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE `SecureRecentBankEntity_backup` (`alias` TEXT,`bankLogo` TEXT ,`bankName` TEXT ,`bankNumber` TEXT ,`instId` TEXT ,`instLocalName` TEXT ,`lastUpdated` INTEGER NOT NULL,`payMethod` TEXT ,`payOption` TEXT ,`recipientName` TEXT ,`senderName` TEXT ,`cardIndexNo` TEXT NOT NULL,`prefix` TEXT ,`transactionCount` INTEGER NOT NULL,`visibleInQuickSend` INTEGER NOT NULL DEFAULT(1),PRIMARY KEY(cardIndexNo) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `SecureRecentBankEntity_backup` SELECT alias,bankLogo, bankName, bankNumber, instId, instLocalName, lastUpdated, payMethod, payOption, recipientName, senderName, cardIndexNo, prefix, transactionCount, visibleInQuickSend  FROM SecureRecentBankEntity ");
            supportSQLiteDatabase.execSQL("DROP TABLE SecureRecentBankEntity ");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SecureRecentBankEntity` (`alias` TEXT,`bankLogo` TEXT ,`bankName` TEXT ,`bankNumber` TEXT ,`instId` TEXT ,`instLocalName` TEXT ,`lastUpdated` INTEGER NOT NULL,`payMethod` TEXT ,`payOption` TEXT ,`recipientName` TEXT ,`senderName` TEXT ,`cardIndexNo` TEXT NOT NULL,`prefix` TEXT ,`transactionCount` INTEGER NOT NULL,`visibleInQuickSend` INTEGER NOT NULL DEFAULT(1),PRIMARY KEY(cardIndexNo) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `SecureRecentBankEntity` SELECT alias,bankLogo, bankName, bankNumber, instId, instLocalName, lastUpdated, payMethod, payOption, recipientName, senderName, cardIndexNo, prefix, transactionCount, visibleInQuickSend  FROM SecureRecentBankEntity_backup ");
            supportSQLiteDatabase.execSQL("DROP TABLE SecureRecentBankEntity_backup ");
            supportSQLiteDatabase.execSQL("CREATE TABLE `RecentContactEntity_backup` (`uid` INTEGER NOT NULL,`userId` TEXT ,`userPhoneNumber` TEXT ,`userNickName` TEXT ,`avatar` TEXT ,`lastUpdated` INTEGER NOT NULL,`transactionCount` INTEGER NOT NULL,`visibleInQuickSend` INTEGER NOT NULL DEFAULT(1),PRIMARY KEY(uid) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `RecentContactEntity_backup` SELECT uid,userId, userPhoneNumber, userNickName, avatar, lastUpdated, transactionCount, visibleInQuickSend  FROM RecentContactEntity ");
            supportSQLiteDatabase.execSQL("DROP TABLE RecentContactEntity ");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentContactEntity` (`uid` INTEGER NOT NULL,`userId` TEXT ,`userPhoneNumber` TEXT ,`userNickName` TEXT ,`avatar` TEXT ,`lastUpdated` INTEGER NOT NULL,`transactionCount` INTEGER NOT NULL,`visibleInQuickSend` INTEGER NOT NULL DEFAULT(1),PRIMARY KEY(uid) )");
            supportSQLiteDatabase.execSQL("INSERT INTO `RecentContactEntity` SELECT uid,userId, userPhoneNumber, userNickName, avatar, lastUpdated, transactionCount, visibleInQuickSend  FROM RecentContactEntity_backup ");
            supportSQLiteDatabase.execSQL("DROP TABLE RecentContactEntity_backup ");
        }
    };
    static final onLayout MIGRATION_3_4 = new onLayout() {
        public final void getMin(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `DanaUserContactEntity` (`lastUpdated` INTEGER NOT NULL,`phoneNumber` TEXT,`uid` INTEGER NOT NULL,`userId` TEXT, PRIMARY KEY(uid) )");
            supportSQLiteDatabase.execSQL("ALTER TABLE RecentBankEntity  ADD COLUMN alias TEXT");
        }
    };
    static final onLayout MIGRATION_4_5 = new onLayout() {
        public final void getMin(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SplitBillHistoryEntity` (`uid` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL,`comment` TEXT,`deepLinkUrl` TEXT,`payers` TEXT, PRIMARY KEY(uid) )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentPayerSplitBillEntity` (`uid` INTEGER NOT NULL, `userId` TEXT,`userPhoneNumber` TEXT,`userNickname` TEXT,`avatar` TEXT,`lastUpdated` INTEGER NOT NULL,PRIMARY KEY(uid) )");
        }
    };
    static final onLayout MIGRATION_5_6 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE SplitBillHistoryEntity ADD COLUMN splitBillId TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE SplitBillHistoryEntity ADD COLUMN status TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE SplitBillHistoryEntity ADD COLUMN createdDate INTEGER DEFAULT 0 NOT NULL");
            supportSQLiteDatabase.execSQL("ALTER TABLE SplitBillHistoryEntity ADD COLUMN totalAmount TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE SplitBillHistoryEntity ADD COLUMN payerIndex INTEGER DEFAULT 0 NOT NULL");
            supportSQLiteDatabase.execSQL("ALTER TABLE SplitBillHistoryEntity ADD COLUMN payeeIndex INTEGER DEFAULT 0 NOT NULL");
        }
    };
    static final onLayout MIGRATION_6_7 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE RecentPayerSplitBillEntity ADD COLUMN shownName TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE RecentPayerSplitBillEntity ADD COLUMN shownNumber TEXT");
        }
    };
    static final onLayout MIGRATION_7_8 = new onLayout() {
        public final void getMin(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `FollowerItemEntity` (`userId` TEXT NOT NULL, `loginId` TEXT NOT NULL,`nickName` TEXT NOT NULL,`status` TEXT NOT NULL,`gmtCreate` INTEGER NOT NULL, `gmtModified` INTEGER NOT NULL, `avatar` TEXT,PRIMARY KEY(userId) )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `FollowingItemEntity` (`userId` TEXT NOT NULL, `loginId` TEXT NOT NULL,`nickName` TEXT NOT NULL,`status` TEXT NOT NULL,`gmtCreate` INTEGER NOT NULL, `gmtModified` INTEGER NOT NULL, `avatar` TEXT,PRIMARY KEY(userId) )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RecentPoiEntity` (`poiId` TEXT NOT NULL,`radius` INTEGER NOT NULL,`longitude` REAL NOT NULL,`latitude` REAL NOT NULL,`lastPoiNotified` INTEGER,PRIMARY KEY(poiId) )");
        }
    };
    static final onLayout MIGRATION_9_10 = new onLayout() {
        public final void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SecureRecentBankEntity` (`alias` TEXT,`bankLogo` TEXT ,`bankName` TEXT ,`bankNumber` TEXT ,`count` INTEGER NOT NULL,`instId` TEXT ,`instLocalName` TEXT ,`lastUpdated` INTEGER NOT NULL,`payMethod` TEXT ,`payOption` TEXT ,`recipientName` TEXT ,`senderName` TEXT ,`cardIndexNo` TEXT NOT NULL,PRIMARY KEY(cardIndexNo) )");
        }
    };
    private final Lazy<BasePersistenceDao> persistanceDao;

    public reverseAnimationSpeed(Lazy<BasePersistenceDao> lazy) {
        this.persistanceDao = lazy;
    }

    public BasePersistenceDao getDb() {
        return this.persistanceDao.get();
    }
}
