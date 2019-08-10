public class Peixe implements Animal {
	private AnimalCoresFactory cores;
    private Cor cor;

    public Peixe( AnimalCoresFactory cores ){
        this.cores = cores;
    }

    public void setCor(){
    	cor = cores.setCor();
    }
}
