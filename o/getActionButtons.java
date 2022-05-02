package o;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import id.dana.R;
import id.dana.danah5.tooltip.TooltipResultFactory;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.List;
import o.PhotoView;
import o.setCheckBoxPrompt;

public class getActionButtons {
    private static final String DRAWABLE = "drawable";
    private static final String LIST = "list";
    private static final String SLIDESHOW = "slideshow";
    private static final int SPOTLIGHT_SIZE = ((int) (Resources.getSystem().getDisplayMetrics().density * 20.0f));
    private static final String VIEW_PAGER = "viewPager";
    /* access modifiers changed from: private */
    public Activity activity;
    private BridgeCallback bridgeCallback;
    /* access modifiers changed from: private */
    public setActionButtons fragmentResultHandler;

    public getActionButtons(Activity activity2, BridgeCallback bridgeCallback2) {
        this.bridgeCallback = bridgeCallback2;
        this.activity = activity2;
    }

    public boolean openBottomSheet(setCheckBoxPrompt setcheckboxprompt) {
        return checkEventType(setcheckboxprompt, setcheckboxprompt.getType());
    }

    private boolean checkEventType(setCheckBoxPrompt setcheckboxprompt, String str) {
        if (!"viewPager".equalsIgnoreCase(str) && !"list".equalsIgnoreCase(str) && !"slideshow".equalsIgnoreCase(str)) {
            return false;
        }
        handleBottomSheet(setcheckboxprompt, str);
        return true;
    }

    private void handleBottomSheet(setCheckBoxPrompt setcheckboxprompt, final String str) {
        if (isTooltipEntityValid(setcheckboxprompt) && !this.activity.isFinishing()) {
            setActionButtons build = setActionButtons.build(this.activity, createTooltipBundle(setcheckboxprompt));
            this.fragmentResultHandler = build;
            build.addListener(new setStackButtons$core() {
                public final void onFragmentCreated(setActionButtons setactionbuttons, Bundle bundle) {
                    Intent intent;
                    OnBoardingModel onBoardingModel = (OnBoardingModel) bundle.getParcelable("data");
                    if ("viewPager".equalsIgnoreCase(str) || "slideshow".equalsIgnoreCase(str)) {
                        intent = BottomSheetOnBoardingActivity.createOnBoardingIntent(setactionbuttons.getActivity(), onBoardingModel);
                    } else if ("list".equalsIgnoreCase(str)) {
                        intent = BottomSheetHelpActivity.createBottomSheetHelpIntent(setactionbuttons.getActivity(), onBoardingModel);
                    } else {
                        return;
                    }
                    getActionButtons.this.openBottomSheet(intent);
                }

                public final void onActivityResult(int i, int i2, Intent intent) {
                    getActionButtons.this.sendResult(i2 == -1);
                    getActionButtons.this.fragmentResultHandler.destroy(getActionButtons.this.activity);
                }
            });
        }
    }

    public void openShowCase(getVisibleButtons getvisiblebuttons) {
        setUseAmcsLite createTargetFrom = createTargetFrom(getvisiblebuttons.getTitle(), getvisiblebuttons.getBody());
        if (createTargetFrom != null) {
            createTargetFrom.isInside = true;
            initRect initrect = new initRect(this.activity);
            initrect.toString = createTargetFrom;
            ((initRect) ((initRect) initrect.length(true)).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    getActionButtons.this.sendResult(true);
                }
            })).length();
        }
    }

    /* access modifiers changed from: private */
    public void openBottomSheet(Intent intent) {
        this.fragmentResultHandler.startActivityForResult(intent, 201);
    }

    private Bundle createTooltipBundle(setCheckBoxPrompt setcheckboxprompt) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", new OnBoardingModel(setcheckboxprompt.getTitle(), setcheckboxprompt.getType(), getContentOnBoardingModels(setcheckboxprompt), setcheckboxprompt.getBizType().toLowerCase()));
        return bundle;
    }

    private List<ContentOnBoardingModel> getContentOnBoardingModels(setCheckBoxPrompt setcheckboxprompt) {
        ArrayList arrayList = new ArrayList();
        for (setCheckBoxPrompt.length contentOnBoardingModel : setcheckboxprompt.getPages()) {
            arrayList.add(getContentOnBoardingModel(contentOnBoardingModel));
        }
        return arrayList;
    }

    private ContentOnBoardingModel getContentOnBoardingModel(setCheckBoxPrompt.length length) {
        if (isPageImageFromURL(length)) {
            return new ContentOnBoardingModel(length.getImage(), length.getTitle(), length.getBody());
        }
        return new ContentOnBoardingModel(getResourceFromName(length.getImage()), length.getTitle(), length.getBody());
    }

    private boolean isPageImageFromURL(setCheckBoxPrompt.length length) {
        return "URL".equalsIgnoreCase(length.getImageSource());
    }

    private int getResourceFromName(String str) {
        return this.activity.getResources().getIdentifier(str, DRAWABLE, this.activity.getPackageName());
    }

    /* access modifiers changed from: private */
    public void sendResult(boolean z) {
        this.bridgeCallback.sendJSONResponse(TooltipResultFactory.getResult(z ? "SUCCESS" : "UNKNOWN_ERROR"));
    }

    private boolean isTooltipEntityValid(setCheckBoxPrompt setcheckboxprompt) {
        return setcheckboxprompt != null && setcheckboxprompt.getPages() != null && !setcheckboxprompt.getPages().isEmpty() && !TextUtils.isEmpty(setcheckboxprompt.getBizType());
    }

    private setUseAmcsLite createTargetFrom(String str, String str2) {
        View findViewById = this.activity.findViewById(R.id.f45092131363048);
        if (findViewById == null) {
            return null;
        }
        return ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this.activity).getMax(findViewById)).setMin(new getUseSecurityGuard((float) SPOTLIGHT_SIZE))).getMin(new access$1402(str, str2, 0))).getMin();
    }
}
