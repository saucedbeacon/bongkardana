package id.dana.richview.globalsearch;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u000278B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001dJ\b\u0010\"\u001a\u00020\u0007H\u0016J\u0012\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0002J\u0006\u0010&\u001a\u00020\u001dJ\u0010\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)J\u001c\u0010*\u001a\u00020\u001d2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010/\u001a\u00020\u001dJ\u0006\u00100\u001a\u00020\u001dJ\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u001dH\u0002J\u000e\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0015R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0011R$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lid/dana/richview/globalsearch/ToolbarGlobalSearchView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "homeSearchListener", "Lid/dana/richview/globalsearch/ToolbarGlobalSearchView$HomeSearchListener;", "value", "", "inHomeMode", "setInHomeMode", "(Z)V", "inSeeAll", "setInSeeAll", "keyword", "", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "listener", "Lid/dana/richview/globalsearch/ToolbarGlobalSearchView$Listener;", "addTextChangedListener", "", "textWatcher", "Landroid/text/TextWatcher;", "clearPointerFocus", "clearSearch", "getLayout", "getSearchObserver", "Lio/reactivex/observers/DisposableObserver;", "Lcom/jakewharton/rxbinding2/widget/TextViewTextChangeEvent;", "hideClearSearchButton", "onSearchToolbarTextChanged", "text", "", "parseAttrs", "setGlobalSearchInHomeMode", "setGlobalSearchInSeeAll", "setHomeSearchListener", "setListener", "setMenuButtonListener", "setPointerFocus", "setup", "setupClearSearchListener", "setupSearchListener", "showClearSearchButton", "showKeyword", "keywordString", "HomeSearchListener", "Listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ToolbarGlobalSearchView extends BaseRichView {
    private boolean getMax;
    private boolean getMin;
    @NotNull
    private String length;
    /* access modifiers changed from: private */
    public length setMax;
    /* access modifiers changed from: private */
    public setMin setMin;
    private HashMap toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/richview/globalsearch/ToolbarGlobalSearchView$HomeSearchListener;", "", "onSearchBarClicked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/richview/globalsearch/ToolbarGlobalSearchView$Listener;", "", "onBackPressed", "", "onBackToPreviousFragment", "onClickClearButton", "onClickSearchButton", "text", "", "onSearchTextChanged", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void getMax();

        void getMin(@Nullable CharSequence charSequence);

        void getMin(@NotNull String str);

        void length();

        void setMin();
    }

    @JvmOverloads
    public ToolbarGlobalSearchView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ToolbarGlobalSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_toolbar_global_search;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"id/dana/component/extension/InputExtKt$onTextAfterChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "design_release"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements TextWatcher {
        final /* synthetic */ ToolbarGlobalSearchView getMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public equals(ToolbarGlobalSearchView toolbarGlobalSearchView) {
            this.getMax = toolbarGlobalSearchView;
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
            this.getMax.setKeyword(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToolbarGlobalSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToolbarGlobalSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = true;
        this.length = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ToolbarGlobalSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = true;
        this.length = "";
    }

    /* JADX INFO: finally extract failed */
    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (attributeSet != null) {
            setStyledAttributes(context, attributeSet, resetInternal.getMin.ChecksSdkIntAtLeast);
            try {
                int i = 0;
                boolean z = getStyledAttributes().getBoolean(0, false);
                this.getMax = z;
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getInflatedId);
                if (textView != null) {
                    View view = textView;
                    boolean z2 = !z;
                    Intrinsics.checkNotNullParameter(view, "$this$toggleVisibilityInvisible");
                    view.setVisibility(z2 ? 0 : 4);
                }
                if (z && (linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setHeaderInternal)) != null) {
                    getBluetoothAdapterState.getMin(linearLayout2, Float.valueOf(16.0f), (Float) null, Float.valueOf(16.0f), (Float) null, 10);
                }
                EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
                if (editText != null) {
                    if (z) {
                        editText.setKeyListener((KeyListener) null);
                        editText.setFocusable(false);
                        editText.setFocusableInTouchMode(false);
                        editText.setOnClickListener(new setMax(this, z));
                    } else {
                        editText.setOnFocusChangeListener(new getMax(editText));
                    }
                }
                boolean z3 = getStyledAttributes().getBoolean(1, false);
                this.getMin = z3;
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.jumpToCurrentState);
                if (appCompatImageView != null) {
                    View view2 = appCompatImageView;
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    if (!z3) {
                        i = 8;
                    }
                    view2.setVisibility(i);
                }
                if (z3 && (linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setHeaderInternal)) != null) {
                    getBluetoothAdapterState.getMin(linearLayout, Float.valueOf(44.0f), (Float) null, Float.valueOf(12.0f), (Float) null, 10);
                }
                TypedArray styledAttributes = getStyledAttributes();
                if (styledAttributes != null) {
                    styledAttributes.recycle();
                }
            } catch (Throwable th) {
                TypedArray styledAttributes2 = getStyledAttributes();
                if (styledAttributes2 != null) {
                    styledAttributes2.recycle();
                }
                throw th;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/richview/globalsearch/ToolbarGlobalSearchView$setGlobalSearchInHomeMode$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ boolean getMin;
        final /* synthetic */ ToolbarGlobalSearchView setMax;

        setMax(ToolbarGlobalSearchView toolbarGlobalSearchView, boolean z) {
            this.setMax = toolbarGlobalSearchView;
            this.getMin = z;
        }

        public final void onClick(View view) {
            length unused = this.setMax.setMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnFocusChangeListener {
        final /* synthetic */ EditText getMax;

        getMax(EditText editText) {
            this.getMax = editText;
        }

        public final void onFocusChange(View view, boolean z) {
            CharSequence charSequence;
            EditText editText = this.getMax;
            if (!z) {
                charSequence = editText.getContext().getString(R.string.text_looking_for_anything_in_DANA);
            }
            editText.setHint(charSequence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/richview/globalsearch/ToolbarGlobalSearchView$getSearchObserver$1", "Lio/reactivex/observers/DisposableObserver;", "Lcom/jakewharton/rxbinding2/widget/TextViewTextChangeEvent;", "onComplete", "", "onError", "e", "", "onNext", "onTextChangeEvent", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends setGlobalUserData<isValidPackage> {
        final /* synthetic */ ToolbarGlobalSearchView setMin;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
        }

        getMin(ToolbarGlobalSearchView toolbarGlobalSearchView) {
            this.setMin = toolbarGlobalSearchView;
        }

        public final /* synthetic */ void onNext(Object obj) {
            isValidPackage isvalidpackage = (isValidPackage) obj;
            Intrinsics.checkNotNullParameter(isvalidpackage, "onTextChangeEvent");
            EditText editText = (EditText) this.setMin._$_findCachedViewById(resetInternal.setMax.open);
            if (editText != null && editText.isFocused()) {
                this.setMin.onSearchToolbarTextChanged(isvalidpackage.text().toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnKeyListener {
        final /* synthetic */ ToolbarGlobalSearchView getMin;

        IsOverlapping(ToolbarGlobalSearchView toolbarGlobalSearchView) {
            this.getMin = toolbarGlobalSearchView;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(keyEvent, "event");
            if (keyEvent.getAction() != 1 || this.getMin.getKeyword().length() < 3) {
                return false;
            }
            setMin access$getListener$p = this.getMin.setMin;
            if (access$getListener$p != null) {
                EditText editText = (EditText) this.getMin._$_findCachedViewById(resetInternal.setMax.open);
                access$getListener$p.getMin(String.valueOf(editText != null ? editText.getText() : null));
            }
            setOnWheelViewListener.length((View) (EditText) this.getMin._$_findCachedViewById(resetInternal.setMax.open));
            setMin access$getListener$p2 = this.getMin.setMin;
            if (access$getListener$p2 == null) {
                return false;
            }
            access$getListener$p2.getMax();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ ToolbarGlobalSearchView getMax;

        toFloatRange(ToolbarGlobalSearchView toolbarGlobalSearchView) {
            this.getMax = toolbarGlobalSearchView;
        }

        public final void onClick(View view) {
            this.getMax.clearSearch();
            setMin access$getListener$p = this.getMax.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.length();
            }
        }
    }

    public final void setMenuButtonListener() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getInflatedId);
        if (textView != null) {
            textView.setOnClickListener(new toFloatRange(this));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.jumpToCurrentState);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new isInside(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ ToolbarGlobalSearchView length;

        isInside(ToolbarGlobalSearchView toolbarGlobalSearchView) {
            this.length = toolbarGlobalSearchView;
        }

        public final void onClick(View view) {
            setMin access$getListener$p = this.length.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.length();
            }
        }
    }

    @NotNull
    public final String getKeyword() {
        return this.length;
    }

    public final void setKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        this.length = str;
        if (str.length() == 0) {
            hideClearSearchButton();
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.dismiss);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
    }

    public final void setListener(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.setMin = setmin;
    }

    public final void setHomeSearchListener(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "homeSearchListener");
        this.setMax = length2;
    }

    public final void addTextChangedListener(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText != null) {
            editText.addTextChangedListener(textWatcher);
        }
    }

    public final void onSearchToolbarTextChanged(@Nullable CharSequence charSequence) {
        setMin setmin = this.setMin;
        if (setmin != null) {
            setmin.getMin(charSequence);
        }
    }

    public final void hideClearSearchButton() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.dismiss);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ ToolbarGlobalSearchView length;

        toIntRange(ToolbarGlobalSearchView toolbarGlobalSearchView) {
            this.length = toolbarGlobalSearchView;
        }

        public final void onClick(View view) {
            this.length.clearSearch();
            setMin access$getListener$p = this.length.setMin;
            if (access$getListener$p != null) {
                access$getListener$p.setMin();
            }
        }
    }

    public final void clearSearch() {
        Editable text;
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText != null && (text = editText.getText()) != null) {
            text.clear();
        }
    }

    public final void showKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "keywordString");
        setKeyword(str);
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText != null) {
            editText.setText(str);
        }
        EditText editText2 = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText2 != null) {
            editText2.setSelection(str.length());
        }
        EditText editText3 = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText3 != null) {
            editText3.clearFocus();
        }
    }

    public final void clearPointerFocus() {
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText != null) {
            editText.clearFocus();
        }
    }

    public final void setPointerFocus() {
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText != null) {
            editText.requestFocus();
        }
    }

    public final void setup() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.dismiss);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new toIntRange(this));
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setExpandedFormat);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new ToolbarGlobalSearchView$FastBitmap$CoordinateSystem(this));
        }
        onLoadChildren.textChangeEvents((EditText) _$_findCachedViewById(resetInternal.setMax.open)).debounce(2, TimeUnit.SECONDS).observeOn(hideProgress.length()).subscribe(new getMin(this));
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText != null) {
            editText.addTextChangedListener(new equals(this));
        }
        EditText editText2 = (EditText) _$_findCachedViewById(resetInternal.setMax.open);
        if (editText2 != null) {
            editText2.setOnKeyListener(new IsOverlapping(this));
        }
    }
}
