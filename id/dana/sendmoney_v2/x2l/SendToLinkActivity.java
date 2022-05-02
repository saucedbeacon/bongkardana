package id.dana.sendmoney_v2.x2l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.sendmoney_v2.x2l.model.SocialLinkModel;
import id.dana.sendmoney_v2.x2l.view.SendToLinkSelectorView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setTitleBarBackDrawable;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lid/dana/sendmoney_v2/x2l/SendToLinkActivity;", "Lid/dana/base/BaseActivity;", "()V", "sendMoneyScenarioDirector", "Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorV2;", "getSendMoneyScenarioDirector", "()Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorV2;", "sendMoneyScenarioDirector$delegate", "Lkotlin/Lazy;", "configToolbar", "", "getLayout", "", "init", "onSocialLinkSelected", "selectedSocialLink", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendToLinkActivity extends BaseActivity {
    private HashMap getMax;
    private final Lazy getMin = LazyKt.lazy(new getMax(this));

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
        return R.layout.activity_send_to_link;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "Lkotlin/ParameterName;", "name", "selectedSocialLink", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function1<SocialLinkModel, Unit> {
        setMin(SendToLinkActivity sendToLinkActivity) {
            super(1, sendToLinkActivity, SendToLinkActivity.class, "onSocialLinkSelected", "onSocialLinkSelected(Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SocialLinkModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SocialLinkModel socialLinkModel) {
            Intrinsics.checkNotNullParameter(socialLinkModel, "p1");
            SendToLinkActivity.access$onSocialLinkSelected((SendToLinkActivity) this.receiver, socialLinkModel);
        }
    }

    public static final /* synthetic */ void access$onSocialLinkSelected(SendToLinkActivity sendToLinkActivity, SocialLinkModel socialLinkModel) {
        String str;
        int length;
        int min;
        int length2;
        Context baseContext = sendToLinkActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1840573892, oncanceled);
            onCancelLoad.getMin(-1840573892, oncanceled);
        }
        Bundle bundleWithSource = sendToLinkActivity.getBundleWithSource();
        bundleWithSource.putString("recipientType", "chat");
        if (!StringsKt.isBlank(socialLinkModel.setMin)) {
            str = socialLinkModel.setMin;
        } else {
            str = socialLinkModel.setMax;
        }
        bundleWithSource.putString("iconUrl", str);
        bundleWithSource.putParcelable("socilaLink", socialLinkModel);
        Context baseContext2 = sendToLinkActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-261196139, oncanceled2);
            onCancelLoad.getMin(-261196139, oncanceled2);
        }
        ((setTitleBarBackDrawable) sendToLinkActivity.getMin.getValue()).length(bundleWithSource);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorV2;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<setTitleBarBackDrawable> {
        final /* synthetic */ SendToLinkActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(SendToLinkActivity sendToLinkActivity) {
            super(0);
            this.this$0 = sendToLinkActivity;
        }

        @NotNull
        public final setTitleBarBackDrawable invoke() {
            return new setTitleBarBackDrawable(this.this$0);
        }
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_summary_x2l_toolbar_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public final void init() {
        SendToLinkSelectorView sendToLinkSelectorView = (SendToLinkSelectorView) _$_findCachedViewById(resetInternal.setMax.snapshot);
        if (sendToLinkSelectorView != null) {
            sendToLinkSelectorView.setOnSocialLinkSelected(new setMin(this));
        }
    }
}
