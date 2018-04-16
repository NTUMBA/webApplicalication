package services;

import java.util.*; import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.bp.banqueWS.entities.Compte;
import ma.bp.banqueWS.metier.IBanqueMetier;
@Component
@Path
("/banque"
)
public class BanqueRestService{
@Autowired
IBanqueMetier metier
;
@POST
@Path
("/comptes"
)
public void addCompte(@FormParam(value="solde"
)double solde){
metier.addCompte(new Compte(null, solde,new Date()));
}
