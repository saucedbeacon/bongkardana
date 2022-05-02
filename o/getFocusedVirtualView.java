package o;

import java.util.ArrayList;

public final class getFocusedVirtualView {
    public final updateHoveredVirtualView getMax;
    public invalidateRoot getMin;
    final ArrayList<createNodeForChild> length = new ArrayList<>();
    public final getMin setMax = new getMin((byte) 0);
    public boolean setMin = false;
    public boolean toFloatRange = false;

    public getFocusedVirtualView(updateHoveredVirtualView updatehoveredvirtualview) {
        this.getMax = updatehoveredvirtualview;
    }

    public final void setMin(createNodeForChild createnodeforchild, createNodeForChild createnodeforchild2, String str) {
        if (!this.toFloatRange) {
            getMin getmin = this.setMax;
            getmin.setMax.add(createnodeforchild);
            getmin.length.add(createnodeforchild2);
            getmin.getMin.add(str);
            this.length.add(createnodeforchild);
            this.length.add(createnodeforchild2);
            return;
        }
        throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
    }

    public final boolean getMax() {
        return this.setMin;
    }

    public static class getMin {
        public final ArrayList<String> getMin;
        public final ArrayList<createNodeForChild> length;
        public final ArrayList<createNodeForChild> setMax;

        private getMin() {
            this.setMax = new ArrayList<>();
            this.length = new ArrayList<>();
            this.getMin = new ArrayList<>();
        }

        /* synthetic */ getMin(byte b) {
            this();
        }

        public final void setMax() {
            createNodeForChild createnodeforchild;
            for (int i = 0; i < this.setMax.size(); i++) {
                createNodeForChild createnodeforchild2 = this.setMax.get(i);
                createNodeForChild createnodeforchild3 = this.length.get(i);
                String str = this.getMin.get(i);
                if (createnodeforchild3.length == null) {
                    createnodeforchild = null;
                } else {
                    createnodeforchild = createnodeforchild3.length.get(str);
                }
                if (createnodeforchild == createnodeforchild2) {
                    if (createnodeforchild2.getMin.remove(createnodeforchild3)) {
                        createnodeforchild3.setMax(str);
                    } else {
                        throw new RuntimeException("Tried to remove non-existent input!");
                    }
                }
            }
        }
    }
}
