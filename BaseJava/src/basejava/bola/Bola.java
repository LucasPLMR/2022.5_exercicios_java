package basejava.bola;

public class Bola {
    private String cor;
    private double circ;
    private String material;
    
    public void trocaCor(String cor){
        this.cor = cor;
    }
    public String mostrarCor(){
        return this.cor;
    }
    public void trocaCirc(double circ){
        this.circ = circ;
    }
    public double mostrarCirc(){
        return this.circ;
    }
    public void trocaMaterial(String material){
        this.material = material;
    }
    public String mostrarMaterial(){
        return this.material;
    }
    
}
