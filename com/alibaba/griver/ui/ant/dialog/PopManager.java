package com.alibaba.griver.ui.ant.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.ant.api.AUPop;
import com.alibaba.griver.ui.ant.api.AUPopSupportPreemption;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class PopManager {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f10553a = new HashMap();
    private static final Map<Activity, TreeSet<PopBean>> b = new ConcurrentHashMap();
    private static final Handler c = new Handler(Looper.getMainLooper());

    static {
        f10553a.put("101056", "show");
        f10553a.put("101073", "dismiss");
        f10553a.put("101074", "preshow");
        f10553a.put("101075", "dismissallpopup");
        f10553a.put("101076", "queue");
        f10553a.put("101077", "replaced");
        f10553a.put("100810", "threadCreate");
        f10553a.put("100811", "threadShow");
    }

    public static void show(AUPop aUPop) {
        if (aUPop != null) {
            try {
                GriverLogger.d("PopManager", "ready start show:".concat(String.valueOf(aUPop)));
                StringBuilder a2 = a(3, 13);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    GriverLogger.debug("PopManager", "show in workder thread, ignore, ".concat(String.valueOf(aUPop)));
                    a(aUPop.getPopActivity(), aUPop, "100811", a2.toString());
                } else if ((aUPop instanceof AUBasicDialog) && !((AUBasicDialog) aUPop).isCreateInUIThread()) {
                    GriverLogger.debug("PopManager", "create in worker thread, ignore, ".concat(String.valueOf(aUPop)));
                    a(aUPop.getPopActivity(), aUPop, "100810", a2.toString());
                } else if (!isOpen()) {
                    aUPop.showPop();
                } else {
                    Activity popActivity = aUPop.getPopActivity();
                    if (popActivity == null) {
                        GriverLogger.e("PopManager", "pop's context is not instance of activity");
                        return;
                    }
                    if (!popActivity.isFinishing()) {
                        if (!popActivity.isDestroyed()) {
                            PopBean findPop = findPop(aUPop);
                            if (findPop == null) {
                                findPop = new PopBean(aUPop, System.currentTimeMillis(), System.nanoTime());
                            } else {
                                findPop.showMillis = System.currentTimeMillis();
                                findPop.showNano = System.nanoTime();
                            }
                            GriverLogger.d("PopManager", "start show");
                            a(popActivity, findPop, "101074");
                            TreeSet treeSet = b.get(popActivity);
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                                b.put(popActivity, treeSet);
                            }
                            findPop.isRegister = true;
                            treeSet.add(findPop);
                            PopBean popBean = (PopBean) treeSet.first();
                            if (popBean == null) {
                                treeSet.pollFirst();
                                popBean = (PopBean) treeSet.first();
                            }
                            PopBean popBean2 = popBean;
                            if (popBean2.isShowing) {
                                a(popActivity, findPop, "101076");
                                findPop.isQueue = true;
                                if ((popBean2.mAUPop instanceof Dialog) && !((Dialog) popBean2.mAUPop).isShowing()) {
                                    a(popBean2);
                                    return;
                                }
                                return;
                            }
                            a(popBean2);
                            if (treeSet.size() == 1) {
                                a(popActivity, popBean2, "101056");
                                return;
                            }
                            Iterator it = treeSet.iterator();
                            while (it.hasNext()) {
                                PopBean popBean3 = (PopBean) it.next();
                                if (popBean3 != popBean2 && (popBean3.mAUPop instanceof AUPopSupportPreemption) && popBean3.isShowing) {
                                    popBean3.isShowing = false;
                                    popBean3.isPreemption = true;
                                    ((AUPopSupportPreemption) popBean3.mAUPop).onPreemption();
                                }
                            }
                            a(popActivity, popBean2, "101077");
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder("show Activity is finish, name = ");
                    sb.append(popActivity.getClass().getName());
                    GriverLogger.d("PopManager", sb.toString());
                    if (b.containsKey(popActivity)) {
                        b.remove(popActivity);
                    }
                }
            } catch (Throwable th) {
                GriverLogger.e("PopManager", "show dialog exception: ", th);
                if (0 != 0) {
                    GriverLogger.e("PopManager", "show dialog exception, force close dialog");
                    dismiss(null.mAUPop);
                }
            }
        }
    }

    @NonNull
    private static StringBuilder a(int i, int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        if (stackTrace != null) {
            while (i < stackTrace.length) {
                GriverLogger.d("PopManager", stackTrace[i].toString());
                sb.append(stackTrace[i]);
                sb.append("#");
                if (i > i2) {
                    break;
                }
                i++;
            }
        }
        return sb;
    }

    public static void dismiss(AUPop aUPop) {
        if (aUPop != null) {
            try {
                if (!isOpen()) {
                    aUPop.dismissPop();
                    return;
                }
                Activity popActivity = aUPop.getPopActivity();
                if (popActivity == null) {
                    GriverLogger.e("PopManager", "pop's context is not instance of activity");
                    return;
                }
                a(popActivity);
                if (!popActivity.isFinishing()) {
                    if (!popActivity.isDestroyed()) {
                        PopBean findPop = findPop(aUPop);
                        if (findPop == null) {
                            aUPop.dismissPop();
                            return;
                        }
                        GriverLogger.d("PopManager", "start dismiss:".concat(String.valueOf(aUPop)));
                        a(3, 20);
                        TreeSet treeSet = b.get(popActivity);
                        if (treeSet != null) {
                            if (!treeSet.isEmpty()) {
                                if (treeSet.contains(findPop)) {
                                    if (!findPop.isPreemption) {
                                        treeSet.remove(findPop);
                                        findPop.isRegister = false;
                                    }
                                    findPop.mAUPop.dismissPop();
                                    a(popActivity, findPop, "101073");
                                }
                                if (treeSet.isEmpty()) {
                                    GriverLogger.d("PopManager", "2.empty list, remove activity : ".concat(String.valueOf(popActivity)));
                                    if (b.containsKey(popActivity)) {
                                        b.remove(popActivity);
                                        return;
                                    }
                                    return;
                                }
                                PopBean popBean = (PopBean) treeSet.first();
                                if (popBean == null) {
                                    GriverLogger.d("PopManager", "first is null activity : ".concat(String.valueOf(popActivity)));
                                    return;
                                } else if (!popBean.isShowing) {
                                    a(popBean);
                                    a(popActivity, popBean, "101056");
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        GriverLogger.d("PopManager", "1.empty list, remove activity : ".concat(String.valueOf(popActivity)));
                        if (b.containsKey(popActivity)) {
                            b.remove(popActivity);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("dismiss Activity is finish, name = ");
                sb.append(popActivity.getClass().getName());
                GriverLogger.d("PopManager", sb.toString());
                if (b.containsKey(popActivity)) {
                    b.remove(popActivity);
                }
            } catch (Throwable th) {
                GriverLogger.e("PopManager", th.toString());
            }
        }
    }

    private static void a(Activity activity) {
        if (activity != null) {
            try {
                Iterator<Map.Entry<Activity, TreeSet<PopBean>>> it = b.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    Activity activity2 = (Activity) next.getKey();
                    TreeSet treeSet = (TreeSet) next.getValue();
                    if (activity != activity2 && (activity2.isFinishing() || activity2.isDestroyed() || treeSet == null || treeSet.isEmpty())) {
                        GriverLogger.d("PopManager", "remove activity without dialog : ".concat(String.valueOf(activity2)));
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                GriverLogger.e("PopManager", "gcActivity exception: ", th);
            }
        }
    }

    private static void a(final PopBean popBean) {
        popBean.isQueue = false;
        popBean.isPreemption = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            popBean.mAUPop.showPop();
        } else {
            c.post(new Runnable() {
                public final void run() {
                    popBean.mAUPop.showPop();
                }
            });
        }
        popBean.isShowing = true;
    }

    protected static PopBean findPop(AUPop aUPop) {
        TreeSet treeSet = b.get(aUPop.getPopActivity());
        if (treeSet == null) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            PopBean popBean = (PopBean) it.next();
            if (popBean.mAUPop == aUPop) {
                return popBean;
            }
        }
        return null;
    }

    public static void dismissAll(Activity activity) {
        if (isOpen() && activity != null) {
            try {
                TreeSet treeSet = b.get(activity);
                if (treeSet == null) {
                    return;
                }
                if (!treeSet.isEmpty()) {
                    Iterator it = treeSet.iterator();
                    while (it.hasNext()) {
                        PopBean popBean = (PopBean) it.next();
                        if (popBean != null) {
                            popBean.mAUPop.dismissPop();
                        }
                    }
                    b.remove(activity);
                    HashMap hashMap = new HashMap();
                    hashMap.put("action", f10553a.get("101075"));
                    hashMap.put("referer_url", activity.getClass().getName());
                }
            } catch (Throwable th) {
                GriverLogger.e("PopManager", th.toString());
            }
        }
    }

    private static void a(Activity activity, PopBean popBean, String str) {
        a(activity, popBean.mAUPop, str, (String) null);
    }

    private static void a(Activity activity, AUPop aUPop, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(f10553a.get(str));
        sb.append(": ");
        sb.append(aUPop);
        GriverLogger.d("PopManager", sb.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("action", f10553a.get(str));
        hashMap.put(FirebaseAnalytics.Param.CONTENT_TYPE, aUPop.getClass().getName());
        hashMap.put("referer_url", activity != null ? activity.getClass().getName() : "null");
        hashMap.put("category", a(aUPop));
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("fromStackTrace", str2);
        }
    }

    private static String a(AUPop aUPop) {
        Class cls = aUPop.getClass();
        String str = "";
        int i = 0;
        while (i < 5) {
            if (cls != null) {
                str = cls.getSimpleName();
                if (str.startsWith(RVOpenAuthHelper.PLATFORM_AP) || str.startsWith("AU") || str.startsWith("Bee")) {
                    break;
                }
                cls = cls.getSuperclass();
                i++;
            } else {
                return str;
            }
        }
        return str;
    }

    public static boolean isOpen() {
        return GriverConfig.getConfigBoolean("AUDialogWindow_AUPopManager_disable_v2", true);
    }

    static class PopBean implements Comparable<PopBean> {
        public boolean isPreemption;
        boolean isQueue;
        boolean isRegister;
        boolean isShowing;
        AUPop mAUPop;
        long showMillis;
        long showNano;

        public PopBean(AUPop aUPop, long j, long j2) {
            this.mAUPop = aUPop;
            this.showMillis = j;
            this.showNano = j2;
        }

        public int compareTo(@NonNull PopBean popBean) {
            int priority = popBean.mAUPop.getPriority() - this.mAUPop.getPriority();
            if (priority != 0) {
                return priority;
            }
            int i = (int) (this.showMillis - popBean.showMillis);
            if (i != 0) {
                return i;
            }
            return (int) (this.showNano - popBean.showNano);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PopBean { priority: ");
            sb.append(this.mAUPop.getPriority());
            sb.append(", showMillis: ");
            sb.append(this.showMillis);
            sb.append(" }");
            return sb.toString();
        }
    }
}
