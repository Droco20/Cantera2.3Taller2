package paquetes;

/**
 * Clase principal me permite crear naves de diferentes tipos aplicando la
 * herencia
 */
public abstract class SpaceCraft {

     /** atributos generales utilizados en todas las clases que extiendan de esta */
     private int id;
     private String name;
     private String specialty;
     private String mission;

     /** constructor que me permite crear naves desde un concepto general */
     public SpaceCraft(int id, String name, String specialty, String mission) {
          this.id = id;
          this.name = name;
          this.specialty = specialty;
          this.mission = mission;
     }

     /** getter y setter */
     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getSpecialty() {
          return specialty;
     }

     public void setSpecialty(String specialty) {
          this.specialty = specialty;
     }

     public String getMission() {
          return mission;
     }

     public void setMission(String mission) {
          this.mission = mission;
     }

     /**
      * me permide mostrar los datos generales a las y ser llamados de las diferentes
      * clases de naves
      * 
      * @param nameClass
      */
     public void showdata(String nameClass) {
          System.out.println("ID:" + id);
          System.out.println("Nombre de la Nave:" + name);
          System.out.println("Especialidad:" + specialty);
          System.out.println("Mision:" + mission);

     }

}