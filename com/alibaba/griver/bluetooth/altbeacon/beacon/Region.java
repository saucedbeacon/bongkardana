package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Region implements Parcelable, Serializable {
    public static final Parcelable.Creator<Region> CREATOR = new Parcelable.Creator<Region>() {
        public final Region createFromParcel(Parcel parcel) {
            return new Region(parcel);
        }

        public final Region[] newArray(int i) {
            return new Region[i];
        }
    };
    private static final Pattern MAC_PATTERN = Pattern.compile("^[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}$");
    private static final String TAG = "Region";
    protected final String mBluetoothAddress;
    protected final List<Identifier> mIdentifiers;
    protected final String mUniqueId;

    public int describeContents() {
        return 0;
    }

    public Region(String str, Identifier identifier, Identifier identifier2, Identifier identifier3) {
        ArrayList arrayList = new ArrayList(3);
        this.mIdentifiers = arrayList;
        arrayList.add(identifier);
        this.mIdentifiers.add(identifier2);
        this.mIdentifiers.add(identifier3);
        this.mUniqueId = str;
        this.mBluetoothAddress = null;
        if (str == null) {
            throw new NullPointerException("uniqueId may not be null");
        }
    }

    public Region(String str, List<Identifier> list) {
        this(str, list, (String) null);
    }

    public Region(String str, List<Identifier> list, String str2) {
        validateMac(str2);
        this.mIdentifiers = new ArrayList(list);
        this.mUniqueId = str;
        this.mBluetoothAddress = str2;
        if (str == null) {
            throw new NullPointerException("uniqueId may not be null");
        }
    }

    public Region(String str, String str2) {
        validateMac(str2);
        this.mBluetoothAddress = str2;
        this.mUniqueId = str;
        this.mIdentifiers = new ArrayList();
        if (str == null) {
            throw new NullPointerException("uniqueId may not be null");
        }
    }

    protected Region(Parcel parcel) {
        this.mUniqueId = parcel.readString();
        this.mBluetoothAddress = parcel.readString();
        int readInt = parcel.readInt();
        this.mIdentifiers = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (readString == null) {
                this.mIdentifiers.add((Object) null);
            } else {
                this.mIdentifiers.add(Identifier.parse(readString));
            }
        }
    }

    public Identifier getId1() {
        return getIdentifier(0);
    }

    public Identifier getId2() {
        return getIdentifier(1);
    }

    public Identifier getId3() {
        return getIdentifier(2);
    }

    public Identifier getIdentifier(int i) {
        if (this.mIdentifiers.size() > i) {
            return this.mIdentifiers.get(i);
        }
        return null;
    }

    public String getUniqueId() {
        return this.mUniqueId;
    }

    public String getBluetoothAddress() {
        return this.mBluetoothAddress;
    }

    public boolean matchesBeacon(Beacon beacon) {
        int size = this.mIdentifiers.size();
        while (true) {
            size--;
            if (size >= 0) {
                Identifier identifier = this.mIdentifiers.get(size);
                Identifier identifier2 = null;
                if (size < beacon.mIdentifiers.size()) {
                    identifier2 = beacon.getIdentifier(size);
                }
                if ((identifier2 != null || identifier == null) && (identifier2 == null || identifier == null || identifier.equals(identifier2))) {
                }
            } else {
                String str = this.mBluetoothAddress;
                if (str == null || str.equalsIgnoreCase(beacon.mBluetoothAddress)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.mUniqueId.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Region) {
            return ((Region) obj).mUniqueId.equals(this.mUniqueId);
        }
        return false;
    }

    public boolean hasSameIdentifiers(Region region) {
        if (region.mIdentifiers.size() != this.mIdentifiers.size()) {
            return false;
        }
        for (int i = 0; i < region.mIdentifiers.size(); i++) {
            if (region.getIdentifier(i) == null && getIdentifier(i) != null) {
                return false;
            }
            if (region.getIdentifier(i) != null && getIdentifier(i) == null) {
                return false;
            }
            if ((region.getIdentifier(i) != null || getIdentifier(i) != null) && !region.getIdentifier(i).equals(getIdentifier(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Identifier next : this.mIdentifiers) {
            if (i > 1) {
                sb.append(" ");
            }
            sb.append("id");
            sb.append(i);
            sb.append(": ");
            if (next == null) {
                str = "null";
            } else {
                str = next.toString();
            }
            sb.append(str);
            i++;
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUniqueId);
        parcel.writeString(this.mBluetoothAddress);
        parcel.writeInt(this.mIdentifiers.size());
        for (Identifier next : this.mIdentifiers) {
            if (next != null) {
                parcel.writeString(next.toString());
            } else {
                parcel.writeString((String) null);
            }
        }
    }

    private void validateMac(String str) {
        if (str != null && !MAC_PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("Invalid mac address: '");
            sb.append(str);
            sb.append("' Must be 6 hex bytes separated by colons.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Deprecated
    public Region clone() {
        return new Region(this.mUniqueId, this.mIdentifiers, this.mBluetoothAddress);
    }
}
