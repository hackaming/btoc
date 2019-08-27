package com.crowdfunding.pojo;

import java.util.ArrayList;
import java.util.List;

public class CrowdPaymentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public CrowdPaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidIsNull() {
            addCriterion("USER_UUID is null");
            return (Criteria) this;
        }

        public Criteria andUserUuidIsNotNull() {
            addCriterion("USER_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUserUuidEqualTo(String value) {
            addCriterion("USER_UUID =", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotEqualTo(String value) {
            addCriterion("USER_UUID <>", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThan(String value) {
            addCriterion("USER_UUID >", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThanOrEqualTo(String value) {
            addCriterion("USER_UUID >=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThan(String value) {
            addCriterion("USER_UUID <", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThanOrEqualTo(String value) {
            addCriterion("USER_UUID <=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLike(String value) {
            addCriterion("USER_UUID like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotLike(String value) {
            addCriterion("USER_UUID not like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidIn(List<String> values) {
            addCriterion("USER_UUID in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotIn(List<String> values) {
            addCriterion("USER_UUID not in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidBetween(String value1, String value2) {
            addCriterion("USER_UUID between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotBetween(String value1, String value2) {
            addCriterion("USER_UUID not between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("PAYMENT_TYPE like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("PAYMENT_TYPE not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberIsNull() {
            addCriterion("PAYMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberIsNotNull() {
            addCriterion("PAYMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberEqualTo(String value) {
            addCriterion("PAYMENT_NUMBER =", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotEqualTo(String value) {
            addCriterion("PAYMENT_NUMBER <>", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberGreaterThan(String value) {
            addCriterion("PAYMENT_NUMBER >", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NUMBER >=", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberLessThan(String value) {
            addCriterion("PAYMENT_NUMBER <", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NUMBER <=", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberLike(String value) {
            addCriterion("PAYMENT_NUMBER like", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotLike(String value) {
            addCriterion("PAYMENT_NUMBER not like", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberIn(List<String> values) {
            addCriterion("PAYMENT_NUMBER in", values, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotIn(List<String> values) {
            addCriterion("PAYMENT_NUMBER not in", values, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberBetween(String value1, String value2) {
            addCriterion("PAYMENT_NUMBER between", value1, value2, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_NUMBER not between", value1, value2, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("PAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("PAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(String value) {
            addCriterion("PAYMENT_AMOUNT =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(String value) {
            addCriterion("PAYMENT_AMOUNT <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(String value) {
            addCriterion("PAYMENT_AMOUNT >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_AMOUNT >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(String value) {
            addCriterion("PAYMENT_AMOUNT <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_AMOUNT <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLike(String value) {
            addCriterion("PAYMENT_AMOUNT like", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotLike(String value) {
            addCriterion("PAYMENT_AMOUNT not like", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<String> values) {
            addCriterion("PAYMENT_AMOUNT in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<String> values) {
            addCriterion("PAYMENT_AMOUNT not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(String value1, String value2) {
            addCriterion("PAYMENT_AMOUNT between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_AMOUNT not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("PAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("PAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(String value) {
            addCriterion("PAYMENT_DATE =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(String value) {
            addCriterion("PAYMENT_DATE <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(String value) {
            addCriterion("PAYMENT_DATE >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_DATE >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(String value) {
            addCriterion("PAYMENT_DATE <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_DATE <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLike(String value) {
            addCriterion("PAYMENT_DATE like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotLike(String value) {
            addCriterion("PAYMENT_DATE not like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<String> values) {
            addCriterion("PAYMENT_DATE in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<String> values) {
            addCriterion("PAYMENT_DATE not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(String value1, String value2) {
            addCriterion("PAYMENT_DATE between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_DATE not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andCancelIsNull() {
            addCriterion("CANCEL is null");
            return (Criteria) this;
        }

        public Criteria andCancelIsNotNull() {
            addCriterion("CANCEL is not null");
            return (Criteria) this;
        }

        public Criteria andCancelEqualTo(String value) {
            addCriterion("CANCEL =", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotEqualTo(String value) {
            addCriterion("CANCEL <>", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelGreaterThan(String value) {
            addCriterion("CANCEL >", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL >=", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelLessThan(String value) {
            addCriterion("CANCEL <", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelLessThanOrEqualTo(String value) {
            addCriterion("CANCEL <=", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelLike(String value) {
            addCriterion("CANCEL like", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotLike(String value) {
            addCriterion("CANCEL not like", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelIn(List<String> values) {
            addCriterion("CANCEL in", values, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotIn(List<String> values) {
            addCriterion("CANCEL not in", values, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelBetween(String value1, String value2) {
            addCriterion("CANCEL between", value1, value2, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotBetween(String value1, String value2) {
            addCriterion("CANCEL not between", value1, value2, "cancel");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table crowd_payment
     *
     * @mbg.generated do_not_delete_during_merge Fri Sep 21 13:43:03 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
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