package com.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Long id;

    private Long userId;

    private Long shopId;

    private String name;

    private String img;

    private Integer imgWidth;

    private Integer imgHeight;

    private String descImg;

    private String status;

    private BigDecimal marketPrice;

    private BigDecimal price;

    private BigDecimal postage;

    private Long amount;

    private Long sales;

    private Boolean archive;

    private Byte recommend;

    private Date recommendAt;

    private BigDecimal discount;

    private Boolean isCommission;

    private BigDecimal commissionRate;

    private Date forsaleAt;

    private Date onsaleAt;

    private Date instockAt;

    private Date createdAt;

    private Date updatedAt;

    private Long fakeSales;

    private Byte isdelay;

    private Integer delaydays;

    private Boolean updateLock;

    private String synchronousflag;

    private String thirdItemId;

    private Long partnerProductId;

    private String code;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    public String getDescImg() {
        return descImg;
    }

    public void setDescImg(String descImg) {
        this.descImg = descImg == null ? null : descImg.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public Byte getRecommend() {
        return recommend;
    }

    public void setRecommend(Byte recommend) {
        this.recommend = recommend;
    }

    public Date getRecommendAt() {
        return recommendAt;
    }

    public void setRecommendAt(Date recommendAt) {
        this.recommendAt = recommendAt;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Boolean getIsCommission() {
        return isCommission;
    }

    public void setIsCommission(Boolean isCommission) {
        this.isCommission = isCommission;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Date getForsaleAt() {
        return forsaleAt;
    }

    public void setForsaleAt(Date forsaleAt) {
        this.forsaleAt = forsaleAt;
    }

    public Date getOnsaleAt() {
        return onsaleAt;
    }

    public void setOnsaleAt(Date onsaleAt) {
        this.onsaleAt = onsaleAt;
    }

    public Date getInstockAt() {
        return instockAt;
    }

    public void setInstockAt(Date instockAt) {
        this.instockAt = instockAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getFakeSales() {
        return fakeSales;
    }

    public void setFakeSales(Long fakeSales) {
        this.fakeSales = fakeSales;
    }

    public Byte getIsdelay() {
        return isdelay;
    }

    public void setIsdelay(Byte isdelay) {
        this.isdelay = isdelay;
    }

    public Integer getDelaydays() {
        return delaydays;
    }

    public void setDelaydays(Integer delaydays) {
        this.delaydays = delaydays;
    }

    public Boolean getUpdateLock() {
        return updateLock;
    }

    public void setUpdateLock(Boolean updateLock) {
        this.updateLock = updateLock;
    }

    public String getSynchronousflag() {
        return synchronousflag;
    }

    public void setSynchronousflag(String synchronousflag) {
        this.synchronousflag = synchronousflag == null ? null : synchronousflag.trim();
    }

    public String getThirdItemId() {
        return thirdItemId;
    }

    public void setThirdItemId(String thirdItemId) {
        this.thirdItemId = thirdItemId == null ? null : thirdItemId.trim();
    }

    public Long getPartnerProductId() {
        return partnerProductId;
    }

    public void setPartnerProductId(Long partnerProductId) {
        this.partnerProductId = partnerProductId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}