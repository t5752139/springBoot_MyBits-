package com.ky.jyg.assess.assess.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseCompareCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseCompareCaseExample() {
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

        public Criteria andSurveyHouseIdIsNull() {
            addCriterion("survey_house_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdIsNotNull() {
            addCriterion("survey_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdEqualTo(Long value) {
            addCriterion("survey_house_id =", value, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdNotEqualTo(Long value) {
            addCriterion("survey_house_id <>", value, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdGreaterThan(Long value) {
            addCriterion("survey_house_id >", value, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("survey_house_id >=", value, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdLessThan(Long value) {
            addCriterion("survey_house_id <", value, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdLessThanOrEqualTo(Long value) {
            addCriterion("survey_house_id <=", value, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdIn(List<Long> values) {
            addCriterion("survey_house_id in", values, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdNotIn(List<Long> values) {
            addCriterion("survey_house_id not in", values, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdBetween(Long value1, Long value2) {
            addCriterion("survey_house_id between", value1, value2, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andSurveyHouseIdNotBetween(Long value1, Long value2) {
            addCriterion("survey_house_id not between", value1, value2, "surveyHouseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Long value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Long value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Long value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Long value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Long> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Long> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Long value1, Long value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andGardenNameIsNull() {
            addCriterion("garden_name is null");
            return (Criteria) this;
        }

        public Criteria andGardenNameIsNotNull() {
            addCriterion("garden_name is not null");
            return (Criteria) this;
        }

        public Criteria andGardenNameEqualTo(String value) {
            addCriterion("garden_name =", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameNotEqualTo(String value) {
            addCriterion("garden_name <>", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameGreaterThan(String value) {
            addCriterion("garden_name >", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameGreaterThanOrEqualTo(String value) {
            addCriterion("garden_name >=", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameLessThan(String value) {
            addCriterion("garden_name <", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameLessThanOrEqualTo(String value) {
            addCriterion("garden_name <=", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameLike(String value) {
            addCriterion("garden_name like", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameNotLike(String value) {
            addCriterion("garden_name not like", value, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameIn(List<String> values) {
            addCriterion("garden_name in", values, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameNotIn(List<String> values) {
            addCriterion("garden_name not in", values, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameBetween(String value1, String value2) {
            addCriterion("garden_name between", value1, value2, "gardenName");
            return (Criteria) this;
        }

        public Criteria andGardenNameNotBetween(String value1, String value2) {
            addCriterion("garden_name not between", value1, value2, "gardenName");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeIsNull() {
            addCriterion("purpose_code is null");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeIsNotNull() {
            addCriterion("purpose_code is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeEqualTo(String value) {
            addCriterion("purpose_code =", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeNotEqualTo(String value) {
            addCriterion("purpose_code <>", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeGreaterThan(String value) {
            addCriterion("purpose_code >", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_code >=", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeLessThan(String value) {
            addCriterion("purpose_code <", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeLessThanOrEqualTo(String value) {
            addCriterion("purpose_code <=", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeLike(String value) {
            addCriterion("purpose_code like", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeNotLike(String value) {
            addCriterion("purpose_code not like", value, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeIn(List<String> values) {
            addCriterion("purpose_code in", values, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeNotIn(List<String> values) {
            addCriterion("purpose_code not in", values, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeBetween(String value1, String value2) {
            addCriterion("purpose_code between", value1, value2, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andPurposeCodeNotBetween(String value1, String value2) {
            addCriterion("purpose_code not between", value1, value2, "purposeCode");
            return (Criteria) this;
        }

        public Criteria andFacetoIsNull() {
            addCriterion("faceto is null");
            return (Criteria) this;
        }

        public Criteria andFacetoIsNotNull() {
            addCriterion("faceto is not null");
            return (Criteria) this;
        }

        public Criteria andFacetoEqualTo(String value) {
            addCriterion("faceto =", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoNotEqualTo(String value) {
            addCriterion("faceto <>", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoGreaterThan(String value) {
            addCriterion("faceto >", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoGreaterThanOrEqualTo(String value) {
            addCriterion("faceto >=", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoLessThan(String value) {
            addCriterion("faceto <", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoLessThanOrEqualTo(String value) {
            addCriterion("faceto <=", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoLike(String value) {
            addCriterion("faceto like", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoNotLike(String value) {
            addCriterion("faceto not like", value, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoIn(List<String> values) {
            addCriterion("faceto in", values, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoNotIn(List<String> values) {
            addCriterion("faceto not in", values, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoBetween(String value1, String value2) {
            addCriterion("faceto between", value1, value2, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoNotBetween(String value1, String value2) {
            addCriterion("faceto not between", value1, value2, "faceto");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeIsNull() {
            addCriterion("faceto_code is null");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeIsNotNull() {
            addCriterion("faceto_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeEqualTo(String value) {
            addCriterion("faceto_code =", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeNotEqualTo(String value) {
            addCriterion("faceto_code <>", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeGreaterThan(String value) {
            addCriterion("faceto_code >", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("faceto_code >=", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeLessThan(String value) {
            addCriterion("faceto_code <", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeLessThanOrEqualTo(String value) {
            addCriterion("faceto_code <=", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeLike(String value) {
            addCriterion("faceto_code like", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeNotLike(String value) {
            addCriterion("faceto_code not like", value, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeIn(List<String> values) {
            addCriterion("faceto_code in", values, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeNotIn(List<String> values) {
            addCriterion("faceto_code not in", values, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeBetween(String value1, String value2) {
            addCriterion("faceto_code between", value1, value2, "facetoCode");
            return (Criteria) this;
        }

        public Criteria andFacetoCodeNotBetween(String value1, String value2) {
            addCriterion("faceto_code not between", value1, value2, "facetoCode");
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

        public Criteria andLocationCodeIsNull() {
            addCriterion("location_code is null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNotNull() {
            addCriterion("location_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeEqualTo(String value) {
            addCriterion("location_code =", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotEqualTo(String value) {
            addCriterion("location_code <>", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThan(String value) {
            addCriterion("location_code >", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("location_code >=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThan(String value) {
            addCriterion("location_code <", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("location_code <=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLike(String value) {
            addCriterion("location_code like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotLike(String value) {
            addCriterion("location_code not like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIn(List<String> values) {
            addCriterion("location_code in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotIn(List<String> values) {
            addCriterion("location_code not in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeBetween(String value1, String value2) {
            addCriterion("location_code between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotBetween(String value1, String value2) {
            addCriterion("location_code not between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLevelTotalIsNull() {
            addCriterion("level_total is null");
            return (Criteria) this;
        }

        public Criteria andLevelTotalIsNotNull() {
            addCriterion("level_total is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTotalEqualTo(Byte value) {
            addCriterion("level_total =", value, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalNotEqualTo(Byte value) {
            addCriterion("level_total <>", value, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalGreaterThan(Byte value) {
            addCriterion("level_total >", value, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalGreaterThanOrEqualTo(Byte value) {
            addCriterion("level_total >=", value, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalLessThan(Byte value) {
            addCriterion("level_total <", value, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalLessThanOrEqualTo(Byte value) {
            addCriterion("level_total <=", value, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalIn(List<Byte> values) {
            addCriterion("level_total in", values, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalNotIn(List<Byte> values) {
            addCriterion("level_total not in", values, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalBetween(Byte value1, Byte value2) {
            addCriterion("level_total between", value1, value2, "levelTotal");
            return (Criteria) this;
        }

        public Criteria andLevelTotalNotBetween(Byte value1, Byte value2) {
            addCriterion("level_total not between", value1, value2, "levelTotal");
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

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIsNull() {
            addCriterion("sampling_date is null");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIsNotNull() {
            addCriterion("sampling_date is not null");
            return (Criteria) this;
        }

        public Criteria andSamplingDateEqualTo(Date value) {
            addCriterion("sampling_date =", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotEqualTo(Date value) {
            addCriterion("sampling_date <>", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateGreaterThan(Date value) {
            addCriterion("sampling_date >", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sampling_date >=", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateLessThan(Date value) {
            addCriterion("sampling_date <", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateLessThanOrEqualTo(Date value) {
            addCriterion("sampling_date <=", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIn(List<Date> values) {
            addCriterion("sampling_date in", values, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotIn(List<Date> values) {
            addCriterion("sampling_date not in", values, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateBetween(Date value1, Date value2) {
            addCriterion("sampling_date between", value1, value2, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotBetween(Date value1, Date value2) {
            addCriterion("sampling_date not between", value1, value2, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIsNull() {
            addCriterion("transaction_price is null");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIsNotNull() {
            addCriterion("transaction_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceEqualTo(BigDecimal value) {
            addCriterion("transaction_price =", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotEqualTo(BigDecimal value) {
            addCriterion("transaction_price <>", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceGreaterThan(BigDecimal value) {
            addCriterion("transaction_price >", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transaction_price >=", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceLessThan(BigDecimal value) {
            addCriterion("transaction_price <", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transaction_price <=", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIn(List<BigDecimal> values) {
            addCriterion("transaction_price in", values, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotIn(List<BigDecimal> values) {
            addCriterion("transaction_price not in", values, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transaction_price between", value1, value2, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transaction_price not between", value1, value2, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionStateIsNull() {
            addCriterion("transaction_state is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStateIsNotNull() {
            addCriterion("transaction_state is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStateEqualTo(Byte value) {
            addCriterion("transaction_state =", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateNotEqualTo(Byte value) {
            addCriterion("transaction_state <>", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateGreaterThan(Byte value) {
            addCriterion("transaction_state >", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("transaction_state >=", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateLessThan(Byte value) {
            addCriterion("transaction_state <", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateLessThanOrEqualTo(Byte value) {
            addCriterion("transaction_state <=", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateIn(List<Byte> values) {
            addCriterion("transaction_state in", values, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateNotIn(List<Byte> values) {
            addCriterion("transaction_state not in", values, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateBetween(Byte value1, Byte value2) {
            addCriterion("transaction_state between", value1, value2, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateNotBetween(Byte value1, Byte value2) {
            addCriterion("transaction_state not between", value1, value2, "transactionState");
            return (Criteria) this;
        }

        public Criteria andMarketStateIsNull() {
            addCriterion("market_state is null");
            return (Criteria) this;
        }

        public Criteria andMarketStateIsNotNull() {
            addCriterion("market_state is not null");
            return (Criteria) this;
        }

        public Criteria andMarketStateEqualTo(Byte value) {
            addCriterion("market_state =", value, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateNotEqualTo(Byte value) {
            addCriterion("market_state <>", value, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateGreaterThan(Byte value) {
            addCriterion("market_state >", value, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("market_state >=", value, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateLessThan(Byte value) {
            addCriterion("market_state <", value, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateLessThanOrEqualTo(Byte value) {
            addCriterion("market_state <=", value, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateIn(List<Byte> values) {
            addCriterion("market_state in", values, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateNotIn(List<Byte> values) {
            addCriterion("market_state not in", values, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateBetween(Byte value1, Byte value2) {
            addCriterion("market_state between", value1, value2, "marketState");
            return (Criteria) this;
        }

        public Criteria andMarketStateNotBetween(Byte value1, Byte value2) {
            addCriterion("market_state not between", value1, value2, "marketState");
            return (Criteria) this;
        }

        public Criteria andLocationStateIsNull() {
            addCriterion("location_state is null");
            return (Criteria) this;
        }

        public Criteria andLocationStateIsNotNull() {
            addCriterion("location_state is not null");
            return (Criteria) this;
        }

        public Criteria andLocationStateEqualTo(Byte value) {
            addCriterion("location_state =", value, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateNotEqualTo(Byte value) {
            addCriterion("location_state <>", value, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateGreaterThan(Byte value) {
            addCriterion("location_state >", value, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("location_state >=", value, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateLessThan(Byte value) {
            addCriterion("location_state <", value, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateLessThanOrEqualTo(Byte value) {
            addCriterion("location_state <=", value, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateIn(List<Byte> values) {
            addCriterion("location_state in", values, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateNotIn(List<Byte> values) {
            addCriterion("location_state not in", values, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateBetween(Byte value1, Byte value2) {
            addCriterion("location_state between", value1, value2, "locationState");
            return (Criteria) this;
        }

        public Criteria andLocationStateNotBetween(Byte value1, Byte value2) {
            addCriterion("location_state not between", value1, value2, "locationState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateIsNull() {
            addCriterion("environment_state is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateIsNotNull() {
            addCriterion("environment_state is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateEqualTo(Byte value) {
            addCriterion("environment_state =", value, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateNotEqualTo(Byte value) {
            addCriterion("environment_state <>", value, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateGreaterThan(Byte value) {
            addCriterion("environment_state >", value, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("environment_state >=", value, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateLessThan(Byte value) {
            addCriterion("environment_state <", value, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateLessThanOrEqualTo(Byte value) {
            addCriterion("environment_state <=", value, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateIn(List<Byte> values) {
            addCriterion("environment_state in", values, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateNotIn(List<Byte> values) {
            addCriterion("environment_state not in", values, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateBetween(Byte value1, Byte value2) {
            addCriterion("environment_state between", value1, value2, "environmentState");
            return (Criteria) this;
        }

        public Criteria andEnvironmentStateNotBetween(Byte value1, Byte value2) {
            addCriterion("environment_state not between", value1, value2, "environmentState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateIsNull() {
            addCriterion("traffic_state is null");
            return (Criteria) this;
        }

        public Criteria andTrafficStateIsNotNull() {
            addCriterion("traffic_state is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficStateEqualTo(Byte value) {
            addCriterion("traffic_state =", value, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateNotEqualTo(Byte value) {
            addCriterion("traffic_state <>", value, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateGreaterThan(Byte value) {
            addCriterion("traffic_state >", value, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("traffic_state >=", value, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateLessThan(Byte value) {
            addCriterion("traffic_state <", value, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateLessThanOrEqualTo(Byte value) {
            addCriterion("traffic_state <=", value, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateIn(List<Byte> values) {
            addCriterion("traffic_state in", values, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateNotIn(List<Byte> values) {
            addCriterion("traffic_state not in", values, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateBetween(Byte value1, Byte value2) {
            addCriterion("traffic_state between", value1, value2, "trafficState");
            return (Criteria) this;
        }

        public Criteria andTrafficStateNotBetween(Byte value1, Byte value2) {
            addCriterion("traffic_state not between", value1, value2, "trafficState");
            return (Criteria) this;
        }

        public Criteria andEducationStateIsNull() {
            addCriterion("education_state is null");
            return (Criteria) this;
        }

        public Criteria andEducationStateIsNotNull() {
            addCriterion("education_state is not null");
            return (Criteria) this;
        }

        public Criteria andEducationStateEqualTo(Byte value) {
            addCriterion("education_state =", value, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateNotEqualTo(Byte value) {
            addCriterion("education_state <>", value, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateGreaterThan(Byte value) {
            addCriterion("education_state >", value, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("education_state >=", value, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateLessThan(Byte value) {
            addCriterion("education_state <", value, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateLessThanOrEqualTo(Byte value) {
            addCriterion("education_state <=", value, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateIn(List<Byte> values) {
            addCriterion("education_state in", values, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateNotIn(List<Byte> values) {
            addCriterion("education_state not in", values, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateBetween(Byte value1, Byte value2) {
            addCriterion("education_state between", value1, value2, "educationState");
            return (Criteria) this;
        }

        public Criteria andEducationStateNotBetween(Byte value1, Byte value2) {
            addCriterion("education_state not between", value1, value2, "educationState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateIsNull() {
            addCriterion("hospital_state is null");
            return (Criteria) this;
        }

        public Criteria andHospitalStateIsNotNull() {
            addCriterion("hospital_state is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalStateEqualTo(Byte value) {
            addCriterion("hospital_state =", value, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateNotEqualTo(Byte value) {
            addCriterion("hospital_state <>", value, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateGreaterThan(Byte value) {
            addCriterion("hospital_state >", value, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("hospital_state >=", value, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateLessThan(Byte value) {
            addCriterion("hospital_state <", value, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateLessThanOrEqualTo(Byte value) {
            addCriterion("hospital_state <=", value, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateIn(List<Byte> values) {
            addCriterion("hospital_state in", values, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateNotIn(List<Byte> values) {
            addCriterion("hospital_state not in", values, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateBetween(Byte value1, Byte value2) {
            addCriterion("hospital_state between", value1, value2, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andHospitalStateNotBetween(Byte value1, Byte value2) {
            addCriterion("hospital_state not between", value1, value2, "hospitalState");
            return (Criteria) this;
        }

        public Criteria andOtherStateIsNull() {
            addCriterion("other_state is null");
            return (Criteria) this;
        }

        public Criteria andOtherStateIsNotNull() {
            addCriterion("other_state is not null");
            return (Criteria) this;
        }

        public Criteria andOtherStateEqualTo(Byte value) {
            addCriterion("other_state =", value, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateNotEqualTo(Byte value) {
            addCriterion("other_state <>", value, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateGreaterThan(Byte value) {
            addCriterion("other_state >", value, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("other_state >=", value, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateLessThan(Byte value) {
            addCriterion("other_state <", value, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateLessThanOrEqualTo(Byte value) {
            addCriterion("other_state <=", value, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateIn(List<Byte> values) {
            addCriterion("other_state in", values, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateNotIn(List<Byte> values) {
            addCriterion("other_state not in", values, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateBetween(Byte value1, Byte value2) {
            addCriterion("other_state between", value1, value2, "otherState");
            return (Criteria) this;
        }

        public Criteria andOtherStateNotBetween(Byte value1, Byte value2) {
            addCriterion("other_state not between", value1, value2, "otherState");
            return (Criteria) this;
        }

        public Criteria andBasicStateIsNull() {
            addCriterion("basic_state is null");
            return (Criteria) this;
        }

        public Criteria andBasicStateIsNotNull() {
            addCriterion("basic_state is not null");
            return (Criteria) this;
        }

        public Criteria andBasicStateEqualTo(Byte value) {
            addCriterion("basic_state =", value, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateNotEqualTo(Byte value) {
            addCriterion("basic_state <>", value, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateGreaterThan(Byte value) {
            addCriterion("basic_state >", value, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("basic_state >=", value, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateLessThan(Byte value) {
            addCriterion("basic_state <", value, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateLessThanOrEqualTo(Byte value) {
            addCriterion("basic_state <=", value, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateIn(List<Byte> values) {
            addCriterion("basic_state in", values, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateNotIn(List<Byte> values) {
            addCriterion("basic_state not in", values, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateBetween(Byte value1, Byte value2) {
            addCriterion("basic_state between", value1, value2, "basicState");
            return (Criteria) this;
        }

        public Criteria andBasicStateNotBetween(Byte value1, Byte value2) {
            addCriterion("basic_state not between", value1, value2, "basicState");
            return (Criteria) this;
        }

        public Criteria andLevelStateIsNull() {
            addCriterion("level_state is null");
            return (Criteria) this;
        }

        public Criteria andLevelStateIsNotNull() {
            addCriterion("level_state is not null");
            return (Criteria) this;
        }

        public Criteria andLevelStateEqualTo(Byte value) {
            addCriterion("level_state =", value, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateNotEqualTo(Byte value) {
            addCriterion("level_state <>", value, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateGreaterThan(Byte value) {
            addCriterion("level_state >", value, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("level_state >=", value, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateLessThan(Byte value) {
            addCriterion("level_state <", value, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateLessThanOrEqualTo(Byte value) {
            addCriterion("level_state <=", value, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateIn(List<Byte> values) {
            addCriterion("level_state in", values, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateNotIn(List<Byte> values) {
            addCriterion("level_state not in", values, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateBetween(Byte value1, Byte value2) {
            addCriterion("level_state between", value1, value2, "levelState");
            return (Criteria) this;
        }

        public Criteria andLevelStateNotBetween(Byte value1, Byte value2) {
            addCriterion("level_state not between", value1, value2, "levelState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateIsNull() {
            addCriterion("faceto_state is null");
            return (Criteria) this;
        }

        public Criteria andFacetoStateIsNotNull() {
            addCriterion("faceto_state is not null");
            return (Criteria) this;
        }

        public Criteria andFacetoStateEqualTo(Byte value) {
            addCriterion("faceto_state =", value, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateNotEqualTo(Byte value) {
            addCriterion("faceto_state <>", value, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateGreaterThan(Byte value) {
            addCriterion("faceto_state >", value, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("faceto_state >=", value, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateLessThan(Byte value) {
            addCriterion("faceto_state <", value, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateLessThanOrEqualTo(Byte value) {
            addCriterion("faceto_state <=", value, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateIn(List<Byte> values) {
            addCriterion("faceto_state in", values, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateNotIn(List<Byte> values) {
            addCriterion("faceto_state not in", values, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateBetween(Byte value1, Byte value2) {
            addCriterion("faceto_state between", value1, value2, "facetoState");
            return (Criteria) this;
        }

        public Criteria andFacetoStateNotBetween(Byte value1, Byte value2) {
            addCriterion("faceto_state not between", value1, value2, "facetoState");
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

        public Criteria andFaceStreetStateEqualTo(Byte value) {
            addCriterion("face_street_state =", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotEqualTo(Byte value) {
            addCriterion("face_street_state <>", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateGreaterThan(Byte value) {
            addCriterion("face_street_state >", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("face_street_state >=", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateLessThan(Byte value) {
            addCriterion("face_street_state <", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateLessThanOrEqualTo(Byte value) {
            addCriterion("face_street_state <=", value, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateIn(List<Byte> values) {
            addCriterion("face_street_state in", values, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotIn(List<Byte> values) {
            addCriterion("face_street_state not in", values, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateBetween(Byte value1, Byte value2) {
            addCriterion("face_street_state between", value1, value2, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andFaceStreetStateNotBetween(Byte value1, Byte value2) {
            addCriterion("face_street_state not between", value1, value2, "faceStreetState");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalIsNull() {
            addCriterion("site_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalIsNotNull() {
            addCriterion("site_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalEqualTo(BigDecimal value) {
            addCriterion("site_subtotal =", value, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("site_subtotal <>", value, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalGreaterThan(BigDecimal value) {
            addCriterion("site_subtotal >", value, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("site_subtotal >=", value, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalLessThan(BigDecimal value) {
            addCriterion("site_subtotal <", value, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("site_subtotal <=", value, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalIn(List<BigDecimal> values) {
            addCriterion("site_subtotal in", values, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("site_subtotal not in", values, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("site_subtotal between", value1, value2, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andSiteSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("site_subtotal not between", value1, value2, "siteSubtotal");
            return (Criteria) this;
        }

        public Criteria andOldNewStateIsNull() {
            addCriterion("old_new_state is null");
            return (Criteria) this;
        }

        public Criteria andOldNewStateIsNotNull() {
            addCriterion("old_new_state is not null");
            return (Criteria) this;
        }

        public Criteria andOldNewStateEqualTo(Byte value) {
            addCriterion("old_new_state =", value, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateNotEqualTo(Byte value) {
            addCriterion("old_new_state <>", value, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateGreaterThan(Byte value) {
            addCriterion("old_new_state >", value, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("old_new_state >=", value, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateLessThan(Byte value) {
            addCriterion("old_new_state <", value, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateLessThanOrEqualTo(Byte value) {
            addCriterion("old_new_state <=", value, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateIn(List<Byte> values) {
            addCriterion("old_new_state in", values, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateNotIn(List<Byte> values) {
            addCriterion("old_new_state not in", values, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateBetween(Byte value1, Byte value2) {
            addCriterion("old_new_state between", value1, value2, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andOldNewStateNotBetween(Byte value1, Byte value2) {
            addCriterion("old_new_state not between", value1, value2, "oldNewState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateIsNull() {
            addCriterion("facilities_state is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateIsNotNull() {
            addCriterion("facilities_state is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateEqualTo(Byte value) {
            addCriterion("facilities_state =", value, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateNotEqualTo(Byte value) {
            addCriterion("facilities_state <>", value, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateGreaterThan(Byte value) {
            addCriterion("facilities_state >", value, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("facilities_state >=", value, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateLessThan(Byte value) {
            addCriterion("facilities_state <", value, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateLessThanOrEqualTo(Byte value) {
            addCriterion("facilities_state <=", value, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateIn(List<Byte> values) {
            addCriterion("facilities_state in", values, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateNotIn(List<Byte> values) {
            addCriterion("facilities_state not in", values, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateBetween(Byte value1, Byte value2) {
            addCriterion("facilities_state between", value1, value2, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStateNotBetween(Byte value1, Byte value2) {
            addCriterion("facilities_state not between", value1, value2, "facilitiesState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateIsNull() {
            addCriterion("engineering_state is null");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateIsNotNull() {
            addCriterion("engineering_state is not null");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateEqualTo(Byte value) {
            addCriterion("engineering_state =", value, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateNotEqualTo(Byte value) {
            addCriterion("engineering_state <>", value, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateGreaterThan(Byte value) {
            addCriterion("engineering_state >", value, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("engineering_state >=", value, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateLessThan(Byte value) {
            addCriterion("engineering_state <", value, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateLessThanOrEqualTo(Byte value) {
            addCriterion("engineering_state <=", value, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateIn(List<Byte> values) {
            addCriterion("engineering_state in", values, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateNotIn(List<Byte> values) {
            addCriterion("engineering_state not in", values, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateBetween(Byte value1, Byte value2) {
            addCriterion("engineering_state between", value1, value2, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andEngineeringStateNotBetween(Byte value1, Byte value2) {
            addCriterion("engineering_state not between", value1, value2, "engineeringState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateIsNull() {
            addCriterion("property_state is null");
            return (Criteria) this;
        }

        public Criteria andPropertyStateIsNotNull() {
            addCriterion("property_state is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyStateEqualTo(Byte value) {
            addCriterion("property_state =", value, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateNotEqualTo(Byte value) {
            addCriterion("property_state <>", value, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateGreaterThan(Byte value) {
            addCriterion("property_state >", value, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("property_state >=", value, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateLessThan(Byte value) {
            addCriterion("property_state <", value, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateLessThanOrEqualTo(Byte value) {
            addCriterion("property_state <=", value, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateIn(List<Byte> values) {
            addCriterion("property_state in", values, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateNotIn(List<Byte> values) {
            addCriterion("property_state not in", values, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateBetween(Byte value1, Byte value2) {
            addCriterion("property_state between", value1, value2, "propertyState");
            return (Criteria) this;
        }

        public Criteria andPropertyStateNotBetween(Byte value1, Byte value2) {
            addCriterion("property_state not between", value1, value2, "propertyState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateIsNull() {
            addCriterion("layout_state is null");
            return (Criteria) this;
        }

        public Criteria andLayoutStateIsNotNull() {
            addCriterion("layout_state is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutStateEqualTo(Byte value) {
            addCriterion("layout_state =", value, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateNotEqualTo(Byte value) {
            addCriterion("layout_state <>", value, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateGreaterThan(Byte value) {
            addCriterion("layout_state >", value, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("layout_state >=", value, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateLessThan(Byte value) {
            addCriterion("layout_state <", value, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateLessThanOrEqualTo(Byte value) {
            addCriterion("layout_state <=", value, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateIn(List<Byte> values) {
            addCriterion("layout_state in", values, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateNotIn(List<Byte> values) {
            addCriterion("layout_state not in", values, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateBetween(Byte value1, Byte value2) {
            addCriterion("layout_state between", value1, value2, "layoutState");
            return (Criteria) this;
        }

        public Criteria andLayoutStateNotBetween(Byte value1, Byte value2) {
            addCriterion("layout_state not between", value1, value2, "layoutState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateIsNull() {
            addCriterion("build_area_state is null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateIsNotNull() {
            addCriterion("build_area_state is not null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateEqualTo(Byte value) {
            addCriterion("build_area_state =", value, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateNotEqualTo(Byte value) {
            addCriterion("build_area_state <>", value, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateGreaterThan(Byte value) {
            addCriterion("build_area_state >", value, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("build_area_state >=", value, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateLessThan(Byte value) {
            addCriterion("build_area_state <", value, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateLessThanOrEqualTo(Byte value) {
            addCriterion("build_area_state <=", value, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateIn(List<Byte> values) {
            addCriterion("build_area_state in", values, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateNotIn(List<Byte> values) {
            addCriterion("build_area_state not in", values, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateBetween(Byte value1, Byte value2) {
            addCriterion("build_area_state between", value1, value2, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildAreaStateNotBetween(Byte value1, Byte value2) {
            addCriterion("build_area_state not between", value1, value2, "buildAreaState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateIsNull() {
            addCriterion("build_structure_state is null");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateIsNotNull() {
            addCriterion("build_structure_state is not null");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateEqualTo(Byte value) {
            addCriterion("build_structure_state =", value, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateNotEqualTo(Byte value) {
            addCriterion("build_structure_state <>", value, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateGreaterThan(Byte value) {
            addCriterion("build_structure_state >", value, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("build_structure_state >=", value, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateLessThan(Byte value) {
            addCriterion("build_structure_state <", value, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateLessThanOrEqualTo(Byte value) {
            addCriterion("build_structure_state <=", value, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateIn(List<Byte> values) {
            addCriterion("build_structure_state in", values, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateNotIn(List<Byte> values) {
            addCriterion("build_structure_state not in", values, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateBetween(Byte value1, Byte value2) {
            addCriterion("build_structure_state between", value1, value2, "buildStructureState");
            return (Criteria) this;
        }

        public Criteria andBuildStructureStateNotBetween(Byte value1, Byte value2) {
            addCriterion("build_structure_state not between", value1, value2, "buildStructureState");
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

        public Criteria andRenovationStateEqualTo(Byte value) {
            addCriterion("renovation_state =", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotEqualTo(Byte value) {
            addCriterion("renovation_state <>", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateGreaterThan(Byte value) {
            addCriterion("renovation_state >", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("renovation_state >=", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateLessThan(Byte value) {
            addCriterion("renovation_state <", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateLessThanOrEqualTo(Byte value) {
            addCriterion("renovation_state <=", value, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateIn(List<Byte> values) {
            addCriterion("renovation_state in", values, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotIn(List<Byte> values) {
            addCriterion("renovation_state not in", values, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateBetween(Byte value1, Byte value2) {
            addCriterion("renovation_state between", value1, value2, "renovationState");
            return (Criteria) this;
        }

        public Criteria andRenovationStateNotBetween(Byte value1, Byte value2) {
            addCriterion("renovation_state not between", value1, value2, "renovationState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateIsNull() {
            addCriterion("uselimit_state is null");
            return (Criteria) this;
        }

        public Criteria andUselimitStateIsNotNull() {
            addCriterion("uselimit_state is not null");
            return (Criteria) this;
        }

        public Criteria andUselimitStateEqualTo(Byte value) {
            addCriterion("uselimit_state =", value, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateNotEqualTo(Byte value) {
            addCriterion("uselimit_state <>", value, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateGreaterThan(Byte value) {
            addCriterion("uselimit_state >", value, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("uselimit_state >=", value, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateLessThan(Byte value) {
            addCriterion("uselimit_state <", value, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateLessThanOrEqualTo(Byte value) {
            addCriterion("uselimit_state <=", value, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateIn(List<Byte> values) {
            addCriterion("uselimit_state in", values, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateNotIn(List<Byte> values) {
            addCriterion("uselimit_state not in", values, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateBetween(Byte value1, Byte value2) {
            addCriterion("uselimit_state between", value1, value2, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andUselimitStateNotBetween(Byte value1, Byte value2) {
            addCriterion("uselimit_state not between", value1, value2, "uselimitState");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalIsNull() {
            addCriterion("matter_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalIsNotNull() {
            addCriterion("matter_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalEqualTo(BigDecimal value) {
            addCriterion("matter_subtotal =", value, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("matter_subtotal <>", value, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalGreaterThan(BigDecimal value) {
            addCriterion("matter_subtotal >", value, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("matter_subtotal >=", value, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalLessThan(BigDecimal value) {
            addCriterion("matter_subtotal <", value, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("matter_subtotal <=", value, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalIn(List<BigDecimal> values) {
            addCriterion("matter_subtotal in", values, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("matter_subtotal not in", values, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("matter_subtotal between", value1, value2, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andMatterSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("matter_subtotal not between", value1, value2, "matterSubtotal");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateIsNull() {
            addCriterion("land_purpose_state is null");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateIsNotNull() {
            addCriterion("land_purpose_state is not null");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateEqualTo(Byte value) {
            addCriterion("land_purpose_state =", value, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateNotEqualTo(Byte value) {
            addCriterion("land_purpose_state <>", value, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateGreaterThan(Byte value) {
            addCriterion("land_purpose_state >", value, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("land_purpose_state >=", value, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateLessThan(Byte value) {
            addCriterion("land_purpose_state <", value, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateLessThanOrEqualTo(Byte value) {
            addCriterion("land_purpose_state <=", value, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateIn(List<Byte> values) {
            addCriterion("land_purpose_state in", values, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateNotIn(List<Byte> values) {
            addCriterion("land_purpose_state not in", values, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateBetween(Byte value1, Byte value2) {
            addCriterion("land_purpose_state between", value1, value2, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andLandPurposeStateNotBetween(Byte value1, Byte value2) {
            addCriterion("land_purpose_state not between", value1, value2, "landPurposeState");
            return (Criteria) this;
        }

        public Criteria andRentStateIsNull() {
            addCriterion("rent_state is null");
            return (Criteria) this;
        }

        public Criteria andRentStateIsNotNull() {
            addCriterion("rent_state is not null");
            return (Criteria) this;
        }

        public Criteria andRentStateEqualTo(Byte value) {
            addCriterion("rent_state =", value, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateNotEqualTo(Byte value) {
            addCriterion("rent_state <>", value, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateGreaterThan(Byte value) {
            addCriterion("rent_state >", value, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("rent_state >=", value, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateLessThan(Byte value) {
            addCriterion("rent_state <", value, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateLessThanOrEqualTo(Byte value) {
            addCriterion("rent_state <=", value, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateIn(List<Byte> values) {
            addCriterion("rent_state in", values, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateNotIn(List<Byte> values) {
            addCriterion("rent_state not in", values, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateBetween(Byte value1, Byte value2) {
            addCriterion("rent_state between", value1, value2, "rentState");
            return (Criteria) this;
        }

        public Criteria andRentStateNotBetween(Byte value1, Byte value2) {
            addCriterion("rent_state not between", value1, value2, "rentState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateIsNull() {
            addCriterion("nature_right_state is null");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateIsNotNull() {
            addCriterion("nature_right_state is not null");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateEqualTo(Byte value) {
            addCriterion("nature_right_state =", value, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateNotEqualTo(Byte value) {
            addCriterion("nature_right_state <>", value, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateGreaterThan(Byte value) {
            addCriterion("nature_right_state >", value, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("nature_right_state >=", value, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateLessThan(Byte value) {
            addCriterion("nature_right_state <", value, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateLessThanOrEqualTo(Byte value) {
            addCriterion("nature_right_state <=", value, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateIn(List<Byte> values) {
            addCriterion("nature_right_state in", values, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateNotIn(List<Byte> values) {
            addCriterion("nature_right_state not in", values, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateBetween(Byte value1, Byte value2) {
            addCriterion("nature_right_state between", value1, value2, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andNatureRightStateNotBetween(Byte value1, Byte value2) {
            addCriterion("nature_right_state not between", value1, value2, "natureRightState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateIsNull() {
            addCriterion("easement_relation_state is null");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateIsNotNull() {
            addCriterion("easement_relation_state is not null");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateEqualTo(Byte value) {
            addCriterion("easement_relation_state =", value, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateNotEqualTo(Byte value) {
            addCriterion("easement_relation_state <>", value, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateGreaterThan(Byte value) {
            addCriterion("easement_relation_state >", value, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("easement_relation_state >=", value, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateLessThan(Byte value) {
            addCriterion("easement_relation_state <", value, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateLessThanOrEqualTo(Byte value) {
            addCriterion("easement_relation_state <=", value, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateIn(List<Byte> values) {
            addCriterion("easement_relation_state in", values, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateNotIn(List<Byte> values) {
            addCriterion("easement_relation_state not in", values, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateBetween(Byte value1, Byte value2) {
            addCriterion("easement_relation_state between", value1, value2, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEasementRelationStateNotBetween(Byte value1, Byte value2) {
            addCriterion("easement_relation_state not between", value1, value2, "easementRelationState");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalIsNull() {
            addCriterion("equity_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalIsNotNull() {
            addCriterion("equity_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalEqualTo(BigDecimal value) {
            addCriterion("equity_subtotal =", value, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalNotEqualTo(BigDecimal value) {
            addCriterion("equity_subtotal <>", value, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalGreaterThan(BigDecimal value) {
            addCriterion("equity_subtotal >", value, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("equity_subtotal >=", value, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalLessThan(BigDecimal value) {
            addCriterion("equity_subtotal <", value, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("equity_subtotal <=", value, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalIn(List<BigDecimal> values) {
            addCriterion("equity_subtotal in", values, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalNotIn(List<BigDecimal> values) {
            addCriterion("equity_subtotal not in", values, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equity_subtotal between", value1, value2, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andEquitySubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equity_subtotal not between", value1, value2, "equitySubtotal");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientIsNull() {
            addCriterion("house_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientIsNotNull() {
            addCriterion("house_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientEqualTo(BigDecimal value) {
            addCriterion("house_coefficient =", value, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientNotEqualTo(BigDecimal value) {
            addCriterion("house_coefficient <>", value, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientGreaterThan(BigDecimal value) {
            addCriterion("house_coefficient >", value, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_coefficient >=", value, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientLessThan(BigDecimal value) {
            addCriterion("house_coefficient <", value, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_coefficient <=", value, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientIn(List<BigDecimal> values) {
            addCriterion("house_coefficient in", values, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientNotIn(List<BigDecimal> values) {
            addCriterion("house_coefficient not in", values, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_coefficient between", value1, value2, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andHouseCoefficientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_coefficient not between", value1, value2, "houseCoefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalIsNull() {
            addCriterion("coefficient_total is null");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalIsNotNull() {
            addCriterion("coefficient_total is not null");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalEqualTo(BigDecimal value) {
            addCriterion("coefficient_total =", value, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalNotEqualTo(BigDecimal value) {
            addCriterion("coefficient_total <>", value, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalGreaterThan(BigDecimal value) {
            addCriterion("coefficient_total >", value, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coefficient_total >=", value, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalLessThan(BigDecimal value) {
            addCriterion("coefficient_total <", value, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coefficient_total <=", value, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalIn(List<BigDecimal> values) {
            addCriterion("coefficient_total in", values, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalNotIn(List<BigDecimal> values) {
            addCriterion("coefficient_total not in", values, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coefficient_total between", value1, value2, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andCoefficientTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coefficient_total not between", value1, value2, "coefficientTotal");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceIsNull() {
            addCriterion("quasi_price is null");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceIsNotNull() {
            addCriterion("quasi_price is not null");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceEqualTo(BigDecimal value) {
            addCriterion("quasi_price =", value, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceNotEqualTo(BigDecimal value) {
            addCriterion("quasi_price <>", value, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceGreaterThan(BigDecimal value) {
            addCriterion("quasi_price >", value, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quasi_price >=", value, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceLessThan(BigDecimal value) {
            addCriterion("quasi_price <", value, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quasi_price <=", value, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceIn(List<BigDecimal> values) {
            addCriterion("quasi_price in", values, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceNotIn(List<BigDecimal> values) {
            addCriterion("quasi_price not in", values, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quasi_price between", value1, value2, "quasiPrice");
            return (Criteria) this;
        }

        public Criteria andQuasiPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quasi_price not between", value1, value2, "quasiPrice");
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