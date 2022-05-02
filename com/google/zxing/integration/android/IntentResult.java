package com.google.zxing.integration.android;

import android.content.Intent;

public final class IntentResult {
    private final String barcodeImagePath;
    private final String contents;
    private final String errorCorrectionLevel;
    private final String formatName;
    private final Integer orientation;
    private final Intent originalIntent;
    private final byte[] rawBytes;

    IntentResult() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, (Intent) null);
    }

    IntentResult(Intent intent) {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
    }

    IntentResult(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.contents = str;
        this.formatName = str2;
        this.rawBytes = bArr;
        this.orientation = num;
        this.errorCorrectionLevel = str3;
        this.barcodeImagePath = str4;
        this.originalIntent = intent;
    }

    public final String getContents() {
        return this.contents;
    }

    public final String getFormatName() {
        return this.formatName;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final Integer getOrientation() {
        return this.orientation;
    }

    public final String getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public final String getBarcodeImagePath() {
        return this.barcodeImagePath;
    }

    public final Intent getOriginalIntent() {
        return this.originalIntent;
    }

    public final String toString() {
        byte[] bArr = this.rawBytes;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder sb = new StringBuilder("Format: ");
        sb.append(this.formatName);
        sb.append(10);
        sb.append("Contents: ");
        sb.append(this.contents);
        sb.append(10);
        sb.append("Raw bytes: (");
        sb.append(length);
        sb.append(" bytes)\nOrientation: ");
        sb.append(this.orientation);
        sb.append(10);
        sb.append("EC level: ");
        sb.append(this.errorCorrectionLevel);
        sb.append(10);
        sb.append("Barcode image: ");
        sb.append(this.barcodeImagePath);
        sb.append(10);
        sb.append("Original intent: ");
        sb.append(this.originalIntent);
        sb.append(10);
        return sb.toString();
    }
}
