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

    public int getMinuti() {
        return minuti;
    }

    public int getOre() {
        return ore;
    }

    public int getSecondi() {
        return secondi;
    }

    
    
}