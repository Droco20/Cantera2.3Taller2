package paquetes;

/** Representa un Objeto nave  con caracteristicas propias y heredadas de la clase padre*/

/** nave no tripulada */

class DroneCraft extends SpaceCraft {

     /** crea una instancia de la clase DroneCraft - nave no Tripulada */
     public DroneCraft(int id, String name, String specialty, String mission, String capturePhoto) {
          super(id, name, specialty, mission);
          // TODO Auto-generated constructor stub
          this.capturePhoto = capturePhoto;

     }

     /** atributos propios de la clase */
     private String capturePhoto;

     /** captura foto */

     public String getCapturePhoto() {
          return capturePhoto;
     }

     public void setCapturePhoto(String capturePhoto) {
          this.capturePhoto = capturePhoto;
     }

     /** sobrecarga para mostrar los datos caracteristicos propios de la clase */
     @Override
     public void showdata(String nameClass) {
          // TODO Auto-generated method stub
          super.showdata(nameClass);
          System.out.println("Funcion principal:" + capturePhoto);

     }

}