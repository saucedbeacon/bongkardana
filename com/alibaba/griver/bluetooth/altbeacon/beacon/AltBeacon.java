package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import java.util.ArrayList;

public class AltBeacon extends Beacon {
    public static final Parcelable.Creator<AltBeacon> CREATOR = new Parcelable.Creator<AltBeacon>() {
        public final AltBeacon createFromParcel(Parcel parcel) {
            return new AltBeacon(parcel);
        }

        public final AltBeacon[] newArray(int i) {
            return new AltBeacon[i];
        }
    };
    private static final String TAG = "AltBeacon";

    public int describeContents() {
        return 0;
    }

    protected AltBeacon(Beacon beacon) {
        this.mBluetoothAddress = beacon.mBluetoothAddress;
        this.mIdentifiers = beacon.mIdentifiers;
        this.mBeaconTypeCode = beacon.mBeaconTypeCode;
        this.mDataFields = beacon.mDataFields;
        this.mDistance = beacon.mDistance;
        this.mRssi = beacon.mRssi;
        this.mTxPower = beacon.mTxPower;
    }

    protected AltBeacon() {
    }

    protected AltBeacon(Parcel parcel) {
        super(parcel);
    }

    public int getMfgReserved() {
        return ((Long) this.mDataFields.get(0)).intValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public static class Builder extends Beacon.Builder {
        public Beacon build() {
            return new AltBeacon(super.build());
        }

        public Builder setMfgReserved(int i) {
            if (this.mBeacon.mDataFields.size() != 0) {
                this.mBeacon.mDataFields = new ArrayList();
            }
            this.mBeacon.mDataFields.add(Long.valueOf((long) i));
            return this;
        }
    }
}
