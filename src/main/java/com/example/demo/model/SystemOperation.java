package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SystemOperation {
    private String name;
    private String version;

    @Override
    public String toString() {
        return "SystemOperation{" +
                "name='" + name + '\'' +
                ", gps='" + version + '\'' +
                '}';
    }
}
