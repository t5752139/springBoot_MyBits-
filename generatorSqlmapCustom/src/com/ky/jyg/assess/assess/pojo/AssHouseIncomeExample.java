package com.ky.jyg.assess.assess.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssHouseIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssHouseIncomeExample() {
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

        public Criteria andGrossRentIsNull() {
            addCriterion("gross_rent is null");
            return (Criteria) this;
        }

        public Criteria andGrossRentIsNotNull() {
            addCriterion("gross_rent is not null");
            return (Criteria) this;
        }

        public Criteria andGrossRentEqualTo(BigDecimal value) {
            addCriterion("gross_rent =", value, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentNotEqualTo(BigDecimal value) {
            addCriterion("gross_rent <>", value, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentGreaterThan(BigDecimal value) {
            addCriterion("gross_rent >", value, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_rent >=", value, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentLessThan(BigDecimal value) {
            addCriterion("gross_rent <", value, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_rent <=", value, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentIn(List<BigDecimal> values) {
            addCriterion("gross_rent in", values, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentNotIn(List<BigDecimal> values) {
            addCriterion("gross_rent not in", values, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_rent between", value1, value2, "grossRent");
            return (Criteria) this;
        }

        public Criteria andGrossRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_rent not between", value1, value2, "grossRent");
            return (Criteria) this;
        }

        public Criteria andMonthCountIsNull() {
            addCriterion("month_count is null");
            return (Criteria) this;
        }

        public Criteria andMonthCountIsNotNull() {
            addCriterion("month_count is not null");
            return (Criteria) this;
        }

        public Criteria andMonthCountEqualTo(Byte value) {
            addCriterion("month_count =", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountNotEqualTo(Byte value) {
            addCriterion("month_count <>", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountGreaterThan(Byte value) {
            addCriterion("month_count >", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("month_count >=", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountLessThan(Byte value) {
            addCriterion("month_count <", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountLessThanOrEqualTo(Byte value) {
            addCriterion("month_count <=", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountIn(List<Byte> values) {
            addCriterion("month_count in", values, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountNotIn(List<Byte> values) {
            addCriterion("month_count not in", values, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountBetween(Byte value1, Byte value2) {
            addCriterion("month_count between", value1, value2, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountNotBetween(Byte value1, Byte value2) {
            addCriterion("month_count not between", value1, value2, "monthCount");
            return (Criteria) this;
        }

        public Criteria andRentaRateIsNull() {
            addCriterion("renta_rate is null");
            return (Criteria) this;
        }

        public Criteria andRentaRateIsNotNull() {
            addCriterion("renta_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRentaRateEqualTo(BigDecimal value) {
            addCriterion("renta_rate =", value, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateNotEqualTo(BigDecimal value) {
            addCriterion("renta_rate <>", value, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateGreaterThan(BigDecimal value) {
            addCriterion("renta_rate >", value, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("renta_rate >=", value, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateLessThan(BigDecimal value) {
            addCriterion("renta_rate <", value, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("renta_rate <=", value, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateIn(List<BigDecimal> values) {
            addCriterion("renta_rate in", values, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateNotIn(List<BigDecimal> values) {
            addCriterion("renta_rate not in", values, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renta_rate between", value1, value2, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andRentaRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renta_rate not between", value1, value2, "rentaRate");
            return (Criteria) this;
        }

        public Criteria andBulidAreaIsNull() {
            addCriterion("bulid_area is null");
            return (Criteria) this;
        }

        public Criteria andBulidAreaIsNotNull() {
            addCriterion("bulid_area is not null");
            return (Criteria) this;
        }

        public Criteria andBulidAreaEqualTo(BigDecimal value) {
            addCriterion("bulid_area =", value, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaNotEqualTo(BigDecimal value) {
            addCriterion("bulid_area <>", value, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaGreaterThan(BigDecimal value) {
            addCriterion("bulid_area >", value, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bulid_area >=", value, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaLessThan(BigDecimal value) {
            addCriterion("bulid_area <", value, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bulid_area <=", value, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaIn(List<BigDecimal> values) {
            addCriterion("bulid_area in", values, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaNotIn(List<BigDecimal> values) {
            addCriterion("bulid_area not in", values, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bulid_area between", value1, value2, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andBulidAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bulid_area not between", value1, value2, "bulidArea");
            return (Criteria) this;
        }

        public Criteria andManageCostIsNull() {
            addCriterion("manage_cost is null");
            return (Criteria) this;
        }

        public Criteria andManageCostIsNotNull() {
            addCriterion("manage_cost is not null");
            return (Criteria) this;
        }

        public Criteria andManageCostEqualTo(BigDecimal value) {
            addCriterion("manage_cost =", value, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostNotEqualTo(BigDecimal value) {
            addCriterion("manage_cost <>", value, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostGreaterThan(BigDecimal value) {
            addCriterion("manage_cost >", value, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_cost >=", value, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostLessThan(BigDecimal value) {
            addCriterion("manage_cost <", value, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_cost <=", value, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostIn(List<BigDecimal> values) {
            addCriterion("manage_cost in", values, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostNotIn(List<BigDecimal> values) {
            addCriterion("manage_cost not in", values, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_cost between", value1, value2, "manageCost");
            return (Criteria) this;
        }

        public Criteria andManageCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_cost not between", value1, value2, "manageCost");
            return (Criteria) this;
        }

        public Criteria andValidIncomeIsNull() {
            addCriterion("valid_income is null");
            return (Criteria) this;
        }

        public Criteria andValidIncomeIsNotNull() {
            addCriterion("valid_income is not null");
            return (Criteria) this;
        }

        public Criteria andValidIncomeEqualTo(BigDecimal value) {
            addCriterion("valid_income =", value, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeNotEqualTo(BigDecimal value) {
            addCriterion("valid_income <>", value, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeGreaterThan(BigDecimal value) {
            addCriterion("valid_income >", value, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valid_income >=", value, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeLessThan(BigDecimal value) {
            addCriterion("valid_income <", value, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valid_income <=", value, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeIn(List<BigDecimal> values) {
            addCriterion("valid_income in", values, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeNotIn(List<BigDecimal> values) {
            addCriterion("valid_income not in", values, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valid_income between", value1, value2, "validIncome");
            return (Criteria) this;
        }

        public Criteria andValidIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valid_income not between", value1, value2, "validIncome");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostIsNull() {
            addCriterion("buliding_reset_cost is null");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostIsNotNull() {
            addCriterion("buliding_reset_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostEqualTo(Integer value) {
            addCriterion("buliding_reset_cost =", value, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostNotEqualTo(Integer value) {
            addCriterion("buliding_reset_cost <>", value, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostGreaterThan(Integer value) {
            addCriterion("buliding_reset_cost >", value, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("buliding_reset_cost >=", value, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostLessThan(Integer value) {
            addCriterion("buliding_reset_cost <", value, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostLessThanOrEqualTo(Integer value) {
            addCriterion("buliding_reset_cost <=", value, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostIn(List<Integer> values) {
            addCriterion("buliding_reset_cost in", values, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostNotIn(List<Integer> values) {
            addCriterion("buliding_reset_cost not in", values, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostBetween(Integer value1, Integer value2) {
            addCriterion("buliding_reset_cost between", value1, value2, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andBulidingResetCostNotBetween(Integer value1, Integer value2) {
            addCriterion("buliding_reset_cost not between", value1, value2, "bulidingResetCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNull() {
            addCriterion("repair_cost is null");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNotNull() {
            addCriterion("repair_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCostEqualTo(BigDecimal value) {
            addCriterion("repair_cost =", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotEqualTo(BigDecimal value) {
            addCriterion("repair_cost <>", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThan(BigDecimal value) {
            addCriterion("repair_cost >", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_cost >=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThan(BigDecimal value) {
            addCriterion("repair_cost <", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_cost <=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostIn(List<BigDecimal> values) {
            addCriterion("repair_cost in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotIn(List<BigDecimal> values) {
            addCriterion("repair_cost not in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_cost between", value1, value2, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_cost not between", value1, value2, "repairCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostIsNull() {
            addCriterion("safe_cost is null");
            return (Criteria) this;
        }

        public Criteria andSafeCostIsNotNull() {
            addCriterion("safe_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSafeCostEqualTo(BigDecimal value) {
            addCriterion("safe_cost =", value, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostNotEqualTo(BigDecimal value) {
            addCriterion("safe_cost <>", value, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostGreaterThan(BigDecimal value) {
            addCriterion("safe_cost >", value, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("safe_cost >=", value, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostLessThan(BigDecimal value) {
            addCriterion("safe_cost <", value, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("safe_cost <=", value, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostIn(List<BigDecimal> values) {
            addCriterion("safe_cost in", values, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostNotIn(List<BigDecimal> values) {
            addCriterion("safe_cost not in", values, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("safe_cost between", value1, value2, "safeCost");
            return (Criteria) this;
        }

        public Criteria andSafeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("safe_cost not between", value1, value2, "safeCost");
            return (Criteria) this;
        }

        public Criteria andTaxesIsNull() {
            addCriterion("taxes is null");
            return (Criteria) this;
        }

        public Criteria andTaxesIsNotNull() {
            addCriterion("taxes is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesEqualTo(BigDecimal value) {
            addCriterion("taxes =", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesNotEqualTo(BigDecimal value) {
            addCriterion("taxes <>", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesGreaterThan(BigDecimal value) {
            addCriterion("taxes >", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxes >=", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesLessThan(BigDecimal value) {
            addCriterion("taxes <", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxes <=", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesIn(List<BigDecimal> values) {
            addCriterion("taxes in", values, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesNotIn(List<BigDecimal> values) {
            addCriterion("taxes not in", values, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxes between", value1, value2, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxes not between", value1, value2, "taxes");
            return (Criteria) this;
        }

        public Criteria andOperateCostIsNull() {
            addCriterion("operate_cost is null");
            return (Criteria) this;
        }

        public Criteria andOperateCostIsNotNull() {
            addCriterion("operate_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCostEqualTo(BigDecimal value) {
            addCriterion("operate_cost =", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotEqualTo(BigDecimal value) {
            addCriterion("operate_cost <>", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostGreaterThan(BigDecimal value) {
            addCriterion("operate_cost >", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("operate_cost >=", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLessThan(BigDecimal value) {
            addCriterion("operate_cost <", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("operate_cost <=", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostIn(List<BigDecimal> values) {
            addCriterion("operate_cost in", values, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotIn(List<BigDecimal> values) {
            addCriterion("operate_cost not in", values, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operate_cost between", value1, value2, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operate_cost not between", value1, value2, "operateCost");
            return (Criteria) this;
        }

        public Criteria andNetProfitIsNull() {
            addCriterion("net_profit is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitIsNotNull() {
            addCriterion("net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitEqualTo(BigDecimal value) {
            addCriterion("net_profit =", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotEqualTo(BigDecimal value) {
            addCriterion("net_profit <>", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThan(BigDecimal value) {
            addCriterion("net_profit >", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_profit >=", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThan(BigDecimal value) {
            addCriterion("net_profit <", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_profit <=", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitIn(List<BigDecimal> values) {
            addCriterion("net_profit in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotIn(List<BigDecimal> values) {
            addCriterion("net_profit not in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_profit between", value1, value2, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_profit not between", value1, value2, "netProfit");
            return (Criteria) this;
        }

        public Criteria andRewardRateIsNull() {
            addCriterion("reward_rate is null");
            return (Criteria) this;
        }

        public Criteria andRewardRateIsNotNull() {
            addCriterion("reward_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRewardRateEqualTo(BigDecimal value) {
            addCriterion("reward_rate =", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateNotEqualTo(BigDecimal value) {
            addCriterion("reward_rate <>", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateGreaterThan(BigDecimal value) {
            addCriterion("reward_rate >", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reward_rate >=", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateLessThan(BigDecimal value) {
            addCriterion("reward_rate <", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reward_rate <=", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateIn(List<BigDecimal> values) {
            addCriterion("reward_rate in", values, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateNotIn(List<BigDecimal> values) {
            addCriterion("reward_rate not in", values, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward_rate between", value1, value2, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward_rate not between", value1, value2, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateIsNull() {
            addCriterion("rent_rise_rate is null");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateIsNotNull() {
            addCriterion("rent_rise_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateEqualTo(BigDecimal value) {
            addCriterion("rent_rise_rate =", value, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateNotEqualTo(BigDecimal value) {
            addCriterion("rent_rise_rate <>", value, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateGreaterThan(BigDecimal value) {
            addCriterion("rent_rise_rate >", value, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_rise_rate >=", value, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateLessThan(BigDecimal value) {
            addCriterion("rent_rise_rate <", value, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_rise_rate <=", value, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateIn(List<BigDecimal> values) {
            addCriterion("rent_rise_rate in", values, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateNotIn(List<BigDecimal> values) {
            addCriterion("rent_rise_rate not in", values, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_rise_rate between", value1, value2, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andRentRiseRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_rise_rate not between", value1, value2, "rentRiseRate");
            return (Criteria) this;
        }

        public Criteria andIncomeYearIsNull() {
            addCriterion("income_year is null");
            return (Criteria) this;
        }

        public Criteria andIncomeYearIsNotNull() {
            addCriterion("income_year is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeYearEqualTo(Byte value) {
            addCriterion("income_year =", value, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearNotEqualTo(Byte value) {
            addCriterion("income_year <>", value, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearGreaterThan(Byte value) {
            addCriterion("income_year >", value, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearGreaterThanOrEqualTo(Byte value) {
            addCriterion("income_year >=", value, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearLessThan(Byte value) {
            addCriterion("income_year <", value, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearLessThanOrEqualTo(Byte value) {
            addCriterion("income_year <=", value, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearIn(List<Byte> values) {
            addCriterion("income_year in", values, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearNotIn(List<Byte> values) {
            addCriterion("income_year not in", values, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearBetween(Byte value1, Byte value2) {
            addCriterion("income_year between", value1, value2, "incomeYear");
            return (Criteria) this;
        }

        public Criteria andIncomeYearNotBetween(Byte value1, Byte value2) {
            addCriterion("income_year not between", value1, value2, "incomeYear");
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