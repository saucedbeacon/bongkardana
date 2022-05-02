package o;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

public class setActionButtons extends Fragment {
    private setStackButtons$core fragmentResultListener;

    public static setActionButtons build(Activity activity, Bundle bundle) {
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        setActionButtons setactionbuttons = new setActionButtons();
        setactionbuttons.setArguments(bundle);
        beginTransaction.add(setactionbuttons, setActionButtons.class.getName()).commit();
        return setactionbuttons;
    }

    public void addListener(setStackButtons$core setstackbuttons_core) {
        this.fragmentResultListener = setstackbuttons_core;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.fragmentResultListener.onActivityResult(i, i2, intent);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        setStackButtons$core setstackbuttons_core = this.fragmentResultListener;
        if (setstackbuttons_core != null) {
            setstackbuttons_core.onFragmentCreated(this, getArguments());
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void destroy(Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commit();
    }
}
