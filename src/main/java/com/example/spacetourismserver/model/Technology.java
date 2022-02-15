package com.example.spacetourismserver.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "technology")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name= "name", nullable = false, unique = true, columnDefinition = "VARCHAR(63)")
    private String name;

    @Column(name = "description", nullable = false, columnDefinition = "VARCHAR(1023)")
    private String description;

    @Column(name = "image_portrait", nullable = false)
    private String imagePortrait;

    @Column(name = "image_landscape", nullable = false)
    private String imageLandscape;
}
