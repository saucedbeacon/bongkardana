package o;

import android.content.Context;
import id.dana.di.modules.LeaderboardEntryModule;
import id.dana.richview.leaderboardentry.LeaderboardEntryView;
import o.GriverAppXInterceptor;
import o.PrepareException;
import o.getDataType;

public final class isHomePage2 implements RuntimeCheckResult {
    private final PrepareException.AnonymousClass1 getMax;
    private final LeaderboardEntryModule length;

    public /* synthetic */ isHomePage2(LeaderboardEntryModule leaderboardEntryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(leaderboardEntryModule, r2);
    }

    private isHomePage2(LeaderboardEntryModule leaderboardEntryModule, PrepareException.AnonymousClass1 r2) {
        this.getMax = r2;
        this.length = leaderboardEntryModule;
    }

    public static final class length {
        public PrepareException.AnonymousClass1 length;
        public LeaderboardEntryModule setMax;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    public final void setMin(LeaderboardEntryView leaderboardEntryView) {
        LeaderboardEntryModule leaderboardEntryModule = this.length;
        Context max = this.getMax.getMax();
        if (max != null) {
            Context context = max;
            getDataType.getMax max2 = SimplePropertyPreFilter.getMax(this.length);
            appxLoadFailed length2 = this.getMax.length();
            if (length2 != null) {
                appxLoadFailed appxloadfailed = length2;
                getScheme min = this.getMax.getMin();
                if (min != null) {
                    getScheme getscheme = min;
                    GriverAppXInterceptor.AnonymousClass1 b = this.getMax.b();
                    if (b != null) {
                        AppXResourcePackageWithoutVerify appXResourcePackageWithoutVerify = new AppXResourcePackageWithoutVerify(appxloadfailed, getscheme, b);
                        appxLoadFailed length3 = this.getMax.length();
                        if (length3 != null) {
                            appxLoadFailed appxloadfailed2 = length3;
                            getScheme min2 = this.getMax.getMin();
                            if (min2 != null) {
                                getScheme getscheme2 = min2;
                                setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                                if (updateVisuals != null) {
                                    setKeepPreview.setMax(leaderboardEntryView, SerializerFeature.getMax(leaderboardEntryModule, new APTakePictureOption(context, max2, appXResourcePackageWithoutVerify, new getJavaScriptCanOpenWindowsAutomatically(appxloadfailed2, getscheme2, updateVisuals), new StorageBridgeExtension())));
                                    return;
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
