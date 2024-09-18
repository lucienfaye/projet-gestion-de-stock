/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author eyfal
 */
public class Product {
    private int id;
    private int code_produit;
    private String reference;
    private String pasdesignationsword;
    private String rangement ;
    private String fournisseur;
    private int remise; 
    private int prix;
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(int code_produit) {
        this.code_produit = code_produit;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPasdesignationsword() {
        return pasdesignationsword;
    }

    public void setPasdesignationsword(String pasdesignationsword) {
        this.pasdesignationsword = pasdesignationsword;
    }

    public String getRangement() {
        return rangement;
    }

    public void setRangement(String rangement) {
        this.rangement = rangement;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
