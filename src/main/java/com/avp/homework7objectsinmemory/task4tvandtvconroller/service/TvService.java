package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.Tv;

public class TvService {

    private final Tv tv;

    public TvService(Tv tv) {
        this.tv = tv;
    }

    void switchChannelOneForward() {
        tv.setCurrentChannel(tv.getCurrentChannel() + 1);
    }

    void switchChannelOneBack() {
        tv.setCurrentChannel(tv.getCurrentChannel() - 1);
    }

    void increaseSoundOne(Tv testTv, TvService testTvService) {
        tv.setCurrentSound(tv.getCurrentSound() + 1);
    }

    void reduceSoundByOne() {
        tv.setCurrentSound(tv.getCurrentSound() - 1);
    }

    void turnOnTv() {
        tv.setTurnOnTv(true);
    }

    void turnOffTv() {
        tv.setTurnOnTv(false);
    }
}
