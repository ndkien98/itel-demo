package com.t3h.itel.dao;

import com.t3h.itel.model.ClientEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class ClientDaoImpl {
    public static List<ClientEntity> arrayClient = new ArrayList<>();
    static {
        Random generator = new Random(19900828);
        for (int i = 0; i < 10; i++) {
            ClientEntity client = ClientEntity.builder()
                    .id(generator.nextInt())
                    .fullName("Nguyễn Văn " + i)
                    .phone("092533477" + i)
                    .accumulatePoints(generator.nextDouble() * 10000)
                    .currentPoint(generator.nextDouble()* 10000)
                    .cyclePoints(generator.nextDouble() * 10000).build();
            arrayClient.add(client);
        }

    }
}
