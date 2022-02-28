package com.jb.catsandtoys.data_beans;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "toys")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Toy {
    //i am not your toy.....
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(
            name = "name",
            length = 40,
            nullable = false
    )
    private String toyName;
    private String manufacturer;
    private String color;
    private boolean hasSound;


}
