// Class: FMRadioStation
// This is the class for FM Radio Stations, which includes a call sign and frequency.
public class FMRadioStation {
    // Attributes
    private String callSign; //radio station call sign
    private float frequency; //radio station frequency

    // Constructor
    public FMRadioStation(String callSign, float frequency) throws FMRadioStationException{
        // Checks that the call sign starts with A,K,N, or W, is only capital letters, and 4 characters (A/K/N/W + 3)
        if (!callSign.matches("[AKNW][A-Z]{3}")){
            throw new FMRadioStationException("Invalid call sign. Only use 4 uppercase letters, starting with A, K, N, or W.");
        }
        // Checks that the frequency is between 88.0 and 108.0, inclusive
        if (frequency < 88.0 || frequency > 108.0){
            throw new FMRadioStationException("Invalid frequency. Must be between 88.0 and 108.0, inclusive.");
        }
        this.callSign = callSign; //sets call sign
        this.frequency = frequency; //sets frequency
    }

    // Getters & Setters
    public String getCallSign() {
        return callSign;
    }
    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }
    public float getFrequency() {
        return frequency;
    }
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    // toString overridden method that prints radio station details.
    @Override
    public String toString() {
        return "FM Radio Station [" +
                "call sign='" + callSign + '\'' +
                ", frequency=" + frequency +
                ']';
    }
}