package com.avp.homework3_wrappers;

public class Wrappers {

    public void wrappersCreateExample() {
        Integer a = new Integer(2);
        Double b = new Double(1.0);

        Boolean c = false;
        Float d = 0.1F;

        Character g = Character.valueOf('k');
        Byte j = Byte.valueOf((byte) 15);

        Integer e = Integer.parseInt("110");
        Float r = Float.parseFloat("1.9");

    }

    public void wrappersAppropriation() {
        Integer i = 5;
        Integer a = i;

        Double b = 3.0;
        Double c = b.doubleValue();

    }

    public void wrappersTransformation() {
        Integer i = 0b01110;
        Integer a = 0x141;
        Integer b = 012345;

        String str1 = i.toString();
        String str2 = a.toString();
        String str3 = b.toString();
    }

}
