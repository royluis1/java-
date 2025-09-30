public class App {
    public static void main(String[] args) {
        // Crear estudiantes con ambos constructores
        Estudiante e1 = new Estudiante();
        e1.setNombre("Juan");
        e1.setApellido("Pérez");
        e1.setEdad(20);
        e1.setCarrera("Ingeniería");
        e1.setPromedio(0);

        Estudiante e2 = new Estudiante("María", "Gómez", 22, "Medicina", 0);
        Estudiante e3 = new Estudiante("Luis", "Martínez", 19, "Derecho", 0);

        // Crear materias
        Materia m1 = new Materia("Matemáticas", "MAT101", 5, 8);
        Materia m2 = new Materia("Física", "FIS201", 4, 9);
        Materia m3 = new Materia("Biología", "BIO301", 3, 7);

        // Asignar materias a los estudiantes
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);
        e2.agregarMateria(m2);
        e2.agregarMateria(m3);
        e3.agregarMateria(m1);
        e3.agregarMateria(m3);

        // Calcular promedios
        e1.calcularPromedio();
        e2.calcularPromedio();
        e3.calcularPromedio();

        // Almacenar en arreglo
        Estudiante[] estudiantes = {e1, e2, e3};

        System.out.println("Promedios de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " -> " + e.getPromedio());
        }

        // Crear carrera
        Carrera ingenieria = new Carrera("Ingeniería");
        ingenieria.agregarEstudiante(e1);
        ingenieria.agregarEstudiante(e2);
        ingenieria.agregarEstudiante(e3);

        // Mostrar todos los estudiantes
        ingenieria.listarEstudiantes();

        // Buscar estudiante
        Estudiante buscado = ingenieria.buscarEstudiante("María");
        if (buscado != null) {
            System.out.println("Estudiante encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
        }
    }
}
