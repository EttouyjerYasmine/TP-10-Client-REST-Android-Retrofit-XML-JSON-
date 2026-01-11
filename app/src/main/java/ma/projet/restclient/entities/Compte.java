package ma.projet.restclient.entities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import com.google.gson.annotations.SerializedName;

@Root(name = "item", strict = false)
public class Compte {
    @SerializedName("id")
    @Element(name = "id")
    private Long id;

    @SerializedName("solde")
    @Element(name = "solde")
    private double solde;

    @SerializedName("type")
    @Element(name = "type")
    private String type;

    @SerializedName("dateCreation")
    @Element(name = "dateCreation")
    private String dateCreation;

    // Constructeurs
    public Compte() {}

    public Compte(Long id, double solde, String type, String dateCreation) {
        this.id = id;
        this.solde = solde;
        this.type = type;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    // Méthode toString pour le débogage
    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", type='" + type + '\'' +
                ", dateCreation='" + dateCreation + '\'' +
                '}';
    }
}