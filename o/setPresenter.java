package o;

import android.os.IBinder;

class setPresenter implements setOverflowIcon {
    private final IBinder setMax;

    setPresenter(IBinder iBinder) {
        this.setMax = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof setPresenter) && ((setPresenter) obj).setMax.equals(this.setMax);
    }

    public int hashCode() {
        return this.setMax.hashCode();
    }
}
