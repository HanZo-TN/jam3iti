/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Charts;

import DAO.SondageReponseDao;
import Metier.Sondage;
import Metier.SondageReponse;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author rednaks
 */
public class SondageChart extends JFrame {
    
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
    
       public SondageChart(Sondage aSondage) {
        SondageReponseDao sdr = SondageReponseDao.getInstance();
        dataset = new DefaultPieDataset();
        List<SondageReponse> listSr = sdr.findAll();
        for(SondageReponse sr: listSr){
            if(sr.getId_sondage() == aSondage.getId()){
                dataset.setValue("Choix "+sr.getChoix(), new Double(sr.getNombreChoix()));
            }
        }
                graphe = ChartFactory.
                createPieChart(aSondage.getQuestion(), dataset,true ,true ,false);

        cp = new ChartPanel(graphe);
        this.add(cp);
        this.setSize(500, 500);
       }
}
