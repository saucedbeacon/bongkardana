package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.setLeftBtnInfo;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010!\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u001bj\u0002`#H\u0002J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, d2 = {"Lid/dana/social/presenter/UsernamePresenter;", "Lid/dana/social/contract/UsernameContract$Presenter;", "view", "Lid/dana/social/contract/UsernameContract$View;", "usernameCheckManager", "Lid/dana/data/social/UsernameCheckManager;", "checkUsername", "Lid/dana/domain/user/interactor/CheckUsername;", "changeUsername", "Lid/dana/domain/user/interactor/ChangeUsername;", "initFeedWithoutContact", "Lid/dana/domain/social/interactor/InitFeedWithoutContact;", "(Lid/dana/social/contract/UsernameContract$View;Lid/dana/data/social/UsernameCheckManager;Lid/dana/domain/user/interactor/CheckUsername;Lid/dana/domain/user/interactor/ChangeUsername;Lid/dana/domain/social/interactor/InitFeedWithoutContact;)V", "getView", "()Lid/dana/social/contract/UsernameContract$View;", "", "username", "", "observeUsername", "textChanges", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "", "onCheckUsername", "data", "Lid/dana/domain/user/UserProfileResponse;", "onCheckUsernameError", "exception", "Ljava/lang/Exception;", "onInitFeedError", "onInitFeedSuccess", "initFeed", "Lid/dana/domain/social/model/InitFeed;", "onSubmitUsername", "onSubmitUsernameError", "e", "Lkotlin/Exception;", "submitUsername", "validateUsername", "it", "Lid/dana/data/social/model/UsernameCheck;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getActiveView implements setLeftBtnInfo.length {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public final startPermissionGuide getMax;
    private final disconnectAndClose getMin;
    private final closeAll length;
    @NotNull
    final setLeftBtnInfo.getMax setMin;
    private final stopStatusPreservation toFloatRange;

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/domain/social/model/InitFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class IsOverlapping extends FunctionReferenceImpl implements Function1<setBeaconParsers, Unit> {
        IsOverlapping(getActiveView getactiveview) {
            super(1, getactiveview, getActiveView.class, "onInitFeedSuccess", "onInitFeedSuccess(Lid/dana/domain/social/model/InitFeed;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setBeaconParsers) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setBeaconParsers setbeaconparsers) {
            Intrinsics.checkNotNullParameter(setbeaconparsers, "p1");
            updateActionSheetContent.d(DanaLogConstants.TAG.PROFILE_TAG, setbeaconparsers.getStatus().toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Ljava/lang/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class equals extends FunctionReferenceImpl implements Function1<Exception, Unit> {
        equals(getActiveView getactiveview) {
            super(1, getactiveview, getActiveView.class, "onInitFeedError", "onInitFeedError(Ljava/lang/Exception;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "p1");
            updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, getActiveView.class.getName(), exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<CharSequence, String> {
        public static final getMax setMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, "it");
            String obj2 = charSequence.toString();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
            if (obj2 != null) {
                String lowerCase = obj2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ String $username;
        final /* synthetic */ getActiveView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getActiveView getactiveview, String str) {
            super(1);
            this.this$0 = getactiveview;
            this.$username = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            getActiveView.setMax(this.this$0, this.$username, exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getActiveView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(getActiveView getactiveview) {
            super(1);
            this.this$0 = getactiveview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            getActiveView.getMax(this.this$0, exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/user/UserProfileResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<disconnectAllDevices, Unit> {
        final /* synthetic */ String $username;
        final /* synthetic */ getActiveView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getActiveView getactiveview, String str) {
            super(1);
            this.this$0 = getactiveview;
            this.$username = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((disconnectAllDevices) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull disconnectAllDevices disconnectalldevices) {
            Intrinsics.checkNotNullParameter(disconnectalldevices, "it");
            getActiveView.getMin(this.this$0, this.$username, disconnectalldevices);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/user/UserProfileResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<disconnectAllDevices, Unit> {
        final /* synthetic */ getActiveView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(getActiveView getactiveview) {
            super(1);
            this.this$0 = getactiveview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((disconnectAllDevices) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull disconnectAllDevices disconnectalldevices) {
            Intrinsics.checkNotNullParameter(disconnectalldevices, "it");
            getActiveView.length(this.this$0, disconnectalldevices);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/model/UsernameCheck;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<String, j> {
        final /* synthetic */ getActiveView length;

        toIntRange(getActiveView getactiveview) {
            this.length = getactiveview;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            return this.length.getMax.runUserNameCheck(new j(str, ""));
        }
    }

    @Inject
    public getActiveView(@NotNull setLeftBtnInfo.getMax getmax, @NotNull startPermissionGuide startpermissionguide, @NotNull closeAll closeall, @NotNull disconnectAndClose disconnectandclose, @NotNull stopStatusPreservation stopstatuspreservation) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(startpermissionguide, "usernameCheckManager");
        Intrinsics.checkNotNullParameter(closeall, "checkUsername");
        Intrinsics.checkNotNullParameter(disconnectandclose, "changeUsername");
        Intrinsics.checkNotNullParameter(stopstatuspreservation, "initFeedWithoutContact");
        this.setMin = getmax;
        this.getMax = startpermissionguide;
        this.length = closeall;
        this.getMin = disconnectandclose;
        this.toFloatRange = stopstatuspreservation;
    }

    public final void length(@NotNull AudioAttributesImplBase<CharSequence> audioAttributesImplBase) {
        Intrinsics.checkNotNullParameter(audioAttributesImplBase, "textChanges");
        audioAttributesImplBase.skipInitialValue().doOnNext(new setMin(this)).debounce(1500, TimeUnit.MILLISECONDS).map(getMax.setMin).map(new toIntRange(this)).observeOn(hideProgress.length()).subscribe(new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/UsernamePresenter$observeUsername$4", "Lid/dana/domain/DefaultObserver;", "Lid/dana/data/social/model/UsernameCheck;", "onError", "", "e", "", "onNext", "it", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<j> {
        final /* synthetic */ getActiveView setMax;

        isInside(getActiveView getactiveview) {
            this.setMax = getactiveview;
        }

        public final /* synthetic */ void onNext(Object obj) {
            j jVar = (j) obj;
            Intrinsics.checkNotNullParameter(jVar, "it");
            getActiveView.getMax(this.setMax, jVar);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMax.setMin.onError(th.getMessage());
        }
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        this.getMin.invoke(str, new toFloatRange(this), new hashCode(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/presenter/UsernamePresenter$Companion;", "", "()V", "DEBOUNCE_USERNAME", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<CharSequence> {
        final /* synthetic */ getActiveView setMin;

        setMin(getActiveView getactiveview) {
            this.setMin = getactiveview;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.setMin.setMin.length();
        }
    }

    public static final /* synthetic */ void getMax(getActiveView getactiveview, j jVar) {
        boolean z = true;
        if (jVar.getErrorMessage().length() > 0) {
            if (jVar.getUsername().length() > 0) {
                getactiveview.setMin.length(jVar);
                return;
            }
        }
        if (jVar.getErrorMessage().length() == 0) {
            if (jVar.getUsername().length() <= 0) {
                z = false;
            }
            if (z) {
                String username = jVar.getUsername();
                Intrinsics.checkNotNullParameter(username, setBuildNumber.USERNAME_KEY);
                getactiveview.length.execute(username, new length(getactiveview, username), new getMin(getactiveview, username));
            }
        }
    }

    public static final /* synthetic */ void getMin(getActiveView getactiveview, String str, disconnectAllDevices disconnectalldevices) {
        if (Intrinsics.areEqual((Object) disconnectalldevices.getErrorCode(), (Object) "AE15112158172914")) {
            getactiveview.setMin.length(getactiveview.getMax.usernameTaken(str));
        } else if (disconnectalldevices.getSuccess()) {
            getactiveview.setMin.setMax();
        } else {
            getactiveview.setMin.length(new j(str, disconnectalldevices.getErrorMessage()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r2 = r2.getCause();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void setMax(o.getActiveView r3, java.lang.String r4, java.lang.Exception r5) {
        /*
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof com.alipay.imobile.network.quake.exception.ClientException
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0010
            o.setLeftBtnInfo$getMax r3 = r3.setMin
            r3.setMax()
            goto L_0x002f
        L_0x0010:
            o.setLeftBtnInfo$getMax r3 = r3.setMin
            o.j r0 = new o.j
            java.lang.Throwable r2 = r5.getCause()
            if (r2 == 0) goto L_0x0025
            java.lang.Throwable r2 = r2.getCause()
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = r2.getMessage()
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            r2 = r1
        L_0x0029:
            r0.<init>(r4, r2)
            r3.length(r0)
        L_0x002f:
            java.lang.Class<o.getActiveView> r3 = o.getActiveView.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r5.getMessage()
            if (r4 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r4
        L_0x003d:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            o.updateActionSheetContent.e(r3, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getActiveView.setMax(o.getActiveView, java.lang.String, java.lang.Exception):void");
    }

    public static final /* synthetic */ void length(getActiveView getactiveview, disconnectAllDevices disconnectalldevices) {
        if (disconnectalldevices.getSuccess()) {
            getActiveView getactiveview2 = getactiveview;
            getactiveview.toFloatRange.execute(null, new IsOverlapping(getactiveview2), new equals(getactiveview2));
            getactiveview.setMin.getMax();
            return;
        }
        getactiveview.setMin.setMin(disconnectalldevices.getErrorCode(), disconnectalldevices.getErrorMessage());
    }

    public static final /* synthetic */ void getMax(getActiveView getactiveview, Exception exc) {
        getactiveview.setMin.getMin();
        String name = getActiveView.class.getName();
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        updateActionSheetContent.e(name, message, exc);
    }
}
