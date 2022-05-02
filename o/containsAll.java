package o;

import id.dana.data.Source;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.ByteArrayPool;
import o.ImmutableCollection;
import o.TitleBarRightButtonView;

@Singleton
public class containsAll implements setMfgReserved {
    private final ByteArrayPool.AnonymousClass1 referralWidgetEntityDataFactory;
    private final lastIndexOf referralWidgetMapper;

    @Inject
    public containsAll(ByteArrayPool.AnonymousClass1 r1, lastIndexOf lastindexof) {
        this.referralWidgetEntityDataFactory = r1;
        this.referralWidgetMapper = lastindexof;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<AltBeaconParser>> getReferralWidget() {
        TitleBarRightButtonView.AnonymousClass1<Map<String, containsValue>> onErrorResumeNext = createWidgets().getReferralWidgets().onErrorResumeNext(defaultButtonsIfEmpty());
        lastIndexOf lastindexof = this.referralWidgetMapper;
        Objects.requireNonNull(lastindexof);
        return onErrorResumeNext.map(new indexOf(lastindexof));
    }

    private getBuf createWidgets() {
        return this.referralWidgetEntityDataFactory.createData(Source.SPLIT);
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<Map<String, containsValue>>> defaultButtonsIfEmpty() {
        return new ImmutableCollection.ImmutableIterator(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$defaultButtonsIfEmpty$0(Throwable th) throws Exception {
        return createDefaultWidgets().getReferralWidgets();
    }

    private getBuf createDefaultWidgets() {
        return this.referralWidgetEntityDataFactory.createData("local");
    }
}
