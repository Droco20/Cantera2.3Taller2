package paquetes;

/** nave tripulada */

/**
 * Representa un Objeto nave con caracteristicas propias y heredadas de la clase
 * padre
 */
public class MannedCraft extends SpaceCraft {

     /** crea una instancia de la clase MannedCraft - nave Tripulada */

     public MannedCraft(int id, String name, String specialty, String mission, String board) {
          super(id, name, specialty, mission);
          // TODO Auto-generated constructor stub
          this.board = board;

     }

     /** atributos propios de laclase */
     private String board;

     /** abordar */

     public String getBoard() {
          return board;
     }

     public void setBoard(String board) {
          this.board = board;
     }

     /** sobrecarga para mostrar los datos caracteristicos propios de la clase */

     @Override
     public void showdata(String nameClass) {
          // TODO Auto-generated method stub
          super.showdata(nameClass);
          System.out.println("Funcion principal:" + board);

     }

}
