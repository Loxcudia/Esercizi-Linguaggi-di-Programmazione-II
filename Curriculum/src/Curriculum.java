import java.util.*;

public class Curriculum {

    private List<Job> jobList;
    private String nome;

    public Curriculum(String nome)
    {
        this.nome = nome;
        jobList = new ArrayList<Job>();
    }
    public Job addJob(String nuovoNome, Integer nuovoAnno)
    {
        Job nuovoJob = new Job(nome, nuovoAnno);
        this.jobList.add(nuovoJob);
        return nuovoJob;
    }
    public class Job
    {
        private String descrizione;
        private Integer anno;
        private Integer posizione;
        private Job(String descrizione, Integer anno)
        {
            this.descrizione = descrizione;
            this.anno = anno;
            if(jobList.size() == 0)
                this.posizione = 0;
            else
                this.posizione = jobList.size();
        }

        public Job next()
        {
            Job tmp;
            try
            {
               tmp = jobList.get(posizione + 1);
            }
            catch(IndexOutOfBoundsException e)
            {
                tmp = null;
            }
            return tmp;
        }
        @Override
        public String toString()
        {
            String tmp = this.descrizione + ": " + this.anno;
            return tmp;
        }
    }
}
