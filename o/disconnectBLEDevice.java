package o;

import id.dana.feeds.views.NewsViewHolderNews;

final class disconnectBLEDevice implements NewsViewHolderNews.length {
    private final connectBLEDevice length;

    public disconnectBLEDevice(connectBLEDevice connectbledevice) {
        this.length = connectbledevice;
    }

    public final void getMin(onProcess onprocess) {
        connectBLEDevice.getMin(this.length, onprocess);
    }
}
