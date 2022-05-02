package com.facebook.stetho.inspector.elements.android;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.common.android.DialogFragmentAccessor;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ChainedDescriptor;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import javax.annotation.Nullable;

final class DialogFragmentDescriptor extends Descriptor<Object> implements ChainedDescriptor<Object>, HighlightableDescriptor<Object> {
    private final DialogFragmentAccessor mAccessor;
    private Descriptor<? super Object> mSuper;

    public final void getComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    public final void getStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public final void getStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    public final void setStyle(Object obj, String str, String str2, String str3) {
    }

    public static DescriptorMap register(DescriptorMap descriptorMap) {
        maybeRegister(descriptorMap, FragmentCompat.getSupportLibInstance());
        maybeRegister(descriptorMap, FragmentCompat.getFrameworkInstance());
        return descriptorMap;
    }

    private static void maybeRegister(DescriptorMap descriptorMap, @Nullable FragmentCompat fragmentCompat) {
        if (fragmentCompat != null) {
            Class dialogFragmentClass = fragmentCompat.getDialogFragmentClass();
            LogUtil.d("Adding support for %s", dialogFragmentClass);
            descriptorMap.registerDescriptor((Class<?>) dialogFragmentClass, (Descriptor) new DialogFragmentDescriptor(fragmentCompat));
        }
    }

    private DialogFragmentDescriptor(FragmentCompat fragmentCompat) {
        this.mAccessor = fragmentCompat.forDialogFragment();
    }

    public final void setSuper(Descriptor<? super Object> descriptor) {
        Util.throwIfNull(descriptor);
        Descriptor<? super Object> descriptor2 = this.mSuper;
        if (descriptor == descriptor2) {
            return;
        }
        if (descriptor2 == null) {
            this.mSuper = descriptor;
            return;
        }
        throw new IllegalStateException();
    }

    public final void hook(Object obj) {
        this.mSuper.hook(obj);
    }

    public final void unhook(Object obj) {
        this.mSuper.unhook(obj);
    }

    public final NodeType getNodeType(Object obj) {
        return this.mSuper.getNodeType(obj);
    }

    public final String getNodeName(Object obj) {
        return this.mSuper.getNodeName(obj);
    }

    public final String getLocalName(Object obj) {
        return this.mSuper.getLocalName(obj);
    }

    @Nullable
    public final String getNodeValue(Object obj) {
        return this.mSuper.getNodeValue(obj);
    }

    public final void getChildren(Object obj, Accumulator<Object> accumulator) {
        accumulator.store(this.mAccessor.getDialog(obj));
    }

    public final void getAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
        this.mSuper.getAttributes(obj, attributeAccumulator);
    }

    public final void setAttributesAsText(Object obj, String str) {
        this.mSuper.setAttributesAsText(obj, str);
    }

    @Nullable
    public final View getViewAndBoundsForHighlighting(Object obj, Rect rect) {
        Dialog dialog;
        HighlightableDescriptor highlightableDescriptor;
        Descriptor.Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            dialog = this.mAccessor.getDialog(obj);
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(dialog);
        } else {
            dialog = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getViewAndBoundsForHighlighting(dialog, rect);
    }

    @Nullable
    public final Object getElementToHighlightAtPosition(Object obj, int i, int i2, Rect rect) {
        Dialog dialog;
        HighlightableDescriptor highlightableDescriptor;
        Descriptor.Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            dialog = this.mAccessor.getDialog(obj);
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(dialog);
        } else {
            dialog = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getElementToHighlightAtPosition(dialog, i, i2, rect);
    }
}
