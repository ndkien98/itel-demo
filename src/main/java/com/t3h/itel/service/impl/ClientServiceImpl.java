package com.t3h.itel.service.impl;

import com.t3h.itel.dao.ClientDaoImpl;
import com.t3h.itel.model.ClientEntity;
import com.t3h.itel.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    @Override
    public List<ClientEntity> getAll() {
        return ClientDaoImpl.arrayClient;
    }
}
