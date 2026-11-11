package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

@Entity
@Table( name = "event_registration",
    uniqueConstraints = @UniqueConstraint( columnNames = {"profile_id", "event_id"}))

public class EventRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "registration_id")
    private long registrationId;

    @NotNull(message = "Veillez indiquer le statut d'inscription")
    @Enumerated(EnumType.STRING)
    @Column(name = "registration_status", nullable = false)
    private RegistStatus status;

    @Column(name = "registration_date", nullable = false,
            updatable = false)
    private LocalDateTime registrationDate;

    // Database connections

    @NotNull(message = "Veillez indiquer le profil")
    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    @NotNull(message = "Veillez indiquer l'événement")
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @PrePersist
    protected void onCreate() {
        this.registrationDate = LocalDateTime.now();

        if (this.status == null) {
            this.status = RegistStatus.Pending;
        }
    }

    // getters and setters

    public long getRegistrationId() {
        return registrationId;
    }

    public RegistStatus getStatus() {
        return status;
    }

    public void setStatus(RegistStatus status) {
        this.status = status;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    // argument and no argument constructors

    public EventRegistration() {}

    public EventRegistration(Profile profile, Event event) {
        this.profile = profile;
        this.event = event;
        this.status = RegistStatus.Pending;
    }

    // toString

    @Override
    public String toString() {
        return "EventRegistration [registrationId=" + registrationId
                + ", status=" + status
                + ", registrationDate=" + registrationDate + "]";
    }
}