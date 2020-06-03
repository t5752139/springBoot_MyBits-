package com.ky.jyg.userCenter.authIdentity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthMateriaTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthMateriaTemplateExample() {
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

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(String value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(String value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(String value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(String value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLike(String value) {
            addCriterion("auth_type like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotLike(String value) {
            addCriterion("auth_type not like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<String> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<String> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(String value1, String value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(String value1, String value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeIsNull() {
            addCriterion("auth_type_code is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeIsNotNull() {
            addCriterion("auth_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeEqualTo(String value) {
            addCriterion("auth_type_code =", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeNotEqualTo(String value) {
            addCriterion("auth_type_code <>", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeGreaterThan(String value) {
            addCriterion("auth_type_code >", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_type_code >=", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeLessThan(String value) {
            addCriterion("auth_type_code <", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("auth_type_code <=", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeLike(String value) {
            addCriterion("auth_type_code like", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeNotLike(String value) {
            addCriterion("auth_type_code not like", value, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeIn(List<String> values) {
            addCriterion("auth_type_code in", values, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeNotIn(List<String> values) {
            addCriterion("auth_type_code not in", values, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeBetween(String value1, String value2) {
            addCriterion("auth_type_code between", value1, value2, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthTypeCodeNotBetween(String value1, String value2) {
            addCriterion("auth_type_code not between", value1, value2, "authTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjIsNull() {
            addCriterion("auth_obj is null");
            return (Criteria) this;
        }

        public Criteria andAuthObjIsNotNull() {
            addCriterion("auth_obj is not null");
            return (Criteria) this;
        }

        public Criteria andAuthObjEqualTo(String value) {
            addCriterion("auth_obj =", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjNotEqualTo(String value) {
            addCriterion("auth_obj <>", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjGreaterThan(String value) {
            addCriterion("auth_obj >", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjGreaterThanOrEqualTo(String value) {
            addCriterion("auth_obj >=", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjLessThan(String value) {
            addCriterion("auth_obj <", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjLessThanOrEqualTo(String value) {
            addCriterion("auth_obj <=", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjLike(String value) {
            addCriterion("auth_obj like", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjNotLike(String value) {
            addCriterion("auth_obj not like", value, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjIn(List<String> values) {
            addCriterion("auth_obj in", values, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjNotIn(List<String> values) {
            addCriterion("auth_obj not in", values, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjBetween(String value1, String value2) {
            addCriterion("auth_obj between", value1, value2, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjNotBetween(String value1, String value2) {
            addCriterion("auth_obj not between", value1, value2, "authObj");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeIsNull() {
            addCriterion("auth_obj_code is null");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeIsNotNull() {
            addCriterion("auth_obj_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeEqualTo(String value) {
            addCriterion("auth_obj_code =", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeNotEqualTo(String value) {
            addCriterion("auth_obj_code <>", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeGreaterThan(String value) {
            addCriterion("auth_obj_code >", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_obj_code >=", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeLessThan(String value) {
            addCriterion("auth_obj_code <", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeLessThanOrEqualTo(String value) {
            addCriterion("auth_obj_code <=", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeLike(String value) {
            addCriterion("auth_obj_code like", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeNotLike(String value) {
            addCriterion("auth_obj_code not like", value, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeIn(List<String> values) {
            addCriterion("auth_obj_code in", values, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeNotIn(List<String> values) {
            addCriterion("auth_obj_code not in", values, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeBetween(String value1, String value2) {
            addCriterion("auth_obj_code between", value1, value2, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andAuthObjCodeNotBetween(String value1, String value2) {
            addCriterion("auth_obj_code not between", value1, value2, "authObjCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeIsNull() {
            addCriterion("material_name_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeIsNotNull() {
            addCriterion("material_name_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeEqualTo(String value) {
            addCriterion("material_name_code =", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotEqualTo(String value) {
            addCriterion("material_name_code <>", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeGreaterThan(String value) {
            addCriterion("material_name_code >", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_name_code >=", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeLessThan(String value) {
            addCriterion("material_name_code <", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeLessThanOrEqualTo(String value) {
            addCriterion("material_name_code <=", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeLike(String value) {
            addCriterion("material_name_code like", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotLike(String value) {
            addCriterion("material_name_code not like", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeIn(List<String> values) {
            addCriterion("material_name_code in", values, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotIn(List<String> values) {
            addCriterion("material_name_code not in", values, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeBetween(String value1, String value2) {
            addCriterion("material_name_code between", value1, value2, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotBetween(String value1, String value2) {
            addCriterion("material_name_code not between", value1, value2, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andIsMustIsNull() {
            addCriterion("is_must is null");
            return (Criteria) this;
        }

        public Criteria andIsMustIsNotNull() {
            addCriterion("is_must is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustEqualTo(String value) {
            addCriterion("is_must =", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotEqualTo(String value) {
            addCriterion("is_must <>", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustGreaterThan(String value) {
            addCriterion("is_must >", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustGreaterThanOrEqualTo(String value) {
            addCriterion("is_must >=", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLessThan(String value) {
            addCriterion("is_must <", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLessThanOrEqualTo(String value) {
            addCriterion("is_must <=", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLike(String value) {
            addCriterion("is_must like", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotLike(String value) {
            addCriterion("is_must not like", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustIn(List<String> values) {
            addCriterion("is_must in", values, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotIn(List<String> values) {
            addCriterion("is_must not in", values, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustBetween(String value1, String value2) {
            addCriterion("is_must between", value1, value2, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotBetween(String value1, String value2) {
            addCriterion("is_must not between", value1, value2, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("is_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("is_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(String value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(String value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(String value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(String value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(String value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLike(String value) {
            addCriterion("is_effective like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotLike(String value) {
            addCriterion("is_effective not like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<String> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<String> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(String value1, String value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(String value1, String value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeIsNull() {
            addCriterion("data_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeIsNotNull() {
            addCriterion("data_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeEqualTo(String value) {
            addCriterion("data_type_code =", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeNotEqualTo(String value) {
            addCriterion("data_type_code <>", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeGreaterThan(String value) {
            addCriterion("data_type_code >", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type_code >=", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeLessThan(String value) {
            addCriterion("data_type_code <", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("data_type_code <=", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeLike(String value) {
            addCriterion("data_type_code like", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeNotLike(String value) {
            addCriterion("data_type_code not like", value, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeIn(List<String> values) {
            addCriterion("data_type_code in", values, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeNotIn(List<String> values) {
            addCriterion("data_type_code not in", values, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeBetween(String value1, String value2) {
            addCriterion("data_type_code between", value1, value2, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andDataTypeCodeNotBetween(String value1, String value2) {
            addCriterion("data_type_code not between", value1, value2, "dataTypeCode");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodIsNull() {
            addCriterion("js_check_method is null");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodIsNotNull() {
            addCriterion("js_check_method is not null");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodEqualTo(String value) {
            addCriterion("js_check_method =", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodNotEqualTo(String value) {
            addCriterion("js_check_method <>", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodGreaterThan(String value) {
            addCriterion("js_check_method >", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodGreaterThanOrEqualTo(String value) {
            addCriterion("js_check_method >=", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodLessThan(String value) {
            addCriterion("js_check_method <", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodLessThanOrEqualTo(String value) {
            addCriterion("js_check_method <=", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodLike(String value) {
            addCriterion("js_check_method like", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodNotLike(String value) {
            addCriterion("js_check_method not like", value, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodIn(List<String> values) {
            addCriterion("js_check_method in", values, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodNotIn(List<String> values) {
            addCriterion("js_check_method not in", values, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodBetween(String value1, String value2) {
            addCriterion("js_check_method between", value1, value2, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andJsCheckMethodNotBetween(String value1, String value2) {
            addCriterion("js_check_method not between", value1, value2, "jsCheckMethod");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Byte value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Byte value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Byte value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Byte value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Byte value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Byte> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Byte> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Byte value1, Byte value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Byte value1, Byte value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoIsNull() {
            addCriterion("sorting_no is null");
            return (Criteria) this;
        }

        public Criteria andSortingNoIsNotNull() {
            addCriterion("sorting_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortingNoEqualTo(Byte value) {
            addCriterion("sorting_no =", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotEqualTo(Byte value) {
            addCriterion("sorting_no <>", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoGreaterThan(Byte value) {
            addCriterion("sorting_no >", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("sorting_no >=", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoLessThan(Byte value) {
            addCriterion("sorting_no <", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoLessThanOrEqualTo(Byte value) {
            addCriterion("sorting_no <=", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoIn(List<Byte> values) {
            addCriterion("sorting_no in", values, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotIn(List<Byte> values) {
            addCriterion("sorting_no not in", values, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoBetween(Byte value1, Byte value2) {
            addCriterion("sorting_no between", value1, value2, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotBetween(Byte value1, Byte value2) {
            addCriterion("sorting_no not between", value1, value2, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andIsCurrentIsNull() {
            addCriterion("is_current is null");
            return (Criteria) this;
        }

        public Criteria andIsCurrentIsNotNull() {
            addCriterion("is_current is not null");
            return (Criteria) this;
        }

        public Criteria andIsCurrentEqualTo(String value) {
            addCriterion("is_current =", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentNotEqualTo(String value) {
            addCriterion("is_current <>", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentGreaterThan(String value) {
            addCriterion("is_current >", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("is_current >=", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentLessThan(String value) {
            addCriterion("is_current <", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentLessThanOrEqualTo(String value) {
            addCriterion("is_current <=", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentLike(String value) {
            addCriterion("is_current like", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentNotLike(String value) {
            addCriterion("is_current not like", value, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentIn(List<String> values) {
            addCriterion("is_current in", values, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentNotIn(List<String> values) {
            addCriterion("is_current not in", values, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentBetween(String value1, String value2) {
            addCriterion("is_current between", value1, value2, "isCurrent");
            return (Criteria) this;
        }

        public Criteria andIsCurrentNotBetween(String value1, String value2) {
            addCriterion("is_current not between", value1, value2, "isCurrent");
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

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
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