public class WordState {



        boolean isWorldPositivly = false;
        boolean isWorldNegativly = true;
        boolean meteorRain = false;
        boolean toxicRain = true;
        boolean yaBeremenna = false;
        boolean cunamiSlunei = true;
        boolean iceAge = true;
        boolean sosedYstroilRemont = true;
        boolean sBankoiPivaNaVerande = true;
//! &&||
       public WordState( boolean isWorldPositivly , boolean isWorldNegativly){
            this.isWorldPositivly = (sosedYstroilRemont && cunamiSlunei && !meteorRain && toxicRain) || (!yaBeremenna || iceAge || !sBankoiPivaNaVerande) ;
            this.isWorldNegativly = (sosedYstroilRemont || cunamiSlunei && !meteorRain && toxicRain) && (!yaBeremenna || iceAge && !sBankoiPivaNaVerande);
        }

}
