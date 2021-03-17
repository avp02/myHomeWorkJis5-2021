package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.Tv;
import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.TvController;

public class TvControllerService implements InterfaceTvService{

    private final TvController tvController;
    private final Tv tv;

    public TvControllerService(Tv tv, TvController tvController) {
        this.tv = tv;
        this.tvController = tvController;
    }

    private void setTurnOn() {
        tvController.setTvTurnOn(true);
    }

    @Override
    public void switchChannelOneForward() {
        setTurnOn();
        if (tvController.getTvTurnOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }

    @Override
    public void switchChannelOneBack() {
        setTurnOn();
        if (tvController.getTvTurnOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }

    @Override
    public void increaseSoundOne() {
        setTurnOn();
        if (tvController.getTvTurnOn()) {
            tv.setCurrentSound(tv.getCurrentSound() + 1);
        }
    }

    @Override
    public void reduceSoundByOne() {
        setTurnOn();
        if (tvController.getTvTurnOn()) {
            tv.setCurrentSound(tv.getCurrentSound() -1);
        }
    }

    @Override
    public void turnOnTv() {
        setTurnOn();
        if (tvController.getTvTurnOn()) {
            tv.setTurnOnTv(true);
        }
    }

    @Override
    public void turnOffTv() {
        setTurnOn();
        if (tvController.getTvTurnOn()) {
            tv.setTurnOnTv(false);
        }
    }
}
