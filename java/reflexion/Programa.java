import sun.applet.Main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa{
    public static void main(String[] args) {

        String nameClass = args[0];
        String nameVehicle = args[1];
        try {
            Class vehicleClass = Class.forName(nameClass);
            Field[] fields = vehicleClass.getFields();
            Method[] methods = vehicleClass.getDeclaredMethods();
            try {
                Vehicle vehicle = (Vehicle) vehicleClass.newInstance();
                vehicle.name = nameVehicle;
                vehicle.speedUp();
                vehicle.speedUp();
                vehicle.brake();
                for (int i=0; i<fields.length; i++) {
                    Field field = fields[i];
                    System.out.println("Campo '" + field.getName() + "': " + field.get(vehicle));
                }//for i
                for (int i=0; i<methods.length; i++) {
                    Method method = methods[i];
                    System.out.println("Voy ejecutar el método: '" + method.getName() + "'");
                    method.invoke(vehicle);
                }//for i
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

