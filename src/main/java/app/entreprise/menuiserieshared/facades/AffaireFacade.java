/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.menuiserieshared.facades;

import app.entreprise.menuiserieshared.entities.Affaire;
import javax.persistence.EntityManager;

/**
 *
 * @author OscarAullo
 */
public class AffaireFacade extends AbstractFacade<Affaire> implements AffaireFacadeLocal {
    
    private EntityManager em;
        
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AffaireFacade() {
        super(Affaire.class);
    }
    

}
