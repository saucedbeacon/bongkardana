package com.google.firebase.ml.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode;

public interface zzd {
    @Nullable
    Rect getBoundingBox();

    @Nullable
    FirebaseVisionBarcode.CalendarEvent getCalendarEvent();

    @Nullable
    FirebaseVisionBarcode.ContactInfo getContactInfo();

    @Nullable
    Point[] getCornerPoints();

    @Nullable
    String getDisplayValue();

    @Nullable
    FirebaseVisionBarcode.DriverLicense getDriverLicense();

    @Nullable
    FirebaseVisionBarcode.Email getEmail();

    int getFormat();

    @Nullable
    FirebaseVisionBarcode.GeoPoint getGeoPoint();

    @Nullable
    FirebaseVisionBarcode.Phone getPhone();

    @Nullable
    String getRawValue();

    @Nullable
    FirebaseVisionBarcode.Sms getSms();

    @Nullable
    FirebaseVisionBarcode.UrlBookmark getUrl();

    int getValueType();

    @Nullable
    FirebaseVisionBarcode.WiFi getWifi();
}
