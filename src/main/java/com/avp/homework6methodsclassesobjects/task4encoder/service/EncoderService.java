package com.avp.homework6methodsclassesobjects.task4encoder.service;

import com.avp.homework6methodsclassesobjects.task4encoder.bean.Encoder;

public class EncoderService {

    private final Encoder encoder;

    public EncoderService(Encoder encoder) {
        this.encoder = encoder;
    }

    public void encode(short code) {
        encoder.setSymbol((char)code);
    }

    void decode(char symbol) {
        encoder.setCode((short)symbol);
    }
}
