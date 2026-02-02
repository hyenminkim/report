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
public class Tk_framekSub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fksidx")
    private Long fksidx;

    private  int xi;
    private int yi;
    private int wi;


}
