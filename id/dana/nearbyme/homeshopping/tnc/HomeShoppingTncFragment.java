package id.dana.nearbyme.homeshopping.tnc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.parser.JSONLexer;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.nearbyme.di.module.HomeShoppingTncModule;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import o.GriverRemoteDebugProxy;
import o.PrepareException;
import o.k;
import o.onActivityPreCreated;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u000bJ\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncFragment;", "Landroidx/fragment/app/Fragment;", "()V", "presenter", "Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncPresenter;", "getPresenter", "()Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncPresenter;", "setPresenter", "(Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncPresenter;)V", "getTnc", "", "()Lkotlin/Unit;", "loadTncFromAssetFile", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "setupComponent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HomeShoppingTncFragment extends Fragment {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    private HashMap getMin;
    @Inject
    public k.AnonymousClass8 presenter;

    public final View setMax(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_home_shopping_tnc, viewGroup, false);
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        String string;
        PrepareException.AnonymousClass1 applicationComponent;
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof BaseActivity)) {
            activity = null;
        }
        BaseActivity baseActivity = (BaseActivity) activity;
        if (!(baseActivity == null || (applicationComponent = baseActivity.getApplicationComponent()) == null)) {
            GriverRemoteDebugProxy.setMax setmax = new GriverRemoteDebugProxy.setMax((byte) 0);
            if (applicationComponent != null) {
                setmax.length = applicationComponent;
                setmax.getMin = new HomeShoppingTncModule(new setMin(this));
                stopIgnoring.setMin(setmax.getMin, HomeShoppingTncModule.class);
                stopIgnoring.setMin(setmax.length, PrepareException.AnonymousClass1.class);
                new GriverRemoteDebugProxy(setmax.getMin, setmax.length, (byte) 0).setMax(this);
                Unit unit = Unit.INSTANCE;
            } else {
                throw null;
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("HOME_SHOPPING_TNC_DATA_KEY")) == null) {
            WebView webView = (WebView) setMax(resetInternal.setMax.getVelocity);
            if (webView != null) {
                webView.loadUrl("file:///android_asset/nearby/home_shopping_tnc.html");
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            return;
        }
        k.AnonymousClass8 r0 = this.presenter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        Intrinsics.checkNotNullExpressionValue(string, "it");
        Intrinsics.checkNotNullParameter(string, "merchantId");
        r0.length.execute(string, new k.AnonymousClass8.length(r0.setMax), new k.AnonymousClass8.setMax(r0));
        Unit unit3 = Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/nearbyme/homeshopping/tnc/HomeShoppingTncFragment$setupComponent$1$1", "Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncContract$View;", "onGetTncError", "", "onGetTncSuccess", "tncHtmlText", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements k.AnonymousClass4.getMax {
        private static long getMin = 166589865758241578L;
        private static int length = 1;
        private static int setMin;
        final /* synthetic */ HomeShoppingTncFragment setMax;

        @JvmDefault
        public final void dismissProgress() {
            int i = setMin + 59;
            length = i % 128;
            if ((i % 2 == 0 ? 5 : '2') != '2') {
                Object obj = null;
                super.hashCode();
            }
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
            int i = length + 49;
            setMin = i % 128;
            if (i % 2 != 0) {
                Object obj = null;
                super.hashCode();
            }
        }

        @JvmDefault
        public final void showProgress() {
            int i = length + 71;
            setMin = i % 128;
            int i2 = i % 2;
        }

        setMin(HomeShoppingTncFragment homeShoppingTncFragment) {
            this.setMax = homeShoppingTncFragment;
        }

        public final void setMin(@NotNull String str) {
            int i = length + 33;
            setMin = i % 128;
            int i2 = i % 2;
            Intrinsics.checkNotNullParameter(str, "tncHtmlText");
            WebView webView = (WebView) this.setMax.setMax(resetInternal.setMax.getVelocity);
            if ((webView != null ? Typography.dollar : JSONLexer.EOI) == '$') {
                int i3 = length + 31;
                setMin = i3 % 128;
                int i4 = i3 % 2;
                webView.loadData(str, "text/html; charset=utf-8", getMin(new char[]{9945, 9868, 23518, 26784, 49873, 42179, 21897, 59932, 52442}).intern());
                int i5 = setMin + 69;
                length = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public final void getMax() {
            int i = setMin + 41;
            length = i % 128;
            if ((i % 2 == 0 ? 'U' : '0') != '0') {
                HomeShoppingTncFragment.setMax(this.setMax);
                Object obj = null;
                super.hashCode();
                return;
            }
            try {
                try {
                    HomeShoppingTncFragment.setMax(this.setMax);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        private static String getMin(char[] cArr) {
            int i = length + 91;
            setMin = i % 128;
            int i2 = i % 2;
            char[] length2 = onActivityPreCreated.length(getMin, cArr);
            int i3 = 4;
            while (true) {
                if ((i3 < length2.length ? 'b' : '7') == '7') {
                    return new String(length2, 4, length2.length - 4);
                }
                int i4 = setMin + 61;
                length = i4 % 128;
                if ((i4 % 2 == 0 ? (char) 17 : 12) != 17) {
                    length2[i3] = (char) ((int) (((long) (length2[i3] ^ length2[i3 % 4])) ^ (((long) (i3 - 4)) * getMin)));
                    i3++;
                } else {
                    length2[i3] = (char) ((int) (((long) (length2[i3] ^ length2[i3 * 4])) & (((long) (i3 + 3)) - getMin)));
                    i3 += 106;
                }
            }
        }
    }

    public final void onDestroyView() {
        k.AnonymousClass8 r0 = this.presenter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        r0.setMax();
        super.onDestroyView();
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncFragment$Companion;", "", "()V", "TNC_ASSET_URL", "", "TNC_DATA_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ Unit setMax(HomeShoppingTncFragment homeShoppingTncFragment) {
        WebView webView = (WebView) homeShoppingTncFragment.setMax(resetInternal.setMax.getVelocity);
        if (webView == null) {
            return null;
        }
        webView.loadUrl("file:///android_asset/nearby/home_shopping_tnc.html");
        return Unit.INSTANCE;
    }
}
