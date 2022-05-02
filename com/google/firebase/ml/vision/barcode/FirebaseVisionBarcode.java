package com.google.firebase.ml.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.firebase.ml.vision.barcode.internal.zzd;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FirebaseVisionBarcode {
    public static final int FORMAT_ALL_FORMATS = 0;
    public static final int FORMAT_AZTEC = 4096;
    public static final int FORMAT_CODABAR = 8;
    public static final int FORMAT_CODE_128 = 1;
    public static final int FORMAT_CODE_39 = 2;
    public static final int FORMAT_CODE_93 = 4;
    public static final int FORMAT_DATA_MATRIX = 16;
    public static final int FORMAT_EAN_13 = 32;
    public static final int FORMAT_EAN_8 = 64;
    public static final int FORMAT_ITF = 128;
    public static final int FORMAT_PDF417 = 2048;
    public static final int FORMAT_QR_CODE = 256;
    public static final int FORMAT_UNKNOWN = -1;
    public static final int FORMAT_UPC_A = 512;
    public static final int FORMAT_UPC_E = 1024;
    public static final int TYPE_CALENDAR_EVENT = 11;
    public static final int TYPE_CONTACT_INFO = 1;
    public static final int TYPE_DRIVER_LICENSE = 12;
    public static final int TYPE_EMAIL = 2;
    public static final int TYPE_GEO = 10;
    public static final int TYPE_ISBN = 3;
    public static final int TYPE_PHONE = 4;
    public static final int TYPE_PRODUCT = 5;
    public static final int TYPE_SMS = 6;
    public static final int TYPE_TEXT = 7;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_URL = 8;
    public static final int TYPE_WIFI = 9;
    private static final SparseArray<zzmn.zzai.zza> zzbfo = new SparseArray<>();
    private static final SparseArray<zzmn.zzai.zzb> zzbfp = new SparseArray<>();
    private final zzd zzbfq;

    @Retention(RetentionPolicy.CLASS)
    public @interface BarcodeFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface BarcodeValueType {
    }

    public FirebaseVisionBarcode(@NonNull zzd zzd) {
        this.zzbfq = (zzd) Preconditions.checkNotNull(zzd);
    }

    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final String[] addressLines;
        private final int type;

        @Retention(RetentionPolicy.CLASS)
        public @interface AddressType {
        }

        public Address(int i, String[] strArr) {
            this.type = i;
            this.addressLines = strArr;
        }

        @AddressType
        public int getType() {
            return this.type;
        }

        @NonNull
        public String[] getAddressLines() {
            return this.addressLines;
        }
    }

    public static class GeoPoint {
        private final double lat;
        private final double lng;

        public GeoPoint(double d, double d2) {
            this.lat = d;
            this.lng = d2;
        }

        public double getLat() {
            return this.lat;
        }

        public double getLng() {
            return this.lng;
        }
    }

    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        @Nullable
        private final String number;
        private final int type;

        @Retention(RetentionPolicy.CLASS)
        public @interface FormatType {
        }

        public Phone(@Nullable String str, int i) {
            this.number = str;
            this.type = i;
        }

        @Nullable
        public String getNumber() {
            return this.number;
        }

        @FormatType
        public int getType() {
            return this.type;
        }
    }

    public static class Sms {
        @Nullable
        private final String message;
        @Nullable
        private final String phoneNumber;

        public Sms(@Nullable String str, @Nullable String str2) {
            this.message = str;
            this.phoneNumber = str2;
        }

        @Nullable
        public String getMessage() {
            return this.message;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    public static class UrlBookmark {
        @Nullable
        private final String title;
        @Nullable
        private final String url;

        public UrlBookmark(@Nullable String str, @Nullable String str2) {
            this.title = str;
            this.url = str2;
        }

        @Nullable
        public String getTitle() {
            return this.title;
        }

        @Nullable
        public String getUrl() {
            return this.url;
        }
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.zzbfq.getBoundingBox();
    }

    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;
        private final int encryptionType;
        @Nullable
        private final String password;
        @Nullable
        private final String ssid;

        @Retention(RetentionPolicy.CLASS)
        public @interface EncryptionType {
        }

        public WiFi(@Nullable String str, @Nullable String str2, int i) {
            this.ssid = str;
            this.password = str2;
            this.encryptionType = i;
        }

        @Nullable
        public String getSsid() {
            return this.ssid;
        }

        @Nullable
        public String getPassword() {
            return this.password;
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.encryptionType;
        }
    }

    @Nullable
    public Point[] getCornerPoints() {
        return this.zzbfq.getCornerPoints();
    }

    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        @Nullable
        private final String address;
        @Nullable
        private final String body;
        @Nullable
        private final String subject;
        private final int type;

        @Retention(RetentionPolicy.CLASS)
        public @interface FormatType {
        }

        public Email(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.type = i;
            this.address = str;
            this.subject = str2;
            this.body = str3;
        }

        @FormatType
        public int getType() {
            return this.type;
        }

        @Nullable
        public String getAddress() {
            return this.address;
        }

        @Nullable
        public String getSubject() {
            return this.subject;
        }

        @Nullable
        public String getBody() {
            return this.body;
        }
    }

    @Nullable
    public String getRawValue() {
        return this.zzbfq.getRawValue();
    }

    @Nullable
    public String getDisplayValue() {
        return this.zzbfq.getDisplayValue();
    }

    @BarcodeFormat
    public int getFormat() {
        int format = this.zzbfq.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public static class CalendarEvent {
        @Nullable
        private final String description;
        @Nullable
        private final String location;
        @Nullable
        private final String organizer;
        @Nullable
        private final String status;
        @Nullable
        private final String summary;
        @Nullable
        private final CalendarDateTime zzbfs;
        @Nullable
        private final CalendarDateTime zzbft;

        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CalendarDateTime calendarDateTime, @Nullable CalendarDateTime calendarDateTime2) {
            this.summary = str;
            this.description = str2;
            this.location = str3;
            this.organizer = str4;
            this.status = str5;
            this.zzbfs = calendarDateTime;
            this.zzbft = calendarDateTime2;
        }

        @Nullable
        public String getSummary() {
            return this.summary;
        }

        @Nullable
        public String getDescription() {
            return this.description;
        }

        @Nullable
        public String getLocation() {
            return this.location;
        }

        @Nullable
        public String getOrganizer() {
            return this.organizer;
        }

        @Nullable
        public String getStatus() {
            return this.status;
        }

        @Nullable
        public CalendarDateTime getStart() {
            return this.zzbfs;
        }

        @Nullable
        public CalendarDateTime getEnd() {
            return this.zzbft;
        }
    }

    public static class ContactInfo {
        @Nullable
        private final String organization;
        @Nullable
        private final String title;
        @Nullable
        private final String[] urls;
        @Nullable
        private final PersonName zzbfu;
        private final List<Phone> zzbfv;
        private final List<Email> zzbfw;
        private final List<Address> zzbfx;

        public ContactInfo(@Nullable PersonName personName, @Nullable String str, @Nullable String str2, @NonNull List<Phone> list, @NonNull List<Email> list2, @Nullable String[] strArr, @NonNull List<Address> list3) {
            this.zzbfu = personName;
            this.organization = str;
            this.title = str2;
            this.zzbfv = list;
            this.zzbfw = list2;
            this.urls = strArr;
            this.zzbfx = list3;
        }

        @Nullable
        public PersonName getName() {
            return this.zzbfu;
        }

        @Nullable
        public String getOrganization() {
            return this.organization;
        }

        @Nullable
        public String getTitle() {
            return this.title;
        }

        @NonNull
        public List<Phone> getPhones() {
            return this.zzbfv;
        }

        @NonNull
        public List<Email> getEmails() {
            return this.zzbfw;
        }

        @Nullable
        public String[] getUrls() {
            return this.urls;
        }

        @NonNull
        public List<Address> getAddresses() {
            return this.zzbfx;
        }
    }

    public static class PersonName {
        @Nullable
        private final String first;
        @Nullable
        private final String formattedName;
        @Nullable
        private final String last;
        @Nullable
        private final String middle;
        @Nullable
        private final String prefix;
        @Nullable
        private final String pronunciation;
        @Nullable
        private final String suffix;

        public PersonName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.formattedName = str;
            this.pronunciation = str2;
            this.prefix = str3;
            this.first = str4;
            this.middle = str5;
            this.last = str6;
            this.suffix = str7;
        }

        @Nullable
        public String getFormattedName() {
            return this.formattedName;
        }

        @Nullable
        public String getPronunciation() {
            return this.pronunciation;
        }

        @Nullable
        public String getPrefix() {
            return this.prefix;
        }

        @Nullable
        public String getFirst() {
            return this.first;
        }

        @Nullable
        public String getMiddle() {
            return this.middle;
        }

        @Nullable
        public String getLast() {
            return this.last;
        }

        @Nullable
        public String getSuffix() {
            return this.suffix;
        }
    }

    public static class CalendarDateTime {
        private final int day;
        private final int hours;
        private final boolean isUtc;
        private final int minutes;
        private final int month;
        @Nullable
        private final String rawValue;
        private final int seconds;
        private final int year;

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable String str) {
            this.year = i;
            this.month = i2;
            this.day = i3;
            this.hours = i4;
            this.minutes = i5;
            this.seconds = i6;
            this.isUtc = z;
            this.rawValue = str;
        }

        public int getYear() {
            return this.year;
        }

        public int getMonth() {
            return this.month;
        }

        public int getDay() {
            return this.day;
        }

        public int getHours() {
            return this.hours;
        }

        public int getMinutes() {
            return this.minutes;
        }

        public int getSeconds() {
            return this.seconds;
        }

        public boolean isUtc() {
            return this.isUtc;
        }

        @Nullable
        public String getRawValue() {
            return this.rawValue;
        }
    }

    @BarcodeValueType
    public int getValueType() {
        return this.zzbfq.getValueType();
    }

    @Nullable
    public Email getEmail() {
        return this.zzbfq.getEmail();
    }

    @Nullable
    public Phone getPhone() {
        return this.zzbfq.getPhone();
    }

    @Nullable
    public Sms getSms() {
        return this.zzbfq.getSms();
    }

    public static class DriverLicense {
        @Nullable
        private final String addressCity;
        @Nullable
        private final String addressState;
        @Nullable
        private final String addressStreet;
        @Nullable
        private final String addressZip;
        @Nullable
        private final String birthDate;
        @Nullable
        private final String documentType;
        @Nullable
        private final String expiryDate;
        @Nullable
        private final String firstName;
        @Nullable
        private final String gender;
        @Nullable
        private final String issueDate;
        @Nullable
        private final String issuingCountry;
        @Nullable
        private final String lastName;
        @Nullable
        private final String licenseNumber;
        @Nullable
        private final String middleName;

        public DriverLicense(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.documentType = str;
            this.firstName = str2;
            this.middleName = str3;
            this.lastName = str4;
            this.gender = str5;
            this.addressStreet = str6;
            this.addressCity = str7;
            this.addressState = str8;
            this.addressZip = str9;
            this.licenseNumber = str10;
            this.issueDate = str11;
            this.expiryDate = str12;
            this.birthDate = str13;
            this.issuingCountry = str14;
        }

        @Nullable
        public String getDocumentType() {
            return this.documentType;
        }

        @Nullable
        public String getFirstName() {
            return this.firstName;
        }

        @Nullable
        public String getMiddleName() {
            return this.middleName;
        }

        @Nullable
        public String getLastName() {
            return this.lastName;
        }

        @Nullable
        public String getGender() {
            return this.gender;
        }

        @Nullable
        public String getAddressStreet() {
            return this.addressStreet;
        }

        @Nullable
        public String getAddressCity() {
            return this.addressCity;
        }

        @Nullable
        public String getAddressState() {
            return this.addressState;
        }

        @Nullable
        public String getAddressZip() {
            return this.addressZip;
        }

        @Nullable
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        @Nullable
        public String getIssueDate() {
            return this.issueDate;
        }

        @Nullable
        public String getExpiryDate() {
            return this.expiryDate;
        }

        @Nullable
        public String getBirthDate() {
            return this.birthDate;
        }

        @Nullable
        public String getIssuingCountry() {
            return this.issuingCountry;
        }
    }

    @Nullable
    public WiFi getWifi() {
        return this.zzbfq.getWifi();
    }

    @Nullable
    public UrlBookmark getUrl() {
        return this.zzbfq.getUrl();
    }

    @Nullable
    public GeoPoint getGeoPoint() {
        return this.zzbfq.getGeoPoint();
    }

    @Nullable
    public CalendarEvent getCalendarEvent() {
        return this.zzbfq.getCalendarEvent();
    }

    @Nullable
    public ContactInfo getContactInfo() {
        return this.zzbfq.getContactInfo();
    }

    @Nullable
    public DriverLicense getDriverLicense() {
        return this.zzbfq.getDriverLicense();
    }

    public final zzmn.zzai.zza zzox() {
        zzmn.zzai.zza zza = zzbfo.get(getFormat());
        return zza == null ? zzmn.zzai.zza.FORMAT_UNKNOWN : zza;
    }

    public final zzmn.zzai.zzb zzoy() {
        zzmn.zzai.zzb zzb = zzbfp.get(getValueType());
        return zzb == null ? zzmn.zzai.zzb.TYPE_UNKNOWN : zzb;
    }

    static {
        zzbfo.put(-1, zzmn.zzai.zza.FORMAT_UNKNOWN);
        zzbfo.put(1, zzmn.zzai.zza.FORMAT_CODE_128);
        zzbfo.put(2, zzmn.zzai.zza.FORMAT_CODE_39);
        zzbfo.put(4, zzmn.zzai.zza.FORMAT_CODE_93);
        zzbfo.put(8, zzmn.zzai.zza.FORMAT_CODABAR);
        zzbfo.put(16, zzmn.zzai.zza.FORMAT_DATA_MATRIX);
        zzbfo.put(32, zzmn.zzai.zza.FORMAT_EAN_13);
        zzbfo.put(64, zzmn.zzai.zza.FORMAT_EAN_8);
        zzbfo.put(128, zzmn.zzai.zza.FORMAT_ITF);
        zzbfo.put(256, zzmn.zzai.zza.FORMAT_QR_CODE);
        zzbfo.put(512, zzmn.zzai.zza.FORMAT_UPC_A);
        zzbfo.put(1024, zzmn.zzai.zza.FORMAT_UPC_E);
        zzbfo.put(2048, zzmn.zzai.zza.FORMAT_PDF417);
        zzbfo.put(4096, zzmn.zzai.zza.FORMAT_AZTEC);
        zzbfp.put(0, zzmn.zzai.zzb.TYPE_UNKNOWN);
        zzbfp.put(1, zzmn.zzai.zzb.TYPE_CONTACT_INFO);
        zzbfp.put(2, zzmn.zzai.zzb.TYPE_EMAIL);
        zzbfp.put(3, zzmn.zzai.zzb.TYPE_ISBN);
        zzbfp.put(4, zzmn.zzai.zzb.TYPE_PHONE);
        zzbfp.put(5, zzmn.zzai.zzb.TYPE_PRODUCT);
        zzbfp.put(6, zzmn.zzai.zzb.TYPE_SMS);
        zzbfp.put(7, zzmn.zzai.zzb.TYPE_TEXT);
        zzbfp.put(8, zzmn.zzai.zzb.TYPE_URL);
        zzbfp.put(9, zzmn.zzai.zzb.TYPE_WIFI);
        zzbfp.put(10, zzmn.zzai.zzb.TYPE_GEO);
        zzbfp.put(11, zzmn.zzai.zzb.TYPE_CALENDAR_EVENT);
        zzbfp.put(12, zzmn.zzai.zzb.TYPE_DRIVER_LICENSE);
    }
}
