package paquetes;

/**
 * Representa un Objeto nave con caracteristicas propias y heredadas de la clase
 * padre
 */
class PrototypeCraft extends SpaceCraft {

     /** crea una instancia de la clase PrototypeCraft - nave multi proposito */
     public PrototypeCraft(int id, String name, String specialty, String mission, String capturePhoto, String board,
               boolean status) {
          super(id, name, specialty, mission);
          // TODO Auto-generated constructor stub
          this.status = status;
          this.capturePhoto = capturePhoto;
          this.board = board;

     }

     /** atributos propios de la clase */

     private boolean status = true;
     private String capturePhoto;
     private String board;

     public boolean isStatus() {
          return status;
     }

     public void setStatus(boolean status) {
          this.status = status;
     }

     /** metodo para mostrar si la nave esta encendida */
     public void status() {
          this.status = true;
          System.out.println("La Nave esta encendida");

     }

     /** sobrecarga para mostrar los datos caracteristicos propios de la clase */
     @Override
     public void showdata(String nameClass) {
          // TODO Auto-generated method stub
          super.showdata(nameClass);
          System.out.println("Funcion principal:" + capturePhoto);

     }

     /** getter y setter de los atributos propios de la clase */

     public String getCapturePhoto() {
          return capturePhoto;
     }

     public void setCapturePhoto(String capturePhoto) {
          this.capturePhoto = capturePhoto;
     }

     public String getBoard() {
          return board;
     }

     public void setBoard(String board) {
          this.board = board;
     }
}