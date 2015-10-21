/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class KATA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<>();
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("gmail");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("ulpgc");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        histograma.increment("hotmail");
        HistogramDisplay display = new HistogramDisplay(histograma);
        display.Execute();
    }
    
}
