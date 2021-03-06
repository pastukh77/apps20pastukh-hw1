package ua.edu.ucu.tempseries;

public final class TempSummaryStatistics {
    private final double avgTemp;
    private final double devTemp;
    private final double minTemp;
    private final double maxTemp;

    public TempSummaryStatistics(TemperatureSeriesAnalysis seriesAnalysis) {
        avgTemp = seriesAnalysis.average();
        devTemp = seriesAnalysis.deviation();
        minTemp = seriesAnalysis.min();
        maxTemp = seriesAnalysis.max();
    }

    @Override
    public String toString() {
        return avgTemp + " " + devTemp + " " + minTemp  + " " + maxTemp;
    }
}