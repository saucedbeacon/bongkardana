package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.sendmoney.model.RecentBankModel;
import javax.inject.Inject;
import o.ResourceDownloadType;
import o.cutImageKeepRatio_new;
import o.setEnableScheduledScanJobs;

public final class setIsUseNewMethod implements cutImageKeepRatio_new.getMax {
    private decryptBinary IsOverlapping;
    /* access modifiers changed from: private */
    public final cutImageKeepRatio_new.setMax equals;
    private final saveImage getMax;
    /* access modifiers changed from: private */
    public final Context getMin;
    /* access modifiers changed from: private */
    public final PhotoServiceImpl isInside;
    private final onCommonConfigChanged length;
    private final setEnableScheduledScanJobs setMax;
    private final setGriverAppUpdateProxy setMin;
    private final ResourceDownloadType toIntRange;

    @Inject
    public setIsUseNewMethod(cutImageKeepRatio_new.setMax setmax, setEnableScheduledScanJobs setenablescheduledscanjobs, ResourceDownloadType resourceDownloadType, saveImage saveimage, PhotoServiceImpl photoServiceImpl, onCommonConfigChanged oncommonconfigchanged, setGriverAppUpdateProxy setgriverappupdateproxy, Context context) {
        this.equals = setmax;
        this.setMax = setenablescheduledscanjobs;
        this.toIntRange = resourceDownloadType;
        this.getMax = saveimage;
        this.isInside = photoServiceImpl;
        this.length = oncommonconfigchanged;
        this.setMin = setgriverappupdateproxy;
        this.getMin = context;
    }

    public final void setMin(final BucketInfo bucketInfo, final String str, final String str2) {
        this.equals.showProgress();
        this.setMax.execute(new GriverAppVirtualHostProxy<getServiceUuidEndOffset>() {
            public final /* synthetic */ void onNext(Object obj) {
                setIsUseNewMethod.this.equals.dismissProgress();
                setIsUseNewMethod.this.equals.setMin(((setPhoto) setIsUseNewMethod.this.isInside.apply((getServiceUuidEndOffset) obj)).length(str, bucketInfo.IsOverlapping, str2, bucketInfo.equals));
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                setIsUseNewMethod.this.equals.dismissProgress();
                cutImageKeepRatio_new.setMax min = setIsUseNewMethod.this.equals;
                Context max = setIsUseNewMethod.this.getMin;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = max.getString(R.string.general_error_msg);
                }
                min.onError(str);
            }
        }, setEnableScheduledScanJobs.setMax.forConfirmSendMoneyBank((getLayout) this.getMax.apply(bucketInfo)));
    }

    public final void setMax(RecentBankModel recentBankModel) {
        RecentBankModel recentBankModel2 = recentBankModel;
        ResourceDownloadType resourceDownloadType = this.toIntRange;
        AnonymousClass1 r3 = new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                updateActionSheetContent.exception(DanaLogConstants.BizType.SAVE_RECENT_BANK, DanaLogConstants.ExceptionType.SAVE_RECENT_TRANSACTION_EXCEPTION, th.getMessage());
                cutImageKeepRatio_new.setMax unused = setIsUseNewMethod.this.equals;
            }
        };
        String str = recentBankModel2.equals;
        String str2 = recentBankModel2.setMax;
        String str3 = recentBankModel2.getMax;
        String str4 = recentBankModel2.Mean$Arithmetic;
        String str5 = recentBankModel2.Grayscale$Algorithm;
        String str6 = recentBankModel2.getMin;
        String str7 = recentBankModel2.setMin;
        String str8 = recentBankModel2.toFloatRange;
        String str9 = recentBankModel2.IsOverlapping;
        String str10 = recentBankModel2.isInside;
        String str11 = recentBankModel2.length;
        String str12 = recentBankModel2.hashCode;
        String str13 = recentBankModel2.toString;
        ResourceDownloadType resourceDownloadType2 = resourceDownloadType;
        ResourceDownloadType resourceDownloadType3 = resourceDownloadType2;
        resourceDownloadType3.execute(r3, ResourceDownloadType.setMax.forSaveRecentBank(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, recentBankModel2.FastBitmap$CoordinateSystem, recentBankModel.getMin()));
    }

    public final void setMax(final String str) {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setIsUseNewMethod.setMax(setIsUseNewMethod.this, str);
                setIsUseNewMethod.this.equals.getMin(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setMax() {
        decryptBinary decryptbinary = this.IsOverlapping;
        if (decryptbinary != null) {
            decryptbinary.dispose();
            this.IsOverlapping = null;
        }
        setEnableScheduledScanJobs setenablescheduledscanjobs = this.setMax;
        if (setenablescheduledscanjobs != null) {
            setenablescheduledscanjobs.dispose();
        }
        onCommonConfigChanged oncommonconfigchanged = this.length;
        if (oncommonconfigchanged != null) {
            oncommonconfigchanged.dispose();
        }
        ResourceDownloadType resourceDownloadType = this.toIntRange;
        if (resourceDownloadType != null) {
            resourceDownloadType.dispose();
        }
    }

    static /* synthetic */ void setMax(setIsUseNewMethod setisusenewmethod, String str) {
        setGriverAppUpdateProxy setgriverappupdateproxy = setisusenewmethod.setMin;
        decryptBinary decryptbinary = setisusenewmethod.IsOverlapping;
        if (decryptbinary != null) {
            decryptbinary.dispose();
            setisusenewmethod.IsOverlapping = null;
        }
        AnonymousClass2 r1 = new decryptBinary() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_CONFIRMATION_TAG, th.getMessage(), th);
            }
        };
        setisusenewmethod.IsOverlapping = r1;
        setgriverappupdateproxy.execute(r1, str);
    }
}
