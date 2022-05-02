package com.alibaba.ariver.app.activity;

import android.os.Bundle;
import android.view.animation.Animation;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.R;
import com.alibaba.ariver.app.api.activity.AnimUtils;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import o.setColorFilter;

@Keep
public class DefaultFragmentManager implements IFragmentManager {
    protected static final String READY_TAG = "mReadyFragment";
    private static final String TAG = "AriverInt:FragmentManager";
    protected FragmentActivity mActivity;
    protected App mApp;
    protected int mContentId;
    protected FragmentManager mFragmentManager;
    protected final Stack<RVFragment> mFragmentStack = new Stack<>();
    protected Map<Page, RVFragment> mPageFragmentMap = new HashMap();
    protected final AtomicInteger mReadyCounter = new AtomicInteger(0);
    protected RVFragment mReadyFragment;

    public DefaultFragmentManager(App app, @IdRes int i, FragmentActivity fragmentActivity) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_FragmentManager_constructor);
        if (RVKernelUtils.isDebug()) {
            FragmentManager.getMin();
        }
        this.mApp = app;
        this.mActivity = fragmentActivity;
        this.mFragmentManager = fragmentActivity.getSupportFragmentManager();
        this.mContentId = i;
        this.mReadyFragment = createFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(RVConstants.EXTRA_APP_INSTANCE_ID, app.getNodeId());
        this.mReadyFragment.setArguments(bundle);
        this.mReadyFragment.setAlreadyScheduleAdded(true);
        setColorFilter setcolorfilter = new setColorFilter(this.mFragmentManager);
        RVFragment rVFragment = this.mReadyFragment;
        StringBuilder sb = new StringBuilder(READY_TAG);
        sb.append(this.mReadyCounter.addAndGet(1));
        setcolorfilter.length(i, rVFragment, sb.toString(), 1);
        setcolorfilter.setMin(this.mReadyFragment).length();
        RVTraceUtils.traceEndSection(RVTraceKey.RV_FragmentManager_constructor);
    }

    public DefaultFragmentManager(App app, @IdRes int i, Fragment fragment) {
        this.mApp = app;
        this.mActivity = fragment.getActivity();
        this.mFragmentManager = fragment.getChildFragmentManager();
        this.mContentId = i;
        this.mReadyFragment = createFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(RVConstants.EXTRA_APP_INSTANCE_ID, app.getNodeId());
        this.mReadyFragment.setArguments(bundle);
        this.mReadyFragment.setAlreadyScheduleAdded(true);
        setColorFilter setcolorfilter = new setColorFilter(this.mFragmentManager);
        RVFragment rVFragment = this.mReadyFragment;
        StringBuilder sb = new StringBuilder(READY_TAG);
        sb.append(this.mReadyCounter.addAndGet(1));
        setcolorfilter.length(i, rVFragment, sb.toString(), 1);
        setcolorfilter.setMin(this.mReadyFragment).length();
    }

    public RVFragment createFragment() {
        return new RVFragment();
    }

    public FragmentManager getInnerManager() {
        return this.mFragmentManager;
    }

    public RVFragment findFragmentForPage(Page page) {
        return this.mPageFragmentMap.get(page);
    }

    public synchronized void resetFragmentToTop(RVFragment rVFragment) {
        if (!this.mFragmentStack.empty() && this.mFragmentStack.remove(rVFragment)) {
            this.mFragmentStack.push(rVFragment);
        }
    }

    public synchronized void pushPage(Page page, RVFragment rVFragment, boolean z) {
        pushPage(page, rVFragment, this.mContentId, z);
    }

    /* access modifiers changed from: protected */
    public void pushPage(final Page page, RVFragment rVFragment, int i, boolean z) {
        if (this.mApp.getAppContext() == null || this.mActivity.isFinishing() || rVFragment == null || this.mFragmentStack.contains(rVFragment)) {
            RVLogger.e(TAG, "pushPage with illegal state!!!");
            return;
        }
        StringBuilder sb = new StringBuilder("pushPage: ");
        sb.append(page);
        sb.append(" ");
        sb.append(rVFragment);
        sb.append(" useTranslateAnim: ");
        sb.append(z);
        RVLogger.d(TAG, sb.toString());
        this.mPageFragmentMap.put(page, rVFragment);
        if (!this.mFragmentStack.isEmpty()) {
            RVFragment peek = this.mFragmentStack.peek();
            peek.pauseRender();
            detachFragment(peek, z);
        }
        if (!this.mFragmentStack.contains(rVFragment)) {
            this.mFragmentStack.push(rVFragment);
        }
        if (!this.mActivity.isFinishing()) {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_FragmentManager_addFragment);
            setColorFilter setcolorfilter = new setColorFilter(this.mFragmentManager);
            RVLogger.d(TAG, "add fragment");
            if (z) {
                try {
                    RVLogger.d(TAG, "fragment use translate anim.");
                    rVFragment.setShouldResumeWebView(true);
                    int animResId = AnimUtils.getAnimResId(this.mActivity, RVFragment.TRANSLATE_IN_LEFT_ID);
                    if (animResId == 0) {
                        animResId = R.anim.ariver_fragment_translate_in_left_default;
                    }
                    setcolorfilter.setMax = animResId;
                    setcolorfilter.isInside = 0;
                    setcolorfilter.equals = 0;
                    setcolorfilter.toIntRange = 0;
                } catch (Throwable th) {
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_FragmentManager_addFragment);
                    throw th;
                }
            }
            if (!rVFragment.isAdded()) {
                if (!rVFragment.isAlreadyScheduleAdded()) {
                    setcolorfilter.length(i, rVFragment, (String) null, 1);
                    setcolorfilter.length();
                    ExecutorUtils.runOnMain(new Runnable() {
                        public void run() {
                            if (!DefaultFragmentManager.this.mApp.isDestroyed()) {
                                DefaultFragmentManager.this.checkTabBar(page);
                            }
                        }
                    });
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_FragmentManager_addFragment);
                }
            }
            setcolorfilter.getMax(rVFragment);
            setcolorfilter.length();
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (!DefaultFragmentManager.this.mApp.isDestroyed()) {
                        DefaultFragmentManager.this.checkTabBar(page);
                    }
                }
            });
            RVTraceUtils.traceEndSection(RVTraceKey.RV_FragmentManager_addFragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00eb, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean exitPage(com.alibaba.ariver.app.api.Page r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.alibaba.ariver.app.api.App r0 = r6.mApp     // Catch:{ all -> 0x00f5 }
            com.alibaba.ariver.app.api.AppContext r0 = r0.getAppContext()     // Catch:{ all -> 0x00f5 }
            r1 = 0
            if (r0 == 0) goto L_0x00ec
            androidx.fragment.app.FragmentActivity r0 = r6.mActivity     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00ec
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.setMin()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x001c
            goto L_0x00ec
        L_0x001c:
            java.util.Map<com.alibaba.ariver.app.api.Page, com.alibaba.ariver.app.api.ui.fragment.RVFragment> r0 = r6.mPageFragmentMap     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r0.remove(r7)     // Catch:{ all -> 0x00f5 }
            com.alibaba.ariver.app.api.ui.fragment.RVFragment r0 = (com.alibaba.ariver.app.api.ui.fragment.RVFragment) r0     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x0028
            monitor-exit(r6)
            return r1
        L_0x0028:
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r2 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00f5 }
            r3 = 1
            if (r2 > r3) goto L_0x0035
            if (r9 == 0) goto L_0x0035
            monitor-exit(r6)
            return r1
        L_0x0035:
            androidx.fragment.app.FragmentActivity r9 = r0.getActivity()     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x0047
            androidx.fragment.app.FragmentActivity r9 = r0.getActivity()     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9.isFinishing()     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x0047
            monitor-exit(r6)
            return r3
        L_0x0047:
            java.lang.String r9 = "AriverInt:FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "exitPage: "
            r2.<init>(r4)     // Catch:{ all -> 0x00f5 }
            r2.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = " "
            r2.append(r7)     // Catch:{ all -> 0x00f5 }
            r2.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = " fragmentStack: "
            r2.append(r7)     // Catch:{ all -> 0x00f5 }
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r7 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            int r7 = r7.size()     // Catch:{ all -> 0x00f5 }
            r2.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = " useTranslateAnim: "
            r2.append(r7)     // Catch:{ all -> 0x00f5 }
            r2.append(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x00f5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r9, r7)     // Catch:{ all -> 0x00f5 }
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r7 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            java.lang.Object r7 = r7.peek()     // Catch:{ all -> 0x00f5 }
            if (r0 != r7) goto L_0x0082
            r7 = 1
            goto L_0x0083
        L_0x0082:
            r7 = 0
        L_0x0083:
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r9 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            r9.remove(r0)     // Catch:{ all -> 0x00f5 }
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager     // Catch:{ all -> 0x00f5 }
            o.setColorFilter r2 = new o.setColorFilter     // Catch:{ all -> 0x00f5 }
            r2.<init>(r9)     // Catch:{ all -> 0x00f5 }
            if (r8 == 0) goto L_0x00b1
            androidx.fragment.app.FragmentActivity r9 = r6.mActivity     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "ariver_fragment_translate_out_right"
            int r9 = com.alibaba.ariver.app.api.activity.AnimUtils.getAnimResId(r9, r4)     // Catch:{ all -> 0x00f5 }
            if (r9 != 0) goto L_0x009d
            int r9 = com.alibaba.ariver.app.api.R.anim.ariver_fragment_translate_out_right_default     // Catch:{ all -> 0x00f5 }
        L_0x009d:
            androidx.fragment.app.FragmentActivity r4 = r6.mActivity     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "ariver_fragment_translate_in_right"
            int r4 = com.alibaba.ariver.app.api.activity.AnimUtils.getAnimResId(r4, r5)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x00a9
            int r4 = com.alibaba.ariver.app.api.R.anim.ariver_fragment_translate_in_right_default     // Catch:{ all -> 0x00f5 }
        L_0x00a9:
            r2.setMax = r4     // Catch:{ all -> 0x00f5 }
            r2.isInside = r9     // Catch:{ all -> 0x00f5 }
            r2.equals = r1     // Catch:{ all -> 0x00f5 }
            r2.toIntRange = r1     // Catch:{ all -> 0x00f5 }
        L_0x00b1:
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r9 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            int r9 = r9.size()     // Catch:{ all -> 0x00f5 }
            if (r9 <= 0) goto L_0x00cf
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r9 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            java.lang.Object r9 = r9.peek()     // Catch:{ all -> 0x00f5 }
            com.alibaba.ariver.app.api.ui.fragment.RVFragment r9 = (com.alibaba.ariver.app.api.ui.fragment.RVFragment) r9     // Catch:{ all -> 0x00f5 }
            if (r8 == 0) goto L_0x00c6
            r9.setShouldResumeWebView(r3)     // Catch:{ all -> 0x00f5 }
        L_0x00c6:
            o.invalidateDrawable$length r8 = new o.invalidateDrawable$length     // Catch:{ all -> 0x00f5 }
            r1 = 7
            r8.<init>((int) r1, (androidx.fragment.app.Fragment) r9)     // Catch:{ all -> 0x00f5 }
            r2.getMin((o.invalidateDrawable.length) r8)     // Catch:{ all -> 0x00f5 }
        L_0x00cf:
            r2.length(r0)     // Catch:{ all -> 0x00f5 }
            r2.length()     // Catch:{ all -> 0x00f5 }
            com.alibaba.ariver.app.api.App r8 = r6.mApp     // Catch:{ all -> 0x00f5 }
            com.alibaba.ariver.app.api.Page r8 = r8.getActivePage()     // Catch:{ all -> 0x00f5 }
            if (r8 == 0) goto L_0x00ea
            if (r7 == 0) goto L_0x00ea
            java.util.Stack<com.alibaba.ariver.app.api.ui.fragment.RVFragment> r7 = r6.mFragmentStack     // Catch:{ all -> 0x00f5 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00f5 }
            if (r7 != 0) goto L_0x00ea
            r6.checkTabBar(r8)     // Catch:{ all -> 0x00f5 }
        L_0x00ea:
            monitor-exit(r6)
            return r3
        L_0x00ec:
            java.lang.String r7 = "AriverInt:FragmentManager"
            java.lang.String r8 = "activity is finishing"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r8)     // Catch:{ all -> 0x00f5 }
            monitor-exit(r6)
            return r1
        L_0x00f5:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.activity.DefaultFragmentManager.exitPage(com.alibaba.ariver.app.api.Page, boolean, boolean):boolean");
    }

    public synchronized void release() {
        this.mPageFragmentMap.clear();
        this.mFragmentStack.clear();
        this.mReadyFragment = null;
    }

    public synchronized RVFragment getReadyFragment() {
        Fragment fragment = null;
        if (this.mReadyFragment != null) {
            StringBuilder sb = new StringBuilder(READY_TAG);
            sb.append(this.mReadyCounter.get());
            if (sb.toString().equals(this.mReadyFragment.getTag())) {
                StringBuilder sb2 = new StringBuilder("getReadyFragment hit field: ");
                sb2.append(this.mReadyCounter);
                sb2.append(" ");
                sb2.append(this.mReadyFragment != null);
                RVLogger.d(TAG, sb2.toString());
                RVFragment rVFragment = this.mReadyFragment;
                this.mReadyFragment = null;
                fragment = rVFragment;
            }
        }
        if (fragment == null) {
            FragmentManager fragmentManager = this.mFragmentManager;
            StringBuilder sb3 = new StringBuilder(READY_TAG);
            sb3.append(this.mReadyCounter.get());
            fragment = fragmentManager.findFragmentByTag(sb3.toString());
        }
        if (fragment != null) {
            StringBuilder sb4 = new StringBuilder("getReadyFragment hit! mReadyCounter: ");
            sb4.append(this.mReadyCounter);
            RVLogger.d(TAG, sb4.toString());
            this.mReadyCounter.incrementAndGet();
            return (RVFragment) fragment;
        }
        StringBuilder sb5 = new StringBuilder("getReadyFragment miss! mReadyCounter: ");
        sb5.append(this.mReadyCounter);
        RVLogger.d(TAG, sb5.toString());
        return createFragment();
    }

    public Set<RVFragment> getFragments() {
        return new HashSet(this.mFragmentStack);
    }

    /* access modifiers changed from: protected */
    public void checkTabBar(Page page) {
        TabBar tabBar;
        if (this.mApp.getAppContext() != null && (tabBar = this.mApp.getAppContext().getTabBar()) != null && page != null) {
            boolean isTabPage = tabBar.isTabPage(page);
            if (isTabPage && !tabBar.isShowing() && tabBar.isAutoShow()) {
                tabBar.show((Page) null, (Animation) null);
            } else if (!isTabPage && tabBar.isShowing()) {
                tabBar.hide((Animation) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean attachFragment(com.alibaba.ariver.app.api.ui.fragment.RVFragment r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            androidx.fragment.app.FragmentActivity r0 = r4.mActivity     // Catch:{ all -> 0x006c }
            boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x006c }
            r1 = 0
            if (r0 != 0) goto L_0x0063
            com.alibaba.ariver.app.api.App r0 = r4.mApp     // Catch:{ all -> 0x006c }
            com.alibaba.ariver.app.api.AppContext r0 = r0.getAppContext()     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0013
            goto L_0x0063
        L_0x0013:
            if (r5 == 0) goto L_0x0061
            boolean r0 = r5.isVisible()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x001c
            goto L_0x0061
        L_0x001c:
            java.lang.String r0 = "AriverInt:FragmentManager"
            java.lang.String r2 = "attachFragment: "
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x006c }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x006c }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r2)     // Catch:{ all -> 0x006c }
            com.alibaba.ariver.app.api.Page r0 = r5.getPage()     // Catch:{ all -> 0x006c }
            r4.checkTabBar(r0)     // Catch:{ all -> 0x006c }
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager     // Catch:{ all -> 0x006c }
            o.setColorFilter r2 = new o.setColorFilter     // Catch:{ all -> 0x006c }
            r2.<init>(r0)     // Catch:{ all -> 0x006c }
            r0 = 1
            if (r6 == 0) goto L_0x0053
            r5.setShouldResumeWebView(r0)     // Catch:{ all -> 0x006c }
            androidx.fragment.app.FragmentActivity r6 = r4.mActivity     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "ariver_fragment_translate_in_right"
            int r6 = com.alibaba.ariver.app.api.activity.AnimUtils.getAnimResId(r6, r3)     // Catch:{ all -> 0x006c }
            if (r6 != 0) goto L_0x004b
            int r6 = com.alibaba.ariver.app.api.R.anim.ariver_fragment_translate_in_right_default     // Catch:{ all -> 0x006c }
        L_0x004b:
            r2.setMax = r6     // Catch:{ all -> 0x006c }
            r2.isInside = r1     // Catch:{ all -> 0x006c }
            r2.equals = r1     // Catch:{ all -> 0x006c }
            r2.toIntRange = r1     // Catch:{ all -> 0x006c }
        L_0x0053:
            o.invalidateDrawable$length r6 = new o.invalidateDrawable$length     // Catch:{ all -> 0x006c }
            r1 = 7
            r6.<init>((int) r1, (androidx.fragment.app.Fragment) r5)     // Catch:{ all -> 0x006c }
            r2.getMin((o.invalidateDrawable.length) r6)     // Catch:{ all -> 0x006c }
            r2.length()     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return r0
        L_0x0061:
            monitor-exit(r4)
            return r1
        L_0x0063:
            java.lang.String r5 = "AriverInt:FragmentManager"
            java.lang.String r6 = "activity is finishing"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r5, r6)     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return r1
        L_0x006c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.activity.DefaultFragmentManager.attachFragment(com.alibaba.ariver.app.api.ui.fragment.RVFragment, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean detachFragment(com.alibaba.ariver.app.api.ui.fragment.RVFragment r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            androidx.fragment.app.FragmentActivity r0 = r4.mActivity     // Catch:{ all -> 0x005b }
            boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x005b }
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r5 = "AriverInt:FragmentManager"
            java.lang.String r6 = "activity is finishing"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r5, r6)     // Catch:{ all -> 0x005b }
            monitor-exit(r4)
            return r1
        L_0x0013:
            if (r5 == 0) goto L_0x0059
            boolean r0 = r5.isHidden()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x001c
            goto L_0x0059
        L_0x001c:
            java.lang.String r0 = "AriverInt:FragmentManager"
            java.lang.String r2 = "attachFragment: "
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005b }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x005b }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r2)     // Catch:{ all -> 0x005b }
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager     // Catch:{ all -> 0x005b }
            o.setColorFilter r2 = new o.setColorFilter     // Catch:{ all -> 0x005b }
            r2.<init>(r0)     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x0048
            androidx.fragment.app.FragmentActivity r6 = r4.mActivity     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "ariver_fragment_translate_out_left"
            int r6 = com.alibaba.ariver.app.api.activity.AnimUtils.getAnimResId(r6, r0)     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x0040
            int r6 = com.alibaba.ariver.app.api.R.anim.ariver_fragment_translate_out_left_default     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r2.setMax = r1     // Catch:{ all -> 0x0050 }
            r2.isInside = r6     // Catch:{ all -> 0x0050 }
            r2.equals = r1     // Catch:{ all -> 0x0050 }
            r2.toIntRange = r1     // Catch:{ all -> 0x0050 }
        L_0x0048:
            o.invalidateDrawable r5 = r2.getMin((androidx.fragment.app.Fragment) r5)     // Catch:{ all -> 0x0050 }
            r5.length()     // Catch:{ all -> 0x0050 }
            goto L_0x0056
        L_0x0050:
            r5 = move-exception
            java.lang.String r6 = "AriverInt:FragmentManager"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x005b }
        L_0x0056:
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x0059:
            monitor-exit(r4)
            return r1
        L_0x005b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.activity.DefaultFragmentManager.detachFragment(com.alibaba.ariver.app.api.ui.fragment.RVFragment, boolean):boolean");
    }
}
