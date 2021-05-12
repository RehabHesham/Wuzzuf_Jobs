import java.util.*;

public class JobsDataService {
    public static void main(String [] args){
        TestWuzzufJobs testWuzzufJobs = new TestWuzzufJobs();
        testWuzzufJobs.test();
    }

    public static void FilterJobsByYearsExp(List <JobDetails> jobs){
        ArrayList<String> jobexp = new ArrayList<String>();

        System.out.println(jobs.size());
        for(JobDetails job : jobs){
            boolean repeated = false;
            for(String country : jobexp) {
                if (country.contains(job.getYearsOfExp())){
                    repeated = true;
                    break;
                }
            }
            if (repeated == true) continue;
            jobexp.add(job.getYearsOfExp());
        }
        System.out.println(jobexp.size());
        for(String exp : jobexp){
            int count = 0;
            for(JobDetails job : jobs){
                if(exp.contains(job.getYearsOfExp())) {
                    count++;
                    //System.out.println(count);
                }
            }
            System.out.println("the jobs experience "+exp+" has repeated "+count);
        }
    }
    public static void FilterJobsByLevel(List <JobDetails> jobs){
        ArrayList<String> joblevels = new ArrayList<String>();

        System.out.println(jobs.size());
        for(JobDetails job : jobs){
            boolean repeated = false;
            for(String country : joblevels) {
                if (country.contains(job.getLevel())){
                    repeated = true;
                    break;
                }
            }
            if (repeated == true) continue;
            joblevels.add(job.getLevel());
        }
        System.out.println(joblevels.size());
        for(String level : joblevels){
            int count = 0;
            for(JobDetails job : jobs){
                if(level.contains(job.getLevel())) {
                    count++;
                    //System.out.println(count);
                }
            }
            System.out.println("the jobs level "+level+" has repeated "+count);
        }
    }
    public static void FilterJobsByTitle(List<JobDetails> jobs){
        ArrayList<String> jobTitles = new ArrayList<String>();

        System.out.println(jobs.size());
        for(JobDetails job : jobs){
            boolean repeated = false;
            for(String country : jobTitles) {
                if (country.contains(job.getTitle())){
                    repeated = true;
                    break;
                }
            }
            if (repeated == true) continue;
            jobTitles.add(job.getTitle());
        }
        System.out.println(jobTitles.size());
        for(String title : jobTitles){
            int count = 0;
            for(JobDetails job : jobs){
                if(title.contains(job.getTitle())) {
                    count++;
                    //System.out.println(count);
                }
            }
            System.out.println("the jobs "+title+" has repeated "+count);
        }
    }

    public static void FilterJobsByCountry(List <JobDetails> jobs){
        ArrayList<String> jobCountries = new ArrayList<String>();

        System.out.println(jobs.size());
        for(JobDetails job : jobs){
            boolean repeated = false;
            for(String country : jobCountries) {
                if (country.contains(job.getCountry())){
                    repeated = true;
                    break;
                }
            }
            if (repeated == true) continue;
            jobCountries.add(job.getCountry());
        }
        System.out.println(jobCountries.size());
        for(String country : jobCountries){
           int count = 0;
            for(JobDetails job : jobs){
                if(country.contains(job.getCountry())) {
                    count++;
                    //System.out.println(count);
                }
            }
            System.out.println("the jobs in country  "+country+" has repeated "+count);
        }
    }
}
