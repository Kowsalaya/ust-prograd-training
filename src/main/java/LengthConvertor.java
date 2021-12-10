class LengthConvertor {

    public double centimeterToCentimeter(double lengthInCentimeter) {
        return lengthInCentimeter;
    }

    public double meterToCentimeter(double lengthInMeter) {
        return lengthInMeter * 100;
    }

    public double centimeterToKilometer(double lengthInCentimeter) {
        return lengthInCentimeter / 1000;
    }

    public double centimeterToMeter(double lengthInCentimeter) {
        return lengthInCentimeter / 100;
    }

    public double kilometerToCentiMeter(double lengthInKilometer) {
        return lengthInKilometer * 100000;
    }
}


//public class LengthConvertor {
//
//    public double unitConvertor(double measurement, String fromUnit, String toUnit) {
//        if (measurement <= 0) {
//            throw new IllegalArgumentException("Measurement cant be less than or equal to Zero");
//        } else {
//            if (toUnit.equals("cm")) {
//                return convertorToCentimeter(measurement, fromUnit);
//            } else if (toUnit.equals("km")) {
//                return convertorToKilometer(measurement, fromUnit);
//            }
//            else {
//                throw new IllegalArgumentException("Not a valid unit");
//            }
//        }
//    }
//
//    public double convertorToCentimeter(double measurement, String fromUnit) {
//        if (fromUnit.equals("cm")) {
//            return measurement;
//        } else if (fromUnit.equals("m")) {
//            return measurement * 100;
//        } else {
//            throw new IllegalArgumentException("Not a valid unit");
//        }
//    }
//
//    public double convertorToKilometer(double measurement, String fromUnit) {
//        if (fromUnit.equals("cm")) {
//            return measurement / 100000;
//        } else {
//            throw new IllegalArgumentException("Not a valid unit");
//        }
//    }
//}
