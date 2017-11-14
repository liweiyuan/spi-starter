package com.wade.invoke;

import com.wade.inter.Printer;

import java.util.ServiceLoader;

/**
 * Created by tingyun on 2017/11/13.
 */
public class MainApp {

    public static void main(String[] args) {
        ServiceLoader<Printer> loader=ServiceLoader.load(Printer.class);
        for(Printer printer:loader){
            printer.printer();
        }
    }
}
