package com.ky.jyg.assess.assess.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssessHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessHouseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andHouseAssessMethodIsNull() {
            addCriterion("house_assess_method is null");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodIsNotNull() {
            addCriterion("house_assess_method is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodEqualTo(String value) {
            addCriterion("house_assess_method =", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodNotEqualTo(String value) {
            addCriterion("house_assess_method <>", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodGreaterThan(String value) {
            addCriterion("house_assess_method >", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodGreaterThanOrEqualTo(String value) {
            addCriterion("house_assess_method >=", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodLessThan(String value) {
            addCriterion("house_assess_method <", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodLessThanOrEqualTo(String value) {
            addCriterion("house_assess_method <=", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodLike(String value) {
            addCriterion("house_assess_method like", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodNotLike(String value) {
            addCriterion("house_assess_method not like", value, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodIn(List<String> values) {
            addCriterion("house_assess_method in", values, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodNotIn(List<String> values) {
            addCriterion("house_assess_method not in", values, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodBetween(String value1, String value2) {
            addCriterion("house_assess_method between", value1, value2, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andHouseAssessMethodNotBetween(String value1, String value2) {
            addCriterion("house_assess_method not between", value1, value2, "houseAssessMethod");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartIsNull() {
            addCriterion("true_survey_date_start is null");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartIsNotNull() {
            addCriterion("true_survey_date_start is not null");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_start =", value, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_start <>", value, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartGreaterThan(Date value) {
            addCriterionForJDBCDate("true_survey_date_start >", value, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_start >=", value, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartLessThan(Date value) {
            addCriterionForJDBCDate("true_survey_date_start <", value, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_start <=", value, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartIn(List<Date> values) {
            addCriterionForJDBCDate("true_survey_date_start in", values, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("true_survey_date_start not in", values, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("true_survey_date_start between", value1, value2, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("true_survey_date_start not between", value1, value2, "trueSurveyDateStart");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndIsNull() {
            addCriterion("true_survey_date_end is null");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndIsNotNull() {
            addCriterion("true_survey_date_end is not null");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_end =", value, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_end <>", value, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndGreaterThan(Date value) {
            addCriterionForJDBCDate("true_survey_date_end >", value, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_end >=", value, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndLessThan(Date value) {
            addCriterionForJDBCDate("true_survey_date_end <", value, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("true_survey_date_end <=", value, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndIn(List<Date> values) {
            addCriterionForJDBCDate("true_survey_date_end in", values, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("true_survey_date_end not in", values, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("true_survey_date_end between", value1, value2, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andTrueSurveyDateEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("true_survey_date_end not between", value1, value2, "trueSurveyDateEnd");
            return (Criteria) this;
        }

        public Criteria andValuePointDateIsNull() {
            addCriterion("value_point_date is null");
            return (Criteria) this;
        }

        public Criteria andValuePointDateIsNotNull() {
            addCriterion("value_point_date is not null");
            return (Criteria) this;
        }

        public Criteria andValuePointDateEqualTo(Date value) {
            addCriterionForJDBCDate("value_point_date =", value, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("value_point_date <>", value, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateGreaterThan(Date value) {
            addCriterionForJDBCDate("value_point_date >", value, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("value_point_date >=", value, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateLessThan(Date value) {
            addCriterionForJDBCDate("value_point_date <", value, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("value_point_date <=", value, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateIn(List<Date> values) {
            addCriterionForJDBCDate("value_point_date in", values, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("value_point_date not in", values, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("value_point_date between", value1, value2, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andValuePointDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("value_point_date not between", value1, value2, "valuePointDate");
            return (Criteria) this;
        }

        public Criteria andDateStartIsNull() {
            addCriterion("date_start is null");
            return (Criteria) this;
        }

        public Criteria andDateStartIsNotNull() {
            addCriterion("date_start is not null");
            return (Criteria) this;
        }

        public Criteria andDateStartEqualTo(Date value) {
            addCriterionForJDBCDate("date_start =", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_start <>", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartGreaterThan(Date value) {
            addCriterionForJDBCDate("date_start >", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_start >=", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartLessThan(Date value) {
            addCriterionForJDBCDate("date_start <", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_start <=", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartIn(List<Date> values) {
            addCriterionForJDBCDate("date_start in", values, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_start not in", values, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_start between", value1, value2, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_start not between", value1, value2, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateEndIsNull() {
            addCriterion("date_end is null");
            return (Criteria) this;
        }

        public Criteria andDateEndIsNotNull() {
            addCriterion("date_end is not null");
            return (Criteria) this;
        }

        public Criteria andDateEndEqualTo(Date value) {
            addCriterionForJDBCDate("date_end =", value, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_end <>", value, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndGreaterThan(Date value) {
            addCriterionForJDBCDate("date_end >", value, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_end >=", value, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndLessThan(Date value) {
            addCriterionForJDBCDate("date_end <", value, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_end <=", value, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndIn(List<Date> values) {
            addCriterionForJDBCDate("date_end in", values, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_end not in", values, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_end between", value1, value2, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andDateEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_end not between", value1, value2, "dateEnd");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceIsNull() {
            addCriterion("compare_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceIsNotNull() {
            addCriterion("compare_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceEqualTo(BigDecimal value) {
            addCriterion("compare_unit_price =", value, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("compare_unit_price <>", value, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("compare_unit_price >", value, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("compare_unit_price >=", value, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceLessThan(BigDecimal value) {
            addCriterion("compare_unit_price <", value, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("compare_unit_price <=", value, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceIn(List<BigDecimal> values) {
            addCriterion("compare_unit_price in", values, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("compare_unit_price not in", values, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compare_unit_price between", value1, value2, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compare_unit_price not between", value1, value2, "compareUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceIsNull() {
            addCriterion("compare_total_price is null");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceIsNotNull() {
            addCriterion("compare_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceEqualTo(BigDecimal value) {
            addCriterion("compare_total_price =", value, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("compare_total_price <>", value, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("compare_total_price >", value, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("compare_total_price >=", value, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceLessThan(BigDecimal value) {
            addCriterion("compare_total_price <", value, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("compare_total_price <=", value, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceIn(List<BigDecimal> values) {
            addCriterion("compare_total_price in", values, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("compare_total_price not in", values, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compare_total_price between", value1, value2, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compare_total_price not between", value1, value2, "compareTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCompareWeightIsNull() {
            addCriterion("compare_weight is null");
            return (Criteria) this;
        }

        public Criteria andCompareWeightIsNotNull() {
            addCriterion("compare_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCompareWeightEqualTo(BigDecimal value) {
            addCriterion("compare_weight =", value, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightNotEqualTo(BigDecimal value) {
            addCriterion("compare_weight <>", value, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightGreaterThan(BigDecimal value) {
            addCriterion("compare_weight >", value, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("compare_weight >=", value, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightLessThan(BigDecimal value) {
            addCriterion("compare_weight <", value, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("compare_weight <=", value, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightIn(List<BigDecimal> values) {
            addCriterion("compare_weight in", values, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightNotIn(List<BigDecimal> values) {
            addCriterion("compare_weight not in", values, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compare_weight between", value1, value2, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andCompareWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compare_weight not between", value1, value2, "compareWeight");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceIsNull() {
            addCriterion("appraiser_total_price is null");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceIsNotNull() {
            addCriterion("appraiser_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceEqualTo(BigDecimal value) {
            addCriterion("appraiser_total_price =", value, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("appraiser_total_price <>", value, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("appraiser_total_price >", value, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("appraiser_total_price >=", value, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceLessThan(BigDecimal value) {
            addCriterion("appraiser_total_price <", value, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("appraiser_total_price <=", value, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceIn(List<BigDecimal> values) {
            addCriterion("appraiser_total_price in", values, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("appraiser_total_price not in", values, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("appraiser_total_price between", value1, value2, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("appraiser_total_price not between", value1, value2, "appraiserTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceIsNull() {
            addCriterion("income_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceIsNotNull() {
            addCriterion("income_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceEqualTo(BigDecimal value) {
            addCriterion("income_unit_price =", value, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("income_unit_price <>", value, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("income_unit_price >", value, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_unit_price >=", value, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceLessThan(BigDecimal value) {
            addCriterion("income_unit_price <", value, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_unit_price <=", value, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceIn(List<BigDecimal> values) {
            addCriterion("income_unit_price in", values, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("income_unit_price not in", values, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_unit_price between", value1, value2, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_unit_price not between", value1, value2, "incomeUnitPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceIsNull() {
            addCriterion("income_total_price is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceIsNotNull() {
            addCriterion("income_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceEqualTo(BigDecimal value) {
            addCriterion("income_total_price =", value, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("income_total_price <>", value, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("income_total_price >", value, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_total_price >=", value, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceLessThan(BigDecimal value) {
            addCriterion("income_total_price <", value, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_total_price <=", value, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceIn(List<BigDecimal> values) {
            addCriterion("income_total_price in", values, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("income_total_price not in", values, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_total_price between", value1, value2, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_total_price not between", value1, value2, "incomeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightIsNull() {
            addCriterion("income_weight is null");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightIsNotNull() {
            addCriterion("income_weight is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightEqualTo(BigDecimal value) {
            addCriterion("income_weight =", value, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightNotEqualTo(BigDecimal value) {
            addCriterion("income_weight <>", value, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightGreaterThan(BigDecimal value) {
            addCriterion("income_weight >", value, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_weight >=", value, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightLessThan(BigDecimal value) {
            addCriterion("income_weight <", value, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_weight <=", value, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightIn(List<BigDecimal> values) {
            addCriterion("income_weight in", values, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightNotIn(List<BigDecimal> values) {
            addCriterion("income_weight not in", values, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_weight between", value1, value2, "incomeWeight");
            return (Criteria) this;
        }

        public Criteria andIncomeWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_weight not between", value1, value2, "incomeWeight");
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