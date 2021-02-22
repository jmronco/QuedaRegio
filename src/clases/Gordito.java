package clases;

public class Gordito {
    //Atributos de la clase
    private String rut;
    private String nombre;
    private int edad;
    private String fonoContacto;
    private double[] pesoAnual;

    //Constructor vacío
    public Gordito() {
    }

    //Constructor con parámetros
    public Gordito(String rut, String nombre, int edad, String fonoContacto) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fonoContacto = fonoContacto;
        this.pesoAnual = new double[12];

        for(int i=0; i<pesoAnual.length;i++){
            pesoAnual[i] = (Math.random()*(250-70)+1);
        }
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFonoContacto() {
        return fonoContacto;
    }

    public double[] getPesoAnual() {
        return pesoAnual;
    }

    public void setFonoContacto(String fonoContacto) {
        this.fonoContacto = fonoContacto;
    }

    public double pesoPromedio(){
    double promedio = 0, suma = 0;
    for(int i=0; i<this.pesoAnual.length;i++){
        //promedio = (this.pesoAnual[i])/12;
        suma = suma + this.pesoAnual[i];
        }
    promedio = suma/12;
    return promedio;
    }
    public double indiceMasaCorporal(int mes, double estatura){
        double indice = this.pesoAnual[mes-1]/ (estatura*estatura);
        return indice;
    }

    public double masDeXKilos(double[] pesoMayor, double pesoX) {
        int mes = 0;
        for (int i = 0; i < pesoMayor.length; i++) {
            if (pesoMayor[i] > pesoX) {
                pesoX = pesoMayor[i];
                mes = i + 1;
            } else {
                pesoMayor = null;//revisar
            }

        }
        return pesoMayor[mes];
    }

    public String ultimoMes(double estatura){
        String diagnostico = "";
        if(this.indiceMasaCorporal(12,estatura) >= 18.5 && this.indiceMasaCorporal(12,estatura) < 25){
            diagnostico = "Normal";
        }
        if(this.indiceMasaCorporal(12,estatura) >= 25 && this.indiceMasaCorporal(12,estatura) < 30){
            diagnostico = "Sobrepeso";
        }
        if(this.indiceMasaCorporal(12,estatura) >=30){
            diagnostico=  "Obeso";
        }
        return diagnostico;
    }
}
