package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeCollectionBean {
    private List<String> initTasks;
    private Set<String> date;
    private Map<String, String> finishTask;

    public List<String> getInitTasks() {
        return initTasks;
    }

    public void setInitTasks(List<String> initTasks) {
        this.initTasks = initTasks;
    }

    public Set<String> getDate() {
        return date;
    }

    public void setDate(Set<String> date) {
        this.date = date;
    }

    public Map<String, String> getFinishTask() {
        return finishTask;
    }

    public void setFinishTask(Map<String, String> finishTask) {
        this.finishTask = finishTask;
    }

    public EmployeeCollectionBean(List<String> initTasks, Set<String> date, Map<String, String> finishTask) {
        this.initTasks = initTasks;
        this.date = date;
        this.finishTask = finishTask;
    }

    public EmployeeCollectionBean() {
        super();
    }

    @Override
    public String toString() {
        return "EmployeeCollectionBean{" +
                "initTasks=" + initTasks +
                ", date=" + date +
                ", finishTask=" + finishTask +
                '}';
    }
}
