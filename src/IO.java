
/*
the programs link in github
https://github.com/Ro98h/ADDB_Task3.git
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class IO {
    public IO() {
    }

    public List<JobDetails>  ReadCSVFile(String fileName){
        List<JobDetails> jobDetails = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line = br.readLine();
            if(line != null){
                line = br.readLine();
            }

            while (line != null){
                String [] attributes = line.split(",");
                JobDetails job = createJobDetails(attributes);
                jobDetails.add(job);
                line = br.readLine();
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return jobDetails;
    }

    public JobDetails createJobDetails(String [] metadata){
        int metadataEnd = metadata.length;
        String title = metadata[0];
        String company = metadata[1];
        String location = metadata[2];
        String type = metadata[3];
        String level = metadata[4];
        String yearsOfExp = metadata[5];
        String country = metadata[6];

        return new JobDetails(title,company,location,type,level,yearsOfExp,country);
    }
}
