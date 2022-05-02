package o;

import o.TitleBarRightButtonView;
import pl.charmas.android.reactivelocation2.observables.GoogleAPIConnectionSuspendedException;

public final class syncUploadCoreByCategoryDirectly {
    public final updateTimeZone setMin;

    public syncUploadCoreByCategoryDirectly(updateTimeZone updatetimezone) {
        this.setMin = updatetimezone;
    }

    public static class getMax<T> implements TitleBarRightButtonView.AnonymousClass3.AnonymousClass1<T, T> {
        private final boolean getMin;

        public getMax(boolean z) {
            this.getMin = z;
        }

        public final TitleBarRightButtonView.AnonymousClass4<T> getMin(TitleBarRightButtonView.AnonymousClass1<T> r3) {
            return this.getMin ? r3.retry((setBounds<? super Integer, ? super Throwable>) new setMin((byte) 0)) : r3;
        }

        static class setMin implements setBounds<Integer, Throwable> {
            private setMin() {
            }

            /* synthetic */ setMin(byte b) {
                this();
            }

            public final /* bridge */ /* synthetic */ boolean getMin(Object obj, Object obj2) throws Exception {
                return getMin((Throwable) obj2);
            }

            private static boolean getMin(Throwable th) throws Exception {
                return th instanceof GoogleAPIConnectionSuspendedException;
            }
        }
    }
}
