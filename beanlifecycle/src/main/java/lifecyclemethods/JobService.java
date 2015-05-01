package lifecyclemethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 02-05-15.
 */
public class JobService {

    private Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println(TAG(this) + " init method called");
        if (job.getTitle() == null) {
            job.setTitle("CEO");
        }
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println(TAG(this) + " destroy method called");
        // TODO Job.setName(null), Job.destroy()
    }
}
