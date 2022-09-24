package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter

public class ClientWallet {
    @Id
    private String id;
    private String idenDoc;
    private String phone;
    private String imei;
    private String email;
    private SystemOperation systemOperation;
    private int status;

    // Constructor 1
    // Constructor 2

    /*
        {
                "ident": "70147891",
                "phone": "980670901",
                "imei": "1231313123131231321",
                "email": "email@email.com",
                "systemOperation":{
                    "name": "androi",
                    "gps": "v22"
                }
        }
     */

    @Override
    public String toString() {
        return "ClientWallet{" +
                "id='" + id + '\'' +
                ", idenDoc='" + idenDoc + '\'' +
                ", phone='" + phone + '\'' +
                ", imei='" + imei + '\'' +
                ", email='" + email + '\'' +
                ", systemOperation=" + systemOperation +
                ", status=" + status +
                '}';
    }
}
