package com.wade.printer;

import com.wade.inter.Printer;

/**
 * Created by tingyun on 2017/11/13.
 */
public class BadPrinter implements Printer {
    @Override
    public void printer() {
        System.out.println("我抽烟，喝酒，蹦迪，但我知道我是好女孩~");
    }
}
