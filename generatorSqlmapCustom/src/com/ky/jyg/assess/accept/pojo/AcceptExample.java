package com.ky.jyg.assess.accept.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcceptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcceptExample() {
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

        public Criteria andReportNoIsNull() {
            addCriterion("report_no is null");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNotNull() {
            addCriterion("report_no is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoEqualTo(String value) {
            addCriterion("report_no =", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotEqualTo(String value) {
            addCriterion("report_no <>", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThan(String value) {
            addCriterion("report_no >", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThanOrEqualTo(String value) {
            addCriterion("report_no >=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThan(String value) {
            addCriterion("report_no <", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThanOrEqualTo(String value) {
            addCriterion("report_no <=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLike(String value) {
            addCriterion("report_no like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotLike(String value) {
            addCriterion("report_no not like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoIn(List<String> values) {
            addCriterion("report_no in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotIn(List<String> values) {
            addCriterion("report_no not in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoBetween(String value1, String value2) {
            addCriterion("report_no between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotBetween(String value1, String value2) {
            addCriterion("report_no not between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNull() {
            addCriterion("entrust_id is null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNotNull() {
            addCriterion("entrust_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdEqualTo(Long value) {
            addCriterion("entrust_id =", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotEqualTo(Long value) {
            addCriterion("entrust_id <>", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThan(Long value) {
            addCriterion("entrust_id >", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entrust_id >=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThan(Long value) {
            addCriterion("entrust_id <", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThanOrEqualTo(Long value) {
            addCriterion("entrust_id <=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIn(List<Long> values) {
            addCriterion("entrust_id in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotIn(List<Long> values) {
            addCriterion("entrust_id not in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdBetween(Long value1, Long value2) {
            addCriterion("entrust_id between", value1, value2, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotBetween(Long value1, Long value2) {
            addCriterion("entrust_id not between", value1, value2, "entrustId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdIsNull() {
            addCriterion("accept_company_id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdIsNotNull() {
            addCriterion("accept_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdEqualTo(Long value) {
            addCriterion("accept_company_id =", value, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdNotEqualTo(Long value) {
            addCriterion("accept_company_id <>", value, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdGreaterThan(Long value) {
            addCriterion("accept_company_id >", value, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accept_company_id >=", value, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdLessThan(Long value) {
            addCriterion("accept_company_id <", value, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("accept_company_id <=", value, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdIn(List<Long> values) {
            addCriterion("accept_company_id in", values, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdNotIn(List<Long> values) {
            addCriterion("accept_company_id not in", values, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdBetween(Long value1, Long value2) {
            addCriterion("accept_company_id between", value1, value2, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("accept_company_id not between", value1, value2, "acceptCompanyId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdIsNull() {
            addCriterion("accept_uid_id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdIsNotNull() {
            addCriterion("accept_uid_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdEqualTo(Long value) {
            addCriterion("accept_uid_id =", value, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdNotEqualTo(Long value) {
            addCriterion("accept_uid_id <>", value, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdGreaterThan(Long value) {
            addCriterion("accept_uid_id >", value, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accept_uid_id >=", value, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdLessThan(Long value) {
            addCriterion("accept_uid_id <", value, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdLessThanOrEqualTo(Long value) {
            addCriterion("accept_uid_id <=", value, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdIn(List<Long> values) {
            addCriterion("accept_uid_id in", values, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdNotIn(List<Long> values) {
            addCriterion("accept_uid_id not in", values, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdBetween(Long value1, Long value2) {
            addCriterion("accept_uid_id between", value1, value2, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptUidIdNotBetween(Long value1, Long value2) {
            addCriterion("accept_uid_id not between", value1, value2, "acceptUidId");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNull() {
            addCriterion("accept_time is null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNotNull() {
            addCriterion("accept_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeEqualTo(Date value) {
            addCriterion("accept_time =", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotEqualTo(Date value) {
            addCriterion("accept_time <>", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThan(Date value) {
            addCriterion("accept_time >", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accept_time >=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThan(Date value) {
            addCriterion("accept_time <", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThanOrEqualTo(Date value) {
            addCriterion("accept_time <=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIn(List<Date> values) {
            addCriterion("accept_time in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotIn(List<Date> values) {
            addCriterion("accept_time not in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeBetween(Date value1, Date value2) {
            addCriterion("accept_time between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotBetween(Date value1, Date value2) {
            addCriterion("accept_time not between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdIsNull() {
            addCriterion("charging_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdIsNotNull() {
            addCriterion("charging_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdEqualTo(Long value) {
            addCriterion("charging_standard_id =", value, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdNotEqualTo(Long value) {
            addCriterion("charging_standard_id <>", value, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdGreaterThan(Long value) {
            addCriterion("charging_standard_id >", value, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("charging_standard_id >=", value, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdLessThan(Long value) {
            addCriterion("charging_standard_id <", value, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdLessThanOrEqualTo(Long value) {
            addCriterion("charging_standard_id <=", value, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdIn(List<Long> values) {
            addCriterion("charging_standard_id in", values, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdNotIn(List<Long> values) {
            addCriterion("charging_standard_id not in", values, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdBetween(Long value1, Long value2) {
            addCriterion("charging_standard_id between", value1, value2, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andChargingStandardIdNotBetween(Long value1, Long value2) {
            addCriterion("charging_standard_id not between", value1, value2, "chargingStandardId");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityIsNull() {
            addCriterion("buss_source_city is null");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityIsNotNull() {
            addCriterion("buss_source_city is not null");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityEqualTo(String value) {
            addCriterion("buss_source_city =", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityNotEqualTo(String value) {
            addCriterion("buss_source_city <>", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityGreaterThan(String value) {
            addCriterion("buss_source_city >", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityGreaterThanOrEqualTo(String value) {
            addCriterion("buss_source_city >=", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityLessThan(String value) {
            addCriterion("buss_source_city <", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityLessThanOrEqualTo(String value) {
            addCriterion("buss_source_city <=", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityLike(String value) {
            addCriterion("buss_source_city like", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityNotLike(String value) {
            addCriterion("buss_source_city not like", value, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityIn(List<String> values) {
            addCriterion("buss_source_city in", values, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityNotIn(List<String> values) {
            addCriterion("buss_source_city not in", values, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityBetween(String value1, String value2) {
            addCriterion("buss_source_city between", value1, value2, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityNotBetween(String value1, String value2) {
            addCriterion("buss_source_city not between", value1, value2, "bussSourceCity");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeIsNull() {
            addCriterion("buss_source_city_code is null");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeIsNotNull() {
            addCriterion("buss_source_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeEqualTo(String value) {
            addCriterion("buss_source_city_code =", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeNotEqualTo(String value) {
            addCriterion("buss_source_city_code <>", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeGreaterThan(String value) {
            addCriterion("buss_source_city_code >", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buss_source_city_code >=", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeLessThan(String value) {
            addCriterion("buss_source_city_code <", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeLessThanOrEqualTo(String value) {
            addCriterion("buss_source_city_code <=", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeLike(String value) {
            addCriterion("buss_source_city_code like", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeNotLike(String value) {
            addCriterion("buss_source_city_code not like", value, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeIn(List<String> values) {
            addCriterion("buss_source_city_code in", values, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeNotIn(List<String> values) {
            addCriterion("buss_source_city_code not in", values, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeBetween(String value1, String value2) {
            addCriterion("buss_source_city_code between", value1, value2, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceCityCodeNotBetween(String value1, String value2) {
            addCriterion("buss_source_city_code not between", value1, value2, "bussSourceCityCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganIsNull() {
            addCriterion("buss_source_organ is null");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganIsNotNull() {
            addCriterion("buss_source_organ is not null");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganEqualTo(String value) {
            addCriterion("buss_source_organ =", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganNotEqualTo(String value) {
            addCriterion("buss_source_organ <>", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganGreaterThan(String value) {
            addCriterion("buss_source_organ >", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganGreaterThanOrEqualTo(String value) {
            addCriterion("buss_source_organ >=", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganLessThan(String value) {
            addCriterion("buss_source_organ <", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganLessThanOrEqualTo(String value) {
            addCriterion("buss_source_organ <=", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganLike(String value) {
            addCriterion("buss_source_organ like", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganNotLike(String value) {
            addCriterion("buss_source_organ not like", value, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganIn(List<String> values) {
            addCriterion("buss_source_organ in", values, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganNotIn(List<String> values) {
            addCriterion("buss_source_organ not in", values, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganBetween(String value1, String value2) {
            addCriterion("buss_source_organ between", value1, value2, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganNotBetween(String value1, String value2) {
            addCriterion("buss_source_organ not between", value1, value2, "bussSourceOrgan");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeIsNull() {
            addCriterion("buss_source_organ_code is null");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeIsNotNull() {
            addCriterion("buss_source_organ_code is not null");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeEqualTo(String value) {
            addCriterion("buss_source_organ_code =", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeNotEqualTo(String value) {
            addCriterion("buss_source_organ_code <>", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeGreaterThan(String value) {
            addCriterion("buss_source_organ_code >", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buss_source_organ_code >=", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeLessThan(String value) {
            addCriterion("buss_source_organ_code <", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeLessThanOrEqualTo(String value) {
            addCriterion("buss_source_organ_code <=", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeLike(String value) {
            addCriterion("buss_source_organ_code like", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeNotLike(String value) {
            addCriterion("buss_source_organ_code not like", value, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeIn(List<String> values) {
            addCriterion("buss_source_organ_code in", values, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeNotIn(List<String> values) {
            addCriterion("buss_source_organ_code not in", values, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeBetween(String value1, String value2) {
            addCriterion("buss_source_organ_code between", value1, value2, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussSourceOrganCodeNotBetween(String value1, String value2) {
            addCriterion("buss_source_organ_code not between", value1, value2, "bussSourceOrganCode");
            return (Criteria) this;
        }

        public Criteria andBussVestIsNull() {
            addCriterion("buss_vest is null");
            return (Criteria) this;
        }

        public Criteria andBussVestIsNotNull() {
            addCriterion("buss_vest is not null");
            return (Criteria) this;
        }

        public Criteria andBussVestEqualTo(String value) {
            addCriterion("buss_vest =", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestNotEqualTo(String value) {
            addCriterion("buss_vest <>", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestGreaterThan(String value) {
            addCriterion("buss_vest >", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestGreaterThanOrEqualTo(String value) {
            addCriterion("buss_vest >=", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestLessThan(String value) {
            addCriterion("buss_vest <", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestLessThanOrEqualTo(String value) {
            addCriterion("buss_vest <=", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestLike(String value) {
            addCriterion("buss_vest like", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestNotLike(String value) {
            addCriterion("buss_vest not like", value, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestIn(List<String> values) {
            addCriterion("buss_vest in", values, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestNotIn(List<String> values) {
            addCriterion("buss_vest not in", values, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestBetween(String value1, String value2) {
            addCriterion("buss_vest between", value1, value2, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestNotBetween(String value1, String value2) {
            addCriterion("buss_vest not between", value1, value2, "bussVest");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeIsNull() {
            addCriterion("buss_vest_code is null");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeIsNotNull() {
            addCriterion("buss_vest_code is not null");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeEqualTo(String value) {
            addCriterion("buss_vest_code =", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeNotEqualTo(String value) {
            addCriterion("buss_vest_code <>", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeGreaterThan(String value) {
            addCriterion("buss_vest_code >", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buss_vest_code >=", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeLessThan(String value) {
            addCriterion("buss_vest_code <", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeLessThanOrEqualTo(String value) {
            addCriterion("buss_vest_code <=", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeLike(String value) {
            addCriterion("buss_vest_code like", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeNotLike(String value) {
            addCriterion("buss_vest_code not like", value, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeIn(List<String> values) {
            addCriterion("buss_vest_code in", values, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeNotIn(List<String> values) {
            addCriterion("buss_vest_code not in", values, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeBetween(String value1, String value2) {
            addCriterion("buss_vest_code between", value1, value2, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andBussVestCodeNotBetween(String value1, String value2) {
            addCriterion("buss_vest_code not between", value1, value2, "bussVestCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateIsNull() {
            addCriterion("accept_state is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStateIsNotNull() {
            addCriterion("accept_state is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStateEqualTo(String value) {
            addCriterion("accept_state =", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotEqualTo(String value) {
            addCriterion("accept_state <>", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateGreaterThan(String value) {
            addCriterion("accept_state >", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateGreaterThanOrEqualTo(String value) {
            addCriterion("accept_state >=", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateLessThan(String value) {
            addCriterion("accept_state <", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateLessThanOrEqualTo(String value) {
            addCriterion("accept_state <=", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateLike(String value) {
            addCriterion("accept_state like", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotLike(String value) {
            addCriterion("accept_state not like", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateIn(List<String> values) {
            addCriterion("accept_state in", values, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotIn(List<String> values) {
            addCriterion("accept_state not in", values, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateBetween(String value1, String value2) {
            addCriterion("accept_state between", value1, value2, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotBetween(String value1, String value2) {
            addCriterion("accept_state not between", value1, value2, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeIsNull() {
            addCriterion("accept_state_code is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeIsNotNull() {
            addCriterion("accept_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeEqualTo(String value) {
            addCriterion("accept_state_code =", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeNotEqualTo(String value) {
            addCriterion("accept_state_code <>", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeGreaterThan(String value) {
            addCriterion("accept_state_code >", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("accept_state_code >=", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeLessThan(String value) {
            addCriterion("accept_state_code <", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeLessThanOrEqualTo(String value) {
            addCriterion("accept_state_code <=", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeLike(String value) {
            addCriterion("accept_state_code like", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeNotLike(String value) {
            addCriterion("accept_state_code not like", value, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeIn(List<String> values) {
            addCriterion("accept_state_code in", values, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeNotIn(List<String> values) {
            addCriterion("accept_state_code not in", values, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeBetween(String value1, String value2) {
            addCriterion("accept_state_code between", value1, value2, "acceptStateCode");
            return (Criteria) this;
        }

        public Criteria andAcceptStateCodeNotBetween(String value1, String value2) {
            addCriterion("accept_state_code not between", value1, value2, "acceptStateCode");
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