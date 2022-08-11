package functionalProgramsDay_5;

public class Windchill {
	public static void main(String[] argv) throws Exception {
        double tempC = 2.45678;
        double windSpeed = 2.45678;
        System.out.println(calculateWindChill(tempC, windSpeed));
    }

    /*
     * Calculate wind chill.
     * The "Chilled" air temperature can also be expressed as a function of
     * wind velocity and ambient air temperature.
     * 
     * @param tempC temperature in degrees Celsius
     * @param windSpeed wind speed in meters per second (m/s).
     * @return chilled air temperature
     */
    public static double calculateWindChill(final double tempC,
            final double windSpeed) {
        double tempF = celcius2fahrenheit(tempC);
        double mph = ms2mph(windSpeed);
        if (tempF < 50.0 && mph > 3.0) {
            // Wind chill is only defined for temperatures below 50F and
            // wind speed above 3 MPH.
            double chillF = 35.74 + (0.6215 * tempF)
                    - (35.75 * Math.pow(mph, 0.16))
                    + (0.4275 * tempF * Math.pow(mph, 0.16));
            double chillC = (Math.round(fahrenheit2celcius(chillF) * 10)) / 10.0;
            return chillC;
        }
        return tempC;
    }

    /*
     * Convert degrees Celsius to degrees Fahrenheit.
     * @param celcius the temperature in Celsius.
     * @return the temperature in Fahrenheit.
     */
    public static double celcius2fahrenheit(double celcius) {
        return celcius * 9 / 5 + 32;
    }

    /*
     * Convert velocity meter/second to miles/hour.
     * @param ms meter per second
     * @return miles per hour
     */
    public static int ms2mph(double ms) {
        return (int) Math.round(ms * 2.24);
    }

    /*
     * Convert degrees Fahrenheit to degrees Celsius.
     * @param f the temperature in Fahrenheit.
     * @return the temperature in Celsius.
     */
    public static double fahrenheit2celcius(double f) {
        return (f - 32) * 5 / 9.0;
    }

}
