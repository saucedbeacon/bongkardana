package com.alipay.iap.android.lbs;

public enum LBSLocationErrorCode {
    LocationErrorSuccess(0) {
        public final String getErrorString() {
            return "LBS Location Error: success";
        }
    },
    LocationErrorNoAuthorization(1000) {
        public final String getErrorString() {
            return "LBS Location Error: current application has no authorization to access GPS or Network Location Provider";
        }
    },
    LocationErrorPositionDisabled(1001) {
        public final String getErrorString() {
            return "LBS Location Error: GPS or Network Location Provider is disabled in system";
        }
    },
    LocationErrorTimeout(1002) {
        public final String getErrorString() {
            return "LBS Location Error: timeout during request for location";
        }
    },
    LocationErrorParamInvalid(1003) {
        public final String getErrorString() {
            return "LBS Location Error: some input parameters are invalid, e.g. Context";
        }
    },
    LocationErrorSystem(1004) {
        public final String getErrorString() {
            return "LBS Location Error: some native system apis return error";
        }
    },
    LocationErrorCancelled(1005) {
        public final String getErrorString() {
            return "LBS Location Error: operation is cancelled outside";
        }
    },
    LocationErrorNullLocation(1006) {
        public final String getErrorString() {
            return "LBS Location Error: Location Provider cannot get fixed because of some unknown reasons";
        }
    },
    LocationErrorExpired(1007) {
        public final String getErrorString() {
            return "LBS Location Error: location is expired";
        }
    };
    

    /* renamed from: a  reason: collision with root package name */
    private int f9113a;

    private LBSLocationErrorCode(int i) {
        this.f9113a = i;
    }

    public int getErrorCode() {
        return this.f9113a;
    }

    public abstract String getErrorString();
}
