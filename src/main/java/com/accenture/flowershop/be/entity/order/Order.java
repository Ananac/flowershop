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
    @JoinColumn(name = "ID")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
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

