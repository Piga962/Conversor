import com.google.gson.annotations.SerializedName;

public class Currency {
    @SerializedName("USD")
    private double USD;
    @SerializedName("MXN")
    private double MXN;
    @SerializedName("ARS")
    private double ARS;
    @SerializedName("BRL")
    private double BRL;
    @SerializedName("BOB")
    private double BOB;
    @SerializedName("CLP")
    private double CLP;
    @SerializedName("COP")
    private double COP;

    public Currency(CurrencyJson json){
        this.USD = json.conversion_rates().USD;
        this.MXN = json.conversion_rates().MXN;
        this.ARS = json.conversion_rates().ARS;
        this.BOB = json.conversion_rates().BOB;
        this.BRL = json.conversion_rates().BRL;
        this.CLP = json.conversion_rates().CLP;
        this.COP = json.conversion_rates().COP;
    }

    public double getUSD() {
        return USD;
    }

    public double getMXN() {
        return MXN;
    }

    public double getARS() {
        return ARS;
    }

    public double getBRL() {
        return BRL;
    }

    public double getBOB() {
        return BOB;
    }

    public double getCLP() {
        return CLP;
    }

    public double getCOP() {
        return COP;
    }

    public double USDtoMXN(double value){
        return value*getUSD()*getMXN();
    }

    public double USDtoARS(double value){
        return value*getUSD()*getARS();
    }

    public double USDtoBRL(double value){
        return value*getUSD()*getBRL();
    }

    public double USDtoBOB(double value){
        return value*getUSD()*getBOB();
    }

    public double USDtoCLP(double value){
        return value*getUSD()*getCLP();
    }

    public double USDtoCOP(double value){
        return value*getUSD()*getCOP();
    }

    public double MXNtoUSD(double value){
        return value*getUSD()/getMXN();
    }

    public double ARStoUSD(double value){
        return value*getUSD()/getARS();
    }

    public double BRLtoUSD(double value){
        return value*getUSD()/getBRL();
    }

    public double BOBtoUSD(double value){
        return value*getUSD()/getBOB();
    }

    public double CLPtoUSD(double value){
        return value*getUSD()/getCLP();
    }

    public double COPtoUSD(double value){
        return value*getUSD()/getCOP();
    }
}
