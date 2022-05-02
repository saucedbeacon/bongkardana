package o;

import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.GriverAmcsLiteConfig;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class setTitleColor extends setMinProgress implements GriverBaseConstants {
    private final getTabBarItemColorModel homeDataResultMapper;
    private final setDivider homeInfoEntityDataFactory;
    private final getActiveIcon mapper;

    @Inject
    public setTitleColor(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, setDivider setdivider, getActiveIcon getactiveicon, getAppLaunchParams getapplaunchparams, getTabBarItemColorModel gettabbaritemcolormodel) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.homeInfoEntityDataFactory = setdivider;
        this.mapper = getactiveicon;
        this.homeDataResultMapper = gettabbaritemcolormodel;
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverAmcsLiteConfig.AnonymousClass2> getHomeInfo(List<String> list) {
        return authenticatedRequest(createHomeInfoData().getHomeInfo()).flatMap(new isDisableOnInit(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getHomeInfo$2(List list, flushMessages flushmessages) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        if (list == null || list.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(this.mapper.transform(flushmessages));
        }
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<T>> list2 = TitleBarRightButtonView.AnonymousClass1.fromIterable(flushmessages.getThirdPartyLinks()).filter(new getTransparentTitle(this, list)).toList();
        if (list2 instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list2).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list2);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new getImgTitle(this, flushmessages));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ GriverAmcsLiteConfig.AnonymousClass2 lambda$getHomeInfo$1(flushMessages flushmessages, List list) throws Exception {
        flushmessages.setThirdPartyLinks(list);
        return this.mapper.transform(flushmessages);
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverConfig> getUpdatedHomeData(int i, String str) {
        TitleBarRightButtonView.AnonymousClass1<IpcServerUtils> updatedHomeData = createHomeInfoData().getUpdatedHomeData(i, str);
        getTabBarItemColorModel gettabbaritemcolormodel = this.homeDataResultMapper;
        Objects.requireNonNull(gettabbaritemcolormodel);
        return updatedHomeData.map(new getItems(gettabbaritemcolormodel));
    }

    private setTransparentTitle createHomeInfoData() {
        return this.homeInfoEntityDataFactory.createData("network");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: isThirdPartyOnListed */
    public boolean lambda$getHomeInfo$0(TitleBar titleBar, List<String> list) {
        for (String equalsIgnoreCase : list) {
            if (equalsIgnoreCase.equalsIgnoreCase(titleBar.getName())) {
                return true;
            }
        }
        return false;
    }
}
