package o;

import android.database.Cursor;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomDatabase;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteStatement;
import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import o.ScheduleExtensionInvoker;
import o.TitleBarRightButtonView;
import o.b;

public final class ErrId implements ScheduleExtensionInvoker.AnonymousClass3 {

    final class ErrCodeJS implements Callable {
        private final ErrCodePermissionForbidden setMax;

        public ErrCodeJS(ErrCodePermissionForbidden errCodePermissionForbidden) {
            this.setMax = errCodePermissionForbidden;
        }

        public final Object call() {
            return this.setMax.lambda$getRecentContact$1();
        }
    }

    final class ErrCodePageAbnormal implements Callable {
        private final DataNode getMin;
        private final ErrCodePermissionForbidden length;

        public ErrCodePageAbnormal(ErrCodePermissionForbidden errCodePermissionForbidden, DataNode dataNode) {
            this.length = errCodePermissionForbidden;
            this.getMin = dataNode;
        }

        public final Object call() {
            return this.length.lambda$saveDanaUserContact$2(this.getMin);
        }
    }

    @Dao
    public interface ErrCodeWebview {
        @Query("SELECT * FROM DanaUserContactEntity WHERE phoneNumber = :phoneNumber")
        DataNode getDanaUserContactEntity(String str);

        @Query("SELECT phoneNumber FROM DanaUserContactEntity")
        List<String> getDanaUserPhoneNumber();

        @Insert
        Long insertDanaUserContact(DataNode dataNode);

        @Update
        int updateDanaUserContact(DataNode dataNode);
    }

    final class ErrCodeWhiteScreen implements Callable {
        private final ErrCodePermissionForbidden setMax;

        public ErrCodeWhiteScreen(ErrCodePermissionForbidden errCodePermissionForbidden) {
            this.setMax = errCodePermissionForbidden;
        }

        public final Object call() {
            return this.setMax.lambda$getDanaUserContact$4();
        }
    }

    @Dao
    public interface ErrValue {
        @Query("SELECT * FROM RecentContactEntity")
        List<NodeAware> getListRecentContact();

        @Query("SELECT * from RecentContactEntity ORDER BY CASE WHEN :isAsc = 1 THEN transactionCount END ASC, CASE WHEN :isAsc = 0 THEN transactionCount END DESC")
        List<NodeAware> getListRecentContactByTransactionCount(boolean z);

        @Query("SELECT * FROM RecentContactEntity WHERE userId = :userId")
        NodeAware getRecentContactByUserId(String str);

        @Query("SELECT * FROM RecentContactEntity ORDER BY lastUpdated DESC LIMIT :maxRecentRecipient")
        List<NodeAware> getSomeRecentContact(int i);

        @Insert
        Long insertRecentContact(NodeAware nodeAware);

        @Query("DELETE FROM RecentContactEntity")
        void removeAllRecentContact();

        @Update
        int updateRecentContact(NodeAware nodeAware);
    }

    final class ErrCodeAppPrepare implements Callable {
        private final ErrId getMax;

        public ErrCodeAppPrepare(ErrId errId) {
            this.getMax = errId;
        }

        public final Object call() {
            return this.getMax.lambda$getRecentContact$1();
        }
    }

    final class ErrCodeJSAPI implements Callable {
        private final ErrCodePermissionForbidden setMax;
        private final int setMin;

        public ErrCodeJSAPI(ErrCodePermissionForbidden errCodePermissionForbidden, int i) {
            this.setMax = errCodePermissionForbidden;
            this.setMin = i;
        }

        public final Object call() {
            return this.setMax.lambda$getRecentContact$3(this.setMin);
        }
    }

    final class ErrCodeNetwork implements Callable {
        private final NodeAware getMin;
        private final ErrCodePermissionForbidden length;

        public ErrCodeNetwork(ErrCodePermissionForbidden errCodePermissionForbidden, NodeAware nodeAware) {
            this.length = errCodePermissionForbidden;
            this.getMin = nodeAware;
        }

        public final Object call() {
            return this.length.lambda$saveRecentContact$0(this.getMin);
        }
    }

