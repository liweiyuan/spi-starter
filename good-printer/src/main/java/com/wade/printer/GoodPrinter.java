package com.wade.printer;

import com.wade.inter.Printer;

/**
 * Created by tingyun on 2017/11/13.
 */
public class GoodPrinter implements Printer {
    @Override
    public void printer() {
        System.err.println("你是个好人~");
    }
}
