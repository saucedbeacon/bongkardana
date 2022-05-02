package o;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import o.TitleBarRightButtonView;

public final class onLoadChildren {
    @CheckResult
    @NonNull
    public static TitleBarRightButtonView.AnonymousClass1<Integer> editorActions(@NonNull TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return editorActions(textView, AudioAttributesImplApi21.PREDICATE_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static TitleBarRightButtonView.AnonymousClass1<Integer> editorActions(@NonNull TextView textView, @NonNull getChildren<? super Integer> getchildren) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        AudioAttributesImplBaseParcelizer.checkNotNull(getchildren, "handled == null");
        return new getCurrentBrowserInfo(textView, getchildren);
    }

    @CheckResult
    @NonNull
    public static TitleBarRightButtonView.AnonymousClass1<setSessionToken> editorActionEvents(@NonNull TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return editorActionEvents(textView, AudioAttributesImplApi21.PREDICATE_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static TitleBarRightButtonView.AnonymousClass1<setSessionToken> editorActionEvents(@NonNull TextView textView, @NonNull getChildren<? super setSessionToken> getchildren) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        AudioAttributesImplBaseParcelizer.checkNotNull(getchildren, "handled == null");
        return new getBrowserRootHints(textView, getchildren);
    }

    @CheckResult
    @NonNull
    public static AudioAttributesImplBase<CharSequence> textChanges(@NonNull TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new notifyChildrenChanged(textView);
    }

    @CheckResult
    @NonNull
    public static AudioAttributesImplBase<isValidPackage> textChangeEvents(@NonNull TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new addSubscription(textView);
    }

    @CheckResult
    @NonNull
    public static AudioAttributesImplBase<getSessionToken> beforeTextChangeEvents(@NonNull TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new onSearch(textView);
    }

    @CheckResult
    @NonNull
    public static AudioAttributesImplBase<onCustomAction> afterTextChangeEvents(@NonNull TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new onLoadItem(textView);
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super CharSequence> text(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<CharSequence>() {
            public final void accept(CharSequence charSequence) {
                textView.setText(charSequence);
            }
        };
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super Integer> textRes(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<Integer>() {
            public final void accept(Integer num) {
                textView.setText(num.intValue());
            }
        };
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super CharSequence> error(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<CharSequence>() {
            public final void accept(CharSequence charSequence) {
                textView.setError(charSequence);
            }
        };
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super Integer> errorRes(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<Integer>() {
            public final void accept(Integer num) {
                TextView textView = textView;
                textView.setError(textView.getContext().getResources().getText(num.intValue()));
            }
        };
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super CharSequence> hint(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<CharSequence>() {
            public final void accept(CharSequence charSequence) {
                textView.setHint(charSequence);
            }
        };
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super Integer> hintRes(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<Integer>() {
            public final void accept(Integer num) {
                textView.setHint(num.intValue());
            }
        };
    }

    @CheckResult
    @NonNull
    public static RedDotManager<? super Integer> color(@NonNull final TextView textView) {
        AudioAttributesImplBaseParcelizer.checkNotNull(textView, "view == null");
        return new RedDotManager<Integer>() {
            public final void accept(Integer num) throws Exception {
                textView.setTextColor(num.intValue());
            }
        };
    }

    private onLoadChildren() {
        throw new AssertionError("No instances.");
    }
}