    public final void clearAll() {
    }

    public final TitleBarRightButtonView.AnonymousClass1<Long> saveDanaUserContact(DataNode dataNode) {
        return null;
    }

    public final TitleBarRightButtonView.AnonymousClass1<Long> saveRecentContact(NodeAware nodeAware) {
        return null;
    }

    public final class EmbedWebViewType implements getAdapterPosition<SecurityExtensionInvoker> {
        private final b.C0007b<ErrCodePermissionForbidden> persistenceRecentContactEntityDataProvider;

        public EmbedWebViewType(b.C0007b<ErrCodePermissionForbidden> bVar) {
            this.persistenceRecentContactEntityDataProvider = bVar;
        }

        public final SecurityExtensionInvoker get() {
            return newInstance(this.persistenceRecentContactEntityDataProvider.get());
        }

        public static EmbedWebViewType create(b.C0007b<ErrCodePermissionForbidden> bVar) {
            return new EmbedWebViewType(bVar);
        }

        public static SecurityExtensionInvoker newInstance(ErrCodePermissionForbidden errCodePermissionForbidden) {
            return new SecurityExtensionInvoker(errCodePermissionForbidden);
        }
    }

    public final class WhiteScreenSource implements getAdapterPosition<ErrCodePermissionForbidden> {
        private final b.C0007b<BasePersistenceDao> persistenceDaoProvider;

        public WhiteScreenSource(b.C0007b<BasePersistenceDao> bVar) {
            this.persistenceDaoProvider = bVar;
        }

        public final ErrCodePermissionForbidden get() {
            return newInstance(isScrap.getMax(this.persistenceDaoProvider));
        }

        public static WhiteScreenSource create(b.C0007b<BasePersistenceDao> bVar) {
            return new WhiteScreenSource(bVar);
        }

