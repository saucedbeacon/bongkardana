package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.AppCompatDelegate$NightMode;
import o.ITrustedWebActivityCallback;
import o.MediaBrowserCompat$SearchResultReceiver;
import o.playFromSearch;
import o.prepareFromUri;
import o.removeQueueItem;
import o.removeQueueItemAt;

public class SearchView extends LinearLayoutCompat implements MediaBrowserCompat$SearchResultReceiver {
    static final boolean DBG = false;
    static final String LOG_TAG = "SearchView";
    static final getMin PRE_API_29_HIDDEN_METHOD_INVOKER = (Build.VERSION.SDK_INT < 29 ? new getMin() : null);
    private final int FastBitmap$CoordinateSystem;
    private final CharSequence Grayscale$Algorithm;
    private CharSequence ICustomTabsCallback;
    private int ICustomTabsCallback$Default;
    private boolean ICustomTabsCallback$Stub;
    private final AdapterView.OnItemSelectedListener ICustomTabsCallback$Stub$Proxy;
    private final WeakHashMap<String, Drawable.ConstantState> ICustomTabsService;
    private Rect IsOverlapping;
    private setMin Mean$Arithmetic;
    private Bundle asBinder;
    private Runnable asInterface;
    private boolean b;
    private boolean create;
    private Rect equals;
    private int extraCallback;
    private CharSequence extraCallbackWithResult;
    private TextWatcher extraCommand;
    private boolean getCause;
    private final View.OnClickListener getDefaultImpl;
    private final AdapterView.OnItemClickListener getInterfaceDescriptor;
    private final View getMax;
    private final View getMin;
    private final Intent hashCode;
    private length invoke;
    private View.OnClickListener invokeSuspend;
    private final ImageView isInside;
    private final View length;
    final ImageView mCloseButton;
    final ImageView mGoButton;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    final ImageView mSearchButton;
    final SearchAutoComplete mSearchSrcTextView;
    SearchableInfo mSearchable;
    AppCompatDelegate$NightMode mSuggestionsAdapter;
    View.OnKeyListener mTextKeyListener;
    final ImageView mVoiceButton;
    private boolean onMessageChannelReady;
    private boolean onNavigationEvent;
    private CharSequence onPostMessage;
    private boolean onRelationshipValidationResult;
    private final Runnable onTransact;
    private final TextView.OnEditorActionListener setDefaultImpl;
    private final View setMax;
    private setMax setMin;
    private final Drawable toDoubleRange;
    private int[] toFloatRange;
    private int[] toIntRange;
    private final Intent toString;
    private getMax valueOf;
    private final int values;

    public interface getMax {
        boolean length();
    }

    public interface length {
        boolean getMin();

        boolean setMax();
    }

    public interface setMin {
        boolean setMin();
    }

