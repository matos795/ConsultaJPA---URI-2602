package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.ProviderMinProjection;

public class ProviderDTO {

    private String city;

    public ProviderDTO() {
    }

    public ProviderDTO(String city) {
        this.city = city;
    }

    public ProviderDTO(ProviderMinProjection entity) {
        city = entity.getCity();
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "ProviderDTO [city=" + city + "]";
    }
    
}
