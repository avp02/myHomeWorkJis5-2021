package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.Tv;

public class TvService implements InterfaceTvService {

    private final Tv tv;

    public TvService(Tv tv) {
        this.tv = tv;
    }

    public void switchChannelOneForward() {
        tv.setCurrentChannel(tv.getCurrentChannel() + 1);
    }

    public void switchChannelOneBack() {
        tv.setCurrentChannel(tv.getCurrentChannel() - 1);
    }

    public void increaseSoundOne() {
        tv.setCurrentSound(tv.getCurrentSound() + 1);
    }

    public void reduceSoundByOne() {
        tv.setCurrentSound(tv.getCurrentSound() - 1);
    }

    public void turnOnTv() {
        tv.setTurnOnTv(true);
    }

    public void turnOffTv() {
        tv.setTurnOnTv(false);
    }
}
