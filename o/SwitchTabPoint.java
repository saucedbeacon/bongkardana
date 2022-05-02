package o;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lid/dana/data/h5event/changephone/ChangePhoneNumberEventManager;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "changePhoneFinishCallback", "Lid/dana/data/h5event/changephone/ChangePhoneNumberEventManager$ChangePhoneFinishCallback;", "getChangePhoneFinishCallback$annotations", "getChangePhoneFinishCallback", "()Lid/dana/data/h5event/changephone/ChangePhoneNumberEventManager$ChangePhoneFinishCallback;", "setChangePhoneFinishCallback", "(Lid/dana/data/h5event/changephone/ChangePhoneNumberEventManager$ChangePhoneFinishCallback;)V", "processEvent", "", "changePhoneFinishEntity", "Lid/dana/data/h5event/changephone/ChangePhoneFinishEntity;", "ChangePhoneFinishCallback", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SwitchTabPoint {
    @NotNull
    public static final SwitchTabPoint INSTANCE = new SwitchTabPoint();
    private static final String TAG = SwitchTabPoint.class.getSimpleName();
    @Nullable
    private static getMax changePhoneFinishCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/data/h5event/changephone/ChangePhoneNumberEventManager$ChangePhoneFinishCallback;", "", "onChangePhoneFinished", "", "result", "Lid/dana/data/h5event/changephone/ChangePhoneFinishEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax {
        void onChangePhoneFinished(@Nullable getStatus getstatus);
    }

    @JvmStatic
    public static /* synthetic */ void getChangePhoneFinishCallback$annotations() {
    }

    private SwitchTabPoint() {
    }

    @Nullable
    public static final getMax getChangePhoneFinishCallback() {
        return changePhoneFinishCallback;
    }

    public static final void setChangePhoneFinishCallback(@Nullable getMax getmax) {
        changePhoneFinishCallback = getmax;
    }

    @JvmStatic
    public static final void processEvent(@Nullable getStatus getstatus) {
        String str = TAG;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(changePhoneFinishCallback != null);
        String format = String.format("checkout finish callback exist: %s", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        updateActionSheetContent.d(str, format);
        String str2 = TAG;
        Object[] objArr2 = new Object[1];
        objArr2[0] = Boolean.valueOf(getstatus != null);
        String format2 = String.format("checkout finish entity exists: %s", Arrays.copyOf(objArr2, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(this, *args)");
        updateActionSheetContent.d(str2, format2);
        getMax getmax = changePhoneFinishCallback;
        if (getmax != null) {
            getmax.onChangePhoneFinished(getstatus);
        }
        changePhoneFinishCallback = null;
    }
}
