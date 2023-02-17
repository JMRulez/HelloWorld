public class WorkflowPOJO {
    private String repoName;
    private String workflowName;
    private int totalRun;
    private int devRun;
    private int qaRun;
    private int prdRun;
    private int devopsRun;

    public WorkflowPOJO(String repoName, String workflowName, int totalRun, int devRun, int qaRun, int prdRun, int devopsRun) {
        this.repoName = repoName;
        this.workflowName = workflowName;
        this.totalRun = totalRun;
        this.devRun = devRun;
        this.qaRun = qaRun;
        this.prdRun = prdRun;
        this.devopsRun = devopsRun;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
    }

    public int getDevRun() {
        return devRun;
    }

    public void setDevRun(int devRun) {
        this.devRun = devRun;
    }

    public int getQaRun() {
        return qaRun;
    }

    public void setQaRun(int qaRun) {
        this.qaRun = qaRun;
    }

    public int getPrdRun() {
        return prdRun;
    }

    public void setPrdRun(int prdRun) {
        this.prdRun = prdRun;
    }

    public int getDevopsRun() {
        return devopsRun;
    }

    public void setDevopsRun(int devopsRun) {
        this.devopsRun = devopsRun;
    }
}
