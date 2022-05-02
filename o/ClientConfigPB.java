package o;

class ClientConfigPB {
    final BisUploadGwResult IsOverlapping;
    final int equals;
    final int getMax;
    final int getMin;
    final int length;
    final ClientConfigPB setMax;
    final int setMin;
    final long[] toFloatRange;

    ClientConfigPB(ZimDispatchPbGwFacade zimDispatchPbGwFacade, int i, int i2, int i3, int i4, int i5) {
        this.setMax = zimDispatchPbGwFacade.isInside;
        this.setMin = i;
        this.length = i2;
        this.getMax = i3;
        this.getMin = i4;
        this.equals = i5;
        this.toFloatRange = zimDispatchPbGwFacade.setMax;
        this.IsOverlapping = zimDispatchPbGwFacade.toFloatRange;
    }
}
