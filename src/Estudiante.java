public class Estudiante extends Persona{
    public Estudiante(String nombre, String ocupacion, int edad){
        super(nombre, ocupacion, edad);
    }
    public void comer(){
        System.out.println("Como completos buenardos");
    }
    public void dormir(){
        System.out.println("Duermo 6 horas malardas");
    }
    public String hacerLoSuyo(){
        return "Veo anime y netflix";
    }
}
