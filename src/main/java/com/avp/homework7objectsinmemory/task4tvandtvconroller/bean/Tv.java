package com.avp.homework7objectsinmemory.task4tvandtvconroller.bean;

import java.util.Objects;

public class Tv {

    private int currentChannel;
    private int currentSound;
    private String manufacturer;
    private boolean turnOnTv;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTurnOnTv() {
        return turnOnTv;
    }

    public void setTurnOnTv(boolean turnOnTv) {
        this.turnOnTv = turnOnTv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel && currentSound == tv.currentSound && turnOnTv == tv.turnOnTv && Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentSound, manufacturer, turnOnTv);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentSound=" + currentSound +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnOnTv=" + turnOnTv +
                '}';
    }

}
