package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
public class Send implements IStrategyTypePay {


    public Send(){
        super();
    }
    @Override
    public TypePay typePay() {
        return TypePay.send;
    }
    @Override
    public float condition1() {
        return 992;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
