package lifecyclemethods;

/**
 * Created by Ufuk on 02-05-15.
 */
public class Employee {

    private String name;
    private Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
