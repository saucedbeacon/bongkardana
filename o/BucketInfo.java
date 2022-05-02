package o;

import o.BeaconParser;

public final class BucketInfo {
    String FastBitmap$CoordinateSystem;
    public String IsOverlapping;
    public String equals;
    public String getMax;
    public String getMin;
    public String isInside;
    public String length;
    public String setMax;
    public String setMin;
    public String toFloatRange;
    public String toIntRange;
    public BeaconParser.BeaconLayoutException toString;

    /* synthetic */ BucketInfo(byte b) {
        this();
    }

    private BucketInfo() {
    }

    public static class length {
        public BeaconParser.BeaconLayoutException FastBitmap$CoordinateSystem;
        public String IsOverlapping;
        public String equals;
        public String getMax;
        public String getMin;
        public String isInside;
        public String length;
        public String setMax;
        public String setMin;
        public String toFloatRange;
        public String toIntRange;
        public String values;

        public final BucketInfo setMax() {
            BucketInfo bucketInfo = new BucketInfo((byte) 0);
            bucketInfo.length = this.length;
            bucketInfo.getMin = this.setMin;
            bucketInfo.setMin = this.getMin;
            bucketInfo.setMax = this.setMax;
            bucketInfo.getMax = this.getMax;
            bucketInfo.IsOverlapping = this.toFloatRange;
            bucketInfo.isInside = this.isInside;
            bucketInfo.toIntRange = this.equals;
            bucketInfo.equals = this.IsOverlapping;
            bucketInfo.toFloatRange = this.toIntRange;
            bucketInfo.toString = this.FastBitmap$CoordinateSystem;
            bucketInfo.FastBitmap$CoordinateSystem = this.values;
            return bucketInfo;
        }
    }
}
