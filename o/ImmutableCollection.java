package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class ImmutableCollection extends setRepeatCount<keySet> implements onConsumerReady {

    final class ImmutableIterator implements RedDotDrawable {
        private final containsAll getMin;

        public ImmutableIterator(containsAll containsall) {
            this.getMin = containsall;
        }

        public final Object apply(Object obj) {
            return this.getMin.lambda$defaultButtonsIfEmpty$0((Throwable) obj);
        }
    }

    @Inject
    public ImmutableCollection(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<keySet> getFacadeClass() {
        return keySet.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<AnonymousClass1> getReferralTracker(int i, int i2) {
        ImmutableList immutableList = new ImmutableList();
        immutableList.envInfo = generateMobileEnvInfo();
        immutableList.pageNum = i;
        immutableList.pageSize = i2;
        return wrapper(new ImmutableBundle(immutableList));
    }
}
