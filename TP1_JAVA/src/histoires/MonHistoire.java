package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Yakuzas;
import personnages.principaux.Ronin;

public class MonHistoire {

    public static void main(String[] args) {
        Humain humain = new Humain("Prof", "Porto", 10);
        humain.direBonjour();
        humain.boire();

        Commercant commercant = new Commercant("Marchand", 35);
        commercant.direBonjour();

        Yakuzas yakuza = new Yakuzas("Yaku le noir", "biere", 42, "WarSong");
        yakuza.direBonjour();
        yakuza.extorquer(commercant);

        Ronin ronin = new Ronin("Roro", "sake", 61);
        ronin.donner(10, commercant);
        ronin.provoquer(yakuza);
        ronin.direBonjour();
    }
}
