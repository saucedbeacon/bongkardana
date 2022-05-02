package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.BeaconParser;
import o.ConfirmPopup;
import o.PhotoPagerListener;
import o.PhotoResolver;
import o.SaveImageToAlbumBridgeExtension;
import o.b;
import o.cutImageKeepRatio_new;
import o.getForegroundScanPeriod;
import o.getScheduledScanJobsEnabled;
import o.makeTakenPicturePath;
import o.registerStageMonitor;
import o.setForegroundScanPeriod;
import o.setH5ErrorPage;
import o.useHttpAuthUsernamePassword;

public final class FalconFacade implements getAdapterPosition<setIsUseNewMethod> {
    private final b.C0007b<ResourceDownloadType> getMax;
    private final b.C0007b<PhotoServiceImpl> getMin;
    private final b.C0007b<onCommonConfigChanged> isInside;
    private final b.C0007b<setEnableScheduledScanJobs> length;
    private final b.C0007b<saveImage> setMax;
    private final b.C0007b<cutImageKeepRatio_new.setMax> setMin;
    private final b.C0007b<setGriverAppUpdateProxy> toFloatRange;
    private final b.C0007b<Context> toIntRange;

    final class FalconInterfaceImpl implements Function1 {
        private final String getMax;
        private final FalconInterface setMin;

        public FalconInterfaceImpl(FalconInterface falconInterface, String str) {
            this.setMin = falconInterface;
            this.getMax = str;
        }

        public final Object invoke(Object obj) {
            return FalconInterface.getMax(this.setMin, this.getMax, (List) obj);
        }
    }

    private FalconFacade(b.C0007b<cutImageKeepRatio_new.setMax> bVar, b.C0007b<setEnableScheduledScanJobs> bVar2, b.C0007b<ResourceDownloadType> bVar3, b.C0007b<saveImage> bVar4, b.C0007b<PhotoServiceImpl> bVar5, b.C0007b<onCommonConfigChanged> bVar6, b.C0007b<setGriverAppUpdateProxy> bVar7, b.C0007b<Context> bVar8) {
        this.setMin = bVar;
        this.length = bVar2;
        this.getMax = bVar3;
        this.setMax = bVar4;
        this.getMin = bVar5;
        this.isInside = bVar6;
        this.toFloatRange = bVar7;
        this.toIntRange = bVar8;
    }

    public static FalconFacade setMin(b.C0007b<cutImageKeepRatio_new.setMax> bVar, b.C0007b<setEnableScheduledScanJobs> bVar2, b.C0007b<ResourceDownloadType> bVar3, b.C0007b<saveImage> bVar4, b.C0007b<PhotoServiceImpl> bVar5, b.C0007b<onCommonConfigChanged> bVar6, b.C0007b<setGriverAppUpdateProxy> bVar7, b.C0007b<Context> bVar8) {
        return new FalconFacade(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    @PerActivity
    public final class FalconInterface implements makeTakenPicturePath.setMax {
        private final useHttpAuthUsernamePassword FastBitmap$CoordinateSystem;
        private final getScheduledScanJobsEnabled IsOverlapping;
        checkIfMainProcess equals;
        setForegroundScanPeriod getMax;
        final onCommonConfigChanged getMin;
        private final PhotoResolver.AnonymousClass2 hashCode;
        /* access modifiers changed from: private */
        public final Context isInside;
        SaveImageToAlbumBridgeExtension.ImageSaveRunner length;
        /* access modifiers changed from: package-private */
        public PhotoServiceImpl setMax;
        getForegroundScanPeriod setMin;
        private final setRegionStatePersistenceEnabled toDoubleRange;
        /* access modifiers changed from: private */
        public final ConfirmPopup.AnonymousClass1 toFloatRange;
        setH5ErrorPage toIntRange;
        private final registerStageMonitor toString;
        /* access modifiers changed from: private */
        public final makeTakenPicturePath.setMin values;

        @Inject
        FalconInterface(getScheduledScanJobsEnabled getscheduledscanjobsenabled, Context context, setRegionStatePersistenceEnabled setregionstatepersistenceenabled, makeTakenPicturePath.setMin setmin, isUseAshmem isuseashmem, ConfirmPopup.AnonymousClass1 r6, registerStageMonitor registerstagemonitor, PhotoResolver.AnonymousClass2 r8) {
            this.isInside = context;
            this.toDoubleRange = setregionstatepersistenceenabled;
            this.values = setmin;
            this.getMin = isuseashmem.getMin;
            this.FastBitmap$CoordinateSystem = isuseashmem.setMin;
            this.toFloatRange = r6;
            this.IsOverlapping = getscheduledscanjobsenabled;
            this.toString = registerstagemonitor;
            this.hashCode = r8;
        }

        public final void getMax(final PhotoPagerListener.V4 v4, final String str, final String str2) {
            this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(@NonNull Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        FalconInterface.getMax(FalconInterface.this, v4, str2);
                    } else {
                        FalconInterface.length(FalconInterface.this, v4, str, str2);
                    }
                }
            });
        }

