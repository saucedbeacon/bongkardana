package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import java.io.Serializable;

public class StartRMData implements Parcelable, Serializable {
    private static final String BACKGROUND_FLAG_KEY = "backgroundFlag";
    private static final String BETWEEN_SCAN_PERIOD_KEY = "betweenScanPeriod";
    private static final String CALLBACK_PACKAGE_NAME_KEY = "callbackPackageName";
    public static final Parcelable.Creator<StartRMData> CREATOR = new Parcelable.Creator<StartRMData>() {
        public final StartRMData createFromParcel(Parcel parcel) {
            return new StartRMData(parcel);
        }

        public final StartRMData[] newArray(int i) {
            return new StartRMData[i];
        }
    };
    private static final String REGION_KEY = "region";
    private static final String SCAN_PERIOD_KEY = "scanPeriod";
    private boolean mBackgroundFlag;
    private long mBetweenScanPeriod;
    private String mCallbackPackageName;
    private Region mRegion;
    private long mScanPeriod;

    public int describeContents() {
        return 0;
    }

    private StartRMData() {
    }

    public StartRMData(@NonNull Region region, @NonNull String str) {
        this.mRegion = region;
        this.mCallbackPackageName = str;
    }

    public StartRMData(long j, long j2, boolean z) {
        this.mScanPeriod = j;
        this.mBetweenScanPeriod = j2;
        this.mBackgroundFlag = z;
    }

    public StartRMData(@NonNull Region region, @NonNull String str, long j, long j2, boolean z) {
        this.mScanPeriod = j;
        this.mBetweenScanPeriod = j2;
        this.mRegion = region;
        this.mCallbackPackageName = str;
        this.mBackgroundFlag = z;
    }

    private StartRMData(Parcel parcel) {
        this.mRegion = (Region) parcel.readParcelable(StartRMData.class.getClassLoader());
        this.mCallbackPackageName = parcel.readString();
        this.mScanPeriod = parcel.readLong();
        this.mBetweenScanPeriod = parcel.readLong();
        this.mBackgroundFlag = parcel.readByte() != 0;
    }

    public static StartRMData fromBundle(@NonNull Bundle bundle) {
        boolean z;
        bundle.setClassLoader(Region.class.getClassLoader());
        StartRMData startRMData = new StartRMData();
        boolean z2 = true;
        if (bundle.containsKey("region")) {
            startRMData.mRegion = (Region) bundle.getSerializable("region");
            z = true;
        } else {
            z = false;
        }
        if (bundle.containsKey(SCAN_PERIOD_KEY)) {
            startRMData.mScanPeriod = ((Long) bundle.get(SCAN_PERIOD_KEY)).longValue();
        } else {
            z2 = z;
        }
        if (bundle.containsKey(BETWEEN_SCAN_PERIOD_KEY)) {
            startRMData.mBetweenScanPeriod = ((Long) bundle.get(BETWEEN_SCAN_PERIOD_KEY)).longValue();
        }
        if (bundle.containsKey(BACKGROUND_FLAG_KEY)) {
            startRMData.mBackgroundFlag = ((Boolean) bundle.get(BACKGROUND_FLAG_KEY)).booleanValue();
        }
        if (bundle.containsKey(CALLBACK_PACKAGE_NAME_KEY)) {
            startRMData.mCallbackPackageName = (String) bundle.get(CALLBACK_PACKAGE_NAME_KEY);
        }
        if (z2) {
            return startRMData;
        }
        return null;
    }

    public long getScanPeriod() {
        return this.mScanPeriod;
    }

    public long getBetweenScanPeriod() {
        return this.mBetweenScanPeriod;
    }

    public Region getRegionData() {
        return this.mRegion;
    }

    public String getCallbackPackageName() {
        return this.mCallbackPackageName;
    }

    public boolean getBackgroundFlag() {
        return this.mBackgroundFlag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRegion, i);
        parcel.writeString(this.mCallbackPackageName);
        parcel.writeLong(this.mScanPeriod);
        parcel.writeLong(this.mBetweenScanPeriod);
        parcel.writeByte(this.mBackgroundFlag ? (byte) 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong(SCAN_PERIOD_KEY, this.mScanPeriod);
        bundle.putLong(BETWEEN_SCAN_PERIOD_KEY, this.mBetweenScanPeriod);
        bundle.putBoolean(BACKGROUND_FLAG_KEY, this.mBackgroundFlag);
        bundle.putString(CALLBACK_PACKAGE_NAME_KEY, this.mCallbackPackageName);
        Region region = this.mRegion;
        if (region != null) {
            bundle.putSerializable("region", region);
        }
        return bundle;
    }
}
