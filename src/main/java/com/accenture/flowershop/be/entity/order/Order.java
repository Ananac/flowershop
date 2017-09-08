package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Table(name = "\"ORDER\"")
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

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "userId")
    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private BigDecimal subTotal;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    status status;

    public Order() {
    }

    public Order(User user, BigDecimal subTotal) {
        this.user = user;
        this.subTotal = subTotal;
        this.createDate = new Date();
        this.completeDate = null;
        this.status = status.PROCESSING;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", completeDate=" + completeDate +
                ", user=" + user +
                ", subTotal=" + subTotal +
                ", status=" + status +
                '}';
    }

    private enum status {
        AWAITING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        COMPLETED
    }
}

