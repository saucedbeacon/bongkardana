package o;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import o.listItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016J0\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0019H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010\u001d\u001a\u00020\u0014H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/data/announcement/repository/AnnouncementEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/announcement/AnnouncementRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "announcementEntityDataFactory", "Lid/dana/data/announcement/repository/source/AnnouncementEntityDataFactory;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/announcement/repository/source/AnnouncementEntityDataFactory;)V", "createAnnouncementEntityData", "Lid/dana/data/announcement/AnnouncementEntityData;", "createLocalAnnouncementEntityData", "getAnnouncementGnIds", "Lio/reactivex/Observable;", "", "", "getAnnouncements", "Lid/dana/domain/announcement/model/Announcement;", "type", "extendInfo", "", "getTrackedAnnouncementsGnId", "saveAnnouncementGnId", "", "id", "saveTrackedAnnouncementGnId", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class updateListItems extends setMinProgress implements toolbarMenuClicked {
    private final getMessageTextView announcementEntityDataFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lid/dana/data/announcement/model/Announcements;", "", "recurringAnnouncement", "", "Lid/dana/data/announcement/model/AnnouncementEntity;", "(Ljava/util/List;)V", "getRecurringAnnouncement", "()Ljava/util/List;", "setRecurringAnnouncement", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.updateListItems$default  reason: invalid class name */
    public final class Cdefault {
        @Nullable
        private List<listItems.Cdefault> recurringAnnouncement;

        public Cdefault() {
            this((List) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Cdefault copy$default(Cdefault defaultR, List<listItems.Cdefault> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = defaultR.recurringAnnouncement;
            }
            return defaultR.copy(list);
        }

        @Nullable
        public final List<listItems.Cdefault> component1() {
            return this.recurringAnnouncement;
        }

        @NotNull
        public final Cdefault copy(@Nullable List<listItems.Cdefault> list) {
            return new Cdefault(list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof Cdefault) && Intrinsics.areEqual((Object) this.recurringAnnouncement, (Object) ((Cdefault) obj).recurringAnnouncement);
            }
            return true;
        }

        public final int hashCode() {
            List<listItems.Cdefault> list = this.recurringAnnouncement;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Announcements(recurringAnnouncement=");
            sb.append(this.recurringAnnouncement);
            sb.append(")");
            return sb.toString();
        }

        public Cdefault(@Nullable List<listItems.Cdefault> list) {
            this.recurringAnnouncement = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cdefault(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }

        @Nullable
        public final List<listItems.Cdefault> getRecurringAnnouncement() {
            return this.recurringAnnouncement;
        }

        public final void setRecurringAnnouncement(@Nullable List<listItems.Cdefault> list) {
            this.recurringAnnouncement = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/announcement/model/Announcement;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<populateText, List<? extends getIcontype>> {
        public static final length length = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            populateText populatetext = (populateText) obj;
            Intrinsics.checkNotNullParameter(populatetext, "it");
            return lineSpacing.toListAnnouncement(populatetext);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public updateListItems(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull getMessageTextView getmessagetextview) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(getmessagetextview, "announcementEntityDataFactory");
        this.announcementEntityDataFactory = getmessagetextview;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getIcontype>> getAnnouncements(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        TitleBarRightButtonView.AnonymousClass1<List<getIcontype>> authenticatedRequest = authenticatedRequest(createAnnouncementEntityData().getAnnouncements(str, map).map(length.length));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(cre…Announcement()\n        })");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getAnnouncementGnIds() {
        return createLocalAnnouncementEntityData().getAnnouncementsIdGNSubscription();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getTrackedAnnouncementsGnId() {
        return createLocalAnnouncementEntityData().getTrackedAnnouncementsIdGNSubscription();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveAnnouncementGnId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return createLocalAnnouncementEntityData().setAnnouncementIdGNSubscription(str);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveTrackedAnnouncementGnId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return createLocalAnnouncementEntityData().setTrackedAnnouncementIdGNSubscription(str);
    }

    private final getItemSelector createAnnouncementEntityData() {
        return this.announcementEntityDataFactory.createData("network");
    }

    private final getItemSelector createLocalAnnouncementEntityData() {
        return this.announcementEntityDataFactory.createData("local");
    }
}
