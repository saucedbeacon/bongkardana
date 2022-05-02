package com.alibaba.ariver.resource.prepare.controller;

import com.alibaba.ariver.resource.api.prepare.PrepareStep;
import com.alibaba.ariver.resource.api.prepare.StepCreator;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.prepare.steps.DownloadStep;
import com.alibaba.ariver.resource.prepare.steps.SetupStep;
import com.alibaba.ariver.resource.prepare.steps.StartStep;
import com.alibaba.ariver.resource.prepare.steps.UpdateStep;

class DefaultStepCreator implements StepCreator {
    DefaultStepCreator() {
    }

    /* renamed from: com.alibaba.ariver.resource.prepare.controller.DefaultStepCreator$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$resource$api$prepare$StepType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.alibaba.ariver.resource.api.prepare.StepType[] r0 = com.alibaba.ariver.resource.api.prepare.StepType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$resource$api$prepare$StepType = r0
                com.alibaba.ariver.resource.api.prepare.StepType r1 = com.alibaba.ariver.resource.api.prepare.StepType.SETUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$resource$api$prepare$StepType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.resource.api.prepare.StepType r1 = com.alibaba.ariver.resource.api.prepare.StepType.UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$resource$api$prepare$StepType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.resource.api.prepare.StepType r1 = com.alibaba.ariver.resource.api.prepare.StepType.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alibaba$ariver$resource$api$prepare$StepType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.ariver.resource.api.prepare.StepType r1 = com.alibaba.ariver.resource.api.prepare.StepType.START     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.prepare.controller.DefaultStepCreator.AnonymousClass1.<clinit>():void");
        }
    }

    public PrepareStep createStep(StepType stepType) {
        int i = AnonymousClass1.$SwitchMap$com$alibaba$ariver$resource$api$prepare$StepType[stepType.ordinal()];
        if (i == 1) {
            return new SetupStep();
        }
        if (i == 2) {
            return new UpdateStep();
        }
        if (i == 3) {
            return new DownloadStep();
        }
        if (i != 4) {
            return null;
        }
        return new StartStep();
    }
}
