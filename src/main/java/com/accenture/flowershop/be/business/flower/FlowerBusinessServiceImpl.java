package com.accenture.flowershop.be.business.flower;

import com.accenture.flowershop.be.access.flower.FlowerDAO;
import com.accenture.flowershop.be.entity.flower.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class FlowerBusinessServiceImpl implements FlowerBusinessService {
    @Autowired
    FlowerDAO dao;


    public boolean checkAvailability(String name, int amount) {
        return false;
    }

    public Flower getFlower(String name) {
        return null;
    }


    public List<Flower> flowersList() {
        List<Flower> l = dao.getFlowers();
        return l;
    }


    public List<Flower> getFlowerByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return null;
    }


    public Flower updateFlowersQuantity(Long id, int quantity) {
        Flower f = dao.getById(id);
        f.setQuantity(quantity);
        dao.update(f);
        return f;
    }
}

