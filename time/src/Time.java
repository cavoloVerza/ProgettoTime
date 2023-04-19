public class Time {

    /**
     * La classe rappresenta e gestisce dati di tipo temporale
    */

    /**
     * numero di minuti dell'oggetto Time
    */
    protected int minuti;
    /**
     * numero di ore dell'oggetto Time
    */
    protected int ore;
    /**
     * numero di secondi dell'oggetto Time
    */
    protected int secondi;

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * @param minuti numero di minuti dell'oggetto Time
     * @param ore numero di ore dell'oggetto Time
     * @param secondi numero di secondi dell'oggetto Time
    */

    public Time(int minuti, int ore, int secondi) {
        this.minuti = minuti;
        this.ore = ore;
        this.secondi = secondi;
    }

    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * @param secondi numero di secondi dell'oggetto Time
     */

    public Time(int secondi) {

        int minuti = 0;
        int ore = 0;

        while(secondi >= 60) {

            minuti++;
            secondi -= 60;

        }

        while (minuti >= 60) {

            ore++;
            minuti -= 60;

        }

        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
        
    }

    /**
     * Vengono addizionati il numero di secondi specificati.
     * @param secondi -
     */

     public void addSecondi(int secondi) {

        this.secondi += secondi; 

    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     * @return il numero totale dei secondi
     */

    public int convertiSecondi() {

        int newMinuti = ore * 60 + minuti;
        int totSec = secondi + newMinuti * 60;

        return totSec;

    }

    /**
     * Restituisce il numero di minuti
     * @return il numero di minuti dell'oggetto Time 
     */

    public int getMinuti() {
        return minuti;
    }

    /**
     * Restituisce il numero delle ore
     * @return il numero di ore dell'oggetto Time
     */

    public int getOre() {
        return ore;
    }

    /**
     * Restituisce il numero di secondi
     * @return il numero di secondi dell'oggetto Time
     */

    public int getSecondi() {
        return secondi;
    }

    /**
     * @deprecated
     * @param minuti -
     */

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * @deprecated
     * @param ore
     */

    public void setOre(int ore) {
        this.ore = ore;
    }

    /**
     * @deprecated
     * @param secondi
     */

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */

    @Override
    public String toString() {

        String s = "Ore: " + ore + ", Minuti: " + minuti + ", secondi: " + secondi;
        s += "In secondi: " + convertiSecondi();

        return s;

    }

}