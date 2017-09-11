package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.flower.Flower;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDERID")
    @Getter
    @Setter
    private Order order;    //private Long orderId;

    @ManyToOne
    @JoinColumn(name = "FLOWERID")
    @Getter
    @Setter
    private Flower flower;  //private Long flowerId;

    @Getter
    @Setter
    private int amount;

    @Getter
    @Setter
    private BigDecimal cost;

    public OrderItem() {
    }

    public OrderItem(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
        cost = flower.getPrice().multiply(new BigDecimal(amount)).setScale(0, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", order=" + order +
                ", flower=" + flower +
                ", amount=" + amount +
                '}';
    }
}
