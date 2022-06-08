package paquetes;

/** nave cohete */

/**
 * Representa un Objeto nave con caracteristicas propias y heredadas de la clase
 * padre
 */
class RocketCraft extends SpaceCraft {

     /** crea una instancia de la clase RocketCraft - nave lanzadera */
     public RocketCraft(int id, String name, String specialty, String mission) {
          super(id, name, specialty, mission);// superclase
          // TODO Auto-generated constructor stub
          this.status = status;
          this.capturePhoto = capturePhoto;

     }

     /** atributos propios de la clase */
     private boolean status = true;
     private String capturePhoto;

     /** metodo para mostrar si la nave esta encendida */
     public void status() {
          this.status = true;
          System.out.println("La Nave esta encendida");

          /** getter y setter de los atributos propios de la clase */
     }

     public boolean isStatus() {
          return status;
     }

     public void setStatus(boolean status) {
          this.status = status;
     }

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

     }

}
