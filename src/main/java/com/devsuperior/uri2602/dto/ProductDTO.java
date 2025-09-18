package com.devsuperior.uri2602.dto;

public class ProductDTO {

    private Long id;
    private String name;
    
    public ProductDTO() {
    }

    public ProductDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDTO(ProductMinProjection entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
