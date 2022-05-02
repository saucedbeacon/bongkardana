package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public class ScanFilterUtils {
    public static final String TAG = "ScanFilterUtils";

    public List<ScanFilterData> createScanFilterDataForBeaconParser(BeaconParser beaconParser) {
        ArrayList arrayList = new ArrayList();
        for (int i : beaconParser.getHardwareAssistManufacturers()) {
            Long serviceUuid = beaconParser.getServiceUuid();
            long longValue = beaconParser.getMatchingBeaconTypeCode().longValue();
            int matchingBeaconTypeCodeStartOffset = beaconParser.getMatchingBeaconTypeCodeStartOffset();
            int matchingBeaconTypeCodeEndOffset = beaconParser.getMatchingBeaconTypeCodeEndOffset();
            int i2 = (matchingBeaconTypeCodeEndOffset + 1) - 2;
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[i2];
            byte[] longToByteArray = BeaconParser.longToByteArray(longValue, (matchingBeaconTypeCodeEndOffset - matchingBeaconTypeCodeStartOffset) + 1);
            for (int i3 = 2; i3 <= matchingBeaconTypeCodeEndOffset; i3++) {
                int i4 = i3 - 2;
                if (i3 < matchingBeaconTypeCodeStartOffset) {
                    bArr[i4] = 0;
                    bArr2[i4] = 0;
                } else {
                    bArr[i4] = longToByteArray[i3 - matchingBeaconTypeCodeStartOffset];
                    bArr2[i4] = -1;
                }
            }
            ScanFilterData scanFilterData = new ScanFilterData();
            scanFilterData.manufacturer = i;
            scanFilterData.filter = bArr;
            scanFilterData.mask = bArr2;
            scanFilterData.serviceUuid = serviceUuid;
            arrayList.add(scanFilterData);
        }
        return arrayList;
    }

    public List<ScanFilter> createScanFiltersForBeaconParsers(List<BeaconParser> list) {
        ArrayList arrayList = new ArrayList();
        for (BeaconParser createScanFilterDataForBeaconParser : list) {
            for (ScanFilterData next : createScanFilterDataForBeaconParser(createScanFilterDataForBeaconParser)) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                if (next.serviceUuid != null) {
                    String format = String.format("0000%04X-0000-1000-8000-00805f9b34fb", new Object[]{next.serviceUuid});
                    ParcelUuid fromString = ParcelUuid.fromString(format);
                    ParcelUuid fromString2 = ParcelUuid.fromString("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF");
                    if (LogManager.isVerboseLoggingEnabled()) {
                        StringBuilder sb = new StringBuilder("making scan filter for service: ");
                        sb.append(format);
                        sb.append(" ");
                        sb.append(fromString);
                        LogManager.d(TAG, sb.toString(), new Object[0]);
                        StringBuilder sb2 = new StringBuilder("making scan filter with service mask: ");
                        sb2.append("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF");
                        sb2.append(" ");
                        sb2.append(fromString2);
                        LogManager.d(TAG, sb2.toString(), new Object[0]);
                    }
                    builder.setServiceUuid(fromString, fromString2);
                } else {
                    builder.setServiceUuid((ParcelUuid) null);
                    builder.setManufacturerData(next.manufacturer, next.filter, next.mask);
                }
                ScanFilter build = builder.build();
                if (LogManager.isVerboseLoggingEnabled()) {
                    LogManager.d(TAG, "Set up a scan filter: ".concat(String.valueOf(build)), new Object[0]);
                }
                arrayList.add(build);
            }
        }
        return arrayList;
    }

    class ScanFilterData {
        public byte[] filter;
        public int manufacturer;
        public byte[] mask;
        public Long serviceUuid = null;

        ScanFilterData() {
        }
    }
}
