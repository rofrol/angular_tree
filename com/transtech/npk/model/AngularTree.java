package com.transtech.npk.model;

import java.util.List;

public class AngularTree {
  private Long id;
  private Long parentId;
  private String name;
  boolean checked;
  private List<AngularTree> children;
  public AngularTree(){};
  public AngularTree(Long id, String name, boolean checked, List<AngularTree> children, Long parentId) {
    super();
    this.id = id;
    this.name = name;
    this.checked = checked;
    this.children = children;
    this.parentId= parentId;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId= parentId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public boolean isChecked() {
    return checked;
  }
  public void setChecked(boolean checked) {
    this.checked = checked;
  }
  public List<AngularTree> getChildren() {
    return children;
  }
  public void setChildren(List<AngularTree> children) {
    this.children = children;
  }
  @Override
  public String toString() {
    return "[id=" + id + ", name=" + name + ", checked="
        + checked + ", children=" + children + ", parentId=" + parentId+ "]";
  }
}
