package id.dana.nearbyme.merchantreview;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.util.media.MimeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidWebView;
import o.CornerMarkingDataProvider;
import o.IntRange;
import o.f;
import o.resetInternal;
import o.startBeaconDiscovery;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002,-B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001f\"\u00020\u001cH\u0002¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0010H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0016\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020\u0010H\u0002J\u000e\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\fJ\b\u0010+\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewPhotosView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lid/dana/nearbyme/merchantreview/adapter/MerchantReviewPhotosAdapter;", "listener", "Lid/dana/nearbyme/merchantreview/MerchantReviewPhotosView$PhotosViewInteraction;", "outputFileUri", "Landroid/net/Uri;", "activityForResult", "", "data", "Landroid/content/Intent;", "addItemsToAdapter", "items", "", "checkForPermission", "createCameraIntent", "", "createGalleryIntent", "getLayout", "getPhotos", "", "getRequiredPermissions", "permissions", "", "([Ljava/lang/String;)Ljava/util/List;", "initRecyclerView", "isCameraData", "", "onRequestPermissionResult", "requestCode", "grantResults", "", "openImageIntent", "setListener", "sentListener", "setup", "Companion", "PhotosViewInteraction", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantReviewPhotosView extends BaseRichView {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    public static final int MAX_PHOTO_COUNT = 10;
    public static final int PERMISSION_REQUEST = 1002;
    private HashMap getMax;
    private Uri length;
    /* access modifiers changed from: private */
    public setMax setMax;
    /* access modifiers changed from: private */
    public AndroidWebView.b setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001b\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0002\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewPhotosView$PhotosViewInteraction;", "", "onAddPhotoClick", "", "startImageIntent", "intent", "Landroid/content/Intent;", "startRequestPermission", "requiredPermission", "", "", "([Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMin(@NotNull Intent intent);

        void setMax(@NotNull String[] strArr);

        void setMin();
    }

    @JvmOverloads
    public MerchantReviewPhotosView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_review_photo;
    }

    public static final /* synthetic */ AndroidWebView.b access$getAdapter$p(MerchantReviewPhotosView merchantReviewPhotosView) {
        AndroidWebView.b bVar = merchantReviewPhotosView.setMin;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return bVar;
    }

    public static final /* synthetic */ setMax access$getListener$p(MerchantReviewPhotosView merchantReviewPhotosView) {
        setMax setmax = merchantReviewPhotosView.setMax;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return setmax;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantReviewPhotosView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantReviewPhotosView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ MerchantReviewPhotosView getMax;

        setMin(MerchantReviewPhotosView merchantReviewPhotosView) {
            this.getMax = merchantReviewPhotosView;
        }

        public final void onClick(View view) {
            if (MerchantReviewPhotosView.access$getAdapter$p(this.getMax).getItemCount() < 10) {
                MerchantReviewPhotosView.access$getListener$p(this.getMax).setMin();
            }
        }
    }

    @NotNull
    public final List<String> getPhotos() {
        List<String> list;
        AndroidWebView.b bVar = this.setMin;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        List max = bVar.getMax();
        if (max != null) {
            Iterable<Uri> iterable = max;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Uri obj : iterable) {
                arrayList.add(obj.toString());
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final void setListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "sentListener");
        this.setMax = setmax;
    }

    public final void activityForResult(@Nullable Intent intent) {
        Uri data;
        ClipData clipData;
        List arrayList = new ArrayList();
        if (getMin(intent)) {
            Uri uri = this.length;
            if (uri != null) {
                arrayList.add(uri);
            }
        } else if (intent != null && (clipData = intent.getClipData()) != null) {
            Intrinsics.checkNotNullExpressionValue(clipData, "it");
            arrayList.addAll(f.AnonymousClass5.setMax(clipData));
        } else if (!(intent == null || (data = intent.getData()) == null)) {
            Intrinsics.checkNotNullExpressionValue(data, "it");
            arrayList.add(data);
        }
        AndroidWebView.b bVar = this.setMin;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        int itemCount = 10 - bVar.getItemCount();
        AndroidWebView.b bVar2 = this.setMin;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        bVar2.length(CollectionsKt.take(arrayList, itemCount));
    }

    public final void onRequestPermissionResult(int i, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (i == 1002) {
            int length2 = iArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (iArr[i2] != 0) {
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                setMax();
            }
        }
    }

    private static boolean getMin(Intent intent) {
        if (intent == null) {
            return true;
        }
        if (intent.getAction() == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) "android.media.action.IMAGE_CAPTURE", (Object) intent.getAction());
    }

    public final void checkForPermission() {
        List list;
        String[] strArr = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"};
        Context context = getContext();
        if (context != null) {
            list = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                if (IntRange.length(context, str) != 0) {
                    list.add(str);
                }
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Collection collection = list;
        if (!(!collection.isEmpty()) || !CornerMarkingDataProvider.IsOverlapping()) {
            setMax();
            return;
        }
        setMax setmax = this.setMax;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        Object[] array = collection.toArray(new String[0]);
        if (array != null) {
            setmax.setMax((String[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final void setMax() {
        Context context = getContext();
        this.length = context != null ? startBeaconDiscovery.getMin(context) : null;
        List<Intent> min = setMin();
        Intent createChooser = Intent.createChooser(length(), getContext().getString(R.string.rating_submit_photos_intent_title));
        Object[] array = min.toArray(new Intent[0]);
        if (array != null) {
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
            setMax setmax = this.setMax;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            Intrinsics.checkNotNullExpressionValue(createChooser, "chooserIntent");
            setmax.getMin(createChooser);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private static Intent length() {
        Intent intent = new Intent();
        intent.setType(MimeType.IMAGE_ALL);
        String[] strArr = {MimeType.IMAGE_ALL};
        intent.setAction("android.intent.action.PICK");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r2 = r2.getPackageManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<android.content.Intent> setMin() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r2)
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto L_0x0020
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 == 0) goto L_0x0020
            r3 = 0
            java.util.List r2 = r2.queryIntentActivities(r1, r3)
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0058
            java.util.Iterator r2 = r2.iterator()
        L_0x0027:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r2.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            java.lang.String r4 = r4.packageName
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1)
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.name
            r6.<init>(r4, r3)
            r5.setComponent(r6)
            r5.setPackage(r4)
            android.net.Uri r3 = r7.length
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            java.lang.String r4 = "output"
            r5.putExtra(r4, r3)
            r0.add(r5)
            goto L_0x0027
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantreview.MerchantReviewPhotosView.setMin():java.util.List");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewPhotosView$Companion;", "", "()V", "MAX_PHOTO_COUNT", "", "PERMISSION_REQUEST", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void setup() {
        AndroidWebView.b bVar = new AndroidWebView.b();
        this.setMin = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        bVar.getMin(new ArrayList());
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setTextClassifier);
        if (recyclerView != null) {
            AndroidWebView.b bVar2 = this.setMin;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            recyclerView.setAdapter(bVar2);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        }
        CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.suggest);
        if (cardView != null) {
            cardView.setOnClickListener(new setMin(this));
        }
    }
}
