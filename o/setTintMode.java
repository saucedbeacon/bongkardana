package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class setTintMode extends Fragment {
    boolean IsOverlapping;
    CharSequence equals;
    View getMax;
    ListView getMin;
    private final AdapterView.OnItemClickListener hashCode = new AdapterView.OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    };
    private final Handler isInside = new Handler();
    ListAdapter length;
    View setMax;
    TextView setMin;
    private final Runnable toFloatRange = new Runnable() {
        public final void run() {
            setTintMode.this.getMin.focusableViewAvailable(setTintMode.this.getMin);
        }
    };
    View toIntRange;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        setMin();
    }

    public void onDestroyView() {
        this.isInside.removeCallbacks(this.toFloatRange);
        this.getMin = null;
        this.IsOverlapping = false;
        this.toIntRange = null;
        this.getMax = null;
        this.setMax = null;
        this.setMin = null;
        super.onDestroyView();
    }

    private void setMin(@Nullable ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.length != null;
        this.length = listAdapter;
        ListView listView = this.getMin;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.IsOverlapping && !z2) {
                if (requireView().getWindowToken() != null) {
                    z = true;
                }
                setMax(true, z);
            }
        }
    }

    private void setMax(boolean z, boolean z2) {
        setMin();
        View view = this.getMax;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.IsOverlapping != z) {
            this.IsOverlapping = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.toIntRange.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.toIntRange.clearAnimation();
                }
                this.getMax.setVisibility(8);
                this.toIntRange.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.toIntRange.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.toIntRange.clearAnimation();
            }
            this.getMax.setVisibility(0);
            this.toIntRange.setVisibility(8);
        }
    }

    private void setMin() {
        if (this.getMin == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.getMin = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.setMin = textView;
                    if (textView == null) {
                        this.setMax = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.getMax = view.findViewById(16711682);
                    this.toIntRange = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.getMin = listView;
                        View view2 = this.setMax;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.equals;
                            if (charSequence != null) {
                                this.setMin.setText(charSequence);
                                this.getMin.setEmptyView(this.setMin);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.IsOverlapping = true;
                this.getMin.setOnItemClickListener(this.hashCode);
                ListAdapter listAdapter = this.length;
                if (listAdapter != null) {
                    this.length = null;
                    setMin(listAdapter);
                } else if (this.getMax != null) {
                    setMax(false, false);
                }
                this.isInside.post(this.toFloatRange);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }
}
