package com.example.spacetourismserver.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "destination")
public class Destination{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true, columnDefinition = "VARCHAR(63)")
    private String name;

    @Column(name ="description", nullable = false, unique = true, columnDefinition = "VARCHAR(1023)")
    private String description;

    @Column(name = "distance", nullable = false, unique = true, columnDefinition = "VARCHAR(63)")
    private String distance;

    @Column(name = "travel_time", nullable = false, unique = true, columnDefinition = "VARCHAR(63)")
    private String travelTime;

    @Column(name = "image", nullable = false)
    private String image;
}
