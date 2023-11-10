
package bancario;

import Entidades.Datos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static emus.TipoMovimiento.DEPÓSITO;
import static emus.TipoMovimiento.RETIRO;

/**
 *
 * @author omar_
 */
public class Operacion {

 float totalEnero = 0;
    float totalFebrero = 0;
    float totalMarzo = 0;
    float totalAbril = 0;
    float totalMayo = 0;
    float totalJunio = 0;
    float totalJulio = 0;
    float totalAgosto = 0;
    float totalSeptiembre = 0;
    float totalOctubre = 0;
    float totalNoviembre = 0;

    
    public List<Datos> obtenerMovimientos(String mes, List<Datos> movimientos) {

        DateFormat formato = new SimpleDateFormat("MM");
        DateFormat formato2 = new SimpleDateFormat("dd/MM/yy");

        List<Datos> movimientosMes = new ArrayList<>();

        Collections.sort(movimientos);

        totalEnero = 0;
        totalFebrero = 0;
        totalMarzo = 0;
        totalAbril = 0;
        totalMayo = 0;
        totalJunio = 0;
        totalJulio = 0;
        totalAgosto = 0;
        totalSeptiembre = 0;
        totalOctubre = 0;
        totalNoviembre = 0;

        for (Datos m : movimientos) {

            switch (formato.format(m.getFecha())) {

                case "01" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalEnero += m.getCantidad();

                        case RETIRO ->
                            totalEnero -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "02" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalFebrero += m.getCantidad();

                        case RETIRO ->
                            totalFebrero -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "03" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalMarzo += m.getCantidad();

                        case RETIRO ->
                            totalMarzo -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "04" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalAbril += m.getCantidad();

                        case RETIRO ->
                            totalAbril -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "05" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalMayo += m.getCantidad();

                        case RETIRO ->
                            totalMayo -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "06" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalJunio += m.getCantidad();

                        case RETIRO ->
                            totalJunio -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "07" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalJulio += m.getCantidad();

                        case RETIRO ->
                            totalJulio -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "08" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalAgosto += m.getCantidad();

                        case RETIRO ->
                            totalAgosto -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "09" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalSeptiembre += m.getCantidad();

                        case RETIRO ->
                            totalSeptiembre -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "10" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalOctubre += m.getCantidad();

                        case RETIRO ->
                            totalOctubre -= m.getCantidad();

                        default -> {
                        }

                    }

                }

                case "11" -> {

                    switch (m.getTipo()) {

                        case DEPÓSITO ->
                            totalNoviembre += m.getCantidad();

                        case RETIRO ->
                            totalNoviembre -= m.getCantidad();

                        default -> {
                        }

                    }
                }

                default -> {
                }

            }
        }

        int posicion = 0;
        float totalParcial = 0;

        switch (mes) {

            case "Enero" -> {

                for (Datos m : movimientos) {

                    if (formato.format(m.getFecha()).equals("01")) {

                        Datos movimientosOperacion = new Datos();

                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));

                        switch (m.getTipo()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getCantidad());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }
                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getCantidad());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }
                            }

                            default -> {
                            }
                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }
                }
            }
        }

        switch (mes) {
            case "Febrero" -> {
               
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("02")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                        
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                        
                                    movimientosOperacion.setSubtotal(totalEnero + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero - movimientosOperacion.getRetiro();
                                } else {
                                   
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                // Otro tipo de movimiento
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
            case "Marzo" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("03")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                   
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
        }

        switch (mes) {
            case "Abril" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("04")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
            case "Mayo" -> {
                // Para el mes de Mayo
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("05")) {
                        // Crear un movimiento de operación
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
        }

        switch (mes) {
            case "Junio" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("06")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
            case "Julio" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("07")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
        }

        switch (mes) {
            case "Agosto" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("08")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                // Si es un depósito, asigna el depósito al movimiento
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                               
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
            case "Septiembre" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("09")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                   
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    // Si es el primer movimiento, el subtotal es el retiro
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro();
                                } else {
                                    // Si no es el primer movimiento, resta al subtotal el retiro
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
        }

        switch (mes) {
            case "Octubre" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("10")) {
                        
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                // Si es un depósito, asigna el depósito al movimiento
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    // Si es el primer movimiento, el subtotal es el retiro
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getRetiro();
                                } else {
                                    // Si no es el primer movimiento, resta al subtotal el retiro
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
            case "Noviembre" -> {
                // Para el mes de Noviembre
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("11")) {
                        // Crear un movimiento de operación
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    // Si es el primer movimiento, el subtotal es el depósito
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                // Si es un retiro, asigna el retiro al movimiento
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                                // Otro tipo de movimiento
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
        }

        switch (mes) {
            case "Diciembre" -> {
                
                for (Datos m : movimientos) {
                    if (formato.format(m.getFecha()).equals("12")) {
                        // Crear un movimiento de operación
                        Datos movimientosOperacion = new Datos();
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        switch (m.getTipo()) {
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                if (posicion == 0) {
                                    // Si es el primer movimiento, el subtotal es el depósito
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getDeposito();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                }
                            }
                            case RETIRO -> {
                                // Si es un retiro, asigna el retiro al movimiento
                                movimientosOperacion.setRetiro(m.getCantidad());
                                if (posicion == 0) {
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre - movimientosOperacion.getRetiro();
                                } else {
                                    
                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                }
                            }
                            default -> {
                               
                            }
                        }
                        posicion++;
                        movimientosMes.add(movimientosOperacion);
                    }
                }
            }
            default -> {
                
            }
        }

        
         
        
       
        
        return movimientosMes;
        
    }
        
        

   
 
public float obtenerSaldoInicial(String mes, List<Datos> movimientos) {
    // Inicializa el saldo inicial como 0.
    float saldoInicial = 0;

    switch (mes) {
        case "Enero" -> {
            
            saldoInicial = 0;
        }
        case "Febrero" -> {
            
            saldoInicial = totalEnero;
        }
        case "Marzo" -> {
            
            saldoInicial = totalEnero + totalFebrero;
        }
        case "Abril" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo;
        }
        case "Mayo" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril;
        }
        case "Junio" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo;
        }
        case "Julio" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio;
        }
        case "Agosto" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio;
        }
        case "Septiembre" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto;
        }
        case "Octubre" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre;
        }
        case "Noviembre" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre;
        }
        case "Diciembre" -> {
            
            saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre;
        }
        default -> {
            
        }
    }

    
    return saldoInicial;
}

}

