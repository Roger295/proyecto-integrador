package com.google.Proyecto;

import com.google.Proyecto.Reservation;
import com.google.Proyecto.ReservationService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final Map<Long, Reservation> reservationDatabase = new HashMap<>();
    private Long reservationIdCounter = 1L;

    @Override
    public Reservation createReservation(Reservation reservation) {
        reservation.setId(reservationIdCounter++);
        reservationDatabase.put(reservation.getId(), reservation);
        return reservation;
    }

    @Override
    public Optional<Reservation> getReservationById(Long id) {
        return Optional.ofNullable(reservationDatabase.get(id));
    }

    @Override
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservationDatabase.values());
    }

    @Override
    public Reservation updateReservation(Long id, Reservation reservation) {
        reservation.setId(id);
        reservationDatabase.put(id, reservation);
        return reservation;
    }

    @Override
    public boolean deleteReservation(Long id) {
        return reservationDatabase.remove(id) != null;
    }
}