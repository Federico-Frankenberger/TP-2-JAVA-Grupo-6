import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaComocadena = sdf.format(fecha);
        return fechaComocadena;
    }
    public static Date getFechaDate(int dia, int mes, int anio) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = String.format("%02d/%02d/%d",dia,mes,anio);
        //El %02d se asegura de que el día y el mes tengan siempre dos dígitos//
        Date fecha = sdf.parse(fechaString);
        return fecha;
    }
}