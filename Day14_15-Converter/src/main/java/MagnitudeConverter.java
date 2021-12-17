class MagnitudeConvertor {
    public double baseToBase(double unit){
        return unit;
    }
    public double kiloToBase(double unit){
        return unit*1000;
    }
    public double baseToKilo(double unit){
        return unit/1000;
    }
    public double centiToCenti(double unit) {
        return unit;
    }
    public double centiToKilo(double unit) {
        return unit / 100000;
    }
    public static double baseToCenti(double unit) {
        return unit * 100;
    }
    public double centiToBase(double unit) { return unit/100;  }
    public double kiloToCenti(double unit){ return unit*100000; }
}



















//public interface MagnitudeConvertor {
//    double baseToBase(double magnitudeInBase);
//    void milliToMilli();
//    void centiToCenti();
//    void kiloToKilo();
//    void baseToMilli();
//    void baseToCenti();
//    void baseToKilo();
//    void milliToBase();
//    void milliToCenti();
//    void milliToKilo();
//    void centiToBase();
//    void centiToMilli();
//    void centiToKilo();
//    void kiloToBase();
//    void kiloToMilli();
//    void kiloToCenti();
//}
//abstract class BaseConvertor implements MagnitudeConvertor {
//    double magnitudeInBase;
//    public double baseToBase() {
//        return magnitudeInBase;
//    }
//    public double baseToMilli(double magnitudeInBase) {
//        return magnitudeInBase*1000;
//    }
//    public double baseToCenti(double magnitudeInBase) {
//        return magnitudeInBase*100;
//    }
//    public double baseToKilo(double magnitudeInBase) {
//        return magnitudeInBase/1000;
//    }
//}
//abstract class MilliConvertor implements MagnitudeConvertor {
//    public double milliToMilli(double magnitudeInMilli) {
//        return magnitudeInMilli;
//    }
//    public double milliToBase(double magnitudeInMilli) {
//        return magnitudeInMilli/1000;
//    }
//    public double milliToCenti(double magnitudeInMilli) {
//        return magnitudeInMilli/10;
//    }
//    public double milliToKilo(double magnitudeInMilli) {
//        return magnitudeInMilli/1000000;
//    }
//}
//abstract class CentiConvertor implements MagnitudeConvertor {
//    public double centiToCenti(double magnitudeInCenti) {
//        return magnitudeInCenti;
//    }
//    public double centiToBase(double magnitudeInCenti) {
//        return magnitudeInCenti/100;
//    }
//    public double centiToMilli(double magnitudeInCenti) {
//        return magnitudeInCenti*10;
//    }
//    public double centiToKilo(double magnitudeInCenti) {
//        return magnitudeInCenti/100000;
//    }
//}
//abstract class KiloConvertor implements MagnitudeConvertor {
//    public double kiloToKilo(double magnitudeInKilo) {
//        return magnitudeInKilo;
//    }
//    public double kiloToBase(double magnitudeInKilo) {
//        return magnitudeInKilo*1000;
//    }
//    public double kiloToMilli(double magnitudeInKilo) {
//        return magnitudeInKilo*1000000;
//    }
//    public double kiloToCenti(double magnitudeInKilo) {
//        return magnitudeInKilo*100000;
//    }
//}

