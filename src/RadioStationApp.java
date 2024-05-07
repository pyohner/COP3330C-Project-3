/*
Phillip Yohner
COP 3330C - CRN 24680
January 30, 2024

PART TWO OF TWO
Description:
The purpose of this program - Radio Station App - is to populate a list of FM radio station call signs and frequencies.
If any of the following conditions are not met, the app will throw an FMRadioStationException when the station is created:
- The call sign can only contain four capital letters and start with A, K, N, or W.
- The frequency is between 88.0 and 108.0 inclusive.
Successfully created radio stations will be printed at the end.
Some of the sample FM radio stations are purposefully meant to cause the FMRadioStationException and not be created.
*/

import java.util.ArrayList;

public class RadioStationApp {
    public static void main (String [] arg) throws FMRadioStationException {
        int count = 8; //number of FM Radio Stations
        // List of sample radio station call signs
        ArrayList<String> station = new ArrayList<>();
        station.add("WUCF");
        station.add("AUCF");
        station.add("NUCF");
        station.add("KUCFV");
        station.add("wKNT");
        station.add("W980");
        station.add("XUCF");
        station.add("NKNT");
        // List of sample radio station frequencies
        ArrayList<Float> frequency = new ArrayList<>();
        frequency.add(107.0f);
        frequency.add(109.0f);
        frequency.add(87.0f);
        frequency.add(100.0f);
        frequency.add(99.0f);
        frequency.add(98.0f);
        frequency.add(90.0f);
        frequency.add(102.0f);

        FMRadioStation [] fmStations = new FMRadioStation[count]; //creates FM Radio Stations array
        for (int i = 0; i < fmStations.length; i++){
            try {
                fmStations[i] = new FMRadioStation(station.get(i), frequency.get(i)); //enter sample call-sign and frequency into array
                System.out.println("Station created: " + fmStations[i].toString()); //success message
            } catch (FMRadioStationException e){  //catch for improper call-signs or frequencies
                System.out.println(e.toString()); //exception message
            }
        }
        // Output successfully created radio stations
        for (FMRadioStation fmStation : fmStations) {
            if (fmStation != null) {
                System.out.println(fmStation);
            }
        }
    }
}