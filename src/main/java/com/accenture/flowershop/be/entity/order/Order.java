package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Date createDate;
    @Getter
    @Setter
    private Date completeDate;

    @ManyToOne
    @JoinColumn(name = "ID")
    @Getter
    @Setter
    private User user;    //private Long userId
    @Getter
    @Setter
    private BigDecimal subTotal;

    @Getter
    private enum status {
        AWAITING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        COMPLETED
    }

    public Order() {
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", completeDate=" + completeDate +
                ", user=" + user +
                ", subTotal=" + subTotal +
                '}';
    }
}

