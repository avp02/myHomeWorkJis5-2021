package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.Tv;

public class TvControllerService extends TvService{

    private final TvService tvService;

    public TvControllerService(Tv tv, TvService tvService) {
        super(tv);
        this.tvService = tvService;
    }
}
