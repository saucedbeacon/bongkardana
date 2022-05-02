package o;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

public class setCornerRadius$core {
    @JSONField(name = "bluetooth")
    public List<getMax> bluetooth;
    @JSONField(name = "cpu")
    public setMin cpu;
    @JSONField(name = "device")
    public getMin device;
    @JSONField(name = "display")
    public setMax display;
    @JSONField(name = "externalStorage")
    public length externalStorage;
    @JSONField(name = "gps")
    public toFloatRange gps;
    @JSONField(name = "IP")
    public isInside ip;
    @JSONField(name = "memory")
    public toIntRange memory;
    @JSONField(name = "SysFeature")
    public IsOverlapping sysFeature;
    @JSONField(name = "wifi")
    public List<equals> wifi;

    public static class IsOverlapping {
        @JSONField(name = "bluetooth")
        public boolean bluetooth;
        @JSONField(name = "locationGPS")
        public boolean locationGPS;
        @JSONField(name = "nfc")
        public boolean nfc;
        @JSONField(name = "nfcHostCardEmulation")
        public boolean nfcHostCardEmulation;
        @JSONField(name = "telephony")
        public boolean telephony;
        @JSONField(name = "usbAccessory")
        public boolean usbAccessory;
        @JSONField(name = "usbHost")
        public boolean usbHost;
        @JSONField(name = "wifi")
        public boolean wifi;
        @JSONField(name = "wifiDirect")
        public boolean wifiDirect;
    }

    public static class equals {
        @JSONField(name = "bssid")
        public String bssid;
        @JSONField(name = "frequency")
        public int frequency;
        @JSONField(name = "isCurrent")
        public boolean isCurrent;
        @JSONField(name = "level")
        public int level;
        @JSONField(name = "ssid")
        public String ssid;
    }

    public static class getMax {
        @JSONField(name = "address")
        public String address;
        @JSONField(name = "bondState")
        public int bondState;
        @JSONField(name = "isBounded")
        public boolean isBounded;
        @JSONField(name = "isBounding")
        public boolean isBounding;
        @JSONField(name = "type")
        public int type;
    }

    public static class getMin {
        @JSONField(name = "androidId")
        public String androidId;
        @JSONField(name = "appVersion")
        public String appVersion;
        @JSONField(name = "blueMac")
        public String blueMac;
        @JSONField(name = "buildBoard")
        public String buildBoard;
        @JSONField(name = "buildBootloader")
        public String buildBootloader;
        @JSONField(name = "buildBrand")
        public String buildBrand;
        @JSONField(name = "buildDevice")
        public String buildDevice;
        @JSONField(name = "buildManufacturer")
        public String buildManufacturer;
        @JSONField(name = "buildModel")
        public String buildModel;
        @JSONField(name = "buildProduct")
        public String buildProduct;
        @JSONField(name = "buildSerial")
        public String buildSerial;
        @JSONField(name = "device_id")
        public String deviceId;
        @JSONField(name = "fingerPrint")
        public String fingerPrint;
        @JSONField(name = "imei")
        public String imei;
        @JSONField(name = "isEmulator")
        public boolean isEmulator;
        @JSONField(name = "isRooted")
        public boolean isRooted;
        @JSONField(name = "networkType")
        public String networkType;
        @JSONField(name = "osVersion")
        public String osVersion;
        @JSONField(name = "osVersionInt")
        public int osVersionInt;
        @JSONField(name = "timeLocation")
        public getMax timeLocation;
        @JSONField(name = "utdidAdvertisementId")
        public String utdidAdvertisementId;

        public static class getMax {
            @JSONField(name = "latitude")
            public String latitude;
            @JSONField(name = "longitude")
            public String longitude;
            @JSONField(name = "timeZone")
            public String timeZone;
        }
    }

    public static class isInside {
        @JSONField(name = "ethIp")
        public String ethIp;
        @JSONField(name = "trueIp")
        public String trueIp;
    }

    public static class length {
        @JSONField(name = "diskFree")
        public String diskFree;
        @JSONField(name = "diskTotal")
        public String diskTotal;
    }

    public static class setMax {
        @JSONField(name = "density")
        public int density;
        @JSONField(name = "height")
        public int height;
        @JSONField(name = "width")
        public int width;
    }

    public static class setMin {
        @JSONField(name = "cpuABI")
        public String cpuABI;
        @JSONField(name = "cpuABI2")
        public String cpuABI2;
        @JSONField(name = "cpuArchitecture")
        public String cpuArchitecture;
        @JSONField(name = "cpuCurFreq")
        public int cpuCurFreq;
        @JSONField(name = "cpuMaxFreq")
        public int cpuMaxFreq;
        @JSONField(name = "cpuMinFreq")
        public int cpuMinFreq;
        @JSONField(name = "cpuName")
        public String cpuName;
        @JSONField(name = "cpuSerial")
        public String cpuSerial;
    }

    public static class toFloatRange {
        @JSONField(name = "error")
        public int error;
        @JSONField(name = "latitude")
        public String latitude;
        @JSONField(name = "longitude")
        public String longitude;
        @JSONField(name = "time")
        public long time;
    }

    public static class toIntRange {
        @JSONField(name = "maxMemory")
        public String maxMemory;
        @JSONField(name = "totalMemory")
        public String totalMemory;
    }
}
