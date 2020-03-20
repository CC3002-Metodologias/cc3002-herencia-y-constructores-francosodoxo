public class Academico extends Persona {
    private String paper;
    public Academico(String nombre, String ocupacion, int edad, String paper){
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }
    public void comer(){
        System.out.println("Como mi comida casera buenarda");
    }
    public String hacerLoSuyo(){
        return "Ocupo Zoom para mis clases buenardas";
    }
    public String publicarPaper(){
        return paper;
    }
}
