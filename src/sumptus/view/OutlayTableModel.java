package sumptus.view;

import java.sql.SQLException;
import java.sql.Date;
import java.text.DateFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import sumptus.dao.AreaDAO;
import sumptus.dao.DataBase;
import sumptus.model.Area;
import sumptus.model.Outlay;

/**
 *
 * @author Jessica Dagostini
 */
public class OutlayTableModel  extends AbstractTableModel{
    private List<Outlay> outlays;
    
    public OutlayTableModel(List<Outlay> outlays){
        this.outlays = outlays;
    }
    
    public void setOutlays(List<Outlay> outlays){
        this.outlays = outlays;
    }

    @Override
    public int getRowCount() {
        return outlays.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 10;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Outlay outlay = outlays.get(rowIndex);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("pt", "BR"));
        switch (columnIndex) {
            case 0: return outlay.getArea().getName();
            case 1: return outlay.getPform().getForm();
            case 2: return outlay.getDescription();
            case 3: return dateFormat.format((Date) outlay.getPurchase_date());
            case 4: return dateFormat.format((Date) outlay.getPayment_day());
            case 5: return outlay.getCost();
            case 6: return outlay.getPaid();
            case 7: if(outlay.getTrue_payday() != null){ return dateFormat.format((Date) outlay.getTrue_payday());} else { return outlay.getTrue_payday();}
            case 8: return outlay.getTrue_value();
            case 9: return String.format("%.2f", outlay.getPercentage()) + "%";
            default:
                throw new AssertionError();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Area";
            case 1: return "Forma de Pagamento";
            case 2: return "Descrição";
            case 3: return "Data da Compra";
            case 4: return "Data de Vencimento";
            case 5: return "Valor (R$)";
            case 6: return "Pago?";
            case 7: return "Data de Pagamento";
            case 8: return "Valor pago";
            case 9: return "Porcentagem";
            default:
                throw new AssertionError();
        }
    }
    
}
