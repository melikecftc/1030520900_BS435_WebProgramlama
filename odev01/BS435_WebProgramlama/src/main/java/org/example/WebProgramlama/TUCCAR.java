package org.example.WebProgramlama;
package org.example.WebProgramlama;

import

import java.time.LocalDateTime;...

@Table(name = "TUCCAR")
@Entity

public class TUCCAR {
    @Column(name = "tuccarAdi")
    @Size(max=40)
    @NotBlank
    private String tuccarAdi;

    @Column(name = "alisMiktari")
    @NotBlank
    private Long alisMiktari;

    @Column(name = "alisTarihi")
    private LocalDateTime alisTarihi;

    @Column(name = "tuccarTelefon")
    private Long tuccarTelefon;

    public TUCCAR() {
    }

    public String gettuccarAdi() {
        return tuccarAdi;
    }

    public void settuccarAdi(String tuccarAdi) {
        this.tuccarAdi = tuccarAdi;
    }

    public long getAlisMiktari() {
        return alisMiktari;
    }

    public void setalisMiktari(long alisMiktari) {
        this.alisMiktari = alisMiktari;
    }

    public LocalDateTime getalisTarihi() {
        return alisTarihi;
    }

    public void setalisTarihi(LocalDateTime alisTarihi) {
        this.alisTarihi = alisTarihi;
    }

    public long gettuccarTelefon() {
        return tuccarTelefon;
    }

    public void settuccarTelefon(long tuccarTelefon) {
        this.tuccarTelefon = tuccarTelefon;
    }
}
