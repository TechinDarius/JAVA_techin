package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:

//        StandardSensor ten = new StandardSensor(10);
//        StandardSensor minusFive = new StandardSensor(-5);
//
//        System.out.println(ten.read());
//        System.out.println(minusFive.read());
//
//        System.out.println(ten.isOn());
//        ten.setOff();
//        System.out.println(ten.isOn());

        Sensor kumpula = new TemperatureSensor();
        Sensor kaisen = new TemperatureSensor();
        Sensor helsinki = new TemperatureSensor();

        AverageSensor helsinkiReg = new AverageSensor();
        helsinkiReg.addSensor(kumpula);
        helsinkiReg.addSensor(kaisen);
        helsinkiReg.addSensor(helsinki);



        helsinkiReg.setOn();
        System.out.println("Temp " + helsinkiReg.read() + " deg Celcius");
        System.out.println("Temp " + helsinkiReg.read() + " deg Celcius");
        System.out.println("Temp " + helsinkiReg.read() + " deg Celcius");

        System.out.println("reading " + helsinkiReg.readings());


    }

}
