package org.example.WebProgramlama;

import...

@Table(name = "CIFTCI")
@Entity

public class CIFTCI {
    @Column(name = "ciftciAdi")
    @Size(max=40)
    @NotBlank
    private String ciftciAdi;

    @Column(name = "ciftciSoyadi")
    @Size(max=40)
    @NotBlank
    private String ciftciSoyadi;

    @Column(name = "ciftciYasi")
    private int ciftciYasi;

    @Column(name = "ciftciTelefon")
    private Long ciftciTelefon;

    public CIFTCI() {
    }

    public String getciftciAdi(){
        return ciftciAdi;
    }

    public void setciftciAdi(String ciftciAdi){
       this.ciftciAdi=ciftciAdi;
    }
    public String getciftciSoyadi();
        return ciftciSoyadi;
    }

    public void setciftciSoyadi(String ciftciSoyadi){
        this.ciftciSoyadi=ciftciSoyadi;
    }
    public int getciftciYasi(){
        return ciftciYasi;
    }

    public void setCiftciYasi(int ciftciYasi){
        this.ciftciYasi=ciftciYasi;
    }

    public Long getciftciTelefon {
        return ciftciTelefon;
    }

    public void setciftciTelefon(Long ciftciTelefon){
        this.ciftciTelefon=ciftciTelefon;
    }

}
