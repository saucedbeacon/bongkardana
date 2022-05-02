package o;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.DialogRecyclerView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0010\u0010#\u001a\n \u0019*\u0004\u0018\u00010\r0\rH\u0002J$\u0010$\u001a\u00020\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010&\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010&\u001a\u00020\"H\u0002JF\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0,2\u001a\b\u0002\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0014\u0012\u0004\u0012\u00020\u001f0\u0015J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u0002010\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0014H\u0002J\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u0014J\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u0014J\u0016\u00105\u001a\u00020\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u0014H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u0016\u00107\u001a\u00020\u001f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\"0\u0014H\u0007J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\r0:2\u0006\u00108\u001a\u00020\"H\u0002J\u0016\u0010;\u001a\u00020\u001f2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=H\u0002J\u0016\u0010>\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/data/social/extension/ContactDeviceNameMapper;", "", "socialContactProvider", "Lid/dana/data/social/sync/SocialContactProvider;", "serializer", "Lid/dana/data/storage/Serializer;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "context", "Landroid/content/Context;", "(Lid/dana/data/social/sync/SocialContactProvider;Lid/dana/data/storage/Serializer;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Landroid/content/Context;)V", "<set-?>", "", "", "cachedPhoneDeviceNames", "getCachedPhoneDeviceNames", "()Ljava/util/Map;", "setCachedPhoneDeviceNames", "(Ljava/util/Map;)V", "formattingFunctionForAllPossiblePrefixOfAPhoneNumber", "", "Lkotlin/Function1;", "formattingFunctionForManyPrefixToOneFormat", "localAccountEntityData", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "getLocalAccountEntityData", "()Lid/dana/data/account/repository/source/AccountEntityData;", "localAccountEntityData$delegate", "Lkotlin/Lazy;", "applyNicknameUpdate", "", "relationshipItemWhoseNicknameNeedUpdateFromDb", "", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "getCurrentUserPhoneNumber", "getMappingKey", "formatter", "mappablePhoneNumber", "isPhoneNumberContainMasking", "", "mapDeviceContactName", "phoneNumberToContact", "maskingFunction", "Lkotlin/Function0;", "updateNicknameWithUsernameIfExist", "mapPhoneNumberToDeviceContactName", "Lid/dana/domain/social/model/SocialFeed;", "socialFeed", "Lid/dana/domain/social/model/ActivityResponse;", "activities", "mapPhoneNumberToDeviceContactNameForRelationshipItem", "mapPhoneNumberToDeviceContactNameNotUsername", "maskNicknameDisplayName", "updateCurrentuserWithYou", "updateHeadernameForUserProfile", "phoneNumberToContactNameMappableItem", "updateNicknameFromCacheForRelationship", "", "updateNicknameWithContactDeviceName", "phoneNumNotFoundInCacheForDbQuery", "", "updateUsernameForRelationship", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPermissions {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    public static final int MAX_BATCH_PERMAP = 50;
    /* access modifiers changed from: private */
    public final DialogLayout accountEntityDataFactory;
    @NotNull
    private Map<String, String> cachedPhoneDeviceNames = new LinkedHashMap();
    private final Context context;
    private final List<Function1<String, String>> formattingFunctionForAllPossiblePrefixOfAPhoneNumber = CollectionsKt.listOf(setMin.INSTANCE, setMax.INSTANCE, getMax.INSTANCE);
    private final List<Function1<String, String>> formattingFunctionForManyPrefixToOneFormat = CollectionsKt.listOf(length.INSTANCE, isInside.INSTANCE, toFloatRange.INSTANCE);
    private final Lazy localAccountEntityData$delegate = LazyKt.lazy(new toIntRange(this));
    private final PluginInstallCallback serializer;
    private final getAuthContentResult socialContactProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(0);
        }

        public final void invoke() {
        }
    }

    private final setDrawDivider getLocalAccountEntityData() {
        return (setDrawDivider) this.localAccountEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/account/AccountEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<attach, String> {
        public static final equals length = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            attach attach = (attach) obj;
            Intrinsics.checkNotNullParameter(attach, "it");
            return attach.getPhoneNumber();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<List<? extends getShowType>, Unit> {
        final /* synthetic */ getPermissions this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(getPermissions getpermissions) {
            super(1);
            this.this$0 = getpermissions;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends getShowType>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends getShowType> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.updateUsernameForRelationship(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<List<? extends getShowType>, Unit> {
        public static final values INSTANCE = new values();

        values() {
            super(1);
        }

        public final void invoke(@NotNull List<? extends getShowType> list) {
            Intrinsics.checkNotNullParameter(list, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends getShowType>) (List) obj);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public getPermissions(@NotNull getAuthContentResult getauthcontentresult, @NotNull PluginInstallCallback pluginInstallCallback, @NotNull DialogLayout dialogLayout, @NotNull Context context2) {
        Intrinsics.checkNotNullParameter(getauthcontentresult, "socialContactProvider");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.socialContactProvider = getauthcontentresult;
        this.serializer = pluginInstallCallback;
        this.accountEntityDataFactory = dialogLayout;
        this.context = context2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<setDrawDivider> {
        final /* synthetic */ getPermissions this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(getPermissions getpermissions) {
            super(0);
            this.this$0 = getpermissions;
        }

        public final setDrawDivider invoke() {
            return this.this$0.accountEntityDataFactory.createData("local");
        }
    }

    private final String getCurrentUserPhoneNumber() {
        setDrawDivider localAccountEntityData = getLocalAccountEntityData();
        Intrinsics.checkNotNullExpressionValue(localAccountEntityData, "localAccountEntityData");
        return (String) localAccountEntityData.getAccount().map(equals.length).blockingFirst();
    }

    @NotNull
    public final Map<String, String> getCachedPhoneDeviceNames() {
        return this.cachedPhoneDeviceNames;
    }

    @VisibleForTesting
    public final void setCachedPhoneDeviceNames(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.cachedPhoneDeviceNames = map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "phoneNum", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<String, String> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1987535520, oncanceled);
                onCancelLoad.getMin(-1987535520, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "phoneNum");
            return AuthenticationProxy.replaceIndoRegionDashWithPhonePrefix(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "phoneNum", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<String, String> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "phoneNum");
            return AuthenticationProxy.replaceIndoRegionDashWithPlusSixTwoEight(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "phoneNum", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<String, String> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-325631146, oncanceled);
                onCancelLoad.getMin(-325631146, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "phoneNum");
            return AuthenticationProxy.replaceIndoRegionDashWithSixTwo(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "phoneNum", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<String, String> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1004815508, oncanceled);
                onCancelLoad.getMin(-1004815508, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "phoneNum");
            return AuthenticationProxy.replacePhonePrefixWithIndoRegionDash(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "phoneNum", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<String, String> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "phoneNum");
            return AuthenticationProxy.replacePlusSixTwoEightWithIndoRegionDash(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "phoneNum", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<String, String> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "phoneNum");
            return AuthenticationProxy.replaceSixTwoWithIndoRegionDash(str);
        }
    }

    private final List<RssiFilter> mapPhoneNumberToDeviceContactName(List<RssiFilter> list) {
        Iterable<RssiFilter> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (RssiFilter settingExtendProxy : iterable) {
            arrayList.add(new SettingExtendProxy(this.serializer, settingExtendProxy));
        }
        mapPhoneNumberToDeviceContactNameForRelationshipItem((List) arrayList);
        return list;
    }

    @NotNull
    public final List<getShowType> mapPhoneNumberToDeviceContactNameNotUsername(@NotNull List<? extends getShowType> list) {
        Intrinsics.checkNotNullParameter(list, "phoneNumberToContact");
        return mapDeviceContactName(list, new getPermissions$FastBitmap$CoordinateSystem(this, list), values.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ List $phoneNumberToContact;
        final /* synthetic */ getPermissions this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(getPermissions getpermissions, List list) {
            super(0);
            this.this$0 = getpermissions;
            this.$phoneNumberToContact = list;
        }

        public final void invoke() {
            this.this$0.maskNicknameDisplayName(this.$phoneNumberToContact);
        }
    }

    @NotNull
    public final List<getShowType> mapPhoneNumberToDeviceContactNameForRelationshipItem(@NotNull List<? extends getShowType> list) {
        Intrinsics.checkNotNullParameter(list, "phoneNumberToContact");
        return mapDeviceContactName$default(this, list, new toDoubleRange(this, list), (Function1) null, 4, (Object) null);
    }

    public static /* synthetic */ List mapDeviceContactName$default(getPermissions getpermissions, List list, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = IsOverlapping.INSTANCE;
        }
        if ((i & 4) != 0) {
            function1 = new toString(getpermissions);
        }
        return getpermissions.mapDeviceContactName(list, function0, function1);
    }

    @NotNull
    public final List<getShowType> mapDeviceContactName(@NotNull List<? extends getShowType> list, @NotNull Function0<Unit> function0, @NotNull Function1<? super List<? extends getShowType>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "phoneNumberToContact");
        Intrinsics.checkNotNullParameter(function0, "maskingFunction");
        Intrinsics.checkNotNullParameter(function1, "updateNicknameWithUsernameIfExist");
        this.cachedPhoneDeviceNames = new HashMap();
        function0.invoke();
        for (List<getShowType> list2 : CollectionsKt.chunked(list, 50)) {
            Set linkedHashSet = new LinkedHashSet();
            List arrayList = new ArrayList();
            for (getShowType getshowtype : list2) {
                for (String add : updateNicknameFromCacheForRelationship(getshowtype)) {
                    linkedHashSet.add(add);
                }
                arrayList.add(getshowtype);
            }
            updateNicknameWithContactDeviceName(linkedHashSet);
            updateHeadernameForUserProfile(list2);
            function1.invoke(list2);
            updateCurrentuserWithYou();
            applyNicknameUpdate(arrayList);
        }
        return list;
    }

    private final boolean isPhoneNumberContainMasking(getShowType getshowtype) {
        return StringsKt.contains$default((CharSequence) getshowtype.getContactPhoneNumber(), (CharSequence) "*", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) getshowtype.getContactPhoneNumber(), (CharSequence) "•", false, 2, (Object) null);
    }

    @VisibleForTesting
    public final void updateHeadernameForUserProfile(@NotNull List<? extends getShowType> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "phoneNumberToContactNameMappableItem");
        for (getShowType getshowtype : list) {
            Iterator it = this.formattingFunctionForAllPossiblePrefixOfAPhoneNumber.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Function1 function1 = (Function1) it.next();
                CharSequence charSequence = this.cachedPhoneDeviceNames.get(getMappingKey(function1, getshowtype));
                if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                    z = false;
                }
                if (!z) {
                    String str = this.cachedPhoneDeviceNames.get(getMappingKey(function1, getshowtype));
                    if (str == null) {
                        str = "";
                    }
                    getshowtype.updateHeaderName(str);
                }
            }
            if (getshowtype.getHeaderName().length() != 0) {
                z = false;
            }
            if (z) {
                getshowtype.updateHeaderName(getshowtype.getNickname());
            }
        }
    }

    private final String getMappingKey(Function1<? super String, String> function1, getShowType getshowtype) {
        if (isPhoneNumberContainMasking(getshowtype)) {
            return getshowtype.getActorUserId();
        }
        return function1.invoke(getshowtype.getContactPhoneNumber());
    }

    /* access modifiers changed from: private */
    public final void maskNicknameDisplayName(List<? extends getShowType> list) {
        Iterable<getShowType> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getShowType getshowtype : iterable) {
            if (isPhoneNumberContainMasking(getshowtype)) {
                getshowtype.updateNickName(startBluetoothDevicesDiscovery.maskName(getshowtype.getNickname()));
            }
            arrayList.add(Unit.INSTANCE);
        }
    }

    private final void updateCurrentuserWithYou() {
        for (Function1 invoke : this.formattingFunctionForManyPrefixToOneFormat) {
            String currentUserPhoneNumber = getCurrentUserPhoneNumber();
            Intrinsics.checkNotNullExpressionValue(currentUserPhoneNumber, "getCurrentUserPhoneNumber()");
            String str = (String) invoke.invoke(currentUserPhoneNumber);
            for (Function1 invoke2 : this.formattingFunctionForAllPossiblePrefixOfAPhoneNumber) {
                Map<String, String> map = this.cachedPhoneDeviceNames;
                Object invoke3 = invoke2.invoke(str);
                String string = this.context.getString(DialogRecyclerView.setMax.you);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.you)");
                map.put(invoke3, string);
            }
        }
    }

    private final void updateNicknameWithContactDeviceName(Set<String> set) {
        this.cachedPhoneDeviceNames = this.socialContactProvider.populateContactDeviceName(set, this.cachedPhoneDeviceNames);
    }

    private final Set<String> updateNicknameFromCacheForRelationship(getShowType getshowtype) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (Function1 mappingKey : this.formattingFunctionForAllPossiblePrefixOfAPhoneNumber) {
            linkedHashSet.add(getMappingKey(mappingKey, getshowtype));
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: private */
    public final void updateUsernameForRelationship(List<? extends getShowType> list) {
        for (getShowType getshowtype : list) {
            if (getshowtype.getActorUsername().length() > 0) {
                for (Function1 mappingKey : this.formattingFunctionForAllPossiblePrefixOfAPhoneNumber) {
                    this.cachedPhoneDeviceNames.put(getMappingKey(mappingKey, getshowtype), getshowtype.getActorUsername());
                }
            }
        }
    }

    private final void applyNicknameUpdate(List<getShowType> list) {
        for (getShowType getshowtype : list) {
            for (Function1 mappingKey : this.formattingFunctionForAllPossiblePrefixOfAPhoneNumber) {
                String str = this.cachedPhoneDeviceNames.get(getMappingKey(mappingKey, getshowtype));
                if (str != null) {
                    getshowtype.updateNickName(str);
                }
            }
        }
    }

    @NotNull
    public final getScanCallbackIntent mapPhoneNumberToDeviceContactName(@NotNull getScanCallbackIntent getscancallbackintent) {
        Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
        if (getscancallbackintent.isFeedNotVersionTwo()) {
            for (onCycleEnd activities : getscancallbackintent.getGroupedActivities()) {
                mapPhoneNumberToDeviceContactName(activities.getActivities());
            }
        } else {
            mapPhoneNumberToDeviceContactName(getscancallbackintent.getActivities());
        }
        return getscancallbackintent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/social/extension/ContactDeviceNameMapper$Companion;", "", "()V", "MAX_BATCH_PERMAP", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
