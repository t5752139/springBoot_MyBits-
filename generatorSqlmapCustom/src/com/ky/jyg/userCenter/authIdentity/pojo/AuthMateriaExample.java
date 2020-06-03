package com.ky.jyg.userCenter.authIdentity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthMateriaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthMateriaExample() {
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

        public Criteria andAuthMateriaTemplateIdIsNull() {
            addCriterion("auth_materia_template_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdIsNotNull() {
            addCriterion("auth_materia_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdEqualTo(Long value) {
            addCriterion("auth_materia_template_id =", value, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdNotEqualTo(Long value) {
            addCriterion("auth_materia_template_id <>", value, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdGreaterThan(Long value) {
            addCriterion("auth_materia_template_id >", value, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("auth_materia_template_id >=", value, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdLessThan(Long value) {
            addCriterion("auth_materia_template_id <", value, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("auth_materia_template_id <=", value, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdIn(List<Long> values) {
            addCriterion("auth_materia_template_id in", values, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdNotIn(List<Long> values) {
            addCriterion("auth_materia_template_id not in", values, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdBetween(Long value1, Long value2) {
            addCriterion("auth_materia_template_id between", value1, value2, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andAuthMateriaTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("auth_materia_template_id not between", value1, value2, "authMateriaTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdIsNull() {
            addCriterion("professional_role_id is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdIsNotNull() {
            addCriterion("professional_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdEqualTo(Long value) {
            addCriterion("professional_role_id =", value, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdNotEqualTo(Long value) {
            addCriterion("professional_role_id <>", value, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdGreaterThan(Long value) {
            addCriterion("professional_role_id >", value, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("professional_role_id >=", value, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdLessThan(Long value) {
            addCriterion("professional_role_id <", value, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("professional_role_id <=", value, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdIn(List<Long> values) {
            addCriterion("professional_role_id in", values, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdNotIn(List<Long> values) {
            addCriterion("professional_role_id not in", values, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdBetween(Long value1, Long value2) {
            addCriterion("professional_role_id between", value1, value2, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andProfessionalRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("professional_role_id not between", value1, value2, "professionalRoleId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andMaterialAppendixIdIsNull() {
            addCriterion("material_appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdIsNotNull() {
            addCriterion("material_appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdEqualTo(String value) {
            addCriterion("material_appendix_id =", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdNotEqualTo(String value) {
            addCriterion("material_appendix_id <>", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdGreaterThan(String value) {
            addCriterion("material_appendix_id >", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdGreaterThanOrEqualTo(String value) {
            addCriterion("material_appendix_id >=", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdLessThan(String value) {
            addCriterion("material_appendix_id <", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdLessThanOrEqualTo(String value) {
            addCriterion("material_appendix_id <=", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdLike(String value) {
            addCriterion("material_appendix_id like", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdNotLike(String value) {
            addCriterion("material_appendix_id not like", value, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdIn(List<String> values) {
            addCriterion("material_appendix_id in", values, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdNotIn(List<String> values) {
            addCriterion("material_appendix_id not in", values, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdBetween(String value1, String value2) {
            addCriterion("material_appendix_id between", value1, value2, "materialAppendixId");
            return (Criteria) this;
        }

        public Criteria andMaterialAppendixIdNotBetween(String value1, String value2) {
            addCriterion("material_appendix_id not between", value1, value2, "materialAppendixId");
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

        public Criteria andIsExaminePassIsNull() {
            addCriterion("is_examine_pass is null");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassIsNotNull() {
            addCriterion("is_examine_pass is not null");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassEqualTo(String value) {
            addCriterion("is_examine_pass =", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassNotEqualTo(String value) {
            addCriterion("is_examine_pass <>", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassGreaterThan(String value) {
            addCriterion("is_examine_pass >", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassGreaterThanOrEqualTo(String value) {
            addCriterion("is_examine_pass >=", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassLessThan(String value) {
            addCriterion("is_examine_pass <", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassLessThanOrEqualTo(String value) {
            addCriterion("is_examine_pass <=", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassLike(String value) {
            addCriterion("is_examine_pass like", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassNotLike(String value) {
            addCriterion("is_examine_pass not like", value, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassIn(List<String> values) {
            addCriterion("is_examine_pass in", values, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassNotIn(List<String> values) {
            addCriterion("is_examine_pass not in", values, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassBetween(String value1, String value2) {
            addCriterion("is_examine_pass between", value1, value2, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andIsExaminePassNotBetween(String value1, String value2) {
            addCriterion("is_examine_pass not between", value1, value2, "isExaminePass");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgIsNull() {
            addCriterion("examine_error_msg is null");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgIsNotNull() {
            addCriterion("examine_error_msg is not null");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgEqualTo(String value) {
            addCriterion("examine_error_msg =", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgNotEqualTo(String value) {
            addCriterion("examine_error_msg <>", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgGreaterThan(String value) {
            addCriterion("examine_error_msg >", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("examine_error_msg >=", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgLessThan(String value) {
            addCriterion("examine_error_msg <", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("examine_error_msg <=", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgLike(String value) {
            addCriterion("examine_error_msg like", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgNotLike(String value) {
            addCriterion("examine_error_msg not like", value, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgIn(List<String> values) {
            addCriterion("examine_error_msg in", values, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgNotIn(List<String> values) {
            addCriterion("examine_error_msg not in", values, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgBetween(String value1, String value2) {
            addCriterion("examine_error_msg between", value1, value2, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andExamineErrorMsgNotBetween(String value1, String value2) {
            addCriterion("examine_error_msg not between", value1, value2, "examineErrorMsg");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andExamineIdIsNull() {
            addCriterion("examine_id is null");
            return (Criteria) this;
        }

        public Criteria andExamineIdIsNotNull() {
            addCriterion("examine_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamineIdEqualTo(Long value) {
            addCriterion("examine_id =", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotEqualTo(Long value) {
            addCriterion("examine_id <>", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThan(Long value) {
            addCriterion("examine_id >", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("examine_id >=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThan(Long value) {
            addCriterion("examine_id <", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThanOrEqualTo(Long value) {
            addCriterion("examine_id <=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdIn(List<Long> values) {
            addCriterion("examine_id in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotIn(List<Long> values) {
            addCriterion("examine_id not in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdBetween(Long value1, Long value2) {
            addCriterion("examine_id between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotBetween(Long value1, Long value2) {
            addCriterion("examine_id not between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNull() {
            addCriterion("examine_time is null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNotNull() {
            addCriterion("examine_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeEqualTo(Date value) {
            addCriterion("examine_time =", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotEqualTo(Date value) {
            addCriterion("examine_time <>", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThan(Date value) {
            addCriterion("examine_time >", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examine_time >=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThan(Date value) {
            addCriterion("examine_time <", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThanOrEqualTo(Date value) {
            addCriterion("examine_time <=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIn(List<Date> values) {
            addCriterion("examine_time in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotIn(List<Date> values) {
            addCriterion("examine_time not in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeBetween(Date value1, Date value2) {
            addCriterion("examine_time between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotBetween(Date value1, Date value2) {
            addCriterion("examine_time not between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingIsNull() {
            addCriterion("is_workflowing is null");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingIsNotNull() {
            addCriterion("is_workflowing is not null");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingEqualTo(String value) {
            addCriterion("is_workflowing =", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingNotEqualTo(String value) {
            addCriterion("is_workflowing <>", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingGreaterThan(String value) {
            addCriterion("is_workflowing >", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingGreaterThanOrEqualTo(String value) {
            addCriterion("is_workflowing >=", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingLessThan(String value) {
            addCriterion("is_workflowing <", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingLessThanOrEqualTo(String value) {
            addCriterion("is_workflowing <=", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingLike(String value) {
            addCriterion("is_workflowing like", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingNotLike(String value) {
            addCriterion("is_workflowing not like", value, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingIn(List<String> values) {
            addCriterion("is_workflowing in", values, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingNotIn(List<String> values) {
            addCriterion("is_workflowing not in", values, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingBetween(String value1, String value2) {
            addCriterion("is_workflowing between", value1, value2, "isWorkflowing");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowingNotBetween(String value1, String value2) {
            addCriterion("is_workflowing not between", value1, value2, "isWorkflowing");
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