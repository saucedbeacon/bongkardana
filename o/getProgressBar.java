package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.tutorial.TutorialFragment;
import o.getDuration;
import o.handleCloseEvent;

public final class getProgressBar implements getBindingAdapter<TutorialFragment> {
    @InjectedFieldSignature("id.dana.tutorial.TutorialFragment.tutorialPresenter")
    public static void setMin(TutorialFragment tutorialFragment, handleCloseEvent.setMax setmax) {
        tutorialFragment.tutorialPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.tutorial.TutorialFragment.readDeepLinkPropertiesPresenter")
    public static void length(TutorialFragment tutorialFragment, getDuration.length length) {
        tutorialFragment.readDeepLinkPropertiesPresenter = length;
    }
}
