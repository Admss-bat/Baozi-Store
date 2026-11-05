package Baozi_Store.app.model;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;


public class Cliente {
	
	private Long id;
	private String nome;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate clienteDesde;
	
	// Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getClienteDesde() {
        return clienteDesde;
    }

    public void setClienteDesde(LocalDate clienteDesde) {
        this.clienteDesde = clienteDesde;
    }
    
}

