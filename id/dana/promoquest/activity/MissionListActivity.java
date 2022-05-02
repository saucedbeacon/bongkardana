package id.dana.promoquest.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.PromoQuestModule;
import id.dana.promoquest.fragment.MissionListFragment;
import id.dana.promoquest.model.MissionModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import o.ImageBridgeExtension;
import o.PrepareException;
import o.convertDipToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getPluginModel;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setProgressAsync;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u001e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0012\u0010\"\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010#\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0016\u0010$\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0016\u0010%\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\b\u0010&\u001a\u00020\rH\u0002J\u0006\u0010'\u001a\u00020\rJ\u0010\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0014J\b\u0010*\u001a\u00020\rH\u0002J\b\u0010+\u001a\u00020\rH\u0002J\b\u0010,\u001a\u00020\rH\u0016J\b\u0010-\u001a\u00020\rH\u0016J\b\u0010.\u001a\u00020\rH\u0016J\u0016\u0010/\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lid/dana/promoquest/activity/MissionListActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/contract/promoquest/mission/MissionListContract$View;", "()V", "mixpanelEventTracked", "", "getMixpanelEventTracked", "()Z", "setMixpanelEventTracked", "(Z)V", "presenter", "Lid/dana/contract/promoquest/mission/MissionListContract$Presenter;", "closeToHome", "", "dismissProgress", "dismisssActiveMissionProgress", "dismisssPastMissionProgress", "findFragment", "Lid/dana/promoquest/fragment/MissionListFragment;", "key", "", "getLayout", "", "init", "initInject", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFetchActiveMissionFailed", "errorMessage", "onFetchActiveMissionSucceeded", "missionModels", "", "Lid/dana/promoquest/model/MissionModel;", "onFetchPastMissionFailed", "onFetchPastMissionSucceeded", "postActiveMissionsToFragment", "postPastMissionsToFragment", "reloadActiveMissions", "reloadBothMissions", "reloadMissions", "keyFragment", "reloadPastMissions", "setupTabAdapter", "showActiveMissionProgress", "showPastMissionProgress", "showProgress", "trackUnfinishedQuest", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissionListActivity extends BaseActivity implements setProgressAsync.setMax {
    @NotNull
    public static final String ACTIVE_MISSIONS_KEY = "activeMissions";
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    @NotNull
    public static final String PAST_MISSIONS_KEY = "pastMissions";
    public static final byte[] getMax = {62, Ascii.US, 98, -106, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMax = 109;
    private HashMap equals;
    private boolean getMin;
    @Inject
    @Nullable
    @JvmField
    public setProgressAsync.length presenter;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(short r5, int r6, short r7) {
        /*
            int r6 = r6 * 175
            int r6 = 179 - r6
            int r7 = r7 * 165
            int r7 = r7 + 11
            byte[] r0 = getMax
            int r5 = r5 * 45
            int r5 = 101 - r5
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x0019
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            goto L_0x0030
        L_0x0019:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L_0x0027
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0027:
            byte r3 = r0[r6]
            r4 = r7
            r7 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0030:
            int r7 = r7 + r5
            int r5 = r7 + -2
            int r6 = r6 + 1
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.promoquest.activity.MissionListActivity.setMin(short, int, short):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-17655053, oncanceled);
            onCancelLoad.getMin(-17655053, oncanceled);
        }
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_promo_quest;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(-719434673, oncanceled);
        onCancelLoad.getMin(-719434673, oncanceled);
        return R.layout.activity_promo_quest;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    public final boolean getMixpanelEventTracked() {
        return this.getMin;
    }

    public final void setMixpanelEventTracked(boolean z) {
        this.getMin = z;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        setProgressAsync.length length2;
        int length3;
        int min;
        int max;
        byte[] bArr = getMax;
        byte b = (byte) bArr[85];
        String min2 = setMin((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = getMax;
        byte b2 = (byte) bArr2[8];
        String min3 = setMin((byte) bArr2[85], b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(-778950083, oncanceled);
            onCancelLoad.getMin(-778950083, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -778950083 == (max = dispatchOnCancelled.getMax(applicationContext2, -778950083)))) {
            onCanceled oncanceled2 = new onCanceled(-778950083, max, 512);
            onCancelLoad.setMax(-778950083, oncanceled2);
            onCancelLoad.getMin(-778950083, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length3 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length3)))) {
            onCanceled oncanceled3 = new onCanceled(length3, min, 8);
            onCancelLoad.setMax(-778950083, oncanceled3);
            onCancelLoad.getMin(-778950083, oncanceled3);
        }
        super.onCreate(bundle);
        if (bundle == null && (length2 = this.presenter) != null) {
            length2.setMin();
        }
    }

    public final void showProgress() {
        showActiveMissionProgress();
        showPastMissionProgress();
    }

    public final void showActiveMissionProgress() {
        MissionListFragment max = getMax(ACTIVE_MISSIONS_KEY);
        if (max != null) {
            max.getMax();
        }
    }

    public final void showPastMissionProgress() {
        MissionListFragment max = getMax(PAST_MISSIONS_KEY);
        if (max != null) {
            max.getMax();
        }
    }

    public final void dismisssActiveMissionProgress() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1161724408 == (max = dispatchOnCancelled.getMax(applicationContext, 1161724408)))) {
            onCanceled oncanceled = new onCanceled(1161724408, max, 512);
            onCancelLoad.setMax(1161724408, oncanceled);
            onCancelLoad.getMin(1161724408, oncanceled);
        }
        MissionListFragment max2 = getMax(ACTIVE_MISSIONS_KEY);
        if (max2 != null) {
            max2.equals();
        }
    }

    public final void dismisssPastMissionProgress() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1125334898 == (max = dispatchOnCancelled.getMax(applicationContext, 1125334898)))) {
            onCanceled oncanceled = new onCanceled(1125334898, max, 512);
            onCancelLoad.setMax(1125334898, oncanceled);
            onCancelLoad.getMin(1125334898, oncanceled);
        }
        MissionListFragment max2 = getMax(PAST_MISSIONS_KEY);
        if (max2 != null) {
            max2.equals();
        }
    }

    public final void dismissProgress() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(373356237, oncanceled);
            onCancelLoad.getMin(373356237, oncanceled);
        }
        dismisssActiveMissionProgress();
        dismisssPastMissionProgress();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            long j;
            Date date = ((MissionModel) t).length;
            long j2 = 0;
            if (date != null) {
                j = date.getTime();
            } else {
                j = 0;
            }
            Comparable valueOf = Long.valueOf(j);
            Date date2 = ((MissionModel) t2).length;
            if (date2 != null) {
                j2 = date2.getTime();
            }
            return ComparisonsKt.compareValues(valueOf, Long.valueOf(j2));
        }
    }

    @OnClick({2131363774})
    public final void closeToHome() {
        finish();
    }

    public final void reloadMissions(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 885468557) {
                if (hashCode == 1884047001 && str.equals(PAST_MISSIONS_KEY)) {
                    getMin();
                }
            } else if (str.equals(ACTIVE_MISSIONS_KEY)) {
                getMax();
            }
        }
    }

    public final void reloadBothMissions() {
        getMax();
        getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class length<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            long j;
            Date date = ((MissionModel) t2).length;
            long j2 = 0;
            if (date != null) {
                j = date.getTime();
            } else {
                j = 0;
            }
            Comparable valueOf = Long.valueOf(j);
            Date date2 = ((MissionModel) t).length;
            if (date2 != null) {
                j2 = date2.getTime();
            }
            return ComparisonsKt.compareValues(valueOf, Long.valueOf(j2));
        }
    }

    private final void getMax() {
        MissionListFragment max = getMax(ACTIVE_MISSIONS_KEY);
        if (max != null) {
            max.getMin(false, 0);
        }
        setProgressAsync.length length2 = this.presenter;
        if (length2 != null) {
            length2.getMax();
        }
    }

    private final void getMin() {
        MissionListFragment max = getMax(PAST_MISSIONS_KEY);
        if (max != null) {
            max.getMin(false, 0);
        }
        setProgressAsync.length length2 = this.presenter;
        if (length2 != null) {
            length2.length();
        }
    }

    public final void onFetchActiveMissionFailed(@Nullable String str) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        MissionListFragment missionListFragment = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(222518494, oncanceled);
            onCancelLoad.getMin(222518494, oncanceled);
        }
        MissionListFragment max = getMax(ACTIVE_MISSIONS_KEY);
        if (max != null && max.values()) {
            missionListFragment = max;
        }
        if (missionListFragment != null) {
            missionListFragment.length(CollectionsKt.emptyList());
            missionListFragment.getMin(true, 0);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) missionListFragment.getMin(resetInternal.setMax.saveToolbarHierarchyState);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
                swipeRefreshLayout.setEnabled(false);
            }
        }
    }

    public final void onFetchPastMissionFailed(@Nullable String str) {
        MissionListFragment max = getMax(PAST_MISSIONS_KEY);
        if (max == null || !max.values()) {
            max = null;
        }
        if (max != null) {
            max.length(CollectionsKt.emptyList());
            max.getMin(true, 0);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) max.getMin(resetInternal.setMax.saveToolbarHierarchyState);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
                swipeRefreshLayout.setEnabled(false);
            }
        }
    }

    private final void setMin(List<MissionModel> list) {
        MissionListFragment max = getMax(ACTIVE_MISSIONS_KEY);
        if (max != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((MissionModel) next).getMax()) {
                    arrayList.add(next);
                }
            }
            List sortedWith = CollectionsKt.sortedWith((List) arrayList, new setMin());
            max.length(sortedWith);
            max.getMin(sortedWith.isEmpty(), 1);
        }
    }

    private final MissionListFragment getMax(String str) {
        Object obj;
        int max;
        Context baseContext = getBaseContext();
        MissionListFragment missionListFragment = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1317106854 == (max = dispatchOnCancelled.getMax(applicationContext, -1317106854)))) {
            onCanceled oncanceled = new onCanceled(-1317106854, max, 512);
            onCancelLoad.setMax(-1317106854, oncanceled);
            onCancelLoad.getMin(-1317106854, oncanceled);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        List<Fragment> min = supportFragmentManager.getMin.getMin();
        Intrinsics.checkNotNullExpressionValue(min, "supportFragmentManager.fragments");
        Iterator it = min.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Fragment fragment = (Fragment) obj;
            Intrinsics.checkNotNullExpressionValue(fragment, "it");
            Bundle arguments = fragment.getArguments();
            if (Intrinsics.areEqual((Object) arguments != null ? arguments.getString("TabAdapter.key") : null, (Object) str)) {
                break;
            }
        }
        if (obj instanceof MissionListFragment) {
            missionListFragment = obj;
        }
        return missionListFragment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/promoquest/activity/MissionListActivity$Companion;", "", "()V", "ACTIVE_MISSIONS_KEY", "", "PAST_MISSIONS_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void init() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-571064444, oncanceled);
            onCancelLoad.getMin(-571064444, oncanceled);
        }
        getPluginModel.setMin setmin = new getPluginModel.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.getMin = applicationComponent;
            setmin.getMax = new PromoQuestModule(this);
            stopIgnoring.setMin(setmin.getMax, PromoQuestModule.class);
            stopIgnoring.setMin(setmin.getMin, PrepareException.AnonymousClass1.class);
            new getPluginModel(setmin.getMax, setmin.getMin, (byte) 0).setMax(this);
            registerPresenter(this.presenter);
            setCenterTitle(getString(R.string.promo_quest));
            setMenuLeftButton((int) R.drawable.btn_arrow_left);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            ImageBridgeExtension imageBridgeExtension = new ImageBridgeExtension(supportFragmentManager);
            imageBridgeExtension.setMin(new MissionListFragment(), ACTIVE_MISSIONS_KEY, getText(R.string.active));
            imageBridgeExtension.setMin(new MissionListFragment(), PAST_MISSIONS_KEY, getText(R.string.past));
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(resetInternal.setMax.setPivotX);
            Intrinsics.checkNotNullExpressionValue(viewPager, "view_pager");
            viewPager.setAdapter(imageBridgeExtension);
            ((TabLayout) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesWithIntrinsicBounds)).setupWithViewPager((ViewPager) _$_findCachedViewById(resetInternal.setMax.setPivotX));
            return;
        }
        throw null;
    }

    public final void onFetchActiveMissionSucceeded(@NotNull List<MissionModel> list) {
        Intrinsics.checkNotNullParameter(list, "missionModels");
        boolean z = !this.getMin;
        this.getMin = z;
        if (z) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((MissionModel) next).getMax()) {
                    arrayList.add(next);
                }
            }
            convertDipToPx.length length2 = new convertDipToPx.length(this);
            length2.getMax = TrackerKey.Event.PROMO_QUEST_MAIN_PAGE_OPEN;
            convertDipToPx.length min = length2.setMax("Source", getIntent().getStringExtra("source")).setMin(TrackerKey.Property.UNFINISHED_QUEST_EXIST, !((List) arrayList).isEmpty());
            min.setMin();
            genTextSelector.getMax(new convertDipToPx(min, (byte) 0));
        }
        setMin(list);
    }

    public final void onFetchPastMissionSucceeded(@NotNull List<MissionModel> list) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2123897561 == (max = dispatchOnCancelled.getMax(applicationContext, -2123897561)))) {
            onCanceled oncanceled = new onCanceled(-2123897561, max, 512);
            onCancelLoad.setMax(-2123897561, oncanceled);
            onCancelLoad.getMin(-2123897561, oncanceled);
        }
        Intrinsics.checkNotNullParameter(list, "missionModels");
        MissionListFragment max2 = getMax(PAST_MISSIONS_KEY);
        if (max2 != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((MissionModel) next).length()) {
                    arrayList.add(next);
                }
            }
            List sortedWith = CollectionsKt.sortedWith((List) arrayList, new length());
            max2.length(sortedWith);
            max2.getMin(sortedWith.isEmpty(), 2);
        }
    }
}
