package com.devsuperior.dscommerce.dtos;

import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.entities.Payment;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

import java.time.Instant;

public class PaymentDTO {
    private Long id;
    private Instant moment;

    public PaymentDTO() {
    }

    public PaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }
}
