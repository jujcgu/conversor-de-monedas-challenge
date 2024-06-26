import com.google.gson.annotations.SerializedName;

public class ValorCambio {
    @SerializedName("conversion_result")
    private double conversionResult;

    public double getConversionResult() {
        return conversionResult;
    }
}
