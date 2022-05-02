package o;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.domain.profilemenu.model.ProfileCompletion;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.myprofile.viewholder.ProfileMenuAppVersionViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuHeaderViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuPaymentAuthViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuUserKYBViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuUserServiceViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.Nullable;

public final class DefaultToastImplExtension extends RecyclerView.Adapter<Ignore<SettingModel>> {
    public final isQwertyMode<SettingModel> getMax = new isQwertyMode<>((RecyclerView.Adapter) this, new toast());
    public Ignore.setMin length;

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        Ignore ignore = (Ignore) valueof;
        ignore.setIsRecyclable(ignore.getItemViewType() == 13);
        ignore.setMax(this.getMax.getMin.get(i));
        ignore.setMin(this.length);
    }

    public final int getItemCount() {
        return this.getMax.getMin.size();
    }

    public final boolean getMin(int i) {
        return i >= 0 && i < getItemCount();
    }

    public final int length(String str) {
        SettingModel settingModel;
        for (int i = 0; i < getItemCount(); i++) {
            if (getMin(i)) {
                settingModel = (SettingModel) this.getMax.getMin.get(i);
            } else {
                settingModel = SettingModel.empty();
            }
            if (!settingModel.isNullObject() && str.equals(settingModel.getName())) {
                return i;
            }
        }
        return -1;
    }

    public final boolean setMax() {
        return this.getMax.getMin.isEmpty();
    }

    public final int getItemViewType(int i) {
        SettingModel settingModel;
        if (getMin(i)) {
            settingModel = (SettingModel) this.getMax.getMin.get(i);
        } else {
            settingModel = SettingModel.empty();
        }
        return settingModel.getViewType();
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ProfileMenuHeaderViewHolder(viewGroup);
        }
        if (i == 10) {
            return new getAppDesc(viewGroup);
        }
        if (i == 3) {
            return new ProfileMenuUserKYBViewHolder(viewGroup);
        }
        if (i == 4) {
            return new ProfileMenuAppVersionViewHolder(viewGroup);
        }
        if (i == 5) {
            return new IpcMsgServerService(viewGroup);
        }
        if (i == 6) {
            return new ProfileMenuPaymentAuthViewHolder(viewGroup);
        }
        if (i == 12) {
            return new setIconUrl(viewGroup);
        }
        if (i != 13) {
            return new ProfileMenuUserServiceViewHolder(viewGroup);
        }
        return new Ignore<SettingModel>(viewGroup) {
            private ProfileCompletion getMax;

            public final /* synthetic */ void setMax(Object obj) {
                SettingModel settingModel = (SettingModel) obj;
                if (!(settingModel instanceof ProfileCompletion)) {
                    settingModel = null;
                }
                ProfileCompletion profileCompletion = (ProfileCompletion) settingModel;
                if (profileCompletion != null) {
                    this.getMax = profileCompletion;
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    ImageView imageView = (ImageView) view.findViewById(resetInternal.setMax.setPadding);
                    if (imageView != null) {
                        imageView.setImageResource(length(profileCompletion) ? R.drawable.ic_profile_completion_verify : R.drawable.ic_profile_completion_default);
                    }
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    TextView textView = (TextView) view2.findViewById(resetInternal.setMax.layoutChildLeft);
                    if (textView != null) {
                        textView.setText(length(profileCompletion) ? R.string.lbl_profile_completion_title_finished : R.string.lbl_profile_completion_title_default);
                    }
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    ProgressBar progressBar = (ProgressBar) view3.findViewById(resetInternal.setMax.onInitializeAccessibilityEvent);
                    if (progressBar != null) {
                        progressBar.setProgress(profileCompletion.getCompletedTaskCount());
                    }
                    View view4 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                    TextView textView2 = (TextView) view4.findViewById(resetInternal.setMax.shouldCollapse);
                    int i = 0;
                    if (textView2 != null) {
                        textView2.setText(this.length.getString(R.string.lbl_profile_completion_steps, new Object[]{Integer.valueOf(profileCompletion.getCompletedTaskCount())}));
                    }
                    if (!length(profileCompletion)) {
                        View view5 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                        TextView textView3 = (TextView) view5.findViewById(resetInternal.setMax.getChildTop);
                        if (textView3 != null) {
                            String string = this.length.getString(R.string.lbl_profile_completion_desc_default, new Object[]{profileCompletion.getCurrentTaskTitle()});
                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …skTitle\n                )");
                            setMin(textView3, string, profileCompletion.getCurrentTaskTitle());
                        }
                    } else if (profileCompletion.isKycRevoked()) {
                        View view6 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                        TextView textView4 = (TextView) view6.findViewById(resetInternal.setMax.getChildTop);
                        if (textView4 != null) {
                            String string2 = this.length.getString(R.string.lbl_profile_completion_desc_finished_non_kyc);
                            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…on_desc_finished_non_kyc)");
                            String string3 = this.length.getString(R.string.lbl_profile_completion_keyword_dana_premium);
                            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ion_keyword_dana_premium)");
                            setMin(textView4, string2, string3);
                        }
                    } else {
                        View view7 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                        TextView textView5 = (TextView) view7.findViewById(resetInternal.setMax.getChildTop);
                        if (textView5 != null) {
                            textView5.setText(R.string.lbl_profile_completion_desc_finished_kyc);
                        }
                    }
                    View view8 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                    ImageView imageView2 = (ImageView) view8.findViewById(resetInternal.setMax.initialize);
                    if (imageView2 != null) {
                        imageView2.setVisibility(length(profileCompletion) ? 4 : 0);
                    }
                    View view9 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                    ImageButton imageButton = (ImageButton) view9.findViewById(resetInternal.setMax.AlertController$RecycleListView);
                    if (imageButton != null) {
                        View view10 = imageButton;
                        boolean length = length(profileCompletion);
                        Intrinsics.checkNotNullParameter(view10, "<this>");
                        if (!length) {
                            i = 8;
                        }
                        view10.setVisibility(i);
                    }
                }
            }

            {
                Intrinsics.checkNotNullParameter(r3, "parent");
            }

            public final void setMin(@Nullable Ignore.setMin setmin) {
                ProfileCompletion profileCompletion = this.getMax;
                if (profileCompletion == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("profileCompletion");
                }
                if (!length(profileCompletion)) {
                    this.itemView.setOnClickListener(new getMax(this, setmin));
                }
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                ImageButton imageButton = (ImageButton) view.findViewById(resetInternal.setMax.AlertController$RecycleListView);
                if (imageButton != null) {
                    imageButton.setOnClickListener(new setMax(this, setmin));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.IpcMsgServerService$1$getMax */
            static final class getMax implements View.OnClickListener {
                final /* synthetic */ Ignore.setMin length;
                final /* synthetic */ AnonymousClass1 setMax;

                getMax(AnonymousClass1 r1, Ignore.setMin setmin) {
                    this.setMax = r1;
                    this.length = setmin;
                }

                public final void onClick(View view) {
                    Ignore.setMin setmin = this.length;
                    if (setmin != null) {
                        setmin.length(this.setMax.getAdapterPosition());
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.IpcMsgServerService$1$setMax */
            static final class setMax implements View.OnClickListener {
                final /* synthetic */ Ignore.setMin setMax;
                final /* synthetic */ AnonymousClass1 setMin;

                setMax(AnonymousClass1 r1, Ignore.setMin setmin) {
                    this.setMin = r1;
                    this.setMax = setmin;
                }

                public final void onClick(View view) {
                    View view2 = this.setMin.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    view2.setVisibility(8);
                    Ignore.setMin setmin = this.setMax;
                    if (setmin != null) {
                        setmin.length(this.setMin.getAdapterPosition());
                    }
                }
            }

            private static void setMin(TextView textView, String str, String str2) {
                CharSequence charSequence = str;
                int indexOf$default = StringsKt.indexOf$default(charSequence, str2, 0, false, 6, (Object) null);
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new StyleSpan(1), indexOf$default, str2.length() + indexOf$default, 33);
                textView.setText(spannableString);
            }

            private static boolean length(ProfileCompletion profileCompletion) {
                return profileCompletion.getCompletedTaskCount() >= 5;
            }
        };
    }
}
