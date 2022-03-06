package com.factory;

import com.factory.phone.Android;
import com.factory.phone.OS;
import com.factory.phone.OSFactory;

import java.lang.management.OperatingSystemMXBean;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS os =  osf.getInstance("");
        os.spec();

    }
}
