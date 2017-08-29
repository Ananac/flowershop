package com.accenture.flowershop.be.business.flower;

public interface FlowerBusinessService {
    boolean checkAvailability(Long id, int amount);
}
