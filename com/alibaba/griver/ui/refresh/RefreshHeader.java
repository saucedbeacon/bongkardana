package com.alibaba.griver.ui.refresh;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.alibaba.griver.ui.refresh.GriverSwipeRefreshLayout;
import id.dana.nearbyme.NearbyMeActivity;

public abstract class RefreshHeader extends RelativeLayout {
    protected GriverSwipeRefreshLayout.OnPullRefreshListener mPullRefreshListener;
    protected RefreshState mState = RefreshState.NONE;

    public enum RefreshHeaderStyle {
        NORMAL,
        DARK
    }

    public abstract void changeToState(RefreshState refreshState);

    public abstract View getRefreshView();

    public abstract View getSecondFloorView();

    public abstract void setProgress(float f);

    public abstract void setRefreshAnimation(String[] strArr, @Nullable String str);

    public abstract void setRefreshTipColor(@ColorInt int i);

    public abstract void setRefreshTips(String[] strArr);

    public abstract void setSecondFloorView(View view);

    public void switchStyle(RefreshHeaderStyle refreshHeaderStyle) {
    }

    public RefreshHeader(Context context) {
        super(context);
    }

    public RefreshState getCurrentState() {
        return this.mState;
    }

    public void setPullRefreshListener(GriverSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        this.mPullRefreshListener = onPullRefreshListener;
    }

    /* renamed from: com.alibaba.griver.ui.refresh.RefreshHeader$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState[] r0 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState = r0
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.PULL_TO_REFRESH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.RELEASE_TO_REFRESH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.REFRESHING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.SECOND_FLOOR_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.alibaba.griver.ui.refresh.RefreshHeader$RefreshState r1 = com.alibaba.griver.ui.refresh.RefreshHeader.RefreshState.SECOND_FLOOR_END     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.refresh.RefreshHeader.AnonymousClass1.<clinit>():void");
        }
    }

    public enum RefreshState {
        NONE,
        PULL_TO_REFRESH,
        RELEASE_TO_REFRESH,
        REFRESHING,
        PREPARE_TO_SECOND_FLOOR,
        SECOND_FLOOR_START,
        SECOND_FLOOR_END;

        public final String toString() {
            switch (AnonymousClass1.$SwitchMap$com$alibaba$griver$ui$refresh$RefreshHeader$RefreshState[ordinal()]) {
                case 1:
                    return NetworkUtils.NETWORK_TYPE_NONE;
                case 2:
                    return "PULL_TO_REFRESH";
                case 3:
                    return "RELEASE_TO_REFRESH";
                case 4:
                    return NearbyMeActivity.RefreshCondition.REFRESHING;
                case 5:
                    return "PREPARE_TO_SECOND_FLOOR";
                case 6:
                    return "SECOND_FLOOR_START";
                case 7:
                    return "SECOND_FLOOR_END";
                default:
                    return "";
            }
        }
    }
}
