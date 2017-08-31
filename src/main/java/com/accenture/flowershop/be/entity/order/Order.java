package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.user.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cust")
    @SequenceGenerator(name = "seq_cust", sequenceName = "seq_cust", allocationSize = 1)
    private Long id;
    private Date createDate;
    private Date completeDate;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;    //private Long userId
    private BigDecimal subTotal;

    private enum status {
        AWAITING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        COMPLETED
    }

    public Order() {
    }

}

