package o;

class ZimDispatchPbGwFacade {
    boolean getMax;
    int getMin;
    ClientConfigPB isInside;
    MapStringString length;
    long[] setMax;
    int setMin;
    BisUploadGwResult toFloatRange;

    ZimDispatchPbGwFacade() {
    }

    /* access modifiers changed from: package-private */
    public final void setMin(int i, int i2, int i3) {
        long[] jArr;
        ClientConfigPB clientConfigPB = this.isInside;
        if (clientConfigPB != null && clientConfigPB.toFloatRange == (jArr = this.setMax)) {
            this.setMax = (long[]) jArr.clone();
        }
        this.setMax[i] = (((long) i3) << 32) | (((long) i2) & 4294967295L);
    }
}
