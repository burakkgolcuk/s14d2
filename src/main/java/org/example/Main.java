import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall w1 = new Wall("North");
        Wall w2 = new Wall("South");
        Wall w3 = new Wall("East");
        Wall w4 = new Wall("West");

        Ceiling ceiling = new Ceiling(270, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 60, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(120, 200, 85.0);
        Carpet carpet = new Carpet(200, 300, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                w1, w2, w3, w4,
                ceiling,
                bed,
                lamp,
                wardrobe,
                carpet
        );

        // Erişim ve metod çağrıları
        System.out.println("Bedroom: " + bedroom.getName());
        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();

        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        // Bazı getter örnekleri
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp battery: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp rating: " + bedroom.getLamp().getGlobalRating());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
        System.out.println("Bed pillows: " + bedroom.getBed().getPillows());
    }
}
