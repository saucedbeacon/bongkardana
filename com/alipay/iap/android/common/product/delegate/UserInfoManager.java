package com.alipay.iap.android.common.product.delegate;

import android.os.AsyncTask;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.log.MonitorWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class UserInfoManager implements IAPUserDelegate {
    private static final String SEED_ID_LOGIN = "iap_common_user_login";
    private static final String SEED_ID_LOGOUT = "iap_common_user_logout";
    /* access modifiers changed from: private */
    public static final String TAG = UserInfoManager.class.getName();
    private static UserInfoManager instance = null;
    private ICheckPermission checkPermissionCallback;
    private IAPLoginUserInfo currentLoginUser;
    /* access modifiers changed from: private */
    public final Object observersLock = new Object();
    /* access modifiers changed from: private */
    public ArrayList<IAPUserChangeObserver> userChangeObservers = new ArrayList<>();

    public interface ICheckPermission {
        boolean checkPermission(IAPLoginUserInfo iAPLoginUserInfo);
    }

    private UserInfoManager() {
    }

    public static UserInfoManager instance() {
        UserInfoManager userInfoManager;
        synchronized (UserInfoManager.class) {
            if (instance == null) {
                instance = new UserInfoManager();
            }
            userInfoManager = instance;
        }
        return userInfoManager;
    }

    public void release() {
        instance = null;
        synchronized (this.observersLock) {
            if (this.userChangeObservers != null) {
                this.userChangeObservers.clear();
                this.userChangeObservers = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loginNotify(com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ac }
            r1 = 2
            r0.<init>(r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "valid"
            if (r5 != 0) goto L_0x000f
            java.lang.String r2 = "0"
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = "1"
        L_0x0011:
            r0.put(r1, r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "userID"
            if (r5 != 0) goto L_0x001c
            java.lang.String r2 = ""
            goto L_0x001e
        L_0x001c:
            java.lang.String r2 = r5.userID     // Catch:{ all -> 0x00ac }
        L_0x001e:
            r0.put(r1, r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "loginID"
            if (r5 != 0) goto L_0x0028
            java.lang.String r2 = ""
            goto L_0x002a
        L_0x0028:
            java.lang.String r2 = r5.loginID     // Catch:{ all -> 0x00ac }
        L_0x002a:
            r0.put(r1, r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "iap_common_user_login"
            com.alipay.iap.android.common.log.MonitorWrapper.behaviour(r1, r0)     // Catch:{ all -> 0x00ac }
            if (r5 != 0) goto L_0x003d
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "login notify: with a null user info"
            com.alipay.iap.android.common.log.LoggerWrapper.e(r5, r0)     // Catch:{ all -> 0x00ac }
            monitor-exit(r4)     // Catch:{ all -> 0x00ac }
            return
        L_0x003d:
            com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r0 = r4.currentLoginUser     // Catch:{ all -> 0x00ac }
            r1 = 0
            if (r0 != 0) goto L_0x0046
            r4.notifyUserLogin(r5, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x0046:
            com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r0 = r4.currentLoginUser     // Catch:{ all -> 0x00ac }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0050
            monitor-exit(r4)     // Catch:{ all -> 0x00ac }
            return
        L_0x0050:
            java.lang.String r0 = r5.userID     // Catch:{ all -> 0x00ac }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00ac }
            r2 = 1
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = r5.userID     // Catch:{ all -> 0x00ac }
            com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r3 = r4.currentLoginUser     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = r3.userID     // Catch:{ all -> 0x00ac }
            boolean r0 = android.text.TextUtils.equals(r0, r3)     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0069
            r4.notifyUserLogin(r5, r2)     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x0069:
            java.lang.String r0 = r5.sessionID     // Catch:{ all -> 0x00ac }
            com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r2 = r4.currentLoginUser     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = r2.sessionID     // Catch:{ all -> 0x00ac }
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "login notify: user id and session id is the same but with a different login id"
            com.alipay.iap.android.common.log.LoggerWrapper.w((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x007d:
            com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r0 = r4.currentLoginUser     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r0.userID     // Catch:{ all -> 0x00ac }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x008f
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "login notify: the user id of the input user info is null"
            com.alipay.iap.android.common.log.LoggerWrapper.w((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x008f:
            java.lang.String r0 = r5.loginID     // Catch:{ all -> 0x00ac }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = r5.loginID     // Catch:{ all -> 0x00ac }
            com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo r3 = r4.currentLoginUser     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = r3.loginID     // Catch:{ all -> 0x00ac }
            boolean r0 = android.text.TextUtils.equals(r0, r3)     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x00a7
            r4.notifyUserLogin(r5, r2)     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x00a7:
            r4.notifyUserLogin(r5, r1)     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r4)     // Catch:{ all -> 0x00ac }
            return
        L_0x00ac:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.product.delegate.UserInfoManager.loginNotify(com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo):void");
    }

    public void logoutNotify() {
        LoggerWrapper.i(TAG, "notify user logout");
        synchronized (this) {
            this.currentLoginUser = null;
            MonitorWrapper.behaviour(SEED_ID_LOGOUT, (Map<String, String>) null);
            new AsyncTask<Void, Void, Void>() {
                /* access modifiers changed from: protected */
                public Void doInBackground(Void... voidArr) {
                    try {
                        synchronized (UserInfoManager.this.observersLock) {
                            if (UserInfoManager.this.userChangeObservers != null) {
                                Iterator it = UserInfoManager.this.userChangeObservers.iterator();
                                while (it.hasNext()) {
                                    ((IAPUserChangeObserver) it.next()).onUserLogout();
                                }
                            }
                        }
                        return null;
                    } catch (Exception e) {
                        LoggerWrapper.e(UserInfoManager.TAG, "logout notify", e);
                        return null;
                    }
                }
            }.execute(new Void[0]);
        }
    }

    private void notifyUserLogin(final IAPLoginUserInfo iAPLoginUserInfo, boolean z) {
        this.currentLoginUser = iAPLoginUserInfo.clone();
        LoggerWrapper.i(TAG, "notify user login with isUserChanged=".concat(String.valueOf(z)));
        new AsyncTask<Boolean, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Boolean... boolArr) {
                boolean booleanValue = boolArr[0].booleanValue();
                try {
                    synchronized (UserInfoManager.this.observersLock) {
                        if (UserInfoManager.this.userChangeObservers != null) {
                            Iterator it = UserInfoManager.this.userChangeObservers.iterator();
                            if (booleanValue) {
                                while (it.hasNext()) {
                                    ((IAPUserChangeObserver) it.next()).onUserChanged(iAPLoginUserInfo);
                                }
                            } else {
                                while (it.hasNext()) {
                                    ((IAPUserChangeObserver) it.next()).onUserLogin(iAPLoginUserInfo);
                                }
                            }
                        }
                    }
                    return null;
                } catch (Exception e) {
                    LoggerWrapper.e(UserInfoManager.TAG, "login notify", e);
                    return null;
                }
            }
        }.execute(new Boolean[]{Boolean.valueOf(z)});
    }

    public String getUserId() {
        synchronized (this) {
            if (this.currentLoginUser == null) {
                return null;
            }
            String str = this.currentLoginUser.userID;
            return str;
        }
    }

    public String getLoginId() {
        synchronized (this) {
            if (this.currentLoginUser == null) {
                return null;
            }
            String str = this.currentLoginUser.loginID;
            return str;
        }
    }

    public IAPLoginUserInfo getUserInfo() {
        return this.currentLoginUser;
    }

    public void setICheckPermissionCallback(ICheckPermission iCheckPermission) {
        this.checkPermissionCallback = iCheckPermission;
    }

    public boolean checkPermission() {
        ICheckPermission iCheckPermission = this.checkPermissionCallback;
        if (iCheckPermission == null) {
            return this.currentLoginUser != null;
        }
        return iCheckPermission.checkPermission(this.currentLoginUser);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addUserChangeObserver(com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.observersLock
            monitor-enter(r0)
            if (r3 == 0) goto L_0x0019
            java.util.ArrayList<com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver> r1 = r2.userChangeObservers     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0019
            java.util.ArrayList<com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver> r1 = r2.userChangeObservers     // Catch:{ all -> 0x001b }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            java.util.ArrayList<com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver> r1 = r2.userChangeObservers     // Catch:{ all -> 0x001b }
            r1.add(r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.product.delegate.UserInfoManager.addUserChangeObserver(com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver):void");
    }

    public void removeUserChangeObserver(IAPUserChangeObserver iAPUserChangeObserver) {
        if (iAPUserChangeObserver != null) {
            synchronized (this.observersLock) {
                this.userChangeObservers.remove(iAPUserChangeObserver);
            }
        }
    }
}
