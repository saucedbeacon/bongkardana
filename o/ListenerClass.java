package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.R;
import o.getToolbarMenus;
import o.remover;
import org.jetbrains.annotations.NotNull;

final class ListenerClass implements Function1 {
    private final R.styleable length;
    private final fillPageCommonInfo setMax;

    public ListenerClass(R.styleable styleable, fillPageCommonInfo fillpagecommoninfo) {
        this.length = styleable;
        this.setMax = fillpagecommoninfo;
    }

    public final Object invoke(Object obj) {
        return R.styleable.getMax(this.length, this.setMax, (Throwable) obj);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\n\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationPresenter;", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$Presenter;", "view", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$View;", "consultFaceLogin", "Lid/dana/domain/auth/face/interactor/ConsultFaceAuthPopUp;", "checkIfNeedToSuggestFaceAuth", "Lid/dana/domain/auth/face/interactor/IsNeedToSuggestFaceAuth;", "saveFaceAuthSuggestionState", "Lid/dana/domain/auth/face/interactor/SaveFaceAuthSuggestionState;", "clearFaceAuthSuggestionState", "Lid/dana/domain/auth/face/interactor/ClearFaceAuthSuggestionState;", "saveNeverShowFaceAuthSuggestion", "Lid/dana/domain/auth/face/interactor/SaveNeverShowFaceAuthSuggestion;", "shouldNeverShowFaceAuthSuggestion", "Lid/dana/domain/auth/face/interactor/IsNeverShowFaceAuthSuggestion;", "(Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$View;Lid/dana/domain/auth/face/interactor/ConsultFaceAuthPopUp;Lid/dana/domain/auth/face/interactor/IsNeedToSuggestFaceAuth;Lid/dana/domain/auth/face/interactor/SaveFaceAuthSuggestionState;Lid/dana/domain/auth/face/interactor/ClearFaceAuthSuggestionState;Lid/dana/domain/auth/face/interactor/SaveNeverShowFaceAuthSuggestion;Lid/dana/domain/auth/face/interactor/IsNeverShowFaceAuthSuggestion;)V", "checkIfShouldDisplaySuggestionPopUpAgain", "", "parallelMode", "", "withKycStatus", "checkTemporarySuggestionScreenDismiss", "consultToBackend", "onDestroy", "hasShown", "saveNeverShowFaceAuthSuggestionState", "neverShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class NONE implements remover.getMin {
        private final GriverShareMenuExtension IsOverlapping;
        private final setToolbarMenus getMax;
        private final BaseShareItem getMin;
        private final ShareParam length;
        final getToolbarMenus setMax;
        /* access modifiers changed from: private */
        public final remover.setMax setMin;
        private final startShare toFloatRange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class IsOverlapping extends Lambda implements Function1<Boolean, Unit> {
            public static final IsOverlapping INSTANCE = new IsOverlapping();

            IsOverlapping() {
                super(1);
            }

            public final void invoke(boolean z) {
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class equals extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ NONE this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            equals(NONE none) {
                super(1);
                this.this$0 = none;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMin.onError(th.getMessage());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<updateLoadingInfo, Unit> {
            final /* synthetic */ NONE this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(NONE none) {
                super(1);
                this.this$0 = none;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((updateLoadingInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull updateLoadingInfo updateloadinginfo) {
                Intrinsics.checkNotNullParameter(updateloadinginfo, "it");
                this.this$0.setMin.length(updateloadinginfo.getShouldShowPopUp());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "neverShow", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ boolean $parallelMode;
            final /* synthetic */ boolean $withKycStatus;
            final /* synthetic */ NONE this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(NONE none, boolean z, boolean z2) {
                super(1);
                this.this$0 = none;
                this.$parallelMode = z;
                this.$withKycStatus = z2;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z) {
                    this.this$0.getMin.execute(onReceivedIcon.INSTANCE, new length(this.this$0, this.$parallelMode, this.$withKycStatus), new setMin(this.this$0));
                } else {
                    this.this$0.setMin.length(false);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class isInside extends Lambda implements Function1<Throwable, Unit> {
            public static final isInside INSTANCE = new isInside();

            isInside() {
                super(1);
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ boolean $parallelMode;
            final /* synthetic */ boolean $withKycStatus;
            final /* synthetic */ NONE this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(NONE none, boolean z, boolean z2) {
                super(1);
                this.this$0 = none;
                this.$parallelMode = z;
                this.$withKycStatus = z2;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    NONE none = this.this$0;
                    none.setMax.execute(new getToolbarMenus.getMin(this.$parallelMode, this.$withKycStatus), new getMax(none), new equals(none));
                    return;
                }
                this.this$0.setMin.length(false);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ NONE this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(NONE none) {
                super(1);
                this.this$0 = none;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMin.onError(th.getMessage());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ NONE this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(NONE none) {
                super(1);
                this.this$0 = none;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMin.onError(th.getMessage());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toFloatRange extends Lambda implements Function1<Boolean, Unit> {
            public static final toFloatRange INSTANCE = new toFloatRange();

            toFloatRange() {
                super(1);
            }

            public final void invoke(boolean z) {
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
            public static final toIntRange INSTANCE = new toIntRange();

            toIntRange() {
                super(1);
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        @Inject
        public NONE(@NotNull remover.setMax setmax, @NotNull getToolbarMenus gettoolbarmenus, @NotNull BaseShareItem baseShareItem, @NotNull ShareParam shareParam, @NotNull setToolbarMenus settoolbarmenus, @NotNull GriverShareMenuExtension griverShareMenuExtension, @NotNull startShare startshare) {
            Intrinsics.checkNotNullParameter(setmax, "view");
            Intrinsics.checkNotNullParameter(gettoolbarmenus, "consultFaceLogin");
            Intrinsics.checkNotNullParameter(baseShareItem, "checkIfNeedToSuggestFaceAuth");
            Intrinsics.checkNotNullParameter(shareParam, "saveFaceAuthSuggestionState");
            Intrinsics.checkNotNullParameter(settoolbarmenus, "clearFaceAuthSuggestionState");
            Intrinsics.checkNotNullParameter(griverShareMenuExtension, "saveNeverShowFaceAuthSuggestion");
            Intrinsics.checkNotNullParameter(startshare, "shouldNeverShowFaceAuthSuggestion");
            this.setMin = setmax;
            this.setMax = gettoolbarmenus;
            this.getMin = baseShareItem;
            this.length = shareParam;
            this.getMax = settoolbarmenus;
            this.IsOverlapping = griverShareMenuExtension;
            this.toFloatRange = startshare;
        }

        public final void setMin() {
            this.toFloatRange.execute(onReceivedIcon.INSTANCE, new getMin(this, false, false), new setMax(this));
        }

        public final void length() {
            this.length.execute(Boolean.TRUE, IsOverlapping.INSTANCE, toIntRange.INSTANCE);
        }

        public final void getMax(boolean z) {
            this.IsOverlapping.execute(Boolean.valueOf(z), toFloatRange.INSTANCE, isInside.INSTANCE);
        }

        public final void setMax() {
            this.setMax.dispose();
            this.getMin.dispose();
            this.length.dispose();
            this.getMax.dispose();
        }
    }
}
