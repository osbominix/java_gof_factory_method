package com.gof.designpattern;

import com.gof.designpattern.layout.Layout;
import com.gof.designpattern.layout.MobileLayout;
import com.gof.designpattern.layout.WebLayout;

/**
 * Created by yl3 on 21.11.15.
 */
public class LayoutFactory {
    public Layout getLayout(String layoutType) {
        if ("Mobile".equals(layoutType)) {
            return new MobileLayout();
        } else if ("Web".equals(layoutType)) {
            return new WebLayout();
        }
        return null;
    }
}
