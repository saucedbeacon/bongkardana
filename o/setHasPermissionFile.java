package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RVOpenAuthHelper;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class setHasPermissionFile implements getAdapterPosition<RVOpenAuthHelper.a.AnonymousClass1.C00061> {
    private final b.C0007b<getLink> socialPreferencesDataFactoryProvider;

    public setHasPermissionFile(b.C0007b<getLink> bVar) {
        this.socialPreferencesDataFactoryProvider = bVar;
    }

    public final RVOpenAuthHelper.a.AnonymousClass1.C00061 get() {
        return newInstance(this.socialPreferencesDataFactoryProvider.get());
    }

    public static setHasPermissionFile create(b.C0007b<getLink> bVar) {
        return new setHasPermissionFile(bVar);
    }

    public static RVOpenAuthHelper.a.AnonymousClass1.C00061 newInstance(getLink getlink) {
        return new setModel(getlink) {
            private final Lazy socialPreferencesData$delegate = LazyKt.lazy(new getMin(this));
            /* access modifiers changed from: private */
            public final getLink socialPreferencesDataFactory;

            private final getFromSystem getSocialPreferencesData() {
                return (getFromSystem) this.socialPreferencesData$delegate.getValue();
            }

            {
                Intrinsics.checkNotNullParameter(r2, "socialPreferencesDataFactory");
                this.socialPreferencesDataFactory = r2;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/SocialPreferencesData;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.RVOpenAuthHelper$a$1$1$getMin */
            static final class getMin extends Lambda implements Function0<getFromSystem> {
                final /* synthetic */ C00061 this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                getMin(C00061 r1) {
                    super(0);
                    this.this$0 = r1;
                }

                @NotNull
                public final getFromSystem invoke() {
                    return this.this$0.socialPreferencesDataFactory.createData("local");
                }
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> getFeedsSharingLastCheckedState() {
                return getSocialPreferencesData().getFeedsSharingLastCheckedState();
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveFeedsSharingLastCheckedState(boolean z) {
                return getSocialPreferencesData().saveFeedsSharingLastCheckedState(z);
            }
        };
    }
}
