package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.setStateOn;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a@\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\r"}, d2 = {"getPermissionBuilder", "Lid/dana/utils/permission/Permission$Builder;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "permission", "Lkotlin/Lazy;", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "", "onPermissionGranted", "Lkotlin/Function0;", "", "onPermissionDenied", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class MyBeaconService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ Function0 $onPermissionDenied;
        final /* synthetic */ Function0 $onPermissionGranted;
        final /* synthetic */ String $permission;
        final /* synthetic */ setChecked $this_permission;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(setChecked setchecked, String str, Function0 function0, Function0 function02) {
            super(0);
            this.$this_permission = setchecked;
            this.$permission = str;
            this.$onPermissionGranted = function0;
            this.$onPermissionDenied = function02;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin;
            setChecked setchecked = this.$this_permission;
            if (setchecked instanceof Activity) {
                getmin = new setStateOn.getMin((Activity) setchecked);
            } else if (setchecked != null) {
                getmin = new setStateOn.getMin((Fragment) setchecked);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
            }
            getmin.length.add(this.$permission);
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ setMax getMin;

                {
                    this.getMin = r1;
                }

                public final void setMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    this.getMin.$onPermissionDenied.invoke();
                }

                public final void getMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    if (Intrinsics.areEqual((Object) setmin.getMin, (Object) this.getMin.$permission) && setmin.setMax()) {
                        this.getMin.$onPermissionGranted.invoke();
                    }
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }
}
