package id.dana.onboarding.welcome;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.home.HomeTabActivity;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lid/dana/onboarding/welcome/WelcomeActivity;", "Lid/dana/base/BaseActivity;", "()V", "getLayout", "", "init", "", "showWelcomePage", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WelcomeActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private HashMap getMax;

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
        return R.layout.activity_welcome;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ WelcomeActivity length;

        setMin(WelcomeActivity welcomeActivity) {
            this.length = welcomeActivity;
        }

        public final void run() {
            this.length.startActivity(new Intent(this.length, HomeTabActivity.class));
            this.length.overridePendingTransition(R.anim.f772130772049, R.anim.f802130772052);
            this.length.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/onboarding/welcome/WelcomeActivity$Companion;", "", "()V", "WELCOME_PAGE_DURATION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void init() {
        new Handler().postDelayed(new setMin(this), 1000);
    }
}
