package com.t3h.itel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientEntity {

    private String phone;
    private Integer id;
    private String fullName;
    private Double cyclePoints;
    private Double accumulatePoints;
    private Double currentPoint;


}
