package com.gof.designpattern;

import com.gof.designpattern.layout.Layout;

/**
 * Created by yl3 on 21.11.15.
 */
public class CommandCenter {
    public static void main(String[] args) {
        LayoutFactory layoutFactory = new LayoutFactory();

        Layout webLayout = layoutFactory.getLayout("Web");
        webLayout.generateLayout();

        Layout mobileLayout = layoutFactory.getLayout("Mobile");
        mobileLayout.generateLayout();
    }
}
