package com.ky.jyg.assess.survey.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurveyHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyHouseExample() {
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

        public Criteria andAcceptIdIsNull() {
            addCriterion("accept_id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptIdIsNotNull() {
            addCriterion("accept_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptIdEqualTo(Long value) {
            addCriterion("accept_id =", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdNotEqualTo(Long value) {
            addCriterion("accept_id <>", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdGreaterThan(Long value) {
            addCriterion("accept_id >", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accept_id >=", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdLessThan(Long value) {
            addCriterion("accept_id <", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdLessThanOrEqualTo(Long value) {
            addCriterion("accept_id <=", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdIn(List<Long> values) {
            addCriterion("accept_id in", values, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdNotIn(List<Long> values) {
            addCriterion("accept_id not in", values, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdBetween(Long value1, Long value2) {
            addCriterion("accept_id between", value1, value2, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdNotBetween(Long value1, Long value2) {
            addCriterion("accept_id not between", value1, value2, "acceptId");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameIsNull() {
            addCriterion("housing_estate_name is null");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameIsNotNull() {
            addCriterion("housing_estate_name is not null");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameEqualTo(String value) {
            addCriterion("housing_estate_name =", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameNotEqualTo(String value) {
            addCriterion("housing_estate_name <>", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameGreaterThan(String value) {
            addCriterion("housing_estate_name >", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameGreaterThanOrEqualTo(String value) {
            addCriterion("housing_estate_name >=", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameLessThan(String value) {
            addCriterion("housing_estate_name <", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameLessThanOrEqualTo(String value) {
            addCriterion("housing_estate_name <=", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameLike(String value) {
            addCriterion("housing_estate_name like", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameNotLike(String value) {
            addCriterion("housing_estate_name not like", value, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameIn(List<String> values) {
            addCriterion("housing_estate_name in", values, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameNotIn(List<String> values) {
            addCriterion("housing_estate_name not in", values, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameBetween(String value1, String value2) {
            addCriterion("housing_estate_name between", value1, value2, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andHousingEstateNameNotBetween(String value1, String value2) {
            addCriterion("housing_estate_name not between", value1, value2, "housingEstateName");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameIsNull() {
            addCriterion("developer_name is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameIsNotNull() {
            addCriterion("developer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameEqualTo(String value) {
            addCriterion("developer_name =", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotEqualTo(String value) {
            addCriterion("developer_name <>", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameGreaterThan(String value) {
            addCriterion("developer_name >", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameGreaterThanOrEqualTo(String value) {
            addCriterion("developer_name >=", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameLessThan(String value) {
            addCriterion("developer_name <", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameLessThanOrEqualTo(String value) {
            addCriterion("developer_name <=", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameLike(String value) {
            addCriterion("developer_name like", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotLike(String value) {
            addCriterion("developer_name not like", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameIn(List<String> values) {
            addCriterion("developer_name in", values, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotIn(List<String> values) {
            addCriterion("developer_name not in", values, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameBetween(String value1, String value2) {
            addCriterion("developer_name between", value1, value2, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotBetween(String value1, String value2) {
            addCriterion("developer_name not between", value1, value2, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeIsNull() {
            addCriterion("developer_type is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeIsNotNull() {
            addCriterion("developer_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeEqualTo(String value) {
            addCriterion("developer_type =", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeNotEqualTo(String value) {
            addCriterion("developer_type <>", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeGreaterThan(String value) {
            addCriterion("developer_type >", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("developer_type >=", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeLessThan(String value) {
            addCriterion("developer_type <", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeLessThanOrEqualTo(String value) {
            addCriterion("developer_type <=", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeLike(String value) {
            addCriterion("developer_type like", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeNotLike(String value) {
            addCriterion("developer_type not like", value, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeIn(List<String> values) {
            addCriterion("developer_type in", values, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeNotIn(List<String> values) {
            addCriterion("developer_type not in", values, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeBetween(String value1, String value2) {
            addCriterion("developer_type between", value1, value2, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeNotBetween(String value1, String value2) {
            addCriterion("developer_type not between", value1, value2, "developerType");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeIsNull() {
            addCriterion("developer_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeIsNotNull() {
            addCriterion("developer_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeEqualTo(String value) {
            addCriterion("developer_type_code =", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeNotEqualTo(String value) {
            addCriterion("developer_type_code <>", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeGreaterThan(String value) {
            addCriterion("developer_type_code >", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("developer_type_code >=", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeLessThan(String value) {
            addCriterion("developer_type_code <", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("developer_type_code <=", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeLike(String value) {
            addCriterion("developer_type_code like", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeNotLike(String value) {
            addCriterion("developer_type_code not like", value, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeIn(List<String> values) {
            addCriterion("developer_type_code in", values, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeNotIn(List<String> values) {
            addCriterion("developer_type_code not in", values, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeBetween(String value1, String value2) {
            addCriterion("developer_type_code between", value1, value2, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeveloperTypeCodeNotBetween(String value1, String value2) {
            addCriterion("developer_type_code not between", value1, value2, "developerTypeCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelIsNull() {
            addCriterion("refproperty_level is null");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelIsNotNull() {
            addCriterion("refproperty_level is not null");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelEqualTo(String value) {
            addCriterion("refproperty_level =", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelNotEqualTo(String value) {
            addCriterion("refproperty_level <>", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelGreaterThan(String value) {
            addCriterion("refproperty_level >", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("refproperty_level >=", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelLessThan(String value) {
            addCriterion("refproperty_level <", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelLessThanOrEqualTo(String value) {
            addCriterion("refproperty_level <=", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelLike(String value) {
            addCriterion("refproperty_level like", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelNotLike(String value) {
            addCriterion("refproperty_level not like", value, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelIn(List<String> values) {
            addCriterion("refproperty_level in", values, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelNotIn(List<String> values) {
            addCriterion("refproperty_level not in", values, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelBetween(String value1, String value2) {
            addCriterion("refproperty_level between", value1, value2, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelNotBetween(String value1, String value2) {
            addCriterion("refproperty_level not between", value1, value2, "refpropertyLevel");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeIsNull() {
            addCriterion("refproperty_level_code is null");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeIsNotNull() {
            addCriterion("refproperty_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeEqualTo(String value) {
            addCriterion("refproperty_level_code =", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeNotEqualTo(String value) {
            addCriterion("refproperty_level_code <>", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeGreaterThan(String value) {
            addCriterion("refproperty_level_code >", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("refproperty_level_code >=", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeLessThan(String value) {
            addCriterion("refproperty_level_code <", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("refproperty_level_code <=", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeLike(String value) {
            addCriterion("refproperty_level_code like", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeNotLike(String value) {
            addCriterion("refproperty_level_code not like", value, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeIn(List<String> values) {
            addCriterion("refproperty_level_code in", values, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeNotIn(List<String> values) {
            addCriterion("refproperty_level_code not in", values, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeBetween(String value1, String value2) {
            addCriterion("refproperty_level_code between", value1, value2, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andRefpropertyLevelCodeNotBetween(String value1, String value2) {
            addCriterion("refproperty_level_code not between", value1, value2, "refpropertyLevelCode");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalIsNull() {
            addCriterion("buildings_total is null");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalIsNotNull() {
            addCriterion("buildings_total is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalEqualTo(Byte value) {
            addCriterion("buildings_total =", value, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalNotEqualTo(Byte value) {
            addCriterion("buildings_total <>", value, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalGreaterThan(Byte value) {
            addCriterion("buildings_total >", value, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("buildings_total >=", value, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalLessThan(Byte value) {
            addCriterion("buildings_total <", value, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalLessThanOrEqualTo(Byte value) {
            addCriterion("buildings_total <=", value, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalIn(List<Byte> values) {
            addCriterion("buildings_total in", values, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalNotIn(List<Byte> values) {
            addCriterion("buildings_total not in", values, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalBetween(Byte value1, Byte value2) {
            addCriterion("buildings_total between", value1, value2, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingsTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("buildings_total not between", value1, value2, "buildingsTotal");
            return (Criteria) this;
        }

        public Criteria andSecurityStateIsNull() {
            addCriterion("security_state is null");
            return (Criteria) this;
        }

        public Criteria andSecurityStateIsNotNull() {
            addCriterion("security_state is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityStateEqualTo(String value) {
            addCriterion("security_state =", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateNotEqualTo(String value) {
            addCriterion("security_state <>", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateGreaterThan(String value) {
            addCriterion("security_state >", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateGreaterThanOrEqualTo(String value) {
            addCriterion("security_state >=", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateLessThan(String value) {
            addCriterion("security_state <", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateLessThanOrEqualTo(String value) {
            addCriterion("security_state <=", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateLike(String value) {
            addCriterion("security_state like", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateNotLike(String value) {
            addCriterion("security_state not like", value, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateIn(List<String> values) {
            addCriterion("security_state in", values, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateNotIn(List<String> values) {
            addCriterion("security_state not in", values, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateBetween(String value1, String value2) {
            addCriterion("security_state between", value1, value2, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateNotBetween(String value1, String value2) {
            addCriterion("security_state not between", value1, value2, "securityState");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeIsNull() {
            addCriterion("security_state_code is null");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeIsNotNull() {
            addCriterion("security_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeEqualTo(String value) {
            addCriterion("security_state_code =", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeNotEqualTo(String value) {
            addCriterion("security_state_code <>", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeGreaterThan(String value) {
            addCriterion("security_state_code >", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("security_state_code >=", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeLessThan(String value) {
            addCriterion("security_state_code <", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeLessThanOrEqualTo(String value) {
            addCriterion("security_state_code <=", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeLike(String value) {
            addCriterion("security_state_code like", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeNotLike(String value) {
            addCriterion("security_state_code not like", value, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeIn(List<String> values) {
            addCriterion("security_state_code in", values, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeNotIn(List<String> values) {
            addCriterion("security_state_code not in", values, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeBetween(String value1, String value2) {
            addCriterion("security_state_code between", value1, value2, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andSecurityStateCodeNotBetween(String value1, String value2) {
            addCriterion("security_state_code not between", value1, value2, "securityStateCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentIsNull() {
            addCriterion("cultural_environment is null");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentIsNotNull() {
            addCriterion("cultural_environment is not null");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentEqualTo(String value) {
            addCriterion("cultural_environment =", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentNotEqualTo(String value) {
            addCriterion("cultural_environment <>", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentGreaterThan(String value) {
            addCriterion("cultural_environment >", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentGreaterThanOrEqualTo(String value) {
            addCriterion("cultural_environment >=", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentLessThan(String value) {
            addCriterion("cultural_environment <", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentLessThanOrEqualTo(String value) {
            addCriterion("cultural_environment <=", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentLike(String value) {
            addCriterion("cultural_environment like", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentNotLike(String value) {
            addCriterion("cultural_environment not like", value, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentIn(List<String> values) {
            addCriterion("cultural_environment in", values, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentNotIn(List<String> values) {
            addCriterion("cultural_environment not in", values, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentBetween(String value1, String value2) {
            addCriterion("cultural_environment between", value1, value2, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentNotBetween(String value1, String value2) {
            addCriterion("cultural_environment not between", value1, value2, "culturalEnvironment");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeIsNull() {
            addCriterion("cultural_environment_code is null");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeIsNotNull() {
            addCriterion("cultural_environment_code is not null");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeEqualTo(String value) {
            addCriterion("cultural_environment_code =", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeNotEqualTo(String value) {
            addCriterion("cultural_environment_code <>", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeGreaterThan(String value) {
            addCriterion("cultural_environment_code >", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cultural_environment_code >=", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeLessThan(String value) {
            addCriterion("cultural_environment_code <", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeLessThanOrEqualTo(String value) {
            addCriterion("cultural_environment_code <=", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeLike(String value) {
            addCriterion("cultural_environment_code like", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeNotLike(String value) {
            addCriterion("cultural_environment_code not like", value, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeIn(List<String> values) {
            addCriterion("cultural_environment_code in", values, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeNotIn(List<String> values) {
            addCriterion("cultural_environment_code not in", values, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeBetween(String value1, String value2) {
            addCriterion("cultural_environment_code between", value1, value2, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andCulturalEnvironmentCodeNotBetween(String value1, String value2) {
            addCriterion("cultural_environment_code not between", value1, value2, "culturalEnvironmentCode");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalIsNull() {
            addCriterion("bus_line_total is null");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalIsNotNull() {
            addCriterion("bus_line_total is not null");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalEqualTo(Byte value) {
            addCriterion("bus_line_total =", value, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalNotEqualTo(Byte value) {
            addCriterion("bus_line_total <>", value, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalGreaterThan(Byte value) {
            addCriterion("bus_line_total >", value, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("bus_line_total >=", value, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalLessThan(Byte value) {
            addCriterion("bus_line_total <", value, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalLessThanOrEqualTo(Byte value) {
            addCriterion("bus_line_total <=", value, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalIn(List<Byte> values) {
            addCriterion("bus_line_total in", values, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalNotIn(List<Byte> values) {
            addCriterion("bus_line_total not in", values, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalBetween(Byte value1, Byte value2) {
            addCriterion("bus_line_total between", value1, value2, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("bus_line_total not between", value1, value2, "busLineTotal");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedIsNull() {
            addCriterion("bus_line_detailed is null");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedIsNotNull() {
            addCriterion("bus_line_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedEqualTo(String value) {
            addCriterion("bus_line_detailed =", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedNotEqualTo(String value) {
            addCriterion("bus_line_detailed <>", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedGreaterThan(String value) {
            addCriterion("bus_line_detailed >", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("bus_line_detailed >=", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedLessThan(String value) {
            addCriterion("bus_line_detailed <", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedLessThanOrEqualTo(String value) {
            addCriterion("bus_line_detailed <=", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedLike(String value) {
            addCriterion("bus_line_detailed like", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedNotLike(String value) {
            addCriterion("bus_line_detailed not like", value, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedIn(List<String> values) {
            addCriterion("bus_line_detailed in", values, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedNotIn(List<String> values) {
            addCriterion("bus_line_detailed not in", values, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedBetween(String value1, String value2) {
            addCriterion("bus_line_detailed between", value1, value2, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andBusLineDetailedNotBetween(String value1, String value2) {
            addCriterion("bus_line_detailed not between", value1, value2, "busLineDetailed");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalIsNull() {
            addCriterion("metro_line_total is null");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalIsNotNull() {
            addCriterion("metro_line_total is not null");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalEqualTo(Byte value) {
            addCriterion("metro_line_total =", value, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalNotEqualTo(Byte value) {
            addCriterion("metro_line_total <>", value, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalGreaterThan(Byte value) {
            addCriterion("metro_line_total >", value, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("metro_line_total >=", value, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalLessThan(Byte value) {
            addCriterion("metro_line_total <", value, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalLessThanOrEqualTo(Byte value) {
            addCriterion("metro_line_total <=", value, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalIn(List<Byte> values) {
            addCriterion("metro_line_total in", values, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalNotIn(List<Byte> values) {
            addCriterion("metro_line_total not in", values, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalBetween(Byte value1, Byte value2) {
            addCriterion("metro_line_total between", value1, value2, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("metro_line_total not between", value1, value2, "metroLineTotal");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailIsNull() {
            addCriterion("metro_line_detail is null");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailIsNotNull() {
            addCriterion("metro_line_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailEqualTo(String value) {
            addCriterion("metro_line_detail =", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailNotEqualTo(String value) {
            addCriterion("metro_line_detail <>", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailGreaterThan(String value) {
            addCriterion("metro_line_detail >", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailGreaterThanOrEqualTo(String value) {
            addCriterion("metro_line_detail >=", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailLessThan(String value) {
            addCriterion("metro_line_detail <", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailLessThanOrEqualTo(String value) {
            addCriterion("metro_line_detail <=", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailLike(String value) {
            addCriterion("metro_line_detail like", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailNotLike(String value) {
            addCriterion("metro_line_detail not like", value, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailIn(List<String> values) {
            addCriterion("metro_line_detail in", values, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailNotIn(List<String> values) {
            addCriterion("metro_line_detail not in", values, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailBetween(String value1, String value2) {
            addCriterion("metro_line_detail between", value1, value2, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andMetroLineDetailNotBetween(String value1, String value2) {
            addCriterion("metro_line_detail not between", value1, value2, "metroLineDetail");
            return (Criteria) this;
        }

        public Criteria andEastToIsNull() {
            addCriterion("east_to is null");
            return (Criteria) this;
        }

        public Criteria andEastToIsNotNull() {
            addCriterion("east_to is not null");
            return (Criteria) this;
        }

        public Criteria andEastToEqualTo(String value) {
            addCriterion("east_to =", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToNotEqualTo(String value) {
            addCriterion("east_to <>", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToGreaterThan(String value) {
            addCriterion("east_to >", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToGreaterThanOrEqualTo(String value) {
            addCriterion("east_to >=", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToLessThan(String value) {
            addCriterion("east_to <", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToLessThanOrEqualTo(String value) {
            addCriterion("east_to <=", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToLike(String value) {
            addCriterion("east_to like", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToNotLike(String value) {
            addCriterion("east_to not like", value, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToIn(List<String> values) {
            addCriterion("east_to in", values, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToNotIn(List<String> values) {
            addCriterion("east_to not in", values, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToBetween(String value1, String value2) {
            addCriterion("east_to between", value1, value2, "eastTo");
            return (Criteria) this;
        }

        public Criteria andEastToNotBetween(String value1, String value2) {
            addCriterion("east_to not between", value1, value2, "eastTo");
            return (Criteria) this;
        }

        public Criteria andSouthToIsNull() {
            addCriterion("south_to is null");
            return (Criteria) this;
        }

        public Criteria andSouthToIsNotNull() {
            addCriterion("south_to is not null");
            return (Criteria) this;
        }

        public Criteria andSouthToEqualTo(String value) {
            addCriterion("south_to =", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToNotEqualTo(String value) {
            addCriterion("south_to <>", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToGreaterThan(String value) {
            addCriterion("south_to >", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToGreaterThanOrEqualTo(String value) {
            addCriterion("south_to >=", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToLessThan(String value) {
            addCriterion("south_to <", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToLessThanOrEqualTo(String value) {
            addCriterion("south_to <=", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToLike(String value) {
            addCriterion("south_to like", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToNotLike(String value) {
            addCriterion("south_to not like", value, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToIn(List<String> values) {
            addCriterion("south_to in", values, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToNotIn(List<String> values) {
            addCriterion("south_to not in", values, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToBetween(String value1, String value2) {
            addCriterion("south_to between", value1, value2, "southTo");
            return (Criteria) this;
        }

        public Criteria andSouthToNotBetween(String value1, String value2) {
            addCriterion("south_to not between", value1, value2, "southTo");
            return (Criteria) this;
        }

        public Criteria andWestToIsNull() {
            addCriterion("west_to is null");
            return (Criteria) this;
        }

        public Criteria andWestToIsNotNull() {
            addCriterion("west_to is not null");
            return (Criteria) this;
        }

        public Criteria andWestToEqualTo(String value) {
            addCriterion("west_to =", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToNotEqualTo(String value) {
            addCriterion("west_to <>", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToGreaterThan(String value) {
            addCriterion("west_to >", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToGreaterThanOrEqualTo(String value) {
            addCriterion("west_to >=", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToLessThan(String value) {
            addCriterion("west_to <", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToLessThanOrEqualTo(String value) {
            addCriterion("west_to <=", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToLike(String value) {
            addCriterion("west_to like", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToNotLike(String value) {
            addCriterion("west_to not like", value, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToIn(List<String> values) {
            addCriterion("west_to in", values, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToNotIn(List<String> values) {
            addCriterion("west_to not in", values, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToBetween(String value1, String value2) {
            addCriterion("west_to between", value1, value2, "westTo");
            return (Criteria) this;
        }

        public Criteria andWestToNotBetween(String value1, String value2) {
            addCriterion("west_to not between", value1, value2, "westTo");
            return (Criteria) this;
        }

        public Criteria andNorthToIsNull() {
            addCriterion("north_to is null");
            return (Criteria) this;
        }

        public Criteria andNorthToIsNotNull() {
            addCriterion("north_to is not null");
            return (Criteria) this;
        }

        public Criteria andNorthToEqualTo(String value) {
            addCriterion("north_to =", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToNotEqualTo(String value) {
            addCriterion("north_to <>", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToGreaterThan(String value) {
            addCriterion("north_to >", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToGreaterThanOrEqualTo(String value) {
            addCriterion("north_to >=", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToLessThan(String value) {
            addCriterion("north_to <", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToLessThanOrEqualTo(String value) {
            addCriterion("north_to <=", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToLike(String value) {
            addCriterion("north_to like", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToNotLike(String value) {
            addCriterion("north_to not like", value, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToIn(List<String> values) {
            addCriterion("north_to in", values, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToNotIn(List<String> values) {
            addCriterion("north_to not in", values, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToBetween(String value1, String value2) {
            addCriterion("north_to between", value1, value2, "northTo");
            return (Criteria) this;
        }

        public Criteria andNorthToNotBetween(String value1, String value2) {
            addCriterion("north_to not between", value1, value2, "northTo");
            return (Criteria) this;
        }

        public Criteria andPublicServiceIsNull() {
            addCriterion("public_service is null");
            return (Criteria) this;
        }

        public Criteria andPublicServiceIsNotNull() {
            addCriterion("public_service is not null");
            return (Criteria) this;
        }

        public Criteria andPublicServiceEqualTo(String value) {
            addCriterion("public_service =", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceNotEqualTo(String value) {
            addCriterion("public_service <>", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceGreaterThan(String value) {
            addCriterion("public_service >", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceGreaterThanOrEqualTo(String value) {
            addCriterion("public_service >=", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceLessThan(String value) {
            addCriterion("public_service <", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceLessThanOrEqualTo(String value) {
            addCriterion("public_service <=", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceLike(String value) {
            addCriterion("public_service like", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceNotLike(String value) {
            addCriterion("public_service not like", value, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceIn(List<String> values) {
            addCriterion("public_service in", values, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceNotIn(List<String> values) {
            addCriterion("public_service not in", values, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceBetween(String value1, String value2) {
            addCriterion("public_service between", value1, value2, "publicService");
            return (Criteria) this;
        }

        public Criteria andPublicServiceNotBetween(String value1, String value2) {
            addCriterion("public_service not between", value1, value2, "publicService");
            return (Criteria) this;
        }

        public Criteria andPolluteStateIsNull() {
            addCriterion("pollute_state is null");
            return (Criteria) this;
        }

        public Criteria andPolluteStateIsNotNull() {
            addCriterion("pollute_state is not null");
            return (Criteria) this;
        }

        public Criteria andPolluteStateEqualTo(String value) {
            addCriterion("pollute_state =", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateNotEqualTo(String value) {
            addCriterion("pollute_state <>", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateGreaterThan(String value) {
            addCriterion("pollute_state >", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateGreaterThanOrEqualTo(String value) {
            addCriterion("pollute_state >=", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateLessThan(String value) {
            addCriterion("pollute_state <", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateLessThanOrEqualTo(String value) {
            addCriterion("pollute_state <=", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateLike(String value) {
            addCriterion("pollute_state like", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateNotLike(String value) {
            addCriterion("pollute_state not like", value, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateIn(List<String> values) {
            addCriterion("pollute_state in", values, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateNotIn(List<String> values) {
            addCriterion("pollute_state not in", values, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateBetween(String value1, String value2) {
            addCriterion("pollute_state between", value1, value2, "polluteState");
            return (Criteria) this;
        }

        public Criteria andPolluteStateNotBetween(String value1, String value2) {
            addCriterion("pollute_state not between", value1, value2, "polluteState");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoIsNull() {
            addCriterion("house_building_no is null");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoIsNotNull() {
            addCriterion("house_building_no is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoEqualTo(Byte value) {
            addCriterion("house_building_no =", value, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoNotEqualTo(Byte value) {
            addCriterion("house_building_no <>", value, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoGreaterThan(Byte value) {
            addCriterion("house_building_no >", value, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_building_no >=", value, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoLessThan(Byte value) {
            addCriterion("house_building_no <", value, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoLessThanOrEqualTo(Byte value) {
            addCriterion("house_building_no <=", value, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoIn(List<Byte> values) {
            addCriterion("house_building_no in", values, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoNotIn(List<Byte> values) {
            addCriterion("house_building_no not in", values, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoBetween(Byte value1, Byte value2) {
            addCriterion("house_building_no between", value1, value2, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andHouseBuildingNoNotBetween(Byte value1, Byte value2) {
            addCriterion("house_building_no not between", value1, value2, "houseBuildingNo");
            return (Criteria) this;
        }

        public Criteria andUnitTotalIsNull() {
            addCriterion("unit_total is null");
            return (Criteria) this;
        }

        public Criteria andUnitTotalIsNotNull() {
            addCriterion("unit_total is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTotalEqualTo(Byte value) {
            addCriterion("unit_total =", value, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalNotEqualTo(Byte value) {
            addCriterion("unit_total <>", value, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalGreaterThan(Byte value) {
            addCriterion("unit_total >", value, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("unit_total >=", value, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalLessThan(Byte value) {
            addCriterion("unit_total <", value, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalLessThanOrEqualTo(Byte value) {
            addCriterion("unit_total <=", value, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalIn(List<Byte> values) {
            addCriterion("unit_total in", values, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalNotIn(List<Byte> values) {
            addCriterion("unit_total not in", values, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalBetween(Byte value1, Byte value2) {
            addCriterion("unit_total between", value1, value2, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andUnitTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("unit_total not between", value1, value2, "unitTotal");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageIsNull() {
            addCriterion("building_usage is null");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageIsNotNull() {
            addCriterion("building_usage is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageEqualTo(String value) {
            addCriterion("building_usage =", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageNotEqualTo(String value) {
            addCriterion("building_usage <>", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageGreaterThan(String value) {
            addCriterion("building_usage >", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageGreaterThanOrEqualTo(String value) {
            addCriterion("building_usage >=", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageLessThan(String value) {
            addCriterion("building_usage <", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageLessThanOrEqualTo(String value) {
            addCriterion("building_usage <=", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageLike(String value) {
            addCriterion("building_usage like", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageNotLike(String value) {
            addCriterion("building_usage not like", value, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageIn(List<String> values) {
            addCriterion("building_usage in", values, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageNotIn(List<String> values) {
            addCriterion("building_usage not in", values, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageBetween(String value1, String value2) {
            addCriterion("building_usage between", value1, value2, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageNotBetween(String value1, String value2) {
            addCriterion("building_usage not between", value1, value2, "buildingUsage");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeIsNull() {
            addCriterion("building_usage_code is null");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeIsNotNull() {
            addCriterion("building_usage_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeEqualTo(String value) {
            addCriterion("building_usage_code =", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeNotEqualTo(String value) {
            addCriterion("building_usage_code <>", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeGreaterThan(String value) {
            addCriterion("building_usage_code >", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("building_usage_code >=", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeLessThan(String value) {
            addCriterion("building_usage_code <", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeLessThanOrEqualTo(String value) {
            addCriterion("building_usage_code <=", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeLike(String value) {
            addCriterion("building_usage_code like", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeNotLike(String value) {
            addCriterion("building_usage_code not like", value, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeIn(List<String> values) {
            addCriterion("building_usage_code in", values, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeNotIn(List<String> values) {
            addCriterion("building_usage_code not in", values, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeBetween(String value1, String value2) {
            addCriterion("building_usage_code between", value1, value2, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingUsageCodeNotBetween(String value1, String value2) {
            addCriterion("building_usage_code not between", value1, value2, "buildingUsageCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNull() {
            addCriterion("building_type is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNotNull() {
            addCriterion("building_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeEqualTo(String value) {
            addCriterion("building_type =", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotEqualTo(String value) {
            addCriterion("building_type <>", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThan(String value) {
            addCriterion("building_type >", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("building_type >=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThan(String value) {
            addCriterion("building_type <", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThanOrEqualTo(String value) {
            addCriterion("building_type <=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLike(String value) {
            addCriterion("building_type like", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotLike(String value) {
            addCriterion("building_type not like", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIn(List<String> values) {
            addCriterion("building_type in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotIn(List<String> values) {
            addCriterion("building_type not in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeBetween(String value1, String value2) {
            addCriterion("building_type between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotBetween(String value1, String value2) {
            addCriterion("building_type not between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeIsNull() {
            addCriterion("building_type_code is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeIsNotNull() {
            addCriterion("building_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeEqualTo(String value) {
            addCriterion("building_type_code =", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeNotEqualTo(String value) {
            addCriterion("building_type_code <>", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeGreaterThan(String value) {
            addCriterion("building_type_code >", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("building_type_code >=", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeLessThan(String value) {
            addCriterion("building_type_code <", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("building_type_code <=", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeLike(String value) {
            addCriterion("building_type_code like", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeNotLike(String value) {
            addCriterion("building_type_code not like", value, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeIn(List<String> values) {
            addCriterion("building_type_code in", values, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeNotIn(List<String> values) {
            addCriterion("building_type_code not in", values, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeBetween(String value1, String value2) {
            addCriterion("building_type_code between", value1, value2, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeCodeNotBetween(String value1, String value2) {
            addCriterion("building_type_code not between", value1, value2, "buildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeIsNull() {
            addCriterion("direction_type is null");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeIsNotNull() {
            addCriterion("direction_type is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeEqualTo(String value) {
            addCriterion("direction_type =", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeNotEqualTo(String value) {
            addCriterion("direction_type <>", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeGreaterThan(String value) {
            addCriterion("direction_type >", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("direction_type >=", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeLessThan(String value) {
            addCriterion("direction_type <", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeLessThanOrEqualTo(String value) {
            addCriterion("direction_type <=", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeLike(String value) {
            addCriterion("direction_type like", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeNotLike(String value) {
            addCriterion("direction_type not like", value, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeIn(List<String> values) {
            addCriterion("direction_type in", values, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeNotIn(List<String> values) {
            addCriterion("direction_type not in", values, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeBetween(String value1, String value2) {
            addCriterion("direction_type between", value1, value2, "directionType");
            return (Criteria) this;
        }

        public Criteria andDirectionTypeNotBetween(String value1, String value2) {
            addCriterion("direction_type not between", value1, value2, "directionType");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateIsNull() {
            addCriterion("face_street_state is null");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateIsNotNull() {
            addCriterion("face_street_state is not null");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateEqualTo(String value) {
            addCriterion("face_street_state =", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotEqualTo(String value) {
            addCriterion("face_street_state <>", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateGreaterThan(String value) {
            addCriterion("face_street_state >", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateGreaterThanOrEqualTo(String value) {
            addCriterion("face_street_state >=", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateLessThan(String value) {
            addCriterion("face_street_state <", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateLessThanOrEqualTo(String value) {
            addCriterion("face_street_state <=", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateLike(String value) {
            addCriterion("face_street_state like", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotLike(String value) {
            addCriterion("face_street_state not like", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateIn(List<String> values) {
            addCriterion("face_street_state in", values, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotIn(List<String> values) {
            addCriterion("face_street_state not in", values, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateBetween(String value1, String value2) {
            addCriterion("face_street_state between", value1, value2, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotBetween(String value1, String value2) {
            addCriterion("face_street_state not between", value1, value2, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeIsNull() {
            addCriterion("face_street_state_code is null");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeIsNotNull() {
            addCriterion("face_street_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeEqualTo(String value) {
            addCriterion("face_street_state_code =", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeNotEqualTo(String value) {
            addCriterion("face_street_state_code <>", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeGreaterThan(String value) {
            addCriterion("face_street_state_code >", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("face_street_state_code >=", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeLessThan(String value) {
            addCriterion("face_street_state_code <", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeLessThanOrEqualTo(String value) {
            addCriterion("face_street_state_code <=", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeLike(String value) {
            addCriterion("face_street_state_code like", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeNotLike(String value) {
            addCriterion("face_street_state_code not like", value, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeIn(List<String> values) {
            addCriterion("face_street_state_code in", values, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeNotIn(List<String> values) {
            addCriterion("face_street_state_code not in", values, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeBetween(String value1, String value2) {
            addCriterion("face_street_state_code between", value1, value2, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateCodeNotBetween(String value1, String value2) {
            addCriterion("face_street_state_code not between", value1, value2, "faceStreetStateCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureIsNull() {
            addCriterion("building_structure is null");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureIsNotNull() {
            addCriterion("building_structure is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureEqualTo(String value) {
            addCriterion("building_structure =", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureNotEqualTo(String value) {
            addCriterion("building_structure <>", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureGreaterThan(String value) {
            addCriterion("building_structure >", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureGreaterThanOrEqualTo(String value) {
            addCriterion("building_structure >=", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureLessThan(String value) {
            addCriterion("building_structure <", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureLessThanOrEqualTo(String value) {
            addCriterion("building_structure <=", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureLike(String value) {
            addCriterion("building_structure like", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureNotLike(String value) {
            addCriterion("building_structure not like", value, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureIn(List<String> values) {
            addCriterion("building_structure in", values, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureNotIn(List<String> values) {
            addCriterion("building_structure not in", values, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureBetween(String value1, String value2) {
            addCriterion("building_structure between", value1, value2, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureNotBetween(String value1, String value2) {
            addCriterion("building_structure not between", value1, value2, "buildingStructure");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeIsNull() {
            addCriterion("building_structure_code is null");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeIsNotNull() {
            addCriterion("building_structure_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeEqualTo(String value) {
            addCriterion("building_structure_code =", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeNotEqualTo(String value) {
            addCriterion("building_structure_code <>", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeGreaterThan(String value) {
            addCriterion("building_structure_code >", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("building_structure_code >=", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeLessThan(String value) {
            addCriterion("building_structure_code <", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeLessThanOrEqualTo(String value) {
            addCriterion("building_structure_code <=", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeLike(String value) {
            addCriterion("building_structure_code like", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeNotLike(String value) {
            addCriterion("building_structure_code not like", value, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeIn(List<String> values) {
            addCriterion("building_structure_code in", values, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeNotIn(List<String> values) {
            addCriterion("building_structure_code not in", values, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeBetween(String value1, String value2) {
            addCriterion("building_structure_code between", value1, value2, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuildingStructureCodeNotBetween(String value1, String value2) {
            addCriterion("building_structure_code not between", value1, value2, "buildingStructureCode");
            return (Criteria) this;
        }

        public Criteria andBuiltYearIsNull() {
            addCriterion("built_year is null");
            return (Criteria) this;
        }

        public Criteria andBuiltYearIsNotNull() {
            addCriterion("built_year is not null");
            return (Criteria) this;
        }

        public Criteria andBuiltYearEqualTo(Short value) {
            addCriterion("built_year =", value, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearNotEqualTo(Short value) {
            addCriterion("built_year <>", value, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearGreaterThan(Short value) {
            addCriterion("built_year >", value, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearGreaterThanOrEqualTo(Short value) {
            addCriterion("built_year >=", value, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearLessThan(Short value) {
            addCriterion("built_year <", value, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearLessThanOrEqualTo(Short value) {
            addCriterion("built_year <=", value, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearIn(List<Short> values) {
            addCriterion("built_year in", values, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearNotIn(List<Short> values) {
            addCriterion("built_year not in", values, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearBetween(Short value1, Short value2) {
            addCriterion("built_year between", value1, value2, "builtYear");
            return (Criteria) this;
        }

        public Criteria andBuiltYearNotBetween(Short value1, Short value2) {
            addCriterion("built_year not between", value1, value2, "builtYear");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeIsNull() {
            addCriterion("landscape_grade is null");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeIsNotNull() {
            addCriterion("landscape_grade is not null");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeEqualTo(String value) {
            addCriterion("landscape_grade =", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeNotEqualTo(String value) {
            addCriterion("landscape_grade <>", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeGreaterThan(String value) {
            addCriterion("landscape_grade >", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeGreaterThanOrEqualTo(String value) {
            addCriterion("landscape_grade >=", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeLessThan(String value) {
            addCriterion("landscape_grade <", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeLessThanOrEqualTo(String value) {
            addCriterion("landscape_grade <=", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeLike(String value) {
            addCriterion("landscape_grade like", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeNotLike(String value) {
            addCriterion("landscape_grade not like", value, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeIn(List<String> values) {
            addCriterion("landscape_grade in", values, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeNotIn(List<String> values) {
            addCriterion("landscape_grade not in", values, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeBetween(String value1, String value2) {
            addCriterion("landscape_grade between", value1, value2, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeNotBetween(String value1, String value2) {
            addCriterion("landscape_grade not between", value1, value2, "landscapeGrade");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeIsNull() {
            addCriterion("landscape_grade_code is null");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeIsNotNull() {
            addCriterion("landscape_grade_code is not null");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeEqualTo(String value) {
            addCriterion("landscape_grade_code =", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeNotEqualTo(String value) {
            addCriterion("landscape_grade_code <>", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeGreaterThan(String value) {
            addCriterion("landscape_grade_code >", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("landscape_grade_code >=", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeLessThan(String value) {
            addCriterion("landscape_grade_code <", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeLessThanOrEqualTo(String value) {
            addCriterion("landscape_grade_code <=", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeLike(String value) {
            addCriterion("landscape_grade_code like", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeNotLike(String value) {
            addCriterion("landscape_grade_code not like", value, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeIn(List<String> values) {
            addCriterion("landscape_grade_code in", values, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeNotIn(List<String> values) {
            addCriterion("landscape_grade_code not in", values, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeBetween(String value1, String value2) {
            addCriterion("landscape_grade_code between", value1, value2, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andLandscapeGradeCodeNotBetween(String value1, String value2) {
            addCriterion("landscape_grade_code not between", value1, value2, "landscapeGradeCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateIsNull() {
            addCriterion("health_state is null");
            return (Criteria) this;
        }

        public Criteria andHealthStateIsNotNull() {
            addCriterion("health_state is not null");
            return (Criteria) this;
        }

        public Criteria andHealthStateEqualTo(String value) {
            addCriterion("health_state =", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateNotEqualTo(String value) {
            addCriterion("health_state <>", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateGreaterThan(String value) {
            addCriterion("health_state >", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateGreaterThanOrEqualTo(String value) {
            addCriterion("health_state >=", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateLessThan(String value) {
            addCriterion("health_state <", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateLessThanOrEqualTo(String value) {
            addCriterion("health_state <=", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateLike(String value) {
            addCriterion("health_state like", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateNotLike(String value) {
            addCriterion("health_state not like", value, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateIn(List<String> values) {
            addCriterion("health_state in", values, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateNotIn(List<String> values) {
            addCriterion("health_state not in", values, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateBetween(String value1, String value2) {
            addCriterion("health_state between", value1, value2, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateNotBetween(String value1, String value2) {
            addCriterion("health_state not between", value1, value2, "healthState");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeIsNull() {
            addCriterion("health_state_code is null");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeIsNotNull() {
            addCriterion("health_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeEqualTo(String value) {
            addCriterion("health_state_code =", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeNotEqualTo(String value) {
            addCriterion("health_state_code <>", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeGreaterThan(String value) {
            addCriterion("health_state_code >", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("health_state_code >=", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeLessThan(String value) {
            addCriterion("health_state_code <", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeLessThanOrEqualTo(String value) {
            addCriterion("health_state_code <=", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeLike(String value) {
            addCriterion("health_state_code like", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeNotLike(String value) {
            addCriterion("health_state_code not like", value, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeIn(List<String> values) {
            addCriterion("health_state_code in", values, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeNotIn(List<String> values) {
            addCriterion("health_state_code not in", values, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeBetween(String value1, String value2) {
            addCriterion("health_state_code between", value1, value2, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andHealthStateCodeNotBetween(String value1, String value2) {
            addCriterion("health_state_code not between", value1, value2, "healthStateCode");
            return (Criteria) this;
        }

        public Criteria andOutWallIsNull() {
            addCriterion("out_wall is null");
            return (Criteria) this;
        }

        public Criteria andOutWallIsNotNull() {
            addCriterion("out_wall is not null");
            return (Criteria) this;
        }

        public Criteria andOutWallEqualTo(String value) {
            addCriterion("out_wall =", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallNotEqualTo(String value) {
            addCriterion("out_wall <>", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallGreaterThan(String value) {
            addCriterion("out_wall >", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallGreaterThanOrEqualTo(String value) {
            addCriterion("out_wall >=", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallLessThan(String value) {
            addCriterion("out_wall <", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallLessThanOrEqualTo(String value) {
            addCriterion("out_wall <=", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallLike(String value) {
            addCriterion("out_wall like", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallNotLike(String value) {
            addCriterion("out_wall not like", value, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallIn(List<String> values) {
            addCriterion("out_wall in", values, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallNotIn(List<String> values) {
            addCriterion("out_wall not in", values, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallBetween(String value1, String value2) {
            addCriterion("out_wall between", value1, value2, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallNotBetween(String value1, String value2) {
            addCriterion("out_wall not between", value1, value2, "outWall");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeIsNull() {
            addCriterion("out_wall_code is null");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeIsNotNull() {
            addCriterion("out_wall_code is not null");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeEqualTo(String value) {
            addCriterion("out_wall_code =", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeNotEqualTo(String value) {
            addCriterion("out_wall_code <>", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeGreaterThan(String value) {
            addCriterion("out_wall_code >", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeGreaterThanOrEqualTo(String value) {
            addCriterion("out_wall_code >=", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeLessThan(String value) {
            addCriterion("out_wall_code <", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeLessThanOrEqualTo(String value) {
            addCriterion("out_wall_code <=", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeLike(String value) {
            addCriterion("out_wall_code like", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeNotLike(String value) {
            addCriterion("out_wall_code not like", value, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeIn(List<String> values) {
            addCriterion("out_wall_code in", values, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeNotIn(List<String> values) {
            addCriterion("out_wall_code not in", values, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeBetween(String value1, String value2) {
            addCriterion("out_wall_code between", value1, value2, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andOutWallCodeNotBetween(String value1, String value2) {
            addCriterion("out_wall_code not between", value1, value2, "outWallCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIsNull() {
            addCriterion("parking_space is null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIsNotNull() {
            addCriterion("parking_space is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceEqualTo(String value) {
            addCriterion("parking_space =", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotEqualTo(String value) {
            addCriterion("parking_space <>", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceGreaterThan(String value) {
            addCriterion("parking_space >", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("parking_space >=", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLessThan(String value) {
            addCriterion("parking_space <", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLessThanOrEqualTo(String value) {
            addCriterion("parking_space <=", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLike(String value) {
            addCriterion("parking_space like", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotLike(String value) {
            addCriterion("parking_space not like", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIn(List<String> values) {
            addCriterion("parking_space in", values, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotIn(List<String> values) {
            addCriterion("parking_space not in", values, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceBetween(String value1, String value2) {
            addCriterion("parking_space between", value1, value2, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotBetween(String value1, String value2) {
            addCriterion("parking_space not between", value1, value2, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalIsNull() {
            addCriterion("parking_space_total is null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalIsNotNull() {
            addCriterion("parking_space_total is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalEqualTo(String value) {
            addCriterion("parking_space_total =", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalNotEqualTo(String value) {
            addCriterion("parking_space_total <>", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalGreaterThan(String value) {
            addCriterion("parking_space_total >", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalGreaterThanOrEqualTo(String value) {
            addCriterion("parking_space_total >=", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalLessThan(String value) {
            addCriterion("parking_space_total <", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalLessThanOrEqualTo(String value) {
            addCriterion("parking_space_total <=", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalLike(String value) {
            addCriterion("parking_space_total like", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalNotLike(String value) {
            addCriterion("parking_space_total not like", value, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalIn(List<String> values) {
            addCriterion("parking_space_total in", values, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalNotIn(List<String> values) {
            addCriterion("parking_space_total not in", values, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalBetween(String value1, String value2) {
            addCriterion("parking_space_total between", value1, value2, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalNotBetween(String value1, String value2) {
            addCriterion("parking_space_total not between", value1, value2, "parkingSpaceTotal");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeIsNull() {
            addCriterion("parking_space_total_code is null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeIsNotNull() {
            addCriterion("parking_space_total_code is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeEqualTo(String value) {
            addCriterion("parking_space_total_code =", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeNotEqualTo(String value) {
            addCriterion("parking_space_total_code <>", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeGreaterThan(String value) {
            addCriterion("parking_space_total_code >", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parking_space_total_code >=", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeLessThan(String value) {
            addCriterion("parking_space_total_code <", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeLessThanOrEqualTo(String value) {
            addCriterion("parking_space_total_code <=", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeLike(String value) {
            addCriterion("parking_space_total_code like", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeNotLike(String value) {
            addCriterion("parking_space_total_code not like", value, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeIn(List<String> values) {
            addCriterion("parking_space_total_code in", values, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeNotIn(List<String> values) {
            addCriterion("parking_space_total_code not in", values, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeBetween(String value1, String value2) {
            addCriterion("parking_space_total_code between", value1, value2, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceTotalCodeNotBetween(String value1, String value2) {
            addCriterion("parking_space_total_code not between", value1, value2, "parkingSpaceTotalCode");
            return (Criteria) this;
        }

        public Criteria andInfrastructureIsNull() {
            addCriterion("infrastructure is null");
            return (Criteria) this;
        }

        public Criteria andInfrastructureIsNotNull() {
            addCriterion("infrastructure is not null");
            return (Criteria) this;
        }

        public Criteria andInfrastructureEqualTo(String value) {
            addCriterion("infrastructure =", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureNotEqualTo(String value) {
            addCriterion("infrastructure <>", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureGreaterThan(String value) {
            addCriterion("infrastructure >", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureGreaterThanOrEqualTo(String value) {
            addCriterion("infrastructure >=", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureLessThan(String value) {
            addCriterion("infrastructure <", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureLessThanOrEqualTo(String value) {
            addCriterion("infrastructure <=", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureLike(String value) {
            addCriterion("infrastructure like", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureNotLike(String value) {
            addCriterion("infrastructure not like", value, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureIn(List<String> values) {
            addCriterion("infrastructure in", values, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureNotIn(List<String> values) {
            addCriterion("infrastructure not in", values, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureBetween(String value1, String value2) {
            addCriterion("infrastructure between", value1, value2, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andInfrastructureNotBetween(String value1, String value2) {
            addCriterion("infrastructure not between", value1, value2, "infrastructure");
            return (Criteria) this;
        }

        public Criteria andUnitNumberIsNull() {
            addCriterion("unit_number is null");
            return (Criteria) this;
        }

        public Criteria andUnitNumberIsNotNull() {
            addCriterion("unit_number is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNumberEqualTo(Byte value) {
            addCriterion("unit_number =", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberNotEqualTo(Byte value) {
            addCriterion("unit_number <>", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberGreaterThan(Byte value) {
            addCriterion("unit_number >", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("unit_number >=", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberLessThan(Byte value) {
            addCriterion("unit_number <", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberLessThanOrEqualTo(Byte value) {
            addCriterion("unit_number <=", value, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberIn(List<Byte> values) {
            addCriterion("unit_number in", values, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberNotIn(List<Byte> values) {
            addCriterion("unit_number not in", values, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberBetween(Byte value1, Byte value2) {
            addCriterion("unit_number between", value1, value2, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andUnitNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("unit_number not between", value1, value2, "unitNumber");
            return (Criteria) this;
        }

        public Criteria andFloorTotalIsNull() {
            addCriterion("floor_total is null");
            return (Criteria) this;
        }

        public Criteria andFloorTotalIsNotNull() {
            addCriterion("floor_total is not null");
            return (Criteria) this;
        }

        public Criteria andFloorTotalEqualTo(Byte value) {
            addCriterion("floor_total =", value, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalNotEqualTo(Byte value) {
            addCriterion("floor_total <>", value, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalGreaterThan(Byte value) {
            addCriterion("floor_total >", value, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("floor_total >=", value, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalLessThan(Byte value) {
            addCriterion("floor_total <", value, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalLessThanOrEqualTo(Byte value) {
            addCriterion("floor_total <=", value, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalIn(List<Byte> values) {
            addCriterion("floor_total in", values, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalNotIn(List<Byte> values) {
            addCriterion("floor_total not in", values, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalBetween(Byte value1, Byte value2) {
            addCriterion("floor_total between", value1, value2, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("floor_total not between", value1, value2, "floorTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalIsNull() {
            addCriterion("floor_cycles_total is null");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalIsNotNull() {
            addCriterion("floor_cycles_total is not null");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalEqualTo(Byte value) {
            addCriterion("floor_cycles_total =", value, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalNotEqualTo(Byte value) {
            addCriterion("floor_cycles_total <>", value, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalGreaterThan(Byte value) {
            addCriterion("floor_cycles_total >", value, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("floor_cycles_total >=", value, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalLessThan(Byte value) {
            addCriterion("floor_cycles_total <", value, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalLessThanOrEqualTo(Byte value) {
            addCriterion("floor_cycles_total <=", value, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalIn(List<Byte> values) {
            addCriterion("floor_cycles_total in", values, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalNotIn(List<Byte> values) {
            addCriterion("floor_cycles_total not in", values, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalBetween(Byte value1, Byte value2) {
            addCriterion("floor_cycles_total between", value1, value2, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andFloorCyclesTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("floor_cycles_total not between", value1, value2, "floorCyclesTotal");
            return (Criteria) this;
        }

        public Criteria andUnitUsageIsNull() {
            addCriterion("unit_usage is null");
            return (Criteria) this;
        }

        public Criteria andUnitUsageIsNotNull() {
            addCriterion("unit_usage is not null");
            return (Criteria) this;
        }

        public Criteria andUnitUsageEqualTo(String value) {
            addCriterion("unit_usage =", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageNotEqualTo(String value) {
            addCriterion("unit_usage <>", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageGreaterThan(String value) {
            addCriterion("unit_usage >", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageGreaterThanOrEqualTo(String value) {
            addCriterion("unit_usage >=", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageLessThan(String value) {
            addCriterion("unit_usage <", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageLessThanOrEqualTo(String value) {
            addCriterion("unit_usage <=", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageLike(String value) {
            addCriterion("unit_usage like", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageNotLike(String value) {
            addCriterion("unit_usage not like", value, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageIn(List<String> values) {
            addCriterion("unit_usage in", values, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageNotIn(List<String> values) {
            addCriterion("unit_usage not in", values, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageBetween(String value1, String value2) {
            addCriterion("unit_usage between", value1, value2, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageNotBetween(String value1, String value2) {
            addCriterion("unit_usage not between", value1, value2, "unitUsage");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeIsNull() {
            addCriterion("unit_usage_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeIsNotNull() {
            addCriterion("unit_usage_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeEqualTo(String value) {
            addCriterion("unit_usage_code =", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeNotEqualTo(String value) {
            addCriterion("unit_usage_code <>", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeGreaterThan(String value) {
            addCriterion("unit_usage_code >", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_usage_code >=", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeLessThan(String value) {
            addCriterion("unit_usage_code <", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_usage_code <=", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeLike(String value) {
            addCriterion("unit_usage_code like", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeNotLike(String value) {
            addCriterion("unit_usage_code not like", value, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeIn(List<String> values) {
            addCriterion("unit_usage_code in", values, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeNotIn(List<String> values) {
            addCriterion("unit_usage_code not in", values, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeBetween(String value1, String value2) {
            addCriterion("unit_usage_code between", value1, value2, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andUnitUsageCodeNotBetween(String value1, String value2) {
            addCriterion("unit_usage_code not between", value1, value2, "unitUsageCode");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalIsNull() {
            addCriterion("elevator_total is null");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalIsNotNull() {
            addCriterion("elevator_total is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalEqualTo(Byte value) {
            addCriterion("elevator_total =", value, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalNotEqualTo(Byte value) {
            addCriterion("elevator_total <>", value, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalGreaterThan(Byte value) {
            addCriterion("elevator_total >", value, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("elevator_total >=", value, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalLessThan(Byte value) {
            addCriterion("elevator_total <", value, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalLessThanOrEqualTo(Byte value) {
            addCriterion("elevator_total <=", value, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalIn(List<Byte> values) {
            addCriterion("elevator_total in", values, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalNotIn(List<Byte> values) {
            addCriterion("elevator_total not in", values, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalBetween(Byte value1, Byte value2) {
            addCriterion("elevator_total between", value1, value2, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andElevatorTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("elevator_total not between", value1, value2, "elevatorTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalIsNull() {
            addCriterion("ladder_total is null");
            return (Criteria) this;
        }

        public Criteria andLadderTotalIsNotNull() {
            addCriterion("ladder_total is not null");
            return (Criteria) this;
        }

        public Criteria andLadderTotalEqualTo(Byte value) {
            addCriterion("ladder_total =", value, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalNotEqualTo(Byte value) {
            addCriterion("ladder_total <>", value, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalGreaterThan(Byte value) {
            addCriterion("ladder_total >", value, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("ladder_total >=", value, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalLessThan(Byte value) {
            addCriterion("ladder_total <", value, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalLessThanOrEqualTo(Byte value) {
            addCriterion("ladder_total <=", value, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalIn(List<Byte> values) {
            addCriterion("ladder_total in", values, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalNotIn(List<Byte> values) {
            addCriterion("ladder_total not in", values, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalBetween(Byte value1, Byte value2) {
            addCriterion("ladder_total between", value1, value2, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andLadderTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("ladder_total not between", value1, value2, "ladderTotal");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(Integer value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(Integer value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(Integer value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(Integer value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(Integer value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<Integer> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<Integer> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(Integer value1, Integer value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeIsNull() {
            addCriterion("certificate_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeIsNotNull() {
            addCriterion("certificate_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeEqualTo(String value) {
            addCriterion("certificate_type_code =", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeNotEqualTo(String value) {
            addCriterion("certificate_type_code <>", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeGreaterThan(String value) {
            addCriterion("certificate_type_code >", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type_code >=", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeLessThan(String value) {
            addCriterion("certificate_type_code <", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type_code <=", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeLike(String value) {
            addCriterion("certificate_type_code like", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeNotLike(String value) {
            addCriterion("certificate_type_code not like", value, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeIn(List<String> values) {
            addCriterion("certificate_type_code in", values, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeNotIn(List<String> values) {
            addCriterion("certificate_type_code not in", values, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeBetween(String value1, String value2) {
            addCriterion("certificate_type_code between", value1, value2, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeCodeNotBetween(String value1, String value2) {
            addCriterion("certificate_type_code not between", value1, value2, "certificateTypeCode");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIsNull() {
            addCriterion("nature_code is null");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIsNotNull() {
            addCriterion("nature_code is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCodeEqualTo(String value) {
            addCriterion("nature_code =", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotEqualTo(String value) {
            addCriterion("nature_code <>", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeGreaterThan(String value) {
            addCriterion("nature_code >", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nature_code >=", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLessThan(String value) {
            addCriterion("nature_code <", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLessThanOrEqualTo(String value) {
            addCriterion("nature_code <=", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLike(String value) {
            addCriterion("nature_code like", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotLike(String value) {
            addCriterion("nature_code not like", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIn(List<String> values) {
            addCriterion("nature_code in", values, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotIn(List<String> values) {
            addCriterion("nature_code not in", values, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeBetween(String value1, String value2) {
            addCriterion("nature_code between", value1, value2, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotBetween(String value1, String value2) {
            addCriterion("nature_code not between", value1, value2, "natureCode");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificate_no =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificate_no <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificate_no >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_no >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificate_no <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificate_no <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificate_no like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_no not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificate_no in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificate_no not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificate_no between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificate_no not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andPurposePlanIsNull() {
            addCriterion("purpose_plan is null");
            return (Criteria) this;
        }

        public Criteria andPurposePlanIsNotNull() {
            addCriterion("purpose_plan is not null");
            return (Criteria) this;
        }

        public Criteria andPurposePlanEqualTo(String value) {
            addCriterion("purpose_plan =", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanNotEqualTo(String value) {
            addCriterion("purpose_plan <>", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanGreaterThan(String value) {
            addCriterion("purpose_plan >", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_plan >=", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanLessThan(String value) {
            addCriterion("purpose_plan <", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanLessThanOrEqualTo(String value) {
            addCriterion("purpose_plan <=", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanLike(String value) {
            addCriterion("purpose_plan like", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanNotLike(String value) {
            addCriterion("purpose_plan not like", value, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanIn(List<String> values) {
            addCriterion("purpose_plan in", values, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanNotIn(List<String> values) {
            addCriterion("purpose_plan not in", values, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanBetween(String value1, String value2) {
            addCriterion("purpose_plan between", value1, value2, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andPurposePlanNotBetween(String value1, String value2) {
            addCriterion("purpose_plan not between", value1, value2, "purposePlan");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsIsNull() {
            addCriterion("common_warrants is null");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsIsNotNull() {
            addCriterion("common_warrants is not null");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsEqualTo(String value) {
            addCriterion("common_warrants =", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsNotEqualTo(String value) {
            addCriterion("common_warrants <>", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsGreaterThan(String value) {
            addCriterion("common_warrants >", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsGreaterThanOrEqualTo(String value) {
            addCriterion("common_warrants >=", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsLessThan(String value) {
            addCriterion("common_warrants <", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsLessThanOrEqualTo(String value) {
            addCriterion("common_warrants <=", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsLike(String value) {
            addCriterion("common_warrants like", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsNotLike(String value) {
            addCriterion("common_warrants not like", value, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsIn(List<String> values) {
            addCriterion("common_warrants in", values, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsNotIn(List<String> values) {
            addCriterion("common_warrants not in", values, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsBetween(String value1, String value2) {
            addCriterion("common_warrants between", value1, value2, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCommonWarrantsNotBetween(String value1, String value2) {
            addCriterion("common_warrants not between", value1, value2, "commonWarrants");
            return (Criteria) this;
        }

        public Criteria andCoOwnerIsNull() {
            addCriterion("co_owner is null");
            return (Criteria) this;
        }

        public Criteria andCoOwnerIsNotNull() {
            addCriterion("co_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCoOwnerEqualTo(String value) {
            addCriterion("co_owner =", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerNotEqualTo(String value) {
            addCriterion("co_owner <>", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerGreaterThan(String value) {
            addCriterion("co_owner >", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("co_owner >=", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerLessThan(String value) {
            addCriterion("co_owner <", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerLessThanOrEqualTo(String value) {
            addCriterion("co_owner <=", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerLike(String value) {
            addCriterion("co_owner like", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerNotLike(String value) {
            addCriterion("co_owner not like", value, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerIn(List<String> values) {
            addCriterion("co_owner in", values, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerNotIn(List<String> values) {
            addCriterion("co_owner not in", values, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerBetween(String value1, String value2) {
            addCriterion("co_owner between", value1, value2, "coOwner");
            return (Criteria) this;
        }

        public Criteria andCoOwnerNotBetween(String value1, String value2) {
            addCriterion("co_owner not between", value1, value2, "coOwner");
            return (Criteria) this;
        }

        public Criteria andHousingProductionIsNull() {
            addCriterion("housing_production is null");
            return (Criteria) this;
        }

        public Criteria andHousingProductionIsNotNull() {
            addCriterion("housing_production is not null");
            return (Criteria) this;
        }

        public Criteria andHousingProductionEqualTo(String value) {
            addCriterion("housing_production =", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionNotEqualTo(String value) {
            addCriterion("housing_production <>", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionGreaterThan(String value) {
            addCriterion("housing_production >", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionGreaterThanOrEqualTo(String value) {
            addCriterion("housing_production >=", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionLessThan(String value) {
            addCriterion("housing_production <", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionLessThanOrEqualTo(String value) {
            addCriterion("housing_production <=", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionLike(String value) {
            addCriterion("housing_production like", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionNotLike(String value) {
            addCriterion("housing_production not like", value, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionIn(List<String> values) {
            addCriterion("housing_production in", values, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionNotIn(List<String> values) {
            addCriterion("housing_production not in", values, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionBetween(String value1, String value2) {
            addCriterion("housing_production between", value1, value2, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andHousingProductionNotBetween(String value1, String value2) {
            addCriterion("housing_production not between", value1, value2, "housingProduction");
            return (Criteria) this;
        }

        public Criteria andApartmentIsNull() {
            addCriterion("apartment is null");
            return (Criteria) this;
        }

        public Criteria andApartmentIsNotNull() {
            addCriterion("apartment is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentEqualTo(String value) {
            addCriterion("apartment =", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotEqualTo(String value) {
            addCriterion("apartment <>", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentGreaterThan(String value) {
            addCriterion("apartment >", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentGreaterThanOrEqualTo(String value) {
            addCriterion("apartment >=", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentLessThan(String value) {
            addCriterion("apartment <", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentLessThanOrEqualTo(String value) {
            addCriterion("apartment <=", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentLike(String value) {
            addCriterion("apartment like", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotLike(String value) {
            addCriterion("apartment not like", value, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentIn(List<String> values) {
            addCriterion("apartment in", values, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotIn(List<String> values) {
            addCriterion("apartment not in", values, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentBetween(String value1, String value2) {
            addCriterion("apartment between", value1, value2, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentNotBetween(String value1, String value2) {
            addCriterion("apartment not between", value1, value2, "apartment");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeIsNull() {
            addCriterion("apartment_code is null");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeIsNotNull() {
            addCriterion("apartment_code is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeEqualTo(String value) {
            addCriterion("apartment_code =", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeNotEqualTo(String value) {
            addCriterion("apartment_code <>", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeGreaterThan(String value) {
            addCriterion("apartment_code >", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apartment_code >=", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeLessThan(String value) {
            addCriterion("apartment_code <", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("apartment_code <=", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeLike(String value) {
            addCriterion("apartment_code like", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeNotLike(String value) {
            addCriterion("apartment_code not like", value, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeIn(List<String> values) {
            addCriterion("apartment_code in", values, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeNotIn(List<String> values) {
            addCriterion("apartment_code not in", values, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeBetween(String value1, String value2) {
            addCriterion("apartment_code between", value1, value2, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andApartmentCodeNotBetween(String value1, String value2) {
            addCriterion("apartment_code not between", value1, value2, "apartmentCode");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNull() {
            addCriterion("use_state is null");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNotNull() {
            addCriterion("use_state is not null");
            return (Criteria) this;
        }

        public Criteria andUseStateEqualTo(String value) {
            addCriterion("use_state =", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotEqualTo(String value) {
            addCriterion("use_state <>", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThan(String value) {
            addCriterion("use_state >", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThanOrEqualTo(String value) {
            addCriterion("use_state >=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThan(String value) {
            addCriterion("use_state <", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThanOrEqualTo(String value) {
            addCriterion("use_state <=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLike(String value) {
            addCriterion("use_state like", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotLike(String value) {
            addCriterion("use_state not like", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateIn(List<String> values) {
            addCriterion("use_state in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotIn(List<String> values) {
            addCriterion("use_state not in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateBetween(String value1, String value2) {
            addCriterion("use_state between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotBetween(String value1, String value2) {
            addCriterion("use_state not between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeIsNull() {
            addCriterion("use_state_code is null");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeIsNotNull() {
            addCriterion("use_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeEqualTo(String value) {
            addCriterion("use_state_code =", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeNotEqualTo(String value) {
            addCriterion("use_state_code <>", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeGreaterThan(String value) {
            addCriterion("use_state_code >", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("use_state_code >=", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeLessThan(String value) {
            addCriterion("use_state_code <", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeLessThanOrEqualTo(String value) {
            addCriterion("use_state_code <=", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeLike(String value) {
            addCriterion("use_state_code like", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeNotLike(String value) {
            addCriterion("use_state_code not like", value, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeIn(List<String> values) {
            addCriterion("use_state_code in", values, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeNotIn(List<String> values) {
            addCriterion("use_state_code not in", values, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeBetween(String value1, String value2) {
            addCriterion("use_state_code between", value1, value2, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andUseStateCodeNotBetween(String value1, String value2) {
            addCriterion("use_state_code not between", value1, value2, "useStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateIsNull() {
            addCriterion("renovation_state is null");
            return (Criteria) this;
        }

        public Criteria andRenovationStateIsNotNull() {
            addCriterion("renovation_state is not null");
            return (Criteria) this;
        }

        public Criteria andRenovationStateEqualTo(String value) {
            addCriterion("renovation_state =", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotEqualTo(String value) {
            addCriterion("renovation_state <>", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateGreaterThan(String value) {
            addCriterion("renovation_state >", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateGreaterThanOrEqualTo(String value) {
            addCriterion("renovation_state >=", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateLessThan(String value) {
            addCriterion("renovation_state <", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateLessThanOrEqualTo(String value) {
            addCriterion("renovation_state <=", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateLike(String value) {
            addCriterion("renovation_state like", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotLike(String value) {
            addCriterion("renovation_state not like", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateIn(List<String> values) {
            addCriterion("renovation_state in", values, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotIn(List<String> values) {
            addCriterion("renovation_state not in", values, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateBetween(String value1, String value2) {
            addCriterion("renovation_state between", value1, value2, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotBetween(String value1, String value2) {
            addCriterion("renovation_state not between", value1, value2, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeIsNull() {
            addCriterion("renovation_state_code is null");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeIsNotNull() {
            addCriterion("renovation_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeEqualTo(String value) {
            addCriterion("renovation_state_code =", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeNotEqualTo(String value) {
            addCriterion("renovation_state_code <>", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeGreaterThan(String value) {
            addCriterion("renovation_state_code >", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("renovation_state_code >=", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeLessThan(String value) {
            addCriterion("renovation_state_code <", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeLessThanOrEqualTo(String value) {
            addCriterion("renovation_state_code <=", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeLike(String value) {
            addCriterion("renovation_state_code like", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeNotLike(String value) {
            addCriterion("renovation_state_code not like", value, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeIn(List<String> values) {
            addCriterion("renovation_state_code in", values, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeNotIn(List<String> values) {
            addCriterion("renovation_state_code not in", values, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeBetween(String value1, String value2) {
            addCriterion("renovation_state_code between", value1, value2, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andRenovationStateCodeNotBetween(String value1, String value2) {
            addCriterion("renovation_state_code not between", value1, value2, "renovationStateCode");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateIsNull() {
            addCriterion("house_new_rate is null");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateIsNotNull() {
            addCriterion("house_new_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateEqualTo(BigDecimal value) {
            addCriterion("house_new_rate =", value, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateNotEqualTo(BigDecimal value) {
            addCriterion("house_new_rate <>", value, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateGreaterThan(BigDecimal value) {
            addCriterion("house_new_rate >", value, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_new_rate >=", value, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateLessThan(BigDecimal value) {
            addCriterion("house_new_rate <", value, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_new_rate <=", value, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateIn(List<BigDecimal> values) {
            addCriterion("house_new_rate in", values, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateNotIn(List<BigDecimal> values) {
            addCriterion("house_new_rate not in", values, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_new_rate between", value1, value2, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andHouseNewRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_new_rate not between", value1, value2, "houseNewRate");
            return (Criteria) this;
        }

        public Criteria andRoomCountIsNull() {
            addCriterion("room_count is null");
            return (Criteria) this;
        }

        public Criteria andRoomCountIsNotNull() {
            addCriterion("room_count is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCountEqualTo(Byte value) {
            addCriterion("room_count =", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotEqualTo(Byte value) {
            addCriterion("room_count <>", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountGreaterThan(Byte value) {
            addCriterion("room_count >", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("room_count >=", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountLessThan(Byte value) {
            addCriterion("room_count <", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountLessThanOrEqualTo(Byte value) {
            addCriterion("room_count <=", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountIn(List<Byte> values) {
            addCriterion("room_count in", values, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotIn(List<Byte> values) {
            addCriterion("room_count not in", values, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountBetween(Byte value1, Byte value2) {
            addCriterion("room_count between", value1, value2, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotBetween(Byte value1, Byte value2) {
            addCriterion("room_count not between", value1, value2, "roomCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountIsNull() {
            addCriterion("parlour_count is null");
            return (Criteria) this;
        }

        public Criteria andParlourCountIsNotNull() {
            addCriterion("parlour_count is not null");
            return (Criteria) this;
        }

        public Criteria andParlourCountEqualTo(Byte value) {
            addCriterion("parlour_count =", value, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountNotEqualTo(Byte value) {
            addCriterion("parlour_count <>", value, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountGreaterThan(Byte value) {
            addCriterion("parlour_count >", value, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("parlour_count >=", value, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountLessThan(Byte value) {
            addCriterion("parlour_count <", value, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountLessThanOrEqualTo(Byte value) {
            addCriterion("parlour_count <=", value, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountIn(List<Byte> values) {
            addCriterion("parlour_count in", values, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountNotIn(List<Byte> values) {
            addCriterion("parlour_count not in", values, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountBetween(Byte value1, Byte value2) {
            addCriterion("parlour_count between", value1, value2, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andParlourCountNotBetween(Byte value1, Byte value2) {
            addCriterion("parlour_count not between", value1, value2, "parlourCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountIsNull() {
            addCriterion("balcony_count is null");
            return (Criteria) this;
        }

        public Criteria andBalconyCountIsNotNull() {
            addCriterion("balcony_count is not null");
            return (Criteria) this;
        }

        public Criteria andBalconyCountEqualTo(Byte value) {
            addCriterion("balcony_count =", value, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountNotEqualTo(Byte value) {
            addCriterion("balcony_count <>", value, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountGreaterThan(Byte value) {
            addCriterion("balcony_count >", value, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("balcony_count >=", value, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountLessThan(Byte value) {
            addCriterion("balcony_count <", value, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountLessThanOrEqualTo(Byte value) {
            addCriterion("balcony_count <=", value, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountIn(List<Byte> values) {
            addCriterion("balcony_count in", values, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountNotIn(List<Byte> values) {
            addCriterion("balcony_count not in", values, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountBetween(Byte value1, Byte value2) {
            addCriterion("balcony_count between", value1, value2, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBalconyCountNotBetween(Byte value1, Byte value2) {
            addCriterion("balcony_count not between", value1, value2, "balconyCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountIsNull() {
            addCriterion("bathroom_count is null");
            return (Criteria) this;
        }

        public Criteria andBathroomCountIsNotNull() {
            addCriterion("bathroom_count is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomCountEqualTo(Byte value) {
            addCriterion("bathroom_count =", value, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountNotEqualTo(Byte value) {
            addCriterion("bathroom_count <>", value, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountGreaterThan(Byte value) {
            addCriterion("bathroom_count >", value, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("bathroom_count >=", value, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountLessThan(Byte value) {
            addCriterion("bathroom_count <", value, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountLessThanOrEqualTo(Byte value) {
            addCriterion("bathroom_count <=", value, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountIn(List<Byte> values) {
            addCriterion("bathroom_count in", values, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountNotIn(List<Byte> values) {
            addCriterion("bathroom_count not in", values, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountBetween(Byte value1, Byte value2) {
            addCriterion("bathroom_count between", value1, value2, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andBathroomCountNotBetween(Byte value1, Byte value2) {
            addCriterion("bathroom_count not between", value1, value2, "bathroomCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountIsNull() {
            addCriterion("kitchen_count is null");
            return (Criteria) this;
        }

        public Criteria andKitchenCountIsNotNull() {
            addCriterion("kitchen_count is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenCountEqualTo(Byte value) {
            addCriterion("kitchen_count =", value, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountNotEqualTo(Byte value) {
            addCriterion("kitchen_count <>", value, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountGreaterThan(Byte value) {
            addCriterion("kitchen_count >", value, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("kitchen_count >=", value, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountLessThan(Byte value) {
            addCriterion("kitchen_count <", value, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountLessThanOrEqualTo(Byte value) {
            addCriterion("kitchen_count <=", value, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountIn(List<Byte> values) {
            addCriterion("kitchen_count in", values, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountNotIn(List<Byte> values) {
            addCriterion("kitchen_count not in", values, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountBetween(Byte value1, Byte value2) {
            addCriterion("kitchen_count between", value1, value2, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andKitchenCountNotBetween(Byte value1, Byte value2) {
            addCriterion("kitchen_count not between", value1, value2, "kitchenCount");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Byte value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Byte value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Byte value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Byte value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Byte value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Byte value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Byte> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Byte> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Byte value1, Byte value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Byte value1, Byte value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andCashAbilityIsNull() {
            addCriterion("cash_ability is null");
            return (Criteria) this;
        }

        public Criteria andCashAbilityIsNotNull() {
            addCriterion("cash_ability is not null");
            return (Criteria) this;
        }

        public Criteria andCashAbilityEqualTo(String value) {
            addCriterion("cash_ability =", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityNotEqualTo(String value) {
            addCriterion("cash_ability <>", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityGreaterThan(String value) {
            addCriterion("cash_ability >", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("cash_ability >=", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityLessThan(String value) {
            addCriterion("cash_ability <", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityLessThanOrEqualTo(String value) {
            addCriterion("cash_ability <=", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityLike(String value) {
            addCriterion("cash_ability like", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityNotLike(String value) {
            addCriterion("cash_ability not like", value, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityIn(List<String> values) {
            addCriterion("cash_ability in", values, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityNotIn(List<String> values) {
            addCriterion("cash_ability not in", values, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityBetween(String value1, String value2) {
            addCriterion("cash_ability between", value1, value2, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityNotBetween(String value1, String value2) {
            addCriterion("cash_ability not between", value1, value2, "cashAbility");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeIsNull() {
            addCriterion("cash_ability_code is null");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeIsNotNull() {
            addCriterion("cash_ability_code is not null");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeEqualTo(String value) {
            addCriterion("cash_ability_code =", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeNotEqualTo(String value) {
            addCriterion("cash_ability_code <>", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeGreaterThan(String value) {
            addCriterion("cash_ability_code >", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cash_ability_code >=", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeLessThan(String value) {
            addCriterion("cash_ability_code <", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeLessThanOrEqualTo(String value) {
            addCriterion("cash_ability_code <=", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeLike(String value) {
            addCriterion("cash_ability_code like", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeNotLike(String value) {
            addCriterion("cash_ability_code not like", value, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeIn(List<String> values) {
            addCriterion("cash_ability_code in", values, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeNotIn(List<String> values) {
            addCriterion("cash_ability_code not in", values, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeBetween(String value1, String value2) {
            addCriterion("cash_ability_code between", value1, value2, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andCashAbilityCodeNotBetween(String value1, String value2) {
            addCriterion("cash_ability_code not between", value1, value2, "cashAbilityCode");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNull() {
            addCriterion("reference_price is null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNotNull() {
            addCriterion("reference_price is not null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceEqualTo(BigDecimal value) {
            addCriterion("reference_price =", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotEqualTo(BigDecimal value) {
            addCriterion("reference_price <>", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThan(BigDecimal value) {
            addCriterion("reference_price >", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reference_price >=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThan(BigDecimal value) {
            addCriterion("reference_price <", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reference_price <=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIn(List<BigDecimal> values) {
            addCriterion("reference_price in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotIn(List<BigDecimal> values) {
            addCriterion("reference_price not in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reference_price between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reference_price not between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRentIsNull() {
            addCriterion("reference_rent is null");
            return (Criteria) this;
        }

        public Criteria andReferenceRentIsNotNull() {
            addCriterion("reference_rent is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceRentEqualTo(BigDecimal value) {
            addCriterion("reference_rent =", value, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentNotEqualTo(BigDecimal value) {
            addCriterion("reference_rent <>", value, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentGreaterThan(BigDecimal value) {
            addCriterion("reference_rent >", value, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reference_rent >=", value, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentLessThan(BigDecimal value) {
            addCriterion("reference_rent <", value, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reference_rent <=", value, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentIn(List<BigDecimal> values) {
            addCriterion("reference_rent in", values, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentNotIn(List<BigDecimal> values) {
            addCriterion("reference_rent not in", values, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reference_rent between", value1, value2, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andReferenceRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reference_rent not between", value1, value2, "referenceRent");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeIsNull() {
            addCriterion("refproperty_fee is null");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeIsNotNull() {
            addCriterion("refproperty_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeEqualTo(BigDecimal value) {
            addCriterion("refproperty_fee =", value, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeNotEqualTo(BigDecimal value) {
            addCriterion("refproperty_fee <>", value, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeGreaterThan(BigDecimal value) {
            addCriterion("refproperty_fee >", value, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refproperty_fee >=", value, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeLessThan(BigDecimal value) {
            addCriterion("refproperty_fee <", value, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refproperty_fee <=", value, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeIn(List<BigDecimal> values) {
            addCriterion("refproperty_fee in", values, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeNotIn(List<BigDecimal> values) {
            addCriterion("refproperty_fee not in", values, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refproperty_fee between", value1, value2, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andRefpropertyFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refproperty_fee not between", value1, value2, "refpropertyFee");
            return (Criteria) this;
        }

        public Criteria andTWindowIsNull() {
            addCriterion("t_window is null");
            return (Criteria) this;
        }

        public Criteria andTWindowIsNotNull() {
            addCriterion("t_window is not null");
            return (Criteria) this;
        }

        public Criteria andTWindowEqualTo(String value) {
            addCriterion("t_window =", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowNotEqualTo(String value) {
            addCriterion("t_window <>", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowGreaterThan(String value) {
            addCriterion("t_window >", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowGreaterThanOrEqualTo(String value) {
            addCriterion("t_window >=", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowLessThan(String value) {
            addCriterion("t_window <", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowLessThanOrEqualTo(String value) {
            addCriterion("t_window <=", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowLike(String value) {
            addCriterion("t_window like", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowNotLike(String value) {
            addCriterion("t_window not like", value, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowIn(List<String> values) {
            addCriterion("t_window in", values, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowNotIn(List<String> values) {
            addCriterion("t_window not in", values, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowBetween(String value1, String value2) {
            addCriterion("t_window between", value1, value2, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowNotBetween(String value1, String value2) {
            addCriterion("t_window not between", value1, value2, "tWindow");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeIsNull() {
            addCriterion("t_window_code is null");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeIsNotNull() {
            addCriterion("t_window_code is not null");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeEqualTo(String value) {
            addCriterion("t_window_code =", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeNotEqualTo(String value) {
            addCriterion("t_window_code <>", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeGreaterThan(String value) {
            addCriterion("t_window_code >", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeGreaterThanOrEqualTo(String value) {
            addCriterion("t_window_code >=", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeLessThan(String value) {
            addCriterion("t_window_code <", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeLessThanOrEqualTo(String value) {
            addCriterion("t_window_code <=", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeLike(String value) {
            addCriterion("t_window_code like", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeNotLike(String value) {
            addCriterion("t_window_code not like", value, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeIn(List<String> values) {
            addCriterion("t_window_code in", values, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeNotIn(List<String> values) {
            addCriterion("t_window_code not in", values, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeBetween(String value1, String value2) {
            addCriterion("t_window_code between", value1, value2, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andTWindowCodeNotBetween(String value1, String value2) {
            addCriterion("t_window_code not between", value1, value2, "tWindowCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorIsNull() {
            addCriterion("bathroom_door is null");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorIsNotNull() {
            addCriterion("bathroom_door is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorEqualTo(String value) {
            addCriterion("bathroom_door =", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorNotEqualTo(String value) {
            addCriterion("bathroom_door <>", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorGreaterThan(String value) {
            addCriterion("bathroom_door >", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorGreaterThanOrEqualTo(String value) {
            addCriterion("bathroom_door >=", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorLessThan(String value) {
            addCriterion("bathroom_door <", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorLessThanOrEqualTo(String value) {
            addCriterion("bathroom_door <=", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorLike(String value) {
            addCriterion("bathroom_door like", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorNotLike(String value) {
            addCriterion("bathroom_door not like", value, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorIn(List<String> values) {
            addCriterion("bathroom_door in", values, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorNotIn(List<String> values) {
            addCriterion("bathroom_door not in", values, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorBetween(String value1, String value2) {
            addCriterion("bathroom_door between", value1, value2, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorNotBetween(String value1, String value2) {
            addCriterion("bathroom_door not between", value1, value2, "bathroomDoor");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeIsNull() {
            addCriterion("bathroom_door_code is null");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeIsNotNull() {
            addCriterion("bathroom_door_code is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeEqualTo(String value) {
            addCriterion("bathroom_door_code =", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeNotEqualTo(String value) {
            addCriterion("bathroom_door_code <>", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeGreaterThan(String value) {
            addCriterion("bathroom_door_code >", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bathroom_door_code >=", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeLessThan(String value) {
            addCriterion("bathroom_door_code <", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeLessThanOrEqualTo(String value) {
            addCriterion("bathroom_door_code <=", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeLike(String value) {
            addCriterion("bathroom_door_code like", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeNotLike(String value) {
            addCriterion("bathroom_door_code not like", value, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeIn(List<String> values) {
            addCriterion("bathroom_door_code in", values, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeNotIn(List<String> values) {
            addCriterion("bathroom_door_code not in", values, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeBetween(String value1, String value2) {
            addCriterion("bathroom_door_code between", value1, value2, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBathroomDoorCodeNotBetween(String value1, String value2) {
            addCriterion("bathroom_door_code not between", value1, value2, "bathroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorIsNull() {
            addCriterion("inside_door is null");
            return (Criteria) this;
        }

        public Criteria andInsideDoorIsNotNull() {
            addCriterion("inside_door is not null");
            return (Criteria) this;
        }

        public Criteria andInsideDoorEqualTo(String value) {
            addCriterion("inside_door =", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorNotEqualTo(String value) {
            addCriterion("inside_door <>", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorGreaterThan(String value) {
            addCriterion("inside_door >", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorGreaterThanOrEqualTo(String value) {
            addCriterion("inside_door >=", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorLessThan(String value) {
            addCriterion("inside_door <", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorLessThanOrEqualTo(String value) {
            addCriterion("inside_door <=", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorLike(String value) {
            addCriterion("inside_door like", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorNotLike(String value) {
            addCriterion("inside_door not like", value, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorIn(List<String> values) {
            addCriterion("inside_door in", values, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorNotIn(List<String> values) {
            addCriterion("inside_door not in", values, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorBetween(String value1, String value2) {
            addCriterion("inside_door between", value1, value2, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorNotBetween(String value1, String value2) {
            addCriterion("inside_door not between", value1, value2, "insideDoor");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeIsNull() {
            addCriterion("inside_door_code is null");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeIsNotNull() {
            addCriterion("inside_door_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeEqualTo(String value) {
            addCriterion("inside_door_code =", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeNotEqualTo(String value) {
            addCriterion("inside_door_code <>", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeGreaterThan(String value) {
            addCriterion("inside_door_code >", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inside_door_code >=", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeLessThan(String value) {
            addCriterion("inside_door_code <", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeLessThanOrEqualTo(String value) {
            addCriterion("inside_door_code <=", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeLike(String value) {
            addCriterion("inside_door_code like", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeNotLike(String value) {
            addCriterion("inside_door_code not like", value, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeIn(List<String> values) {
            addCriterion("inside_door_code in", values, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeNotIn(List<String> values) {
            addCriterion("inside_door_code not in", values, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeBetween(String value1, String value2) {
            addCriterion("inside_door_code between", value1, value2, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInsideDoorCodeNotBetween(String value1, String value2) {
            addCriterion("inside_door_code not between", value1, value2, "insideDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorIsNull() {
            addCriterion("inroom_door is null");
            return (Criteria) this;
        }

        public Criteria andInroomDoorIsNotNull() {
            addCriterion("inroom_door is not null");
            return (Criteria) this;
        }

        public Criteria andInroomDoorEqualTo(String value) {
            addCriterion("inroom_door =", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorNotEqualTo(String value) {
            addCriterion("inroom_door <>", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorGreaterThan(String value) {
            addCriterion("inroom_door >", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorGreaterThanOrEqualTo(String value) {
            addCriterion("inroom_door >=", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorLessThan(String value) {
            addCriterion("inroom_door <", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorLessThanOrEqualTo(String value) {
            addCriterion("inroom_door <=", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorLike(String value) {
            addCriterion("inroom_door like", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorNotLike(String value) {
            addCriterion("inroom_door not like", value, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorIn(List<String> values) {
            addCriterion("inroom_door in", values, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorNotIn(List<String> values) {
            addCriterion("inroom_door not in", values, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorBetween(String value1, String value2) {
            addCriterion("inroom_door between", value1, value2, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorNotBetween(String value1, String value2) {
            addCriterion("inroom_door not between", value1, value2, "inroomDoor");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeIsNull() {
            addCriterion("inroom_door_code is null");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeIsNotNull() {
            addCriterion("inroom_door_code is not null");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeEqualTo(String value) {
            addCriterion("inroom_door_code =", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeNotEqualTo(String value) {
            addCriterion("inroom_door_code <>", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeGreaterThan(String value) {
            addCriterion("inroom_door_code >", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inroom_door_code >=", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeLessThan(String value) {
            addCriterion("inroom_door_code <", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeLessThanOrEqualTo(String value) {
            addCriterion("inroom_door_code <=", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeLike(String value) {
            addCriterion("inroom_door_code like", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeNotLike(String value) {
            addCriterion("inroom_door_code not like", value, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeIn(List<String> values) {
            addCriterion("inroom_door_code in", values, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeNotIn(List<String> values) {
            addCriterion("inroom_door_code not in", values, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeBetween(String value1, String value2) {
            addCriterion("inroom_door_code between", value1, value2, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andInroomDoorCodeNotBetween(String value1, String value2) {
            addCriterion("inroom_door_code not between", value1, value2, "inroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorIsNull() {
            addCriterion("bedroom_door is null");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorIsNotNull() {
            addCriterion("bedroom_door is not null");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorEqualTo(String value) {
            addCriterion("bedroom_door =", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorNotEqualTo(String value) {
            addCriterion("bedroom_door <>", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorGreaterThan(String value) {
            addCriterion("bedroom_door >", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorGreaterThanOrEqualTo(String value) {
            addCriterion("bedroom_door >=", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorLessThan(String value) {
            addCriterion("bedroom_door <", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorLessThanOrEqualTo(String value) {
            addCriterion("bedroom_door <=", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorLike(String value) {
            addCriterion("bedroom_door like", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorNotLike(String value) {
            addCriterion("bedroom_door not like", value, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorIn(List<String> values) {
            addCriterion("bedroom_door in", values, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorNotIn(List<String> values) {
            addCriterion("bedroom_door not in", values, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorBetween(String value1, String value2) {
            addCriterion("bedroom_door between", value1, value2, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorNotBetween(String value1, String value2) {
            addCriterion("bedroom_door not between", value1, value2, "bedroomDoor");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeIsNull() {
            addCriterion("bedroom_door_code is null");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeIsNotNull() {
            addCriterion("bedroom_door_code is not null");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeEqualTo(String value) {
            addCriterion("bedroom_door_code =", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeNotEqualTo(String value) {
            addCriterion("bedroom_door_code <>", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeGreaterThan(String value) {
            addCriterion("bedroom_door_code >", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bedroom_door_code >=", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeLessThan(String value) {
            addCriterion("bedroom_door_code <", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeLessThanOrEqualTo(String value) {
            addCriterion("bedroom_door_code <=", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeLike(String value) {
            addCriterion("bedroom_door_code like", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeNotLike(String value) {
            addCriterion("bedroom_door_code not like", value, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeIn(List<String> values) {
            addCriterion("bedroom_door_code in", values, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeNotIn(List<String> values) {
            addCriterion("bedroom_door_code not in", values, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeBetween(String value1, String value2) {
            addCriterion("bedroom_door_code between", value1, value2, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andBedroomDoorCodeNotBetween(String value1, String value2) {
            addCriterion("bedroom_door_code not between", value1, value2, "bedroomDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorIsNull() {
            addCriterion("kitchen_door is null");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorIsNotNull() {
            addCriterion("kitchen_door is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorEqualTo(String value) {
            addCriterion("kitchen_door =", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorNotEqualTo(String value) {
            addCriterion("kitchen_door <>", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorGreaterThan(String value) {
            addCriterion("kitchen_door >", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen_door >=", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorLessThan(String value) {
            addCriterion("kitchen_door <", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorLessThanOrEqualTo(String value) {
            addCriterion("kitchen_door <=", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorLike(String value) {
            addCriterion("kitchen_door like", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorNotLike(String value) {
            addCriterion("kitchen_door not like", value, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorIn(List<String> values) {
            addCriterion("kitchen_door in", values, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorNotIn(List<String> values) {
            addCriterion("kitchen_door not in", values, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorBetween(String value1, String value2) {
            addCriterion("kitchen_door between", value1, value2, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorNotBetween(String value1, String value2) {
            addCriterion("kitchen_door not between", value1, value2, "kitchenDoor");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeIsNull() {
            addCriterion("kitchen_door_code is null");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeIsNotNull() {
            addCriterion("kitchen_door_code is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeEqualTo(String value) {
            addCriterion("kitchen_door_code =", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeNotEqualTo(String value) {
            addCriterion("kitchen_door_code <>", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeGreaterThan(String value) {
            addCriterion("kitchen_door_code >", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen_door_code >=", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeLessThan(String value) {
            addCriterion("kitchen_door_code <", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeLessThanOrEqualTo(String value) {
            addCriterion("kitchen_door_code <=", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeLike(String value) {
            addCriterion("kitchen_door_code like", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeNotLike(String value) {
            addCriterion("kitchen_door_code not like", value, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeIn(List<String> values) {
            addCriterion("kitchen_door_code in", values, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeNotIn(List<String> values) {
            addCriterion("kitchen_door_code not in", values, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeBetween(String value1, String value2) {
            addCriterion("kitchen_door_code between", value1, value2, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andKitchenDoorCodeNotBetween(String value1, String value2) {
            addCriterion("kitchen_door_code not between", value1, value2, "kitchenDoorCode");
            return (Criteria) this;
        }

        public Criteria andWallIsNull() {
            addCriterion("wall is null");
            return (Criteria) this;
        }

        public Criteria andWallIsNotNull() {
            addCriterion("wall is not null");
            return (Criteria) this;
        }

        public Criteria andWallEqualTo(String value) {
            addCriterion("wall =", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallNotEqualTo(String value) {
            addCriterion("wall <>", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallGreaterThan(String value) {
            addCriterion("wall >", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallGreaterThanOrEqualTo(String value) {
            addCriterion("wall >=", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallLessThan(String value) {
            addCriterion("wall <", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallLessThanOrEqualTo(String value) {
            addCriterion("wall <=", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallLike(String value) {
            addCriterion("wall like", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallNotLike(String value) {
            addCriterion("wall not like", value, "wall");
            return (Criteria) this;
        }

        public Criteria andWallIn(List<String> values) {
            addCriterion("wall in", values, "wall");
            return (Criteria) this;
        }

        public Criteria andWallNotIn(List<String> values) {
            addCriterion("wall not in", values, "wall");
            return (Criteria) this;
        }

        public Criteria andWallBetween(String value1, String value2) {
            addCriterion("wall between", value1, value2, "wall");
            return (Criteria) this;
        }

        public Criteria andWallNotBetween(String value1, String value2) {
            addCriterion("wall not between", value1, value2, "wall");
            return (Criteria) this;
        }

        public Criteria andPlatfondIsNull() {
            addCriterion("platfond is null");
            return (Criteria) this;
        }

        public Criteria andPlatfondIsNotNull() {
            addCriterion("platfond is not null");
            return (Criteria) this;
        }

        public Criteria andPlatfondEqualTo(String value) {
            addCriterion("platfond =", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondNotEqualTo(String value) {
            addCriterion("platfond <>", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondGreaterThan(String value) {
            addCriterion("platfond >", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondGreaterThanOrEqualTo(String value) {
            addCriterion("platfond >=", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondLessThan(String value) {
            addCriterion("platfond <", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondLessThanOrEqualTo(String value) {
            addCriterion("platfond <=", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondLike(String value) {
            addCriterion("platfond like", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondNotLike(String value) {
            addCriterion("platfond not like", value, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondIn(List<String> values) {
            addCriterion("platfond in", values, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondNotIn(List<String> values) {
            addCriterion("platfond not in", values, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondBetween(String value1, String value2) {
            addCriterion("platfond between", value1, value2, "platfond");
            return (Criteria) this;
        }

        public Criteria andPlatfondNotBetween(String value1, String value2) {
            addCriterion("platfond not between", value1, value2, "platfond");
            return (Criteria) this;
        }

        public Criteria andGroundIsNull() {
            addCriterion("ground is null");
            return (Criteria) this;
        }

        public Criteria andGroundIsNotNull() {
            addCriterion("ground is not null");
            return (Criteria) this;
        }

        public Criteria andGroundEqualTo(String value) {
            addCriterion("ground =", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotEqualTo(String value) {
            addCriterion("ground <>", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundGreaterThan(String value) {
            addCriterion("ground >", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundGreaterThanOrEqualTo(String value) {
            addCriterion("ground >=", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundLessThan(String value) {
            addCriterion("ground <", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundLessThanOrEqualTo(String value) {
            addCriterion("ground <=", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundLike(String value) {
            addCriterion("ground like", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotLike(String value) {
            addCriterion("ground not like", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundIn(List<String> values) {
            addCriterion("ground in", values, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotIn(List<String> values) {
            addCriterion("ground not in", values, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundBetween(String value1, String value2) {
            addCriterion("ground between", value1, value2, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotBetween(String value1, String value2) {
            addCriterion("ground not between", value1, value2, "ground");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNull() {
            addCriterion("delete_date is null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNotNull() {
            addCriterion("delete_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateEqualTo(Date value) {
            addCriterion("delete_date =", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotEqualTo(Date value) {
            addCriterion("delete_date <>", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThan(Date value) {
            addCriterion("delete_date >", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_date >=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThan(Date value) {
            addCriterion("delete_date <", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThanOrEqualTo(Date value) {
            addCriterion("delete_date <=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIn(List<Date> values) {
            addCriterion("delete_date in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotIn(List<Date> values) {
            addCriterion("delete_date not in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateBetween(Date value1, Date value2) {
            addCriterion("delete_date between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotBetween(Date value1, Date value2) {
            addCriterion("delete_date not between", value1, value2, "deleteDate");
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