        public static ErrCodePermissionForbidden newInstance(Lazy<BasePersistenceDao> lazy) {
            return new ErrCodePermissionForbidden(lazy);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentContact$0() throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(getMockUpData());
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> getRecentContact() {
        return TitleBarRightButtonView.AnonymousClass1.defer(new Callable(this) {
            private final ErrId getMin;

            public final java.lang.Object call(
/*
Method generation error in method: o.SecurityExtensionInvoker.1.call():java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecurityExtensionInvoker.1.call():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }

    public class ErrCodePermissionForbidden extends reverseAnimationSpeed implements ScheduleExtensionInvoker.AnonymousClass3 {
        private static final String REGEX_PHONE = "^[0-9-]*";

        private boolean isDanaUserContactExist(DataNode dataNode) {
            return dataNode != null;
        }

        private boolean isExist(NodeAware nodeAware) {
            return nodeAware != null;
        }

        @Inject
        public ErrCodePermissionForbidden(Lazy<BasePersistenceDao> lazy) {
            super(lazy);
        }

        public TitleBarRightButtonView.AnonymousClass1<Long> saveRecentContact(NodeAware nodeAware) {
            return TitleBarRightButtonView.AnonymousClass1.defer(new ErrCodeNetwork(this, nodeAware));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentContact$0(NodeAware nodeAware) throws Exception {
            Long l;
            NodeAware singleRecentContact = getSingleRecentContact(nodeAware.getUserId());
            if (!isExist(singleRecentContact)) {
                l = getDb().recentContactDao().insertRecentContact(nodeAware);
            } else {
                l = Long.valueOf((long) getDb().recentContactDao().updateRecentContact(mapper(nodeAware, singleRecentContact)));
            }
            return TitleBarRightButtonView.AnonymousClass1.just(l);
        }

        public TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> getRecentContact() {
            return TitleBarRightButtonView.AnonymousClass1.defer(new ErrCodeJS(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentContact$1() throws Exception {
            List<NodeAware> listRecentContact = getDb().recentContactDao().getListRecentContact();
            if (!listRecentContact.isEmpty()) {
                return TitleBarRightButtonView.AnonymousClass1.just(listRecentContact);
            }
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Empty contact"));
        }

        public TitleBarRightButtonView.AnonymousClass1<Long> saveDanaUserContact(DataNode dataNode) {
            return TitleBarRightButtonView.AnonymousClass1.defer(new ErrCodePageAbnormal(this, dataNode));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveDanaUserContact$2(DataNode dataNode) throws Exception {
            DataNode singleDanaUserRecentContact = getSingleDanaUserRecentContact(dataNode.getPhoneNumber());
            if (isDanaUserContactExist(singleDanaUserRecentContact)) {
                return TitleBarRightButtonView.AnonymousClass1.just(Long.valueOf((long) getDb().danaUserContactDao().updateDanaUserContact(mapper(singleDanaUserRecentContact, dataNode))));
            }
            return TitleBarRightButtonView.AnonymousClass1.just(getDb().danaUserContactDao().insertDanaUserContact(dataNode));
        }

        public TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> getRecentContact(int i) {
            return TitleBarRightButtonView.AnonymousClass1.defer(new ErrCodeJSAPI(this, i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentContact$3(int i) throws Exception {
            return TitleBarRightButtonView.AnonymousClass1.just(getDb().recentContactDao().getSomeRecentContact(i));
        }

        public TitleBarRightButtonView.AnonymousClass1<List<String>> getDanaUserContact() {
            return TitleBarRightButtonView.AnonymousClass1.defer(new ErrCodeWhiteScreen(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getDanaUserContact$4() throws Exception {
            return TitleBarRightButtonView.AnonymousClass1.just(getDb().danaUserContactDao().getDanaUserPhoneNumber());
        }

        public void clearAll() {
            getDb().recentContactDao().removeAllRecentContact();
        }

        private NodeAware getSingleRecentContact(String str) {
            return getDb().recentContactDao().getRecentContactByUserId(str);
        }

        private NodeAware mapper(NodeAware nodeAware, NodeAware nodeAware2) {
            NodeAware nodeAware3 = new NodeAware();
            nodeAware3.setUid(nodeAware2.getUid());
            nodeAware3.setUserId(nodeAware2.getUserId());
            nodeAware3.setUserPhoneNumber(getPhoneNumberWithoutMasking(nodeAware2.getUserPhoneNumber(), nodeAware.getUserPhoneNumber()));
            nodeAware3.setAvatar(nodeAware2.getAvatar());
            nodeAware3.setUserNickName(nodeAware.getUserNickName());
            nodeAware3.setLastUpdated(nodeAware.getLastUpdated());
            nodeAware3.setTransactionCount(nodeAware.getTransactionCount() + 1);
            nodeAware3.setVisibleInQuickSend(nodeAware.isVisibleInQuickSend());
            return nodeAware3;
        }

        private String getPhoneNumberWithoutMasking(String str, String str2) {
            return str.matches(REGEX_PHONE) ? str : str2;
        }

        private DataNode getSingleDanaUserRecentContact(String str) {
            return getDb().danaUserContactDao().getDanaUserContactEntity(str);
        }

        private DataNode mapper(DataNode dataNode, DataNode dataNode2) {
            DataNode dataNode3 = new DataNode();
            dataNode3.setUid(dataNode.getUid());
            dataNode3.setUserId(dataNode2.getUserId());
            dataNode3.setPhoneNumber(dataNode2.getPhoneNumber());
            dataNode3.setLastUpdated(dataNode2.getLastUpdated());
            return dataNode3;
        }
    }

    public final class ErrCodeResource implements ErrCodeWebview {
        private final RoomDatabase __db;
        private final setHeaderTitle<DataNode> __insertionAdapterOfDanaUserContactEntity;
        private final setHeaderIcon<DataNode> __updateAdapterOfDanaUserContactEntity;

        public ErrCodeResource(RoomDatabase roomDatabase) {
            this.__db = roomDatabase;
            this.__insertionAdapterOfDanaUserContactEntity = new setHeaderTitle<DataNode>(roomDatabase) {
                public final String createQuery() {
                    return "INSERT OR ABORT INTO `DanaUserContactEntity` (`lastUpdated`,`phoneNumber`,`uid`,`userId`) VALUES (?,?,nullif(?, 0),?)";
                }

                public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                    DataNode dataNode = (DataNode) obj;
                    supportSQLiteStatement.bindLong(1, dataNode.getLastUpdated());
                    if (dataNode.getPhoneNumber() == null) {
                        supportSQLiteStatement.bindNull(2);
                    } else {
                        supportSQLiteStatement.bindString(2, dataNode.getPhoneNumber());
                    }
                    supportSQLiteStatement.bindLong(3, (long) dataNode.getUid());
                    if (dataNode.getUserId() == null) {
                        supportSQLiteStatement.bindNull(4);
                    } else {
                        supportSQLiteStatement.bindString(4, dataNode.getUserId());
                    }
                }
            };
            this.__updateAdapterOfDanaUserContactEntity = new setHeaderIcon<DataNode>(roomDatabase) {
                public final String createQuery() {
                    return "UPDATE OR ABORT `DanaUserContactEntity` SET `lastUpdated` = ?,`phoneNumber` = ?,`uid` = ?,`userId` = ? WHERE `uid` = ?";
                }

                public final /* synthetic */ void setMax(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                    DataNode dataNode = (DataNode) obj;
                    supportSQLiteStatement.bindLong(1, dataNode.getLastUpdated());
                    if (dataNode.getPhoneNumber() == null) {
                        supportSQLiteStatement.bindNull(2);
                    } else {
                        supportSQLiteStatement.bindString(2, dataNode.getPhoneNumber());
                    }
                    supportSQLiteStatement.bindLong(3, (long) dataNode.getUid());
                    if (dataNode.getUserId() == null) {
                        supportSQLiteStatement.bindNull(4);
                    } else {
                        supportSQLiteStatement.bindString(4, dataNode.getUserId());
                    }
                    supportSQLiteStatement.bindLong(5, (long) dataNode.getUid());
                }
            };
        }

        public final Long insertDanaUserContact(DataNode dataNode) {
            this.__db.assertNotSuspendingTransaction();
            this.__db.beginTransaction();
            try {
                long insertAndReturnId = this.__insertionAdapterOfDanaUserContactEntity.insertAndReturnId(dataNode);
                this.__db.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                this.__db.endTransaction();
            }
        }

        public final int updateDanaUserContact(DataNode dataNode) {
            this.__db.assertNotSuspendingTransaction();
            this.__db.beginTransaction();
            try {
                int min = this.__updateAdapterOfDanaUserContactEntity.setMin(dataNode) + 0;
                this.__db.setTransactionSuccessful();
                return min;
            } finally {
                this.__db.endTransaction();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: o.DataNode} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v3 */
        /* JADX WARNING: type inference failed for: r6v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.DataNode getDanaUserContactEntity(java.lang.String r10) {
            /*
                r9 = this;
                r0 = 1
                java.lang.String r1 = "SELECT * FROM DanaUserContactEntity WHERE phoneNumber = ?"
                o.setSplitBackground r1 = o.setSplitBackground.setMax(r1, r0)
                if (r10 != 0) goto L_0x000d
                r1.bindNull(r0)
                goto L_0x0010
            L_0x000d:
                r1.bindString(r0, r10)
            L_0x0010:
                androidx.room.RoomDatabase r10 = r9.__db
                r10.assertNotSuspendingTransaction()
                androidx.room.RoomDatabase r10 = r9.__db
                r0 = 0
                android.database.Cursor r10 = o.setSubtitle.getMax(r10, r1, r0)
                java.lang.String r0 = "lastUpdated"
                int r0 = o.getTitle.setMax(r10, r0)     // Catch:{ all -> 0x0073 }
                java.lang.String r2 = "phoneNumber"
                int r2 = o.getTitle.setMax(r10, r2)     // Catch:{ all -> 0x0073 }
                java.lang.String r3 = "uid"
                int r3 = o.getTitle.setMax(r10, r3)     // Catch:{ all -> 0x0073 }
                java.lang.String r4 = "userId"
                int r4 = o.getTitle.setMax(r10, r4)     // Catch:{ all -> 0x0073 }
                boolean r5 = r10.moveToFirst()     // Catch:{ all -> 0x0073 }
                r6 = 0
                if (r5 == 0) goto L_0x006c
                o.DataNode r5 = new o.DataNode     // Catch:{ all -> 0x0073 }
                r5.<init>()     // Catch:{ all -> 0x0073 }
                long r7 = r10.getLong(r0)     // Catch:{ all -> 0x0073 }
                r5.setLastUpdated(r7)     // Catch:{ all -> 0x0073 }
                boolean r0 = r10.isNull(r2)     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x004f
                r0 = r6
                goto L_0x0053
            L_0x004f:
                java.lang.String r0 = r10.getString(r2)     // Catch:{ all -> 0x0073 }
            L_0x0053:
                r5.setPhoneNumber(r0)     // Catch:{ all -> 0x0073 }
                int r0 = r10.getInt(r3)     // Catch:{ all -> 0x0073 }
                r5.setUid(r0)     // Catch:{ all -> 0x0073 }
                boolean r0 = r10.isNull(r4)     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x0064
                goto L_0x0068
            L_0x0064:
                java.lang.String r6 = r10.getString(r4)     // Catch:{ all -> 0x0073 }
            L_0x0068:
                r5.setUserId(r6)     // Catch:{ all -> 0x0073 }
                r6 = r5
            L_0x006c:
                r10.close()
                r1.getMin()
                return r6
            L_0x0073:
                r0 = move-exception
                r10.close()
                r1.getMin()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ErrId.ErrCodeResource.getDanaUserContactEntity(java.lang.String):o.DataNode");
        }

        public final List<String> getDanaUserPhoneNumber() {
            String str;
            setSplitBackground max = setSplitBackground.setMax("SELECT phoneNumber FROM DanaUserContactEntity", 0);
            this.__db.assertNotSuspendingTransaction();
            Cursor max2 = setSubtitle.getMax(this.__db, max, false);
            try {
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    if (max2.isNull(0)) {
                        str = null;
                    } else {
                        str = max2.getString(0);
                    }
                    arrayList.add(str);
                }
                return arrayList;
            } finally {
                max2.close();
                max.getMin();
            }
        }

        public static List<Class<?>> getRequiredConverters() {
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentContact$1() throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(getMockUpData());
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> getRecentContact(int i) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new ErrCodeAppPrepare(this));
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getDanaUserContact() {
        return TitleBarRightButtonView.AnonymousClass1.just(new ArrayList());
    }

    private List<NodeAware> getMockUpData() {
        ArrayList arrayList = new ArrayList();
        NodeAware nodeAware = new NodeAware();
        NodeAware nodeAware2 = new NodeAware();
        nodeAware.setLastUpdated(0);
        nodeAware.setAvatar("");
        nodeAware.setUserId("1214322413");
        nodeAware.setUserNickName("Test");
        nodeAware.setUserPhoneNumber("081385361708");
        arrayList.add(nodeAware);
        nodeAware2.setLastUpdated(1);
        nodeAware2.setAvatar("https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        nodeAware2.setUserId("216610000000489176236");
        nodeAware2.setUserNickName("Test lagi");
        nodeAware2.setUserPhoneNumber("6281282458319");
        arrayList.add(nodeAware2);
        arrayList.add(new NodeAware("", "085791476203", "", "", 0, false));
        arrayList.add(new NodeAware("", "081123123123", "", "", 0, false));
        arrayList.add(new NodeAware("", "0811234123412", "", "", 0, false));
        arrayList.add(new NodeAware("", "081234512345", "", "", 0, false));
        arrayList.add(new NodeAware("", "0854321542121", "", "", 0, false));
        arrayList.add(new NodeAware("", "0857914762041", "", "", 0, false));
        arrayList.add(new NodeAware("", "081123123125", "", "", 0, false));
        arrayList.add(new NodeAware("", "0811234123414", "", "", 0, false));
        arrayList.add(new NodeAware("", "0812345123455", "", "", 0, false));
        arrayList.add(new NodeAware("", "0854321542124", "", "", 0, false));
        return arrayList;
    }
}
