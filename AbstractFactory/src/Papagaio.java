public class Papagaio implements Animal {
	private AnimalCoresFactory cores;
    private Cor cor;

    public Papagaio( AnimalCoresFactory cores ){
        this.cores = cores;
    }

    public void setCor(){
    	cor = cores.setCor();
    }
}
