package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recieve implements IStrategyTypePay {

    public Recieve(){
        super();
    }
    @Override
    public TypePay typePay() {
        return TypePay.receive;
    }

    @Override
    public float condition1() {
        return -1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
