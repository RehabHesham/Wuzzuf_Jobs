import java.util.List;

public class TestWuzzufJobs {

    public void test(){
        IO jobsDataService = new IO();
        List<JobDetails> jobDetails = jobsDataService.ReadCSVFile("D:\\4th-year\\2nd_term\\ADDB\\sec\\sec4\\Task4\\Wuzzuf_Jobs1.csv");
        JobsDataService JobService = new JobsDataService();
        /*
        int i = 0;
        for(JobDetails job : jobDetails){
            System.out.println("# " + (i++) + job);
        }
        */

        JobService.FilterJobsByTitle(jobDetails);
        JobService.FilterJobsByCountry(jobDetails);
        JobService.FilterJobsByLevel(jobDetails);
        JobService.FilterJobsByYearsExp(jobDetails);
    }
}
