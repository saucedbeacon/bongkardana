package o;

import io.reactivex.internal.util.NotificationLite;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lid/dana/toggle/locationpermission/LocationPermissionSubject;", "", "()V", "<set-?>", "Lio/reactivex/subjects/BehaviorSubject;", "", "subject", "getSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "setSubject", "(Lio/reactivex/subjects/BehaviorSubject;)V", "setLocationPermission", "", "isEnabled", "toObservable", "Lio/reactivex/Observable;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isAlipayApp {
    @NotNull
    public removeString<Boolean> setMin;

    @Inject
    public isAlipayApp() {
        removeString<Boolean> max = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "BehaviorSubject.create()");
        this.setMin = max;
    }

    public final void setMin(boolean z) {
        Object obj;
        Object obj2 = this.setMin.getMax.get();
        if (NotificationLite.isComplete(obj2) || NotificationLite.isError(obj2)) {
            obj = null;
        } else {
            obj = NotificationLite.getValue(obj2);
        }
        if (!Intrinsics.areEqual((Object) (Boolean) obj, (Object) Boolean.valueOf(z))) {
            this.setMin.onNext(Boolean.valueOf(z));
        }
    }
}
