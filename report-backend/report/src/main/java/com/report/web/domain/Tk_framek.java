package com.report.web.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Tk_framek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fkidx")
    private Long fkidx;

    private  String fname;




}
