package o;

import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.model.ShopOpenHourModel;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.FileCache;
import o.b;
import o.k;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/nearbyme/mapper/OtherStoreListResultModelMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "Lid/dana/model/OtherStoreListResultModel;", "shopOpenHourListMapper", "Lid/dana/nearbyme/mapper/ShopOpenHourListMapper;", "contactAddressMapper", "Lid/dana/nearbyme/mapper/ContactAddressMapper;", "promoInfosMapper", "Lid/dana/nearbyme/mapper/PromoInfoMapper;", "merchantSubcategoriesMapper", "Lid/dana/nearbyme/mapper/MerchantSubcategoriesMapper;", "(Lid/dana/nearbyme/mapper/ShopOpenHourListMapper;Lid/dana/nearbyme/mapper/ContactAddressMapper;Lid/dana/nearbyme/mapper/PromoInfoMapper;Lid/dana/nearbyme/mapper/MerchantSubcategoriesMapper;)V", "map", "oldItem", "transformShopToShopModel", "", "Lid/dana/nearbyme/model/ShopModel;", "shop", "Lid/dana/domain/nearbyme/model/Shop;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverBaseActivity extends setSpeed<getCachePath, InternalApiBridgeExtension> {
    private final GriverPage getMax;
    private final MiniProgramFacade length;
    private final Main setMax;
    private final k.AnonymousClass9 setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lid/dana/nearbyme/mapper/ShopOpenHourListMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/nearbyme/model/ShopOpenHour;", "Lid/dana/nearbyme/model/ShopOpenHourModel;", "()V", "map", "oldItem", "transformShopOpenHour", "shopOpenHour", "localizedDay", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Main extends setSpeed<List<? extends getWebSetting>, List<? extends ShopOpenHourModel>> {
        public final /* synthetic */ Object map(Object obj) {
            Object obj2;
            List list = (List) obj;
            List arrayList = new ArrayList();
            if (list != null) {
                DateFormatSymbols instance = DateFormatSymbols.getInstance(Locale.ENGLISH);
                Intrinsics.checkNotNullExpressionValue(instance, "DateFormatSymbols.getInstance(Locale.ENGLISH)");
                String[] weekdays = instance.getWeekdays();
                DateFormatSymbols instance2 = DateFormatSymbols.getInstance(Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(instance2, "DateFormatSymbols.getInstance(Locale.getDefault())");
                String[] weekdays2 = instance2.getWeekdays();
                Intrinsics.checkNotNullExpressionValue(weekdays, "defaultDays");
                int length = weekdays.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    String str = weekdays[i];
                    int i3 = i2 + 1;
                    Intrinsics.checkNotNullExpressionValue(str, "day");
                    CharSequence charSequence = str;
                    if (charSequence.length() > 0) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (StringsKt.contains((CharSequence) ((getWebSetting) obj2).getDay(), charSequence, true)) {
                                break;
                            }
                        }
                        getWebSetting getwebsetting = (getWebSetting) obj2;
                        if (getwebsetting == null) {
                            getwebsetting = new getWebSetting((String) null, 0, 0, 7, (DefaultConstructorMarker) null);
                        }
                        String str2 = weekdays2[i2];
                        Intrinsics.checkNotNullExpressionValue(str2, "localizedDays[index]");
                        arrayList.add(new ShopOpenHourModel(str2, getwebsetting.getOpenHour(), getwebsetting.getCloseHour()));
                    }
                    i++;
                    i2 = i3;
                }
                if (Intrinsics.areEqual((Object) ((ShopOpenHourModel) CollectionsKt.first(arrayList)).length, (Object) weekdays2[1])) {
                    arrayList.add((ShopOpenHourModel) CollectionsKt.removeFirst(arrayList));
                }
            }
            return arrayList;
        }
    }

    public final class Lite implements getAdapterPosition<NebulaAppContext> {

        static final class getMin {
            /* access modifiers changed from: private */
            public static final Lite getMax = new Lite();
        }

        public static Lite setMax() {
            return getMin.getMax;
        }

        public final /* synthetic */ Object get() {
            return new NebulaAppContext();
        }
    }

    public final class Lite1 implements getAdapterPosition<Main> {

        static final class setMax {
            /* access modifiers changed from: private */
            public static final Lite1 setMax = new Lite1();
        }

        public static Lite1 setMin() {
            return setMax.setMax;
        }

        public final /* synthetic */ Object get() {
            return new Main();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyme/mapper/ShopMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/Shop;", "Lid/dana/nearbyme/model/ShopModel;", "contactAddressMapper", "Lid/dana/nearbyme/mapper/ContactAddressMapper;", "promoInfoMapper", "Lid/dana/nearbyme/mapper/PromoInfoMapper;", "shopOpenHourListMapper", "Lid/dana/nearbyme/mapper/ShopOpenHourListMapper;", "subcategoriesMapper", "Lid/dana/nearbyme/mapper/MerchantSubcategoriesMapper;", "(Lid/dana/nearbyme/mapper/ContactAddressMapper;Lid/dana/nearbyme/mapper/PromoInfoMapper;Lid/dana/nearbyme/mapper/ShopOpenHourListMapper;Lid/dana/nearbyme/mapper/MerchantSubcategoriesMapper;)V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Lite2 extends setSpeed<GriverConfigUtils, ShopModel> {
        private final k.AnonymousClass9 getMax;
        private final GriverPage getMin;
        private final Main length;
        private final MiniProgramFacade setMin;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object map(java.lang.Object r8) {
            /*
                r7 = this;
                o.GriverConfigUtils r8 = (o.GriverConfigUtils) r8
                java.lang.String r0 = "oldItem"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                id.dana.nearbyme.model.ShopModel r0 = new id.dana.nearbyme.model.ShopModel
                r0.<init>()
                java.lang.String r1 = r8.getBranchName()
                r0.getMin = r1
                java.lang.String r1 = r8.getBrandName()
                r0.setMax = r1
                java.lang.String r1 = r8.getCertStatus()
                r0.getMax = r1
                java.util.List r1 = r8.getContactAddresses()
                r2 = 10
                r3 = 0
                if (r1 == 0) goto L_0x0053
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r2)
                r4.<init>(r5)
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r1 = r1.iterator()
            L_0x0038:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0050
                java.lang.Object r5 = r1.next()
                o.getMacEncrypt r5 = (o.getMacEncrypt) r5
                o.k$9 r6 = r7.getMax
                java.lang.Object r5 = r6.apply(r5)
                id.dana.nearbyme.model.ContactAddressModel r5 = (id.dana.nearbyme.model.ContactAddressModel) r5
                r4.add(r5)
                goto L_0x0038
            L_0x0050:
                java.util.List r4 = (java.util.List) r4
                goto L_0x0054
            L_0x0053:
                r4 = r3
            L_0x0054:
                if (r4 != 0) goto L_0x005a
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L_0x005a:
                r0.setMin = r4
                double r4 = r8.getDistance()
                r0.toFloatRange = r4
                java.lang.String r1 = r8.getExternalShopId()
                r0.toIntRange = r1
                java.util.Map r1 = r8.getExtInfo()
                r0.equals = r1
                boolean r1 = r8.getFullDay()
                r0.isInside = r1
                boolean r1 = r8.getHasMoreShop()
                r0.extraCallback = r1
                java.lang.String r1 = r8.getInstId()
                r0.toDoubleRange = r1
                double r4 = r8.getLatitude()
                r0.values = r4
                java.lang.String r1 = r8.getLogoUrl()
                r0.hashCode = r1
                java.util.Map r1 = r8.getLogoUrlMap()
                r0.FastBitmap$CoordinateSystem = r1
                double r4 = r8.getLongtitude()
                r0.toString = r4
                java.lang.String r1 = r8.getMainName()
                r0.invoke = r1
                java.util.List r1 = r8.getMccCodes()
                r0.valueOf = r1
                java.lang.String r1 = r8.getMerchantId()
                r0.Grayscale$Algorithm = r1
                java.lang.String r1 = r8.getMerchantName()
                r0.length((java.lang.String) r1)
                java.lang.String r1 = r8.getMerchantSizeType()
                r0.invokeSuspend = r1
                java.util.List r1 = r8.getPromoInfos()
                if (r1 == 0) goto L_0x00e9
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r2)
                r4.<init>(r2)
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r1 = r1.iterator()
            L_0x00ce:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00e6
                java.lang.Object r2 = r1.next()
                o.FileCache$1 r2 = (o.FileCache.AnonymousClass1) r2
                o.GriverPage r5 = r7.getMin
                java.lang.Object r2 = r5.apply(r2)
                id.dana.nearbyme.model.PromoInfoModel r2 = (id.dana.nearbyme.model.PromoInfoModel) r2
                r4.add(r2)
                goto L_0x00ce
            L_0x00e6:
                java.util.List r4 = (java.util.List) r4
                goto L_0x00ea
            L_0x00e9:
                r4 = r3
            L_0x00ea:
                if (r4 != 0) goto L_0x00f0
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L_0x00f0:
                r0.length((java.util.List<id.dana.nearbyme.model.PromoInfoModel>) r4)
                double r1 = r8.getRating()
                r0.create = r1
                java.lang.String r1 = r8.getRegisterSource()
                r0.getCause = r1
                double r1 = r8.getReviewNumbers()
                r0.onNavigationEvent = r1
                java.lang.String r1 = r8.getShopDesc()
                r0.ICustomTabsCallback = r1
                java.lang.String r1 = r8.getShopId()
                r0.b = r1
                java.util.List r1 = r8.getShopOpenHours()
                if (r1 == 0) goto L_0x0120
                o.GriverBaseActivity$Main r2 = r7.length
                java.lang.Object r1 = r2.apply(r1)
                r3 = r1
                java.util.List r3 = (java.util.List) r3
            L_0x0120:
                if (r3 != 0) goto L_0x0126
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0126:
                r0.getMax(r3)
                id.dana.domain.nearbyme.model.MerchantStatusEnum r1 = r8.getShopStatus()
                r0.onRelationshipValidationResult = r1
                java.lang.String r1 = r8.getShopType()
                r0.onPostMessage = r1
                o.MiniProgramFacade r1 = r7.setMin
                java.util.List r2 = r8.getSubcategories()
                java.lang.Object r1 = r1.apply(r2)
                java.util.List r1 = (java.util.List) r1
                r0.extraCallbackWithResult = r1
                java.lang.Long r8 = r8.getTransactionDate()
                r0.onTransact = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.GriverBaseActivity.Lite2.map(java.lang.Object):java.lang.Object");
        }

        @Inject
        public Lite2(@NotNull k.AnonymousClass9 r2, @NotNull GriverPage griverPage, @NotNull Main main, @NotNull MiniProgramFacade miniProgramFacade) {
            Intrinsics.checkNotNullParameter(r2, "contactAddressMapper");
            Intrinsics.checkNotNullParameter(griverPage, "promoInfoMapper");
            Intrinsics.checkNotNullParameter(main, "shopOpenHourListMapper");
            Intrinsics.checkNotNullParameter(miniProgramFacade, "subcategoriesMapper");
            this.getMax = r2;
            this.getMin = griverPage;
            this.length = main;
            this.setMin = miniProgramFacade;
        }
    }

    public final class Lite3 implements getAdapterPosition<Lite2> {
        private final b.C0007b<MiniProgramFacade> getMin;
        private final b.C0007b<Main> length;
        private final b.C0007b<k.AnonymousClass9> setMax;
        private final b.C0007b<GriverPage> setMin;

        private Lite3(b.C0007b<k.AnonymousClass9> bVar, b.C0007b<GriverPage> bVar2, b.C0007b<Main> bVar3, b.C0007b<MiniProgramFacade> bVar4) {
            this.setMax = bVar;
            this.setMin = bVar2;
            this.length = bVar3;
            this.getMin = bVar4;
        }

        public static Lite3 setMin(b.C0007b<k.AnonymousClass9> bVar, b.C0007b<GriverPage> bVar2, b.C0007b<Main> bVar3, b.C0007b<MiniProgramFacade> bVar4) {
            return new Lite3(bVar, bVar2, bVar3, bVar4);
        }

        public final /* synthetic */ Object get() {
            return new Lite2(this.setMax.get(), this.setMin.get(), this.length.get(), this.getMin.get());
        }
    }

    public final /* synthetic */ Object map(Object obj) {
        getCachePath getcachepath = (getCachePath) obj;
        Intrinsics.checkNotNullParameter(getcachepath, "oldItem");
        return new InternalApiBridgeExtension(length(getcachepath.getShops()), getcachepath.getHasMore(), getcachepath.getPromoFlag());
    }

    @Inject
    public GriverBaseActivity(@NotNull Main main, @NotNull k.AnonymousClass9 r3, @NotNull GriverPage griverPage, @NotNull MiniProgramFacade miniProgramFacade) {
        Intrinsics.checkNotNullParameter(main, "shopOpenHourListMapper");
        Intrinsics.checkNotNullParameter(r3, "contactAddressMapper");
        Intrinsics.checkNotNullParameter(griverPage, "promoInfosMapper");
        Intrinsics.checkNotNullParameter(miniProgramFacade, "merchantSubcategoriesMapper");
        this.setMax = main;
        this.setMin = r3;
        this.getMax = griverPage;
        this.length = miniProgramFacade;
    }

    private final List<ShopModel> length(List<GriverConfigUtils> list) {
        List<ContactAddressModel> list2;
        ArrayList arrayList = new ArrayList();
        for (GriverConfigUtils griverConfigUtils : list) {
            ShopModel shopModel = new ShopModel();
            shopModel.getMin = griverConfigUtils.getBranchName();
            shopModel.setMax = griverConfigUtils.getBrandName();
            shopModel.extraCallbackWithResult = MiniProgramFacade.setMin(griverConfigUtils.getSubcategories());
            List<getWebSetting> shopOpenHours = griverConfigUtils.getShopOpenHours();
            List list3 = null;
            List list4 = shopOpenHours != null ? (List) this.setMax.apply(shopOpenHours) : null;
            if (list4 == null) {
                list4 = CollectionsKt.emptyList();
            }
            shopModel.getMax(list4);
            shopModel.getMax = griverConfigUtils.getCertStatus();
            List<getMacEncrypt> contactAddresses = griverConfigUtils.getContactAddresses();
            if (contactAddresses != null) {
                Iterable<getMacEncrypt> iterable = contactAddresses;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (getMacEncrypt apply : iterable) {
                    arrayList2.add((ContactAddressModel) this.setMin.apply(apply));
                }
                list2 = (List) arrayList2;
            } else {
                list2 = null;
            }
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            shopModel.setMin = list2;
            shopModel.toFloatRange = griverConfigUtils.getDistance();
            shopModel.toIntRange = griverConfigUtils.getExternalShopId();
            shopModel.equals = griverConfigUtils.getExtInfo();
            shopModel.isInside = griverConfigUtils.getFullDay();
            shopModel.toDoubleRange = griverConfigUtils.getInstId();
            shopModel.values = griverConfigUtils.getLatitude();
            shopModel.hashCode = griverConfigUtils.getLogoUrl();
            shopModel.FastBitmap$CoordinateSystem = griverConfigUtils.getLogoUrlMap();
            shopModel.toString = griverConfigUtils.getLongtitude();
            shopModel.invoke = griverConfigUtils.getMainName();
            shopModel.valueOf = griverConfigUtils.getMccCodes();
            shopModel.Grayscale$Algorithm = griverConfigUtils.getMerchantId();
            shopModel.length(griverConfigUtils.getMerchantName());
            shopModel.invokeSuspend = griverConfigUtils.getMerchantSizeType();
            List<FileCache.AnonymousClass1> promoInfos = griverConfigUtils.getPromoInfos();
            if (promoInfos != null) {
                Iterable<FileCache.AnonymousClass1> iterable2 = promoInfos;
                Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                for (FileCache.AnonymousClass1 apply2 : iterable2) {
                    arrayList3.add((PromoInfoModel) this.getMax.apply(apply2));
                }
                list3 = (List) arrayList3;
            }
            if (list3 == null) {
                list3 = CollectionsKt.emptyList();
            }
            shopModel.length((List<PromoInfoModel>) list3);
            double round = (double) Math.round(griverConfigUtils.getRating() * 10.0d);
            Double.isNaN(round);
            shopModel.create = round / 10.0d;
            shopModel.getCause = griverConfigUtils.getRegisterSource();
            shopModel.onNavigationEvent = griverConfigUtils.getReviewNumbers();
            shopModel.ICustomTabsCallback = griverConfigUtils.getShopDesc();
            shopModel.b = griverConfigUtils.getShopId();
            shopModel.onRelationshipValidationResult = griverConfigUtils.getShopStatus();
            shopModel.onPostMessage = griverConfigUtils.getShopType();
            shopModel.IsOverlapping = griverConfigUtils.getOfficeNumbers();
            Unit unit = Unit.INSTANCE;
            arrayList.add(shopModel);
        }
        return arrayList;
    }
}
