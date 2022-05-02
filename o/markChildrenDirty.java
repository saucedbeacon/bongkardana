package o;

import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.model.RelationshipItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.TitleBarRightButtonView;
import o.addChooseImageCrossOrigin;
import o.getTitleText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 =2\u00020\u0001:\u0001=B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020(H\u0016J\u0016\u0010+\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0016J<\u0010-\u001a\u00020(2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140/2\u001e\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140/01H\u0002J\b\u00102\u001a\u00020(H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002J\u0010\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\u0013H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0002J\u0018\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u0014H\u0016J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0016J\b\u0010<\u001a\u00020(H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bX.¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lid/dana/social/presenter/RelationshipBottomSheetPresenter;", "Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "view", "Lid/dana/social/contract/RelationshipBottomSheetContract$View;", "getSetting", "Lid/dana/domain/profilemenu/interactor/GetSettingByKey;", "startFollowingFullSync", "Lid/dana/domain/social/interactor/StartFollowingFullSync;", "getReciprocalFriend", "Lid/dana/domain/social/interactor/GetReciprocalFriend;", "modifyFollowingRelationship", "Lid/dana/domain/social/interactor/ModifyFollowingRelationship;", "modifyFollowerRelationship", "Lid/dana/domain/social/interactor/ModifyFollowerRelationship;", "checkFeedInboxTabFeature", "Lid/dana/domain/featureconfig/interactor/CheckFeedInboxTabFeature;", "(Lid/dana/social/contract/RelationshipBottomSheetContract$View;Lid/dana/domain/profilemenu/interactor/GetSettingByKey;Lid/dana/domain/social/interactor/StartFollowingFullSync;Lid/dana/domain/social/interactor/GetReciprocalFriend;Lid/dana/domain/social/interactor/ModifyFollowingRelationship;Lid/dana/domain/social/interactor/ModifyFollowerRelationship;Lid/dana/domain/featureconfig/interactor/CheckFeedInboxTabFeature;)V", "modifyFollowerRelationshipMap", "", "", "Lid/dana/domain/social/ModifyRelationOperationType;", "modifyFollowingRelationshipMap", "modifyRelationshipSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "modifyRelationshipSubjectObserver", "Lid/dana/domain/DefaultObserver;", "originalRelationshipList", "", "Lid/dana/social/model/RelationshipItemModel;", "getOriginalRelationshipList$app_productionRelease", "()Ljava/util/List;", "setOriginalRelationshipList$app_productionRelease", "(Ljava/util/List;)V", "searchObserver", "getSearchObserver$app_productionRelease", "()Lid/dana/domain/DefaultObserver;", "searchPublishSubject", "callModifyFollowerRelationship", "", "callModifyFollowingRelationship", "checkFeedInboxTabEnable", "createDebouncerForSearch", "searchViewPublishSubject", "executeModifyRelationship", "originalRelationshipData", "", "modifyRelationshipUseCase", "Lid/dana/domain/core/usecase/BaseUseCase;", "getActiveReciprocal", "getModifyRelationshipObserver", "getProfileSettingModel", "key", "getSearchObserver", "modifyRelationship", "userId", "operationType", "observeModifyRelationship", "onDestroy", "startFetchingReciprocal", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class markChildrenDirty implements getTitleText.getMin {
    @NotNull
    public static final setMax setMin = new setMax((byte) 0);
    private final regions FastBitmap$CoordinateSystem;
    private final markOutside IsOverlapping;
    private GriverAppVirtualHostProxy<Boolean> equals;
    private final Map<String, ModifyRelationOperationType> getMax = new LinkedHashMap();
    @NotNull
    List<RelationshipItemModel> getMin = CollectionsKt.emptyList();
    private final setDatabaseEnabled hashCode;
    /* access modifiers changed from: private */
    public final getTitleText.length isInside;
    private IComponent<String> length;
    private final Map<String, ModifyRelationOperationType> setMax = new LinkedHashMap();
    private final getUseTrackingCache toDoubleRange;
    private IComponent<Boolean> toFloatRange;
    private final addChooseImageCrossOrigin toIntRange;
    private final setSampleExpirationMilliseconds values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ markChildrenDirty this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(markChildrenDirty markchildrendirty) {
            super(1);
            this.this$0 = markchildrendirty;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.isInside.setMin();
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, String.valueOf(th.getCause()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Map $originalRelationshipData;
        final /* synthetic */ markChildrenDirty this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(markChildrenDirty markchildrendirty, Map map) {
            super(1);
            this.this$0 = markchildrendirty;
            this.$originalRelationshipData = map;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.isInside.length((ModifyRelationOperationType) CollectionsKt.first(this.$originalRelationshipData.values()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/social/model/Following;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<ScanHelper, Unit> {
        final /* synthetic */ markChildrenDirty this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(markChildrenDirty markchildrendirty) {
            super(1);
            this.this$0 = markchildrendirty;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ScanHelper) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ScanHelper scanHelper) {
            Intrinsics.checkNotNullParameter(scanHelper, "result");
            markChildrenDirty markchildrendirty = this.this$0;
            List<RelationshipItemModel> max = setSelectionFromOffset.setMax(scanHelper.getFollowingItemList());
            Intrinsics.checkNotNullParameter(max, "<set-?>");
            markchildrendirty.getMin = max;
            this.this$0.isInside.getMin(this.this$0.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ markChildrenDirty this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(markChildrenDirty markchildrendirty) {
            super(1);
            this.this$0 = markchildrendirty;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.isInside.setMin(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e("RelationshipBottomSheetPresenter", th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<Exception, Unit> {
        public static final values INSTANCE = new values();

        values() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(exc.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Inject
    public markChildrenDirty(@NotNull getTitleText.length length2, @NotNull addChooseImageCrossOrigin addchooseimagecrossorigin, @NotNull markOutside markoutside, @NotNull regions regions, @NotNull setSampleExpirationMilliseconds setsampleexpirationmilliseconds, @NotNull getUseTrackingCache getusetrackingcache, @NotNull setDatabaseEnabled setdatabaseenabled) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(addchooseimagecrossorigin, Constants.JS_API_GET_SETTING);
        Intrinsics.checkNotNullParameter(markoutside, "startFollowingFullSync");
        Intrinsics.checkNotNullParameter(regions, "getReciprocalFriend");
        Intrinsics.checkNotNullParameter(setsampleexpirationmilliseconds, "modifyFollowingRelationship");
        Intrinsics.checkNotNullParameter(getusetrackingcache, "modifyFollowerRelationship");
        Intrinsics.checkNotNullParameter(setdatabaseenabled, "checkFeedInboxTabFeature");
        this.isInside = length2;
        this.toIntRange = addchooseimagecrossorigin;
        this.IsOverlapping = markoutside;
        this.FastBitmap$CoordinateSystem = regions;
        this.values = setsampleexpirationmilliseconds;
        this.toDoubleRange = getusetrackingcache;
        this.hashCode = setdatabaseenabled;
        IComponent<Boolean> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<Boolean>()");
        this.toFloatRange = max;
        TitleBarRightButtonView.AnonymousClass1<Boolean> debounce = max.observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).debounce(800, TimeUnit.MILLISECONDS);
        GriverAppVirtualHostProxy<Boolean> tofloatrange = new toFloatRange(this);
        this.equals = tofloatrange;
        if (tofloatrange == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSubjectObserver");
        }
        debounce.subscribe((GriverProgressBar<? super Boolean>) tofloatrange);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/RelationshipBottomSheetPresenter$getModifyRelationshipObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "isFollowing", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ markChildrenDirty getMax;

        toFloatRange(markChildrenDirty markchildrendirty) {
            this.getMax = markchildrendirty;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                markChildrenDirty.setMax(this.getMax);
            } else {
                markChildrenDirty.length(this.getMax);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(sb.toString(), "");
        }
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.isInside.showProgress();
        this.toIntRange.execute(new equals(this), addChooseImageCrossOrigin.setMax.forSettingKey(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/RelationshipBottomSheetPresenter$getProfileSettingModel$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/profilemenu/model/SettingModel;", "onError", "", "e", "", "onNext", "settingModels", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<SettingModel> {
        final /* synthetic */ markChildrenDirty setMax;

        equals(markChildrenDirty markchildrendirty) {
            this.setMax = markchildrendirty;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SettingModel settingModel = (SettingModel) obj;
            Intrinsics.checkNotNullParameter(settingModel, "settingModels");
            this.setMax.isInside.getMax(settingModel);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e("RelationshipBottomSheetPresenter", th.getMessage(), th);
            this.setMax.isInside.getMin();
        }
    }

    public final void length() {
        this.IsOverlapping.execute(Unit.INSTANCE, values.INSTANCE);
    }

    public final void getMin() {
        this.FastBitmap$CoordinateSystem.execute(onReceivedIcon.INSTANCE, new isInside(this), IsOverlapping.INSTANCE);
    }

    public final void getMax(@NotNull IComponent<String> iComponent) {
        Intrinsics.checkNotNullParameter(iComponent, "searchViewPublishSubject");
        this.length = iComponent;
        if (iComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPublishSubject");
        }
        iComponent.debounce(800, TimeUnit.MILLISECONDS).observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).subscribe(new toIntRange(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/RelationshipBottomSheetPresenter$getSearchObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "keyword", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ markChildrenDirty getMin;

        toIntRange(markChildrenDirty markchildrendirty) {
            this.getMin = markchildrendirty;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
            if (!this.getMin.getMin.isEmpty()) {
                CharSequence charSequence = str;
                if (StringsKt.contains$default((CharSequence) StringsKt.trim(charSequence).toString(), (CharSequence) "*", false, 2, (Object) null)) {
                    return;
                }
                if (Intrinsics.areEqual((Object) StringsKt.trim(charSequence).toString(), (Object) "")) {
                    this.getMin.isInside.length(this.getMin.getMin);
                    return;
                }
                getTitleText.length min = this.getMin.isInside;
                Collection arrayList = new ArrayList();
                for (Object next : this.getMin.getMin) {
                    if (StringsKt.contains((CharSequence) ((RelationshipItemModel) next).getMin, charSequence, true)) {
                        arrayList.add(next);
                    }
                }
                min.length((List<RelationshipItemModel>) (List) arrayList);
            }
        }
    }

    public final void setMax(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
        int i = addScrapView.setMax[modifyRelationOperationType.ordinal()];
        if (i == 1 || i == 2) {
            this.getMax.put(str, modifyRelationOperationType);
            GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.equals;
            if (griverAppVirtualHostProxy == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSubjectObserver");
            }
            griverAppVirtualHostProxy.onNext(Boolean.TRUE);
            return;
        }
        this.setMax.put(str, modifyRelationOperationType);
        GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy2 = this.equals;
        if (griverAppVirtualHostProxy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSubjectObserver");
        }
        griverAppVirtualHostProxy2.onNext(Boolean.FALSE);
    }

    public final void setMax() {
        this.toIntRange.dispose();
        this.IsOverlapping.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        new toIntRange(this).dispose();
        GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.equals;
        if (griverAppVirtualHostProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSubjectObserver");
        }
        griverAppVirtualHostProxy.dispose();
        this.toDoubleRange.dispose();
        this.values.dispose();
    }

    public final void setMin() {
        this.hashCode.execute(onReceivedIcon.INSTANCE, new length(this), setMin.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/social/presenter/RelationshipBottomSheetPresenter$Companion;", "", "()V", "CLASS_NAME", "", "DEBOUNCE_TIME", "", "ON_ERROR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMax(markChildrenDirty markchildrendirty) {
        if (!markchildrendirty.getMax.isEmpty()) {
            Map<String, ModifyRelationOperationType> map = MapsKt.toMap(markchildrendirty.getMax);
            markchildrendirty.getMax.clear();
            markchildrendirty.values.execute(map, new getMin(markchildrendirty, map), new getMax(markchildrendirty));
        }
    }

    public static final /* synthetic */ void length(markChildrenDirty markchildrendirty) {
        if (!markchildrendirty.setMax.isEmpty()) {
            Map<String, ModifyRelationOperationType> map = MapsKt.toMap(markchildrendirty.setMax);
            markchildrendirty.setMax.clear();
            markchildrendirty.toDoubleRange.execute(map, new getMin(markchildrendirty, map), new getMax(markchildrendirty));
        }
    }
}
