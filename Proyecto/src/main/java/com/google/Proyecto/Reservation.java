package com.google.Proyecto;

import java.time.LocalDate;

public class Reservation {
    private Long id;
    private Long userId;
    private LocalDate date;

    public Reservation(Long id, Long userId, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.date = date;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}