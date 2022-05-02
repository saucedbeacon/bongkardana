package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getBluetoothAdapterState;
import o.hideProgress;
import o.isValidPackage;
import o.onLoadChildren;
import o.resetInternal;
import o.setGlobalUserData;
import o.setOnWheelViewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001,B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0007J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lid/dana/nearbyrevamp/view/NearbySearchToolbar;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "keyword", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "listener", "Lid/dana/nearbyrevamp/view/NearbySearchToolbar$Listener;", "getListener", "()Lid/dana/nearbyrevamp/view/NearbySearchToolbar$Listener;", "setListener", "(Lid/dana/nearbyrevamp/view/NearbySearchToolbar$Listener;)V", "checkClearIcon", "", "clearFocusFromSearchBox", "clearText", "expandSearchBox", "focusEditText", "getLayout", "getSearchObserver", "Lio/reactivex/observers/DisposableObserver;", "Lcom/jakewharton/rxbinding2/widget/TextViewTextChangeEvent;", "onCancelClicked", "onSearchToolbarTextChanged", "text", "", "setText", "setTopPadding", "padding", "setup", "setupEditText", "shrinkSearchBox", "Listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NearbySearchToolbar extends BaseRichView {
    @Nullable
    private setMin getMax;
    private HashMap getMin;
    @NotNull
    private String setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyrevamp/view/NearbySearchToolbar$Listener;", "", "onBackPressed", "", "onCancel", "onClear", "onSearch", "keyword", "", "onSearchTextChanged", "text", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void getMin(@NotNull String str);

        void length();

        void length(@NotNull String str);

        void setMax();

        void setMin();
    }

    @JvmOverloads
    public NearbySearchToolbar(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NearbySearchToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_nearby_toolbar_search;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u000f"}, d2 = {"id/dana/extension/view/InputExtKt$onTextAfterChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_productionRelease", "id/dana/nearbyrevamp/view/NearbySearchToolbar$$special$$inlined$onTextAfterChanged$1"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements TextWatcher {
        final /* synthetic */ NearbySearchToolbar length;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public IsOverlapping(NearbySearchToolbar nearbySearchToolbar) {
            this.length = nearbySearchToolbar;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.length.setKeyword(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NearbySearchToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbySearchToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NearbySearchToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
    }

    @Nullable
    public final setMin getListener() {
        return this.getMax;
    }

    public final void setListener(@Nullable setMin setmin) {
        this.getMax = setmin;
    }

    @NotNull
    public final String getKeyword() {
        return this.setMax;
    }

    public final void setKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.setMax = str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.ivClear);
        if (appCompatImageView != null) {
            View view = appCompatImageView;
            int i = 0;
            boolean z = this.setMax.length() > 0;
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/nearbyrevamp/view/NearbySearchToolbar$getSearchObserver$1", "Lio/reactivex/observers/DisposableObserver;", "Lcom/jakewharton/rxbinding2/widget/TextViewTextChangeEvent;", "onComplete", "", "onError", "e", "", "onNext", "onTextChangeEvent", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends setGlobalUserData<isValidPackage> {
        final /* synthetic */ NearbySearchToolbar setMin;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
        }

        getMin(NearbySearchToolbar nearbySearchToolbar) {
            this.setMin = nearbySearchToolbar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            isValidPackage isvalidpackage = (isValidPackage) obj;
            Intrinsics.checkNotNullParameter(isvalidpackage, "onTextChangeEvent");
            EditText editText = (EditText) this.setMin._$_findCachedViewById(resetInternal.setMax.mask);
            if (editText != null && editText.isFocused()) {
                NearbySearchToolbar.access$onSearchToolbarTextChanged(this.setMin, isvalidpackage.text().toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ NearbySearchToolbar getMin;

        getMax(NearbySearchToolbar nearbySearchToolbar) {
            this.getMin = nearbySearchToolbar;
        }

        public final void onClick(View view) {
            setMin listener = this.getMin.getListener();
            if (listener != null) {
                listener.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ NearbySearchToolbar length;

        setMax(NearbySearchToolbar nearbySearchToolbar) {
            this.length = nearbySearchToolbar;
        }

        public final void onClick(View view) {
            NearbySearchToolbar.access$onCancelClicked(this.length);
        }
    }

    public final void setup() {
        Toolbar toolbar = (Toolbar) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawables);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new getMax(this));
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.tvCancel);
        if (textView != null) {
            textView.setOnClickListener(new setMax(this));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.ivClear);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new length(this));
        }
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.mask);
        if (editText != null) {
            onLoadChildren.textChangeEvents(editText).debounce(1, TimeUnit.SECONDS).observeOn(hideProgress.length()).subscribe(new getMin(this));
            editText.addTextChangedListener(new IsOverlapping(this));
            editText.setOnKeyListener(new toFloatRange(editText, this));
            editText.setOnFocusChangeListener(new toIntRange(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ NearbySearchToolbar setMin;

        length(NearbySearchToolbar nearbySearchToolbar) {
            this.setMin = nearbySearchToolbar;
        }

        public final void onClick(View view) {
            EditText editText = (EditText) this.setMin._$_findCachedViewById(resetInternal.setMax.mask);
            if (editText != null) {
                TextView textView = editText;
                Intrinsics.checkNotNullParameter(textView, "$this$clearText");
                textView.setText("");
            }
            setMin listener = this.setMin.getListener();
            if (listener != null) {
                listener.length();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey", "id/dana/nearbyrevamp/view/NearbySearchToolbar$setupEditText$1$3"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnKeyListener {
        final /* synthetic */ NearbySearchToolbar length;
        final /* synthetic */ EditText setMax;

        toFloatRange(EditText editText, NearbySearchToolbar nearbySearchToolbar) {
            this.setMax = editText;
            this.length = nearbySearchToolbar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(keyEvent, "event");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            setOnWheelViewListener.length((View) this.setMax);
            setMin listener = this.length.getListener();
            if (listener == null) {
                return false;
            }
            EditText editText = (EditText) this.setMax.findViewById(resetInternal.setMax.mask);
            Intrinsics.checkNotNullExpressionValue(editText, "etSearch");
            listener.length(editText.getText().toString());
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "id/dana/nearbyrevamp/view/NearbySearchToolbar$setupEditText$1$4"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnFocusChangeListener {
        final /* synthetic */ NearbySearchToolbar setMax;

        toIntRange(NearbySearchToolbar nearbySearchToolbar) {
            this.setMax = nearbySearchToolbar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.setMax.length();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void length() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.tvCancel);
        if (textView != null) {
            View view = textView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        Toolbar toolbar = (Toolbar) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawables);
        if (toolbar != null) {
            toolbar.setNavigationIcon((Drawable) null);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setExclusiveItemChecked);
        if (linearLayout != null) {
            getBluetoothAdapterState.setMin(linearLayout, Integer.valueOf((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)), (Integer) null, (Integer) null, 14);
        }
    }

    public final void clearText() {
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.mask);
        if (editText != null) {
            TextView textView = editText;
            Intrinsics.checkNotNullParameter(textView, "$this$clearText");
            textView.setText("");
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.tvCancel);
        if (textView2 != null) {
            View view = textView2;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
        Toolbar toolbar = (Toolbar) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawables);
        if (toolbar != null) {
            toolbar.setNavigationIcon((int) R.drawable.arrow_left_white);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setExclusiveItemChecked);
        if (linearLayout != null) {
            getBluetoothAdapterState.setMin(linearLayout, Integer.valueOf((int) (Resources.getSystem().getDisplayMetrics().density * 44.0f)), (Integer) null, (Integer) null, 14);
        }
        clearFocusFromSearchBox();
    }

    public final void clearFocusFromSearchBox() {
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.mask);
        if (editText != null) {
            setOnWheelViewListener.length((View) editText);
            editText.clearFocus();
        }
    }

    public final void focusEditText() {
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.mask);
        if (editText != null) {
            editText.requestFocus();
            setOnWheelViewListener.getMax((View) editText);
        }
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        setKeyword(str);
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.mask);
        if (editText != null) {
            editText.setText(str);
        }
        EditText editText2 = (EditText) _$_findCachedViewById(resetInternal.setMax.mask);
        if (editText2 != null) {
            editText2.clearFocus();
        }
        length();
    }

    public final void setTopPadding(int i) {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.seekTo);
        if (constraintLayout != null) {
            getBluetoothAdapterState.getMax(constraintLayout, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, 13);
        }
    }

    public static final /* synthetic */ void access$onSearchToolbarTextChanged(NearbySearchToolbar nearbySearchToolbar, CharSequence charSequence) {
        setMin setmin = nearbySearchToolbar.getMax;
        if (setmin != null) {
            setmin.getMin(String.valueOf(charSequence));
        }
    }

    public static final /* synthetic */ void access$onCancelClicked(NearbySearchToolbar nearbySearchToolbar) {
        setMin setmin = nearbySearchToolbar.getMax;
        if (setmin != null) {
            setmin.setMax();
        }
    }
}
