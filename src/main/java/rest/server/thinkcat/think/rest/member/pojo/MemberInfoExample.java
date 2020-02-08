package rest.server.thinkcat.think.rest.member.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUuidQqIsNull() {
            addCriterion("uuid_qq is null");
            return (Criteria) this;
        }

        public Criteria andUuidQqIsNotNull() {
            addCriterion("uuid_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUuidQqEqualTo(String value) {
            addCriterion("uuid_qq =", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqNotEqualTo(String value) {
            addCriterion("uuid_qq <>", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqGreaterThan(String value) {
            addCriterion("uuid_qq >", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqGreaterThanOrEqualTo(String value) {
            addCriterion("uuid_qq >=", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqLessThan(String value) {
            addCriterion("uuid_qq <", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqLessThanOrEqualTo(String value) {
            addCriterion("uuid_qq <=", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqLike(String value) {
            addCriterion("uuid_qq like", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqNotLike(String value) {
            addCriterion("uuid_qq not like", value, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqIn(List<String> values) {
            addCriterion("uuid_qq in", values, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqNotIn(List<String> values) {
            addCriterion("uuid_qq not in", values, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqBetween(String value1, String value2) {
            addCriterion("uuid_qq between", value1, value2, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidQqNotBetween(String value1, String value2) {
            addCriterion("uuid_qq not between", value1, value2, "uuidQq");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinIsNull() {
            addCriterion("uuid_weixin is null");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinIsNotNull() {
            addCriterion("uuid_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinEqualTo(String value) {
            addCriterion("uuid_weixin =", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinNotEqualTo(String value) {
            addCriterion("uuid_weixin <>", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinGreaterThan(String value) {
            addCriterion("uuid_weixin >", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("uuid_weixin >=", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinLessThan(String value) {
            addCriterion("uuid_weixin <", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinLessThanOrEqualTo(String value) {
            addCriterion("uuid_weixin <=", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinLike(String value) {
            addCriterion("uuid_weixin like", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinNotLike(String value) {
            addCriterion("uuid_weixin not like", value, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinIn(List<String> values) {
            addCriterion("uuid_weixin in", values, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinNotIn(List<String> values) {
            addCriterion("uuid_weixin not in", values, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinBetween(String value1, String value2) {
            addCriterion("uuid_weixin between", value1, value2, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andUuidWeixinNotBetween(String value1, String value2) {
            addCriterion("uuid_weixin not between", value1, value2, "uuidWeixin");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andVipStatusIsNull() {
            addCriterion("vip_status is null");
            return (Criteria) this;
        }

        public Criteria andVipStatusIsNotNull() {
            addCriterion("vip_status is not null");
            return (Criteria) this;
        }

        public Criteria andVipStatusEqualTo(Integer value) {
            addCriterion("vip_status =", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotEqualTo(Integer value) {
            addCriterion("vip_status <>", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusGreaterThan(Integer value) {
            addCriterion("vip_status >", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_status >=", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusLessThan(Integer value) {
            addCriterion("vip_status <", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusLessThanOrEqualTo(Integer value) {
            addCriterion("vip_status <=", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusIn(List<Integer> values) {
            addCriterion("vip_status in", values, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotIn(List<Integer> values) {
            addCriterion("vip_status not in", values, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusBetween(Integer value1, Integer value2) {
            addCriterion("vip_status between", value1, value2, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_status not between", value1, value2, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("register_time like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("register_time not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(String value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(String value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(String value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(String value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLike(String value) {
            addCriterion("last_login_time like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotLike(String value) {
            addCriterion("last_login_time not like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<String> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<String> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(String value1, String value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(String value1, String value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andPersonDescIsNull() {
            addCriterion("person_desc is null");
            return (Criteria) this;
        }

        public Criteria andPersonDescIsNotNull() {
            addCriterion("person_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDescEqualTo(String value) {
            addCriterion("person_desc =", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescNotEqualTo(String value) {
            addCriterion("person_desc <>", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescGreaterThan(String value) {
            addCriterion("person_desc >", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescGreaterThanOrEqualTo(String value) {
            addCriterion("person_desc >=", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescLessThan(String value) {
            addCriterion("person_desc <", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescLessThanOrEqualTo(String value) {
            addCriterion("person_desc <=", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescLike(String value) {
            addCriterion("person_desc like", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescNotLike(String value) {
            addCriterion("person_desc not like", value, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescIn(List<String> values) {
            addCriterion("person_desc in", values, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescNotIn(List<String> values) {
            addCriterion("person_desc not in", values, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescBetween(String value1, String value2) {
            addCriterion("person_desc between", value1, value2, "personDesc");
            return (Criteria) this;
        }

        public Criteria andPersonDescNotBetween(String value1, String value2) {
            addCriterion("person_desc not between", value1, value2, "personDesc");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlIsNull() {
            addCriterion("person_img_url is null");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlIsNotNull() {
            addCriterion("person_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlEqualTo(String value) {
            addCriterion("person_img_url =", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlNotEqualTo(String value) {
            addCriterion("person_img_url <>", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlGreaterThan(String value) {
            addCriterion("person_img_url >", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("person_img_url >=", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlLessThan(String value) {
            addCriterion("person_img_url <", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlLessThanOrEqualTo(String value) {
            addCriterion("person_img_url <=", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlLike(String value) {
            addCriterion("person_img_url like", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlNotLike(String value) {
            addCriterion("person_img_url not like", value, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlIn(List<String> values) {
            addCriterion("person_img_url in", values, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlNotIn(List<String> values) {
            addCriterion("person_img_url not in", values, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlBetween(String value1, String value2) {
            addCriterion("person_img_url between", value1, value2, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andPersonImgUrlNotBetween(String value1, String value2) {
            addCriterion("person_img_url not between", value1, value2, "personImgUrl");
            return (Criteria) this;
        }

        public Criteria andImPriceIsNull() {
            addCriterion("im_price is null");
            return (Criteria) this;
        }

        public Criteria andImPriceIsNotNull() {
            addCriterion("im_price is not null");
            return (Criteria) this;
        }

        public Criteria andImPriceEqualTo(Long value) {
            addCriterion("im_price =", value, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceNotEqualTo(Long value) {
            addCriterion("im_price <>", value, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceGreaterThan(Long value) {
            addCriterion("im_price >", value, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("im_price >=", value, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceLessThan(Long value) {
            addCriterion("im_price <", value, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceLessThanOrEqualTo(Long value) {
            addCriterion("im_price <=", value, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceIn(List<Long> values) {
            addCriterion("im_price in", values, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceNotIn(List<Long> values) {
            addCriterion("im_price not in", values, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceBetween(Long value1, Long value2) {
            addCriterion("im_price between", value1, value2, "imPrice");
            return (Criteria) this;
        }

        public Criteria andImPriceNotBetween(Long value1, Long value2) {
            addCriterion("im_price not between", value1, value2, "imPrice");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeIsNull() {
            addCriterion("vip_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeIsNotNull() {
            addCriterion("vip_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("vip_begin_time =", value, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("vip_begin_time <>", value, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("vip_begin_time >", value, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_begin_time >=", value, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("vip_begin_time <", value, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_begin_time <=", value, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("vip_begin_time in", values, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("vip_begin_time not in", values, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_begin_time between", value1, value2, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_begin_time not between", value1, value2, "vipBeginTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeIsNull() {
            addCriterion("vip_end_time is null");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeIsNotNull() {
            addCriterion("vip_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("vip_end_time =", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("vip_end_time <>", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("vip_end_time >", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_end_time >=", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("vip_end_time <", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_end_time <=", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("vip_end_time in", values, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("vip_end_time not in", values, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_end_time between", value1, value2, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_end_time not between", value1, value2, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinIsNull() {
            addCriterion("virtual_coin is null");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinIsNotNull() {
            addCriterion("virtual_coin is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinEqualTo(Long value) {
            addCriterion("virtual_coin =", value, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinNotEqualTo(Long value) {
            addCriterion("virtual_coin <>", value, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinGreaterThan(Long value) {
            addCriterion("virtual_coin >", value, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinGreaterThanOrEqualTo(Long value) {
            addCriterion("virtual_coin >=", value, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinLessThan(Long value) {
            addCriterion("virtual_coin <", value, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinLessThanOrEqualTo(Long value) {
            addCriterion("virtual_coin <=", value, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinIn(List<Long> values) {
            addCriterion("virtual_coin in", values, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinNotIn(List<Long> values) {
            addCriterion("virtual_coin not in", values, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinBetween(Long value1, Long value2) {
            addCriterion("virtual_coin between", value1, value2, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andVirtualCoinNotBetween(Long value1, Long value2) {
            addCriterion("virtual_coin not between", value1, value2, "virtualCoin");
            return (Criteria) this;
        }

        public Criteria andFansIsNull() {
            addCriterion("fans is null");
            return (Criteria) this;
        }

        public Criteria andFansIsNotNull() {
            addCriterion("fans is not null");
            return (Criteria) this;
        }

        public Criteria andFansEqualTo(Integer value) {
            addCriterion("fans =", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotEqualTo(Integer value) {
            addCriterion("fans <>", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThan(Integer value) {
            addCriterion("fans >", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans >=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThan(Integer value) {
            addCriterion("fans <", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThanOrEqualTo(Integer value) {
            addCriterion("fans <=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansIn(List<Integer> values) {
            addCriterion("fans in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotIn(List<Integer> values) {
            addCriterion("fans not in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansBetween(Integer value1, Integer value2) {
            addCriterion("fans between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotBetween(Integer value1, Integer value2) {
            addCriterion("fans not between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andConcernsIsNull() {
            addCriterion("concerns is null");
            return (Criteria) this;
        }

        public Criteria andConcernsIsNotNull() {
            addCriterion("concerns is not null");
            return (Criteria) this;
        }

        public Criteria andConcernsEqualTo(Integer value) {
            addCriterion("concerns =", value, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsNotEqualTo(Integer value) {
            addCriterion("concerns <>", value, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsGreaterThan(Integer value) {
            addCriterion("concerns >", value, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsGreaterThanOrEqualTo(Integer value) {
            addCriterion("concerns >=", value, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsLessThan(Integer value) {
            addCriterion("concerns <", value, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsLessThanOrEqualTo(Integer value) {
            addCriterion("concerns <=", value, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsIn(List<Integer> values) {
            addCriterion("concerns in", values, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsNotIn(List<Integer> values) {
            addCriterion("concerns not in", values, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsBetween(Integer value1, Integer value2) {
            addCriterion("concerns between", value1, value2, "concerns");
            return (Criteria) this;
        }

        public Criteria andConcernsNotBetween(Integer value1, Integer value2) {
            addCriterion("concerns not between", value1, value2, "concerns");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
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

        public Criteria andVideoPriceIsNull() {
            addCriterion("video_price is null");
            return (Criteria) this;
        }

        public Criteria andVideoPriceIsNotNull() {
            addCriterion("video_price is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPriceEqualTo(Long value) {
            addCriterion("video_price =", value, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceNotEqualTo(Long value) {
            addCriterion("video_price <>", value, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceGreaterThan(Long value) {
            addCriterion("video_price >", value, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("video_price >=", value, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceLessThan(Long value) {
            addCriterion("video_price <", value, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceLessThanOrEqualTo(Long value) {
            addCriterion("video_price <=", value, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceIn(List<Long> values) {
            addCriterion("video_price in", values, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceNotIn(List<Long> values) {
            addCriterion("video_price not in", values, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceBetween(Long value1, Long value2) {
            addCriterion("video_price between", value1, value2, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andVideoPriceNotBetween(Long value1, Long value2) {
            addCriterion("video_price not between", value1, value2, "videoPrice");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeIsNull() {
            addCriterion("last_open_video_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeIsNotNull() {
            addCriterion("last_open_video_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeEqualTo(Date value) {
            addCriterion("last_open_video_time =", value, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeNotEqualTo(Date value) {
            addCriterion("last_open_video_time <>", value, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeGreaterThan(Date value) {
            addCriterion("last_open_video_time >", value, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_open_video_time >=", value, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeLessThan(Date value) {
            addCriterion("last_open_video_time <", value, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_open_video_time <=", value, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeIn(List<Date> values) {
            addCriterion("last_open_video_time in", values, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeNotIn(List<Date> values) {
            addCriterion("last_open_video_time not in", values, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeBetween(Date value1, Date value2) {
            addCriterion("last_open_video_time between", value1, value2, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenVideoTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_open_video_time not between", value1, value2, "lastOpenVideoTime");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagIsNull() {
            addCriterion("anchor_flag is null");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagIsNotNull() {
            addCriterion("anchor_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagEqualTo(Integer value) {
            addCriterion("anchor_flag =", value, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagNotEqualTo(Integer value) {
            addCriterion("anchor_flag <>", value, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagGreaterThan(Integer value) {
            addCriterion("anchor_flag >", value, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchor_flag >=", value, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagLessThan(Integer value) {
            addCriterion("anchor_flag <", value, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagLessThanOrEqualTo(Integer value) {
            addCriterion("anchor_flag <=", value, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagIn(List<Integer> values) {
            addCriterion("anchor_flag in", values, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagNotIn(List<Integer> values) {
            addCriterion("anchor_flag not in", values, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagBetween(Integer value1, Integer value2) {
            addCriterion("anchor_flag between", value1, value2, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("anchor_flag not between", value1, value2, "anchorFlag");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdIsNull() {
            addCriterion("anchor_level_id is null");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdIsNotNull() {
            addCriterion("anchor_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdEqualTo(Integer value) {
            addCriterion("anchor_level_id =", value, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdNotEqualTo(Integer value) {
            addCriterion("anchor_level_id <>", value, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdGreaterThan(Integer value) {
            addCriterion("anchor_level_id >", value, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchor_level_id >=", value, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdLessThan(Integer value) {
            addCriterion("anchor_level_id <", value, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("anchor_level_id <=", value, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdIn(List<Integer> values) {
            addCriterion("anchor_level_id in", values, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdNotIn(List<Integer> values) {
            addCriterion("anchor_level_id not in", values, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("anchor_level_id between", value1, value2, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andAnchorLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("anchor_level_id not between", value1, value2, "anchorLevelId");
            return (Criteria) this;
        }

        public Criteria andResourcesIsNull() {
            addCriterion("resources is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIsNotNull() {
            addCriterion("resources is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesEqualTo(Integer value) {
            addCriterion("resources =", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotEqualTo(Integer value) {
            addCriterion("resources <>", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesGreaterThan(Integer value) {
            addCriterion("resources >", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesGreaterThanOrEqualTo(Integer value) {
            addCriterion("resources >=", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLessThan(Integer value) {
            addCriterion("resources <", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLessThanOrEqualTo(Integer value) {
            addCriterion("resources <=", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesIn(List<Integer> values) {
            addCriterion("resources in", values, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotIn(List<Integer> values) {
            addCriterion("resources not in", values, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesBetween(Integer value1, Integer value2) {
            addCriterion("resources between", value1, value2, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotBetween(Integer value1, Integer value2) {
            addCriterion("resources not between", value1, value2, "resources");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(String value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(String value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(String value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(String value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(String value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(String value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLike(String value) {
            addCriterion("sequence like", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotLike(String value) {
            addCriterion("sequence not like", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<String> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<String> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(String value1, String value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(String value1, String value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNull() {
            addCriterion("application_time is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNotNull() {
            addCriterion("application_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeEqualTo(String value) {
            addCriterion("application_time =", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotEqualTo(String value) {
            addCriterion("application_time <>", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThan(String value) {
            addCriterion("application_time >", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("application_time >=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThan(String value) {
            addCriterion("application_time <", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThanOrEqualTo(String value) {
            addCriterion("application_time <=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLike(String value) {
            addCriterion("application_time like", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotLike(String value) {
            addCriterion("application_time not like", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIn(List<String> values) {
            addCriterion("application_time in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotIn(List<String> values) {
            addCriterion("application_time not in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeBetween(String value1, String value2) {
            addCriterion("application_time between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotBetween(String value1, String value2) {
            addCriterion("application_time not between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeIsNull() {
            addCriterion("become_anchor_time is null");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeIsNotNull() {
            addCriterion("become_anchor_time is not null");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeEqualTo(String value) {
            addCriterion("become_anchor_time =", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeNotEqualTo(String value) {
            addCriterion("become_anchor_time <>", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeGreaterThan(String value) {
            addCriterion("become_anchor_time >", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeGreaterThanOrEqualTo(String value) {
            addCriterion("become_anchor_time >=", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeLessThan(String value) {
            addCriterion("become_anchor_time <", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeLessThanOrEqualTo(String value) {
            addCriterion("become_anchor_time <=", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeLike(String value) {
            addCriterion("become_anchor_time like", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeNotLike(String value) {
            addCriterion("become_anchor_time not like", value, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeIn(List<String> values) {
            addCriterion("become_anchor_time in", values, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeNotIn(List<String> values) {
            addCriterion("become_anchor_time not in", values, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeBetween(String value1, String value2) {
            addCriterion("become_anchor_time between", value1, value2, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andBecomeAnchorTimeNotBetween(String value1, String value2) {
            addCriterion("become_anchor_time not between", value1, value2, "becomeAnchorTime");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNull() {
            addCriterion("alipay_account is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNotNull() {
            addCriterion("alipay_account is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountEqualTo(String value) {
            addCriterion("alipay_account =", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotEqualTo(String value) {
            addCriterion("alipay_account <>", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThan(String value) {
            addCriterion("alipay_account >", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_account >=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThan(String value) {
            addCriterion("alipay_account <", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThanOrEqualTo(String value) {
            addCriterion("alipay_account <=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLike(String value) {
            addCriterion("alipay_account like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotLike(String value) {
            addCriterion("alipay_account not like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIn(List<String> values) {
            addCriterion("alipay_account in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotIn(List<String> values) {
            addCriterion("alipay_account not in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountBetween(String value1, String value2) {
            addCriterion("alipay_account between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotBetween(String value1, String value2) {
            addCriterion("alipay_account not between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIsNull() {
            addCriterion("video_flag is null");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIsNotNull() {
            addCriterion("video_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFlagEqualTo(Integer value) {
            addCriterion("video_flag =", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotEqualTo(Integer value) {
            addCriterion("video_flag <>", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagGreaterThan(Integer value) {
            addCriterion("video_flag >", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_flag >=", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLessThan(Integer value) {
            addCriterion("video_flag <", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLessThanOrEqualTo(Integer value) {
            addCriterion("video_flag <=", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIn(List<Integer> values) {
            addCriterion("video_flag in", values, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotIn(List<Integer> values) {
            addCriterion("video_flag not in", values, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagBetween(Integer value1, Integer value2) {
            addCriterion("video_flag between", value1, value2, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("video_flag not between", value1, value2, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(Integer value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(Integer value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(Integer value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(Integer value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(Integer value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<Integer> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<Integer> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(Integer value1, Integer value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andJimPasswordIsNull() {
            addCriterion("jim_password is null");
            return (Criteria) this;
        }

        public Criteria andJimPasswordIsNotNull() {
            addCriterion("jim_password is not null");
            return (Criteria) this;
        }

        public Criteria andJimPasswordEqualTo(String value) {
            addCriterion("jim_password =", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordNotEqualTo(String value) {
            addCriterion("jim_password <>", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordGreaterThan(String value) {
            addCriterion("jim_password >", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("jim_password >=", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordLessThan(String value) {
            addCriterion("jim_password <", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordLessThanOrEqualTo(String value) {
            addCriterion("jim_password <=", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordLike(String value) {
            addCriterion("jim_password like", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordNotLike(String value) {
            addCriterion("jim_password not like", value, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordIn(List<String> values) {
            addCriterion("jim_password in", values, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordNotIn(List<String> values) {
            addCriterion("jim_password not in", values, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordBetween(String value1, String value2) {
            addCriterion("jim_password between", value1, value2, "jimPassword");
            return (Criteria) this;
        }

        public Criteria andJimPasswordNotBetween(String value1, String value2) {
            addCriterion("jim_password not between", value1, value2, "jimPassword");
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