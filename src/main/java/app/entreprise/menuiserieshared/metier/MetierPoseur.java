/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.menuiserieshared.metier;

import app.entreprise.menuiserieshared.entities.Affaire;
import app.entreprise.menuiserieshared.entities.RdvPoseur;

/**
 *
 * @author OscarAullo
 */
public class MetierPoseur implements MetierPoseurLocal{
    @Override
    public void creerRdvPoseur(Affaire a, String dateRdv, String heureRdv, String idEquipe){
        RdvPoseur r = new RdvPoseur();
        r.setDateRdv(dateRdv);
        r.setHeureRdv(heureRdv);
        r.setIdEquipe(idEquipe);
        a.setRdvPoseur(r);
        System.out.println(r.toString());
    };
}
