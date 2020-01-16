package model;


import javax.persistence.*;

@Entity
@Table
public class Tasks {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long taskId;
@Column
private String taskDesc;
@Column
private Boolean complete;
@Column
private TaskLevel level;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public TaskLevel getLevel() {
        return level;
    }

    public void setLevel(TaskLevel level) {
        this.level = level;
    }
}
