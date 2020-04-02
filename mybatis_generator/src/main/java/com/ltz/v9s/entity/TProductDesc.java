package com.ltz.v9s.entity;

public class TProductDesc {
    private Long id;

    private Long productId;

    private String pDesc;

    public TProductDesc(Long id, Long productId, String pDesc) {
        this.id = id;
        this.productId = productId;
        this.pDesc = pDesc;
    }

    public TProductDesc() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc == null ? null : pDesc.trim();
    }
}