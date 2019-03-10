package com.stardust.graphql.demo.services;

import com.stardust.graphql.demo.enums.PhotoIDType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PhotoIDService {
    Map<Integer, Map<PhotoIDType, String>> repository = new HashMap();

    public PhotoIDService() {
        repository.put(1, new HashMap(){{put(PhotoIDType.ID, "610104"); put(PhotoIDType.PASSPORT, "CE0002"); put(PhotoIDType.DRIVELICENSE, "C1423123");}});
        repository.put(2, new HashMap(){{put(PhotoIDType.ID, "200124"); put(PhotoIDType.PASSPORT, "CE2005"); put(PhotoIDType.DRIVELICENSE, "C3213231");}});
        repository.put(3, new HashMap(){{put(PhotoIDType.ID, "321321"); put(PhotoIDType.PASSPORT, "CE9013"); put(PhotoIDType.DRIVELICENSE, "A2838273");}});
    }

    public String getIdentifierForOwner(int ownerId, PhotoIDType type) {
        return repository.get(ownerId).get(type);
    }
}
