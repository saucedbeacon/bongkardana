package o;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.base.BaseActivity;
import id.dana.di.PerActivity;
import id.dana.domain.qrbarcode.DecodeQrBizType;
import id.dana.scanner.QrExpiredActivity;
import id.dana.scanner.ScannerActivity;
import id.dana.scanner.handler.ScannerViewType;
import id.dana.splitbill.view.SplitBillDetailsActivity;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.R;

@PerActivity
public final class method implements R.id.length {
    public R.id.length getMax;
    private DecodeWrapper.AnonymousClass2 getMin;
    private autoGenerate isInside;
    public setCancelOnTouchOutside$core length;
    public String setMax;
    @Nullable
    private final Activity setMin;

    @Inject
    public method(@Nullable Activity activity) {
        this.setMin = activity;
        if (activity instanceof BaseActivity) {
            this.isInside = (BaseActivity) activity;
        }
        this.getMin = new Object(activity) {
            public static final int length = CornerMarkingDataProvider.AnonymousClass2.setMax();
            private Context getMax;

            {
                this.getMax = r1;
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.ImageDecoder setMin(o.setCancelOnTouchOutside$core r3, o.fillPageCommonInfo r4, java.lang.String r5, java.lang.String r6) {
                /*
                    r2 = this;
                    java.lang.String r0 = r4.getBizType()
                    int r1 = r0.hashCode()
                    switch(r1) {
                        case -1167020686: goto L_0x0081;
                        case -1048821661: goto L_0x0076;
                        case -922877266: goto L_0x006c;
                        case -724740381: goto L_0x0062;
                        case -276560242: goto L_0x0058;
                        case 141637776: goto L_0x004e;
                        case 203789441: goto L_0x0043;
                        case 554049076: goto L_0x0039;
                        case 923238916: goto L_0x002f;
                        case 1131344321: goto L_0x0025;
                        case 1317723168: goto L_0x0019;
                        case 1609299090: goto L_0x000d;
                        default: goto L_0x000b;
                    }
                L_0x000b:
                    goto L_0x008b
                L_0x000d:
                    java.lang.String r1 = "GN_AC_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 9
                    goto L_0x008c
                L_0x0019:
                    java.lang.String r1 = "SPLIT_BILL_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 8
                    goto L_0x008c
                L_0x0025:
                    java.lang.String r1 = "TRANSFER_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 4
                    goto L_0x008c
                L_0x002f:
                    java.lang.String r1 = "MERCHANT_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 0
                    goto L_0x008c
                L_0x0039:
                    java.lang.String r1 = "PARKING_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 7
                    goto L_0x008c
                L_0x0043:
                    java.lang.String r1 = "EXTERNAL_TRANSFER_QR"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 10
                    goto L_0x008c
                L_0x004e:
                    java.lang.String r1 = "USER_MERCHANT_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 1
                    goto L_0x008c
                L_0x0058:
                    java.lang.String r1 = "USER_BANK_ACCOUNT_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 5
                    goto L_0x008c
                L_0x0062:
                    java.lang.String r1 = "PROFILE_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 3
                    goto L_0x008c
                L_0x006c:
                    java.lang.String r1 = "TRANSFER_BANK_ACCOUNT_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 6
                    goto L_0x008c
                L_0x0076:
                    java.lang.String r1 = "EXTERNAL_CASH_IN_QR"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 11
                    goto L_0x008c
                L_0x0081:
                    java.lang.String r1 = "EMVCO_CODE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008b
                    r0 = 2
                    goto L_0x008c
                L_0x008b:
                    r0 = -1
                L_0x008c:
                    switch(r0) {
                        case 0: goto L_0x00ee;
                        case 1: goto L_0x00e6;
                        case 2: goto L_0x00de;
                        case 3: goto L_0x00bc;
                        case 4: goto L_0x00bc;
                        case 5: goto L_0x00b4;
                        case 6: goto L_0x00b4;
                        case 7: goto L_0x00ac;
                        case 8: goto L_0x00a4;
                        case 9: goto L_0x009c;
                        case 10: goto L_0x0094;
                        case 11: goto L_0x0094;
                        default: goto L_0x008f;
                    }
                L_0x008f:
                    o.ImageDecoder r3 = r2.getMin(r4, r3)
                    return r3
                L_0x0094:
                    o.useSystemImageDecoderByte r6 = new o.useSystemImageDecoderByte
                    android.content.Context r0 = r2.getMax
                    r6.<init>(r0, r3, r4, r5)
                    return r6
                L_0x009c:
                    o.APEncodeResult r3 = new o.APEncodeResult
                    android.content.Context r6 = r2.getMax
                    r3.<init>(r6, r4, r5)
                    return r3
                L_0x00a4:
                    o.APEncodeResult$CODE r3 = new o.APEncodeResult$CODE
                    android.content.Context r6 = r2.getMax
                    r3.<init>(r6, r4, r5)
                    return r3
                L_0x00ac:
                    o.decodeFile r5 = new o.decodeFile
                    android.content.Context r6 = r2.getMax
                    r5.<init>(r6, r3, r4)
                    return r5
                L_0x00b4:
                    o.ImageEncoder r3 = new o.ImageEncoder
                    android.content.Context r6 = r2.getMax
                    r3.<init>(r6, r4, r5)
                    return r3
                L_0x00bc:
                    java.lang.String r3 = "split_bill"
                    boolean r3 = r3.equals(r6)
                    if (r3 == 0) goto L_0x00cc
                    o.SystemImageDecoder r3 = new o.SystemImageDecoder
                    android.content.Context r6 = r2.getMax
                    r3.<init>(r6, r4, r5)
                    return r3
                L_0x00cc:
                    java.lang.String r3 = "four_kingkong"
                    boolean r3 = r3.equals(r6)
                    if (r3 == 0) goto L_0x00d6
                    java.lang.String r5 = "FRAGMENT"
                L_0x00d6:
                    o.SystemImageEncoder r3 = new o.SystemImageEncoder
                    android.content.Context r6 = r2.getMax
                    r3.<init>(r6, r4, r5)
                    return r3
                L_0x00de:
                    o.calcThumbnailOptions r5 = new o.calcThumbnailOptions
                    android.content.Context r6 = r2.getMax
                    r5.<init>(r6, r3, r4)
                    return r5
                L_0x00e6:
                    o.InnerDecoder$1 r5 = new o.InnerDecoder$1
                    android.content.Context r6 = r2.getMax
                    r5.<init>(r6, r3, r4)
                    return r5
                L_0x00ee:
                    o.useSystemImageDecoderFile r5 = new o.useSystemImageDecoderFile
                    android.content.Context r6 = r2.getMax
                    r5.<init>(r6, r3, r4)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.DecodeWrapper.AnonymousClass2.setMin(o.setCancelOnTouchOutside$core, o.fillPageCommonInfo, java.lang.String, java.lang.String):o.ImageDecoder");
            }

            private ImageDecoder getMin(fillPageCommonInfo fillpagecommoninfo, setCancelOnTouchOutside$core setcancelontouchoutside_core) {
                if (setMax(fillpagecommoninfo)) {
                    return new InnerDecoder(this.getMax, setcancelontouchoutside_core, fillpagecommoninfo);
                }
                return new ImageDecoder(this.getMax) {
                    private final Context getMax;

                    {
                        this.getMax = r1;
                    }

                    public final void setMin() {
                        Context context = this.getMax;
                        if (context instanceof BaseActivity) {
                            ((BaseActivity) context).showWarningDialog(context.getString(id.dana.R.string.unsupported_deeplink_msg));
                        }
                    }
                };
            }

            private static boolean setMax(@NonNull fillPageCommonInfo fillpagecommoninfo) {
                return (fillpagecommoninfo.getBizInfo() == null || fillpagecommoninfo.getBizInfo().valueOf == null) ? false : true;
            }
        };
    }

    public final void setMax(fillPageCommonInfo fillpagecommoninfo) {
        String str;
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.setMax(fillpagecommoninfo);
        }
        R.id.length length3 = this.getMax;
        String str2 = null;
        if (length3 != null) {
            str = length3.setMax();
        } else {
            str = null;
        }
        if (!"split_bill".equals(str) || getMin(fillpagecommoninfo)) {
            toFloatRange();
            DecodeWrapper.AnonymousClass2 r0 = this.getMin;
            setCancelOnTouchOutside$core setcancelontouchoutside_core = this.length;
            String str3 = this.setMax;
            R.id.length length4 = this.getMax;
            if (length4 != null) {
                str2 = length4.setMax();
            }
            ImageDecoder min = r0.setMin(setcancelontouchoutside_core, fillpagecommoninfo, str3, str2);
            min.setMin();
            if (min instanceof decodeByteArray) {
                String str4 = this.setMax;
                R.id.length length5 = this.getMax;
                if (length5 != null) {
                    length5.getMax(str4);
                    return;
                }
                return;
            }
            return;
        }
        String string = this.setMin.getString(id.dana.R.string.invalid_qr_code);
        autoGenerate autogenerate = this.isInside;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        R.id.length length6 = this.getMax;
        if (length6 != null) {
            length6.getMin(string);
        }
    }

    public final void getMax(fillPageCommonInfo fillpagecommoninfo) {
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.setMax(fillpagecommoninfo);
        }
        String str = null;
        if (DecodeQrBizType.EXTERNAL_TRANSFER_QR.equals(fillpagecommoninfo.getBizType()) || DecodeQrBizType.EXTERNAL_CASH_IN_QR.equals(fillpagecommoninfo.getBizType())) {
            toFloatRange();
            DecodeWrapper.AnonymousClass2 r0 = this.getMin;
            setCancelOnTouchOutside$core setcancelontouchoutside_core = this.length;
            String str2 = this.setMax;
            R.id.length length3 = this.getMax;
            if (length3 != null) {
                str = length3.setMax();
            }
            ImageDecoder min = r0.setMin(setcancelontouchoutside_core, fillpagecommoninfo, str2, str);
            min.setMin();
            if (min instanceof decodeByteArray) {
                String str3 = this.setMax;
                R.id.length length4 = this.getMax;
                if (length4 != null) {
                    length4.getMax(str3);
                }
            }
        } else if (DecodeQrBizType.PROFILE_CODE.equals(fillpagecommoninfo.getBizType())) {
            DecodeWrapper.AnonymousClass2 r02 = this.getMin;
            setCancelOnTouchOutside$core setcancelontouchoutside_core2 = this.length;
            R.id.length length5 = this.getMax;
            if (length5 != null) {
                str = length5.setMax();
            }
            ImageDecoder min2 = r02.setMin(setcancelontouchoutside_core2, fillpagecommoninfo, ScannerViewType.FRAGMENT, str);
            min2.setMin();
            if (min2 instanceof decodeByteArray) {
                String str4 = this.setMax;
                R.id.length length6 = this.getMax;
                if (length6 != null) {
                    length6.getMax(str4);
                }
            }
        } else {
            String string = this.setMin.getString(id.dana.R.string.invalid_qr_code);
            autoGenerate autogenerate = this.isInside;
            if (autogenerate != null) {
                autogenerate.enableClick();
            }
            R.id.length length7 = this.getMax;
            if (length7 != null) {
                length7.getMin(string);
            }
        }
    }

    public final void getMax(String str) {
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.getMax(str);
        }
    }

    public final void length() {
        this.setMin.startActivity(SplitBillDetailsActivity.createNonEligibleUserIntent(this.setMin));
    }

    public final String setMax() {
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            return length2.setMax();
        }
        return null;
    }

    public final void getMin() {
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.getMin();
            return;
        }
        this.setMin.startActivity(QrExpiredActivity.createIntent(this.setMin));
    }

    private void toFloatRange() {
        if (TextUtils.isEmpty(this.setMax)) {
            this.setMax = ScannerViewType.FRAGMENT;
            if (this.setMin instanceof ScannerActivity) {
                this.setMax = ScannerViewType.ACTIVITY;
            }
        }
    }

    public final void showProgress() {
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.showProgress();
        }
    }

    public final void dismissProgress() {
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.dismissProgress();
        }
    }

    private static boolean getMin(fillPageCommonInfo fillpagecommoninfo) {
        return fillpagecommoninfo != null && DecodeQrBizType.PROFILE_CODE.equals(fillpagecommoninfo.getBizType());
    }

    public final void getMax() {
        autoGenerate autogenerate = this.isInside;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.getMax();
        }
    }

    public final void setMin() {
        autoGenerate autogenerate = this.isInside;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.setMin();
        }
    }

    public final void getMin(String str) {
        autoGenerate autogenerate = this.isInside;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.getMin(str);
        }
    }

    public final void onError(String str) {
        autoGenerate autogenerate = this.isInside;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        R.id.length length2 = this.getMax;
        if (length2 != null) {
            length2.onError(str);
        }
    }
}
