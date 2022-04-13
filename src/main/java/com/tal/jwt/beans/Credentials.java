package com.tal.jwt.beans;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 40)
    private String userName;
    @Column(length = 40)
    private String userPass;
    @Column(length = 40)
    private String userEmail;
}
