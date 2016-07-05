package com.test.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNull() {
            addCriterion("img_width is null");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNotNull() {
            addCriterion("img_width is not null");
            return (Criteria) this;
        }

        public Criteria andImgWidthEqualTo(Integer value) {
            addCriterion("img_width =", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotEqualTo(Integer value) {
            addCriterion("img_width <>", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThan(Integer value) {
            addCriterion("img_width >", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_width >=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThan(Integer value) {
            addCriterion("img_width <", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThanOrEqualTo(Integer value) {
            addCriterion("img_width <=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthIn(List<Integer> values) {
            addCriterion("img_width in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotIn(List<Integer> values) {
            addCriterion("img_width not in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthBetween(Integer value1, Integer value2) {
            addCriterion("img_width between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("img_width not between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNull() {
            addCriterion("img_height is null");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNotNull() {
            addCriterion("img_height is not null");
            return (Criteria) this;
        }

        public Criteria andImgHeightEqualTo(Integer value) {
            addCriterion("img_height =", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotEqualTo(Integer value) {
            addCriterion("img_height <>", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThan(Integer value) {
            addCriterion("img_height >", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_height >=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThan(Integer value) {
            addCriterion("img_height <", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThanOrEqualTo(Integer value) {
            addCriterion("img_height <=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightIn(List<Integer> values) {
            addCriterion("img_height in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotIn(List<Integer> values) {
            addCriterion("img_height not in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightBetween(Integer value1, Integer value2) {
            addCriterion("img_height between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("img_height not between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andDescImgIsNull() {
            addCriterion("desc_img is null");
            return (Criteria) this;
        }

        public Criteria andDescImgIsNotNull() {
            addCriterion("desc_img is not null");
            return (Criteria) this;
        }

        public Criteria andDescImgEqualTo(String value) {
            addCriterion("desc_img =", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgNotEqualTo(String value) {
            addCriterion("desc_img <>", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgGreaterThan(String value) {
            addCriterion("desc_img >", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgGreaterThanOrEqualTo(String value) {
            addCriterion("desc_img >=", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgLessThan(String value) {
            addCriterion("desc_img <", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgLessThanOrEqualTo(String value) {
            addCriterion("desc_img <=", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgLike(String value) {
            addCriterion("desc_img like", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgNotLike(String value) {
            addCriterion("desc_img not like", value, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgIn(List<String> values) {
            addCriterion("desc_img in", values, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgNotIn(List<String> values) {
            addCriterion("desc_img not in", values, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgBetween(String value1, String value2) {
            addCriterion("desc_img between", value1, value2, "descImg");
            return (Criteria) this;
        }

        public Criteria andDescImgNotBetween(String value1, String value2) {
            addCriterion("desc_img not between", value1, value2, "descImg");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPostageIsNull() {
            addCriterion("postage is null");
            return (Criteria) this;
        }

        public Criteria andPostageIsNotNull() {
            addCriterion("postage is not null");
            return (Criteria) this;
        }

        public Criteria andPostageEqualTo(BigDecimal value) {
            addCriterion("postage =", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotEqualTo(BigDecimal value) {
            addCriterion("postage <>", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageGreaterThan(BigDecimal value) {
            addCriterion("postage >", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("postage >=", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLessThan(BigDecimal value) {
            addCriterion("postage <", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("postage <=", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageIn(List<BigDecimal> values) {
            addCriterion("postage in", values, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotIn(List<BigDecimal> values) {
            addCriterion("postage not in", values, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("postage between", value1, value2, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("postage not between", value1, value2, "postage");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Long value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Long value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Long value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Long value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Long value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Long> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Long> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Long value1, Long value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Long value1, Long value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andArchiveIsNull() {
            addCriterion("archive is null");
            return (Criteria) this;
        }

        public Criteria andArchiveIsNotNull() {
            addCriterion("archive is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveEqualTo(Boolean value) {
            addCriterion("archive =", value, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveNotEqualTo(Boolean value) {
            addCriterion("archive <>", value, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveGreaterThan(Boolean value) {
            addCriterion("archive >", value, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("archive >=", value, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveLessThan(Boolean value) {
            addCriterion("archive <", value, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveLessThanOrEqualTo(Boolean value) {
            addCriterion("archive <=", value, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveIn(List<Boolean> values) {
            addCriterion("archive in", values, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveNotIn(List<Boolean> values) {
            addCriterion("archive not in", values, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveBetween(Boolean value1, Boolean value2) {
            addCriterion("archive between", value1, value2, "archive");
            return (Criteria) this;
        }

        public Criteria andArchiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("archive not between", value1, value2, "archive");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Byte value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Byte value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Byte value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Byte value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Byte> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Byte> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Byte value1, Byte value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendAtIsNull() {
            addCriterion("recommend_at is null");
            return (Criteria) this;
        }

        public Criteria andRecommendAtIsNotNull() {
            addCriterion("recommend_at is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendAtEqualTo(Date value) {
            addCriterion("recommend_at =", value, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtNotEqualTo(Date value) {
            addCriterion("recommend_at <>", value, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtGreaterThan(Date value) {
            addCriterion("recommend_at >", value, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtGreaterThanOrEqualTo(Date value) {
            addCriterion("recommend_at >=", value, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtLessThan(Date value) {
            addCriterion("recommend_at <", value, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtLessThanOrEqualTo(Date value) {
            addCriterion("recommend_at <=", value, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtIn(List<Date> values) {
            addCriterion("recommend_at in", values, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtNotIn(List<Date> values) {
            addCriterion("recommend_at not in", values, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtBetween(Date value1, Date value2) {
            addCriterion("recommend_at between", value1, value2, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andRecommendAtNotBetween(Date value1, Date value2) {
            addCriterion("recommend_at not between", value1, value2, "recommendAt");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andIsCommissionIsNull() {
            addCriterion("is_commission is null");
            return (Criteria) this;
        }

        public Criteria andIsCommissionIsNotNull() {
            addCriterion("is_commission is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommissionEqualTo(Boolean value) {
            addCriterion("is_commission =", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotEqualTo(Boolean value) {
            addCriterion("is_commission <>", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionGreaterThan(Boolean value) {
            addCriterion("is_commission >", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_commission >=", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionLessThan(Boolean value) {
            addCriterion("is_commission <", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_commission <=", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionIn(List<Boolean> values) {
            addCriterion("is_commission in", values, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotIn(List<Boolean> values) {
            addCriterion("is_commission not in", values, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_commission between", value1, value2, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_commission not between", value1, value2, "isCommission");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(BigDecimal value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(BigDecimal value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(BigDecimal value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(BigDecimal value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<BigDecimal> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<BigDecimal> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andForsaleAtIsNull() {
            addCriterion("forsale_at is null");
            return (Criteria) this;
        }

        public Criteria andForsaleAtIsNotNull() {
            addCriterion("forsale_at is not null");
            return (Criteria) this;
        }

        public Criteria andForsaleAtEqualTo(Date value) {
            addCriterion("forsale_at =", value, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtNotEqualTo(Date value) {
            addCriterion("forsale_at <>", value, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtGreaterThan(Date value) {
            addCriterion("forsale_at >", value, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtGreaterThanOrEqualTo(Date value) {
            addCriterion("forsale_at >=", value, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtLessThan(Date value) {
            addCriterion("forsale_at <", value, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtLessThanOrEqualTo(Date value) {
            addCriterion("forsale_at <=", value, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtIn(List<Date> values) {
            addCriterion("forsale_at in", values, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtNotIn(List<Date> values) {
            addCriterion("forsale_at not in", values, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtBetween(Date value1, Date value2) {
            addCriterion("forsale_at between", value1, value2, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andForsaleAtNotBetween(Date value1, Date value2) {
            addCriterion("forsale_at not between", value1, value2, "forsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtIsNull() {
            addCriterion("onsale_at is null");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtIsNotNull() {
            addCriterion("onsale_at is not null");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtEqualTo(Date value) {
            addCriterion("onsale_at =", value, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtNotEqualTo(Date value) {
            addCriterion("onsale_at <>", value, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtGreaterThan(Date value) {
            addCriterion("onsale_at >", value, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtGreaterThanOrEqualTo(Date value) {
            addCriterion("onsale_at >=", value, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtLessThan(Date value) {
            addCriterion("onsale_at <", value, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtLessThanOrEqualTo(Date value) {
            addCriterion("onsale_at <=", value, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtIn(List<Date> values) {
            addCriterion("onsale_at in", values, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtNotIn(List<Date> values) {
            addCriterion("onsale_at not in", values, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtBetween(Date value1, Date value2) {
            addCriterion("onsale_at between", value1, value2, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andOnsaleAtNotBetween(Date value1, Date value2) {
            addCriterion("onsale_at not between", value1, value2, "onsaleAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtIsNull() {
            addCriterion("instock_at is null");
            return (Criteria) this;
        }

        public Criteria andInstockAtIsNotNull() {
            addCriterion("instock_at is not null");
            return (Criteria) this;
        }

        public Criteria andInstockAtEqualTo(Date value) {
            addCriterion("instock_at =", value, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtNotEqualTo(Date value) {
            addCriterion("instock_at <>", value, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtGreaterThan(Date value) {
            addCriterion("instock_at >", value, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtGreaterThanOrEqualTo(Date value) {
            addCriterion("instock_at >=", value, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtLessThan(Date value) {
            addCriterion("instock_at <", value, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtLessThanOrEqualTo(Date value) {
            addCriterion("instock_at <=", value, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtIn(List<Date> values) {
            addCriterion("instock_at in", values, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtNotIn(List<Date> values) {
            addCriterion("instock_at not in", values, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtBetween(Date value1, Date value2) {
            addCriterion("instock_at between", value1, value2, "instockAt");
            return (Criteria) this;
        }

        public Criteria andInstockAtNotBetween(Date value1, Date value2) {
            addCriterion("instock_at not between", value1, value2, "instockAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andFakeSalesIsNull() {
            addCriterion("fake_sales is null");
            return (Criteria) this;
        }

        public Criteria andFakeSalesIsNotNull() {
            addCriterion("fake_sales is not null");
            return (Criteria) this;
        }

        public Criteria andFakeSalesEqualTo(Long value) {
            addCriterion("fake_sales =", value, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesNotEqualTo(Long value) {
            addCriterion("fake_sales <>", value, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesGreaterThan(Long value) {
            addCriterion("fake_sales >", value, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("fake_sales >=", value, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesLessThan(Long value) {
            addCriterion("fake_sales <", value, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesLessThanOrEqualTo(Long value) {
            addCriterion("fake_sales <=", value, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesIn(List<Long> values) {
            addCriterion("fake_sales in", values, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesNotIn(List<Long> values) {
            addCriterion("fake_sales not in", values, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesBetween(Long value1, Long value2) {
            addCriterion("fake_sales between", value1, value2, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andFakeSalesNotBetween(Long value1, Long value2) {
            addCriterion("fake_sales not between", value1, value2, "fakeSales");
            return (Criteria) this;
        }

        public Criteria andIsdelayIsNull() {
            addCriterion("isDelay is null");
            return (Criteria) this;
        }

        public Criteria andIsdelayIsNotNull() {
            addCriterion("isDelay is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelayEqualTo(Byte value) {
            addCriterion("isDelay =", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotEqualTo(Byte value) {
            addCriterion("isDelay <>", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayGreaterThan(Byte value) {
            addCriterion("isDelay >", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDelay >=", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayLessThan(Byte value) {
            addCriterion("isDelay <", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayLessThanOrEqualTo(Byte value) {
            addCriterion("isDelay <=", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayIn(List<Byte> values) {
            addCriterion("isDelay in", values, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotIn(List<Byte> values) {
            addCriterion("isDelay not in", values, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayBetween(Byte value1, Byte value2) {
            addCriterion("isDelay between", value1, value2, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotBetween(Byte value1, Byte value2) {
            addCriterion("isDelay not between", value1, value2, "isdelay");
            return (Criteria) this;
        }

        public Criteria andDelaydaysIsNull() {
            addCriterion("delayDays is null");
            return (Criteria) this;
        }

        public Criteria andDelaydaysIsNotNull() {
            addCriterion("delayDays is not null");
            return (Criteria) this;
        }

        public Criteria andDelaydaysEqualTo(Integer value) {
            addCriterion("delayDays =", value, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysNotEqualTo(Integer value) {
            addCriterion("delayDays <>", value, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysGreaterThan(Integer value) {
            addCriterion("delayDays >", value, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("delayDays >=", value, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysLessThan(Integer value) {
            addCriterion("delayDays <", value, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysLessThanOrEqualTo(Integer value) {
            addCriterion("delayDays <=", value, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysIn(List<Integer> values) {
            addCriterion("delayDays in", values, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysNotIn(List<Integer> values) {
            addCriterion("delayDays not in", values, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysBetween(Integer value1, Integer value2) {
            addCriterion("delayDays between", value1, value2, "delaydays");
            return (Criteria) this;
        }

        public Criteria andDelaydaysNotBetween(Integer value1, Integer value2) {
            addCriterion("delayDays not between", value1, value2, "delaydays");
            return (Criteria) this;
        }

        public Criteria andUpdateLockIsNull() {
            addCriterion("update_lock is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLockIsNotNull() {
            addCriterion("update_lock is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLockEqualTo(Boolean value) {
            addCriterion("update_lock =", value, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockNotEqualTo(Boolean value) {
            addCriterion("update_lock <>", value, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockGreaterThan(Boolean value) {
            addCriterion("update_lock >", value, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("update_lock >=", value, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockLessThan(Boolean value) {
            addCriterion("update_lock <", value, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockLessThanOrEqualTo(Boolean value) {
            addCriterion("update_lock <=", value, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockIn(List<Boolean> values) {
            addCriterion("update_lock in", values, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockNotIn(List<Boolean> values) {
            addCriterion("update_lock not in", values, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockBetween(Boolean value1, Boolean value2) {
            addCriterion("update_lock between", value1, value2, "updateLock");
            return (Criteria) this;
        }

        public Criteria andUpdateLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("update_lock not between", value1, value2, "updateLock");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagIsNull() {
            addCriterion("synchronousFlag is null");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagIsNotNull() {
            addCriterion("synchronousFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagEqualTo(String value) {
            addCriterion("synchronousFlag =", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagNotEqualTo(String value) {
            addCriterion("synchronousFlag <>", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagGreaterThan(String value) {
            addCriterion("synchronousFlag >", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagGreaterThanOrEqualTo(String value) {
            addCriterion("synchronousFlag >=", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagLessThan(String value) {
            addCriterion("synchronousFlag <", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagLessThanOrEqualTo(String value) {
            addCriterion("synchronousFlag <=", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagLike(String value) {
            addCriterion("synchronousFlag like", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagNotLike(String value) {
            addCriterion("synchronousFlag not like", value, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagIn(List<String> values) {
            addCriterion("synchronousFlag in", values, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagNotIn(List<String> values) {
            addCriterion("synchronousFlag not in", values, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagBetween(String value1, String value2) {
            addCriterion("synchronousFlag between", value1, value2, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andSynchronousflagNotBetween(String value1, String value2) {
            addCriterion("synchronousFlag not between", value1, value2, "synchronousflag");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdIsNull() {
            addCriterion("third_item_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdIsNotNull() {
            addCriterion("third_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdEqualTo(String value) {
            addCriterion("third_item_id =", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdNotEqualTo(String value) {
            addCriterion("third_item_id <>", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdGreaterThan(String value) {
            addCriterion("third_item_id >", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_item_id >=", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdLessThan(String value) {
            addCriterion("third_item_id <", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdLessThanOrEqualTo(String value) {
            addCriterion("third_item_id <=", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdLike(String value) {
            addCriterion("third_item_id like", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdNotLike(String value) {
            addCriterion("third_item_id not like", value, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdIn(List<String> values) {
            addCriterion("third_item_id in", values, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdNotIn(List<String> values) {
            addCriterion("third_item_id not in", values, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdBetween(String value1, String value2) {
            addCriterion("third_item_id between", value1, value2, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andThirdItemIdNotBetween(String value1, String value2) {
            addCriterion("third_item_id not between", value1, value2, "thirdItemId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdIsNull() {
            addCriterion("partner_product_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdIsNotNull() {
            addCriterion("partner_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdEqualTo(Long value) {
            addCriterion("partner_product_id =", value, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdNotEqualTo(Long value) {
            addCriterion("partner_product_id <>", value, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdGreaterThan(Long value) {
            addCriterion("partner_product_id >", value, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("partner_product_id >=", value, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdLessThan(Long value) {
            addCriterion("partner_product_id <", value, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdLessThanOrEqualTo(Long value) {
            addCriterion("partner_product_id <=", value, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdIn(List<Long> values) {
            addCriterion("partner_product_id in", values, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdNotIn(List<Long> values) {
            addCriterion("partner_product_id not in", values, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdBetween(Long value1, Long value2) {
            addCriterion("partner_product_id between", value1, value2, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andPartnerProductIdNotBetween(Long value1, Long value2) {
            addCriterion("partner_product_id not between", value1, value2, "partnerProductId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}