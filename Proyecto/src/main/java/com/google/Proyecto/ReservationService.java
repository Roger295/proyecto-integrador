package com.google.Proyecto;

import com.google.Proyecto.Reservation;
import java.util.List;
import java.util.Optional;

public interface ReservationService {
    Reservation createReservation(Reservation reservation);
    Optional<Reservation> getReservationById(Long id);
    List<Reservation> getAllReservations();
    Reservation updateReservation(Long id, Reservation reservation);
    boolean deleteReservation(Long id);
}