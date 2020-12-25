package com.itgaoshu.bean;
//项目类别
public class ProjectType {
    private Integer projectId;
    private String ProjectName;//项目大类名

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }
}
