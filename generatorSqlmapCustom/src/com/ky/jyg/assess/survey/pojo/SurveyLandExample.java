package com.ky.jyg.assess.survey.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SurveyLandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyLandExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNull() {
            addCriterion("survey_time is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNotNull() {
            addCriterion("survey_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("survey_time =", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("survey_time <>", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("survey_time >", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("survey_time >=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThan(Date value) {
            addCriterionForJDBCDate("survey_time <", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("survey_time <=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("survey_time in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("survey_time not in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("survey_time between", value1, value2, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("survey_time not between", value1, value2, "surveyTime");
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

        public Criteria andRedlineOutsideIsNull() {
            addCriterion("redline_outside is null");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideIsNotNull() {
            addCriterion("redline_outside is not null");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideEqualTo(String value) {
            addCriterion("redline_outside =", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideNotEqualTo(String value) {
            addCriterion("redline_outside <>", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideGreaterThan(String value) {
            addCriterion("redline_outside >", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideGreaterThanOrEqualTo(String value) {
            addCriterion("redline_outside >=", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideLessThan(String value) {
            addCriterion("redline_outside <", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideLessThanOrEqualTo(String value) {
            addCriterion("redline_outside <=", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideLike(String value) {
            addCriterion("redline_outside like", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideNotLike(String value) {
            addCriterion("redline_outside not like", value, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideIn(List<String> values) {
            addCriterion("redline_outside in", values, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideNotIn(List<String> values) {
            addCriterion("redline_outside not in", values, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideBetween(String value1, String value2) {
            addCriterion("redline_outside between", value1, value2, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineOutsideNotBetween(String value1, String value2) {
            addCriterion("redline_outside not between", value1, value2, "redlineOutside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideIsNull() {
            addCriterion("redline_inside is null");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideIsNotNull() {
            addCriterion("redline_inside is not null");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideEqualTo(String value) {
            addCriterion("redline_inside =", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideNotEqualTo(String value) {
            addCriterion("redline_inside <>", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideGreaterThan(String value) {
            addCriterion("redline_inside >", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideGreaterThanOrEqualTo(String value) {
            addCriterion("redline_inside >=", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideLessThan(String value) {
            addCriterion("redline_inside <", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideLessThanOrEqualTo(String value) {
            addCriterion("redline_inside <=", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideLike(String value) {
            addCriterion("redline_inside like", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideNotLike(String value) {
            addCriterion("redline_inside not like", value, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideIn(List<String> values) {
            addCriterion("redline_inside in", values, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideNotIn(List<String> values) {
            addCriterion("redline_inside not in", values, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideBetween(String value1, String value2) {
            addCriterion("redline_inside between", value1, value2, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andRedlineInsideNotBetween(String value1, String value2) {
            addCriterion("redline_inside not between", value1, value2, "redlineInside");
            return (Criteria) this;
        }

        public Criteria andParcelShapeIsNull() {
            addCriterion("parcel_shape is null");
            return (Criteria) this;
        }

        public Criteria andParcelShapeIsNotNull() {
            addCriterion("parcel_shape is not null");
            return (Criteria) this;
        }

        public Criteria andParcelShapeEqualTo(String value) {
            addCriterion("parcel_shape =", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeNotEqualTo(String value) {
            addCriterion("parcel_shape <>", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeGreaterThan(String value) {
            addCriterion("parcel_shape >", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeGreaterThanOrEqualTo(String value) {
            addCriterion("parcel_shape >=", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeLessThan(String value) {
            addCriterion("parcel_shape <", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeLessThanOrEqualTo(String value) {
            addCriterion("parcel_shape <=", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeLike(String value) {
            addCriterion("parcel_shape like", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeNotLike(String value) {
            addCriterion("parcel_shape not like", value, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeIn(List<String> values) {
            addCriterion("parcel_shape in", values, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeNotIn(List<String> values) {
            addCriterion("parcel_shape not in", values, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeBetween(String value1, String value2) {
            addCriterion("parcel_shape between", value1, value2, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeNotBetween(String value1, String value2) {
            addCriterion("parcel_shape not between", value1, value2, "parcelShape");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeIsNull() {
            addCriterion("parcel_shape_code is null");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeIsNotNull() {
            addCriterion("parcel_shape_code is not null");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeEqualTo(String value) {
            addCriterion("parcel_shape_code =", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeNotEqualTo(String value) {
            addCriterion("parcel_shape_code <>", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeGreaterThan(String value) {
            addCriterion("parcel_shape_code >", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parcel_shape_code >=", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeLessThan(String value) {
            addCriterion("parcel_shape_code <", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeLessThanOrEqualTo(String value) {
            addCriterion("parcel_shape_code <=", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeLike(String value) {
            addCriterion("parcel_shape_code like", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeNotLike(String value) {
            addCriterion("parcel_shape_code not like", value, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeIn(List<String> values) {
            addCriterion("parcel_shape_code in", values, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeNotIn(List<String> values) {
            addCriterion("parcel_shape_code not in", values, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeBetween(String value1, String value2) {
            addCriterion("parcel_shape_code between", value1, value2, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelShapeCodeNotBetween(String value1, String value2) {
            addCriterion("parcel_shape_code not between", value1, value2, "parcelShapeCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationIsNull() {
            addCriterion("parcel_location is null");
            return (Criteria) this;
        }

        public Criteria andParcelLocationIsNotNull() {
            addCriterion("parcel_location is not null");
            return (Criteria) this;
        }

        public Criteria andParcelLocationEqualTo(String value) {
            addCriterion("parcel_location =", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationNotEqualTo(String value) {
            addCriterion("parcel_location <>", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationGreaterThan(String value) {
            addCriterion("parcel_location >", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationGreaterThanOrEqualTo(String value) {
            addCriterion("parcel_location >=", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationLessThan(String value) {
            addCriterion("parcel_location <", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationLessThanOrEqualTo(String value) {
            addCriterion("parcel_location <=", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationLike(String value) {
            addCriterion("parcel_location like", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationNotLike(String value) {
            addCriterion("parcel_location not like", value, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationIn(List<String> values) {
            addCriterion("parcel_location in", values, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationNotIn(List<String> values) {
            addCriterion("parcel_location not in", values, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationBetween(String value1, String value2) {
            addCriterion("parcel_location between", value1, value2, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationNotBetween(String value1, String value2) {
            addCriterion("parcel_location not between", value1, value2, "parcelLocation");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeIsNull() {
            addCriterion("parcel_location_code is null");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeIsNotNull() {
            addCriterion("parcel_location_code is not null");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeEqualTo(String value) {
            addCriterion("parcel_location_code =", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeNotEqualTo(String value) {
            addCriterion("parcel_location_code <>", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeGreaterThan(String value) {
            addCriterion("parcel_location_code >", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parcel_location_code >=", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeLessThan(String value) {
            addCriterion("parcel_location_code <", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("parcel_location_code <=", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeLike(String value) {
            addCriterion("parcel_location_code like", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeNotLike(String value) {
            addCriterion("parcel_location_code not like", value, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeIn(List<String> values) {
            addCriterion("parcel_location_code in", values, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeNotIn(List<String> values) {
            addCriterion("parcel_location_code not in", values, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeBetween(String value1, String value2) {
            addCriterion("parcel_location_code between", value1, value2, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andParcelLocationCodeNotBetween(String value1, String value2) {
            addCriterion("parcel_location_code not between", value1, value2, "parcelLocationCode");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeIsNull() {
            addCriterion("farmland_type is null");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeIsNotNull() {
            addCriterion("farmland_type is not null");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeEqualTo(String value) {
            addCriterion("farmland_type =", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeNotEqualTo(String value) {
            addCriterion("farmland_type <>", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeGreaterThan(String value) {
            addCriterion("farmland_type >", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("farmland_type >=", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeLessThan(String value) {
            addCriterion("farmland_type <", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeLessThanOrEqualTo(String value) {
            addCriterion("farmland_type <=", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeLike(String value) {
            addCriterion("farmland_type like", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeNotLike(String value) {
            addCriterion("farmland_type not like", value, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeIn(List<String> values) {
            addCriterion("farmland_type in", values, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeNotIn(List<String> values) {
            addCriterion("farmland_type not in", values, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeBetween(String value1, String value2) {
            addCriterion("farmland_type between", value1, value2, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andFarmlandTypeNotBetween(String value1, String value2) {
            addCriterion("farmland_type not between", value1, value2, "farmlandType");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseIsNull() {
            addCriterion("around_enterprise is null");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseIsNotNull() {
            addCriterion("around_enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseEqualTo(String value) {
            addCriterion("around_enterprise =", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseNotEqualTo(String value) {
            addCriterion("around_enterprise <>", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseGreaterThan(String value) {
            addCriterion("around_enterprise >", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("around_enterprise >=", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseLessThan(String value) {
            addCriterion("around_enterprise <", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("around_enterprise <=", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseLike(String value) {
            addCriterion("around_enterprise like", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseNotLike(String value) {
            addCriterion("around_enterprise not like", value, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseIn(List<String> values) {
            addCriterion("around_enterprise in", values, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseNotIn(List<String> values) {
            addCriterion("around_enterprise not in", values, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseBetween(String value1, String value2) {
            addCriterion("around_enterprise between", value1, value2, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andAroundEnterpriseNotBetween(String value1, String value2) {
            addCriterion("around_enterprise not between", value1, value2, "aroundEnterprise");
            return (Criteria) this;
        }

        public Criteria andRoadName1IsNull() {
            addCriterion("road_name1 is null");
            return (Criteria) this;
        }

        public Criteria andRoadName1IsNotNull() {
            addCriterion("road_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadName1EqualTo(String value) {
            addCriterion("road_name1 =", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1NotEqualTo(String value) {
            addCriterion("road_name1 <>", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1GreaterThan(String value) {
            addCriterion("road_name1 >", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1GreaterThanOrEqualTo(String value) {
            addCriterion("road_name1 >=", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1LessThan(String value) {
            addCriterion("road_name1 <", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1LessThanOrEqualTo(String value) {
            addCriterion("road_name1 <=", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1Like(String value) {
            addCriterion("road_name1 like", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1NotLike(String value) {
            addCriterion("road_name1 not like", value, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1In(List<String> values) {
            addCriterion("road_name1 in", values, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1NotIn(List<String> values) {
            addCriterion("road_name1 not in", values, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1Between(String value1, String value2) {
            addCriterion("road_name1 between", value1, value2, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadName1NotBetween(String value1, String value2) {
            addCriterion("road_name1 not between", value1, value2, "roadName1");
            return (Criteria) this;
        }

        public Criteria andRoadType1IsNull() {
            addCriterion("road_type1 is null");
            return (Criteria) this;
        }

        public Criteria andRoadType1IsNotNull() {
            addCriterion("road_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType1EqualTo(String value) {
            addCriterion("road_type1 =", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1NotEqualTo(String value) {
            addCriterion("road_type1 <>", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1GreaterThan(String value) {
            addCriterion("road_type1 >", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1GreaterThanOrEqualTo(String value) {
            addCriterion("road_type1 >=", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1LessThan(String value) {
            addCriterion("road_type1 <", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1LessThanOrEqualTo(String value) {
            addCriterion("road_type1 <=", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1Like(String value) {
            addCriterion("road_type1 like", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1NotLike(String value) {
            addCriterion("road_type1 not like", value, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1In(List<String> values) {
            addCriterion("road_type1 in", values, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1NotIn(List<String> values) {
            addCriterion("road_type1 not in", values, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1Between(String value1, String value2) {
            addCriterion("road_type1 between", value1, value2, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1NotBetween(String value1, String value2) {
            addCriterion("road_type1 not between", value1, value2, "roadType1");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeIsNull() {
            addCriterion("road_type1_code is null");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeIsNotNull() {
            addCriterion("road_type1_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeEqualTo(String value) {
            addCriterion("road_type1_code =", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeNotEqualTo(String value) {
            addCriterion("road_type1_code <>", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeGreaterThan(String value) {
            addCriterion("road_type1_code >", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("road_type1_code >=", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeLessThan(String value) {
            addCriterion("road_type1_code <", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeLessThanOrEqualTo(String value) {
            addCriterion("road_type1_code <=", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeLike(String value) {
            addCriterion("road_type1_code like", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeNotLike(String value) {
            addCriterion("road_type1_code not like", value, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeIn(List<String> values) {
            addCriterion("road_type1_code in", values, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeNotIn(List<String> values) {
            addCriterion("road_type1_code not in", values, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeBetween(String value1, String value2) {
            addCriterion("road_type1_code between", value1, value2, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadType1CodeNotBetween(String value1, String value2) {
            addCriterion("road_type1_code not between", value1, value2, "roadType1Code");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1IsNull() {
            addCriterion("road_width1 is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1IsNotNull() {
            addCriterion("road_width1 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1EqualTo(BigDecimal value) {
            addCriterion("road_width1 =", value, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1NotEqualTo(BigDecimal value) {
            addCriterion("road_width1 <>", value, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1GreaterThan(BigDecimal value) {
            addCriterion("road_width1 >", value, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width1 >=", value, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1LessThan(BigDecimal value) {
            addCriterion("road_width1 <", value, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width1 <=", value, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1In(List<BigDecimal> values) {
            addCriterion("road_width1 in", values, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1NotIn(List<BigDecimal> values) {
            addCriterion("road_width1 not in", values, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width1 between", value1, value2, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadWidth1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width1 not between", value1, value2, "roadWidth1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1IsNull() {
            addCriterion("road_material1 is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1IsNotNull() {
            addCriterion("road_material1 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1EqualTo(String value) {
            addCriterion("road_material1 =", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1NotEqualTo(String value) {
            addCriterion("road_material1 <>", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1GreaterThan(String value) {
            addCriterion("road_material1 >", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1GreaterThanOrEqualTo(String value) {
            addCriterion("road_material1 >=", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1LessThan(String value) {
            addCriterion("road_material1 <", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1LessThanOrEqualTo(String value) {
            addCriterion("road_material1 <=", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1Like(String value) {
            addCriterion("road_material1 like", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1NotLike(String value) {
            addCriterion("road_material1 not like", value, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1In(List<String> values) {
            addCriterion("road_material1 in", values, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1NotIn(List<String> values) {
            addCriterion("road_material1 not in", values, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1Between(String value1, String value2) {
            addCriterion("road_material1 between", value1, value2, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial1NotBetween(String value1, String value2) {
            addCriterion("road_material1 not between", value1, value2, "roadMaterial1");
            return (Criteria) this;
        }

        public Criteria andRoadName2IsNull() {
            addCriterion("road_name2 is null");
            return (Criteria) this;
        }

        public Criteria andRoadName2IsNotNull() {
            addCriterion("road_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadName2EqualTo(String value) {
            addCriterion("road_name2 =", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2NotEqualTo(String value) {
            addCriterion("road_name2 <>", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2GreaterThan(String value) {
            addCriterion("road_name2 >", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2GreaterThanOrEqualTo(String value) {
            addCriterion("road_name2 >=", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2LessThan(String value) {
            addCriterion("road_name2 <", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2LessThanOrEqualTo(String value) {
            addCriterion("road_name2 <=", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2Like(String value) {
            addCriterion("road_name2 like", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2NotLike(String value) {
            addCriterion("road_name2 not like", value, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2In(List<String> values) {
            addCriterion("road_name2 in", values, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2NotIn(List<String> values) {
            addCriterion("road_name2 not in", values, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2Between(String value1, String value2) {
            addCriterion("road_name2 between", value1, value2, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadName2NotBetween(String value1, String value2) {
            addCriterion("road_name2 not between", value1, value2, "roadName2");
            return (Criteria) this;
        }

        public Criteria andRoadType2IsNull() {
            addCriterion("road_type2 is null");
            return (Criteria) this;
        }

        public Criteria andRoadType2IsNotNull() {
            addCriterion("road_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType2EqualTo(String value) {
            addCriterion("road_type2 =", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2NotEqualTo(String value) {
            addCriterion("road_type2 <>", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2GreaterThan(String value) {
            addCriterion("road_type2 >", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2GreaterThanOrEqualTo(String value) {
            addCriterion("road_type2 >=", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2LessThan(String value) {
            addCriterion("road_type2 <", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2LessThanOrEqualTo(String value) {
            addCriterion("road_type2 <=", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2Like(String value) {
            addCriterion("road_type2 like", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2NotLike(String value) {
            addCriterion("road_type2 not like", value, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2In(List<String> values) {
            addCriterion("road_type2 in", values, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2NotIn(List<String> values) {
            addCriterion("road_type2 not in", values, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2Between(String value1, String value2) {
            addCriterion("road_type2 between", value1, value2, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2NotBetween(String value1, String value2) {
            addCriterion("road_type2 not between", value1, value2, "roadType2");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeIsNull() {
            addCriterion("road_type2_code is null");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeIsNotNull() {
            addCriterion("road_type2_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeEqualTo(String value) {
            addCriterion("road_type2_code =", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeNotEqualTo(String value) {
            addCriterion("road_type2_code <>", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeGreaterThan(String value) {
            addCriterion("road_type2_code >", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("road_type2_code >=", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeLessThan(String value) {
            addCriterion("road_type2_code <", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeLessThanOrEqualTo(String value) {
            addCriterion("road_type2_code <=", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeLike(String value) {
            addCriterion("road_type2_code like", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeNotLike(String value) {
            addCriterion("road_type2_code not like", value, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeIn(List<String> values) {
            addCriterion("road_type2_code in", values, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeNotIn(List<String> values) {
            addCriterion("road_type2_code not in", values, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeBetween(String value1, String value2) {
            addCriterion("road_type2_code between", value1, value2, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadType2CodeNotBetween(String value1, String value2) {
            addCriterion("road_type2_code not between", value1, value2, "roadType2Code");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2IsNull() {
            addCriterion("road_width2 is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2IsNotNull() {
            addCriterion("road_width2 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2EqualTo(BigDecimal value) {
            addCriterion("road_width2 =", value, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2NotEqualTo(BigDecimal value) {
            addCriterion("road_width2 <>", value, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2GreaterThan(BigDecimal value) {
            addCriterion("road_width2 >", value, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width2 >=", value, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2LessThan(BigDecimal value) {
            addCriterion("road_width2 <", value, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width2 <=", value, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2In(List<BigDecimal> values) {
            addCriterion("road_width2 in", values, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2NotIn(List<BigDecimal> values) {
            addCriterion("road_width2 not in", values, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width2 between", value1, value2, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadWidth2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width2 not between", value1, value2, "roadWidth2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2IsNull() {
            addCriterion("road_material2 is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2IsNotNull() {
            addCriterion("road_material2 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2EqualTo(String value) {
            addCriterion("road_material2 =", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2NotEqualTo(String value) {
            addCriterion("road_material2 <>", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2GreaterThan(String value) {
            addCriterion("road_material2 >", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2GreaterThanOrEqualTo(String value) {
            addCriterion("road_material2 >=", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2LessThan(String value) {
            addCriterion("road_material2 <", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2LessThanOrEqualTo(String value) {
            addCriterion("road_material2 <=", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2Like(String value) {
            addCriterion("road_material2 like", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2NotLike(String value) {
            addCriterion("road_material2 not like", value, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2In(List<String> values) {
            addCriterion("road_material2 in", values, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2NotIn(List<String> values) {
            addCriterion("road_material2 not in", values, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2Between(String value1, String value2) {
            addCriterion("road_material2 between", value1, value2, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial2NotBetween(String value1, String value2) {
            addCriterion("road_material2 not between", value1, value2, "roadMaterial2");
            return (Criteria) this;
        }

        public Criteria andRoadName3IsNull() {
            addCriterion("road_name3 is null");
            return (Criteria) this;
        }

        public Criteria andRoadName3IsNotNull() {
            addCriterion("road_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadName3EqualTo(String value) {
            addCriterion("road_name3 =", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3NotEqualTo(String value) {
            addCriterion("road_name3 <>", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3GreaterThan(String value) {
            addCriterion("road_name3 >", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3GreaterThanOrEqualTo(String value) {
            addCriterion("road_name3 >=", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3LessThan(String value) {
            addCriterion("road_name3 <", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3LessThanOrEqualTo(String value) {
            addCriterion("road_name3 <=", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3Like(String value) {
            addCriterion("road_name3 like", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3NotLike(String value) {
            addCriterion("road_name3 not like", value, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3In(List<String> values) {
            addCriterion("road_name3 in", values, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3NotIn(List<String> values) {
            addCriterion("road_name3 not in", values, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3Between(String value1, String value2) {
            addCriterion("road_name3 between", value1, value2, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadName3NotBetween(String value1, String value2) {
            addCriterion("road_name3 not between", value1, value2, "roadName3");
            return (Criteria) this;
        }

        public Criteria andRoadType3IsNull() {
            addCriterion("road_type3 is null");
            return (Criteria) this;
        }

        public Criteria andRoadType3IsNotNull() {
            addCriterion("road_type3 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType3EqualTo(String value) {
            addCriterion("road_type3 =", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3NotEqualTo(String value) {
            addCriterion("road_type3 <>", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3GreaterThan(String value) {
            addCriterion("road_type3 >", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3GreaterThanOrEqualTo(String value) {
            addCriterion("road_type3 >=", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3LessThan(String value) {
            addCriterion("road_type3 <", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3LessThanOrEqualTo(String value) {
            addCriterion("road_type3 <=", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3Like(String value) {
            addCriterion("road_type3 like", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3NotLike(String value) {
            addCriterion("road_type3 not like", value, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3In(List<String> values) {
            addCriterion("road_type3 in", values, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3NotIn(List<String> values) {
            addCriterion("road_type3 not in", values, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3Between(String value1, String value2) {
            addCriterion("road_type3 between", value1, value2, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3NotBetween(String value1, String value2) {
            addCriterion("road_type3 not between", value1, value2, "roadType3");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeIsNull() {
            addCriterion("road_type3_code is null");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeIsNotNull() {
            addCriterion("road_type3_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeEqualTo(String value) {
            addCriterion("road_type3_code =", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeNotEqualTo(String value) {
            addCriterion("road_type3_code <>", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeGreaterThan(String value) {
            addCriterion("road_type3_code >", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("road_type3_code >=", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeLessThan(String value) {
            addCriterion("road_type3_code <", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeLessThanOrEqualTo(String value) {
            addCriterion("road_type3_code <=", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeLike(String value) {
            addCriterion("road_type3_code like", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeNotLike(String value) {
            addCriterion("road_type3_code not like", value, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeIn(List<String> values) {
            addCriterion("road_type3_code in", values, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeNotIn(List<String> values) {
            addCriterion("road_type3_code not in", values, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeBetween(String value1, String value2) {
            addCriterion("road_type3_code between", value1, value2, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadType3CodeNotBetween(String value1, String value2) {
            addCriterion("road_type3_code not between", value1, value2, "roadType3Code");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3IsNull() {
            addCriterion("road_width3 is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3IsNotNull() {
            addCriterion("road_width3 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3EqualTo(BigDecimal value) {
            addCriterion("road_width3 =", value, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3NotEqualTo(BigDecimal value) {
            addCriterion("road_width3 <>", value, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3GreaterThan(BigDecimal value) {
            addCriterion("road_width3 >", value, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width3 >=", value, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3LessThan(BigDecimal value) {
            addCriterion("road_width3 <", value, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width3 <=", value, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3In(List<BigDecimal> values) {
            addCriterion("road_width3 in", values, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3NotIn(List<BigDecimal> values) {
            addCriterion("road_width3 not in", values, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width3 between", value1, value2, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadWidth3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width3 not between", value1, value2, "roadWidth3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3IsNull() {
            addCriterion("road_material3 is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3IsNotNull() {
            addCriterion("road_material3 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3EqualTo(String value) {
            addCriterion("road_material3 =", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3NotEqualTo(String value) {
            addCriterion("road_material3 <>", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3GreaterThan(String value) {
            addCriterion("road_material3 >", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3GreaterThanOrEqualTo(String value) {
            addCriterion("road_material3 >=", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3LessThan(String value) {
            addCriterion("road_material3 <", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3LessThanOrEqualTo(String value) {
            addCriterion("road_material3 <=", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3Like(String value) {
            addCriterion("road_material3 like", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3NotLike(String value) {
            addCriterion("road_material3 not like", value, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3In(List<String> values) {
            addCriterion("road_material3 in", values, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3NotIn(List<String> values) {
            addCriterion("road_material3 not in", values, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3Between(String value1, String value2) {
            addCriterion("road_material3 between", value1, value2, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial3NotBetween(String value1, String value2) {
            addCriterion("road_material3 not between", value1, value2, "roadMaterial3");
            return (Criteria) this;
        }

        public Criteria andRoadName4IsNull() {
            addCriterion("road_name4 is null");
            return (Criteria) this;
        }

        public Criteria andRoadName4IsNotNull() {
            addCriterion("road_name4 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadName4EqualTo(String value) {
            addCriterion("road_name4 =", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4NotEqualTo(String value) {
            addCriterion("road_name4 <>", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4GreaterThan(String value) {
            addCriterion("road_name4 >", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4GreaterThanOrEqualTo(String value) {
            addCriterion("road_name4 >=", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4LessThan(String value) {
            addCriterion("road_name4 <", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4LessThanOrEqualTo(String value) {
            addCriterion("road_name4 <=", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4Like(String value) {
            addCriterion("road_name4 like", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4NotLike(String value) {
            addCriterion("road_name4 not like", value, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4In(List<String> values) {
            addCriterion("road_name4 in", values, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4NotIn(List<String> values) {
            addCriterion("road_name4 not in", values, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4Between(String value1, String value2) {
            addCriterion("road_name4 between", value1, value2, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadName4NotBetween(String value1, String value2) {
            addCriterion("road_name4 not between", value1, value2, "roadName4");
            return (Criteria) this;
        }

        public Criteria andRoadType4IsNull() {
            addCriterion("road_type4 is null");
            return (Criteria) this;
        }

        public Criteria andRoadType4IsNotNull() {
            addCriterion("road_type4 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType4EqualTo(String value) {
            addCriterion("road_type4 =", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4NotEqualTo(String value) {
            addCriterion("road_type4 <>", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4GreaterThan(String value) {
            addCriterion("road_type4 >", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4GreaterThanOrEqualTo(String value) {
            addCriterion("road_type4 >=", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4LessThan(String value) {
            addCriterion("road_type4 <", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4LessThanOrEqualTo(String value) {
            addCriterion("road_type4 <=", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4Like(String value) {
            addCriterion("road_type4 like", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4NotLike(String value) {
            addCriterion("road_type4 not like", value, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4In(List<String> values) {
            addCriterion("road_type4 in", values, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4NotIn(List<String> values) {
            addCriterion("road_type4 not in", values, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4Between(String value1, String value2) {
            addCriterion("road_type4 between", value1, value2, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4NotBetween(String value1, String value2) {
            addCriterion("road_type4 not between", value1, value2, "roadType4");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeIsNull() {
            addCriterion("road_type4_code is null");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeIsNotNull() {
            addCriterion("road_type4_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeEqualTo(String value) {
            addCriterion("road_type4_code =", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeNotEqualTo(String value) {
            addCriterion("road_type4_code <>", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeGreaterThan(String value) {
            addCriterion("road_type4_code >", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeGreaterThanOrEqualTo(String value) {
            addCriterion("road_type4_code >=", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeLessThan(String value) {
            addCriterion("road_type4_code <", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeLessThanOrEqualTo(String value) {
            addCriterion("road_type4_code <=", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeLike(String value) {
            addCriterion("road_type4_code like", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeNotLike(String value) {
            addCriterion("road_type4_code not like", value, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeIn(List<String> values) {
            addCriterion("road_type4_code in", values, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeNotIn(List<String> values) {
            addCriterion("road_type4_code not in", values, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeBetween(String value1, String value2) {
            addCriterion("road_type4_code between", value1, value2, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadType4CodeNotBetween(String value1, String value2) {
            addCriterion("road_type4_code not between", value1, value2, "roadType4Code");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4IsNull() {
            addCriterion("road_width4 is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4IsNotNull() {
            addCriterion("road_width4 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4EqualTo(BigDecimal value) {
            addCriterion("road_width4 =", value, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4NotEqualTo(BigDecimal value) {
            addCriterion("road_width4 <>", value, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4GreaterThan(BigDecimal value) {
            addCriterion("road_width4 >", value, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width4 >=", value, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4LessThan(BigDecimal value) {
            addCriterion("road_width4 <", value, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width4 <=", value, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4In(List<BigDecimal> values) {
            addCriterion("road_width4 in", values, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4NotIn(List<BigDecimal> values) {
            addCriterion("road_width4 not in", values, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width4 between", value1, value2, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadWidth4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width4 not between", value1, value2, "roadWidth4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4IsNull() {
            addCriterion("road_material4 is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4IsNotNull() {
            addCriterion("road_material4 is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4EqualTo(String value) {
            addCriterion("road_material4 =", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4NotEqualTo(String value) {
            addCriterion("road_material4 <>", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4GreaterThan(String value) {
            addCriterion("road_material4 >", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4GreaterThanOrEqualTo(String value) {
            addCriterion("road_material4 >=", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4LessThan(String value) {
            addCriterion("road_material4 <", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4LessThanOrEqualTo(String value) {
            addCriterion("road_material4 <=", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4Like(String value) {
            addCriterion("road_material4 like", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4NotLike(String value) {
            addCriterion("road_material4 not like", value, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4In(List<String> values) {
            addCriterion("road_material4 in", values, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4NotIn(List<String> values) {
            addCriterion("road_material4 not in", values, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4Between(String value1, String value2) {
            addCriterion("road_material4 between", value1, value2, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andRoadMaterial4NotBetween(String value1, String value2) {
            addCriterion("road_material4 not between", value1, value2, "roadMaterial4");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterIsNull() {
            addCriterion("distance_city_center is null");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterIsNotNull() {
            addCriterion("distance_city_center is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterEqualTo(BigDecimal value) {
            addCriterion("distance_city_center =", value, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterNotEqualTo(BigDecimal value) {
            addCriterion("distance_city_center <>", value, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterGreaterThan(BigDecimal value) {
            addCriterion("distance_city_center >", value, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_city_center >=", value, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterLessThan(BigDecimal value) {
            addCriterion("distance_city_center <", value, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_city_center <=", value, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterIn(List<BigDecimal> values) {
            addCriterion("distance_city_center in", values, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterNotIn(List<BigDecimal> values) {
            addCriterion("distance_city_center not in", values, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_city_center between", value1, value2, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCityCenterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_city_center not between", value1, value2, "distanceCityCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterIsNull() {
            addCriterion("distance_county_center is null");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterIsNotNull() {
            addCriterion("distance_county_center is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterEqualTo(BigDecimal value) {
            addCriterion("distance_county_center =", value, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterNotEqualTo(BigDecimal value) {
            addCriterion("distance_county_center <>", value, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterGreaterThan(BigDecimal value) {
            addCriterion("distance_county_center >", value, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_county_center >=", value, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterLessThan(BigDecimal value) {
            addCriterion("distance_county_center <", value, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_county_center <=", value, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterIn(List<BigDecimal> values) {
            addCriterion("distance_county_center in", values, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterNotIn(List<BigDecimal> values) {
            addCriterion("distance_county_center not in", values, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_county_center between", value1, value2, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceCountyCenterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_county_center not between", value1, value2, "distanceCountyCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterIsNull() {
            addCriterion("distance_garden_center is null");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterIsNotNull() {
            addCriterion("distance_garden_center is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterEqualTo(BigDecimal value) {
            addCriterion("distance_garden_center =", value, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterNotEqualTo(BigDecimal value) {
            addCriterion("distance_garden_center <>", value, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterGreaterThan(BigDecimal value) {
            addCriterion("distance_garden_center >", value, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_garden_center >=", value, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterLessThan(BigDecimal value) {
            addCriterion("distance_garden_center <", value, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_garden_center <=", value, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterIn(List<BigDecimal> values) {
            addCriterion("distance_garden_center in", values, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterNotIn(List<BigDecimal> values) {
            addCriterion("distance_garden_center not in", values, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_garden_center between", value1, value2, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andDistanceGardenCenterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_garden_center not between", value1, value2, "distanceGardenCenter");
            return (Criteria) this;
        }

        public Criteria andEastRoadIsNull() {
            addCriterion("east_road is null");
            return (Criteria) this;
        }

        public Criteria andEastRoadIsNotNull() {
            addCriterion("east_road is not null");
            return (Criteria) this;
        }

        public Criteria andEastRoadEqualTo(String value) {
            addCriterion("east_road =", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadNotEqualTo(String value) {
            addCriterion("east_road <>", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadGreaterThan(String value) {
            addCriterion("east_road >", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadGreaterThanOrEqualTo(String value) {
            addCriterion("east_road >=", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadLessThan(String value) {
            addCriterion("east_road <", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadLessThanOrEqualTo(String value) {
            addCriterion("east_road <=", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadLike(String value) {
            addCriterion("east_road like", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadNotLike(String value) {
            addCriterion("east_road not like", value, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadIn(List<String> values) {
            addCriterion("east_road in", values, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadNotIn(List<String> values) {
            addCriterion("east_road not in", values, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadBetween(String value1, String value2) {
            addCriterion("east_road between", value1, value2, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andEastRoadNotBetween(String value1, String value2) {
            addCriterion("east_road not between", value1, value2, "eastRoad");
            return (Criteria) this;
        }

        public Criteria andBelongEastIsNull() {
            addCriterion("belong_east is null");
            return (Criteria) this;
        }

        public Criteria andBelongEastIsNotNull() {
            addCriterion("belong_east is not null");
            return (Criteria) this;
        }

        public Criteria andBelongEastEqualTo(String value) {
            addCriterion("belong_east =", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastNotEqualTo(String value) {
            addCriterion("belong_east <>", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastGreaterThan(String value) {
            addCriterion("belong_east >", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastGreaterThanOrEqualTo(String value) {
            addCriterion("belong_east >=", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastLessThan(String value) {
            addCriterion("belong_east <", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastLessThanOrEqualTo(String value) {
            addCriterion("belong_east <=", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastLike(String value) {
            addCriterion("belong_east like", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastNotLike(String value) {
            addCriterion("belong_east not like", value, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastIn(List<String> values) {
            addCriterion("belong_east in", values, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastNotIn(List<String> values) {
            addCriterion("belong_east not in", values, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastBetween(String value1, String value2) {
            addCriterion("belong_east between", value1, value2, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastNotBetween(String value1, String value2) {
            addCriterion("belong_east not between", value1, value2, "belongEast");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeIsNull() {
            addCriterion("belong_east_code is null");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeIsNotNull() {
            addCriterion("belong_east_code is not null");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeEqualTo(String value) {
            addCriterion("belong_east_code =", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeNotEqualTo(String value) {
            addCriterion("belong_east_code <>", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeGreaterThan(String value) {
            addCriterion("belong_east_code >", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_east_code >=", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeLessThan(String value) {
            addCriterion("belong_east_code <", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeLessThanOrEqualTo(String value) {
            addCriterion("belong_east_code <=", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeLike(String value) {
            addCriterion("belong_east_code like", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeNotLike(String value) {
            addCriterion("belong_east_code not like", value, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeIn(List<String> values) {
            addCriterion("belong_east_code in", values, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeNotIn(List<String> values) {
            addCriterion("belong_east_code not in", values, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeBetween(String value1, String value2) {
            addCriterion("belong_east_code between", value1, value2, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andBelongEastCodeNotBetween(String value1, String value2) {
            addCriterion("belong_east_code not between", value1, value2, "belongEastCode");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastIsNull() {
            addCriterion("road_width_east is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastIsNotNull() {
            addCriterion("road_width_east is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastEqualTo(BigDecimal value) {
            addCriterion("road_width_east =", value, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastNotEqualTo(BigDecimal value) {
            addCriterion("road_width_east <>", value, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastGreaterThan(BigDecimal value) {
            addCriterion("road_width_east >", value, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_east >=", value, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastLessThan(BigDecimal value) {
            addCriterion("road_width_east <", value, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_east <=", value, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastIn(List<BigDecimal> values) {
            addCriterion("road_width_east in", values, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastNotIn(List<BigDecimal> values) {
            addCriterion("road_width_east not in", values, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_east between", value1, value2, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_east not between", value1, value2, "roadWidthEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastIsNull() {
            addCriterion("road_material_east is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastIsNotNull() {
            addCriterion("road_material_east is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastEqualTo(String value) {
            addCriterion("road_material_east =", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastNotEqualTo(String value) {
            addCriterion("road_material_east <>", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastGreaterThan(String value) {
            addCriterion("road_material_east >", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastGreaterThanOrEqualTo(String value) {
            addCriterion("road_material_east >=", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastLessThan(String value) {
            addCriterion("road_material_east <", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastLessThanOrEqualTo(String value) {
            addCriterion("road_material_east <=", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastLike(String value) {
            addCriterion("road_material_east like", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastNotLike(String value) {
            addCriterion("road_material_east not like", value, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastIn(List<String> values) {
            addCriterion("road_material_east in", values, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastNotIn(List<String> values) {
            addCriterion("road_material_east not in", values, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastBetween(String value1, String value2) {
            addCriterion("road_material_east between", value1, value2, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialEastNotBetween(String value1, String value2) {
            addCriterion("road_material_east not between", value1, value2, "roadMaterialEast");
            return (Criteria) this;
        }

        public Criteria andSouthRoadIsNull() {
            addCriterion("south_road is null");
            return (Criteria) this;
        }

        public Criteria andSouthRoadIsNotNull() {
            addCriterion("south_road is not null");
            return (Criteria) this;
        }

        public Criteria andSouthRoadEqualTo(String value) {
            addCriterion("south_road =", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadNotEqualTo(String value) {
            addCriterion("south_road <>", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadGreaterThan(String value) {
            addCriterion("south_road >", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadGreaterThanOrEqualTo(String value) {
            addCriterion("south_road >=", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadLessThan(String value) {
            addCriterion("south_road <", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadLessThanOrEqualTo(String value) {
            addCriterion("south_road <=", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadLike(String value) {
            addCriterion("south_road like", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadNotLike(String value) {
            addCriterion("south_road not like", value, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadIn(List<String> values) {
            addCriterion("south_road in", values, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadNotIn(List<String> values) {
            addCriterion("south_road not in", values, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadBetween(String value1, String value2) {
            addCriterion("south_road between", value1, value2, "southRoad");
            return (Criteria) this;
        }

        public Criteria andSouthRoadNotBetween(String value1, String value2) {
            addCriterion("south_road not between", value1, value2, "southRoad");
            return (Criteria) this;
        }

        public Criteria andBelongSouthIsNull() {
            addCriterion("belong_south is null");
            return (Criteria) this;
        }

        public Criteria andBelongSouthIsNotNull() {
            addCriterion("belong_south is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSouthEqualTo(String value) {
            addCriterion("belong_south =", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthNotEqualTo(String value) {
            addCriterion("belong_south <>", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthGreaterThan(String value) {
            addCriterion("belong_south >", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthGreaterThanOrEqualTo(String value) {
            addCriterion("belong_south >=", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthLessThan(String value) {
            addCriterion("belong_south <", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthLessThanOrEqualTo(String value) {
            addCriterion("belong_south <=", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthLike(String value) {
            addCriterion("belong_south like", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthNotLike(String value) {
            addCriterion("belong_south not like", value, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthIn(List<String> values) {
            addCriterion("belong_south in", values, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthNotIn(List<String> values) {
            addCriterion("belong_south not in", values, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthBetween(String value1, String value2) {
            addCriterion("belong_south between", value1, value2, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthNotBetween(String value1, String value2) {
            addCriterion("belong_south not between", value1, value2, "belongSouth");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeIsNull() {
            addCriterion("belong_south_code is null");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeIsNotNull() {
            addCriterion("belong_south_code is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeEqualTo(String value) {
            addCriterion("belong_south_code =", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeNotEqualTo(String value) {
            addCriterion("belong_south_code <>", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeGreaterThan(String value) {
            addCriterion("belong_south_code >", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_south_code >=", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeLessThan(String value) {
            addCriterion("belong_south_code <", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeLessThanOrEqualTo(String value) {
            addCriterion("belong_south_code <=", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeLike(String value) {
            addCriterion("belong_south_code like", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeNotLike(String value) {
            addCriterion("belong_south_code not like", value, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeIn(List<String> values) {
            addCriterion("belong_south_code in", values, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeNotIn(List<String> values) {
            addCriterion("belong_south_code not in", values, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeBetween(String value1, String value2) {
            addCriterion("belong_south_code between", value1, value2, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andBelongSouthCodeNotBetween(String value1, String value2) {
            addCriterion("belong_south_code not between", value1, value2, "belongSouthCode");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthIsNull() {
            addCriterion("road_width_south is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthIsNotNull() {
            addCriterion("road_width_south is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthEqualTo(BigDecimal value) {
            addCriterion("road_width_south =", value, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthNotEqualTo(BigDecimal value) {
            addCriterion("road_width_south <>", value, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthGreaterThan(BigDecimal value) {
            addCriterion("road_width_south >", value, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_south >=", value, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthLessThan(BigDecimal value) {
            addCriterion("road_width_south <", value, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_south <=", value, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthIn(List<BigDecimal> values) {
            addCriterion("road_width_south in", values, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthNotIn(List<BigDecimal> values) {
            addCriterion("road_width_south not in", values, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_south between", value1, value2, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthSouthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_south not between", value1, value2, "roadWidthSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthIsNull() {
            addCriterion("road_material_south is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthIsNotNull() {
            addCriterion("road_material_south is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthEqualTo(String value) {
            addCriterion("road_material_south =", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthNotEqualTo(String value) {
            addCriterion("road_material_south <>", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthGreaterThan(String value) {
            addCriterion("road_material_south >", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthGreaterThanOrEqualTo(String value) {
            addCriterion("road_material_south >=", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthLessThan(String value) {
            addCriterion("road_material_south <", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthLessThanOrEqualTo(String value) {
            addCriterion("road_material_south <=", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthLike(String value) {
            addCriterion("road_material_south like", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthNotLike(String value) {
            addCriterion("road_material_south not like", value, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthIn(List<String> values) {
            addCriterion("road_material_south in", values, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthNotIn(List<String> values) {
            addCriterion("road_material_south not in", values, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthBetween(String value1, String value2) {
            addCriterion("road_material_south between", value1, value2, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialSouthNotBetween(String value1, String value2) {
            addCriterion("road_material_south not between", value1, value2, "roadMaterialSouth");
            return (Criteria) this;
        }

        public Criteria andWestRoadIsNull() {
            addCriterion("west_road is null");
            return (Criteria) this;
        }

        public Criteria andWestRoadIsNotNull() {
            addCriterion("west_road is not null");
            return (Criteria) this;
        }

        public Criteria andWestRoadEqualTo(String value) {
            addCriterion("west_road =", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadNotEqualTo(String value) {
            addCriterion("west_road <>", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadGreaterThan(String value) {
            addCriterion("west_road >", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadGreaterThanOrEqualTo(String value) {
            addCriterion("west_road >=", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadLessThan(String value) {
            addCriterion("west_road <", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadLessThanOrEqualTo(String value) {
            addCriterion("west_road <=", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadLike(String value) {
            addCriterion("west_road like", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadNotLike(String value) {
            addCriterion("west_road not like", value, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadIn(List<String> values) {
            addCriterion("west_road in", values, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadNotIn(List<String> values) {
            addCriterion("west_road not in", values, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadBetween(String value1, String value2) {
            addCriterion("west_road between", value1, value2, "westRoad");
            return (Criteria) this;
        }

        public Criteria andWestRoadNotBetween(String value1, String value2) {
            addCriterion("west_road not between", value1, value2, "westRoad");
            return (Criteria) this;
        }

        public Criteria andBelongWestIsNull() {
            addCriterion("belong_west is null");
            return (Criteria) this;
        }

        public Criteria andBelongWestIsNotNull() {
            addCriterion("belong_west is not null");
            return (Criteria) this;
        }

        public Criteria andBelongWestEqualTo(String value) {
            addCriterion("belong_west =", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestNotEqualTo(String value) {
            addCriterion("belong_west <>", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestGreaterThan(String value) {
            addCriterion("belong_west >", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestGreaterThanOrEqualTo(String value) {
            addCriterion("belong_west >=", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestLessThan(String value) {
            addCriterion("belong_west <", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestLessThanOrEqualTo(String value) {
            addCriterion("belong_west <=", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestLike(String value) {
            addCriterion("belong_west like", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestNotLike(String value) {
            addCriterion("belong_west not like", value, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestIn(List<String> values) {
            addCriterion("belong_west in", values, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestNotIn(List<String> values) {
            addCriterion("belong_west not in", values, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestBetween(String value1, String value2) {
            addCriterion("belong_west between", value1, value2, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestNotBetween(String value1, String value2) {
            addCriterion("belong_west not between", value1, value2, "belongWest");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeIsNull() {
            addCriterion("belong_west_code is null");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeIsNotNull() {
            addCriterion("belong_west_code is not null");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeEqualTo(String value) {
            addCriterion("belong_west_code =", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeNotEqualTo(String value) {
            addCriterion("belong_west_code <>", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeGreaterThan(String value) {
            addCriterion("belong_west_code >", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_west_code >=", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeLessThan(String value) {
            addCriterion("belong_west_code <", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeLessThanOrEqualTo(String value) {
            addCriterion("belong_west_code <=", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeLike(String value) {
            addCriterion("belong_west_code like", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeNotLike(String value) {
            addCriterion("belong_west_code not like", value, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeIn(List<String> values) {
            addCriterion("belong_west_code in", values, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeNotIn(List<String> values) {
            addCriterion("belong_west_code not in", values, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeBetween(String value1, String value2) {
            addCriterion("belong_west_code between", value1, value2, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andBelongWestCodeNotBetween(String value1, String value2) {
            addCriterion("belong_west_code not between", value1, value2, "belongWestCode");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestIsNull() {
            addCriterion("road_width_west is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestIsNotNull() {
            addCriterion("road_width_west is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestEqualTo(BigDecimal value) {
            addCriterion("road_width_west =", value, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestNotEqualTo(BigDecimal value) {
            addCriterion("road_width_west <>", value, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestGreaterThan(BigDecimal value) {
            addCriterion("road_width_west >", value, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_west >=", value, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestLessThan(BigDecimal value) {
            addCriterion("road_width_west <", value, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_west <=", value, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestIn(List<BigDecimal> values) {
            addCriterion("road_width_west in", values, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestNotIn(List<BigDecimal> values) {
            addCriterion("road_width_west not in", values, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_west between", value1, value2, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadWidthWestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_west not between", value1, value2, "roadWidthWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestIsNull() {
            addCriterion("road_material_west is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestIsNotNull() {
            addCriterion("road_material_west is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestEqualTo(String value) {
            addCriterion("road_material_west =", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestNotEqualTo(String value) {
            addCriterion("road_material_west <>", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestGreaterThan(String value) {
            addCriterion("road_material_west >", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestGreaterThanOrEqualTo(String value) {
            addCriterion("road_material_west >=", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestLessThan(String value) {
            addCriterion("road_material_west <", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestLessThanOrEqualTo(String value) {
            addCriterion("road_material_west <=", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestLike(String value) {
            addCriterion("road_material_west like", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestNotLike(String value) {
            addCriterion("road_material_west not like", value, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestIn(List<String> values) {
            addCriterion("road_material_west in", values, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestNotIn(List<String> values) {
            addCriterion("road_material_west not in", values, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestBetween(String value1, String value2) {
            addCriterion("road_material_west between", value1, value2, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialWestNotBetween(String value1, String value2) {
            addCriterion("road_material_west not between", value1, value2, "roadMaterialWest");
            return (Criteria) this;
        }

        public Criteria andNorthRoadIsNull() {
            addCriterion("north_road is null");
            return (Criteria) this;
        }

        public Criteria andNorthRoadIsNotNull() {
            addCriterion("north_road is not null");
            return (Criteria) this;
        }

        public Criteria andNorthRoadEqualTo(String value) {
            addCriterion("north_road =", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadNotEqualTo(String value) {
            addCriterion("north_road <>", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadGreaterThan(String value) {
            addCriterion("north_road >", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadGreaterThanOrEqualTo(String value) {
            addCriterion("north_road >=", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadLessThan(String value) {
            addCriterion("north_road <", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadLessThanOrEqualTo(String value) {
            addCriterion("north_road <=", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadLike(String value) {
            addCriterion("north_road like", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadNotLike(String value) {
            addCriterion("north_road not like", value, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadIn(List<String> values) {
            addCriterion("north_road in", values, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadNotIn(List<String> values) {
            addCriterion("north_road not in", values, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadBetween(String value1, String value2) {
            addCriterion("north_road between", value1, value2, "northRoad");
            return (Criteria) this;
        }

        public Criteria andNorthRoadNotBetween(String value1, String value2) {
            addCriterion("north_road not between", value1, value2, "northRoad");
            return (Criteria) this;
        }

        public Criteria andBelongNorthIsNull() {
            addCriterion("belong_north is null");
            return (Criteria) this;
        }

        public Criteria andBelongNorthIsNotNull() {
            addCriterion("belong_north is not null");
            return (Criteria) this;
        }

        public Criteria andBelongNorthEqualTo(String value) {
            addCriterion("belong_north =", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthNotEqualTo(String value) {
            addCriterion("belong_north <>", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthGreaterThan(String value) {
            addCriterion("belong_north >", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthGreaterThanOrEqualTo(String value) {
            addCriterion("belong_north >=", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthLessThan(String value) {
            addCriterion("belong_north <", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthLessThanOrEqualTo(String value) {
            addCriterion("belong_north <=", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthLike(String value) {
            addCriterion("belong_north like", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthNotLike(String value) {
            addCriterion("belong_north not like", value, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthIn(List<String> values) {
            addCriterion("belong_north in", values, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthNotIn(List<String> values) {
            addCriterion("belong_north not in", values, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthBetween(String value1, String value2) {
            addCriterion("belong_north between", value1, value2, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthNotBetween(String value1, String value2) {
            addCriterion("belong_north not between", value1, value2, "belongNorth");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeIsNull() {
            addCriterion("belong_north_code is null");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeIsNotNull() {
            addCriterion("belong_north_code is not null");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeEqualTo(String value) {
            addCriterion("belong_north_code =", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeNotEqualTo(String value) {
            addCriterion("belong_north_code <>", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeGreaterThan(String value) {
            addCriterion("belong_north_code >", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_north_code >=", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeLessThan(String value) {
            addCriterion("belong_north_code <", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeLessThanOrEqualTo(String value) {
            addCriterion("belong_north_code <=", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeLike(String value) {
            addCriterion("belong_north_code like", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeNotLike(String value) {
            addCriterion("belong_north_code not like", value, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeIn(List<String> values) {
            addCriterion("belong_north_code in", values, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeNotIn(List<String> values) {
            addCriterion("belong_north_code not in", values, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeBetween(String value1, String value2) {
            addCriterion("belong_north_code between", value1, value2, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andBelongNorthCodeNotBetween(String value1, String value2) {
            addCriterion("belong_north_code not between", value1, value2, "belongNorthCode");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthIsNull() {
            addCriterion("road_width_north is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthIsNotNull() {
            addCriterion("road_width_north is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthEqualTo(BigDecimal value) {
            addCriterion("road_width_north =", value, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthNotEqualTo(BigDecimal value) {
            addCriterion("road_width_north <>", value, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthGreaterThan(BigDecimal value) {
            addCriterion("road_width_north >", value, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_north >=", value, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthLessThan(BigDecimal value) {
            addCriterion("road_width_north <", value, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("road_width_north <=", value, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthIn(List<BigDecimal> values) {
            addCriterion("road_width_north in", values, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthNotIn(List<BigDecimal> values) {
            addCriterion("road_width_north not in", values, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_north between", value1, value2, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNorthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("road_width_north not between", value1, value2, "roadWidthNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthIsNull() {
            addCriterion("road_material_north is null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthIsNotNull() {
            addCriterion("road_material_north is not null");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthEqualTo(String value) {
            addCriterion("road_material_north =", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthNotEqualTo(String value) {
            addCriterion("road_material_north <>", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthGreaterThan(String value) {
            addCriterion("road_material_north >", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthGreaterThanOrEqualTo(String value) {
            addCriterion("road_material_north >=", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthLessThan(String value) {
            addCriterion("road_material_north <", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthLessThanOrEqualTo(String value) {
            addCriterion("road_material_north <=", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthLike(String value) {
            addCriterion("road_material_north like", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthNotLike(String value) {
            addCriterion("road_material_north not like", value, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthIn(List<String> values) {
            addCriterion("road_material_north in", values, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthNotIn(List<String> values) {
            addCriterion("road_material_north not in", values, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthBetween(String value1, String value2) {
            addCriterion("road_material_north between", value1, value2, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andRoadMaterialNorthNotBetween(String value1, String value2) {
            addCriterion("road_material_north not between", value1, value2, "roadMaterialNorth");
            return (Criteria) this;
        }

        public Criteria andBusLinesIsNull() {
            addCriterion("bus_lines is null");
            return (Criteria) this;
        }

        public Criteria andBusLinesIsNotNull() {
            addCriterion("bus_lines is not null");
            return (Criteria) this;
        }

        public Criteria andBusLinesEqualTo(String value) {
            addCriterion("bus_lines =", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesNotEqualTo(String value) {
            addCriterion("bus_lines <>", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesGreaterThan(String value) {
            addCriterion("bus_lines >", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesGreaterThanOrEqualTo(String value) {
            addCriterion("bus_lines >=", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesLessThan(String value) {
            addCriterion("bus_lines <", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesLessThanOrEqualTo(String value) {
            addCriterion("bus_lines <=", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesLike(String value) {
            addCriterion("bus_lines like", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesNotLike(String value) {
            addCriterion("bus_lines not like", value, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesIn(List<String> values) {
            addCriterion("bus_lines in", values, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesNotIn(List<String> values) {
            addCriterion("bus_lines not in", values, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesBetween(String value1, String value2) {
            addCriterion("bus_lines between", value1, value2, "busLines");
            return (Criteria) this;
        }

        public Criteria andBusLinesNotBetween(String value1, String value2) {
            addCriterion("bus_lines not between", value1, value2, "busLines");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationIsNull() {
            addCriterion("distance_bus_station is null");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationIsNotNull() {
            addCriterion("distance_bus_station is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationEqualTo(BigDecimal value) {
            addCriterion("distance_bus_station =", value, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationNotEqualTo(BigDecimal value) {
            addCriterion("distance_bus_station <>", value, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationGreaterThan(BigDecimal value) {
            addCriterion("distance_bus_station >", value, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_bus_station >=", value, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationLessThan(BigDecimal value) {
            addCriterion("distance_bus_station <", value, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_bus_station <=", value, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationIn(List<BigDecimal> values) {
            addCriterion("distance_bus_station in", values, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationNotIn(List<BigDecimal> values) {
            addCriterion("distance_bus_station not in", values, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_bus_station between", value1, value2, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andDistanceBusStationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_bus_station not between", value1, value2, "distanceBusStation");
            return (Criteria) this;
        }

        public Criteria andCarStationIsNull() {
            addCriterion("car_station is null");
            return (Criteria) this;
        }

        public Criteria andCarStationIsNotNull() {
            addCriterion("car_station is not null");
            return (Criteria) this;
        }

        public Criteria andCarStationEqualTo(String value) {
            addCriterion("car_station =", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationNotEqualTo(String value) {
            addCriterion("car_station <>", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationGreaterThan(String value) {
            addCriterion("car_station >", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationGreaterThanOrEqualTo(String value) {
            addCriterion("car_station >=", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationLessThan(String value) {
            addCriterion("car_station <", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationLessThanOrEqualTo(String value) {
            addCriterion("car_station <=", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationLike(String value) {
            addCriterion("car_station like", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationNotLike(String value) {
            addCriterion("car_station not like", value, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationIn(List<String> values) {
            addCriterion("car_station in", values, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationNotIn(List<String> values) {
            addCriterion("car_station not in", values, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationBetween(String value1, String value2) {
            addCriterion("car_station between", value1, value2, "carStation");
            return (Criteria) this;
        }

        public Criteria andCarStationNotBetween(String value1, String value2) {
            addCriterion("car_station not between", value1, value2, "carStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationIsNull() {
            addCriterion("distance_car_station is null");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationIsNotNull() {
            addCriterion("distance_car_station is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationEqualTo(BigDecimal value) {
            addCriterion("distance_car_station =", value, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationNotEqualTo(BigDecimal value) {
            addCriterion("distance_car_station <>", value, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationGreaterThan(BigDecimal value) {
            addCriterion("distance_car_station >", value, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_car_station >=", value, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationLessThan(BigDecimal value) {
            addCriterion("distance_car_station <", value, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_car_station <=", value, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationIn(List<BigDecimal> values) {
            addCriterion("distance_car_station in", values, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationNotIn(List<BigDecimal> values) {
            addCriterion("distance_car_station not in", values, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_car_station between", value1, value2, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andDistanceCarStationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_car_station not between", value1, value2, "distanceCarStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationIsNull() {
            addCriterion("train_station is null");
            return (Criteria) this;
        }

        public Criteria andTrainStationIsNotNull() {
            addCriterion("train_station is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStationEqualTo(String value) {
            addCriterion("train_station =", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotEqualTo(String value) {
            addCriterion("train_station <>", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationGreaterThan(String value) {
            addCriterion("train_station >", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationGreaterThanOrEqualTo(String value) {
            addCriterion("train_station >=", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationLessThan(String value) {
            addCriterion("train_station <", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationLessThanOrEqualTo(String value) {
            addCriterion("train_station <=", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationLike(String value) {
            addCriterion("train_station like", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotLike(String value) {
            addCriterion("train_station not like", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationIn(List<String> values) {
            addCriterion("train_station in", values, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotIn(List<String> values) {
            addCriterion("train_station not in", values, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationBetween(String value1, String value2) {
            addCriterion("train_station between", value1, value2, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotBetween(String value1, String value2) {
            addCriterion("train_station not between", value1, value2, "trainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationIsNull() {
            addCriterion("distance_train_station is null");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationIsNotNull() {
            addCriterion("distance_train_station is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationEqualTo(BigDecimal value) {
            addCriterion("distance_train_station =", value, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationNotEqualTo(BigDecimal value) {
            addCriterion("distance_train_station <>", value, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationGreaterThan(BigDecimal value) {
            addCriterion("distance_train_station >", value, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_train_station >=", value, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationLessThan(BigDecimal value) {
            addCriterion("distance_train_station <", value, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_train_station <=", value, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationIn(List<BigDecimal> values) {
            addCriterion("distance_train_station in", values, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationNotIn(List<BigDecimal> values) {
            addCriterion("distance_train_station not in", values, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_train_station between", value1, value2, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andDistanceTrainStationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_train_station not between", value1, value2, "distanceTrainStation");
            return (Criteria) this;
        }

        public Criteria andAirportIsNull() {
            addCriterion("airport is null");
            return (Criteria) this;
        }

        public Criteria andAirportIsNotNull() {
            addCriterion("airport is not null");
            return (Criteria) this;
        }

        public Criteria andAirportEqualTo(String value) {
            addCriterion("airport =", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportNotEqualTo(String value) {
            addCriterion("airport <>", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportGreaterThan(String value) {
            addCriterion("airport >", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportGreaterThanOrEqualTo(String value) {
            addCriterion("airport >=", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportLessThan(String value) {
            addCriterion("airport <", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportLessThanOrEqualTo(String value) {
            addCriterion("airport <=", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportLike(String value) {
            addCriterion("airport like", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportNotLike(String value) {
            addCriterion("airport not like", value, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportIn(List<String> values) {
            addCriterion("airport in", values, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportNotIn(List<String> values) {
            addCriterion("airport not in", values, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportBetween(String value1, String value2) {
            addCriterion("airport between", value1, value2, "airport");
            return (Criteria) this;
        }

        public Criteria andAirportNotBetween(String value1, String value2) {
            addCriterion("airport not between", value1, value2, "airport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportIsNull() {
            addCriterion("distance_airport is null");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportIsNotNull() {
            addCriterion("distance_airport is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportEqualTo(BigDecimal value) {
            addCriterion("distance_airport =", value, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportNotEqualTo(BigDecimal value) {
            addCriterion("distance_airport <>", value, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportGreaterThan(BigDecimal value) {
            addCriterion("distance_airport >", value, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_airport >=", value, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportLessThan(BigDecimal value) {
            addCriterion("distance_airport <", value, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance_airport <=", value, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportIn(List<BigDecimal> values) {
            addCriterion("distance_airport in", values, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportNotIn(List<BigDecimal> values) {
            addCriterion("distance_airport not in", values, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_airport between", value1, value2, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andDistanceAirportNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance_airport not between", value1, value2, "distanceAirport");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesIsNull() {
            addCriterion("nearby_facilities is null");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesIsNotNull() {
            addCriterion("nearby_facilities is not null");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesEqualTo(String value) {
            addCriterion("nearby_facilities =", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesNotEqualTo(String value) {
            addCriterion("nearby_facilities <>", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesGreaterThan(String value) {
            addCriterion("nearby_facilities >", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("nearby_facilities >=", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesLessThan(String value) {
            addCriterion("nearby_facilities <", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("nearby_facilities <=", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesLike(String value) {
            addCriterion("nearby_facilities like", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesNotLike(String value) {
            addCriterion("nearby_facilities not like", value, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesIn(List<String> values) {
            addCriterion("nearby_facilities in", values, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesNotIn(List<String> values) {
            addCriterion("nearby_facilities not in", values, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesBetween(String value1, String value2) {
            addCriterion("nearby_facilities between", value1, value2, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andNearbyFacilitiesNotBetween(String value1, String value2) {
            addCriterion("nearby_facilities not between", value1, value2, "nearbyFacilities");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesIsNull() {
            addCriterion("polluting_enterprises is null");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesIsNotNull() {
            addCriterion("polluting_enterprises is not null");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesEqualTo(String value) {
            addCriterion("polluting_enterprises =", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesNotEqualTo(String value) {
            addCriterion("polluting_enterprises <>", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesGreaterThan(String value) {
            addCriterion("polluting_enterprises >", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesGreaterThanOrEqualTo(String value) {
            addCriterion("polluting_enterprises >=", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesLessThan(String value) {
            addCriterion("polluting_enterprises <", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesLessThanOrEqualTo(String value) {
            addCriterion("polluting_enterprises <=", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesLike(String value) {
            addCriterion("polluting_enterprises like", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesNotLike(String value) {
            addCriterion("polluting_enterprises not like", value, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesIn(List<String> values) {
            addCriterion("polluting_enterprises in", values, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesNotIn(List<String> values) {
            addCriterion("polluting_enterprises not in", values, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesBetween(String value1, String value2) {
            addCriterion("polluting_enterprises between", value1, value2, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesNotBetween(String value1, String value2) {
            addCriterion("polluting_enterprises not between", value1, value2, "pollutingEnterprises");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeIsNull() {
            addCriterion("polluting_enterprises_code is null");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeIsNotNull() {
            addCriterion("polluting_enterprises_code is not null");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeEqualTo(String value) {
            addCriterion("polluting_enterprises_code =", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeNotEqualTo(String value) {
            addCriterion("polluting_enterprises_code <>", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeGreaterThan(String value) {
            addCriterion("polluting_enterprises_code >", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("polluting_enterprises_code >=", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeLessThan(String value) {
            addCriterion("polluting_enterprises_code <", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeLessThanOrEqualTo(String value) {
            addCriterion("polluting_enterprises_code <=", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeLike(String value) {
            addCriterion("polluting_enterprises_code like", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeNotLike(String value) {
            addCriterion("polluting_enterprises_code not like", value, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeIn(List<String> values) {
            addCriterion("polluting_enterprises_code in", values, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeNotIn(List<String> values) {
            addCriterion("polluting_enterprises_code not in", values, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeBetween(String value1, String value2) {
            addCriterion("polluting_enterprises_code between", value1, value2, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPollutingEnterprisesCodeNotBetween(String value1, String value2) {
            addCriterion("polluting_enterprises_code not between", value1, value2, "pollutingEnterprisesCode");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceIsNull() {
            addCriterion("pollute_source is null");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceIsNotNull() {
            addCriterion("pollute_source is not null");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceEqualTo(String value) {
            addCriterion("pollute_source =", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceNotEqualTo(String value) {
            addCriterion("pollute_source <>", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceGreaterThan(String value) {
            addCriterion("pollute_source >", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceGreaterThanOrEqualTo(String value) {
            addCriterion("pollute_source >=", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceLessThan(String value) {
            addCriterion("pollute_source <", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceLessThanOrEqualTo(String value) {
            addCriterion("pollute_source <=", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceLike(String value) {
            addCriterion("pollute_source like", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceNotLike(String value) {
            addCriterion("pollute_source not like", value, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceIn(List<String> values) {
            addCriterion("pollute_source in", values, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceNotIn(List<String> values) {
            addCriterion("pollute_source not in", values, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceBetween(String value1, String value2) {
            addCriterion("pollute_source between", value1, value2, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceNotBetween(String value1, String value2) {
            addCriterion("pollute_source not between", value1, value2, "polluteSource");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherIsNull() {
            addCriterion("pollute_source_other is null");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherIsNotNull() {
            addCriterion("pollute_source_other is not null");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherEqualTo(String value) {
            addCriterion("pollute_source_other =", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherNotEqualTo(String value) {
            addCriterion("pollute_source_other <>", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherGreaterThan(String value) {
            addCriterion("pollute_source_other >", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherGreaterThanOrEqualTo(String value) {
            addCriterion("pollute_source_other >=", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherLessThan(String value) {
            addCriterion("pollute_source_other <", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherLessThanOrEqualTo(String value) {
            addCriterion("pollute_source_other <=", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherLike(String value) {
            addCriterion("pollute_source_other like", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherNotLike(String value) {
            addCriterion("pollute_source_other not like", value, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherIn(List<String> values) {
            addCriterion("pollute_source_other in", values, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherNotIn(List<String> values) {
            addCriterion("pollute_source_other not in", values, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherBetween(String value1, String value2) {
            addCriterion("pollute_source_other between", value1, value2, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andPolluteSourceOtherNotBetween(String value1, String value2) {
            addCriterion("pollute_source_other not between", value1, value2, "polluteSourceOther");
            return (Criteria) this;
        }

        public Criteria andSoilTextureIsNull() {
            addCriterion("soil_texture is null");
            return (Criteria) this;
        }

        public Criteria andSoilTextureIsNotNull() {
            addCriterion("soil_texture is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTextureEqualTo(String value) {
            addCriterion("soil_texture =", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureNotEqualTo(String value) {
            addCriterion("soil_texture <>", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureGreaterThan(String value) {
            addCriterion("soil_texture >", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureGreaterThanOrEqualTo(String value) {
            addCriterion("soil_texture >=", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureLessThan(String value) {
            addCriterion("soil_texture <", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureLessThanOrEqualTo(String value) {
            addCriterion("soil_texture <=", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureLike(String value) {
            addCriterion("soil_texture like", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureNotLike(String value) {
            addCriterion("soil_texture not like", value, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureIn(List<String> values) {
            addCriterion("soil_texture in", values, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureNotIn(List<String> values) {
            addCriterion("soil_texture not in", values, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureBetween(String value1, String value2) {
            addCriterion("soil_texture between", value1, value2, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureNotBetween(String value1, String value2) {
            addCriterion("soil_texture not between", value1, value2, "soilTexture");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeIsNull() {
            addCriterion("soil_texture_code is null");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeIsNotNull() {
            addCriterion("soil_texture_code is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeEqualTo(String value) {
            addCriterion("soil_texture_code =", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeNotEqualTo(String value) {
            addCriterion("soil_texture_code <>", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeGreaterThan(String value) {
            addCriterion("soil_texture_code >", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("soil_texture_code >=", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeLessThan(String value) {
            addCriterion("soil_texture_code <", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeLessThanOrEqualTo(String value) {
            addCriterion("soil_texture_code <=", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeLike(String value) {
            addCriterion("soil_texture_code like", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeNotLike(String value) {
            addCriterion("soil_texture_code not like", value, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeIn(List<String> values) {
            addCriterion("soil_texture_code in", values, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeNotIn(List<String> values) {
            addCriterion("soil_texture_code not in", values, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeBetween(String value1, String value2) {
            addCriterion("soil_texture_code between", value1, value2, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andSoilTextureCodeNotBetween(String value1, String value2) {
            addCriterion("soil_texture_code not between", value1, value2, "soilTextureCode");
            return (Criteria) this;
        }

        public Criteria andKpaIsNull() {
            addCriterion("kpa is null");
            return (Criteria) this;
        }

        public Criteria andKpaIsNotNull() {
            addCriterion("kpa is not null");
            return (Criteria) this;
        }

        public Criteria andKpaEqualTo(BigDecimal value) {
            addCriterion("kpa =", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaNotEqualTo(BigDecimal value) {
            addCriterion("kpa <>", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaGreaterThan(BigDecimal value) {
            addCriterion("kpa >", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kpa >=", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaLessThan(BigDecimal value) {
            addCriterion("kpa <", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kpa <=", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaIn(List<BigDecimal> values) {
            addCriterion("kpa in", values, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaNotIn(List<BigDecimal> values) {
            addCriterion("kpa not in", values, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kpa between", value1, value2, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kpa not between", value1, value2, "kpa");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionIsNull() {
            addCriterion("damage_statution is null");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionIsNotNull() {
            addCriterion("damage_statution is not null");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionEqualTo(String value) {
            addCriterion("damage_statution =", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionNotEqualTo(String value) {
            addCriterion("damage_statution <>", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionGreaterThan(String value) {
            addCriterion("damage_statution >", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionGreaterThanOrEqualTo(String value) {
            addCriterion("damage_statution >=", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionLessThan(String value) {
            addCriterion("damage_statution <", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionLessThanOrEqualTo(String value) {
            addCriterion("damage_statution <=", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionLike(String value) {
            addCriterion("damage_statution like", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionNotLike(String value) {
            addCriterion("damage_statution not like", value, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionIn(List<String> values) {
            addCriterion("damage_statution in", values, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionNotIn(List<String> values) {
            addCriterion("damage_statution not in", values, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionBetween(String value1, String value2) {
            addCriterion("damage_statution between", value1, value2, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionNotBetween(String value1, String value2) {
            addCriterion("damage_statution not between", value1, value2, "damageStatution");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherIsNull() {
            addCriterion("damage_statution_other is null");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherIsNotNull() {
            addCriterion("damage_statution_other is not null");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherEqualTo(String value) {
            addCriterion("damage_statution_other =", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherNotEqualTo(String value) {
            addCriterion("damage_statution_other <>", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherGreaterThan(String value) {
            addCriterion("damage_statution_other >", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherGreaterThanOrEqualTo(String value) {
            addCriterion("damage_statution_other >=", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherLessThan(String value) {
            addCriterion("damage_statution_other <", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherLessThanOrEqualTo(String value) {
            addCriterion("damage_statution_other <=", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherLike(String value) {
            addCriterion("damage_statution_other like", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherNotLike(String value) {
            addCriterion("damage_statution_other not like", value, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherIn(List<String> values) {
            addCriterion("damage_statution_other in", values, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherNotIn(List<String> values) {
            addCriterion("damage_statution_other not in", values, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherBetween(String value1, String value2) {
            addCriterion("damage_statution_other between", value1, value2, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andDamageStatutionOtherNotBetween(String value1, String value2) {
            addCriterion("damage_statution_other not between", value1, value2, "damageStatutionOther");
            return (Criteria) this;
        }

        public Criteria andPlanLimitIsNull() {
            addCriterion("plan_limit is null");
            return (Criteria) this;
        }

        public Criteria andPlanLimitIsNotNull() {
            addCriterion("plan_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPlanLimitEqualTo(String value) {
            addCriterion("plan_limit =", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitNotEqualTo(String value) {
            addCriterion("plan_limit <>", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitGreaterThan(String value) {
            addCriterion("plan_limit >", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitGreaterThanOrEqualTo(String value) {
            addCriterion("plan_limit >=", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitLessThan(String value) {
            addCriterion("plan_limit <", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitLessThanOrEqualTo(String value) {
            addCriterion("plan_limit <=", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitLike(String value) {
            addCriterion("plan_limit like", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitNotLike(String value) {
            addCriterion("plan_limit not like", value, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitIn(List<String> values) {
            addCriterion("plan_limit in", values, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitNotIn(List<String> values) {
            addCriterion("plan_limit not in", values, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitBetween(String value1, String value2) {
            addCriterion("plan_limit between", value1, value2, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitNotBetween(String value1, String value2) {
            addCriterion("plan_limit not between", value1, value2, "planLimit");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeIsNull() {
            addCriterion("plan_limit_code is null");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeIsNotNull() {
            addCriterion("plan_limit_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeEqualTo(String value) {
            addCriterion("plan_limit_code =", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeNotEqualTo(String value) {
            addCriterion("plan_limit_code <>", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeGreaterThan(String value) {
            addCriterion("plan_limit_code >", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_limit_code >=", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeLessThan(String value) {
            addCriterion("plan_limit_code <", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeLessThanOrEqualTo(String value) {
            addCriterion("plan_limit_code <=", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeLike(String value) {
            addCriterion("plan_limit_code like", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeNotLike(String value) {
            addCriterion("plan_limit_code not like", value, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeIn(List<String> values) {
            addCriterion("plan_limit_code in", values, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeNotIn(List<String> values) {
            addCriterion("plan_limit_code not in", values, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeBetween(String value1, String value2) {
            addCriterion("plan_limit_code between", value1, value2, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlanLimitCodeNotBetween(String value1, String value2) {
            addCriterion("plan_limit_code not between", value1, value2, "planLimitCode");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIsNull() {
            addCriterion("plot_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIsNotNull() {
            addCriterion("plot_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPlotRatioEqualTo(BigDecimal value) {
            addCriterion("plot_ratio =", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotEqualTo(BigDecimal value) {
            addCriterion("plot_ratio <>", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioGreaterThan(BigDecimal value) {
            addCriterion("plot_ratio >", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plot_ratio >=", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioLessThan(BigDecimal value) {
            addCriterion("plot_ratio <", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plot_ratio <=", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIn(List<BigDecimal> values) {
            addCriterion("plot_ratio in", values, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotIn(List<BigDecimal> values) {
            addCriterion("plot_ratio not in", values, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plot_ratio between", value1, value2, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plot_ratio not between", value1, value2, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andAccessStateIsNull() {
            addCriterion("access_state is null");
            return (Criteria) this;
        }

        public Criteria andAccessStateIsNotNull() {
            addCriterion("access_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccessStateEqualTo(String value) {
            addCriterion("access_state =", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateNotEqualTo(String value) {
            addCriterion("access_state <>", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateGreaterThan(String value) {
            addCriterion("access_state >", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateGreaterThanOrEqualTo(String value) {
            addCriterion("access_state >=", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateLessThan(String value) {
            addCriterion("access_state <", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateLessThanOrEqualTo(String value) {
            addCriterion("access_state <=", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateLike(String value) {
            addCriterion("access_state like", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateNotLike(String value) {
            addCriterion("access_state not like", value, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateIn(List<String> values) {
            addCriterion("access_state in", values, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateNotIn(List<String> values) {
            addCriterion("access_state not in", values, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateBetween(String value1, String value2) {
            addCriterion("access_state between", value1, value2, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateNotBetween(String value1, String value2) {
            addCriterion("access_state not between", value1, value2, "accessState");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeIsNull() {
            addCriterion("access_state_code is null");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeIsNotNull() {
            addCriterion("access_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeEqualTo(String value) {
            addCriterion("access_state_code =", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeNotEqualTo(String value) {
            addCriterion("access_state_code <>", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeGreaterThan(String value) {
            addCriterion("access_state_code >", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("access_state_code >=", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeLessThan(String value) {
            addCriterion("access_state_code <", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeLessThanOrEqualTo(String value) {
            addCriterion("access_state_code <=", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeLike(String value) {
            addCriterion("access_state_code like", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeNotLike(String value) {
            addCriterion("access_state_code not like", value, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeIn(List<String> values) {
            addCriterion("access_state_code in", values, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeNotIn(List<String> values) {
            addCriterion("access_state_code not in", values, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeBetween(String value1, String value2) {
            addCriterion("access_state_code between", value1, value2, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andAccessStateCodeNotBetween(String value1, String value2) {
            addCriterion("access_state_code not between", value1, value2, "accessStateCode");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1IsNull() {
            addCriterion("main_road_name1 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1IsNotNull() {
            addCriterion("main_road_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1EqualTo(String value) {
            addCriterion("main_road_name1 =", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1NotEqualTo(String value) {
            addCriterion("main_road_name1 <>", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1GreaterThan(String value) {
            addCriterion("main_road_name1 >", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_name1 >=", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1LessThan(String value) {
            addCriterion("main_road_name1 <", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1LessThanOrEqualTo(String value) {
            addCriterion("main_road_name1 <=", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1Like(String value) {
            addCriterion("main_road_name1 like", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1NotLike(String value) {
            addCriterion("main_road_name1 not like", value, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1In(List<String> values) {
            addCriterion("main_road_name1 in", values, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1NotIn(List<String> values) {
            addCriterion("main_road_name1 not in", values, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1Between(String value1, String value2) {
            addCriterion("main_road_name1 between", value1, value2, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName1NotBetween(String value1, String value2) {
            addCriterion("main_road_name1 not between", value1, value2, "mainRoadName1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1IsNull() {
            addCriterion("main_road_level1 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1IsNotNull() {
            addCriterion("main_road_level1 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1EqualTo(String value) {
            addCriterion("main_road_level1 =", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1NotEqualTo(String value) {
            addCriterion("main_road_level1 <>", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1GreaterThan(String value) {
            addCriterion("main_road_level1 >", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_level1 >=", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1LessThan(String value) {
            addCriterion("main_road_level1 <", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1LessThanOrEqualTo(String value) {
            addCriterion("main_road_level1 <=", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1Like(String value) {
            addCriterion("main_road_level1 like", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1NotLike(String value) {
            addCriterion("main_road_level1 not like", value, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1In(List<String> values) {
            addCriterion("main_road_level1 in", values, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1NotIn(List<String> values) {
            addCriterion("main_road_level1 not in", values, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1Between(String value1, String value2) {
            addCriterion("main_road_level1 between", value1, value2, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel1NotBetween(String value1, String value2) {
            addCriterion("main_road_level1 not between", value1, value2, "mainRoadLevel1");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2IsNull() {
            addCriterion("main_road_name2 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2IsNotNull() {
            addCriterion("main_road_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2EqualTo(String value) {
            addCriterion("main_road_name2 =", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2NotEqualTo(String value) {
            addCriterion("main_road_name2 <>", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2GreaterThan(String value) {
            addCriterion("main_road_name2 >", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_name2 >=", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2LessThan(String value) {
            addCriterion("main_road_name2 <", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2LessThanOrEqualTo(String value) {
            addCriterion("main_road_name2 <=", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2Like(String value) {
            addCriterion("main_road_name2 like", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2NotLike(String value) {
            addCriterion("main_road_name2 not like", value, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2In(List<String> values) {
            addCriterion("main_road_name2 in", values, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2NotIn(List<String> values) {
            addCriterion("main_road_name2 not in", values, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2Between(String value1, String value2) {
            addCriterion("main_road_name2 between", value1, value2, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName2NotBetween(String value1, String value2) {
            addCriterion("main_road_name2 not between", value1, value2, "mainRoadName2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2IsNull() {
            addCriterion("main_road_level2 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2IsNotNull() {
            addCriterion("main_road_level2 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2EqualTo(String value) {
            addCriterion("main_road_level2 =", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2NotEqualTo(String value) {
            addCriterion("main_road_level2 <>", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2GreaterThan(String value) {
            addCriterion("main_road_level2 >", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_level2 >=", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2LessThan(String value) {
            addCriterion("main_road_level2 <", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2LessThanOrEqualTo(String value) {
            addCriterion("main_road_level2 <=", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2Like(String value) {
            addCriterion("main_road_level2 like", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2NotLike(String value) {
            addCriterion("main_road_level2 not like", value, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2In(List<String> values) {
            addCriterion("main_road_level2 in", values, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2NotIn(List<String> values) {
            addCriterion("main_road_level2 not in", values, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2Between(String value1, String value2) {
            addCriterion("main_road_level2 between", value1, value2, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel2NotBetween(String value1, String value2) {
            addCriterion("main_road_level2 not between", value1, value2, "mainRoadLevel2");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3IsNull() {
            addCriterion("main_road_name3 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3IsNotNull() {
            addCriterion("main_road_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3EqualTo(String value) {
            addCriterion("main_road_name3 =", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3NotEqualTo(String value) {
            addCriterion("main_road_name3 <>", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3GreaterThan(String value) {
            addCriterion("main_road_name3 >", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_name3 >=", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3LessThan(String value) {
            addCriterion("main_road_name3 <", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3LessThanOrEqualTo(String value) {
            addCriterion("main_road_name3 <=", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3Like(String value) {
            addCriterion("main_road_name3 like", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3NotLike(String value) {
            addCriterion("main_road_name3 not like", value, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3In(List<String> values) {
            addCriterion("main_road_name3 in", values, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3NotIn(List<String> values) {
            addCriterion("main_road_name3 not in", values, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3Between(String value1, String value2) {
            addCriterion("main_road_name3 between", value1, value2, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName3NotBetween(String value1, String value2) {
            addCriterion("main_road_name3 not between", value1, value2, "mainRoadName3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3IsNull() {
            addCriterion("main_road_level3 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3IsNotNull() {
            addCriterion("main_road_level3 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3EqualTo(String value) {
            addCriterion("main_road_level3 =", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3NotEqualTo(String value) {
            addCriterion("main_road_level3 <>", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3GreaterThan(String value) {
            addCriterion("main_road_level3 >", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_level3 >=", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3LessThan(String value) {
            addCriterion("main_road_level3 <", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3LessThanOrEqualTo(String value) {
            addCriterion("main_road_level3 <=", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3Like(String value) {
            addCriterion("main_road_level3 like", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3NotLike(String value) {
            addCriterion("main_road_level3 not like", value, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3In(List<String> values) {
            addCriterion("main_road_level3 in", values, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3NotIn(List<String> values) {
            addCriterion("main_road_level3 not in", values, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3Between(String value1, String value2) {
            addCriterion("main_road_level3 between", value1, value2, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel3NotBetween(String value1, String value2) {
            addCriterion("main_road_level3 not between", value1, value2, "mainRoadLevel3");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4IsNull() {
            addCriterion("main_road_name4 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4IsNotNull() {
            addCriterion("main_road_name4 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4EqualTo(String value) {
            addCriterion("main_road_name4 =", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4NotEqualTo(String value) {
            addCriterion("main_road_name4 <>", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4GreaterThan(String value) {
            addCriterion("main_road_name4 >", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_name4 >=", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4LessThan(String value) {
            addCriterion("main_road_name4 <", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4LessThanOrEqualTo(String value) {
            addCriterion("main_road_name4 <=", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4Like(String value) {
            addCriterion("main_road_name4 like", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4NotLike(String value) {
            addCriterion("main_road_name4 not like", value, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4In(List<String> values) {
            addCriterion("main_road_name4 in", values, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4NotIn(List<String> values) {
            addCriterion("main_road_name4 not in", values, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4Between(String value1, String value2) {
            addCriterion("main_road_name4 between", value1, value2, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadName4NotBetween(String value1, String value2) {
            addCriterion("main_road_name4 not between", value1, value2, "mainRoadName4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4IsNull() {
            addCriterion("main_road_level4 is null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4IsNotNull() {
            addCriterion("main_road_level4 is not null");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4EqualTo(String value) {
            addCriterion("main_road_level4 =", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4NotEqualTo(String value) {
            addCriterion("main_road_level4 <>", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4GreaterThan(String value) {
            addCriterion("main_road_level4 >", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4GreaterThanOrEqualTo(String value) {
            addCriterion("main_road_level4 >=", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4LessThan(String value) {
            addCriterion("main_road_level4 <", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4LessThanOrEqualTo(String value) {
            addCriterion("main_road_level4 <=", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4Like(String value) {
            addCriterion("main_road_level4 like", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4NotLike(String value) {
            addCriterion("main_road_level4 not like", value, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4In(List<String> values) {
            addCriterion("main_road_level4 in", values, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4NotIn(List<String> values) {
            addCriterion("main_road_level4 not in", values, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4Between(String value1, String value2) {
            addCriterion("main_road_level4 between", value1, value2, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andMainRoadLevel4NotBetween(String value1, String value2) {
            addCriterion("main_road_level4 not between", value1, value2, "mainRoadLevel4");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceIsNull() {
            addCriterion("power_supply_source is null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceIsNotNull() {
            addCriterion("power_supply_source is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceEqualTo(String value) {
            addCriterion("power_supply_source =", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceNotEqualTo(String value) {
            addCriterion("power_supply_source <>", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceGreaterThan(String value) {
            addCriterion("power_supply_source >", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceGreaterThanOrEqualTo(String value) {
            addCriterion("power_supply_source >=", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceLessThan(String value) {
            addCriterion("power_supply_source <", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceLessThanOrEqualTo(String value) {
            addCriterion("power_supply_source <=", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceLike(String value) {
            addCriterion("power_supply_source like", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceNotLike(String value) {
            addCriterion("power_supply_source not like", value, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceIn(List<String> values) {
            addCriterion("power_supply_source in", values, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceNotIn(List<String> values) {
            addCriterion("power_supply_source not in", values, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceBetween(String value1, String value2) {
            addCriterion("power_supply_source between", value1, value2, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerSupplySourceNotBetween(String value1, String value2) {
            addCriterion("power_supply_source not between", value1, value2, "powerSupplySource");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameIsNull() {
            addCriterion("power_grid_name is null");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameIsNotNull() {
            addCriterion("power_grid_name is not null");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameEqualTo(String value) {
            addCriterion("power_grid_name =", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameNotEqualTo(String value) {
            addCriterion("power_grid_name <>", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameGreaterThan(String value) {
            addCriterion("power_grid_name >", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameGreaterThanOrEqualTo(String value) {
            addCriterion("power_grid_name >=", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameLessThan(String value) {
            addCriterion("power_grid_name <", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameLessThanOrEqualTo(String value) {
            addCriterion("power_grid_name <=", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameLike(String value) {
            addCriterion("power_grid_name like", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameNotLike(String value) {
            addCriterion("power_grid_name not like", value, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameIn(List<String> values) {
            addCriterion("power_grid_name in", values, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameNotIn(List<String> values) {
            addCriterion("power_grid_name not in", values, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameBetween(String value1, String value2) {
            addCriterion("power_grid_name between", value1, value2, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerGridNameNotBetween(String value1, String value2) {
            addCriterion("power_grid_name not between", value1, value2, "powerGridName");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateIsNull() {
            addCriterion("power_supply_rate is null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateIsNotNull() {
            addCriterion("power_supply_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateEqualTo(BigDecimal value) {
            addCriterion("power_supply_rate =", value, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateNotEqualTo(BigDecimal value) {
            addCriterion("power_supply_rate <>", value, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateGreaterThan(BigDecimal value) {
            addCriterion("power_supply_rate >", value, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("power_supply_rate >=", value, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateLessThan(BigDecimal value) {
            addCriterion("power_supply_rate <", value, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("power_supply_rate <=", value, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateIn(List<BigDecimal> values) {
            addCriterion("power_supply_rate in", values, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateNotIn(List<BigDecimal> values) {
            addCriterion("power_supply_rate not in", values, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_supply_rate between", value1, value2, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_supply_rate not between", value1, value2, "powerSupplyRate");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfIsNull() {
            addCriterion("electric_equ_power_self is null");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfIsNotNull() {
            addCriterion("electric_equ_power_self is not null");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfEqualTo(BigDecimal value) {
            addCriterion("electric_equ_power_self =", value, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfNotEqualTo(BigDecimal value) {
            addCriterion("electric_equ_power_self <>", value, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfGreaterThan(BigDecimal value) {
            addCriterion("electric_equ_power_self >", value, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("electric_equ_power_self >=", value, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfLessThan(BigDecimal value) {
            addCriterion("electric_equ_power_self <", value, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("electric_equ_power_self <=", value, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfIn(List<BigDecimal> values) {
            addCriterion("electric_equ_power_self in", values, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfNotIn(List<BigDecimal> values) {
            addCriterion("electric_equ_power_self not in", values, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("electric_equ_power_self between", value1, value2, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andElectricEquPowerSelfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("electric_equ_power_self not between", value1, value2, "electricEquPowerSelf");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyIsNull() {
            addCriterion("city_water_supply is null");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyIsNotNull() {
            addCriterion("city_water_supply is not null");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyEqualTo(BigDecimal value) {
            addCriterion("city_water_supply =", value, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyNotEqualTo(BigDecimal value) {
            addCriterion("city_water_supply <>", value, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyGreaterThan(BigDecimal value) {
            addCriterion("city_water_supply >", value, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("city_water_supply >=", value, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyLessThan(BigDecimal value) {
            addCriterion("city_water_supply <", value, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("city_water_supply <=", value, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyIn(List<BigDecimal> values) {
            addCriterion("city_water_supply in", values, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyNotIn(List<BigDecimal> values) {
            addCriterion("city_water_supply not in", values, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("city_water_supply between", value1, value2, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andCityWaterSupplyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("city_water_supply not between", value1, value2, "cityWaterSupply");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseIsNull() {
            addCriterion("well_self_use is null");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseIsNotNull() {
            addCriterion("well_self_use is not null");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseEqualTo(BigDecimal value) {
            addCriterion("well_self_use =", value, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseNotEqualTo(BigDecimal value) {
            addCriterion("well_self_use <>", value, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseGreaterThan(BigDecimal value) {
            addCriterion("well_self_use >", value, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("well_self_use >=", value, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseLessThan(BigDecimal value) {
            addCriterion("well_self_use <", value, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("well_self_use <=", value, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseIn(List<BigDecimal> values) {
            addCriterion("well_self_use in", values, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseNotIn(List<BigDecimal> values) {
            addCriterion("well_self_use not in", values, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("well_self_use between", value1, value2, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andWellSelfUseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("well_self_use not between", value1, value2, "wellSelfUse");
            return (Criteria) this;
        }

        public Criteria andUseWaterIsNull() {
            addCriterion("use_water is null");
            return (Criteria) this;
        }

        public Criteria andUseWaterIsNotNull() {
            addCriterion("use_water is not null");
            return (Criteria) this;
        }

        public Criteria andUseWaterEqualTo(BigDecimal value) {
            addCriterion("use_water =", value, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterNotEqualTo(BigDecimal value) {
            addCriterion("use_water <>", value, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterGreaterThan(BigDecimal value) {
            addCriterion("use_water >", value, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_water >=", value, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterLessThan(BigDecimal value) {
            addCriterion("use_water <", value, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_water <=", value, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterIn(List<BigDecimal> values) {
            addCriterion("use_water in", values, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterNotIn(List<BigDecimal> values) {
            addCriterion("use_water not in", values, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_water between", value1, value2, "useWater");
            return (Criteria) this;
        }

        public Criteria andUseWaterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_water not between", value1, value2, "useWater");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeIsNull() {
            addCriterion("sewage_discharge is null");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeIsNotNull() {
            addCriterion("sewage_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeEqualTo(BigDecimal value) {
            addCriterion("sewage_discharge =", value, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeNotEqualTo(BigDecimal value) {
            addCriterion("sewage_discharge <>", value, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeGreaterThan(BigDecimal value) {
            addCriterion("sewage_discharge >", value, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sewage_discharge >=", value, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeLessThan(BigDecimal value) {
            addCriterion("sewage_discharge <", value, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sewage_discharge <=", value, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeIn(List<BigDecimal> values) {
            addCriterion("sewage_discharge in", values, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeNotIn(List<BigDecimal> values) {
            addCriterion("sewage_discharge not in", values, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sewage_discharge between", value1, value2, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andSewageDischargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sewage_discharge not between", value1, value2, "sewageDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeIsNull() {
            addCriterion("rainwater_discharge is null");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeIsNotNull() {
            addCriterion("rainwater_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeEqualTo(BigDecimal value) {
            addCriterion("rainwater_discharge =", value, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeNotEqualTo(BigDecimal value) {
            addCriterion("rainwater_discharge <>", value, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeGreaterThan(BigDecimal value) {
            addCriterion("rainwater_discharge >", value, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rainwater_discharge >=", value, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeLessThan(BigDecimal value) {
            addCriterion("rainwater_discharge <", value, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rainwater_discharge <=", value, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeIn(List<BigDecimal> values) {
            addCriterion("rainwater_discharge in", values, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeNotIn(List<BigDecimal> values) {
            addCriterion("rainwater_discharge not in", values, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rainwater_discharge between", value1, value2, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andRainwaterDischargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rainwater_discharge not between", value1, value2, "rainwaterDischarge");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctIsNull() {
            addCriterion("drainage_duct is null");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctIsNotNull() {
            addCriterion("drainage_duct is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctEqualTo(String value) {
            addCriterion("drainage_duct =", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctNotEqualTo(String value) {
            addCriterion("drainage_duct <>", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctGreaterThan(String value) {
            addCriterion("drainage_duct >", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_duct >=", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctLessThan(String value) {
            addCriterion("drainage_duct <", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctLessThanOrEqualTo(String value) {
            addCriterion("drainage_duct <=", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctLike(String value) {
            addCriterion("drainage_duct like", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctNotLike(String value) {
            addCriterion("drainage_duct not like", value, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctIn(List<String> values) {
            addCriterion("drainage_duct in", values, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctNotIn(List<String> values) {
            addCriterion("drainage_duct not in", values, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctBetween(String value1, String value2) {
            addCriterion("drainage_duct between", value1, value2, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctNotBetween(String value1, String value2) {
            addCriterion("drainage_duct not between", value1, value2, "drainageDuct");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeIsNull() {
            addCriterion("drainage_duct_code is null");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeIsNotNull() {
            addCriterion("drainage_duct_code is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeEqualTo(String value) {
            addCriterion("drainage_duct_code =", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeNotEqualTo(String value) {
            addCriterion("drainage_duct_code <>", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeGreaterThan(String value) {
            addCriterion("drainage_duct_code >", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_duct_code >=", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeLessThan(String value) {
            addCriterion("drainage_duct_code <", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeLessThanOrEqualTo(String value) {
            addCriterion("drainage_duct_code <=", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeLike(String value) {
            addCriterion("drainage_duct_code like", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeNotLike(String value) {
            addCriterion("drainage_duct_code not like", value, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeIn(List<String> values) {
            addCriterion("drainage_duct_code in", values, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeNotIn(List<String> values) {
            addCriterion("drainage_duct_code not in", values, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeBetween(String value1, String value2) {
            addCriterion("drainage_duct_code between", value1, value2, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andDrainageDuctCodeNotBetween(String value1, String value2) {
            addCriterion("drainage_duct_code not between", value1, value2, "drainageDuctCode");
            return (Criteria) this;
        }

        public Criteria andSpecsHIsNull() {
            addCriterion("specs_h is null");
            return (Criteria) this;
        }

        public Criteria andSpecsHIsNotNull() {
            addCriterion("specs_h is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsHEqualTo(BigDecimal value) {
            addCriterion("specs_h =", value, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHNotEqualTo(BigDecimal value) {
            addCriterion("specs_h <>", value, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHGreaterThan(BigDecimal value) {
            addCriterion("specs_h >", value, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("specs_h >=", value, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHLessThan(BigDecimal value) {
            addCriterion("specs_h <", value, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("specs_h <=", value, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHIn(List<BigDecimal> values) {
            addCriterion("specs_h in", values, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHNotIn(List<BigDecimal> values) {
            addCriterion("specs_h not in", values, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("specs_h between", value1, value2, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("specs_h not between", value1, value2, "specsH");
            return (Criteria) this;
        }

        public Criteria andSpecsWIsNull() {
            addCriterion("specs_w is null");
            return (Criteria) this;
        }

        public Criteria andSpecsWIsNotNull() {
            addCriterion("specs_w is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsWEqualTo(BigDecimal value) {
            addCriterion("specs_w =", value, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWNotEqualTo(BigDecimal value) {
            addCriterion("specs_w <>", value, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWGreaterThan(BigDecimal value) {
            addCriterion("specs_w >", value, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("specs_w >=", value, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWLessThan(BigDecimal value) {
            addCriterion("specs_w <", value, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWLessThanOrEqualTo(BigDecimal value) {
            addCriterion("specs_w <=", value, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWIn(List<BigDecimal> values) {
            addCriterion("specs_w in", values, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWNotIn(List<BigDecimal> values) {
            addCriterion("specs_w not in", values, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("specs_w between", value1, value2, "specsW");
            return (Criteria) this;
        }

        public Criteria andSpecsWNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("specs_w not between", value1, value2, "specsW");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNull() {
            addCriterion("heating is null");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNotNull() {
            addCriterion("heating is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingEqualTo(String value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(String value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(String value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(String value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(String value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(String value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLike(String value) {
            addCriterion("heating like", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotLike(String value) {
            addCriterion("heating not like", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<String> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<String> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(String value1, String value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(String value1, String value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeIsNull() {
            addCriterion("heating_code is null");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeIsNotNull() {
            addCriterion("heating_code is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeEqualTo(String value) {
            addCriterion("heating_code =", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeNotEqualTo(String value) {
            addCriterion("heating_code <>", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeGreaterThan(String value) {
            addCriterion("heating_code >", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("heating_code >=", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeLessThan(String value) {
            addCriterion("heating_code <", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeLessThanOrEqualTo(String value) {
            addCriterion("heating_code <=", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeLike(String value) {
            addCriterion("heating_code like", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeNotLike(String value) {
            addCriterion("heating_code not like", value, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeIn(List<String> values) {
            addCriterion("heating_code in", values, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeNotIn(List<String> values) {
            addCriterion("heating_code not in", values, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeBetween(String value1, String value2) {
            addCriterion("heating_code between", value1, value2, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andHeatingCodeNotBetween(String value1, String value2) {
            addCriterion("heating_code not between", value1, value2, "heatingCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasIsNull() {
            addCriterion("supply_gas is null");
            return (Criteria) this;
        }

        public Criteria andSupplyGasIsNotNull() {
            addCriterion("supply_gas is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyGasEqualTo(String value) {
            addCriterion("supply_gas =", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasNotEqualTo(String value) {
            addCriterion("supply_gas <>", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasGreaterThan(String value) {
            addCriterion("supply_gas >", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasGreaterThanOrEqualTo(String value) {
            addCriterion("supply_gas >=", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasLessThan(String value) {
            addCriterion("supply_gas <", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasLessThanOrEqualTo(String value) {
            addCriterion("supply_gas <=", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasLike(String value) {
            addCriterion("supply_gas like", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasNotLike(String value) {
            addCriterion("supply_gas not like", value, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasIn(List<String> values) {
            addCriterion("supply_gas in", values, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasNotIn(List<String> values) {
            addCriterion("supply_gas not in", values, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasBetween(String value1, String value2) {
            addCriterion("supply_gas between", value1, value2, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasNotBetween(String value1, String value2) {
            addCriterion("supply_gas not between", value1, value2, "supplyGas");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeIsNull() {
            addCriterion("supply_gas_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeIsNotNull() {
            addCriterion("supply_gas_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeEqualTo(String value) {
            addCriterion("supply_gas_code =", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeNotEqualTo(String value) {
            addCriterion("supply_gas_code <>", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeGreaterThan(String value) {
            addCriterion("supply_gas_code >", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supply_gas_code >=", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeLessThan(String value) {
            addCriterion("supply_gas_code <", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeLessThanOrEqualTo(String value) {
            addCriterion("supply_gas_code <=", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeLike(String value) {
            addCriterion("supply_gas_code like", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeNotLike(String value) {
            addCriterion("supply_gas_code not like", value, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeIn(List<String> values) {
            addCriterion("supply_gas_code in", values, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeNotIn(List<String> values) {
            addCriterion("supply_gas_code not in", values, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeBetween(String value1, String value2) {
            addCriterion("supply_gas_code between", value1, value2, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andSupplyGasCodeNotBetween(String value1, String value2) {
            addCriterion("supply_gas_code not between", value1, value2, "supplyGasCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsIsNull() {
            addCriterion("communications is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationsIsNotNull() {
            addCriterion("communications is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationsEqualTo(String value) {
            addCriterion("communications =", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotEqualTo(String value) {
            addCriterion("communications <>", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsGreaterThan(String value) {
            addCriterion("communications >", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsGreaterThanOrEqualTo(String value) {
            addCriterion("communications >=", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsLessThan(String value) {
            addCriterion("communications <", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsLessThanOrEqualTo(String value) {
            addCriterion("communications <=", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsLike(String value) {
            addCriterion("communications like", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotLike(String value) {
            addCriterion("communications not like", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsIn(List<String> values) {
            addCriterion("communications in", values, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotIn(List<String> values) {
            addCriterion("communications not in", values, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsBetween(String value1, String value2) {
            addCriterion("communications between", value1, value2, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotBetween(String value1, String value2) {
            addCriterion("communications not between", value1, value2, "communications");
            return (Criteria) this;
        }

        public Criteria andSwitchModelIsNull() {
            addCriterion("switch_model is null");
            return (Criteria) this;
        }

        public Criteria andSwitchModelIsNotNull() {
            addCriterion("switch_model is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchModelEqualTo(String value) {
            addCriterion("switch_model =", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelNotEqualTo(String value) {
            addCriterion("switch_model <>", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelGreaterThan(String value) {
            addCriterion("switch_model >", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelGreaterThanOrEqualTo(String value) {
            addCriterion("switch_model >=", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelLessThan(String value) {
            addCriterion("switch_model <", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelLessThanOrEqualTo(String value) {
            addCriterion("switch_model <=", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelLike(String value) {
            addCriterion("switch_model like", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelNotLike(String value) {
            addCriterion("switch_model not like", value, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelIn(List<String> values) {
            addCriterion("switch_model in", values, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelNotIn(List<String> values) {
            addCriterion("switch_model not in", values, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelBetween(String value1, String value2) {
            addCriterion("switch_model between", value1, value2, "switchModel");
            return (Criteria) this;
        }

        public Criteria andSwitchModelNotBetween(String value1, String value2) {
            addCriterion("switch_model not between", value1, value2, "switchModel");
            return (Criteria) this;
        }

        public Criteria andETelNumIsNull() {
            addCriterion("e_tel_num is null");
            return (Criteria) this;
        }

        public Criteria andETelNumIsNotNull() {
            addCriterion("e_tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andETelNumEqualTo(Byte value) {
            addCriterion("e_tel_num =", value, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumNotEqualTo(Byte value) {
            addCriterion("e_tel_num <>", value, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumGreaterThan(Byte value) {
            addCriterion("e_tel_num >", value, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("e_tel_num >=", value, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumLessThan(Byte value) {
            addCriterion("e_tel_num <", value, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumLessThanOrEqualTo(Byte value) {
            addCriterion("e_tel_num <=", value, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumIn(List<Byte> values) {
            addCriterion("e_tel_num in", values, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumNotIn(List<Byte> values) {
            addCriterion("e_tel_num not in", values, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumBetween(Byte value1, Byte value2) {
            addCriterion("e_tel_num between", value1, value2, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andETelNumNotBetween(Byte value1, Byte value2) {
            addCriterion("e_tel_num not between", value1, value2, "eTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumIsNull() {
            addCriterion("l_tel_num is null");
            return (Criteria) this;
        }

        public Criteria andLTelNumIsNotNull() {
            addCriterion("l_tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andLTelNumEqualTo(Byte value) {
            addCriterion("l_tel_num =", value, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumNotEqualTo(Byte value) {
            addCriterion("l_tel_num <>", value, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumGreaterThan(Byte value) {
            addCriterion("l_tel_num >", value, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("l_tel_num >=", value, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumLessThan(Byte value) {
            addCriterion("l_tel_num <", value, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumLessThanOrEqualTo(Byte value) {
            addCriterion("l_tel_num <=", value, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumIn(List<Byte> values) {
            addCriterion("l_tel_num in", values, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumNotIn(List<Byte> values) {
            addCriterion("l_tel_num not in", values, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumBetween(Byte value1, Byte value2) {
            addCriterion("l_tel_num between", value1, value2, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andLTelNumNotBetween(Byte value1, Byte value2) {
            addCriterion("l_tel_num not between", value1, value2, "lTelNum");
            return (Criteria) this;
        }

        public Criteria andSmoothnessIsNull() {
            addCriterion("smoothness is null");
            return (Criteria) this;
        }

        public Criteria andSmoothnessIsNotNull() {
            addCriterion("smoothness is not null");
            return (Criteria) this;
        }

        public Criteria andSmoothnessEqualTo(String value) {
            addCriterion("smoothness =", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessNotEqualTo(String value) {
            addCriterion("smoothness <>", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessGreaterThan(String value) {
            addCriterion("smoothness >", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessGreaterThanOrEqualTo(String value) {
            addCriterion("smoothness >=", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessLessThan(String value) {
            addCriterion("smoothness <", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessLessThanOrEqualTo(String value) {
            addCriterion("smoothness <=", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessLike(String value) {
            addCriterion("smoothness like", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessNotLike(String value) {
            addCriterion("smoothness not like", value, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessIn(List<String> values) {
            addCriterion("smoothness in", values, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessNotIn(List<String> values) {
            addCriterion("smoothness not in", values, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessBetween(String value1, String value2) {
            addCriterion("smoothness between", value1, value2, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessNotBetween(String value1, String value2) {
            addCriterion("smoothness not between", value1, value2, "smoothness");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeIsNull() {
            addCriterion("smoothness_code is null");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeIsNotNull() {
            addCriterion("smoothness_code is not null");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeEqualTo(String value) {
            addCriterion("smoothness_code =", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeNotEqualTo(String value) {
            addCriterion("smoothness_code <>", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeGreaterThan(String value) {
            addCriterion("smoothness_code >", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("smoothness_code >=", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeLessThan(String value) {
            addCriterion("smoothness_code <", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeLessThanOrEqualTo(String value) {
            addCriterion("smoothness_code <=", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeLike(String value) {
            addCriterion("smoothness_code like", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeNotLike(String value) {
            addCriterion("smoothness_code not like", value, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeIn(List<String> values) {
            addCriterion("smoothness_code in", values, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeNotIn(List<String> values) {
            addCriterion("smoothness_code not in", values, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeBetween(String value1, String value2) {
            addCriterion("smoothness_code between", value1, value2, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSmoothnessCodeNotBetween(String value1, String value2) {
            addCriterion("smoothness_code not between", value1, value2, "smoothnessCode");
            return (Criteria) this;
        }

        public Criteria andSlopeIsNull() {
            addCriterion("slope is null");
            return (Criteria) this;
        }

        public Criteria andSlopeIsNotNull() {
            addCriterion("slope is not null");
            return (Criteria) this;
        }

        public Criteria andSlopeEqualTo(BigDecimal value) {
            addCriterion("slope =", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeNotEqualTo(BigDecimal value) {
            addCriterion("slope <>", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeGreaterThan(BigDecimal value) {
            addCriterion("slope >", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("slope >=", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeLessThan(BigDecimal value) {
            addCriterion("slope <", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("slope <=", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeIn(List<BigDecimal> values) {
            addCriterion("slope in", values, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeNotIn(List<BigDecimal> values) {
            addCriterion("slope not in", values, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slope between", value1, value2, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slope not between", value1, value2, "slope");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
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