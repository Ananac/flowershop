package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

public interface FlowerDAO {
    List<Flower> getFlowers();

    Flower getById(Long id);

    @Transactional
    Flower update(Flower flower);

}
