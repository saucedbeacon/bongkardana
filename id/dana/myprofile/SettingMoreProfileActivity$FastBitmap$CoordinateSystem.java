package id.dana.myprofile;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoView;
import o.cancelFling;
import o.getMaxTextureSize;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
final class SettingMoreProfileActivity$FastBitmap$CoordinateSystem implements Runnable {
    final /* synthetic */ View getMax;
    final /* synthetic */ int length;
    final /* synthetic */ SettingMoreProfileActivity setMax;

    SettingMoreProfileActivity$FastBitmap$CoordinateSystem(SettingMoreProfileActivity settingMoreProfileActivity, View view, int i) {
        this.setMax = settingMoreProfileActivity;
        this.getMax = view;
        this.length = i;
    }

    public final void run() {
        SettingMoreProfileActivity settingMoreProfileActivity = this.setMax;
        cancelFling cancelfling = new cancelFling(this.setMax, this.getMax);
        RecyclerView recyclerView = (RecyclerView) this.setMax._$_findCachedViewById(resetInternal.setMax.AppCompatSpinner);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_sub_menu_profile_setting");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        cancelfling.toString = recyclerView;
        cancelfling.values = this.length;
        cancelfling.FastBitmap$CoordinateSystem = true;
        settingMoreProfileActivity.ICustomTabsCallback = ((cancelFling) cancelfling.setMin((PhotoView.FlingRunnable) new getMaxTextureSize(this) {
            final /* synthetic */ SettingMoreProfileActivity$FastBitmap$CoordinateSystem getMin;

            {
                this.getMin = r1;
            }

            public final void onFinished(int i) {
                this.getMin.setMax.ICustomTabsCallback = null;
                this.getMin.setMax.b = false;
            }
        })).length();
        this.setMax.b = true;
    }
}
