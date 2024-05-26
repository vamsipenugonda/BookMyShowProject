package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private int ref_number;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private PaymentProvider paymentProvider;

}
