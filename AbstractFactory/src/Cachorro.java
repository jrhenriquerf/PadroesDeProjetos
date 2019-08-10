public class Cachorro implements Animal {
	private AnimalCoresFactory cores;
    private Cor cor;

    public Cachorro( AnimalCoresFactory cores ){
        this.cores = cores;
    }

    public void setCor(){
    	cor = cores.setCor();
    }
}
