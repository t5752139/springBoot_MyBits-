package com.ky.jyg.file.appendix.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachmentExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeIsNull() {
            addCriterion("task_name_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeIsNotNull() {
            addCriterion("task_name_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeEqualTo(String value) {
            addCriterion("task_name_code =", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeNotEqualTo(String value) {
            addCriterion("task_name_code <>", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeGreaterThan(String value) {
            addCriterion("task_name_code >", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_name_code >=", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeLessThan(String value) {
            addCriterion("task_name_code <", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeLessThanOrEqualTo(String value) {
            addCriterion("task_name_code <=", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeLike(String value) {
            addCriterion("task_name_code like", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeNotLike(String value) {
            addCriterion("task_name_code not like", value, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeIn(List<String> values) {
            addCriterion("task_name_code in", values, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeNotIn(List<String> values) {
            addCriterion("task_name_code not in", values, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeBetween(String value1, String value2) {
            addCriterion("task_name_code between", value1, value2, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameCodeNotBetween(String value1, String value2) {
            addCriterion("task_name_code not between", value1, value2, "taskNameCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIsNull() {
            addCriterion("file_type_code is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIsNotNull() {
            addCriterion("file_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeEqualTo(String value) {
            addCriterion("file_type_code =", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotEqualTo(String value) {
            addCriterion("file_type_code <>", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeGreaterThan(String value) {
            addCriterion("file_type_code >", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type_code >=", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLessThan(String value) {
            addCriterion("file_type_code <", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("file_type_code <=", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLike(String value) {
            addCriterion("file_type_code like", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotLike(String value) {
            addCriterion("file_type_code not like", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIn(List<String> values) {
            addCriterion("file_type_code in", values, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotIn(List<String> values) {
            addCriterion("file_type_code not in", values, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeBetween(String value1, String value2) {
            addCriterion("file_type_code between", value1, value2, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotBetween(String value1, String value2) {
            addCriterion("file_type_code not between", value1, value2, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andVerNoIsNull() {
            addCriterion("ver_no is null");
            return (Criteria) this;
        }

        public Criteria andVerNoIsNotNull() {
            addCriterion("ver_no is not null");
            return (Criteria) this;
        }

        public Criteria andVerNoEqualTo(Byte value) {
            addCriterion("ver_no =", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotEqualTo(Byte value) {
            addCriterion("ver_no <>", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoGreaterThan(Byte value) {
            addCriterion("ver_no >", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("ver_no >=", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoLessThan(Byte value) {
            addCriterion("ver_no <", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoLessThanOrEqualTo(Byte value) {
            addCriterion("ver_no <=", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoIn(List<Byte> values) {
            addCriterion("ver_no in", values, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotIn(List<Byte> values) {
            addCriterion("ver_no not in", values, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoBetween(Byte value1, Byte value2) {
            addCriterion("ver_no between", value1, value2, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotBetween(Byte value1, Byte value2) {
            addCriterion("ver_no not between", value1, value2, "verNo");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdIsNull() {
            addCriterion("work_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdIsNotNull() {
            addCriterion("work_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdEqualTo(String value) {
            addCriterion("work_flow_id =", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdNotEqualTo(String value) {
            addCriterion("work_flow_id <>", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdGreaterThan(String value) {
            addCriterion("work_flow_id >", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_id >=", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdLessThan(String value) {
            addCriterion("work_flow_id <", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdLessThanOrEqualTo(String value) {
            addCriterion("work_flow_id <=", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdLike(String value) {
            addCriterion("work_flow_id like", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdNotLike(String value) {
            addCriterion("work_flow_id not like", value, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdIn(List<String> values) {
            addCriterion("work_flow_id in", values, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdNotIn(List<String> values) {
            addCriterion("work_flow_id not in", values, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdBetween(String value1, String value2) {
            addCriterion("work_flow_id between", value1, value2, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowIdNotBetween(String value1, String value2) {
            addCriterion("work_flow_id not between", value1, value2, "workFlowId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineIsNull() {
            addCriterion("work_flow_engine is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineIsNotNull() {
            addCriterion("work_flow_engine is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineEqualTo(String value) {
            addCriterion("work_flow_engine =", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineNotEqualTo(String value) {
            addCriterion("work_flow_engine <>", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineGreaterThan(String value) {
            addCriterion("work_flow_engine >", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_engine >=", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineLessThan(String value) {
            addCriterion("work_flow_engine <", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineLessThanOrEqualTo(String value) {
            addCriterion("work_flow_engine <=", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineLike(String value) {
            addCriterion("work_flow_engine like", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineNotLike(String value) {
            addCriterion("work_flow_engine not like", value, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineIn(List<String> values) {
            addCriterion("work_flow_engine in", values, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineNotIn(List<String> values) {
            addCriterion("work_flow_engine not in", values, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineBetween(String value1, String value2) {
            addCriterion("work_flow_engine between", value1, value2, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineNotBetween(String value1, String value2) {
            addCriterion("work_flow_engine not between", value1, value2, "workFlowEngine");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeIsNull() {
            addCriterion("work_flow_engine_code is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeIsNotNull() {
            addCriterion("work_flow_engine_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeEqualTo(String value) {
            addCriterion("work_flow_engine_code =", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeNotEqualTo(String value) {
            addCriterion("work_flow_engine_code <>", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeGreaterThan(String value) {
            addCriterion("work_flow_engine_code >", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_engine_code >=", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeLessThan(String value) {
            addCriterion("work_flow_engine_code <", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeLessThanOrEqualTo(String value) {
            addCriterion("work_flow_engine_code <=", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeLike(String value) {
            addCriterion("work_flow_engine_code like", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeNotLike(String value) {
            addCriterion("work_flow_engine_code not like", value, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeIn(List<String> values) {
            addCriterion("work_flow_engine_code in", values, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeNotIn(List<String> values) {
            addCriterion("work_flow_engine_code not in", values, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeBetween(String value1, String value2) {
            addCriterion("work_flow_engine_code between", value1, value2, "workFlowEngineCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowEngineCodeNotBetween(String value1, String value2) {
            addCriterion("work_flow_engine_code not between", value1, value2, "workFlowEngineCode");
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

        public Criteria andIsEffectiveEqualTo(Byte value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(Byte value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(Byte value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(Byte value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(Byte value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<Byte> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<Byte> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(Byte value1, Byte value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Byte value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Byte value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Byte value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Byte value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Byte value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Byte> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Byte> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Byte value1, Byte value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Byte value1, Byte value2) {
            addCriterion("sort_no not between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIsNull() {
            addCriterion("appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIsNotNull() {
            addCriterion("appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdEqualTo(String value) {
            addCriterion("appendix_id =", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotEqualTo(String value) {
            addCriterion("appendix_id <>", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThan(String value) {
            addCriterion("appendix_id >", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThanOrEqualTo(String value) {
            addCriterion("appendix_id >=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThan(String value) {
            addCriterion("appendix_id <", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThanOrEqualTo(String value) {
            addCriterion("appendix_id <=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLike(String value) {
            addCriterion("appendix_id like", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotLike(String value) {
            addCriterion("appendix_id not like", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIn(List<String> values) {
            addCriterion("appendix_id in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotIn(List<String> values) {
            addCriterion("appendix_id not in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdBetween(String value1, String value2) {
            addCriterion("appendix_id between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotBetween(String value1, String value2) {
            addCriterion("appendix_id not between", value1, value2, "appendixId");
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