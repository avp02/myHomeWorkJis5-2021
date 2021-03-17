package com.avp.homework7objectsinmemory.task3tv.service;

import com.avp.homework7objectsinmemory.task3tv.bean.Tv;

public class TvService {

    void switchChannelOneForward(Tv tv) {
        tv.setCurrentChannel(tv.getCurrentChannel() + 1);
    }

    void switchChannelOneBack(Tv tv) {
        tv.setCurrentChannel(tv.getCurrentChannel() - 1);
    }

    void increaseSoundOne(Tv tv) {
        tv.setCurrentSound(tv.getCurrentSound() + 1);
    }

    void reduceSoundByOne(Tv tv) {
        tv.setCurrentSound(tv.getCurrentSound() - 1);
    }

    void turnOnTv(Tv tv) {
        tv.setTurnOnTv(true);
    }

    void turnOffTv(Tv tv) {
        tv.setTurnOnTv(false);
    }
}
