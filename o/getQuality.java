package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getAspectRatio;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/richview/moreforyou/MoreForYouPresenter;", "Lid/dana/richview/moreforyou/MoreForYouContract$Presenter;", "view", "Lid/dana/richview/moreforyou/MoreForYouContract$View;", "getMoreForYou", "Lid/dana/domain/moreforyou/GetMoreForYou;", "mapper", "Lid/dana/richview/moreforyou/MoreForYouModelMapper;", "(Lid/dana/richview/moreforyou/MoreForYouContract$View;Lid/dana/domain/moreforyou/GetMoreForYou;Lid/dana/richview/moreforyou/MoreForYouModelMapper;)V", "getMoreForYouCDP", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getQuality implements getAspectRatio.getMax {
    private final GriverDefaultSecurityExtension length;
    /* access modifiers changed from: private */
    public final isKeepPreview setMax;
    /* access modifiers changed from: private */
    public final getAspectRatio.length setMin;

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ getQuality this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getQuality getquality) {
            super(1);
            this.this$0 = getquality;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/promotion/Space;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<GriverAMCSLiteAppUpdater, Unit> {
        final /* synthetic */ getQuality this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getQuality getquality) {
            super(1);
            this.this$0 = getquality;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverAMCSLiteAppUpdater) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) {
            Intrinsics.checkNotNullParameter(griverAMCSLiteAppUpdater, "it");
            ArrayList arrayList = new ArrayList();
            List<getDefaultProxy> cdpContents = griverAMCSLiteAppUpdater.getCdpContents();
            Intrinsics.checkNotNullExpressionValue(cdpContents, "it.cdpContents");
            for (getDefaultProxy apply : cdpContents) {
                arrayList.add(this.this$0.setMax.apply(apply));
            }
            this.this$0.setMin.length(arrayList);
        }
    }

    @Inject
    public getQuality(@NotNull getAspectRatio.length length2, @NotNull GriverDefaultSecurityExtension griverDefaultSecurityExtension, @NotNull isKeepPreview iskeeppreview) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(griverDefaultSecurityExtension, "getMoreForYou");
        Intrinsics.checkNotNullParameter(iskeeppreview, "mapper");
        this.setMin = length2;
        this.length = griverDefaultSecurityExtension;
        this.setMax = iskeeppreview;
    }

    public final void length() {
        this.length.execute(Unit.INSTANCE, new setMin(this), new getMin(this));
    }
}
