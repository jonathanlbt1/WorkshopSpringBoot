package com.jonathanlbt.projetospringbootcombdrelacional.entities.enums;

public enum OrderStatus {

    PAID(1),
    CANCELED(2),
    WAITING_PAYMENT(3),
    DELIVERED(4);

    private int code;
    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value: OrderStatus.values()){
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
