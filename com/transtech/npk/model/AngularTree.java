package com.transtech.npk.model;

import java.util.List;

public class AngularTree {
  private long id;
  private String name;
  boolean checked;
  private List<AngularTree> children;
  public AngularTree(){};
  public AngularTree(long id, String name, boolean checked,
      List<AngularTree> children) {
    super();
    this.id = id;
    this.name = name;
    this.checked = checked;
    this.children = children;
  }
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
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
        + checked + ", children=" + children + "]";
  }
  
}