        public final void getMin(final ConfirmationModel confirmationModel, final String str) {
            this.values.showProgress();
            setForegroundScanPeriod setforegroundscanperiod = this.getMax;
            AnonymousClass3 r1 = new GriverAppVirtualHostProxy<getServiceUuidEndOffset>() {
                public final /* synthetic */ void onNext(Object obj) {
                    FalconInterface.this.values.dismissProgress();
                    FalconInterface falconInterface = FalconInterface.this;
                    falconInterface.getMin.execute(new GriverAppVirtualHostProxy<Boolean>((String) null, (String) null, (String) null, (String) null, 0, false, confirmationModel.onPostMessage) {
                        public final /* synthetic */ void onNext(@NonNull Object obj) {
                            Boolean bool = (Boolean) obj;
                            FalconInterface.this.values.setMax(bool.booleanValue());
                            if (bool.booleanValue() && !TextUtils.isEmpty(r2)) {
                                if (!TextUtils.isEmpty(r3)) {
                                    FalconInterface.this.toIntRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
                                        public final void onError(Throwable th) {
                                            updateActionSheetContent.exception(DanaLogConstants.BizType.SAVE_RECENT_CONTACT, DanaLogConstants.ExceptionType.SAVE_RECENT_TRANSACTION_EXCEPTION, th.getMessage());
                                        }
                                    }, setH5ErrorPage.setMax.forRecentContact(r4, r3, r2, r5, r6, r7));
                                }
                                FalconInterface.this.FastBitmap$CoordinateSystem.execute(new GriverAppVirtualHostProxy(), useHttpAuthUsernamePassword.getMax.forDefaultCard(r8));
                            }
                        }

                        public final void onError(Throwable th) {
                            String str;
                            FalconInterface.this.values.dismissProgress();
                            makeTakenPicturePath.setMin min = FalconInterface.this.values;
                            Context max = FalconInterface.this.isInside;
                            if (th instanceof NetworkException) {
                                str = ((NetworkException) th).getMessage();
                            } else {
                                str = max.getString(R.string.general_error_msg);
                            }
                            min.onError(str);
                        }
                    });
                    FalconInterface.this.values.setMax(((setPhoto) FalconInterface.this.setMax.apply((getServiceUuidEndOffset) obj)).length(confirmationModel.onPostMessage, confirmationModel.ICustomTabsCallback$Stub, str, confirmationModel.newSessionWithExtras));
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    FalconInterface.this.values.dismissProgress();
                    FalconInterface.getMin(FalconInterface.this, th);
                    updateActionSheetContent.e(DanaLogConstants.BizType.TRANSFER_MONEY, th.getMessage());
                }
            };
            WithdrawOTCModel withdrawOTCModel = confirmationModel.requestPostMessageChannelWithExtras;
            BeaconParser.BeaconLayoutException beaconLayoutException = new BeaconParser.BeaconLayoutException();
            beaconLayoutException.setLoginId(confirmationModel.equals);
            beaconLayoutException.setNickname(confirmationModel.IsOverlapping);
            beaconLayoutException.setDateOfBirth(confirmationModel.requestPostMessageChannel);
            getMatchingBeaconTypeCodeEndOffset getmatchingbeacontypecodeendoffset = new getMatchingBeaconTypeCodeEndOffset();
            String str2 = confirmationModel.toFloatRange;
            String str3 = "";
            if (TextUtils.isEmpty(str2)) {
                str2 = str3;
            }
            getmatchingbeacontypecodeendoffset.setAcceptTimeoutUnit(str2);
            String str4 = confirmationModel.toIntRange;
            if (!TextUtils.isEmpty(str4)) {
                str3 = str4;
            }
            getmatchingbeacontypecodeendoffset.setAcceptTimeoutValue(str3);
            getmatchingbeacontypecodeendoffset.setAmount(confirmationModel.hashCode);
            getmatchingbeacontypecodeendoffset.setFundType(confirmationModel.getCause);
            getmatchingbeacontypecodeendoffset.setInstId(withdrawOTCModel.setMin);
            getmatchingbeacontypecodeendoffset.setPayeeInfo(beaconLayoutException);
            getmatchingbeacontypecodeendoffset.setPayMethod(withdrawOTCModel.getMax);
            getmatchingbeacontypecodeendoffset.setPayOption(withdrawOTCModel.length);
            getmatchingbeacontypecodeendoffset.setWithdrawInstId(withdrawOTCModel.getMin);
            getmatchingbeacontypecodeendoffset.setWithdrawInstLocalName(withdrawOTCModel.toIntRange);
            getmatchingbeacontypecodeendoffset.setWithdrawInstName(withdrawOTCModel.setMax);
            getmatchingbeacontypecodeendoffset.setWithdrawPayMethod(withdrawOTCModel.IsOverlapping);
            getmatchingbeacontypecodeendoffset.setWithdrawPayOption(withdrawOTCModel.toFloatRange);
            setforegroundscanperiod.execute(r1, setForegroundScanPeriod.setMin.forConfirmSendMoneyOTC(getmatchingbeacontypecodeendoffset));
        }

        public final void setMax(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
            final String str6 = str4;
            final String str7 = str3;
            final String str8 = str2;
            final String str9 = str;
            final int i2 = i;
            final boolean z2 = z;
            final String str10 = str5;
            this.getMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(@NonNull Object obj) {
                    Boolean bool = (Boolean) obj;
                    FalconInterface.this.values.setMax(bool.booleanValue());
                    if (bool.booleanValue() && !TextUtils.isEmpty(str6)) {
                        if (!TextUtils.isEmpty(str7)) {
                            FalconInterface.this.toIntRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
                                public final void onError(Throwable th) {
                                    updateActionSheetContent.exception(DanaLogConstants.BizType.SAVE_RECENT_CONTACT, DanaLogConstants.ExceptionType.SAVE_RECENT_TRANSACTION_EXCEPTION, th.getMessage());
                                }
                            }, setH5ErrorPage.setMax.forRecentContact(str8, str7, str6, str9, i2, z2));
                        }
                        FalconInterface.this.FastBitmap$CoordinateSystem.execute(new GriverAppVirtualHostProxy(), useHttpAuthUsernamePassword.getMax.forDefaultCard(str10));
                    }
                }

                public final void onError(Throwable th) {
                    String str;
                    FalconInterface.this.values.dismissProgress();
                    makeTakenPicturePath.setMin min = FalconInterface.this.values;
                    Context max = FalconInterface.this.isInside;
                    if (th instanceof NetworkException) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = max.getString(R.string.general_error_msg);
                    }
                    min.onError(str);
                }
            });
        }

        public final void getMax() {
            this.toDoubleRange.execute(new GriverAppVirtualHostProxy<Long>() {
                public final /* synthetic */ void onNext(Object obj) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    ConfirmPopup.AnonymousClass1 min = FalconInterface.this.toFloatRange;
                    long longValue = ((Long) obj).longValue();
                    int i = (int) (longValue / GriverConfigConstants.DEFAULT_SYNC_UPDATE_PERIOD);
                    int i2 = (int) ((longValue % GriverConfigConstants.DEFAULT_SYNC_UPDATE_PERIOD) / 86400);
                    int i3 = (int) ((longValue % 86400) / 3600);
                    int i4 = (int) ((longValue % 3600) / 60);
                    int i5 = (int) ((longValue % 60) / 1);
                    StringBuilder sb = new StringBuilder();
                    String str5 = "";
                    if (i > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min.length.getResources().getQuantityString(R.plurals.f75332131755022, i, new Object[]{Integer.valueOf(i)}));
                        sb2.append(" ");
                        str = sb2.toString();
                    } else {
                        str = str5;
                    }
                    sb.append(str);
                    sb.append(" ");
                    if (i2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(min.length.getResources().getQuantityString(R.plurals.f75202131755009, i2, new Object[]{Integer.valueOf(i2)}));
                        sb3.append(" ");
                        str2 = sb3.toString();
                    } else {
                        str2 = str5;
                    }
                    sb.append(str2);
                    sb.append(" ");
                    if (i3 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(min.length.getResources().getQuantityString(R.plurals.f75262131755015, i3, new Object[]{Integer.valueOf(i3)}));
                        sb4.append(" ");
                        str3 = sb4.toString();
                    } else {
                        str3 = str5;
                    }
                    sb.append(str3);
                    sb.append(" ");
                    if (i4 > 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(min.length.getResources().getQuantityString(R.plurals.f75272131755016, i4, new Object[]{Integer.valueOf(i4)}));
                        sb5.append(" ");
                        str4 = sb5.toString();
                    } else {
                        str4 = str5;
                    }
                    sb.append(str4);
                    sb.append(" ");
                    if (i5 > 0) {
                        str5 = min.length.getResources().getQuantityString(R.plurals.f75302131755019, i5, new Object[]{Integer.valueOf(i5)});
                    }
                    sb.append(str5.trim());
                    FalconInterface.this.values.setMin(sb.toString());
                }
            });
        }

        public final void getMin(String str, String str2) {
            int i;
            if (str2.equals("bank")) {
                i = 1;
            } else {
                i = str2.equals("contact") ? 0 : 99;
            }
            this.toString.execute(registerStageMonitor.getMax.forGetLastTransferDate(str, Integer.valueOf(i)), new FalconInterfaceImpl(this, str), new PathToLocalUtil(this));
        }

        public final void setMax() {
            this.setMin.dispose();
            this.toDoubleRange.dispose();
            this.getMin.dispose();
            this.FastBitmap$CoordinateSystem.dispose();
            this.IsOverlapping.dispose();
            this.toIntRange.dispose();
            this.getMax.dispose();
            this.equals.dispose();
            this.toString.dispose();
        }

        static /* synthetic */ void getMax(FalconInterface falconInterface, final PhotoPagerListener.V4 v4, final String str) {
            falconInterface.values.showProgress();
            falconInterface.setMin.execute(new GriverAppVirtualHostProxy<getServiceUuidEndOffset>() {
                public final /* synthetic */ void onNext(Object obj) {
                    FalconInterface.this.values.dismissProgress();
                    FalconInterface.this.values.setMax(((setPhoto) FalconInterface.this.setMax.apply((getServiceUuidEndOffset) obj)).length(v4.toString, v4.getMax, str, v4.FastBitmap$CoordinateSystem));
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    FalconInterface.this.values.dismissProgress();
                    FalconInterface.getMin(FalconInterface.this, th);
                }
            }, getForegroundScanPeriod.setMax.forConfirmSendMoneyContact(SaveImageToAlbumBridgeExtension.ImageSaveRunner.getMin(v4)));
        }

        static /* synthetic */ void length(FalconInterface falconInterface, final PhotoPagerListener.V4 v4, final String str, final String str2) {
            falconInterface.values.showProgress();
            falconInterface.IsOverlapping.execute(new GriverAppVirtualHostProxy<getServiceUuidEndOffset>() {
                public final /* synthetic */ void onNext(Object obj) {
                    FalconInterface.this.values.dismissProgress();
                    FalconInterface.this.values.setMax(((setPhoto) FalconInterface.this.setMax.apply((getServiceUuidEndOffset) obj)).length(str, v4.getMax, str2, ""));
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    FalconInterface.this.values.dismissProgress();
                    FalconInterface.getMin(FalconInterface.this, th);
                }
            }, getScheduledScanJobsEnabled.setMax.forSendMoney().currencyAmount(v4.setMax, v4.setMin).payeeDetail(v4.IsOverlapping, v4.toFloatRange, isOriginHasAppInfo.getCleanPhoneNumberPrefixWithDash(v4.isInside), v4.equals).additionalInfo(v4.getMin, v4.setMin(), v4.getMax));
        }

        static /* synthetic */ void getMin(FalconInterface falconInterface, Throwable th) {
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SEND_MONEY_CONFIRMATION_PREFIX);
            sb.append(falconInterface.getClass().getName());
            sb.append("on Error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, sb.toString(), th);
            if (th instanceof NetworkException) {
                NetworkException networkException = (NetworkException) th;
                falconInterface.values.setMax(networkException.getErrorCode(), networkException.getMessage());
                return;
            }
            falconInterface.values.onError(falconInterface.isInside.getString(R.string.general_error_msg));
        }

        static /* synthetic */ Unit getMax(FalconInterface falconInterface, String str, List list) {
            int i;
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(573155465, oncanceled);
                onCancelLoad.getMin(573155465, oncanceled);
            }
            List<increaseCount> max2 = PhotoResolver.AnonymousClass2.getMax(list, 0);
            if (max2.isEmpty() || TextUtils.isEmpty(str)) {
                falconInterface.values.setMax();
                return null;
            }
            falconInterface.values.length(Long.valueOf(max2.get(0).setMax));
            return null;
        }
    }

    public final /* synthetic */ Object get() {
        return new setIsUseNewMethod(this.setMin.get(), this.length.get(), this.getMax.get(), this.setMax.get(), this.getMin.get(), this.isInside.get(), this.toFloatRange.get(), this.toIntRange.get());
    }

    public final class FalconImageCutProxy implements Function0 {
        public static final FalconImageCutProxy length = new FalconImageCutProxy();

        public final Object invoke() {
            DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=sendMoney");
            return Unit.INSTANCE;
        }
    }
}
