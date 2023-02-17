import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelParser {
    public static void main(String[] args) {
        String csvFile = "path/to/csv/file.csv";
        String line;
        String csvDelimiter = ",";
        List<WorkflowPOJO> workFlows = new ArrayList<>();
        WorkflowPOJO pojo=null;
        String repoName="";
        String workFlowName="";
        String runnerName="";
        boolean containsObj = false;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                String[] fields = line.split(csvDelimiter);
                repoName = fields[0];
                workFlowName = fields[1];
                runnerName = fields[1];

                for (WorkflowPOJO workFlow : workFlows) {
                    if (workFlow.getRepoName().equals(repoName) && (workFlow.getWorkflowName().equals(workFlowName))) {

                        if (runnerName.contains("-dev")){
                            workFlow.setTotalRun(workFlow.getTotalRun()+1);
                            workFlow.setDevRun(workFlow.getDevRun()+1);
                        }else if(runnerName.contains("-qa")){
                            workFlow.setTotalRun(workFlow.getTotalRun()+1);
                            workFlow.setQaRun(workFlow.getQaRun()+1);
                        }else if(runnerName.contains("-prd")){
                            workFlow.setTotalRun(workFlow.getTotalRun()+1);
                            workFlow.setPrdRun(workFlow.getPrdRun()+1);
                        }else if(runnerName.contains("-devops")){
                            workFlow.setTotalRun(workFlow.getTotalRun()+1);
                            workFlow.setDevopsRun(workFlow.getDevopsRun()+1);
                        }else{
                            System.out.println("New Runner Type "+ runnerName);
                        }
                        containsObj = true;
                        break;
                    }
                }

                if(containsObj){

                }else{
                    System.out.println("New Entry to List");
                    pojo = new WorkflowPOJO(repoName,workFlowName,0,0,0,0,0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /*
                StringBuilder buf = new StringBuilder();
        //String city,state;
        buf.append("RepoName").append(",").append("WorkFlowName").append(",").append("TotalRuns").append(",").append("Dev").append("QA").append("Prd").append(",").append("DevOps").append(System.lineSeparator());
        for(WorkflowPOJO pOJO : workFlows){
            //buf.append(servicePOJO.getName()).append(",").append(servicePOJO.getFormattedName()).append(",").append(servicePOJO.getStoreNum()).append(",").append(servicePOJO.getSysId()).append(",").append("\"").append(servicePOJO.getState()).append("\"").append(",").append("\"").append(servicePOJO.getCity()).append("\"").append(System.lineSeparator());
            buf.append(pOJO.getName()).append(",").append(servicePOJO.getFormattedName()).append(",").append(servicePOJO.getStoreNum()).append(",").append(servicePOJO.getSysId()).append(",").append(servicePOJO.getState()).append(",").append(servicePOJO.getCity()).append(System.lineSeparator());
        }
        File file = new File(outputLoc);
        file.getParentFile().mkdirs();
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(buf.toString());
        bufferedWriter.close();
        */
    }
}
