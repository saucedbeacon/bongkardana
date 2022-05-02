package id.dana.nearbyrevamp.search.searchresult;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.contract.deeplink.path.FeatureParams;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AddPhoneContactBridgeExtension;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0014¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyrevamp/search/searchresult/NearbySearchResultErrorView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getLayout", "setup", "", "show", "errorType", "Lid/dana/nearbyrevamp/search/searchresult/NearbySearchResultErrorView$ErrorType;", "keyword", "", "onTryAgain", "Lkotlin/Function0;", "ErrorType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NearbySearchResultErrorView extends BaseRichView {
    private HashMap length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/search/searchresult/NearbySearchResultErrorView$ErrorType;", "", "(Ljava/lang/String;I)V", "NETWORK_ERROR", "NO_RESULT_ERROR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum ErrorType {
        NETWORK_ERROR,
        NO_RESULT_ERROR
    }

    @JvmOverloads
    public NearbySearchResultErrorView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NearbySearchResultErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_error_search_result;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NearbySearchResultErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbySearchResultErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NearbySearchResultErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public static /* synthetic */ void show$default(NearbySearchResultErrorView nearbySearchResultErrorView, ErrorType errorType, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        nearbySearchResultErrorView.show(errorType, str, function0);
    }

    public final void show(@NotNull ErrorType errorType, @NotNull String str, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(errorType, GriverMonitorConstants.KEY_ERROR_TYPE);
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        int i = AddPhoneContactBridgeExtension.AnonymousClass2.getMin[errorType.ordinal()];
        if (i == 1) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSupportProgressBarVisibility);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.ic_network_error);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
            if (textView != null) {
                textView.setText(getContext().getString(R.string.network_error_nearby_search_title));
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.forceUniformHeight);
            if (textView2 != null) {
                textView2.setText(getContext().getString(R.string.network_error_nearby_search_desc));
            }
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.mayLaunchUrl);
            if (danaButtonSecondaryView != null) {
                View view = danaButtonSecondaryView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.mayLaunchUrl);
            if (danaButtonSecondaryView2 != null) {
                danaButtonSecondaryView2.setOnClickListener(new setMin(function0));
            }
        } else if (i == 2) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSupportProgressBarVisibility);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageResource(R.drawable.img_global_search_bottom_sheet_general_error);
            }
            TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
            if (textView3 != null) {
                textView3.setText(getContext().getString(R.string.keyword_empty_nearby_search_title, new Object[]{str}));
            }
            TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.forceUniformHeight);
            if (textView4 != null) {
                textView4.setText(getContext().getString(R.string.keyword_empty_nearby_search_desc));
            }
            DanaButtonSecondaryView danaButtonSecondaryView3 = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.mayLaunchUrl);
            if (danaButtonSecondaryView3 != null) {
                View view2 = danaButtonSecondaryView3;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ Function0 length;

        setMin(Function0 function0) {
            this.length = function0;
        }

        public final void onClick(View view) {
            Function0 function0 = this.length;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
