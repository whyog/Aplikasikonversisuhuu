package aplikasikonversisuhuu;

import javax.swing.*;

/**
 * Kelas utama aplikasi konversi suhu
 */
public class Aplikasikonversisuhuu {

    public static void main(String[] args) {
        // Menjalankan aplikasi dengan form GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Aplikasikonersisuhuform().setVisible(true);
            }
        });
    }
}