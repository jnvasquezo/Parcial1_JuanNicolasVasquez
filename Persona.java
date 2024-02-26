public class Persona {
    //propiedades
    private static String nombre, rol, curso; //se hace uso del encapsulamiento
    private  static  short edad;
    private static int salario;

//aplicamos el polimorfismo
    public Persona(String nombre, String rol, String curso, short edad){
        this.nombre = nombre;
        this.rol = rol;
        this.curso = curso;
        this.edad = edad;
        this.salario = 0;
    }
//aplicamos el polimorfismo
    public Persona(String nombre, String curso, short edad){
        this.nombre = nombre;
        this.rol = "Docente";
        this.curso = curso;
        this.edad = edad;
        this.salario = 4200000;
    }

    public  Persona(String nombre, short edad){
        this.nombre = nombre;
        this.rol = "Admistrativo";
        this.curso = "Ninguno";
        this.edad = edad;
        this.salario = 3600000;
    }

    public  static void crisis(String accion){
        Persona.rol = accion;
    }

    public  static String Emergencia(){
        return nombre;
    }

//se crean los getter y setter de la clase

    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getRol() {
        return rol;
    }
    public static void setRol(String rol) {
        Persona.rol = rol;
    }

    public static String getCurso() {
        return curso;
    }
    public static void setCurso(String curso) {
        Persona.curso = curso;
    }

    public static short getEdad() {
        return edad;
    }
    public static void setEdad(short edad) {
        Persona.edad = edad;
    }

    public static int getSalario() {
        return salario;
    }
    public static void setSalario(int salario) {
        Persona.salario = salario;
    }
}
