package DZ15;

import java.util.ArrayList;
import java.util.List;

public class Port {

   private List<Ship> shipList;

   public Port(int[] sizeOfShip){
       shipList = new ArrayList<Ship>();
       for (int i = 0; i < sizeOfShip.length; i++){
           Ship ship = new Ship(sizeOfShip[i]);
           shipList.add(ship);
       }
   }

   public Ship getShip(int minSizeOfShip){
       for (int i = 0; i < shipList.size(); i++) {

          Ship ship = shipList.get(i);
          if (ship.getSize() >= minSizeOfShip)
              return ship;

       }
       return null;
   }
}
