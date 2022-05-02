package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.Set;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;
import o.getAnimatedVisibility;

public final class setTabContainer {
    public static final Object setMin = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> TitleBarRightButtonView.AnonymousClass1<T> setMin(final RoomDatabase roomDatabase, final String[] strArr, Callable<T> callable) {
        hasCornerMarking min = getSecureSignatureComp.setMin(roomDatabase.getQueryExecutor());
        final isCornerMarkingShow<T> length = isCornerMarkingShow.length(callable);
        return TitleBarRightButtonView.AnonymousClass1.create(new TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<Object>() {
            public final void subscribe(final TitleBarRightButtonView.AnonymousClass2<Object> r3) throws Exception {
                final AnonymousClass1 r0 = new getAnimatedVisibility.setMax(strArr) {
                    public final void getMin(@NonNull Set<String> set) {
                        r3.onNext(setTabContainer.setMin);
                    }
                };
                roomDatabase.getInvalidationTracker().setMax(r0);
                AnonymousClass4 r1 = new removeStateDidChangeHandler() {
                    public final void getMax() throws Exception {
                        roomDatabase.getInvalidationTracker().length(r0);
                    }
                };
                setRefreshAnimation.getMax(r1, "run is null");
                r3.setDisposable(new setdeltaProgressValue(r1));
                r3.onNext(setTabContainer.setMin);
            }
        }).subscribeOn(min).unsubscribeOn(min).observeOn(min).flatMapMaybe(new RedDotDrawable<Object, getOptionMenu<T>>() {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
                return isCornerMarkingShow.this;
            }
        });
    }
}
