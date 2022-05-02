package o;

import o.AppNode;

public class MergePaths$MergePathsMode extends setSpeed<AppNode.AnonymousClass5, getCurrentPageSnapshot> {
    /* access modifiers changed from: protected */
    public getCurrentPageSnapshot map(AppNode.AnonymousClass5 r1) {
        return tranform(r1);
    }

    private getCurrentPageSnapshot tranform(AppNode.AnonymousClass5 r3) {
        if (r3 == null) {
            return null;
        }
        getCurrentPageSnapshot getcurrentpagesnapshot = new getCurrentPageSnapshot();
        getcurrentpagesnapshot.setReferralDescription(r3.getReferralDescription());
        getcurrentpagesnapshot.setReferralEmptyImageUrl(r3.getReferralEmptyImageUrl());
        getcurrentpagesnapshot.setReferralImageUrl(r3.getReferralImageUrl());
        getcurrentpagesnapshot.setReferralTncDescription(r3.getReferralTncDescription());
        getcurrentpagesnapshot.setReferralTncUrl(r3.getReferralTncUrl());
        return getcurrentpagesnapshot;
    }
}
