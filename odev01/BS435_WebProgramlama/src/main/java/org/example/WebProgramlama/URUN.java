package org.example.WebProgramlama;

import ...

import java.time.LocalDateTime; ...

@Table(name = "URUN")
@Entity

public class URUN {
    @Column(name = "urunAdi")
    @Size(max=40)
    @NotBlank
    private String urunAdi;

    @Column(name = "urunMiktari")
    @NotBlank
    private Long urunMiktari;

    @Column(name = "birimFiyati")
    @NotBlank
    private int birimFiyati;

    @Column(name = "uretimTarihi")
    private LocalDateTime uretimTarihi;

    public URUN() {
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void seturunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Long geturunMiktari() {
        return urunMiktari;
    }

    public void seturunMiktari(Long urunMiktari) {
        this.urunMiktari = urunMiktari;
    }

    public int getbirimFiyati() {
        return birimFiyati;
    }

    public void setbirimFiyati(int birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public LocalDateTime geturetimTarihi() {
        return uretimTarihi;
    }

    public void seturretimTarihi(LocalDateTime uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }
}
