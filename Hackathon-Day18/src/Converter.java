public class Converter {
    public double usdToINR(double amountInUSD) {    //USD CONVERTER
        return amountInUSD * 74.85;
    }

    public double usdToASN(double amountInUSD) {
        return amountInUSD * 2076.434;
    }

    public double usdToEURO(double amountInUSD) {
        return amountInUSD * 0.89;
    }

    public double usdToGBP(double amountInUSD) {
        return amountInUSD * 0.76;
    }

    public double asnToINR(double amountInASN) {    //ASN CONVERTER
        return amountInASN * 0.035786;
    }

    public double asnToUSD(double amountInASN) {
        return amountInASN * 0.00003646;
    }

    public double asnToEURO(double amountInASN) {
        return amountInASN * 0.0009029;
    }

    public double asnToGBP(double amountInASN) {
        return amountInASN * 0.00116728;
    }

    public double euroToINR(double amountInEURO) {      //EURO CONVERTER
        return amountInEURO * 85.70;
    }

    public double euroToASN(double amountInEURO) {
        return amountInEURO * 522.67631;
    }

    public double euroToUSD(double amountInEURO) {
        return amountInEURO * 1.12427;
    }

    public double euroToGBP(double amountInEURO) {
        return amountInEURO * 0.85;
    }

    public double gbpToASN(double amountInGBP) {    //GBP CONVERTER
        return amountInGBP * 18969.4145;
    }

    public double gbpToEURO(double amountInGBP) {
        return amountInGBP * 1.124501;
    }

    public double gbpToUSD(double amountInGBP) {
        return amountInGBP * 1.308472;
    }

    public double gbpToINR(double amountInGBP) {
        return amountInGBP * 100.71;
    }

    public double inrToUSD(double amountInINR) {        //INR CONVERTER
        return amountInINR * 0.013;
    }

    public double inrToASN(double amountInINR) {
        return amountInINR * 27.34075345;
    }

    public double inrToEURO(double amountInINR) {
        return amountInINR * 0.012;
    }

    public double inrToGBP(double amountInINR) {
        return amountInINR * 0.0099;
    }
}
