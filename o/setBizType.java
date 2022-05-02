package o;

public class setBizType extends setSpeed<getBufferSize, ScanBridgeExtension> {
    /* access modifiers changed from: protected */
    public ScanBridgeExtension map(getBufferSize getbuffersize) {
        ScanBridgeExtension scanBridgeExtension = new ScanBridgeExtension();
        if (getbuffersize != null) {
            scanBridgeExtension.setEnabled(getbuffersize.isEnable());
            scanBridgeExtension.setHowToUrl(getbuffersize.getHowToUrl());
            scanBridgeExtension.setTitle(getbuffersize.getTitle());
        }
        return scanBridgeExtension;
    }
}
