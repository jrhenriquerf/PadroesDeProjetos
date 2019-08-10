public class Gato implements Animal {
	private AnimalCoresFactory cores;
    private Cor cor;

    public Gato( AnimalCoresFactory cores ){
        this.cores = cores;
    }

    public void setCor(){
    	cor = cores.setCor();
    }
}
