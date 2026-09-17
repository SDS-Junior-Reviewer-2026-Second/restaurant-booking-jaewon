package com.sds.cleancode.restaurant;

import java.time.LocalDateTime;

public class TestableScheduler extends BookingScheduler {

    private final LocalDateTime now;

    public TestableScheduler(int capacityPerHour, LocalDateTime now) {
        super(capacityPerHour);
        this.now = now;
    }

    @Override
    public LocalDateTime getNow() {
        return now;
    }
}
