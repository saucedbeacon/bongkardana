package com.alibaba.griver.base.resource.appcenter.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.resource.appcenter.storage.AppInfoDao;
import com.alibaba.griver.api.resource.appcenter.storage.GriverAppStorageProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverAppSQLiteStorage implements GriverAppStorageProxy {

    /* renamed from: a  reason: collision with root package name */
    private GriverAbstractDBHelper f9170a;
    private SQLiteDatabase b;

    public GriverAppSQLiteStorage(GriverAbstractDBHelper griverAbstractDBHelper) {
        this.f9170a = griverAbstractDBHelper;
        this.b = griverAbstractDBHelper.getWritableDatabase();
    }

    public boolean insertOrUpdateInfo(AppInfoDao appInfoDao) {
        if (this.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            AppInfoDao selectAppInfo = selectAppInfo(appInfoDao.getAppId(), appInfoDao.getVersion());
            ContentValues contentValues = new ContentValues();
            contentValues.put("appId", appInfoDao.getAppId());
            contentValues.put("version", appInfoDao.getVersion());
            contentValues.put("appInfo", JSON.toJSONString(appInfoDao.getAppInfo()));
            contentValues.put(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            if (selectAppInfo == null) {
                StringBuilder sb = new StringBuilder("insert app info appId ");
                sb.append(appInfoDao.getAppId());
                sb.append(" version: ");
                sb.append(appInfoDao.getVersion());
                GriverLogger.d("GriverAppSQLiteStorage", sb.toString());
                this.b.insert(this.f9170a.getTableName(), (String) null, contentValues);
            } else {
                StringBuilder sb2 = new StringBuilder("update app info appId ");
                sb2.append(appInfoDao.getAppId());
                sb2.append(" version: ");
                sb2.append(appInfoDao.getVersion());
                GriverLogger.d("GriverAppSQLiteStorage", sb2.toString());
                this.b.update(this.f9170a.getTableName(), contentValues, "appId=? and version=?", new String[]{appInfoDao.getAppId(), appInfoDao.getVersion()});
            }
            StringBuilder sb3 = new StringBuilder("insert or update app for ");
            sb3.append(appInfoDao.getAppId());
            sb3.append(" version: ");
            sb3.append(appInfoDao.getVersion());
            sb3.append(" success cost: ");
            sb3.append(System.currentTimeMillis() - currentTimeMillis);
            GriverLogger.d("GriverAppSQLiteStorage", sb3.toString());
            return true;
        }
        GriverLogger.w("GriverAppSQLiteStorage", "sqlite database is not ready, do nothing");
        return false;
    }

    public boolean insertOrUpdateInfo(List<AppInfoDao> list) {
        if (this.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (AppInfoDao insertOrUpdateInfo : list) {
                insertOrUpdateInfo(insertOrUpdateInfo);
            }
            StringBuilder sb = new StringBuilder("insert all success cost: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            GriverLogger.d("GriverAppSQLiteStorage", sb.toString());
            return true;
        }
        GriverLogger.w("GriverAppSQLiteStorage", "sqlite database is not ready, do nothing");
        return false;
    }

    public boolean deleteAppInfo(AppInfoDao appInfoDao) {
        if (this.b != null) {
            StringBuilder sb = new StringBuilder("delete app with appId: ");
            sb.append(appInfoDao.getAppId());
            sb.append(" version: ");
            sb.append(appInfoDao.getVersion());
            GriverLogger.d("GriverAppSQLiteStorage", sb.toString());
            this.b.delete(this.f9170a.getTableName(), "appId=? and version=?", new String[]{appInfoDao.getAppId(), appInfoDao.getVersion()});
            return true;
        }
        GriverLogger.w("GriverAppSQLiteStorage", "sqlite database is not ready, do nothing");
        return false;
    }

    public boolean deleteAppInfoById(String str) {
        if (this.b != null) {
            GriverLogger.d("GriverAppSQLiteStorage", "delete app with appId: ".concat(String.valueOf(str)));
            this.b.delete(this.f9170a.getTableName(), "appId=?", new String[]{str});
            return true;
        }
        GriverLogger.w("GriverAppSQLiteStorage", "sqlite database is not ready, do nothing");
        return false;
    }

    public AppInfoDao selectAppInfo(String str, String str2) {
        AppInfoDao appInfoDao = null;
        if (this.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.b.query(this.f9170a.getTableName(), (String[]) null, "appId=? and version=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (query != null) {
                if (query.moveToNext()) {
                    appInfoDao = new AppInfoDao();
                    appInfoDao.setAppId(query.getString(query.getColumnIndex("appId")));
                    appInfoDao.setVersion(query.getString(query.getColumnIndex("version")));
                    appInfoDao.setLastRefreshTimestamp(query.getLong(query.getColumnIndex(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP)));
                    String string = query.getString(query.getColumnIndex("appInfo"));
                    try {
                        appInfoDao.setAppInfo((AppModel) JSON.parseObject(string, AppModel.class));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("parse appinfo failed for");
                        sb.append(str);
                        sb.append(" with appinfo: ");
                        sb.append(string);
                        GriverLogger.w("GriverAppSQLiteStorage", sb.toString(), e);
                    }
                }
                query.close();
                StringBuilder sb2 = new StringBuilder("query app info for appId: ");
                sb2.append(str);
                sb2.append(" version: ");
                sb2.append(str2);
                sb2.append(" success cost: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                GriverLogger.d("GriverAppSQLiteStorage", sb2.toString());
            }
        }
        return appInfoDao;
    }

    public AppInfoDao selectAppInfoWithHighestVersion(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1452765491, oncanceled);
            onCancelLoad.getMin(1452765491, oncanceled);
        }
        GriverLogger.d("GriverAppSQLiteStorage", "query highest version for appId: ".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        List<AppInfoDao> selectAllAppInfo = selectAllAppInfo(str);
        if (selectAllAppInfo == null || selectAllAppInfo.size() <= 0) {
            StringBuilder sb = new StringBuilder("query highest version for appId: ");
            sb.append(str);
            sb.append(" result is null");
            GriverLogger.w("GriverAppSQLiteStorage", sb.toString());
            return null;
        }
        AppInfoDao appInfoDao = selectAllAppInfo.get(0);
        StringBuilder sb2 = new StringBuilder("query highest version for appId: ");
        sb2.append(str);
        sb2.append(" success cost: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        GriverLogger.d("GriverAppSQLiteStorage", sb2.toString());
        return appInfoDao;
    }

    public List<AppInfoDao> selectAllAppInfo(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            GriverLogger.d("GriverAppSQLiteStorage", "query all app info for appId: ".concat(String.valueOf(str)));
            Cursor query = this.b.query(this.f9170a.getTableName(), (String[]) null, "appId=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    AppInfoDao appInfoDao = new AppInfoDao();
                    appInfoDao.setAppId(query.getString(query.getColumnIndex("appId")));
                    appInfoDao.setVersion(query.getString(query.getColumnIndex("version")));
                    appInfoDao.setLastRefreshTimestamp(query.getLong(query.getColumnIndex(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP)));
                    String string = query.getString(query.getColumnIndex("appInfo"));
                    try {
                        appInfoDao.setAppInfo((AppModel) JSON.parseObject(string, AppModel.class));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("parse appinfo failed for");
                        sb.append(str);
                        sb.append(" with appinfo: ");
                        sb.append(string);
                        GriverLogger.w("GriverAppSQLiteStorage", sb.toString(), e);
                    }
                    arrayList.add(appInfoDao);
                }
                query.close();
                if (arrayList.size() > 0) {
                    Collections.sort(arrayList, AppInfoUtils.getAppInfoDaoDescComparator());
                }
            }
            StringBuilder sb2 = new StringBuilder("query app for ");
            sb2.append(str);
            sb2.append(" success cost: ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            GriverLogger.d("GriverAppSQLiteStorage", sb2.toString());
        } else {
            GriverLogger.w("GriverAppSQLiteStorage", "sqlite database is not ready, do nothing");
        }
        return arrayList;
    }

    private AppInfoDao a(@NonNull Cursor cursor) {
        AppInfoDao appInfoDao = new AppInfoDao();
        appInfoDao.setAppId(cursor.getString(cursor.getColumnIndex("appId")));
        appInfoDao.setVersion(cursor.getString(cursor.getColumnIndex("version")));
        appInfoDao.setLastRefreshTimestamp(cursor.getLong(cursor.getColumnIndex(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP)));
        String string = cursor.getString(cursor.getColumnIndex("appInfo"));
        try {
            appInfoDao.setAppInfo((AppModel) JSON.parseObject(string, AppModel.class));
        } catch (Exception e) {
            GriverLogger.w("GriverAppSQLiteStorage", "parse appinfo failed with appinfo: ".concat(String.valueOf(string)), e);
        }
        return appInfoDao;
    }

    public List<AppInfoDao> selectAllAppInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.b != null) {
            GriverLogger.d("GriverAppSQLiteStorage", "select all appInfos");
            Cursor query = this.b.query(this.f9170a.getTableName(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                arrayList.add(a(query));
            }
            query.close();
        }
        return arrayList;
    }
}
