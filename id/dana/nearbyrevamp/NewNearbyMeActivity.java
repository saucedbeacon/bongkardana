package id.dana.nearbyrevamp;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.LockableBaseBottomSheetBehavior;
import id.dana.di.modules.MerchantDetailModule;
import id.dana.di.modules.MerchantModule;
import id.dana.di.modules.NearbyMeModule;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.di.module.PhotoGalleryModule;
import id.dana.nearbyme.enums.SearchType;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantdetail.MerchantDetailView;
import id.dana.nearbyrevamp.merchantdetail.bottomsheet.MerchantDetailBottomsheetView;
import id.dana.nearbyrevamp.merchantfilter.MerchantFilterView;
import id.dana.nearbyrevamp.merchantlist.NewMerchantListView;
import id.dana.nearbyrevamp.otherstore.OtherStoreResultView;
import id.dana.nearbyrevamp.search.NearbySearchFragment;
import id.dana.nearbyrevamp.view.NearbySearchToolbar;
import id.dana.richview.PinMapLottieAnimationView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppCompatActivity;
import o.BaseStoragePackage;
import o.BlurProcess;
import o.CascadingMenuPopup$HorizPosition;
import o.CornerMarkingDataProvider;
import o.GetAboutInfoResult;
import o.GriverBaseFragment;
import o.GriverCommonResourceProxy;
import o.GriverDefaultLoadingView;
import o.GriverDefaultOpenSettingExtension;
import o.GriverProgressBar;
import o.GriverTransActivity;
import o.IntRange;
import o.PrepareException;
import o.R;
import o.RedDotDrawable;
import o.TinyAppActionStateManager;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.a;
import o.appendAppLog;
import o.customizeWebViewSettings;
import o.dispatchOnCancelled;
import o.g;
import o.getAppIdList;
import o.getBluetoothAdapterState;
import o.getCreateDate;
import o.getCreateTime;
import o.getOpenHelper;
import o.negativeListener;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onMeasure;
import o.onRestoreInstanceState;
import o.p;
import o.resetInternal;
import o.setColorFilter;
import o.setMiniAbout;
import o.setOnWheelViewListener;
import o.setStateOn;
import o.setTextSpacing;
import o.stopIgnoring;
import o.t;
import o.uploadCoreByStartService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010!\n\u0002\b8*\u0004\u0001\u0001\u0018\u0000 ù\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006ù\u0001ú\u0001û\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\u0016\u0010k\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0mH\u0002J\u0016\u0010n\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0mH\u0002J\b\u0010o\u001a\u00020hH\u0002J\b\u0010p\u001a\u00020hH\u0002J\b\u0010q\u001a\u00020hH\u0002J\b\u0010r\u001a\u00020hH\u0002J\b\u0010s\u001a\u00020hH\u0002J\b\u0010t\u001a\u00020hH\u0002J\b\u0010u\u001a\u00020hH\u0002J\b\u0010v\u001a\u00020\fH\u0002J\u0018\u0010w\u001a\n \u0010*\u0004\u0018\u00010x0x2\u0006\u0010y\u001a\u00020jH\u0002J\b\u0010z\u001a\u00020\fH\u0016J\b\u0010{\u001a\u00020|H\u0002J\b\u0010}\u001a\u00020\bH\u0002J\b\u0010~\u001a\u00020H\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\u0010\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0003\u0010\u0001J\t\u0010\u0001\u001a\u00020hH\u0002J\u001a\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0003\u0010\u0001J\u0014\u0010\u0001\u001a\u0004\u0018\u00010\b2\u0007\u0010\u0001\u001a\u00020\bH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0011\u0010\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\u0019\u0010\u0001\u001a\n \u0010*\u0004\u0018\u00010x0x2\u0006\u0010y\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020\nH\u0002J\u0011\u0010\u0001\u001a\u00020\n2\u0006\u0010i\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020\nH\u0002J\u001a\u0010\u0001\u001a\u00020h2\u0007\u0010\u0001\u001a\u00020\u00162\u0006\u0010i\u001a\u00020jH\u0002J\u0011\u0010\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\u0011\u0010\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J'\u0010 \u0001\u001a\u00020h2\u0007\u0010¡\u0001\u001a\u00020\f2\u0007\u0010¢\u0001\u001a\u00020\f2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0014J\t\u0010¥\u0001\u001a\u00020hH\u0016J\t\u0010¦\u0001\u001a\u00020hH\u0002J\t\u0010§\u0001\u001a\u00020hH\u0002J\t\u0010¨\u0001\u001a\u00020hH\u0014J\t\u0010©\u0001\u001a\u00020hH\u0002J\t\u0010ª\u0001\u001a\u00020hH\u0002J\u0015\u0010«\u0001\u001a\u00020h2\n\u0010¬\u0001\u001a\u0005\u0018\u00010­\u0001H\u0002J\u0014\u0010®\u0001\u001a\u00020h2\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010°\u0001\u001a\u00020h2\n\u0010±\u0001\u001a\u0005\u0018\u00010²\u0001H\u0016J\u0012\u0010³\u0001\u001a\u00020\n2\u0007\u0010´\u0001\u001a\u00020\u0016H\u0002J\t\u0010µ\u0001\u001a\u00020hH\u0002J4\u0010¶\u0001\u001a\u00020h2\u0007\u0010¡\u0001\u001a\u00020\f2\u0010\u0010·\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0¸\u00012\b\u0010¹\u0001\u001a\u00030º\u0001H\u0016¢\u0006\u0003\u0010»\u0001J\t\u0010¼\u0001\u001a\u00020hH\u0014J\t\u0010½\u0001\u001a\u00020hH\u0002J\t\u0010¾\u0001\u001a\u00020hH\u0002J\u0011\u0010¿\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\t\u0010À\u0001\u001a\u00020hH\u0002J\t\u0010Á\u0001\u001a\u00020hH\u0002J\u0017\u0010Â\u0001\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0mH\u0002J!\u0010Ã\u0001\u001a\u00020h2\r\u0010i\u001a\t\u0012\u0004\u0012\u00020j0Ä\u00012\u0007\u0010Å\u0001\u001a\u00020\nH\u0002J\u0017\u0010Æ\u0001\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0mH\u0002J\t\u0010Ç\u0001\u001a\u00020hH\u0002J\u001b\u0010È\u0001\u001a\u00020h2\u0007\u0010É\u0001\u001a\u00020\b2\u0007\u0010Ê\u0001\u001a\u00020\bH\u0002J\t\u0010Ë\u0001\u001a\u00020hH\u0002J\t\u0010Ì\u0001\u001a\u00020hH\u0002J\t\u0010Í\u0001\u001a\u00020hH\u0002J\t\u0010Î\u0001\u001a\u00020hH\u0002J\u0012\u0010Ï\u0001\u001a\u00020h2\u0007\u0010¯\u0001\u001a\u00020\u000fH\u0002J\t\u0010Ð\u0001\u001a\u00020hH\u0002J\u0012\u0010Ñ\u0001\u001a\u00020h2\u0007\u0010Ò\u0001\u001a\u00020\nH\u0002J\u0014\u0010Ó\u0001\u001a\u00020h2\t\b\u0001\u0010Ô\u0001\u001a\u00020\fH\u0002J\t\u0010Õ\u0001\u001a\u00020hH\u0002J\u0012\u0010Ö\u0001\u001a\u00020h2\u0007\u0010Ò\u0001\u001a\u00020\nH\u0002J\u0012\u0010×\u0001\u001a\u00020h2\u0007\u0010Ø\u0001\u001a\u00020\nH\u0002J\t\u0010Ù\u0001\u001a\u00020hH\u0002J\t\u0010Ú\u0001\u001a\u00020hH\u0002J\u0019\u0010Û\u0001\u001a\u00020h2\u000e\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020j0Ä\u0001H\u0002J \u0010Ý\u0001\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0m2\u0007\u0010Å\u0001\u001a\u00020\nH\u0002J\t\u0010Þ\u0001\u001a\u00020hH\u0002J\t\u0010ß\u0001\u001a\u00020hH\u0002J\t\u0010à\u0001\u001a\u00020hH\u0002J\t\u0010á\u0001\u001a\u00020hH\u0002J\t\u0010â\u0001\u001a\u00020hH\u0002J\t\u0010ã\u0001\u001a\u00020hH\u0002J\t\u0010ä\u0001\u001a\u00020hH\u0002J\u0019\u0010å\u0001\u001a\u00020h2\u000e\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020j0Ä\u0001H\u0002J\t\u0010æ\u0001\u001a\u00020hH\u0002J \u0010ç\u0001\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0m2\u0007\u0010Å\u0001\u001a\u00020\nH\u0002J\t\u0010è\u0001\u001a\u00020hH\u0002J\t\u0010é\u0001\u001a\u00020hH\u0002J\t\u0010ê\u0001\u001a\u00020\nH\u0002J\t\u0010ë\u0001\u001a\u00020hH\u0002J\t\u0010ì\u0001\u001a\u00020hH\u0002J\u0011\u0010í\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\u0011\u0010î\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\u0012\u0010ï\u0001\u001a\u00020h2\u0007\u0010ð\u0001\u001a\u00020\nH\u0002J\t\u0010ñ\u0001\u001a\u00020hH\u0002J\u0012\u0010ò\u0001\u001a\u00020h2\u0007\u0010ð\u0001\u001a\u00020\nH\u0002J\t\u0010ó\u0001\u001a\u00020hH\u0002J\u0011\u0010ô\u0001\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0016J\u0012\u0010õ\u0001\u001a\u00020h2\u0007\u0010ö\u0001\u001a\u00020\bH\u0002J\u0017\u0010÷\u0001\u001a\u00020h2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020j0mH\u0002J\t\u0010ø\u0001\u001a\u00020hH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R#\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u0004\u0018\u00010$8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b%\u0010&R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R)\u0010:\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010<0<0;8BX\u0002¢\u0006\f\n\u0004\b?\u0010\u001f\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010<0<0;8BX\u0002¢\u0006\f\n\u0004\bB\u0010\u001f\u001a\u0004\bA\u0010>R\u0010\u0010C\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010D\u001a\u00020E8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u00020K8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010Y\u001a\u00020X2\u0006\u0010W\u001a\u00020X@BX\u000e¢\u0006\b\n\u0000\"\u0004\bZ\u0010[R*\u0010\\\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160]j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016`^X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010_\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\bb\u0010\u001f\u001a\u0004\b`\u0010aR\u001b\u0010c\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\be\u0010\u001f\u001a\u0004\bd\u0010aR\u0010\u0010f\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006ü\u0001"}, d2 = {"Lid/dana/nearbyrevamp/NewNearbyMeActivity;", "Lid/dana/base/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "()V", "avatarDrawable", "Landroid/graphics/drawable/Drawable;", "avatarUrl", "", "boundCameraWithUserLocation", "", "cameraMovementGestureSource", "", "counterGetLocation", "currentLocation", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "currentMapState", "Lid/dana/nearbyrevamp/NewNearbyMeActivity$MapState;", "currentSearchedLocation", "highlightedAndNormalPair", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/Marker;", "highlightedShop", "Lid/dana/nearbyme/model/HighlightedShopModel;", "isFromRadius", "locationPermission", "Lid/dana/utils/permission/Permission;", "getLocationPermission", "()Lid/dana/utils/permission/Permission;", "locationPermission$delegate", "Lkotlin/Lazy;", "locationSettingDisposable", "Lio/reactivex/disposables/Disposable;", "locationUpdateDisposable", "mapFragment", "Lid/dana/nearbyme/DanaMapFragment;", "getMapFragment", "()Lid/dana/nearbyme/DanaMapFragment;", "mapFragment$delegate", "mapHelper", "Lid/dana/utils/MapHelper;", "getMapHelper", "()Lid/dana/utils/MapHelper;", "setMapHelper", "(Lid/dana/utils/MapHelper;)V", "merchantCategoryPresenter", "Lid/dana/nearbyme/MerchantContract$Presenter;", "getMerchantCategoryPresenter", "()Lid/dana/nearbyme/MerchantContract$Presenter;", "setMerchantCategoryPresenter", "(Lid/dana/nearbyme/MerchantContract$Presenter;)V", "merchantDetailPresenter", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;", "getMerchantDetailPresenter", "()Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;", "setMerchantDetailPresenter", "(Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;)V", "merchantListBottomsheet", "Lid/dana/base/LockableBaseBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "getMerchantListBottomsheet", "()Lid/dana/base/LockableBaseBottomSheetBehavior;", "merchantListBottomsheet$delegate", "merchantOtherStoreBottomsheet", "getMerchantOtherStoreBottomsheet", "merchantOtherStoreBottomsheet$delegate", "myLocationMarker", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "nearbyPresenter", "Lid/dana/contract/nearbyme/NearbyMeContract$Presenter;", "getNearbyPresenter", "()Lid/dana/contract/nearbyme/NearbyMeContract$Presenter;", "setNearbyPresenter", "(Lid/dana/contract/nearbyme/NearbyMeContract$Presenter;)V", "nearbySource", "photoPreviewPresenter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;", "getPhotoPreviewPresenter", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;", "setPhotoPreviewPresenter", "(Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;)V", "value", "Lid/dana/nearbyrevamp/NewNearbyMeActivity$RefreshCondition;", "refreshCondition", "setRefreshCondition", "(Lid/dana/nearbyrevamp/NewNearbyMeActivity$RefreshCondition;)V", "shopMarkers", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "shouldOpenMerchantDetail", "getShouldOpenMerchantDetail", "()Z", "shouldOpenMerchantDetail$delegate", "shouldOpenOtherStore", "getShouldOpenOtherStore", "shouldOpenOtherStore$delegate", "targetedLocation", "addShopMarker", "", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "addShopMarkersToMap", "shopModels", "", "animateCamera", "checkLocationPermission", "checkMarkerCollision", "checkPreselectedCategory", "clearMarkers", "disposeLocationObserver", "disposeLocationSettingsObserver", "extractNearbyOpenSource", "getHalfExpandedBottomsheetHeight", "getHighlightedShopMarkerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "shop", "getLayout", "getMerchantDetailModule", "Lid/dana/di/modules/MerchantDetailModule;", "getMerchantDetailSource", "getMerchantModule", "Lid/dana/di/modules/MerchantModule;", "getNearbyAutoSearch", "getNearbySearchListener", "id/dana/nearbyrevamp/NewNearbyMeActivity$getNearbySearchListener$1", "()Lid/dana/nearbyrevamp/NewNearbyMeActivity$getNearbySearchListener$1;", "getNearbyShops", "getOnCategoryCheckedListener", "id/dana/nearbyrevamp/NewNearbyMeActivity$getOnCategoryCheckedListener$1", "type", "Lid/dana/domain/merchant/MerchantCategoryType;", "(Lid/dana/domain/merchant/MerchantCategoryType;)Lid/dana/nearbyrevamp/NewNearbyMeActivity$getOnCategoryCheckedListener$1;", "getOneTimeConsumedStringExtra", "name", "getPhotoGalleryModule", "Lid/dana/nearbyme/di/module/PhotoGalleryModule;", "getPreviewImages", "getShopMarkerOptions", "hideCurrentHighlightedAndShowLastNormalMerchant", "hideMerchantDetailPreview", "hideOtherStoreBottomsheet", "init", "initLocationRequest", "initNearbyMe", "injectComponent", "isBottomsheetsExpanded", "isHighlightedShop", "isMerchantListOrDetail", "loadHighlightedShopBitmap", "normalMarker", "loadMerchantDetailBottomsheet", "loadMerchantDetailErrorState", "loadShopMarkerWithShopLogo", "observeMerchantDetailShopModel", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCameraMove", "onCollapseMerchantDetailBottomsheet", "onDestroy", "onExpandMerchantDetailBottomsheet", "onHideMerchantDetailBottomsheet", "onLocationSettingNext", "locationSettingsResult", "Lcom/google/android/gms/location/LocationSettingsResult;", "onLocationUpdate", "location", "onMapReady", "map", "Lcom/google/android/gms/maps/GoogleMap;", "onMarkerClicked", "marker", "onRefreshMerchantClicked", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openMerchantDetailFromNonMaps", "openNearbyExplore", "openOtherStoreBottomsheet", "openOtherStoreFromNonMap", "orderLayout", "populateOtherStoreList", "populateSearchResultData", "", "hasMore", "populateShopMarker", "prepareBundle", "refreshMerchantDetail", "merchantId", "shopId", "resetNearbyShopsData", "resetState", "resetStatusBar", "searchInCurrentArea", "searchNewArea", "searchOtherStoreFromNonMap", "setAnchoredButtonVisibility", "expanded", "setFloatingButtonAnchor", "anchorId", "setFloatingButtonForMerchantDetail", "setGoToMyLocationVisibility", "setMapPadding", "withBottomPadding", "setMyLocation", "setMyLocationMarker", "setShopsListItem", "shops", "setupBottomSheetWithSearchResult", "setupBottomsheetsHeight", "setupMap", "setupMapCamera", "setupMerchantDetailBottomsheet", "setupMerchantFilter", "setupMerchantListBottomsheet", "setupMerchantOtherStoreBottomsheet", "setupMerchantShopListByPassedMerchantId", "setupSearchBarShadow", "setupSearchResult", "setupStatusBar", "setupView", "shouldDisplaySearchHereText", "showLoading", "showLocationRequest", "showMerchantDetailFromOtherStoreList", "showMerchantDetailPreview", "showPinPoint", "show", "showSearchResultBottomsheet", "showToolbar", "trackNearbyOpenEvent", "updatePromoBadge", "updateSearchBar", "title", "updateShopModelInListAndMap", "zoomToMyLocation", "Companion", "MapState", "RefreshCondition", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewNearbyMeActivity extends BaseActivity implements OnMapReadyCallback, GriverBaseFragment {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private Pair<Marker, Marker> FastBitmap$CoordinateSystem = new Pair<>(null, null);
    private final Lazy Grayscale$Algorithm = LazyKt.lazy(new toDoubleRange(this));
    private boolean ICustomTabsCallback = true;
    /* access modifiers changed from: private */
    public Drawable IsOverlapping;
    /* access modifiers changed from: private */
    public RefreshCondition Mean$Arithmetic = RefreshCondition.INIT;
    private final Lazy b = LazyKt.lazy(new newSessionWithExtras(this));
    private final Lazy create = LazyKt.lazy(new toIntRange(this));
    private int equals;
    /* access modifiers changed from: private */
    public Location extraCallback = this.toFloatRange;
    private String getCause = "";
    private GriverProgressBar.UpdateRunnable getMax;
    private GriverProgressBar.UpdateRunnable getMin;
    private LinkedHashMap<String, Marker> hashCode = new LinkedHashMap<>();
    /* access modifiers changed from: private */
    public MapState invoke = MapState.MERCHANT_LIST;
    private final Lazy invokeSuspend = LazyKt.lazy(new toString(this));
    /* access modifiers changed from: private */
    public String isInside;
    @Inject
    public GriverDefaultLoadingView mapHelper;
    @Inject
    public GetAboutInfoResult.getMax merchantCategoryPresenter;
    @Inject
    public GriverTransActivity.Lite1.setMax merchantDetailPresenter;
    @Inject
    public t nearbyAnalyticTracker;
    @Inject
    public setTextSpacing.setMin nearbyPresenter;
    private final Lazy onNavigationEvent = LazyKt.lazy(new newSession(this));
    private HashMap onRelationshipValidationResult;
    @Inject
    public negativeListener.getMax photoPreviewPresenter;
    private Marker setMax;
    private boolean toDoubleRange = true;
    /* access modifiers changed from: private */
    public Location toFloatRange;
    private Location toIntRange;
    /* access modifiers changed from: private */
    public int toString = 2;
    private final Lazy valueOf = LazyKt.lazy(new values(this));
    private customizeWebViewSettings values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyrevamp/NewNearbyMeActivity$MapState;", "", "(Ljava/lang/String;I)V", "MERCHANT_LIST", "MERCHANT_OTHER_STORE", "MERCHANT_DETAIL", "SEARCH_RESULT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum MapState {
        MERCHANT_LIST,
        MERCHANT_OTHER_STORE,
        MERCHANT_DETAIL,
        SEARCH_RESULT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyrevamp/NewNearbyMeActivity$RefreshCondition;", "", "(Ljava/lang/String;I)V", "INIT", "ERROR", "FETCHED", "REFRESHING", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum RefreshCondition {
        INIT,
        ERROR,
        FETCHED,
        REFRESHING
    }

    private final boolean getMin() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-385133556, oncanceled);
            onCancelLoad.getMin(-385133556, oncanceled);
        }
        return ((Boolean) this.onNavigationEvent.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final LockableBaseBottomSheetBehavior<FrameLayout> length() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(2103839071, oncanceled);
            onCancelLoad.getMin(2103839071, oncanceled);
        }
        return (LockableBaseBottomSheetBehavior) this.Grayscale$Algorithm.getValue();
    }

    @JvmStatic
    public static final void openMerchantDetailBottomsheet(@NotNull Context context, @NotNull ShopModel shopModel, @NotNull String str) {
        setMin.setMax(context, shopModel, str);
    }

    @JvmStatic
    public static final void openMerchantDetailBottomsheet(@NotNull Context context, @Nullable String str, @Nullable String str2, @NotNull String str3) {
        setMin.setMax(context, str, str2, str3);
    }

    @JvmStatic
    public static final void openOtherStoreBottomsheet(@NotNull Context context, @Nullable String str, @NotNull String str2) {
        setMin.length(context, str, str2);
    }

    private final boolean setMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1243030678, oncanceled);
            onCancelLoad.getMin(-1243030678, oncanceled);
        }
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.onRelationshipValidationResult;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.onRelationshipValidationResult == null) {
            this.onRelationshipValidationResult = new HashMap();
        }
        View view = (View) this.onRelationshipValidationResult.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.onRelationshipValidationResult.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @JvmDefault
    public final void dismissLoadingDialog() {
    }

    public final int getLayout() {
        return R.layout.activity_new_nearby_me;
    }

    @JvmDefault
    public final void onImageLoaded(@NotNull List<MerchantImageModel> list) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 169809076 == (max = dispatchOnCancelled.getMax(applicationContext, 169809076)))) {
            onCanceled oncanceled = new onCanceled(169809076, max, 512);
            onCancelLoad.setMax(169809076, oncanceled);
            onCancelLoad.getMin(169809076, oncanceled);
        }
        Intrinsics.checkNotNullParameter(list, "images");
    }

    @JvmDefault
    public final void showLoadingDialog() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {
        final /* synthetic */ NewNearbyMeActivity setMax;

        public b(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMax = newNearbyMeActivity;
        }

        public final void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            LockableBaseBottomSheetBehavior access$getMerchantListBottomsheet$p = NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.setMax);
            View _$_findCachedViewById = this.setMax._$_findCachedViewById(resetInternal.setMax.prepare);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "clLocationContainer");
            access$getMerchantListBottomsheet$p.setExpandedOffset(_$_findCachedViewById.getBottom() + ((int) (Resources.getSystem().getDisplayMetrics().density * 8.0f)));
            this.setMax.length().setExpandedOffset(NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.setMax).getExpandedOffset());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onCameraMoveStarted", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMapCamera$1$3"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback implements GoogleMap.OnCameraMoveStartedListener {
        final /* synthetic */ NewNearbyMeActivity getMin;

        ICustomTabsCallback(NewNearbyMeActivity newNearbyMeActivity) {
            this.getMin = newNearbyMeActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/ShopModel;", "invoke", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantOtherStoreBottomsheet$2$3"}, k = 3, mv = {1, 4, 2})
        static final class Default extends Lambda implements Function1<ShopModel, Unit> {
            final /* synthetic */ NewNearbyMeActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Default(NewNearbyMeActivity newNearbyMeActivity) {
                super(1);
                this.this$0 = newNearbyMeActivity;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ShopModel) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ShopModel shopModel) {
                Intrinsics.checkNotNullParameter(shopModel, "it");
                this.this$0.invoke = MapState.MERCHANT_OTHER_STORE;
                NewNearbyMeActivity.access$showMerchantDetailFromOtherStoreList(this.this$0, shopModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "shopModels", "", "Lid/dana/nearbyme/model/ShopModel;", "invoke", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantOtherStoreBottomsheet$2$1"}, k = 3, mv = {1, 4, 2})
        static final class Stub extends Lambda implements Function1<List<? extends ShopModel>, Unit> {
            final /* synthetic */ NewNearbyMeActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Stub(NewNearbyMeActivity newNearbyMeActivity) {
                super(1);
                this.this$0 = newNearbyMeActivity;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends ShopModel>) (List) obj);
                return Unit.INSTANCE;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            static final class Proxy implements View.OnClickListener {
                final /* synthetic */ NewNearbyMeActivity setMin;

                Proxy(NewNearbyMeActivity newNearbyMeActivity) {
                    this.setMin = newNearbyMeActivity;
                }

                public final void onClick(View view) {
                    Stub.super.onBackPressed();
                }
            }

            public final void invoke(@NotNull List<? extends ShopModel> list) {
                Intrinsics.checkNotNullParameter(list, "shopModels");
                this.this$0.invoke = MapState.MERCHANT_OTHER_STORE;
                if (!getOpenHelper.getMax(this.this$0.length())) {
                    NewNearbyMeActivity.access$populateOtherStoreList(this.this$0, list);
                    NewNearbyMeActivity newNearbyMeActivity = this.this$0;
                    String str = ((ShopModel) CollectionsKt.first(list)).asInterface;
                    Intrinsics.checkNotNullExpressionValue(str, "shopModels.first().merchantName");
                    NewNearbyMeActivity.access$updateSearchBar(newNearbyMeActivity, str);
                }
            }
        }

        public final void onCameraMoveStarted(int i) {
            this.getMin.toString = i;
            PinMapLottieAnimationView pinMapLottieAnimationView = (PinMapLottieAnimationView) this.getMin._$_findCachedViewById(resetInternal.setMax.dispatchPresenterUpdate);
            if (pinMapLottieAnimationView != null) {
                View view = pinMapLottieAnimationView;
                int i2 = 0;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                Intrinsics.checkNotNullParameter(view, "<this>");
                if (!z) {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/ShopModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class extraCallback extends Lambda implements Function1<ShopModel, Unit> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        extraCallback(NewNearbyMeActivity newNearbyMeActivity) {
            super(1);
            this.this$0 = newNearbyMeActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ShopModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ShopModel shopModel) {
            CascadingMenuPopup$HorizPosition<ShopModel> shopModelLiveData;
            Intrinsics.checkNotNullParameter(shopModel, "it");
            this.this$0.onNavigationEvent();
            MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) this.this$0._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (!(merchantDetailBottomsheetView == null || (shopModelLiveData = merchantDetailBottomsheetView.getShopModelLiveData()) == null)) {
                shopModelLiveData.getMax(shopModel);
            }
            NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.this$0).getMin = true;
            MerchantDetailBottomsheetView merchantDetailBottomsheetView2 = (MerchantDetailBottomsheetView) this.this$0._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView2 != null) {
                merchantDetailBottomsheetView2.showMerchantDetailFromList(shopModel);
            }
            NewNearbyMeActivity.access$getPreviewImages(this.this$0, shopModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/ShopModel;", "invoke", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantDetailBottomsheet$2$1"}, k = 3, mv = {1, 4, 2})
    static final class extraCallbackWithResult extends Lambda implements Function1<ShopModel, Unit> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(NewNearbyMeActivity newNearbyMeActivity) {
            super(1);
            this.this$0 = newNearbyMeActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ShopModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "it");
            NewNearbyMeActivity.access$openOtherStoreBottomsheet(this.this$0, shopModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/google/android/gms/location/LocationSettingsResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class extraCommand extends FunctionReferenceImpl implements Function1<LocationSettingsResult, Unit> {
        extraCommand(NewNearbyMeActivity newNearbyMeActivity) {
            super(1, newNearbyMeActivity, NewNearbyMeActivity.class, "onLocationSettingNext", "onLocationSettingNext(Lcom/google/android/gms/location/LocationSettingsResult;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LocationSettingsResult) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable LocationSettingsResult locationSettingsResult) {
            NewNearbyMeActivity.access$onLocationSettingNext((NewNearbyMeActivity) this.receiver, locationSettingsResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/google/android/gms/maps/model/Marker;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class invoke extends FunctionReferenceImpl implements Function1<Marker, Boolean> {
        invoke(NewNearbyMeActivity newNearbyMeActivity) {
            super(1, newNearbyMeActivity, NewNearbyMeActivity.class, "onMarkerClicked", "onMarkerClicked(Lcom/google/android/gms/maps/model/Marker;)Z", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Marker) obj));
        }

        public final boolean invoke(@NotNull Marker marker) {
            Intrinsics.checkNotNullParameter(marker, "p1");
            return ((NewNearbyMeActivity) this.receiver).setMin(marker);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantDetailBottomsheet$1$2"}, k = 3, mv = {1, 4, 2})
    static final class onMessageChannelReady extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(NewNearbyMeActivity newNearbyMeActivity) {
            super(1);
            this.this$0 = newNearbyMeActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMax(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/location/Location;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toFloatRange extends FunctionReferenceImpl implements Function1<Location, Unit> {
        toFloatRange(NewNearbyMeActivity newNearbyMeActivity) {
            super(1, newNearbyMeActivity, NewNearbyMeActivity.class, "onLocationUpdate", "onLocationUpdate(Landroid/location/Location;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Location location) {
            NewNearbyMeActivity.access$onLocationUpdate((NewNearbyMeActivity) this.receiver, location);
        }
    }

    public NewNearbyMeActivity() {
        Location location = new Location("");
        location.setLatitude(-6.17476d);
        location.setLongitude(106.827072d);
        this.toFloatRange = location;
    }

    public static final /* synthetic */ void access$onCameraMove(NewNearbyMeActivity newNearbyMeActivity) {
        MerchantDetailBottomsheetView merchantDetailBottomsheetView;
        int length2;
        Context baseContext = newNearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-2091737523, oncanceled);
            onCancelLoad.getMin(-2091737523, oncanceled);
        }
        newNearbyMeActivity.getMax(!newNearbyMeActivity.Mean$Arithmetic());
        GriverDefaultLoadingView griverDefaultLoadingView = newNearbyMeActivity.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        Marker marker = newNearbyMeActivity.setMax;
        if (marker != null) {
            float f = griverDefaultLoadingView.setMax != null ? griverDefaultLoadingView.setMax.getCameraPosition().zoom / 30.0f : 0.0f;
            marker.setAnchor(f, f);
        }
        if (newNearbyMeActivity.toString == 1 && (merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu)) != null && !merchantDetailBottomsheetView.isShowing()) {
            PinMapLottieAnimationView pinMapLottieAnimationView = (PinMapLottieAnimationView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.dispatchPresenterUpdate);
            if (pinMapLottieAnimationView != null) {
                pinMapLottieAnimationView.pullOutPinMap();
            }
            newNearbyMeActivity.setMax(RefreshCondition.ERROR);
        }
    }

    public static final /* synthetic */ void access$onLocationUpdate(NewNearbyMeActivity newNearbyMeActivity, Location location) {
        int length2;
        int min;
        Context baseContext = newNearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1825348837, oncanceled);
            onCancelLoad.getMin(1825348837, oncanceled);
        }
        if (newNearbyMeActivity.equals >= 5) {
            newNearbyMeActivity.equals = 0;
            Location location2 = new Location("");
            location2.setLatitude(-6.17476d);
            location2.setLongitude(106.827072d);
            newNearbyMeActivity.toFloatRange = location2;
            newNearbyMeActivity.toDoubleRange();
            GriverProgressBar.UpdateRunnable updateRunnable = newNearbyMeActivity.getMax;
            if (updateRunnable != null) {
                updateRunnable.dispose();
            }
            newNearbyMeActivity.getMax = null;
        }
        if (location != null) {
            newNearbyMeActivity.toFloatRange = location;
            newNearbyMeActivity.toDoubleRange();
            GriverProgressBar.UpdateRunnable updateRunnable2 = newNearbyMeActivity.getMax;
            if (updateRunnable2 != null) {
                updateRunnable2.dispose();
            }
            newNearbyMeActivity.getMax = null;
            return;
        }
        newNearbyMeActivity.equals++;
    }

    public static final /* synthetic */ void access$populateOtherStoreList(NewNearbyMeActivity newNearbyMeActivity, List list) {
        int max;
        Context baseContext = newNearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 762252356 == (max = dispatchOnCancelled.getMax(applicationContext, 762252356)))) {
            onCanceled oncanceled = new onCanceled(762252356, max, 512);
            onCancelLoad.setMax(762252356, oncanceled);
            onCancelLoad.getMin(762252356, oncanceled);
        }
        if (!newNearbyMeActivity.hashCode.isEmpty()) {
            newNearbyMeActivity.b();
        }
        newNearbyMeActivity.valueOf();
        GriverDefaultLoadingView griverDefaultLoadingView = newNearbyMeActivity.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        griverDefaultLoadingView.toIntRange = new LatLngBounds.Builder();
        if (!list.isEmpty()) {
            List take = CollectionsKt.take(list, 100);
            newNearbyMeActivity.getMax((List<? extends ShopModel>) take);
            newNearbyMeActivity.getMin((List<? extends ShopModel>) take);
        }
    }

    public static final /* synthetic */ void access$populateSearchResultData(NewNearbyMeActivity newNearbyMeActivity, List list, boolean z) {
        int length2;
        int min;
        Context baseContext = newNearbyMeActivity.getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1084301502, oncanceled);
            onCancelLoad.getMin(1084301502, oncanceled);
        }
        setTextSpacing.setMin setmin = newNearbyMeActivity.nearbyPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        a.C0056a aVar = new a.C0056a();
        aVar.length = z;
        aVar.getMax = list;
        Unit unit = Unit.INSTANCE;
        setmin.setMin(aVar);
        setTextSpacing.setMin setmin2 = newNearbyMeActivity.nearbyPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin2.getMax(z);
        GetAboutInfoResult.getMax getmax = newNearbyMeActivity.merchantCategoryPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryPresenter");
        }
        setTextSpacing.setMin setmin3 = newNearbyMeActivity.nearbyPresenter;
        if (setmin3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        getmax.getMax(list, setmin3.values());
        newNearbyMeActivity.length((List<ShopModel>) list);
        setTextSpacing.setMin setmin4 = newNearbyMeActivity.nearbyPresenter;
        if (setmin4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.measureHeightOfChildrenCompat);
        if (nearbySearchToolbar != null) {
            str = nearbySearchToolbar.getKeyword();
        }
        setmin4.getMin(str);
    }

    public static final /* synthetic */ void access$resetNearbyShopsData(NewNearbyMeActivity newNearbyMeActivity) {
        int max;
        Context baseContext = newNearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1961273839 == (max = dispatchOnCancelled.getMax(applicationContext, 1961273839)))) {
            onCanceled oncanceled = new onCanceled(1961273839, max, 512);
            onCancelLoad.setMax(1961273839, oncanceled);
            onCancelLoad.getMin(1961273839, oncanceled);
        }
        newNearbyMeActivity.b();
        NewMerchantListView newMerchantListView = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.clearMerchantList();
        }
        setTextSpacing.setMin setmin = newNearbyMeActivity.nearbyPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin.IsOverlapping();
        newNearbyMeActivity.extraCallback = newNearbyMeActivity.toFloatRange;
    }

    public static final /* synthetic */ void access$showLocationRequest(NewNearbyMeActivity newNearbyMeActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1410105207, oncanceled);
            onCancelLoad.getMin(1410105207, oncanceled);
        }
        GriverProgressBar.UpdateRunnable updateRunnable = newNearbyMeActivity.getMin;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        newNearbyMeActivity.getMin = null;
        WheelView.ScrollerTask.getMax getmax = new WheelView.ScrollerTask.getMax(newNearbyMeActivity);
        getmax.setMin.setAlwaysShow(true);
        LocationSettingsRequest.Builder builder = getmax.setMin;
        LocationRequest create2 = LocationRequest.create();
        create2.setPriority(100);
        create2.setInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        create2.setFastestInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        builder.addLocationRequest(create2);
        uploadCoreByStartService uploadcorebystartservice = getmax.getMax;
        LocationSettingsRequest build = getmax.setMin.build();
        newNearbyMeActivity.getMin = appendAppLog.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, LocationServices.API).flatMap(new RedDotDrawable<GoogleApiClient, TitleBarRightButtonView.AnonymousClass1<LocationSettingsResult>>(build) {
            final /* synthetic */ LocationSettingsRequest getMin;

            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            /*  JADX ERROR: Method generation error: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            public final /* synthetic */ java.lang.Object apply(
/*
Method generation error in method: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }).subscribe(new R.array(new extraCommand(newNearbyMeActivity)));
    }

    public static final /* synthetic */ void access$showMerchantDetailFromOtherStoreList(NewNearbyMeActivity newNearbyMeActivity, ShopModel shopModel) {
        int length2;
        int min;
        Context baseContext = newNearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-153668028, oncanceled);
            onCancelLoad.getMin(-153668028, oncanceled);
        }
        BottomSheetBehavior length3 = newNearbyMeActivity.length();
        Intrinsics.checkNotNullParameter(length3, "$this$hide");
        length3.setHideable(true);
        length3.setState(5);
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.showMerchantDetailFromList(shopModel);
        }
        negativeListener.getMax getmax = newNearbyMeActivity.photoPreviewPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoPreviewPresenter");
        }
        getmax.length(shopModel);
    }

    public static final /* synthetic */ void access$updateSearchBar(NewNearbyMeActivity newNearbyMeActivity, String str) {
        int i;
        int max;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max2 = dispatchOnCancelled.setMax(i);
        boolean z = true;
        if (i != max2) {
            onCanceled oncanceled = new onCanceled(i, max2, 1);
            onCancelLoad.setMax(-532696040, oncanceled);
            onCancelLoad.getMin(-532696040, oncanceled);
        }
        Context baseContext = newNearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -532696040 == (max = dispatchOnCancelled.getMax(applicationContext, -532696040)))) {
            onCanceled oncanceled2 = new onCanceled(-532696040, max, 512);
            onCancelLoad.setMax(-532696040, oncanceled2);
            onCancelLoad.getMin(-532696040, oncanceled2);
        }
        CharSequence charSequence = str;
        if (charSequence.length() != 0) {
            z = false;
        }
        if (z) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.updateFocusedState);
            if (appCompatTextView != null) {
                appCompatTextView.setText(newNearbyMeActivity.getString(id.dana.R.string.search_nearby_hint));
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.updateFocusedState);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextColor(IntRange.setMax(newNearbyMeActivity, id.dana.R.color.f24612131100411));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setView);
            if (appCompatImageView != null) {
                View view = appCompatImageView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.updateFocusedState);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.updateFocusedState);
        if (appCompatTextView4 != null) {
            appCompatTextView4.setTextColor(IntRange.setMax(newNearbyMeActivity, id.dana.R.color.f18512131099725));
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setView);
        if (appCompatImageView2 != null) {
            View view2 = appCompatImageView2;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Double.valueOf(((ShopModel) t).toFloatRange), Double.valueOf(((ShopModel) t2).toFloatRange));
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(RefreshCondition refreshCondition) {
        this.Mean$Arithmetic = refreshCondition;
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onSubmitQuery);
        if (appCompatTextView != null) {
            View view = appCompatTextView;
            boolean isInside2 = isInside();
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(isInside2 ? 0 : 8);
        }
    }

    @NotNull
    public final GriverDefaultLoadingView getMapHelper() {
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        return griverDefaultLoadingView;
    }

    public final void setMapHelper(@NotNull GriverDefaultLoadingView griverDefaultLoadingView) {
        Intrinsics.checkNotNullParameter(griverDefaultLoadingView, "<set-?>");
        this.mapHelper = griverDefaultLoadingView;
    }

    @NotNull
    public final setTextSpacing.setMin getNearbyPresenter() {
        setTextSpacing.setMin setmin = this.nearbyPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        return setmin;
    }

    public final void setNearbyPresenter(@NotNull setTextSpacing.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.nearbyPresenter = setmin;
    }

    @NotNull
    public final GriverTransActivity.Lite1.setMax getMerchantDetailPresenter() {
        GriverTransActivity.Lite1.setMax setmax = this.merchantDetailPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
        }
        return setmax;
    }

    public final void setMerchantDetailPresenter(@NotNull GriverTransActivity.Lite1.setMax setmax) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1584570786, oncanceled);
            onCancelLoad.getMin(-1584570786, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.merchantDetailPresenter = setmax;
    }

    @NotNull
    public final GetAboutInfoResult.getMax getMerchantCategoryPresenter() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1720575382, oncanceled);
            onCancelLoad.getMin(1720575382, oncanceled);
        }
        GetAboutInfoResult.getMax getmax = this.merchantCategoryPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryPresenter");
        }
        return getmax;
    }

    public final void setMerchantCategoryPresenter(@NotNull GetAboutInfoResult.getMax getmax) {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-823531602, oncanceled);
            onCancelLoad.getMin(-823531602, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-823531602, oncanceled2);
            onCancelLoad.getMin(-823531602, oncanceled2);
        }
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.merchantCategoryPresenter = getmax;
    }

    @NotNull
    public final negativeListener.getMax getPhotoPreviewPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1539075621, oncanceled);
            onCancelLoad.getMin(1539075621, oncanceled);
        }
        negativeListener.getMax getmax = this.photoPreviewPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoPreviewPresenter");
        }
        return getmax;
    }

    public final void setPhotoPreviewPresenter(@NotNull negativeListener.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.photoPreviewPresenter = getmax;
    }

    @NotNull
    public final t getNearbyAnalyticTracker() {
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        return tVar;
    }

    public final void setNearbyAnalyticTracker(@NotNull t tVar) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1018272219, oncanceled);
            onCancelLoad.getMin(-1018272219, oncanceled);
        }
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.nearbyAnalyticTracker = tVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/base/LockableBaseBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<LockableBaseBottomSheetBehavior<FrameLayout>> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        @NotNull
        public final LockableBaseBottomSheetBehavior<FrameLayout> invoke() {
            BottomSheetBehavior from = BottomSheetBehavior.from((FrameLayout) this.this$0._$_findCachedViewById(resetInternal.setMax.level));
            if (from != null) {
                return (LockableBaseBottomSheetBehavior) from;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.base.LockableBaseBottomSheetBehavior<android.widget.FrameLayout!>");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/base/LockableBaseBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function0<LockableBaseBottomSheetBehavior<FrameLayout>> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        @NotNull
        public final LockableBaseBottomSheetBehavior<FrameLayout> invoke() {
            BottomSheetBehavior from = BottomSheetBehavior.from((FrameLayout) this.this$0._$_findCachedViewById(resetInternal.setMax.RequiresFeature));
            if (from != null) {
                return (LockableBaseBottomSheetBehavior) from;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.base.LockableBaseBottomSheetBehavior<android.widget.FrameLayout!>");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/nearbyme/DanaMapFragment;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function0<getCreateDate> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        @Nullable
        public final getCreateDate invoke() {
            Fragment findFragmentById = this.this$0.getSupportFragmentManager().findFragmentById(id.dana.R.id.f54312131363989);
            if (!(findFragmentById instanceof getCreateDate)) {
                findFragmentById = null;
            }
            return (getCreateDate) findFragmentById;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) this.this$0);
            getmin.length.add("android.permission.ACCESS_FINE_LOCATION");
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ toIntRange setMin;

                {
                    this.setMin = r1;
                }

                public final void getMin(@Nullable setStateOn.setMin setmin) {
                    if (WheelView.ScrollerTask.length(this.setMin.this$0)) {
                        BlurProcess.getMin(this.setMin.this$0.getApplicationContext(), true);
                        this.setMin.this$0.IsOverlapping();
                        return;
                    }
                    NewNearbyMeActivity.access$showLocationRequest(this.setMin.this$0);
                }

                public final void setMin(@Nullable setStateOn.setMin setmin) {
                    if (setmin != null) {
                        String str = setmin.getMin;
                        Intrinsics.checkNotNullExpressionValue(str, "permissionName");
                        if (!TinyAppActionStateManager.getMax((Activity) this.setMin.this$0, str)) {
                            BlurProcess.getMin(this.setMin.this$0.getApplicationContext(), false);
                            this.setMin.this$0.finish();
                        }
                    }
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class newSession extends Lambda implements Function0<Boolean> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        newSession(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean invoke() {
            /*
                r2 = this;
                id.dana.nearbyrevamp.NewNearbyMeActivity r0 = r2.this$0
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0015
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0015
                java.lang.String r1 = "targetScreen"
                java.lang.String r0 = r0.getString(r1)
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.String r1 = "nearby_detail_bottomsheet"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.NewNearbyMeActivity.newSession.invoke():boolean");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class newSessionWithExtras extends Lambda implements Function0<Boolean> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        newSessionWithExtras(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean invoke() {
            /*
                r2 = this;
                id.dana.nearbyrevamp.NewNearbyMeActivity r0 = r2.this$0
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0015
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0015
                java.lang.String r1 = "targetScreen"
                java.lang.String r0 = r0.getString(r1)
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.String r1 = "nearby_other_store"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.NewNearbyMeActivity.newSessionWithExtras.invoke():boolean");
        }
    }

    public final void onResume() {
        super.onResume();
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        ViewCompat.setMax(window.getDecorView(), (AppCompatActivity) new invokeSuspend(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/core/view/WindowInsetsCompat;", "kotlin.jvm.PlatformType", "v", "Landroid/view/View;", "insets", "onApplyWindowInsets"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend implements AppCompatActivity {
        final /* synthetic */ NewNearbyMeActivity getMax;

        invokeSuspend(NewNearbyMeActivity newNearbyMeActivity) {
            this.getMax = newNearbyMeActivity;
        }

        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (windowInsetsCompat.length(WindowInsetsCompat.Type.getMin()).getMax > 0) {
                NewMerchantListView newMerchantListView = (NewMerchantListView) this.getMax._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
                if (newMerchantListView != null) {
                    getBluetoothAdapterState.getMax(newMerchantListView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(windowInsetsCompat.length(WindowInsetsCompat.Type.getMin()).getMax), 7);
                }
                OtherStoreResultView otherStoreResultView = (OtherStoreResultView) this.getMax._$_findCachedViewById(resetInternal.setMax.setTransitioning);
                if (otherStoreResultView != null) {
                    getBluetoothAdapterState.getMax(otherStoreResultView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(windowInsetsCompat.length(WindowInsetsCompat.Type.getMin()).getMax), 7);
                }
            }
            return WindowInsetsCompat.getMax;
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-177755736, oncanceled);
            onCancelLoad.getMin(-177755736, oncanceled);
        }
        getWindow().setFlags(512, 512);
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.Layer);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_gradient");
        _$_findCachedViewById.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setDefaultImpl implements View.OnClickListener {
        final /* synthetic */ NewNearbyMeActivity setMin;

        setDefaultImpl(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMin = newNearbyMeActivity;
        }

        public final void onClick(View view) {
            this.setMin.length(false);
            GriverDefaultLoadingView mapHelper = this.setMin.getMapHelper();
            Location access$getCurrentLocation$p = this.setMin.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(access$getCurrentLocation$p, "currentLocation");
            Intrinsics.checkNotNullParameter(access$getCurrentLocation$p, "$this$toGoogleLatLng");
            LatLng latLng = new LatLng(access$getCurrentLocation$p.getLatitude(), access$getCurrentLocation$p.getLongitude());
            if (mapHelper.setMax != null) {
                mapHelper.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 16.0f));
            }
            getCreateDate access$getMapFragment$p = NewNearbyMeActivity.access$getMapFragment$p(this.setMin);
            if (access$getMapFragment$p != null) {
                access$getMapFragment$p.setMin = false;
            }
            CardView cardView = (CardView) this.setMin._$_findCachedViewById(resetInternal.setMax.BoolRes);
            if (cardView != null) {
                View view2 = cardView;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getInterfaceDescriptor implements View.OnClickListener {
        final /* synthetic */ NewNearbyMeActivity setMin;

        getInterfaceDescriptor(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMin = newNearbyMeActivity;
        }

        public final void onClick(View view) {
            NewNearbyMeActivity.access$onRefreshMerchantClicked(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsService implements View.OnClickListener {
        final /* synthetic */ NewNearbyMeActivity setMin;

        ICustomTabsService(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMin = newNearbyMeActivity;
        }

        public final void onClick(View view) {
            NewNearbyMeActivity.access$openNearbyExplore(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getDefaultImpl implements View.OnClickListener {
        final /* synthetic */ NewNearbyMeActivity setMin;

        getDefaultImpl(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMin = newNearbyMeActivity;
        }

        public final void onClick(View view) {
            NewNearbyMeActivity.access$updateSearchBar(this.setMin, "");
            NewNearbyMeActivity.access$resetState(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyrevamp/NewNearbyMeActivity$openMerchantDetailFromNonMaps$2$1"}, k = 3, mv = {1, 4, 2})
    static final class valueOf extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $merchantId$inlined;
        final /* synthetic */ String $shopId$inlined;
        final /* synthetic */ NewNearbyMeActivity $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        valueOf(NewNearbyMeActivity newNearbyMeActivity, String str, String str2) {
            super(0);
            this.$this_run = newNearbyMeActivity;
            this.$shopId$inlined = str;
            this.$merchantId$inlined = str2;
        }

        public final void invoke() {
            NewNearbyMeActivity newNearbyMeActivity = this.$this_run;
            String str = this.$merchantId$inlined;
            if (str == null) {
                str = "";
            }
            NewNearbyMeActivity.access$refreshMerchantDetail(newNearbyMeActivity, str, this.$shopId$inlined);
            this.$this_run.setMax(false);
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(ShopModel shopModel) {
        shopModel.ICustomTabsCallback$Stub = !Intrinsics.areEqual((Object) this.getCause, (Object) "Home");
        shopModel.getInterfaceDescriptor = 1;
        shopModel.setDefaultImpl = 1;
        GetAboutInfoResult.getMax getmax = this.merchantCategoryPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryPresenter");
        }
        getmax.getMax(CollectionsKt.mutableListOf(shopModel), 1);
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.showMerchantDetailFromNonMaps(shopModel, this.getCause);
            if (merchantDetailBottomsheetView.isMerchantDetailFullyDisplayed() || merchantDetailBottomsheetView.isMerchantDetailPreviewDisplayed()) {
                this.values = new customizeWebViewSettings(shopModel);
                negativeListener.getMax getmax2 = this.photoPreviewPresenter;
                if (getmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("photoPreviewPresenter");
                }
                getmax2.length(shopModel);
            }
        }
        NewMerchantListView newMerchantListView = (NewMerchantListView) _$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            NewMerchantListView.setMerchantList$default(newMerchantListView, CollectionsKt.mutableListOf(shopModel), 0, 2, (Object) null);
        }
        setMax((List<? extends ShopModel>) CollectionsKt.mutableListOf(shopModel));
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        Location invokeSuspend2 = shopModel.invokeSuspend();
        LatLng latLng = new LatLng(invokeSuspend2.getLatitude(), invokeSuspend2.getLongitude());
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 15.0f));
        }
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1105813606, oncanceled);
            onCancelLoad.getMin(-1105813606, oncanceled);
        }
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.setNonDraggableExpandBottomsheet();
        }
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (merchantDetailView != null) {
            merchantDetailView.showErrorState(true);
        }
        NewMerchantListView newMerchantListView = (NewMerchantListView) _$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.showEmptyState();
        }
        setMax(true);
        setTitle(getString(id.dana.R.string.merchant_detail));
    }

    private final void toFloatRange() {
        Location location;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(213332685, oncanceled);
            onCancelLoad.getMin(213332685, oncanceled);
        }
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView.setMax != null) {
            LatLng latLng = griverDefaultLoadingView.setMax.getCameraPosition().target;
            double d = latLng.latitude;
            double d2 = latLng.longitude;
            location = new Location("");
            location.setLatitude(d);
            location.setLongitude(d2);
        } else {
            location = null;
        }
        if (location != null) {
            this.extraCallback = location;
            setTextSpacing.setMin setmin = this.nearbyPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin.IsOverlapping();
            setTextSpacing.setMin setmin2 = this.nearbyPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin2.setMax(location, 5000, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000f"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$getNearbySearchListener$1", "Lid/dana/nearbyrevamp/search/NearbySearchResultListener;", "onClearButtonClicked", "", "onLocationSelected", "location", "Landroid/location/Location;", "onSeeOnMapClicked", "shopModel", "", "Lid/dana/nearbyme/model/ShopModel;", "hasMore", "", "onShopSelected", "allShops", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements GriverDefaultOpenSettingExtension {
        final /* synthetic */ NewNearbyMeActivity setMin;

        @JvmDefault
        public final void getMin(@NotNull getCreateTime getcreatetime) {
            Intrinsics.checkNotNullParameter(getcreatetime, "nearbyLocation");
        }

        length(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMin = newNearbyMeActivity;
        }

        public final void setMin(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            setOnWheelViewListener.getMax((Activity) this.setMin);
            FragmentManager supportFragmentManager = this.setMin.getSupportFragmentManager();
            supportFragmentManager.getMax((FragmentManager.getMax) new FragmentManager.length(-1, 0), false);
            this.setMin.length(location);
            NewNearbyMeActivity.access$showSearchResultBottomsheet(this.setMin);
            this.setMin.invoke = MapState.MERCHANT_LIST;
        }

        public final void setMax(@NotNull List<? extends ShopModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "shopModel");
            setOnWheelViewListener.getMax((Activity) this.setMin);
            this.setMin.setMin();
            Fragment findFragmentByTag = this.setMin.getSupportFragmentManager().findFragmentByTag("NearbySearchFragment");
            if (findFragmentByTag != null) {
                setColorFilter setcolorfilter = new setColorFilter(this.setMin.getSupportFragmentManager());
                setcolorfilter.setMax = id.dana.R.anim.f412130772012;
                setcolorfilter.isInside = id.dana.R.anim.f422130772014;
                setcolorfilter.equals = id.dana.R.anim.f412130772012;
                setcolorfilter.toIntRange = id.dana.R.anim.f422130772014;
                setcolorfilter.setMin(findFragmentByTag).setMin();
            }
            NewNearbyMeActivity.access$showSearchResultBottomsheet(this.setMin);
            NewNearbyMeActivity newNearbyMeActivity = this.setMin;
            NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.measureHeightOfChildrenCompat);
            String keyword = nearbySearchToolbar != null ? nearbySearchToolbar.getKeyword() : null;
            if (keyword == null) {
                keyword = "";
            }
            NewNearbyMeActivity.access$updateSearchBar(newNearbyMeActivity, keyword);
            this.setMin.getNearbyPresenter().IsOverlapping();
            NewNearbyMeActivity.access$populateSearchResultData(this.setMin, CollectionsKt.toMutableList(list), z);
            this.setMin.invoke = MapState.SEARCH_RESULT;
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.onSubmitQuery);
            if (appCompatTextView != null) {
                View view = appCompatTextView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
        }

        public final void length(@NotNull ShopModel shopModel, @NotNull List<? extends ShopModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Intrinsics.checkNotNullParameter(list, "allShops");
            setMax(list, z);
            MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) this.setMin._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView != null) {
                this.setMin.onNavigationEvent();
                merchantDetailBottomsheetView.showMerchantDetailFromList(shopModel);
            }
            NewNearbyMeActivity.access$getPreviewImages(this.setMin, shopModel);
        }

        public final void q_() {
            this.setMin.invoke = MapState.MERCHANT_LIST;
            NewNearbyMeActivity.access$getNearbyAutoSearch(this.setMin);
        }
    }

    /* access modifiers changed from: private */
    public final void length(Location location) {
        LatLng latLng;
        this.extraCallback = location;
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (location != null) {
            latLng = new LatLng(location.getLatitude(), location.getLongitude());
        } else {
            latLng = new LatLng(-6.17476d, 106.827072d);
        }
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 15.0f));
        }
        b();
        valueOf();
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.reset();
        }
        MerchantDetailBottomsheetView merchantDetailBottomsheetView2 = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView2 != null) {
            merchantDetailBottomsheetView2.hideMerchantDetailBottomsheet();
        }
        setTextSpacing.setMin setmin = this.nearbyPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin.IsOverlapping();
        setTextSpacing.setMin setmin2 = this.nearbyPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin2.setMax(location, 5000, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (o.getCreateDate) r2.invokeSuspend.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isInside() {
        /*
            r2 = this;
            id.dana.nearbyrevamp.NewNearbyMeActivity$RefreshCondition r0 = r2.Mean$Arithmetic
            id.dana.nearbyrevamp.NewNearbyMeActivity$RefreshCondition r1 = id.dana.nearbyrevamp.NewNearbyMeActivity.RefreshCondition.ERROR
            if (r0 != r1) goto L_0x001e
            kotlin.Lazy r0 = r2.invokeSuspend
            java.lang.Object r0 = r0.getValue()
            o.getCreateDate r0 = (o.getCreateDate) r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.setMin()
            r1 = 1
            if (r0 != r1) goto L_0x001e
            boolean r0 = r2.equals()
            if (r0 == 0) goto L_0x001e
            return r1
        L_0x001e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.NewNearbyMeActivity.isInside():boolean");
    }

    private final boolean equals() {
        return this.invoke == MapState.MERCHANT_LIST || this.invoke == MapState.MERCHANT_DETAIL;
    }

    /* access modifiers changed from: private */
    public final void length(boolean z) {
        PinMapLottieAnimationView pinMapLottieAnimationView = (PinMapLottieAnimationView) _$_findCachedViewById(resetInternal.setMax.dispatchPresenterUpdate);
        if (pinMapLottieAnimationView != null) {
            View view = pinMapLottieAnimationView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u001e\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0012\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016¨\u0006%"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$injectComponent$1", "Lid/dana/contract/nearbyme/NearbyMeContract$View;", "dismissProgress", "", "onCheckNearbyMeFeatureEnableSuccess", "enable", "", "onError", "errorMessage", "", "onGetNearbyShopData", "shops", "", "Lid/dana/nearbyme/model/ShopModel;", "onGetNearbyShopsPaginationSuccess", "shopModels", "", "hasMore", "onGetNearbyShopsPromo", "nearbyShopWithPromoModels", "onGetNearbyShopsSuccess", "nearbyShopsModel", "Lid/dana/nearbyme/model/NearbyShopsModel;", "onGetNearbyShopsWithRadiusError", "onGetNearbyShopsWithRadiusSuccess", "onGetUserAccount", "account", "Lid/dana/domain/account/Account;", "onLocationPermissionRequired", "onResolutionRequired", "intentSender", "Landroid/content/IntentSender;", "onShowTooltip", "show", "onSuccessGetDistrictName", "districtName", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements setTextSpacing.getMin {
        final /* synthetic */ NewNearbyMeActivity length;

        public final void dismissProgress() {
        }

        public final void getMax(@Nullable String str) {
        }

        public final void getMax(boolean z) {
        }

        public final void getMin(@Nullable a.C0056a aVar) {
        }

        public final void getMin(boolean z) {
        }

        public final void setMin(boolean z) {
        }

        equals(NewNearbyMeActivity newNearbyMeActivity) {
            this.length = newNearbyMeActivity;
        }

        public final void showProgress() {
            MerchantFilterView merchantFilterView = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.access$101);
            if (merchantFilterView != null) {
                merchantFilterView.showShimmer();
            }
            NewNearbyMeActivity.access$showLoading(this.length);
        }

        public final void onError(@Nullable String str) {
            NewMerchantListView newMerchantListView;
            NewMerchantListView newMerchantListView2 = (NewMerchantListView) this.length._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView2 != null) {
                newMerchantListView2.removeLoading();
            }
            if (this.length.getNearbyPresenter().values() <= 1) {
                NewMerchantListView newMerchantListView3 = (NewMerchantListView) this.length._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
                if (newMerchantListView3 != null) {
                    newMerchantListView3.showEmptyState();
                }
            } else if (this.length.getNearbyPresenter().isInside() && (newMerchantListView = (NewMerchantListView) this.length._$_findCachedViewById(resetInternal.setMax.setSplitBackground)) != null) {
                newMerchantListView.showLoadMore();
            }
            this.length.setMax(RefreshCondition.ERROR);
        }

        public final void length(@NotNull List<ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
            if (this.length.invoke != MapState.MERCHANT_OTHER_STORE) {
                NewNearbyMeActivity.access$setupMerchantShopListByPassedMerchantId(this.length, list);
                if (!list.isEmpty()) {
                    this.length.getNearbyPresenter().setMin(list);
                }
            }
            if (this.length.Mean$Arithmetic != RefreshCondition.ERROR) {
                this.length.setMax(RefreshCondition.FETCHED);
            }
        }

        public final void getMax(@Nullable List<ShopModel> list) {
            if (list != null) {
                NewNearbyMeActivity.access$updateShopModelInListAndMap(this.length, list);
            }
        }

        public final void setMin(@Nullable GriverCommonResourceProxy griverCommonResourceProxy) {
            String str;
            NewNearbyMeActivity newNearbyMeActivity = this.length;
            if (griverCommonResourceProxy == null || (str = griverCommonResourceProxy.getAvatarUrl()) == null) {
                str = "";
            }
            newNearbyMeActivity.isInside = str;
        }

        public final void getMin(@Nullable List<ShopModel> list) {
            if (list != null) {
                this.length.getMerchantCategoryPresenter().getMax(list, this.length.getNearbyPresenter().values());
            }
        }

        public final void setMin(@NotNull List<? extends ShopModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "shopModels");
            NewNearbyMeActivity.access$setupBottomSheetWithSearchResult(this.length, list, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\u000e"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$getMerchantModule$1", "Lid/dana/nearbyme/MerchantContract$View;", "onCheckMerchantFilterFeatureEnableSuccess", "", "enable", "", "onErrorGetNewMerchantCategories", "merchantCategoryType", "Lid/dana/domain/merchant/MerchantCategoryType;", "onGetNewMerchantListCategories", "merchantCategoryModels", "", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "onGetNewMerchantMapsCategories", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements GetAboutInfoResult.getMin {
        final /* synthetic */ NewNearbyMeActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void onGetMerchantCategories(@NotNull List<g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "merchantCategoryModels");
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(NewNearbyMeActivity newNearbyMeActivity) {
            this.length = newNearbyMeActivity;
        }

        public final void onCheckMerchantFilterFeatureEnableSuccess(boolean z) {
            MerchantFilterView merchantFilterView = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.measureChildView);
            if (merchantFilterView != null) {
                merchantFilterView.setFilterEnabled(z);
            }
        }

        public final void getMin(@NotNull List<g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "merchantCategoryModels");
            MerchantFilterView merchantFilterView = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.measureChildView);
            if (merchantFilterView != null) {
                merchantFilterView.setMerchantCategories(list);
            }
            MerchantFilterView merchantFilterView2 = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.drawableStateChanged);
            if (merchantFilterView2 != null) {
                merchantFilterView2.setMerchantCategories(list);
            }
        }

        public final void setMax(@NotNull List<g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "merchantCategoryModels");
            MerchantFilterView merchantFilterView = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.access$101);
            if (merchantFilterView != null) {
                merchantFilterView.setMerchantCategories(list);
            }
        }

        public final void length(@NotNull MerchantCategoryType merchantCategoryType) {
            Intrinsics.checkNotNullParameter(merchantCategoryType, "merchantCategoryType");
            if (merchantCategoryType == MerchantCategoryType.MAPS) {
                MerchantFilterView merchantFilterView = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.access$101);
                if (merchantFilterView != null) {
                    merchantFilterView.hideShimmer();
                }
                MerchantFilterView merchantFilterView2 = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.access$101);
                if (merchantFilterView2 != null) {
                    View view = merchantFilterView2;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            MerchantFilterView merchantFilterView3 = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.measureChildView);
            if (merchantFilterView3 != null) {
                merchantFilterView3.hideShimmer();
            }
            MerchantFilterView merchantFilterView4 = (MerchantFilterView) this.length._$_findCachedViewById(resetInternal.setMax.measureChildView);
            if (merchantFilterView4 != null) {
                View view2 = merchantFilterView4;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$getMerchantDetailModule$1", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$View;", "onFailedFetch", "", "onSuccessFetch", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements GriverTransActivity.Lite1.setMin {
        final /* synthetic */ NewNearbyMeActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(NewNearbyMeActivity newNearbyMeActivity) {
            this.length = newNearbyMeActivity;
        }

        public final void getMin(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            this.length.getMax(shopModel);
        }

        public final void length() {
            this.length.getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$getPhotoGalleryModule$1", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;", "onMerchantPreviewImageLoaded", "", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements negativeListener.length {
        final /* synthetic */ NewNearbyMeActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMin(@NotNull List<MerchantImageModel> list) {
            Intrinsics.checkNotNullParameter(list, "merchantImages");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        isInside(NewNearbyMeActivity newNearbyMeActivity) {
            this.length = newNearbyMeActivity;
        }

        public final void setMin(@NotNull List<MerchantImageModel> list, @NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(list, "merchantImages");
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            NewMerchantListView newMerchantListView = (NewMerchantListView) this.length._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView != null) {
                newMerchantListView.updateImage(list, shopModel);
            }
            MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) this.length._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView != null) {
                merchantDetailBottomsheetView.updateImage(list, shopModel);
            }
        }
    }

    private final void length(List<ShopModel> list) {
        NewMerchantListView newMerchantListView = (NewMerchantListView) _$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            setTextSpacing.setMin setmin = this.nearbyPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            newMerchantListView.setMerchantList(list, setmin.values());
            setMax((List<? extends ShopModel>) newMerchantListView.getMerchantList());
            setTextSpacing.setMin setmin2 = this.nearbyPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            if (setmin2.isInside() && (!list.isEmpty())) {
                newMerchantListView.showLoadMore();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class getCause implements Runnable {
        final /* synthetic */ NewNearbyMeActivity getMin;

        getCause(NewNearbyMeActivity newNearbyMeActivity) {
            this.getMin = newNearbyMeActivity;
        }

        public final void run() {
            NewNearbyMeActivity.access$orderLayout(this.getMin);
            NewNearbyMeActivity.access$setupSearchBarShadow(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantListBottomsheet$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onPostMessage extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ NewNearbyMeActivity setMax;

        public final void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
        }

        onPostMessage(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMax = newNearbyMeActivity;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            if (i == 3) {
                ((NewMerchantListView) this.setMax._$_findCachedViewById(resetInternal.setMax.setSplitBackground)).setCenterRecyclerView(true);
                NewNearbyMeActivity.access$setAnchoredButtonVisibility(this.setMax, false);
                NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.setMax).setHideable(false);
            } else if (i == 4) {
                ((NewMerchantListView) this.setMax._$_findCachedViewById(resetInternal.setMax.setSplitBackground)).setCenterRecyclerView(false);
                NewNearbyMeActivity.access$setAnchoredButtonVisibility(this.setMax, true);
                NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.setMax).setHideable(false);
            } else if (i == 6) {
                ((NewMerchantListView) this.setMax._$_findCachedViewById(resetInternal.setMax.setSplitBackground)).setCenterRecyclerView(false);
                NewNearbyMeActivity.access$setAnchoredButtonVisibility(this.setMax, true);
                this.setMax.setMin((int) id.dana.R.id.f44112131362936);
                NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.setMax).setHideable(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class asBinder extends Lambda implements Function0<Unit> {
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        asBinder(NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.this$0 = newNearbyMeActivity;
        }

        public final void invoke() {
            NewMerchantListView newMerchantListView = (NewMerchantListView) this.this$0._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView != null) {
                newMerchantListView.removeLoadMore();
            }
            NewMerchantListView newMerchantListView2 = (NewMerchantListView) this.this$0._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView2 != null) {
                newMerchantListView2.showLoading();
            }
            if (this.this$0.invoke == MapState.SEARCH_RESULT) {
                this.this$0.getNearbyPresenter().getMin(this.this$0.extraCallback);
            } else {
                this.this$0.getNearbyPresenter().setMin(this.this$0.extraCallback);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        getCreateDate getcreatedate;
        CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.BoolRes);
        if (cardView != null) {
            View view = cardView;
            boolean z2 = true;
            int i = 0;
            if (!z || (getcreatedate = (getCreateDate) this.invokeSuspend.getValue()) == null || !getcreatedate.setMin()) {
                z2 = false;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantDetailBottomsheet$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onRelationshipValidationResult extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ NewNearbyMeActivity setMin;

        public final void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
        }

        onRelationshipValidationResult(NewNearbyMeActivity newNearbyMeActivity) {
            this.setMin = newNearbyMeActivity;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            if (i != 3) {
                if (i == 4) {
                    NewNearbyMeActivity.access$onCollapseMerchantDetailBottomsheet(this.setMin);
                    return;
                } else if (i == 5) {
                    NewNearbyMeActivity.access$onHideMerchantDetailBottomsheet(this.setMin);
                    return;
                } else if (i != 6) {
                    return;
                }
            }
            NewNearbyMeActivity.access$onExpandMerchantDetailBottomsheet(this.setMin);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(@IdRes int i) {
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.max);
        if (_$_findCachedViewById != null) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
            if (layoutParams != null) {
                CoordinatorLayout.length length2 = (CoordinatorLayout.length) layoutParams;
                length2.values = null;
                length2.toString = null;
                length2.toIntRange = i;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(boolean z) {
        int i = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(385276498, oncanceled);
            onCancelLoad.getMin(385276498, oncanceled);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.isInTouchMode);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        AppBarLayout appBarLayout = (AppBarLayout) _$_findCachedViewById(resetInternal.setMax.getMin);
        if (appBarLayout != null) {
            if (!z) {
                i = 4;
            }
            appBarLayout.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$getOnCategoryCheckedListener$1", "Lid/dana/nearbyme/OnCategoryCheckedListener;", "onCategoryClick", "", "selectedCategory", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "onMulitpleCategorySelected", "checkedCategories", "", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements getAppIdList {
        final /* synthetic */ NewNearbyMeActivity getMin;
        final /* synthetic */ MerchantCategoryType setMin;

        @JvmDefault
        public final void onMulitpleCategorySelected(@NotNull List<g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "checkedCategories");
        }

        IsOverlapping(NewNearbyMeActivity newNearbyMeActivity, MerchantCategoryType merchantCategoryType) {
            this.getMin = newNearbyMeActivity;
            this.setMin = merchantCategoryType;
        }

        public final void length(@NotNull List<g.AnonymousClass1> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "checkedCategories");
            NewMerchantListView newMerchantListView = (NewMerchantListView) this.getMin._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView != null) {
                newMerchantListView.clearMerchantList();
            }
            NewNearbyMeActivity.access$hideMerchantDetailPreview(this.getMin);
            this.getMin.getNearbyPresenter().setMin(list, this.setMin);
        }

        public final void onCategoryClick(@NotNull g.AnonymousClass1 r3) {
            Intrinsics.checkNotNullParameter(r3, "selectedCategory");
            t nearbyAnalyticTracker = this.getMin.getNearbyAnalyticTracker();
            String str = r3.getMin;
            Intrinsics.checkNotNullExpressionValue(str, "selectedCategory.name");
            nearbyAnalyticTracker.length(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantOtherStoreBottomsheet$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class onTransact extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ NewNearbyMeActivity getMin;

        public final void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
        }

        onTransact(NewNearbyMeActivity newNearbyMeActivity) {
            this.getMin = newNearbyMeActivity;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            String str;
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            if (i == 3) {
                this.getMin.getMax(false);
            } else if (i == 4) {
                this.getMin.getMax(true);
            } else if (i == 6) {
                this.getMin.length().setHideable(false);
                this.getMin.setMin((int) id.dana.R.id.f44122131362937);
                this.getMin.getMax(true);
                NewNearbyMeActivity newNearbyMeActivity = this.getMin;
                OtherStoreResultView otherStoreResultView = (OtherStoreResultView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setTransitioning);
                if (otherStoreResultView == null || (str = otherStoreResultView.getMerchantName()) == null) {
                    str = "";
                }
                NewNearbyMeActivity.access$updateSearchBar(newNearbyMeActivity, str);
                MerchantFilterView merchantFilterView = (MerchantFilterView) this.getMin._$_findCachedViewById(resetInternal.setMax.access$101);
                if (merchantFilterView != null) {
                    View view2 = merchantFilterView;
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    view2.setVisibility(8);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMerchantOtherStoreBottomsheet$2$2"}, k = 3, mv = {1, 4, 2})
    static final class asInterface extends Lambda implements Function0<Unit> {
        final /* synthetic */ OtherStoreResultView $this_run;
        final /* synthetic */ NewNearbyMeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        asInterface(OtherStoreResultView otherStoreResultView, NewNearbyMeActivity newNearbyMeActivity) {
            super(0);
            this.$this_run = otherStoreResultView;
            this.this$0 = newNearbyMeActivity;
        }

        public final void invoke() {
            this.this$0.invoke = MapState.MERCHANT_LIST;
            BottomSheetBehavior access$getMerchantOtherStoreBottomsheet$p = this.this$0.length();
            Intrinsics.checkNotNullParameter(access$getMerchantOtherStoreBottomsheet$p, "$this$hide");
            access$getMerchantOtherStoreBottomsheet$p.setHideable(true);
            access$getMerchantOtherStoreBottomsheet$p.setState(5);
            this.$this_run.onMerchantOtherStoreClosed();
            MerchantFilterView merchantFilterView = (MerchantFilterView) this.this$0._$_findCachedViewById(resetInternal.setMax.access$101);
            if (merchantFilterView != null) {
                View view = merchantFilterView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            NewNearbyMeActivity.access$updateSearchBar(this.this$0, "");
            BottomSheetBehavior access$getMerchantListBottomsheet$p = NewNearbyMeActivity.access$getMerchantListBottomsheet$p(this.this$0);
            Intrinsics.checkNotNullParameter(access$getMerchantListBottomsheet$p, "$this$expandHalf");
            access$getMerchantListBottomsheet$p.setState(6);
            this.this$0.values();
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(351617952, oncanceled);
            onCancelLoad.getMin(351617952, oncanceled);
        }
        if (intent != null && i == 100) {
            if (i2 == -1) {
                IsOverlapping();
            } else if (i2 == 0) {
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: private */
    public final void IsOverlapping() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1756962644 == (max = dispatchOnCancelled.getMax(applicationContext, 1756962644)))) {
            onCanceled oncanceled = new onCanceled(1756962644, max, 512);
            onCancelLoad.setMax(1756962644, oncanceled);
            onCancelLoad.getMin(1756962644, oncanceled);
        }
        if (!CornerMarkingDataProvider.toFloatRange() || setStateOn.getMin(this, "android.permission.ACCESS_FINE_LOCATION")) {
            GriverProgressBar.UpdateRunnable updateRunnable = this.getMax;
            if (updateRunnable != null) {
                updateRunnable.dispose();
            }
            this.getMax = null;
            this.equals = 0;
            GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(this).getMin().subscribe(new R.array(new toFloatRange(this)));
            this.getMax = subscribe;
            addDisposable(subscribe);
            return;
        }
        Location location = new Location("");
        location.setLatitude(-6.17476d);
        location.setLongitude(106.827072d);
        this.toFloatRange = location;
        ((setStateOn) this.create.getValue()).setMin();
    }

    private final void toDoubleRange() {
        OtherStoreResultView otherStoreResultView;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(627061929, oncanceled);
            onCancelLoad.getMin(627061929, oncanceled);
        }
        FastBitmap$CoordinateSystem();
        Location location = this.toFloatRange;
        if (location != null) {
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            Intrinsics.checkNotNullParameter(location, "$this$toGoogleLatLng");
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            if (griverDefaultLoadingView.setMax != null) {
                griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 16.0f));
            }
        }
        int i = p.setMax[this.invoke.ordinal()];
        if (i == 1) {
            String stringExtra = getIntent().getStringExtra("EXTRA_MERCHANT_ID");
            getIntent().removeExtra("EXTRA_MERCHANT_ID");
            if (stringExtra != null && (otherStoreResultView = (OtherStoreResultView) _$_findCachedViewById(resetInternal.setMax.setTransitioning)) != null) {
                Location location2 = this.toFloatRange;
                Intrinsics.checkNotNullExpressionValue(location2, "currentLocation");
                otherStoreResultView.searchOtherMerchantByMerchantId(location2, stringExtra, SearchType.MERCHANTID_SORTED_BY_DISTANCE, TrackerKey.SourceType.DEEP_LINK);
            }
        } else if (i == 2) {
            values();
        }
    }

    /* access modifiers changed from: private */
    public final void values() {
        this.extraCallback = this.toFloatRange;
        setTextSpacing.setMin setmin = this.nearbyPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin.IsOverlapping();
        if (this.toIntRange != null) {
            this.toDoubleRange = false;
            setTextSpacing.setMin setmin2 = this.nearbyPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin2.setMax(this.toIntRange, 5000, false);
            this.toIntRange = null;
            return;
        }
        setTextSpacing.setMin setmin3 = this.nearbyPresenter;
        if (setmin3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin3.setMax(this.toFloatRange, 5000, false);
    }

    private final void FastBitmap$CoordinateSystem() {
        setMiniAbout setminiabout = setMiniAbout.getMax;
        Context context = this;
        String str = this.isInside;
        if (str == null) {
            str = "";
        }
        setMiniAbout.setMin(context, str, new NewNearbyMeActivity$Mean$Arithmetic(this), new NewNearbyMeActivity$Grayscale$Algorithm(this));
    }

    /* access modifiers changed from: private */
    public final void invokeSuspend() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Marker marker = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1117483007, oncanceled);
            onCancelLoad.getMin(1117483007, oncanceled);
        }
        if (this.IsOverlapping == null) {
            FastBitmap$CoordinateSystem();
            return;
        }
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        MarkerOptions min2 = griverDefaultLoadingView.setMin(this.toFloatRange, this.IsOverlapping);
        GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
        if (griverDefaultLoadingView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView2.setMax != null) {
            marker = griverDefaultLoadingView2.setMax.addMarker(min2);
        }
        this.setMax = marker;
        GriverDefaultLoadingView griverDefaultLoadingView3 = this.mapHelper;
        if (griverDefaultLoadingView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        Marker marker2 = this.setMax;
        if (marker2 != null) {
            float f = griverDefaultLoadingView3.setMax != null ? griverDefaultLoadingView3.setMax.getCameraPosition().zoom / 30.0f : 0.0f;
            marker2.setAnchor(f, f);
        }
    }

    public final void onMapReady(@Nullable GoogleMap googleMap) {
        Bundle extras;
        int length2;
        int min;
        if (googleMap != null) {
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            NewNearbyMeActivity newNearbyMeActivity = this;
            griverDefaultLoadingView.setMax(googleMap, (GoogleMap.OnMarkerClickListener) new R.mipmap(new invoke(newNearbyMeActivity)));
            boolean z = false;
            if (griverDefaultLoadingView.setMax != null) {
                griverDefaultLoadingView.setMax.setIndoorEnabled(false);
                griverDefaultLoadingView.setMax.setBuildingsEnabled(false);
            }
            GoogleMap.OnMapClickListener hashcode = new hashCode(this, googleMap);
            if (griverDefaultLoadingView.setMax != null) {
                griverDefaultLoadingView.setMax.setOnMapClickListener(hashcode);
            }
            GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
            if (griverDefaultLoadingView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            GoogleMap googleMap2 = griverDefaultLoadingView2.setMax;
            if (googleMap2 != null) {
                googleMap2.setOnCameraMoveListener(new onNavigationEvent(this));
                googleMap2.setOnCameraIdleListener(new create(this));
                googleMap2.setOnCameraMoveStartedListener(new ICustomTabsCallback(this));
            }
            length(false);
            String str = "";
            Location location = new Location(str);
            location.setLatitude(-6.17476d);
            location.setLongitude(106.827072d);
            this.toFloatRange = location;
            ((setStateOn) this.create.getValue()).setMin();
            if (getMin()) {
                Context baseContext = getBaseContext();
                ShopModel shopModel = null;
                Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                    onCanceled oncanceled = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(650699719, oncanceled);
                    onCancelLoad.getMin(650699719, oncanceled);
                }
                String stringExtra = getIntent().getStringExtra("EXTRA_SHOP_ID");
                getIntent().removeExtra("EXTRA_SHOP_ID");
                String stringExtra2 = getIntent().getStringExtra("EXTRA_MERCHANT_ID");
                getIntent().removeExtra("EXTRA_MERCHANT_ID");
                Intent intent = getIntent();
                ShopModel shopModel2 = (intent == null || (extras = intent.getExtras()) == null) ? null : (ShopModel) extras.getParcelable("shopModel");
                if (shopModel2 instanceof ShopModel) {
                    shopModel = shopModel2;
                }
                if (shopModel != null) {
                    getMax(shopModel);
                    return;
                }
                CharSequence charSequence = stringExtra;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (!z) {
                    GriverTransActivity.Lite1.setMax setmax = newNearbyMeActivity.merchantDetailPresenter;
                    if (setmax == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
                    }
                    if (stringExtra2 != null) {
                        str = stringExtra2;
                    }
                    setmax.setMax(str, stringExtra);
                    MerchantDetailView merchantDetailView = (MerchantDetailView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
                    if (merchantDetailView != null) {
                        merchantDetailView.setTryAgainListener(new valueOf(newNearbyMeActivity, stringExtra, stringExtra2));
                        return;
                    }
                    return;
                }
                newNearbyMeActivity.getMax();
            } else if (setMax()) {
                b();
                BottomSheetBehavior length3 = length();
                Intrinsics.checkNotNullParameter(length3, "$this$expandHalf");
                length3.setState(6);
                OtherStoreResultView otherStoreResultView = (OtherStoreResultView) _$_findCachedViewById(resetInternal.setMax.setTransitioning);
                if (otherStoreResultView != null) {
                    otherStoreResultView.showShimmer();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "onMapClick", "id/dana/nearbyrevamp/NewNearbyMeActivity$onMapReady$1$2"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements GoogleMap.OnMapClickListener {
        final /* synthetic */ NewNearbyMeActivity getMin;
        final /* synthetic */ GoogleMap setMax;

        hashCode(NewNearbyMeActivity newNearbyMeActivity, GoogleMap googleMap) {
            this.getMin = newNearbyMeActivity;
            this.setMax = googleMap;
        }

        public final void onMapClick(LatLng latLng) {
            NewNearbyMeActivity.access$hideMerchantDetailPreview(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onCameraMove", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMapCamera$1$1"}, k = 3, mv = {1, 4, 2})
    static final class onNavigationEvent implements GoogleMap.OnCameraMoveListener {
        final /* synthetic */ NewNearbyMeActivity getMax;

        onNavigationEvent(NewNearbyMeActivity newNearbyMeActivity) {
            this.getMax = newNearbyMeActivity;
        }

        public final void onCameraMove() {
            if (this.getMax.invoke != MapState.SEARCH_RESULT) {
                NewNearbyMeActivity.access$onCameraMove(this.getMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onCameraIdle", "id/dana/nearbyrevamp/NewNearbyMeActivity$setupMapCamera$1$2"}, k = 3, mv = {1, 4, 2})
    static final class create implements GoogleMap.OnCameraIdleListener {
        final /* synthetic */ NewNearbyMeActivity length;

        create(NewNearbyMeActivity newNearbyMeActivity) {
            this.length = newNearbyMeActivity;
        }

        public final void onCameraIdle() {
            PinMapLottieAnimationView pinMapLottieAnimationView;
            this.length.invoke();
            boolean z = true;
            if (this.length.toString == 1 && (pinMapLottieAnimationView = (PinMapLottieAnimationView) this.length._$_findCachedViewById(resetInternal.setMax.dispatchPresenterUpdate)) != null) {
                pinMapLottieAnimationView.putDownPinMap();
                if (pinMapLottieAnimationView.getVisibility() != 0) {
                    z = false;
                }
                if (z && this.length.invoke != MapState.SEARCH_RESULT && this.length.invoke != MapState.MERCHANT_OTHER_STORE) {
                    NewNearbyMeActivity.access$resetNearbyShopsData(this.length);
                    NewNearbyMeActivity.access$getNearbyAutoSearch(this.length);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void invoke() {
        boolean z;
        ShopModel shopModel;
        Collection<Marker> values2 = this.hashCode.values();
        Intrinsics.checkNotNullExpressionValue(values2, "shopMarkers.values");
        List list = CollectionsKt.toList(values2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                int i2 = lastIndex - i;
                Object obj = list.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj, "markers[bottomMarkerIndex]");
                Marker marker = (Marker) obj;
                GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
                if (griverDefaultLoadingView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                }
                LatLng position = marker.getPosition();
                double d = position.latitude;
                double d2 = position.longitude;
                Location location = new Location("");
                location.setLatitude(d);
                location.setLongitude(d2);
                if (!griverDefaultLoadingView.length(location)) {
                    Marker marker2 = null;
                    if (i2 > 0 && i2 > 0) {
                        int i3 = 1;
                        while (true) {
                            Object obj2 = list.get(i2 - i3);
                            Intrinsics.checkNotNullExpressionValue(obj2, "markers[bottomMarkerIndex - upperIndex]");
                            Marker marker3 = (Marker) obj2;
                            GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
                            if (griverDefaultLoadingView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                            }
                            customizeWebViewSettings customizewebviewsettings = this.values;
                            if (customizewebviewsettings != null) {
                                shopModel = customizewebviewsettings.setMin;
                            } else {
                                shopModel = null;
                            }
                            z = griverDefaultLoadingView2.getMin(marker, marker3, shopModel);
                            if (z || i3 == i2) {
                                break;
                            }
                            i3++;
                        }
                    } else {
                        z = false;
                    }
                    GriverDefaultLoadingView griverDefaultLoadingView3 = this.mapHelper;
                    if (griverDefaultLoadingView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                    }
                    customizeWebViewSettings customizewebviewsettings2 = this.values;
                    Pair<Marker, Marker> pair = this.FastBitmap$CoordinateSystem;
                    if (pair != null) {
                        marker2 = pair.getFirst();
                    }
                    ShopModel shopModel2 = (ShopModel) marker.getTag();
                    if (shopModel2 != null) {
                        if (customizewebviewsettings2 == null || marker2 == null || !customizewebviewsettings2.setMin.b.equals(shopModel2.b)) {
                            marker.setIcon(griverDefaultLoadingView3.length(shopModel2, false, !z));
                        } else {
                            marker2.setIcon(griverDefaultLoadingView3.length(shopModel2, true, !z));
                        }
                    }
                }
                if (i != lastIndex) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMin(Marker marker) {
        CascadingMenuPopup$HorizPosition<ShopModel> shopModelLiveData;
        if (marker.getTag() instanceof ShopModel) {
            Object tag = marker.getTag();
            if (tag != null) {
                ShopModel shopModel = (ShopModel) tag;
                MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
                ShopModel shopModel2 = null;
                if (!(merchantDetailBottomsheetView == null || (shopModelLiveData = merchantDetailBottomsheetView.getShopModelLiveData()) == null)) {
                    Object obj = shopModelLiveData.setMin;
                    if (obj != LiveData.setMax) {
                        shopModel2 = obj;
                    }
                    shopModel2 = shopModel2;
                }
                if (!Intrinsics.areEqual((Object) shopModel2, (Object) shopModel)) {
                    valueOf();
                    getMin(marker, shopModel);
                    MerchantDetailBottomsheetView merchantDetailBottomsheetView2 = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
                    if (merchantDetailBottomsheetView2 != null) {
                        merchantDetailBottomsheetView2.reset();
                        merchantDetailBottomsheetView2.getShopModelLiveData().getMax(shopModel);
                        merchantDetailBottomsheetView2.showMerchantDetailPreview(shopModel, p.setMin[this.invoke.ordinal()] != 1 ? TrackerKey.SourceType.NEARBY_MAPS : TrackerKey.SourceType.RESULT_ON_MAP);
                        BottomSheetBehavior bottomSheetBehavior = (LockableBaseBottomSheetBehavior) this.valueOf.getValue();
                        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$hide");
                        bottomSheetBehavior.setHideable(true);
                        bottomSheetBehavior.setState(5);
                    }
                    negativeListener.getMax getmax = this.photoPreviewPresenter;
                    if (getmax == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("photoPreviewPresenter");
                    }
                    getmax.length(shopModel);
                    GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
                    if (griverDefaultLoadingView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                    }
                    Location invokeSuspend2 = shopModel.invokeSuspend();
                    Intrinsics.checkNotNullExpressionValue(invokeSuspend2, "shopModel.location");
                    Intrinsics.checkNotNullParameter(invokeSuspend2, "$this$toGoogleLatLng");
                    LatLng latLng = new LatLng(invokeSuspend2.getLatitude(), invokeSuspend2.getLongitude());
                    GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
                    if (griverDefaultLoadingView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                    }
                    float f = griverDefaultLoadingView2.setMax != null ? griverDefaultLoadingView2.setMax.getCameraPosition().zoom : 17.0f;
                    if (griverDefaultLoadingView.setMax != null) {
                        griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, f));
                    }
                    if (getOpenHelper.length(length())) {
                        BottomSheetBehavior length2 = length();
                        Intrinsics.checkNotNullParameter(length2, "$this$hide");
                        length2.setHideable(true);
                        length2.setState(5);
                    }
                }
                invoke();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type id.dana.nearbyme.model.ShopModel");
            }
        } else if (marker.getTag() instanceof customizeWebViewSettings) {
            MerchantDetailBottomsheetView merchantDetailBottomsheetView3 = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView3 != null) {
                merchantDetailBottomsheetView3.reset();
            }
            valueOf();
            MerchantDetailBottomsheetView merchantDetailBottomsheetView4 = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView4 != null) {
                merchantDetailBottomsheetView4.hideMerchantDetailBottomsheet();
            }
            if (getOpenHelper.length(length())) {
                BottomSheetBehavior length3 = length();
                Intrinsics.checkNotNullParameter(length3, "$this$hide");
                length3.setHideable(true);
                length3.setState(5);
            }
            invoke();
        }
        return true;
    }

    private final void valueOf() {
        Marker second;
        Marker first;
        Pair<Marker, Marker> pair = this.FastBitmap$CoordinateSystem;
        if (!(pair == null || (first = pair.getFirst()) == null)) {
            first.remove();
        }
        Pair<Marker, Marker> pair2 = this.FastBitmap$CoordinateSystem;
        if (!(pair2 == null || (second = pair2.getSecond()) == null)) {
            second.setVisible(true);
        }
        this.FastBitmap$CoordinateSystem = null;
        this.values = null;
    }

    private final void setMax(List<? extends ShopModel> list) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-295080717, oncanceled);
            onCancelLoad.getMin(-295080717, oncanceled);
        }
        b();
        if (!list.isEmpty()) {
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            griverDefaultLoadingView.toIntRange = new LatLngBounds.Builder();
            List take = CollectionsKt.take(list, 100);
            getMax((List<? extends ShopModel>) take);
            getMin((List<? extends ShopModel>) take);
        }
    }

    private final void getMax(List<? extends ShopModel> list) {
        for (ShopModel shopModel : list) {
            shopModel.setDefaultImpl = list.size() - shopModel.getInterfaceDescriptor;
            if (shopModel.b != null) {
                getMin(shopModel);
            }
        }
    }

    private final void getMin(List<? extends ShopModel> list) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1737619177 == (max = dispatchOnCancelled.getMax(applicationContext, 1737619177)))) {
            onCanceled oncanceled = new onCanceled(1737619177, max, 512);
            onCancelLoad.setMax(1737619177, oncanceled);
            onCancelLoad.getMin(1737619177, oncanceled);
        }
        Iterable<ShopModel> iterable = list;
        ShopModel shopModel = (ShopModel) CollectionsKt.sortedWith(iterable, new setMax()).get(CollectionsKt.getLastIndex(list));
        if (this.toDoubleRange) {
            this.toDoubleRange = false;
            if (this.mapHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            LatLngBounds.Builder builder = griverDefaultLoadingView.toIntRange;
            Location location = this.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(location, "currentLocation");
            Intrinsics.checkNotNullParameter(location, "$this$toGoogleLatLng");
            GriverDefaultLoadingView.setMin(builder, new LatLng(location.getLatitude(), location.getLongitude()), shopModel.toFloatRange);
        } else {
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ShopModel shopModel2 : iterable) {
                GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
                if (griverDefaultLoadingView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                }
                LatLngBounds.Builder builder2 = griverDefaultLoadingView2.toIntRange;
                Location invokeSuspend2 = shopModel2.invokeSuspend();
                Intrinsics.checkNotNullExpressionValue(invokeSuspend2, "it.location");
                Intrinsics.checkNotNullParameter(invokeSuspend2, "$this$toGoogleLatLng");
                arrayList.add(builder2.include(new LatLng(invokeSuspend2.getLatitude(), invokeSuspend2.getLongitude())));
            }
        }
        setMin(true);
        GriverDefaultLoadingView griverDefaultLoadingView3 = this.mapHelper;
        if (griverDefaultLoadingView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        GriverDefaultLoadingView griverDefaultLoadingView4 = this.mapHelper;
        if (griverDefaultLoadingView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(griverDefaultLoadingView4.toIntRange.build(), (int) (Resources.getSystem().getDisplayMetrics().density * 48.0f));
        if (griverDefaultLoadingView3.setMax != null) {
            griverDefaultLoadingView3.setMax.animateCamera(newLatLngBounds);
        }
        setMin(false);
    }

    private final void setMin(boolean z) {
        if (z) {
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            MerchantFilterView merchantFilterView = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.access$101);
            int bottom = (merchantFilterView != null ? merchantFilterView.getBottom() : 0) + ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f));
            int Grayscale$Algorithm2 = Grayscale$Algorithm();
            if (griverDefaultLoadingView.setMax != null) {
                griverDefaultLoadingView.setMax.setPadding(0, bottom, 0, Grayscale$Algorithm2);
                return;
            }
            return;
        }
        GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
        if (griverDefaultLoadingView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView2.setMax != null) {
            griverDefaultLoadingView2.setMax.setPadding(0, 0, 0, 0);
        }
    }

    private final int Grayscale$Algorithm() {
        CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.api);
        if (cardView != null) {
            return ((int) (((LockableBaseBottomSheetBehavior) this.valueOf.getValue()).getHalfExpandedRatio() * ((float) cardView.getMeasuredHeight()))) - ((int) (Resources.getSystem().getDisplayMetrics().density * 36.0f));
        }
        return 0;
    }

    private final void getMin(ShopModel shopModel) {
        MarkerOptions length2 = length(shopModel);
        Marker marker = null;
        if (length2 == null) {
            length2 = null;
        } else if (setMin(shopModel)) {
            length2.visible(false);
        }
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView.setMax != null) {
            marker = griverDefaultLoadingView.setMax.addMarker(length2);
        }
        if (marker != null) {
            marker.setTag(shopModel);
            if (marker != null) {
                String str = shopModel.b;
                Intrinsics.checkNotNullExpressionValue(str, "shopModel.shopId");
                this.hashCode.put(str, marker);
                if (setMin(shopModel)) {
                    getMin(marker, shopModel);
                }
            }
        }
    }

    private final void getMin(Marker marker, ShopModel shopModel) {
        Marker first;
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
        if (griverDefaultLoadingView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        Marker addMarker = griverDefaultLoadingView.setMax != null ? griverDefaultLoadingView.setMax.addMarker(griverDefaultLoadingView2.getMin(shopModel)) : null;
        if (addMarker != null) {
            customizeWebViewSettings customizewebviewsettings = new customizeWebViewSettings(shopModel);
            this.values = customizewebviewsettings;
            addMarker.setTag(customizewebviewsettings);
            Pair<Marker, Marker> pair = this.FastBitmap$CoordinateSystem;
            if (!(pair == null || (first = pair.getFirst()) == null)) {
                first.remove();
            }
            this.FastBitmap$CoordinateSystem = new Pair<>(addMarker, marker);
            marker.setVisible(false);
        }
    }

    private final boolean setMin(ShopModel shopModel) {
        ShopModel shopModel2;
        customizeWebViewSettings customizewebviewsettings = this.values;
        if (customizewebviewsettings != null) {
            shopModel2 = customizewebviewsettings.setMin;
        } else {
            shopModel2 = null;
        }
        return Intrinsics.areEqual((Object) shopModel2, (Object) shopModel);
    }

    private final MarkerOptions length(ShopModel shopModel) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1672314000, oncanceled);
            onCancelLoad.getMin(1672314000, oncanceled);
        }
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        return griverDefaultLoadingView.getMax(shopModel);
    }

    private final void b() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1582811200, oncanceled);
            onCancelLoad.getMin(-1582811200, oncanceled);
        }
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.clear();
        }
        this.hashCode.clear();
        this.FastBitmap$CoordinateSystem = null;
        GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
        if (griverDefaultLoadingView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView2.IsOverlapping != null) {
            invokeSuspend();
        }
    }

    public final void updatePromoBadge(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        List listOf = CollectionsKt.listOf(shopModel);
        NewMerchantListView newMerchantListView = (NewMerchantListView) _$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.updateShops(listOf);
        }
    }

    public final void onBackPressed() {
        Fragment findFragmentByTag;
        if (this.invoke == MapState.SEARCH_RESULT && (findFragmentByTag = getSupportFragmentManager().findFragmentByTag("NearbySearchFragment")) != null && findFragmentByTag.isHidden()) {
            Fragment findFragmentByTag2 = getSupportFragmentManager().findFragmentByTag("NearbySearchFragment");
            if (findFragmentByTag2 != null) {
                new setColorFilter(getSupportFragmentManager()).length(findFragmentByTag2).setMin();
            }
            finish();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Object obj = null;
        if ((supportFragmentManager.setMin != null ? supportFragmentManager.setMin.size() : 0) != 0) {
            Object findFragmentByTag3 = getSupportFragmentManager().findFragmentByTag("NearbySearchFragment");
            if (findFragmentByTag3 instanceof NearbySearchFragment) {
                obj = findFragmentByTag3;
            }
            NearbySearchFragment nearbySearchFragment = (NearbySearchFragment) obj;
            if (nearbySearchFragment != null) {
                nearbySearchFragment.n_();
            }
            setMin();
            Location location = this.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(location, "currentLocation");
            length(location);
            return;
        }
        if (((MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu)).isMerchantDetailFullyDisplayed()) {
            MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView != null) {
                obj = merchantDetailView.getMerchantDetailState();
            }
            if (obj != MerchantDetailView.MerchantDetailState.ERROR) {
                setMin();
                ((MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu)).collapseBottomsheet();
                setMax(false);
                return;
            }
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void onNavigationEvent() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(2070044646, oncanceled);
            onCancelLoad.getMin(2070044646, oncanceled);
        }
        getWindow().clearFlags(512);
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.Layer);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(8);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        GriverProgressBar.UpdateRunnable updateRunnable = this.getMax;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.getMax = null;
        GriverProgressBar.UpdateRunnable updateRunnable2 = this.getMin;
        if (updateRunnable2 != null) {
            updateRunnable2.dispose();
        }
        this.getMin = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\"\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/nearbyrevamp/NewNearbyMeActivity$Companion;", "", "()V", "EXTRA_SHOP_MODEL", "", "EXTRA_TARGET_SCREEN", "HALF_EXPANDED_RATIO", "", "MAX_RETRY_LOCATION", "", "NEARBY_DETAIL_BOTTOMSHEET", "NEARBY_OTHER_STORE_BOTTOMSHEET", "USER_ZOOM_LEVEL", "openMerchantDetailBottomsheet", "", "context", "Landroid/content/Context;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "source", "merchantId", "shopId", "openOtherStoreBottomsheet", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @JvmStatic
        public static void setMax(@NotNull Context context, @Nullable String str, @Nullable String str2, @NotNull String str3) {
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext != null) {
                int length = str != null ? str.length() : 0;
                int min = dispatchOnCancelled.setMin(applicationContext, length);
                if (length != min) {
                    onCanceled oncanceled = new onCanceled(length, min, 8);
                    onCancelLoad.setMax(838653733, oncanceled);
                    onCancelLoad.getMin(838653733, oncanceled);
                }
            }
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str3, "source");
            Intent intent = new Intent(context, NewNearbyMeActivity.class);
            intent.putExtra("targetScreen", "nearby_detail_bottomsheet");
            intent.putExtra("EXTRA_SHOP_ID", str2);
            intent.putExtra("EXTRA_MERCHANT_ID", str);
            intent.putExtra("EXTRA_SOURCE", str3);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }

        @JvmStatic
        public static void setMax(@NotNull Context context, @NotNull ShopModel shopModel, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Intrinsics.checkNotNullParameter(str, "source");
            Intent intent = new Intent(context, NewNearbyMeActivity.class);
            intent.putExtra("targetScreen", "nearby_detail_bottomsheet");
            intent.putExtra("shopModel", shopModel);
            intent.putExtra("EXTRA_SOURCE", str);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }

        @JvmStatic
        public static void length(@NotNull Context context, @Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str2, "source");
            Intent intent = new Intent(context, NewNearbyMeActivity.class);
            intent.putExtra("targetScreen", "nearby_other_store");
            intent.putExtra("EXTRA_MERCHANT_ID", str);
            intent.putExtra("EXTRA_SOURCE", str2);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    public final void init() {
        int max;
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        boolean z = false;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(251266106, oncanceled);
            onCancelLoad.getMin(251266106, oncanceled);
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_SOURCE");
        getIntent().removeExtra("EXTRA_SOURCE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.getCause = stringExtra;
        BaseStoragePackage.setMax setmax = new BaseStoragePackage.setMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmax.getMin = applicationComponent;
            setmax.setMin = new NearbyMeModule(new equals(this));
            setmax.getMax = new MerchantDetailModule(new getMin(this));
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(-2020305522, oncanceled2);
                onCancelLoad.getMin(-2020305522, oncanceled2);
            }
            setmax.length = new MerchantModule(new getMax(this));
            setmax.setMax = new PhotoGalleryModule("", "", new isInside(this));
            stopIgnoring.setMin(setmax.setMin, NearbyMeModule.class);
            stopIgnoring.setMin(setmax.getMax, MerchantDetailModule.class);
            stopIgnoring.setMin(setmax.length, MerchantModule.class);
            stopIgnoring.setMin(setmax.setMax, PhotoGalleryModule.class);
            stopIgnoring.setMin(setmax.getMin, PrepareException.AnonymousClass1.class);
            new BaseStoragePackage(setmax.setMin, setmax.getMax, setmax.length, setmax.setMax, setmax.getMin, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[4];
            setTextSpacing.setMin setmin = this.nearbyPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            getminArr[0] = setmin;
            GriverTransActivity.Lite1.setMax setmax2 = this.merchantDetailPresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
            }
            getminArr[1] = setmax2;
            GetAboutInfoResult.getMax getmax = this.merchantCategoryPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryPresenter");
            }
            getminArr[2] = getmax;
            negativeListener.getMax getmax2 = this.photoPreviewPresenter;
            if (getmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("photoPreviewPresenter");
            }
            getminArr[3] = getmax2;
            registerPresenter(getminArr);
            setMenuLeftButton((int) id.dana.R.drawable.ic_close_white);
            int max3 = dispatchOnCancelled.getMax(0);
            if (max3 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max3, 16);
                onCancelLoad.setMax(-654044233, oncanceled3);
                onCancelLoad.getMin(-654044233, oncanceled3);
            }
            SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(id.dana.R.id.f54312131363989);
            if (supportMapFragment != null) {
                supportMapFragment.getMapAsync(this);
            }
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
            }
            griverDefaultLoadingView.equals = true;
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(resetInternal.setMax.setContentHeight);
            Intrinsics.checkNotNullExpressionValue(findFragmentById, "map");
            View view = findFragmentById.getView();
            if (view != null) {
                view.post(new getCause(this));
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
                onCanceled oncanceled4 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-523773342, oncanceled4);
                onCancelLoad.getMin(-523773342, oncanceled4);
            }
            CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.AnyThread);
            if (cardView != null) {
                cardView.setOnClickListener(new ICustomTabsCallback.Stub.Proxy(this));
            }
            CardView cardView2 = (CardView) _$_findCachedViewById(resetInternal.setMax.BoolRes);
            if (cardView2 != null) {
                cardView2.setOnClickListener(new setDefaultImpl(this));
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onSubmitQuery);
            if (appCompatTextView != null) {
                appCompatTextView.setOnClickListener(new getInterfaceDescriptor(this));
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.updateFocusedState);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setOnClickListener(new ICustomTabsService(this));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setView);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new getDefaultImpl(this));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.isInTouchMode);
            if (constraintLayout != null) {
                View view2 = constraintLayout;
                Context context2 = this;
                int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                getBluetoothAdapterState.getMax(view2, (Integer) null, Integer.valueOf(identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0), (Integer) null, (Integer) null, 13);
            }
            setMin();
            MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView != null) {
                BottomSheetBehavior from = BottomSheetBehavior.from((MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu));
                Intrinsics.checkNotNullExpressionValue(from, "from(mdbvMerchantDetailBottomsheet)");
                merchantDetailBottomsheetView.setBottomsheetBehavior(from);
                merchantDetailBottomsheetView.setDimBackground(_$_findCachedViewById(resetInternal.setMax.setContentPadding));
                merchantDetailBottomsheetView.addBottomsheetCallback(new onRelationshipValidationResult(this));
                if (getMin()) {
                    merchantDetailBottomsheetView.setInitialState(3);
                } else {
                    merchantDetailBottomsheetView.setInitialState(5);
                }
                merchantDetailBottomsheetView.setOnScrollListener(new onMessageChannelReady(this));
            }
            MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView != null) {
                merchantDetailView.setOnOtherStoreClicked(new extraCallbackWithResult(this));
            }
            onRestoreInstanceState onrestoreinstancestate = new onRestoreInstanceState();
            onrestoreinstancestate.setMax(((MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu)).getShopModelLiveData(), new onMeasure<X>(onrestoreinstancestate) {
                boolean length;
                final /* synthetic */ onRestoreInstanceState setMin;

                public final void onChanged(
/*
Method generation error in method: o.ExpandedMenuView.4.onChanged(java.lang.Object):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ExpandedMenuView.4.onChanged(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            Intrinsics.checkExpressionValueIsNotNull(onrestoreinstancestate, "Transformations.distinctUntilChanged(this)");
            onrestoreinstancestate.getMax(this, new NewNearbyMeActivity$FastBitmap$CoordinateSystem(this));
            LockableBaseBottomSheetBehavior lockableBaseBottomSheetBehavior = (LockableBaseBottomSheetBehavior) this.valueOf.getValue();
            lockableBaseBottomSheetBehavior.setFitToContents(false);
            lockableBaseBottomSheetBehavior.setHalfExpandedRatio(0.4f);
            lockableBaseBottomSheetBehavior.addBottomSheetCallback(new onPostMessage(this));
            if (getMin() || setMax()) {
                BottomSheetBehavior bottomSheetBehavior = lockableBaseBottomSheetBehavior;
                Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$hide");
                bottomSheetBehavior.setHideable(true);
                bottomSheetBehavior.setState(5);
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = lockableBaseBottomSheetBehavior;
                Intrinsics.checkNotNullParameter(bottomSheetBehavior2, "$this$expandHalf");
                bottomSheetBehavior2.setState(6);
            }
            NewMerchantListView newMerchantListView = (NewMerchantListView) _$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView != null) {
                newMerchantListView.setOnMerchantListClicked(new extraCallback(this));
            }
            NewMerchantListView newMerchantListView2 = (NewMerchantListView) _$_findCachedViewById(resetInternal.setMax.setSplitBackground);
            if (newMerchantListView2 != null) {
                newMerchantListView2.setOnLoadMoreClicked(new asBinder(this));
            }
            LockableBaseBottomSheetBehavior<FrameLayout> length4 = length();
            length4.setHalfExpandedRatio(0.4f);
            length4.setFitToContents(false);
            BottomSheetBehavior bottomSheetBehavior3 = length4;
            Intrinsics.checkNotNullParameter(bottomSheetBehavior3, "$this$hide");
            bottomSheetBehavior3.setHideable(true);
            bottomSheetBehavior3.setState(5);
            length4.addBottomSheetCallback(new onTransact(this));
            OtherStoreResultView otherStoreResultView = (OtherStoreResultView) _$_findCachedViewById(resetInternal.setMax.setTransitioning);
            if (otherStoreResultView != null) {
                otherStoreResultView.setOnShopLoaded(new ICustomTabsCallback.Stub(this));
                otherStoreResultView.setOnMerchantSearchClosed(new asInterface(otherStoreResultView, this));
                otherStoreResultView.setOnOtherStoreClickedListener(new ICustomTabsCallback.Default(this));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.isShuffleModeEnabledRemoved);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clContainer");
            View view3 = constraintLayout2;
            if (!ViewCompat.asInterface(view3) || view3.isLayoutRequested()) {
                view3.addOnLayoutChangeListener(new b(this));
            } else {
                LockableBaseBottomSheetBehavior access$getMerchantListBottomsheet$p = access$getMerchantListBottomsheet$p(this);
                View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.prepare);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "clLocationContainer");
                access$getMerchantListBottomsheet$p.setExpandedOffset(_$_findCachedViewById.getBottom() + ((int) (Resources.getSystem().getDisplayMetrics().density * 8.0f)));
                length().setExpandedOffset(access$getMerchantListBottomsheet$p(this).getExpandedOffset());
            }
            MerchantFilterView merchantFilterView = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.measureChildView);
            if (merchantFilterView != null) {
                merchantFilterView.setOnCategoryCheckedListener(new IsOverlapping(this, MerchantCategoryType.LIST));
            }
            MerchantFilterView merchantFilterView2 = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.access$101);
            if (merchantFilterView2 != null) {
                merchantFilterView2.setOnCategoryCheckedListener(new IsOverlapping(this, MerchantCategoryType.MAPS));
            }
            MerchantFilterView merchantFilterView3 = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.measureChildView);
            if (merchantFilterView3 != null) {
                merchantFilterView3.showShimmer();
            }
            MerchantFilterView merchantFilterView4 = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.access$101);
            if (merchantFilterView4 != null) {
                merchantFilterView4.showShimmer();
            }
            GetAboutInfoResult.getMax getmax3 = this.merchantCategoryPresenter;
            if (getmax3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryPresenter");
            }
            getmax3.getMax();
            GetAboutInfoResult.getMax getmax4 = this.merchantCategoryPresenter;
            if (getmax4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryPresenter");
            }
            getmax4.setMin();
            setTextSpacing.setMin setmin2 = this.nearbyPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin2.setMin(true);
            setTextSpacing.setMin setmin3 = this.nearbyPresenter;
            if (setmin3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin3.toFloatRange();
            setTextSpacing.setMin setmin4 = this.nearbyPresenter;
            if (setmin4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin4.toIntRange();
            setTextSpacing.setMin setmin5 = this.nearbyPresenter;
            if (setmin5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin5.equals();
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString("EXTRA_SHOP_ID", "") : null;
            if (getMin()) {
                this.invoke = MapState.MERCHANT_DETAIL;
            } else if (setMax()) {
                this.invoke = MapState.MERCHANT_OTHER_STORE;
            } else {
                CharSequence charSequence = string;
                if (charSequence == null || charSequence.length() == 0) {
                    setTextSpacing.setMin setmin6 = this.nearbyPresenter;
                    if (setmin6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
                    }
                    String stringExtra2 = getIntent().getStringExtra("EXTRA_MERCHANT_ID");
                    getIntent().removeExtra("EXTRA_MERCHANT_ID");
                    setmin6.length(stringExtra2);
                    String stringExtra3 = getIntent().getStringExtra(NearbyMeActivity.EXTRA_CATEGORY);
                    getIntent().removeExtra(NearbyMeActivity.EXTRA_CATEGORY);
                    CharSequence charSequence2 = stringExtra3;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        MerchantFilterView merchantFilterView5 = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.access$101);
                        if (merchantFilterView5 != null) {
                            merchantFilterView5.setPreselectedCategoryId(stringExtra3);
                        }
                        MerchantFilterView merchantFilterView6 = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.measureChildView);
                        if (merchantFilterView6 != null) {
                            merchantFilterView6.setPreselectedCategoryId(stringExtra3);
                        }
                    }
                    Intent intent2 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, IpcMessageConstants.EXTRA_INTENT);
                    Bundle extras2 = intent2.getExtras();
                    double d = extras2 != null ? extras2.getDouble(NearbyMeActivity.EXTRA_LOCATION_LAT) : 0.0d;
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, IpcMessageConstants.EXTRA_INTENT);
                    Bundle extras3 = intent3.getExtras();
                    double d2 = extras3 != null ? extras3.getDouble(NearbyMeActivity.EXTRA_LOCATION_LON) : 0.0d;
                    if (!(d == 0.0d || d2 == 0.0d)) {
                        Location location = new Location("");
                        location.setLatitude(d);
                        location.setLongitude(d2);
                        this.toIntRange = location;
                    }
                }
            }
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || 269195400 == (max = dispatchOnCancelled.getMax(context, 269195400)))) {
                onCanceled oncanceled5 = new onCanceled(269195400, max, 512);
                onCancelLoad.setMax(269195400, oncanceled5);
                onCancelLoad.getMin(269195400, oncanceled5);
            }
            CharSequence charSequence3 = this.getCause;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z = true;
            }
            if (!z) {
                t tVar = this.nearbyAnalyticTracker;
                if (tVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
                }
                tVar.setMax(this.getCause);
                return;
            }
            return;
        }
        throw null;
    }

    private final void toIntRange() {
        if (!getOpenHelper.length((LockableBaseBottomSheetBehavior) this.valueOf.getValue())) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onSubmitQuery);
            if (appCompatTextView != null) {
                View view = appCompatTextView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
            setMin((int) id.dana.R.id.f54742131364036);
            return;
        }
        setMin((int) id.dana.R.id.f44112131362936);
    }

    private final boolean Mean$Arithmetic() {
        MerchantDetailBottomsheetView merchantDetailBottomsheetView;
        if (getOpenHelper.setMin((LockableBaseBottomSheetBehavior) this.valueOf.getValue()) || getOpenHelper.setMin(length()) || ((merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) _$_findCachedViewById(resetInternal.setMax.hideOverflowMenu)) != null && merchantDetailBottomsheetView.isShowing())) {
            return true;
        }
        return false;
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(507799045, oncanceled);
            onCancelLoad.getMin(507799045, oncanceled);
        }
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (((setStateOn) this.create.getValue()).getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static final /* synthetic */ getCreateDate access$getMapFragment$p(NewNearbyMeActivity newNearbyMeActivity) {
        return (getCreateDate) newNearbyMeActivity.invokeSuspend.getValue();
    }

    public static final /* synthetic */ void access$onRefreshMerchantClicked(NewNearbyMeActivity newNearbyMeActivity) {
        newNearbyMeActivity.setMax(RefreshCondition.REFRESHING);
        newNearbyMeActivity.b();
        newNearbyMeActivity.length(false);
        newNearbyMeActivity.valueOf();
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.hideMerchantDetailBottomsheet();
        }
        BottomSheetBehavior bottomSheetBehavior = (LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue();
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$expandHalf");
        bottomSheetBehavior.setState(6);
        newNearbyMeActivity.toFloatRange();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$openNearbyExplore(id.dana.nearbyrevamp.NewNearbyMeActivity r11) {
        /*
            r11.onNavigationEvent()
            id.dana.nearbyrevamp.NewNearbyMeActivity$MapState r0 = r11.invoke
            id.dana.nearbyrevamp.NewNearbyMeActivity$MapState r1 = id.dana.nearbyrevamp.NewNearbyMeActivity.MapState.SEARCH_RESULT
            r2 = 0
            java.lang.String r3 = "NearbySearchFragment"
            r4 = 2130772014(0x7f01002e, float:1.7147134E38)
            r5 = 2130772012(0x7f01002c, float:1.714713E38)
            if (r0 != r1) goto L_0x0094
            androidx.fragment.app.FragmentManager r0 = r11.getSupportFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r3)
            if (r0 == 0) goto L_0x0093
            if (r0 == 0) goto L_0x008b
            r1 = r0
            id.dana.nearbyrevamp.search.NearbySearchFragment r1 = (id.dana.nearbyrevamp.search.NearbySearchFragment) r1
            java.lang.String r3 = "merchant"
            androidx.fragment.app.Fragment r1 = r1.setMax((java.lang.String) r3)
            boolean r3 = r1 instanceof id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment
            if (r3 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment r2 = (id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment) r2
            if (r2 == 0) goto L_0x0072
            o.GriverDefaultOpenSettingExtension$SettingChangeReceiver r1 = r2.setMin
            java.lang.String r3 = "merchantSearchResultAdapter"
            if (r1 != 0) goto L_0x003a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x003a:
            o.GriverDefaultOpenSettingExtension$SettingChangeReceiver r6 = r2.setMin
            if (r6 != 0) goto L_0x0041
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0041:
            java.util.List r6 = r6.getMax()
            java.lang.String r7 = "merchantSearchResultAdapter.items"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r8 = 20
            java.util.List r6 = kotlin.collections.CollectionsKt.take(r6, r8)
            r1.getMin(r6)
            o.GriverDefaultOpenSettingExtension$SettingChangeReceiver r1 = r2.setMin
            if (r1 != 0) goto L_0x005c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x005c:
            java.util.List r1 = r1.getMax()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
            java.lang.String r3 = "merchantSearchResultAdapter.items.last()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            id.dana.nearbyme.model.ShopModel r1 = (id.dana.nearbyme.model.ShopModel) r1
            int r1 = r1.getInterfaceDescriptor
            r2.isInside = r1
        L_0x0072:
            androidx.fragment.app.FragmentManager r11 = r11.getSupportFragmentManager()
            o.setColorFilter r1 = new o.setColorFilter
            r1.<init>(r11)
            r1.setMax = r5
            r1.isInside = r4
            r1.equals = r5
            r1.toIntRange = r4
            o.invalidateDrawable r11 = r1.getMax(r0)
            r11.setMin()
            return
        L_0x008b:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type id.dana.nearbyrevamp.search.NearbySearchFragment"
            r11.<init>(r0)
            throw r11
        L_0x0093:
            return
        L_0x0094:
            androidx.fragment.app.FragmentManager r0 = r11.getSupportFragmentManager()
            o.setColorFilter r1 = new o.setColorFilter
            r1.<init>(r0)
            r1.setMax = r5
            r1.isInside = r4
            r1.equals = r5
            r1.toIntRange = r4
            id.dana.nearbyrevamp.search.NearbySearchFragment$setMin r0 = id.dana.nearbyrevamp.search.NearbySearchFragment.setMax
            android.location.Location r0 = r11.toFloatRange
            java.lang.String r4 = "currentLocation"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.content.Context r4 = r11.getBaseContext()
            if (r4 == 0) goto L_0x00b8
            android.content.Context r2 = r4.getApplicationContext()
        L_0x00b8:
            if (r2 == 0) goto L_0x00d5
            java.lang.String[] r4 = r2.fileList()
            int r4 = r4.length
            int r2 = o.dispatchOnCancelled.getMin(r2, r4)
            if (r4 == r2) goto L_0x00d5
            o.onCanceled r5 = new o.onCanceled
            r6 = 32
            r5.<init>(r4, r2, r6)
            r2 = 2026968112(0x78d11430, float:3.3924984E34)
            o.onCancelLoad.setMax(r2, r5)
            o.onCancelLoad.getMin(r2, r5)
        L_0x00d5:
            id.dana.nearbyrevamp.NewNearbyMeActivity$length r2 = new id.dana.nearbyrevamp.NewNearbyMeActivity$length
            r2.<init>(r11)
            o.GriverDefaultOpenSettingExtension r2 = (o.GriverDefaultOpenSettingExtension) r2
            java.lang.String r4 = "location"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "nearbySearchResultListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            id.dana.nearbyrevamp.search.NearbySearchFragment r5 = new id.dana.nearbyrevamp.search.NearbySearchFragment
            r5.<init>()
            r6 = 2
            kotlin.Pair[] r7 = new kotlin.Pair[r6]
            r8 = 0
            double r9 = r0.getLatitude()
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            java.lang.String r10 = "latitude"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            r7[r8] = r9
            double r8 = r0.getLongitude()
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            java.lang.String r8 = "longitude"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r8, r0)
            r8 = 1
            r7[r8] = r0
            android.os.Bundle r0 = o.multiple.getMin(r7)
            r5.setArguments(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r5.setMin = r2
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r1.length(r0, r5, r3, r6)
            boolean r0 = r1.hashCode
            if (r0 == 0) goto L_0x0138
            r1.IsOverlapping = r8
            r1.toString = r3
            r1.setMin()
            id.dana.nearbyrevamp.NewNearbyMeActivity$MapState r0 = id.dana.nearbyrevamp.NewNearbyMeActivity.MapState.MERCHANT_LIST
            r11.invoke = r0
            android.location.Location r0 = r11.toFloatRange
            r11.extraCallback = r0
            return
        L_0x0138:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "This FragmentTransaction is not allowed to be added to the back stack."
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.NewNearbyMeActivity.access$openNearbyExplore(id.dana.nearbyrevamp.NewNearbyMeActivity):void");
    }

    public static final /* synthetic */ void access$resetState(NewNearbyMeActivity newNearbyMeActivity) {
        if (newNearbyMeActivity.invoke == MapState.SEARCH_RESULT) {
            newNearbyMeActivity.invoke = MapState.MERCHANT_LIST;
            newNearbyMeActivity.toFloatRange();
        }
    }

    public static final /* synthetic */ void access$refreshMerchantDetail(NewNearbyMeActivity newNearbyMeActivity, String str, String str2) {
        NewMerchantListView newMerchantListView = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.showShimmerMerchantList();
        }
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.onMerchantDetailRefreshed();
        }
        GriverTransActivity.Lite1.setMax setmax = newNearbyMeActivity.merchantDetailPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
        }
        setmax.setMin();
        GriverTransActivity.Lite1.setMax setmax2 = newNearbyMeActivity.merchantDetailPresenter;
        if (setmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
        }
        setmax2.setMax(str, str2);
    }

    public static final /* synthetic */ void access$showSearchResultBottomsheet(NewNearbyMeActivity newNearbyMeActivity) {
        if (getOpenHelper.length(newNearbyMeActivity.length())) {
            BottomSheetBehavior length2 = newNearbyMeActivity.length();
            Intrinsics.checkNotNullParameter(length2, "$this$hide");
            length2.setHideable(true);
            length2.setState(5);
        }
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.hideMerchantDetailBottomsheet();
        }
        NewMerchantListView newMerchantListView = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.clearMerchantList();
        }
        BottomSheetBehavior bottomSheetBehavior = (LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue();
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$expandHalf");
        bottomSheetBehavior.setState(6);
    }

    public static final /* synthetic */ void access$getPreviewImages(NewNearbyMeActivity newNearbyMeActivity, ShopModel shopModel) {
        negativeListener.getMax getmax = newNearbyMeActivity.photoPreviewPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoPreviewPresenter");
        }
        getmax.length(shopModel);
    }

    public static final /* synthetic */ void access$getNearbyAutoSearch(NewNearbyMeActivity newNearbyMeActivity) {
        Location location;
        newNearbyMeActivity.invoke = MapState.MERCHANT_LIST;
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.reset();
            merchantDetailBottomsheetView.hideMerchantDetailBottomsheet();
        }
        GriverDefaultLoadingView griverDefaultLoadingView = newNearbyMeActivity.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        if (griverDefaultLoadingView.setMax != null) {
            LatLng latLng = griverDefaultLoadingView.setMax.getCameraPosition().target;
            double d = latLng.latitude;
            double d2 = latLng.longitude;
            location = new Location("");
            location.setLatitude(d);
            location.setLongitude(d2);
        } else {
            location = null;
        }
        if (location != null) {
            newNearbyMeActivity.extraCallback = location;
            setTextSpacing.setMin setmin = newNearbyMeActivity.nearbyPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin.IsOverlapping();
            setTextSpacing.setMin setmin2 = newNearbyMeActivity.nearbyPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            setmin2.setMin(location, 5000);
        }
    }

    public static final /* synthetic */ void access$showLoading(NewNearbyMeActivity newNearbyMeActivity) {
        NewMerchantListView newMerchantListView = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.showShimmerMerchantList();
        }
    }

    public static final /* synthetic */ void access$setupMerchantShopListByPassedMerchantId(NewNearbyMeActivity newNearbyMeActivity, List list) {
        setTextSpacing.setMin setmin = newNearbyMeActivity.nearbyPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        if (setmin.getMax() == null) {
            newNearbyMeActivity.length((List<ShopModel>) list);
            return;
        }
        setTextSpacing.setMin setmin2 = newNearbyMeActivity.nearbyPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setTextSpacing.setMin setmin3 = newNearbyMeActivity.nearbyPresenter;
        if (setmin3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        List<ShopModel> length2 = setmin2.length(list, setmin3.getMax());
        Intrinsics.checkNotNullExpressionValue(length2, "nearbyPresenter.getListO…arbyPresenter.merchantId)");
        newNearbyMeActivity.length(length2);
        setTextSpacing.setMin setmin4 = newNearbyMeActivity.nearbyPresenter;
        if (setmin4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
        }
        setmin4.length((String) null);
    }

    public static final /* synthetic */ void access$updateShopModelInListAndMap(NewNearbyMeActivity newNearbyMeActivity, List list) {
        NewMerchantListView newMerchantListView = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.updateShops(list);
        }
    }

    public static final /* synthetic */ void access$setupBottomSheetWithSearchResult(NewNearbyMeActivity newNearbyMeActivity, List list, boolean z) {
        boolean z2 = false;
        newNearbyMeActivity.ICustomTabsCallback = false;
        NewMerchantListView newMerchantListView = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
        if (newMerchantListView != null) {
            newMerchantListView.removeLoading();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                NewMerchantListView newMerchantListView2 = (NewMerchantListView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setSplitBackground);
                if (newMerchantListView2 != null) {
                    newMerchantListView2.appendItem(list);
                    newNearbyMeActivity.setMax((List<? extends ShopModel>) newMerchantListView2.getMerchantList());
                    setTextSpacing.setMin setmin = newNearbyMeActivity.nearbyPresenter;
                    if (setmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
                    }
                    if (setmin.isInside()) {
                        newMerchantListView2.showLoadMore();
                    }
                    setTextSpacing.setMin setmin2 = newNearbyMeActivity.nearbyPresenter;
                    if (setmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
                    }
                    setmin2.getMax(z);
                    return;
                }
                return;
            }
            setTextSpacing.setMin setmin3 = newNearbyMeActivity.nearbyPresenter;
            if (setmin3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyPresenter");
            }
            if (setmin3.isInside()) {
                newMerchantListView.showLoadMore();
            }
        }
    }

    public static final /* synthetic */ void access$orderLayout(NewNearbyMeActivity newNearbyMeActivity) {
        newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.Layer).bringToFront();
        newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.prepare).bringToFront();
        ((MerchantFilterView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.access$101)).bringToFront();
        ((CoordinatorLayout) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.AnimatorRes)).bringToFront();
    }

    public static final /* synthetic */ void access$setupSearchBarShadow(NewNearbyMeActivity newNearbyMeActivity) {
        ConstraintLayout constraintLayout = (ConstraintLayout) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.startActivityForResult);
        if (constraintLayout == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            constraintLayout.setElevation(constraintLayout.getResources().getDimension(id.dana.R.dimen.f26272131165275));
            constraintLayout.setOutlineAmbientShadowColor(IntRange.setMax(constraintLayout.getContext(), id.dana.R.color.f21822131100099));
            constraintLayout.setOutlineSpotShadowColor(IntRange.setMax(constraintLayout.getContext(), id.dana.R.color.f21822131100099));
            constraintLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.startActivityForResult);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "cl_search_bar");
        View view = constraintLayout2;
        Intrinsics.checkNotNullParameter(view, "$this$elevate");
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        getBluetoothAdapterState.getMin(view, (int) TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    public static final /* synthetic */ void access$setAnchoredButtonVisibility(NewNearbyMeActivity newNearbyMeActivity, boolean z) {
        newNearbyMeActivity.getMax(z);
        AppCompatTextView appCompatTextView = (AppCompatTextView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.onSubmitQuery);
        if (appCompatTextView != null) {
            View view = appCompatTextView;
            int i = 0;
            boolean z2 = z && newNearbyMeActivity.isInside();
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static final /* synthetic */ LockableBaseBottomSheetBehavior access$getMerchantListBottomsheet$p(NewNearbyMeActivity newNearbyMeActivity) {
        return (LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue();
    }

    public static final /* synthetic */ void access$onHideMerchantDetailBottomsheet(NewNearbyMeActivity newNearbyMeActivity) {
        newNearbyMeActivity.setMin();
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.reset();
        }
        ((LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue()).getMin = false;
        if (newNearbyMeActivity.invoke == MapState.MERCHANT_OTHER_STORE) {
            newNearbyMeActivity.setMin((int) id.dana.R.id.f44122131362937);
            BottomSheetBehavior length2 = newNearbyMeActivity.length();
            Intrinsics.checkNotNullParameter(length2, "$this$expandHalf");
            length2.setState(6);
        } else if (!getOpenHelper.length((LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue())) {
            newNearbyMeActivity.setMin((int) id.dana.R.id.f44112131362936);
            BottomSheetBehavior bottomSheetBehavior = (LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue();
            Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$expandHalf");
            bottomSheetBehavior.setState(6);
        }
        newNearbyMeActivity.valueOf();
    }

    public static final /* synthetic */ void access$onExpandMerchantDetailBottomsheet(NewNearbyMeActivity newNearbyMeActivity) {
        MerchantFilterView merchantFilterView;
        newNearbyMeActivity.onNavigationEvent();
        newNearbyMeActivity.getMax(true);
        newNearbyMeActivity.toIntRange();
        ((MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu)).onMerchantDetailFullyShown();
        if (newNearbyMeActivity.invoke != MapState.MERCHANT_OTHER_STORE && (merchantFilterView = (MerchantFilterView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.access$101)) != null) {
            View view = merchantFilterView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
    }

    public static final /* synthetic */ void access$onCollapseMerchantDetailBottomsheet(NewNearbyMeActivity newNearbyMeActivity) {
        newNearbyMeActivity.setMin();
        newNearbyMeActivity.toIntRange();
        newNearbyMeActivity.getMax(false);
        newNearbyMeActivity.setMax(false);
    }

    public static final /* synthetic */ void access$openOtherStoreBottomsheet(NewNearbyMeActivity newNearbyMeActivity, ShopModel shopModel) {
        newNearbyMeActivity.b();
        newNearbyMeActivity.invoke = MapState.MERCHANT_OTHER_STORE;
        BottomSheetBehavior length2 = newNearbyMeActivity.length();
        Intrinsics.checkNotNullParameter(length2, "$this$expandHalf");
        length2.setState(6);
        BottomSheetBehavior bottomSheetBehavior = (LockableBaseBottomSheetBehavior) newNearbyMeActivity.valueOf.getValue();
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$hide");
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setState(5);
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if (merchantDetailBottomsheetView != null) {
            merchantDetailBottomsheetView.hideMerchantDetailBottomsheet();
        }
        OtherStoreResultView otherStoreResultView = (OtherStoreResultView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.setTransitioning);
        if (otherStoreResultView != null) {
            Location location = newNearbyMeActivity.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(location, "currentLocation");
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "shopModel.merchantId");
            otherStoreResultView.searchOtherMerchantByMerchantId(location, str, SearchType.MERCHANTID_SORTED_BY_DISTANCE, TrackerKey.SourceType.MERCHANT_DETAIL);
        }
    }

    public static final /* synthetic */ void access$hideMerchantDetailPreview(NewNearbyMeActivity newNearbyMeActivity) {
        MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
        if ((merchantDetailBottomsheetView == null || !merchantDetailBottomsheetView.isMerchantDetailFullyDisplayed()) && newNearbyMeActivity.values != null) {
            newNearbyMeActivity.valueOf();
            MerchantDetailBottomsheetView merchantDetailBottomsheetView2 = (MerchantDetailBottomsheetView) newNearbyMeActivity._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView2 != null) {
                merchantDetailBottomsheetView2.reset();
                merchantDetailBottomsheetView2.hideMerchantDetailBottomsheet();
            }
            newNearbyMeActivity.invoke();
        }
    }

    public static final /* synthetic */ void access$onLocationSettingNext(NewNearbyMeActivity newNearbyMeActivity, LocationSettingsResult locationSettingsResult) {
        IntentSender intentSender;
        if (locationSettingsResult != null && locationSettingsResult.getStatus() != null) {
            Status status = locationSettingsResult.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "it.status");
            int statusCode = status.getStatusCode();
            if (statusCode == 6) {
                Status status2 = locationSettingsResult.getStatus();
                Intrinsics.checkNotNullExpressionValue(status2, "it.status");
                PendingIntent resolution = status2.getResolution();
                if (resolution == null || (intentSender = resolution.getIntentSender()) == null) {
                    newNearbyMeActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                }
                try {
                    newNearbyMeActivity.startIntentSenderForResult(intentSender, 100, (Intent) null, 0, 0, 0, (Bundle) null);
                } catch (IntentSender.SendIntentException unused) {
                }
            } else if (statusCode != 8502) {
                newNearbyMeActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }
    }
}
