package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.GriverProgressBar;
import o.setCloseButtonOnLongClickListener;

public final class TitleBarRightButtonView implements TinyMenuUtils {
    private final String alternateFormatsFilePrefix;
    private final ConcurrentHashMap<String, setCloseButtonOnLongClickListener.getMin> geographicalRegions;
    private final TinyRoundImageView metadataManager;
    private final ConcurrentHashMap<Integer, setCloseButtonOnLongClickListener.getMin> nonGeographicalRegions;
    private final String phoneNumberMetadataFilePrefix;
    private final String shortNumberFilePrefix;

    /* renamed from: o.TitleBarRightButtonView$3  reason: invalid class name */
    public interface AnonymousClass3<Downstream, Upstream> {

        /* renamed from: o.TitleBarRightButtonView$3$1  reason: invalid class name */
        public interface AnonymousClass1<Upstream, Downstream> {
            @NonNull
            AnonymousClass4<Downstream> getMin(@NonNull AnonymousClass1<Upstream> r1);
        }

        @NonNull
        GriverProgressBar<? super Upstream> getMax() throws Exception;
    }

    /* renamed from: o.TitleBarRightButtonView$4  reason: invalid class name */
    public interface AnonymousClass4<T> {
        void subscribe(@NonNull GriverProgressBar<? super T> griverProgressBar);
    }

    public interface CornerMarkingUIController<T> {
        void onError(@NonNull Throwable th);

        void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable);

        void onSuccess(@NonNull T t);
    }

    /* renamed from: o.TitleBarRightButtonView$2  reason: invalid class name */
    public interface AnonymousClass2<T> extends getOptionMenuBlinkAnimator<T> {

        /* renamed from: o.TitleBarRightButtonView$2$1  reason: invalid class name */
        public interface AnonymousClass1<T> {
            void subscribe(@NonNull AnonymousClass2<T> r1) throws Exception;
        }

        boolean isDisposed();

        void setCancellable(@Nullable setShowRedPoint setshowredpoint);

        void setDisposable(@Nullable GriverProgressBar.UpdateRunnable updateRunnable);
    }

    TitleBarRightButtonView(String str, String str2, String str3, showActionIcon showactionicon) {
        this.geographicalRegions = new ConcurrentHashMap<>();
        this.nonGeographicalRegions = new ConcurrentHashMap<>();
        this.phoneNumberMetadataFilePrefix = str;
        this.alternateFormatsFilePrefix = str2;
        this.shortNumberFilePrefix = str3;
        this.metadataManager = new TinyRoundImageView(showactionicon);
    }

    public TitleBarRightButtonView(showActionIcon showactionicon) {
        this("/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto", "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto", "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto", showactionicon);
    }

    public final setCloseButtonOnLongClickListener.getMin getMetadataForRegion(String str) {
        return this.metadataManager.getMetadataFromMultiFilePrefix(str, this.geographicalRegions, this.phoneNumberMetadataFilePrefix);
    }

    public final setCloseButtonOnLongClickListener.getMin getMetadataForNonGeographicalRegion(int i) {
        if (!isNonGeographical(i)) {
            return null;
        }
        return this.metadataManager.getMetadataFromMultiFilePrefix(Integer.valueOf(i), this.nonGeographicalRegions, this.phoneNumberMetadataFilePrefix);
    }

    public final setCloseButtonOnLongClickListener.getMin getAlternateFormatsForCountry(int i) {
        return this.metadataManager.getAlternateFormatsForCountry(i, this.alternateFormatsFilePrefix);
    }

    public final setCloseButtonOnLongClickListener.getMin getShortNumberMetadataForRegion(String str) {
        return this.metadataManager.getShortNumberMetadataForRegion(str, this.shortNumberFilePrefix);
    }

    private boolean isNonGeographical(int i) {
        List list = setDefaultImageColor.getCountryCodeToRegionCodeMap().get(Integer.valueOf(i));
        return list.size() == 1 && "001".equals(list.get(0));
    }
}
