package o;

import id.dana.contract.permission.PermissionStateModule;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.AppPreDownloadManager;
import o.FragmentStateAdapter$5;
import o.b;
import o.dumpDir;
import o.onDelete;

public final class ViewPager2 implements getAdapterPosition<snapToPage> {
    private final b.C0007b<addPendingMessage> getMax;
    private final b.C0007b<getAppIds> getMin;
    private final b.C0007b<notifyConfigurationChanged> setMax;
    private final b.C0007b<FragmentStateAdapter$5.getMax> setMin;

    public interface OffscreenPageLimit {

        public interface length extends onDelete.getMin {
            void length();

            void length(boolean z);
        }

        public interface setMin extends onDelete.length {
            void length(boolean z);
        }
    }

    public final class ScrollState implements getAdapterPosition<OffscreenPageLimit.setMin> {
        private final PermissionStateModule setMin;

        private ScrollState(PermissionStateModule permissionStateModule) {
            this.setMin = permissionStateModule;
        }

        public static ScrollState getMin(PermissionStateModule permissionStateModule) {
            return new ScrollState(permissionStateModule);
        }

        public final /* synthetic */ Object get() {
            OffscreenPageLimit.setMin length = this.setMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @PerActivity
    public final class SavedState implements OffscreenPageLimit.length {
        /* access modifiers changed from: private */
        public final OffscreenPageLimit.setMin getMin;
        private final GriverWebviewSetting setMax;
        private final dumpDir setMin;

        @Inject
        public SavedState(OffscreenPageLimit.setMin setmin, dumpDir dumpdir, GriverWebviewSetting griverWebviewSetting) {
            this.getMin = setmin;
            this.setMin = dumpdir;
            this.setMax = griverWebviewSetting;
        }

        public final void length(boolean z) {
            this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    OffscreenPageLimit.setMin unused = SavedState.this.getMin;
                }
            }, dumpDir.setMin.forDenyLocationPermission(z));
        }

        public final void length() {
            this.setMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    SavedState.this.getMin.length(((Boolean) obj).booleanValue());
                }
            });
        }

        public final void setMax() {
            this.setMin.dispose();
            this.setMax.dispose();
        }
    }

    private ViewPager2(b.C0007b<FragmentStateAdapter$5.getMax> bVar, b.C0007b<getAppIds> bVar2, b.C0007b<notifyConfigurationChanged> bVar3, b.C0007b<addPendingMessage> bVar4) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
    }

    public static ViewPager2 setMin(b.C0007b<FragmentStateAdapter$5.getMax> bVar, b.C0007b<getAppIds> bVar2, b.C0007b<notifyConfigurationChanged> bVar3, b.C0007b<addPendingMessage> bVar4) {
        return new ViewPager2(bVar, bVar2, bVar3, bVar4);
    }

    public final class Orientation implements getBindingAdapter<onPageScrollStateChanged> {
        public static void setMin(onPageScrollStateChanged onpagescrollstatechanged, syncJsApi syncjsapi, setRetryCount setretrycount, getAppPreDownloadCacheManager getapppredownloadcachemanager) {
            onpagescrollstatechanged.setMax(syncjsapi, setretrycount, getapppredownloadcachemanager);
        }

        public static void getMax(onPageScrollStateChanged onpagescrollstatechanged, AppPreDownloadManager.AnonymousClass2 r1, AppPreDownloadManager.AnonymousClass1 r2, isAppIdInPreDownloadConfig isappidinpredownloadconfig, uploadMonitorEvent uploadmonitorevent, copyBackForwardList copybackforwardlist) {
            onpagescrollstatechanged.setMax(r1, r2, isappidinpredownloadconfig, uploadmonitorevent, copybackforwardlist);
        }
    }

    public final /* synthetic */ Object get() {
        return new snapToPage(this.setMin.get(), this.getMin.get(), this.setMax.get(), this.getMax.get());
    }
}
