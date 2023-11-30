/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
        Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
        Nel main dichiarare un oggetto di tipo Auto.*/
public class Auto {

    private int cilindrata;
    private String marca;
    private String modello;

    public Auto (int cilindrata, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
    }

    //Getter
    public int getCilindrata(){
        return cilindrata;
    }

    public String getMarca(){
        return marca;
    }

    public String getModello(){
        return modello;
    }

    //Setter
    public int setCilindrata(){
        return cilindrata;
    }

    public String setMarca(){
        return marca;
    }

    public String setModello(){
        return modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
