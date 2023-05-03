package com.freedom.rule.engine.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author tobebetter
 * @since 2023-05-03
 */
@TableName("user_tb")
public class UserTb implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  private Long id;

  /**
   * 姓名
   */
  private String name;

  /**
   * 年龄
   */
  private Integer age;

  /**
   * 邮箱
   */
  private String email;

  /**
   * 创建人
   */
  private String createBy;

  /**
   * 创建人姓名
   */
  private String createByName;

  /**
   * 创建时间
   */
  private LocalDateTime createDate;

  /**
   * 更新人
   */
  private String updateBy;

  /**
   * 更新人姓名
   */
  private String updateByName;

  /**
   * 更新时间
   */
  private LocalDateTime updateDate;

  /**
   * 版本
   */
  private Integer version;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public String getCreateByName() {
    return createByName;
  }

  public void setCreateByName(String createByName) {
    this.createByName = createByName;
  }

  public LocalDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }

  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  public String getUpdateByName() {
    return updateByName;
  }

  public void setUpdateByName(String updateByName) {
    this.updateByName = updateByName;
  }

  public LocalDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return "UserTb{" +
        "id = " + id +
        ", name = " + name +
        ", age = " + age +
        ", email = " + email +
        ", createBy = " + createBy +
        ", createByName = " + createByName +
        ", createDate = " + createDate +
        ", updateBy = " + updateBy +
        ", updateByName = " + updateByName +
        ", updateDate = " + updateDate +
        ", version = " + version +
        "}";
  }
}
