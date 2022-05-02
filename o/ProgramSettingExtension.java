package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/NearbySearchResultTabAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "pageTitles", "", "addFragment", "", "fragment", "key", "", "title", "getCount", "", "getItem", "position", "getPageTitle", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ProgramSettingExtension extends onLevelChange {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);
    private final ArrayList<CharSequence> setMax = new ArrayList<>();
    private final ArrayList<Fragment> setMin = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgramSettingExtension(@NotNull FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
    }

    public final int getCount() {
        return this.setMin.size();
    }

    @NotNull
    public final Fragment getMax(int i) {
        Fragment fragment = this.setMin.get(i);
        Intrinsics.checkNotNullExpressionValue(fragment, "fragments[position]");
        return fragment;
    }

    public final void getMin(@NotNull Fragment fragment, @NotNull String str, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "key");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        fragment.setArguments(arguments);
        Bundle arguments2 = fragment.getArguments();
        if (arguments2 != null) {
            arguments2.putString("key", str);
        }
        this.setMin.add(fragment);
        this.setMax.add(charSequence);
    }

    @Nullable
    public final CharSequence getPageTitle(int i) {
        return this.setMax.get(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/NearbySearchResultTabAdapter$Companion;", "", "()V", "FRAGMENT_KEY", "", "LOCATION_FRAGMENT_KEY", "LOCATION_TAB_POSITION", "", "MERCHANT_FRAGMENT_KEY", "MERCHANT_TAB_POSITION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
