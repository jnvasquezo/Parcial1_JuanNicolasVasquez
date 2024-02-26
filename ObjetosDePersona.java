public class ObjetosDePersona {
    public static  void main(String[] Args){
        Persona persona1 = new Persona("Evelyn Rendón", "Estudiante", "Estadistica", (short)23);
        persona1.crisis("Damnificado");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Rol: "+ persona1.getRol());
        System.out.println("Curso: " + persona1.getCurso());
        System.out.println("edad: " + persona1.getEdad());
        System.out.println("Salario: " + persona1.getSalario());
        System.out.println("Emergencia: "+ persona1.Emergencia());
        System.out.println("-----------------------------------");

        Persona persona2 = new Persona("Diego Cruz","Lenuage de programacion",(short)30);
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Rol: "+ persona2.getRol());
        System.out.println("Curso: " + persona2.getCurso());
        System.out.println("edad: " + persona2.getEdad());
        System.out.println("Salario: " + persona2.getSalario());
        System.out.println("Emergencia: "+ persona2.Emergencia());
        System.out.println("-----------------------------------");

        Persona persona3 = new Persona("Claudia Rectora",(short)40);
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Rol: "+ persona3.getRol());
        System.out.println("Curso: " + persona3.getCurso());
        System.out.println("edad: " + persona3.getEdad());
        System.out.println("Salario: " + persona3.getSalario());
        System.out.println("Emergencia: "+ persona3.Emergencia());
        System.out.println("-----------------------------------");

        Persona persona4 = new Persona("Cristiano Ronaldo", (short)39);
        persona4.crisis("Damnificado");
        System.out.println("Nombre:" + persona4.getNombre());
        System.out.println("Edad: "+ (short)39);
        System.out.println("rol: " + persona4.getRol());

    }
}
