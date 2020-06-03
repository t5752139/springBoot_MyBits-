package com.ky.jyg.assess.entrust.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EntrustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntrustExample() {
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

        public Criteria andBussSerialIsNull() {
            addCriterion("buss_serial is null");
            return (Criteria) this;
        }

        public Criteria andBussSerialIsNotNull() {
            addCriterion("buss_serial is not null");
            return (Criteria) this;
        }

        public Criteria andBussSerialEqualTo(String value) {
            addCriterion("buss_serial =", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialNotEqualTo(String value) {
            addCriterion("buss_serial <>", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialGreaterThan(String value) {
            addCriterion("buss_serial >", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialGreaterThanOrEqualTo(String value) {
            addCriterion("buss_serial >=", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialLessThan(String value) {
            addCriterion("buss_serial <", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialLessThanOrEqualTo(String value) {
            addCriterion("buss_serial <=", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialLike(String value) {
            addCriterion("buss_serial like", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialNotLike(String value) {
            addCriterion("buss_serial not like", value, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialIn(List<String> values) {
            addCriterion("buss_serial in", values, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialNotIn(List<String> values) {
            addCriterion("buss_serial not in", values, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialBetween(String value1, String value2) {
            addCriterion("buss_serial between", value1, value2, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussSerialNotBetween(String value1, String value2) {
            addCriterion("buss_serial not between", value1, value2, "bussSerial");
            return (Criteria) this;
        }

        public Criteria andBussFormIdIsNull() {
            addCriterion("buss_form_id is null");
            return (Criteria) this;
        }

        public Criteria andBussFormIdIsNotNull() {
            addCriterion("buss_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andBussFormIdEqualTo(Long value) {
            addCriterion("buss_form_id =", value, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdNotEqualTo(Long value) {
            addCriterion("buss_form_id <>", value, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdGreaterThan(Long value) {
            addCriterion("buss_form_id >", value, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buss_form_id >=", value, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdLessThan(Long value) {
            addCriterion("buss_form_id <", value, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdLessThanOrEqualTo(Long value) {
            addCriterion("buss_form_id <=", value, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdIn(List<Long> values) {
            addCriterion("buss_form_id in", values, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdNotIn(List<Long> values) {
            addCriterion("buss_form_id not in", values, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdBetween(Long value1, Long value2) {
            addCriterion("buss_form_id between", value1, value2, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIdNotBetween(Long value1, Long value2) {
            addCriterion("buss_form_id not between", value1, value2, "bussFormId");
            return (Criteria) this;
        }

        public Criteria andBussFormIsNull() {
            addCriterion("buss_form is null");
            return (Criteria) this;
        }

        public Criteria andBussFormIsNotNull() {
            addCriterion("buss_form is not null");
            return (Criteria) this;
        }

        public Criteria andBussFormEqualTo(String value) {
            addCriterion("buss_form =", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormNotEqualTo(String value) {
            addCriterion("buss_form <>", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormGreaterThan(String value) {
            addCriterion("buss_form >", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormGreaterThanOrEqualTo(String value) {
            addCriterion("buss_form >=", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormLessThan(String value) {
            addCriterion("buss_form <", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormLessThanOrEqualTo(String value) {
            addCriterion("buss_form <=", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormLike(String value) {
            addCriterion("buss_form like", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormNotLike(String value) {
            addCriterion("buss_form not like", value, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormIn(List<String> values) {
            addCriterion("buss_form in", values, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormNotIn(List<String> values) {
            addCriterion("buss_form not in", values, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormBetween(String value1, String value2) {
            addCriterion("buss_form between", value1, value2, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormNotBetween(String value1, String value2) {
            addCriterion("buss_form not between", value1, value2, "bussForm");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeIsNull() {
            addCriterion("buss_form_code is null");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeIsNotNull() {
            addCriterion("buss_form_code is not null");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeEqualTo(String value) {
            addCriterion("buss_form_code =", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeNotEqualTo(String value) {
            addCriterion("buss_form_code <>", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeGreaterThan(String value) {
            addCriterion("buss_form_code >", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buss_form_code >=", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeLessThan(String value) {
            addCriterion("buss_form_code <", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeLessThanOrEqualTo(String value) {
            addCriterion("buss_form_code <=", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeLike(String value) {
            addCriterion("buss_form_code like", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeNotLike(String value) {
            addCriterion("buss_form_code not like", value, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeIn(List<String> values) {
            addCriterion("buss_form_code in", values, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeNotIn(List<String> values) {
            addCriterion("buss_form_code not in", values, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeBetween(String value1, String value2) {
            addCriterion("buss_form_code between", value1, value2, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andBussFormCodeNotBetween(String value1, String value2) {
            addCriterion("buss_form_code not between", value1, value2, "bussFormCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeIsNull() {
            addCriterion("ass_purpose is null");
            return (Criteria) this;
        }

        public Criteria andAssPurposeIsNotNull() {
            addCriterion("ass_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andAssPurposeEqualTo(String value) {
            addCriterion("ass_purpose =", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeNotEqualTo(String value) {
            addCriterion("ass_purpose <>", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeGreaterThan(String value) {
            addCriterion("ass_purpose >", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("ass_purpose >=", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeLessThan(String value) {
            addCriterion("ass_purpose <", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeLessThanOrEqualTo(String value) {
            addCriterion("ass_purpose <=", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeLike(String value) {
            addCriterion("ass_purpose like", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeNotLike(String value) {
            addCriterion("ass_purpose not like", value, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeIn(List<String> values) {
            addCriterion("ass_purpose in", values, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeNotIn(List<String> values) {
            addCriterion("ass_purpose not in", values, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeBetween(String value1, String value2) {
            addCriterion("ass_purpose between", value1, value2, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeNotBetween(String value1, String value2) {
            addCriterion("ass_purpose not between", value1, value2, "assPurpose");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeIsNull() {
            addCriterion("ass_purpose_code is null");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeIsNotNull() {
            addCriterion("ass_purpose_code is not null");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeEqualTo(String value) {
            addCriterion("ass_purpose_code =", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeNotEqualTo(String value) {
            addCriterion("ass_purpose_code <>", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeGreaterThan(String value) {
            addCriterion("ass_purpose_code >", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ass_purpose_code >=", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeLessThan(String value) {
            addCriterion("ass_purpose_code <", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeLessThanOrEqualTo(String value) {
            addCriterion("ass_purpose_code <=", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeLike(String value) {
            addCriterion("ass_purpose_code like", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeNotLike(String value) {
            addCriterion("ass_purpose_code not like", value, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeIn(List<String> values) {
            addCriterion("ass_purpose_code in", values, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeNotIn(List<String> values) {
            addCriterion("ass_purpose_code not in", values, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeBetween(String value1, String value2) {
            addCriterion("ass_purpose_code between", value1, value2, "assPurposeCode");
            return (Criteria) this;
        }

        public Criteria andAssPurposeCodeNotBetween(String value1, String value2) {
            addCriterion("ass_purpose_code not between", value1, value2, "assPurposeCode");
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNull() {
            addCriterion("county_code is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("county_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(String value) {
            addCriterion("county_code =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(String value) {
            addCriterion("county_code <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(String value) {
            addCriterion("county_code >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("county_code >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(String value) {
            addCriterion("county_code <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("county_code <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLike(String value) {
            addCriterion("county_code like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotLike(String value) {
            addCriterion("county_code not like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(List<String> values) {
            addCriterion("county_code in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(List<String> values) {
            addCriterion("county_code not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(String value1, String value2) {
            addCriterion("county_code between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(String value1, String value2) {
            addCriterion("county_code not between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andBaseDateIsNull() {
            addCriterion("base_date is null");
            return (Criteria) this;
        }

        public Criteria andBaseDateIsNotNull() {
            addCriterion("base_date is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("base_date =", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("base_date <>", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("base_date >", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("base_date >=", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateLessThan(Date value) {
            addCriterionForJDBCDate("base_date <", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("base_date <=", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("base_date in", values, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("base_date not in", values, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("base_date between", value1, value2, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("base_date not between", value1, value2, "baseDate");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdIsNull() {
            addCriterion("entrust_company_id is null");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdIsNotNull() {
            addCriterion("entrust_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdEqualTo(Long value) {
            addCriterion("entrust_company_id =", value, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdNotEqualTo(Long value) {
            addCriterion("entrust_company_id <>", value, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdGreaterThan(Long value) {
            addCriterion("entrust_company_id >", value, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entrust_company_id >=", value, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdLessThan(Long value) {
            addCriterion("entrust_company_id <", value, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("entrust_company_id <=", value, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdIn(List<Long> values) {
            addCriterion("entrust_company_id in", values, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdNotIn(List<Long> values) {
            addCriterion("entrust_company_id not in", values, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdBetween(Long value1, Long value2) {
            addCriterion("entrust_company_id between", value1, value2, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("entrust_company_id not between", value1, value2, "entrustCompanyId");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameIsNull() {
            addCriterion("entrust_company_name is null");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameIsNotNull() {
            addCriterion("entrust_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameEqualTo(String value) {
            addCriterion("entrust_company_name =", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameNotEqualTo(String value) {
            addCriterion("entrust_company_name <>", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameGreaterThan(String value) {
            addCriterion("entrust_company_name >", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("entrust_company_name >=", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameLessThan(String value) {
            addCriterion("entrust_company_name <", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("entrust_company_name <=", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameLike(String value) {
            addCriterion("entrust_company_name like", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameNotLike(String value) {
            addCriterion("entrust_company_name not like", value, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameIn(List<String> values) {
            addCriterion("entrust_company_name in", values, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameNotIn(List<String> values) {
            addCriterion("entrust_company_name not in", values, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameBetween(String value1, String value2) {
            addCriterion("entrust_company_name between", value1, value2, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andEntrustCompanyNameNotBetween(String value1, String value2) {
            addCriterion("entrust_company_name not between", value1, value2, "entrustCompanyName");
            return (Criteria) this;
        }

        public Criteria andConsignorUidIsNull() {
            addCriterion("consignor_uid is null");
            return (Criteria) this;
        }

        public Criteria andConsignorUidIsNotNull() {
            addCriterion("consignor_uid is not null");
            return (Criteria) this;
        }

        public Criteria andConsignorUidEqualTo(Long value) {
            addCriterion("consignor_uid =", value, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidNotEqualTo(Long value) {
            addCriterion("consignor_uid <>", value, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidGreaterThan(Long value) {
            addCriterion("consignor_uid >", value, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidGreaterThanOrEqualTo(Long value) {
            addCriterion("consignor_uid >=", value, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidLessThan(Long value) {
            addCriterion("consignor_uid <", value, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidLessThanOrEqualTo(Long value) {
            addCriterion("consignor_uid <=", value, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidIn(List<Long> values) {
            addCriterion("consignor_uid in", values, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidNotIn(List<Long> values) {
            addCriterion("consignor_uid not in", values, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidBetween(Long value1, Long value2) {
            addCriterion("consignor_uid between", value1, value2, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUidNotBetween(Long value1, Long value2) {
            addCriterion("consignor_uid not between", value1, value2, "consignorUid");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameIsNull() {
            addCriterion("consignor_uname is null");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameIsNotNull() {
            addCriterion("consignor_uname is not null");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameEqualTo(String value) {
            addCriterion("consignor_uname =", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameNotEqualTo(String value) {
            addCriterion("consignor_uname <>", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameGreaterThan(String value) {
            addCriterion("consignor_uname >", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameGreaterThanOrEqualTo(String value) {
            addCriterion("consignor_uname >=", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameLessThan(String value) {
            addCriterion("consignor_uname <", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameLessThanOrEqualTo(String value) {
            addCriterion("consignor_uname <=", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameLike(String value) {
            addCriterion("consignor_uname like", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameNotLike(String value) {
            addCriterion("consignor_uname not like", value, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameIn(List<String> values) {
            addCriterion("consignor_uname in", values, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameNotIn(List<String> values) {
            addCriterion("consignor_uname not in", values, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameBetween(String value1, String value2) {
            addCriterion("consignor_uname between", value1, value2, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorUnameNotBetween(String value1, String value2) {
            addCriterion("consignor_uname not between", value1, value2, "consignorUname");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneIsNull() {
            addCriterion("consignor_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneIsNotNull() {
            addCriterion("consignor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneEqualTo(String value) {
            addCriterion("consignor_phone =", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneNotEqualTo(String value) {
            addCriterion("consignor_phone <>", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneGreaterThan(String value) {
            addCriterion("consignor_phone >", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consignor_phone >=", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneLessThan(String value) {
            addCriterion("consignor_phone <", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneLessThanOrEqualTo(String value) {
            addCriterion("consignor_phone <=", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneLike(String value) {
            addCriterion("consignor_phone like", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneNotLike(String value) {
            addCriterion("consignor_phone not like", value, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneIn(List<String> values) {
            addCriterion("consignor_phone in", values, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneNotIn(List<String> values) {
            addCriterion("consignor_phone not in", values, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneBetween(String value1, String value2) {
            addCriterion("consignor_phone between", value1, value2, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConsignorPhoneNotBetween(String value1, String value2) {
            addCriterion("consignor_phone not between", value1, value2, "consignorPhone");
            return (Criteria) this;
        }

        public Criteria andConnectUnameIsNull() {
            addCriterion("connect_uname is null");
            return (Criteria) this;
        }

        public Criteria andConnectUnameIsNotNull() {
            addCriterion("connect_uname is not null");
            return (Criteria) this;
        }

        public Criteria andConnectUnameEqualTo(String value) {
            addCriterion("connect_uname =", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameNotEqualTo(String value) {
            addCriterion("connect_uname <>", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameGreaterThan(String value) {
            addCriterion("connect_uname >", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameGreaterThanOrEqualTo(String value) {
            addCriterion("connect_uname >=", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameLessThan(String value) {
            addCriterion("connect_uname <", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameLessThanOrEqualTo(String value) {
            addCriterion("connect_uname <=", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameLike(String value) {
            addCriterion("connect_uname like", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameNotLike(String value) {
            addCriterion("connect_uname not like", value, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameIn(List<String> values) {
            addCriterion("connect_uname in", values, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameNotIn(List<String> values) {
            addCriterion("connect_uname not in", values, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameBetween(String value1, String value2) {
            addCriterion("connect_uname between", value1, value2, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectUnameNotBetween(String value1, String value2) {
            addCriterion("connect_uname not between", value1, value2, "connectUname");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneIsNull() {
            addCriterion("connect_phone is null");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneIsNotNull() {
            addCriterion("connect_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneEqualTo(String value) {
            addCriterion("connect_phone =", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneNotEqualTo(String value) {
            addCriterion("connect_phone <>", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneGreaterThan(String value) {
            addCriterion("connect_phone >", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("connect_phone >=", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneLessThan(String value) {
            addCriterion("connect_phone <", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneLessThanOrEqualTo(String value) {
            addCriterion("connect_phone <=", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneLike(String value) {
            addCriterion("connect_phone like", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneNotLike(String value) {
            addCriterion("connect_phone not like", value, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneIn(List<String> values) {
            addCriterion("connect_phone in", values, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneNotIn(List<String> values) {
            addCriterion("connect_phone not in", values, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneBetween(String value1, String value2) {
            addCriterion("connect_phone between", value1, value2, "connectPhone");
            return (Criteria) this;
        }

        public Criteria andConnectPhoneNotBetween(String value1, String value2) {
            addCriterion("connect_phone not between", value1, value2, "connectPhone");
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