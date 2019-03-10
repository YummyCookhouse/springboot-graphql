package com.stardust.graphql.demo.services;

import com.google.common.collect.ImmutableMap;
import com.stardust.graphql.demo.enums.PhotoIDType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PhotoIDService {
    Map<Integer, Map<PhotoIDType, String>> repository = new HashMap();

    public PhotoIDService() {
        repository.put(1, ImmutableMap.of(PhotoIDType.ID, "610104", PhotoIDType.PASSPORT, "CE0002", PhotoIDType.DRIVELICENSE, "C1423123"));
        repository.put(2, ImmutableMap.of(PhotoIDType.ID, "200124", PhotoIDType.PASSPORT, "CE2005", PhotoIDType.DRIVELICENSE, "C3213231"));
        repository.put(3, ImmutableMap.of(PhotoIDType.ID, "321321", PhotoIDType.PASSPORT, "CE9013", PhotoIDType.DRIVELICENSE, "A2838273"));
    }

    public String getIdentifierForOwner(int ownerId, PhotoIDType type) {
        return repository.get(ownerId).get(type);
    }
}