    public SearchView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.ICustomTabsCallback$Stub$Proxy);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IsOverlapping = new Rect();
        this.equals = new Rect();
        this.toIntRange = new int[2];
        this.toFloatRange = new int[2];
        this.onTransact = new Runnable() {
            public final void run() {
                SearchView.this.updateFocusedState();
            }
        };
        this.asInterface = new Runnable() {
            public final void run() {
                if (SearchView.this.mSuggestionsAdapter instanceof removeQueueItem) {
                    SearchView.this.mSuggestionsAdapter.setMin((Cursor) null);
                }
            }
        };
        this.ICustomTabsService = new WeakHashMap<>();
        this.getDefaultImpl = new View.OnClickListener() {
            public final void onClick(View view) {
                if (view == SearchView.this.mSearchButton) {
                    SearchView.this.onSearchClicked();
                } else if (view == SearchView.this.mCloseButton) {
                    SearchView.this.onCloseClicked();
                } else if (view == SearchView.this.mGoButton) {
                    SearchView.this.onSubmitQuery();
                } else if (view == SearchView.this.mVoiceButton) {
                    SearchView.this.onVoiceClicked();
                } else if (view == SearchView.this.mSearchSrcTextView) {
                    SearchView.this.forceSuggestionQuery();
                }
            }
        };
        this.mTextKeyListener = new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.mSearchable == null) {
                    return false;
                }
                if (SearchView.this.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                    return SearchView.this.onSuggestionsKey(view, i, keyEvent);
                }
                if (SearchView.this.mSearchSrcTextView.isEmpty() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.launchQuerySearch(0, (String) null, searchView.mSearchSrcTextView.getText().toString());
                return true;
            }
        };
        this.setDefaultImpl = new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.onSubmitQuery();
                return true;
            }
        };
        this.getInterfaceDescriptor = new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.onItemClicked(i, 0, (String) null);
            }
        };
        this.ICustomTabsCallback$Stub$Proxy = new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.onItemSelected(i);
            }
        };
        this.extraCommand = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.onTextChanged(charSequence);
            }
        };
        prepareFromUri min = prepareFromUri.getMin(context, attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.IMediaSession$Stub$Proxy, i, 0);
        LayoutInflater.from(context).inflate(min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat, ITrustedWebActivityCallback.Stub.equals.Mean$Arithmetic), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.getDefaultImpl);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.getMin = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.ICustomTabsCallback$Stub);
        this.setMax = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.asInterface);
        this.getMax = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.warmup);
        this.mSearchButton = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.onPostMessage);
        this.mGoButton = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.onTransact);
        this.mCloseButton = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.ICustomTabsCallback$Default);
        this.mVoiceButton = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.getInterfaceDescriptor);
        this.isInside = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.asBinder);
        ViewCompat.getMin(this.setMax, min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.ParcelableVolumeInfo));
        ViewCompat.getMin(this.getMax, min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$RepeatMode));
        this.mSearchButton.setImageDrawable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$ShuffleMode));
        this.mGoButton.setImageDrawable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.postToHandler));
        this.mCloseButton.setImageDrawable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub));
        this.mVoiceButton.setImageDrawable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$ErrorCode));
        this.isInside.setImageDrawable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$ShuffleMode));
        this.toDoubleRange = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$CustomAction);
        removeQueueItemAt.setMax(this.mSearchButton, getResources().getString(ITrustedWebActivityCallback.Stub.IsOverlapping.Mean$Arithmetic));
        this.values = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$State, ITrustedWebActivityCallback.Stub.equals.valueOf);
        this.FastBitmap$CoordinateSystem = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.MediaSessionCompat$QueueItem, 0);
        this.mSearchButton.setOnClickListener(this.getDefaultImpl);
        this.mCloseButton.setOnClickListener(this.getDefaultImpl);
        this.mGoButton.setOnClickListener(this.getDefaultImpl);
        this.mVoiceButton.setOnClickListener(this.getDefaultImpl);
        this.mSearchSrcTextView.setOnClickListener(this.getDefaultImpl);
        this.mSearchSrcTextView.addTextChangedListener(this.extraCommand);
        this.mSearchSrcTextView.setOnEditorActionListener(this.setDefaultImpl);
        this.mSearchSrcTextView.setOnItemClickListener(this.getInterfaceDescriptor);
        this.mSearchSrcTextView.setOnItemSelectedListener(this.ICustomTabsCallback$Stub$Proxy);
        this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        this.mSearchSrcTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.mOnQueryTextFocusChangeListener != null) {
                    SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.MediaSessionCompat$Token, true));
        int dimensionPixelSize = min.setMin.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.Grayscale$Algorithm = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.MediaSessionCompat$ResultReceiverWrapper);
        this.ICustomTabsCallback = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$Actions);
        int i2 = min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.MediaSessionCompat$SessionFlags, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.MediaSessionCompat$MediaSessionImplApi21$ExtraSession, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.MediaControllerCompat$Callback$StubCompat, true));
        min.setMin.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.toString = intent;
        intent.addFlags(268435456);
        this.toString.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.hashCode = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.mSearchSrcTextView.getDropDownAnchor());
        this.length = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.adjustDropDownSizeAndPosition();
                }
            });
        }
        setMin(this.getCause);
        String queryHint = getQueryHint();
        this.mSearchSrcTextView.setHint(getMin(queryHint == null ? "" : queryHint));
    }

    public int getSuggestionRowLayout() {
        return this.values;
    }

    public int getSuggestionCommitIconResId() {
        return this.FastBitmap$CoordinateSystem;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            this.mSearchSrcTextView.setThreshold(searchableInfo.getSuggestThreshold());
            this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
            int inputType = this.mSearchable.getInputType();
            int i = 1;
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.mSearchable.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.mSearchSrcTextView.setInputType(inputType);
            AppCompatDelegate$NightMode appCompatDelegate$NightMode = this.mSuggestionsAdapter;
            if (appCompatDelegate$NightMode != null) {
                appCompatDelegate$NightMode.setMin((Cursor) null);
            }
            if (this.mSearchable.getSuggestAuthority() != null) {
                removeQueueItem removequeueitem = new removeQueueItem(getContext(), this, this.mSearchable, this.ICustomTabsService);
                this.mSuggestionsAdapter = removequeueitem;
                this.mSearchSrcTextView.setAdapter(removequeueitem);
                removeQueueItem removequeueitem2 = (removeQueueItem) this.mSuggestionsAdapter;
                if (this.create) {
                    i = 2;
                }
                removequeueitem2.setMax = i;
            }
            CharSequence queryHint = getQueryHint();
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            if (queryHint == null) {
                queryHint = "";
            }
            searchAutoComplete.setHint(getMin(queryHint));
        }
        boolean length2 = length();
        this.onRelationshipValidationResult = length2;
        if (length2) {
            this.mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        setMin(isIconified());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.asBinder = bundle;
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.onMessageChannelReady || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            setMin(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.onMessageChannelReady = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.onMessageChannelReady = false;
    }

    public void setOnQueryTextListener(getMax getmax) {
        this.valueOf = getmax;
    }

    public void setOnCloseListener(setMin setmin) {
        this.Mean$Arithmetic = setmin;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnSuggestionListener(length length2) {
        this.invoke = length2;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.invokeSuspend = onClickListener;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.onPostMessage = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.ICustomTabsCallback = charSequence;
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getMin(queryHint));
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.ICustomTabsCallback;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.Grayscale$Algorithm;
        }
        return getContext().getText(this.mSearchable.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.getCause != z) {
            this.getCause = z;
            setMin(z);
            CharSequence queryHint = getQueryHint();
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            if (queryHint == null) {
                queryHint = "";
            }
            searchAutoComplete.setHint(getMin(queryHint));
        }
    }

    public boolean isIconfiedByDefault() {
        return this.getCause;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public boolean isIconified() {
        return this.onNavigationEvent;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.b = z;
        setMin(isIconified());
    }

    public boolean isSubmitButtonEnabled() {
        return this.b;
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.create = z;
        AppCompatDelegate$NightMode appCompatDelegate$NightMode = this.mSuggestionsAdapter;
        if (appCompatDelegate$NightMode instanceof removeQueueItem) {
            ((removeQueueItem) appCompatDelegate$NightMode).setMax = z ? 2 : 1;
        }
    }

    public boolean isQueryRefinementEnabled() {
        return this.create;
    }

    public void setSuggestionsAdapter(AppCompatDelegate$NightMode appCompatDelegate$NightMode) {
        this.mSuggestionsAdapter = appCompatDelegate$NightMode;
        this.mSearchSrcTextView.setAdapter(appCompatDelegate$NightMode);
    }

    public AppCompatDelegate$NightMode getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public void setMaxWidth(int i) {
        this.extraCallback = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.extraCallback;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.extraCallback;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.isInside), size);
        } else if (mode == 0) {
            size = this.extraCallback;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.isInside);
            }
        } else if (mode == 1073741824 && (i3 = this.extraCallback) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.toFloatRange), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.toFloatRange);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            Rect rect = this.IsOverlapping;
            searchAutoComplete.getLocationInWindow(this.toIntRange);
            getLocationInWindow(this.toFloatRange);
            int[] iArr = this.toIntRange;
            int i5 = iArr[1];
            int[] iArr2 = this.toFloatRange;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.equals.set(this.IsOverlapping.left, 0, this.IsOverlapping.right, i4 - i2);
            setMax setmax = this.setMin;
            if (setmax == null) {
                setMax setmax2 = new setMax(this.equals, this.IsOverlapping, this.mSearchSrcTextView);
                this.setMin = setmax2;
                setTouchDelegate(setmax2);
                return;
            }
            setmax.setMax(this.equals, this.IsOverlapping);
        }
    }

    private void setMin(boolean z) {
        this.onNavigationEvent = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        getMax(z2);
        this.getMin.setVisibility(z ? 8 : 0);
        if (this.isInside.getDrawable() == null || this.getCause) {
            i = 8;
        }
        this.isInside.setVisibility(i);
        setMax();
        getMin(!z2);
        getMin();
    }

    private boolean length() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.toString;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.hashCode;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean getMax() {
        return (this.b || this.onRelationshipValidationResult) && !isIconified();
    }

    private void getMax(boolean z) {
        this.mGoButton.setVisibility((!this.b || !getMax() || !hasFocus() || (!z && this.onRelationshipValidationResult)) ? 8 : 0);
    }

    private void getMin() {
        this.getMax.setVisibility((!getMax() || !(this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 8 : 0);
    }

    private void setMax() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = 0;
        if (!z2 && (!this.getCause || this.ICustomTabsCallback$Stub)) {
            z = false;
        }
        ImageView imageView = this.mCloseButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.setMax.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.getMax.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.onTransact);
        post(this.asInterface);
        super.onDetachedFromWindow();
    }

    public void onQueryRefine(CharSequence charSequence) {
        getMax(charSequence);
    }

    /* access modifiers changed from: package-private */
    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.ensureImeVisible();
                return true;
            } else if (i != 19 || this.mSearchSrcTextView.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private CharSequence getMin(CharSequence charSequence) {
        if (!this.getCause || this.toDoubleRange == null) {
            return charSequence;
        }
        double textSize = (double) this.mSearchSrcTextView.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.toDoubleRange.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.toDoubleRange), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void getMin(boolean z) {
        int i = 8;
        if (this.onRelationshipValidationResult && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.onPostMessage = text;
        boolean z = !TextUtils.isEmpty(text);
        getMax(z);
        getMin(!z);
        setMax();
        getMin();
        if (this.valueOf != null) {
            TextUtils.equals(charSequence, this.extraCallbackWithResult);
        }
        this.extraCallbackWithResult = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            getMax getmax = this.valueOf;
            if (getmax == null || !getmax.length()) {
                if (this.mSearchable != null) {
                    launchQuerySearch(0, (String) null, text.toString());
                }
                this.mSearchSrcTextView.setImeVisibility(false);
                this.mSearchSrcTextView.dismissDropDown();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.getCause) {
            setMin setmin = this.Mean$Arithmetic;
            if (setmin == null || !setmin.setMin()) {
                clearFocus();
                setMin(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onSearchClicked() {
        setMin(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.invokeSuspend;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                String str = null;
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.toString);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    if (searchActivity != null) {
                        str = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", str);
                    getContext().startActivity(intent);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    Intent intent2 = this.hashCode;
                    ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                    Intent intent3 = new Intent("android.intent.action.SEARCH");
                    intent3.setComponent(searchActivity2);
                    PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent3, 1073741824);
                    Bundle bundle = new Bundle();
                    if (this.asBinder != null) {
                        bundle.putParcelable("app_data", this.asBinder);
                    }
                    Intent intent4 = new Intent(intent2);
                    String str2 = "free_form";
                    int i = 1;
                    Resources resources = getResources();
                    if (searchableInfo.getVoiceLanguageModeId() != 0) {
                        str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                    }
                    String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                    String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                    if (searchableInfo.getVoiceMaxResults() != 0) {
                        i = searchableInfo.getVoiceMaxResults();
                    }
                    intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
                    intent4.putExtra("android.speech.extra.PROMPT", string);
                    intent4.putExtra("android.speech.extra.LANGUAGE", string2);
                    intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                    if (searchActivity2 != null) {
                        str = searchActivity2.flattenToShortString();
                    }
                    intent4.putExtra("calling_package", str);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    getContext().startActivity(intent4);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onTextFocusChanged() {
        setMin(isIconified());
        post(this.onTransact);
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.onTransact);
    }

    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        setMin(true);
        this.mSearchSrcTextView.setImeOptions(this.ICustomTabsCallback$Default);
        this.ICustomTabsCallback$Stub = false;
    }

    public void onActionViewExpanded() {
        if (!this.ICustomTabsCallback$Stub) {
            this.ICustomTabsCallback$Stub = true;
            int imeOptions = this.mSearchSrcTextView.getImeOptions();
            this.ICustomTabsCallback$Default = imeOptions;
            this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
            this.mSearchSrcTextView.setText("");
            setIconified(false);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean length;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.length = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.length));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.length);
            sb.append("}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.length = isIconified();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setMin(savedState.length);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void adjustDropDownSizeAndPosition() {
        int i;
        if (this.length.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.setMax.getPaddingLeft();
            Rect rect = new Rect();
            boolean max = playFromSearch.getMax(this);
            int dimensionPixelSize = this.getCause ? resources.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.length) + resources.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.equals) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (max) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i);
            this.mSearchSrcTextView.setDropDownWidth((((this.length.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean onItemClicked(int i, int i2, String str) {
        length length2 = this.invoke;
        if (length2 != null && length2.getMin()) {
            return false;
        }
        getMin(i);
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mSearchSrcTextView.dismissDropDown();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean onItemSelected(int i) {
        length length2 = this.invoke;
        if (length2 != null && length2.setMax()) {
            return false;
        }
        Editable text = this.mSearchSrcTextView.getText();
        Cursor length3 = this.mSuggestionsAdapter.length();
        if (length3 == null) {
            return true;
        }
        if (length3.moveToPosition(i)) {
            CharSequence min = this.mSuggestionsAdapter.getMin(length3);
            if (min != null) {
                getMax(min);
                return true;
            }
            getMax((CharSequence) text);
            return true;
        }
        getMax((CharSequence) text);
        return true;
    }

    private boolean getMin(int i) {
        Cursor length2 = this.mSuggestionsAdapter.length();
        if (length2 == null || !length2.moveToPosition(i)) {
            return false;
        }
        Intent max = setMax(length2);
        if (max == null) {
            return true;
        }
        try {
            getContext().startActivity(max);
            return true;
        } catch (RuntimeException unused) {
            return true;
        }
    }

    private void getMax(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(setMin("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    private Intent setMin(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.onPostMessage);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.asBinder;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent setMax(android.database.Cursor r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = o.removeQueueItem.setMax(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.mSearchable     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = o.removeQueueItem.setMax(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.mSearchable     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = o.removeQueueItem.setMax(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = o.removeQueueItem.setMax(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = o.removeQueueItem.setMax(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r7 = 0
            r8 = 0
            r2 = r9
            android.content.Intent r10 = r2.setMin(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r10
        L_0x0061:
            r10.getPosition()     // Catch:{ RuntimeException -> 0x0064 }
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setMax(android.database.Cursor):android.content.Intent");
    }

    /* access modifiers changed from: package-private */
    public void forceSuggestionQuery() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.mSearchSrcTextView.refreshAutoCompleteResults();
            return;
        }
        getMin getmin = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        getMin.getMin();
        if (getmin.setMin != null) {
            try {
                getmin.setMin.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        getMin getmin2 = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchAutoComplete2 = this.mSearchSrcTextView;
        getMin.getMin();
        if (getmin2.getMax != null) {
            try {
                getmin2.getMax.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static class setMax extends TouchDelegate {
        private boolean equals;
        private final Rect getMax = new Rect();
        private final Rect getMin = new Rect();
        private final Rect length = new Rect();
        private final View setMax;
        private final int setMin;

        public setMax(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.setMin = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            setMax(rect, rect2);
            this.setMax = view;
        }

        public final void setMax(Rect rect, Rect rect2) {
            this.getMin.set(rect);
            this.length.set(rect);
            Rect rect3 = this.length;
            int i = this.setMin;
            rect3.inset(-i, -i);
            this.getMax.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.equals
                r7.equals = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.equals
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.length
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.getMin
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.equals = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0074
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.getMax
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.setMax
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.setMax
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006e
            L_0x005f:
                android.graphics.Rect r2 = r7.getMax
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r7.getMax
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006e:
                android.view.View r0 = r7.setMax
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0074:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setMax.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private boolean getMax;
        private int length;
        final Runnable mRunShowSoftInputIfNecessary;
        private SearchView setMax;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.Mean$Arithmetic);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mRunShowSoftInputIfNecessary = new Runnable() {
                public final void run() {
                    SearchAutoComplete.this.showSoftInputIfNecessary();
                }
            };
            this.length = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (float) ((i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? PsExtractor.AUDIO_STREAM : BlobStatic.MONITOR_IMAGE_WIDTH : 256), displayMetrics));
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.setMax = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.length = i;
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.setMax.hasFocus() && getVisibility() == 0) {
                this.getMax = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    ensureImeVisible();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.setMax.onTextFocusChanged();
        }

        public boolean enoughToFilter() {
            return this.length <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.setMax.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.getMax) {
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                post(this.mRunShowSoftInputIfNecessary);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: package-private */
        public void showSoftInputIfNecessary() {
            if (this.getMax) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.getMax = false;
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.getMax = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.getMax = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.getMax = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void ensureImeVisible() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            getMin getmin = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
            getMin.getMin();
            if (getmin.setMax != null) {
                try {
                    getmin.setMax.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class getMin {
        Method getMax = null;
        Method setMax = null;
        Method setMin = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        getMin() {
            if (Build.VERSION.SDK_INT < 29) {
                try {
                    Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                    this.setMin = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                    this.getMax = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused2) {
                }
                Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
                try {
                    Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                    this.setMax = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused3) {
                }
            } else {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        static void getMin() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }
}
