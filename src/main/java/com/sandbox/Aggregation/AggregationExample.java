package com.sandbox.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {

    public AggregationExample() {

        new Widget();
        new Widget();
        new Widget();
    }
   // encapsulation example
    private List<Widget> Widgets = new ArrayList<>();

    public List<Widget> getWidgets() {
        return Widgets;
    }

    public void addWidgets( Widget widgets) {
        Widgets.add(widgets);
    }
}
